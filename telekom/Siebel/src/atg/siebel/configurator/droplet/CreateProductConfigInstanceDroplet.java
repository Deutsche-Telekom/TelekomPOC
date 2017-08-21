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
import java.util.ResourceBundle;

import javax.servlet.ServletException;
import javax.xml.crypto.dsig.TransformException;

import com.siebel.ordermanagement.quote.data.Quote;

import atg.commerce.CommerceException;
import atg.core.i18n.LayeredResourceBundle;
import atg.servlet.DynamoHttpServletRequest;
import atg.servlet.DynamoHttpServletResponse;
import atg.servlet.DynamoServlet;
import atg.siebel.configurator.ConfiguratorException;
import atg.siebel.configurator.ConfiguratorManager;
import atg.siebel.configurator.Constants.ProductConfigInstanceStatus;
import atg.siebel.configurator.RootProductConfigInstance;
import atg.siebel.configurator.spu.StructuredProductUIException;
import atg.siebel.configurator.ui.UIManager;
import atg.siebel.order.SiebelOrderImpl;
import atg.siebel.order.SiebelOrderTools;
import atg.siebel.validation.SiebelValidator;

/**
 * Droplet which creates a Product Config Instance when given a commerce item
 *
 * @author Gary McDowell
 * @version $Id: //product/Siebel/version/11.2/src/atg/siebel/configurator/droplet/CreateProductConfigInstanceDroplet.java#2 $$Change: 1194813 $
 * @updated $DateTime: 2015/09/10 08:26:24 $$Author: saysyed $
 */
public class CreateProductConfigInstanceDroplet extends DynamoServlet
{

  //-------------------------------------
  /** Class version string */

  public static String CLASS_VERSION = "$Id: //product/Siebel/version/11.2/src/atg/siebel/configurator/droplet/CreateProductConfigInstanceDroplet.java#2 $$Change: 1194813 $";

	// INPUT PARAMS
	public static final String INPUT_COMMERCE_ITEM_PARAM = "commerceItemId";
	
	// OUTPUT PARAMS
	public static final String OUTPUT_ERROR_PARAM = "errorMessage";
	public static final String ERROR_MSG = "errorOccured";
	
	//OPARAMS
	public static final String OPARAM_OUTPUT = "output";
	
	//ResourceBundle Name
	private static final String SIEBEL_RESOURCE_BUNDLE_NAME = "atg.siebel.WebAppResources";
	private static ResourceBundle sResourceBundle = LayeredResourceBundle.getBundle(SIEBEL_RESOURCE_BUNDLE_NAME, atg.service.dynamo.LangLicense.getLicensedDefault());
	private static final String UI_NOTFOUND_ERROR_MESSAGE="uiNotFound";



	// -------------------------------------
	// Properties
	// -------------------------------------
		
	// -------------------------------------
	// property: configuratorManager
	private ConfiguratorManager mConfiguratorManager;
	public ConfiguratorManager getConfiguratorManager() {
		return mConfiguratorManager;
	}
	public void setConfiguratorManager(ConfiguratorManager pConfiguratorManager) {
		mConfiguratorManager = pConfiguratorManager;
	}
	//property: UIManager
	protected UIManager mUIManager;
	public UIManager getUiManager() {
	  return mUIManager;
	}
	public void setUiManager(UIManager pUIManager) {
	  mUIManager = pUIManager;
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
	 *  Method that creates the RootProductConfigInstance and does a begin configuration with it.
	 *  
	 */
	public void service(DynamoHttpServletRequest req,
			DynamoHttpServletResponse res) throws ServletException, IOException 
	{
		String commerceItemId = req.getParameter(INPUT_COMMERCE_ITEM_PARAM);
		if(commerceItemId!=null || !commerceItemId.isEmpty())
		{
		  try {
			  RootProductConfigInstance instance = getConfiguratorManager().createProductInstanceFromCommerceItem(commerceItemId);
				//the quote should be set to the PCI in case of ABO
			  getConfiguratorManager().setQuoteFromOrder(instance);
			  getUiManager().beginConfiguration(instance);
		    
		    // Check if the begin configuration status is successful or not
		    String[] commerceIds=new String[]{commerceItemId};
			/* If the status is not successful and PCI is not initialized redirect
               to the given url with the error message */
            if (!instance.getLastCommandStatus().isSuccessfull()
              && !instance.getStatus().equals(
                ProductConfigInstanceStatus.INITIALISED)) {
		      //Delete the commerce items from the order
		      String errorMsg= instance.getLastCommandStatus().getStatusDetails().getDescription();
		      deleteItemsFromOrder(errorMsg, commerceIds, req, res);		      
		      return;
		    }
		    //Check if the UI is found for the product, if not redirect to the given url with error message.
		    boolean isUIFound=getSiebelValidator().isProductUIFoundFromInstance(instance);
		    if(!isUIFound){
		      //Delete the commerce items from the order
		      String errorMsg=MessageFormat.format(sResourceBundle.getString(UI_NOTFOUND_ERROR_MESSAGE),instance.getProductId());
		      deleteItemsFromOrder(errorMsg, commerceIds, req, res);
		      return;
		    }
			
		    
		  }
		  catch(ConfiguratorException ce)
		  {
		    throw new ServletException(ce);
		  } 
		  catch (StructuredProductUIException e)
		  {
		    throw new ServletException(e);
		  }
		  catch (CommerceException e)
		  {
		    throw new ServletException(e);
		  }
		  catch (Exception e)
      {
        throw new ServletException(e);
      }
		}
		else
		{
		  throw new ServletException("No Commerce Item Id provided");
		}
  }
	
	/**
	 * Method to delete the given commerce item from the order
	 * @param errorMsg
	 * @param commerceIds
	 * @param locale
	 * @param pReq
	 * @param pRes
	 * @throws CommerceException
	 * @throws Exception
	 */
	public void deleteItemsFromOrder(String errorMsg, String[] commerceIds, DynamoHttpServletRequest pReq,DynamoHttpServletResponse pRes)throws CommerceException,Exception{
	  getConfiguratorManager().deleteCommerceItemsFromShoppingCart(commerceIds);
	  getUiManager().redirect(pReq, pRes, getUrl(), errorMsg);
    pReq.setParameter(OUTPUT_ERROR_PARAM,ERROR_MSG);
    pReq.serviceParameter(OPARAM_OUTPUT, pReq, pRes);
	  
	}
}
