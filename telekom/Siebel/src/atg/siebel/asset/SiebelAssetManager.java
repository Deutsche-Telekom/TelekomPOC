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

package atg.siebel.asset;

import atg.commerce.CommerceException;
import atg.commerce.catalog.CatalogTools;
import atg.commerce.order.InvalidParameterException;
import atg.commerce.order.Order;
import atg.commerce.order.OrderHolder;
import atg.commerce.order.OrderManager;
import atg.core.util.StringUtils;
import atg.dtm.TransactionDemarcation;
import atg.dtm.TransactionDemarcationException;
import atg.nucleus.GenericService;
import atg.siebel.catalog.SiebelCatalogProduct;
import atg.siebel.catalog.SiebelCatalogTools;
import atg.siebel.configurator.BaseConfigInstance;
import atg.siebel.configurator.ConfiguratorManager;
import atg.siebel.configurator.Constants;
import atg.siebel.configurator.ui.UIManager;
import atg.siebel.order.SiebelCommerceItem;
import atg.siebel.order.SiebelOrderImpl;
import atg.siebel.order.SiebelOrderTools;
import com.siebel.ordermanagement.quote.data.Quote;
import com.siebel.ordermanagement.quote.data.QuoteItem;

import javax.transaction.TransactionManager;
import javax.xml.crypto.dsig.TransformException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/**
 * SiebelAssetManager - This class contains methods to handle various business
 * logic functionalities related to Assets.
 * 
 * @author kalkarri
 * 
 */
public class SiebelAssetManager extends GenericService {

  //-------------------------------------
  /** Class version string */

  public static String CLASS_VERSION = "$Id: //product/Siebel/version/11.2/src/atg/siebel/asset/SiebelAssetManager.java#2 $$Change: 1194813 $";


	private static final String PROMOTION = "Promotion";

	// Configurator Manager
	protected ConfiguratorManager mConfiguratorManager;

	public ConfiguratorManager getConfiguratorManager() {
		return mConfiguratorManager;
	}

	public void setConfiguratorManager(ConfiguratorManager pConfiguratorManager) {
		mConfiguratorManager = pConfiguratorManager;
	}

	// Catalog Tools
	protected CatalogTools mCatalogTools;

	public CatalogTools getCatalogTools() {
		return mCatalogTools;
	}

	public void setCatalogTools(CatalogTools pCatalogTools) {
		mCatalogTools = pCatalogTools;
	}

	// Siebel Asset Tools
	protected SiebelAssetTools mSblAssetTools;

	public SiebelAssetTools getSiebelAssetTools() {
		return mSblAssetTools;
	}

	public void setSiebelAssetTools(SiebelAssetTools sblAssetTools) {
		this.mSblAssetTools = sblAssetTools;
	}

	// Siebel Order Tools
	protected SiebelOrderTools mSblOrderTools;

	public SiebelOrderTools getSiebelOrderTools() {
		return mSblOrderTools;
	}

	public void setSiebelOrderTools(SiebelOrderTools pSblOrderTools) {
		this.mSblOrderTools = pSblOrderTools;
	}

	// Siebel order manager
	protected OrderManager mOrderManager = null;

	public OrderManager getOrderManager() {
		return mOrderManager;
	}

	public void setOrderManager(OrderManager pOrderManager) {
		mOrderManager = pOrderManager;
	}

	// Transaction Manager
	private TransactionManager mTransactionManager;

	public void setTransactionManager(TransactionManager pTransactionManager) {
		mTransactionManager = pTransactionManager;
	}

	public TransactionManager getTransactionManager() {
		return mTransactionManager;
	}

	/**
	 * Method to convert a Siebel Quote to ATG Order.
	 * 
	 * @param pQuote
	 *          Siebel Quote
	 * @return instance of Siebel Order
	 * @throws TransformException
	 */
	public Order convertSiebelQuoteToOrder(Quote pQuote,
			OrderHolder pShoppingCart, String assetNumber, String pNewProductId, boolean pIsUpgradeABO) throws TransformException {

		String profileId = retrieveProfileId(pShoppingCart);

		String locale = retrieveLocale(pShoppingCart);

		/*
		 * In scenarios wherein we are modifying multiple assets in a single order,
		 * the Quote returned from ModifyAssetToQuote would contain the quote items
		 * from previous assets(since we are persisting the quote during EndConfig.
		 * We first need to filter the quote items corresponding to previous assets
		 * and then build commerce items for remaining quote items
		 */
		List<String> assetIntegrationIdsList = new ArrayList<String>();
		for (SiebelCommerceItem sblCommerceItem : (List<SiebelCommerceItem>) pShoppingCart
				.getCurrent().getCommerceItems()) {
			if (!assetIntegrationIdsList.contains(sblCommerceItem
					.getAssetIntegrationId())) {
				assetIntegrationIdsList.add(sblCommerceItem.getAssetIntegrationId());
			}
		}
		if (isLoggingDebug()) {
			logDebug("Size of AssetIntegrationIdsList : "
					+ assetIntegrationIdsList.size());
		}

		List<QuoteItem> quoteItemsFromPreviousAssets = new ArrayList<QuoteItem>();
		for (QuoteItem quoteItem : pQuote.getListOfQuoteItem().getQuoteItem()) {
			if (assetIntegrationIdsList.contains(quoteItem.getAssetIntegrationId())) {
				vlogDebug("Removing quote for assetIntegrationId {0}",
						assetIntegrationIdsList);
				quoteItemsFromPreviousAssets.add(quoteItem);
			}
		}
		pQuote.getListOfQuoteItem().getQuoteItem()
				.removeAll(quoteItemsFromPreviousAssets);

		Order order = null;
		order = getSiebelOrderTools().convertSiebelQuoteToOrder(pQuote, profileId,
				locale, assetNumber, pNewProductId, pIsUpgradeABO);
		// getSiebelOrderTools().addQuoteToHolder(order.getId(), pQuote);
		if (order instanceof SiebelOrderImpl) {
			SiebelOrderImpl siebelOrderImpl = (SiebelOrderImpl) order;
			siebelOrderImpl.setQuoteNumber(pQuote.getQuoteNumber());
			siebelOrderImpl.setActiveDocumentId(pQuote.getId());
		}

		// Set asset number and commerce item type for all the commerce items in this order
		for (SiebelCommerceItem siebelCommerceItem : (List<SiebelCommerceItem>) order
				.getCommerceItems()) {
			updateCommerceItemProperty(siebelCommerceItem, assetNumber, pIsUpgradeABO);
		}
		return order;
	}

	/**
	 * Method to merge source order with the destination order. This method also
	 * copies any source order quotes to destination order
	 * 
	 * @param pSrcOrder
	 *          source
	 * @param pDestOrder
	 *          destination
	 * @throws InvalidParameterException
	 * @throws CommerceException
	 */
	public Order mergeOrders(Order pSrcOrder, Order pDestOrder)
			throws InvalidParameterException, CommerceException {
		vlogDebug("srcOrder : {0}, destOrder : {1}", pSrcOrder, pDestOrder);
		TransactionDemarcation td = null;

		td = new TransactionDemarcation();
		try {
			td.begin(getTransactionManager(), TransactionDemarcation.REQUIRED);
			synchronized (pDestOrder) {

				// merge the orders
				getOrderManager().mergeOrders(pSrcOrder, pDestOrder);

				// set the quoteNumber
				if (pSrcOrder instanceof SiebelOrderImpl
						&& pDestOrder instanceof SiebelOrderImpl) {
					SiebelOrderImpl srcSiebelOrderImpl = (SiebelOrderImpl) pSrcOrder;
					SiebelOrderImpl destSiebelOrderImpl = (SiebelOrderImpl) pDestOrder;
					destSiebelOrderImpl.setQuoteNumber(srcSiebelOrderImpl
							.getQuoteNumber());
					destSiebelOrderImpl.setActiveDocumentId(srcSiebelOrderImpl
							.getActiveDocumentId());
				}

				// update the order to reflect merge changes
				getOrderManager().updateOrder(pDestOrder);
				vlogDebug("Quote set for shoppingcart after update "
						+ ((SiebelOrderImpl) pDestOrder).getQuoteNumber());

			}
		} catch (TransactionDemarcationException tde) {
			tde.printStackTrace();
		} finally {
			try {
				td.end();
			} catch (TransactionDemarcationException tde) {
				tde.printStackTrace();
			}
		}
		return pDestOrder;
	}

	/**
	 * Create PCI instance from commerce item.
	 * 
	 * @param pCommerceItem
	 *          commerce item
	 * @return
	 * @throws Exception
	 */
	public BaseConfigInstance createPCIFromCommerceItem(
			SiebelCommerceItem pCommerceItem) throws Exception {
		BaseConfigInstance instance = null;
		String productID = pCommerceItem.getAuxiliaryData().getProductId();

		SiebelCatalogProduct product = ((SiebelCatalogTools) getCatalogTools())
				.getProductDetails(productID);

		if (product != null && product.getProductType().equals(PROMOTION)) {
			try {
				instance = getConfiguratorManager().buildPromotionFromCommerceItem(
						pCommerceItem);
			} catch (Exception e) {
				vlogError("PCI couldn't be created using commerce item. {0}",e.getMessage());
			}
			if (instance == null) {
				instance = getConfiguratorManager().getPromotionTemplate(
						pCommerceItem.getId());
			}
		} else {
			instance = getConfiguratorManager()
					.createProductInstanceFromCommerceItem(pCommerceItem.getId());
		}
		/*
		 * // Set the quote Quote quote = null; if (instance instanceof
		 * RootProductConfigInstance) { quote =
		 * createQuoteFromPCI((RootProductConfigInstance) instance); }
		 * instance.setQuote(quote);
		 */
		instance.setAssetIntegrationId(pCommerceItem.getAssetIntegrationId());
		return instance;
	}

	/**
	 * This method returns a Siebel Quote for a given asset number.
	 * 
	 * @param pAssetNumber
	 *          Asset Number
	 * @param pActiveDocumentId
	 *          - Active Document Id
	 * @return Siebel Quote for the Asset Number
	 */
	public Quote getSiebelQuoteForAsset(final String pAssetNumber,
			final String pActiveDocumentId) throws Exception {
		return getSiebelAssetTools().getSiebelQuoteForAsset(pAssetNumber,
				pActiveDocumentId);
	}

	public String modifyAsset(final OrderHolder shoppingCart,
			final String assetNumber, final UIManager uiManager) throws Exception{
		// retrieve SiebelQuote for this assetId
		vlogDebug("Retrieving quote for asset {0}", assetNumber);
		String activeDocumentId = ((SiebelOrderImpl) shoppingCart.getCurrent())
				.getActiveDocumentId();
		vlogDebug("ActiveDocumentId : {0}", activeDocumentId);
		Quote quote = getSiebelQuoteForAsset(assetNumber, activeDocumentId);
		vlogDebug("Quote retrieved : {0}", quote);

		// convert Siebel quote to Order
		vlogDebug("Converting Siebel Quote items to commerce items list");
		Order order = convertSiebelQuoteToOrder(quote, shoppingCart, assetNumber, null, false);

		mergeOrders(order, shoppingCart.getCurrent());

		int lastCommerceItem = shoppingCart.getCurrent().getCommerceItems().size() - 1;
		SiebelCommerceItem commerceItem = (SiebelCommerceItem) shoppingCart
				.getCurrent().getCommerceItems().get(lastCommerceItem);

		// create PCI
		vlogDebug("Creating PCI for commerceItem : {0}", commerceItem);
		BaseConfigInstance instance = createPCIFromCommerceItem(commerceItem);
		instance.setQuote(quote);
		
		vlogDebug("Redirecting to success URL");
		String successURL = uiManager.getReconfigureSuccessURL(instance)
				+ "?commerceItemId=" + commerceItem.getId();
		return successURL;
	}

	/**
	 * Method to retrieve Locale from the shopping cart
	 * 
	 * @param pShoppingCart
	 *          Shopping cart
	 * @return
	 */
	private String retrieveLocale(OrderHolder pShoppingCart) {
		String locale = (String) pShoppingCart.getProfile().getPropertyValue(
				"locale");
		if (StringUtils.isEmpty(locale)) {
			Locale defaultLocale = getSiebelOrderTools().getProfileTools()
					.getLocaleService().getLocale();
			locale = defaultLocale.getDisplayName();
		}
		return locale;
	}

	/**
	 * Method to retrieve the profile Id.
	 * 
	 * @param pShoppingCart
	 *            Shopping cart
	 * @return
	 */
	private String retrieveProfileId(OrderHolder pShoppingCart) {
		return (String) pShoppingCart.getProfile().getPropertyValue("Id");
	}
	
  /**
   * Method to upgrade an promotion asset
   * 
   * @param shoppingCart
   * @param pAssetNumber
   * @param pNewProductID
   * @param pUiManager
   * @param pSiebelAccountId
   * @return
   * @throws Exception
   */
  public String upgradeAsset(final OrderHolder shoppingCart,
      final String pAssetNumber, final String pNewProductID,
      final UIManager pUiManager, final String pSiebelAccountId)
      throws Exception {
    // retrieve SiebelQuote for this assetId
    if (isLoggingDebug()) {
      vlogDebug("Retrieving quote for upgradation of asset {0} to {1} ",
          pAssetNumber, pNewProductID);
    }
    String activeDocumentId = ((SiebelOrderImpl) shoppingCart.getCurrent())
        .getActiveDocumentId();
    Quote quote = getSiebelQuoteForAssetUpgradation(pAssetNumber,
        activeDocumentId, pNewProductID, pSiebelAccountId);
    if (isLoggingDebug()) {
      vlogDebug("Quote retrieved : {0}", quote);
    }
    // convert Siebel quote to Order
    Order order = convertSiebelQuoteToOrder(quote, shoppingCart, pAssetNumber,
        pNewProductID, true);
    mergeOrders(order, shoppingCart.getCurrent());
    
    
    
    List<SiebelCommerceItem> siebelCommerceItems = (List<SiebelCommerceItem>) shoppingCart.getCurrent().getCommerceItems();
    SiebelCommerceItem commerceItem = null;
    for(SiebelCommerceItem siebelCommerceItem : siebelCommerceItems){
      if(siebelCommerceItem.getCommerceItemType() != null && siebelCommerceItem.getCommerceItemType().equals(Constants.SiebelCommerceItemType.UPGRADEPROMOTION.toString()) && pNewProductID.equals(siebelCommerceItem.getAuxiliaryData().getProductId())){
        commerceItem = siebelCommerceItem;
        break;
      }
    }
  //  int lastCommerceItem = shoppingCart.getCurrent().getCommerceItems().size() - 1;
  //  SiebelCommerceItem commerceItem = (SiebelCommerceItem) shoppingCart
  //      .getCurrent().getCommerceItems().get(lastCommerceItem);

    // create PCI
    BaseConfigInstance instance = createPCIFromCommerceItem(commerceItem);
    instance.setQuote(quote);

    String successURL = pUiManager.getReconfigureSuccessURL(instance)
        + "?commerceItemId=" + commerceItem.getId();
    return successURL;
  }

  /**
   * This method returns a Siebel Quote for an asset upgradation
   * 
   * @param pAssetNumber
   * @param pActiveDocumentId
   * @param pNewProductId
   * @return Quote for asset upgradation
   * @throws Exception
   */
  public Quote getSiebelQuoteForAssetUpgradation(final String pAssetNumber,
      final String pActiveDocumentId, final String pNewProductId,
      final String pSiebelAccountId) throws Exception {
    return getSiebelAssetTools().getSiebelQuoteForAssetUpgradation(
        pAssetNumber, pActiveDocumentId, pNewProductId, pSiebelAccountId);
  }

  /**
   * checks if there is already an item in the current cart with upgrade/modify
   * request for the asset
   * 
   * @param pAssetNumber
   * @return
   */
  public String checkAboapplicability(final String pAssetNumber) {
    return getSiebelAssetTools().checkAboapplicability(
        pAssetNumber,
        getConfiguratorManager().getConfiguratorTools().getOrderHolder()
            .getCurrent());
  }
  
  /**
   * This method updates the commerce item type and asset number in the child
   * commerce items
   * 
   * @param pCommerceItem
   *          , the commerce item that is to be updated
   * @param pAssetNumber
   *          , asset number of the asset
   * @param pIsUpgradeABO
   *          , boolean value to determine if it is upgrade promotion
   */
  public void updateCommerceItemProperty(SiebelCommerceItem pCommerceItem,
      String pAssetNumber, boolean pIsUpgradeABO) {
    // Set the asset number and commerce item type
    pCommerceItem.setAssetNumber(pAssetNumber);
    pCommerceItem
        .setCommerceItemType(pIsUpgradeABO ? Constants.SiebelCommerceItemType.UPGRADEPROMOTION
            .toString() : Constants.SiebelCommerceItemType.MODIFYASSET
            .toString());
    //Make a recursive call for the child items
    if (pCommerceItem.getCommerceItems() != null) {
      for (SiebelCommerceItem childCommerceItem : (List<SiebelCommerceItem>) pCommerceItem
          .getCommerceItems()) {
        updateCommerceItemProperty(childCommerceItem, pAssetNumber,
            pIsUpgradeABO);
      }
    }
  }
  
}
