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

package atg.siebel.configurator.formhandler;

import java.io.IOException;

import javax.servlet.ServletException;

import com.siebel.ordermanagement.quote.data.Quote;

import atg.commerce.catalog.CatalogTools;
import atg.commerce.order.OrderHolder;
import atg.core.util.StringUtils;
import atg.repository.servlet.RepositoryFormHandler;
import atg.servlet.DynamoHttpServletRequest;
import atg.servlet.DynamoHttpServletResponse;
import atg.siebel.catalog.SiebelCatalogProduct;
import atg.siebel.catalog.SiebelCatalogTools;
import atg.siebel.configurator.BaseConfigInstance;
import atg.siebel.configurator.ConfiguratorManager;
import atg.siebel.configurator.PromotionConfigInstance;
import atg.siebel.configurator.RootProductConfigInstance;
import atg.siebel.configurator.ui.UIManager;
import atg.siebel.order.SiebelCommerceItem;
import atg.siebel.order.SiebelOrderImpl;
import atg.siebel.order.SiebelOrderTools;

/**
 * Handles loading a promotion for edit, typically if user bombs
 * out mid way through configuration, or after configuration has 
 * finished and a user wishes to revise
 * 
 * @author gamcdowe
 *
 */
public class ConfigurationEditFormHandler extends RepositoryFormHandler 
{
	
	//-------------------------------------
	/** Class version string */
	public static final String CLASS_VERSION = "$Id: //product/Siebel/version/11.2/src/atg/siebel/configurator/formhandler/ConfigurationEditFormHandler.java#2 $$Change: 1194813 $";

	public static final String PROMOTION="Promotion";
	
	/**
	 * commerce item id to identify the promotion
	 */
	protected String mCommerceItemId;
	public void setCommerceItemId(String pCommerceItemId)
	{
		mCommerceItemId = pCommerceItemId;
	}
	public String getCommerceItemId()
	{
		return mCommerceItemId;
	}
	
	/**
	 * the current shopping cart
	 */
	protected OrderHolder mShoppingCart;
	public OrderHolder getShoppingCart() 
	{
		return mShoppingCart;
	}
	public void setShoppingCart(OrderHolder pShoppingCart) 
	{
		mShoppingCart = pShoppingCart;
	}

	// -------------------------------------
	// property: uiManager
	protected UIManager mUIManager;
  public UIManager getUiManager() {
    return mUIManager;
  }
  public void setUiManager(UIManager pUIManager) {
    mUIManager = pUIManager;
  }
	
  //-------------------------------------
  // property: manager
  protected ConfiguratorManager mConfiguratorManager;
  public ConfiguratorManager getConfiguratorManager() {
    return mConfiguratorManager;
  }
  public void setConfiguratorManager(ConfiguratorManager pConfiguratorManager) {
    mConfiguratorManager = pConfiguratorManager;
  }
	
  protected CatalogTools mCatalogTools;

  public CatalogTools getCatalogTools() {
    return mCatalogTools;
  }

  public void setCatalogTools(CatalogTools pCatalogTools) {
    mCatalogTools = pCatalogTools;
  }
  
	// -------------------------------------
	// property: ConfigurationEditSuccessURL
	protected String mConfigurationEditSuccessURL;
	public void setConfigurationEditSuccessURL(String pConfigurationEditSuccessURL)
	{
		mConfigurationEditSuccessURL = pConfigurationEditSuccessURL;
	}
	public String getConfigurationEditSuccessURL()
	{
		return mConfigurationEditSuccessURL;
	}
	
	/**
	 * load the promo commerce item from the current order, populate the template and load
	 * the root products from child commerce items
	 * 
	 * @param pRequest
	 * @param pResponse
	 * @return
	 * @throws ServletException
	 * @throws IOException
	 */
	public boolean handleConfigurationEdit(DynamoHttpServletRequest pRequest, DynamoHttpServletResponse pResponse)
			throws ServletException, IOException
	{
		if(null==getCommerceItemId())
		{
			throw new ServletException("Null Commerce ID");
		}
		
		BaseConfigInstance instance = null;
		
		try
    {
		  /*
		   * Remove the PCI instance from cache, as it is created again
		   * from the commerce item.
		   */
		  
		  getConfiguratorManager().getConfiguratorTools()
          .getProductConfigInstanceCache()
          .removeProductConfigInstanceFromCache(getCommerceItemId());
      
		  SiebelCommerceItem commerceItem = (SiebelCommerceItem)
        getShoppingCart().getCurrent().getCommerceItem(getCommerceItemId());
		  
		  //look up the comemrceItem's product id in the catalog to see it's type
		  String productID = commerceItem.getAuxiliaryData().getProductId();
		  
		  SiebelCatalogProduct product = ((SiebelCatalogTools)getCatalogTools()).getProductDetails(productID);
		  
		  if(product.getProductType().equals(PROMOTION))
		  {
		    instance = getConfiguratorManager().buildPromotionFromCommerceItem(commerceItem);
		    if (instance == null)
		    {
		      instance = getConfiguratorManager().getPromotionTemplate(getCommerceItemId());
		    }
		  }
		  else
		  {
		    instance = getConfiguratorManager().createProductInstanceFromCommerceItem(commerceItem, 0);
		  }
		  
		  //For an ABO, we need to set the quote details in the PCI
		  getConfiguratorManager().setQuoteFromPCI(instance);
		}
		catch(Exception e)
		{
			throw new ServletException(e);
		}		
		
		String successURL = getUiManager().getReconfigureSuccessURL(instance);

		return checkFormSuccess(successURL+"?commerceItemId="+getCommerceItemId(), pRequest, pResponse);		
	}
}
