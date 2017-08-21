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

package atg.siebel.configurator.test;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;

import atg.commerce.catalog.CatalogTools;
import atg.commerce.order.purchase.CartModifierFormHandler;
import atg.droplet.GenericFormHandler;
import atg.repository.RepositoryException;
import atg.repository.RepositoryItem;
import atg.servlet.DynamoHttpServletRequest;
import atg.servlet.DynamoHttpServletResponse;

public class TestCartModifierFormHandler extends GenericFormHandler {

  //-------------------------------------
  /** Class version string */

  public static String CLASS_VERSION = "$Id: //product/Siebel/version/11.2/src/atg/siebel/configurator/test/TestCartModifierFormHandler.java#2 $$Change: 1194813 $";


  // --------- Property: productId --------------
  String mProductId;

  public String getProductId() {
    return mProductId;
  }

  public void setProductId(String pProductId) {
    mProductId = pProductId;
  }

  // --------- Property: catalogTools -----------
  protected CatalogTools mCatalogTools;

  public void setCatalogTools(CatalogTools pCatalogTools) {
    mCatalogTools = pCatalogTools;
  }

  public CatalogTools getCatalogTools() {
    return mCatalogTools;
  }

  // --------- Property: cartModifierFormHandler -----------
  protected CartModifierFormHandler mCartModifierFormHandler;

  public void setCartModifierFormHandler(
      CartModifierFormHandler pCartModifierFormHandler) {
    mCartModifierFormHandler = pCartModifierFormHandler;
  }

  public CartModifierFormHandler getCartModifierFormHandler() {
    return mCartModifierFormHandler;
  }

  public boolean handleAddItemToOrder(DynamoHttpServletRequest pRequest,
      DynamoHttpServletResponse pResponse) throws ServletException, IOException {

    String productId = getProductId();
    String[] skuIds = null;

    if (productId == null) {
      setProductId("");
      return true;
    }
    try {
      RepositoryItem productItem = getCatalogTools().findProduct(productId);
      if (productItem == null) {
        setProductId("");
        return true;
      }
      List skus = (List) productItem.getPropertyValue("childSKUs");
      if (skus != null && !skus.isEmpty()) {
        RepositoryItem sku = (RepositoryItem) skus.get(0);
        skuIds = new String[1];
        skuIds[0] = sku.getRepositoryId();
      } else {
        setProductId("");
        return true;
      }
    } catch (RepositoryException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
      setProductId("");
      return true;
    }

    // String[] productArray = new String[] { productId };
    getCartModifierFormHandler().setCatalogRefIds(skuIds);
    getCartModifierFormHandler().setProductId(productId);
    return getCartModifierFormHandler().handleAddItemToOrder(pRequest, pResponse);
  }

}
