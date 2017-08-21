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

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import atg.commerce.order.CommerceItem;
import atg.commerce.order.Order;
import atg.commerce.pricing.ItemPriceInfo;
import atg.commerce.pricing.OrderPriceInfo;
import atg.commerce.pricing.OrderPricingEngineImpl;
import atg.commerce.pricing.PricingException;
import atg.core.util.StringUtils;
import atg.repository.RepositoryItem;
import atg.siebel.order.SiebelCommerceItem;

public class SiebelOrderPricingEngine extends OrderPricingEngineImpl {

  //-------------------------------------
  /** Class version string */

  public static String CLASS_VERSION = "$Id: //product/Siebel/version/11.2/src/atg/siebel/pricing/SiebelOrderPricingEngine.java#2 $$Change: 1194813 $";


  
  
  //-------------------------------------
  // property: includeMonthlyRecurringInTotal
  private boolean mIncludeMonthlyRecurringInTotal = false;
  
  public boolean getIncludeMonthlyRecurringInTotal()
  {
    return mIncludeMonthlyRecurringInTotal;
  }

  public void setIncludeMonthlyRecurringInTotal(boolean includeMonthlyRecurringInTotal)
  {
    mIncludeMonthlyRecurringInTotal = includeMonthlyRecurringInTotal;
  }

 
  
  
  // ----------------------------------------------------------------------------------
  // Methods
  // ----------------------------------------------------------------------------------  

  /*
   * (non-Javadoc)
   * @see atg.commerce.pricing.PricingEngine#getPricingModels(atg.repository.RepositoryItem)
   */
  @Override
  public Collection getPricingModels(RepositoryItem pProfile) {
    return null;
  }

  /*
   * (non-Javadoc)
   * @see atg.commerce.pricing.OrderPricingEngine#priceOrder(atg.commerce.order.Order, 
   *      java.util.Collection, java.util.Locale, atg.repository.RepositoryItem, java.util.Map)
   */
  @Override
  public OrderPriceInfo priceOrder(Order pOrder, Collection pPricingModels,
      Locale pLocale, RepositoryItem pProfile, Map pExtraParameters)
      throws PricingException {
    
  	//SiebelOrderPriceInfo newOrderPriceInfo = (SiebelOrderPriceInfo) createPriceInfo();
  	SiebelOrderPriceInfo newOrderPriceInfo = (SiebelOrderPriceInfo) super.priceOrder(
  			pOrder, pPricingModels, pLocale, pProfile, pExtraParameters);
  	
  	// Trying this to avoid the following errors during order validation
  	// in the submitOrder pipeline:-
  	// "The shipping costs have not been priced using the same currency as the order"
  	// "The tax has not been priced using the same currency as the order"
    List<CommerceItem> items = pOrder.getCommerceItems();
    if (items!=null  && !items.isEmpty()){
    	ItemPriceInfo itemPriceInfo = items.get(0).getPriceInfo();
    	if (itemPriceInfo != null) {
    		newOrderPriceInfo.setCurrencyCode(itemPriceInfo.getCurrencyCode());
    	}
    }
    
    // create order price info object
    
    List<RootCommerceItemPriceCalculator> calculators = 
        new ArrayList<RootCommerceItemPriceCalculator>();
    
    // loop through commerce items 
    
    @SuppressWarnings("unchecked")
    List<CommerceItem> commerceItems = pOrder.getCommerceItems();
    
    for (CommerceItem commerceItem : commerceItems)
    {     
      if (commerceItem instanceof SiebelCommerceItem)
      {
        calculators.add(
            new RootCommerceItemPriceCalculator(
                (SiebelCommerceItem) commerceItem));
      }
    }   
    
    populatelOrderPriceInfo(newOrderPriceInfo, calculators);
    
    return newOrderPriceInfo;
  }

  /**
   * @param pCalculators
   * @return
   * @throws PricingException
   */
  protected SiebelOrderPriceInfo createAndPopulatelOrderPriceInfo (
      List<RootCommerceItemPriceCalculator> pCalculators)
      throws PricingException {

    SiebelOrderPriceInfo orderPriceInfo = (SiebelOrderPriceInfo) createPriceInfo();

    populatelOrderPriceInfo(orderPriceInfo, pCalculators);

    return orderPriceInfo;
  }
  
  /**
   * @param pCalculators
   * @throws PricingException
   */
  protected void populatelOrderPriceInfo (
  		SiebelOrderPriceInfo pOrderPriceInfo,
      List<RootCommerceItemPriceCalculator> pCalculators)
      throws PricingException {

    for (RootCommerceItemPriceCalculator nextCalculator : pCalculators) {
      pOrderPriceInfo.setMonthlyRecurringPrice(pOrderPriceInfo
          .getMonthlyRecurringPrice() + nextCalculator.getRecurringPrice());
      pOrderPriceInfo.setNonRecurringPrice(pOrderPriceInfo
          .getNonRecurringPrice() + nextCalculator.getNonRecurringPrice());

      if (StringUtils.isEmpty(pOrderPriceInfo.getCurrencyCode())) {
        pOrderPriceInfo.setCurrencyCode(nextCalculator.getCurrencyCode());
      }
    }

    if (getIncludeMonthlyRecurringInTotal()) {
      // SIEBELINT-844 - Round off the amount to specified decimal places
      pOrderPriceInfo.setAmount(getPricingTools().round(
          pOrderPriceInfo.getNonRecurringPrice()
              + pOrderPriceInfo.getMonthlyRecurringPrice()));
    } else {
      pOrderPriceInfo.setAmount(getPricingTools().round(
          pOrderPriceInfo.getNonRecurringPrice()));
    }
  }
  
  /**
   * @param pCalculators
   * @return
   * @throws PricingException
   */
  protected double getOrderPriceAmount(
      List<RootCommerceItemPriceCalculator> pCalculators)
      throws PricingException {
    return createAndPopulatelOrderPriceInfo(pCalculators).getAmount();
  }
}
