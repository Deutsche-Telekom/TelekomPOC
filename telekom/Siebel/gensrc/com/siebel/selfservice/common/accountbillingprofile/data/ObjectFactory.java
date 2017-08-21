
package com.siebel.selfservice.common.accountbillingprofile.data;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.siebel.selfservice.common.accountbillingprofile.data package. 
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

    private final static QName _ListOfSsAccountbillingprofileIo_QNAME = new QName("http://www.siebel.com/SelfService/Common/AccountBillingProfile/Data", "ListOfSs_Accountbillingprofile_Io");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.siebel.selfservice.common.accountbillingprofile.data
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ComInvoiceProfileData }
     * 
     */
    public ComInvoiceProfileData createComInvoiceProfileData() {
        return new ComInvoiceProfileData();
    }

    /**
     * Create an instance of {@link ListOfSsAccountbillingprofileIoData }
     * 
     */
    public ListOfSsAccountbillingprofileIoData createListOfSsAccountbillingprofileIoData() {
        return new ListOfSsAccountbillingprofileIoData();
    }

    /**
     * Create an instance of {@link ListOfSsAccountbillingprofileIoTopElmtData }
     * 
     */
    public ListOfSsAccountbillingprofileIoTopElmtData createListOfSsAccountbillingprofileIoTopElmtData() {
        return new ListOfSsAccountbillingprofileIoTopElmtData();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListOfSsAccountbillingprofileIoData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siebel.com/SelfService/Common/AccountBillingProfile/Data", name = "ListOfSs_Accountbillingprofile_Io")
    public JAXBElement<ListOfSsAccountbillingprofileIoData> createListOfSsAccountbillingprofileIo(ListOfSsAccountbillingprofileIoData value) {
        return new JAXBElement<ListOfSsAccountbillingprofileIoData>(_ListOfSsAccountbillingprofileIo_QNAME, ListOfSsAccountbillingprofileIoData.class, null, value);
    }

}
