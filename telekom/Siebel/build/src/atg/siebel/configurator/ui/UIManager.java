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
package atg.siebel.configurator.ui;

import java.io.IOException;

import javax.servlet.ServletException;

import atg.core.net.URLUtils;
import atg.core.util.ResourceUtils;
import atg.nucleus.GenericService;
import atg.nucleus.ServiceMap;
import atg.servlet.DynamoHttpServletRequest;
import atg.servlet.DynamoHttpServletResponse;
import atg.siebel.configurator.BaseConfigInstance;
import atg.siebel.configurator.ChildProductConfigInstance;
import atg.siebel.configurator.ConfiguratorException;
import atg.siebel.configurator.ConfiguratorTools;
import atg.siebel.configurator.ProductConfigInstance;
import atg.siebel.configurator.PromotionConfigInstance;
import atg.siebel.configurator.spu.StructuredProductUIException;
import atg.siebel.configurator.spu.StructuredProductUITools;
import atg.siebel.configurator.ui.UINode.UINodeType;

/**
 * This components handles interaction betweeen the UI layer (droplets and form handlers) and the
 * PCI via UINodes and UINodeWrappers.
 * 
 * @author gamcdowe
 *
 */
public class UIManager extends GenericService 
{
	//-------------------------------------
	/** Class version string */
	public static final String CLASS_VERSION = "$Id: //product/Siebel/version/11.2/src/atg/siebel/configurator/ui/UIManager.java#2 $$Change: 1194813 $";
	
	public static final String OUTPUT_ERROR_MESSAGE = "errorMessage";

	// -------------------------------------
	// Properties
	// -------------------------------------
	
	protected UICache mUICache;
	/**
	 * @return the mUICache
	 */
	public UICache getUiCache() {
		return mUICache;
	}
	/**
	 * @param mUICache the mUICache to set
	 */
	public void setUiCache(UICache pUICache) {
		mUICache = pUICache;
	}

	public UINodeGeneratorService getUiNodeGeneratorService() {
		return mUINodeGeneratorService;
	}

	protected UINodeGeneratorService mUINodeGeneratorService;

	public void setUiNodeGeneratorService(UINodeGeneratorService pUINodeGeneratorService) {
		mUINodeGeneratorService = pUINodeGeneratorService;
	}
	
	// -------------------------------------
	// spuTools property
	protected StructuredProductUITools mSpuTools;

	public StructuredProductUITools getSpuTools() {
	  return mSpuTools;
	}

	public void setSpuTools(StructuredProductUITools pSpuTools) {
	  mSpuTools = pSpuTools;
	}
	
	//-------------------------------------
	// property: configuratorTools
	protected ConfiguratorTools mConfiguratorTools;

	public ConfiguratorTools getConfiguratorTools() {
		return mConfiguratorTools;
	}

	public void setConfiguratorTools(ConfiguratorTools pConfiguratorTools) {
		mConfiguratorTools = pConfiguratorTools;
	}
	
	protected ServiceMap mHandlers = new ServiceMap();
	
	public void setHandlers(ServiceMap pHandlers)
	{
		mHandlers = pHandlers;
	}
	
	public ServiceMap getHandlers()
	{
		return mHandlers;
	}
	
	public UIHandler getHandlerForType(String pType)
	{		
		return (UIHandler) mHandlers.get(pType);
	}

  
  /**
	 * Returns a UINodeWrapper which represents the state of the UI for a given PCI key
	 * 
	 * @param pPCIKey - the PCI whose UI you want the current state of
	 * @return a UINodeWrapper representing the state of the PCI
	 * @throws StructuredProductUIException 
	 */
	public UINodeWrapper getUI(String pKey) throws StructuredProductUIException
	{
		vlogDebug("generateUI() called with pKey = {0}", pKey);
	    if (pKey == null) {
	      vlogError("pKey == null");
	      return null;
	    }
	    UINodeWrapper uiNodeWrapper;
	    
	    BaseConfigInstance instance = getInstance(pKey);
	    
	    UIHandler handler = getHandlerForType(instance.getClass().getName());
	    
	    beginConfiguration(instance);
	    
	    uiNodeWrapper = updateUI(handler, instance);
	    
	    return uiNodeWrapper;
	}
	
	/**
	 * calls begin config on a promotion or a root product from a promotion
	 * at a given index
	 * 
	 * @param pCommerceID
	 * @param pIndex
	 * @throws StructuredProductUIException
	 */
	public void beginConfiguration(String pCommerceID, int pIndex)
			throws StructuredProductUIException
	{
		BaseConfigInstance instance = getInstance(pCommerceID);
		
		//if we have an index and the instance is a promotion, call begin config 
		//on the root CP at that given index
		if(instance instanceof PromotionConfigInstance && pIndex >= 0)
		{
			instance = ((PromotionConfigInstance)instance).getRootProducts().get(pIndex);
		}
		
		beginConfiguration(instance);
	}
	
	
	/**
	 * @param instance
	 * @param handler
	 * @throws StructuredProductUIException
	 */
	public void beginConfiguration(BaseConfigInstance pInstance)
			throws StructuredProductUIException 
	{
		UIHandler handler = getHandlerForType(pInstance.getClass().getName());
		try
	    {
	    	handler.beginConfiguration(pInstance);
	    }
	    catch(ConfiguratorException ce)
	    {
	    	throw new StructuredProductUIException(ce);
	    }
	}
	
	private UINodeWrapper updateUI(UIHandler pHandler, BaseConfigInstance pInstance) throws StructuredProductUIException
	{
		UINodeWrapper uiNodeWrapper = pHandler.generateUI(pInstance);
		
		pHandler.cacheUI(pInstance, uiNodeWrapper);
		
		return uiNodeWrapper;
	}
	
	public UINodeWrapper updateUI(BaseConfigInstance pInstance) throws StructuredProductUIException
	{
		UIHandler handler = getHandlerForType(pInstance.getClass().getName());
		
		return updateUI(handler, pInstance);
	}
	
	/**
	 * Updates the Node in the UINodeWrapper at the given index with the supplied value
	 * 
	 * @param pNodeValue - the value to update the node with
	 * @param pNodeIndex - the index of the node in the node list
	 * @param pPCIKey - the pci of the UI
	 */
	public void updateNode(String pNodeValue, int pNodeIndex, String pKey) throws StructuredProductUIException 
	{
		BaseConfigInstance instance = getInstance(pKey);
		
		UIHandler handler = getHandlerForType(instance.getClass().getName());
		
		UINodeWrapper uiNodeWrapper = handler.getCachedUI(instance);
		
		if(uiNodeWrapper == null)
		{
			throw new StructuredProductUIException("No UI found for key = " + pKey);
		}
		
		UINode node = uiNodeWrapper.getUiNodeList().get(pNodeIndex);
		
		node.setSelectedValue(pNodeValue);
	}
	
	/**
	 * Deletes an product or products from a PCI
	 * 
	 * @param pParentKey
	 * @param pRelationshipId
	 * @param pChildKey
	 */
	public void deleteProduct(String pKey, int pNodeIndex) throws StructuredProductUIException
	{
		BaseConfigInstance instance = getInstance(pKey);
		
		UIHandler handler = getHandlerForType(instance.getClass().getName());
		
		UINodeWrapper uiNodeWrapper = handler.getCachedUI(instance);
		
		if(uiNodeWrapper == null)
		{
			throw new StructuredProductUIException("No UI found for key = " + pKey);
		}
		
		UINode node = uiNodeWrapper.getUiNodeList().get(pNodeIndex);
		
		//throw and exception if the node isn't a relationship node
		
		ChildProductConfigInstance child = null;
		if(node.getType().equals(UINodeType.DISPLAY_NODE))
		{
			//if the referring node is not a relationship, then it's PCI is the child we want to delete
			if(node.getProductConfigInstance() instanceof ChildProductConfigInstance)
			{
				child = (ChildProductConfigInstance)node.getProductConfigInstance();
			}
			else
			{
				throw new StructuredProductUIException("Can only remove child products");
			}
		}
		else
		{
			//if the node is a relationship node, get the child instance
			if(node.getProductConfigRelationship().getChildInstances()[0] instanceof ChildProductConfigInstance)
			{
				child = (ChildProductConfigInstance)node.getProductConfigRelationship().getChildInstances()[0];
				
			}
			else
			{
				throw new StructuredProductUIException("Can only remove child products");
			}
		}
        child.deleteInstance();
		
	}
	
	/**
	 * returns a Config Instance given a key
	 * 
	 * @param pKey
	 * @return
	 */
	public BaseConfigInstance getInstance(String pKey)
	{
		return getConfiguratorTools().getProductConfigInstanceCache().getInstance(pKey);
	}
	
	/**
	 * returns the renderer jsp for a promotion.
	 * 
	 * @param pPromo
	 * @return
	 * @throws StructuredProductUIException 
	 */
	public String getPromotionRendererURL(PromotionConfigInstance pPromo) throws StructuredProductUIException
	{
		return getSpuTools().getPromotionUI(pPromo.getProductId()).getController().getApplicationContext()+ 
				getSpuTools().getPromotionUI(pPromo.getProductId()).getController().getJspPath();
	}
	
	public String endConfiguration(String pCommerceID, int pIndex)
	{
		BaseConfigInstance instance = getInstance(pCommerceID);
		
		//if we have an index and the instance is a promotion, call end config 
		//on the root CP at that given index
		if(instance instanceof PromotionConfigInstance && pIndex >= 0
		    &&pIndex < ((PromotionConfigInstance)instance).getRootProducts().size())
		{
			instance = ((PromotionConfigInstance)instance).getRootProducts().get(pIndex);
		}

		UIHandler handler = getHandlerForType(instance.getClass().getName());
		
		handler.endConfiguration(instance);
		
		String successURL = handler.getEndConfigSuccessURL();
		
		return successURL;
	}
	
	/**
	 * returns the reconfigure success url for the given instance type
	 * 
	 * @param pInstance
	 * @return
	 */
	public String getReconfigureSuccessURL(BaseConfigInstance pInstance)
	{
	  UIHandler handler = getHandlerForType(pInstance.getClass().getName());
	  
	  return handler.getReconfigureSuccessURL();
	}
	
	/**
	 * invalidates PCI cache by delegating to configurator tools
	 */
	public void invalidateProductConfigInstanceCache()
	{
		getConfiguratorTools().invalidateProductConfigInstanceCache();
	}
	
  /**
   * Redirect to the specified URL and set the message in request
   * 
   * @throws IOException
   * 
   */
  public void redirect(DynamoHttpServletRequest pReq,
      DynamoHttpServletResponse pRes, String pUrl, String pMessage)
      throws IOException {
    if (pUrl == null) {
      return;
    }
    if (pMessage != null) {
      pReq.setParameter(OUTPUT_ERROR_MESSAGE, pMessage);
      pReq.addQueryParameter(OUTPUT_ERROR_MESSAGE, pMessage);
    }
    if (URLUtils.isRelative(pUrl) == true) {
      pRes.sendLocalRedirect(pUrl, pReq);
    } else {
      if (isLoggingDebug())
        logDebug("redirect URL: " + pUrl);

      /**
       * If we are just switching protocols or if this is a URL which takes us
       * to an affiliated site, we encode the URL with the session id.
       **/
      pUrl = pRes.encodeRedirectURL(pUrl);
      if (isLoggingDebug())
        logDebug("redirect URL after possible encoding: " + pUrl);
       
      pRes.sendRedirect(pUrl);
    }
  }
}
