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

package atg.siebel.order;

import atg.repository.MutableRepositoryItem;
import atg.siebel.order.SiebelPropertyNameConstants;
import atg.commerce.order.CommerceIdentifierImpl;
import atg.commerce.order.ChangedProperties;

import java.text.MessageFormat;
import java.util.HashSet;
import java.util.Observable;
import java.util.Set;

/**
 * This class represents a Siebel attribute. Siebel attributes are configurable elements of a product.
 *
 * @author Patrick Mc Erlean
 * @version $Id: //product/Siebel/version/11.2/src/atg/siebel/order/SiebelAttribute.java#2 $$Change: 1194813 $
 * @updated $DateTime: 2015/09/10 08:26:24 $$Author: saysyed $
 */

public class SiebelAttribute extends CommerceIdentifierImpl implements ChangedProperties
{
  //----------------------------------------------------------------------------------
  // Class version string
  //----------------------------------------------------------------------------------

  public static String CLASS_VERSION = "$Id: //product/Siebel/version/11.2/src/atg/siebel/order/SiebelAttribute.java#2 $$Change: 1194813 $";

  //----------------------------------------------------------------------------------
  // Constants
  //----------------------------------------------------------------------------------

  public static final String M_ACTION_CODE_NO_ACTION = "NoAction";
  public static final String M_ACTION_CODE_ADD = "Add";
  public static final String M_ACTION_CODE_UPDATE = "Update";
  public static final String M_ACTION_CODE_DELETE = "Delete";

  //----------------------------------------------------------------------------------
  // Member Variables
  //----------------------------------------------------------------------------------

  //----------------------------------------------------------------------------------
  // Constructor
  //----------------------------------------------------------------------------------

  /**
   * Constructs a SiebelAttribute object.
   */

  public SiebelAttribute()
  {
  }

  //----------------------------------------------------------------------------------
  // Properties
  //----------------------------------------------------------------------------------

  //----------------------------------------------------------------------------------
  // property: attributeDefinitionId

  /**
   * Returns the attributeDefinitionId
   *
   * @return the attribute definition id
   */

  public String getAttributeDefinitionId()
  {
    return (String) getPropertyValue (SiebelPropertyNameConstants.ATTRIBUTE_DEFINITION_ID);
  }

  /**
   * Sets the attributeDefinitionId
   */
  public void setAttributeDefinitionId (String pAttributeDefinitionId)
  {
    setPropertyValue (SiebelPropertyNameConstants.ATTRIBUTE_DEFINITION_ID, pAttributeDefinitionId);
  }

  //----------------------------------------------------------------------------------
  // property: attributeName

  /**
   * Returns the attributeName
   *
   * @return the attribute name
   */

  public String getAttributeName()
  {
    return (String) getPropertyValue (SiebelPropertyNameConstants.ATTRIBUTE_NAME);
  }

  /**
   * Sets the attributeName
   */
  public void setAttributeName (String pAttributeName)
  {
    setPropertyValue (SiebelPropertyNameConstants.ATTRIBUTE_NAME, pAttributeName);
  }

  //----------------------------------------------------------------------------------
  // property: actionCode

  /**
   * Returns the actionCode
   */

  public String getActionCode()
  {
    return (String) getPropertyValue (SiebelPropertyNameConstants.ACTION_CODE);
  }

  /**
   * Sets the actionCode
   */
  public void setActionCode (String pActionCode)
  {
    setPropertyValue (SiebelPropertyNameConstants.ACTION_CODE, pActionCode);
  }
  
	// ----------------------------------------------------------------------------------
	// property: PropTypeCD

	private String mPropTypeCD = null;

	/**
	 * Sets property cfgStateCode
	 **/
	public void setPropTypeCD(String pPropTypeCD) {
		mPropTypeCD = pPropTypeCD;
		setPropertyValue(SiebelPropertyNameConstants.PROP_TYPE_CD, pPropTypeCD);
	}

	/**
	 * Returns property cfgStateCode
	 **/
	public String getPropTypeCD() {
		return mPropTypeCD;
	}

	// ----------------------------------------------------------------------------------
	// property: cfgStateCode

  private String mCfgStateCode = null;

  /**
   * Sets property cfgStateCode
   **/

  public void setCfgStateCode(String pCfgStateCode) {
    mCfgStateCode = pCfgStateCode;
    setPropertyValue(SiebelPropertyNameConstants.CFG_STATE_CODE, pCfgStateCode);
  }

  /**
   * Returns property cfgStateCode
   **/

  public String getCfgStateCode() {
    return (String) getPropertyValue(SiebelPropertyNameConstants.CFG_STATE_CODE);
  }

  //----------------------------------------------------------------------------------
  // property: value

  /**
   * Returns the value (of the attribute)
   */

  public String getValue()
  {
    return (String) getPropertyValue (SiebelPropertyNameConstants.VALUE);
  }

  /**
   * Sets the value
   *
   * @param pValue the value to set
   */
  public void setValue (String pValue)
  {
    setPropertyValue (SiebelPropertyNameConstants.VALUE, pValue);
  }

  //----------------------------------------------------------------------------------
  // property: repositoryItem

  private MutableRepositoryItem mRepositoryItem = null;

  /**
   * Returns the repositoryItem
   */

  public MutableRepositoryItem getRepositoryItem()
  {
    return mRepositoryItem;
  }

  /**
   * Sets the repositoryItem
   */

  public void setRepositoryItem(MutableRepositoryItem pRepositoryItem)
  {
    mRepositoryItem = pRepositoryItem;
  }

  //----------------------------------------------------------------------------------
  // ChangedProperties implementation
  //----------------------------------------------------------------------------------

  /**
   * update
   *
   * This method is called whenever a property in a contained object changes
   * and the containing object needs to be notified.
   *
   * @param pChangedObject the object which changed.
   * @param pPropertyName the name of the property which changed.
   */

  public void update (Observable pChangedObject, Object pPropertyName)
  {
    if (pPropertyName instanceof String)
    {
      addChangedProperty ((String) pPropertyName);
    }
    else
    {
      throw new RuntimeException("Observable update for " + getClass().getName() +
            " was received with arg type " + pPropertyName.getClass().getName() + ":" + pPropertyName);
    }
  }

  //----------------------------------------------------------------------------------
  // property: saveAllProperties

  private boolean mSaveAllProperties = false;

  /**
   * Returns the saveAllProperties
   */

  public boolean getSaveAllProperties()
  {
    return mSaveAllProperties;
  }

  /**
   * Sets the saveAllProperties
   *
   * @param pSaveAllProperties indicates whether or not all properties must be saved.
   */

  public void setSaveAllProperties(boolean pSaveAllProperties)
  {
    mSaveAllProperties = pSaveAllProperties;
  }

  //----------------------------------------------------------------------------------
  // property: changed

  private boolean mChanged = false;

  /**
   * Returns the isChanged flag
   */

  public boolean isChanged()
  {
    return (mChanged || (mChangedProperties != null && ! getChangedProperties().isEmpty()));
  }

  /**
   * Marks this object as changed
   *
   * @param pChanged indicates whether or not the object has changed.
   */

  public void setChanged (boolean pChanged)
  {
    mChanged = pChanged;
  }

  //----------------------------------------------------------------------------------
  // property: changedProperties

  private HashSet mChangedProperties = null;

  /**
   * Returns the changedProperties
   */

  public Set getChangedProperties()
  {
    if (mChangedProperties == null)
    {
      mChangedProperties = new HashSet(7);
    }

    return mChangedProperties;
  }

  /**
   * Adds a changedProperty
   *
   * @param pPropertyName the name of the property which changed.
   */

  public void addChangedProperty(String pPropertyName)
  {
    getChangedProperties().add (pPropertyName);
  }

  /**
   * Clears the changedProperties List
   */

  public void clearChangedProperties()
  {
    if (mChangedProperties == null)
    {
      return;
    }

    mChangedProperties.clear();
  }
  
  

  /**
   * getPropertyValue
   *
   * Returns the value of the specified property from the repository item.
   *
   * @param pPropertyName the name of the property whose value is to be returned.
   */

  public Object getPropertyValue (String pPropertyName)
  {
    MutableRepositoryItem mutableRepositoryItem = getRepositoryItem();

    if (mutableRepositoryItem == null)
    {
      throw new RuntimeException (MessageFormat.format(
          SiebelConstants.REPOSITORY_ITEM_IN_ATTRIBUTE_NULL, new Object[] {getId()}));
    }

    return mutableRepositoryItem.getPropertyValue (pPropertyName);
  }

  /**
   * setPropertyValue
   *
   * Sets the value of the specified property in the repository item.
   *
   * @param pPropertyName the name of the property whose value is to be set.
   * @param pPropertyValue the value to be set.
   */

  public void setPropertyValue (String pPropertyName, Object pPropertyValue)
  {
    MutableRepositoryItem mutableRepositoryItem = getRepositoryItem();

    if (mutableRepositoryItem == null)
    {
      throw new RuntimeException (MessageFormat.format(
          SiebelConstants.REPOSITORY_ITEM_IN_ATTRIBUTE_NULL, new Object[] {getId()}));
    }

    mutableRepositoryItem.setPropertyValue (pPropertyName, pPropertyValue);

    setChanged (true);
  }
}
