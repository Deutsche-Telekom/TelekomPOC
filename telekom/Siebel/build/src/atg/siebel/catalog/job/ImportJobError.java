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

import atg.siebel.catalog.job.ImportJobEnums.ErrorType;

/**
 * Import Error 
 *
 * @author bbrady
 * @version $Id: //product/Siebel/version/11.2/src/atg/siebel/catalog/job/ImportJobError.java#2 $$Change: 1194813 $
 * @updated $DateTime: 2015/09/10 08:26:24 $$Author: saysyed $
 */

public class ImportJobError {

  //-------------------------------------
  /** Class version string */

  public static String CLASS_VERSION = "$Id: //product/Siebel/version/11.2/src/atg/siebel/catalog/job/ImportJobError.java#2 $$Change: 1194813 $";

  

  //-------------------------------------
  // Properties
  //-------------------------------------
    
  //-------------------------------------
  // exportItemId
  private String mExportItemId;  
  public String getExportItemId() {
    return mExportItemId;
  }
  public void setExportItemId(String pExportItemId) {
    mExportItemId = pExportItemId;
  }

  
  //-------------------------------------
  // type
  private ErrorType mType;
  public ErrorType getType() {
    return mType;
  }
  public void setType(ErrorType pType) {
    mType = pType;
  }

  //-------------------------------------
  // message
  private String mMessage;
  public String getMessage() {
    return mMessage;
  }
  public void setMessage(String pMessage) {
    mMessage = pMessage;
  }

  //-------------------------------------
  // sourceItemId
  private String mSourceItemId;  
  public String getSourceItemId() {
    return mSourceItemId;
  }
  public void setSourceItemId(String pSourceItemId) {
    mSourceItemId = pSourceItemId;
  }

  //-------------------------------------
  // sourceItemType
  private String mSourceItemType;  
  public String getSourceItemType() {
    return mSourceItemType;
  }
  public void setSourceItemType(String pSourceItemType) {
    mSourceItemType = pSourceItemType;
  }

  //-------------------------------------
  // sourceReferenceItemId
  private String mSourceReferenceItemId;  
  public String getSourceReferenceItemId() {
    return mSourceReferenceItemId;
  }
  public void setSourceReferenceItemId(String pSourceReferenceItemId) {
    mSourceReferenceItemId = pSourceReferenceItemId;
  }

  //-------------------------------------
  // sourceReferenceItemType
  private String mSourceReferenceItemType;
  public String getSourceReferenceItemType() {
    return mSourceReferenceItemType;
  }
  public void setSourceReferenceItemType(String pSourceReferenceItemType) {
    mSourceReferenceItemType = pSourceReferenceItemType;
  }
  
  
  /**
   * @param pJobErrorBuilder
   */
  public ImportJobError(JobErrorBuilder pJobErrorBuilder) {
    mType = pJobErrorBuilder.getErrorType();
    mMessage = pJobErrorBuilder.getErrorMessage();
    mExportItemId = pJobErrorBuilder.getExportItemId();
    mSourceItemId = pJobErrorBuilder.getItemId();
    mSourceItemType = pJobErrorBuilder.getItemType();
    mSourceReferenceItemId = pJobErrorBuilder.getReferenceItemId();
    mSourceReferenceItemType = pJobErrorBuilder.getReferenceItemType();
  }
  
  
  @Override
  public String toString() {
	  return "ImportJobError [mExportItemId=" + mExportItemId + ", mType=" + mType
	      + ", mMessage=" + mMessage + ", mSourceItemId=" + mSourceItemId
	      + ", mSourceItemType=" + mSourceItemType + ", mSourceReferenceItemId="
	      + mSourceReferenceItemId + ", mSourceReferenceItemType="
	      + mSourceReferenceItemType + "]";
  }
  
  
  /**
   * Utility builder class to help with creating ImportJobError objects
   * @author bbrady
   */
  public static class JobErrorBuilder {
    // Required parameters
    private final ErrorType mErrorType;
    public ErrorType getErrorType() {
      return mErrorType;
    }
    
    private final String mErrorMessage;
    public String getErrorMessage() {
      return mErrorMessage;
    }


    // Optional properties
    private String mExportItemId = null;
    public String getExportItemId() {
      return mExportItemId;
    }
    public JobErrorBuilder setExportItemId(String pExportItemId) {
      mExportItemId = pExportItemId;
      return this;
    }

    private String mItemId = null;
    public String getItemId() {
      return mItemId;
    }
    public JobErrorBuilder setItemId(String pItemId) {
      mItemId = pItemId;
      return this;
    }

    private String mItemType = null;
    public String getItemType() {
      return mItemType;
    }
    public JobErrorBuilder setItemType(String pItemType) {
      mItemType = pItemType;
      return this;
    }

    private String mReferenceItemId = null;
    public String getReferenceItemId() {
      return mReferenceItemId;
    }
    public JobErrorBuilder setReferenceItemId(String pItemId) {
      mReferenceItemId = pItemId;
      return this;
    }

    private String mReferenceItemType = null;
    public String getReferenceItemType() {
      return mReferenceItemType;
    }
    public JobErrorBuilder setReferenceItemType(String pItemType) {
      mReferenceItemType = pItemType;
      return this;
    }
      

    public JobErrorBuilder(ErrorType pErrorType, String pErrorMessage) {
      mErrorType = pErrorType;
      mErrorMessage = pErrorMessage;
    }

    public ImportJobError build() {
      return new ImportJobError(this);
    }

  }
  

}
