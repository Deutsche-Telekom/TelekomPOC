
package com.siebel.ordermanagement.order.details.data.id;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.siebel.ordermanagement.order.details.data.id package. 
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

    private final static QName _ListOfOrderDetail_QNAME = new QName("http://siebel.com/OrderManagement/Order/Details/Data/Id", "ListOfOrderDetail");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.siebel.ordermanagement.order.details.data.id
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ListOfShipmentItemId }
     * 
     */
    public ListOfShipmentItemId createListOfShipmentItemId() {
        return new ListOfShipmentItemId();
    }

    /**
     * Create an instance of {@link ListOfOrderItemXADetailId }
     * 
     */
    public ListOfOrderItemXADetailId createListOfOrderItemXADetailId() {
        return new ListOfOrderItemXADetailId();
    }

    /**
     * Create an instance of {@link ListOfOrderPaymentId }
     * 
     */
    public ListOfOrderPaymentId createListOfOrderPaymentId() {
        return new ListOfOrderPaymentId();
    }

    /**
     * Create an instance of {@link OrderItemProductLineId }
     * 
     */
    public OrderItemProductLineId createOrderItemProductLineId() {
        return new OrderItemProductLineId();
    }

    /**
     * Create an instance of {@link OrderDetailId }
     * 
     */
    public OrderDetailId createOrderDetailId() {
        return new OrderDetailId();
    }

    /**
     * Create an instance of {@link OrderPaymentId }
     * 
     */
    public OrderPaymentId createOrderPaymentId() {
        return new OrderPaymentId();
    }

    /**
     * Create an instance of {@link ListOfOrderItemProductLineId }
     * 
     */
    public ListOfOrderItemProductLineId createListOfOrderItemProductLineId() {
        return new ListOfOrderItemProductLineId();
    }

    /**
     * Create an instance of {@link ListOfOrderPaymentsBillToAddressId }
     * 
     */
    public ListOfOrderPaymentsBillToAddressId createListOfOrderPaymentsBillToAddressId() {
        return new ListOfOrderPaymentsBillToAddressId();
    }

    /**
     * Create an instance of {@link ListOfOrderPaymentsBankAddressId }
     * 
     */
    public ListOfOrderPaymentsBankAddressId createListOfOrderPaymentsBankAddressId() {
        return new ListOfOrderPaymentsBankAddressId();
    }

    /**
     * Create an instance of {@link OrderItemXADetailId }
     * 
     */
    public OrderItemXADetailId createOrderItemXADetailId() {
        return new OrderItemXADetailId();
    }

    /**
     * Create an instance of {@link OrderPaymentsBillToAddressId }
     * 
     */
    public OrderPaymentsBillToAddressId createOrderPaymentsBillToAddressId() {
        return new OrderPaymentsBillToAddressId();
    }

    /**
     * Create an instance of {@link ListOfOrderItemDetailId }
     * 
     */
    public ListOfOrderItemDetailId createListOfOrderItemDetailId() {
        return new ListOfOrderItemDetailId();
    }

    /**
     * Create an instance of {@link ListOfOrderApprovalHistoryId }
     * 
     */
    public ListOfOrderApprovalHistoryId createListOfOrderApprovalHistoryId() {
        return new ListOfOrderApprovalHistoryId();
    }

    /**
     * Create an instance of {@link ShipmentId }
     * 
     */
    public ShipmentId createShipmentId() {
        return new ShipmentId();
    }

    /**
     * Create an instance of {@link ListOfShipmentId }
     * 
     */
    public ListOfShipmentId createListOfShipmentId() {
        return new ListOfShipmentId();
    }

    /**
     * Create an instance of {@link ListOfOrderDetailTopElmtId }
     * 
     */
    public ListOfOrderDetailTopElmtId createListOfOrderDetailTopElmtId() {
        return new ListOfOrderDetailTopElmtId();
    }

    /**
     * Create an instance of {@link OrderItemDetailId }
     * 
     */
    public OrderItemDetailId createOrderItemDetailId() {
        return new OrderItemDetailId();
    }

    /**
     * Create an instance of {@link OrderApprovalHistoryId }
     * 
     */
    public OrderApprovalHistoryId createOrderApprovalHistoryId() {
        return new OrderApprovalHistoryId();
    }

    /**
     * Create an instance of {@link ListOfOrderDetailId }
     * 
     */
    public ListOfOrderDetailId createListOfOrderDetailId() {
        return new ListOfOrderDetailId();
    }

    /**
     * Create an instance of {@link OrderPaymentsBankAddressId }
     * 
     */
    public OrderPaymentsBankAddressId createOrderPaymentsBankAddressId() {
        return new OrderPaymentsBankAddressId();
    }

    /**
     * Create an instance of {@link ShipmentItemId }
     * 
     */
    public ShipmentItemId createShipmentItemId() {
        return new ShipmentItemId();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListOfOrderDetailId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://siebel.com/OrderManagement/Order/Details/Data/Id", name = "ListOfOrderDetail")
    public JAXBElement<ListOfOrderDetailId> createListOfOrderDetail(ListOfOrderDetailId value) {
        return new JAXBElement<ListOfOrderDetailId>(_ListOfOrderDetail_QNAME, ListOfOrderDetailId.class, null, value);
    }

}
