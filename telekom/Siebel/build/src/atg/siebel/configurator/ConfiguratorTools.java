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

package atg.siebel.configurator;

import atg.beans.PropertyNotFoundException;
import atg.commerce.CommerceException;
import atg.commerce.order.*;
import atg.commerce.pricing.PricingConstants;
import atg.commerce.profile.CommerceProfileTools;
import atg.core.i18n.LocaleUtils;
import atg.core.util.StringUtils;
import atg.dtm.TransactionDemarcation;
import atg.dtm.TransactionDemarcationException;
import atg.nucleus.GenericService;
import atg.repository.RepositoryException;
import atg.repository.RepositoryItem;
import atg.service.resourcepool.ResourcePoolException;
import atg.servlet.ServletUtil;
import atg.siebel.catalog.SiebelCatalogAttribute;
import atg.siebel.catalog.SiebelCatalogProduct;
import atg.siebel.catalog.SiebelCatalogRelationship;
import atg.siebel.catalog.SiebelCatalogTools;
import atg.siebel.configurator.AbstractRelationship.DomainProduct;
import atg.siebel.configurator.ConfigurationParams.ContextParameters;
import atg.siebel.configurator.Constants.ConfigInstanceType;
import atg.siebel.configurator.Constants.ConfigurationCommandType;
import atg.siebel.configurator.Constants.ProductConfigInstanceStatus;
import atg.siebel.configurator.attribute.Attribute;
import atg.siebel.configurator.attribute.AttributeFactory;
import atg.siebel.configurator.attribute.AttributeHolder;
import atg.siebel.configurator.command.*;
import atg.siebel.configurator.status.CommandStatus;
import atg.siebel.configurator.status.CommandStatusManager;
import atg.siebel.integration.SiebelWebServiceConfigurationException;
import atg.siebel.integration.WebServiceController;
import atg.siebel.integration.WebServiceHelper;
import atg.siebel.order.SiebelAttribute;
import atg.siebel.order.SiebelCommerceItem;
import atg.siebel.order.SiebelConstants;
import atg.siebel.order.SiebelOrderTools;
import com.siebel.ordermanagement.configurator.cfginteractdata.DomainItem;
import com.siebel.ordermanagement.configurator.cfginteractdata.Item;
import com.siebel.ordermanagement.configurator.cfginteractdata.Relationship;
import com.siebel.ordermanagement.quote.data.ListOfQuoteItem;
import com.siebel.ordermanagement.quote.data.Quote;
import com.siebel.ordermanagement.quote.data.QuoteItem;

import javax.transaction.TransactionManager;
import java.lang.reflect.InvocationTargetException;
import java.text.MessageFormat;
import java.util.*;

/**
 * General purpose component providing low-level functionality for Configurator
 * 
 * @author bbrady
 * @version $Id:
 *          //product/Siebel/main/src/atg/siebel/configurator/ConfiguratorTools
 *          .java#33 $$Change: 1194813 $
 * @updated $DateTime: 2015/09/10 08:26:24 $$Author: saysyed $
 */
public class ConfiguratorTools extends GenericService {

  //-------------------------------------
  /** Class version string */

  public static String CLASS_VERSION = "$Id: //product/Siebel/version/11.2/src/atg/siebel/configurator/ConfiguratorTools.java#2 $$Change: 1194813 $";

  
  // -------------------------------------
  // Constants
  // -------------------------------------
  public final static Set CONFIGURABLE_PRODUCT_TYPES = new HashSet<String>(Arrays.asList(
      Constants.PROD_TYPE_CONFIGURABLE, 
      Constants.PROD_TYPE_SIMPLE_BUNDLE, 
      Constants.PROD_TYPE_SIMPLE_WITH_ATTRIBUTES,
      Constants.PROD_TYPE_SIMPLE ));
  
  public final static String INELIGIBLE_PRODUCT_FLAG_VALUE = "N";
  
  public final static String REPRICE_AND_UPDATE_ORDER_PIPELINE_ID 
      = "repriceAndUpdateOrder";

	public static final String SIEBEL_ACCOUNT_ID_STRING = "siebelAccountId";
	public static final String PARENT_ORGANISATION_STRING = "parentOrganization";
	public static final String NAME_STRING = "name";
	public static final String NUMERIC_1_STRING = "1";

  // -------------------------------------
  // Member variables
  // -------------------------------------

  // -------------------------------------
  // Properties
  // -------------------------------------

  // --------- Property: webServiceHelper -----------
  protected WebServiceHelper mWebServiceHelper;

  public void setWebServiceHelper(WebServiceHelper pWebServiceHelper) {
    mWebServiceHelper = pWebServiceHelper;
  }

  public WebServiceHelper getWebServiceHelper() {
    return mWebServiceHelper;
  }

  protected WebServiceController mWebServiceController;

  // --------- Property: webServicePool ------------
  public void setWebServiceController(WebServiceController pWebServiceController)
  {
    mWebServiceController = pWebServiceController;
  }

  public WebServiceController getWebServiceController()
  {
    return mWebServiceController;
  }

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

  // --------- Property: catalogTools -----------
  protected SiebelCatalogTools mCatalogTools;

  public void setCatalogTools(SiebelCatalogTools pCatalogTools) {
    mCatalogTools = pCatalogTools;
  }

  public SiebelCatalogTools getCatalogTools() {
    return mCatalogTools;
  }

  // --------- Property: orderHolder -----------
  protected OrderHolder mOrderHolder;

  public void setOrderHolder(OrderHolder pOrderHolder) {
    mOrderHolder = pOrderHolder;
  }

  public OrderHolder getOrderHolder() {
    return mOrderHolder;
  }

  // -------------------------------------
  // property: orderManager --------------

  protected OrderManager mOrderManager;

  public void setOrderManager(OrderManager pOrderManager) {
    mOrderManager = pOrderManager;
  }

  public OrderManager getOrderManager() {
    return mOrderManager;
  }

  // -------------------------------------
  // property: profileTools
  private CommerceProfileTools mProfileTools;

  public CommerceProfileTools getProfileTools() {
    return mProfileTools;
  }

  public void setProfileTools(CommerceProfileTools pProfileTools) {
    mProfileTools = pProfileTools;
  }

  // -------------------------------------
  // property: maxItemLevels
  private int mMaxItemLevels = 2;

  public int getMaxItemLevels() {
    return mMaxItemLevels;
  }

  public void setMaxItemLevels(int pMaxItemLevels) {
    mMaxItemLevels = pMaxItemLevels;
  }

  // -------------------------------------
  // property: attributeFactory
  private AttributeFactory mAttributeFactory;

  public AttributeFactory getAttributeFactory() {
    return mAttributeFactory;
  }

  public void setAttributeFactory(AttributeFactory mAttributeFactory) {
    this.mAttributeFactory = mAttributeFactory;
  }

  // -------------------------------------
  // property: commandStatusManager
  protected CommandStatusManager mCommandStatusManager;

  public CommandStatusManager getCommandStatusManager() {
    return mCommandStatusManager;
  }

  public void setCommandStatusManager(
      CommandStatusManager pCommandStatusTransformer) {
    mCommandStatusManager = pCommandStatusTransformer;
  }

  // -------------------------------------
  // property: isRootSPWAConfigurableProduct
  protected boolean mIsRootSPWAConfigurableProduct = false;

  public boolean getIsRootSPWAConfigurableProduct() {
    return mIsRootSPWAConfigurableProduct;
  }

  public void setIsRootSPWAConfigurableProduct(
      boolean pIsRootSPWAConfigurableProduct) {
    mIsRootSPWAConfigurableProduct = pIsRootSPWAConfigurableProduct;
  }

  // ---------------------------------------------------------------------------
  // property:transactionManager
  // ---------------------------------------------------------------------------
  private TransactionManager mTransactionManager;

  /** Gets the TransactionManager component. */
  public TransactionManager getTransactionManager() {
    return mTransactionManager;
  }

  /** Sets the TransactionManager component. */
  public void setTransactionManager(TransactionManager pTransactionManager) {
    mTransactionManager = pTransactionManager;
  }
  
  // -------------------------------------
  // Methods
  // -------------------------------------

  /**
   * Creates a new BeginConfigCommand object using the pContext parameter
   * and invokes its execute() method. This will trigger a corresponding
   * BeginConfig configurator web service call being sent to Siebel. 
   * 
   * @param pContext - context object which contains information
   *                   needed to create and execute the web service call.
   * @return a new CommandResult which contains the command execution status
   * @throws ConfiguratorException
   */
  public CommandResult callBeginConfig(ConfigurationContext pContext)
      throws ConfiguratorException {
    if (isLoggingDebug()) {
      logDebug("Entered callBeginConfig : pEvent = " + pContext);
    }
    BeginConfigCommand command = new BeginConfigCommand(pContext);
    command.setConfiguratorTools(this);
    CommandResult result = command.execute();
    if (isLoggingDebug()) {
      logDebug("Leaving callBeginConfig : result = " + result);
    }
    return result;
  }

  
  /**
   * Creates a new EndConfigCommand object using the pContext parameter
   * and invokes its execute() method. This will trigger a corresponding
   * EndConfig configurator web service call being sent to Siebel. If the command is
   * successful the result object will contain a QuoteItem object (part
   * of the web service response payload) which represents the final state
   * of the CP and which is used to update the order in the shopping cart.
   * 
   * @param context object which contains information
   *                   needed to create and execute the web service call.
   * @return a new CommandResult which contains the command execution status
   * @throws ConfiguratorException
   */
  public CommandResult callEndConfig(ConfigurationContext pContext)
      throws ConfiguratorException {

    if (isLoggingDebug()) {
      logDebug("Entered callEndConfig : pContext = " + pContext);
    }
    // add pProduct to "configured" configs in session
    EndConfigCommand command = new EndConfigCommand(pContext);
    command.setConfiguratorTools(this);

    CommandResult result = command.execute();

    if (result.getStatus().isSuccessfull()) {

      ProductConfigInstance thisInstance = (ProductConfigInstance) pContext
          .getInstance();
      String rootCPCommerceId = thisInstance.getCommerceItemId();

      // promotionCommerceId may very well be null - if this root CP is not
      // part of a promotion
      PromotionConfigInstance promotion = thisInstance.getPromotionInstance();
      String promotionCommerceId = (promotion == null) ? null : promotion
          .getCommerceItemId();

      QuoteItem quoteItem = (QuoteItem) result.getContext().get(
          Constants.QUOTE_ITEM);
       Order order = getOrderHolder().getCurrent();
      TransactionDemarcation transactionDemarcation = null;
      boolean rollback = true;
      try {
        transactionDemarcation = new TransactionDemarcation();

        transactionDemarcation.begin(getTransactionManager(),
            TransactionDemarcation.REQUIRED);
        
        String catalogKey = getCatalogKey(order);
        
        SiebelCommerceItem existingItem = null;       
        SiebelCommerceItem newCommerceItem = null;
        
        if (StringUtils.isEmpty(rootCPCommerceId)) {
          newCommerceItem = ((SiebelOrderTools) getOrderManager()
              .getOrderTools()).addQuoteItemToOrder(order, promotionCommerceId,
              quoteItem, catalogKey);
        } else {
          existingItem = ((SiebelOrderTools) getOrderManager()
              .getOrderTools()).getRootLevelCommerceItem(order, promotionCommerceId, rootCPCommerceId);
          newCommerceItem = ((SiebelOrderTools) getOrderManager()
              .getOrderTools()).updateQuoteItemInOrder(order,
              promotionCommerceId, rootCPCommerceId, quoteItem, catalogKey);
          
          //set ABO properties
          newCommerceItem.setAssetNumber(existingItem.getAssetNumber());
          newCommerceItem.setCommerceItemType(existingItem.getCommerceItemType());
          if(newCommerceItem.isAbo()){
        	  for(SiebelCommerceItem child : (List<SiebelCommerceItem>)newCommerceItem.getCommerceItems()){
        		  child.setAssetNumber(existingItem.getAssetNumber());
        	  }
          }
          
        }
        thisInstance.setCommerceItemId(newCommerceItem.getId());
        getOrderManager().updateOrder(order);
        if (existingItem != null) {
          existingItem.removeItem();
        }
        rollback = false;
      } catch (Exception e) {
        logError(e);
        throw new ConfiguratorException(e);
      } finally {
        try {
          transactionDemarcation.end(rollback);
        } catch (TransactionDemarcationException e) {
          logError(e);
          throw new ConfiguratorException(e);
        }
      }
    }
    if (isLoggingDebug()) {
      logDebug("Leaving callEndConfig : result = " + result);
    }
    return result;
  }

  
  /**
   * sets the id of the parent relationship on the associated commerce item if the 
   * instance has a promotion associated
   * 
   * @param pInstance
   */
  public void setParentRelationshipOnCommerceItem(ProductConfigInstance pInstance)
      throws ConfiguratorException 
  {
    PromotionConfigInstance promo = pInstance.getPromotionInstance();
    
    if (promo != null) {
          PromotionRootCPRelationship relationship = findRelationship(promo, pInstance);
                    
          Order order = getOrderHolder().getCurrent();
          
          try
          {
            SiebelCommerceItem promoCommerceItem = (SiebelCommerceItem)order.
                getCommerceItem(promo.getCommerceItemId());
            
            SiebelCommerceItem commerceItem = (SiebelCommerceItem)promoCommerceItem.
                getCommerceItem(pInstance.getCommerceItemId());

              commerceItem.setParentRelationshipId(relationship.getId());
          }
          catch(InvalidParameterException ipe)
          {
            throw new ConfiguratorException(ipe);
          }
          catch(CommerceItemNotFoundException cinfe)
          {
            throw new ConfiguratorException(cinfe);
          }
      }
  }
  

  /**
   * Creates a new GetProductPromotionCommand object using the pContext parameter
   * and invokes its execute() method. This will trigger a corresponding
   * GetProductPromotionDefinition web service call being sent to Siebel. Note - 
   * this is not part of the Siebel Configurator webservice suite but part of
   * the promotion webservices api.
   * 
   * @param pContext - context object which contains information
   *                   needed to create and execute the web service call.
   * @return a new CommandResult which contains the command execution status
   * @throws ConfiguratorException
   */
  public CommandResult callGetProductPromotion(ConfigurationContext pContext)
      throws ConfiguratorException {

    if (isLoggingDebug()) {
      logDebug("Entered callGetProductPromotion : pContext = " + pContext);
    }
    GetProductPromotionCommand command = new GetProductPromotionCommand(
        pContext);
    command.setConfiguratorTools(this);
    CommandResult result = command.execute();
    if (isLoggingDebug()) {
      logDebug("Leaving callGetProductPromotion : result = " + result);
    }
    return result;
  }

  
  /**
   * Creates a new SetAttributeCommand object using the pContext parameter
   * and invokes its execute() method. This will trigger a corresponding
   * SetAttribute configurator web service call being sent to Siebel. 
   * 
   * @param pContext - context object which contains information
   *                   needed to create and execute the web service call.
   * @return a new CommandResult which contains the command execution status
   * @throws ConfiguratorException
   */
  public CommandResult callSetAttributes(ConfigurationContext pContext)
      throws ConfiguratorException {
    if (isLoggingDebug()) {
      logDebug("Entered callSetAttributes : pContext = " + pContext);
    }
    SetAttributeCommand command = new SetAttributeCommand(pContext);
    command.setConfiguratorTools(this);
    CommandResult result = command.execute();
    if (isLoggingDebug()) {
      logDebug("Leaving callSetAttributes : result = " + result);
    }
    return result;
  }

  
  /**
   * Creates a new AddProductCommand object using the pContext parameter
   * and invokes its execute() method. This will trigger a corresponding
   * AddItem configurator web service call being sent to Siebel. 
   * 
   * @param pContext - context object which contains information
   *                   needed to create and execute the web service call.
   * @return a new CommandResult which contains the command execution status
   * @throws ConfiguratorException
   */
  public CommandResult callAddProduct(ConfigurationContext pContext)
      throws ConfiguratorException {
    if (isLoggingDebug()) {
      logDebug("Entered callAddProduct : pContext = " + pContext);
    }
    AddProductCommand command = new AddProductCommand(pContext);
    command.setConfiguratorTools(this);
    CommandResult result = command.execute();
    if (isLoggingDebug()) {
      logDebug("Leaving callAddProduct : result = " + result);
    }
    return result;
  }

  
  /**
   * Creates a new RemoveProductCommand object using the pContext parameter
   * and invokes its execute() method. This will trigger a corresponding
   * RemoveItem configurator web service call being sent to Siebel. 
   * 
   * @param pContext - context object which contains information
   *                   needed to create and execute the web service call.
   * @return a new CommandResult which contains the command execution status
   * @throws ConfiguratorException
   */
  public CommandResult callRemoveProduct(ConfigurationContext pContext)
      throws ConfiguratorException {
    if (isLoggingDebug()) {
      logDebug("Entered callRemoveProduct : pContext = " + pContext);
    }
    RemoveProductCommand command = new RemoveProductCommand(pContext);
    command.setConfiguratorTools(this);
    CommandResult result = command.execute();
    if (isLoggingDebug()) {
      logDebug("Leaving callRemoveProduct : result = " + result);
    }
    return result;
  }

  
  /**
   * Creates a new ReplaceProductCommand object using the pContext parameter
   * and invokes its execute() method. This will trigger a corresponding
   * ReplaceItem configurator web service call being sent to Siebel. 
   * 
   * @param pContext - context object which contains information
   *                   needed to create and execute the web service call.
   * @return a new CommandResult which contains the command execution status
   * @throws ConfiguratorException
   */
  public CommandResult callReplaceProduct(ConfigurationContext pContext)
      throws ConfiguratorException {
    if (isLoggingDebug()) {
      logDebug("Entered callReplaceProduct : pContext = " + pContext);
    }
    ReplaceProductCommand command = new ReplaceProductCommand(pContext);
    command.setConfiguratorTools(this);
    CommandResult result = command.execute();
    if (isLoggingDebug()) {
      logDebug("Leaving callReplaceProduct : result = " + result);
    }
    return result;
  }

  
  /**
   * @param pContext
   * @return
   * @throws ConfiguratorException
   */
  public CommandResult callMultiFacetUpdate(ConfigurationContext pContext)
      throws ConfiguratorException {
    if (isLoggingDebug()) {
      logDebug("Entered callMultiFacetUpdate : pContext = " + pContext);
    }
    MultiFacetUpdateCommand command = new MultiFacetUpdateCommand(pContext);
    command.setConfiguratorTools(this);
    CommandResult result = command.execute();
    if (isLoggingDebug()) {
      logDebug("Leaving callMultiFacetUpdate : result = " + result);
    }
    return result;
  }

  
  /**
   * 
   * 
   * @param pOrder
   * @return
   * @throws RepositoryException
   */
  public String getCatalogKey(Order pOrder) throws RepositoryException {
    if (isLoggingDebug()) {
      logDebug("Entered getCatalogKey : pOrder = " + pOrder);
    }
    RepositoryItem profileItem = getOrderManager().getOrderTools()
        .getProfileTools().getProfileForOrder(pOrder);
    String locale = null;
    if (profileItem != null) {
      locale = (String) profileItem.getPropertyValue("locale");
    }
    if (StringUtils.isEmpty(locale)) {
      Locale defaultLocale = getOrderManager().getOrderTools()
          .getProfileTools().getLocaleService().getLocale();
      locale = defaultLocale.getDisplayName();
    }
    if (isLoggingDebug()) {
      logDebug("Leaving getCatalogKey : locale = " + locale);
    }
    return locale;
  }
  
  /**
   * @param pOrder
   * @return
   * @throws RepositoryException
   */
  public Locale getLocale(Order pOrder) throws RepositoryException {
    if (isLoggingDebug()) {
      logDebug("Entered getLocale : pOrder = " + pOrder);
    }
    Locale locale = null;
    String localeString = null;
    
    RepositoryItem profileItem = getOrderManager().getOrderTools()
        .getProfileTools().getProfileForOrder(pOrder);

    if (profileItem != null) {
      localeString = (String) profileItem.getPropertyValue("locale");
      if (!StringUtils.isEmpty(localeString)) {        
        locale = LocaleUtils.constructLocale(localeString);
      } 
    }
    
    if (locale == null) {
      locale = getOrderManager().getOrderTools()
          .getProfileTools().getLocaleService().getLocale();
    }
    if (isLoggingDebug()) {
      logDebug("Leaving getLocale : locale = " + locale);
    }
    return locale;
  }

  /**
   * @param pCommerceItemId
   * @param pConfiguratorManager
   * @return
   * @throws CommerceException
   */
  public BaseConfigInstance createConfigInstance(String pCommerceItemId,
      ConfigInstanceType pConfig, ConfiguratorManager pConfiguratorManager)
      throws ConfiguratorException {
    if (isLoggingDebug()) {
      logDebug("Entered createConfigInstance : pCommerceItemId = "
          + pCommerceItemId);
    }
    Order order = getOrderHolder().getCurrent();
    String orderId = order.getId();
    try {
      SiebelCommerceItem commerceItem = (SiebelCommerceItem) order.getCommerceItem(pCommerceItemId);
      
      return createConfigInstance(commerceItem, pConfig, pConfiguratorManager, 0);
      
    } catch (Exception e) {
      String error = "Exception caught creating CP: orderId = {0}, commerceItemId = {1}, exception = {2}";
      Object[] args = { orderId, pCommerceItemId, e };
      error = MessageFormat.format(error, args);
      logError(error);
      throw new ConfiguratorException(error);
    }
  }
  
  public BaseConfigInstance createConfigInstance(CommerceItem pCommerceItem,
        ConfigInstanceType pConfig, ConfiguratorManager pConfiguratorManager,
        int pInstanceNumber)
      throws ConfiguratorException 
  {
    BaseConfigInstance instance = null;
    
    Order order = getOrderHolder().getCurrent();
    String orderId = order.getId();
    
    try {
        String productId = pCommerceItem.getAuxiliaryData().getProductId();
        switch (pConfig) {
        case PRODUCT_CONFIG_INSTANCE:
          instance = new RootProductConfigInstance(orderId, pCommerceItem.getId(),
              productId, pInstanceNumber, pConfiguratorManager);
          break;
        case PROMOTION_CONFIG_INSTANCE:
          instance = new PromotionConfigInstance(orderId, pCommerceItem.getId(),
              productId, pConfiguratorManager);
          break;
        }
        RepositoryItem item = getCatalogTools().findProduct(productId);
      } catch (Exception e) {
        String error = "Exception caught creating CP: orderId = {0}, commerceItemId = {1}, exception = {2}";
        Object[] args = { orderId, pCommerceItem.getId(), e };
        error = MessageFormat.format(error, args);
        logError(error);
        throw new ConfiguratorException(error);
      }
      if (isLoggingDebug()) {
        logDebug("Leaving createConfigInstance : instance = " + instance);
      }
      return instance;
  }

  /**
   * @param pCommerceItemId
   * @return
   * @throws CommerceException
   */
  public RepositoryItem getCommerceItemProduct(String pCommerceItemId)
      throws ConfiguratorException {
    if (isLoggingDebug()) {
      logDebug("Entered getCommerceItemProduct() : pCommerceItemId = "
          + pCommerceItemId);
    }
    RepositoryItem product = null;
    Order order = getOrderHolder().getCurrent();
    try {
      SiebelCommerceItem commerceItem = (SiebelCommerceItem) order.getCommerceItem(pCommerceItemId);
      
      String productId = commerceItem.getAuxiliaryData().getProductId();
      product = getCatalogTools().findProduct(productId);
    } catch (Exception e) {
      logError(e);
      throw new ConfiguratorException(e);
    }
    if (isLoggingDebug()) {
      logDebug("Leaving getCommerceItemProduct() : product = " + product);
    }
    return product;
  }

  /**
   * @param pRepositoryItem
   * @param pDepth
   * @return
   * @throws ConfiguratorException
   */
  public int determineProductDepth(RepositoryItem pRepositoryItem, int pDepth)
      throws ConfiguratorException {

    if (isLoggingDebug()) {
      logDebug("Entered determineProductDepth() : pRepositoryItem == "
          + pRepositoryItem + " : pDepth == " + pDepth);
    }

    int depth = pDepth;
    RepositoryItem structure = (RepositoryItem) pRepositoryItem
        .getPropertyValue(Constants.CONFIGURABLE_PRODUCT_STRUCTURE);
    if (structure == null) {
      structure = (RepositoryItem) pRepositoryItem
          .getPropertyValue(Constants.SIMPLE_BUNDLE_STRUCTURE);
    }
    if (structure == null) {
      String type = (String) pRepositoryItem
          .getPropertyValue(Constants.PRODUCT_TYPE_PROPERTY);
      if (Constants.PROD_TYPE_SIMPLE_WITH_ATTRIBUTES.equalsIgnoreCase(type)) {
        depth++;
      }
    } else {
      Set<RepositoryItem> relationships = (Set<RepositoryItem>) structure
          .getPropertyValue(Constants.RELATIONSHIPS_PROPERTY);
      if (relationships != null && !relationships.isEmpty()) {
        depth++;
        int childProductDepth = 0;
        for (RepositoryItem relationship : relationships) {
          RepositoryItem productItem = (RepositoryItem) relationship
              .getPropertyValue("defaultProduct");
          if (productItem != null) {
            String productType = (String) productItem
                .getPropertyValue(Constants.PRODUCT_TYPE_PROPERTY);
            if (isConfigurableProduct(productType)) {
              int temp = determineProductDepth(productItem, depth);
              if (temp > childProductDepth) {
                childProductDepth = temp;
              }
            }
          }
        }
        depth += childProductDepth;
      }
    }

    if (isLoggingDebug()) {
      logDebug("Leaving determineProductDepth() : depth = " + depth);
    }

    return depth;
  }

  /**
   * Method to configure the PCI from the Siebel item that is obtained from web
   * service response
   * 
   * @param pInstance
   * @param pConfiguredItem
   * @throws ConfiguratorException
   */
  public void configureInstancefromSiebelItem(ProductConfigInstance pInstance,
      Item pConfiguredItem) throws ConfiguratorException {

    if (!isEligibleCompatibleProduct(pConfiguredItem)) {
      // Placeholder - we need to decide in the behaviour in
      // these cases
      if (isLoggingDebug()) {
        logDebug("Ineligible root product - productId= "+
          pConfiguredItem.getProductId());
      }
    }
    // Update necessary fields in PCI based on siebel item without rebuilding
    // the PCI
    updatePCIFromSiebelItem(pInstance, pConfiguredItem);
    configurePCIfromSiebelItem(pInstance, pConfiguredItem);
  }

  /**
   * @param pInstance
   * @param pSiebelItem
   * @throws ConfiguratorException
   */
  protected void configurePCIfromSiebelItem(ProductConfigInstance pInstance,
      Item pSiebelItem) throws ConfiguratorException {

    if (isLoggingDebug()) {
      logDebug("Entered configurePCIfromSiebelItem() : pInstance == "
          + pInstance + " : pSiebelItem == " + pSiebelItem);
    }
    
    // We'll sort out the attributes first
    atg.siebel.configurator.attribute.Attribute[] instanceAttributes = getAttributesFromItem(pSiebelItem);
    pInstance.setAttributes(instanceAttributes);
    if(pSiebelItem.getIntegrationId()!=null){
    	pInstance.setIntegrationId(pSiebelItem.getIntegrationId());
    }
    int quantity = getQuantity(pSiebelItem);
    pInstance.setQuantity(quantity);
    // Now figure out child products
    addChildProducts(pInstance, pSiebelItem);

    if (isLoggingDebug()) {
      logDebug("Leaving configurePCIfromSiebelItem()");
    }
  }

  /**
   * @param pInstance
   * @param pItem
   * @throws RepositoryException
   * @throws ConfiguratorException
   */
  protected void addChildProducts(ProductConfigInstance pInstance, Item pItem)
      throws ConfiguratorException {

    if (isLoggingDebug()) {
      logDebug("Entered addChildProducts() : pInstance == " + pInstance
          + " : pItem == " + pItem);
    }

    ProductConfigRelationship[] relationships = getChildRelationships(pItem,
        pInstance);
    pInstance.setChildRelationships(relationships);
    // Find the appropriate relationship for each item and
    // add new/existing PCI instance to same.
    // Note - we also do an eligibility/compatibility check 
    // here before we go adding any PCI's into our product
    // instance model.
    List<Item> childItems = pItem.getItem();
    for (Item item : childItems) {
      boolean isEligible = (isEligibleCompatibleProduct(item));
      if (!isEligible) {
        // Placeholder - we need to decide what the behaviour should
        // be in this instance
        if (isLoggingDebug()) {
          logDebug("Ineligible child product - productId = "+item.getProductId());
    	}
      }
      for (ProductConfigRelationship childRelationship : relationships) {
        if (childRelationship.getId().equals(item.getPortId())) {
          ChildProductConfigInstance instance = (ChildProductConfigInstance) mProductConfigInstanceCache
              .getInstance(item.getIntegrationId());
          if (instance != null) {
            // If this instance already exists then we'll
            // re-use it.
            // First though we need to remove it from the cache as
            // it's key property may need to be updated and this
            // is one of our cache key's
            mProductConfigInstanceCache
                .removeProductConfigInstanceFromCache(instance);
            childRelationship.addChildInstance(instance);
          } else {
            instance = childRelationship.addChildInstance(item.getProductId());
          }
          configurePCIfromSiebelItem(instance, item);
          mProductConfigInstanceCache.cacheProductConfigInstance(instance);
          break;
        }
      }

    }

    if (isLoggingDebug()) {
      logDebug("Leaving addChildProducts()");
    }
  }

  /**
   * @param pItem
   * @return
   */
  protected int getQuantity(Item pItem) {
    if (isLoggingDebug()) {
      logDebug("Entered getQuantity() : pItem == " + pItem);
    }

    int quantity = 1;
    String itemQuantity = pItem.getQuantity();
    if (!StringUtils.isEmpty(itemQuantity)) {
      try {
        quantity = Integer.valueOf(itemQuantity);
      } catch (NumberFormatException nfe) {
        // log something
      }
    }

    if (isLoggingDebug()) {
      logDebug("Leaving getQuantity() : quantity == " + quantity);
    }
    return quantity;
  }

  /**
   * @param pItem
   * @return
   * @throws RepositoryException
   * @throws ConfiguratorException
   */
	protected ProductConfigRelationship[] getChildRelationships(Item pItem,
			ProductConfigInstance pInstance) throws ConfiguratorException {

		if (isLoggingDebug()) {
			logDebug("Entered getChildRelationships() : pItem == " + pItem
					+ " : pInstance == " + pInstance);
		}

		List<Relationship> relationshipsFromSiebel = pItem.getRelationship();
		// We'll (re)build the list of relationships for this instance using
		// this
		// newRelationshipList variable
		List<ProductConfigRelationship> newRelationshipList = new ArrayList<ProductConfigRelationship>(
				relationshipsFromSiebel.size());

		ProductConfigRelationship prodRelationship = null;
		for (Relationship relationshipFromSiebel : relationshipsFromSiebel) {
			if (pInstance.getChildRelationship(relationshipFromSiebel.getId()) != null) {
				// if the relationship already exists then we'll re-use it
				ProductConfigRelationship existingRelationship = pInstance
						.getChildRelationship(relationshipFromSiebel.getId());
				// null out childInstances as we will "rebuild" this property
				// from the Siebel response
				existingRelationship.setChildInstances(null);
				prodRelationship = existingRelationship;
				// newRelationshipList.add(existingRelationship);
			} else {
				RepositoryItem relItem;
				try {
					relItem = getCatalogTools().getCatalog().getItem(
							relationshipFromSiebel.getId(),
							Constants.RELATIONSHIP_REPOSITORY_ITEM);
				} catch (RepositoryException e) {
					throw new ConfiguratorException(e);
				}
				if (relItem == null) {
					throw new ConfiguratorException(
							"Relationship does not exist in the ProductCatalog - "
									+ relationshipFromSiebel.getId());
				}
				Integer minCardinalty = (Integer) relItem
						.getPropertyValue(Constants.RELATIONSHIP_MIN_CARDINALITY_PROPERTY);
				Integer maxCardinalty = (Integer) relItem
						.getPropertyValue(Constants.RELATIONSHIP_MAX_CARDINALITY_PROPERTY);
				Integer defaultCardinalty = (Integer) relItem
						.getPropertyValue(Constants.RELATIONSHIP_DEFAULT_CARDINALITY_PROPERTY);

				prodRelationship = new ProductConfigRelationship(pInstance,
						relationshipFromSiebel.getId(), minCardinalty,
						maxCardinalty, defaultCardinalty);
				prodRelationship.setDisplayName(relationshipFromSiebel
						.getName());
				// }
				// If we dont get a default product from the soap message
				// lets check the repository - maybe that's where we should
				// always
				// look???
				if (StringUtils.isEmpty(prodRelationship.getDefaultProductId())) {
					RepositoryItem defaultProduct = (RepositoryItem) relItem
							.getPropertyValue(Constants.RELATIONSHIP_DEFAULT_PRODUCT_PROPERTY);
					if (defaultProduct != null) {
						prodRelationship.setDefaultProductId(defaultProduct
								.getRepositoryId());
					}
				}
			}
			List<DomainItem> domainItems = relationshipFromSiebel
					.getDomainItem();
			// The below code is commented to avoid the array index out of
			// bounds exception
			// for products with zero domain items
			/*
			 * if (domainItems.size() == 0) { // ????? DomainItem item =
			 * domainItems.get(0);
			 * prodRelationship.setDefaultProductId(item.getId());
			 * prodRelationship.setDefaultProductName(item.getName()); } else {
			 */
			List<DomainProduct> domainProducts = new ArrayList<DomainProduct>();
			for (DomainItem item : domainItems) {
				// domainProducts.put(item.getId(), item.getName());
				if (!(isExcludedDomainProduct(item))) {
					DomainProduct product = prodRelationship.new DomainProduct();
					product.setId(item.getId());
					product.setName(item.getName());
					domainProducts.add(product);
				} else {
					if (isLoggingDebug()) {
						logDebug("Excluded Domain Product - " + item.getId());
					}
				}
			}
			if (domainProducts.isEmpty()) {
				// Placeholder - what do we do here? We could remove the
				// relationship?
				if (isLoggingDebug()) {
					logDebug("All Domain Products for relationship - "
							+ prodRelationship
							+ "  are excluded : excluding relationship");
				}
			}
			prodRelationship.setDomainProducts(domainProducts
					.toArray(new DomainProduct[domainProducts.size()]));

			newRelationshipList.add(prodRelationship);
			// }
		}
		return newRelationshipList
				.toArray(new ProductConfigRelationship[newRelationshipList
						.size()]);
	}

  /**
   * @param pConfiguredItem
   * @return
   * @throws ConfiguratorException
   */
  protected atg.siebel.configurator.attribute.Attribute[] getAttributesFromItem(
      Item pConfiguredItem) throws ConfiguratorException {

    if (isLoggingDebug()) {
      logDebug("Entered getAttributesFromItem : pConfiguredItem == "
          + pConfiguredItem);
    }

    // These are the attributes in the WS payload
    List<com.siebel.ordermanagement.configurator.cfginteractdata.Attribute> attributes = pConfiguredItem
        .getAttribute();

    // This is what we will return
    atg.siebel.configurator.attribute.Attribute[] instanceAttributes = new atg.siebel.configurator.attribute.Attribute[attributes
        .size()];

    // Try to get the related repositoryItems for the attributes in the WS payload,
    // we'll use them to enrich the data coming from the WS
    Map<String, RepositoryItem> repositoryAttributes = new HashMap<String, RepositoryItem>();
    try {
      RepositoryItem prodItem = getCatalogTools().getCatalog().getItem(
          pConfiguredItem.getProductId(),
          Constants.PRODUCT_ITEM_DESCRIPTOR_NAME);
      if (prodItem != null) {
        Set<RepositoryItem> configuredAttributes = (Set<RepositoryItem>) prodItem
            .getPropertyValue("configuredAttributes");
        if (configuredAttributes != null) {
          for (RepositoryItem configuredAttribute : configuredAttributes) {
            repositoryAttributes.put(
                (String) configuredAttribute.getPropertyValue("attributeName"),
                configuredAttribute);
          }
        }
      }
    } catch (RepositoryException e) {
      logError(e);
      throw new ConfiguratorException(e);
    }

    // Now marshall the WS attributes into our return array
    int index = 0;
    AttributeFactory attributeFactory = getAttributeFactory();
    for (com.siebel.ordermanagement.configurator.cfginteractdata.Attribute attribute : attributes) {
      SiebelCatalogAttribute catalogAttribute = null;
      RepositoryItem attributeItem = repositoryAttributes.get(attribute.getName());
      if (attributeItem != null) {
        try {
          catalogAttribute = getCatalogTools().createSiebelCatalogAttribute(attributeItem);
        } catch (Exception e) {
          logError(e);
        }
      }
      instanceAttributes[index++] = attributeFactory.createAttribute(attribute, catalogAttribute);
    }

    if (isLoggingDebug()) {
      logDebug("Leaving getAttributesFromItem() : instanceAttributes == "
          + instanceAttributes);
    }
    return instanceAttributes;
  }
  
  /**
   * @return
   */
  public boolean isConfigurableProduct(String pType) {
    return ConfiguratorTools.CONFIGURABLE_PRODUCT_TYPES.contains(pType);
  }

  /**
   * @return
   */
  public boolean isConfigurableViaSiebelWebservice(String pType, boolean pIsRootLevelProduct, boolean isABO) {
    if (isLoggingDebug()) {
      logDebug("Entered isConfigurableProduct : pType == " + pType);
    }

    boolean isConfigurable = false;
    if (pIsRootLevelProduct) { 
      if (pType.equals(Constants.PROD_TYPE_CONFIGURABLE) || (isABO && pType
              .equals(Constants.PROD_TYPE_SIMPLE_WITH_ATTRIBUTES))
          || (getIsRootSPWAConfigurableProduct() && pType
              .equals(Constants.PROD_TYPE_SIMPLE_WITH_ATTRIBUTES))) {
        isConfigurable = true;
      }
    } else {
      isConfigurable = isConfigurableProduct(pType);
    }

    if (isLoggingDebug()) {
      logDebug("Leaving isConfigurableProduct() : isConfigurable == "
          + isConfigurable);
    }
    return isConfigurable;
  }

  /**
   * 
   * @param pConfigurationContext
   * @return
   * @throws ConfiguratorException 
   */
  public CommandResult configureInstanceFromRepositoryData(
      ConfigurationContext pConfigurationContext) throws ConfiguratorException {
    if (isLoggingDebug()) {
      logDebug("Entered configureInstanceFromRepositoryData() : pConfigurationContext == "
          + pConfigurationContext);
    }

    RootProductConfigInstance rootProductConfigInstance = (RootProductConfigInstance) pConfigurationContext
        .getInstance();
    SiebelCommerceItem commerceItem = getCommerceItem(rootProductConfigInstance);

    CommandStatus status = getCommandStatusManager()
        .createSuccessCommandStatus(ConfigurationCommandType.BEGIN_CONFIG);

    SiebelCatalogProduct siebelProduct;
    try {
      siebelProduct = getCatalogTools()
          .getProductDetails(rootProductConfigInstance.getProductId());
    } catch (RepositoryException e) {
      vlogError("RepositoryException - {0}", e);
      throw new ConfiguratorException(e);
    } catch (PropertyNotFoundException e) {
      vlogError("PropertyNotFoundException - {0}", e);
      throw new ConfiguratorException(e);
    }
    
    
    boolean isProductConfigured = (
        rootProductConfigInstance.getStatus() 
        == ProductConfigInstanceStatus.CONFIGURED) ? true : false;
    
    if (rootProductConfigInstance.getType().equals(
        Constants.PROD_TYPE_SIMPLE_WITH_ATTRIBUTES)) {

      List<Attribute> instanceAttributes =  getProductAttributes(
          siebelProduct, commerceItem, isProductConfigured);
      rootProductConfigInstance.setAttributes(instanceAttributes
          .toArray(new Attribute[instanceAttributes.size()]));
      
    } else if (rootProductConfigInstance.getType().equals(
        Constants.PROD_TYPE_SIMPLE_BUNDLE)) {
      try {
        // Bug 17374042 - Set the attributes to productConfigInstance
        List<Attribute> instanceProductAttributes = getProductAttributes(
            siebelProduct, commerceItem, isProductConfigured);
        rootProductConfigInstance.setAttributes(instanceProductAttributes
            .toArray(new Attribute[instanceProductAttributes.size()]));
        // Get the product's child relationships
        Set<SiebelCatalogRelationship> relationships = siebelProduct
            .getChildRelationships();
        // We'll build the list of relationships for this instance using this
        // newRelationshipList variable
        List<ProductConfigRelationship> newRelationshipList = new ArrayList<ProductConfigRelationship>(
            relationships.size());
        for (SiebelCatalogRelationship relationship : relationships) {
          String relationshipId = relationship.getRelationshipId();
          int min = relationship.getMinimumCardinality();
          int max = relationship.getMaximumCardinality();
          int def = relationship.getDefaultCardinality();
          // Create the ProductConfigRelationship object
          ProductConfigRelationship prodRelationship = new ProductConfigRelationship(
              rootProductConfigInstance, relationshipId, min, max, def);
          // Get any domain products
          Set<SiebelCatalogProduct> childProducts = relationship
              .getChildProducts();
          if (childProducts != null && !childProducts.isEmpty()) {
            List<DomainProduct> domainProducts = new ArrayList<DomainProduct>();
            for (SiebelCatalogProduct childProduct : childProducts) {
              DomainProduct product = prodRelationship.new DomainProduct();
              product.setId(childProduct.getId());
              product.setName(childProduct.getName());
              domainProducts.add(product);
            }
            // Set the domainProducts property of the relationship
            prodRelationship.setDomainProducts(domainProducts
                .toArray(new DomainProduct[domainProducts.size()]));
          }
          newRelationshipList.add(prodRelationship);
        }
        rootProductConfigInstance
            .setChildRelationships(newRelationshipList
                .toArray(new ProductConfigRelationship[newRelationshipList
                    .size()]));
        if (commerceItem != null) {
          List<SiebelCommerceItem> childItems = commerceItem.getCommerceItems();
          // Create child PCI's using CommerceItem
          if (childItems != null && !childItems.isEmpty()) {
            Iterator<SiebelCommerceItem> iter = childItems.iterator();
            while (iter.hasNext()) {
              SiebelCommerceItem nextChildItem = (SiebelCommerceItem) iter
                  .next();
              String parentRelationshipId = nextChildItem
                  .getParentRelationshipId();
              ProductConfigRelationship parentRelationship = rootProductConfigInstance
                  .getChildRelationship(parentRelationshipId);
              ChildProductConfigInstance childInstance = parentRelationship
                  .addChildInstance(nextChildItem.getAuxiliaryData()
                      .getProductId());
              if (nextChildItem.getAttributeCount() > 0) {                
                List<Attribute> instanceAttributes = getProductAttributes(
                    getCatalogTools().getProductDetails(nextChildItem.getAuxiliaryData().getProductId()),
                    nextChildItem, isProductConfigured);
                childInstance.setAttributes(instanceAttributes
                    .toArray(new Attribute[instanceAttributes.size()]));
              }
              childInstance.setIntegrationId(nextChildItem.getId());
              getProductConfigInstanceCache().cacheProductConfigInstance(
                  childInstance);
            }
          }
        } else {
          // Create any default product instances
          for (SiebelCatalogRelationship relationship : relationships) {
            for (int i = 0; i < relationship.getDefaultCardinality(); i++) {
              ProductConfigRelationship childRelationship = rootProductConfigInstance
                  .getChildRelationship(relationship.getRelationshipId());
              ChildProductConfigInstance childInstance = childRelationship
                  .addChildInstance(relationship.getDefaultProductId());
              childInstance.setIntegrationId(childInstance.getKey()
                  .asSimpleString());
              getProductConfigInstanceCache().cacheProductConfigInstance(
                  childInstance);
            }
          }
        }

      } catch (Exception e) {
        logError(e);
      }
    }

    CommandResult result = new CommandResult(status);
    if (isLoggingDebug()) {
      logDebug("Leaving configureInstanceFromRepositoryData() : result == "
          + result);
    }
    return result;
  }

  /**
   * @param pConfigurationContext
   * @return
   * @throws ConfiguratorException
   */
  public CommandResult callUpdateCart(ConfigurationContext pConfigurationContext)
      throws ConfiguratorException {
    if (isLoggingDebug()) {
      logDebug("Entered performUpdateCart() : rootProductConfigInstance == "
          + pConfigurationContext);
    }
    CommandStatus status = getCommandStatusManager()
        .createSuccessCommandStatus(ConfigurationCommandType.END_CONFIG);

    RootProductConfigInstance rootInstance = (RootProductConfigInstance) pConfigurationContext
        .getInstance();
    String existingCommerceId = rootInstance.getCommerceItemId();

    // promotionCommerceId may very well be null - if this root CP is not
    // part of a promotion

    Order order = getOrderHolder().getCurrent();
    TransactionDemarcation transactionDemarcation = null;
    boolean rollback = true;
    try {
      transactionDemarcation = new TransactionDemarcation();

      transactionDemarcation.begin(getTransactionManager(),
          TransactionDemarcation.REQUIRED);
      String catalogKey = getCatalogKey(order);
      
      // promotionCommerceId may very well be null - if this root CP is not
      // part of a promotion
      PromotionConfigInstance promotion = rootInstance.getPromotionInstance();
      String promotionCommerceId = (promotion == null) ? null : promotion
          .getCommerceItemId();
      
      // I dont think rootCPCommerceId will ever be null or empty ??
      SiebelCommerceItem existingItem = null; 
      SiebelCommerceItem newCommerceItem = null;
      if (StringUtils.isEmpty(existingCommerceId)) {
        newCommerceItem = ((SiebelOrderTools) getOrderManager().getOrderTools())
            .addProductConfigInstanceToOrder(order, rootInstance, catalogKey);
      } else {
        existingItem = ((SiebelOrderTools) getOrderManager()
            .getOrderTools()).getRootLevelCommerceItem(order, promotionCommerceId, existingCommerceId);
        newCommerceItem = ((SiebelOrderTools) getOrderManager().getOrderTools())
            .updateProductConfigInstanceInOrder(order, existingCommerceId,
                rootInstance, catalogKey);
        
        //set ABO properties
        newCommerceItem.setAssetNumber(existingItem.getAssetNumber());
        if(newCommerceItem.isAbo()){
      	  for(SiebelCommerceItem child : (List<SiebelCommerceItem>)newCommerceItem.getCommerceItems()){
      		  child.setAssetNumber(existingItem.getAssetNumber());
      		  child.setActionCode(existingItem.getActionCode());
      	  }
      	}
        newCommerceItem.setQuoteItemId(existingItem.getQuoteItemId());
        newCommerceItem.setAssetIntegrationId(existingItem.getAssetIntegrationId());
        //Set the action code of the existing commerce item.
        newCommerceItem.setActionCode(existingItem.getActionCode());
        newCommerceItem.setProdPromoInstanceId(existingItem.getProdPromoInstanceId());
        newCommerceItem.setProdPromoRuleId(existingItem.getProdPromoRuleId());
        newCommerceItem.setCommerceItemType(existingItem.getCommerceItemType());
     }
      
      rootInstance.setCommerceItemId(newCommerceItem.getId());
      getOrderManager().updateOrder(order);
      if (existingItem != null) {
        existingItem.removeItem();
      }
      rollback = false;
    } catch (Exception e) {
      logError(e);
      throw new ConfiguratorException(e);
    } finally {
      try {
        transactionDemarcation.end(rollback);
      } catch (TransactionDemarcationException e) {
        // TO-DO --- NEED TO RIPPLE THIS UP TO UI
        logError(e);
      }
    }

    CommandResult result = new CommandResult(status);
    if (isLoggingDebug()) {
      logDebug("Leaving performUpdateCart() : result == " + result);
    }
    return result;
  }
  
  
  /**
   * Performs a 2 way reconciliation. 
   * 
   * 1. Removes any stale CommerceItems which may exist
   * as a result of the Promotion Edit process (i.e. Editing a previously
   * configured Promotion).
   * 2. Creates new CommerceItems for root CP's not yet added to the order.
   * We now need to do this because we need to seed the BeginConfig webservice
   * call with a unique integrationId for the product being configured
   * and the commerceItemId is what we use for this.
   * 
   * @param pPromotion - promotion instance to reconcile
   * @throws ConfiguratorException
   */
  public void reconcileCartWithPromotion(PromotionConfigInstance pPromotion)
    throws ConfiguratorException
  {
  if(pPromotion==null)
    throw new ConfiguratorException("Promotion provided is null");
  
  SiebelCommerceItem promoItem = null;
  Order order = getOrderHolder().getCurrent();
  
  //get the commerce Item for the promotion
  try {
    promoItem = (SiebelCommerceItem) order.getCommerceItem(
        pPromotion.getCommerceItemId());
  } catch (CommerceItemNotFoundException cinfe) {
    throw new ConfiguratorException(cinfe);
  } catch (InvalidParameterException ipe) {
    throw new ConfiguratorException(ipe);
  }
  
  //check all child commerce items have a corresponding root product   
  List<SiebelCommerceItem> childItems = promoItem.getCommerceItems();
  Iterator<SiebelCommerceItem> itemIter = childItems.iterator();
  List<RootProductConfigInstance> rootProducts = pPromotion.getRootProducts();
  
  // childItems is an unmodifiable list so we'll gather up 
  // the ids of items to remove and remove them only 
  // after we're done iterating
  List<String> itemsToDelete = new ArrayList<String>();
  
  while(itemIter.hasNext())
  {
    SiebelCommerceItem childItem = itemIter.next();    
    Iterator<RootProductConfigInstance> rootProductIter = rootProducts.iterator();
    boolean found=false;
    while(rootProductIter.hasNext())
    {
      RootProductConfigInstance rootProduct = rootProductIter.next();
      if(rootProduct.getCommerceItemId()!=null&&
          rootProduct.getCommerceItemId().equals(childItem.getId()))
      {
        found=true;
        break;
      }
    }
    if(!found)
    {
      itemsToDelete.add(childItem.getId());
    }
  }
  
    for (String nextItemId : itemsToDelete) {
      try {
        SiebelCommerceItem commerceItem = (SiebelCommerceItem) promoItem.removeCommerceItem(nextItemId);
        commerceItem.removeItem();
      } catch (CommerceItemNotFoundException cinfe) {
        throw new ConfiguratorException(cinfe);
      } catch (InvalidParameterException ipe) {
        throw new ConfiguratorException(ipe);
      }
    }
    
    // We must also check that we have CommerceItems created
    // for all CP root instances - now that we must use the SET
    // operation in our BeginConfig call we need to seed
    // the integrationId property values and we use the commerceItemId
    // to do this.
    for (RootProductConfigInstance productInstance : rootProducts) {
      if (productInstance.getIsConfigurableProduct()
          && productInstance.getCommerceItemId() == null) {
        try {
          SiebelCommerceItem commerceItem = (SiebelCommerceItem) ((SiebelOrderTools) getOrderManager()
              .getOrderTools()).addProductConfigInstanceToOrder(order,
              productInstance, getCatalogKey(order));
          productInstance.setCommerceItemId(commerceItem.getId());
        } catch (Exception ex) {
          throw new ConfiguratorException(ex);
        }
      }
    }
    
    
  }

  
  /**
   * @param pPromotion
   * @param pInstance
   * @return
   */
  protected PromotionRootCPRelationship findRelationship(
      PromotionConfigInstance pPromotion, ProductConfigInstance pInstance) {

    if (isLoggingDebug()) {
      logDebug("Entered findRelationship() : pPromotion == " + pPromotion
          + " : pInstance == " + pInstance);
    }

    PromotionRootCPRelationship target = null;

    if (pPromotion != null && pInstance != null) {

      List<PromotionRootCPRelationship> relationships = pPromotion
          .getChildRelationships();
      Iterator<PromotionRootCPRelationship> iter = relationships.iterator();
      while (target == null && iter.hasNext()) {
        PromotionRootCPRelationship relationship = iter.next();
        ProductConfigInstance[] productInstances = relationship.getChildInstances();
        if (productInstances != null) {
          for (ProductConfigInstance instance : productInstances) {
            if (instance == pInstance) {
              target = relationship;
              break;
            }
          }
        }
      }
    }
    
    if (isLoggingDebug()) {
      logDebug("Leaving findRelationship() : target == " + target);
    }
    return target;
  }
  
  /**
   * invalidates the PCI cache
   */
  public void invalidateProductConfigInstanceCache()
  {
    getProductConfigInstanceCache().invalidateCache();
  }

  
  /**
   * @param pConfigurationContext
   * @return
   */
  public CommandResult updateProductConfigInstance(ConfigurationContext pConfigurationContext) {
    if (isLoggingDebug()) {
      logDebug("Entered updateInstance() : pConfigurationContext == " + pConfigurationContext);
    }

    CommandStatus status = getCommandStatusManager()
        .createSuccessCommandStatus(pConfigurationContext.getCommandType());
    ProductConfigInstance instance = (ProductConfigInstance) pConfigurationContext.getInstance();
    switch (pConfigurationContext.getCommandType()) {
    
    case ADD_PRODUCT:
      String childProductId = (String) pConfigurationContext.getConfigurationParams().
          getParam(ContextParameters.PRODUCT_ID);
      String relationshipId = (String) pConfigurationContext.getConfigurationParams().
          getParam(ContextParameters.RELATIONSHIP_ID);
      int quantity = (Integer) pConfigurationContext.getConfigurationParams().
          getParam(ContextParameters.QUANTITY);
      ProductConfigRelationship relationship = instance.getChildRelationship(relationshipId);
      for (int i=0; i<quantity; i++) {
        try {
          ChildProductConfigInstance newInstance = relationship.addChildInstance(childProductId);
          newInstance.setIntegrationId(newInstance.getKey().asSimpleString());
          if(newInstance.getType().equals(Constants.PROD_TYPE_SIMPLE_WITH_ATTRIBUTES))
          {
            List<Attribute> instanceAttributes = getProductAttributes(
                  getCatalogTools().getProductDetails(childProductId),
                  null, false);
            newInstance.setAttributes(instanceAttributes
                  .toArray(new Attribute[instanceAttributes.size()]));
          }
          getProductConfigInstanceCache().cacheProductConfigInstance(newInstance);
        } 
        catch (ConfiguratorException e) {
          logError(e);
        } 
        catch (RepositoryException e)
        {
          logError(e);
        } 
        catch (PropertyNotFoundException e)
        {
          logError(e);
        }
      }
      break;
      
    case REMOVE_PRODUCT:
      ChildProductConfigInstance childInstance = 
          (ChildProductConfigInstance) instance;
      childInstance.getParentRelationship().removeChildInstance(childInstance);
      break;
      
    case SET_ATTRIBUTES:
      List<AttributeHolder> attributes = 
        (List<AttributeHolder>) pConfigurationContext.getConfigurationParams().getParam(
            ContextParameters.NEW_ATTRIBUTES);
      for (AttributeHolder holder : attributes) {
        Attribute attribute = instance.getAttribute(holder.getName());
        attribute.setValue(holder.getValue());
      }
      break;
      
    case REPLACE_PRODUCT:
      ProductConfigInstance toDelete = (ProductConfigInstance) pConfigurationContext.getInstance();
      String newProductId = (String) pConfigurationContext.getConfigurationParams().getParam(
          ContextParameters.PRODUCT_ID);
      ProductConfigRelationship parentRelationship = (ProductConfigRelationship) (
          (ChildProductConfigInstance) toDelete).getParentRelationship();
      parentRelationship.removeChildInstance(toDelete);
      try {
        ChildProductConfigInstance newInstance = parentRelationship.addChildInstance(newProductId);
        newInstance.setIntegrationId(newInstance.getKey().asSimpleString());
        getProductConfigInstanceCache().cacheProductConfigInstance(newInstance);
      } catch (ConfiguratorException e) {
        logError(e);;
      }
      break;
      
    case MULTI_COMMAND_UPDATE:
      List<ConfigurationContext> updateContextList = (List<ConfigurationContext>) pConfigurationContext
          .getConfigurationParams().getParam(
              ContextParameters.CHILD_CONTEXT_LIST);
      if (updateContextList != null && !updateContextList.isEmpty()) {
        for (ConfigurationContext nextUpdateContext : updateContextList) {
          updateProductConfigInstance(nextUpdateContext);
        }
      }
      break;

    default:
      break;
    }


    CommandResult result = new CommandResult(status);
    
    if (isLoggingDebug()) {
      logDebug("Leaving updateInstance() : result == "+result);
    }
    return result;
  }
  
  
  /**
   * @param pRootInstance
   * @return
   */
  public SiebelCommerceItem getCommerceItem(
      RootProductConfigInstance pRootInstance) {
    if (isLoggingDebug()) {
      logDebug("Entered getCommerceItem() : pRootInstance == " + pRootInstance);
    }
    SiebelCommerceItem rootCommerceItem = null;
    String rootInstanceCommerceItemId = pRootInstance.getCommerceItemId();
    if (!StringUtils.isEmpty(rootInstanceCommerceItemId)) {
      PromotionConfigInstance promotion = pRootInstance.getPromotionInstance();
      String promotionCommerceId = (promotion == null) ? null : promotion
          .getCommerceItemId();
      try {
        if (promotionCommerceId != null) {
          SiebelCommerceItem promotionCommerceItem = (SiebelCommerceItem) getOrderHolder()
              .getCurrent().getCommerceItem(promotionCommerceId);
          rootCommerceItem = (SiebelCommerceItem) promotionCommerceItem
              .getCommerceItem(rootInstanceCommerceItemId);
        } else {
          rootCommerceItem = (SiebelCommerceItem) getOrderHolder().getCurrent()
              .getCommerceItem(rootInstanceCommerceItemId);
        }
      } catch (Exception e) {
        logError(e);
      }
    }
    if (isLoggingDebug()) {
      logDebug("Leaving getCommerceItem() : rootCommerceItem == "
          + rootCommerceItem);
    }
    return rootCommerceItem;
  }
  
  /**
   * @param pPromotionInstance
   * @return
   */
  public SiebelCommerceItem getCommerceItem(
      PromotionConfigInstance pPromotionInstance) {
    if (isLoggingDebug()) {
      logDebug("Entered getCommerceItem() : pPromotionInstance == "
          + pPromotionInstance);
    }
    SiebelCommerceItem promotionCommerceItem = null;
    String promotionInstanceCommerceItemId = pPromotionInstance
        .getCommerceItemId();
    if (!StringUtils.isEmpty(promotionInstanceCommerceItemId)) {
      try {
        promotionCommerceItem = (SiebelCommerceItem) getOrderHolder()
            .getCurrent().getCommerceItem(promotionInstanceCommerceItemId);
      } catch (Exception e) {
        logError(e);
      }
    }
    if (isLoggingDebug()) {
      logDebug("Leaving getCommerceItem() : promotionCommerceItem == "
          + promotionCommerceItem);
    }
    return promotionCommerceItem;
  }
  
  /**
   * This method returns the commerce item for the given commerce id
   * @param pCommerceItemId, the id of the commerce item that is to be
   *        retrieved
   * @return
   */
  public SiebelCommerceItem getCommerceItem(String pCommerceItemId) {
    SiebelCommerceItem commerceItem = null;
    // Get the commerce items from order and get the commerce item from it for
    // the given id
    Order currentOrder = getOrderHolder().getCurrent();
    List<SiebelCommerceItem> commerceItemsFromOrder = currentOrder
        .getCommerceItems();
    for (SiebelCommerceItem childCommerceItem : commerceItemsFromOrder) {
      commerceItem = getChildCommerceItem(childCommerceItem, pCommerceItemId);
    }
    return commerceItem;
  }

  /**
   * This method iterates over the child commerce items of the order
   * and retrieve the specified commerce item
   * @param pCommerceItem, the commerce item from order
   * @param pCommerceId, the id of the commerce item that is
   *                    to be retrieved
   * @return
   */
  private SiebelCommerceItem getChildCommerceItem(
      SiebelCommerceItem pCommerceItem, String pCommerceId) {
    SiebelCommerceItem commItem = null;
    // If the commerce item id matches, return the commerce item
    if (pCommerceItem.getId().equalsIgnoreCase(pCommerceId)) {
      commItem = pCommerceItem;
    } else {
      // Makes recursive call for the child commerce items
      for (SiebelCommerceItem commerceItem : (List<SiebelCommerceItem>) pCommerceItem
          .getCommerceItems()) {
        if (commItem != null)
          break;
        commItem = getChildCommerceItem(commerceItem, pCommerceId);
      }
    }
    return commItem;
  }
  
  /**
   * @param pSiebelProduct 
   * @param pItem
   * @param isProductConfigured 
   * @return
   */
  protected List<Attribute> getProductAttributes(
      SiebelCatalogProduct pSiebelProduct, 
      SiebelCommerceItem pItem, 
      boolean isProductConfigured) {
    
    vlogDebug("configureAttributesFromCommerceItem() called");
    vlogDebug("pSiebelProduct = {0}: pItem={1}", pSiebelProduct, pItem);
    
    List<Attribute> instanceAttributes = new ArrayList<Attribute>();
    
    // Temporary store for attribute values from commerceItem
    Map<String, String> attributeIdToValueMap = null;
    // We only go to the commerceItem if the product is already 
    // configured - i.e. an edit scenario
    if (isProductConfigured) {
      attributeIdToValueMap = new HashMap<String, String>();

      // Get commerceItem attribute values
      for (SiebelAttribute attr : pItem.getSiebelAttributes()) {
        attributeIdToValueMap.put(attr.getAttributeName(), attr.getValue());
      }
    }
    
    // Get SiebelCatalogProduct attributes
    List<SiebelCatalogAttribute> productAttributes = pSiebelProduct
        .getAttributes();

    // Populate pInstanceAttributes using attributes from SiebelCatalogProduct
    // and values from commerceItem
    for (SiebelCatalogAttribute nextAttribute : productAttributes) {
      // Avoid fetching the attribute which has hidden flag set as true
      if (!nextAttribute.getHiddenFlag()) {
        if (attributeIdToValueMap != null) {
          nextAttribute.setDefaultValue(attributeIdToValueMap.get(nextAttribute
              .getAttributeName()));
        }
        Attribute newAttribute = getAttributeFactory().createAttribute(
            nextAttribute);
        instanceAttributes.add(newAttribute);
      }
    }

    return instanceAttributes;
  }
  
  /**
   * @param pItem
   * @return
   */
  protected boolean isEligibleCompatibleProduct(Item pItem) {
    vlogDebug("isEligibleCompatibleProduct() - productId = {0}", pItem.getProductId());
    boolean isEligible = true;
    String str = pItem.getEligibilityStatus();
    if (!StringUtils.isEmpty(str)) {
      if (str.equalsIgnoreCase(INELIGIBLE_PRODUCT_FLAG_VALUE)) {
        //isEligible = false;
      }
    }
    vlogDebug("isEligibleCompatibleProduct() - productId = {0}: isEligible = {1}", 
        pItem.getProductId(), isEligible);
    return isEligible;
  }
  
  /**
   * @param pItem
   * @return
   */
  protected boolean isExcludedDomainProduct(DomainItem pItem) {
    vlogDebug("isExcludedDomainProduct() - productId = {0}", pItem.getId());
    boolean isExcluded = Boolean.parseBoolean(pItem.getExcluded());
    vlogDebug("isExcludedDomainProduct() - productId = {0}: isEligible = {1}", 
        pItem.getId(), isExcluded);
    return isExcluded;
  }
  
 
  
  /**
   * @param pOrder
   * @throws ConfiguratorException
   */
  protected void runRepriceUpdateOrderProcess(Order pOrder) 
      throws ConfiguratorException {
    
    vlogDebug("runRepriceUpdateOrderProcess() called - pOrder = {0}", pOrder);

    TransactionDemarcation transactionDemarcation = new TransactionDemarcation();
    boolean rollback = true;

    try {
      transactionDemarcation.begin(getTransactionManager(), 
          TransactionDemarcation.REQUIRED);
      HashMap params = new HashMap();

      params.put(PricingConstants.PRICING_OPERATION_PARAM,
          PricingConstants.OP_REPRICE_ORDER_TOTAL);
      params.put(PricingConstants.ORDER_PARAM, pOrder);
      params.put(PricingConstants.PRICING_MODELS_PARAM, null);
      params.put(PricingConstants.LOCALE_PARAM, getLocale(pOrder));
      params.put(PricingConstants.PROFILE_PARAM, 
          getProfileTools().getProfileForOrder(pOrder.getId()));
      params.put(PipelineConstants.ORDERMANAGER, getOrderManager());

      getOrderManager().getPipelineManager().runProcess(
          REPRICE_AND_UPDATE_ORDER_PIPELINE_ID, params);
      rollback = false;

    } catch (Exception e) {
      vlogError("Exception in runRepriceUpdateOrderProcess - {0}", e);
      Object[] args = { pOrder.getId() };
      throw new ConfiguratorException(MessageFormat.format(
          SiebelConstants.ERROR_REPRICING_ORDER_AFTER_ADD_ITEM, args), e);
    } finally {
      try {
        transactionDemarcation.end(rollback);
        vlogDebug("runRepriceUpdateOrderProcess completed - rollback = {0}", rollback);
      } catch (TransactionDemarcationException e) {
        throw new ConfiguratorException(e);
      }
    }    
  }
  
  
  /**
   * @param pCommerceItem
   * @return
   */
  public boolean isConfigurationComplete(SiebelCommerceItem pCommerceItem) {
    return isConfigurationComplete(pCommerceItem.getId());
  }
  
  
  /**
   * @param pCommerceItemId
   * @return
   */
  public boolean isConfigurationComplete(String pCommerceItemId) {
    BaseConfigInstance instance = getProductConfigInstanceCache().getInstance(
        pCommerceItemId);
    if (instance != null) {
      return isConfigurationComplete(instance);
    }
    // if the commerceItem is not in the cache then 
    // configuration must be complete
    return true;
  }
  
  
  /**
   * @param pInstance
   * @return
   */
  public boolean isConfigurationComplete(BaseConfigInstance pInstance) {
    if (pInstance instanceof RootProductConfigInstance) {
      return (((RootProductConfigInstance) pInstance).getStatus() 
          == ProductConfigInstanceStatus.CONFIGURED) ? true : false;
    }
    if (pInstance instanceof PromotionConfigInstance) {
      List<RootProductConfigInstance> rootProducts = 
          ((PromotionConfigInstance) pInstance).getRootProducts();
      if (rootProducts == null || rootProducts.isEmpty()) {
        return false;
      }
      for (RootProductConfigInstance rootProduct : rootProducts) {
        if (!isConfigurationComplete(rootProduct)) {
          return false;
        }
      }
    }
    return true;
  }
  
  /**
   * Method to update PCI's product data based on Siebel item
   * without rebuilding the PCI
   * @param pInstance
   * @param pConfiguredItem
   */
  public void updatePCIFromSiebelItem(ProductConfigInstance pInstance,
      Item pConfiguredItem) {

    // Invoke the method for marking the excluded products
    markExcludedProducts(pInstance, pConfiguredItem);

  }
  
  /**
   * Method to mark the excluded flag of domain Product in PCI to true or false
   * based on the value in the siebel item.
   * 
   * @param pInstance
   * @param pConfiguredItem
   */
  public void markExcludedProducts(ProductConfigInstance pInstance,
      Item pConfiguredItem) {
    // Iterate the web service response and get the excluded product list
    List<String> excludedProductIdList = new ArrayList<String>();
    List<Relationship> relationshipsFromSiebel = pConfiguredItem
        .getRelationship();
    for (Relationship relationshipFromSiebel : relationshipsFromSiebel) {
      List<DomainItem> domainItems = relationshipFromSiebel.getDomainItem();
      for (DomainItem item : domainItems) {
        if ("true".equalsIgnoreCase(item.getExcluded())) {
          excludedProductIdList.add(item.getId());
        }
      }
    }
    // Iterate through the PCI and mark the isExcluded flag value
    ProductConfigRelationship[] childRelationships = pInstance
        .getChildRelationships();
    for (ProductConfigRelationship childRelationship : childRelationships) {
      DomainProduct[] domainProducts = childRelationship.getDomainProducts();
      for (DomainProduct product : domainProducts) {
        if (excludedProductIdList.size() > 0) {
          for (String excludedProductId : excludedProductIdList) {
            if (product.getId().equals(excludedProductId)) {
              product.setExcluded(true);
            }
          }
        } else {
          product.setExcluded(false);
        }
      }
    }
  }
  
  /**
   * The method returns a map containing the products id as key and product name
   * as value using products present in pci the product of pci having quantity
   * more than zero is considered
   * 
   * @param pci
   *          a <code>PromotionConfigInstance</code> value
   * @return a <code>HashMap</code> value
   */
  public Map<String, String> createProductMapOfPCI(PromotionConfigInstance pci) {
    
    // productMap contains the and product id(key) and product name (value)
    Map<String, String> productMap = new HashMap<String, String>();
    DomainProduct[] domainProductArray = null;
    List<PromotionRootCPRelationship> childRelationShipOfPromotionList = null;
    
    // get child-rleationships of promotion
    
    childRelationShipOfPromotionList = pci.getChildRelationships();
    for (PromotionRootCPRelationship childRelationshipOfPromotion : childRelationShipOfPromotionList) {
      // Adding root product, if product is selected
      if (childRelationshipOfPromotion.getDefaultProductId() != null) {
        if (childRelationshipOfPromotion.getDefaultQuantity() > 0) {
          productMap.put(childRelationshipOfPromotion.getDefaultProductId(),
              childRelationshipOfPromotion.getDefaultProductName());
        }
      }
      // Adding domain products of if domain product is present and domain
      // product is selected
      if (childRelationshipOfPromotion.getDomainProductCount() > 0) {
        domainProductArray = childRelationshipOfPromotion.getDomainProducts();
        for (DomainProduct domainProduct : domainProductArray) {
          if (domainProduct.getQuantity() > 0) {
            productMap.put(domainProduct.getId(), domainProduct.getName());
          }
        }
      }
    }
    return productMap;
  }
  
  /**
   * Method to create a Quote from PCI.
   * @param pRootInstance PCI instance.
   * @param pQuoteNumber Quote Number
   * @return Quote instance corresponding to PCI
   * @throws ConfiguratorException
   */
	public Quote createQuoteFromPCI(RootProductConfigInstance pRootInstance, final String pQuoteNumber)
			throws ConfiguratorException {
		Quote quote = null;
		quote = new Quote();
		quote.setRevision(NUMERIC_1_STRING);

		quote.setQuoteNumber(pQuoteNumber);
		quote.setId(pQuoteNumber);

		String accountId = null;

		RepositoryItem pUser = getUserProfile(pRootInstance.getOrderId());
		if (pUser != null) {
			accountId = (String) pUser
					.getPropertyValue(SIEBEL_ACCOUNT_ID_STRING);
			quote.setAccountId(accountId);
			RepositoryItem org = (RepositoryItem) pUser
					.getPropertyValue(PARENT_ORGANISATION_STRING);
			if (org != null) {
				quote.setAccount((String) org.getPropertyValue(NAME_STRING));
			}
		}

		QuoteItem quoteItem = null;
		try {
			SiebelCommerceItem commerceItem = getCommerceItem(pRootInstance);
			List<QuoteItem> qiList = null;
			if(commerceItem != null){
				List<SiebelCommerceItem> ciList = new ArrayList<SiebelCommerceItem>();
				ciList.add(commerceItem);
	
				SiebelCommerceItem promotionCommerceItem = null;
				if (pRootInstance.getPromotionInstance() != null) {
					promotionCommerceItem = getCommerceItem(
							pRootInstance.getPromotionInstance());
				}
				SiebelOrderTools siebelOrderTools = (SiebelOrderTools)getOrderManager().getOrderTools();
				qiList = siebelOrderTools.convertCommerceItemsToQuoteItems(ciList,
						promotionCommerceItem, accountId);
			}
			if (qiList != null && !qiList.isEmpty()) {
				quoteItem = qiList.get(0);
			}
		} catch (Exception ex) {
			throw new ConfiguratorException(ex);
		}

		ListOfQuoteItem listQuoteItems = new ListOfQuoteItem();
		listQuoteItems.getQuoteItem().add(quoteItem);
		quote.setListOfQuoteItem(listQuoteItems);
		return quote;
	}
	
	/**
	 * Method to retrieve User profile repository instance corresponding to order Id.
	 * @param pOrderId order Id.
	 * @return Repository Item.
	 * @throws ConfiguratorException
	 */
	private RepositoryItem getUserProfile(String pOrderId) {
		RepositoryItem profile = null;
		try {
			profile = getProfileTools().getProfileForOrder(pOrderId);
			if (profile == null) {
				profile = ServletUtil.getCurrentUserProfile();
				if (profile != null) {
					Order order = getOrderHolder()
							.getCurrent();
					// Should this check ever fail??? We should always be
					// working
					// with the order in the cart.
					if (order.getId().equals(pOrderId)) {
						order.setProfileId(profile.getRepositoryId());
						getOrderManager().updateOrder(order);
					} else {
						vlogError("Unable to get profileId for order = "
								+ pOrderId);
					}
				}
			}
		} catch (Exception e) {
		}
		return profile;
	}

  /**
   * Facade to call into the Web Service Pool to execute the configurator web service. Configurator calls use a
   * common WebService
   *
   * @param pWebServiceName
   * @param pPortName
   * @param pWebServiceMethodName
   * @param pInput
   * @param pClient
   * @return
   * @throws NoSuchMethodException
   * @throws IllegalAccessException
   * @throws ResourcePoolException
   * @throws InvocationTargetException
   */
  public Object executeWebService(String pWebServiceName,
                                  String pPortName,
                                  String pWebServiceMethodName,
                                  Object pInput,
                                  Object pClient)
          throws NoSuchMethodException,
          IllegalAccessException,
          ResourcePoolException,
          InvocationTargetException,
          SiebelWebServiceConfigurationException {
    return getWebServiceController().
            callWebService(pWebServiceName,
                    pPortName,
                    pWebServiceMethodName,
                    pInput,
                    pClient,
                    getWebServiceHelper());
  }
	
}
