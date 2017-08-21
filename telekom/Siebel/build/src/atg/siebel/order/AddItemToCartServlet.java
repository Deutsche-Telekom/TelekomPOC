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



//BB ---- REPLACE START
//   //BB ---- REPLACE END
package atg.siebel.order;
//BB ---- REPLACE END

import java.io.IOException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

import javax.servlet.ServletException;
import javax.transaction.TransactionManager;

import atg.commerce.CommerceException;
import atg.commerce.catalog.CatalogTools;
import atg.commerce.order.ChangedProperties;
import atg.commerce.order.CommerceItem;
import atg.commerce.order.CommerceItemManager;
import atg.commerce.order.ConfigurableCommerceItem;
import atg.commerce.order.Order;
import atg.commerce.order.OrderHolder;
import atg.commerce.order.OrderManager;
import atg.commerce.order.ShippingGroup;
import atg.commerce.order.ShippingGroupManager;
import atg.commerce.order.SubSkuCommerceItem;
import atg.commerce.pricing.PricingTools;
import atg.core.util.ResourceUtils;
import atg.dtm.TransactionDemarcation;
import atg.dtm.TransactionDemarcationException;
import atg.nucleus.naming.ParameterName;
import atg.repository.RepositoryException;
import atg.repository.RepositoryItem;
import atg.servlet.DynamoHttpServletRequest;
import atg.servlet.DynamoHttpServletResponse;
import atg.servlet.DynamoServlet;
import atg.servlet.RequestLocale;

/**
 * 
 *
 * @author Paul O'Brien
 * @version $Id: //product/Siebel/version/11.2/src/atg/siebel/order/AddItemToCartServlet.java#2 $$Change: 1194813 $
 * @updated $DateTime: 2015/09/10 08:26:24 $$Author: saysyed $
 */
public class AddItemToCartServlet extends DynamoServlet
{
  //-------------------------------------
  /** Class version string */
  public static String CLASS_VERSION = "$Id: //product/Siebel/version/11.2/src/atg/siebel/order/AddItemToCartServlet.java#2 $$Change: 1194813 $";

  static final String MY_RESOURCE_NAME = "atg.commerce.order.OrderResources";

  /** Resource Bundle **/
  protected static java.util.ResourceBundle sResourceBundle = atg.core.i18n.LayeredResourceBundle.getBundle(MY_RESOURCE_NAME, atg.service.dynamo.LangLicense.getLicensedDefault());
  
  //-------------------------------------
  // Constants
  //-------------------------------------
  static final ParameterName LOCALE_PARAM = ParameterName.getParameterName("locale");

  //-------------------------------------
  // Properties

  //---------------------------------------------------------------------------
  // property: catalogRefIdParameter
  protected String mCatalogRefIdParameter = "url_catalog_ref_id";

  public void setCatalogRefIdParameter(String pCatalogRefIdParameter) {
    mCatalogRefIdParameter = pCatalogRefIdParameter;
  }

  public String getCatalogRefIdParameter() {
    return mCatalogRefIdParameter;
  }

  //---------------------------------------------------------------------------
  // property: catalogRefId
  protected String mCatalogRefId;

  public void setCatalogRefId(String pCatalogRefId) {
    mCatalogRefId = pCatalogRefId;
  }

  public String getCatalogRefId() {
    return mCatalogRefId;
  }

  //---------------------------------------------------------------------------
  // property: productIdParameter
  protected String mProductIdParameter = "url_product_id";

  public void setProductIdParameter(String pProductIdParameter) {
    mProductIdParameter = pProductIdParameter;
  }

  public String getProductIdParameter() {
    return mProductIdParameter;
  }

  //---------------------------------------------------------------------------
  // property: productId
  protected String mProductId;

  public void setProductId(String pProductId) {
    mProductId = pProductId;
  }

  public String getProductId() {
    return mProductId;
  }

  //---------------------------------------------------------------------------
  // property: quantityParameter
  protected String mQuantityParameter = "url_quantity";

  public void setQuantityParameter(String pQuantityParameter) {
    mQuantityParameter = pQuantityParameter;
  }

  public String getQuantityParameter() {
    return mQuantityParameter;
  }

  //---------------------------------------------------------------------------
  // property: quantityString
  protected String mQuantityString;

  public void setQuantityString(String pQuantityString) {
    mQuantityString = pQuantityString;
  }

  public String getQuantityString() {
    return mQuantityString;
  }

  //---------------------------------------------------------------------------
  // property: quantity
  protected long mQuantity;

  public void setQuantity(long pQuantity) {
    mQuantity = pQuantity;
  }

  public long getQuantity() {
    return mQuantity;
  }

  //---------------------------------------------------------------------------
  // property: shippingGroupIdParameter
  protected String mShippingGroupIdParameter = "url_shipping_group_id";

  public void setShippingGroupIdParameter(String pShippingGroupIdParameter) {
    mShippingGroupIdParameter = pShippingGroupIdParameter;
  }

  public String getShippingGroupIdParameter() {
    return mShippingGroupIdParameter;
  }

  //---------------------------------------------------------------------------
  // property: shippingGroupId
  protected String mShippingGroupId;

  public void setShippingGroupId(String pShippingGroupId) {
    mShippingGroupId = pShippingGroupId;
  }

  public String getShippingGroupId() {
    return mShippingGroupId;
  }

  //---------------------------------------------------------------------------
  // property: itemTypeParameter
  protected String mItemTypeParameter = "url_item_type";

  public void setItemTypeParameter(String pItemTypeParameter) {
    mItemTypeParameter = pItemTypeParameter;
  }

  public String getItemTypeParameter() {
    return mItemTypeParameter;
  }

  //---------------------------------------------------------------------------
  // property: itemType
  protected String mItemType;

  public void setItemType(String pItemType) {
    mItemType = pItemType;
  }

  public String getItemType() {
    return mItemType;
  }

  //---------------------------------------------------------------------------
  // property: commerceItemIdParameter
  protected String mCommerceItemIdParameter = "url_commerce_item_id";

  public void setCommerceItemIdParameter(String pCommerceItemIdParameter) {
    mCommerceItemIdParameter = pCommerceItemIdParameter;
  }

  public String getCommerceItemIdParameter() {
    return mCommerceItemIdParameter;
  }

  //---------------------------------------------------------------------------
  // property: commerceItemId
  protected String mCommerceItemId;

  public void setCommerceItemId(String pCommerceItemId) {
    mCommerceItemId = pCommerceItemId;
  }

  public String getCommerceItemId() {
    return mCommerceItemId;
  }

  //---------------------------------------------------------------------------
  // property: propertyParameterPrefix
  protected String mPropertyParameterPrefix = "dcs_ci_";

  public void setPropertyParameterPrefix(String pPropertyParameterPrefix) {
    mPropertyParameterPrefix = pPropertyParameterPrefix;
  }

  public String getPropertyParameterPrefix() {
    return mPropertyParameterPrefix;
  }

  //---------------------------------------------------------------------------
  // property: configurablePropertyParameter
  protected String mConfigurablePropertyParameter = "dcs_subsku";

  public void setConfigurablePropertyParameter(String pConfigurablePropertyParameter) {
    mConfigurablePropertyParameter = pConfigurablePropertyParameter;
  }

  public String getConfigurablePropertyParameter() {
    return mConfigurablePropertyParameter;
  }

  //---------------------------------------------------------------------------
  // property: commerceItemPropertyMap
  protected Map mCommerceItemPropertyMap = new HashMap();

  public void setCommerceItemPropertyMap(Map pCommerceItemPropertyMap) {
    mCommerceItemPropertyMap = pCommerceItemPropertyMap;
  }

  public Map getCommerceItemPropertyMap() {
    return mCommerceItemPropertyMap;
  }

  //---------------------------------------------------------------------------
  // property: configurableProperties
  protected List mConfigurableProperties = new ArrayList(20);

  public void setConfigurableProperties(List pConfigurableProperties) {
    mConfigurableProperties = pConfigurableProperties;
  }

  public List getConfigurableProperties() {
    return mConfigurableProperties;
  }

  //---------------------------------------------------------------------------
  // property: addToDefaultShippingGroup
  protected boolean mAddToDefaultShippingGroup;

  public void setAddToDefaultShippingGroup(boolean pAddToDefaultShippingGroup) {
    mAddToDefaultShippingGroup = pAddToDefaultShippingGroup;
  }

  public boolean isAddToDefaultShippingGroup() {
    return mAddToDefaultShippingGroup;
  }

  //---------------------------------------------------------------------------
  // property: commerceItemManager
  protected CommerceItemManager mCommerceItemManager;

  public void setCommerceItemManager(CommerceItemManager pCommerceItemManager) {
    mCommerceItemManager = pCommerceItemManager;
  }

  public CommerceItemManager getCommerceItemManager() {
    return mCommerceItemManager;
  }

  //---------------------------------------------------------------------------
  // property: orderManager
  protected OrderManager mOrderManager;

  public void setOrderManager(OrderManager pOrderManager) {
    mOrderManager = pOrderManager;
  }

  public OrderManager getOrderManager() {
    return mOrderManager;
  }

  //---------------------------------------------------------------------------
  // property: catalogTools
  protected CatalogTools mCatalogTools;

  public void setCatalogTools(CatalogTools pCatalogTools) {
    mCatalogTools = pCatalogTools;
  }

  public CatalogTools getCatalogTools() {
    return mCatalogTools;
  }

  //---------------------------------------------------------------------------
  // property: defaultConfigurableItemType
  protected String mDefaultConfigurableItemType = "configurableCommerceItem";

  public void setDefaultConfigurableItemType(String pDefaultConfigurableItemType) {
    mDefaultConfigurableItemType = pDefaultConfigurableItemType;
  }

  public String getDefaultConfigurableItemType() {
    return mDefaultConfigurableItemType;
  }

  //---------------------------------------------------------------------------
  // property: configurableSkuItemDescriptor
  protected String mConfigurableSkuItemDescriptor = "configurableSku";

  public void setConfigurableSkuItemDescriptor(String pConfigurableSkuItemDescriptor) {
    mConfigurableSkuItemDescriptor = pConfigurableSkuItemDescriptor;
  }

  public String getConfigurableSkuItemDescriptor() {
    return mConfigurableSkuItemDescriptor;
  }

  //---------------------------------------------------------------------------
  // property: shippingGroupManager
  protected ShippingGroupManager mShippingGroupManager;

  public void setShippingGroupManager(ShippingGroupManager pShippingGroupManager) {
    mShippingGroupManager = pShippingGroupManager;
  }

  public ShippingGroupManager getShippingGroupManager() {
    return mShippingGroupManager;
  }

  //---------------------------------------------------------------------
  // property: TransactionManager
  TransactionManager mTransactionManager;

  /**
   * Return the TransactionManager property.
   * @return the TransactionManager
   */
  public TransactionManager getTransactionManager() {
    return mTransactionManager;
  }

  /**
   * Set the TransactionManager property.
   * @param pTransactionManager
   */
  public void setTransactionManager(TransactionManager pTransactionManager) {
    mTransactionManager = pTransactionManager;
  }
      
  //---------------------------------------------------------------------------
  // property: pricingTools
  protected PricingTools mPricingTools;

  public void setPricingTools(PricingTools pPricingTools) {
    mPricingTools = pPricingTools;
  }

  public PricingTools getPricingTools() {
    return mPricingTools;
  }

  //-------------------------------------
  // property: ShoppingCart
  //-------------------------------------
  OrderHolder mShoppingCart;

  /**
   * Sets property ShoppingCart
   **/
  public void setShoppingCart(OrderHolder pShoppingCart) {
    mShoppingCart = pShoppingCart;
  }

  /**
   * Returns property ShoppingCart
   * @beaninfo description: The current shopping cart
   **/
  public OrderHolder getShoppingCart() {
    return mShoppingCart;
  }

  //-------------------------------------
  // property: Order
  //-------------------------------------
  Order mOrder;

  /**
   * Sets property Order
   **/
  public void setOrder(Order pOrder) {
    mOrder = pOrder;
  }

  /**
   * Returns property Order, if the shoppingCart property is not null, then
   * return the current order of the shopping cart order holder
   * @beaninfo description: The current order
   **/
  public Order getOrder() {
    if (getShoppingCart() != null)
      return getShoppingCart().getCurrent();
    else
      return mOrder;
  }

  //-------------------------------------
  // property: UseRequestLocale
  boolean mUseRequestLocale = true;

  /**
   * Sets property UseRequestLocale
   *
   * @param pUseRequestLocale a <code>boolean</code> value
   */
  public void setUseRequestLocale(boolean pUseRequestLocale) {
    mUseRequestLocale = pUseRequestLocale;
  }

  /**
   * Returns property UseRequestLocale
   *
   * @return a <code>boolean</code> value
   */
  public boolean isUseRequestLocale() {
    return mUseRequestLocale;
  }

  //-------------------------------------
  // property: pricingOperation
  //-------------------------------------  
  protected String mPricingOperation;

  /**
   * Sets property pricingOperation
   *
   * @param pPricingOperation a <code>String</code> value
   */
  public void setPricingOperation(String pPricingOperation) {
    mPricingOperation = pPricingOperation;
  }
  
  /**
   * Returns property pricingOperation
   *
   * @return a <code>String</code> value
   */
  public String getPricingOperation() {
    return mPricingOperation;
  }
  
  //-------------------------------------
  /**
   * 
   */
  public void service(DynamoHttpServletRequest pRequest,
                      DynamoHttpServletResponse pResponse)
       throws IOException, ServletException
  {
    try {
      TransactionDemarcation td = new TransactionDemarcation();
      try {
        td.begin(getTransactionManager(), TransactionDemarcation.REQUIRED);
        
        if (!getParameters(pRequest))
          return;

        if (!validateParameters())
          return;
    
        String locale = null;
        Locale usersLocale = getUserLocale(pRequest, pResponse);
        if (usersLocale != null) {
          locale = usersLocale.toString();
        }

        CommerceItem ci = createCommerceItem(locale);
        if (ci != null)
          ci = addItemToCart(ci);

        if (ci != null) {
          setCommerceItemProperties(ci);
          boolean update = true;
          if (ci instanceof ConfigurableCommerceItem) 
            update = assignConfigurableProperties(ci);
          if (update) getOrderManager().updateOrder(getOrder());
        }
      }
      finally {
        td.end();
      }
    }
    catch (CommerceException e) {
      if(isLoggingError())
        logError(e);
    }
    catch (TransactionDemarcationException e) {
      if(isLoggingError())
        logError(e);
    }
  }

  protected boolean getParameters(DynamoHttpServletRequest pRequest) {
      
    // Get the standard parameters
    setCatalogRefId(pRequest.getQueryParameter(getCatalogRefIdParameter()));
    setProductId(pRequest.getQueryParameter(getProductIdParameter()));
    setQuantityString(pRequest.getQueryParameter(getQuantityParameter()));
    setShippingGroupId(pRequest.getQueryParameter(getShippingGroupIdParameter()));
    setCommerceItemId(pRequest.getQueryParameter(getCommerceItemIdParameter()));
    setItemType(pRequest.getQueryParameter(getItemTypeParameter()));

    // Get the configurable property parameters
    String[] values = pRequest.getParameterValues(getConfigurablePropertyParameter());

    if (values != null) {
      for (int i=0; i < values.length; i++) {
        String value = values[i];
        int commaPlace = value.indexOf(',');
        String skuId = value.substring(0, commaPlace);
        String remainder = value.substring(commaPlace + 1);
        commaPlace = remainder.indexOf(',');
        String productId = remainder.substring(0, commaPlace);
        remainder = remainder.substring(commaPlace + 1);
        long quantity=0;
        try {
          quantity = Long.parseLong(remainder);
        }
        catch(NumberFormatException e) {
          if(isLoggingError())
           logError(e);
          return false;
        }
        getConfigurableProperties().add(new ConfigurableProperty(skuId, productId, quantity));
      }
    }

    // Find all parameters whose keys being with the commerce item property
    // prefix.
    Enumeration keys = pRequest.getQueryParameterNames();
    while(keys.hasMoreElements()) {
      String key = (String) keys.nextElement();

      if (key.startsWith(getPropertyParameterPrefix())) {
        String propertyName = key.substring(getPropertyParameterPrefix().length());
        String propertyValue = pRequest.getQueryParameter(key);
        getCommerceItemPropertyMap().put(propertyName, propertyValue);
      }
    }       

    return true;
  }
    
  protected boolean validateParameters() {
    
    // Required parameters cannot be null
    if (getCatalogRefId() == null) {
      if(isLoggingError())
        logError(ResourceUtils.getMsgResource("NullCatalogRefId",
                                              MY_RESOURCE_NAME, sResourceBundle));
      return false;
    }
    
    if (getProductId() == null) {
      if(isLoggingError())
        logError(ResourceUtils.getMsgResource("NullProductId",
                                              MY_RESOURCE_NAME, sResourceBundle));
      return false;
    }

    if (getQuantityString() == null) {
      if(isLoggingError())
        logError(ResourceUtils.getMsgResource("NullQuantity",
                                              MY_RESOURCE_NAME, sResourceBundle));
      return false;
    }

    long quantity=0;
    try {
      quantity = Long.parseLong(getQuantityString());
    }
    catch(NumberFormatException e) {
      if(isLoggingError())
        logError(e);
      return false;
    }

    if (quantity <= 0) {
      if(isLoggingError())
        logError(ResourceUtils.getMsgResource("InvalidQuantityParameter",
                                              MY_RESOURCE_NAME, sResourceBundle));
      return false;
    }
    else setQuantity(quantity);

    return true;
  }
      
  protected CommerceItem createCommerceItem(String pLocale) {
    
    CommerceItem ci = null;
    try {
      RepositoryItem sku = getCatalogTools().findSKU(getCatalogRefId());
      if (sku == null) {
        if (isLoggingError())
          logError(ResourceUtils.getMsgResource("NotValidItem", MY_RESOURCE_NAME, sResourceBundle));
        return null;
      }

      String skuType = (String) sku.getPropertyValue("type");
      
      // If skuType is invalid, set to default
      if (skuType == null) 
        skuType = getCatalogTools().getBaseSKUItemType();
      
      if (!skuType.equals(getConfigurableSkuItemDescriptor()) && getConfigurableProperties().size() > 0) {
        if (isLoggingError())
          logError(ResourceUtils.getMsgResource("NotConfigurable",
                                                MY_RESOURCE_NAME, sResourceBundle));
        return null;
      }

      if (skuType.equals(getConfigurableSkuItemDescriptor()) && getItemType() == null) {
        setItemType(getDefaultConfigurableItemType());
      }
      
      try {
        // Create the new commerce item
        if (getItemType() != null) 
          ci = getCommerceItemManager().createCommerceItem(getItemType(), getCatalogRefId(), null, 
                                                           getProductId(), null, getQuantity(), pLocale, null);
        else
          ci = getCommerceItemManager().createCommerceItem(getCatalogRefId(), getProductId(),
                                                           getQuantity(), pLocale);
      }
      catch(CommerceException e) {
        if(isLoggingError())
          logError(e);
        return null;
      }

      if (isLoggingDebug())
        logDebug("Created commerce item of type " + ci.getClass().getName());

      if (ci == null) {
        if(isLoggingError())
          logError(ResourceUtils.getMsgResource("NotValidItem",
                                                MY_RESOURCE_NAME, sResourceBundle));
        return null;
      }
    }
    catch (IllegalArgumentException e) {
      if(isLoggingError())
        logError(e);
    } 
    catch (RepositoryException e) {
      if(isLoggingError())
        logError(e);
    }
    
    return ci;
  }
  
  @SuppressWarnings("deprecation")
  protected CommerceItem addItemToCart(CommerceItem ci) {
    try {
      if (getCommerceItemId() != null)
        getCommerceItemManager().removeItemFromOrder(getOrder(), getCommerceItemId());

      ci = getCommerceItemManager().addItemToOrder(getOrder(), ci);
      
      if (getShippingGroupId() == null && isAddToDefaultShippingGroup()) {

        if (getOrder().getShippingGroups().size() == 0) {
          ShippingGroup sGroup = getOrderManager().createShippingGroup();
          getOrderManager().addShippingGroupToOrder(getOrder(), sGroup);
        }

        ShippingGroup shippingGroup = (ShippingGroup) getOrder().getShippingGroups().get(0);
        setShippingGroupId(shippingGroup.getId());
      }
      
      if (getShippingGroupId() != null)
        getCommerceItemManager().addItemQuantityToShippingGroup(getOrder(), ci.getId(), 
                                                                getShippingGroupId(), getQuantity());

      String profileId = getOrder().getProfileId();
      RepositoryItem profile = null; 
      try {
        profile = getPricingTools().getProfile(profileId); 
      } catch(RepositoryException re) {
        if (isLoggingWarning()) {
          logWarning(re);
        }
      }
      
      Locale locale = getPricingTools().getLocale(null);

      //If the configured pricing operation is not valid then it will default to total order pricing
      getPricingTools().performPricingOperation(getPricingOperation(), getOrder(), null, locale, profile, null);
    }
    catch(CommerceException e) {
      if(isLoggingError())
        logError(e);
      
      return null;
    }

    return ci;
  }
  
  protected void setCommerceItemProperties(CommerceItem ci) {
    if (getCommerceItemPropertyMap() != null) {
      Set keys = getCommerceItemPropertyMap().keySet();
      Iterator iter = keys.iterator();
      while (iter.hasNext()) {
        String property = (String) iter.next();
        String value = (String) getCommerceItemPropertyMap().get(property);
        if (ci instanceof ChangedProperties)
          ((ChangedProperties) ci).setPropertyValue(property, value);
      }
    }
  }

  protected boolean assignConfigurableProperties(CommerceItem ci) {

    Iterator confPropertyIter = getConfigurableProperties().iterator();
    try {
      while(confPropertyIter.hasNext()) {

        ConfigurableProperty confProperty = (ConfigurableProperty) confPropertyIter.next();
        String catalogRefId = confProperty.getCatalogRefId();
        String productId = confProperty.getProductId();
        long quantity = confProperty.getQuantity();

        boolean match = false;
        RepositoryItem baseSku = getCatalogTools().getCatalog().getItem(getCatalogRefId(), 
                                                                        getConfigurableSkuItemDescriptor());
        List properties = (List) baseSku.getPropertyValue("configurableProperties");
        Iterator propertyIter = properties.iterator();
        while(propertyIter.hasNext() && match == false) {
          RepositoryItem property = (RepositoryItem) propertyIter.next();
          List options = (List) property.getPropertyValue("configurationOptions");
          Iterator optionIter = options.iterator();

          while (optionIter.hasNext() && match == false) {
            RepositoryItem option = (RepositoryItem) optionIter.next();
            RepositoryItem sku = (RepositoryItem) option.getPropertyValue("sku");
            RepositoryItem product = (RepositoryItem) option.getPropertyValue("product");
            if (catalogRefId.equals(sku.getRepositoryId()) && productId.equals(product.getRepositoryId())) {
              match = true;
            }
          }
        }

        if (match == true) {
          SubSkuCommerceItem ssci = (SubSkuCommerceItem)
            getCommerceItemManager().createCommerceItem("subSkuCommerceItem", confProperty.getCatalogRefId(),
                                                        confProperty.getProductId(), confProperty.getQuantity());

          if (isLoggingDebug())
            logDebug("Created commerce item of type " + ssci.getClass().getName());

          getCommerceItemManager().addSubItemToConfigurableItem((ConfigurableCommerceItem) ci, ssci);
        }
        else {
          if(isLoggingError())
            logError(ResourceUtils.getMsgResource("InvalidProperty",
                                                  MY_RESOURCE_NAME, sResourceBundle));
          return false;
        }
      }
    }
    catch (RepositoryException e) {
      if(isLoggingError())
        logError(e);
      return false;
    }
    catch (CommerceException e) {
      if(isLoggingError())
        logError(e);
      return false;
    }

    return true;
  }    

  /**
   * Returns the locale associated with the request. The method first searches
   * for a request paramater named <code>locale</code>. This value can be
   * either a java.util.Locale object or a String which represents the locale.
   * Next if the <code>useRequestLocale</code> property is true, then the locale
   * of the request will be returned. Finally, if the locale cannot be determined,
   * the the <code>defaultLocale</code> property is used.
   * @param pRequest a <code>DynamoHttpServletRequest</code> value
   * @param pResponse a <code>DynamoHttpServletResponse</code> value
   * @return a <code>Locale</code> value
   * @exception ServletException if an error occurs
   * @exception IOException if an error occurs
   */
  public Locale getUserLocale(DynamoHttpServletRequest pRequest,
                              DynamoHttpServletResponse pResponse)
       throws ServletException, IOException
  {
    Object obj = pRequest.getObjectParameter(LOCALE_PARAM);
    if (obj instanceof Locale)
      return (Locale)obj;
    else if (obj instanceof String)
      return RequestLocale.getCachedLocale((String)obj);
    else if (isUseRequestLocale()) {
      RequestLocale requestLocale = pRequest.getRequestLocale();
      if (requestLocale != null)
        return requestLocale.getLocale();
    }

    return getOrderManager().getDefaultLocale();
  }


  //-------------------------------------
  /**
   * 
   */

  protected class ConfigurableProperty {
  
    //---------------------------------------------------------------------------
    // property: catalogRefId
    protected String mCatalogRefId;

    public void setCatalogRefId(String pCatalogRefId) {
      mCatalogRefId = pCatalogRefId;
    }

    public String getCatalogRefId() {
      return mCatalogRefId;
    }

    //---------------------------------------------------------------------------
    // property: productId
    protected String mProductId;

    public void setProductId(String pProductId) {
      mProductId = pProductId;
    }

    public String getProductId() {
      return mProductId;
    }

    //---------------------------------------------------------------------------
    // property: quantity
    protected long mQuantity;

    public void setQuantity(long pQuantity) {
      mQuantity = pQuantity;
    }

    public long getQuantity() {
      return mQuantity;
    }

    public ConfigurableProperty(String pCatalogRefId, String pProductId, long pQuantity) {
      setCatalogRefId(pCatalogRefId);
      setProductId(pProductId);
      setQuantity(pQuantity);
    }
  }
} // end of class

