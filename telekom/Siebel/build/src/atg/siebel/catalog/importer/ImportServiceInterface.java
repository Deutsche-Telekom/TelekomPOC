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

import java.io.File;
import java.util.ArrayList;
import java.util.Map;

import javax.transaction.TransactionManager;

import atg.nucleus.logging.VariableArgumentApplicationLogging;
import atg.repository.Repository;
import atg.siebel.catalog.job.ImportJobManager;

public interface ImportServiceInterface extends VariableArgumentApplicationLogging{

  //-------------------------------------
  /** Class version string */

  public static String CLASS_VERSION = "$Id: //product/Siebel/version/11.2/src/atg/siebel/catalog/importer/ImportServiceInterface.java#2 $$Change: 1194813 $";


  public abstract TransactionManager getTransactionManager();

  public abstract void setTransactionManager(
      TransactionManager pTransactionManager);

  public abstract String getImportFileLocation();

  public abstract void setImportFileLocation(String pImportFileLocation);

  public abstract boolean isCanDisableIndexes();

  public abstract void setCanDisableIndexes(boolean pCanDisableIndexes);

  public abstract String getImportDirectory();

  public abstract void setImportDirectory(String pImportDirectory);

  public abstract File getLogFilePath();

  public abstract void setLogFilePath(File pLogFilePath);

  public abstract boolean isUseDASImportTool();

  public abstract void setUseDASImportTool(boolean pUseDASImportTool);

  public abstract String getExportJobId();

  public abstract void setExportJobId(String pExportJobId);

  public abstract ImportJobManager getJobManager();

  public abstract void setJobManager(ImportJobManager pJobManager);

  public abstract Repository getTargetRepository(String pTargetRepository);

  public abstract Map<String, Repository> getTargetRepositories();

  public abstract void setTargetRepositories(
      Map<String, Repository> pRepositories);

  public abstract ImportSession getImportSession();

  public abstract String getServiceStatus();

  public abstract ReferenceItemGenerator getReferenceItemGenerator();

  public abstract ArrayList<ImportItem> getFailedDeletions();

  public abstract void setDataImportErrors();

  // -------------------------------------
  /**
   * This is the main execution method for the service. This method sets the
   * security context on the thread for the user specified in the userName
   * property. Next, it creates a project and then calls importData(). Next, it
   * attempts to advance the project's workflow. Finally, it unsets the security
   * context.
   */
  public abstract boolean executeImport() throws Exception;

  public abstract void notifyThreadStatus(int pThreadIndex, String pName,
      int pStatus);

  public abstract void processFailedDeletions();

  public abstract void logBatchFailure(int pSegmentIndex, int pPhase);

  public abstract void logFailedItem(ImportFailedItem pFailedItem, int pPhase);

  public abstract void logFailureMessage(String pMessage);

  /**
   * endImportSession
   * 
   * This method sets ends the import session by completing the current
   * transaction and ending the publishing workflow session in the case of
   * import into a versioned repository.
   * 
   * This method must be called at the end of an import session
   * 
   * @param pSession
   *          - the import session.
   */

  public abstract void endImportSession() throws ImportException;

  // -------------------------------------
  /**
   * This method cancels the import.
   * 
   * @throws ImportException
   */
  public abstract void cancelImport() throws ImportException;

  public abstract Object resolveName(String repositoryPath);
  
  public boolean disableIndexes();
  
  public boolean importData() throws ImportException;

  public boolean rebuildIndexes();
}