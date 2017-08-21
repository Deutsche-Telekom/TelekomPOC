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

import javax.servlet.ServletException;

import atg.servlet.DynamoHttpServletRequest;
import atg.servlet.DynamoHttpServletResponse;
import atg.servlet.DynamoServlet;
import atg.siebel.configurator.ConfiguratorException;
import atg.siebel.configurator.Constants;
import atg.siebel.configurator.PromotionConfigInstance;
import atg.siebel.configurator.RootProductConfigInstance;
import atg.siebel.configurator.Constants.ProductConfigInstanceStatus;
import atg.siebel.configurator.spu.StructuredProductUIException;
import atg.siebel.configurator.ui.UIManager;
import atg.siebel.configurator.ui.UINodeWrapper;

/**
 * Gets the product key from the product in a promotion at index supplied
 * 
 * @author gamcdowe
 * 
 */
public class GetNextProductKeyDroplet extends DynamoServlet {
  // -------------------------------------
  /** Class version string */
  public static final String CLASS_VERSION = "$Id: //product/Siebel/version/11.2/src/atg/siebel/configurator/droplet/GetNextProductKeyDroplet.java#2 $$Change: 1194813 $";

  public static final String INPUT_COMMERCE_ITEM_PARAM = "commerceItemId";
  public static final String INDEX_PARAM = "index";

  // OUTPUT PARAMS
  public static final String OUTPUT_KEY = "key";
  public static final String OUTPUT_END_CONFIG = "endConfig";

  // OPARAMS
  public static final String OPARAM_OUTPUT = "output";

  // -------------------------------------
  // Properties
  // -------------------------------------
  // -------------------------------------
  // property: UIManager
  protected UIManager mUIManager;

  public UIManager getUiManager() {
    return mUIManager;
  }

  public void setUiManager(UIManager pUIManager) {
    mUIManager = pUIManager;
  }

  // property: isShowingNonConfigurableProducts. If set, skips the non
  // configurable root products
  // and increments the index accordingly
  protected boolean mIsShowingNonConfigurableProducts = false;

  public void setIsShowingNonConfigurableProducts(
      boolean pIsShowingNonConfigurableProducts) {
    mIsShowingNonConfigurableProducts = pIsShowingNonConfigurableProducts;
  }

  public boolean IsShowingNonConfigurableProducts() {
    return mIsShowingNonConfigurableProducts;
  }

  /** {@inheritDoc} */
  @Override
  public void service(DynamoHttpServletRequest req,
      DynamoHttpServletResponse res) throws ServletException, IOException {

    String commerceItemId = req.getParameter(INPUT_COMMERCE_ITEM_PARAM);

    if (commerceItemId == null) {
      throw new ServletException("Null commerceItemId");
    }

    String indexString = req.getParameter(INDEX_PARAM);
    int index = 0;

    if (indexString != null) {
      index = Integer.parseInt(indexString);
    }

    String key = null;
    String endConfig = "false";

    // get the promotion
    PromotionConfigInstance promo = (PromotionConfigInstance) getUiManager()
        .getInstance(commerceItemId);

    if (promo == null) {
      throw new ServletException("No promotion found for commerceItemId: "
          + commerceItemId);
    }

    RootProductConfigInstance product = null;

    while (index < promo.getRootProductSize()) {

      // check to see if we're showing non configurable products
      product = (RootProductConfigInstance) promo.getRootProducts().get(index);
      // IN ABO, simple product with attributes also needs to go through the
      // configurations
      if (getUiManager().getConfiguratorTools()
          .isConfigurableViaSiebelWebservice(product.getType(), true,
              promo.isABO())
          && !IsShowingNonConfigurableProducts()
          && !(!promo.isABO() && product.getType().equals(
              Constants.PROD_TYPE_SIMPLE_WITH_ATTRIBUTES))) {

        try {
          // set it up anyway
          if (!product.getStatus().equals(
              ProductConfigInstanceStatus.INITIALISED)) {
            getUiManager().beginConfiguration(commerceItemId, index);
          }
          // Removing end configuration from here, as it is already handled in
          // navigations.jsp
          // getUiManager().endConfiguration(commerceItemId, index);

        } catch (StructuredProductUIException spue) {
          throw new ServletException(spue);
        }
        // If the commerce item is deleted do not show the UI and process the
        // next product
        if (product.isCommerceItemDeleted(product)) {
          // increment the index
          index++;
          continue;
        } else {
          break;
        }
      } else {
        break;
      }

    }
    // get the root product at index
    key = product.getKey().toString();

    if (index == promo.getRootProductSize() - 1) {
      endConfig = "true";
    }

    req.setParameter(OUTPUT_KEY, key);
    req.setParameter(OUTPUT_END_CONFIG, endConfig);
    req.setParameter(INDEX_PARAM, index);
    req.serviceParameter(OPARAM_OUTPUT, req, res);
  }
}
