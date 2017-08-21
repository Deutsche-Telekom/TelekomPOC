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

import java.util.HashSet;
import java.util.Set;

/**
 * This class represents a products' relationship to its parent product.
 *
 * @author Patrick Mc Erlean
 * @version $Id: //product/Siebel/version/11.2/src/atg/siebel/catalog/SiebelCatalogRelationship.java#2 $$Change: 1194813 $
 * @updated $DateTime: 2015/09/10 08:26:24 $$Author: saysyed $
 */

public class SiebelCatalogRelationship
{
  //----------------------------------------------------------------------------------
  // Class version string
  //----------------------------------------------------------------------------------

  public static String CLASS_VERSION = "$Id: //product/Siebel/version/11.2/src/atg/siebel/catalog/SiebelCatalogRelationship.java#2 $$Change: 1194813 $";

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
   * Constructs a SiebelCatalogRelationship object.
   */

  public SiebelCatalogRelationship()
  {
    mChildProducts = new HashSet<SiebelCatalogProduct>();
  }

  //----------------------------------------------------------------------------------
  // Properties
  //----------------------------------------------------------------------------------

  //----------------------------------------------------------------------------------
  // property: relationshipId

  private String mRelationshipId = null;

  /**
   * Returns the relationship id
   *
   * @return the relatinship id
   */

  public String getRelationshipId()
  {
    return mRelationshipId;
  }

  /**
   * Sets the relationship id
   *
   * @param pRelationshipId the relationship id to set
   */

  public void setRelationshipId (String pRelationshipId)
  {
    mRelationshipId = pRelationshipId;
  }

  //----------------------------------------------------------------------------------
  // property: parentProduct

  private SiebelCatalogProduct mParentProduct= null;

  /**
   * Returns the parent product 
   *
   * @return the parent product
   */

  public SiebelCatalogProduct getParentProduct()
  {
    return mParentProduct;
  }

  /**
   * Sets the parent product 
   *
   * @param pParentProduct the parent product to set
   */

  public void setParentProduct (SiebelCatalogProduct pParentProduct)
  {
    mParentProduct = pParentProduct;
  }

  //----------------------------------------------------------------------------------
  // property: displayName

  private String mDisplayName = null;

  /**
   * Returns the display name
   *
   * @return the display name
   */

  public String getDisplayName()
  {
    return mDisplayName;
  }

  /**
   * Sets the display name
   *
   * @param pDisplayName the display name to set
   */

  public void setDisplayName (String pDisplayName)
  {
    mDisplayName = pDisplayName;
  }

  //----------------------------------------------------------------------------------
  // property: defaultProductId

  private String mDefaultProductId = null;

  /**
   * Returns the parent product id
   *
   * @return the parent product id
   */

  public String getDefaultProductId()
  {
    return mDefaultProductId;
  }

  /**
   * Sets the parent product id
   *
   * @param pParentProductId the parent product id to set
   */

  public void setDefaultProductId (String pDefaultProductId)
  {
    mDefaultProductId = pDefaultProductId;
  }
  
  //----------------------------------------------------------------------------------
  // property: productLineId 
  // Note - USED ONLY IN PROMOTION RELATIONSHIPS

  private String mProductLineId = null;

  /**
   * Returns the product line id
   *
   * @return the product line id
   */

  public String getProductLineId()
  {
    return mProductLineId;
  }

  /**
   * Sets the product line id
   *
   * @param pProductLineId the product line id
   */

  public void setProductLineId (String pProductLineId)
  {
    mProductLineId = pProductLineId;
  }

  //----------------------------------------------------------------------------------
  // property: className

  private String mClassName = null;

  /**
   * Returns the class name
   *
   * @return the class name
   */

  public String getClassName()
  {
    return mClassName;
  }

  /**
   * Sets the class name
   *
   * @param pClassName the class name to set
   */

  public void setClassName (String pClassName)
  {
    mClassName = pClassName;
  }

  //----------------------------------------------------------------------------------
  // property: minimumCardinality

  private int mMinimumCardinality;

  /**
   * Returns the minimum cardinality
   *
   * @return the minimum cardinality
   */

  public int getMinimumCardinality()
  {
    return mMinimumCardinality;
  }

  /**
   * Sets the minimum cardinality
   *
   * @param pMinimumCardinality the minimum cardinality to set
   */

  public void setMinimumCardinality (int pMinimumCardinality)
  {
    mMinimumCardinality = pMinimumCardinality;
  }

  //----------------------------------------------------------------------------------
  // property: maximumCardinality

  private int mMaximumCardinality;

  /**
   * Returns the maximum cardinality
   *
   * @return the maximum cardinality
   */

  public int getMaximumCardinality()
  {
    return mMaximumCardinality;
  }

  /**
   * Sets the maximum cardinality
   *
   * @param pMaximumCardinality the maximum cardinality to set
   */

  public void setMaximumCardinality (int pMaximumCardinality)
  {
    mMaximumCardinality = pMaximumCardinality;
  }

  //----------------------------------------------------------------------------------
  // property: defaultCardinality

  private int mDefaultCardinality;

  /**
   * Returns the default cardinality
   *
   * @return the default cardinality
   */

  public int getDefaultCardinality()
  {
    return mDefaultCardinality;
  }

  /**
   * Sets the default cardinality
   *
   * @param pDefaultCardinality the default cardinality to set
   */

  public void setDefaultCardinality (int pDefaultCardinality)
  {
    mDefaultCardinality = pDefaultCardinality;
  }
  
  //----------------------------------------------------------------------------------
  // property: childProducts

  private Set<SiebelCatalogProduct> mChildProducts;

  /**
   * Returns the child products
   *
   * @return the child products
   */

  public Set<SiebelCatalogProduct> getChildProducts()
  {
    return mChildProducts;
  }

  /**
   * Sets the child products
   *
   * @param childProducts the child products to set
   */

  public void setChildProducts (Set<SiebelCatalogProduct> childProducts)
  {
    mChildProducts = childProducts;
  }

  //----------------------------------------------------------------------------------
  // property: relationshipType

  private String mRelationshipType;

  /**
   * Returns the relationship type
   *
   * @return the relationship type
   */

  public String getRelationshipType()
  {
    return mRelationshipType;
  }

  /**
   * Sets the relationship type
   *
   * @param pRelationshipType the relationship type to set
   */

  public void setRelationshipType (String pRelationshipType)
  {
	  mRelationshipType = pRelationshipType;
  }

  //----------------------------------------------------------------------------------
  // property: aggDefaultProducts

  private Set<String> mAggDefaultProducts;

  /**
   * Returns the aggregate default products
   *
   * @return the aggregate default products
   */

  public Set<String> getAggDefaultProducts()
  {
    return mAggDefaultProducts;
  }

  /**
   * Sets the aggregate default products
   *
   * @param aggDefaultProducts the aggregate default products to set
   */

  public void setAggDefaultProducts (Set<String> aggDefaultProducts)
  {
	  mAggDefaultProducts = aggDefaultProducts;
  }

  /**
   * Adds a child product
   *
   * @param pChildProduct the child product to add
   */

  public void addChildProduct (SiebelCatalogProduct pChildProduct)
  {
    mChildProducts.add (pChildProduct);
  }

  /**
   * Returns the number of child products
   *
   * @return number of child products
   */

  public int childProductTotal ()
  {
    int numberOfChildProducts = 0;

    if ((mChildProducts != null) && (mChildProducts.size() > 0))
    {
      numberOfChildProducts = mChildProducts.size();
    }

    return numberOfChildProducts;
  }

  
  
}
