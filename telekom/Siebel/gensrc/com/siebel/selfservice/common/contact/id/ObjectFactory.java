
package com.siebel.selfservice.common.contact.id;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.siebel.selfservice.common.contact.id package. 
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

    private final static QName _ListOfSSContact_QNAME = new QName("http://www.siebel.com/SelfService/Common/Contact/Id", "ListOfSSContact");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.siebel.selfservice.common.contact.id
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ContactPersonalAddressId }
     * 
     */
    public ContactPersonalAddressId createContactPersonalAddressId() {
        return new ContactPersonalAddressId();
    }

    /**
     * Create an instance of {@link ListOfContactBusinessAddressId }
     * 
     */
    public ListOfContactBusinessAddressId createListOfContactBusinessAddressId() {
        return new ListOfContactBusinessAddressId();
    }

    /**
     * Create an instance of {@link ContactBusinessAddressId }
     * 
     */
    public ContactBusinessAddressId createContactBusinessAddressId() {
        return new ContactBusinessAddressId();
    }

    /**
     * Create an instance of {@link AccountOrganizationId }
     * 
     */
    public AccountOrganizationId createAccountOrganizationId() {
        return new AccountOrganizationId();
    }

    /**
     * Create an instance of {@link ListOfContactPersonalAddressId }
     * 
     */
    public ListOfContactPersonalAddressId createListOfContactPersonalAddressId() {
        return new ListOfContactPersonalAddressId();
    }

    /**
     * Create an instance of {@link AccountId }
     * 
     */
    public AccountId createAccountId() {
        return new AccountId();
    }

    /**
     * Create an instance of {@link ListOfSSContactId }
     * 
     */
    public ListOfSSContactId createListOfSSContactId() {
        return new ListOfSSContactId();
    }

    /**
     * Create an instance of {@link ContactOrganizationId }
     * 
     */
    public ContactOrganizationId createContactOrganizationId() {
        return new ContactOrganizationId();
    }

    /**
     * Create an instance of {@link ListOfAccountId }
     * 
     */
    public ListOfAccountId createListOfAccountId() {
        return new ListOfAccountId();
    }

    /**
     * Create an instance of {@link ListOfPersonalAddressId }
     * 
     */
    public ListOfPersonalAddressId createListOfPersonalAddressId() {
        return new ListOfPersonalAddressId();
    }

    /**
     * Create an instance of {@link ListOfContactOrganizationId }
     * 
     */
    public ListOfContactOrganizationId createListOfContactOrganizationId() {
        return new ListOfContactOrganizationId();
    }

    /**
     * Create an instance of {@link PersonalAddressId }
     * 
     */
    public PersonalAddressId createPersonalAddressId() {
        return new PersonalAddressId();
    }

    /**
     * Create an instance of {@link ContactAccountId }
     * 
     */
    public ContactAccountId createContactAccountId() {
        return new ContactAccountId();
    }

    /**
     * Create an instance of {@link ContactId }
     * 
     */
    public ContactId createContactId() {
        return new ContactId();
    }

    /**
     * Create an instance of {@link ContactAlternatePhoneId }
     * 
     */
    public ContactAlternatePhoneId createContactAlternatePhoneId() {
        return new ContactAlternatePhoneId();
    }

    /**
     * Create an instance of {@link ContactCommunicationAddressId }
     * 
     */
    public ContactCommunicationAddressId createContactCommunicationAddressId() {
        return new ContactCommunicationAddressId();
    }

    /**
     * Create an instance of {@link ListOfAccountOrganizationId }
     * 
     */
    public ListOfAccountOrganizationId createListOfAccountOrganizationId() {
        return new ListOfAccountOrganizationId();
    }

    /**
     * Create an instance of {@link AccountBusinessAddressId }
     * 
     */
    public AccountBusinessAddressId createAccountBusinessAddressId() {
        return new AccountBusinessAddressId();
    }

    /**
     * Create an instance of {@link ListOfSSContactTopElmtId }
     * 
     */
    public ListOfSSContactTopElmtId createListOfSSContactTopElmtId() {
        return new ListOfSSContactTopElmtId();
    }

    /**
     * Create an instance of {@link ListOfContactAlternatePhoneId }
     * 
     */
    public ListOfContactAlternatePhoneId createListOfContactAlternatePhoneId() {
        return new ListOfContactAlternatePhoneId();
    }

    /**
     * Create an instance of {@link ListOfAccountBusinessAddressId }
     * 
     */
    public ListOfAccountBusinessAddressId createListOfAccountBusinessAddressId() {
        return new ListOfAccountBusinessAddressId();
    }

    /**
     * Create an instance of {@link ListOfContactCommunicationAddressId }
     * 
     */
    public ListOfContactCommunicationAddressId createListOfContactCommunicationAddressId() {
        return new ListOfContactCommunicationAddressId();
    }

    /**
     * Create an instance of {@link ListOfContactAccountId }
     * 
     */
    public ListOfContactAccountId createListOfContactAccountId() {
        return new ListOfContactAccountId();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListOfSSContactId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siebel.com/SelfService/Common/Contact/Id", name = "ListOfSSContact")
    public JAXBElement<ListOfSSContactId> createListOfSSContact(ListOfSSContactId value) {
        return new JAXBElement<ListOfSSContactId>(_ListOfSSContact_QNAME, ListOfSSContactId.class, null, value);
    }

}
