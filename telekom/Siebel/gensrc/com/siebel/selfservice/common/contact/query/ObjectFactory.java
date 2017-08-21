
package com.siebel.selfservice.common.contact.query;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.siebel.selfservice.common.contact.query package. 
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

    private final static QName _ListOfSSContact_QNAME = new QName("http://www.siebel.com/SelfService/Common/Contact/Query", "ListOfSSContact");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.siebel.selfservice.common.contact.query
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ListOfSSContactTopElmtQuery }
     * 
     */
    public ListOfSSContactTopElmtQuery createListOfSSContactTopElmtQuery() {
        return new ListOfSSContactTopElmtQuery();
    }

    /**
     * Create an instance of {@link ContactOrganizationQuery }
     * 
     */
    public ContactOrganizationQuery createContactOrganizationQuery() {
        return new ContactOrganizationQuery();
    }

    /**
     * Create an instance of {@link ListOfContactAccountQuery }
     * 
     */
    public ListOfContactAccountQuery createListOfContactAccountQuery() {
        return new ListOfContactAccountQuery();
    }

    /**
     * Create an instance of {@link ListOfContactAlternatePhoneQuery }
     * 
     */
    public ListOfContactAlternatePhoneQuery createListOfContactAlternatePhoneQuery() {
        return new ListOfContactAlternatePhoneQuery();
    }

    /**
     * Create an instance of {@link QueryType }
     * 
     */
    public QueryType createQueryType() {
        return new QueryType();
    }

    /**
     * Create an instance of {@link ListOfPersonalAddressQuery }
     * 
     */
    public ListOfPersonalAddressQuery createListOfPersonalAddressQuery() {
        return new ListOfPersonalAddressQuery();
    }

    /**
     * Create an instance of {@link AccountBusinessAddressQuery }
     * 
     */
    public AccountBusinessAddressQuery createAccountBusinessAddressQuery() {
        return new AccountBusinessAddressQuery();
    }

    /**
     * Create an instance of {@link ListOfAccountOrganizationQuery }
     * 
     */
    public ListOfAccountOrganizationQuery createListOfAccountOrganizationQuery() {
        return new ListOfAccountOrganizationQuery();
    }

    /**
     * Create an instance of {@link ListOfContactOrganizationQuery }
     * 
     */
    public ListOfContactOrganizationQuery createListOfContactOrganizationQuery() {
        return new ListOfContactOrganizationQuery();
    }

    /**
     * Create an instance of {@link PersonalAddressQuery }
     * 
     */
    public PersonalAddressQuery createPersonalAddressQuery() {
        return new PersonalAddressQuery();
    }

    /**
     * Create an instance of {@link ContactAccountQuery }
     * 
     */
    public ContactAccountQuery createContactAccountQuery() {
        return new ContactAccountQuery();
    }

    /**
     * Create an instance of {@link AccountOrganizationQuery }
     * 
     */
    public AccountOrganizationQuery createAccountOrganizationQuery() {
        return new AccountOrganizationQuery();
    }

    /**
     * Create an instance of {@link ListOfContactPersonalAddressQuery }
     * 
     */
    public ListOfContactPersonalAddressQuery createListOfContactPersonalAddressQuery() {
        return new ListOfContactPersonalAddressQuery();
    }

    /**
     * Create an instance of {@link ListOfAccountQuery }
     * 
     */
    public ListOfAccountQuery createListOfAccountQuery() {
        return new ListOfAccountQuery();
    }

    /**
     * Create an instance of {@link AccountQuery }
     * 
     */
    public AccountQuery createAccountQuery() {
        return new AccountQuery();
    }

    /**
     * Create an instance of {@link ContactAlternatePhoneQuery }
     * 
     */
    public ContactAlternatePhoneQuery createContactAlternatePhoneQuery() {
        return new ContactAlternatePhoneQuery();
    }

    /**
     * Create an instance of {@link ListOfContactBusinessAddressQuery }
     * 
     */
    public ListOfContactBusinessAddressQuery createListOfContactBusinessAddressQuery() {
        return new ListOfContactBusinessAddressQuery();
    }

    /**
     * Create an instance of {@link ListOfContactCommunicationAddressQuery }
     * 
     */
    public ListOfContactCommunicationAddressQuery createListOfContactCommunicationAddressQuery() {
        return new ListOfContactCommunicationAddressQuery();
    }

    /**
     * Create an instance of {@link ContactQuery }
     * 
     */
    public ContactQuery createContactQuery() {
        return new ContactQuery();
    }

    /**
     * Create an instance of {@link ContactCommunicationAddressQuery }
     * 
     */
    public ContactCommunicationAddressQuery createContactCommunicationAddressQuery() {
        return new ContactCommunicationAddressQuery();
    }

    /**
     * Create an instance of {@link ListOfSSContactQuery }
     * 
     */
    public ListOfSSContactQuery createListOfSSContactQuery() {
        return new ListOfSSContactQuery();
    }

    /**
     * Create an instance of {@link ContactPersonalAddressQuery }
     * 
     */
    public ContactPersonalAddressQuery createContactPersonalAddressQuery() {
        return new ContactPersonalAddressQuery();
    }

    /**
     * Create an instance of {@link ContactBusinessAddressQuery }
     * 
     */
    public ContactBusinessAddressQuery createContactBusinessAddressQuery() {
        return new ContactBusinessAddressQuery();
    }

    /**
     * Create an instance of {@link ListOfAccountBusinessAddressQuery }
     * 
     */
    public ListOfAccountBusinessAddressQuery createListOfAccountBusinessAddressQuery() {
        return new ListOfAccountBusinessAddressQuery();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListOfSSContactQuery }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siebel.com/SelfService/Common/Contact/Query", name = "ListOfSSContact")
    public JAXBElement<ListOfSSContactQuery> createListOfSSContact(ListOfSSContactQuery value) {
        return new JAXBElement<ListOfSSContactQuery>(_ListOfSSContact_QNAME, ListOfSSContactQuery.class, null, value);
    }

}
