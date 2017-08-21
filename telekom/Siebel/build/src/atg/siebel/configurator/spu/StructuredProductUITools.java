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

package atg.siebel.configurator.spu;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.ResourceBundle;

import atg.beans.DynamicBeans;
import atg.beans.PropertyNotFoundException;
import atg.core.i18n.LayeredResourceBundle;
import atg.nucleus.GenericService;
import atg.repository.MutableRepository;
import atg.repository.MutableRepositoryItem;
import atg.repository.Query;
import atg.repository.QueryBuilder;
import atg.repository.RepositoryException;
import atg.repository.RepositoryItem;
import atg.repository.RepositoryView;

/**
 * This class provides the tools for the structured product UI part of the Siebel
 * Configurator integration.
 *
 * @author Patrick Mc Erlean
 * @version $Id: //product/Siebel/version/11.2/src/atg/siebel/configurator/spu/StructuredProductUITools.java#2 $$Change: 1194813 $
 * @updated $DateTime: 2015/09/10 08:26:24 $$Author: saysyed $
 */

public class StructuredProductUITools extends GenericService
{
  //----------------------------------------------------------------------------------
  // Class version string
  //----------------------------------------------------------------------------------

  public static String CLASS_VERSION = "$Id: //product/Siebel/version/11.2/src/atg/siebel/configurator/spu/StructuredProductUITools.java#2 $$Change: 1194813 $";

  //----------------------------------------------------------------------------------
  // Constants
  //----------------------------------------------------------------------------------

  public static final String DEFAULT_PROMOTION_UI_ITEM_DESCRIPTOR_NAME = "promotion-ui";
  public static final String DEFAULT_PRODUCT_UI_ITEM_DESCRIPTOR_NAME = "product-ui";
  public static final String DEFAULT_RELATIONSHIP_UI_ITEM_DESCRIPTOR_NAME = "relationship-ui";
  public static final String DEFAULT_BLOCK_ITEM_DESCRIPTOR_NAME = "block";
  public static final String DEFAULT_ATTRIBUTE_BLOCK_ITEM_DESCRIPTOR_NAME = "attribute-block";
  public static final String DEFAULT_RELATIONSHIP_BLOCK_ITEM_DESCRIPTOR_NAME = "relationship-block";
  public static final String DEFAULT_RENDERER_ITEM_DESCRIPTOR_NAME = "renderer";

  public static final String DEFAULT_ID_PROPERTY_NAME = "id";
  public static final String DEFAULT_PRODUCT_ID_PROPERTY_NAME = "productId";
  public static final String DEFAULT_PROMOTION_ID_PROPERTY_NAME = "promotionId";
  public static final String DEFAULT_RELATIONSHIP_ID_PROPERTY_NAME = "relationshipId";
  public static final String DEFAULT_NAME_PROPERTY_NAME = "name";
  public static final String DEFAULT_PRODUCT_NAME_PROPERTY_NAME = "productName";
  public static final String DEFAULT_PROMOTION_UI_PROPERTY_NAME = "promotionUI";
  public static final String DEFAULT_ROOT_PRODUCT_FLAG_PROPERTY_NAME = "rootProductFlag";
  public static final String DEFAULT_CONTROLLER_PROPERTY_NAME = "controller";
  public static final String DEFAULT_JSP_PATH_PROPERTY_NAME = "jspPath";
  public static final String DEFAULT_APPLICATION_CONTEXT_PROPERTY_NAME = "applicationContext";
  public static final String DEFAULT_ATTRIBUTE_ID_PROPERTY_NAME = "attributeId";
  public static final String DEFAULT_ATTRIBUTE_NAME_PROPERTY_NAME = "attributeName";
  public static final String DEFAULT_ROOT_PRODUCTS_PROPERTY_NAME = "rootProducts";
  public static final String DEFAULT_BLOCKS_PROPERTY_NAME = "blocks";
  public static final String DEFAULT_CHILD_PRODUCT_UIS_PROPERTY_NAME = "childProductUIs";
  public static final String DEFAULT_TYPE_PROPERTY_NAME = "type";
  public static final String DEFAULT_RENDERER_PROPERTY_NAME = "renderer";
  public static final String DEFAULT_ACTIVE_FLAG_PROPERTY_NAME = "activeFlag";
  
  //ResourceBundle Name
  private static final String M_SIEBEL_RESOURCE_BUNDLE_NAME = "atg.siebel.WebAppResources";
  private static final String M_UINOTFOUND_MESSAGE = "uiNotFound";
  //ResourceBundle
  private static ResourceBundle sResourceBundle = LayeredResourceBundle.getBundle(M_SIEBEL_RESOURCE_BUNDLE_NAME, atg.service.dynamo.LangLicense.getLicensedDefault());
  private static Map<String,String> typeToItemDescriptorMap = null;
  static {
    Map<String, String> aMap = new HashMap<String, String>();
    aMap.put(Block.ATTRIBUTE_BLOCK, DEFAULT_ATTRIBUTE_BLOCK_ITEM_DESCRIPTOR_NAME);
    aMap.put(Block.RELATIONSHIP_BLOCK, DEFAULT_RELATIONSHIP_BLOCK_ITEM_DESCRIPTOR_NAME);
    
    typeToItemDescriptorMap = Collections.unmodifiableMap(aMap);
  }

  //----------------------------------------------------------------------------------
  // Member Variables
  //----------------------------------------------------------------------------------

  //----------------------------------------------------------------------------------
  // Properties
  //----------------------------------------------------------------------------------

  //----------------------------------------------------------------------------------
  // property: structuredProductUIRepository

  private MutableRepository mStructuredProductUIRepository;

  /**
   * Returns the Structured Product UI repository component
   *
   * @return the Structured Product UI repository
   */

  public MutableRepository getStructuredProductUIRepository()
  {
    return mStructuredProductUIRepository;
  }

  /**
   * Sets the Structured Product UI repository component
   *
   * @param pStructuredProductUIRepository the Structured Product UI repository component
   */

  public void setStructuredProductUIRepository (MutableRepository pStructuredProductUIRepository)
  {
    mStructuredProductUIRepository = pStructuredProductUIRepository;
  }

  //----------------------------------------------------------------------------------
  // property: promotionUIItemDescriptorName

  private String mPromotionUIItemDescriptorName = DEFAULT_PROMOTION_UI_ITEM_DESCRIPTOR_NAME;

  /**
   * Returns the promotion UI item descriptor name
   *
   * @return the name of the promotion UI item descriptor
   */

  public String getPromotionUIItemDescriptorName()
  {
    return mPromotionUIItemDescriptorName;
  }

  /**
   * Sets the promotion UI item descriptor name
   *
   * @param pPromotionUIItemDescriptorName the name of the promotion UI item descriptor
   */

  public void setPromotionUIItemDescriptorName (String pPromotionUIItemDescriptorName)
  {
    mPromotionUIItemDescriptorName = pPromotionUIItemDescriptorName;
  }

  //----------------------------------------------------------------------------------
  // property: productUIItemDescriptorName

  private String mProductUIItemDescriptorName = DEFAULT_PRODUCT_UI_ITEM_DESCRIPTOR_NAME;

  /**
   * Returns the product UI item descriptor name
   *
   * @return the name of the product UI item descriptor
   */

  public String getProductUIItemDescriptorName()
  {
    return mProductUIItemDescriptorName;
  }

  /**
   * Sets the product UI item descriptor name
   *
   * @param pProductUIItemDescriptorName the name of the product UI item descriptor
   */

  public void setProductUIItemDescriptorName (String pProductUIItemDescriptorName)
  {
    mProductUIItemDescriptorName = pProductUIItemDescriptorName;
  }
  
  //----------------------------------------------------------------------------------
  // property: blockItemDescriptorName

  private String mBlockItemDescriptorName = DEFAULT_BLOCK_ITEM_DESCRIPTOR_NAME;

  /**
   * Returns the product UI item descriptor name
   *
   * @return the name of the product UI item descriptor
   */

  public String getBlockItemDescriptorName()
  {
    return mBlockItemDescriptorName;
  }

  /**
   * Sets the product UI item descriptor name
   *
   * @param pProductUIItemDescriptorName the name of the product UI item descriptor
   */

  public void setBlockItemDescriptorName (String pBlockItemDescriptorName)
  {
    mBlockItemDescriptorName = pBlockItemDescriptorName;
  }
  
  //----------------------------------------------------------------------------------
  // property: rendererItemDescriptorName

  private String mRendererItemDescriptorName = DEFAULT_RENDERER_ITEM_DESCRIPTOR_NAME;

  /**
   * Returns the product UI item descriptor name
   *
   * @return the name of the product UI item descriptor
   */

  public String getRendererItemDescriptorName()
  {
    return mRendererItemDescriptorName;
  }

  /**
   * Sets the product UI item descriptor name
   *
   * @param pProductUIItemDescriptorName the name of the product UI item descriptor
   */

  public void setRendererItemDescriptorName (String pRendererItemDescriptorName)
  {
    mRendererItemDescriptorName = pRendererItemDescriptorName;
  }
  
  //----------------------------------------------------------------------------------
  // property: relationshipUIItemDescriptorName

  private String mRelationshipUIItemDescriptorName = DEFAULT_RELATIONSHIP_UI_ITEM_DESCRIPTOR_NAME;

  /**
   * Returns the relationship UI item descriptor name
   *
   * @return the name of the relationship UI item descriptor
   */

  public String getRelationshipUIItemDescriptorName()
  {
    return mRelationshipUIItemDescriptorName;
  }

  /**
   * Sets the relationship UI item descriptor name
   *
   * @param pRelationshipUIItemDescriptorName the name of the relationship UI item descriptor
   */

  public void setRelationshipUIItemDescriptorName (String pRelationshipUIItemDescriptorName)
  {
  	mRelationshipUIItemDescriptorName = pRelationshipUIItemDescriptorName;
  }

  //----------------------------------------------------------------------------------
  // property: idPropertyName

  private String mIdPropertyName = DEFAULT_ID_PROPERTY_NAME;

  /**
   * Returns the id property name
   *
   * @return the name of the id property
   */

  public String getIdPropertyName()
  {
    return mIdPropertyName;
  }

  /**
   * Sets the id property name
   *
   * @param pIdPropertyName the name of the id property
   */

  public void setIdPropertyName (String pIdPropertyName)
  {
    mIdPropertyName = pIdPropertyName;
  }

  //----------------------------------------------------------------------------------
  // property: relationshipIdPropertyName

  private String mRelationshipIdPropertyName = DEFAULT_RELATIONSHIP_ID_PROPERTY_NAME;

  /**
   * Returns the relationship id property name
   *
   * @return the name of the relationship id property
   */

  public String getRelationshipIdPropertyName()
  {
    return mRelationshipIdPropertyName;
  }

  /**
   * Sets the relationship id property name
   *
   * @param pRelationshipIdPropertyName the name of the relationship id property
   */

  public void setRelationshipIdPropertyName (String pRelationshipIdPropertyName)
  {
    mRelationshipIdPropertyName = pRelationshipIdPropertyName;
  }
  
  //----------------------------------------------------------------------------------
  // property: productIdPropertyName

  private String mProductIdPropertyName = DEFAULT_PRODUCT_ID_PROPERTY_NAME;

  /**
   * Returns the product id property name
   *
   * @return the name of the product id property
   */

  public String getProductIdPropertyName()
  {
    return mProductIdPropertyName;
  }

  /**
   * Sets the product id property name
   *
   * @param pProductIdPropertyName the name of the product id property
   */

  public void setProductIdPropertyName (String pProductIdPropertyName)
  {
    mProductIdPropertyName = pProductIdPropertyName;
  }
  
  //----------------------------------------------------------------------------------
  // property: promotionIdPropertyName

  private String mPromotionIdPropertyName = DEFAULT_PROMOTION_ID_PROPERTY_NAME;

  /**
   * Returns the promotion id property name
   *
   * @return the name of the promotion id property
   */

  public String getPromotionIdPropertyName()
  {
    return mPromotionIdPropertyName;
  }

  /**
   * Sets the promotion id property name
   *
   * @param pPromotionIdPropertyName the name of the promotion id property
   */

  public void setPromotionIdPropertyName (String pPromotionIdPropertyName)
  {
    mPromotionIdPropertyName = pPromotionIdPropertyName;
  }

  //----------------------------------------------------------------------------------
  // property: namePropertyName

  private String mNamePropertyName = DEFAULT_NAME_PROPERTY_NAME;

  /**
   * Returns the name property name
   *
   * @return the name of the name property
   */

  public String getNamePropertyName()
  {
    return mNamePropertyName;
  }

  /**
   * Sets the name property name
   *
   * @param pNamePropertyName the name of the name property
   */

  public void setNamePropertyName (String pNamePropertyName)
  {
    mNamePropertyName = pNamePropertyName;
  }

  //----------------------------------------------------------------------------------
  // property: displayNamePropertyName

  private String mDisplayNamePropertyName;

  /**
   * Returns the display name property name
   *
   * @return the name of the isplay name property
   */

  public String getDisplayNamePropertyName()
  {
    return mDisplayNamePropertyName;
  }

  /**
   * Sets the display name property name
   *
   * @param pDisplayNamePropertyName the name of the display name property
   */

  public void setDisplayNamePropertyName (String pDisplayNamePropertyName)
  {
    mDisplayNamePropertyName = pDisplayNamePropertyName;
  }

  //----------------------------------------------------------------------------------
  // property: cssPathPropertyName

  private String mCssPathPropertyName;

  /**
   * Returns the CSS Path property name
   *
   * @return the name of the CSS Path property
   */

  public String getCssPathPropertyName()
  {
    return mCssPathPropertyName;
  }

  /**
   * Sets the name property name
   *
   * @param pCssPathPropertyName the name of the CSS Path property
   */

  public void setCssPathPropertyName (String pCssPathPropertyName)
  {
    mCssPathPropertyName = pCssPathPropertyName;
  }

  //----------------------------------------------------------------------------------
  // property: productNamePropertyName

  private String mProductNamePropertyName = DEFAULT_PRODUCT_NAME_PROPERTY_NAME;

  /**
   * Returns the product name property name
   *
   * @return the name of the product name property
   */

  public String getProductNamePropertyName()
  {
    return mProductNamePropertyName;
  }

  /**
   * Sets the product name property name
   *
   * @param pProductNamePropertyName the name of the product name property
   */

  public void setProductNamePropertyName (String pProductNamePropertyName)
  {
    mProductNamePropertyName = pProductNamePropertyName;
  }

  //----------------------------------------------------------------------------------
  // property: promotionUIPropertyName

  private String mPromotionUIPropertyName = DEFAULT_PROMOTION_UI_PROPERTY_NAME;

  /**
   * Returns the promotion UI property name
   *
   * @return the name of the promotion UI property
   */

  public String getPromotionUIPropertyName()
  {
    return mPromotionUIPropertyName;
  }

  /**
   * Sets the promotion UI property name
   *
   * @param pPromotionUIPropertyName the name of the promotion UI property
   */

  public void setPromotionUIPropertyName (String pPromotionUIPropertyName)
  {
    mPromotionUIPropertyName = pPromotionUIPropertyName;
  }

  //----------------------------------------------------------------------------------
  // property: rootProductFlagPropertyName

  private String mRootProductFlagPropertyName = DEFAULT_ROOT_PRODUCT_FLAG_PROPERTY_NAME;

  /**
   * Returns the root product flag property name
   *
   * @return the name of the root product flag property
   */

  public String getRootProductFlagPropertyName()
  {
    return mRootProductFlagPropertyName;
  }

  /**
   * Sets the root product flag property name
   *
   * @param pRootProductFlagPropertyName the name of the root product flag property
   */

  public void setRootProductFlagPropertyName (String pRootProductFlagPropertyName)
  {
    mRootProductFlagPropertyName = pRootProductFlagPropertyName;
  }

  //----------------------------------------------------------------------------------
  // property: controllerPropertyName

  private String mControllerPropertyName = DEFAULT_CONTROLLER_PROPERTY_NAME;

  /**
   * Returns the controller property name
   *
   * @return the name of the controller property
   */

  public String getControllerPropertyName()
  {
    return mControllerPropertyName;
  }

  /**
   * Sets the controller property name
   *
   * @param pControllerPropertyName the name of the controller property
   */

  public void setControllerPropertyName (String pControllerPropertyName)
  {
    mControllerPropertyName = pControllerPropertyName;
  }

  //----------------------------------------------------------------------------------
  // property: jspPathPropertyName

  private String mJspPathPropertyName = DEFAULT_JSP_PATH_PROPERTY_NAME;

  /**
   * Returns the jsp path property name
   *
   * @return the name of the jsp path property
   */

  public String getJspPathPropertyName()
  {
    return mJspPathPropertyName;
  }

  /**
   * Sets the jsp path property name
   *
   * @param pJspPathPropertyName the name of the jsp path property
   */

  public void setJspPathPropertyName (String pJspPathPropertyName)
  {
    mJspPathPropertyName = pJspPathPropertyName;
  }

  //----------------------------------------------------------------------------------
  // property: applicationContextPropertyName

  private String mApplicationContextPropertyName = DEFAULT_APPLICATION_CONTEXT_PROPERTY_NAME;

  /**
   * Returns the application context property name
   *
   * @return the name of the application context property
   */

  public String getApplicationContextPropertyName()
  {
    return mApplicationContextPropertyName;
  }

  /**
   * Sets the application context property name
   *
   * @param pApplicationContextPropertyName the name of the application context property
   */

  public void setApplicationContextPropertyName (String pApplicationContextPropertyName)
  {
    mApplicationContextPropertyName = pApplicationContextPropertyName;
  }

  //----------------------------------------------------------------------------------
  // property: attributeIdPropertyName

  private String mAttributeIdPropertyName = DEFAULT_ATTRIBUTE_ID_PROPERTY_NAME;

  /**
   * Returns the attribute id property name
   *
   * @return the name of the attribute id property
   */

  public String getAttributeIdPropertyName()
  {
    return mAttributeIdPropertyName;
  }

  /**
   * Sets the attribute id property name
   *
   * @param pAttributeIdPropertyName the name of the attribute id property
   */

  public void setAttributeIdPropertyName (String pAttributeIdPropertyName)
  {
    mAttributeIdPropertyName = pAttributeIdPropertyName;
  }

  //----------------------------------------------------------------------------------
  // property: attributeNamePropertyName

  private String mAttributeNamePropertyName = DEFAULT_ATTRIBUTE_NAME_PROPERTY_NAME;

  /**
   * Returns the attribute name property name
   *
   * @return the name of the attribute name property
   */

  public String getAttributeNamePropertyName()
  {
    return mAttributeNamePropertyName;
  }

  /**
   * Sets the attribute name property name
   *
   * @param pAttributeNamePropertyName the name of the attribute name property
   */

  public void setAttributeNamePropertyName (String pAttributeNamePropertyName)
  {
    mAttributeNamePropertyName = pAttributeNamePropertyName;
  }

  //----------------------------------------------------------------------------------
  // property: rootProductsPropertyName

  private String mRootProductsPropertyName = DEFAULT_ROOT_PRODUCTS_PROPERTY_NAME;

  /**
   * Returns the root products property name
   *
   * @return the name of the root products property
   */

  public String getRootProductsPropertyName()
  {
    return mRootProductsPropertyName;
  }

  /**
   * Sets the root products property name
   *
   * @param pRootProductsPropertyName the name of the root products property
   */

  public void setRootProductsPropertyName (String pRootProductsPropertyName)
  {
    mRootProductsPropertyName = pRootProductsPropertyName;
  }

  //----------------------------------------------------------------------------------
  // property: blocksPropertyName

  private String mBlocksPropertyName = DEFAULT_BLOCKS_PROPERTY_NAME;

  /**
   * Returns the blocks property name
   *
   * @return the name of the blocks property
   */

  public String getBlocksPropertyName()
  {
    return mBlocksPropertyName;
  }

  /**
   * Sets the blocks property name
   *
   * @param pBlocksPropertyName the name of the blocks property
   */

  public void setBlocksPropertyName (String pBlocksPropertyName)
  {
    mBlocksPropertyName = pBlocksPropertyName;
  }

  //----------------------------------------------------------------------------------
  // property: childProductUIsPropertyName

  private String mChildProductUIsPropertyName = DEFAULT_CHILD_PRODUCT_UIS_PROPERTY_NAME;

  /**
   * Returns the child product UIs property name
   *
   * @return the name of the child product UIs property
   */

  public String getChildProductUIsPropertyName()
  {
    return mChildProductUIsPropertyName;
  }

  /**
   * Sets the child product UIs property name
   *
   * @param pChildProductUIsPropertyName the name of the child product UIs property
   */

  public void setChildProductUIsPropertyName (String pChildProductUIsPropertyName)
  {
    mChildProductUIsPropertyName = pChildProductUIsPropertyName;
  }

  //----------------------------------------------------------------------------------
  // property: typePropertyName

  private String mTypePropertyName = DEFAULT_TYPE_PROPERTY_NAME;

  /**
   * Returns the type property name
   *
   * @return the name of the type property
   */

  public String getTypePropertyName()
  {
    return mTypePropertyName;
  }

  /**
   * Sets the type property name
   *
   * @param pTypePropertyName the name of the type property
   */

  public void setTypePropertyName (String pTypePropertyName)
  {
    mTypePropertyName = pTypePropertyName;
  }

  //----------------------------------------------------------------------------------
  // property: rendererPropertyName

  private String mRendererPropertyName = DEFAULT_RENDERER_PROPERTY_NAME;

  /**
   * Returns the renderer property name
   *
   * @return the name of the renderer property
   */

  public String getRendererPropertyName()
  {
    return mRendererPropertyName;
  }

  /**
   * Sets the renderer property name
   *
   * @param pRendererPropertyName the name of the renderer property
   */

  public void setRendererPropertyName (String pRendererPropertyName)
  {
    mRendererPropertyName = pRendererPropertyName;
  }

  //----------------------------------------------------------------------------------
  // property: activeFlagPropertyName

  private String mActiveFlagPropertyName = DEFAULT_ACTIVE_FLAG_PROPERTY_NAME;

  /**
   * Returns the active flag property name
   *
   * @return the name of the active flag property
   */

  public String getActiveFlagPropertyName()
  {
    return mActiveFlagPropertyName;
  }

  /**
   * Sets the active flag property name
   *
   * @param pActiveFlagPropertyName the name of the active flag property
   */

  public void setActiveFlagPropertyName (String pActiveFlagPropertyName)
  {
    mActiveFlagPropertyName = pActiveFlagPropertyName;
  }

  //----------------------------------------------------------------------------------
  // property: htmlAttributesPropertyName

  private String mHtmlAttributesPropertyName;

  /**
   * Returns the html attributes property name
   *
   * @return the name of the html attributes property
   */

  public String getHtmlAttributesPropertyName()
  {
    return mHtmlAttributesPropertyName;
  }

  /**
   * Sets the html attributes property name
   *
   * @param pHtmlAttributesPropertyName the name of the html attributes property
   */

  public void setHtmlAttributesPropertyName (String pHtmlAttributesPropertyName)
  {
    mHtmlAttributesPropertyName = pHtmlAttributesPropertyName;
  }

  //----------------------------------------------------------------------------------
  // Methods
  //----------------------------------------------------------------------------------

  /**
   * getPromotionUI
   *
   * This method returns the UI structure for the given promotion. The information
   * contains the controller and a list that defines the rendering order for the root
   * product UIs.
   *
   * @param pPromotionId the id of the promotion.
   *
   * @return a PromotionUI object.
   */

  public PromotionUI getPromotionUI (String pPromotionId) throws StructuredProductUIException
  {
    PromotionUI promotionUI = null;
    RepositoryItem promotionUIItem = null;

    // Get the promotion ui repository item

    try
    {
      //promotionUIItem = getStructuredProductUIRepository().getItem (pPromotionId, getPromotionUIItemDescriptorName());
      RepositoryView promoRepositoryView = getStructuredProductUIRepository().getView (getPromotionUIItemDescriptorName());
      QueryBuilder promoQueryBuilder = promoRepositoryView.getQueryBuilder();
    	
      Query promoIdQuery = promoQueryBuilder.createComparisonQuery (
    			promoQueryBuilder.createConstantQueryExpression (pPromotionId),
    			promoQueryBuilder.createPropertyQueryExpression (getPromotionIdPropertyName()),
                QueryBuilder.EQUALS);
    	
      RepositoryItem[] promoUIItems = promoRepositoryView.executeQuery (promoIdQuery);
      //there should only be 1 promoUI per promotion
      promotionUIItem = promoUIItems[0];

      // Check that an item has been returned.

      if (promotionUIItem == null)
      {
        return (null);
      }

      // Get promotion UI object

      promotionUI = processPromotionUIItem(promotionUIItem);

    }
    catch (RepositoryException e)
    {
      throw new StructuredProductUIException (e);
    }
    catch (PropertyNotFoundException e)
    {
      throw new StructuredProductUIException (e);
    }

    // Return the UI object.

    return promotionUI;
  }
  
  /**
   * returns a promotion ui with the given id
   * 
   * @param pId
   * @return
   * @throws StructuredProductUIException
   */
  public PromotionUI getPromotionUIByID(String pId) throws StructuredProductUIException
  {
    PromotionUI promoUI = null;
    RepositoryItem item = null;
    try
    {
      item = getStructuredProductUIRepository().getItem(pId, getPromotionUIItemDescriptorName());
      
      if(item!=null)
      {
        promoUI = processPromotionUIItem (item);
      }
    } 
    catch (RepositoryException e)
    {
      throw new StructuredProductUIException(e);
    } 
    catch (PropertyNotFoundException e)
    {
      throw new StructuredProductUIException(e);
    }
    
    return promoUI;
  }

  @SuppressWarnings({ "unchecked", "rawtypes" })
  protected PromotionUI processPromotionUIItem(RepositoryItem pPromotionUIItem) throws PropertyNotFoundException
  {
    PromotionUI promotionUI = null;
    RepositoryItem controllerItem = null;
    ArrayList<String> rootProducts = null;
    Object object = null;
    Renderer controller = null;
    
    
    // Create the promotion UI object

    promotionUI = new PromotionUI ();

    promotionUI.setPromotionUIRepositoryItem(pPromotionUIItem);
    
    // Get the id property

    object = DynamicBeans.getPropertyValue (pPromotionUIItem, getIdPropertyName());

    if (object != null)
    {
      promotionUI.setPromotionId ((String) object);
    }

    // Get the name property

    object = DynamicBeans.getPropertyValue (pPromotionUIItem, getNamePropertyName());

    if (object != null)
    {
      promotionUI.setName ((String) object);
    }
    
    // Get the cssPath property
    
    object = DynamicBeans.getPropertyValue (pPromotionUIItem, getCssPathPropertyName());

    if (object != null)
    {
      promotionUI.setCssPath((String) object);
    }

    // Get the controller item.

    controllerItem = (RepositoryItem) DynamicBeans.getPropertyValue (pPromotionUIItem, getControllerPropertyName());

    // Check that an item has been returned.

    if (controllerItem != null)
    {
      // get the renderer object

      controller = processRendererItem(controllerItem);

      promotionUI.setController (controller);
    }

    // Get the list of root products

    rootProducts = new ArrayList ((List<String>) DynamicBeans.getPropertyValue 
        (pPromotionUIItem, getRootProductsPropertyName()));
    
    // Check that there are root product UIs specified.

    if ((rootProducts != null) && (rootProducts.size() > 0))
    {
      promotionUI.setRootProducts (rootProducts);
    }
    
    return promotionUI;
  }
  
  
  /**
   * 
   * @param pPromotionUI
   * @throws RepositoryException
   */
  public PromotionUI addPromotionUI(PromotionUI pPromotionUI) throws RepositoryException
  {
    vlogDebug("Adding PromotionUI to repository - id = {0}", pPromotionUI.getId());   
    
    MutableRepositoryItem promotionUIitem =  getStructuredProductUIRepository().
        createItem(DEFAULT_PROMOTION_UI_ITEM_DESCRIPTOR_NAME);
    
    // Need to go through all the properties and add them to the repository item
    promotionUIitem.setPropertyValue(getIdPropertyName(), pPromotionUI.getId());
    promotionUIitem.setPropertyValue(getPromotionIdPropertyName(), pPromotionUI.getPromotionId());
    promotionUIitem.setPropertyValue(getNamePropertyName(), pPromotionUI.getName());
    promotionUIitem.setPropertyValue(getControllerPropertyName(), pPromotionUI.getController().getRendererRepositoryItem());
    promotionUIitem.setPropertyValue(getCssPathPropertyName(), pPromotionUI.getCssPath());
    
    pPromotionUI.setPromotionUIRepositoryItem(getStructuredProductUIRepository().addItem(promotionUIitem));
    
    return pPromotionUI;
  }
  
  /**
   * getProductUI
   *
   * This method retrieves the top level product UI item using the specified product id. If the
   * product is within the context of a promotion then the promotion is also specified. Once the top level
   * product UI has been retrieved the the method then calls the processProductUIItem method to extract
   * the product UI properties and process the product UI child tree.
   *
   * @param pProductId the id of the product.
   * @param pPromotionId the id of the parent promotion.
   *
   * @return the ProductUI object
   */

  public ProductUI getProductUI (String pProductId, String pPromotionId) throws StructuredProductUIException
  {
    ProductUI productUI = null;
    RepositoryView repositoryView = null;
    QueryBuilder queryBuilder = null;
    Query productIdQuery = null;
    Query promotionUIQuery = null;
    Query rootProductFlagQuery = null;
    Query productUIQuery = null;
    Query[] queryParts = null;
    RepositoryItem[] productUIItems = null;

    // Check that a product id has been suppplied.
    
    if (pProductId == null)
    {
      throw new StructuredProductUIException ("Product id is empty");
    }
    
    // Get the product ui repository item

    try
    {
      // Set up the query builder
      
      repositoryView = getStructuredProductUIRepository().getView (getProductUIItemDescriptorName());
      queryBuilder = repositoryView.getQueryBuilder();
      
      // Create the product id comparison query
        
      productIdQuery = queryBuilder.createComparisonQuery (
                                   queryBuilder.createConstantQueryExpression (pProductId),
                                   queryBuilder.createPropertyQueryExpression (getProductIdPropertyName()),
                                   QueryBuilder.EQUALS);
      
      rootProductFlagQuery = queryBuilder.createComparisonQuery (
          queryBuilder.createConstantQueryExpression (true),
          queryBuilder.createPropertyQueryExpression (getRootProductFlagPropertyName()),
          QueryBuilder.EQUALS);    

      // Check if a promotion id is specified
      
      if (pPromotionId == null)
      {
        // The query is just with a product id, i.e. a stand-alone configurable product NOT in a promotion
    	  
    	Query nullPromoQuery = queryBuilder.createIsNullQuery(queryBuilder.createPropertyQueryExpression(getPromotionUIPropertyName()));
        
        queryParts = new Query[3];
        
        queryParts[0] = productIdQuery;
        queryParts[1] = rootProductFlagQuery;
        queryParts[2] = nullPromoQuery;
      
        productUIQuery = queryBuilder.createAndQuery (queryParts);
      }
      else
      {
        // The query uses both the product and promotion ids. Create the product id comparison query
    	  
    	  // Get the id from the promotion-ui

        RepositoryView promoRepositoryView = getStructuredProductUIRepository().getView (getPromotionUIItemDescriptorName());
    	  QueryBuilder promoQueryBuilder = promoRepositoryView.getQueryBuilder();
    	
    	  Query promoIdQuery = promoQueryBuilder.createComparisonQuery (
    			promoQueryBuilder.createConstantQueryExpression (pPromotionId),
    			promoQueryBuilder.createPropertyQueryExpression (getPromotionIdPropertyName()),
                QueryBuilder.EQUALS);
    	
    	  RepositoryItem[] promoUIItems = promoRepositoryView.executeQuery (promoIdQuery);
    	
    	  // There should only be one at most

    	  if (promoUIItems != null && promoUIItems[0]!=null)
    	  {
            promotionUIQuery = queryBuilder.createComparisonQuery (
                                         queryBuilder.createConstantQueryExpression (promoUIItems[0].getRepositoryId()),
                                         queryBuilder.createPropertyQueryExpression (getPromotionUIPropertyName()),
                                         QueryBuilder.EQUALS);
            
            // Create the join query.
            
            queryParts = new Query[3];
            
            queryParts[0] = productIdQuery;
            queryParts[1] = rootProductFlagQuery;
            queryParts[2] = promotionUIQuery;
          
            productUIQuery = queryBuilder.createAndQuery (queryParts);
      	}else{
      	  String errorMsg = MessageFormat.format(
              sResourceBundle.getString(M_UINOTFOUND_MESSAGE), pPromotionId);
      	  throw new StructuredProductUIException(errorMsg);
      	}

      	//if there is no promotion ui, just return the default product ui

      }
      
      // Execute the query.
      
      productUIItems = repositoryView.executeQuery (productUIQuery);

      // Check that an item has been returned.

      if (productUIItems == null)
      {
        String errorMsg = MessageFormat.format(
            sResourceBundle.getString(M_UINOTFOUND_MESSAGE), pProductId);
    	  throw new StructuredProductUIException (errorMsg);
      }

      // Process the first product UI item

      productUI = processProductUIItem (productUIItems[0]);
    }
    catch (RepositoryException e)
    {
      throw new StructuredProductUIException (e);
    }
    catch (PropertyNotFoundException e)
    {
      throw new StructuredProductUIException (e);
    }

    // Return the product UI.

    return productUI;
  }
  
  /**
   * Returns the product ui with the given id, or throws an exception if one doesn't exist
   * 
   * @param pProductUIId
   * @return
   * @throws StructuredProductUIException
   */
  public ProductUI getProductUIByID(String pProductUIId) throws StructuredProductUIException
  {
    ProductUI productUI = null;
    RepositoryItem item = null;
    try
    {
      item = getStructuredProductUIRepository().getItem(pProductUIId, getProductUIItemDescriptorName());
      
      if(item!=null)
      {
        productUI = processProductUIItem (item);
      }
    } 
    catch (RepositoryException e)
    {
      throw new StructuredProductUIException(e);
    } 
    catch (PropertyNotFoundException e)
    {
      throw new StructuredProductUIException(e);
    }
    
    return productUI;
  }

  /**
   * processProductUIItem
   *
   * This method returns the UI structure for the given product UI item. It extracts the
   * properties and recursively processes any child products.
   *
   * @param pProductUIItem the product UI item to be processed.
   *
   * @return the ProductUI object
   */

  protected ProductUI processProductUIItem (RepositoryItem pProductUIItem) throws RepositoryException, PropertyNotFoundException
  {
    ProductUI productUI = null;
    Object object = null;
    RepositoryItem promotionUIItem = null;
    List<Block> blocks = null;

    // Check that a product UI item has been passed.

    if (pProductUIItem == null)
    {
      return (null);
    }

    // Create the product UI object

    productUI = new ProductUI ();

    // Process the item

    productUI.setProductUIRepositoryItem(pProductUIItem);
    
    // Get the id property

    object = DynamicBeans.getPropertyValue (pProductUIItem, getIdPropertyName());

    if (object != null)
    {
      productUI.setId ((String) object);
    }

    // Get the product id property

    object = DynamicBeans.getPropertyValue (pProductUIItem, getProductIdPropertyName());

    if (object != null)
    {
      productUI.setProductId ((String) object);
    }

    // Get the product name property

    object = DynamicBeans.getPropertyValue (pProductUIItem, getProductNamePropertyName());

    if (object != null)
    {
      productUI.setProductName ((String) object);
    }

    // Get the promotion UI property

    promotionUIItem = (RepositoryItem) DynamicBeans.getPropertyValue (pProductUIItem, getPromotionUIPropertyName());

    if (promotionUIItem != null)
    {
      
      PromotionUI promotionUI = processPromotionUIItem(promotionUIItem);
      
      // Get the promotion UI id

      productUI.setPromotionUI (promotionUI);
    }

    // Get the root product flag property

    object = DynamicBeans.getPropertyValue (pProductUIItem, getRootProductFlagPropertyName());

    if (object != null)
    {
      productUI.setRootProductFlag (((Boolean) object).booleanValue());
    }
    
    // Get the cssPath property
    
    object = DynamicBeans.getPropertyValue (pProductUIItem, getCssPathPropertyName());

    if (object != null)
    {
      productUI.setCssPath((String) object);
    }

    // Get the list of blocks

    object = DynamicBeans.getPropertyValue(pProductUIItem, getBlocksPropertyName());

    if (object != null && object instanceof List)
    {
      @SuppressWarnings("unchecked")
      List<RepositoryItem> blockRepositoryItems = (List<RepositoryItem>) object;

      blocks = new ArrayList<Block>();
      
      for (RepositoryItem blockItem : blockRepositoryItems)
      {
        Block block = processBlockItem(blockItem);
        
        blocks.add(block);
      }      
    }
    
    productUI.setBlocks (blocks);

    // Return the product UI.

    return productUI;
  }
  
  /**
   * 
   * @param pProductUI
   * @throws RepositoryException 
   */
  public ProductUI addProductUI(ProductUI pProductUI) throws RepositoryException
  {
    vlogDebug("Adding ProductUI to repository - id = {0}", pProductUI.getId());   
    
    MutableRepositoryItem prodUIItem = getStructuredProductUIRepository().getItemForUpdate(pProductUI.getId(), 
        DEFAULT_PRODUCT_UI_ITEM_DESCRIPTOR_NAME);
    
    boolean updating = true;
    
    if(prodUIItem==null)
    {
      updating = false;
      prodUIItem = getStructuredProductUIRepository().
          createItem(DEFAULT_PRODUCT_UI_ITEM_DESCRIPTOR_NAME);
    }

    // set the simple properties
    
    prodUIItem.setPropertyValue(getIdPropertyName(), pProductUI.getId());
    prodUIItem.setPropertyValue(getProductIdPropertyName(), pProductUI.getProductId());
    prodUIItem.setPropertyValue(getProductNamePropertyName(), pProductUI.getProductName());
    prodUIItem.setPropertyValue(getCssPathPropertyName(), pProductUI.getCssPath());
    prodUIItem.setPropertyValue(getRootProductFlagPropertyName(), pProductUI.getRootProductFlag());
    
    // get the promotion UI and set that property
    
    if (pProductUI.getPromotionUI() != null)
    {
      RepositoryItem promotionUIItem = pProductUI.getPromotionUI().getPromotionUIRepositoryItem();
      prodUIItem.setPropertyValue(getPromotionUIPropertyName(), promotionUIItem);
    }
    
    // get list of block repository items and set that property
    
    List<Block> blocks = pProductUI.getBlocks();
    List<RepositoryItem> blockItems = new ArrayList<RepositoryItem>();
    for (Block block : blocks)
    {
      blockItems.add(block.getBlockRepositoryItem());
    }
    prodUIItem.setPropertyValue(getBlocksPropertyName(), blockItems);
    
    // save the product UI item to the repository
    
    if(updating)
    {
      getStructuredProductUIRepository().updateItem(prodUIItem);
    }
    else
    {
      getStructuredProductUIRepository().addItem(prodUIItem);
    }
    
    pProductUI.setProductUIRepositoryItem(prodUIItem);
    
    return pProductUI;
  }
  
	/**
	 * 
	 * 
	 * @param pBlockId
	 * @return
	 * @throws StructuredProductUIException
	 */
	public Block getBlock(String pBlockId) throws StructuredProductUIException
	{
	  Block block = null;
	  RepositoryItem blockItem = null;
	  
    try {
      RepositoryView blockRepositoryView = getStructuredProductUIRepository().getView (getBlockItemDescriptorName());
      QueryBuilder blockQueryBuilder = blockRepositoryView.getQueryBuilder();
      
      Query blockIdQuery = blockQueryBuilder.createComparisonQuery (
          blockQueryBuilder.createConstantQueryExpression (pBlockId),
          blockQueryBuilder.createPropertyQueryExpression (getIdPropertyName()),
          QueryBuilder.EQUALS);
      
      RepositoryItem[] blockItems = blockRepositoryView.executeQuery (blockIdQuery);
      
      if (blockItems == null || blockItems[0] == null)
      {
        vlogDebug("No Block exists in repository with id = {0}. returning null", pBlockId);
        return null;        
      }
      
      // there should only be 1 block
      
      blockItem = blockItems[0];

      block = processBlockItem(blockItem);
      
    }
    catch (RepositoryException e)
    {
      throw new StructuredProductUIException (e);
    }
    catch (PropertyNotFoundException e)
    {
      throw new StructuredProductUIException (e);
    }

	  
	  return block;
	}
	
	
  /**
   * 
   * @param pBlockIds - comma separated list of block ids
   * @return
   * @throws StructuredProductUIException
   */
  public List<Block> getBlocks(String pBlockIds) throws StructuredProductUIException
  {
    String[] blockIds = pBlockIds.split(",");
    
    List<Block> blocks = new ArrayList<Block>();
    
    for (String blockId : blockIds)
    {
      blockId.trim();
      Block block = getBlock(blockId);
      if (block != null)
      {      
        blocks.add(block);
      }
    }
    return blocks;
  }
  

  /**
   * 
   * @param pBlocks
   * @return
   */
  public String getBlockIdsString(List<Block> pBlocks)
  {
    if (pBlocks == null)
    {
      return null;
    }
    
    StringBuilder blockIdString = new StringBuilder();
    String prefix = "";
    
    for (Block block : pBlocks)
    {
      if (block != null)
      {
        blockIdString.append(prefix);      
        blockIdString.append(block.getId());
        prefix = ",";
      }
    }
    
    return blockIdString.toString();
  }
  
  
  /**
   * returns an item descriptor based on block type
   * 
   * @param pType
   * @return
   */
  private String getItemDescriptorForType(String pType)
  {
    String descriptor = typeToItemDescriptorMap.get(pType);
    return descriptor==null?DEFAULT_BLOCK_ITEM_DESCRIPTOR_NAME:descriptor;
  }
  
  
  
	/**
	 * 
	 * @param pBlock
	 * @throws RepositoryException
	 */
	public Block addBlock(Block pBlock) throws RepositoryException
	{
    vlogDebug("Adding Block to repository - id = {0}", pBlock.getId());	  
	  
	  MutableRepositoryItem blockItem = getStructuredProductUIRepository().getItemForUpdate(pBlock.getId(), 
	      getItemDescriptorForType(pBlock.getType()));
	  
	  boolean updating = true;
	  
	  if(blockItem==null)
	  {
	    updating = false;
	    blockItem = getStructuredProductUIRepository().
	        createItem(getItemDescriptorForType(pBlock.getType()));
	  }
	  
    if (pBlock.getType()!=null && pBlock.getType().equalsIgnoreCase(Block.ATTRIBUTE_BLOCK))
    {
      
      blockItem.setPropertyValue(getAttributeIdPropertyName(), pBlock.getAttributeId());
      blockItem.setPropertyValue(getAttributeNamePropertyName(), pBlock.getAttributeName());

    }
    else if (pBlock.getType()!=null && pBlock.getType().equalsIgnoreCase(Block.RELATIONSHIP_BLOCK))
    {      
      blockItem.setPropertyValue(getRelationshipIdPropertyName(), pBlock.getRelationshipId());
      
      List<RepositoryItem> childProductItems = new ArrayList<RepositoryItem>();
            
      List<ProductUI> childProducts = pBlock.getChildProductUIs();
      for (ProductUI productUI : childProducts)
      {
        childProductItems.add(productUI.getProducUIRepositoryItem());
      }
      
      blockItem.setPropertyValue(getChildProductUIsPropertyName(), childProductItems);
    }
    
    // set generic block item properties
    
    blockItem.setPropertyValue(getIdPropertyName(), pBlock.getId());
    blockItem.setPropertyValue(getActiveFlagPropertyName(), pBlock.getActiveFlag());
    blockItem.setPropertyValue(getDisplayNamePropertyName(), pBlock.getDisplayName());
    blockItem.setPropertyValue(getHtmlAttributesPropertyName(), pBlock.getHtmlAttributes());
    blockItem.setPropertyValue(getNamePropertyName(), pBlock.getName());
    blockItem.setPropertyValue(getTypePropertyName(), pBlock.getType());

    // check if there is a renderer (there should always be one....)
    
    if (pBlock.getRenderer() != null)
    {
      blockItem.setPropertyValue(getRendererPropertyName(), 
        pBlock.getRenderer().getRendererRepositoryItem());
    }
    
    if(updating)
    {
      getStructuredProductUIRepository().updateItem(blockItem);
    }
    else
    {
      getStructuredProductUIRepository().addItem(blockItem);
    }
    
        
    pBlock.setBlockRepositoryItem(blockItem);
    
    return pBlock;
	}
	
	/**
	 * 
	 * @param pBlockItem
	 * @return
	 * @throws PropertyNotFoundException 
	 * @throws RepositoryException 
	 */
	protected Block processBlockItem(RepositoryItem pBlockItem) throws PropertyNotFoundException, RepositoryException
	{
	  Block block =  new Block();;

	  block.setBlockRepositoryItem(pBlockItem);
	  
	  // get the id property
    Object object = DynamicBeans.getPropertyValue(pBlockItem, getIdPropertyName());
    if (object != null) {
      block.setId((String) object);
    }

    // Get the name property
    object = DynamicBeans.getPropertyValue (pBlockItem, getNamePropertyName());
    if (object != null) {
      block.setName((String) object);
    }
    
    // Get the displayName property
    object = DynamicBeans.getPropertyValue (pBlockItem, getDisplayNamePropertyName());
    if (object != null) {
      block.setDisplayName((String) object);
    }
    
    object = DynamicBeans.getPropertyValue (pBlockItem, getHtmlAttributesPropertyName());
    if (object != null) {
      block.setHtmlAttributes((String) object);
    }

    // Get the type property
    object = DynamicBeans.getPropertyValue(pBlockItem, getTypePropertyName());
    if (object != null) {
      block.setType((String) object);

      // Check for an attribute block
      if (block.getType().equalsIgnoreCase(Block.ATTRIBUTE_BLOCK)) {
        // Get the attribute id property

        object = DynamicBeans.getPropertyValue(pBlockItem, getAttributeIdPropertyName());
        if (object != null) {
          block.setAttributeId((String) object);
        }

        // Get the attribute name property
        object = DynamicBeans.getPropertyValue(pBlockItem, getAttributeNamePropertyName());
        if (object != null) {
        block.setAttributeName((String) object);
        }
      } else if (block.getType().equalsIgnoreCase(Block.RELATIONSHIP_BLOCK)) {
        // Get the childBlocks property
        object = DynamicBeans.getPropertyValue(pBlockItem, getChildProductUIsPropertyName());
        if (object instanceof List) {
        // Create a child product UIs array list
        List<ProductUI> childProductUIs = new ArrayList<ProductUI>();
        // Process the child product UIs
        Iterator<RepositoryItem> childProductUIIterator = ((List<RepositoryItem>) object)
            .iterator();

        while (childProductUIIterator.hasNext()) {
          // Get the next child product UI
          RepositoryItem childProductUIItem = childProductUIIterator.next();
          ProductUI childProductUI = processProductUIItem(childProductUIItem);
          if (childProductUI != null) {
            childProductUIs.add(childProductUI);
          }
        }
        
        block.setChildProductUIs(childProductUIs);
        }

        // Get the relationshipId name property
        object = DynamicBeans.getPropertyValue(pBlockItem, getRelationshipIdPropertyName());
        if (object != null) {
        block.setRelationshipId((String) object);
        }
      } 
    }

    // Get the renderer property
    object = DynamicBeans.getPropertyValue(pBlockItem, getRendererPropertyName());
    if (object != null) {
      RepositoryItem rendererItem = (RepositoryItem) object;

      Renderer renderer = processRendererItem(rendererItem);

      // Set the renderer in the block
      block.setRenderer(renderer);
    }

    // Get the active flag property

    object = DynamicBeans.getPropertyValue(pBlockItem, getActiveFlagPropertyName());
    if (object != null) {
      block.setActiveFlag(((Boolean) object).booleanValue());
    }	  
	  return block;
	}
	
	
  /**
   * This method returns the Renderer object for the given renderer id
   * 
   * @param pRendererId - id of 
   * @return
   * @throws StructuredProductUIException 
   */
	public Renderer getRenderer(String pRendererId) throws StructuredProductUIException
	{

	  Renderer renderer = null;
	  RepositoryItem rendererItem = null;
	  
    try {
      RepositoryView rendererRepositoryView = 
          getStructuredProductUIRepository().getView (getRendererItemDescriptorName());
      
      QueryBuilder rendererQueryBuilder = rendererRepositoryView.getQueryBuilder();
      
      Query rendererIdQuery = rendererQueryBuilder.createComparisonQuery (
          rendererQueryBuilder.createConstantQueryExpression (pRendererId),
          rendererQueryBuilder.createPropertyQueryExpression (getIdPropertyName()),
          QueryBuilder.EQUALS);
      
      RepositoryItem[] rendererItems = rendererRepositoryView.executeQuery (rendererIdQuery);
      
      if (rendererItems == null || rendererItems[0] == null)
      {
        vlogDebug("No Renderer exists in repository with id = {0}. returning null", pRendererId);
        return null;
      }
      //there should only be 1 renderer
      rendererItem = rendererItems[0];
  
      renderer = processRendererItem(rendererItem);
         
    }
    catch (RepositoryException e)
    {
      throw new StructuredProductUIException (e);
    }
    catch (PropertyNotFoundException e)
    {
      throw new StructuredProductUIException (e);
    }
    
	  return renderer;
	}
	
	
  /**
   * This method returns the Renderer object for the given renderer repository item
   * 
   * @param renderer
   * @return
   * @throws RepositoryException 
   * @throws PropertyNotFoundException 
   */
  protected Renderer processRendererItem(RepositoryItem pRendererItem) throws PropertyNotFoundException
  {
    
    Renderer renderer = null;
    Object object = null;
    
    // Create the renderer object

    renderer = new Renderer ();

    // Set the properties.

    renderer.setRendererRepositoryItem(pRendererItem);
    
    object = DynamicBeans.getPropertyValue (pRendererItem, getIdPropertyName());

    if (object != null)
    {
      renderer.setId ((String) object);
    }

    object = DynamicBeans.getPropertyValue (pRendererItem, getJspPathPropertyName());

    if (object != null)
    {
      renderer.setJspPath ((String) object);
    }

    object = DynamicBeans.getPropertyValue (pRendererItem, getApplicationContextPropertyName());

    if (object != null)
    {
      renderer.setApplicationContext ((String) object);
    }

    object = DynamicBeans.getPropertyValue (pRendererItem, getHtmlAttributesPropertyName());

    if (object != null)
    {
      renderer.setHtmlAttributes ((String) object);
    }
      
    return renderer;
  }
  
  
	
	
	
	
	
	
  // TODO: Temporary test methods. To be removed before shipping.
  
  public void testGetPromotionUI ()
  {
    PromotionUI promotionUI = null;
    
    try
    {
      promotionUI = getPromotionUI ("88-231OB");
    }
    catch (StructuredProductUIException e)
    {
      System.out.println ("testGetPromotionUI: Exception: " + e.getMessage());
    }
    
    // Print the details
    
    System.out.println ("testGetPromotionUI: Promotion Id: " + promotionUI.getPromotionId());
    System.out.println ("testGetPromotionUI: Name: " + promotionUI.getName());
    System.out.println ("testGetPromotionUI: Controller.id: " + promotionUI.getController().getId());
    System.out.println ("testGetPromotionUI: Controller.jspPath: " + promotionUI.getController().getJspPath());
    System.out.println ("testGetPromotionUI: Controller.appContext: " + promotionUI.getController().getApplicationContext());
    
    ArrayList<String> rootProducts = promotionUI.getRootProducts();
    
    Iterator iterator = rootProducts.iterator();
    
    while (iterator.hasNext())
    {
      System.out.println ("testGetPromotionUI: Root Product: " + iterator.next()); 
    }    
  }
  
  public void testGetProductUI ()
  {
    ProductUI productUI = null;
    
    try
    {
      productUI = getProductUI ("88-17KFU", null);
    }
    catch (StructuredProductUIException e)
    {
      System.out.println ("testGetProductUI: Exception: " + e.getMessage());
    }
    
    // Print the details
    
    if (productUI != null)
    {
      displayProductUI (productUI);
    }
    else
    {
      System.out.println ("testGetProductUI: Not product found");
    }
  }
  
  private void displayProductUI (ProductUI pProductUI)
  {
    // Base properties
    
    System.out.println ("displayProductUI: Id: " + pProductUI.getId());
    System.out.println ("displayProductUI: Product Id: " + pProductUI.getProductId());
    System.out.println ("displayProductUI: Product Name: " + pProductUI.getProductName());
    System.out.println ("displayProductUI: Root Product Flag: " + pProductUI.getRootProductFlag());
    System.out.println ("displayProductUI: Promotion UI: " + pProductUI.getPromotionUI());
    
    // Blocks
    
    List<Block> blocks = pProductUI.getBlocks();

    if (blocks != null)
    {
      System.out.println ("displayProductUI: Blocks: " + blocks.size());

      Iterator iterator = blocks.iterator();
    
      while (iterator.hasNext())
      {
        Block block = (Block) iterator.next();
      
        System.out.println ("displayProductUI: Block.Id: " + block.getId());
        System.out.println ("displayProductUI: Block.Name: " + block.getName());
        System.out.println ("displayProductUI: Block.Type: " + block.getType());
        System.out.println ("displayProductUI: Block.ActiveFlag: " + block.getActiveFlag());
        System.out.println ("displayProductUI: Block.AttributeId: " + block.getAttributeId());
        System.out.println ("displayProductUI: Block.AttributeName: " + block.getAttributeName());
        System.out.println ("displayProductUI: Block.Renderer.Id: " + block.getRenderer().getId());
        System.out.println ("displayProductUI: Block.Renderer.JspPath: " + block.getRenderer().getJspPath());
        System.out.println ("displayProductUI: Block.Renderer.AppContext: " + block.getRenderer().getApplicationContext());
      }
    }
  }
}
