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

/**
 * A container for the details for errors in job lines.
 * 
 * @author jwheaton
 * @version $Id:
 *          //product/Siebel/main/src/atg/siebel/integration/catalog/importer
 *          /status/JobLineError.java#1 $$Change: 1194813 $
 * @updated $DateTime: 2015/09/10 08:26:24 $$Author: saysyed $
 * 
 */
public class JobLineError {
  // -------------------------------------
  // Constants
  // -------------------------------------
  public static final String CLASS_VERSION =
    "$Id: //product/Siebel/version/11.2/src/atg/siebel/catalog/status/JobLineError.java#2 $$Change: 1194813 $";

  // -------------------------------------
  // Constructors
  // -------------------------------------
  /**
   * Constructor with the minimum set of required fields for this object.
   * 
   * @param pExportItemId
   *          String of the Siebel job line ID.
   * @param pErrorType
   *          String of the error type code.
   * @param pErrorMessage
   *          String of the error message.
   * @param pSiebelId
   *          String of the Siebel item ID.
   */
  public JobLineError(String pExportItemId, String pErrorType,
    String pErrorMessage, String pSiebelId) {

    mExportItemId = pExportItemId;
    mErrorType = pErrorType;
    mErrorMessage = pErrorMessage;
    mSiebelId = pSiebelId;
  }

  // -------------------------------------
  // Properties
  // -------------------------------------

  // -------------------------------------
  // Job Line ID from the Siebel file
  String mExportItemId = null;

  /**
   * @return String of the Job Line ID (from Siebel)
   */
  public String getExportItemId() {
    return mExportItemId;
  }

  /**
   * @param pExportItemId
   *          String of the Job Line ID (from Siebel)
   */
  public void setExportItemId(String pExportItemId) {
    mExportItemId = pExportItemId;
  }

  // -------------------------------------
  // Phase
  String mPhase = null;

  /**
   * @return String of the Error Type code.
   */
  public String getPhase() {
    return mErrorType;
  }

  /**
   * @param pErrorType
   *          String of the Error Type code to set.
   */
  public void setPhase(String pPhase) {
    mPhase = pPhase;
  }

  // -------------------------------------
  // Error Type
  String mErrorType = null;

  /**
   * @return String of the Error Type code.
   */
  public String getErrorType() {
    return mErrorType;
  }

  /**
   * @param pErrorType
   *          String of the Error Type code to set.
   */
  public void setErrorType(String pErrorType) {
    mErrorType = pErrorType;
  }

  // -------------------------------------
  // Error Message
  String mErrorMessage = null;

  /**
   * @return String of the human-readable error message
   */
  public String getErrorMessage() {
    return mErrorMessage;
  }

  /**
   * @param pErrorMessage
   *          String of the human-readable erorr message.
   */
  public void setErrorMessage(String pErrorMessage) {
    mErrorMessage = pErrorMessage;
  }

  // -------------------------------------
  // Siebel ID of an item
  String mSiebelId = null;

  /**
   * @return String of the Siebel ID of an item involved in the error.
   */
  public String getSiebelId() {
    return mSiebelId;
  }

  /**
   * @param pSiebelId
   *          String of the Siebel ID of an item involved in the error.
   */
  public void setSiebelId(String pSiebelId) {
    mSiebelId = pSiebelId;
  }

  // -------------------------------------
  // Siebel Type of an item
  String mSiebelType = null;

  /**
   * @return String of the Siebel Type of an item involved in the error.
   */
  public String getSiebelType() {
    return mSiebelType;
  }

  /**
   * @param pSiebelType
   *          String of the Siebel Type of an item involved in the error.
   */
  public void setSiebelType(String pSiebelType) {
    mSiebelType = pSiebelType;
  }

  // -------------------------------------
  // Siebel ID of an item
  String mReferenceSiebelId = null;

  /**
   * @return String of the Siebel ID of an item involved in the error.
   */
  public String getReferenceSiebelId() {
    return mReferenceSiebelId;
  }

  /**
   * @param pSiebelId
   *          String of the Siebel ID of an item involved in the error.
   */
  public void setReferenceSiebelId(String pReferenceSiebelId) {
    mReferenceSiebelId = pReferenceSiebelId;
  }

  // -------------------------------------
  // Siebel Type of an item
  String mReferenceSiebelType = null;

  /**
   * @return String of the Siebel Type of an item involved in the error.
   */
  public String getReferenceSiebelType() {
    return mReferenceSiebelType;
  }

  /**
   * @param pSiebelType
   *          String of the Siebel Type of an item involved in the error.
   */
  public void setReferenceSiebelType(String pReferenceSiebelType) {
    mReferenceSiebelType = pReferenceSiebelType;
  }

  /**
   * {@inheritDoc}
   *
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("JobLineError [mExportItemId=");
    builder.append(mExportItemId);
    builder.append(", mPhase=");
    builder.append(mPhase);
    builder.append(", mErrorType=");
    builder.append(mErrorType);
    builder.append(", mErrorMessage=");
    builder.append(mErrorMessage);
    builder.append(", mSiebelId=");
    builder.append(mSiebelId);
    builder.append(", mSiebelType=");
    builder.append(mSiebelType);
    builder.append(", mReferenceSiebelId=");
    builder.append(mReferenceSiebelId);
    builder.append(", mReferenceSiebelType=");
    builder.append(mReferenceSiebelType);
    builder.append("]");
    return builder.toString();
  }
  
  /**
   * {@inheritDoc}
   *
   * @see java.lang.Object#toString()
   */
  public String toStringForWSDL() {
    StringBuilder builder = new StringBuilder();
    builder.append("[mExportItemId=");
    builder.append(mExportItemId);
    builder.append(", mPhase=");
    builder.append(mPhase);
    builder.append(", mErrorType=");
    builder.append(mErrorType);
    builder.append(", mErrorMessage=");
    builder.append(mErrorMessage);
    builder.append(", mSiebelId=");
    builder.append(mSiebelId);
    builder.append(", mSiebelType=");
    builder.append(mSiebelType);
    builder.append(", mReferenceSiebelId=");
    builder.append(mReferenceSiebelId);
    builder.append(", mReferenceSiebelType=");
    builder.append(mReferenceSiebelType);
    builder.append("]");
    return builder.toString();
  }
  
}
