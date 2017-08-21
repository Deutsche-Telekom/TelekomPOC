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

package atg.siebel.pricing;

import java.util.Iterator;
import java.util.List;

import atg.commerce.CommerceException;
import atg.repository.RepositoryItem;
import atg.siebel.catalog.SiebelCatalogTools;
import atg.siebel.order.SiebelCommerceItem;

public class RootCommerceItemPriceCalculator {

  //-------------------------------------
  /** Class version string */

  public static String CLASS_VERSION = "$Id: //product/Siebel/version/11.2/src/atg/siebel/pricing/RootCommerceItemPriceCalculator.java#2 $$Change: 1194813 $";


	// Store as pennies & compute decimals
  private int mRecurringPrice = 0;
  public double getRecurringPrice() {
    return mRecurringPrice/100.0;
  }

  //Store as pennies & compute decimals
  private int mNonRecurringPrice = 0;
  public double getNonRecurringPrice() {
    return mNonRecurringPrice/100.0;
  }
  
  //Store as pennies & compute decimals
  private int mAmount = 0;
  public double getAmount() {
    return mAmount/100.0;
  }
  
  public String getCurrencyCode() {
  	return mSiebelCommerceItem.getPriceInfo().getCurrencyCode();
  }
  
  private SiebelCommerceItem mSiebelCommerceItem = null;
  
  
  public RootCommerceItemPriceCalculator(SiebelCommerceItem pCommerceItem) {
    mSiebelCommerceItem = pCommerceItem;
    if (calculatePriceUsingChildItems()) {
      calculateCommerceItemPrice(pCommerceItem);
    } else {
      SiebelItemPriceInfo priceInfo = (SiebelItemPriceInfo) pCommerceItem.getPriceInfo();
      if (priceInfo != null) {
        mAmount = (int) Math.round(priceInfo.getAmount() * 100);
        mRecurringPrice = (int) Math.round(priceInfo.getMonthlyRecurringPrice() * 100);
        mNonRecurringPrice = (int) Math.round(priceInfo.getNonRecurringPrice() * 100);
      }
    }
  }
  
  /**
   * @return
   * @throws CommerceException
   */
  protected boolean calculatePriceUsingChildItems() {
    boolean calculateUsingChildItems = false;
    RepositoryItem productItem = (RepositoryItem) mSiebelCommerceItem
        .getAuxiliaryData().getProductRef();
    String productType = (String) productItem.getPropertyValue("siebelType");
    if (productType.equals(SiebelCatalogTools.M_CONFIGURABLE_PRODUCT)
        || productType.equals(SiebelCatalogTools.M_PROMOTION)) {
      calculateUsingChildItems = true;
    }
    return calculateUsingChildItems;
  }
  
  /**
   * @param pCommerceItem
   * @return
   */
  protected void calculateCommerceItemPrice(SiebelCommerceItem pCommerceItem) {

    SiebelItemPriceInfo priceInfo = (SiebelItemPriceInfo) pCommerceItem.getPriceInfo();
    if (priceInfo != null) {
      mAmount += (int) Math.round(priceInfo.getAmount() * 100);
      mRecurringPrice += (int) Math.round(priceInfo.getMonthlyRecurringPrice() * 100);
      mNonRecurringPrice += (int) Math.round(priceInfo.getNonRecurringPrice() * 100);
    }
    List childCommerceItems = pCommerceItem.getCommerceItems();
    if (childCommerceItems != null && !childCommerceItems.isEmpty()) {
      Iterator iter = childCommerceItems.iterator();
      while (iter.hasNext()) {
        SiebelCommerceItem nextCommerceItem = (SiebelCommerceItem) iter.next();
        calculateCommerceItemPrice(nextCommerceItem);
      }
    }

  }
  
}