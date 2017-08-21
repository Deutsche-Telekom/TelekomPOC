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

import java.io.IOException;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.ResourceBundle;

import javax.servlet.ServletException;

import atg.beans.PropertyNotFoundException;
import atg.commerce.CommerceException;
import atg.commerce.order.Order;
import atg.commerce.order.purchase.AddCommerceItemInfo;
import atg.commerce.order.purchase.CartModifierFormHandler;
import atg.core.i18n.LayeredResourceBundle;
import atg.core.util.StringUtils;
import atg.droplet.DropletException;
import atg.droplet.DropletFormException;
import atg.repository.RepositoryException;
import atg.servlet.DynamoHttpServletRequest;
import atg.servlet.DynamoHttpServletResponse;
import atg.siebel.asset.SiebelAssetManager;
import atg.siebel.configurator.ProductConfigInstanceCache;
import atg.siebel.order.SiebelCommerceItem;
import atg.siebel.order.SiebelCommerceItemManager;
import atg.siebel.order.SiebelOrderImpl;
import atg.siebel.order.SiebelOrderTools;
import atg.siebel.validation.SiebelValidator;

/**
 * This formhandler extends the base CartModifierFormHandler to take account of the
 * additional functionality required by the Siebel integration. Siebel has additional
 * product types, some of which include a product tree. This form handler takes care
 * of adding all of the default products in the tree belonging to the parent product.
 *
 * @author Patrick Mc Erlean
 * @version $Id: //product/Siebel/version/11.2/src/atg/siebel/order/purchase/SiebelCartModifierFormHandler.java#2 $$Change: 1194813 $
 * @updated $DateTime: 2015/09/10 08:26:24 $$Author: saysyed $
 */

public class SiebelCartModifierFormHandler extends CartModifierFormHandler
{
  //----------------------------------------------------------------------------------
  // Class version string
  //----------------------------------------------------------------------------------

  public static String CLASS_VERSION = "$Id: //product/Siebel/version/11.2/src/atg/siebel/order/purchase/SiebelCartModifierFormHandler.java#2 $$Change: 1194813 $";

  //----------------------------------------------------------------------------------
  // Constants
  //----------------------------------------------------------------------------------

    public static String COMMERCE_ITEM_ID_STRING = "?commerceItemId=";
    
    //ResourceBundle Name
    private static final String M_SIEBEL_RESOURCE_BUNDLE_NAME = "atg.siebel.WebAppResources";
    
    private static final String M_SIEBEL_GENERIC_EXCEPTION_MESSAGE = "genericExceptionMessage";
    
    private static final String M_UINOTFOUND_MESSAGE = "uiNotFound";
    
    //ResourceBundle
    private static ResourceBundle sResourceBundle = LayeredResourceBundle.getBundle(M_SIEBEL_RESOURCE_BUNDLE_NAME, atg.service.dynamo.LangLicense.getLicensedDefault());
  
    //----------------------------------------------------------------------------------
  // Member Variables
  //----------------------------------------------------------------------------------

  //----------------------------------------------------------------------------------
  // Properties
  //----------------------------------------------------------------------------------
    
  // -------------------------------------
  // property: productConfigInstanceCache
  protected ProductConfigInstanceCache mProductConfigInstanceCache;

  public ProductConfigInstanceCache getProductConfigInstanceCache() {
    return mProductConfigInstanceCache;
  }

  public void setProductConfigInstanceCache(
      ProductConfigInstanceCache pConfiguratorSession) {
    this.mProductConfigInstanceCache = pConfiguratorSession;
  }
  
  //----------------------------------------------------------------------------------
  // property: orderTools

  private SiebelOrderTools mOrderTools;

  /**
   * Returns the property orderTools
   *
   * @return the orderTools property value
   */

  public SiebelOrderTools getOrderTools()
  {
    return mOrderTools;
  }

  /**
   * Sets the property orderTools
   *
   * @param pOrderTools the property value
   */

  public void setOrderTools (SiebelOrderTools pOrderTools)
  {
    mOrderTools = pOrderTools;
  }
  
  //----------------------------------------------------------------------------------
  // property: mSiebelValidator
  
  private SiebelValidator mSiebelValidator;
  
  /**
   * 
   * @return a <code>SiebelValidator</code> value
   */
  public SiebelValidator getSiebelValidator() {
    return mSiebelValidator;
  }
  
  /**
   * 
   * @param pSiebelValidator a <code>SiebelValidator</code> value
   */
  public void setSiebelValidator(SiebelValidator pSiebelValidator) {
    this.mSiebelValidator = pSiebelValidator;
  }

  //----------------------------------------------------------------------------------
  // property: mPostalCode
  private String mPostalCode;
  
  /**
   * @return a <code>String</code> value
   */
  public String getPostalCode() {
    return mPostalCode;
  }

  /**
   * @param pPostalCode a <code>String</code> value
   */
  public void setPostalCode(String pPostalCode) {
    this.mPostalCode = pPostalCode;
  }
  
  //----------------------------------------------------------------------------------
  // property: addNonConfigurableItemToOrderSuccessUrl
  private String mAddNonConfigurableItemToOrderSuccessUrl;
  
  /**
   * @return a <code>String</code> value
   */
  public String getAddNonConfigurableItemToOrderSuccessUrl() {
    return mAddNonConfigurableItemToOrderSuccessUrl;
  }

  /**
   * @param pAddNonConfigurableItemToOrderSuccessUrl a <code>String</code> value
   */
  public void setAddNonConfigurableItemToOrderSuccessUrl(String pAddNonConfigurableItemToOrderSuccessUrl) {
    this.mAddNonConfigurableItemToOrderSuccessUrl = pAddNonConfigurableItemToOrderSuccessUrl;
  }


  //----------------------------------------------------------------------------------
  // property: siebelAssetTools
  protected SiebelAssetManager sblAssetManager;
  
  public SiebelAssetManager getSiebelAssetManager() {
	return sblAssetManager;
  }

  public void setSiebelAssetManager(SiebelAssetManager pSblAssetManager) {
	this.sblAssetManager = pSblAssetManager;
  }

  /**
   * Construct or fill in default values in an <code>items</code> array containing
   * input values for the methods involved in adding items to orders.
   *
   * <p>
   * Most input validation occurs here, for example:
   * <ul>
   * <li>If the items property is non-null, items[*].quantity must be
   *     greater than or equal to zero.</li>
   * <li>If the items property is null, item quantities must be greater than zero.</li>
   * <li>Either items or catalogRefIds must be non-null, but not both.</li>
   * <li><code>validateShippingGroup</code> is called.</li>
   * </ul>
   * Quantity errors prevent further processing only if
   * <code>invalidQuantityCancelsAdd</code> is <code>true</code>.
   * </p>
   *
   * @param pRequest the servlet's request
   * @param pResponse the servlet's response
   * @param pCommerceItemType the type to use for creating new commerce items
   * @param pUseProductIds <code>true</code> if input comes from
   *                       <code>productIds</code> rather than <code>productId</code>
   * @return <code>true</code> if inputs are valid, <code>false</code> if not
   * @exception ServletException if there was an error while executing the code
   * @exception IOException if there was an error with servlet io
   *
   * @see #validateShippingGroupForAdd
   */
  protected boolean mergeItemInputForAdd(DynamoHttpServletRequest pRequest,
                                         DynamoHttpServletResponse pResponse,
                                         String pCommerceItemType,
                                         boolean pUseProductIds)
    throws ServletException, IOException
  {
    String [] skuIds = getCatalogRefIds();
    String [] productIds = getProductIds();

    if (getItems() == null) {
      // There is no items array. The form supplied input in catalogRefIds
      // and its friends. The form is adding a single item or using the
      // older style of adding multiple items. We perform sanity checks
      // on the input and convert the input to an items array.
      //

      if ((skuIds == null) || (skuIds.length == 0)) {
        String msg = formatUserMessage(MSG_NO_ITEMS_TO_ADD, pRequest, pResponse);
        String propertyPath = generatePropertyPath("catalogRefIds");
        addFormException(new DropletFormException(msg, propertyPath, MSG_NO_ITEMS_TO_ADD));
        return false;
      }

      if (pUseProductIds) {
        if ((productIds == null) || (productIds.length == 0)) {
          String msg = formatUserMessage(MSG_NO_ITEMS_TO_ADD, pRequest, pResponse);
          String propertyPath = generatePropertyPath("productIds");
          addFormException(new DropletFormException(msg, propertyPath, MSG_NO_ITEMS_TO_ADD));
          return false;
        }
        if (productIds.length != skuIds.length) {
          String msg = formatUserMessage(MSG_ERROR_ADDING_TO_ORDER, pRequest, pResponse);
          addFormException(new DropletException(msg, MSG_ERROR_ADDING_TO_ORDER));
          return false;
        }
      }

      // Allocate an items array and fill it in from other properties.
      //
      setAddItemCount(skuIds.length);
      for (int index = 0; index < skuIds.length; index++) {
        AddCommerceItemInfo input = getItems()[index];

        input.setCatalogRefId(skuIds[index].trim());

        try {
          long quantity = getQuantity(skuIds[index], pRequest, pResponse);
          if (quantity <= 0) {
            // If the quantity is 0 it is possible this is due to the fact that the item was
            // just removed by the deleteItems call. Consult the deletedSkus list and
            // determine if that sku was a part of the deleted skus. If it was we will skip
            // this error.
            //
            List deletedSkus = getDeletedSkus();
            if (deletedSkus == null || !deletedSkus.contains(skuIds[index])) {
              String msg = formatUserMessage(MSG_QUANTITY_LESSTHAN_OR_EQUALTO_ZERO, pRequest, pResponse);
              String propertyPath = generatePropertyPath("quantity");
              addFormException(new DropletFormException(msg, propertyPath, MSG_QUANTITY_LESSTHAN_OR_EQUALTO_ZERO));
              if (getInvalidQuantityCancelsAdd()) {
                return false;
              }
            }
          }
          input.setQuantity(quantity);
        }
        catch (NumberFormatException nfe) {
          // Invalid number given for quantity of item to add
          //
          String msg = formatUserMessage(MSG_INVALID_QUANTITY, pRequest, pResponse);
          String propertyPath = generatePropertyPath("quantity");
          addFormException(new DropletFormException(msg, nfe, propertyPath, MSG_INVALID_QUANTITY));
          return false;
        }

        String productId;
        if (pUseProductIds) {
          productId = productIds[index];
        }
        else {
          productId = getProductId();
        }
        input.setProductId(productId);

        input.setSiteId(getSiteId());

        input.setGiftlistId(getGiftlistId());
        input.setGiftlistItemId(getGiftlistItemId());
      }
    }
    else {
      // There is an items array. Make sure the form didn't also fill
      // in the old-style sku ID and product ID properties.
      //
      if ((skuIds != null) && (skuIds.length > 0)) {
        String msg = formatUserMessage(MSG_AMBIGUOUS_INPUT_FOR_ADD, pRequest, pResponse);
        String propertyPath = generatePropertyPath("catalogRefIds");
        addFormException(new DropletFormException(msg, propertyPath, MSG_AMBIGUOUS_INPUT_FOR_ADD));
        return false;
      }
      if (pUseProductIds) {
        if ((productIds != null) && (productIds.length > 0)) {
          String msg = formatUserMessage(MSG_AMBIGUOUS_INPUT_FOR_ADD, pRequest, pResponse);
          String propertyPath = generatePropertyPath("productIds");
          addFormException(new DropletFormException(msg, propertyPath, MSG_AMBIGUOUS_INPUT_FOR_ADD));
          return false;
        }
      }
      else if (getProductId() != null) {
        String msg = formatUserMessage(MSG_AMBIGUOUS_INPUT_FOR_ADD, pRequest, pResponse);
        String propertyPath = generatePropertyPath("productId");
        addFormException(new DropletFormException(msg, propertyPath, MSG_AMBIGUOUS_INPUT_FOR_ADD));
        return false;
      }

      // Negative quantities need error messages and may or may not kill the add operation.
      // Zero quantities do not generate messages because that's the way the form
      // tells us which array entries to skip.
      //
      long total = 0;
      for (int index = 0; index < getItems().length; index++) {
        long quantity = getItems()[index].getQuantity();
        if (quantity < 0) {
          String msg = formatUserMessage(MSG_QUANTITY_LESSTHAN_ZERO, pRequest, pResponse);
          String propertyPath = generatePropertyPath("items[" + index + "].quantity");
          addFormException(new DropletFormException(msg, propertyPath, MSG_QUANTITY_LESSTHAN_ZERO));
          if (getInvalidQuantityCancelsAdd()) {
            return false;
          }
        }
        else {
          total += quantity;
        }
      }

      // Report an error if all of the item quantities are missing or invalid.
      //
      if (total == 0) {
        if ( isLoggingDebug() ) {
          logDebug( "items array with no items to add");
        }
        String msg = formatUserMessage(MSG_NO_ITEMS_TO_ADD, pRequest, pResponse);
        String propertyPath = generatePropertyPath("items");
        addFormException(new DropletFormException(msg, propertyPath, MSG_NO_ITEMS_TO_ADD));
        return false;
      }
    }

    // Check the shipping group for the new items.
    //
    if (!validateShippingGroupForAdd(pRequest, pResponse)) {
      return false;
    }

    // Fill in values for defaultable properties if they weren't
    // specified for individual items.
    //
    for (int index = 0; index < getItems().length; index++) {
      AddCommerceItemInfo input = getItems()[index];
      if (input.getCommerceItemType() == null) {
        input.setCommerceItemType(pCommerceItemType);
      }
      if (StringUtils.isBlank(input.getSiteId())) {
        input.setSiteId(getSiteId());
      }
      //boolean ok = mergeValueDictionaries(getValue(), input.getValue(), index, pRequest, pResponse, null);
//      if (!ok) {
//        return false;
//      }
    }

    return true;
  }
  
  
  /**
   * doAddItemsToOrder
   *
   * Over-rides the CartModifierFormHandler method to append the commerce item(s) to
   * the success URL.
   *
   * @param pRequest the servlet's request
   * @param pResponse the servlet's response
   * @exception ServletException if there was an error while executing the code
   * @exception IOException if there was an error with servlet io
   */

  protected void doAddItemsToOrder (DynamoHttpServletRequest pRequest, DynamoHttpServletResponse pResponse)
      throws ServletException, IOException
  {
    ArrayList<SiebelCommerceItem>  commerceItems = null;
    Order order = null;
    String successUrl = null;

    // Get the order
 
    order = getOrder();

    if (order == null)
    {
      String msg = formatUserMessage(MSG_NO_ORDER_TO_MODIFY, pRequest, pResponse);
      throw new ServletException(msg);
    }

    Map extraParams = createRepriceParameterMap();

    try
    {
      commerceItems = (ArrayList<SiebelCommerceItem>) getPurchaseProcessHelper().addItemsToOrder (
                                  order, getShippingGroup(), getProfile(), getItems(), getUserLocale(),
                				  getCatalogKey (pRequest, pResponse), getUserPricingModels(), this,extraParams);
    }
    catch (CommerceException ce)
    {
    	logError(ce);
      processException (ce, MSG_ERROR_ADDING_TO_ORDER, pRequest, pResponse);
    }
    // Check if the product is configurable or not
    SiebelCommerceItemManager commerceItemManager = (SiebelCommerceItemManager) getPurchaseProcessHelper()
        .getCommerceItemManager();
    boolean isNonConfigProduct = false;
    try {
      isNonConfigProduct = commerceItemManager
          .isNonConfigurableProduct(commerceItems);
    } catch (RepositoryException e) {
      logError(e);
      processException(e, MSG_ERROR_ADDING_TO_ORDER, pRequest, pResponse);
    } catch (PropertyNotFoundException e) {
      logError(e);
      processException(e, MSG_ERROR_ADDING_TO_ORDER, pRequest, pResponse);
    }
    // Append the commerce item id to the success URL
    
    if ((commerceItems != null) && (commerceItems.size() > 0))
    {
      // If it is a non configurable product, make the configured property to true and redirect to view cart
      if(isNonConfigProduct){
        commerceItems.get(0).setConfigured(true);
        successUrl=(getAddNonConfigurableItemToOrderSuccessUrl() != null ? getAddNonConfigurableItemToOrderSuccessUrl() : "");
        setAddItemToOrderSuccessURL (successUrl);
      } else{
        successUrl = (getAddItemToOrderSuccessURL() != null ? getAddItemToOrderSuccessURL() : "")
        		+ COMMERCE_ITEM_ID_STRING + commerceItems.get(0).getId();
        setAddItemToOrderSuccessURL (successUrl);
      }
    } else {
      setCatalogRefIds(null);
      setProductId("");
    }
  }
  
  /**
   * @param pRequest
   * @param pResponse
   * @return
   * @throws ServletException
   * @throws IOException
   */
  public boolean handleProceedToCheckout(DynamoHttpServletRequest pRequest,
      DynamoHttpServletResponse pResponse) throws ServletException, IOException {


    boolean itemsConfigured = true;
    List<SiebelCommerceItem> commItems = getOrder().getCommerceItems();
    for (SiebelCommerceItem citem : commItems) {
      if (!citem.isConfigured()) {
        itemsConfigured = false;
        break;
      }
    }
    boolean retValue = true;
    
    if (itemsConfigured) {

      getProductConfigInstanceCache().invalidateCache();

      redirectOrForward(pRequest, pResponse,
          ((SiebelPurchaseProcessHelper) getPurchaseProcessHelper())
              .getProceedToCheckoutSuccessUrl());

      retValue = false;
    }
    return retValue;
  }
  

  /**
   * @return
   */
  public String getLoginRedirectUrl() {
  	return ((SiebelPurchaseProcessHelper) getPurchaseProcessHelper()).getLoginOrRegisterUrl() + "?successUrl="
		    + ((SiebelPurchaseProcessHelper) getPurchaseProcessHelper()).getProceedToCheckoutSuccessUrl();
  }  

  /**
   * Called before any work is done by the handleAddItemToOrder method. It
   * checks eligibility of a product
   * 
   * @param pRequest
   *          the request object
   * @param pResponse
   *          the response object
   * @exception ServletException
   *              if an error occurs
   * @exception IOException
   *              if an error occurs
   */
  public void preAddItemToOrder(DynamoHttpServletRequest pRequest,
      DynamoHttpServletResponse pResponse) throws ServletException, IOException {
    // Check if UI is found for the given Product, if not
    // form the error message and add it to form exceptions
    try {
      boolean isUiFound = getSiebelValidator().isProductUIFound(getProductId(),
          null);
      if (!isUiFound) {
        String errorMsg = MessageFormat.format(
            sResourceBundle.getString(M_UINOTFOUND_MESSAGE), getProductId());
        addFormException(new DropletException(errorMsg));
        return;
      }
    } catch (RepositoryException ex) {
      if (isLoggingError())
        logError(ex);
      processException(ex, MSG_ERROR_ADDING_TO_ORDER, pRequest, pResponse);
    } catch (PropertyNotFoundException ex) {
      if (isLoggingError())
        logError(ex);
      processException(ex, MSG_ERROR_ADDING_TO_ORDER, pRequest, pResponse);
    }

    // Eligibility check of a product
    Map<String, String> invalidProducts = null;
    try {
      invalidProducts = getSiebelValidator().validateProductEligibility(
          getProductId(), getPostalCode());

      if (isLoggingDebug()) {
        logDebug(invalidProducts.toString());
      }
    } catch (RepositoryException rpex) {
      if (isLoggingError()) {
        logError(rpex);
      }
      addFormException(new DropletException("Eligibility Exception : "
          + rpex.getMessage()));
    } catch (Exception ex) {
      if (isLoggingError()) {
        logError(ex);
      }
      addFormException(new DropletException(
          sResourceBundle.getString(M_SIEBEL_GENERIC_EXCEPTION_MESSAGE)));
    }

    if (invalidProducts != null && !invalidProducts.isEmpty()) {
      for (Entry<String, String> invalidproduct : invalidProducts.entrySet()) {
        addFormException(new DropletException(invalidproduct.getValue()));
      }
    }
  }
  
  /**
   * While Removing ABO products from the order, We have to make an
   * additional explicit web service call <code>(QuoteWebService)</code> to Siebel to remove the QuoteItem
   * from the Quote.
   */
  @Override
	public void preRemoveItemFromOrder(DynamoHttpServletRequest pRequest,
			DynamoHttpServletResponse pResponse) throws ServletException,
			IOException {
	  	if(getRemovalCommerceIds().length > 0){	
	  		String commerceItemToRemove = getRemovalCommerceIds()[0];
	  		SiebelOrderImpl siebelOrder = (SiebelOrderImpl)getOrder();
	  		SiebelCommerceItem siebelCommerceItem = null;
	  		for(SiebelCommerceItem sblCommerceItem : (List<SiebelCommerceItem>)siebelOrder.getCommerceItems()){
	  			if(commerceItemToRemove.equalsIgnoreCase(sblCommerceItem.getId())){
	  				siebelCommerceItem = sblCommerceItem;
	  				break;
	  			}
	  		}
	  		if(siebelOrder.getQuoteNumber() != null && siebelCommerceItem.isAbo()){
	  		  String assetNumber = siebelCommerceItem.getAssetNumber();
	  		  List<SiebelCommerceItem> siebelCommerceItemsABO = new ArrayList<SiebelCommerceItem>();
	  		  //below list will be used to crate the complete removal item list for asset upgrade<old promotion and new promotion>
	  		  List<String> removalCommerceIds = new ArrayList<String>();
	  		  for(SiebelCommerceItem sblCommerceItem : (List<SiebelCommerceItem>)siebelOrder.getCommerceItems()){
	  		    if(assetNumber != null && sblCommerceItem.getAssetNumber() != null && assetNumber.equals(sblCommerceItem.getAssetNumber())){
	  		      removalCommerceIds.add(sblCommerceItem.getId());
	  		      siebelCommerceItemsABO.add(sblCommerceItem);
	  		    }
	  		    
	  		  }
	  			getSiebelAssetManager().getSiebelAssetTools().removeQuoteItem(siebelCommerceItemsABO);
	  		  //setting  the RemovalCommerceIds array with complete list
	  			setRemovalCommerceIds( Arrays.copyOf(removalCommerceIds.toArray(),removalCommerceIds.toArray().length, String[].class));
	  		}
	  	}else{
	  		addFormException(new DropletException("No item to remove"));
	  	}

	}
}
