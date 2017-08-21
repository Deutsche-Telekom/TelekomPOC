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
package atg.siebel.order.history;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import atg.nucleus.logging.ApplicationLogging;
import atg.nucleus.logging.ClassLoggingFactory;

/**
 * Represents an Order Summary
 * 
 * @author gamcdowe
 *
 */
public class OrderSummary
{
  
  public class OrderItemSummary
  {
  //-------------------------------------
    /** Class version string */
    public static final String CLASS_VERSION = "$Id: //product/Siebel/version/11.2/src/atg/siebel/order/history/OrderSummary.java#2 $$Change: 1194813 $";
    
    /**
     * no-args constructor
     */
    public OrderItemSummary()
    {
      
    }
    
    public OrderItemSummary(
        String pProductId)
    {
      mProductId = pProductId;
    }

    protected String mProductId;
    /**
     * @return the mProductId
     */
    public String getProductId()
    {
      return mProductId;
    }

    /**
     * @param mProductId the mProductId to set
     */
    public void setProductId(String pProductId)
    {
      mProductId = pProductId;
    }
  }

  //-------------------------------------
  /** Class version string */
  public static final String CLASS_VERSION = "$Id: //product/Siebel/version/11.2/src/atg/siebel/order/history/OrderSummary.java#2 $$Change: 1194813 $";

  /** Logger */
  protected static ApplicationLogging mLogger = ClassLoggingFactory
      .getFactory().getLoggerForClass(OrderSummary.class);
  
  /**
   * default no-args constructor
   */
  public OrderSummary()
  {
    
  }
  
  /**
   * Constructor
   * 
   * @param pOrderNumber
   * @param pOrderDate - string format
   * @param pStatus
   * @param pOrderSummaries
   */
  public OrderSummary(
      String pOrderId,
      String pOrderNumber,
      String pOrderDate,
      String pStatus,
      OrderItemSummary[] pOrderItemSummaries)
  {
    mOrderId= pOrderId;
    mOrderNumber = pOrderNumber;
    setOrderDate(pOrderDate);
    mStatus = pStatus;
    mOrderItemSummaries = pOrderItemSummaries;
  }
  
  /**
   * Constructor
   * 
   * @param pOrderNumber
   * @param pOrderDate - date format
   * @param pStatus
   * @param pOrderSummaries
   */
  public OrderSummary(
      String pOrderId,
      String pOrderNumber,
      Date pOrderDate,
      String pStatus,
      OrderItemSummary[] pOrderItemSummaries)
  {
    mOrderId= pOrderId;
    mOrderNumber = pOrderNumber;
    mOrderDate = pOrderDate;
    mStatus = pStatus;
    mOrderItemSummaries = pOrderItemSummaries;
  }
  
  /**
   * the summary info for order items
   */
  protected OrderItemSummary[] mOrderItemSummaries;
  /**
   * @return the mOrderItemSummaries
   */
  public OrderItemSummary[] getOrderItemSummaries()
  {
    return mOrderItemSummaries;
  }

  /**
   * @param mOrderItemSummaries the mOrderItemSummaries to set
   */
  public void setOrderItemSummaries(OrderItemSummary[] pOrderItemSummaries)
  {
    mOrderItemSummaries = pOrderItemSummaries;
  }
  


  protected String mOrderId;
  /**
   * @return the mOrderId
   */
  public String getOrderId()
  {
    return mOrderId;
  }

  /**
   * @param mOrderId the mOrderId to set
   */
  public void setOrderId(String pOrderId)
  {
    mOrderId = pOrderId;
  }
  
  
  /**
   * the order status
   */
  protected String mStatus;
  /**
   * @return the mStatus
   */
  public String getStatus()
  {
    return mStatus;
  }
  /**
   * @param mStatus the mStatus to set
   */
  public void setStatus(String pStatus)
  {
    mStatus = pStatus;
  }


  /**
   * the order number
   */
  protected String mOrderNumber;
  /**
   * @return the mOrderNumber
   */
  public String getOrderNumber()
  {
    return mOrderNumber;
  }

  /**
   * @param mOrderNumber the mOrderNumber to set
   */
  public void setOrderNumber(String pOrderNumber)
  {
    mOrderNumber = pOrderNumber;
  }
  
  /**
   * the created date for the order 
   */
  protected Date mOrderDate;
  /**
   * @return the mOrderDate
   */
  public Date getOrderDate()
  {
    return mOrderDate;
  }
  /**
   * @param mOrderDate the mOrderDate to set
   */
  public void setOrderDate(Date pOrderDate)
  {
    mOrderDate = pOrderDate;
  }

  /**
   * sets the date as a string and converts to java.util.Date
   * 
   * @param pOrderDate
   */
  public void setOrderDate(String pOrderDate)
  { 
    DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd'T'hh:mm:ss");
    Date date = null;
    try
    {
      date = formatter.parse(pOrderDate);
    } 
    catch (ParseException e)
    {
      if (mLogger.isLoggingError()) {
        mLogger.logError("error parseing Order Date " + e);
      }
    }
    setOrderDate(date);
  }
}
