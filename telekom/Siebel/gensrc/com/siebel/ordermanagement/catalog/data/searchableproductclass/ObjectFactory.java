
package com.siebel.ordermanagement.catalog.data.searchableproductclass;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.siebel.ordermanagement.catalog.data.searchableproductclass package. 
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

    private final static QName _ListOfSearchableProductClass_QNAME = new QName("http://siebel.com/OrderManagement/Catalog/Data/SearchableProductClass", "ListOfSearchableProductClass");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.siebel.ordermanagement.catalog.data.searchableproductclass
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ListOfSearchableProductClass }
     * 
     */
    public ListOfSearchableProductClass createListOfSearchableProductClass() {
        return new ListOfSearchableProductClass();
    }

    /**
     * Create an instance of {@link ListOfSearchableProductClassTopElmt }
     * 
     */
    public ListOfSearchableProductClassTopElmt createListOfSearchableProductClassTopElmt() {
        return new ListOfSearchableProductClassTopElmt();
    }

    /**
     * Create an instance of {@link SearchableProductClass }
     * 
     */
    public SearchableProductClass createSearchableProductClass() {
        return new SearchableProductClass();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListOfSearchableProductClass }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://siebel.com/OrderManagement/Catalog/Data/SearchableProductClass", name = "ListOfSearchableProductClass")
    public JAXBElement<ListOfSearchableProductClass> createListOfSearchableProductClass(ListOfSearchableProductClass value) {
        return new JAXBElement<ListOfSearchableProductClass>(_ListOfSearchableProductClass_QNAME, ListOfSearchableProductClass.class, null, value);
    }

}
