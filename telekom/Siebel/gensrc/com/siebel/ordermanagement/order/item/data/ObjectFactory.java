
package com.siebel.ordermanagement.order.item.data;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.siebel.ordermanagement.order.item.data package. 
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

    private final static QName _ListOfOrderItemBO_QNAME = new QName("http://siebel.com/OrderManagement/Order/Item/Data", "ListOfOrderItemBO");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.siebel.ordermanagement.order.item.data
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link OrderItemXA }
     * 
     */
    public OrderItemXA createOrderItemXA() {
        return new OrderItemXA();
    }

    /**
     * Create an instance of {@link ListOfOrderItem }
     * 
     */
    public ListOfOrderItem createListOfOrderItem() {
        return new ListOfOrderItem();
    }

    /**
     * Create an instance of {@link OrderItem }
     * 
     */
    public OrderItem createOrderItem() {
        return new OrderItem();
    }

    /**
     * Create an instance of {@link ListOfOrderItemBO }
     * 
     */
    public ListOfOrderItemBO createListOfOrderItemBO() {
        return new ListOfOrderItemBO();
    }

    /**
     * Create an instance of {@link ListOfOrderItemBOTopElmt }
     * 
     */
    public ListOfOrderItemBOTopElmt createListOfOrderItemBOTopElmt() {
        return new ListOfOrderItemBOTopElmt();
    }

    /**
     * Create an instance of {@link ListOfOrderItemXA }
     * 
     */
    public ListOfOrderItemXA createListOfOrderItemXA() {
        return new ListOfOrderItemXA();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListOfOrderItemBO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://siebel.com/OrderManagement/Order/Item/Data", name = "ListOfOrderItemBO")
    public JAXBElement<ListOfOrderItemBO> createListOfOrderItemBO(ListOfOrderItemBO value) {
        return new JAXBElement<ListOfOrderItemBO>(_ListOfOrderItemBO_QNAME, ListOfOrderItemBO.class, null, value);
    }

}
