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

package atg.siebel.order.purchase;


import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

import atg.beans.PropertyNotFoundException;
import atg.commerce.CommerceException;
import atg.commerce.order.CommerceItem;
import atg.commerce.order.CommerceItemManager;
import atg.commerce.order.ItemAddedToOrder;
import atg.commerce.order.Order;
import atg.commerce.order.OrderManager;
import atg.commerce.order.ShippingGroup;
import atg.commerce.order.purchase.AddCommerceItemInfo;
import atg.commerce.order.purchase.PurchaseProcessHelper;
import atg.commerce.pricing.PricingModelHolder;
import atg.commerce.util.PipelineErrorHandler;
import atg.core.util.StringUtils;
import atg.dtm.TransactionDemarcation;
import atg.dtm.TransactionDemarcationException;
import atg.repository.RepositoryException;
import atg.repository.RepositoryItem;
import atg.siebel.catalog.SiebelCatalogAttribute;
import atg.siebel.catalog.SiebelCatalogProduct;
import atg.siebel.catalog.SiebelCatalogRelationship;
import atg.siebel.catalog.SiebelCatalogTools;
import atg.siebel.order.SiebelAttribute;
import atg.siebel.order.SiebelAttributeManager;
import atg.siebel.order.SiebelCommerceItem;
import atg.siebel.order.SiebelCommerceItemManager;
import atg.siebel.order.SiebelConstants;
import atg.siebel.order.SiebelOrderTools;
import atg.siebel.profile.SiebelProfileTools;

/**
 * This class extends the PurchaseProcessHelper to add Siebel functionality that
 * add items to the order. Adding a Siebel item can sometimes result in a tree of
 * items being added to the order depending on the product type and the product tree
 * defaults. It also deals with required product attributes.
 *
 * @author Patrick Mc Erlean
 * @version $Id: //product/Siebel/version/11.2/src/atg/siebel/order/purchase/SiebelPurchaseProcessHelper.java#2 $$Change: 1194813 $
 * @updated $DateTime: 2015/09/10 08:26:24 $$Author: saysyed $
 */

public class SiebelPurchaseProcessHelper extends PurchaseProcessHelper
{
  //----------------------------------------------------------------------------------
  // Class version string
  //----------------------------------------------------------------------------------

  public static String CLASS_VERSION = "$Id: //product/Siebel/version/11.2/src/atg/siebel/order/purchase/SiebelPurchaseProcessHelper.java#2 $$Change: 1194813 $";

  //----------------------------------------------------------------------------------
  // Constants
  //----------------------------------------------------------------------------------

  //----------------------------------------------------------------------------------
  // Member Variables
  //----------------------------------------------------------------------------------

  //----------------------------------------------------------------------------------
  // Properties
  //----------------------------------------------------------------------------------

  //----------------------------------------------------------------------------------
  // siebelAttributeManager

  private SiebelAttributeManager mSiebelAttributeManager;

  /**
   * Returns the property siebelAttributeManager
   *
   * @return the siebelAttributeManager property value
   */

  public SiebelAttributeManager getSiebelAttributeManager()
  {
    return mSiebelAttributeManager;
  }

  /**
   * Sets the property siebelAttributeManager
   *
   * @param pSiebelAttributeManager the property value
   */

  public void setSiebelAttributeManager (SiebelAttributeManager pSiebelAttributeManager)
  {
    mSiebelAttributeManager = pSiebelAttributeManager;
  }
  
  // -------------------------------------
  // property: proceedToCheckoutSuccessUrl
  protected String mProceedToCheckoutSuccessUrl = "/siebel/checkout/checkout.jsp";

  public String getProceedToCheckoutSuccessUrl() 
  {
    return mProceedToCheckoutSuccessUrl;
  }

  public void setProceedToCheckoutSuccessUrl(
      String pProceedToCheckoutSuccessUrl) 
  {
    mProceedToCheckoutSuccessUrl = pProceedToCheckoutSuccessUrl;
  }

  // -------------------------------------
  // property: loginOrRegisterUrl
  protected String mLoginOrRegisterUrl = "/siebel/index.jsp";

  public String getLoginOrRegisterUrl() 
  {
    return mLoginOrRegisterUrl;
  }

  public void setLoginOrRegisterUrl(
      String pLoginOrRegisterUrl) 
  {
    mLoginOrRegisterUrl = pLoginOrRegisterUrl;
  }

  //----------------------------------------------------------------------------------
  // Methods
  //----------------------------------------------------------------------------------

   /**
   * Add one or more items to the order (the shopping cart). Details about
   * the items are found in the <code>pItemInfos</code> array. Items with a quantity
   * of 0 or less are not added. If the product associated with any item has a structure
   * then the structure must be retrieved from the catalog and any default child products
   * are also be added. The method also takes care of adding default product attributes.
   *
   * @param pOrder the Order to which the items will be added.
   * @param pShippingGroup the shipping group to which the items will be added.
   * @param pProfile the owner of the order, used for repricing.
   * @param pItemInfos the array of informational objects about the items to add.
   * @param pUserLocale the locale of the user.
   * @param pCatalogKey the key of the catalog of the items.
   * @param pUserPricingModels the promotions for the user
   * @param pErrorHandler the object that will handle pipelne errors.
   * @return the list of newly created commerce item ids.
   * @throws CommerceException if an error occurs.
   */

  public List addItemsToOrder
  (
    Order pOrder,
    ShippingGroup pShippingGroup,
    RepositoryItem pProfile,
    AddCommerceItemInfo[] pItemInfos,
    Locale pUserLocale,
    String pCatalogKey,
    PricingModelHolder pUserPricingModels,
    PipelineErrorHandler pErrorHandler,
    Map pExtraParameters)
    throws CommerceException
  {
    List itemsAdded = null;
    TransactionDemarcation transactionDemarcation = null;
    SiebelAddCommerceItemInfo itemInfo = null;
    ArrayList<SiebelCommerceItem> commerceItems = null;
    SiebelCommerceItem commerceItem = null;
    ShippingGroup shippingGroup = null;

    //BB ---- ADDED START
    CommerceItemManager cimgr = getCommerceItemManager();
    //BB ---- ADDED END

    // Initialise the items added list to be the same size as the pItemInfos list parameter.

    itemsAdded = new ArrayList<SiebelCommerceItem> (pItemInfos.length);

    // Sync on the order.

    synchronized (pOrder)
    {
      // Ensure a transaction is present.

      transactionDemarcation = new TransactionDemarcation();

      boolean rollback = true;

      try
      {
        transactionDemarcation.begin (getTransactionManager(), TransactionDemarcation.REQUIRED);

        // Process the intem to be added.

        for (int index = 0; index < pItemInfos.length; index++)
        {
          // Get the next item to add.

          itemInfo = (SiebelAddCommerceItemInfo) pItemInfos[index];

          // Check that the quantity is non-zero.

          if (itemInfo.getQuantity() > 0)
          {
            commerceItems = processSiebelProduct (itemInfo, pCatalogKey);

            for (int commerceItemIndex = 0; commerceItemIndex < commerceItems.size(); commerceItemIndex++)
            {
              // Get the next commerce item

              commerceItem = commerceItems.get (commerceItemIndex);

              //BB ---- ADDED START

              commerceItem = (SiebelCommerceItem) cimgr.addItemToOrder(pOrder, commerceItem);
              //BB ---- ADDED END
              // Set the shipping group

              shippingGroup = getShippingGroupForItem (pOrder, itemInfo, pShippingGroup, pCatalogKey);
              addItemToShippingGroup (commerceItem, itemInfo, pOrder, shippingGroup);

              // Process the gift additions

              processGiftAddition (commerceItem, itemInfo, pOrder, pProfile, shippingGroup);

              // Add the commerce item to the added items list

              itemsAdded.add (commerceItem);
            }
          }
        }

        // Reprice the whole order once after all the items have been added.

        runProcessRepriceOrder(getAddItemToOrderPricingOp(), pOrder, pUserPricingModels,
                                       pUserLocale, pProfile, pExtraParameters, pErrorHandler);

        if (isTransactionMarkedAsRollBack())
        {
          Object[] args = { pOrder.getId() };
          throw new CommerceException (MessageFormat.format (SiebelConstants.ERROR_REPRICING_ORDER_AFTER_ADD_ITEM, args));
        }

        // Send a scenario event for each new item only if there were no earlier errors.

        for (int index = 0; index < itemsAdded.size(); index++)
        {
          runProcessSendScenarioEvent (pOrder, (CommerceItem)itemsAdded.get(index),
                                        pItemInfos[index].getQuantity(), ItemAddedToOrder.TYPE,
                                        pErrorHandler);
        }

        getOrderManager().updateOrder(pOrder);

        rollback = false;
      }
      catch (Exception e)
      {
        Object[] args = { pOrder.getId() };
        throw new CommerceException (MessageFormat.format (SiebelConstants.ERROR_ADDING_ITEM_TO_ORDER, args), e);
      }
      finally
      {
        try
        {
          transactionDemarcation.end(rollback);
        }
        catch (TransactionDemarcationException e)
        {
          throw new CommerceException (e);
        }
      }
    }

    return itemsAdded;
  }

  /**
   * processSiebelProduct
   *
   * This method processes the Siebl product by adding the appropriate commerce items
   * to the order. It also takes care of adding the corresponding attributes.
   *
   * @param pItemInfo the item info required to create the commerce item.
   * @param pCatalogKey pointer to the catalog where the product exists
   *
   * @return the commerce item created
   */

  private ArrayList<SiebelCommerceItem> processSiebelProduct (SiebelAddCommerceItemInfo pItemInfo, String pCatalogKey)
                   throws CommerceException
  {
    ArrayList<SiebelCommerceItem> commerceItems = null;
    SiebelCommerceItem commerceItem = null;
    SiebelCommerceItem childCommerceItem = null;
    OrderManager orderManager = null;
    SiebelOrderTools orderTools = null;
    SiebelCommerceItemManager commerceItemManager = null;
    SiebelCatalogTools catalogTools = null;
    SiebelCatalogProduct catalogProduct = null;
    List<SiebelCatalogAttribute> productAttributes = null;
    Set<SiebelCatalogRelationship> childRelationships = null;
    Set<SiebelCatalogProduct> childProducts = null;
    SiebelAddCommerceItemInfo childItemInfo = null;

    // Initialise the tools objects.

    orderManager = getOrderManager();
    orderTools = (SiebelOrderTools) orderManager.getOrderTools();

    if (orderTools == null)
    {
      throw new CommerceException (SiebelConstants.INVALID_ORDER_MANAGER_PARAMETER);
    }

    catalogTools = (SiebelCatalogTools) orderTools.getCatalogTools();

    // Get the product details.

    try
    {
      catalogProduct = catalogTools.getProductDetails (pItemInfo.getProductId());
    }
    catch (RepositoryException e)
    {
      throw new CommerceException(e);
    }
    catch (PropertyNotFoundException e)
    {
      throw new CommerceException(e);
    }

    // Get the product attributes.

    productAttributes = catalogProduct.getAttributes();

    // Initialise the commerce items.

    commerceItems = new ArrayList<SiebelCommerceItem>();

    // Check the product type.

    if (catalogProduct.getProductType().equalsIgnoreCase (SiebelCatalogTools.M_SIMPLE_PRODUCT))
    {
      // Simple product. Create siebel commerce item with the specified quantity.

      commerceItem = createSiebelCommerceItem (pItemInfo, null, pCatalogKey, pItemInfo.getQuantity());
      commerceItem.setActionCode(SiebelCommerceItem.M_ACTION_CODE_ADD);
      // Add the item to the list

      commerceItems.add (commerceItem);
    }
    else if (catalogProduct.getProductType().equalsIgnoreCase (SiebelCatalogTools.M_SIMPLE_PRODUCT_WITH_ATTRIBUTES))
    {
      // Simple product with attributes. Need a commerce item for each. Create all attributes.

      for (int index = 0; index < pItemInfo.getQuantity(); index++)
      {
        // Create the Siebel commerce item.

        commerceItem = createSiebelCommerceItem (pItemInfo, productAttributes, pCatalogKey, 1);
        commerceItem.setActionCode(SiebelCommerceItem.M_ACTION_CODE_ADD);
        // Add the commerce item to the list.

        commerceItems.add (commerceItem);
      }
    }
    else if (catalogProduct.getProductType().equalsIgnoreCase (SiebelCatalogTools.M_SIMPLE_PRODUCT_BUNDLE))
    {
      // Simple product bundle. Need a commerce item for each if quantity is greater than 1.
      // Also need commerce items for the children. Process attributes on all items.

      for (int index = 0; index < pItemInfo.getQuantity(); index++)
      {
        // Create the Siebel commerce item.

        commerceItem = createSiebelCommerceItem (pItemInfo, productAttributes, pCatalogKey, 1);
        commerceItem.setActionCode(SiebelCommerceItem.M_ACTION_CODE_ADD);
        // Get the child products

        childRelationships = catalogProduct.getChildRelationships();
        
        for (SiebelCatalogRelationship relationship : childRelationships)
        {
          
          // ******************************************************
          // TODO This will probably need to be re-worked. At the moment 
          // the code is adding all child products of the relationship with 
          // a default Quantity of default cardinality. There could potentially
          // be multiple child products and we should probably be only adding 
          // 1 of these products by default????
          
          int defaultCardinality = relationship.getDefaultCardinality();
          
          childProducts = relationship.getChildProducts();
          
          for (SiebelCatalogProduct childProduct : relationship.getChildProducts())
          {
            // Set the child item info from the child product details

            childItemInfo = new SiebelAddCommerceItemInfo();

            childItemInfo.setCatalogRefId (childProduct.getId());
            childItemInfo.setProductId (childProduct.getId());
            childItemInfo.setCommerceItemType (pItemInfo.getCommerceItemType());
            childItemInfo.setShippingGroupType (pItemInfo.getShippingGroupType());
            childItemInfo.setSiteId (pItemInfo.getSiteId());
            childItemInfo.setGiftlistId (pItemInfo.getGiftlistId());
            childItemInfo.setGiftlistItemId (pItemInfo.getGiftlistItemId());
            
            // Create the child product commerce item.

            childCommerceItem = createSiebelCommerceItem (childItemInfo,
                childProduct.getAttributes(), pCatalogKey, defaultCardinality);
            childCommerceItem.setParentRelationshipId(relationship.getRelationshipId());

            // Add the child commerce item to the parent.

            commerceItem.addCommerceItem (childCommerceItem);
          }
          
          // End of section that needs re-work
          // ******************************************************
        }

        // Add the commerce item to the list.

        commerceItems.add (commerceItem);
      }
    }
    else if (catalogProduct.getProductType().equalsIgnoreCase (SiebelCatalogTools.M_CONFIGURABLE_PRODUCT))
    {
      // Configurable product. Need a commerce item for each. Process attributes.

      for (int index = 0; index < pItemInfo.getQuantity(); index++)
      {
        // Create the Siebel commerce item.

        commerceItem = createSiebelCommerceItem (pItemInfo, productAttributes, pCatalogKey, 1);
        commerceItem.setActionCode(SiebelCommerceItem.M_ACTION_CODE_ADD);
        // Add the commerce item to the list.

        commerceItems.add (commerceItem);
      }
    }
    else if (catalogProduct.getProductType().equalsIgnoreCase (SiebelCatalogTools.M_PROMOTION))
    {
      // Promotion. Need a commerce item for each.

      for (int index = 0; index < pItemInfo.getQuantity(); index++)
      {
        // Create the Siebel commerce item.

        commerceItem = createSiebelCommerceItem (pItemInfo, null, pCatalogKey, 1);
        commerceItem.setActionCode(SiebelCommerceItem.M_ACTION_CODE_ADD);
        // Add the commerce item to the list.

        commerceItems.add (commerceItem);
      }
    }
    else
    {
      throw new CommerceException("Unknown product type");
    }

    // Return the commerce item.

    return commerceItems;
  }

    /**
     * createSiebelCommerceItem
     *
     * This method creates a siebel commerce item and any associated attributes.
     *
     * @param pItemInfo the item info of the item to add.
     * @param productAttributes the list of attributes for the product.
     * @param pCatalogKey the catalog identifier.
     *
     * @return CommerceItem that was created
     *
     * @exception CommerceException if there was an error while executing the code
     */

    public SiebelCommerceItem createSiebelCommerceItem (SiebelAddCommerceItemInfo pItemInfo,
                                                             List<SiebelCatalogAttribute> productAttributes,
                                                             String pCatalogKey,
                                                             long pQuantity) throws CommerceException
    {
      SiebelCommerceItemManager commerceItemManager = null;
      SiebelAttributeManager attributeManager = null;
      SiebelCommerceItem commerceItem = null;
      SiebelAttribute attribute = null;
      ArrayList<SiebelCatalogAttribute> catalogAttributes = null;
      SiebelCatalogAttribute catalogAttribute = null;

      // Get the commerce item manager and attribute manager.

      commerceItemManager = (SiebelCommerceItemManager) getCommerceItemManager();
      attributeManager = getSiebelAttributeManager();

      try
      {
        // Set the quantity.

        pItemInfo.setQuantity (pQuantity);

        // Create a commerce item.

        commerceItem = createCommerceItem (pItemInfo, pCatalogKey);

        setCommerceItemProperties (commerceItem, pItemInfo);

        // Check that there are attributes.

        if ((productAttributes != null) && (productAttributes.size() > 0))
        {
          // Create an attribute item for each attribute in the product definition.

          for (int attributeIndex = 0; attributeIndex < productAttributes.size(); attributeIndex++)
          {
              // Get the next attribute

              catalogAttribute = productAttributes.get (attributeIndex);
              
              // Avoid fetching the attribute which has hidden flag set as true
              if (!catalogAttribute.getHiddenFlag()) {

                // Create an attribute.
                // For propTypeCD , use the data type of the catalog attribute
                attribute = attributeManager.createSiebelAttribute (catalogAttribute.getAttributeDefinitionId(),
                                              catalogAttribute.getAttributeName(),
                                              SiebelAttribute.M_ACTION_CODE_ADD, catalogAttribute.getDefaultValue(), catalogAttribute.getValueType());

                // Add the attribute to the commerce it.

                commerceItemManager.addAttributeToItem (commerceItem, attribute);
              }
            }
          }
        }
        catch (CommerceException e)
        {
          throw (e);
        }

        // Return the commerce item.

        return commerceItem;
      }

    /**
     * createCommerceItem
     *
     * This method uses the commerce item manager to create a SiebelCommerceItem.
     *
     * @param pItemInfo the details for the commerce item creation
     * @param pCatalogKey the catalog key reference (catalog id) for the new item
     *
     * @return CommerceItem that was created
     * @exception CommerceException if there was an error while executing the code
     */

    protected SiebelCommerceItem createCommerceItem (SiebelAddCommerceItemInfo pItemInfo, String pCatalogKey)
                   throws CommerceException
    {
      CommerceItemManager commerceItemManager = null;
      SiebelCommerceItem commerceItem = null;
      String siteId = null;

      // Get the commerce item manager.

      commerceItemManager = getCommerceItemManager();

      // Check that the site id is not blank.

      siteId = pItemInfo.getSiteId();

      if (StringUtils.isBlank(siteId))
      {
        siteId = null;
      }

      // Use the commerce item manager to create the commerce item.

      commerceItem = (SiebelCommerceItem) commerceItemManager.createCommerceItem (pItemInfo.getCommerceItemType(),
                                                                 pItemInfo.getCatalogRefId(), null, pItemInfo.getProductId(),
                                                                 null, pItemInfo.getQuantity(),
                                                                 pCatalogKey, null, siteId, null);

      // Return the commerce item.

      return commerceItem;
    }

  /**
   * addCommerceItemToOrder
   *
   * This method uses the commerce item manager to add a SiebelCommerceItem to the order.
   *
   * @param pOrder the order item
   * @param pCommerceItem the SiebelCommerceItem to add
   *
   * @return CommerceItem that was added
   * @exception CommerceException if there was an error while executing the code
   */

  protected SiebelCommerceItem addCommerceItemToOrder (Order pOrder, SiebelCommerceItem pCommerceItem)
               throws CommerceException
  {
    SiebelCommerceItem commerceItem = null;
    CommerceItemManager commerceItemManager = null;

    // Get the commerce item manager.

    commerceItemManager = getCommerceItemManager();

    // Add the item to the order.

    commerceItem = (SiebelCommerceItem) commerceItemManager.addItemToOrder(pOrder, pCommerceItem);

    // Return the commerce item

    return commerceItem;
  }
  
}
