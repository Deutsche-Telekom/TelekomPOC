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

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;

import com.siebel.ordermanagement.order.data.ListOfOrderHeader;
import com.siebel.ordermanagement.order.data.OrderItem;
import com.siebel.ordermanagement.order.details.OrderDetailQueryPageOutput;
import com.siebel.ordermanagement.order.details.data.data.ListOfOrderDetailData;
import com.siebel.ordermanagement.order.details.data.data.OrderDetailData;
import com.siebel.ordermanagement.order.details.data.data.OrderItemDetailData;

import atg.integrations.CommandInvocationException;
import atg.integrations.CommandTimeoutException;
import atg.integrations.InvalidInputException;
import atg.servlet.DynamoHttpServletRequest;
import atg.servlet.DynamoHttpServletResponse;
import atg.servlet.DynamoServlet;
import atg.siebel.order.SiebelOrderTools;
import atg.siebel.order.history.OrderSummary.OrderItemSummary;
import atg.siebel.profile.SiebelProfileTools;
import atg.userprofiling.Profile;

/**
 * Returns Order summaries for a given user. Services the Error output param if the profile is
 * null or transient
 * 
 * @author gamcdowe
 *
 */
public class OrderSummariesDroplet extends DynamoServlet
{
//-------------------------------------
  /** Class version string */
  public static final String CLASS_VERSION = "$Id: //product/Siebel/version/11.2/src/atg/siebel/order/history/OrderSummariesDroplet.java#2 $$Change: 1194813 $";

  
  //INPUT PARAMS
  public static final String INPUT_INDEX_PARAM = "index";
  public static final String INPUT_RANGE_PARAM = "range";
  // OUTPUT PARAMS
  public static final String OUTPUT_LENGTH = "noOfOrders";
  public static final String OUTPUT_ORDER_SUMMARIES = "orderSummaries";
  public static final String OUTPUT_ERROR_MESSAGE = "errorMessage";

  // OPARAMS
  public static final String OPARAM_OUTPUT = "output";
  public static final String OPARAM_ERROR = "error";
  
  //ERROR MESSAGES
  public static final String NOT_LOGGED_IN = "notLoggedIn";
  public static final String TRANSIENT = "transient";
  
  // -------------------------------------
  // Properties
  // -------------------------------------
  //-------------------------------------
  // property: Profile
  protected Profile mProfile;
  public Profile getProfile() {
    return mProfile;
  }
  public void setProfile(Profile pProfile) {
    mProfile = pProfile;
  }
  //-------------------------------------
  // property: OrderTools
  protected SiebelOrderTools mSiebelOrderTools;
  public SiebelOrderTools getOrderTools() {
    return mSiebelOrderTools;
  }
  public void setOrderTools(SiebelOrderTools pSiebelOrderTools) {
    mSiebelOrderTools = pSiebelOrderTools;
  }
  
  /** {@inheritDoc} */
  @Override
  public void service(DynamoHttpServletRequest req,
      DynamoHttpServletResponse res) throws ServletException, IOException {
    
    List<OrderSummary> orderSummaries = null;
    
    if(getProfile()==null)
    {
      req.serviceParameter(OPARAM_ERROR, req, res);
      return;
    }

    if(getProfile().isTransient())
    {
      req.setParameter(OUTPUT_ERROR_MESSAGE, "transient");
      req.serviceParameter(OPARAM_ERROR, req, res);
      return;
    }
    if(!((SiebelProfileTools)getProfile().getProfileTools()).isLoginUser(getProfile()))
    {
      req.setParameter(OUTPUT_ERROR_MESSAGE, "notLoggedIn");
      req.serviceParameter(OPARAM_ERROR, req, res);
      return;
    }
    
    int index = Integer.parseInt(req.getParameter(INPUT_INDEX_PARAM));
    int range = Integer.parseInt(req.getParameter(INPUT_RANGE_PARAM));
    
    ListOfOrderDetailData listOfOrderDetailData = null;
    
    try
    {
      listOfOrderDetailData = 
          getOrderTools().getOrderSummariesForProfile(getProfile(), index, range);
    } 
    catch (CommandTimeoutException e)
    {
      throw new ServletException(e);
    } 
    catch (InvalidInputException e)
    {
      throw new ServletException(e);
    } 
    catch (CommandInvocationException e)
    {
      throw new ServletException(e);
    }
    
    orderSummaries = convertToOrderSummaries(listOfOrderDetailData);    
    
    req.setParameter(OUTPUT_ORDER_SUMMARIES, orderSummaries);
    req.setParameter(OUTPUT_LENGTH, listOfOrderDetailData.getRecordcount().intValue());
    req.serviceParameter(OPARAM_OUTPUT, req, res);

  }
  
  /**
   * converts the response from the Get Order web service to Order Summary objects
   * 
   * @param order
   * @return
   */
  private List<OrderSummary> convertToOrderSummaries(ListOfOrderDetailData pListOfOrderDetailData)
  {
    Iterator<OrderDetailData> it = 
        pListOfOrderDetailData.getOrderDetail().iterator();
    
    List<OrderSummary> orderSummaries = new ArrayList<OrderSummary>();
   
    while(it.hasNext())
    {
    
      OrderDetailData orderDetail = it.next();
      
      OrderSummary.OrderItemSummary[] orderItemSummaries = null;
      
      if(orderDetail.getListOfOrderItemDetail()!=null)
      {
        orderItemSummaries = 
            new OrderSummary.OrderItemSummary[orderDetail.getListOfOrderItemDetail().getOrderItemDetail().size()];

        int i = 0;
        for(OrderItemDetailData orderItem: orderDetail.getListOfOrderItemDetail().getOrderItemDetail())
        {
          orderItemSummaries[i] = 
              new OrderSummary().new OrderItemSummary(orderItem.getProductId());
          i++;
        }
      }
    
      orderSummaries.add(new OrderSummary(
        orderDetail.getId(),
        orderDetail.getOrderNumber(),
        orderDetail.getCreated().toString(),
        orderDetail.getStatus(),
        orderItemSummaries));
    }
    
    return orderSummaries;
  }
}
