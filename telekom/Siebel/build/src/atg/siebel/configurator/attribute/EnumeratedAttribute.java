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

import java.util.Map;

import atg.core.util.StringUtils;
import atg.siebel.catalog.SiebelCatalogAttribute;



/**
 * Class that encapsulates a Siebel enumerated attribute in a ProductConfigInstance
 * object
 *
 * @author bbrady
 * @version $Id: //product/Siebel/version/11.2/src/atg/siebel/configurator/attribute/EnumeratedAttribute.java#2 $$Change: 1194813 $
 * @updated $DateTime: 2015/09/10 08:26:24 $$Author: saysyed $
 */
public class EnumeratedAttribute extends Attribute {
  //-------------------------------------
  /** Class version string */
  public static final String CLASS_VERSION = "$Id: //product/Siebel/version/11.2/src/atg/siebel/configurator/attribute/EnumeratedAttribute.java#2 $$Change: 1194813 $";

  //-------------------------------------
  // Constants
  //-------------------------------------


  //-------------------------------------
  // Member variables
  //-------------------------------------

  /** A member variable */
  // Map of 'display value' -> 'value' strings
  private final Map<String, String> mDomainValues;


  //-------------------------------------
  // Properties
  //-------------------------------------

  //-------------------------------------
  // property: 


  //-------------------------------------
  // Constructors
  //-------------------------------------

  //-------------------------------------

  /**
   * @param pName
   * @param pValue
   * @param pDomainType
   * @param pDomainValues
   */
  protected EnumeratedAttribute(
      String pName, 
      String pValue, 
      String pDomainType, 
      String pValueType,
      String pPropTypeCD,
      Map<String, String> pDomainValues ) {
    
    super(pName, pValue, pDomainType, pValueType, pPropTypeCD);
    mDomainValues = pDomainValues;
  }


  /**
   * @param pOtherAttribute
   */
  public EnumeratedAttribute(EnumeratedAttribute pOtherAttribute) {
    super(pOtherAttribute);
    mDomainValues = pOtherAttribute.getDomainValueMap();
  }


  /**
   * @param pAttribute
   * @param pDomainValues
   */
  public EnumeratedAttribute(SiebelCatalogAttribute pAttribute,
      Map<String, String> pDomainValues) {
    super(pAttribute);
    mDomainValues = pDomainValues;  
  }


  /**
   * @return
   */
  public String[] getDomainValues() {
    return mDomainValues.keySet().toArray(new String[mDomainValues.size()]);
  }

  /* (non-Javadoc)
   * @see atg.siebel.configurator.attribute.Attribute#setValue(java.lang.String)
   */
  public void setValue(String pDisplayValue) {
    if (mLogger.isLoggingDebug()) {
      mLogger.logDebug(
          "Entered setValue() : pValue = [" + pDisplayValue+"] "+toString());
    }
    if (!isValidAttributeValue(pDisplayValue)) {
      mLogger.logError(
          "Invalid attribute value [pValue = " + pDisplayValue+"] "+toString());
      return;
    }
    mValue = mDomainValues.get(pDisplayValue);
    if (mLogger.isLoggingDebug()) {
      mLogger.logDebug(
          "setValue() successful : "+toString());
    }
  }


  /* (non-Javadoc)
   * @see atg.siebel.configurator.attribute.Attribute#isValidAttributeValue(java.lang.String)
   */
  public boolean isValidAttributeValue(String pValue) {
    if (mLogger.isLoggingDebug()) {
      mLogger.logDebug("Entered isValidAttributeValue() : [pValue = " + pValue
          + "] - " + toString());
    }
    boolean isValid = false;
    
    if (super.isValidAttributeValue(pValue)) {
      if (StringUtils.isEmpty(pValue)) {
        isValid = true;
      } else {
        if (mDomainValues != null || !mDomainValues.isEmpty()) {
          if (mDomainValues.keySet().contains(pValue)) {
            isValid = true;
          }
        }
      }
    }
    if (mLogger.isLoggingDebug()) {
      mLogger.logDebug("Leaving isValidAttributeValue() : [isValid = " + isValid
          + "] - " + toString());
    }
    return isValid;
  }
  
  
  /**
   * @return
   */
  Map<String, String> getDomainValueMap() {
    return mDomainValues;
  }

  

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = super.hashCode();
    result = prime * result
        + ((mDomainValues == null) ? 0 : mDomainValues.hashCode());
    return result;
  }


  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (!super.equals(obj))
      return false;
    if (getClass() != obj.getClass())
      return false;
    EnumeratedAttribute other = (EnumeratedAttribute) obj;
    if (mDomainValues == null) {
      if (other.mDomainValues != null)
        return false;
    } else if (!mDomainValues.equals(other.mDomainValues))
      return false;
    return true;
  }


  @Override
  public String toString() {
    return "EnumeratedAttribute [mDomainValues=" + mDomainValues
        + ", toString()=" + super.toString() + "]";
  }  
  
}
