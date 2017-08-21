
package com.siebel.selfservice.common.account.query;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.siebel.selfservice.common.account.query package. 
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

    private final static QName _ListOfSSAccount_QNAME = new QName("http://www.siebel.com/SelfService/Common/Account/Query", "ListOfSSAccount");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.siebel.selfservice.common.account.query
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link QueryType }
     * 
     */
    public QueryType createQueryType() {
        return new QueryType();
    }

    /**
     * Create an instance of {@link ContactAlternatePhoneQuery }
     * 
     */
    public ContactAlternatePhoneQuery createContactAlternatePhoneQuery() {
        return new ContactAlternatePhoneQuery();
    }

    /**
     * Create an instance of {@link ListOfSSAccountQuery }
     * 
     */
    public ListOfSSAccountQuery createListOfSSAccountQuery() {
        return new ListOfSSAccountQuery();
    }

    /**
     * Create an instance of {@link ListOfContactAlternatePhoneQuery }
     * 
     */
    public ListOfContactAlternatePhoneQuery createListOfContactAlternatePhoneQuery() {
        return new ListOfContactAlternatePhoneQuery();
    }

    /**
     * Create an instance of {@link ListOfAccountBusinessAddressQuery }
     * 
     */
    public ListOfAccountBusinessAddressQuery createListOfAccountBusinessAddressQuery() {
        return new ListOfAccountBusinessAddressQuery();
    }

    /**
     * Create an instance of {@link ListOfContactQuery }
     * 
     */
    public ListOfContactQuery createListOfContactQuery() {
        return new ListOfContactQuery();
    }

    /**
     * Create an instance of {@link ContactQuery }
     * 
     */
    public ContactQuery createContactQuery() {
        return new ContactQuery();
    }

    /**
     * Create an instance of {@link AccountBusinessAddressQuery }
     * 
     */
    public AccountBusinessAddressQuery createAccountBusinessAddressQuery() {
        return new AccountBusinessAddressQuery();
    }

    /**
     * Create an instance of {@link BusinessAddressQuery }
     * 
     */
    public BusinessAddressQuery createBusinessAddressQuery() {
        return new BusinessAddressQuery();
    }

    /**
     * Create an instance of {@link ListOfSSAccountTopElmtQuery }
     * 
     */
    public ListOfSSAccountTopElmtQuery createListOfSSAccountTopElmtQuery() {
        return new ListOfSSAccountTopElmtQuery();
    }

    /**
     * Create an instance of {@link AccountQuery }
     * 
     */
    public AccountQuery createAccountQuery() {
        return new AccountQuery();
    }

    /**
     * Create an instance of {@link ListOfBusinessAddressQuery }
     * 
     */
    public ListOfBusinessAddressQuery createListOfBusinessAddressQuery() {
        return new ListOfBusinessAddressQuery();
    }

    /**
     * Create an instance of {@link ListOfContactCommunicationAddressQuery }
     * 
     */
    public ListOfContactCommunicationAddressQuery createListOfContactCommunicationAddressQuery() {
        return new ListOfContactCommunicationAddressQuery();
    }

    /**
     * Create an instance of {@link ContactCommunicationAddressQuery }
     * 
     */
    public ContactCommunicationAddressQuery createContactCommunicationAddressQuery() {
        return new ContactCommunicationAddressQuery();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListOfSSAccountQuery }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siebel.com/SelfService/Common/Account/Query", name = "ListOfSSAccount")
    public JAXBElement<ListOfSSAccountQuery> createListOfSSAccount(ListOfSSAccountQuery value) {
        return new JAXBElement<ListOfSSAccountQuery>(_ListOfSSAccount_QNAME, ListOfSSAccountQuery.class, null, value);
    }

}
