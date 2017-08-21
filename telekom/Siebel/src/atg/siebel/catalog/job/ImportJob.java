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

package atg.siebel.catalog.job;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Set;

import atg.common.util.ThreadDispatcherJob;
import atg.siebel.catalog.SiebelCatalogImportController;
import atg.siebel.catalog.importer.ImportSession;
import atg.siebel.catalog.job.ImportJobEnums.ExecutionPolicy;
import atg.siebel.catalog.job.ImportJobEnums.ProcessingPhase;
import atg.siebel.catalog.job.ImportJobEnums.ProcessingStatus;

/**
 * Represents an import job. 
 *
 * @author bbrady
 * @version $Id: //product/Siebel/version/11.2/src/atg/siebel/catalog/job/ImportJob.java#2 $$Change: 1194813 $
 * @updated $DateTime: 2015/09/10 08:26:24 $$Author: saysyed $
 */
public class ImportJob extends ThreadDispatcherJob implements Comparable<ImportJob> {

  //-------------------------------------
  /** Class version string */

  public static String CLASS_VERSION = "$Id: //product/Siebel/version/11.2/src/atg/siebel/catalog/job/ImportJob.java#2 $$Change: 1194813 $";

  
  private final String mJobId;
  private final ExecutionPolicy mPolicy;
  private final Timestamp mStartTime;
  private final String mExportFileLocation;
  private final String mImportType;
  private Timestamp mEndTime;
  protected PropertyChangeSupport mPropertyChangeSupport = new PropertyChangeSupport(this);
  
  
  //-------------------------------------
  // Properties
  //-------------------------------------
  
  // -----------------------------
  // property: controller
  // -----------------------------
  protected SiebelCatalogImportController mController;  
  public SiebelCatalogImportController getController() {
    return mController;
  }
  public void setController(SiebelCatalogImportController pController) {
    mController = pController;
  }
    
  //-------------------------------------
  // status
  private ProcessingStatus mStatus;  
  public ProcessingStatus getStatus() {
    return mStatus;
  }
  public void setStatus(ProcessingStatus pStatus) {
    mPropertyChangeSupport.firePropertyChange(
        new PropertyChangeEvent(this, "status", mStatus, mStatus = pStatus));
  }

  
  //-------------------------------------
  // phase
  private ProcessingPhase mPhase;
  public ProcessingPhase getPhase() {
    return mPhase;
  }
  public void setPhase(ProcessingPhase pPhase) {
    // notify listeners
    mPropertyChangeSupport.firePropertyChange(
        new PropertyChangeEvent(this, "phase", mPhase, mPhase = pPhase));
  }

  
  //-------------------------------------
  // Errors
  private List<ImportJobError> mErrors;
  public synchronized List<ImportJobError> getErrors() {
    return mErrors;
  }
  
  //-------------------------------------
  // mappedItemsCount
  private int mMappedItemsCount;
  public int getMappedItemsCount() {
    return mMappedItemsCount;
  }
  public void setMappedItemsCount(int pMappedItemsCount) {
    mMappedItemsCount = pMappedItemsCount;
  }

  //-------------------------------------
  // importedItemsCount
  private int mImportedItemsCount;
  public int getImportedItemsCount() {
    return mImportedItemsCount;
  }
  public void setImportedItemsCount(int pImportedItemsCount) {
    mImportedItemsCount = pImportedItemsCount;
  }
  
  //-------------------------------------
  // importSession
  public ImportSession getImportSession() {
    return getController().getImportService().getImportSession();
  }
  
  //-------------------------------------
  // affectedItemTypes
  Map<String, Set<String>> mAffectedItemTypes = new Hashtable<String, Set<String>>();
  public void setAffectedItemTypes(Map<String, Set<String>> pAffectedItemTypes) {
    mAffectedItemTypes = pAffectedItemTypes;
  }
  public Map<String, Set<String>> getAffectedItemTypes() {
    return mAffectedItemTypes;
  }
  
  //----------------------------------------
  // Constructors
  //----------------------------------------
  public ImportJob(
      String pJobId, 
      ExecutionPolicy pPolicy, 
      String pExportFileLocation, 
      String pImportType) {
    
    super();
    mJobId = pJobId;
    mPolicy = pPolicy;
    mExportFileLocation = pExportFileLocation;
    mImportType = pImportType;
    mStatus = ProcessingStatus.RUNNING;
    mStartTime = new Timestamp(System.currentTimeMillis());
  }
  
  
  //----------------------------------------
  // Methods
  //----------------------------------------
  
  
  /**
   * @return
   */
  public String getJobId() {
    return mJobId;
  }
  
  
  /**
   * @return
   */
  public ExecutionPolicy getPolicy() {
    return mPolicy;
  }
  
  
  /**
   * @return
   */
  public String getExportFileLocation() {
    return mExportFileLocation;
  }
  
  
  /**
   * @return
   */
  public String getImportType() {
    return mImportType;
  }
    
  
  /**
   * @param pJobError
   */
  public synchronized void addError(ImportJobError pJobError) {
    if (mErrors == null) {
      mErrors = new ArrayList<ImportJobError>();
    }
    mErrors.add(pJobError);
  }
  
  
  /**
   * 
   */
  public void markComplete() {
    if (mPolicy == ExecutionPolicy.COMPLETE_WITH_ERRORS) {
      setStatus((mPhase == ProcessingPhase.COMPLETE) ? ProcessingStatus.SUCCESS
          : ProcessingStatus.FAILED);
    }
    else {
      setStatus((mErrors == null || mErrors.isEmpty()) ? ProcessingStatus.SUCCESS
        : ProcessingStatus.FAILED);
    }
    mEndTime = new Timestamp(System.currentTimeMillis());
  }
  
  
  /**
   * @return
   */
  public Timestamp getStartTime() {
    return mStartTime;
  }
  
  
  /**
   * @return
   */
  public Timestamp getEndTime() {  
    return mEndTime;
  }
  
  
  /* (non-Javadoc)
   * @see atg.common.util.ThreadDispatcherJob#invoke()
   */
  public void invoke() {
    // set status
    setStatus(ProcessingStatus.RUNNING);
    
    // set phase
    setPhase(ProcessingPhase.DATA_EXTRACTION);
    
    mController.setSiebelFileLocation(getExportFileLocation());
    mController.setExportJobId(getJobId());
    mController.importFromSiebel();
  }
  
  
  @Override
  public String toString() {
	  return "ImportJob [mJobId=" + mJobId + ", mPolicy=" + mPolicy
	      + ", mStartTime=" + mStartTime + ", mEndTime=" + mEndTime
	      + ", mStatus=" + mStatus + ", mPhase=" + mPhase + ", mErrors="
	      + mErrors + "]";
  }
  
  
  @Override
  public int compareTo(ImportJob pJobStatus) {    
     if(!(pJobStatus instanceof ImportJob)){
       throw new ClassCastException("Invalid object");
   }  
   Timestamp startTime = ((ImportJob) pJobStatus).getStartTime();  
   return getStartTime().compareTo(startTime);
  }
  
  
  /**
   * @param pNewListener
   */
  public void addChangeListener(PropertyChangeListener pNewListener) {
    mPropertyChangeSupport.addPropertyChangeListener(pNewListener);
  }
  
  /**
   * @param pNewListener
   */
  public void setChangeListeners(PropertyChangeListener[] propertyChangeListeners) {
    if (propertyChangeListeners != null && propertyChangeListeners.length > 0) {
      for (PropertyChangeListener listener : propertyChangeListeners) {
        mPropertyChangeSupport.addPropertyChangeListener(listener);
      }
    }
  }
  
  /**
   * @param batchProcessed
   */
  public void notifyImportPhaseEnded(boolean pImportPhaseSuccess) {
    if (pImportPhaseSuccess) {
      mPropertyChangeSupport.firePropertyChange(
        new PropertyChangeEvent(
            this, "phase", mPhase, ProcessingPhase.IMPORT_COMPLETE_APPLY));
    } else {
      mPropertyChangeSupport.firePropertyChange(
          new PropertyChangeEvent(
              this, "phase", mPhase, ProcessingPhase.IMPORT_COMPLETE_ROLLBACK));
    }
  }
  
}
