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

package atg.siebel.catalog.status;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * Catalog Import Status class which holds all the necessary data to store and
 * report the status of a specific Job from Siebel.
 * 
 * @author jwheaton
 * @version $Id:
 *          //product/Siebel/main/src/atg/siebel/integration/catalog/importer
 *          /status/ImportStatus.java#1 $$Change: 1194813 $
 * @updated $DateTime: 2015/09/10 08:26:24 $$Author: saysyed $
 * 
 */
public class ImportStatus {
  // -------------------------------------
  // Constants
  // -------------------------------------
  public static final String CLASS_VERSION =
    "$Id: //product/Siebel/version/11.2/src/atg/siebel/catalog/status/ImportStatus.java#2 $$Change: 1194813 $";

  // -------------------------------------
  // Constructors
  // -------------------------------------
  /**
   * Constructor to create an import status with a Job ID. Creating an import
   * status without a job ID is not allowed.
   */
  public ImportStatus(String pJobId) {
    mJobId = pJobId;
    mJobStatus = new JobStatus();
  }

  // -------------------------------------
  // Properties
  // -------------------------------------

  // -------------------------------------
  // Job ID
  String mJobId = null;

  /**
   * @return String of the JobId to set.
   */
  public String getJobId() {
    return mJobId;
  }

  /**
   * @param pJobId
   *          String of the JobId for this Job status
   */
  public void setJobId(String pJobId) {
    mJobId = pJobId;
  }

  // -------------------------------------
  // Job Status -- global info
  JobStatus mJobStatus = null;

  /**
   * @return JobStatus which is the global level status of the job.
   */
  public JobStatus getJobStatus() {
    return mJobStatus;
  }

  // -------------------------------------
  // Job Error List
  List<JobLineError> mJobLineErrorList = null;

  /**
   * @param pJobError
   *          Adds a JobError to the list of errors.
   */
  public void addJobError(JobLineError pJobError) {
    if (getJobErrorList() == null) {
      mJobLineErrorList = new ArrayList<JobLineError>();
    }
    
    mJobLineErrorList.add(pJobError);
  }

  /**
   * @return
   */
  public List<JobLineError> getJobErrorList() {
    return mJobLineErrorList;
  }

  // -------------------------------------
  // Methods
  // -------------------------------------

  /**
   * @return String of the Job Status value from the nested JobStatus object.
   */
  public String getJobStatusValue() {
    return getJobStatus().getStatus();
  }

  /**
   * @param pStatus
   *          String of the status value to set on the nested Job Status object.
   */
  public void setJobStatusValue(String pStatus) {
    getJobStatus().setStatus(pStatus);
  }

  /**
   * @return String of the Job Phase value from the nested JobStatus object.
   */
  public String getJobPhaseValue() {
    return getJobStatus().getPhase();
  }

  /**
   * @param pPhase
   *          String of the job phase value to set on the nested Job Status
   *          object.
   */
  public void setJobPhaseValue(String pPhase) {
    getJobStatus().setPhase(pPhase);
  }

  /**
   * @return true if the job status matches
   */
  public boolean isStatus(String pStatus) {
    if (getJobStatus().equals(pStatus))
      return true;
    return false;
  }

  /**
   * {@inheritDoc}
   *
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("ImportStatus [mJobId=");
    builder.append(mJobId);
    builder.append(", mJobStatus=");
    builder.append(mJobStatus);
    builder.append(", mJobLineErrorList=");
    builder.append(mJobLineErrorList);
    builder.append("]");
    return builder.toString();
  }
  
  

}
