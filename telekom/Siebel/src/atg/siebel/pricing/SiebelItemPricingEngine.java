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

import atg.commerce.order.CommerceItem;
import atg.commerce.order.Order;
import atg.commerce.pricing.ItemPriceInfo;
import atg.commerce.pricing.ItemPricingEngine;
import atg.commerce.pricing.PricingEngineService;
import atg.commerce.pricing.PricingException;
import atg.repository.RepositoryItem;
import atg.service.resourcepool.ResourcePoolException;
import atg.siebel.integration.SiebelWebServiceConfigurationException;
import atg.siebel.integration.WebServiceController;
import atg.siebel.integration.WebServiceHelper;
import atg.siebel.order.SiebelOrderTools;
import com.siebel.ordermanagement.quote.data.ListOfQuote;
import com.siebel.ordermanagement.quote.data.Quote;
import com.siebel.ordermanagement.quote.data.QuoteItem;
import com.siebel.ordermanagement.quote.psp.CalculatePriceInput;
import com.siebel.ordermanagement.quote.psp.CalculatePriceOutput;

import javax.xml.crypto.dsig.TransformException;
import javax.xml.ws.soap.SOAPFaultException;
import java.lang.reflect.InvocationTargetException;
import java.util.*;

/**
 * This class over-rides the ootb item pricing engine. All of the item pricing is done by
 * making web service calls to Siebel. ATG promotions are not used.
 *
 * @author Patrick Mc Erlean
 * @version $Id:
 *          $$Change: 1194813 $
 * @updated $DateTime: 2015/09/10 08:26:24 $$Author: saysyed $
 */

public class SiebelItemPricingEngine extends PricingEngineService implements ItemPricingEngine
{
  // ----------------------------------------------------------------------------------
  // Class version string
  // ----------------------------------------------------------------------------------

  public static String CLASS_VERSION = "$Id: //product/Siebel/version/11.2/src/atg/siebel/pricing/SiebelItemPricingEngine.java#2 $$Change: 1194813 $";

  // ----------------------------------------------------------------------------------
  // Constants
  // ----------------------------------------------------------------------------------

  // ----------------------------------------------------------------------------------
  // Properties
  // ----------------------------------------------------------------------------------

  //----------------------------------------------------------------------------------
  // orderTools

  private SiebelOrderTools mOrderTools;

  /**
   * Returns the property orderTools
   *
   * @return the orderTools property value
   */

  public SiebelOrderTools getOrderTools()
  {
    return mOrderTools;
  }

  /**
   * Sets the property orderTools
   *
   * @param pOrderTools the property value
   */

  public void setOrderTools (SiebelOrderTools pOrderTools)
  {
    mOrderTools = pOrderTools;
  }
  
  // --------- Property: webServiceHelper -----------
  protected WebServiceHelper mWebServiceHelper;

  public void setWebServiceHelper(WebServiceHelper pWebServiceHelper) {
      mWebServiceHelper = pWebServiceHelper;
  }

  public WebServiceHelper getWebServiceHelper() {
      return mWebServiceHelper;
  }

  protected WebServiceController mWebServiceController;

  // --------- Property: WebServiceController ------------
  public void setWebServiceController(WebServiceController pWebServiceController)
  {
    mWebServiceController = pWebServiceController;
  }

  public WebServiceController getWebServiceController()
  {
    return mWebServiceController;
  }


  // ----------------------------------------------------------------------------------
  // Member data
  // ----------------------------------------------------------------------------------

  
  // ----------------------------------------------------------------------------------
  // Methods
  // ----------------------------------------------------------------------------------

  /**
   * Price a single item in a context
   *
   * @param pItem The item to price
   * @param pPricingModels A Collection of RepositoryItems representing PricingModels
   * @param pLocale The Locale to use for pricing
   * @param pProfile The user's profile
   * @param pExtraParameters A Map of extra parameters to be used in the pricing, may be null
   * @return ItemPriceInfo representing the price quote for the item
   */

  public ItemPriceInfo priceItem (CommerceItem pItem, Collection pPricingModels, Locale pLocale, RepositoryItem pProfile, Map pExtraParameters)
       throws PricingException
  {
    return null;
  }

  //-------------------------------------
  /**
   * Price each of a List of items in a context
   *
   * @param pItems The items to price (individually)
   * @param pPricingModels A Collection of RepositoryItems representing PricingModels
   * @param pLocale The Locale to use for pricing
   * @param pProfile The user's profile
   * @param pExtraParameters A Map of extra parameters to be used in the pricing, may be null
   * @return List of ItemPriceInfo objects representing the price quotes for each item
   */

  public List priceEachItem (List pItems, Collection pPricingModels, Locale pLocale, RepositoryItem pProfile, Map pExtraParameters)
       throws PricingException
  {
    return null;
  }

  /**
   * Price a List of items together in a context
   *
   * @param pItems The items to price
   * @param pPricingModels A Collection of RepositoryItems representing PricingModels
   * @param pLocale The Locale to use for pricing
   * @param pProfile The user's profile
   * @param pOrder The Order object of which the List of items are a part, may be null
   * @param pExtraParameters A Map of extra parameters to be used in the pricing, may be null
   * @return List of ItemPriceInfo objects representing the price quotes for the items
   */

  public List priceItems(List pItems, Collection pPricingModels, Locale pLocale, RepositoryItem pProfile, Order pOrder, Map pExtraParameters)
       throws PricingException
  {
    List<SiebelItemPriceInfo> itemPriceInfos = null;
    Quote quote = null;

    // Check if there are some items

    if ((pItems == null) || (pItems.size() <= 0))
    {
      return null;
    }

    // Convert the order into a Siebel quote.

    try
    {
      quote = getOrderTools().convertOrderToSiebelQuote (pOrder);
    }
    catch (TransformException e)
    {
      vlogError("TransformException caught converting order to quote - {0}", e);
      throw new PricingException (e);
    }

    // Call the method to do the pricing web service call

    try
    {
      itemPriceInfos = siebelDynamicPricing (quote);
    }
    catch (PricingException e)
    {
      vlogError("PricingException caught in dynamic pricing - {0}", e);
      throw (e);
    }

    // Return the prices

    return itemPriceInfos;
  }

  /**
   * siebelDynamicPricing
   *
   * Calls the Siebel dynamic pricing service.
   *
   * @param pQuote the order in Siebel quote format.
   *
   * @return List of SiebelItemPriceInfo objects.
   */

  public List<SiebelItemPriceInfo> siebelDynamicPricing (Quote pQuote) throws PricingException
  {
    vlogDebug("siebelDynamicPricing() called : pQuote == {0}", pQuote);
    
    // Create soap message body
    CalculatePriceInput input = new CalculatePriceInput();
    ListOfQuote listOfQuote = new ListOfQuote();
    
    listOfQuote.getQuote().add (pQuote);
    input.setListOfQuote (listOfQuote);
    
    // Call the web service
    CalculatePriceOutput output = null;
    try {
      output = callWebService(input);
    } catch (SOAPFaultException sfe) {
      throw new PricingException(sfe);
    }

    // Check that some quote items have been returned.
    if(output==null)
    {
      throw new PricingException ("No quote items returned");
    }
    if ((output.getListOfQuote().getQuote() == null) ||
            (output.getListOfQuote().getQuote().get(0) == null) ||
            (output.getListOfQuote().getQuote().get(0).getListOfQuoteItem() == null) ||
            (output.getListOfQuote().getQuote().get(0).getListOfQuoteItem().getQuoteItem() == null))
    {
      throw new PricingException ("No quote items returned");
    }

    // Get the quote items

    List<QuoteItem> quoteItems = output.getListOfQuote().getQuote().get(0).getListOfQuoteItem().getQuoteItem();
    
    // Process the quote items
    
    List<SiebelItemPriceInfo> itemPriceInfos = new ArrayList<SiebelItemPriceInfo>(quoteItems.size());
    createAndAddInfoToList(quoteItems, itemPriceInfos);

    vlogDebug("leaving siebelDynamicPricing() : itemPriceInfos == {0}", itemPriceInfos);
    return itemPriceInfos;
  }
  
  
  protected void createAndAddInfoToList(
      List<QuoteItem> quoteItems, 
      List<SiebelItemPriceInfo> itemPriceInfos) throws PricingException {
      String currencyCode = null;
      for (QuoteItem quoteItem : quoteItems) {
        if (quoteItem.getCurrencyCode() != null
          && !"".equals(quoteItem.getCurrencyCode())) {
          currencyCode = quoteItem.getCurrencyCode();
          break;
        }
    }
    for (QuoteItem quoteItem : quoteItems) {
      // Create a new itemPriceInfo.

      SiebelItemPriceInfo itemPriceInfo = (SiebelItemPriceInfo) createPriceInfo();

      // Set the values from the quote item

      try {
        if (quoteItem.getCurrentPrice() != null) {
          itemPriceInfo.setAmount(Double.parseDouble(quoteItem
              .getCurrentPrice()));
        }
      } catch (NumberFormatException nfe) {
      }

      try {
        if (quoteItem.getCurrentPrice() != null) {
          itemPriceInfo.setRawTotalPrice(Double.parseDouble(quoteItem
              .getCurrentPrice()));
        }
      } catch (NumberFormatException nfe) {
      }

      try {
        if (quoteItem.getListPrice() != null) {
          itemPriceInfo.setListPrice(Double.parseDouble(quoteItem
              .getListPrice()));
        }
      } catch (NumberFormatException nfe) {
      }

      try {
        if (quoteItem.getPricingAdjustmentAmount() != null) {
          itemPriceInfo.setOrderDiscountShare(Double.parseDouble(quoteItem
              .getPricingAdjustmentAmount()));
        }
      } catch (NumberFormatException nfe) {
      }

      try {
        if (quoteItem.getMRCCxTotal() != null) {
          // SIEBELINT-844 - Round off the amount to specified decimal places
          itemPriceInfo.setMonthlyRecurringPrice(getPricingTools().round(
              Double.parseDouble(quoteItem.getMRCCxTotal())));
        }
      } catch (NumberFormatException nfe) {
      }

      try {
        if (quoteItem.getNRCCxTotal() != null) {
          // SIEBELINT-844 - Round off the amount to specified decimal places
          itemPriceInfo.setNonRecurringPrice(getPricingTools().round(
              Double.parseDouble(quoteItem.getNRCCxTotal())));
        }
      } catch (NumberFormatException nfe) {
      }
      
      if(quoteItem.getCurrencyCode() == null || "".equals(quoteItem.getCurrencyCode())){
        itemPriceInfo.setCurrencyCode(currencyCode);
      }else{
      itemPriceInfo.setCurrencyCode(quoteItem.getCurrencyCode());
      }
        

      // quoteItem.getPricingAdjustmentAmount();

      // Add item to the array list.
      itemPriceInfo.markAsFinal();
      itemPriceInfos.add(itemPriceInfo);

      if (quoteItem.getQuoteItem() != null
          && !quoteItem.getQuoteItem().isEmpty()) {
        createAndAddInfoToList(quoteItem.getQuoteItem(), itemPriceInfos);
      }

    }
  }

  
  
  /**
   * Calls the webservice - uses webServiceHelper to provide port configuration
   * @param pInput
   * @return
   */
  protected CalculatePriceOutput callWebService(CalculatePriceInput pInput) {
    vlogDebug("callWebService() called : pInput == {0}", pInput);

    //CalculatePriceWS pricingWebService = new CalculatePriceWS();
    //CalculatePricePort port = pricingWebService.getCalculatePricePort();
    //getWebServiceHelper().prepareConnection((BindingProvider) port);

    //CalculatePriceOutput output = port.calculatePrice (pInput);

    CalculatePriceOutput output = null;
    try {
      output = (CalculatePriceOutput)getWebServiceController().callWebService(
              "com.siebel.ordermanagement.quote.psp.CalculatePriceWS",
              "CalculatePricePort",
              "calculatePrice",
              pInput,
              this,
              getWebServiceHelper());
    } catch (ResourcePoolException e) {
      if(isLoggingError())
        logError(e);
    } catch (NoSuchMethodException e) {
      if(isLoggingError())
        logError(e);
    } catch (InvocationTargetException e) {
      if(isLoggingError())
        logError(e);
    } catch (IllegalAccessException e) {
      if(isLoggingError())
        logError(e);
    } catch (SiebelWebServiceConfigurationException e) {
      if(isLoggingError())
        logError(e);
    }


    vlogDebug("leaving callWebService() : output == {0}", output);
    return output;
  }
  

  public Collection getPricingModels (RepositoryItem repositoryItem)
  {
    return null;
  }

}
