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
package atg.siebel.configurator.droplet;

import java.io.IOException;
import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;

import javax.servlet.ServletException;

import atg.commerce.CommerceException;
import atg.commerce.order.Order;
import atg.commerce.order.OrderHolder;
import atg.commerce.order.purchase.PurchaseProcessHelper;
import atg.commerce.pricing.PricingModelHolder;
import atg.commerce.util.PipelineErrorHandler;

import atg.core.i18n.LayeredResourceBundle;
import atg.core.util.StringUtils;
import atg.repository.RepositoryItem;
import atg.servlet.DynamoHttpServletRequest;
import atg.servlet.DynamoHttpServletResponse;
import atg.servlet.DynamoServlet;
import atg.siebel.configurator.ConfiguratorException;
import atg.siebel.configurator.ConfiguratorManager;
import atg.siebel.configurator.PromotionConfigInstance;
import atg.siebel.configurator.ui.UIManager;
import atg.siebel.order.SiebelOrderTools;
import atg.siebel.validation.SiebelValidator;

/**
 * @author gmdowell
 * 
 */
public class GetPromotionTemplateDroplet extends DynamoServlet implements PipelineErrorHandler {

  //-------------------------------------
  /** Class version string */

  public static String CLASS_VERSION = "$Id: //product/Siebel/version/11.2/src/atg/siebel/configurator/droplet/GetPromotionTemplateDroplet.java#2 $$Change: 1194813 $";


	// INPUT PARAMS
	public static final String INPUT_COMMERCE_ITEM_PARAM = "commerceItemId";

	// OUTPUT PARAMS
	public static final String OUTPUT_PROMOTION_TEMPLATE = "promotionTemplate";
	public static final String OUTPUT_ERROR_MESSAGE = "errorMessage";

	// OPARAMS
	public static final String OPARAM_OUTPUT = "output";
	public static final String OPARAM_ERROR = "error";
	
    //ResourceBundle Name
    private static final String SIEBEL_RESOURCE_BUNDLE_NAME = "atg.siebel.WebAppResources";
    private static ResourceBundle sResourceBundle = LayeredResourceBundle.getBundle(SIEBEL_RESOURCE_BUNDLE_NAME, atg.service.dynamo.LangLicense.getLicensedDefault());
    private static final String UI_NOTFOUND_ERROR_MESSAGE="uiNotFound";


	// -------------------------------------
	// Properties
	// -------------------------------------
	
	
	// -------------------------------------
	// property: manager
	private ConfiguratorManager mManager;
	public ConfiguratorManager getManager() {
		return mManager;
	}
	public void setManager(ConfiguratorManager pManager) {
		mManager = pManager;
	}	
	
    //---------------------------------------------------------------------------
    // property: Order
    Order mOrder;
    public void setOrder(Order pOrder) {
      mOrder = pOrder;
    }
    public Order getOrder() {
      if (mOrder != null)
        return mOrder;
      else
        return getManager().getConfiguratorTools().getOrderHolder().getCurrent();
    }

    
    //---------------------------------------------------------------------------
    // property: Profile
    RepositoryItem mProfile;

    public void setProfile(RepositoryItem pProfile) {
      mProfile = pProfile;
    }
    public RepositoryItem getProfile() {
      return mProfile;
    }
  
    //-------------------------------------
    // property: userPricingModels
    PricingModelHolder mUserPricingModels;

    public void setUserPricingModels(PricingModelHolder pUserPricingModels) {
      mUserPricingModels = pUserPricingModels;
    }
    public PricingModelHolder getUserPricingModels() {
      return mUserPricingModels;
    }

    //-------------------------------------
    // property: purchaseProcessHelper
    PurchaseProcessHelper mPurchaseProcessHelper;

    public void setPurchaseProcessHelper(PurchaseProcessHelper pPurchaseProcessHelper) {
      mPurchaseProcessHelper = pPurchaseProcessHelper;
    }
    public PurchaseProcessHelper getPurchaseProcessHelper() {
      return mPurchaseProcessHelper;
    }
  
    //----------------------------------------------------------------------------------
    // property: mSiebelValidator
    private SiebelValidator mSiebelValidator;
  
    public SiebelValidator getSiebelValidator() {
      return mSiebelValidator;
    }
  
    public void setSiebelValidator(SiebelValidator pSiebelValidator) {
      this.mSiebelValidator = pSiebelValidator;
    }
  
    //----------------------------------------------------------------------------------
    // property: orderTools
    private SiebelOrderTools mOrderTools;
 
    public SiebelOrderTools getOrderTools() {
      return mOrderTools;
    }
    public void setOrderTools (SiebelOrderTools pOrderTools) {
      mOrderTools = pOrderTools;
    }
  
    //property: UIManager
    protected UIManager mUIManager;
    public UIManager getUiManager() {
      return mUIManager;
    }
    public void setUiManager(UIManager pUIManager) {
      mUIManager = pUIManager;
    }
  
    //-------------------------------------------------------------------------------
    //property: url
    private String mUrl;
  
    public String getUrl() {
      return mUrl;
    }
    public void setUrl(String pUrl) {
      this.mUrl = pUrl;
    }

    /**
     * Method to retrieve Locale from the shopping cart
     * 
     * @param pShoppingCart
     *            Shopping cart
     * @return
     */
    private Locale retrieveLocale(OrderHolder pShoppingCart) {
      String locale = (String) pShoppingCart.getProfile().getPropertyValue(
          "locale");
      Locale defaultLocale=null;
      if (StringUtils.isEmpty(locale)) {
        defaultLocale = getManager().getConfiguratorTools().getProfileTools().getLocaleService().getLocale();
        locale = defaultLocale.getDisplayName();
      }
      return defaultLocale;
    }
	

	/** {@inheritDoc} */
	@Override
	public void service(DynamoHttpServletRequest req,
			DynamoHttpServletResponse res) throws ServletException, IOException {

		String commerceItemId = req.getParameter(INPUT_COMMERCE_ITEM_PARAM);
		
		if(commerceItemId==null)
		{
			throw new ServletException("Null commerceItemId");
		}
		
		PromotionConfigInstance promotionTemplate = null;
		
		try
		{
		  promotionTemplate = getManager().getPromotionTemplate(commerceItemId);
		  //Check if UI is found,If not form the error message and redirect to the given URL
		  boolean isUIFound = getSiebelValidator().isProductUIFoundFromInstance(promotionTemplate);
		  if (!isUIFound) {
		    String[] commerceIds = new String[] { commerceItemId };
		    Locale locale = retrieveLocale(getManager().getConfiguratorTools().getOrderHolder());
		    //Delete the commerce items from the order
		    getPurchaseProcessHelper().deleteItems(getOrder(), commerceIds,getUserPricingModels(), locale, getProfile(), this);
		    String errorMsg = MessageFormat.format(sResourceBundle.getString(UI_NOTFOUND_ERROR_MESSAGE),promotionTemplate.getProductId());
		    getUiManager().redirect(req, res, getUrl(), errorMsg);
		    return;
		  }
		}
		catch(ConfiguratorException e)
		{
		  e.printStackTrace();
		}
		catch(CommerceException e)
		{
		  e.printStackTrace();
		}
		
		if(promotionTemplate==null)
		{
			throw new ServletException("No promotion instance with the commerce Item id " + commerceItemId);
		}
		req.setParameter(OUTPUT_PROMOTION_TEMPLATE,	promotionTemplate);
		req.serviceParameter(OPARAM_OUTPUT, req, res);
	}
	
	@Override
	public void handlePipelineError(Object pError, String pErrorKey) {
	  if(isLoggingInfo())
      logInfo("In handlePipelineError Method");
	}
	
}


