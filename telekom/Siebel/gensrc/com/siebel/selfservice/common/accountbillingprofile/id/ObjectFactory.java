
package com.siebel.selfservice.common.accountbillingprofile.id;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.siebel.selfservice.common.accountbillingprofile.id package. 
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

    private final static QName _ListOfSsAccountbillingprofileIo_QNAME = new QName("http://www.siebel.com/SelfService/Common/AccountBillingProfile/Id", "ListOfSs_Accountbillingprofile_Io");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.siebel.selfservice.common.accountbillingprofile.id
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ListOfSsAccountbillingprofileIoId }
     * 
     */
    public ListOfSsAccountbillingprofileIoId createListOfSsAccountbillingprofileIoId() {
        return new ListOfSsAccountbillingprofileIoId();
    }

    /**
     * Create an instance of {@link ComInvoiceProfileId }
     * 
     */
    public ComInvoiceProfileId createComInvoiceProfileId() {
        return new ComInvoiceProfileId();
    }

    /**
     * Create an instance of {@link ListOfSsAccountbillingprofileIoTopElmtId }
     * 
     */
    public ListOfSsAccountbillingprofileIoTopElmtId createListOfSsAccountbillingprofileIoTopElmtId() {
        return new ListOfSsAccountbillingprofileIoTopElmtId();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListOfSsAccountbillingprofileIoId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siebel.com/SelfService/Common/AccountBillingProfile/Id", name = "ListOfSs_Accountbillingprofile_Io")
    public JAXBElement<ListOfSsAccountbillingprofileIoId> createListOfSsAccountbillingprofileIo(ListOfSsAccountbillingprofileIoId value) {
        return new JAXBElement<ListOfSsAccountbillingprofileIoId>(_ListOfSsAccountbillingprofileIo_QNAME, ListOfSsAccountbillingprofileIoId.class, null, value);
    }

}
