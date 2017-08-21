
package com.siebel.selfservice.common.accountbillingprofile.query;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.siebel.selfservice.common.accountbillingprofile.query package. 
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

    private final static QName _ListOfSsAccountbillingprofileIo_QNAME = new QName("http://www.siebel.com/SelfService/Common/AccountBillingProfile/Query", "ListOfSs_Accountbillingprofile_Io");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.siebel.selfservice.common.accountbillingprofile.query
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ComInvoiceProfileQuery }
     * 
     */
    public ComInvoiceProfileQuery createComInvoiceProfileQuery() {
        return new ComInvoiceProfileQuery();
    }

    /**
     * Create an instance of {@link QueryType }
     * 
     */
    public QueryType createQueryType() {
        return new QueryType();
    }

    /**
     * Create an instance of {@link ListOfSsAccountbillingprofileIoTopElmtQuery }
     * 
     */
    public ListOfSsAccountbillingprofileIoTopElmtQuery createListOfSsAccountbillingprofileIoTopElmtQuery() {
        return new ListOfSsAccountbillingprofileIoTopElmtQuery();
    }

    /**
     * Create an instance of {@link ListOfSsAccountbillingprofileIoQuery }
     * 
     */
    public ListOfSsAccountbillingprofileIoQuery createListOfSsAccountbillingprofileIoQuery() {
        return new ListOfSsAccountbillingprofileIoQuery();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListOfSsAccountbillingprofileIoQuery }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siebel.com/SelfService/Common/AccountBillingProfile/Query", name = "ListOfSs_Accountbillingprofile_Io")
    public JAXBElement<ListOfSsAccountbillingprofileIoQuery> createListOfSsAccountbillingprofileIo(ListOfSsAccountbillingprofileIoQuery value) {
        return new JAXBElement<ListOfSsAccountbillingprofileIoQuery>(_ListOfSsAccountbillingprofileIo_QNAME, ListOfSsAccountbillingprofileIoQuery.class, null, value);
    }

}
