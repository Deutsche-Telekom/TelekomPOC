
package com.siebel.selfservice.common.account.data;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.siebel.selfservice.common.account.data package. 
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

    private final static QName _ListOfSSAccount_QNAME = new QName("http://www.siebel.com/SelfService/Common/Account/Data", "ListOfSSAccount");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.siebel.selfservice.common.account.data
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ContactData }
     * 
     */
    public ContactData createContactData() {
        return new ContactData();
    }

    /**
     * Create an instance of {@link ListOfSSAccountData }
     * 
     */
    public ListOfSSAccountData createListOfSSAccountData() {
        return new ListOfSSAccountData();
    }

    /**
     * Create an instance of {@link BusinessAddressData }
     * 
     */
    public BusinessAddressData createBusinessAddressData() {
        return new BusinessAddressData();
    }

    /**
     * Create an instance of {@link ListOfBusinessAddressData }
     * 
     */
    public ListOfBusinessAddressData createListOfBusinessAddressData() {
        return new ListOfBusinessAddressData();
    }

    /**
     * Create an instance of {@link AccountData }
     * 
     */
    public AccountData createAccountData() {
        return new AccountData();
    }

    /**
     * Create an instance of {@link ListOfContactData }
     * 
     */
    public ListOfContactData createListOfContactData() {
        return new ListOfContactData();
    }

    /**
     * Create an instance of {@link ContactCommunicationAddressData }
     * 
     */
    public ContactCommunicationAddressData createContactCommunicationAddressData() {
        return new ContactCommunicationAddressData();
    }

    /**
     * Create an instance of {@link ContactAlternatePhoneData }
     * 
     */
    public ContactAlternatePhoneData createContactAlternatePhoneData() {
        return new ContactAlternatePhoneData();
    }

    /**
     * Create an instance of {@link ListOfSSAccountTopElmtData }
     * 
     */
    public ListOfSSAccountTopElmtData createListOfSSAccountTopElmtData() {
        return new ListOfSSAccountTopElmtData();
    }

    /**
     * Create an instance of {@link ListOfContactAlternatePhoneData }
     * 
     */
    public ListOfContactAlternatePhoneData createListOfContactAlternatePhoneData() {
        return new ListOfContactAlternatePhoneData();
    }

    /**
     * Create an instance of {@link ListOfContactCommunicationAddressData }
     * 
     */
    public ListOfContactCommunicationAddressData createListOfContactCommunicationAddressData() {
        return new ListOfContactCommunicationAddressData();
    }

    /**
     * Create an instance of {@link ListOfAccountBusinessAddressData }
     * 
     */
    public ListOfAccountBusinessAddressData createListOfAccountBusinessAddressData() {
        return new ListOfAccountBusinessAddressData();
    }

    /**
     * Create an instance of {@link AccountBusinessAddressData }
     * 
     */
    public AccountBusinessAddressData createAccountBusinessAddressData() {
        return new AccountBusinessAddressData();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListOfSSAccountData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siebel.com/SelfService/Common/Account/Data", name = "ListOfSSAccount")
    public JAXBElement<ListOfSSAccountData> createListOfSSAccount(ListOfSSAccountData value) {
        return new JAXBElement<ListOfSSAccountData>(_ListOfSSAccount_QNAME, ListOfSSAccountData.class, null, value);
    }

}
