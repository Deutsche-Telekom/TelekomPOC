
package com.siebel.ordermanagement.catalog.data.productdetails;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.siebel.ordermanagement.catalog.data.productdetails package. 
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

    private final static QName _ListOfProduct_QNAME = new QName("http://siebel.com/OrderManagement/Catalog/Data/ProductDetails", "ListOfProduct");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.siebel.ordermanagement.catalog.data.productdetails
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ListOfProductTopElmt }
     * 
     */
    public ListOfProductTopElmt createListOfProductTopElmt() {
        return new ListOfProductTopElmt();
    }

    /**
     * Create an instance of {@link ProductAttribute }
     * 
     */
    public ProductAttribute createProductAttribute() {
        return new ProductAttribute();
    }

    /**
     * Create an instance of {@link ListOfProduct }
     * 
     */
    public ListOfProduct createListOfProduct() {
        return new ListOfProduct();
    }

    /**
     * Create an instance of {@link Product }
     * 
     */
    public Product createProduct() {
        return new Product();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListOfProduct }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://siebel.com/OrderManagement/Catalog/Data/ProductDetails", name = "ListOfProduct")
    public JAXBElement<ListOfProduct> createListOfProduct(ListOfProduct value) {
        return new JAXBElement<ListOfProduct>(_ListOfProduct_QNAME, ListOfProduct.class, null, value);
    }

}
