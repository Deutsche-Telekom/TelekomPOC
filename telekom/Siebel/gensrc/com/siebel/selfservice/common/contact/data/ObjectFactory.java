
package com.siebel.selfservice.common.contact.data;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.siebel.selfservice.common.contact.data package. 
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

    private final static QName _ListOfSSContact_QNAME = new QName("http://www.siebel.com/SelfService/Common/Contact/Data", "ListOfSSContact");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.siebel.selfservice.common.contact.data
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ListOfPersonalAddressData }
     * 
     */
    public ListOfPersonalAddressData createListOfPersonalAddressData() {
        return new ListOfPersonalAddressData();
    }

    /**
     * Create an instance of {@link ContactOrganizationData }
     * 
     */
    public ContactOrganizationData createContactOrganizationData() {
        return new ContactOrganizationData();
    }

    /**
     * Create an instance of {@link ListOfContactAccountData }
     * 
     */
    public ListOfContactAccountData createListOfContactAccountData() {
        return new ListOfContactAccountData();
    }

    /**
     * Create an instance of {@link ListOfSSContactData }
     * 
     */
    public ListOfSSContactData createListOfSSContactData() {
        return new ListOfSSContactData();
    }

    /**
     * Create an instance of {@link PersonalAddressData }
     * 
     */
    public PersonalAddressData createPersonalAddressData() {
        return new PersonalAddressData();
    }

    /**
     * Create an instance of {@link ListOfAccountOrganizationData }
     * 
     */
    public ListOfAccountOrganizationData createListOfAccountOrganizationData() {
        return new ListOfAccountOrganizationData();
    }

    /**
     * Create an instance of {@link ContactBusinessAddressData }
     * 
     */
    public ContactBusinessAddressData createContactBusinessAddressData() {
        return new ContactBusinessAddressData();
    }

    /**
     * Create an instance of {@link ContactCommunicationAddressData }
     * 
     */
    public ContactCommunicationAddressData createContactCommunicationAddressData() {
        return new ContactCommunicationAddressData();
    }

    /**
     * Create an instance of {@link ListOfContactPersonalAddressData }
     * 
     */
    public ListOfContactPersonalAddressData createListOfContactPersonalAddressData() {
        return new ListOfContactPersonalAddressData();
    }

    /**
     * Create an instance of {@link AccountOrganizationData }
     * 
     */
    public AccountOrganizationData createAccountOrganizationData() {
        return new AccountOrganizationData();
    }

    /**
     * Create an instance of {@link ContactAccountData }
     * 
     */
    public ContactAccountData createContactAccountData() {
        return new ContactAccountData();
    }

    /**
     * Create an instance of {@link ListOfSSContactTopElmtData }
     * 
     */
    public ListOfSSContactTopElmtData createListOfSSContactTopElmtData() {
        return new ListOfSSContactTopElmtData();
    }

    /**
     * Create an instance of {@link ListOfAccountData }
     * 
     */
    public ListOfAccountData createListOfAccountData() {
        return new ListOfAccountData();
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
     * Create an instance of {@link ListOfContactOrganizationData }
     * 
     */
    public ListOfContactOrganizationData createListOfContactOrganizationData() {
        return new ListOfContactOrganizationData();
    }

    /**
     * Create an instance of {@link AccountBusinessAddressData }
     * 
     */
    public AccountBusinessAddressData createAccountBusinessAddressData() {
        return new AccountBusinessAddressData();
    }

    /**
     * Create an instance of {@link ListOfContactBusinessAddressData }
     * 
     */
    public ListOfContactBusinessAddressData createListOfContactBusinessAddressData() {
        return new ListOfContactBusinessAddressData();
    }

    /**
     * Create an instance of {@link ListOfContactAlternatePhoneData }
     * 
     */
    public ListOfContactAlternatePhoneData createListOfContactAlternatePhoneData() {
        return new ListOfContactAlternatePhoneData();
    }

    /**
     * Create an instance of {@link ContactData }
     * 
     */
    public ContactData createContactData() {
        return new ContactData();
    }

    /**
     * Create an instance of {@link AccountData }
     * 
     */
    public AccountData createAccountData() {
        return new AccountData();
    }

    /**
     * Create an instance of {@link ContactPersonalAddressData }
     * 
     */
    public ContactPersonalAddressData createContactPersonalAddressData() {
        return new ContactPersonalAddressData();
    }

    /**
     * Create an instance of {@link ContactAlternatePhoneData }
     * 
     */
    public ContactAlternatePhoneData createContactAlternatePhoneData() {
        return new ContactAlternatePhoneData();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListOfSSContactData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siebel.com/SelfService/Common/Contact/Data", name = "ListOfSSContact")
    public JAXBElement<ListOfSSContactData> createListOfSSContact(ListOfSSContactData value) {
        return new JAXBElement<ListOfSSContactData>(_ListOfSSContact_QNAME, ListOfSSContactData.class, null, value);
    }

}
