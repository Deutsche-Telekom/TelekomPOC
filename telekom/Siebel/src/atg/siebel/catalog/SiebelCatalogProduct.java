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

import atg.repository.RepositoryItem;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * This class represents a Siebel catalog product. It contains the main properties used in the
 * order capture process and it also points to any child products that may exist. If the
 * product is a child product then it points to its parent and specifies the cardinalities for
 * the parent relationship.
 *
 * @author Patrick Mc Erlean
 * @version $Id: //product/Siebel/version/11.2/src/atg/siebel/catalog/SiebelCatalogProduct.java#2 $$Change: 1194813 $
 * @updated $DateTime: 2015/09/10 08:26:24 $$Author: saysyed $
 */

public class SiebelCatalogProduct
{
  //----------------------------------------------------------------------------------
  // Class version string
  //----------------------------------------------------------------------------------

  public static String CLASS_VERSION = "$Id: //product/Siebel/version/11.2/src/atg/siebel/catalog/SiebelCatalogProduct.java#2 $$Change: 1194813 $";

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
   * Constructs a SiebelCatalogProduct object.
   */

  public SiebelCatalogProduct()
  {
    mAttributes = new ArrayList<SiebelCatalogAttribute>();
    mChildRelationships = new HashSet<SiebelCatalogRelationship>();
  }

  //----------------------------------------------------------------------------------
  // Properties
  //----------------------------------------------------------------------------------

  //----------------------------------------------------------------------------------
  // property: productRepositoryItem

  private RepositoryItem mProductRepositoryItem = null;

  /**
   * Returns the product repository item
   *
   * @return the product repository item
   */

  public RepositoryItem getProductRepositoryItem()
  {
    return mProductRepositoryItem;
  }

  /**
   * Sets the product repository item
   *
   * @param pProductRepositoryItem the repository item to set
   */

  public void setProductRepositoryItem (RepositoryItem pProductRepositoryItem)
  {
    mProductRepositoryItem = pProductRepositoryItem;
  }

  //----------------------------------------------------------------------------------
  // property: id

  private String mId = null;

  /**
   * Returns the id
   *
   * @return the id
   */

  public String getId()
  {
    return mId;
  }

  /**
   * Sets the id
   *
   * @param pId the id to set
   */

  public void setId (String pId)
  {
    mId = pId;
  }

  //----------------------------------------------------------------------------------
  // property: inclusiveEligibilityFlag

  private boolean mInclusiveEligibilityFlag = false;

  /**
   * Returns the inclusive eligibility flag
   *
   * @return the inclusive eligibility flag
   */

  public boolean getInclusiveEligibilityFlag()
  {
    return mInclusiveEligibilityFlag;
  }

  /**
   * Sets the inclusive eligibility flag
   *
   * @param pInclusiveEligibilityFlag the inclusive eligibility flag to set
   */

  public void setInclusiveEligibilityFlag (boolean pInclusiveEligibilityFlag)
  {
    mInclusiveEligibilityFlag = pInclusiveEligibilityFlag;
  }

  //----------------------------------------------------------------------------------
  // property: effectiveFrom

  private Timestamp mEffectiveFrom;

  /**
   * Returns the effective from date
   *
   * @return the effective from date
   */

  public Timestamp getEffectiveFrom()
  {
    return mEffectiveFrom;
  }

  /**
   * Sets the effective from date
   *
   * @param pEffectiveFrom the effective from date to set
   */

  public void setEffectiveFrom (Timestamp pEffectiveFrom)
  {
    mEffectiveFrom = pEffectiveFrom;
  }

  //----------------------------------------------------------------------------------
  // property: effectiveTo

  private Timestamp mEffectiveTo;

  /**
   * Returns the effective to date
   *
   * @return the effective to date
   */

  public Timestamp getEffectiveTo()
  {
    return mEffectiveTo;
  }

  /**
   * Sets the effective to date
   *
   * @param pEffectiveTo the effective to date to set
   */

  public void setEffectiveTo (Timestamp pEffectiveTo)
  {
    mEffectiveTo = pEffectiveTo;
  }

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
  // property: priceListId

  private String mPriceListId = null;

  /**
   * Returns the price list id
   *
   * @return the price list id
   */

  public String getPriceListId()
  {
    return mPriceListId;
  }

  /**
   * Sets the price list id
   *
   * @param pPriceListId the price list id to set
   */

  public void setPriceListId (String pPriceListId)
  {
    mPriceListId = pPriceListId;
  }

  //----------------------------------------------------------------------------------
  // property: productDefTypeCode

  private String mProductDefTypeCode = null;

  /**
   * Returns the product def type code
   *
   * @return the product def type code
   */

  public String getProductDefTypeCode()
  {
    return mProductDefTypeCode;
  }

  /**
   * Sets the product def type code
   *
   * @param pProductDefTypeCode the product def type code to set
   */

  public void setProductDefTypeCode (String pProductDefTypeCode)
  {
    mProductDefTypeCode = pProductDefTypeCode;
  }

  //----------------------------------------------------------------------------------
  // property: productTypeCode

  private String mProductTypeCode = null;

  /**
   * Returns the product type code
   *
   * @return the product type code
   */

  public String getProductTypeCode()
  {
    return mProductTypeCode;
  }

  /**
   * Sets the product type code
   *
   * @param pProductTypeCode the product type code to set
   */

  public void setProductTypeCode (String pProductTypeCode)
  {
    mProductTypeCode = pProductTypeCode;
  }

  //----------------------------------------------------------------------------------
  // property: productType

  private String mProductType = null;

  /**
   * Returns the product type
   *
   * @return the product type
   */

  public String getProductType()
  {
    return mProductType;
  }

  /**
   * Sets the product type
   *
   * @param pProductType the product type to set
   */

  public void setProductType (String pProductType)
  {
    mProductType = pProductType;
  }

  //----------------------------------------------------------------------------------
  // property: priceType

  private String mPriceType = null;

  /**
   * Returns the price type
   *
   * @return the price type
   */

  public String getPriceType()
  {
    return mPriceType;
  }

  /**
   * Sets the price type
   *
   * @param pPriceType the price type to set
   */

  public void setPriceType (String pPriceType)
  {
    mPriceType = pPriceType;
  }

  //----------------------------------------------------------------------------------
  // property: attributes

  private List<SiebelCatalogAttribute> mAttributes;

  /**
   * Returns the attributes
   *
   * @return the attributes
   */

  public List<SiebelCatalogAttribute> getAttributes()
  {
    return mAttributes;
  }

  /**
   * Sets the attributes
   *
   * @param pAttributes the attributes to set
   */

  public void setAttributes (List<SiebelCatalogAttribute> pAttributes)
  {
    mAttributes = pAttributes;
  }

  /**
   * Adds an attribute
   *
   * @param pAttribute the attribute to add
   */

  public void addAttribute (SiebelCatalogAttribute pAttribute)
  {
    mAttributes.add (pAttribute);
  }

  /**
   * Returns the number of Attributes
   * 
   * @return the number of Attributes
   */
  public int numberOfAttributes()
  {
    int numberOfAttributes = 0;
    
    if (mAttributes != null && mAttributes.size() > 0)
    {
      numberOfAttributes = mAttributes.size();
    }
    return numberOfAttributes;
  }
  
  //----------------------------------------------------------------------------------
  // property: parentRelationship (only used for child products)

  private SiebelCatalogRelationship mParentRelationship = null;

  /**
   * Returns the relationship to the parent product
   *
   * @return the relationship to the parent product
   */

  public SiebelCatalogRelationship getParentRelationship()
  {
    return mParentRelationship;
  }

  /**
   * Sets the relationship to the parent product
   *
   * @param pParentRelationship the parent product relationship to set
   */

  public void setParentRelationship (SiebelCatalogRelationship pParentRelationship)
  {
      mParentRelationship = pParentRelationship;
  }

  //----------------------------------------------------------------------------------
  // property: relationships

  private Set<SiebelCatalogRelationship> mChildRelationships;

  /**
   * Returns the relationships to the child products
   *
   * @return the relationships to the child products
   */

  public Set<SiebelCatalogRelationship> getChildRelationships()
  {
    return mChildRelationships;
  }

  /**
   * Sets the relationships to the child products
   *
   * @param pRelationships the list of relationships to child products
   */

  public void setChildRelationships (Set<SiebelCatalogRelationship> pChildRelationships)
  {
    mChildRelationships = pChildRelationships;
  }
  
  /**
   * 
   * @param pChildRelationship
   */
  public void addRelationship(SiebelCatalogRelationship pChildRelationship)
  {
    mChildRelationships.add(pChildRelationship);
  }
  

  /**
   * Returns the number of child relationships
   *
   * @return number of child relationships
   */
  public int numberOfChildRelationships()
  {
    int numberOfChildRelationships = 0;

    if ((mChildRelationships != null) && (mChildRelationships.size() > 0))
    {
      numberOfChildRelationships = mChildRelationships.size();
    }

    return numberOfChildRelationships;
    
  }
  
  
}
