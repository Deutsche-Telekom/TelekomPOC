
package com.siebel.selfservice.common.address.id;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.siebel.selfservice.common.address.id package. 
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

    private final static QName _ListOfSsAddressIo_QNAME = new QName("http://siebel.com/SelfService/Common/Address/Id", "ListOfSs_Address_Io");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.siebel.selfservice.common.address.id
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CUTAddressMVAccountId }
     * 
     */
    public CUTAddressMVAccountId createCUTAddressMVAccountId() {
        return new CUTAddressMVAccountId();
    }

    /**
     * Create an instance of {@link ListOfSsAddressIoId }
     * 
     */
    public ListOfSsAddressIoId createListOfSsAddressIoId() {
        return new ListOfSsAddressIoId();
    }

    /**
     * Create an instance of {@link ListOfCUTAddressMVContactId }
     * 
     */
    public ListOfCUTAddressMVContactId createListOfCUTAddressMVContactId() {
        return new ListOfCUTAddressMVContactId();
    }

    /**
     * Create an instance of {@link CutAddressId }
     * 
     */
    public CutAddressId createCutAddressId() {
        return new CutAddressId();
    }

    /**
     * Create an instance of {@link ListOfSsAddressIoTopElmtId }
     * 
     */
    public ListOfSsAddressIoTopElmtId createListOfSsAddressIoTopElmtId() {
        return new ListOfSsAddressIoTopElmtId();
    }

    /**
     * Create an instance of {@link CUTAddressMVContactId }
     * 
     */
    public CUTAddressMVContactId createCUTAddressMVContactId() {
        return new CUTAddressMVContactId();
    }

    /**
     * Create an instance of {@link ListOfCUTAddressMVAccountId }
     * 
     */
    public ListOfCUTAddressMVAccountId createListOfCUTAddressMVAccountId() {
        return new ListOfCUTAddressMVAccountId();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListOfSsAddressIoId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://siebel.com/SelfService/Common/Address/Id", name = "ListOfSs_Address_Io")
    public JAXBElement<ListOfSsAddressIoId> createListOfSsAddressIo(ListOfSsAddressIoId value) {
        return new JAXBElement<ListOfSsAddressIoId>(_ListOfSsAddressIo_QNAME, ListOfSsAddressIoId.class, null, value);
    }

}
