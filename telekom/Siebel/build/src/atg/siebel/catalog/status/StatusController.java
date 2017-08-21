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

import java.text.MessageFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.jws.WebMethod;
import javax.jws.WebService;

import atg.nucleus.GenericService;
import atg.siebel.catalog.importer.ImportException;

/**
 * @author jwheaton
 * @version $Id:
 *          //product/Siebel/main/src/atg/siebel/integration/catalog/importer
 *          /status/StatusController.java#1 $$Change: 1194813 $
 * @updated $DateTime: 2015/09/10 08:26:24 $$Author: saysyed $
 * 
 */
@WebService
public class StatusController
  extends GenericService {
  // -------------------------------------
  // Constants
  // -------------------------------------
  public static final String CLASS_VERSION =
    "$Id: //product/Siebel/version/11.2/src/atg/siebel/catalog/status/StatusController.java#2 $$Change: 1194813 $";

  public static final String ERR_UNKNOWN_JOB = "UNKNOWN_JOB";

  public static final String ERR_RUNNING = "RUNNING";

  public static final String ERR_SUCCESS = "SUCCESS";

  public static final String ERR_FAILED = "FAILED";

  // -------------------------------------
  // Constructors
  // -------------------------------------
  /**
   * Default constructor.
   */
  public StatusController() {

    // Dummy Stuff
    ImportStatus status = newImportStatus("2");
    JobLineError error1 =
      createJobLineError("line1", "something", "a message", "sId1");
    status.addJobError(error1);
    JobLineError error2 =
      createJobLineError("line1", "something_else", "another message", "sId2");
    status.addJobError(error2);
  }

  // -------------------------------------
  // Properties
  // -------------------------------------

  // -------------------------------------
  // Job Status Map
  Map<String, ImportStatus> mImportStatusMap =
    new HashMap<String, ImportStatus>();

  /**
   * @return returns the Map (String, ImportStatus) of import statuses.
   */
  public Map<String, ImportStatus> getImportStatusMap() {
    return mImportStatusMap;
  }

  /**
   * Since this is stored as a map, this will add a new or update an existing
   * ImportStatus
   * 
   * @param pImportStatus
   *          ImportStatus to update in the map.
   */
  public void addImportStatus(ImportStatus pImportStatus) {
    getImportStatusMap().put(pImportStatus.getJobId(), pImportStatus);
  }

  /**
   * Creates a new import status and adds it to the status map.
   * 
   * @param pJobId
   *          String of the Job ID to create a status for.
   * @return
   */
  public ImportStatus newImportStatus(String pJobId) {

    ImportStatus ret = new ImportStatus(pJobId);
    getImportStatusMap().put(pJobId, ret);
    return ret;
  }

  /**
   * Get the ImportStatus object for the specified Job ID.
   * 
   * @param pJobId
   * @return
   * @throws ImportException
   */
  public ImportStatus getImportStatus(String pJobId) throws ImportException {

    // get the import status
    ImportStatus ret = getImportStatusMap().get(pJobId);

    // OK -- return it
    if (ret != null) {
      return ret;
    }

    // no job! Setup an error
    ret = new ImportStatus(pJobId);
    /*
     * TODO need to move these out to a resources file
     */
    JobLineError error =
      createJobLineError(null, ERR_UNKNOWN_JOB, MessageFormat.format(
        "The job ID {0} does not match an existing job.", pJobId), null);
    ret.addJobError(error);

    return ret;
  }

  // -------------------------------------
  // Overridden Methods
  // -------------------------------------

  // -------------------------------------
  // Methods
  // -------------------------------------

  /**
   * Using the Job ID provided, this will update the job status header value.S
   * 
   * @param pJobId
   *          String of the Job ID to update.
   * @param pJobStatusValue
   *          String of the Job Status value.
   */
  public void setJobStatusValue(String pJobId, String pJobStatusValue)
    throws ImportException {

    ImportStatus is = getImportStatus(pJobId);
    if (is.isStatus(ERR_UNKNOWN_JOB)) {
      throw new ImportException("Cannot set status on non-existent job: "
        + pJobId);
    }

    is.getJobStatus().setStatus(pJobStatusValue);
  }

  /**
   * Sets the header-level import phase value
   */
  public void setJobPhaseValue(String pJobId, String pJobPhaseValue)
    throws ImportException {

    ImportStatus is = getImportStatus(pJobId);
    if (is.isStatus(ERR_UNKNOWN_JOB)) {
      throw new ImportException("Cannot set import phase on non-existent job: "
        + pJobId);
    }

    is.setJobPhaseValue(pJobPhaseValue);
  }

  /**
   * Factory method to create a new Job Line Error. Also creates anything
   * missing between this class and the list where the error goes.
   */
  public JobLineError createJobLineError(String pExportItemId, String pErrorType,
    String pErrorMessage, String pSiebelId) {

    return new JobLineError(pExportItemId, pErrorType, pErrorMessage, pSiebelId);

  }

  /**
   * Adds a Job Line Error (bean) to the list of Job Line Errors.
   */
  public void addJobLineError(String pJobId, JobLineError pJobLineError)
    throws ImportException {
    ImportStatus is = getImportStatus(pJobId);

    if (is.isStatus(ERR_UNKNOWN_JOB)) {
      throw new ImportException(
        "Cannot set job line error on non-existent job: " + pJobId);
    }

    is.addJobError(pJobLineError);

  }

  /**
   * Returns the job line errors for a specific job.
   * 
   * @param pJobId
   *          String of the job to return the errors for.
   * @return JobLineError[] of the errors.
   * @throws ImportException
   */
  @WebMethod
  public String[] getJobLineErrors(String pJobId) throws ImportException {

    ImportStatus status = getImportStatus(pJobId);
    List<JobLineError> errList = status.getJobErrorList();

    String[] ret = new String[errList.size()];

    for (int idx = 0; idx < errList.size(); idx++) {
      ret[idx] = errList.get(idx).toStringForWSDL();
    }

    return ret;
  }

  /**
   * Returns the status of a job.
   * 
   * @param pJobId
   * @return
   * @throws ImportException
   */
  @WebMethod
  public String getJobStatusValue(String pJobId) throws ImportException {
    String ret = null;

    getImportStatus(pJobId).getJobStatusValue();

    return ret;
  }
}
