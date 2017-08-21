
package com.siebel.selfservice.common.user.id;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.siebel.selfservice.common.user.id package. 
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

    private final static QName _ListOfSSUser_QNAME = new QName("http://www.siebel.com/SelfService/Common/User/Id", "ListOfSSUser");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.siebel.selfservice.common.user.id
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ListOfSSUserId }
     * 
     */
    public ListOfSSUserId createListOfSSUserId() {
        return new ListOfSSUserId();
    }

    /**
     * Create an instance of {@link ListOfSSUserResponsibilityId }
     * 
     */
    public ListOfSSUserResponsibilityId createListOfSSUserResponsibilityId() {
        return new ListOfSSUserResponsibilityId();
    }

    /**
     * Create an instance of {@link ListOfSSUserTopElmtId }
     * 
     */
    public ListOfSSUserTopElmtId createListOfSSUserTopElmtId() {
        return new ListOfSSUserTopElmtId();
    }

    /**
     * Create an instance of {@link UserId }
     * 
     */
    public UserId createUserId() {
        return new UserId();
    }

    /**
     * Create an instance of {@link SSUserResponsibilityId }
     * 
     */
    public SSUserResponsibilityId createSSUserResponsibilityId() {
        return new SSUserResponsibilityId();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListOfSSUserId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siebel.com/SelfService/Common/User/Id", name = "ListOfSSUser")
    public JAXBElement<ListOfSSUserId> createListOfSSUser(ListOfSSUserId value) {
        return new JAXBElement<ListOfSSUserId>(_ListOfSSUser_QNAME, ListOfSSUserId.class, null, value);
    }

}
