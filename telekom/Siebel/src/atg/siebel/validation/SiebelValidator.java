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

package atg.siebel.validation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import atg.beans.PropertyNotFoundException;
import atg.repository.RepositoryException;
import atg.repository.RepositoryItem;
import atg.servlet.ServletUtil;
import atg.siebel.catalog.SiebelCatalogProduct;
import atg.siebel.catalog.SiebelCatalogRelationship;
import atg.siebel.catalog.SiebelCatalogTools;
import atg.siebel.configurator.BaseConfigInstance;
import atg.siebel.configurator.Constants;
import atg.siebel.configurator.PromotionConfigInstance;
import atg.siebel.configurator.RootProductConfigInstance;
import atg.siebel.configurator.spu.ProductUI;
import atg.siebel.configurator.spu.StructuredProductUIException;
import atg.siebel.configurator.ui.UIManager;
import atg.siebel.configurator.ui.UINodeGeneratorService;

/**
 * This class contains the validation methods
 * 
 * @author shaikuku
 * 
 */

public class SiebelValidator {
  
  // ----------------------------------------------------------------------------------
  // Class version string
  // ----------------------------------------------------------------------------------
  
  public static String CLASS_VERSION = "$Id: //product/Siebel/version/11.2/src/atg/siebel/validation/SiebelValidator.java#2 $$Change: 1194813 $";
  
  // ----------------------------------------------------------------------------------
  // properties
  // ----------------------------------------------------------------------------------
  
  // property: mSiebelCatalogTools
  
  private SiebelCatalogTools mSiebelCatalogTools;
  
  /**
   * 
   * @return a <code>SiebelCatalogTools</code> value
   */
  public SiebelCatalogTools getSiebelCatalogTools() {
    return mSiebelCatalogTools;
  }
  
  /**
   * 
   * @param pSiebelCatalogTools a <code>SiebelCatalogTools</code> value
   */
  public void setSiebelCatalogTools(SiebelCatalogTools pSiebelCatalogTools) {
    this.mSiebelCatalogTools = pSiebelCatalogTools;
  }
  
  // property: uiManager  
  private UIManager mUiManager;
  
  /**
   * 
   * @return a <code>UIManager</code> value
   */
  public UIManager getUiManager() {
    return mUiManager;
  }
  
  /**
   * 
   * @param pUiManager a <code>UIManager</code> value
   */
  public void setUiManager(UIManager pUiManager) {
    this.mUiManager = pUiManager;
  }
  

  private UINodeGeneratorService mUINodeGeneratorService;

  public UINodeGeneratorService getUiNodeGeneratorService() {
    return mUINodeGeneratorService;
  }

  public void setUiNodeGeneratorService(UINodeGeneratorService pUINodeGeneratorService) {
    mUINodeGeneratorService = pUINodeGeneratorService;
  }
  

  
  /**
   * checks the eligibility of a product against 
   * profile properties(for logged in user) 
   * postal code(for anonymous user)
   * 
   * @param pProductId a <code>String</code> value
   * @param pPostalCode a <code>String</code> value
   * @return a <code>HashMap</code> value
   * @throws RepositoryException
   * @throws Exception
   */
  public Map<String, String> validateProductEligibility(String pProductId,
      String pPostalCode) throws RepositoryException, Exception {
    
    List<String> productList = new ArrayList<String>();
    productList.add(pProductId);
    RepositoryItem profile = ServletUtil.getCurrentUserProfile();
    
    if (profile != null && !profile.isTransient()) {// for logged in user
      return getSiebelCatalogTools().checkProductEligibility(productList);
    } else {// for anonymous user
      Map<String, String> userProperties = new HashMap<String, String>();
      if (pPostalCode != null && !("".equals(pPostalCode))) {
        userProperties.put(getSiebelCatalogTools().getEligAndCompPropertyZip(),
            pPostalCode);
      }
      
      return getSiebelCatalogTools().checkProductEligibility(userProperties,
          productList);
    }
    
  }
  

  /**
   * 
   * @param pProductList a <code>ArrayList</code> value
   * @return a <code>HashMap</code> value
   * @throws RepositoryException
   * @throws Exception
   */
  public Map<String, String> validateProductsCompatibility(
      List<String> pProductList) throws RepositoryException, Exception {
    
    return getSiebelCatalogTools().checkProductEligibilityCompatability(
        pProductList);
  }
  
  /**
   * Method to check if Product UI is found in repository or not
   * 
   * @param pProductId
   * @param pPromotionId
   * @return
   * @throws StructuredProductUIException
   * @throws PropertyNotFoundException
   * @throws RepositoryException
   */
  public boolean isProductUIFound(String pProductId, String pPromotionId)
      throws RepositoryException, PropertyNotFoundException {
    // Check if UI check required
    boolean isUIFound = true;
    try {
      SiebelCatalogProduct product = ((SiebelCatalogTools) getSiebelCatalogTools())
          .getProductDetails(pProductId);
      // For Promotion, Check for all the root products
      if (product.getProductType().equalsIgnoreCase(
          Constants.PROD_TYPE_PROMOTION)) {
        pPromotionId = pProductId;
        Set<SiebelCatalogRelationship> relationships = product
            .getChildRelationships();
        for (SiebelCatalogRelationship relationship : relationships) {
          Set<SiebelCatalogProduct> rootProducts = relationship
              .getChildProducts();
          for (SiebelCatalogProduct childProduct : rootProducts) {
            String prodId = childProduct.getId();
            getUiManager().getSpuTools().getProductUI(prodId, pPromotionId);
          }
        }
      } else {
        getUiManager().getSpuTools().getProductUI(pProductId, pPromotionId);
      }
    } catch (StructuredProductUIException e) {
      isUIFound = false;
    }
    return isUIFound;
  }

  /**
   * Method to check if product Ui is found with data from Product instance
   * 
   * @param pInstance
   *          - instance of BaseConfigInstance
   * @return true if Ui is found false if UI not found
   */
  public boolean isProductUIFoundFromInstance(BaseConfigInstance pInstance) {
    String productId = null;
    // Check if UI check required
    boolean isUIFound = true;
    try {
      // For Promotion check for all root products
      if (pInstance instanceof PromotionConfigInstance) {
        PromotionConfigInstance promo = (PromotionConfigInstance) pInstance;
        String promotionId = promo.getProductId();
        List<RootProductConfigInstance> rootProducts = promo.getRootProducts();
        for (RootProductConfigInstance rootProd : rootProducts) {
          productId = rootProd.getProductId();
          getUiManager().getSpuTools().getProductUI(productId, promotionId);
        }
      } else {
        // For other products check if the UI is found for the specified
        // product
        RootProductConfigInstance prodInstance = (RootProductConfigInstance) pInstance;
        productId = prodInstance.getProductId();
        getUiManager().getSpuTools().getProductUI(productId, null);//check if all the products are present
        
        //check whether all the relationships are present
        String promoID = prodInstance.getPromotionInstance()!=null?prodInstance.getPromotionInstance().getProductId():null;
        ProductUI uiTemplate = getUiManager().getSpuTools().getProductUI(prodInstance.getProductId(), promoID);
        isUIFound = getUiNodeGeneratorService().checkRelationshipsInSpu(prodInstance, uiTemplate);
      }
    } catch (StructuredProductUIException e) {
      e.printStackTrace();
      isUIFound = false;
    }
    return isUIFound;
  }
}
