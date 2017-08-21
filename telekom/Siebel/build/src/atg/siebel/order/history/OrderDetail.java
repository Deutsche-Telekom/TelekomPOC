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

import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import com.siebel.ordermanagement.order.details.data.data.OrderDetailData;
import com.siebel.ordermanagement.order.details.data.data.OrderItemDetailData;
import com.siebel.ordermanagement.order.details.data.data.OrderPaymentData;
import com.siebel.ordermanagement.order.details.data.data.ShipmentData;
import com.sun.org.apache.xerces.internal.jaxp.datatype.XMLGregorianCalendarImpl;

/**
 * Represents the details of an order. Maps order data from a the web service when given 
 * a list of fields in the constructor
 * 
 * @author gamcdowe
 *
 */
public class OrderDetail
{
  //-------------------------------------
  /** Class version string */
  public static final String CLASS_VERSION = "$Id: //product/Siebel/version/11.2/src/atg/siebel/order/history/OrderDetail.java#2 $$Change: 1194813 $";

  /**
   * no args constructor
   */
  public OrderDetail()
  {
    
  }
  
  protected static void mapFields(Object pObject, Object pObjectData, String[] pFields) 
      throws IllegalArgumentException, 
      IllegalAccessException, 
      InvocationTargetException, 
      IntrospectionException
  {
    for(String field:pFields)
    {
      //get the value from the output
      Object value = new PropertyDescriptor(field, pObjectData.getClass()).getReadMethod().invoke(pObjectData);
      //and set it on this object
      if(value!=null)
      {
        new PropertyDescriptor(field, pObject.getClass())
          .getWriteMethod()
          .invoke(pObject, value.getClass().cast(value));
      }
    }
  }
  
  /**
   * constructor which takes the output from the web response, and copies the 
   * values
   * 
   * @param pOutput
   * @throws IntrospectionException 
   * @throws InvocationTargetException 
   * @throws IllegalAccessException 
   * @throws IllegalArgumentException 
   */
  public OrderDetail(OrderDetailData pOrderDetailData, String[] pFields) 
      throws IllegalArgumentException, 
      IllegalAccessException, 
      InvocationTargetException, 
      IntrospectionException
  {        
    mapFields(this, pOrderDetailData, pFields);
  }
  
  protected String mStatus;
  public String getStatus()
  {
    return mStatus;
  }
  public void setStatus(String pStatus)
  {
    mStatus = pStatus;
  }
  protected String mOrderType;
  public String getOrderType()
  {
    return mOrderType;
  }
  public void setOrderType(String pOrderType)
  {
    mOrderType = pOrderType;
  }
  protected XMLGregorianCalendarImpl mCreated;
  public XMLGregorianCalendarImpl getCreated()
  {
    return mCreated;
  }
  public void setCreated(XMLGregorianCalendarImpl pCreated)
  {
    mCreated = pCreated;
  }
  public Date getCreatedDate()
  {
    return ((XMLGregorianCalendarImpl)mCreated).toGregorianCalendar().getTime();
  }
  protected String mOrderNumber;
  public String getOrderNumber()
  {
    return mOrderNumber;
  }
  public void setOrderNumber(String pOrderNumber)
  {
    mOrderNumber = pOrderNumber;
  }
  protected BigDecimal mOrderTotal;
  public BigDecimal getOrderTotal()
  {
    return mOrderTotal;
  }
  public void setOrderTotal(BigDecimal pOrderTotal)
  {
    mOrderTotal = pOrderTotal;
  }
  protected String mCurrencyCode;
  public String getCurrencyCode()
  {
    return mCurrencyCode;
  }
  public void setCurrencyCode(String pCurrencyCode)
  {
    mCurrencyCode = pCurrencyCode;
  }
  
  protected List<OrderItemDetail> mOrderItemDetails = new ArrayList<OrderItemDetail>();
  public List<OrderItemDetail> getOrderItemDetails()
  {
    return mOrderItemDetails;
  }
  public void setOrderItemDetail(List<OrderItemDetail> pOrderItemDetails)
  {
    mOrderItemDetails = pOrderItemDetails;
  }
  public void addOrderItemDetail(OrderItemDetail pOrderItemDetail)
  {
    mOrderItemDetails.add(pOrderItemDetail);
  }
  public OrderItemDetail getOrderItemDetail(int pIndex)
  {
    return mOrderItemDetails.get(pIndex);
  }
  
  protected List<OrderDeliveryDetail> mOrderDeliveryDetails = new ArrayList<OrderDeliveryDetail>();
  public List<OrderDeliveryDetail> getOrderDeliveryDetails()
  {
    return mOrderDeliveryDetails;
  }
  public void setOrderDeliveryDetails(List<OrderDeliveryDetail> pOrderDeliveryDetails)
  {
    mOrderDeliveryDetails = pOrderDeliveryDetails;
  }
  public void addOrderDeliveryDetail(OrderDeliveryDetail pOrderDeliveryDetail)
  {
    mOrderDeliveryDetails.add(pOrderDeliveryDetail);
  }
  public OrderDeliveryDetail getOrderDeliveryDetail(int pIndex)
  {
    return mOrderDeliveryDetails.get(pIndex);
  }
  
  protected List<OrderPaymentDetail> mOrderPaymentDetails = new ArrayList<OrderPaymentDetail>();
  public List<OrderPaymentDetail> getOrderPaymentDetails()
  {
    return mOrderPaymentDetails;
  }
  public void setOrderPaymentDetails(List<OrderPaymentDetail> pOrderPaymentDetails)
  {
    mOrderPaymentDetails = pOrderPaymentDetails;
  }
  public void addOrderPaymentDetail(OrderPaymentDetail pOrderPaymentDetail)
  {
    mOrderPaymentDetails.add(pOrderPaymentDetail);
  }
  public OrderPaymentDetail getOrderPaymentDetail(int pIndex)
  {
    return mOrderPaymentDetails.get(pIndex);
  }
  
  //inner classes
  public class OrderItemDetail
  {
    //no-args constructor
    public OrderItemDetail()
    {
      
    }
    //mapping constructor
    public OrderItemDetail(OrderItemDetailData pOrderItemDetailData, String[] pFields) 
        throws IllegalArgumentException, 
        IllegalAccessException, 
        InvocationTargetException, 
        IntrospectionException
    {
      mapFields(this, pOrderItemDetailData, pFields);
      
      Iterator<OrderItemDetailData> it = pOrderItemDetailData.getOrderItemDetail().iterator();
      
      while(it.hasNext())
      {
        OrderItemDetailData orderItemDetailData = it.next();
        
        OrderItemDetail orderItemDetail = new OrderItemDetail(orderItemDetailData, pFields);
        
        this.addOrderItemDetail(orderItemDetail);
      }
    }
    
    protected String mActionCode;

    protected String mProductId;
    
    protected BigDecimal mBasePrice;

    protected BigDecimal mDiscountAmount;
    
    protected BigDecimal mItemPrice;

    protected String mStatus;

    protected Integer mQuantity;
    
    protected String mCurrencyCode;
    
    /**
     * @return the mCurrencyCode
     */
    public String getCurrencyCode()
    {
      return mCurrencyCode;
    }
    /**
     * @param mCurrencyCode the mCurrencyCode to set
     */
    public void setCurrencyCode(String pCurrencyCode)
    {
      mCurrencyCode = pCurrencyCode;
    }

    protected List<OrderItemDetail> mOrderItemDetails = new ArrayList<OrderItemDetail>();
    /**
     * @return the mOrderItemDetails
     */
    public List<OrderItemDetail> getOrderItemDetails()
    {
      return mOrderItemDetails;
    }
    /**
     * @param mOrderItemDetails the mOrderItemDetails to set
     */
    public void setOrderItemDetails(List<OrderItemDetail> pOrderItemDetails)
    {
      mOrderItemDetails = pOrderItemDetails;
    }
    
    public void addOrderItemDetail(OrderItemDetail pOrderItemDetail)
    {
      mOrderItemDetails.add(pOrderItemDetail);
    }
    public OrderItemDetail getOrderItemDetail(int pIndex)
    {
      return mOrderItemDetails.get(pIndex);
    }
    /**
     * @return the mActionCode
     */
    public String getActionCode()
    {
      return mActionCode;
    }
    /**
     * @param mActionCode the mActionCode to set
     */
    public void setActionCode(String pActionCode)
    {
      mActionCode = pActionCode;
    }
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
    /**
     * @return the mBasePrice
     */
    public BigDecimal getBasePrice()
    {
      return mBasePrice;
    }
    /**
     * @param mBasePrice the mBasePrice to set
     */
    public void setBasePrice(BigDecimal pBasePrice)
    {
      mBasePrice = pBasePrice;
    }
    /**
     * @return the mDiscountAmount
     */
    public BigDecimal getDiscountAmount()
    {
      return mDiscountAmount;
    }
    /**
     * @param mDiscountAmount the mDiscountAmount to set
     */
    public void setDiscountAmount(BigDecimal pDiscountAmount)
    {
      mDiscountAmount = pDiscountAmount;
    }
    /**
     * @return the mItemPrice
     */
    public BigDecimal getItemPrice()
    {
      return mItemPrice;
    }
    /**
     * @param mItemPrice the mItemPrice to set
     */
    public void setItemPrice(BigDecimal pItemPrice)
    {
      mItemPrice = pItemPrice;
    }
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
     * @return the mQuantity
     */
    public Integer getQuantity()
    {
      return mQuantity;
    }
    /**
     * @param mQuantity the mQuantity to set
     */
    public void setQuantity(Integer pQuantity)
    {
      mQuantity = pQuantity;
    }
  }

  
  public class OrderDeliveryDetail
  {
    //no-args constructor
    public OrderDeliveryDetail()
    {
      
    }
    //mapping constructor
    public OrderDeliveryDetail(ShipmentData pShipmentData, String[] pFields) 
        throws IllegalArgumentException, 
        IllegalAccessException, 
        InvocationTargetException, 
        IntrospectionException
    {
      mapFields(this, pShipmentData, pFields);
    }
    
    protected String mShipToFirstName;
    
    protected String mShipToLastName;
    
    protected String mShipmentNumber;
    
    protected String mWaybillNumber;
    
    protected XMLGregorianCalendarImpl mShipDate;

    protected String mCarrier;
    
    protected String mCarrierPriority;
    
    protected String mStatus;
    
    protected String mShipToAccount;
    
    protected String mShipToAddress2;
    
    protected String mShipToAccountLocation;
    
    

    /**
     * @return the mShipToFirstName
     */
    public String getShipToFirstName()
    {
      return mShipToFirstName;
    }
    /**
     * @param mShipToFirstName the mShipToFirstName to set
     */
    public void setShipToFirstName(String pShipToFirstName)
    {
      mShipToFirstName = pShipToFirstName;
    }
    /**
     * @return the mShipToLastName
     */
    public String getShipToLastName()
    {
      return mShipToLastName;
    }
    /**
     * @param mShipToLastName the mShipToLastName to set
     */
    public void setShipToLastName(String pShipToLastName)
    {
      mShipToLastName = pShipToLastName;
    }
    /**
     * @return the mShipmentNumber
     */
    public String getShipmentNumber()
    {
      return mShipmentNumber;
    }
    /**
     * @param mShipmentNumber the mShipmentNumber to set
     */
    public void setShipmentNumber(String pShipmentNumber)
    {
      mShipmentNumber = pShipmentNumber;
    }
    /**
     * @return the mWaybillNumber
     */
    public String getWaybillNumber()
    {
      return mWaybillNumber;
    }
    /**
     * @param mWaybillNumber the mWaybillNumber to set
     */
    public void setWaybillNumber(String pWaybillNumber)
    {
      mWaybillNumber = pWaybillNumber;
    }
    /**
     * @return the mShipDate
     */
    public XMLGregorianCalendarImpl getShipDate()
    {
      return mShipDate;
    }
    public Date getShippedDate()
    {
      return ((XMLGregorianCalendarImpl)mShipDate).toGregorianCalendar().getTime();
    }
    /**
     * @param mShipDate the mShipDate to set
     */
    public void setShipDate(XMLGregorianCalendarImpl pShipDate)
    {
      mShipDate = pShipDate;
    }
    /**
     * @return the mCarrier
     */
    public String getCarrier()
    {
      return mCarrier;
    }
    /**
     * @param mCarrier the mCarrier to set
     */
    public void setCarrier(String pCarrier)
    {
      mCarrier = pCarrier;
    }
    /**
     * @return the mCarrierPriority
     */
    public String getCarrierPriority()
    {
      return mCarrierPriority;
    }
    /**
     * @param mCarrierPriority the mCarrierPriority to set
     */
    public void setCarrierPriority(String pCarrierPriority)
    {
      mCarrierPriority = pCarrierPriority;
    }
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
     * @return the mShipToAccount
     */
    public String getShipToAccount()
    {
      return mShipToAccount;
    }
    /**
     * @param mShipToAccount the mShipToAccount to set
     */
    public void setShipToAccount(String pShipToAccount)
    {
      mShipToAccount = pShipToAccount;
    }
    /**
     * @return the mShipToAddress2
     */
    public String getShipToAddress2()
    {
      return mShipToAddress2;
    }
    /**
     * @param mShipToAddress2 the mShipToAddress2 to set
     */
    public void setShipToAddress2(String pShipToAddress2)
    {
      mShipToAddress2 = pShipToAddress2;
    }
    /**
     * @return the mShipToAccountLocation
     */
    public String getShipToAccountLocation()
    {
      return mShipToAccountLocation;
    }
    /**
     * @param mShipToAccountLocation the mShipToAccountLocation to set
     */
    public void setShipToAccountLocation(String pShipToAccountLocation)
    {
      mShipToAccountLocation = pShipToAccountLocation;
    }
  }
  
  public class OrderPaymentDetail
  {
    
    /**
     * @return the mCreditCardNumberDisplay
     */
    public String getCreditCardNumberDisplay()
    {
      return mCreditCardNumberDisplay;
    }
    /**
     * @param mCreditCardNumberDisplay the mCreditCardNumberDisplay to set
     */
    public void setCreditCardNumberDisplay(String pCreditCardNumberDisplay)
    {
       mCreditCardNumberDisplay = pCreditCardNumberDisplay;
    }
    /**
     * @return the mPaymentType
     */
    public String getPaymentType()
    {
      return mPaymentType;
    }
    /**
     * @param mPaymentType the mPaymentType to set
     */
    public void setPaymentType(String pPaymentType)
    {
      mPaymentType = pPaymentType;
    }
    /**
     * @return the mPaymentProfileName
     */
    public String getPaymentProfileName()
    {
      return mPaymentProfileName;
    }
    /**
     * @param mPaymentProfileName the mPaymentProfileName to set
     */
    public void setPaymentProfileName(String pPaymentProfileName)
    {
      mPaymentProfileName = pPaymentProfileName;
    }
    /**
     * @return the mPaymentDate
     */
    public XMLGregorianCalendarImpl getPaymentDate()
    {
      return mPaymentDate;
    }
    /**
     * @param mPaymentDate the mPaymentDate to set
     */
    public void setPaymentDate(XMLGregorianCalendarImpl pPaymentDate)
    {
      mPaymentDate = pPaymentDate;
    }
    /**
     * @return the mPaymentStatus
     */
    public String getPaymentStatus()
    {
      return mPaymentStatus;
    }
    /**
     * @param mPaymentStatus the mPaymentStatus to set
     */
    public void setPaymentStatus(String pPaymentStatus)
    {
      mPaymentStatus = pPaymentStatus;
    }
    /**
     * @return the mTransactionAmount
     */
    public BigDecimal getTransactionAmount()
    {
      return mTransactionAmount;
    }
    /**
     * @param mTransactionAmount the mTransactionAmount to set
     */
    public void setTransactionAmount(BigDecimal pTransactionAmount)
    {
      mTransactionAmount = pTransactionAmount;
    }
    /**
     * @return the mCurrencyCode
     */
    public String getCurrencyCode()
    {
      return mCurrencyCode;
    }
    /**
     * @param mCurrencyCode the mCurrencyCode to set
     */
    public void setCurrencyCode(String pCurrencyCode)
    {
      mCurrencyCode = pCurrencyCode;
    }
    //no-args constructor
    public OrderPaymentDetail()
    {
      
    }
    //mapping constructor
    public OrderPaymentDetail(OrderPaymentData pOrderPaymentData, String[] pFields) 
        throws IllegalArgumentException, 
        IllegalAccessException, 
        InvocationTargetException, 
        IntrospectionException
    {
      mapFields(this, pOrderPaymentData, pFields);
    }
           
    protected String mCreditCardNumberDisplay;
    
    protected String mPaymentType;
    
    protected String mPaymentProfileName;
    
    protected XMLGregorianCalendarImpl mPaymentDate;
    
    protected String mPaymentStatus;
    
    protected BigDecimal mTransactionAmount;
    
    protected String mCurrencyCode;
  }
}
