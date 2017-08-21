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



package atg.siebel.payment;

import atg.payment.tax.*;
import atg.nucleus.GenericService;
import atg.commerce.payment.*;
import atg.commerce.pricing.PricingTools;

/**
 * Always returns 5% tax.
 *
 * @author Sam Perman
 * @version $Id: //product/Siebel/version/11.2/src/atg/siebel/payment/FivePercentTax.java#1 $$Change: 1207183 $
 * @updated $DateTime: 2015/10/29 07:45:53 $$Author: saysyed $
 */
public class FivePercentTax extends GenericService implements TaxProcessor
{
  //-------------------------------------
  /** Class version string */
  public static String CLASS_VERSION =
  "$Id: //product/Siebel/version/11.2/src/atg/siebel/payment/FivePercentTax.java#1 $$Change: 1207183 $";

  protected PricingTools mPricingTools;
  /**
   * 
   * @return the PricingTools component
   * 
   */
  public PricingTools getPricingTools()
  {
    return mPricingTools;
  }

  public void setPricingTools(
      PricingTools pPricingTools)
  {
    mPricingTools = pPricingTools;
  }
  //-------------------------------------
  /**
   * TaxProcessor implementation
   */
  public TaxStatus calculateTax(TaxRequestInfo pTaxInfo) {

    double taxableAmount = 0.0;
      
    for (int i = 0; i < pTaxInfo.getShippingDestinations().length; i++) {
      ShippingDestination dest = pTaxInfo.getShippingDestinations()[i];
      if (isLoggingDebug())
        logDebug("DUMMY TAX PROCESSOR taxing a GROUP with amount : " + dest.getTaxableItemAmount());
      
      taxableAmount += dest.getTaxableItemAmount();
      
    }
      
    if (isLoggingDebug()) {
      logDebug("taxable amount: " + taxableAmount);
    }
    
    
    DummyTaxStatus ret = new DummyTaxStatus();
    ret.setAmount(taxableAmount / 20);

    ret.setTransactionSuccess(true);
    
    return ret;
  }
    
  /**
   * Calculate tax on the information specified in TaxRequestInfo.  Unlike calculateTax,
   * however, this method returns tax information on a per-shipping group basis.  That is
   * to say, it returns tax information for items grouped around their shipping address.
   *
   * @param pTaxInfo the TaxInfo reference which contains all the tax calculation data
   * @return an array of TaxStatus objects detailing the results of the tax calculation
   */
    public TaxStatus [] calculateTaxByShipping(TaxRequestInfo pTaxInfo) {
      
      DummyTaxStatus[] ret = new DummyTaxStatus[pTaxInfo.getShippingDestinations().length];
      
      for (int i = 0; i < pTaxInfo.getShippingDestinations().length; i++) {
        ShippingDestination dest = pTaxInfo.getShippingDestinations()[i];
        if (isLoggingDebug()) {    
          logDebug("DUMMY TAX PROCESSOR taxing a GROUP with amount : " + dest.getTaxableItemAmount());
        }
        ret[i] = new DummyTaxStatus();
        ret[i].setAmount(dest.getTaxableItemAmount() / 20);
        ret[i].setTransactionSuccess(true);
      }
      
      return ret;
    }
    
} // end of class
