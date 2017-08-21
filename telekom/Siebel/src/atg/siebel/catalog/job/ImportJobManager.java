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
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import atg.nucleus.GenericService;
import atg.nucleus.Nucleus;
import atg.nucleus.ServiceAdminServlet;
import atg.nucleus.ServiceException;
import atg.siebel.catalog.job.ImportJobEnums.ExecutionPolicy;
import atg.siebel.catalog.job.ImportJobEnums.ProcessingPhase;
import atg.siebel.catalog.job.ImportJobEnums.ProcessingStatus;

/**
 * Import Job Manager
 *
 * @author bbrady
 * @version $Id: //product/Siebel/version/11.2/src/atg/siebel/catalog/job/ImportJobManager.java#2 $$Change: 1194813 $
 * @updated $DateTime: 2015/09/10 08:26:24 $$Author: saysyed $
 */

public class ImportJobManager extends GenericService implements PropertyChangeListener {

  //-------------------------------------
  /** Class version string */

  public static String CLASS_VERSION = "$Id: //product/Siebel/version/11.2/src/atg/siebel/catalog/job/ImportJobManager.java#2 $$Change: 1194813 $";


  
  protected Map<String, ImportJob> mImportJobMap = new HashMap<String, ImportJob>();                               
  protected Map<String, ExecutionPolicy> mPolicyMap = new HashMap<String, ExecutionPolicy>();
  
  //-------------------------------------
  // Properties
  //-------------------------------------
  
  //-------------------------------------
  // defaultPolicy
  private String mDefaultPolicy = ExecutionPolicy.ABORT_ON_ERROR.toString();  
  public String getDefaultPolicy() {
    return mDefaultPolicy;
  }
  public void setDefaultPolicy(String pDefaultPolicy) {
    if (!mPolicyMap.keySet().contains(pDefaultPolicy)) {
      vlogWarning("New default policy not recognised - {0}", pDefaultPolicy);
      return;
    }
    mDefaultPolicy = pDefaultPolicy;
  }
  
  //-------------------------------------
  // abortOnErrorStringProperty
  private String mAbortOnErrorStringProperty = 
  		ExecutionPolicy.ABORT_ON_ERROR.toString();  
  public String getAbortOnErrorStringProperty() {
    return mAbortOnErrorStringProperty;
  }
  public void setAbortOnErrorStringProperty(String pAbortOnErrorStringProperty) {
    mAbortOnErrorStringProperty = pAbortOnErrorStringProperty;
    mPolicyMap.put(mAbortOnErrorStringProperty, ExecutionPolicy.ABORT_ON_ERROR);
  }
  
  
  //-------------------------------------
  //completeWithErrorStringProperty
  private String mCompleteWithErrorStringProperty = 
  		ExecutionPolicy.COMPLETE_WITH_ERRORS.toString();  
  public String getCompleteWithErrorStringProperty() {
    return mCompleteWithErrorStringProperty;
  }
  public void setCompleteWithErrorStringProperty(String pCompleteWithErrorStringProperty) {
    mCompleteWithErrorStringProperty = pCompleteWithErrorStringProperty;
    mPolicyMap.put(mCompleteWithErrorStringProperty, ExecutionPolicy.COMPLETE_WITH_ERRORS);
  }
  
  
  //-------------------------------------
  // rollbackWithErrorStringProperty
  private String mRollbackWithErrorStringProperty = 
  		ExecutionPolicy.ROLLBACK_WITH_ERRORS.toString();  
  public String getRollbackWithErrorStringProperty() {
    return mRollbackWithErrorStringProperty;
  }
  public void setRollbackWithErrorStringProperty(String pRollbackWithErrorStringProperty) {
    mRollbackWithErrorStringProperty = pRollbackWithErrorStringProperty;
    mPolicyMap.put(mRollbackWithErrorStringProperty, ExecutionPolicy.COMPLETE_WITH_ERRORS);
  }
  
  //-------------------------------------
  // jobChangeListeners
  private PropertyChangeListener[] mJobChangeListeners;
  public PropertyChangeListener[] getJobChangeListeners() {
    return mJobChangeListeners;
  }
  public void setJobChangeListeners(PropertyChangeListener[] pJobChangeListeners) {
    mJobChangeListeners = pJobChangeListeners;
  }
  
  
  //-------------------------------------
  // Methods
  //-------------------------------------
  
  /**
   * @param pJobId
   * @param pPolicy
   */
  public ImportJob registerNewJob(
      String pJobId, 
      String pPolicy, 
      String pExportFileLocation, 
      String pImportType) {
    
    vlogDebug("Entered registerNewJob : pjobId = [{0}]; pPolicy = [{1}]", pJobId, pPolicy);
    ImportJob job = new ImportJob(pJobId, getExecutionPolicy(pPolicy), pExportFileLocation, pImportType);
    job.setPhase(ProcessingPhase.QUEUED);
    job.setStatus(ProcessingStatus.QUEUED);
    if (mImportJobMap == null) {
      mImportJobMap = new HashMap<String, ImportJob>();
    }
    mImportJobMap.put(pJobId, job);    
    job.setChangeListeners(getJobChangeListeners());
    job.addChangeListener(this);
    vlogDebug("Registration completed for job {0}", job);
    return job;
  }

  /**
   * @param pJobId
   * @return
   */
  public boolean canJobProceedToNextPhase(String pJobId) {
    vlogDebug("Entered canProceedToNextPhase : pJobId = {0}" , pJobId);
    ImportJob job = getImportJob(pJobId);
    boolean proceed = (job.getPolicy().equals(ExecutionPolicy.COMPLETE_WITH_ERRORS) 
        || job.getErrors() == null
        || job.getErrors().isEmpty()) ? true : false;
    vlogDebug("Leaving canProceedToNextPhase : proceed = {0}" , proceed);
    return proceed;
  }

  /**
   * @param pJobId
   * @return
   */
  public synchronized boolean shouldAbort(String pJobId) {
    vlogDebug("Entered shouldAbort : pJobId = {0}" , pJobId);
    ImportJob job = getImportJob(pJobId);
    boolean abort = (job.getPolicy().equals(ExecutionPolicy.ABORT_ON_ERROR) 
        && job.getErrors() != null
        && !job.getErrors().isEmpty()) ? true : false;
    vlogDebug("Leaving shouldAbort : abort = {0}" , abort);
    return abort;
  }
  
  /**
   * @param pJobId
   * @return
   */
  public ImportJobStatusMessage getJobStatusMessage(String pJobId) {
    vlogDebug("Entered getJobStatusMessage : pJobId = {0}" , pJobId);
    ImportJob job = getImportJob(pJobId);
    ImportJobStatusMessage message = null;
    if (job != null) {
      message = createJobStatusMessage(job);
    } else {
      message = createUnrecognisedJobStatusMessage(pJobId);
    }
    vlogDebug("Leaving getJobStatusMessage : message = {0}" , message);
    return message;
  }

  
  /**
   * @param pJobId
   * @param pError
   * @return
   */
  public synchronized boolean processJobError(String pJobId, ImportJobError pError) {    
    vlogDebug("Entered processJobError : pJobId = {0}; pError = {1}" , pJobId, pError);
    ImportJob job = getImportJob(pJobId);
    job.addError(pError);
               
    ExecutionPolicy policy = job.getPolicy();
    boolean shouldAbort = (policy.equals(ExecutionPolicy.ABORT_ON_ERROR)) ? true : false;
    vlogDebug("Leaving processJobError : abort = {0}" , shouldAbort);
    return shouldAbort;
  }
  
  
  /**
   * @param pJobId
   */
  public void markJobComplete(String pJobId) {
    vlogDebug("Entered markJobComplete : pJobId = {0}", pJobId);
    ImportJob job = getImportJob(pJobId);
    job.markComplete();
    vlogDebug("Leaving markJobComplete : pJobId = {0}", pJobId);
  }
  
  
  /**
   * @param pJobId
   * @param pPhase
   */
  public void setJobPhase(String pJobId, ProcessingPhase pPhase) {
    vlogDebug("Entered setJobPhase : pJobId = {0}; pPhase = {1}" , pJobId, pPhase);
    ImportJob job = getImportJob(pJobId);
    job.setPhase(pPhase);
    vlogDebug("Leaving setJobPhase : pJobId = {0}" , pJobId);
  }
  
  /**
   * @param pJobId
   * @param pAffectedItemTypes
   */
  public void setAffectedItemTypes(String pJobId, Map<String, Set<String>> pAffectedItemTypes) {
    vlogDebug("Entered setAffectedItemTypes : pJobId = {0}; pAffectedItemTypes = {1}" , 
        pJobId, pAffectedItemTypes);
    ImportJob job = getImportJob(pJobId);
    job.setAffectedItemTypes(pAffectedItemTypes);
    vlogDebug("Leaving setAffectedItemTypes : pJobId = {0}" , pJobId);
  }
  
  /**
   * @param mExportJobId
   * @param batchProcessed
   */
  public void notifyImportPhaseEnded(String pJobId, boolean batchProcessed) {
    vlogDebug("Entered notifyImportPhaseEnded : pJobId = {0}; batchProcessed = {1}" , 
        pJobId, batchProcessed);
    ImportJob job = getImportJob(pJobId);
    job.notifyImportPhaseEnded(batchProcessed);
    vlogDebug("Leaving notifyImportPhaseEnded : pJobId = {0}" , pJobId);    
  }
  
  /**
   * 
   */
  public void clearJobMap() {
    vlogDebug("Entered clearErrorMap");
    mImportJobMap = new HashMap<String, ImportJob>();
    vlogDebug("Leaving clearErrorMap");
  }

    
  /**
   * @param pJobId
   * @return
   */
  public ImportJob getImportJob(String pJobId) {
    vlogDebug("Entered getImportJob : pJobId = {0}" , pJobId);
    ImportJob job = null;
    if (mImportJobMap != null) {
      job = mImportJobMap.get(pJobId);
    } 
    return job;
  }
  
  
  /**
   * @param pJob
   * @return
   */
  protected ImportJobStatusMessage createJobStatusMessage(ImportJob pJob) {
    vlogDebug("Entered createMessageFromJobStatus : pStatus = {0}", pJob);
    ImportJobStatusMessage statusMessage = new ImportJobStatusMessage();
    statusMessage.setJobId(pJob.getJobId());
    statusMessage.setPhase(pJob.getPhase().toString());
    statusMessage.setStatus(pJob.getStatus().toString());
    List<ImportJobErrorMessage> errors = new ArrayList<ImportJobErrorMessage>();
    if (pJob.getErrors() != null) {
      for (ImportJobError error : pJob.getErrors()) {
        ImportJobErrorMessage errorMessage = new ImportJobErrorMessage();
        errorMessage.setExportItemId(error.getExportItemId());
        errorMessage.setMessage(error.getMessage());
        errorMessage.setSourceItemId(error.getSourceItemId());
        errorMessage.setSourceItemType(error.getSourceItemType());
        errorMessage.setSourceReferenceItemId(error.getSourceReferenceItemId());
        errorMessage.setSourceReferenceItemType(error
            .getSourceReferenceItemType());
        errorMessage.setType(error.getType().toString());
        errors.add(errorMessage);
      }
    }
    statusMessage.setErrors(errors.toArray(new ImportJobErrorMessage[errors
        .size()]));
    vlogDebug("Leaving createMessageFromJobStatus : statusMessage = {0}",
        statusMessage);
    return statusMessage;
  }
  
  /**
   * @param pJob
   * @return
   */
  protected ImportJobStatusMessage createUnrecognisedJobStatusMessage(
      String pJobId) {
    vlogDebug("Entered createUnrecognisedJobStatusMessage : pJobId = {0}",
        pJobId);
    ImportJobStatusMessage statusMessage = new ImportJobStatusMessage();
    statusMessage.setJobId(pJobId);
    statusMessage.setPhase(ProcessingPhase.COMPLETE.toString());
    statusMessage.setStatus(ProcessingStatus.UNRECOGNISED_JOB.toString());
    vlogDebug(
        "Leaving createUnrecognisedJobStatusMessage : statusMessage = {0}",
        statusMessage);
    return statusMessage;
  }
  
  
  /**
   * @return
   */
  Map<String, ImportJob> getImportJobMap() {
    return mImportJobMap;
  }
  
  
  /**
   * @param pPolicyString
   * @return
   */
  public ExecutionPolicy getExecutionPolicy(String pPolicyString) {
    vlogDebug("Entered getExecutionPolicy : pPolicyString = {0}" , pPolicyString);
    ExecutionPolicy policy = mPolicyMap.get(pPolicyString);
    if (policy == null) {
      // What to do here? Log a warning and apply a default policy?
      vlogWarning(
          "Policy string not recognised {0} - returning with default policy", 
          pPolicyString);
      policy = mPolicyMap.get(getDefaultPolicy());
    }
    vlogDebug("Leaving getExecutionPolicy : policy = {0}" , policy);
    return policy;
  }
  
  
  @Override
  public void doStartService() throws ServiceException {
    super.doStartService();
    mPolicyMap.put(getAbortOnErrorStringProperty(), ExecutionPolicy.ABORT_ON_ERROR);
    mPolicyMap.put(getCompleteWithErrorStringProperty(), ExecutionPolicy.COMPLETE_WITH_ERRORS);
    mPolicyMap.put(getRollbackWithErrorStringProperty(), ExecutionPolicy.ROLLBACK_WITH_ERRORS);
  }
  
  /**
   * Create an admin servlet for administering this service.
   * @return the servlet
   **/
  protected Servlet createAdminServlet () {
    return new ImportJobManager.AdminServlet(this, getNucleus());
  }
  
  /**
   * Admin servlet which displays the detailed status of the agent
   **/
  class AdminServlet extends ServiceAdminServlet {
    // Constructor.
    public AdminServlet(ImportJobManager pService, Nucleus pNucleus) {
      super(pService, pNucleus);
    }

    // Override print method to add in our fun stuff.
    protected void printAdmin(HttpServletRequest pRequest,
        HttpServletResponse pResponse, ServletOutputStream pOut)
        throws ServletException, IOException {
      // Turn the service into what should and can only be our service.
      ImportJobManager jobStatusService = (ImportJobManager) mService;
      Map<String, ImportJob> jobStatusMap = jobStatusService.getImportJobMap();

      // Print our job status
      pOut.println("<H3>Running/Completed Job Status</H3>");

      pOut.println("<TABLE BORDER='2'>");

      pOut.println("<TR><TH>Job Id</TH><TH>Start Time</TH><TH>End Time</TH><TH>Policy</TH><TH>Phase</TH><TH>Status</TH><TH>Errors</TH></TR>");

      Collection<ImportJob> jobs = jobStatusMap.values();
      List<ImportJob> sortedList = new ArrayList<ImportJob>(jobs);
      Collections.sort(sortedList);
      Collections.reverse(sortedList);
      int rowCount = 1;
      for (ImportJob job : sortedList) {
        if (rowCount++ % 2 == 0) {
          pOut.println("<TR bgcolor='#F2F2F2'>");
        } else {
          pOut.println("<TR>");
        }
        pOut.println("<TD>" + job.getJobId() + "</TD>");
        pOut.println("<TD>" + job.getStartTime() +"</TD>");
        pOut.println("<TD>" + job.getEndTime() +"</TD>");
        pOut.println("<TD>" + job.getPolicy() + "</TD>");
        pOut.println("<TD>" + job.getPhase() + "</TD>");
        pOut.println("<TD>" + job.getStatus() + "</TD>");
        if (job.getErrors() != null && !job.getErrors().isEmpty()) {
          pOut.println("<TD><TABLE>");
          pOut.println("<TR><TH width='150'>Type</TH><TH width='100'>Export Item Id</TH><TH width='250'>Message</TH><TH width='100'>Item Id</TH><TH width='150'>Item Type</TH><TH width='100'>Reference Item Id</TH><TH width='150'>Reference Item Type</TH></TR>");
          for (ImportJobError error : job.getErrors()) {
            pOut.println("<TR>");
            pOut.println("<TD width='150'>" + error.getType() + "</TD>");
            pOut.println("<TD width='100'>" + error.getExportItemId() + "</TD>");
            pOut.println("<TD width='250'>" + error.getMessage() + "</TD>");
            pOut.println("<TD width='100'>" + error.getSourceItemId() + "</TD>");
            pOut.println("<TD width='150'>" + error.getSourceItemType() + "</TD>");
            pOut.println("<TD width='100'>" + error.getSourceReferenceItemId() + "</TD>");
            pOut.println("<TD width='150'>" + error.getSourceReferenceItemType() + "</TD>");
            pOut.println("</TR>");
            pOut.println("<TR><TD height='5' colspan='5'><HR /></TD></TR>");
          }
          pOut.println("</TABLE></TD>");
        } else {
          pOut.println("<TD>-no errors-</TD");
        }
        pOut.println("</TR>");
      }
      pOut.println("</TABLE>");
      pOut.println("<BR>");

      // print standard stuff like properties
      super.printAdmin(pRequest, pResponse, pOut);
    }

  } // End of supporting inner class AdminServlet

  
  @Override
  public void propertyChange(PropertyChangeEvent pPropertyChangeEvent) {
    vlogDebug("==================================================================");
    vlogDebug("New pPropertyChangeEvent");
    vlogDebug("Source = {0}", pPropertyChangeEvent.getSource());
    vlogDebug("Property = {0}", pPropertyChangeEvent.getPropertyName());
    vlogDebug("Old Value = {0}", pPropertyChangeEvent.getOldValue());
    vlogDebug("New Value = {0}", pPropertyChangeEvent.getNewValue());
    vlogDebug("==================================================================");
  }
  
}
