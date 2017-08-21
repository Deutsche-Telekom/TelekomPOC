
package com.siebel.ordermanagement.order.details.data.query;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.siebel.ordermanagement.order.details.data.query package. 
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

    private final static QName _ListOfOrderDetail_QNAME = new QName("http://siebel.com/OrderManagement/Order/Details/Data/Query", "ListOfOrderDetail");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.siebel.ordermanagement.order.details.data.query
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link QueryType }
     * 
     */
    public QueryType createQueryType() {
        return new QueryType();
    }

    /**
     * Create an instance of {@link ListOfOrderItemXADetailQuery }
     * 
     */
    public ListOfOrderItemXADetailQuery createListOfOrderItemXADetailQuery() {
        return new ListOfOrderItemXADetailQuery();
    }

    /**
     * Create an instance of {@link OrderDetailQuery }
     * 
     */
    public OrderDetailQuery createOrderDetailQuery() {
        return new OrderDetailQuery();
    }

    /**
     * Create an instance of {@link OrderItemProductLineQuery }
     * 
     */
    public OrderItemProductLineQuery createOrderItemProductLineQuery() {
        return new OrderItemProductLineQuery();
    }

    /**
     * Create an instance of {@link ShipmentQuery }
     * 
     */
    public ShipmentQuery createShipmentQuery() {
        return new ShipmentQuery();
    }

    /**
     * Create an instance of {@link ListOfOrderApprovalHistoryQuery }
     * 
     */
    public ListOfOrderApprovalHistoryQuery createListOfOrderApprovalHistoryQuery() {
        return new ListOfOrderApprovalHistoryQuery();
    }

    /**
     * Create an instance of {@link OrderApprovalHistoryQuery }
     * 
     */
    public OrderApprovalHistoryQuery createOrderApprovalHistoryQuery() {
        return new OrderApprovalHistoryQuery();
    }

    /**
     * Create an instance of {@link ListOfOrderDetailTopElmtQuery }
     * 
     */
    public ListOfOrderDetailTopElmtQuery createListOfOrderDetailTopElmtQuery() {
        return new ListOfOrderDetailTopElmtQuery();
    }

    /**
     * Create an instance of {@link ListOfOrderDetailQuery }
     * 
     */
    public ListOfOrderDetailQuery createListOfOrderDetailQuery() {
        return new ListOfOrderDetailQuery();
    }

    /**
     * Create an instance of {@link ListOfOrderItemDetailQuery }
     * 
     */
    public ListOfOrderItemDetailQuery createListOfOrderItemDetailQuery() {
        return new ListOfOrderItemDetailQuery();
    }

    /**
     * Create an instance of {@link OrderItemDetailQuery }
     * 
     */
    public OrderItemDetailQuery createOrderItemDetailQuery() {
        return new OrderItemDetailQuery();
    }

    /**
     * Create an instance of {@link OrderPaymentsBillToAddressQuery }
     * 
     */
    public OrderPaymentsBillToAddressQuery createOrderPaymentsBillToAddressQuery() {
        return new OrderPaymentsBillToAddressQuery();
    }

    /**
     * Create an instance of {@link OrderPaymentQuery }
     * 
     */
    public OrderPaymentQuery createOrderPaymentQuery() {
        return new OrderPaymentQuery();
    }

    /**
     * Create an instance of {@link ShipmentItemQuery }
     * 
     */
    public ShipmentItemQuery createShipmentItemQuery() {
        return new ShipmentItemQuery();
    }

    /**
     * Create an instance of {@link OrderItemXADetailQuery }
     * 
     */
    public OrderItemXADetailQuery createOrderItemXADetailQuery() {
        return new OrderItemXADetailQuery();
    }

    /**
     * Create an instance of {@link ListOfOrderPaymentsBankAddressQuery }
     * 
     */
    public ListOfOrderPaymentsBankAddressQuery createListOfOrderPaymentsBankAddressQuery() {
        return new ListOfOrderPaymentsBankAddressQuery();
    }

    /**
     * Create an instance of {@link ListOfOrderPaymentQuery }
     * 
     */
    public ListOfOrderPaymentQuery createListOfOrderPaymentQuery() {
        return new ListOfOrderPaymentQuery();
    }

    /**
     * Create an instance of {@link ListOfOrderPaymentsBillToAddressQuery }
     * 
     */
    public ListOfOrderPaymentsBillToAddressQuery createListOfOrderPaymentsBillToAddressQuery() {
        return new ListOfOrderPaymentsBillToAddressQuery();
    }

    /**
     * Create an instance of {@link ListOfOrderItemProductLineQuery }
     * 
     */
    public ListOfOrderItemProductLineQuery createListOfOrderItemProductLineQuery() {
        return new ListOfOrderItemProductLineQuery();
    }

    /**
     * Create an instance of {@link ListOfShipmentItemQuery }
     * 
     */
    public ListOfShipmentItemQuery createListOfShipmentItemQuery() {
        return new ListOfShipmentItemQuery();
    }

    /**
     * Create an instance of {@link OrderPaymentsBankAddressQuery }
     * 
     */
    public OrderPaymentsBankAddressQuery createOrderPaymentsBankAddressQuery() {
        return new OrderPaymentsBankAddressQuery();
    }

    /**
     * Create an instance of {@link ListOfShipmentQuery }
     * 
     */
    public ListOfShipmentQuery createListOfShipmentQuery() {
        return new ListOfShipmentQuery();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListOfOrderDetailQuery }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://siebel.com/OrderManagement/Order/Details/Data/Query", name = "ListOfOrderDetail")
    public JAXBElement<ListOfOrderDetailQuery> createListOfOrderDetail(ListOfOrderDetailQuery value) {
        return new JAXBElement<ListOfOrderDetailQuery>(_ListOfOrderDetail_QNAME, ListOfOrderDetailQuery.class, null, value);
    }

}
