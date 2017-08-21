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

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import com.siebel.ordermanagement.quote.data.ListOfQuoteItem;
import com.siebel.ordermanagement.quote.data.Quote;
import com.siebel.ordermanagement.quote.data.QuoteItem;

import atg.beans.PropertyNotFoundException;
import atg.commerce.CommerceException;
import atg.commerce.catalog.CatalogTools;
import atg.commerce.order.AuxiliaryData;
import atg.commerce.order.CommerceItem;
import atg.commerce.order.CommerceItemManager;
import atg.commerce.order.InvalidParameterException;
import atg.commerce.order.InvalidTypeException;
import atg.commerce.order.ObjectCreationException;
import atg.commerce.order.ObjectRemovalException;
import atg.commerce.order.Order;
import atg.commerce.order.OrderTools;
import atg.commerce.order.SubSkuCommerceItem;
import atg.commerce.pricing.ItemPriceInfo;
import atg.core.util.ResourceUtils;
import atg.multisite.SiteContextManager;
import atg.repository.RepositoryException;
import atg.siebel.catalog.SiebelCatalogProduct;
import atg.siebel.catalog.SiebelCatalogTools;
import atg.siebel.configurator.Constants;
import atg.siebel.configurator.ProductConfigInstance;
import atg.siebel.pricing.SiebelItemPriceInfo;

/**
 * This class extends the CommerceItemManager to add SiebelCommerceItem
 * functionality.
 * 
 * @author Patrick Mc Erlean
 * @version $Id:
 *          //product/Siebel/main/src/atg/siebel/order/SiebelCommerceItemManager
 *          .java#1 $$Change: 1194813 $
 * @updated $DateTime: 2015/09/10 08:26:24 $$Author: saysyed $
 */

public class SiebelCommerceItemManager
  extends CommerceItemManager {
  // ----------------------------------------------------------------------------------
  // Class version string
  // ----------------------------------------------------------------------------------

  public static String CLASS_VERSION =
    "$Id: //product/Siebel/version/11.2/src/atg/siebel/order/SiebelCommerceItemManager.java#2 $$Change: 1194813 $";

  // ----------------------------------------------------------------------------------
  // Constants
  // ----------------------------------------------------------------------------------

  // ----------------------------------------------------------------------------------
  // Member Variables
  // ----------------------------------------------------------------------------------

  // ----------------------------------------------------------------------------------
  // Constructor
  // ----------------------------------------------------------------------------------

  /**
   * Constructs a SiebelCommerceItemManager object.
   */

  public SiebelCommerceItemManager() {
  }

  // ----------------------------------------------------------------------------------
  // Properties
  // ----------------------------------------------------------------------------------

  // ----------------------------------------------------------------------------------
  // property: handlingInstructionManager

  private SiebelAttributeManager mSiebelAttributeManager = null;

  /**
   * Returns the siebel attribute manager
   * 
   * @return the siebel attribute manager
   */

  public SiebelAttributeManager getSiebelAttributeManager() {
    return mSiebelAttributeManager;
  }

  /**
   * Sets the siebel attribute manager
   * 
   * @param pSiebelAttributeManager
   *          the siebel attribute manager to set
   */

  public void setSiebelAttributeManager(
    SiebelAttributeManager pSiebelAttributeManager) {
    mSiebelAttributeManager = pSiebelAttributeManager;
  }

  // ----------------------------------------------------------------------------------
  // Methods
  // ----------------------------------------------------------------------------------

  /**
   * createCommerceItem
   * 
   * This method over-rides the base method to take account of the Siebel
   * integration requirements. Siebel only uses products. It doesn't use SKUs.
   * 
   * @param pItemType
   *          the name that is mapped in the OrderTools.properties file to the
   *          class of the desired type to create
   * @param pCatalogRefId
   *          the id of the catalog object reference that this CommerceItem
   *          represents
   * @param pCatalogRef
   *          the catalog object reference that this CommerceItem represents
   * @param pProductId
   *          the product id that this CommerceItem references
   * @param pProductRef
   *          the product object reference that this CommerceItem represents
   * @param pQuantity
   *          the quantity that this CommerceItem should represent
   * @param pCatalogKey
   *          the catalog key reference (locale) for this CommerceItem
   * @param pCatalogId
   *          the id of the catalog repository item that this item is in
   * @param pSiteId
   *          the id of the site that this item is associated with
   * @param pPriceInfo
   *          the ItemPriceInfo object for this CommerceItem
   * @return the CommerceItem which was created
   * @exception ObjectCreationException
   *              if the instantiation of an object fails
   * @exception InvalidParameterException
   *              thrown if any of the parameters are null
   * @see atg.commerce.order.OrderTools#getDefaultCommerceItemType()
   */
  public CommerceItem createCommerceItem (String pItemType,
    String pCatalogRefId, Object pCatalogRef, String pProductId,
    Object pProductRef, long pQuantity, String pCatalogKey, String pCatalogId,
    String pSiteId, ItemPriceInfo pPriceInfo) throws CommerceException
  {
    OrderTools orderTools = null;
    CatalogTools catalogTools = null;
    SiebelItemPriceInfo itemPriceInfo = null;
    Object productReference = null;
    CommerceItem commerceItem = null;
    AuxiliaryData auxiliaryData = null;
    String siteId = null;

    // Check for null parameters

    if (pCatalogKey == null) {
      throw new InvalidParameterException(SiebelConstants.INVALID_CATALOG_KEY);
    }

    if (pProductId == null) {
      throw new InvalidParameterException(SiebelConstants.INVALID_PRODUCT_ID);
    }

    if (pQuantity <= 0) {
      throw new InvalidParameterException(SiebelConstants.INVALID_QUANTITY);
    }

    // Initialise the tools objects.

    orderTools = getOrderTools();

    if (orderTools == null) {
      throw new CommerceException("");
    }

    catalogTools = orderTools.getCatalogTools();

    // Check if an item price info object was passed in.

    itemPriceInfo = (SiebelItemPriceInfo) pPriceInfo;

    if (itemPriceInfo == null) {
      // Create a default item price info object for the commerce item.

      try {
        itemPriceInfo =
          (SiebelItemPriceInfo) orderTools.getDefaultItemPriceInfoClass().newInstance();
      } catch (IllegalAccessException e) {
        throw new CommerceException(e);
      } catch (InstantiationException e) {
        throw new CommerceException(e);
      }
    }

    // Check if a product reference object was passed in.

    productReference = pProductRef;

    if (productReference == null) {
      // Get reference object using catalog tools. The catalog key must be
      // passed.

      try {
        productReference = catalogTools.findProduct(pProductId, pCatalogKey);
      } catch (RepositoryException e) {
        throw new CommerceException(e);
      }
    }

    // Create the SiebelCommerceItem.

    try {
      commerceItem = orderTools.createCommerceItem(pItemType);
    } catch (InvalidTypeException e) {
      Object[] msgArgs = { pItemType };
      throw new ObjectCreationException(MessageFormat.format(
        SiebelConstants.INVALID_COMMERCE_ITEM_NAME, msgArgs), e);
    }

    // Set the catalog id in the item

    if (orderTools.isAssignCatalogInCommerceItem()) {
      commerceItem.setCatalogId(pCatalogId);
    }

    // Set the other properties.

    commerceItem.setCatalogRefId(pProductId); // Siebel doesn't use SKUs so set
                                              // this to Product Id
    commerceItem.setCatalogKey(pCatalogKey);
    commerceItem.setQuantity(pQuantity);
    commerceItem.setPriceInfo(itemPriceInfo);

    // Set the auxilary data. Important for Siebel integration.

    auxiliaryData = commerceItem.getAuxiliaryData();

    auxiliaryData.setCatalogRef(pCatalogRef);
    auxiliaryData.setProductId(pProductId);
    auxiliaryData.setProductRef(productReference);

    // Check if the site id has been specified.

    siteId = pSiteId;

    if (siteId == null) {
      siteId = SiteContextManager.getCurrentSiteId();
    }

    auxiliaryData.setSiteId(siteId);

    // Return the commerce item.

    return commerceItem;
  }

  /**
   * additemToOrder
   * 
   * This method overrides the out of the box method to ensure that items are
   * never merged (because of a matching catalog reference id), but instead are
   * always added as separate items.
   * 
   * @param pOrder
   *          the Order to add the CommerceItem to
   * @param pItem
   *          the CommerceItem to add to the Order
   * @return the CommerceItem which contains the item just added. Always pItem
   *         in this case
   * 
   * @exception InvalidParameterException
   *              thrown if any of the parameters are null
   * @exception atg.commerce.IncompatibleSitesException
   *              thrown if the sites for the new item and the order's old items
   *              can not share the cart
   * @exception CommerceException
   *              thrown if a CommerceItem is added and a
   *              DuplicateCommerceItemException is caught. This is an internal
   *              error and will get thrown only if the id of the CommerceItem
   *              being added already exists in the order. This should not
   *              happen under normal circumstances.
   */

  public CommerceItem addItemToOrder(Order pOrder, CommerceItem pItem)
    throws CommerceException, InvalidParameterException {
    // Check for null parameters

    if (pOrder == null) {
      throw new InvalidParameterException(
        SiebelConstants.INVALID_ORDER_PARAMETER);
    }

    if (pItem == null) {
      throw new InvalidParameterException(
        SiebelConstants.INVALID_COMMERCE_ITEM_PARAMETER);
    }

    // Add as a separate item.

    return addAsSeparateItemToOrder(pOrder, pItem);
  }

  /**
   * addAttributeToItem
   * 
   * This method adds an attribute to a SiebelCommerceItem.
   * 
   * @param pItem
   *          the SiebelCommerceItem
   * @param pAttribute
   *          the attribute to add to the SiebelCommerceItem
   * 
   * @exception InvalidParameterException
   *              thrown if any of the parameters are null
   * @exception CommerceException
   *              thrown if a CommerceItem is added and a
   *              DuplicateCommerceItemException is caught. This is an internal
   *              error and will get thrown only if the id of the CommerceItem
   *              being added already exists in the order. This should not
   *              happen under normal circumstances.
   */

  public void addAttributeToItem(SiebelCommerceItem pItem,
    SiebelAttribute pAttribute) throws CommerceException,
    InvalidParameterException {
    // Check for null parameters

    if (pItem == null) {
      throw new InvalidParameterException(
        SiebelConstants.INVALID_ORDER_PARAMETER);
    }

    if (pAttribute == null) {
      throw new InvalidParameterException(
        SiebelConstants.INVALID_COMMERCE_ITEM_PARAMETER);
    }
    

    // Add the attribute to the commerce item.

    try {
      pItem.addSiebelAttribute(pAttribute);
    } catch (DuplicateAttributeException e) {
      throw new CommerceException(e);
    }
  }

  /**
   * removeItemFromOrder
   * 
   * This method over-rides the corresponding method from CommerceItemManager.
   * It handles the removal of the commerce item tree.
   * 
   * @param pOrder
   *          the Order to remove the CommerceItem fom
   * @param pCommerceItemId
   *          the id of the CommerceItem to remove from the Order
   * @exception InvalidParameterException
   *              thrown if any of the parameters are null
   * @exception ObjectRemovalException
   *              thrown if the CommerceItem cannot be removed
   */

  public void removeItemFromOrder(Order pOrder, String pCommerceItemId)
    throws CommerceException {
    SiebelCommerceItem commerceItem = null;
    

    // Check for null parameters

    if (pOrder == null) {
      throw new InvalidParameterException(
        SiebelConstants.INVALID_ORDER_PARAMETER);
    }

    if (pCommerceItemId == null) {
      throw new InvalidParameterException(
        SiebelConstants.INVALID_COMMERCE_ITEM_PARAMETER);
    }

    // Get the commerce item

    commerceItem = (SiebelCommerceItem) pOrder.getCommerceItem(pCommerceItemId);

    if (commerceItem == null) {
      throw new InvalidParameterException(
        SiebelConstants.INVALID_COMMERCE_ITEM_PARAMETER);
    }


    // Remove the attributes from the commerce item.

    commerceItem.removeAllAttributes();

    // Remove ShippingGroupRelationships, also removes the HandlingInstructions

    removeAllRelationshipsFromCommerceItem(pOrder, pCommerceItemId);

    // remove the item from the order

    pOrder.removeCommerceItem(pCommerceItemId);
  }

  /**
   * @param pDefaultCommerceItemType
   * @param pRootInstance
   * @param pCatalogKey
   * @return
   * @throws CommerceException
   */
  public SiebelCommerceItem createCommerceItem(String pDefaultCommerceItemType,
      ProductConfigInstance pRootInstance, String pCatalogKey)
      throws CommerceException {

    SiebelCommerceItem siebelCommerceItem = (SiebelCommerceItem) createCommerceItem(
        pDefaultCommerceItemType, pRootInstance.getProductId(), null,
        pRootInstance.getProductId(), null,
        Long.valueOf(pRootInstance.getQuantity()), pCatalogKey, null, null,
        null);

    // Set the Siebel specific properties.
    siebelCommerceItem.setActionCode(SiebelOrderTools.ACTION_CODE_ADD);
    return siebelCommerceItem;
  }

  
  /* (non-Javadoc)
   * @see atg.commerce.order.CommerceItemManager#mergeOrdersCopyCommerceItem(atg.commerce.order.Order, atg.commerce.order.Order, atg.commerce.order.CommerceItem)
   */
  @Override
  protected CommerceItem mergeOrdersCopyCommerceItem(Order pSrcOrder,
      Order pDstOrder, CommerceItem pItem) throws CommerceException {
    
    // Note - although source & destination order objects are passed into 
    // this method we don't use them - this is in keeping with the superclass
    // method.
    
    if (isLoggingDebug()) {
      logDebug("Entered mergeOrdersCopyCommerceItem() : pItem == "+pItem 
          + ": source order id == "+pSrcOrder.getId() 
          + ": destination order id == "+pDstOrder.getId());
    }
    
    if (pItem == null) {
      throw new InvalidParameterException(SiebelConstants.INVALID_COMMERCE_ITEM_PARAMETER);
    }
    
    if (!(pItem instanceof SiebelCommerceItem)) {
      return super.mergeOrdersCopyCommerceItem(pSrcOrder, pDstOrder, pItem);
    }

    if (isLoggingDebug()) {
      logDebug("copying commerce item id " + pItem.getId() + " for order merger");
    }  
    
    // Create a empty hash map to store the old commerce item id and its new commerce item id
    HashMap<String,String> commIdMap=new HashMap<String,String>();
    SiebelCommerceItem itemCopy = copyCommerceItem((SiebelCommerceItem) pItem,commIdMap);
    
    if (isLoggingDebug()) {
      logDebug("Leaving mergeOrdersCopyCommerceItem() : itemCopy == " + itemCopy);
    } 
    return itemCopy;
  }
  
  /**
   * @param pSourceItem
   * @return
   * @throws CommerceException
   */
  protected SiebelCommerceItem copyCommerceItem(SiebelCommerceItem pSourceItem,HashMap<String,String> pCommIdMap) throws CommerceException {

    if (isLoggingDebug()) {
      logDebug("Entered copyCommerceItem : pSourceItem == " + pSourceItem);
    }

    if (pSourceItem == null) {
      logError("Null object passed to copyCommerceItem()");
      throw new InvalidParameterException(SiebelConstants.INVALID_COMMERCE_ITEM_PARAMETER);
    }

    AuxiliaryData aux = pSourceItem.getAuxiliaryData();

    SiebelCommerceItem item = (SiebelCommerceItem) createCommerceItem(
        pSourceItem.getCommerceItemClassType(), pSourceItem.getCatalogRefId(),
        aux.getCatalogRef(), aux.getProductId(), aux.getProductRef(),
        pSourceItem.getQuantity(), pSourceItem.getCatalogKey(),
        pSourceItem.getCatalogId(), aux.getSiteId(), null);
    // Put the old commerce item id as key and new commerce item id as value in the map
    pCommIdMap.put(pSourceItem.getId(), item.getId());
    // copy over any attributes
    List<SiebelAttribute> attributes = pSourceItem.getSiebelAttributes();
    for (SiebelAttribute attribute : attributes) {
      item.addSiebelAttribute(getSiebelAttributeManager().copySiebelAttribute(
          attribute));
    }

    // copy over any child commerce items
    List childCommerceItems = pSourceItem.getCommerceItems();
    if (childCommerceItems != null && !childCommerceItems.isEmpty()) {
      Iterator iter = childCommerceItems.iterator();
      while (iter.hasNext()) {
        Object next = iter.next();
        if (next instanceof SiebelCommerceItem) {
          item.addCommerceItem(copyCommerceItem((SiebelCommerceItem) next,pCommIdMap));
        }
      }
    }
    
    // Copy over parentRelationshipId
    item.setParentRelationshipId(pSourceItem.getParentRelationshipId());
    
    // Copy over action code
    item.setActionCode(pSourceItem.getActionCode());
    
    // Copy over domainItemId
    item.setDomainItemId(pSourceItem.getDomainItemId());
    
    // Copy over configured
    item.setConfigured(pSourceItem.isConfigured());
    
    // Copy over asset id
    item.setAssetNumber(pSourceItem.getAssetNumber());
    
    // Copy over quote item id
    item.setQuoteItemId(pSourceItem.getQuoteItemId());
    
    // Copy over asset integration id
    item.setAssetIntegrationId(pSourceItem.getAssetIntegrationId());
    
    // Copy over commerce item type
    item.setCommerceItemType(pSourceItem.getCommerceItemType());
    
    // Copy over Prod promo rule id
    item.setProdPromoRuleId(pSourceItem.getProdPromoRuleId());
    
    // Copy over Prod promo instance id
    // Get the latest value of parent commerce item id from the map
    String commItemId=pCommIdMap.get(pSourceItem.getProdPromoInstanceId());
    item.setProdPromoInstanceId(commItemId);
    
    if (isLoggingDebug()) {
      logDebug("Leaving copyCommerceItem : item == " + item);
    } 
    return item;
  }
 
  /**
   * Method to check if the product is configurable or not
   * 
   * @param commerceItems
   * @return true if non configurable false if configurable
   * @throws RepositoryException
   * @throws PropertyNotFoundException
   */
  public boolean isNonConfigurableProduct(
      ArrayList<SiebelCommerceItem> commerceItems) throws RepositoryException,
      PropertyNotFoundException {
    String prodType = "";
    boolean returnValue = false;
    // Get the product id from the commerce item
    String productId = commerceItems.get(0).getAuxiliaryData().getProductId();
    // Retrieve the product type from product catalog
    SiebelCatalogTools catalogtools = (SiebelCatalogTools) getOrderTools()
        .getCatalogTools();
    SiebelCatalogProduct product = catalogtools.getProductDetails(productId);
    prodType = product.getProductType();
    if (Constants.PROD_TYPE_SIMPLE.equalsIgnoreCase(prodType)) {
      returnValue = true;
    }
    return returnValue;
  }
}
