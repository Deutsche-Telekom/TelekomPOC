
package com.siebel.ordermanagement.configurator.cfginteractstatus;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.siebel.ordermanagement.configurator.cfginteractstatus package. 
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

    private final static QName _ListOfStatus_QNAME = new QName("http://siebel.com/OrderManagement/Configurator/CfgInteractStatus", "ListOfStatus");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.siebel.ordermanagement.configurator.cfginteractstatus
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Status }
     * 
     */
    public Status createStatus() {
        return new Status();
    }

    /**
     * Create an instance of {@link Message }
     * 
     */
    public Message createMessage() {
        return new Message();
    }

    /**
     * Create an instance of {@link ListOfStatusTopElmt }
     * 
     */
    public ListOfStatusTopElmt createListOfStatusTopElmt() {
        return new ListOfStatusTopElmt();
    }

    /**
     * Create an instance of {@link ListOfStatus }
     * 
     */
    public ListOfStatus createListOfStatus() {
        return new ListOfStatus();
    }

    /**
     * Create an instance of {@link MessageType }
     * 
     */
    public MessageType createMessageType() {
        return new MessageType();
    }

    /**
     * Create an instance of {@link Messages }
     * 
     */
    public Messages createMessages() {
        return new Messages();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListOfStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://siebel.com/OrderManagement/Configurator/CfgInteractStatus", name = "ListOfStatus")
    public JAXBElement<ListOfStatus> createListOfStatus(ListOfStatus value) {
        return new JAXBElement<ListOfStatus>(_ListOfStatus_QNAME, ListOfStatus.class, null, value);
    }

}
