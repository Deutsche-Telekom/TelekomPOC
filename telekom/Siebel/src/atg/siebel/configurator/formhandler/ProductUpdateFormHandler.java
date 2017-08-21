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
import java.util.ResourceBundle;

import javax.servlet.ServletException;

import atg.core.i18n.LayeredResourceBundle;
import atg.repository.servlet.RepositoryFormHandler;
import atg.servlet.DynamoHttpServletRequest;
import atg.servlet.DynamoHttpServletResponse;
import atg.siebel.configurator.BaseConfigInstance;
import atg.siebel.configurator.spu.StructuredProductUIException;
import atg.siebel.configurator.ui.UIManager;

/**
 * @author gmdowell
 * 
 * Form Handler to handle updates to a product from the UI
 *
 */

public class ProductUpdateFormHandler extends RepositoryFormHandler {
	
	//-------------------------------------
	/** Class version string */
	public static final String CLASS_VERSION = "$Id: //product/Siebel/version/11.2/src/atg/siebel/configurator/formhandler/ProductUpdateFormHandler.java#2 $$Change: 1194813 $";

  //ResourceBundle Name
  private static final String SIEBEL_RESOURCE_BUNDLE_NAME = "atg.siebel.WebAppResources";
  
  private static final String COMMERCE_ITEM_ALREADY_CONFIGURED = "commerceItemAlreadyConfigured";
  
  //ResourceBundle
  private static ResourceBundle sResourceBundle = LayeredResourceBundle.getBundle(SIEBEL_RESOURCE_BUNDLE_NAME, atg.service.dynamo.LangLicense.getLicensedDefault());
	
	//---------------------------------------
	// property: UpdateSuccessURL
	String mUpdateSuccessURL;
	public void setUpdateSuccessURL(String pUpdateSuccessURL) {
		mUpdateSuccessURL = pUpdateSuccessURL;
	}
	/**
	 * @return
	 */
	public String getUpdateSuccessURL() {
		return mUpdateSuccessURL;
	}
	
	
	//-------------------------------------
	// property: nodeValue
	protected String mNodeValue;

	public String getNodeValue() {
		return mNodeValue;
	}

	public void setNodeValue(String pNodeValue) {
		this.mNodeValue = pNodeValue;
	}
	
	//-------------------------------------
	// property: index
	protected int mIndex = 0;

	public int getIndex() {
		return mIndex;
	}

	public void setIndex(int pIndex) {
		this.mIndex = pIndex;
	}
	
	//-------------------------------------
	// property: key
	protected String mKey;

	public String getKey() {
		return mKey;
	}

	public void setKey(String pKey) {
		mKey = pKey;
	}
	
	
	//-------------------------------------
	// property: UIManager
	protected UIManager mUIManager;
	public UIManager getUiManager() {
		return mUIManager;
	}
	public void setUiManager(UIManager pUIManager) {
		mUIManager = pUIManager;
	}
	

	/**
	 * called from the product update form. updates the node at mIndex with mNodeValue
	 * 
	 * @param pRequest
	 * @param pResponse
	 * @return
	 * @throws ServletException
	 * @throws IOException
	 */
	public boolean handleUpdateUINodeByIndex(DynamoHttpServletRequest pRequest, DynamoHttpServletResponse pResponse)
			throws ServletException, IOException 
	{
		
		
    /*
     * SIEBELINT-914 : Check if this item has been already configured and
     * checked out(another tab of same browser), in which case the user should
     * be redirected back to configuration page
     */
    BaseConfigInstance pci = getUiManager().getConfiguratorTools()
        .getProductConfigInstanceCache().getInstance(getKey());
    boolean returnValue = false;
    if (pci == null) {
      getFormExceptions()
          .add(new Exception(sResourceBundle.getString(COMMERCE_ITEM_ALREADY_CONFIGURED)));
      checkFormError(getUpdateErrorURL(), pRequest, pResponse);
      returnValue = false;
    } else {
		try {
			mUIManager.updateNode(getNodeValue(), getIndex(), getKey());
		} catch (StructuredProductUIException e) {
			throw new ServletException(e);
		}
		
      returnValue = checkFormSuccess(getUpdateSuccessURL(), pRequest, pResponse);
	}
    return returnValue;
  }
	
	/**
	 * @param pRequest
	 * @param pResponse
	 * @return
	 * @throws ServletException
	 * @throws IOException
	 */
	public boolean handleDeleteSelectedproducts(DynamoHttpServletRequest pRequest, DynamoHttpServletResponse pResponse)
	    throws ServletException, IOException 
	{
    /*
     * SIEBELINT-914 : Check if this item has been already configured and
     * checked out(another tab of same browser), in which case the user should
     * be redirected back to configuration page
     */
    boolean returnValue = false;
    BaseConfigInstance pci = getUiManager().getConfiguratorTools()
        .getProductConfigInstanceCache().getInstance(getKey());
    if (pci == null) {
      getFormExceptions()
          .add(new Exception(sResourceBundle.getString(COMMERCE_ITEM_ALREADY_CONFIGURED)));
      checkFormError(getUpdateErrorURL(), pRequest, pResponse);
      returnValue = false;
    } else {

		try {
			mUIManager.deleteProduct(getKey(), getIndex());
		} catch (StructuredProductUIException e) {
			throw new ServletException(e);
		}

      returnValue = checkFormSuccess(getUpdateSuccessURL(), pRequest, pResponse);
	}
    return returnValue;
  }

}