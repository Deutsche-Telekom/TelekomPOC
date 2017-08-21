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

package atg.siebel.configurator.attribute;

import atg.core.util.StringUtils;
import atg.nucleus.logging.ApplicationLogging;
import atg.nucleus.logging.ClassLoggingFactory;
import atg.siebel.catalog.SiebelCatalogAttribute;



/**
 * Class that encapsulates a Siebel attribute in a ProductConfigInstance
 * object
 *
 * @author bbrady
 * @version $Id: //product/Siebel/version/11.2/src/atg/siebel/configurator/attribute/Attribute.java#2 $$Change: 1194813 $
 * @updated $DateTime: 2015/09/10 08:26:24 $$Author: saysyed $
 */
public class Attribute {
  
  /** Class version string */
  public static final String CLASS_VERSION = "$Id: //product/Siebel/version/11.2/src/atg/siebel/configurator/attribute/Attribute.java#2 $$Change: 1194813 $";
  /** Logger */
  protected static ApplicationLogging mLogger = ClassLoggingFactory
      .getFactory().getLoggerForClass(Attribute.class);
  
  //-------------------------------------
  // Constants
  //-------------------------------------


  //-------------------------------------
  // Member variables
  //-------------------------------------
  final private String mName;
  final private String mDomainType;
  final private String mValueType;
  final private String mPropTypeCD;
  
  //-------------------------------------
  // Properties
  //-------------------------------------
  protected String mError=null;
  
  public String getError()
  {
    return mError;
  }
  public void setError(String pError)
  {
    mError = pError;
  }

  //-------------------------------------
  // property: id - this is the attributeDefinitionId
  private String mId;
  public String getId() {
    return mId;
  }  
  public void setId(String pId) {
    mId = pId;
  }

  // property: value
  String mValue = "";  
  public String getValue() {
    return mValue;
  }
  public void setValue(String pValue) {
    if (mLogger.isLoggingDebug()) {
      mLogger.logDebug(
          "Entered setValue() : pValue = [" + pValue+"] "+toString());
    }
    if (!isValidAttributeValue(pValue)) {
      mLogger.logError(
          "Invalid attribute value [pValue = " + pValue+"] "+toString());
      return;
    }
    mValue = (pValue != null) ? pValue : "";
    if (mLogger.isLoggingDebug()) {
      mLogger.logDebug(
          "setValue() successful : "+toString());
    }
  }
  
  // property: required
  boolean mRequired;  
  public boolean getRequired() {
    return mRequired;
  }
  public void setRequired(boolean pRequired) {
    mRequired = pRequired;
  }
  
  // property: hidden
  boolean mHidden;  
  public boolean getHidden() {
    return mHidden;
  }
  public void setHidden(boolean pHidden) {
    mHidden = pHidden;
  }
  
  // property: readOnly
  boolean mReadOnly;  
  public boolean getReadOnly() {
    return mReadOnly;
  }
  public void setReadOnly(boolean pReadOnly) {
    mReadOnly = pReadOnly;
  }
  
  //property: valueChecker
  AttributeValueChecker mValueChecker;
  public AttributeValueChecker getValueChecker() {
    return mValueChecker;
  }
  public void setValueChecker(AttributeValueChecker pValueChecker) {
    this.mValueChecker = pValueChecker;
  }
  
  //-------------------------------------
  // Constructors
  //-------------------------------------

  //-------------------------------------  

  /**
   * @param pName
   * @param pValue
   * @param pDomainType
   * @param pValueType
   */
  protected Attribute(
      String pName, String pValue, String pDomainType, String pValueType, String pPropTypeCD) {
    super();
    mName = pName;
    mValue = pValue;
    mDomainType = pDomainType;
    mValueType = pValueType;
    mPropTypeCD = pPropTypeCD;
  }
  

  /**
   * @param pAttribute
   */
  protected Attribute(SiebelCatalogAttribute pAttribute) {
    this(pAttribute.getAttributeName(), 
        pAttribute.getDefaultValue(), 
        pAttribute.getDomainType(), 
        pAttribute.getValueType(),
        pAttribute.getValueType()); //As SiebelCatalogAttribute does not have propTypeCD property, send data type value
    
    setId(pAttribute.getAttributeDefinitionId());
    setHidden(pAttribute.getHiddenFlag());
    setRequired(pAttribute.getRequiredFlag());
    setReadOnly(pAttribute.getReadonlyFlag());    
  }
  
  
  /**
   * Copy constructor
   * 
   * @param pOtherAttribute
   */
  protected Attribute(Attribute pOtherAttribute) {
    this(pOtherAttribute.getName(), 
        pOtherAttribute.getValue(), 
        pOtherAttribute.getDomainType(),
        pOtherAttribute.getValueType(),
        pOtherAttribute.getPropTypeCD());
    
    setId(pOtherAttribute.getId());
    setRequired(pOtherAttribute.getRequired());
    setHidden(pOtherAttribute.getHidden());
    setReadOnly(pOtherAttribute.getReadOnly());
    
    setValueChecker(pOtherAttribute.getValueChecker());
  }
  
  
  //-------------------------------------
  // Methods
  //-------------------------------------

  //-------------------------------------
  public String getName() {
    return mName;
  }

  public String getDomainType() {
    return mDomainType;
  }
  
  public String getValueType() {
    return mValueType;
  }
  
  public String getPropTypeCD() {
		return mPropTypeCD;
	}
  
  /**
   * @param pValue
   * @return
   */
  public boolean isValidAttributeValue(String pValue) {
    if (mLogger.isLoggingDebug()) {
      mLogger.logDebug("Entered isValidAttributeValue() : [pValue = " + pValue
          + "] - " + toString());
    }
    boolean isValid = false;
    if (!mReadOnly) {
      if (StringUtils.isEmpty(pValue)) {
        if (!mRequired) {
          isValid = true;
        }
      } else {
        if (getValueChecker() != null) {
          isValid = getValueChecker().isValidAttributeValue(pValue);
        }
      }
    }
    if (mLogger.isLoggingDebug()) {
      mLogger.logDebug("Leaving isValidAttributeValue() : [isValid = " + isValid
          + "] - " + toString());
    }
    return isValid;
  }
  
  
  public AttributeHolder getHolder() {
    return new AttributeHolder(this);
  }
  
  
  /**
   * @param pValue
   * @return
   */
  protected boolean doValidate(String pValue) {
    if (mLogger.isLoggingDebug()) {
      mLogger.logDebug("Entered doValidate() : [pValue = " + pValue
          + "] - " + toString());
    }
    boolean isValid = false;
    if (!mReadOnly) {
      if (StringUtils.isEmpty(pValue)) {
        if (!mRequired) {
          isValid = true;
        }
      } else {
        isValid = getValueChecker().isValidAttributeValue(pValue);
      }
    }
    if (mLogger.isLoggingDebug()) {
      mLogger.logDebug("Leaving doValidate() : [isValid = " + isValid
          + "] - " + toString());
    }
    return isValid;
  }
    
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + (mHidden ? 1231 : 1237);
    result = prime * result + ((mId == null) ? 0 : mId.hashCode());
    result = prime * result + ((mName == null) ? 0 : mName.hashCode());
    result = prime * result + (mReadOnly ? 1231 : 1237);
    result = prime * result + (mRequired ? 1231 : 1237);
    result = prime * result + ((mDomainType == null) ? 0 : mDomainType.hashCode());
    result = prime * result + ((mValue == null) ? 0 : mValue.hashCode());
    result = prime * result
        + ((mValueType == null) ? 0 : mValueType.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Attribute other = (Attribute) obj;
    if (mHidden != other.mHidden)
      return false;
    if (mId == null) {
      if (other.mId != null)
        return false;
    } else if (!mId.equals(other.mId))
      return false;
    if (mName == null) {
      if (other.mName != null)
        return false;
    } else if (!mName.equals(other.mName))
      return false;
    if (mReadOnly != other.mReadOnly)
      return false;
    if (mRequired != other.mRequired)
      return false;
    if (mDomainType == null) {
      if (other.mDomainType != null)
        return false;
    } else if (!mDomainType.equals(other.mDomainType))
      return false;
    if (mValue == null) {
      if (other.mValue != null)
        return false;
    } else if (!mValue.equals(other.mValue))
      return false;
    if (mValueType == null) {
      if (other.mValueType != null)
        return false;
    } else if (!mValueType.equals(other.mValueType))
      return false;
    return true;
  }
  
  
  @Override
  public String toString() {
    return "Attribute [mName=" + mName + ", mType=" + mDomainType + ", mPropTypeCD=" + mPropTypeCD + ", mId=" + mId
        + ", mValue=" + mValue + ", mRequired=" + mRequired + ", mHidden="
        + mHidden + ", mReadOnly=" + mReadOnly + ", mValueChecker="
        + mValueChecker + "]";
  }
  
}
