
package com.siebel.ordermanagement.order.details.data.data;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.siebel.ordermanagement.order.details.data.data package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ListOfOrderDetail_QNAME = new QName("http://siebel.com/OrderManagement/Order/Details/Data/Data", "ListOfOrderDetail");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.siebel.ordermanagement.order.details.data.data
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link OrderItemXADetailData }
     * 
     */
    public OrderItemXADetailData createOrderItemXADetailData() {
        return new OrderItemXADetailData();
    }

    /**
     * Create an instance of {@link ListOfShipmentData }
     * 
     */
    public ListOfShipmentData createListOfShipmentData() {
        return new ListOfShipmentData();
    }

    /**
     * Create an instance of {@link ListOfOrderItemProductLineData }
     * 
     */
    public ListOfOrderItemProductLineData createListOfOrderItemProductLineData() {
        return new ListOfOrderItemProductLineData();
    }

    /**
     * Create an instance of {@link ListOfOrderApprovalHistoryData }
     * 
     */
    public ListOfOrderApprovalHistoryData createListOfOrderApprovalHistoryData() {
        return new ListOfOrderApprovalHistoryData();
    }

    /**
     * Create an instance of {@link ShipmentItemData }
     * 
     */
    public ShipmentItemData createShipmentItemData() {
        return new ShipmentItemData();
    }

    /**
     * Create an instance of {@link OrderItemDetailData }
     * 
     */
    public OrderItemDetailData createOrderItemDetailData() {
        return new OrderItemDetailData();
    }

    /**
     * Create an instance of {@link ShipmentData }
     * 
     */
    public ShipmentData createShipmentData() {
        return new ShipmentData();
    }

    /**
     * Create an instance of {@link OrderItemProductLineData }
     * 
     */
    public OrderItemProductLineData createOrderItemProductLineData() {
        return new OrderItemProductLineData();
    }

    /**
     * Create an instance of {@link ListOfOrderItemDetailData }
     * 
     */
    public ListOfOrderItemDetailData createListOfOrderItemDetailData() {
        return new ListOfOrderItemDetailData();
    }

    /**
     * Create an instance of {@link ListOfOrderPaymentData }
     * 
     */
    public ListOfOrderPaymentData createListOfOrderPaymentData() {
        return new ListOfOrderPaymentData();
    }

    /**
     * Create an instance of {@link OrderDetailData }
     * 
     */
    public OrderDetailData createOrderDetailData() {
        return new OrderDetailData();
    }

    /**
     * Create an instance of {@link ListOfOrderPaymentsBankAddressData }
     * 
     */
    public ListOfOrderPaymentsBankAddressData createListOfOrderPaymentsBankAddressData() {
        return new ListOfOrderPaymentsBankAddressData();
    }

    /**
     * Create an instance of {@link OrderPaymentsBankAddressData }
     * 
     */
    public OrderPaymentsBankAddressData createOrderPaymentsBankAddressData() {
        return new OrderPaymentsBankAddressData();
    }

    /**
     * Create an instance of {@link ListOfOrderDetailData }
     * 
     */
    public ListOfOrderDetailData createListOfOrderDetailData() {
        return new ListOfOrderDetailData();
    }

    /**
     * Create an instance of {@link ListOfOrderPaymentsBillToAddressData }
     * 
     */
    public ListOfOrderPaymentsBillToAddressData createListOfOrderPaymentsBillToAddressData() {
        return new ListOfOrderPaymentsBillToAddressData();
    }

    /**
     * Create an instance of {@link OrderPaymentsBillToAddressData }
     * 
     */
    public OrderPaymentsBillToAddressData createOrderPaymentsBillToAddressData() {
        return new OrderPaymentsBillToAddressData();
    }

    /**
     * Create an instance of {@link OrderPaymentData }
     * 
     */
    public OrderPaymentData createOrderPaymentData() {
        return new OrderPaymentData();
    }

    /**
     * Create an instance of {@link ListOfShipmentItemData }
     * 
     */
    public ListOfShipmentItemData createListOfShipmentItemData() {
        return new ListOfShipmentItemData();
    }

    /**
     * Create an instance of {@link ListOfOrderDetailTopElmtData }
     * 
     */
    public ListOfOrderDetailTopElmtData createListOfOrderDetailTopElmtData() {
        return new ListOfOrderDetailTopElmtData();
    }

    /**
     * Create an instance of {@link ListOfOrderItemXADetailData }
     * 
     */
    public ListOfOrderItemXADetailData createListOfOrderItemXADetailData() {
        return new ListOfOrderItemXADetailData();
    }

    /**
     * Create an instance of {@link OrderApprovalHistoryData }
     * 
     */
    public OrderApprovalHistoryData createOrderApprovalHistoryData() {
        return new OrderApprovalHistoryData();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListOfOrderDetailData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://siebel.com/OrderManagement/Order/Details/Data/Data", name = "ListOfOrderDetail")
    public JAXBElement<ListOfOrderDetailData> createListOfOrderDetail(ListOfOrderDetailData value) {
        return new JAXBElement<ListOfOrderDetailData>(_ListOfOrderDetail_QNAME, ListOfOrderDetailData.class, null, value);
    }

}
