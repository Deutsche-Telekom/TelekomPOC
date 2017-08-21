
package com.siebel.ordermanagement.catalog.data.catalog;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.siebel.ordermanagement.catalog.data.catalog package. 
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

    private final static QName _ListOfCatalog_QNAME = new QName("http://siebel.com/OrderManagement/Catalog/Data/Catalog", "ListOfCatalog");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.siebel.ordermanagement.catalog.data.catalog
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ListOfCatalog }
     * 
     */
    public ListOfCatalog createListOfCatalog() {
        return new ListOfCatalog();
    }

    /**
     * Create an instance of {@link Catalog }
     * 
     */
    public Catalog createCatalog() {
        return new Catalog();
    }

    /**
     * Create an instance of {@link ListOfCatalogTopElmt }
     * 
     */
    public ListOfCatalogTopElmt createListOfCatalogTopElmt() {
        return new ListOfCatalogTopElmt();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListOfCatalog }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://siebel.com/OrderManagement/Catalog/Data/Catalog", name = "ListOfCatalog")
    public JAXBElement<ListOfCatalog> createListOfCatalog(ListOfCatalog value) {
        return new JAXBElement<ListOfCatalog>(_ListOfCatalog_QNAME, ListOfCatalog.class, null, value);
    }

}
