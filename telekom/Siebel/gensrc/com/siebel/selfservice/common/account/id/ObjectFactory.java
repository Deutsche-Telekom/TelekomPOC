
package com.siebel.selfservice.common.account.id;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.siebel.selfservice.common.account.id package. 
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

    private final static QName _ListOfSSAccount_QNAME = new QName("http://www.siebel.com/SelfService/Common/Account/Id", "ListOfSSAccount");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.siebel.selfservice.common.account.id
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ListOfContactAlternatePhoneId }
     * 
     */
    public ListOfContactAlternatePhoneId createListOfContactAlternatePhoneId() {
        return new ListOfContactAlternatePhoneId();
    }

    /**
     * Create an instance of {@link ContactAlternatePhoneId }
     * 
     */
    public ContactAlternatePhoneId createContactAlternatePhoneId() {
        return new ContactAlternatePhoneId();
    }

    /**
     * Create an instance of {@link ListOfSSAccountTopElmtId }
     * 
     */
    public ListOfSSAccountTopElmtId createListOfSSAccountTopElmtId() {
        return new ListOfSSAccountTopElmtId();
    }

    /**
     * Create an instance of {@link ListOfAccountBusinessAddressId }
     * 
     */
    public ListOfAccountBusinessAddressId createListOfAccountBusinessAddressId() {
        return new ListOfAccountBusinessAddressId();
    }

    /**
     * Create an instance of {@link ContactId }
     * 
     */
    public ContactId createContactId() {
        return new ContactId();
    }

    /**
     * Create an instance of {@link ListOfContactId }
     * 
     */
    public ListOfContactId createListOfContactId() {
        return new ListOfContactId();
    }

    /**
     * Create an instance of {@link ListOfContactCommunicationAddressId }
     * 
     */
    public ListOfContactCommunicationAddressId createListOfContactCommunicationAddressId() {
        return new ListOfContactCommunicationAddressId();
    }

    /**
     * Create an instance of {@link AccountBusinessAddressId }
     * 
     */
    public AccountBusinessAddressId createAccountBusinessAddressId() {
        return new AccountBusinessAddressId();
    }

    /**
     * Create an instance of {@link ListOfSSAccountId }
     * 
     */
    public ListOfSSAccountId createListOfSSAccountId() {
        return new ListOfSSAccountId();
    }

    /**
     * Create an instance of {@link AccountId }
     * 
     */
    public AccountId createAccountId() {
        return new AccountId();
    }

    /**
     * Create an instance of {@link ContactCommunicationAddressId }
     * 
     */
    public ContactCommunicationAddressId createContactCommunicationAddressId() {
        return new ContactCommunicationAddressId();
    }

    /**
     * Create an instance of {@link BusinessAddressId }
     * 
     */
    public BusinessAddressId createBusinessAddressId() {
        return new BusinessAddressId();
    }

    /**
     * Create an instance of {@link ListOfBusinessAddressId }
     * 
     */
    public ListOfBusinessAddressId createListOfBusinessAddressId() {
        return new ListOfBusinessAddressId();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListOfSSAccountId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siebel.com/SelfService/Common/Account/Id", name = "ListOfSSAccount")
    public JAXBElement<ListOfSSAccountId> createListOfSSAccount(ListOfSSAccountId value) {
        return new JAXBElement<ListOfSSAccountId>(_ListOfSSAccount_QNAME, ListOfSSAccountId.class, null, value);
    }

}
