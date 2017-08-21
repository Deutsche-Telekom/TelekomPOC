/*<ORACLECOPYRIGHT>
 * Copyright (C) 1994, 2015, Oracle and/or its affiliates. All rights reserved.
 * Oracle and Java are registered trademarks of Oracle and/or its affiliates.
 * Other names may be trademarks of their respective owners.
 * UNIX is a registered trademark of The Open Group.
 *
 * This software and related documentation are provided under a license agreement
 * containing restrictions on use and disclosure and are protected by intellectual property laws.
 * Except as expressly permitted in your license agreement or allowed by law, you may not use, copy,
 * reproduce, translate, broadcast, modify, license, transmit, distribute, exhibit, perform, publish,
 * or display any part, in any form, or by any means. Reverse engineering, disassembly,
 * or decompilation of this software, unless required by law for interoperability, is prohibited.
 *
 * The information contained herein is subject to change without notice and is not warranted to be error-free.
 * If you find any errors, please report them to us in writing.
 *
 * U.S. GOVERNMENT RIGHTS Programs, software, databases, and related documentation and technical data delivered to U.S.
 * Government customers are "commercial computer software" or "commercial technical data" pursuant to the applicable
 * Federal Acquisition Regulation and agency-specific supplemental regulations.
 * As such, the use, duplication, disclosure, modification, and adaptation shall be subject to the restrictions and
 * license terms set forth in the applicable Government contract, and, to the extent applicable by the terms of the
 * Government contract, the additional rights set forth in FAR 52.227-19, Commercial Computer Software License
 * (December 2007). Oracle America, Inc., 500 Oracle Parkway, Redwood City, CA 94065.
 *
 * This software or hardware is developed for general use in a variety of information management applications.
 * It is not developed or intended for use in any inherently dangerous applications, including applications that
 * may create a risk of personal injury. If you use this software or hardware in dangerous applications,
 * then you shall be responsible to take all appropriate fail-safe, backup, redundancy,
 * and other measures to ensure its safe use. Oracle Corporation and its affiliates disclaim any liability for any
 * damages caused by use of this software or hardware in dangerous applications.
 *
 * This software or hardware and documentation may provide access to or information on content,
 * products, and services from third parties. Oracle Corporation and its affiliates are not responsible for and
 * expressly disclaim all warranties of any kind with respect to third-party content, products, and services.
 * Oracle Corporation and its affiliates will not be responsible for any loss, costs,
 * or damages incurred due to your access to or use of third-party content, products, or services.
 </ORACLECOPYRIGHT>*/

package atg.siebel.catalog.importer;

import atg.siebel.catalog.job.ImportJobEnums.DeploymentType;


/**
 * This class contains the details of an import session.
 * 
 * @author
 * @version $Id:
 *          //product/Siebel/main/src/atg/siebel/integration/catalog/importer
 *          /ImportSession.java#1 $
 **/

public class ImportSession {

	// -------------------------------------
	/** Class version string */

	public static String CLASS_VERSION = "$Id: //product/Siebel/version/11.2/src/atg/siebel/catalog/importer/ImportSession.java#2 $$Change: 1194813 $";

	// -------------------------------------
	// Constants
	//

	public static final int SESSION_OK = 0;

	public static final int SESSION_ERROR = 1;

	// -----------------------------------
	// property: sessionStatus
	// -----------------------------------
	private int mSessionStatus = SESSION_OK;

	/**
	 * Set the session status. Specifies whether or not the session is in an error
	 * state.
	 * 
	 * @param pSessionStatus
	 *          - the status of the import export session.
	 */

	public void setSessionStatus(int pSessionStatus) {
		mSessionStatus = pSessionStatus;
	}

	/**
	 * Get the session status.
	 * 
	 * @return - the status of the import export session.
	 */

	public int getSessionStatus() {
		return mSessionStatus;
	}

	// -----------------------------------
	// property: promotionsTransactionCount
	// -----------------------------------

	private int mTransactionCount = 0;

	/**
	 * Set the transaction count. A count of the successful import transactions.
	 * 
	 * @param pTransactionCount
	 *          - the count of transactions in the import export session.
	 */

	public void setTransactionCount(int pTransactionCount) {
		mTransactionCount = pTransactionCount;
	}

	/**
	 * Get the transaction count.
	 * 
	 * @return - the count of transactions in the import export session.
	 */

	public int getTransactionCount() {
		return mTransactionCount;
	}

	// -----------------------------
	// property: importService
	// -----------------------------
	private ImportServiceInterface mImportService = null;

	public void setImportService(ImportServiceInterface pImportService) {
		mImportService = pImportService;
	}

	protected ImportServiceInterface getImportService() {
		return mImportService;
	}

	// --------------------------------------
	// Constructors
	// --------------------------------------
	public ImportSession() {
	}


	// --------------------------------------
    // Methods
    // --------------------------------------
	
	/**
	 * @return
	 */
	public DeploymentType getDeploymentType() {
	  return DeploymentType.ONLINE;
	}
	
	/**
	 * Increment the transaction count
	 * 
	 * @return - the new value for promotionsTransactionCount.
	 */

	public int incrementTransactionCount() {
		mTransactionCount++;

		return mTransactionCount;
	}

	/**
	 * Decrement the transaction count
	 * 
	 * @return - the new value for promotionsTransactionCount.
	 */

	public int decrementTransactionCount() {
		mTransactionCount--;

		return mTransactionCount;
	}

	public void cancelSession() throws ImportException {
	}

	public void endSession() throws ImportException {
	}

	public void registerThread() throws ImportException {
	}

	/**
	 * Prepare for the import, perform the import and clean up afterwards
	 * 
	 * @return flag to indicate success of import
	 * @throws ImportException
	 */
	public boolean importData() throws ImportException {

		// Disable the indexes
	  
    logDebugMessage("ImportSession.importData(): Disabling the indexes");	    
		if (mImportService.disableIndexes() == false) {
		  logDebugMessage("ImportSession.importData(): Data import was unsuccessful. Unable to disable the indexes");
			mImportService.cancelImport();
			return (false);
		}

		boolean importSuccess = mImportService.importData();

		// Rebuild the indexes
		logDebugMessage("ImportSession.importData(): Rebuilding the indexes");
		if (mImportService.rebuildIndexes() == false) {
		  logDebugMessage("ImportSession.importData(): Unable to rebuild the indexes");
			mImportService.cancelImport();
			return (false);
		}

		return importSuccess;
	}

	/**
	 * Constructs a <code>String</code> with all attributes in name = value
	 * format.
	 * 
	 * @return a <code>String</code> representation of this object.
	 */
	public String toString() {
		final String TAB = "    ";

		String retValue = "";

		retValue = "ImportSession ( " + super.toString() + TAB + "mSessionStatus = " + this.mSessionStatus + TAB
		    + "mTransactionCount = " + this.mTransactionCount + TAB
		    // + "mImportRepository = " + this.mImportRepository + TAB
		    + "mImportService = " + this.mImportService + TAB + " )";

		return retValue;
	}

	protected void logDebugMessage(String pMessage) {
		if (getImportService().isLoggingDebug()) {
			getImportService().logDebug(this.getClass().getName() + " " + System.currentTimeMillis() + " " + pMessage);
		}
	}

}
