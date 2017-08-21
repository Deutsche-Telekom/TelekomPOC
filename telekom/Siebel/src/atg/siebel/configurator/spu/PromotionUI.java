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

package atg.siebel.configurator.spu;

import java.util.ArrayList;

import atg.repository.RepositoryItem;

/**
 * This class represents the UI configuration for a promotion.
 *
 * @author Patrick Mc Erlean
 * @version $Id: //product/Siebel/version/11.2/src/atg/siebel/configurator/spu/PromotionUI.java#2 $$Change: 1194813 $
 * @updated $DateTime: 2015/09/10 08:26:24 $$Author: saysyed $
 */

public class PromotionUI
{
  //----------------------------------------------------------------------------------
  // Class version string
  //----------------------------------------------------------------------------------

  public static String CLASS_VERSION = "$Id: //product/Siebel/version/11.2/src/atg/siebel/configurator/spu/PromotionUI.java#2 $$Change: 1194813 $";

  //----------------------------------------------------------------------------------
  // Constants
  //----------------------------------------------------------------------------------

  //----------------------------------------------------------------------------------
  // Member Variables
  //----------------------------------------------------------------------------------

  //----------------------------------------------------------------------------------
  // Properties
  //----------------------------------------------------------------------------------

  //----------------------------------------------------------------------------------
  // property: promotionUIRepositoryItem

  private RepositoryItem mPromotionUIRepositoryItem = null;

  /**
   * Returns the promotion UI repository item
   *
   * @return the promotion UI repository item
   */

  public RepositoryItem getPromotionUIRepositoryItem()
  {
    return mPromotionUIRepositoryItem;
  }

  /**
   * Sets the promotion UI repository item
   *
   * @param pPromotionUIRepositoryItem the repository item to set
   */

  public void setPromotionUIRepositoryItem (RepositoryItem pPromotionUIRepositoryItem)
  {
    mPromotionUIRepositoryItem = pPromotionUIRepositoryItem;
  }
  
  //----------------------------------------------------------------------------------
  // property: Id 
  // (This is distinct from promotionId as it is made of promotionId with "-promoui" appended)
  
  private String mId;

  /**
   * Returns the id.
   *
   * @return the id of the PromotionUI.
   */

  public String getId()
  {
    return mId;
  }

  /**
   * Sets the id.
   *
   * @param pId the id of the PromotionUI.
   */

  public void setId (String pId)
  {
    mId = pId;
  }

  //----------------------------------------------------------------------------------
  // property: promotionId
  // (This is distinct from Id as it is a subset of that property, Id will have "-promoui" appended)

  private String mPromotionId;

  /**
   * Returns the promotion id.
   *
   * @return the id of the promotion.
   */

  public String getPromotionId()
  {
    return mPromotionId;
  }

  /**
   * Sets the promotion id.
   *
   * @param pPromotionId the id of the promotion.
   */

  public void setPromotionId (String pPromotionId)
  {
    mPromotionId = pPromotionId;
  }

  //----------------------------------------------------------------------------------
  // property: name

  private String mName;

  /**
   * Returns the promotion name.
   *
   * @return the name of the promotion.
   */

  public String getName()
  {
    return mName;
  }

  /**
   * Sets the promotion name.
   *
   * @param pName the name of the promotion.
   */

  public void setName (String pName)
  {
    mName = pName;
  }

  //----------------------------------------------------------------------------------
  // property: controller

  private Renderer mController;

  /**
   * Returns the controller.
   *
   * @return a Renderer representing the controller.
   */

  public Renderer getController()
  {
    return mController;
  }

  /**
   * Sets the controller.
   *
   * @param pController the name of the controller.
   */

  public void setController (Renderer pController)
  {
    mController = pController;
  }
  
  //----------------------------------------------------------------------------------
  // property: cssPath

  private String mCssPath;

  /**
   * Returns the css file path.
   *
   * @return the css file path.
   */

  public String getCssPath()
  {
    return mCssPath;
  }

  /**
   * Sets the css file path.
   *
   * @param pCssPath the css file path.
   */

  public void setCssPath (String pCssPath)
  {
    mCssPath = pCssPath;
  }

  //----------------------------------------------------------------------------------
  // property: rootProducts

  private ArrayList<String> mRootProducts;

  /**
   * Returns the promotion's root products in the order they should be rendered.
   *
   * @return a ArrayList with the products of the root products.
   */

  public ArrayList<String> getRootProducts()
  {
    if (mRootProducts == null)
    {
      mRootProducts = new ArrayList<String>();
    }

    return mRootProducts;
  }

  /**
   * Sets the promotion's root products list.
   *
   * @param pRootProducts the list of root products
   */

  public void setRootProducts (ArrayList<String> pRootProducts)
  {
    mRootProducts = pRootProducts;
  }
}
