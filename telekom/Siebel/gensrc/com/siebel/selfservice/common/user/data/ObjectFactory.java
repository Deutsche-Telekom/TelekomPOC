
package com.siebel.selfservice.common.user.data;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.siebel.selfservice.common.user.data package. 
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

    private final static QName _ListOfSSUser_QNAME = new QName("http://www.siebel.com/SelfService/Common/User/Data", "ListOfSSUser");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.siebel.selfservice.common.user.data
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ListOfSSUserData }
     * 
     */
    public ListOfSSUserData createListOfSSUserData() {
        return new ListOfSSUserData();
    }

    /**
     * Create an instance of {@link SSUserResponsibilityData }
     * 
     */
    public SSUserResponsibilityData createSSUserResponsibilityData() {
        return new SSUserResponsibilityData();
    }

    /**
     * Create an instance of {@link UserData }
     * 
     */
    public UserData createUserData() {
        return new UserData();
    }

    /**
     * Create an instance of {@link ListOfSSUserResponsibilityData }
     * 
     */
    public ListOfSSUserResponsibilityData createListOfSSUserResponsibilityData() {
        return new ListOfSSUserResponsibilityData();
    }

    /**
     * Create an instance of {@link ListOfSSUserTopElmtData }
     * 
     */
    public ListOfSSUserTopElmtData createListOfSSUserTopElmtData() {
        return new ListOfSSUserTopElmtData();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListOfSSUserData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siebel.com/SelfService/Common/User/Data", name = "ListOfSSUser")
    public JAXBElement<ListOfSSUserData> createListOfSSUser(ListOfSSUserData value) {
        return new JAXBElement<ListOfSSUserData>(_ListOfSSUser_QNAME, ListOfSSUserData.class, null, value);
    }

}
