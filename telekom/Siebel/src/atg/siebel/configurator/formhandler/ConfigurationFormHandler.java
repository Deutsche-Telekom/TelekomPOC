///*<ORACLECOPYRIGHT>
// * Copyright (C) 1994, 2015, Oracle and/or its affiliates. All rights reserved.
// * Oracle and Java are registered trademarks of Oracle and/or its affiliates.
// * Other names may be trademarks of their respective owners.
// * UNIX is a registered trademark of The Open Group.
// *
// * This software and related documentation are provided under a license agreement
// * containing restrictions on use and disclosure and are protected by intellectual property laws.
// * Except as expressly permitted in your license agreement or allowed by law, you may not use, copy,
// * reproduce, translate, broadcast, modify, license, transmit, distribute, exhibit, perform, publish,
// * or display any part, in any form, or by any means. Reverse engineering, disassembly,
// * or decompilation of this software, unless required by law for interoperability, is prohibited.
// *
// * The information contained herein is subject to change without notice and is not warranted to be error-free.
// * If you find any errors, please report them to us in writing.
// *
// * U.S. GOVERNMENT RIGHTS Programs, software, databases, and related documentation and technical data delivered to U.S.
// * Government customers are "commercial computer software" or "commercial technical data" pursuant to the applicable
// * Federal Acquisition Regulation and agency-specific supplemental regulations.
// * As such, the use, duplication, disclosure, modification, and adaptation shall be subject to the restrictions and
// * license terms set forth in the applicable Government contract, and, to the extent applicable by the terms of the
// * Government contract, the additional rights set forth in FAR 52.227-19, Commercial Computer Software License
// * (December 2007). Oracle America, Inc., 500 Oracle Parkway, Redwood City, CA 94065.
// *
// * This software or hardware is developed for general use in a variety of information management applications.
// * It is not developed or intended for use in any inherently dangerous applications, including applications that
// * may create a risk of personal injury. If you use this software or hardware in dangerous applications,
// * then you shall be responsible to take all appropriate fail-safe, backup, redundancy,
// * and other measures to ensure its safe use. Oracle Corporation and its affiliates disclaim any liability for any
// * damages caused by use of this software or hardware in dangerous applications.
// *
// * This software or hardware and documentation may provide access to or information on content,
// * products, and services from third parties. Oracle Corporation and its affiliates are not responsible for and
// * expressly disclaim all warranties of any kind with respect to third-party content, products, and services.
// * Oracle Corporation and its affiliates will not be responsible for any loss, costs,
// * or damages incurred due to your access to or use of third-party content, products, or services.
// </ORACLECOPYRIGHT>*/
//
package atg.siebel.configurator.formhandler;

import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import java.util.ResourceBundle;

import javax.servlet.ServletException;
import javax.xml.crypto.dsig.TransformException;

import com.siebel.ordermanagement.quote.data.Quote;

import atg.core.i18n.LayeredResourceBundle;
import atg.core.util.StringUtils;
import atg.droplet.DropletException;
import atg.droplet.DropletFormException;
import atg.repository.RepositoryException;
import atg.repository.servlet.RepositoryFormHandler;
import atg.servlet.DynamoHttpServletRequest;
import atg.servlet.DynamoHttpServletResponse;
import atg.siebel.configurator.BaseConfigInstance;
import atg.siebel.configurator.ConfiguratorException;
import atg.siebel.configurator.ConfiguratorManager;
import atg.siebel.configurator.PromotionConfigInstance;
import atg.siebel.configurator.spu.StructuredProductUIException;
import atg.siebel.configurator.ui.UIManager;
import atg.siebel.order.SiebelOrderImpl;
import atg.siebel.order.SiebelOrderTools;
import atg.siebel.validation.SiebelValidator;


/**
 * Handles initiating the configuration of a promotion, and navigation between products
 * 
 * @author gmdowell
 *
 */
public class ConfigurationFormHandler extends RepositoryFormHandler
{
	//-------------------------------------
	/** Class version string */
	public static final String CLASS_VERSION = "$Id: //product/Siebel/version/11.2/src/atg/siebel/configurator/formhandler/ConfigurationFormHandler.java#2 $$Change: 1194813 $";

  //ResourceBundle Name
  private static final String SIEBEL_RESOURCE_BUNDLE_NAME = "atg.siebel.WebAppResources";
  
  private static final String COMMERCE_ITEM_ALREADY_CONFIGURED = "commerceItemAlreadyConfigured";
  
  private static final String SIEBEL_GENERIC_EXCEPTION_MESSAGE = "genericExceptionMessage";
  
//ResourceBundle
  private static ResourceBundle sResourceBundle = LayeredResourceBundle.getBundle(SIEBEL_RESOURCE_BUNDLE_NAME, atg.service.dynamo.LangLicense.getLicensedDefault());

	/**
	 * This feels a bit hacky to me. Revisit
	 * @return 
	 * @throws DropletFormException 
	 */
	public boolean beforeSet(DynamoHttpServletRequest pRequest, DynamoHttpServletResponse pResponse) throws DropletFormException
	{
		//set the promotion using the commerceItemId from the request
		String commerceItemId = pRequest.getParameter("commerceItemId");
		
		if(commerceItemId==null)
		{
			return super.beforeSet(pRequest, pResponse);
		}
		
		BaseConfigInstance instance = getUiManager().getInstance(commerceItemId);
		
		if(instance instanceof PromotionConfigInstance)
		{
			setPromotion((PromotionConfigInstance)instance);
		}
		
		
		return super.beforeSet(pRequest, pResponse);
	}
	
	//-------------------------------------
	// Properties
	//-------------------------------------
	
	//a promotion instance
	protected PromotionConfigInstance mPromotion;
	public PromotionConfigInstance getPromotion()
	{
		return mPromotion;
	}
	public void setPromotion(PromotionConfigInstance pPromotion)
	{
		mPromotion = pPromotion;
	}

	
	//the ui manager
	protected UIManager mUIManager;
	public UIManager getUiManager() {
		return mUIManager;
	}
	public void setUiManager(UIManager pUIManager) {
		mUIManager = pUIManager;
	}
	
	/**
	 * the end config success URL. If it's null, we'll use the one provided by the UI manager
	 */
	protected String mEndConfigSuccessURL;
	public String getEndConfigSuccessURL()
	{
		return mEndConfigSuccessURL;
	}
	public void setEndConfigSuccessURL(String pEndConfigSuccessURL)
	{
		mEndConfigSuccessURL = pEndConfigSuccessURL;
	}
	
  private String mEndConfigErrorURL;

  public String getEndConfigErrorURL() {
    return mEndConfigErrorURL;
  }

  public void setEndConfigErrorURL(String endConfigFailureURL) {
    this.mEndConfigErrorURL = endConfigFailureURL;
  }
	
  /**
   * the end config cardinality error URL.
   */
  private String mEndConfigCardinalityErrorURL;
  
  public String getEndConfigCardinalityErrorURL() {
    return mEndConfigCardinalityErrorURL;
  }
  
  public void setEndConfigCardinalityErrorURL(
      String mEndConfigCardinalityErrorURL) {
    this.mEndConfigCardinalityErrorURL = mEndConfigCardinalityErrorURL;
  }
  
  /**
   * configurator manager
   */
  private ConfiguratorManager mConfiguratorManager;
  
  public ConfiguratorManager getConfiguratorManager() {
    return mConfiguratorManager;
  }
  public void setConfiguratorManager(ConfiguratorManager mConfiguratorManager) {
    this.mConfiguratorManager = mConfiguratorManager;
  }
  
  //----------------------------------------------------------------------------------
  //property: mSiebelValidator
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
  
  

  
	/**
	 * method which calls the UI manager to initialise a promotion. It will redirect towards a page which
	 * renders single products or multiple products based on the UIManager's decision
	 * 
	 * @param pRequest
	 * @param pResponse
	 * @return
	 * @throws ServletException
	 * @throws IOException
	 */
	public boolean handleInitialisePromotion(DynamoHttpServletRequest pRequest, DynamoHttpServletResponse pResponse)
			throws ServletException, IOException
	{
		boolean returnValue = false;
		try
		{
      // validating the product
      //validateProduct();
      if (getFormError()) {
        returnValue = checkFormSuccess(pRequest.getRequestURI() + "?commerceItemId="
            + getPromotion().getCommerceItemId(), pRequest, pResponse);
      }else{
  			//create the root products, initalise them and cache them
      	//the quote should be set to the PCI in case of ABO
        Quote quote = getPromotion().getQuote() != null ? getPromotion().getQuote() : getQuote();
      	getPromotion().initialiseRootProducts(getUiManager().getConfiguratorTools().getProductConfigInstanceCache(), quote);
  			//reconcile the shopping cart for the Root level products, as
  			//we may be be re-editing a promotion and have stale 
  			//commerce items in the order
  			getUiManager().getConfiguratorTools().reconcileCartWithPromotion(getPromotion());
  			returnValue = checkFormSuccess(getUiManager().getPromotionRendererURL(getPromotion())+"?commerceItemId="+getPromotion().getCommerceItemId(), pRequest, pResponse);
  			/**
  			 * validation should happen after creating and reconciling the promotion product
  			 */
  			validateProduct();
      }
		}catch(ConfiguratorException ce){
		  if(isLoggingError()){
		    logError(ce);
		  }
			addFormException(new DropletFormException(ce.getMessage(), 
					ce, 
					getAbsoluteName()+".promotion", 
					"configException"));
			//Set error message?
			returnValue = checkFormSuccess(pRequest.getRequestURI()+"?commerceItemId="+getPromotion().getCommerceItemId(), pRequest, pResponse);
		} catch (StructuredProductUIException spue) {
			if (isLoggingError()) {
				logError(spue);
			}
			String[] commerceIds = new String[] { getPromotion()
					.getCommerceItemId() };
			getConfiguratorManager().deleteCommerceItemsFromShoppingCart(
					commerceIds);
			returnValue = checkFormSuccess(pRequest.getRequestURI(), pRequest,
					pResponse);
		} 
		return returnValue;
	}
	
	public boolean handleEndConfiguration(DynamoHttpServletRequest pRequest, DynamoHttpServletResponse pResponse)
			throws ServletException, IOException
	{
		String commerceItemId = pRequest.getParameter("commerceItemId");
    /*
     * SIEBELINT-914 : Check if this item has been already configured and
     * checked out(another tab of same browser), in which case the user should
     * be redirected back to configuration page
     */
    boolean returnValue = false;
    BaseConfigInstance pci = getUiManager().getConfiguratorTools()
        .getProductConfigInstanceCache().getInstance(commerceItemId);
    if (pci == null) {
      getFormExceptions().add(new Exception(sResourceBundle.getString(COMMERCE_ITEM_ALREADY_CONFIGURED)));
      checkFormError(getEndConfigErrorURL(), pRequest, pResponse);
      returnValue = false;
      } else {
  
    		int index = -1;
    		String indexString = pRequest.getParameter("index");
    		
    		//check we got an index
    		if(indexString != null && !"".equals(indexString))
    		{
    			index = Integer.parseInt(indexString);
    		}
    		/*Bug 17327776 - Check if the actual count of relationship added is less than the min
         * cardinality, in which case the error message should be displayed.  
         */
        try{
          getConfiguratorManager().checkMinimumCardinality(pci);
        }catch(Exception e){
          getFormExceptions().add(new Exception(e.getMessage()));
          checkFormError(getEndConfigCardinalityErrorURL(), pRequest, pResponse);
          returnValue = false;
        }
        
        if(!getFormError()){
    		String configuredSuccesURL = getUiManager().endConfiguration(commerceItemId, index);
    		
    		String successURL = getEndConfigSuccessURL();
    		
    		boolean endOfList = false;
    		
    		if(getPromotion()!=null)
    		{
    		  if(getPromotion().getRootProductSize()<=index)
    		  {
    		    endOfList = true;
    		  }
    		}
  		
    		if(null == successURL || "".equals(successURL) || endOfList)
    		{
    			successURL = configuredSuccesURL+"?commerceItemId="+commerceItemId;
    		}
  		
        returnValue = checkFormSuccess(successURL, pRequest, pResponse);
      }
    }
    return returnValue;
  }
	
  /**
   * checks the compatibility of the root and domain products of PCI
   * 
   */
  
  private void checkCompatibility() {
    
    Map<String, String> productMap = null;
    Map<String, String> invalidProducts = null;
    // get the product map <productid, product-name> of root products
    // and domain products having quantity more than zero
    productMap = getUiManager().getConfiguratorTools().createProductMapOfPCI(
        getPromotion());
    String[] productIdArray = Arrays.copyOf(productMap.keySet().toArray(),
        productMap.keySet().toArray().length, String[].class);
    try {
      // Compatibility check
      invalidProducts = getSiebelValidator().validateProductsCompatibility(Arrays.asList(productIdArray));
      
      if (isLoggingDebug()) {
        if(invalidProducts != null){
        logDebug(invalidProducts.toString());
        }
      }
      // setting Eligibility and Compatibility error messages
      if (invalidProducts != null && !invalidProducts.isEmpty()) {
        for (Map.Entry<String, String> invalidProductEntry : invalidProducts
            .entrySet()) {
          addFormException(new DropletException(
              productMap.get(invalidProductEntry.getKey()) + " : "
                  + invalidProductEntry.getValue()));
        }
      }
      
    } catch (RepositoryException rpex) {
      if (isLoggingError()) {
        logError(rpex);
      }
      addFormException(new DropletException(rpex.getMessage()));
    } catch (Exception ex) {
      if (isLoggingError()) {
        logError(ex);
      }
      addFormException(new DropletException(
          sResourceBundle.getString(SIEBEL_GENERIC_EXCEPTION_MESSAGE)));
    }
    
  }
  
  /**
   * validates the PCI compatibility check, quantity check
   * 
   * @throws ConfiguratorException
   */
  public void validateProduct() throws ConfiguratorException {
    
    // set and check the quantities for each domain product
    try {
      getPromotion().validateQuantities();
    } catch (ConfiguratorException ex) {
      throw ex;
    }
    
    // check compatibility
    //E&C has been removed as we don't want to check the compatibility before the child products are configured
    //checkCompatibility();
    // if form error return to the calling method
    if (getFormError()) {
      return;
    }
    
  }
  
  /**
   * Method to retrieve Quote.
   * @return instance of Quote
   */
  private Quote getQuote(){
  	Quote quote = null;
  	SiebelOrderImpl siebelOrder = (SiebelOrderImpl)getPromotion().getConfiguratorManager().getConfiguratorTools().getOrderHolder().getCurrent();
    if(!StringUtils.isBlank(siebelOrder.getQuoteNumber())){
	    SiebelOrderTools siebelOrderTools = (SiebelOrderTools)getPromotion().getConfiguratorManager().getConfiguratorTools().getOrderManager().getOrderTools();
	    try {
	  	  quote = siebelOrderTools.convertOrderToSiebelQuote(siebelOrder);
			} catch (TransformException e) {
				if(isLoggingError()){
					logError(e);
				}
			}
    }
    return quote;
  }
}
