
package com.siebel.ordermanagement.catalog.data.productchildren;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.siebel.ordermanagement.catalog.data.productchildren package. 
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

    private final static QName _ListOfProductChildren_QNAME = new QName("http://siebel.com/OrderManagement/Catalog/Data/ProductChildren", "ListOfProductChildren");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.siebel.ordermanagement.catalog.data.productchildren
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Product }
     * 
     */
    public Product createProduct() {
        return new Product();
    }

    /**
     * Create an instance of {@link ListOfProductChildrenTopElmt }
     * 
     */
    public ListOfProductChildrenTopElmt createListOfProductChildrenTopElmt() {
        return new ListOfProductChildrenTopElmt();
    }

    /**
     * Create an instance of {@link ListOfKeyFeature }
     * 
     */
    public ListOfKeyFeature createListOfKeyFeature() {
        return new ListOfKeyFeature();
    }

    /**
     * Create an instance of {@link ListOfLiterature }
     * 
     */
    public ListOfLiterature createListOfLiterature() {
        return new ListOfLiterature();
    }

    /**
     * Create an instance of {@link ListOfProductChildren }
     * 
     */
    public ListOfProductChildren createListOfProductChildren() {
        return new ListOfProductChildren();
    }

    /**
     * Create an instance of {@link Literature }
     * 
     */
    public Literature createLiterature() {
        return new Literature();
    }

    /**
     * Create an instance of {@link KeyFeature }
     * 
     */
    public KeyFeature createKeyFeature() {
        return new KeyFeature();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListOfProductChildren }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://siebel.com/OrderManagement/Catalog/Data/ProductChildren", name = "ListOfProductChildren")
    public JAXBElement<ListOfProductChildren> createListOfProductChildren(ListOfProductChildren value) {
        return new JAXBElement<ListOfProductChildren>(_ListOfProductChildren_QNAME, ListOfProductChildren.class, null, value);
    }

}
