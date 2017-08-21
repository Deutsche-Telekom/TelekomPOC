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

import atg.beans.DynamicBeans;
import atg.beans.PropertyNotFoundException;
import atg.commerce.CommerceException;
import atg.commerce.order.*;
import atg.commerce.pricing.OrderPriceInfo;
import atg.commerce.pricing.PricingConstants;
import atg.commerce.pricing.PricingTools;
import atg.commerce.pricing.priceLists.PriceListManager;
import atg.commerce.profile.CommerceProfileTools;
import atg.core.util.Address;
import atg.core.util.StringUtils;
import atg.integrations.CommandInvocationException;
import atg.integrations.CommandTimeoutException;
import atg.integrations.InvalidInputException;
import atg.repository.MutableRepository;
import atg.repository.MutableRepositoryItem;
import atg.repository.RepositoryException;
import atg.repository.RepositoryItem;
import atg.service.perfmonitor.PerformanceMonitor;
import atg.service.resourcepool.ResourcePoolException;
import atg.siebel.catalog.SiebelCatalogProduct;
import atg.siebel.catalog.SiebelCatalogRelationship;
import atg.siebel.catalog.SiebelCatalogTools;
import atg.siebel.configurator.Constants;
import atg.siebel.configurator.*;
import atg.siebel.configurator.attribute.Attribute;
import atg.siebel.integration.SiebelWebServiceConfigurationException;
import atg.siebel.integration.WebServiceController;
import atg.siebel.integration.WebServiceHelper;
import atg.siebel.order.history.OrderDetail;
import atg.siebel.order.history.OrderHistoryUIConfiguration;
import atg.siebel.pricing.SiebelItemPriceInfo;
import atg.siebel.pricing.SiebelShippingPricingEngine;
import atg.userprofiling.Profile;
import com.siebel.ordermanagement.order.details.OrderDetailQueryPageInput;
import com.siebel.ordermanagement.order.details.OrderDetailQueryPageOutput;
import com.siebel.ordermanagement.order.details.data.data.*;
import com.siebel.ordermanagement.order.details.data.query.*;
import com.siebel.ordermanagement.quote.data.*;
import com.siebel.ordermanagement.quote.quoting.ExecuteQuotingInput;
import com.siebel.ordermanagement.quote.quoting.ExecuteQuotingOutput;

import javax.xml.crypto.dsig.TransformException;
import javax.xml.ws.soap.SOAPFaultException;
import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.math.BigInteger;
import java.util.*;

/**
 * This class contains all of the low level functionality for manipulating
 * siebel related repository items. Generally the methods here are called from
 * OrderManager.
 *
 * @author Patrick Mc Erlean
 * @version $Id:
 *          //product/Siebel/main/src/atg/siebel/order/SiebelOrderTools.java#34
 *          $$Change: 1194813 $
 * @updated $DateTime: 2015/09/10 08:26:24 $$Author: saysyed $
 */

public class SiebelOrderTools
        extends OrderTools {
  // ----------------------------------------------------------------------------------
  // Class version string
  // ----------------------------------------------------------------------------------

  public static String CLASS_VERSION =
          "$Id: //product/Siebel/version/11.2/src/atg/siebel/order/SiebelOrderTools.java#3 $$Change: 1194813 $";
  public static final String ACTION_CODE_ADD = "Add";

  // ----------------------------------------------------------------------------------
  // Constants
  // ----------------------------------------------------------------------------------

  public final static String M_YES = "Y";
  public final static String M_NO = "N";

  public final static String M_MINUS = "-";

  public final static String INTEGER_ATTRIBUTE_TYPE = "Integer";
  public final static String NUMBER_ATTRIBUTE_TYPE = "Number";

  private static final String PERF_MONITOR_NAME =
          "SiebelProfileTools";

  // ----------------------------------------------------------------------------------
  // Properties
  // ----------------------------------------------------------------------------------

  // ----------------------------------------------------------------------------------
  // property: commerceItemManager

  private SiebelCommerceItemManager mCommerceItemManager = null;

  /**
   * Returns the property commerceItemManager
   *
   * @return the commerceItemManager property value
   */

  public SiebelCommerceItemManager getCommerceItemManager() {
    return mCommerceItemManager;
  }

  /**
   * Sets the property commerceItemManager
   *
   * @param pCommerceItemManager
   *          the property value
   */

  public void setCommerceItemManager(
          SiebelCommerceItemManager pCommerceItemManager) {
    mCommerceItemManager = pCommerceItemManager;
  }

  // ----------------------------------------------------------------------------------
  // siebelAttributeManager

  private SiebelAttributeManager mSiebelAttributeManager;

  /**
   * Returns the property siebelAttributeManager
   *
   * @return the siebelAttributeManager property value
   */

  public SiebelAttributeManager getSiebelAttributeManager() {
    return mSiebelAttributeManager;
  }

  /**
   * Sets the property siebelAttributeManager
   *
   * @param pSiebelAttributeManager
   *          the property value
   */

  public void setSiebelAttributeManager(
          SiebelAttributeManager pSiebelAttributeManager) {
    mSiebelAttributeManager = pSiebelAttributeManager;
  }

  // ----------------------------------------------------------------------------------
  // priceListManager

  private PriceListManager mPriceListManager;

  /**
   * Returns the property priceListManager
   *
   * @return the priceListManager property value
   */

  public PriceListManager getPriceListManager() {
    return mPriceListManager;
  }

  /**
   * Sets the property priceListManager
   *
   * @param pPriceListManager the property value
   */

  public void setPriceListManager(PriceListManager pPriceListManager)
  {
    mPriceListManager = pPriceListManager;
  }

  // ----------------------------------------------------------------------------------
  // property: siebelAttributeItemDescriptorName

  private String mSiebelAttributeItemDescriptorName = null;

  /**
   * Returns the property siebelAttributeItemDescriptorName
   *
   * @return the siebelAttributeItemDescriptorName property value
   */

  public String getSiebelAttributeItemDescriptorName() {
    return mSiebelAttributeItemDescriptorName;
  }

  /**
   * Sets the property siebelAttributeItemDescriptorName
   *
   * @param pSiebelAttributeItemDescriptorName
   *          the property value
   */


  protected String mOrderStatePropertyName;
  /**
   * @return the mOrderStatePropertyName
   */
  public String getOrderStatePropertyName()
  {
    return mOrderStatePropertyName;
  }

  /**
   * @param pOrderStatePropertyName the mOrderStatePropertyName to set
   */
  public void setOrderStatePropertyName(String pOrderStatePropertyName)
  {
    mOrderStatePropertyName = pOrderStatePropertyName;
  }

  public void setSiebelAttributeItemDescriptorName(
          String pSiebelAttributeItemDescriptorName) {
    mSiebelAttributeItemDescriptorName = pSiebelAttributeItemDescriptorName;
  }

  // ----------------------------------------------------------------------------------
  // property: userSiebelAccountIdPropertyName

  private String mUserSiebelAccountIdPropertyName = "siebelAccountId";

  /**
   * Returns the property userSiebelAccountIdPropertyName
   *
   * @return the userSiebelAccountIdPropertyName property value
   */

  public String getUserSiebelAccountIdPropertyName() {
    return mUserSiebelAccountIdPropertyName;
  }

  /**
   * Sets the property userSiebelAccountIdPropertyName
   *
   * @param pUserSiebelAccountIdPropertyName
   *          the property value
   */

  public void setUserSiebelAccountIdPropertyName(
          String pUserSiebelAccountIdPropertyName) {
    mUserSiebelAccountIdPropertyName = pUserSiebelAccountIdPropertyName;
  }

  // ----------------------------------------------------------------------------------
  // property: organizationParentOrganizationPropertyName

  private String mOrganizationParentOrganizationPropertyName =
          "parentOrganization";

  /**
   * Returns the property organizationParentOrganizationPropertyName
   *
   * @return the organizationParentOrganizationPropertyName property value
   */

  public String getOrganizationParentOrganizationPropertyName() {
    return mOrganizationParentOrganizationPropertyName;
  }

  /**
   * Sets the property organizationParentOrganizationPropertyName
   *
   * @param pOrganizationParentOrganizationPropertyName
   *          the property value
   */

  public void setOrganizationParentOrganizationPropertyName(
          String pOrganizationParentOrganizationPropertyName) {
    mOrganizationParentOrganizationPropertyName =
            pOrganizationParentOrganizationPropertyName;
  }

  // ----------------------------------------------------------------------------------
  // property: organizationNamePropertyName

  private String mOrganizationNamePropertyName = "name";

  /**
   * Returns the property organizationNamePropertyName
   *
   * @return the organizationNamePropertyName property value
   */

  public String getOrganizationNamePropertyName() {
    return mOrganizationNamePropertyName;
  }

  /**
   * Sets the property organizationNamePropertyName
   *
   * @param pOrganizationNamePropertyName
   *          the property value
   */

  public void setOrganizationNamePropertyName(
          String pOrganizationNamePropertyName) {
    mOrganizationNamePropertyName = pOrganizationNamePropertyName;
  }

  // ----------------------------------------------------------------------------------
  // property: organizationSiebelIdPropertyName

  private String mOrganizationSiebelIdPropertyName = "siebelId";

  /**
   * Returns the property organizationSiebelIdPropertyName
   *
   * @return the organizationSiebelIdPropertyName property value
   */

  public String getOrganizationSiebelIdPropertyName() {
    return mOrganizationSiebelIdPropertyName;
  }

  /**
   * Sets the property organizationSiebelIdPropertyName
   *
   * @param pOrganizationSiebelIdPropertyName
   *          the property value
   */

  public void setOrganizationSiebelIdPropertyName(
          String pOrganizationSiebelIdPropertyName) {
    mOrganizationSiebelIdPropertyName = pOrganizationSiebelIdPropertyName;
  }

  // ----------------------------------------------------------------------------------
  // property: idPropertyName

  private String mIdPropertyName = "id";

  /**
   * Returns the property idPropertyName
   *
   * @return the idPropertyName property value
   */

  public String getIdPropertyName() {
    return mIdPropertyName;
  }

  /**
   * Sets the property idPropertyName
   *
   * @param pIdPropertyName the property value
   */

  public void setIdPropertyName(
          String pIdPropertyName) {
    mIdPropertyName = pIdPropertyName;
  }

  // ----------------------------------------------------------------------------------
  // property: priceListPropertyName

  private String mPriceListPropertyName = "priceList";

  /**
   * Returns the property priceListPropertyName
   *
   * @return the priceListPropertyName property value
   */

  public String getPriceListPropertyName() {
    return mPriceListPropertyName;
  }

  /**
   * Sets the property priceListPropertyName
   *
   * @param pPriceListPropertyName the property value
   */

  public void setPriceListPropertyName(
          String pPriceListPropertyName) {
    mPriceListPropertyName = pPriceListPropertyName;
  }

  // ----------------------------------------------------------------------------------
  // property: defaultPriceListIdPropertyName

  private String mDefaultPriceListIdPropertyName = "defaultPriceListId";

  /**
   * Returns the property defaultPriceListIdPropertyName
   *
   * @return the defaultPriceListIdPropertyName property value
   */

  public String getDefaultPriceListIdPropertyName() {
    return mDefaultPriceListIdPropertyName;
  }

  /**
   * Sets the property defaultPriceListIdPropertyName
   *
   * @param pDefaultPriceListIdPropertyName the property value
   */

  public void setDefaultPriceListIdPropertyName(
          String pDefaultPriceListIdPropertyName) {
    mDefaultPriceListIdPropertyName = pDefaultPriceListIdPropertyName;
  }

  // ----------------------------------------------------------------------------------
  // property: addMRCToTotalFlag

  private boolean mAddMRCToTotalFlag = false;

  /**
   * Returns the property addMRCToTotalFlag
   *
   * @return the addMRCToTotalFlag property value
   */

  public boolean getAddMRCToTotalFlag() {
    return mAddMRCToTotalFlag;
  }

  /**
   * Sets the property addMRCToTotalFlag
   *
   * @param pAddMRCToTotalFlag
   *          the property value
   */

  public void setAddMRCToTotalFlag(
          boolean pAddMRCToTotalFlag) {
    mAddMRCToTotalFlag = pAddMRCToTotalFlag;
  }

  //---------------------------------------------------------------------------
  // property: pricingTools
  protected PricingTools mPricingTools;

  /**
   * Returns the property pricingTools
   *
   * @return the pricingTools property value
   */
  public PricingTools getPricingTools()
  {
    return mPricingTools;
  }

  /**
   * Sets the property pricingTools
   *
   * @param pPricingTools the property value
   */
  public void setPricingTools(PricingTools pPricingTools)
  {
    mPricingTools = pPricingTools;
  }

  protected WebServiceController mWebServiceController;

  // --------- Property: WebServiceController ------------
  public void setWebServiceController(WebServiceController pWebServiceController)
  {
    mWebServiceController = pWebServiceController;
  }

  public WebServiceController getWebServiceController()
  {
    return mWebServiceController;
  }

  // --------------------------------------------------------------------------
  // property: webServiceHelper
  protected WebServiceHelper mWebServiceHelper;

  /**
   * Returns the property webServiceHelper
   *
   * @return the webServiceHelper property value
   */
  public WebServiceHelper getWebServiceHelper()
  {
    return mWebServiceHelper;
  }

  /**
   * Sets the property WebServiceHelper
   *
   * @param WebServiceHelper the property value
   */
  public void setWebServiceHelper(WebServiceHelper pWebServiceHelper)
  {
    mWebServiceHelper = pWebServiceHelper;
  }


  protected OrderHistoryUIConfiguration mOrderHistoryUIConfiguration;
  /**
   * the configuration for the order history ui
   *
   * @return
   */
  public OrderHistoryUIConfiguration getOrderHistoryUIConfiguration()
  {
    return mOrderHistoryUIConfiguration;
  }

  public void setOrderHistoryUIConfiguration(OrderHistoryUIConfiguration pOrderHistoryUIConfiguration)
  {
    mOrderHistoryUIConfiguration = pOrderHistoryUIConfiguration;
  }

  //Constants for repository properties names
  private static final String SIEBEL_ID = "siebelId";
  private static final String DEFAULT_CREDIT_CARD = "defaultCreditCard";
  private static final String ALL_CREDIT_CARDS = "allCreditCards";





  // ----------------------------------------------------------------------------------
  // Methods
  // ----------------------------------------------------------------------------------

  /**
   * convertOrderToSiebelQuote
   *
   * This method takes an ATG order and converts it into a Siebel Quote.
   *
   * @param pOrder
   *          the order to convert
   *
   * @return returns the Siebel quote.
   */

  public Quote convertOrderToSiebelQuote(Order pOrder)
          throws TransformException
  {
    Quote siebelQuote = null;
    CommerceProfileTools profileTools = null;
    RepositoryItem profileItem = null;
    RepositoryItem organizationItem = null;
    RepositoryItem priceListItem = null;
    String priceListId = null;
    String accountId = null;
    String accountName = null;
    String siebelOrganisationId = null;
    List<SiebelCommerceItem> orderItems = null;
    List<QuoteItem> siebelQuoteItems = null;
    ListOfQuoteItem siebelListQuoteItems = null;

    // Instantiate the profile tools for the order

    profileTools = (CommerceProfileTools) getProfileTools();

    // Get the order profiles account details for Siebel.

    try
    {
      profileItem = profileTools.getProfileForOrder(pOrder.getId());

      if (profileItem == null)
      {
        vlogError("No profile associated with the order");
        throw new TransformException ("No profile associated with the order - "+pOrder);
      }

      // Get the price list from the profile

      priceListItem = (RepositoryItem) profileItem.getPropertyValue (getPriceListPropertyName());

      if (priceListItem != null)
      {
        priceListId = (String) priceListItem.getPropertyValue (getIdPropertyName());
      }
      else
      {
        priceListId = getPriceListManager().getDefaultPriceListId();
      }

      // Get the Siebel account id from the user.

      accountId =
              (String) profileItem
                      .getPropertyValue(getUserSiebelAccountIdPropertyName());

      // Get the user's organisation.

      organizationItem =
              (RepositoryItem) profileItem
                      .getPropertyValue(getOrganizationParentOrganizationPropertyName());

      if (organizationItem != null)
      {
        // Get the account name and the organisation id from the organization item.

        accountName =
                (String) organizationItem.getPropertyValue(getOrganizationNamePropertyName());

        siebelOrganisationId =
                (String) organizationItem.getPropertyValue(getOrganizationSiebelIdPropertyName());
      }
    }
    catch (RepositoryException e)
    {
      vlogError("RepositoryException caught getting account details - {0}", e);
      throw new TransformException(e);
    }
    catch (CommerceException e)
    {
      vlogError("CommerceException caught getting account details - {0}", e);
      throw new TransformException(e);
    }

    // Create the quote basics.

    try
    {
      siebelQuote = createSiebelQuote (pOrder, accountName, accountId, priceListId);
      siebelQuote.setPrimaryOrganizationId(siebelOrganisationId);
    }
    catch (CommerceException e)
    {
      vlogError("CommerceException caught creating Siebel Quote - {0}", e);
      throw new TransformException(e);
    }

    // Add the Quote items.

    orderItems = pOrder.getCommerceItems();

    try {
      // Convert the ATG order commerce items into Siebel quote items.

      siebelQuoteItems =
              convertCommerceItemsToQuoteItems (orderItems, null, accountId);
    } catch (RepositoryException e) {
      vlogError("RepositoryException caught converting CommerceItems - {0}", e);
      throw new TransformException(e);
    } catch (PropertyNotFoundException e) {
      vlogError("PropertyNotFoundException caught converting CommerceItems - {0}", e);
      throw new TransformException(e);
    }

    // Add the quote items to the quote.

    siebelListQuoteItems = new ListOfQuoteItem();

    siebelListQuoteItems.getQuoteItem().addAll(siebelQuoteItems);

    siebelQuote.setListOfQuoteItem(siebelListQuoteItems);


    // Add delivery address
    if (pOrder.getShippingGroupCount() > 0) {
      ShippingGroup shippingGroup = (ShippingGroup) pOrder.getShippingGroups().get(0);
      if (shippingGroup instanceof SiebelHardgoodShippingGroup) {
        SiebelHardgoodShippingGroup hgShippingGroup = (SiebelHardgoodShippingGroup) shippingGroup;
        Address address = hgShippingGroup.getShippingAddress();
        if (address != null) {
          // Covering all bases here - need to confirm correct properties to set
          siebelQuote.setShippingCity(address.getCity());
          siebelQuote.setShippingState(address.getState());
          siebelQuote.setShippingPostalCode(address.getPostalCode());
          siebelQuote.setShippingCountry(address.getCountry());
          siebelQuote.setShipToAccountId(accountId);
          siebelQuote.setShipToAccount(accountName);
          siebelQuote.setShipToAddressId(hgShippingGroup.getSiebelId());
          siebelQuote.setCarrierPriority(hgShippingGroup.getShippingMethod());
          siebelQuote.setCarrierCode(
                  ((SiebelShippingPricingEngine) getPricingTools().getShippingPricingEngine()).
                          getShippingCarrier(hgShippingGroup.getShippingMethod()));
          if (pOrder.getPriceInfo() != null) {
            siebelQuote.setFreight(Double.toString(pOrder.getPriceInfo()
                    .getShipping()));
          }
        }
      }
    }

    //Set the billing profile to quote
    setBillingProfileIdToQuote(pOrder, siebelQuote, profileItem);

    //set Contact id
    String contactId = (String)profileItem
            .getPropertyValue(SIEBEL_ID);
    siebelQuote.setContactId(contactId);

    //Bug - 17442004 - Set the Billing account and Service account in quote
    siebelQuote.setBillingAccount(accountName);
    siebelQuote.setBillingAccountId(accountId);
    siebelQuote.setServiceAccount(accountName);
    siebelQuote.setServiceAccountId(accountId);

    // Return the quote.

    return siebelQuote;
  }


  /**
   * Method to set the Billing Profile Id to Quote,
   * We first try to get the siebelAccountPrimaryBillingProfileId form PaymentGroup of Order
   * if thats not populated, we try the DefaultCreditCard's siebelItem. If thats empty we get
   * the value from first available credit card
   * @param pOrder
   * @param siebelQuote
   * @param profileItem
   */
  private void setBillingProfileIdToQuote(Order pOrder, Quote siebelQuote,
                                          RepositoryItem profileItem) {
    // Add billing profile
    if (pOrder.getPaymentGroupCount() > 0) {
      PaymentGroup paymentGroup = (PaymentGroup) pOrder
              .getPaymentGroups().get(0);
      if (paymentGroup instanceof SiebelCreditCard) {
        siebelQuote
                .setBillingProfileId(((SiebelCreditCard) paymentGroup)
                        .getSiebelAccountPrimaryBillingProfileId());
      }
    }
    // If Billing Profile id is empty set it from default credit card
    if (StringUtils.isBlank(siebelQuote.getBillingProfileId())) {
      // get the default credit card
      RepositoryItem defaultCreditCardItem = (RepositoryItem) profileItem
              .getPropertyValue(DEFAULT_CREDIT_CARD);

      if (defaultCreditCardItem != null) {

        // get the billing profile id and name from credit card item
        String billingProfileId = (String) defaultCreditCardItem
                .getPropertyValue(SIEBEL_ID);
        siebelQuote.setBillingProfileId(billingProfileId);
      }
    }
    // If the default credit card is empty, get the details from
    // allCommerceItem
    if (StringUtils.isBlank(siebelQuote.getBillingProfileId())) {
      // get the default credit card
      Map<Object, Object> allCreditCardsMap = (Map<Object, Object>) profileItem
              .getPropertyValue(ALL_CREDIT_CARDS);

      if (allCreditCardsMap != null && allCreditCardsMap.size() > 0) {

        // get the billing profile id and name from credit card item
        String billingProfileId = (String) allCreditCardsMap.keySet()
                .iterator().next();
        siebelQuote.setBillingProfileId(billingProfileId);
      }
    }
  }

  /**
   * convertSiebelQuoteToOrder
   *
   * This method takes a Siebel Quote and converts it to an ATG Order. The ATG
   * Order is added to the order repository.
   *
   * @param pQuote
   *          the quote to convert
   * @param pProfileId
   *          the profile id of the shopper.
   * @param pCatalogKey
   *          the key of the catalog being used for this user.
   * @param pAssetNumber
   *          Asset number.
   * @param pNewProductId
   *          productId of the upgrade promotion.
   * @param pIsUpgradeABO
   *          If quote is for upgrade a asset promotion.                           
   *
   * @return returns the ATG Order.
   */

  public Order convertSiebelQuoteToOrder(Quote pQuote, String pProfileId,
                                         String pCatalogKey, String pAssetNumber, String pNewProductId, boolean pIsUpgradeABO) throws TransformException {
    Order order = null;
    OrderManager orderManager = null;
    List<SiebelCommerceItem> commerceItems = null;

    // Get the order manager

    orderManager = OrderManager.getOrderManager();

    // Create the order.

    try {
      order = orderManager.createOrder(pProfileId);
      orderManager.addOrder(order);
    } catch (CommerceException e) {
      throw new TransformException(
              SiebelConstants.ORDER_ERROR_CONVERTING_QUOTE_TO_ORDER, e);
    }

    // Build up the order

    try {
      order.setDescription(pQuote.getName());

      // Set the order pricing information.

      populateOrderPricingInformation(pQuote, order);

      if (pIsUpgradeABO) {
        // get the commerceItems For ABO promotion upgrade
        commerceItems = convertQuoteItemsOFABOUpgradation(pQuote
                        .getListOfQuoteItem().getQuoteItem(), pCatalogKey, pAssetNumber,
                pNewProductId);
      } else {
        // Convert the Siebel quote items to ATG commerce items.

        commerceItems =
                convertQuoteItems(pQuote.getListOfQuoteItem().getQuoteItem(),
                        pCatalogKey);
      }

      // Add the commerce items to the order.

      for (SiebelCommerceItem commerceItem : commerceItems) {
        getCommerceItemManager().addItemToOrder(order, commerceItem);
      }
    } catch (CommerceException e) {
      throw new TransformException(
              SiebelConstants.ORDER_ERROR_CONVERTING_QUOTE_TO_ORDER, e);
    }

    // Return the order.

    return order;
  }

  /**
   * addQuoteItemToOrder
   *
   * This method converts a QuoteItem to a tree of SiebelCommerceItems and adds
   * them to the order. If a parent item is specified, the commerce item tree is
   * added to that instead of at the order level.
   *
   * @param pOrder
   *          the order where the commerce item tree is added
   * @param pParentPromotionItemId
   *          the parent item to which the tree is added if this is not null
   * @param pQuoteItem
   *          the Siebel QuoteItem to use when creating the commerce item tree.
   * @param pCatalogKey
   *          the catalog key.
   * @return
   */
  public SiebelCommerceItem addQuoteItemToOrder(Order pOrder, String pParentPromotionItemId,
                                                QuoteItem pQuoteItem, String pCatalogKey) throws TransformException,
          CommerceException
  {
    ArrayList<SiebelCommerceItem> commerceItems = null;
    SiebelCommerceItem commerceItem = null;
    SiebelCommerceItem parentCommerceItem = null;
    ArrayList<QuoteItem> quoteItems = null;

    // Set up the list of QuoteItems.

    quoteItems = new ArrayList<QuoteItem>(1);
    quoteItems.add(pQuoteItem);

    // Convert the QuoteItem into a commerce item tree.

    try {
      commerceItems =
              (ArrayList<SiebelCommerceItem>) convertQuoteItems(quoteItems,
                      pCatalogKey);
    } catch (CommerceException e) {

    }

    // Check if a commerce item was returned

    if ((commerceItems == null) || (commerceItems.size() == 0)) {
      throw new CommerceException("Null or empty commerceItems list");
    }

    // Process the first commerce item.

    commerceItem = commerceItems.get(0);

    // Check if the parent item is specified.

    try {
      if (!StringUtils.isEmpty(pParentPromotionItemId)) {
        // Add the commerce item tree to the parent.        
        parentCommerceItem =(SiebelCommerceItem) pOrder.
                getCommerceItem(pParentPromotionItemId);

        parentCommerceItem.addCommerceItem(commerceItem);
      } else {
        // Add the commerce item tree to the order.
        pOrder.addCommerceItem(commerceItem);
        ShippingGroup firstShippingGroup = (ShippingGroup) pOrder.getShippingGroups().get(0);
        getCommerceItemManager().addItemQuantityToShippingGroup(
                pOrder, commerceItem.getId(), firstShippingGroup.getId(), commerceItem.getQuantity());
      }
    } catch (CommerceItemNotFoundException e) {
      throw new TransformException(e);
    } catch (DuplicateCommerceItemException e) {
      throw new TransformException(e);
    } catch (InvalidParameterException e) {
      throw new TransformException(e);
    }

    return commerceItem;
  }


  /**
   * updateQuoteItemInOrder
   *
   * This method converts a QuoteItem to a tree of SiebelCommerceItems and uses
   * that to replace the given commerce item (tree) in the order. If the parent
   * item is specified then the tree is replaced under that instead of at the
   * order level.
   *
   * @param pOrder
   *          the order where the commerce item tree is updated
   * @param pParentItemId
   *          the parent item where the tree is updated, if this is not null
   * @param pItemId
   *          the commerce item to be replaced, either under the parent or at
   *          the order level
   * @param pQuoteItem
   *          the Siebel QuoteItem to use when creating the commerce item tree.
   * @param pCatalogKey
   *          the catalog key.
   */
  public SiebelCommerceItem updateQuoteItemInOrder(Order pOrder, String pParentItemId,
                                                   String pItemId, QuoteItem pQuoteItem, String pCatalogKey)
          throws TransformException, CommerceException {

    // Remove the existing commerceItem

    // If the product is part of a promotion then the promotion commerceItem will
    // be a 'top-level' item in the order and we must 'remove' our target
    // commerceItem from this parent promotion commerceItem; otherwise the product will have 
    // a 'top-level' item in the order which we will remove directly.
    if (pParentItemId != null) {
      SiebelCommerceItem promotionCommerceItem = (SiebelCommerceItem) pOrder.getCommerceItem(
              pParentItemId);
      promotionCommerceItem.removeCommerceItem(pItemId);
    } else {
      getCommerceItemManager().removeItemFromOrder(pOrder, pItemId);
    }

    SiebelCommerceItem item =  addQuoteItemToOrder(pOrder, pParentItemId, pQuoteItem, pCatalogKey);
    //item.setId(pItemId);
    return item;
  }

  /**
   * addProductConfigInstanceToOrder
   *
   * This method converts a RootProductConfigInstance to a SiebelCommerceItem and adds
   * it to the order. If a parent item is specified, the commerce item is
   * added to that instead of at the order level.
   *
   * @param pOrder
   *          the order where the commerce item tree is added
   * @param pParentItemId
   *          the parent item to which the tree is added if this is not null
   * @param pRootInstance
   *          the product instance config to use when creating the commerce item tree.
   * @param pCatalogKey
   *          the catalog key.
   * @return
   */
  public SiebelCommerceItem addProductConfigInstanceToOrder(Order pOrder,
                                                            RootProductConfigInstance pRootInstance,
                                                            String pCatalogKey) throws TransformException, CommerceException {

    SiebelCommerceItem commerceItem = (SiebelCommerceItem) getCommerceItemManager()
            .createCommerceItem(getDefaultCommerceItemType(), pRootInstance,
                    pCatalogKey);

    if (pRootInstance.getType().equals(
            Constants.PROD_TYPE_SIMPLE_WITH_ATTRIBUTES)) {
      Attribute[] attributes = pRootInstance.getAttributes();
      for (Attribute attribute : attributes) {
        SiebelAttribute commerceAttribute = getSiebelAttributeManager()
                .createSiebelAttribute(attribute.getId(), attribute.getName(),
                        ACTION_CODE_ADD, attribute.getValue(), attribute.getPropTypeCD());

        // Add the attribute to the commerce item.
        getCommerceItemManager().addAttributeToItem(commerceItem,
                commerceAttribute);
      }
    } else if (pRootInstance.getType().equals(
            Constants.PROD_TYPE_SIMPLE_BUNDLE)) {
      Attribute[] attributes = pRootInstance.getAttributes();
      for (Attribute attribute : attributes) {
        SiebelAttribute commerceAttribute = getSiebelAttributeManager()
                .createSiebelAttribute(attribute.getId(), attribute.getName(),
                        ACTION_CODE_ADD, attribute.getValue(), attribute.getPropTypeCD());

        // Add the attribute to the commerce item.
        getCommerceItemManager().addAttributeToItem(commerceItem,
                commerceAttribute);
      }
      ProductConfigRelationship[] relationships = pRootInstance.getChildRelationships();
      for (ProductConfigRelationship relationship : relationships) {
        ProductConfigInstance[] instances = relationship.getChildInstances();
        for (ProductConfigInstance childInstance : instances) {
          SiebelCommerceItem childCommerceItem = (SiebelCommerceItem) getCommerceItemManager()
                  .createCommerceItem(getDefaultCommerceItemType(), childInstance,
                          pCatalogKey);
          childCommerceItem.setParentRelationshipId(relationship.getId());
          if (childInstance.getType().equals(
                  Constants.PROD_TYPE_SIMPLE_WITH_ATTRIBUTES)) {
            attributes = childInstance.getAttributes();
            for (Attribute attribute : attributes) {
              SiebelAttribute commerceAttribute = getSiebelAttributeManager()
                      .createSiebelAttribute(attribute.getId(), attribute.getName(),
                              ACTION_CODE_ADD, attribute.getValue(), attribute.getPropTypeCD());

              // Add the attribute to the commerce item.
              getCommerceItemManager().addAttributeToItem(childCommerceItem,
                      commerceAttribute);
            }
          }
          commerceItem.addCommerceItem(childCommerceItem);
        }
      }
    }

    PromotionConfigInstance promotion = pRootInstance.getPromotionInstance();
    String promotionCommerceId = (promotion == null) ? null : promotion
            .getCommerceItemId();

    // Check if the parent item is specified.
    try {
      if (promotionCommerceId != null) {
        // Add the commerce item tree to the parent.

        SiebelCommerceItem parentCommerceItem =(SiebelCommerceItem) pOrder.
                getCommerceItem(promotionCommerceId);

        parentCommerceItem.addCommerceItem(commerceItem);

        // Populate the parentRelationshipId commerceItem property
        String promotionProductRelationshipId =
                promotion.findChildRelationshipByRootProduct(
                        pRootInstance).getId();

        commerceItem.setParentRelationshipId(promotionProductRelationshipId);
      } else {
        // Add the commerce item tree to the order.

        pOrder.addCommerceItem(commerceItem);
        ShippingGroup firstShippingGroup = (ShippingGroup) pOrder.getShippingGroups().get(0);
        getCommerceItemManager().addItemQuantityToShippingGroup(
                pOrder, commerceItem.getId(), firstShippingGroup.getId(), commerceItem.getQuantity());
      }
    } catch (Exception e) {
      throw new TransformException(e);
    }
    return commerceItem;
  }

  /**
   * updateProductConfigInstanceInOrder
   *
   * This method converts a RootProductConfigInstance to a SiebelCommerceItems and uses
   * it to replace the given commerce item (tree) in the order. If the parent
   * item is specified then the new ci is replaced under that instead of at the
   * order level.
   *
   * @param pOrder
   *          the order where the commerce item tree is updated
   * @param pParentItemId
   *          the parent item where the tree is updated, if this is not null
   * @param pExistingItemId
   *          the commerce item to be replaced, either under the parent or at
   *          the order level
   * @param pRootInstance
   *          the product instance to use when creating the commerce item.
   * @param pCatalogKey
   *          the catalog key.
   */
  public SiebelCommerceItem updateProductConfigInstanceInOrder(Order pOrder,
                                                               String pExistingItemId, RootProductConfigInstance pRootInstance, String pCatalogKey)
          throws TransformException, CommerceException {

    // Remove the existing commerceItem

    // If the product is part of a promotion then the promotion commerceItem will
    // be a 'top-level' item in the order and we must 'remove' our target
    // commerceItem from this parent promotion commerceItem; otherwise the product will have 
    // a 'top-level' item in the order which we will remove directly.
    if (pRootInstance.getPromotionInstance() != null) {
      SiebelCommerceItem promotionCommerceItem = (SiebelCommerceItem) pOrder.getCommerceItem(
              pRootInstance.getPromotionInstance().getCommerceItemId());
      promotionCommerceItem.removeCommerceItem(pExistingItemId);
    } else {
      getCommerceItemManager().removeItemFromOrder(pOrder, pExistingItemId);
    }

    SiebelCommerceItem item = addProductConfigInstanceToOrder(pOrder,
            pRootInstance, pCatalogKey);
    return item;
  }


  /**
   * createSiebelQuote
   *
   * This method creates the Siebel quote object and populates the fields.
   *
   * @param pOrder
   *          the order to convert
   * @param pAccountName
   *          the name of the account associated with the order.
   * @param pAccountId
   *          the id of the account associated with the order.
   * @param pPriceListId
   *          the id of the price list associated with the order.
   *
   * @return returns the Siebel quote.
   */

  protected Quote createSiebelQuote (Order pOrder, String pAccountName, String pAccountId, String pPriceListId) throws CommerceException
  {
    Quote quote = null;

    // Create the quote.

    quote = new Quote();

    // Set the account data.

    quote.setAccount (pAccountName);
    quote.setAccountId (pAccountId);

    // Set the required fields.

    quote.setRevision ("1");
    quote.setPriceListId (pPriceListId);
		/*
		 * Retrieve Siebel Quote number. If this is ABO, the quote number would
		 * be the one retrieved from ModifyAssetToQuote else it will be same as
		 * Order Id
		 */

    String quoteNumber = retrieveQuoteNumber(pOrder);

    quote.setQuoteNumber(quoteNumber);

    // Add address info TODO: Phase 3.

    // Add billing info TODO: Phase 3.

    return quote;
  }

  /**
   * If quoteNumber is present in the order, then return it else return
   * orderId.
   *
   * @param pOrder
   * @return
   */
  private String retrieveQuoteNumber(Order pOrder) {
    String quoteNumber = null;
    if (pOrder instanceof SiebelOrderImpl) {
      SiebelOrderImpl siebelOrderImpl = (SiebelOrderImpl) pOrder;
      if (!StringUtils.isBlank(siebelOrderImpl.getQuoteNumber())) {
        quoteNumber = siebelOrderImpl.getQuoteNumber();
      } else {
        quoteNumber = pOrder.getId();
      }
    }
    // if(isABO(pOrder.getId())){
    // quoteNumber = getQuoteForOrderId(pOrder.getId()).getQuoteNumber();
    // }else{
    // quoteNumber = pOrder.getId();
    // }
    vlogDebug("The quote number for {0} is {1}", pOrder.getId(),
            quoteNumber);
    return quoteNumber;
  }

  /**
   * convertCommerceItemsToQuoteItems
   *
   * Converts ATG commerce items into Siebel Quote items.
   *
   * @param pCommerceItems
   *          the atg commerce items.
   * @param pParentCommerceItem
   *          the parent commerce item
   *
   * @return a list of QuoteItem.
   *
   * @throws atg.repository.RepositoryException
   *
   */

  public List<QuoteItem> convertCommerceItemsToQuoteItems
  (
          List<SiebelCommerceItem> pCommerceItems,
          SiebelCommerceItem pParentCommerceItem, String pAccountId
  ) throws RepositoryException, PropertyNotFoundException
  {
    List<QuoteItem> quoteItems = null;
    QuoteItem quoteItem = null;
    List<QuoteItem> rootProducts = null;
    List<QuoteItem> childProducts = null;
    SiebelCatalogTools catalogTools = null;
    SiebelCatalogProduct catalogProduct = null;

    // Get the catalog tools.

    catalogTools = (SiebelCatalogTools) getCatalogTools();

    // Initialise the return array list.

    quoteItems = new ArrayList<QuoteItem>();

    // Process the commerce items.

    for (SiebelCommerceItem commerceItem : pCommerceItems)
    {
      // creating single line item for

      quoteItem = createSiebelQuoteItem(commerceItem, pParentCommerceItem, pAccountId);

      // Add the quote item to the list.

      quoteItems.add(quoteItem);

      if (commerceItem.getCommerceItemCount() > 0)
      {
        // Get the corresponding product details.

        catalogProduct =
                catalogTools.getProductDetails(commerceItem.getAuxiliaryData()
                        .getProductId());


        // Check the product type.

        if (catalogProduct.getProductType().equalsIgnoreCase(
                SiebelCatalogTools.M_PROMOTION)) {
          // The children are root products, which are added at the same level
          // as the parent.

          rootProducts =
                  convertCommerceItemsToQuoteItems(commerceItem.getCommerceItems(),
                          commerceItem, pAccountId);
          quoteItems.addAll(rootProducts);
        } else {
          // Add the child items to the parent.

          childProducts =
                  convertCommerceItemsToQuoteItems(commerceItem.getCommerceItems(),
                          commerceItem, pAccountId);
          quoteItem.getQuoteItem().addAll(childProducts);
        }
      }
    }

    // Return the quote item list.

    return quoteItems;
  }

  /**
   * createSiebelQuoteItem
   *
   * Creates a QuoteItem with corresponding QuoteItemXA from the ATG commerce
   * item
   *
   * @param pCommerceItem
   *          the ATG commerce item
   * @param pParentCommerceItem
   *          the parent commerce item
   * @param pAccountId
   *          the account id associated with the order
   *
   * @return a QuoteItem object.
   *
   * @throws atg.repository.RepositoryException
   *
   */

  public QuoteItem createSiebelQuoteItem(SiebelCommerceItem pCommerceItem,
                                         SiebelCommerceItem pParentCommerceItem, String pAccountId)
          throws RepositoryException, PropertyNotFoundException {

    SiebelCatalogTools catalogTools = (SiebelCatalogTools) getCatalogTools();
    SiebelCatalogProduct catalogProduct = catalogTools.getProductDetails(pCommerceItem
            .getAuxiliaryData().getProductId());


    // Set the QuoteItem properties.
    QuoteItem siebelQuoteItem = new QuoteItem();
    String id = (!StringUtils.isBlank(pCommerceItem.getQuoteItemId()))?pCommerceItem.getQuoteItemId():pCommerceItem.getId();
    siebelQuoteItem.setId(id);
    siebelQuoteItem.setPrePickCD(M_YES);
    siebelQuoteItem.setQuantity(Long.toString(pCommerceItem.getQuantity()));
    siebelQuoteItem.setAccountId(pAccountId);
    siebelQuoteItem.setActionCode(convertToSiebelActionCode(pCommerceItem
            .getActionCode()));
    siebelQuoteItem.setIntegrationId(pCommerceItem.getId());
    siebelQuoteItem.setProductId(pCommerceItem.getAuxiliaryData()
            .getProductId());
    siebelQuoteItem.setName(catalogProduct.getName());

    String parentRelationshipId = pCommerceItem.getParentRelationshipId();
    if (!StringUtils.isEmpty(parentRelationshipId)) {
      siebelQuoteItem.setPortItemId(pCommerceItem.getParentRelationshipId());
    }

    if (pCommerceItem.getDomainItemId() != null) {
      siebelQuoteItem.setProdItemId(pCommerceItem.getDomainItemId());
    }
    if (pCommerceItem.getCfgStateCode() != null) {
      siebelQuoteItem.setCfgStateCode(pCommerceItem.getCfgStateCode());
    }
    //For ABO set Commerce item Asset Integration Id to asset integration id
    if (pCommerceItem.getAssetIntegrationId() != null) {
      siebelQuoteItem.setAssetIntegrationId(pCommerceItem.getAssetIntegrationId());
    }else {
      // For normal flow set commerce item id to asset integration id	
      siebelQuoteItem.setAssetIntegrationId(pCommerceItem.getId());
    }

    // If this is the root product of a promotion then 
    // we have some additional properties to set.
    if (pParentCommerceItem != null) {
      SiebelCatalogProduct parentProduct = catalogTools.getProductDetails(
              pParentCommerceItem.getAuxiliaryData().getProductId());
      if (parentProduct != null && parentProduct.getProductType().equalsIgnoreCase(
              SiebelCatalogTools.M_PROMOTION)) {
        // OK we have a parent promotion, lets set some additional properties
        // set prodPromId -> id of promotion
        siebelQuoteItem.setProdPromId(parentProduct.getId());
        // set prodPromInstanceId -> prodPromoInstanceId of the commerce item 
        if(!StringUtils.isEmpty(pCommerceItem.getProdPromoInstanceId())){
          siebelQuoteItem.setProdPromInstanceId(pCommerceItem.getProdPromoInstanceId());
        }else {
          // Use the quote item id parent commerce item if its a new root product
          if(!StringUtils.isEmpty(pParentCommerceItem.getQuoteItemId())) {
            siebelQuoteItem.setProdPromInstanceId(pParentCommerceItem.getAssetIntegrationId());
          } else {
            siebelQuoteItem.setProdPromInstanceId(pParentCommerceItem.getId());//set Commerce item id as default value
          }
        }
        // parentRelationshipId should not be null but lets just check
        if (!StringUtils.isEmpty(parentRelationshipId)){
          // set prodPromRuleId -> relationship id that links product & promotion
          siebelQuoteItem.setProdPromRuleId(parentRelationshipId);
          Set<SiebelCatalogRelationship> promotionRelationships =
                  parentProduct.getChildRelationships();
          // We need to find the SiebelCatalogRelationship that links 
          // product & promotion to get the productLineId property - 
          // this is needed to retrieve additional Aggregate Product pricing data
          // from Siebel.
          for (SiebelCatalogRelationship relationship : promotionRelationships) {
            if (relationship.getRelationshipId().equals(parentRelationshipId)) {
              // set productLineId -> relationship id that links product & promotion
              siebelQuoteItem.setProductLineId(relationship.getProductLineId());
              break;
            }
          }
        }
      }
    }


    // Set the price information - NOT SURE IF WE REALLY NEED TO INCLUDE PRICING??

    if (pCommerceItem.getPriceInfo() != null)
    {
      SiebelItemPriceInfo itemPriceInfo = (SiebelItemPriceInfo) pCommerceItem.getPriceInfo();

      siebelQuoteItem.setCurrentPrice (Double.toString (itemPriceInfo.getAmount()));
      siebelQuoteItem.setListPrice (Double.toString (itemPriceInfo.getListPrice()));
      siebelQuoteItem.setPricingAdjustmentAmount(Double.toString (itemPriceInfo.getOrderDiscountShare()));
      siebelQuoteItem.setNRCCxTotal (Double.toString (itemPriceInfo.getNonRecurringPrice()));
      siebelQuoteItem.setMRCCxTotal (Double.toString (itemPriceInfo.getMonthlyRecurringPrice()));
    }

    // Set the quote attributes.

    siebelQuoteItem.setListOfQuoteItemXA(createListQuoteItemXA(pCommerceItem));

    // Return the quote item.

    return siebelQuoteItem;
  }

  /**
   * Converts the ATG attributes into attributes for the Siebel quote.
   *
   * @param pCommerceItem
   *          the ATG commerce item
   *
   * @return ListOfQuoteItemXA is a list of Siebel quote attributes.
   */

  protected ListOfQuoteItemXA createListQuoteItemXA(
          SiebelCommerceItem pCommerceItem) throws RepositoryException {
    ListOfQuoteItemXA listOfQuoteItemXA = null;
    List<QuoteItemXA> quoteItemXAs = null;
    QuoteItemXA quoteItemXA = null;

    listOfQuoteItemXA = new ListOfQuoteItemXA();

    quoteItemXAs = listOfQuoteItemXA.getQuoteItemXA();

    for (SiebelAttribute attribute : pCommerceItem.getSiebelAttributes())
    {
      quoteItemXA = new QuoteItemXA();

      quoteItemXA.setActionCode(convertToSiebelActionCode(attribute.getActionCode()));
      quoteItemXA.setAttribute (attribute.getAttributeName());
      // Set the display Name for the attribute
      quoteItemXA.setDisplayName(attribute.getAttributeName());
      quoteItemXA.setXAId(attribute.getAttributeDefinitionId());
      quoteItemXA.setCfgStateCode(attribute.getCfgStateCode());
      quoteItemXA.setValue(attribute.getValue());
      quoteItemXA.setPropTypeCD(attribute.getPropTypeCD());
      quoteItemXAs.add(quoteItemXA);
    }

    return listOfQuoteItemXA;
  }

  /**
   * populateOrderPricingInformation
   *
   * This method gets the order total pricing information from the Siebel Quote
   * and populates the order pricing data in the ATG order object.
   *
   * @param pQuote
   *          the Siebel quote.
   * @param pOrder
   *          the ATG order.
   */

  public void populateOrderPricingInformation(Quote pQuote, Order pOrder)
  {
    double mrcTotal = 0.0;
    double nrcTotal = 0.0;
    double orderAmount = 0.0;

    // Check if the order has an OrderPriceInfo object.

    if (pOrder.getPriceInfo() == null)
    {
      pOrder.setPriceInfo (new OrderPriceInfo());
    }

    // Check if the MRC total has been populated

    if (!StringUtils.isEmpty (pQuote.getMRCTotal()))
    {
      mrcTotal = Double.parseDouble (pQuote.getMRCTotal());
    }

    // Check if the NRC total has been populated

    if (!StringUtils.isEmpty (pQuote.getNRCTotal()))
    {
      nrcTotal = Double.parseDouble (pQuote.getNRCTotal());
    }

    // Calculate the order total

    if (getAddMRCToTotalFlag())
    {
      orderAmount = nrcTotal + mrcTotal;
    }
    else
    {
      orderAmount = nrcTotal;
    }

    // Set the order level price info

    pOrder.getPriceInfo().setAmount (orderAmount);

    return;
  }

  /**
   * convertQuoteItems
   *
   * This method creates a tree of ATG commerce items from the specified Siebel
   * quote items.
   *
   * @param pQuoteItems
   *          the Siebel quote items.
   *
   * @return the list of ATG commerce items.
   */

  protected List<SiebelCommerceItem> convertQuoteItems(
          List<QuoteItem> pQuoteItems, String pCatalogKey) throws CommerceException {
    List<SiebelCommerceItem> commerceItems = null;
    SiebelCommerceItem currentCommerceItem = null;
    List<SiebelCommerceItem> childCommerceItems = null;
    Map<String, SiebelCommerceItem> promotions = null;
    SiebelCommerceItem promotion = null;
    SiebelCommerceItem promotionChild = null;
    List<SiebelCommerceItem> promotionRootItems = null;

    // Create a map for any promotions in the quote item list.

    promotions = new HashMap<String, SiebelCommerceItem>(1);

    // Initialise the commerce item lists.

    commerceItems = new ArrayList<SiebelCommerceItem>(pQuoteItems.size());
    promotionRootItems = new ArrayList<SiebelCommerceItem>(pQuoteItems.size());

    // Process the Siebel quote items.

    for (QuoteItem quoteItem : pQuoteItems) {
      if (quoteItem == null) {
        throw new CommerceException("Quote contains a null quote item");
      }

      try {
        currentCommerceItem =
                (SiebelCommerceItem) createCommerceItemFromQuoteItem(quoteItem,
                        pCatalogKey);

        convertQuoteItemAttributes (quoteItem, currentCommerceItem);

        // Process the child quote items.

        if (quoteItem.getQuoteItem() != null
                && !quoteItem.getQuoteItem().isEmpty()) {
          childCommerceItems =
                  convertQuoteItems(quoteItem.getQuoteItem(), pCatalogKey);

          for (SiebelCommerceItem childCommerceItem : childCommerceItems) {
            currentCommerceItem.addCommerceItem(childCommerceItem);
          }
        }

        // Check if the quote item is a promotion.

        if (isPromotion(quoteItem)) {
          promotions.put(quoteItem.getProductId(), currentCommerceItem);

          if (!currentCommerceItem.getActionCode().equals(
                  SiebelCommerceItem.M_ACTION_CODE_DELETE)) {
            promotion = currentCommerceItem;
          }
        } else

          // Check if this quote item is a root product within the promotion

          if (isRootProduct(quoteItem) && isPartOfBundle(quoteItem)) {
            // This root must be added to the promotion.

            promotionRootItems.add(currentCommerceItem);
          } else {
            commerceItems.add(currentCommerceItem);
          }
      } catch (CommerceException e) {
        throw (e);
      }
    }

    if (promotion != null) {
      // Add the children to the promotion commerce item

      for (int index = 0; index < promotionRootItems.size(); index++) {
        promotionChild = promotionRootItems.get(index);
        promotion.addCommerceItem(promotionChild);
      }
      commerceItems.add(promotion);
    } else {
      if (promotionRootItems.size() > 0) {
        commerceItems.addAll(promotionRootItems);
      }
    }

    return commerceItems;
  }

  /**
   * createCommerceItemFromQuoteItem
   *
   * This method creates an ATG commerce item from the specified Siebel quote
   * item.
   *
   * @param pQuoteItem
   *          the Siebel quote item.
   * @param pCatalogKey
   *          the catalog for the customer
   *
   * @return the ATG commerce item.
   */

  protected SiebelCommerceItem createCommerceItemFromQuoteItem(
          QuoteItem pQuoteItem, String pCatalogKey) throws CommerceException {
    SiebelCommerceItem siebelCommerceItem = null;
    SiebelItemPriceInfo itemPriceInfo = null;
    String actionCode = null;

    // Check that a quote item has been specified.

    if (pQuoteItem == null) {
      throw new CommerceException("No quote specified");
    }

    // Create the commerce item and populate it.

    try {
      // Create an item price info for commerce item

      itemPriceInfo = (SiebelItemPriceInfo) createItemPriceInfo (pQuoteItem);

      // Create the commerce item.

      siebelCommerceItem =
              (SiebelCommerceItem) getCommerceItemManager().createCommerceItem(
                      getDefaultCommerceItemType(), pQuoteItem.getProductId(), null,
                      pQuoteItem.getProductId(), null,
                      Long.valueOf(pQuoteItem.getQuantity()), pCatalogKey, null, null,
                      itemPriceInfo);

      // Set the Siebel specific properties.

      if (siebelCommerceItem instanceof SiebelCommerceItem) {
        // Set the action code.

        actionCode = convertToATGActionCode(pQuoteItem.getActionCode());
        siebelCommerceItem.setActionCode(actionCode);
        siebelCommerceItem.setParentRelationshipId(pQuoteItem.getPortItemId());
        siebelCommerceItem.setDomainItemId(pQuoteItem.getProdItemId());
        siebelCommerceItem.setCfgStateCode(pQuoteItem.getCfgStateCode());

        // Set Asset related details
        if(!StringUtils.isEmpty(pQuoteItem.getAssetIntegrationId())){
          siebelCommerceItem.setAssetIntegrationId(pQuoteItem
                  .getAssetIntegrationId());
        } else {
          siebelCommerceItem.setAssetIntegrationId(pQuoteItem.getId());
        }
        siebelCommerceItem.setQuoteItemId(pQuoteItem.getId());
        //setting the ProdPromoRuleId for Upgrade promotion
        siebelCommerceItem.setProdPromoRuleId(pQuoteItem.getProdPromRuleId());
        siebelCommerceItem.setProdPromoInstanceId(pQuoteItem.getProdPromInstanceId());

      }
    } catch (CommerceException e) {
      throw (e);
    }

    return siebelCommerceItem;
  }



  /**
   * convertQuoteItemAttributes
   *
   * This extracts the QuoteItemXA items from the QuoteItem and uses these to
   * create SiebelAttributes. These are then added to teh commerce item.
   *
   * @param pItem
   *          the quote item.
   * @param pCommerceItem
   *          the commerce item.
   */

  protected void convertQuoteItemAttributes(QuoteItem pItem,
                                            SiebelCommerceItem pCommerceItem) throws CommerceException {
    List<QuoteItemXA> quoteAttributes = null;
    List<SiebelAttribute> commerceAttributes = null;
    SiebelAttribute commerceAttribute = null;
    String attributeDefinitionId = null;
    String attributeName = null;
    String actionCode = null;
    String value = null;
    String propTypeCD = null;

    // Make sure the quote item has been specified.

    if (pItem == null) {
      throw new CommerceException("QuoteItem is empty");
    }

    // Make sure the commerce item has been specified.

    if (pCommerceItem == null) {
      throw new CommerceException("SiebelCommerceItem is empty");
    }

    // Check if there are any quote item attributes.

    if ((pItem.getListOfQuoteItemXA() == null)
            || (pItem.getListOfQuoteItemXA().getQuoteItemXA() == null)
            || (pItem.getListOfQuoteItemXA().getQuoteItemXA().isEmpty())) {
      return;
    }

    // Get the quote attributes.

    quoteAttributes = pItem.getListOfQuoteItemXA().getQuoteItemXA();

    // Process the quote attributes.

    for (QuoteItemXA quoteAttribute : quoteAttributes) {
      // Create a commerce attribute.

      try
      {
        attributeDefinitionId = quoteAttribute.getXAId();
        attributeName = quoteAttribute.getAttribute();
        actionCode = convertToATGActionCode(quoteAttribute.getActionCode());
        value = quoteAttribute.getValue();
        propTypeCD = quoteAttribute.getPropTypeCD();

        if (!StringUtils.isEmpty(value)
                && (INTEGER_ATTRIBUTE_TYPE.equals(quoteAttribute.getPropTypeCD())
                || NUMBER_ATTRIBUTE_TYPE.equals(quoteAttribute.getPropTypeCD()))){
          value = value.replaceAll(",", "");
        }

        commerceAttribute =
                getSiebelAttributeManager().createSiebelAttribute(
                        attributeDefinitionId, attributeName, actionCode, value, propTypeCD);

        commerceAttribute.setCfgStateCode(quoteAttribute.getCfgStateCode());
        // Add the attribute to the commerce item.

        getCommerceItemManager().addAttributeToItem(pCommerceItem,
                commerceAttribute);
      } catch (CommerceException e) {
        throw e;
      }
    }
    return;
  }

  /**
   * createItemPriceInfo
   *
   * Creates an item price info object for the commerce item.
   *
   * @param pQuoteItem
   *          the quote item being processed.
   * @return ItemPriceInfo an item price info object
   *
   * @throws CommerceException
   */

  protected SiebelItemPriceInfo createItemPriceInfo (QuoteItem pQuoteItem)
          throws CommerceException
  {
    Class itemPriceInfoClass = null;
    SiebelItemPriceInfo itemPriceInfo = null;

    // Create the item price info object.

    try {
      itemPriceInfoClass = getDefaultItemPriceInfoClass();
      itemPriceInfo = (SiebelItemPriceInfo) itemPriceInfoClass.newInstance();

      if (!StringUtils.isEmpty(pQuoteItem.getCurrentPrice())) {
        itemPriceInfo.setAmount(Double
                .parseDouble(pQuoteItem.getCurrentPrice()));
      }

      if (!StringUtils.isEmpty(pQuoteItem.getListPrice())) {
        itemPriceInfo.setListPrice(Double
                .parseDouble(pQuoteItem.getListPrice()));
      }

      if (!StringUtils.isEmpty(pQuoteItem.getPricingAdjustmentAmount())) {
        itemPriceInfo.setOrderDiscountShare((long) Double
                .parseDouble(pQuoteItem.getPricingAdjustmentAmount()));
      }

      if (!StringUtils.isEmpty(pQuoteItem.getMRCCxTotal())) {
        itemPriceInfo.setMonthlyRecurringPrice (Double
                .parseDouble (pQuoteItem.getMRCCxTotal()));
      }

      if (!StringUtils.isEmpty(pQuoteItem.getNRCCxTotal())) {
        itemPriceInfo.setNonRecurringPrice (Double
                .parseDouble (pQuoteItem.getNRCCxTotal()));
      }
    } catch (InstantiationException e) {
      throw new CommerceException(e.getMessage());
    } catch (IllegalAccessException e) {
      throw new CommerceException(e.getMessage());
    }

    // Return the item price info.

    return itemPriceInfo;
  }

  /**
   * Converts an ATG action code to the values required by the Siebel web
   * services.
   *
   * @param pActionCode
   *          the ATG action code.
   *
   * @return String representation of Siebel action code
   */

  public String convertToSiebelActionCode(String pActionCode) {
    // Check the ATG action code.

    if (pActionCode == null) {
      return SiebelCommerceItem.M_ACTION_CODE_ADD;
    } else if (SiebelCommerceItem.M_ACTION_CODE_NO_ACTION.equals(pActionCode)) {
      return M_MINUS;
    } else {
      return pActionCode;
    }
  }

  /**
   * Converts a Siebel action code to the ATG action code.
   *
   * @param pActionCode
   *          the Siebel action code.
   *
   * @return String representation of ATG action code
   */

  public String convertToATGActionCode(String pActionCode) {
    // Check the Siebel action code.
    // Note the SiebelCommerceItem actionCode property 
    // has type definition of Class java.lang.String as one of [NoAction, Add, Update, Delete]
    // so be careful to return one of these values; sometimes Siebel send through 'ADD' etc
    if (StringUtils.isEmpty(pActionCode)) {
      return SiebelCommerceItem.M_ACTION_CODE_ADD;
    } else if (M_MINUS.equals(pActionCode)) {
      return SiebelCommerceItem.M_ACTION_CODE_NO_ACTION;
    } else {
      if (pActionCode.equalsIgnoreCase(SiebelCommerceItem.M_ACTION_CODE_ADD)) {
        return SiebelCommerceItem.M_ACTION_CODE_ADD;
      } else if (pActionCode.equalsIgnoreCase(SiebelCommerceItem.M_ACTION_CODE_UPDATE)) {
        return SiebelCommerceItem.M_ACTION_CODE_UPDATE;
      } else if (pActionCode.equalsIgnoreCase(SiebelCommerceItem.M_ACTION_CODE_DELETE)) {
        return SiebelCommerceItem.M_ACTION_CODE_DELETE;
      }
      return pActionCode;
    }
  }

  /**
   * isPromotion
   *
   * Establishes if the product is a promotion.
   *
   * @param pQuoteItem
   *          the quote item.
   *
   * @return true if it is a promotion and false if not.
   */

  protected boolean isPromotion(QuoteItem pQuoteItem) {
    boolean isPromo = false;
    if (pQuoteItem.getProductTypeCode() != null
            && pQuoteItem.getProductTypeCode().equalsIgnoreCase(
            SiebelCatalogTools.M_PROMOTION)) {
      isPromo = true;
    }
    return isPromo;
  }

  /**
   * isRootProduct
   *
   * Establishes if the product is a root product.
   *
   * @param pQuoteItem
   *          the quote item.
   *
   * @return true if it is a root and false if not.
   */

  protected boolean isRootProduct(QuoteItem pQuoteItem) {
    return StringUtils.isEmpty(pQuoteItem.getParentQuoteItemId());
  }

  /**
   * isPartOfBundle
   *
   * Establishes if the quote item is part of a promotion bundle.
   *
   * @param pQuoteItem
   *          the quote item.
   *
   * @return true if it is part of a bundle and false if not.
   */

  protected boolean isPartOfBundle(QuoteItem pQuoteItem) {
    return !isPromotion(pQuoteItem)
            && (!StringUtils.isEmpty(pQuoteItem.getProdPromName())
            || !StringUtils.isEmpty(pQuoteItem.getProdPromId()) || !StringUtils
            .isEmpty(pQuoteItem.getProdPromInstanceId()));
  }


  public SiebelAttribute createSiebelAttribute(String pAttributeDefinitionId, String pAttributeName,
                                               String pActionCode, String pValue, String pPropTypeCD) throws CommerceException {

    // get the class name mapped to pInvalidCommerceItemType
    String itemClassName =
            getCommerceItemTypeClassMap().getProperty(
                    getSiebelAttributeItemDescriptorName());
    if (itemClassName == null) {
      throw new InvalidTypeException();
    }

    // instantiate and return the CommerceItem
    SiebelAttribute item;
    try {
      item = (SiebelAttribute) Class.forName(itemClassName).newInstance();
      if (item instanceof ChangedProperties)
        ((ChangedProperties) item).setSaveAllProperties(true);
    } catch (Exception e) {
      throw new CommerceException(e);
    }

    // create the CommerceItem in the repository and set its id to the
    // repository's id
    try {
      MutableRepository mutRep = (MutableRepository) getOrderRepository();
      String descName = getMappedItemDescriptorName(itemClassName);
      MutableRepositoryItem mutItem = mutRep.createItem(descName);
      DynamicBeans.setPropertyValue(item, "id", mutItem.getRepositoryId());


      if (item instanceof ChangedProperties)
        ((ChangedProperties) item).setRepositoryItem(mutItem);
      item.setAttributeDefinitionId(pAttributeDefinitionId);
      item.setAttributeName(pAttributeName);
      item.setActionCode(pActionCode);
      item.setValue(pValue);
      if(!StringUtils.isBlank(pPropTypeCD))
        item.setPropTypeCD(pPropTypeCD);
    } catch (Exception e) {
      throw new CommerceException(e);
    }

    return item;
  }



  /**
   * @param pOrder
   */
  public void callRepriceOrder(Order pOrder) {
    try {
      String profileId = pOrder.getProfileId();
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
      getPricingTools().performPricingOperation(
              PricingConstants.OP_REPRICE_ORDER_TOTAL, pOrder, null, locale, profile, null);
    }
    catch(CommerceException e) {
      if(isLoggingError())
        logError(e);
    }
  }


  /**
   * Returns top-level commerceItem from order or immediate child 
   * of top-level item if given a non-null pPromotionCommerceItemId
   * parameter.
   *
   * @param pOrder - order from which to retrieve the Commerce item
   * @param pPromotionCommerceItemId - id of parent promotion (may be null)
   * @param pRootCommerceItemId - id of item that we want to retrieve
   * @return
   */
  public SiebelCommerceItem getRootLevelCommerceItem(Order pOrder,
                                                     String pPromotionCommerceItemId,
                                                     String pRootCommerceItemId) {

    SiebelCommerceItem targetItem = null;
    try {
      if (pPromotionCommerceItemId != null) {
        SiebelCommerceItem promotionCommerceItem;

        promotionCommerceItem = (SiebelCommerceItem) pOrder
                .getCommerceItem(pPromotionCommerceItemId);
        targetItem = (SiebelCommerceItem) promotionCommerceItem
                .getCommerceItem(pRootCommerceItemId);

      } else {
        targetItem = (SiebelCommerceItem) pOrder
                .getCommerceItem(pRootCommerceItemId);
      }
    } catch (CommerceItemNotFoundException e) {
      if(isLoggingError()) {
        logError(e);
      }
    } catch (InvalidParameterException e) {
      if(isLoggingError()) {
        logError(e);
      }
    }
    return targetItem;
  }

  /**
   * Checks whether a given order is valid. This involves ensuring all items in
   * the order meet the eligibility and compatibility rules. This method is not
   * intended to validate shipping and billing info but it will check it is 
   * those are included in the order. 
   *
   * @param pOrder - the order to validate
   * @return - list of errors (or an empty list if no errors)
   * @throws CommerceException
   */
  public List<String> validateOrderWithSiebel(Order pOrder) throws CommerceException
  {

    if(pOrder.getCommerceItemCount()>0)
    {
      // get web service input
      ExecuteQuotingInput input = createExecuteQuotingInput(pOrder);

      // set the required flags
      input.setPricingFlag(M_YES);
      input.setCheckEligibilityFlag(M_YES);
      input.setVerifyPromotionFlag(M_YES);

      // call the web service
      return callQuotingWebService(input, false);
    }
    //if the cart is empty, no need to validate
    return null;

  }

  /**
   * Persists an order to Siebel databases using the Siebel web services. The
   * order will also be checked for validity.  
   *
   * @param pOrder - the order to persist in Siebel
   * @return - list of errors (or an empty list if no errors)
   * @throws CommerceException
   */
  public List<String> syncOrderToSiebel(Order pOrder) throws CommerceException
  {
    // get web service input
    ExecuteQuotingInput input = createExecuteQuotingInput(pOrder);

    // set the required flags
    input.setPricingFlag(M_NO);
    input.setCheckEligibilityFlag(M_NO);
    input.setSyncQuoteFlag(M_YES);
    input.setVerifyPromotionFlag(M_NO);
    // Quotename is set in the input to match the orderID in ATG
    if( input.getListOfQuote() != null && input.getListOfQuote().getQuote() !=null ){
      List<Quote> quotes = input.getListOfQuote().getQuote();
      for(Quote quote : quotes){
        quote.setName(pOrder.getId());
      }
    }
    // call the web service
    return callQuotingWebService(input, true);

  }

  /**
   * Constructs the input for the ExecuteQuoting web service. All flags are
   * set to no.
   *
   * @param pOrder - the order to construct web service input with
   * @return the input object with all flags set to no.
   * @throws CommerceException
   */
  protected ExecuteQuotingInput createExecuteQuotingInput(Order pOrder) throws CommerceException
  {
    Quote quote = null;
    try
    {
      quote = convertOrderToSiebelQuote(pOrder);
    }
    catch (TransformException te)
    {
      throw new CommerceException(te);
    }

    ListOfQuote listOfQuote = new ListOfQuote();
    listOfQuote.getQuote().add(quote);

    ExecuteQuotingInput input = new ExecuteQuotingInput();
    input.setListOfQuote(listOfQuote);

    // unset all flags
    input.setPricingFlag(M_NO);
    input.setCheckEligibilityFlag(M_NO);
    input.setVerifyPromotionFlag(M_NO);
    input.setSyncQuoteFlag(M_NO);
    input.setQueryQuoteFlag(M_NO);
    input.setDeltaSpcActionSpcCodeSpcFlag(M_NO);
    input.setCalculateShippingCostFlag(M_NO);
    input.setRepricingFlag(M_NO);
    input.setCalculateTaxFlag(M_NO);

    if (input.getListOfQuote().getQuote() != null && input.getListOfQuote().getQuote().size() > 0 && getWebServiceHelper().getDefaultOrganization() != null) {
      input.getListOfQuote().getQuote().get(0).setPrimaryOrganizationId(getWebServiceHelper().getDefaultOrganization());
    }

    return input;
  }

  /**
   * Makes the call to the ExecuteQuoting web service 
   *
   * @param pInput - the payload to send the web service
   * @return - list of errors (or an empty list if no errors)
   * @throws CommerceException
   */
  protected List<String> callQuotingWebService(ExecuteQuotingInput pInput, boolean pShouldLogout) throws CommerceException
  {
    //QuotingWebService quotingWS = new QuotingWebService();
    //QuotingPort quotingPort = quotingWS.getQuotingPort();
    //getWebServiceHelper().prepareConnection((BindingProvider)quotingPort);
    if(pInput.getListOfQuote().getQuote() != null && pInput.getListOfQuote().getQuote().size() > 0 && getWebServiceHelper().getDefaultOrganization() != null){
      pInput.getListOfQuote().getQuote().get(0).setPrimaryOrganizationId(getWebServiceHelper().getDefaultOrganization());
    }
    List<String> errors = null;
    try
    {

      //ExecuteQuotingOutput output = quotingPort.executeQuoting(pInput);

      ExecuteQuotingOutput output = null;
      try {
        output = (ExecuteQuotingOutput)getWebServiceController().callWebService(
                "com.siebel.ordermanagement.quote.quoting.QuotingWebService",
                "QuotingPort",
                "executeQuoting",
                pInput,
                this,
                getWebServiceHelper());
      } catch (ResourcePoolException e) {
        if(isLoggingError())
          logError(e);
      } catch (NoSuchMethodException e) {
        if(isLoggingError())
          logError(e);
      } catch (InvocationTargetException e) {
        if(isLoggingError())
          logError(e);
      } catch (IllegalAccessException e) {
        if(isLoggingError())
          logError(e);
      } catch (SiebelWebServiceConfigurationException e) {
        if(isLoggingError())
          logError(e);
      }


      errors = determineErrors(output);
    }
    catch(SOAPFaultException sfe)
    {
      PerformanceMonitor.cancelOperation("executeQuoting");
      throw new CommerceException(sfe);
    }
    finally
    {
      //if(pShouldLogout)
      //{

      //executeSiebelLogout();
      //}
    }
    return errors;
  }

  /**
   * Extract errors from the response to the call to the ExecuteQuoting web
   * service call. SiebelExpressCheckoutFormHandlerSiebelExpressCheckoutFormHandler
   *
   * @param pOutput - response from call to ExecuteQuoting web service
   * @return - list of errors (or an empty list if no errors)
   */
  protected List<String> determineErrors(ExecuteQuotingOutput pOutput)
  {

    List<String> errors = new ArrayList<String>();

    // At this stage we only ever have 1 quote, so get the first one
    Quote quote = pOutput.getListOfQuote().getQuote().get(0);
    ListOfQuoteItem listOfQuoteItem = quote.getListOfQuoteItem();

    ///////////////////////////////////////////
    //
    // TODO Extract Shipping Billing and Payment errors 
    //
    ///////////////////////////////////////////

    // Get Validation Errors (ie Eligibility & Comp)
    if (listOfQuoteItem != null)
    {
      errors.addAll(determineVaildationErrors(listOfQuoteItem.getQuoteItem()));
    }
    else
    {
      errors.add("There are no items in the cart.");
    }


    return errors;
  }

  /**
   * Extracts Eligibility and Compatibility Errors from the list of quote items.
   * This method is called recursively as list of quote items can themselves
   * contain children list of quote items. 
   *
   * @param listOfQuoteItem - quote items to extract errors from
   * @return - list of errors (or an empty list if no errors)
   */
  protected List<String> determineVaildationErrors(List<QuoteItem> listOfQuoteItem)
  {

    List<String> errors = new ArrayList<String>();

    for (QuoteItem quoteItem : listOfQuoteItem)
    {
      if (quoteItem.getEligibilityStatus() != null &&
              quoteItem.getEligibilityStatus().equalsIgnoreCase(M_NO))
      {
        StringBuilder errorMessage = new StringBuilder();
        errorMessage.append(quoteItem.getName());
        errorMessage.append(" - ");
        errorMessage.append(quoteItem.getEligibilityReason());
        errors.add(errorMessage.toString());
      }

      errors.addAll(determineVaildationErrors(quoteItem.getQuoteItem()));
    }
    return errors;
  }


  /**
   * Returns an ListOfOrderDetailData object which represent the order history
   * for a given profile
   *
   * @param profile
   * @param pIndex
   * @param pPageSize
   * @return
   * @throws CommandInvocationException
   * @throws InvalidInputException
   * @throws CommandTimeoutException
   */
  public ListOfOrderDetailData getOrderSummariesForProfile(Profile pProfile, int pIndex, int pPageSize)
          throws CommandTimeoutException,
          InvalidInputException,
          CommandInvocationException,
          SOAPFaultException
  {
    if (isLoggingDebug())
      logDebug("Getting order summaries for profile " + pProfile);

    OrderDetailQueryPageOutput output = null;

    try
    {
      OrderDetailQueryPageInput input =
              createGetOrderInput(pProfile, pIndex, pPageSize);

      output = (OrderDetailQueryPageOutput)getWebServiceController().callWebService(
              "com.siebel.ordermanagement.order.details.OrderDetailWebService",
              "OrderDetailUDSPort",
              "orderDetailQueryPage",
              input,
              this,
              getWebServiceHelper());

    } catch (NoSuchMethodException e) {
      if(isLoggingError())
        logError(e);
    } catch (IllegalAccessException e) {
      if(isLoggingError())
        logError(e);
    } catch (ResourcePoolException e) {
      if(isLoggingError())
        logError(e);
    } catch (InvocationTargetException e) {
      if(isLoggingError())
        logError(e);
    } catch (SiebelWebServiceConfigurationException e) {
      if(isLoggingError())
        logError(e);
    }

    if(output==null)
      return null;

    return output.getListOfOrderDetail();
  }



  /**
   * creates an Input to the Get Order web service
   *
   * @param pProfile
   * @return
   */
  private OrderDetailQueryPageInput createGetOrderInput(Profile pProfile, int pIndex, int pPageSize)
  {
    String siebelAccountId = (String) pProfile.getDataSource()
            .getPropertyValue(getUserSiebelAccountIdPropertyName());

    OrderDetailQueryPageInput input = new OrderDetailQueryPageInput();
    ListOfOrderDetailQuery listOfOrderDetailQuery = new ListOfOrderDetailQuery();
    OrderDetailQuery orderDetailQuery = new OrderDetailQuery();

    //set the account number
    QueryType accountIdQueryType = new QueryType();
    accountIdQueryType.setValue("=\'" + siebelAccountId + "\'");
    orderDetailQuery.setAccountId(accountIdQueryType);

    //set the required fields
    QueryType queryType = new QueryType();
    orderDetailQuery.setOrderNumber(queryType);

    queryType = new QueryType();
    orderDetailQuery.setCreated(queryType);

    queryType = new QueryType();
    orderDetailQuery.setId(queryType);

    queryType = new QueryType();
    orderDetailQuery.setStatus(queryType);

    OrderItemDetailQuery itemQuery = new OrderItemDetailQuery();
    queryType = new QueryType();
    itemQuery.setProductId(queryType);

    ListOfOrderItemDetailQuery listItemQuery = new ListOfOrderItemDetailQuery();
    listItemQuery.setOrderItemDetail(itemQuery);

    orderDetailQuery.setListOfOrderItemDetail(listItemQuery);

    listOfOrderDetailQuery.setOrderDetail(orderDetailQuery);
    listOfOrderDetailQuery.setStartrownum(new BigInteger(Integer.toString(pIndex)));
    listOfOrderDetailQuery.setPagesize(new BigInteger(Integer.toString(pPageSize)));
    listOfOrderDetailQuery.setRecordcountneeded(true);

    input.setLOVLanguageMode("LDC");
    input.setViewMode("All");
    input.setListOfOrderDetail(listOfOrderDetailQuery);

    return input;
  }

  /**
   * returns the details for a given order id
   *
   * @param orderId
   * @return
   * @throws IntrospectionException
   * @throws InvocationTargetException
   * @throws IllegalAccessException
   * @throws IllegalArgumentException
   */
  public OrderDetail getOrderDetails(String pOrderId, Profile pProfile)
          throws CommandTimeoutException,
          InvalidInputException,
          CommandInvocationException,
          SOAPFaultException,
          IllegalArgumentException,
          IllegalAccessException,
          InvocationTargetException,
          IntrospectionException, SiebelWebServiceConfigurationException {
    if (isLoggingDebug())
      logDebug("Getting order details for order " + pOrderId);

    OrderDetail orderDetail = null;

    int lineItemrecordsCount = -1;
    int noOfLineItemsRetrieved = 0;
    try
    {
      OrderDetailQueryPageInput input = createGetOrderDetailInput(pOrderId, pProfile, lineItemrecordsCount);

      OrderDetailQueryPageOutput orderDetailQueryPageOutput = (OrderDetailQueryPageOutput)getWebServiceController().callWebService(
              "com.siebel.ordermanagement.order.details.OrderDetailWebService",
              "OrderDetailUDSPort",
              "orderDetailQueryPage",
              input,
              this,
              getWebServiceHelper());



      // At first time we may not get all the LIne Items because pagesize is not
      // set in the webservice call,
      // hence taking the record count in first call and verify against size of
      // lineitem list
      // if lineitem list contains less items then making one moretime
      // webservice call by setting the
      // pagesize to the lineitemcount
      OrderDetailData orderDetailData = orderDetailQueryPageOutput
              .getListOfOrderDetail().getOrderDetail().get(0);
      lineItemrecordsCount = orderDetailData.getListOfOrderItemDetail()
              .getRecordcount().intValue();
      noOfLineItemsRetrieved = orderDetailData.getListOfOrderItemDetail()
              .getOrderItemDetail().size();
      if (noOfLineItemsRetrieved < lineItemrecordsCount) {
        input = createGetOrderDetailInput(pOrderId, pProfile,
                lineItemrecordsCount);

        orderDetailQueryPageOutput = (OrderDetailQueryPageOutput)getWebServiceController().callWebService(
                "com.siebel.ordermanagement.order.details.OrderDetailWebService",
                "OrderDetailUDSPort",
                "orderDetailQueryPage",
                input,
                this,
                getWebServiceHelper());


        orderDetail = convertToOrderDetail(orderDetailQueryPageOutput);
      } else {
        orderDetail = convertToOrderDetail(orderDetailQueryPageOutput);
      }
    } catch (NoSuchMethodException e) {
      if(isLoggingError())
        logError(e);
    } catch (ResourcePoolException e) {
      if(isLoggingError())
        logError(e);
    }

    return orderDetail;
  }

  /**
   * BUild the order detail query input
   *
   * @param pOrderDetailQueryPage
   * @return
   * @throws IntrospectionException
   * @throws InvocationTargetException
   * @throws IllegalAccessException
   * @throws IllegalArgumentException
   */
  private OrderDetail convertToOrderDetail(
          OrderDetailQueryPageOutput pOutput)
          throws IllegalArgumentException,
          IllegalAccessException,
          InvocationTargetException,
          IntrospectionException
  {
    //there should only be one order returned
    OrderDetailData orderDetailData = pOutput.getListOfOrderDetail().getOrderDetail().get(0);

    //create the order detail
    OrderDetail orderDetail = new OrderDetail(orderDetailData,
            getOrderHistoryUIConfiguration().getOrderDetailQueryFields());

    //for each order item
    Iterator<OrderItemDetailData> itemIt = orderDetailData.
            getListOfOrderItemDetail().getOrderItemDetail().iterator();

    while(itemIt.hasNext())
    {
      OrderDetail.OrderItemDetail orderItemDetail =
              orderDetail.new OrderItemDetail(itemIt.next(),
                      getOrderHistoryUIConfiguration().getOrderItemDetailQueryFields());
      orderDetail.addOrderItemDetail(orderItemDetail);
    }

    Iterator<OrderPaymentData> paymentIt = orderDetailData.
            getListOfOrderPayment().getOrderPayment().iterator();

    while(paymentIt.hasNext())
    {
      OrderDetail.OrderPaymentDetail orderPaymentDetail =
              orderDetail.new OrderPaymentDetail(paymentIt.next(),
                      getOrderHistoryUIConfiguration().getOrderPaymentDetailQueryFields());
      orderDetail.addOrderPaymentDetail(orderPaymentDetail);
    }

    Iterator<ShipmentData> shipmentIt = orderDetailData.
            getListOfShipment().getShipment().iterator();

    while(shipmentIt.hasNext())
    {
      OrderDetail.OrderDeliveryDetail orderDeliveryDetail =
              orderDetail.new OrderDeliveryDetail(shipmentIt.next(),
                      getOrderHistoryUIConfiguration().getOrderDeliveryDetailQueryFields());
      orderDetail.addOrderDeliveryDetail(orderDeliveryDetail);
    }

    return orderDetail;
  }

  /**
   * convert the order detail query output to an order detail object
   *
   * @param pOrderId
   * @return
   * @throws IntrospectionException
   * @throws InvocationTargetException
   * @throws IllegalAccessException
   * @throws IllegalArgumentException
   */
  private OrderDetailQueryPageInput createGetOrderDetailInput(String pOrderId, Profile pProfile, int plineItemCount)
          throws IllegalArgumentException,
          IllegalAccessException,
          InvocationTargetException,
          IntrospectionException
  {
    String siebelAccountId = (String) pProfile.getDataSource()
            .getPropertyValue(getUserSiebelAccountIdPropertyName());

    OrderDetailQueryPageInput input = new OrderDetailQueryPageInput();
    ListOfOrderDetailQuery listOfOrderDetailQuery = new ListOfOrderDetailQuery();
    OrderDetailQuery orderDetailQuery = new OrderDetailQuery();


    //set the order number and account number
    QueryType accountIdQueryType = new QueryType();
    accountIdQueryType.setValue("=\'" + siebelAccountId + "\'");
    orderDetailQuery.setAccountId(accountIdQueryType);

    QueryType orderIdQueryType = new QueryType();
    orderIdQueryType.setValue("=\'" + pOrderId + "\'");
    orderDetailQuery.setId(orderIdQueryType);

    //set the order detail query fields
    orderDetailQuery = (OrderDetailQuery)setRequiredQueryFields(orderDetailQuery,
            getOrderHistoryUIConfiguration().getOrderDetailQueryFields());

    //set the order item query fields
    OrderItemDetailQuery itemQuery = new OrderItemDetailQuery();
    itemQuery = (OrderItemDetailQuery)setRequiredQueryFields(itemQuery,
            getOrderHistoryUIConfiguration().getOrderItemDetailQueryFields());

    ListOfOrderItemDetailQuery listItemQuery = new ListOfOrderItemDetailQuery();
    listItemQuery.setOrderItemDetail(itemQuery);

    // setting the pagination information if lineItemCount has a valid value
    if (plineItemCount > 0) {
      listItemQuery.setPagesize(new BigInteger(plineItemCount + ""));
    }
    listItemQuery.setRecordcountneeded(true);
    orderDetailQuery.setListOfOrderItemDetail(listItemQuery);
    //set the payment detail query fields
    OrderPaymentQuery paymentQuery = new OrderPaymentQuery();
    paymentQuery = (OrderPaymentQuery)setRequiredQueryFields(paymentQuery,
            getOrderHistoryUIConfiguration().getOrderPaymentDetailQueryFields());

    ListOfOrderPaymentQuery listPaymentQuery = new ListOfOrderPaymentQuery();
    listPaymentQuery.setOrderPayment(paymentQuery);
    orderDetailQuery.setListOfOrderPayment(listPaymentQuery);
    //set the shipment detail query fields
    ShipmentQuery shipmentQuery = new ShipmentQuery();
    shipmentQuery = (ShipmentQuery)setRequiredQueryFields(shipmentQuery,
            getOrderHistoryUIConfiguration().getOrderDeliveryDetailQueryFields());

    ListOfShipmentQuery listShipmentQuery = new ListOfShipmentQuery();
    listShipmentQuery.setShipment(shipmentQuery);
    orderDetailQuery.setListOfShipment(listShipmentQuery);

    listOfOrderDetailQuery.setOrderDetail(orderDetailQuery);

    input.setLOVLanguageMode("LDC");
    input.setViewMode("All");
    input.setListOfOrderDetail(listOfOrderDetailQuery);

    return input;
  }

  /**
   * sets the required fields on the order detail query object
   *
   * @param pOrderDetailQuery
   * @return
   * @throws IntrospectionException
   * @throws InvocationTargetException
   * @throws IllegalAccessException
   * @throws IllegalArgumentException
   */
  private Object setRequiredQueryFields(Object pObject, String[] pFieldNames)
          throws IllegalArgumentException,
          IllegalAccessException,
          InvocationTargetException,
          IntrospectionException
  {
    for(String fieldname:pFieldNames)
    {
      QueryType queryType = new QueryType();
      new PropertyDescriptor(fieldname, pObject.getClass()).getWriteMethod().invoke(pObject, queryType);

    }

    return pObject;
  }

  /**
   * This method checks, if the quoteitem represents the same as the pNewProductId  or a root
   * product of pNewProductId
   *
   * @param pQuoteItem
   * @param pNewProductId
   * @return
   */
  protected boolean isPartOfNewProduct(QuoteItem pQuoteItem,
                                       String pNewProductId) {

    if (pQuoteItem.getProductId() != null
            && pQuoteItem.getProductId().equals(pNewProductId)) {
      // check whether the product id is equal to the pNewProductId hence return
      // true (for the case of promotion)
      return true;
    } else if (pQuoteItem.getProdPromId() != null
            && pQuoteItem.getProdPromId().equals(pNewProductId)) {
      // check whether the ProdPromId is equal to the pNewProductId hence return
      // true (for the case of root product)
      return true;
    } else {
      return false;
    }

  }

  /**
   * This method adds the root items in promotion
   *
   * @param pPromotion
   * @param pRootItems
   * @throws CommerceException
   */
  protected void addRootProductToPromotion(SiebelCommerceItem pPromotion,
                                           List<SiebelCommerceItem> pRootItems) throws CommerceException {

    for (SiebelCommerceItem promotionRootItem : pRootItems) {
      pPromotion.addCommerceItem(promotionRootItem);
    }
  }

  /**
   * The method creates commerce items using the quote-items for upgrade
   * promotion
   *
   * @param pQuoteItems
   * @param pCatalogKey
   * @param pAssetNumber
   * @param pNewProductId
   * @return
   * @throws CommerceException
   */
  protected List<SiebelCommerceItem> convertQuoteItemsOFABOUpgradation(
          List<QuoteItem> pQuoteItems, String pCatalogKey, String pAssetNumber,
          String pNewProductId) throws CommerceException {

    List<SiebelCommerceItem> commerceItems = null;
    SiebelCommerceItem currentCommerceItem = null;
    List<SiebelCommerceItem> childCommerceItems = null;
    Map<String, SiebelCommerceItem> promotions = null;
    SiebelCommerceItem promotion = null;
    SiebelCommerceItem promotionChild = null;
    List<SiebelCommerceItem> promotionRootItems = null;

    // Create a map for any promotions in the quote item list.

    promotions = new HashMap<String, SiebelCommerceItem>(1);

    // Initialise the commerce item lists.

    commerceItems = new ArrayList<SiebelCommerceItem>(pQuoteItems.size());
    promotionRootItems = new ArrayList<SiebelCommerceItem>(pQuoteItems.size());

    // Process the Siebel quote items.

    for (QuoteItem quoteItem : pQuoteItems) {
      if (quoteItem == null) {
        throw new CommerceException("Quote contains a null quote item");
      }

      try {
        currentCommerceItem = (SiebelCommerceItem) createCommerceItemFromQuoteItem(
                quoteItem, pCatalogKey);

        convertQuoteItemAttributes(quoteItem, currentCommerceItem);

        // Process the child quote items.

        if (quoteItem.getQuoteItem() != null
                && !quoteItem.getQuoteItem().isEmpty()) {
          childCommerceItems = convertQuoteItems(quoteItem.getQuoteItem(),
                  pCatalogKey);

          for (SiebelCommerceItem childCommerceItem : childCommerceItems) {
            currentCommerceItem.addCommerceItem(childCommerceItem);
          }
        }
        // setting the assetNumber of old promotion in all the commerce items <
        // at promotion and at root level>
        currentCommerceItem.setAssetNumber(pAssetNumber);
        // setting the commerceItemType in all the commerce items < at promotion
        // and at root level>
        currentCommerceItem
                .setCommerceItemType(Constants.SiebelCommerceItemType.UPGRADEPROMOTION
                        .toString());
        // making the configuration done for old promotions and the root items
        // which were a part of old promotion.
        if (!isPartOfNewProduct(quoteItem, pNewProductId)) {
          currentCommerceItem.setConfigured(true);
        }
        // Check if the quote item is a promotion.

        if (isPromotion(quoteItem)) {
          promotions.put(quoteItem.getProductId(), currentCommerceItem);

          if (!currentCommerceItem.getActionCode().equals(
                  SiebelCommerceItem.M_ACTION_CODE_DELETE)) {
            promotion = currentCommerceItem;
          }
        } else

          // Check if this quote item is a root product within the new promotion

          if (isRootProduct(quoteItem) && isPartOfBundle(quoteItem)) {
            // This root must be added to the promotion.

            promotionRootItems.add(currentCommerceItem);
          } else {
            commerceItems.add(currentCommerceItem);
          }
      } catch (CommerceException e) {
        throw (e);
      }
    }

    if (promotion != null) {
      // Add the children to the new promotion commerce item

      for (int index = 0; index < promotionRootItems.size(); index++) {
        promotionChild = promotionRootItems.get(index);
        promotion.addCommerceItem(promotionChild);
      }
      // Add all promotions old as well as new as a commerce item
      for (SiebelCommerceItem promo : promotions.values()) {
        commerceItems.add(promo);
      }
    } else {
      if (promotionRootItems.size() > 0) {
        commerceItems.addAll(promotionRootItems);
      }
    }

    return commerceItems;

  }
  public ExecuteQuotingInput createSyncOrderInput(Order pOrder)  throws CommerceException
  {

    // get web service input
    ExecuteQuotingInput input = createExecuteQuotingInput(pOrder);

    // set the required flags
    input.setPricingFlag(M_NO);
    input.setCheckEligibilityFlag(M_NO);
    input.setSyncQuoteFlag(M_YES);
    input.setVerifyPromotionFlag(M_NO);

    // Quotename is set in the input to match the orderID in ATG
    if( input.getListOfQuote() != null && input.getListOfQuote().getQuote() !=null ){
      List<Quote> quotes = input.getListOfQuote().getQuote();
      for(Quote quote : quotes){
        quote.setName(pOrder.getId());
      }
    }


    return input;
  }

}
