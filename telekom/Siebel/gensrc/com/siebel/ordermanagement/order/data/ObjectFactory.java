
package com.siebel.ordermanagement.order.data;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.siebel.ordermanagement.order.data package. 
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

    private final static QName _ListOfOrder_QNAME = new QName("http://siebel.com/OrderManagement/Order/Data", "ListOfOrder");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.siebel.ordermanagement.order.data
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Order }
     * 
     */
    public Order createOrder() {
        return new Order();
    }

    /**
     * Create an instance of {@link ListOfOrderItemXA }
     * 
     */
    public ListOfOrderItemXA createListOfOrderItemXA() {
        return new ListOfOrderItemXA();
    }

    /**
     * Create an instance of {@link ListOfOrderItem }
     * 
     */
    public ListOfOrderItem createListOfOrderItem() {
        return new ListOfOrderItem();
    }

    /**
     * Create an instance of {@link OrderItemXA }
     * 
     */
    public OrderItemXA createOrderItemXA() {
        return new OrderItemXA();
    }

    /**
     * Create an instance of {@link ListOfOrderTopElmt }
     * 
     */
    public ListOfOrderTopElmt createListOfOrderTopElmt() {
        return new ListOfOrderTopElmt();
    }

    /**
     * Create an instance of {@link ListOfOrder }
     * 
     */
    public ListOfOrder createListOfOrder() {
        return new ListOfOrder();
    }

    /**
     * Create an instance of {@link OrderItem }
     * 
     */
    public OrderItem createOrderItem() {
        return new OrderItem();
    }

    /**
     * Create an instance of {@link ListOfOrderHeader }
     * 
     */
    public ListOfOrderHeader createListOfOrderHeader() {
        return new ListOfOrderHeader();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListOfOrder }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://siebel.com/OrderManagement/Order/Data", name = "ListOfOrder")
    public JAXBElement<ListOfOrder> createListOfOrder(ListOfOrder value) {
        return new JAXBElement<ListOfOrder>(_ListOfOrder_QNAME, ListOfOrder.class, null, value);
    }

}
