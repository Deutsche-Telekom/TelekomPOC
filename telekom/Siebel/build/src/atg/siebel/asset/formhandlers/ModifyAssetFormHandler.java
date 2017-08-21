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

package atg.siebel.asset.formhandlers;

import java.io.IOException;

import javax.servlet.ServletException;

import atg.commerce.order.Order;
import atg.commerce.order.OrderHolder;
import atg.droplet.DropletException;
import atg.droplet.GenericFormHandler;
import atg.servlet.DynamoHttpServletRequest;
import atg.servlet.DynamoHttpServletResponse;
import atg.siebel.asset.SiebelAssetManager;
import atg.siebel.configurator.BaseConfigInstance;
import atg.siebel.configurator.ui.UIManager;
import atg.siebel.order.SiebelCommerceItem;
import atg.siebel.order.SiebelOrderImpl;

import com.siebel.ordermanagement.quote.data.Quote;

/**
 * ModifyAssetFormHandler : Form handler for Asset modifications
 * 
 * @author kalkarri
 * 
 */
public class ModifyAssetFormHandler extends GenericFormHandler {

  //-------------------------------------
  /** Class version string */

  public static String CLASS_VERSION = "$Id: //product/Siebel/version/11.2/src/atg/siebel/asset/formhandlers/ModifyAssetFormHandler.java#2 $$Change: 1194813 $";


	// Asset Number
	private String mAssetNumber;

	public String getAssetNumber() {
		return mAssetNumber;
	}

	public void setAssetNumber(String assetId) {
		this.mAssetNumber = assetId;
	}

	// UI Manager
	private UIManager mUIManager;

	public UIManager getUiManager() {
		return mUIManager;
	}

	public void setUiManager(UIManager pUIManager) {
		mUIManager = pUIManager;
	}

	// Siebel Asset Manager
	private SiebelAssetManager mSblAssetManager;

	public SiebelAssetManager getSiebelAssetManager() {
		return mSblAssetManager;
	}

	public void setSiebelAssetManager(SiebelAssetManager pSblAssetManager) {
		this.mSblAssetManager = pSblAssetManager;
	}

	// error URL
	private String mErrorURL;

	public String getErrorURL() {
		return mErrorURL;
	}

	public void setErrorURL(String errorURL) {
		this.mErrorURL = errorURL;
	}

	// Shopping cart
	private OrderHolder mShoppingCart;

	public OrderHolder getShoppingCart() {
		return mShoppingCart;
	}

	public void setShoppingCart(OrderHolder pShoppingCart) {
		mShoppingCart = pShoppingCart;
	}

	/**
	 * Method to handle asset modifications.
	 * 
	 * @param pRequest
	 * @param pResponse
	 * @return
	 * @throws ServletException
	 * @throws IOException
	 */

	public boolean handleModifyAsset(DynamoHttpServletRequest pRequest,
			DynamoHttpServletResponse pResponse) throws ServletException, IOException {
		
		vlogDebug("ModifyAsset called for assetNumber {0}", getAssetNumber());

		String successURL = null;
		try {
			preModifyAsset(pRequest, pResponse);
			
			// Check is there is already a cart item for the same asset, if yes
		      // display the error message
		      String aboApplicability = getSiebelAssetManager().checkAboapplicability(
		          getAssetNumber());
		      if (aboApplicability != null) {
		        throw new DropletException(aboApplicability);
		      }
			
			// modify asset
			successURL = getSiebelAssetManager().modifyAsset(getShoppingCart(), getAssetNumber(), getUiManager());
			
			postModifyAsset(pRequest, pResponse);

		} catch (Exception e) {
			vlogError(e, "Exception during modify asset process for asset {0}",
					getAssetNumber());
			addFormException(new DropletException(e.getMessage()));
		}
		return checkFormRedirect(successURL, mErrorURL, pRequest, pResponse);
	}
	
  /**
   * Called before any work is done by the handleModifyAsset method.  It currently
   * does nothing.
   *
   * @param pRequest the request object
   * @param pResponse the response object
   * @exception ServletException if an error occurs
   * @exception IOException if an error occurs
   */
  public void preModifyAsset(DynamoHttpServletRequest pRequest,
                                DynamoHttpServletResponse pResponse)
    throws ServletException, IOException
  {
  }
  
  /**
   * Called after all work is done by the handleModifyAsset method.  It currently
   * does nothing.
   *
   * @param pRequest the request object
   * @param pResponse the response object
   * @exception ServletException if an error occurs
   * @exception IOException if an error occurs
   */
  public void postModifyAsset(DynamoHttpServletRequest pRequest,
                                 DynamoHttpServletResponse pResponse)
    throws ServletException, IOException
  {
  }

}
