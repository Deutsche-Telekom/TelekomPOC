
package com.siebel.selfservice.common.user.query;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.siebel.selfservice.common.user.query package. 
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

    private final static QName _ListOfSSUser_QNAME = new QName("http://www.siebel.com/SelfService/Common/User/Query", "ListOfSSUser");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.siebel.selfservice.common.user.query
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ListOfSSUserResponsibilityQuery }
     * 
     */
    public ListOfSSUserResponsibilityQuery createListOfSSUserResponsibilityQuery() {
        return new ListOfSSUserResponsibilityQuery();
    }

    /**
     * Create an instance of {@link QueryType }
     * 
     */
    public QueryType createQueryType() {
        return new QueryType();
    }

    /**
     * Create an instance of {@link ListOfSSUserQuery }
     * 
     */
    public ListOfSSUserQuery createListOfSSUserQuery() {
        return new ListOfSSUserQuery();
    }

    /**
     * Create an instance of {@link ListOfSSUserTopElmtQuery }
     * 
     */
    public ListOfSSUserTopElmtQuery createListOfSSUserTopElmtQuery() {
        return new ListOfSSUserTopElmtQuery();
    }

    /**
     * Create an instance of {@link UserQuery }
     * 
     */
    public UserQuery createUserQuery() {
        return new UserQuery();
    }

    /**
     * Create an instance of {@link SSUserResponsibilityQuery }
     * 
     */
    public SSUserResponsibilityQuery createSSUserResponsibilityQuery() {
        return new SSUserResponsibilityQuery();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListOfSSUserQuery }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siebel.com/SelfService/Common/User/Query", name = "ListOfSSUser")
    public JAXBElement<ListOfSSUserQuery> createListOfSSUser(ListOfSSUserQuery value) {
        return new JAXBElement<ListOfSSUserQuery>(_ListOfSSUser_QNAME, ListOfSSUserQuery.class, null, value);
    }

}
