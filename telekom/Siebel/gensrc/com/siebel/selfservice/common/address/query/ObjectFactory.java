
package com.siebel.selfservice.common.address.query;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.siebel.selfservice.common.address.query package. 
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

    private final static QName _ListOfSsAddressIo_QNAME = new QName("http://siebel.com/SelfService/Common/Address/Query", "ListOfSs_Address_Io");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.siebel.selfservice.common.address.query
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CUTAddressMVContactQuery }
     * 
     */
    public CUTAddressMVContactQuery createCUTAddressMVContactQuery() {
        return new CUTAddressMVContactQuery();
    }

    /**
     * Create an instance of {@link ListOfCUTAddressMVAccountQuery }
     * 
     */
    public ListOfCUTAddressMVAccountQuery createListOfCUTAddressMVAccountQuery() {
        return new ListOfCUTAddressMVAccountQuery();
    }

    /**
     * Create an instance of {@link QueryType }
     * 
     */
    public QueryType createQueryType() {
        return new QueryType();
    }

    /**
     * Create an instance of {@link ListOfCUTAddressMVContactQuery }
     * 
     */
    public ListOfCUTAddressMVContactQuery createListOfCUTAddressMVContactQuery() {
        return new ListOfCUTAddressMVContactQuery();
    }

    /**
     * Create an instance of {@link ListOfSsAddressIoTopElmtQuery }
     * 
     */
    public ListOfSsAddressIoTopElmtQuery createListOfSsAddressIoTopElmtQuery() {
        return new ListOfSsAddressIoTopElmtQuery();
    }

    /**
     * Create an instance of {@link CUTAddressMVAccountQuery }
     * 
     */
    public CUTAddressMVAccountQuery createCUTAddressMVAccountQuery() {
        return new CUTAddressMVAccountQuery();
    }

    /**
     * Create an instance of {@link ListOfSsAddressIoQuery }
     * 
     */
    public ListOfSsAddressIoQuery createListOfSsAddressIoQuery() {
        return new ListOfSsAddressIoQuery();
    }

    /**
     * Create an instance of {@link CutAddressQuery }
     * 
     */
    public CutAddressQuery createCutAddressQuery() {
        return new CutAddressQuery();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListOfSsAddressIoQuery }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://siebel.com/SelfService/Common/Address/Query", name = "ListOfSs_Address_Io")
    public JAXBElement<ListOfSsAddressIoQuery> createListOfSsAddressIo(ListOfSsAddressIoQuery value) {
        return new JAXBElement<ListOfSsAddressIoQuery>(_ListOfSsAddressIo_QNAME, ListOfSsAddressIoQuery.class, null, value);
    }

}
