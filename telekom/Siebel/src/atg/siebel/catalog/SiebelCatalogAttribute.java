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

import java.util.ArrayList;
import java.util.List;

/**
 * This class represents a Siebel catalog attribute.
 *
 * @author Patrick Mc Erlean
 * @version $Id: //product/Siebel/version/11.2/src/atg/siebel/catalog/SiebelCatalogAttribute.java#2 $$Change: 1194813 $
 * @updated $DateTime: 2015/09/10 08:26:24 $$Author: saysyed $
 */

public class SiebelCatalogAttribute
{
  //----------------------------------------------------------------------------------
  // Class version string
  //----------------------------------------------------------------------------------

  public static String CLASS_VERSION = "$Id: //product/Siebel/version/11.2/src/atg/siebel/catalog/SiebelCatalogAttribute.java#2 $$Change: 1194813 $";

  //----------------------------------------------------------------------------------
  // Constants
  //----------------------------------------------------------------------------------

  //----------------------------------------------------------------------------------
  // Member Variables
  //----------------------------------------------------------------------------------

  //----------------------------------------------------------------------------------
  // Constructor
  //----------------------------------------------------------------------------------

  /**
   * Constructs a SiebelAttribute object.
   */

  public SiebelCatalogAttribute()
  {
    mAttributeValues = new ArrayList<String>();
  }

  //----------------------------------------------------------------------------------
  // Properties
  //----------------------------------------------------------------------------------

  //----------------------------------------------------------------------------------
  // property: name

  private String mName = null;

  /**
   * Returns the attribute name
   *
   * @return the attribute name
   */

  public String getName()
  {
    return mName;
  }

  /**
   * Sets the attribute name
   *
   * @param pName the attribute name to set
   */

  public void setName (String pName)
  {
    mName = pName;
  }

  //----------------------------------------------------------------------------------
  // property: defaultValue

  private String mDefaultValue = null;

  /**
   * Returns the default value
   *
   * @return the default value
   */

  public String getDefaultValue()
  {
    return mDefaultValue;
  }

  /**
   * Sets the default value
   *
   * @param pDefaultValue the default value to set
   */

  public void setDefaultValue (String pDefaultValue)
  {
    mDefaultValue = pDefaultValue;
  }

  //----------------------------------------------------------------------------------
  // property: attributeDefinitionId

  private String mAttributeDefinitionId = null;

  /**
   * Returns the attributeDefinitionId
   *
   * @return the attribute definition id
   */

  public String getAttributeDefinitionId()
  {
    return mAttributeDefinitionId;
  }

  /**
   * Sets the attributeDefinitionId
   *
   * @param pAttributeDefinitionId the attribute definition id to set
   */

  public void setAttributeDefinitionId (String pAttributeDefinitionId)
  {
    mAttributeDefinitionId = pAttributeDefinitionId;
  }

  //----------------------------------------------------------------------------------
  // property: ATGId

  private String mATGId = null;

  /**
   * Returns the attributeDefinitionId
   *
   * @return the attribute definition id
   */

  public String getATGId()
  {
    return mATGId;
  }

  /**
   * Sets the attributeDefinitionId
   *
   * @param pAttributeDefinitionId the attribute definition id to set
   */

  public void setATGId (String pATGId)
  {
    mATGId = pATGId;
  }

  //----------------------------------------------------------------------------------
  // property: origId

  private String mOrigId = null;

  /**
   * Returns the orig Id
   *
   * @return the orig id
   */

  public String getOrigId()
  {
    return mOrigId;
  }

  /**
   * Sets the orig id
   *
   * @param pOrigId the orig id to set
   */

  public void setOrigId (String pOrigId)
  {
    mOrigId = pOrigId;
  }

 //----------------------------------------------------------------------------------
  // property: attributeName

  private String mAttributeName = null;

  /**
   * Returns the attributeName
   *
   * @return the attribute name
   */

  public String getAttributeName()
  {
    return mAttributeName;
  }

  /**
   * Sets the attributeName
   *
   * @param pAttributeName the attribute name to set
   */

  public void setAttributeName (String pAttributeName)
  {
    mAttributeName = pAttributeName;
  }

  //----------------------------------------------------------------------------------
  // property: requiredFlag

  private boolean mRequiredFlag = false;

  /**
   * Returns the required flag
   *
   * @return the required flag
   */

  public boolean getRequiredFlag()
  {
    return mRequiredFlag;
  }

  /**
   * Sets the required flag
   *
   * @param pRequiredFlag the required flag to set
   */

  public void setRequiredFlag (boolean pRequiredFlag)
  {
    mRequiredFlag = pRequiredFlag;
  }
  
  
  //----------------------------------------------------------------------------------
  // property: attributeValues

  private List<String> mAttributeValues;

  /**
   * Returns the attribute values
   *
   * @return the attribute values
   */

  public List<String> getAttributeValues()
  {
    return mAttributeValues;
  }

  /**
   * Sets the attribute values
   *
   * @param pAttributeValues the attribute values to set
   */

  public void setAttributeValues (List<String> pAttributeValues)
  {
    mAttributeValues = pAttributeValues;
  }

  /**
   * 
   * @return
   */
  public  int numberOfAttributeValues()
  {
    int numberOfAttributeValues = 0;
    
    if (mAttributeValues != null && mAttributeValues.size() > 0)
    {
      numberOfAttributeValues = mAttributeValues.size();
    }
  
    return numberOfAttributeValues;
  }
  
  //----------------------------------------------------------------------------------
  // property: domainType

  private String mDomainType;

  /**
   * Returns the domainType
   *
   * @return the domainType
   */

  public String getDomainType()
  {
    return mDomainType;
  }

  /**
   * Sets the domainType
   *
   * @param pDomainType the domainType to set
   */

  public void setDomainType (String pDomainType)
  {
    mDomainType = pDomainType;
  }
  
  //----------------------------------------------------------------------------------
  // property: valueType

  private String mValueType;

  /**
   * Returns the valueType
   *
   * @return the valueType
   */

  public String getValueType()
  {
    return mValueType;
  }

  /**
   * Sets the valueType
   *
   * @param pValueType the valueType to set
   */

  public void setValueType (String pValueType)
  {
    mValueType = pValueType;
  }
  
  //----------------------------------------------------------------------------------
  // property: readonlyFlag

  private boolean mReadonlyFlag = false;

  /**
   * Returns the readonly flag
   *
   * @return the readonly flag
   */

  public boolean getReadonlyFlag()
  {
    return mReadonlyFlag;
  }

  /**
   * Sets the readonly flag
   *
   * @param pReadonlyFlag the readonly flag to set
   */

  public void setReadonlyFlag (boolean pReadonlyFlag)
  {
    mReadonlyFlag = pReadonlyFlag;
  }
  
  //----------------------------------------------------------------------------------
  // property: hiddenFlag

  private boolean mHiddenFlag = false;

  /**
   * Returns the hidden flag
   *
   * @return the hidden flag
   */

  public boolean getHiddenFlag()
  {
    return mHiddenFlag;
  }

  /**
   * Sets the hidden flag
   *
   * @param pHiddenFlag the hidden flag to set
   */

  public void setHiddenFlag (boolean pHiddenFlag)
  {
    mHiddenFlag = pHiddenFlag;
  }
  
  //----------------------------------------------------------------------------------
  // property: maximumValue

  private String mMaximumValue;

  /**
   * Returns the maximum value
   *
   * @return the maximumValue
   */

  public String getMaximumValue()
  {
    return mMaximumValue;
  }

  /**
   * Sets the maximum value
   *
   * @param pMaximumValue the maximum value to set
   */

  public void setMaximumValue (String pMaximumValue)
  {
    mMaximumValue = pMaximumValue;
  }
  
  //----------------------------------------------------------------------------------
  // property: minimumValue

  private String mMinimumValue;

  /**
   * Returns the minimum value
   *
   * @return the minimumValue
   */

  public String getMinimumValue()
  {
    return mMinimumValue;
  }

  /**
   * Sets the minimum value
   *
   * @param pMinimumValue the minimum value to set
   */

  public void setMinimumValue (String pMinimumValue)
  {
    mMinimumValue = pMinimumValue;
  }
  
}