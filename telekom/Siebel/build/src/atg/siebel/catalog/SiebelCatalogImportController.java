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

package atg.siebel.catalog;

import java.io.File;

import atg.nucleus.GenericService;
import atg.siebel.catalog.importer.ImportServiceInterface;
import atg.siebel.catalog.importer.ImportTypeEnum;
import atg.siebel.catalog.job.ImportJob;
import atg.siebel.catalog.job.ImportJobEnums.ProcessingPhase;
import atg.siebel.catalog.job.ImportJobManager;
import atg.siebel.catalog.mapper.MappingException;
import atg.siebel.catalog.mapper.SiebelMappingService;

/**
 * Controller for the Catalog import process.
 * 
 * @version $Id: //product/Siebel/version/11.2/src/atg/siebel/catalog/SiebelCatalogImportController.java#2 $$Change: 1194813 $
 * @updated $DateTime: 2015/09/10 08:26:24 $$Author: saysyed $
 */
public class SiebelCatalogImportController
  extends GenericService {

  //-------------------------------------
  /** Class version string */

  public static String CLASS_VERSION = "$Id: //product/Siebel/version/11.2/src/atg/siebel/catalog/SiebelCatalogImportController.java#2 $$Change: 1194813 $";

  
  // -------------------------------------
  // Properties
  // -------------------------------------
  
  
  // -----------------------------
  // property: mappingService
  // -----------------------------
  protected SiebelMappingService mMappingService;  

  public SiebelMappingService getMappingService() {
    return mMappingService;
  }

  public void setMappingService(SiebelMappingService pMappingService) {
    mMappingService = pMappingService;
  }
  
  // -----------------------------
  // property: importService
  // -----------------------------
  protected ImportServiceInterface mImportService;  

  public ImportServiceInterface getImportService() {
    return mImportService;
  }

  public void setImportService(ImportServiceInterface pImportService) {
    mImportService = pImportService;
  }
  
  
  // -----------------------------
  // property: siebelFileLocation
  // -----------------------------
  String mSiebelFileLocation;

  /**
   * @return File object representing the Siebel file to import.
   */
  public String getSiebelFileLocation() {
    return mSiebelFileLocation;
  }

  /**
   * @param pSiebelFileLocation
   *          File object of the Siebel file to import.
   */
  public void setSiebelFileLocation(String pSiebelFileLocation) {
    mSiebelFileLocation = pSiebelFileLocation;
  }
  
  // -----------------------------
  // property: importFileLocation
  // -----------------------------
  File mImportFileLocation;

  /**
   * @return File of the import file to use.
   */
  public File getImportFileLocation() {
    return mImportFileLocation;
  }

  /**
   * @param pImportFileLocation
   *          File of the import file to use.
   */
  public void setImportFileLocation(File pImportFileLocation) {
    mImportFileLocation = pImportFileLocation;
  }
  
  // -----------------------------
  // property: exportJobId
  // -----------------------------
  String mExportJobId = null;

  public String getExportJobId() {
	return mExportJobId;
  }

  public void setExportJobId(String pExportJobId) {
	this.mExportJobId = pExportJobId;
  }
    
  // -----------------------------
  // property: importType
  // -----------------------------
  ImportTypeEnum pImportType = ImportTypeEnum.FULL;

  public ImportTypeEnum getImportType() {
	return pImportType;
  }

  public void setImportType(ImportTypeEnum pImportType) {
	this.pImportType = pImportType;
  }
  
  // -----------------------------
  // property: jobManager
  // -----------------------------
  protected ImportJobManager mJobManager;  
  public ImportJobManager getJobManager() {
    return mJobManager;
  }
  public void setJobManager(ImportJobManager pJobManager) {
    mJobManager = pJobManager;
  }
  
  
  /**
   * Entry point for setting up the final data and executing the import.
   */
  public void importFromSiebel() {
    vlogDebug("Entered importFromSiebel()");
    // setup data on the mapping service
    mMappingService.setExportJobId(mExportJobId);
    mMappingService.setSiebelFileLocation(mSiebelFileLocation);
    mMappingService.setImportFileLocation(mImportFileLocation);

    // call mapping
    vlogDebug("Calling MappingService - SiebelFileLocation = {0}",
        mSiebelFileLocation);

    try {
      mMappingService.mapSiebelToAtg();
    } catch (MappingException e1) {
      // Fatal error must have occurred during mapping
      vlogError("Mapping Aborted ! reason = {0}", e1.getLocalizedMessage());
      mJobManager.markJobComplete(mExportJobId);
      return;
    }

    vlogDebug("MappingService finished. File = {0}", mSiebelFileLocation);

    if (mJobManager.canJobProceedToNextPhase(mExportJobId)) {
      // setup data on the import service
      mImportService.setExportJobId(mExportJobId);
      mImportService.setImportFileLocation(mImportFileLocation
          .getAbsolutePath());
      mImportService.setTargetRepositories(mMappingService
          .getTargetRepositories());

      // call importer
      vlogDebug("About to call ImportService");
      try {
        if (mImportService.executeImport()) {
          mJobManager.setJobPhase(mExportJobId, ProcessingPhase.COMPLETE);
          vlogDebug("ImportService finished successfully");
        } else {
          vlogWarning("ImportService DID NOT finish successfully");
        }
      } catch (Exception e) {
        logError(e);
      }
    } else {
      vlogError("Unable to proceed to Import Phase.");
    }
    mJobManager.markJobComplete(mExportJobId);
    vlogDebug("Leaving importFromSiebel()");
  }
  
  
  public void testImportOnly() {
    ImportJob job = mJobManager.registerNewJob(
        "test", "job"+System.currentTimeMillis(), null, ImportTypeEnum.FULL.toString());
    mImportService.setExportJobId(job.getJobId());
    mImportService.setJobManager(mJobManager);
    mImportService.setImportFileLocation(mImportFileLocation
        .getAbsolutePath());
    mImportService.setTargetRepositories(mMappingService
        .getTargetRepositories());

    // call importer
    vlogDebug("About to call ImportService");
    try {
      if (mImportService.executeImport()) {
        mJobManager.setJobPhase(mExportJobId, ProcessingPhase.COMPLETE);
        vlogDebug("ImportService finished successfully");
      } else {
        vlogWarning("ImportService DID NOT finish successfully");
      }
    } catch (Exception e) {
      logError(e);
    }
  }
  
}
