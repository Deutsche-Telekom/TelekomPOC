
package com.siebel.selfservice.common.address.data;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.siebel.selfservice.common.address.data package. 
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

    private final static QName _ListOfSsAddressIo_QNAME = new QName("http://siebel.com/SelfService/Common/Address/Data", "ListOfSs_Address_Io");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.siebel.selfservice.common.address.data
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ListOfSsAddressIoTopElmtData }
     * 
     */
    public ListOfSsAddressIoTopElmtData createListOfSsAddressIoTopElmtData() {
        return new ListOfSsAddressIoTopElmtData();
    }

    /**
     * Create an instance of {@link CUTAddressMVAccountData }
     * 
     */
    public CUTAddressMVAccountData createCUTAddressMVAccountData() {
        return new CUTAddressMVAccountData();
    }

    /**
     * Create an instance of {@link CutAddressData }
     * 
     */
    public CutAddressData createCutAddressData() {
        return new CutAddressData();
    }

    /**
     * Create an instance of {@link ListOfSsAddressIoData }
     * 
     */
    public ListOfSsAddressIoData createListOfSsAddressIoData() {
        return new ListOfSsAddressIoData();
    }

    /**
     * Create an instance of {@link CUTAddressMVContactData }
     * 
     */
    public CUTAddressMVContactData createCUTAddressMVContactData() {
        return new CUTAddressMVContactData();
    }

    /**
     * Create an instance of {@link ListOfCUTAddressMVContactData }
     * 
     */
    public ListOfCUTAddressMVContactData createListOfCUTAddressMVContactData() {
        return new ListOfCUTAddressMVContactData();
    }

    /**
     * Create an instance of {@link ListOfCUTAddressMVAccountData }
     * 
     */
    public ListOfCUTAddressMVAccountData createListOfCUTAddressMVAccountData() {
        return new ListOfCUTAddressMVAccountData();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListOfSsAddressIoData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://siebel.com/SelfService/Common/Address/Data", name = "ListOfSs_Address_Io")
    public JAXBElement<ListOfSsAddressIoData> createListOfSsAddressIo(ListOfSsAddressIoData value) {
        return new JAXBElement<ListOfSsAddressIoData>(_ListOfSsAddressIo_QNAME, ListOfSsAddressIoData.class, null, value);
    }

}
