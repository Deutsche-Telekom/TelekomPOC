
package com.siebel.ordermanagement.configurator.cfginteractrequest;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.siebel.ordermanagement.configurator.cfginteractrequest package. 
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

    private final static QName _ListOfRequest_QNAME = new QName("http://siebel.com/OrderManagement/Configurator/CfgInteractRequest", "ListOfRequest");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.siebel.ordermanagement.configurator.cfginteractrequest
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AttributeValue }
     * 
     */
    public AttributeValue createAttributeValue() {
        return new AttributeValue();
    }

    /**
     * Create an instance of {@link ListOfRequestTopElmt }
     * 
     */
    public ListOfRequestTopElmt createListOfRequestTopElmt() {
        return new ListOfRequestTopElmt();
    }

    /**
     * Create an instance of {@link Attribute }
     * 
     */
    public Attribute createAttribute() {
        return new Attribute();
    }

    /**
     * Create an instance of {@link Item }
     * 
     */
    public Item createItem() {
        return new Item();
    }

    /**
     * Create an instance of {@link Requests }
     * 
     */
    public Requests createRequests() {
        return new Requests();
    }

    /**
     * Create an instance of {@link ListOfRequest }
     * 
     */
    public ListOfRequest createListOfRequest() {
        return new ListOfRequest();
    }

    /**
     * Create an instance of {@link Request }
     * 
     */
    public Request createRequest() {
        return new Request();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListOfRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://siebel.com/OrderManagement/Configurator/CfgInteractRequest", name = "ListOfRequest")
    public JAXBElement<ListOfRequest> createListOfRequest(ListOfRequest value) {
        return new JAXBElement<ListOfRequest>(_ListOfRequest_QNAME, ListOfRequest.class, null, value);
    }

}
