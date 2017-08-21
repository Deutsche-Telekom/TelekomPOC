
package com.siebel.ordermanagement.catalog.data.productclassattributes;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.siebel.ordermanagement.catalog.data.productclassattributes package. 
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

    private final static QName _ListOfProductClassAttributes_QNAME = new QName("http://siebel.com/OrderManagement/Catalog/Data/ProductClassAttributes", "ListOfProductClassAttributes");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.siebel.ordermanagement.catalog.data.productclassattributes
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ListOfProductClassAttributes }
     * 
     */
    public ListOfProductClassAttributes createListOfProductClassAttributes() {
        return new ListOfProductClassAttributes();
    }

    /**
     * Create an instance of {@link ListOfProductClassAttributesTopElmt }
     * 
     */
    public ListOfProductClassAttributesTopElmt createListOfProductClassAttributesTopElmt() {
        return new ListOfProductClassAttributesTopElmt();
    }

    /**
     * Create an instance of {@link ProductClassAttributes }
     * 
     */
    public ProductClassAttributes createProductClassAttributes() {
        return new ProductClassAttributes();
    }

    /**
     * Create an instance of {@link SearchableProductClass }
     * 
     */
    public SearchableProductClass createSearchableProductClass() {
        return new SearchableProductClass();
    }

    /**
     * Create an instance of {@link LOVValue }
     * 
     */
    public LOVValue createLOVValue() {
        return new LOVValue();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListOfProductClassAttributes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://siebel.com/OrderManagement/Catalog/Data/ProductClassAttributes", name = "ListOfProductClassAttributes")
    public JAXBElement<ListOfProductClassAttributes> createListOfProductClassAttributes(ListOfProductClassAttributes value) {
        return new JAXBElement<ListOfProductClassAttributes>(_ListOfProductClassAttributes_QNAME, ListOfProductClassAttributes.class, null, value);
    }

}
