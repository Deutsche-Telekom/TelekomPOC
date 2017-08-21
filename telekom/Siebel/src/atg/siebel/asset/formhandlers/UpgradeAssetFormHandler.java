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
import atg.commerce.order.OrderHolder;
import atg.droplet.DropletException;
import atg.droplet.GenericFormHandler;
import atg.repository.RepositoryItem;
import atg.servlet.DynamoHttpServletRequest;
import atg.servlet.DynamoHttpServletResponse;
import atg.servlet.ServletUtil;
import atg.siebel.asset.SiebelAssetManager;
import atg.siebel.configurator.ui.UIManager;

/**
 * UpgradeAssetFormHandler : Form handler for Asset upgradation
 * 
 * @author shaikuku
 * @created $DateTime: 2015/09/10 08:26:24 $$Author: saysyed $
 * @version $Id: //product/Siebel/main/src/atg/siebel/asset/formhandlers/
 *          SiebelAccountCreationFormHandler.java#1 $$Change: 1194813 $
 * 
 */
public class UpgradeAssetFormHandler extends GenericFormHandler {

  /** Class version string */
  public static String CLASS_VERSION = "$Id: //product/Siebel/version/11.2/src/atg/siebel/asset/formhandlers/UpgradeAssetFormHandler.java#2 $$Change: 1194813 $";

  // Asset Number
  private String mAssetNumber;

  /**
   * 
   * @return assetNumber
   */
  public String getAssetNumber() {
    return mAssetNumber;
  }

  /**
   * 
   * @param assetId
   */
  public void setAssetNumber(String pAssetId) {
    this.mAssetNumber = pAssetId;
  }

  // New ProductId
  private String mNewProductId;

  /**
   * 
   * @return newProductId
   */
  public String getNewProductId() {
    return mNewProductId;
  }

  /**
   * 
   * @param newProductId
   */
  public void setNewProductId(String pNewProductId) {
    this.mNewProductId = pNewProductId;
  }

  // UI Manager
  private UIManager mUIManager;

  /**
   * 
   * @return UIManager
   */
  public UIManager getUiManager() {
    return mUIManager;
  }

  /**
   * 
   * @param UIManager
   */
  public void setUiManager(UIManager pUIManager) {
    mUIManager = pUIManager;
  }

  // Siebel Asset Manager
  private SiebelAssetManager mSblAssetManager;

  /**
   * 
   * @return SiebelAssetManager
   */
  public SiebelAssetManager getSiebelAssetManager() {
    return mSblAssetManager;
  }

  /**
   * 
   * @param SiebelAssetManager
   */
  public void setSiebelAssetManager(SiebelAssetManager pSblAssetManager) {
    this.mSblAssetManager = pSblAssetManager;
  }

  // error URL
  private String mErrorURL;

  /**
   * 
   * @return errorURL
   */
  public String getErrorURL() {
    return mErrorURL;
  }

  /**
   * 
   * @param errorURL
   */
  public void setErrorURL(String pErrorURL) {
    this.mErrorURL = pErrorURL;
  }

  // ProfilePropertySiebelAccountId
  private String mProfilePropertySiebelAccountId;

  /**
   * @return profilePropertySiebelAccountId
   */
  public String getProfilePropertySiebelAccountId() {
    return mProfilePropertySiebelAccountId;
  }

  /**
   * @param pProfileSiebelAccountId
   */
  public void setProfilePropertySiebelAccountId(
      String pProfilePropertySiebelAccountId) {
    this.mProfilePropertySiebelAccountId = pProfilePropertySiebelAccountId;
  }

  // Shopping cart
  private OrderHolder mShoppingCart;

  /**
   * 
   * @return ShoppingCart
   */
  public OrderHolder getShoppingCart() {
    return mShoppingCart;
  }

  /**
   * 
   * @param ShoppingCart
   */
  public void setShoppingCart(OrderHolder pShoppingCart) {
    mShoppingCart = pShoppingCart;
  }

  /**
   * Handler Method to handle asset Upgradation.
   * 
   * @param pRequest
   * @param pResponse
   * @return
   * @throws ServletException
   * @throws IOException
   */

  public boolean handleUpgradeAsset(DynamoHttpServletRequest pRequest,
      DynamoHttpServletResponse pResponse) throws ServletException, IOException {

    if (isLoggingDebug()) {
      vlogDebug("ModifyAsset called for assetNumber {0}", getAssetNumber());
    }

    String successURL = null;
    RepositoryItem profile = ServletUtil.getCurrentUserProfile();

    try {
      preUpgradeAsset(pRequest, pResponse);
      // Check is there is already a cart item for the same asset, if yes
      // display the error message
      String aboApplicability = getSiebelAssetManager().checkAboapplicability(
          getAssetNumber());
      if (aboApplicability != null) {
        throw new DropletException(aboApplicability);
      }
      // upgrade asset
      successURL = getSiebelAssetManager().upgradeAsset(
          getShoppingCart(),
          getAssetNumber(),
          getNewProductId(),
          getUiManager(),
          (String) profile
              .getPropertyValue(getProfilePropertySiebelAccountId()));

      postUpgradeAsset(pRequest, pResponse);

    } catch (Exception e) {
      if (isLoggingError()) {
        vlogError(e, "Exception during Upgrade asset process for asset {0}",
            getAssetNumber());
      }

      if (isLoggingDebug()) {
        vlogDebug(e, "Exception during Upgrade asset process for asset {0}",
            getAssetNumber());
      }
      addFormException(new DropletException(e.getMessage()));
    }
    return checkFormRedirect(successURL, mErrorURL, pRequest, pResponse);
  }

  /**
   * Called before any work is done by the handleUpgradeAsset method. It
   * currently does nothing.
   * 
   * @param pRequest
   *          the request object
   * @param pResponse
   *          the response object
   * @exception ServletException
   *              if an error occurs
   * @exception IOException
   *              if an error occurs
   */
  public void preUpgradeAsset(DynamoHttpServletRequest pRequest,
      DynamoHttpServletResponse pResponse) throws ServletException, IOException {
  }

  /**
   * Called after all work is done by the handleUpgradeAsset method. It
   * currently does nothing.
   * 
   * @param pRequest
   *          the request object
   * @param pResponse
   *          the response object
   * @exception ServletException
   *              if an error occurs
   * @exception IOException
   *              if an error occurs
   */
  public void postUpgradeAsset(DynamoHttpServletRequest pRequest,
      DynamoHttpServletResponse pResponse) throws ServletException, IOException {
  }

}