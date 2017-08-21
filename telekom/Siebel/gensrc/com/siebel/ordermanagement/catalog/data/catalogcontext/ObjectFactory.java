
package com.siebel.ordermanagement.catalog.data.catalogcontext;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.siebel.ordermanagement.catalog.data.catalogcontext package. 
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

    private final static QName _ListOfContext_QNAME = new QName("http://siebel.com/OrderManagement/Catalog/Data/CatalogContext", "ListOfContext");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.siebel.ordermanagement.catalog.data.catalogcontext
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SiebelContext }
     * 
     */
    public SiebelContext createSiebelContext() {
        return new SiebelContext();
    }

    /**
     * Create an instance of {@link Context }
     * 
     */
    public Context createContext() {
        return new Context();
    }

    /**
     * Create an instance of {@link ExternalContext }
     * 
     */
    public ExternalContext createExternalContext() {
        return new ExternalContext();
    }

    /**
     * Create an instance of {@link ListOfContextTopElmt }
     * 
     */
    public ListOfContextTopElmt createListOfContextTopElmt() {
        return new ListOfContextTopElmt();
    }

    /**
     * Create an instance of {@link ListOfContext }
     * 
     */
    public ListOfContext createListOfContext() {
        return new ListOfContext();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListOfContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://siebel.com/OrderManagement/Catalog/Data/CatalogContext", name = "ListOfContext")
    public JAXBElement<ListOfContext> createListOfContext(ListOfContext value) {
        return new JAXBElement<ListOfContext>(_ListOfContext_QNAME, ListOfContext.class, null, value);
    }

}
