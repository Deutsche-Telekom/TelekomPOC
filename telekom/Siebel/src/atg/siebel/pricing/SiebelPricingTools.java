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
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import atg.commerce.CommerceException;
import atg.commerce.order.CommerceItem;
import atg.commerce.order.Order;
import atg.commerce.pricing.Constants;
import atg.commerce.pricing.GWPInfo;
import atg.commerce.pricing.ItemPriceInfo;
import atg.commerce.pricing.PricingContext;
import atg.commerce.pricing.PricingException;
import atg.commerce.pricing.PricingTools;
import atg.commerce.promotion.GWPManager;
import atg.commerce.promotion.GWPMultiHashKey;
import atg.repository.RepositoryItem;
import atg.service.perfmonitor.PerfStackMismatchException;
import atg.service.perfmonitor.PerformanceMonitor;
import atg.siebel.order.SiebelCommerceItem;

public class SiebelPricingTools extends PricingTools {

  //-------------------------------------
  /** Class version string */

  public static String CLASS_VERSION = "$Id: //product/Siebel/version/11.2/src/atg/siebel/pricing/SiebelPricingTools.java#2 $$Change: 1194813 $";

  
  private static final String PERFORM_MONITOR_NAME="PricingTools";
  
  /* (non-Javadoc)
   * @see atg.commerce.pricing.PricingTools#priceItemsForOrderTotal(atg.commerce.order.Order, java.util.Collection, java.util.Locale, atg.repository.RepositoryItem, java.util.Map, boolean)
   */
  protected double priceItemsForOrderTotal(Order pOrder,
      Collection pPricingModels,
      Locale pLocale,
      RepositoryItem pProfile,
      Map pExtraParameters,
      boolean pGenerateOrderRanges)
  throws PricingException
  {
    String perfName = "priceItemsForOrderTotal2";
    PerformanceMonitor.startOperation(PERFORM_MONITOR_NAME, perfName);
    boolean cancelPerfMonitor = false;

    synchronized (pOrder) {
      try {
        // make sure the ranges are in place
        if(pGenerateOrderRanges)
          getCommerceItemManager().generateRangesForOrder(pOrder);

        boolean restartPricing = false;
        double total = 0;
        do {
          total = 0;
          
  
          Map params = pExtraParameters;
          if(params == null)
            params = new HashMap();
          List infos = getItemPricingEngine().priceItems(pOrder.getCommerceItems(),
              pPricingModels,
              pLocale,
              pProfile,
              pOrder,
              params);
          if (infos != null) {           
            List<SiebelCommerceItem> flatListOfCommerceItems = new ArrayList<SiebelCommerceItem>();
            getAllCommerceItemsFromList(pOrder.getCommerceItems(), flatListOfCommerceItems);
            
            //int size = getCommerceItemCount(commerceItems);
            int size = flatListOfCommerceItems.size();
            if (isLoggingDebug()) {
              logDebug("commerceItem expanded list size == "+size);
              logDebug("infos list size == "+infos.size());
            }
            if (infos.size() != size)
              throw new PricingException(Constants.ITEM_PRICE_MISMATCH);
            for (int c=0; c<size; c++) {
              CommerceItem item = (CommerceItem)flatListOfCommerceItems.get(c);
              ItemPriceInfo info = (ItemPriceInfo)infos.get(c);
              ItemPriceInfo oldPriceInfo = item.getPriceInfo();
              item.setPriceInfo(info);
              if (isSendPromotionClosenessMessages())
                compareQualifiers(oldPriceInfo, info, pOrder, pProfile);            
            }
            List<RootCommerceItemPriceCalculator> calculators = new ArrayList<RootCommerceItemPriceCalculator>();
            Iterator iter = pOrder.getCommerceItems().iterator();
            while (iter.hasNext()) {
              SiebelCommerceItem nextCommerceItem = (SiebelCommerceItem) iter.next();
              RootCommerceItemPriceCalculator calculator = 
                  new RootCommerceItemPriceCalculator(nextCommerceItem);
              calculators.add(calculator);
            }
            total = ((SiebelOrderPricingEngine) getOrderPricingEngine()).getOrderPriceAmount(calculators);
          }
          GWPManager gwpManager = getGwpManager();
          if (gwpManager != null){
            Map<GWPMultiHashKey, GWPInfo> gwpInfos = (Map<GWPMultiHashKey, GWPInfo>)params.get(Constants.GWPINFOS_KEY);
            PricingContext pricingContext = getPricingContextFactory().createPricingContext(
                pOrder.getCommerceItems(), null, pProfile, pLocale, pOrder, null);
            restartPricing = getGwpManager().processGWPInfos(gwpInfos, pricingContext, params);
             
          }
          params.remove(Constants.GWPINFOS_KEY); 
        } while (restartPricing);
        return total;
      }
      catch (PricingException pe) {
        // Rethrow any pricing exception generated by priceItems
        cancelPerfMonitor = true;
        throw pe;
      }
      catch (CommerceException ce) {
        // Catch any commerce exception generated by getRangesForOrder
        cancelPerfMonitor = true;
        throw new PricingException(ce);
      }
      finally {
        if (pExtraParameters != null){
          pExtraParameters.remove(Constants.GWPINFOS_KEY);
        }
        
        try {
          if(cancelPerfMonitor)
            PerformanceMonitor.cancelOperation(PERFORM_MONITOR_NAME, perfName);
          else
            PerformanceMonitor.endOperation(PERFORM_MONITOR_NAME, perfName);
        } catch (PerfStackMismatchException e) {
          if (isLoggingWarning()) {
            logWarning(e);
          }
        }
      }// end finally
    }
  }
  



  /**
   * @param pCommerceItems
   * @param pNewList
   */
  protected void getAllCommerceItemsFromList(List pCommerceItems, List<SiebelCommerceItem> pNewList) {
    if (isLoggingDebug()) {
      logDebug("Entered getCommerceItemCount() :  pCommerceItems == "
          +pCommerceItems+" : pNewList == "+pNewList);
    }
    if (pCommerceItems != null && pCommerceItems.size() > 0) {
      for (Object rawObject : pCommerceItems) {
        if (rawObject instanceof SiebelCommerceItem) {
          SiebelCommerceItem nextCommerceItem = (SiebelCommerceItem) rawObject;
          pNewList.add(nextCommerceItem);
          if (nextCommerceItem.getCommerceItemCount() > 0) {
            getAllCommerceItemsFromList(nextCommerceItem.getCommerceItems(), pNewList);
          }
        }
      }
    }
    if (isLoggingDebug()) {
      logDebug("Leaving getCommerceItemCount() :  pNewList == "+pNewList);
    }
  }

  

}
