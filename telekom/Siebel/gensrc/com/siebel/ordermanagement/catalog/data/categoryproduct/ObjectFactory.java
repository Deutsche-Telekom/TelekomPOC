
package com.siebel.ordermanagement.catalog.data.categoryproduct;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.siebel.ordermanagement.catalog.data.categoryproduct package. 
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

    private final static QName _ListOfCategoryProduct_QNAME = new QName("http://siebel.com/OrderManagement/Catalog/Data/CategoryProduct", "ListOfCategoryProduct");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.siebel.ordermanagement.catalog.data.categoryproduct
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CatalogCategory }
     * 
     */
    public CatalogCategory createCatalogCategory() {
        return new CatalogCategory();
    }

    /**
     * Create an instance of {@link ListOfCategoryProductTopElmt }
     * 
     */
    public ListOfCategoryProductTopElmt createListOfCategoryProductTopElmt() {
        return new ListOfCategoryProductTopElmt();
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
     * Create an instance of {@link ListOfCategoryProduct }
     * 
     */
    public ListOfCategoryProduct createListOfCategoryProduct() {
        return new ListOfCategoryProduct();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListOfCategoryProduct }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://siebel.com/OrderManagement/Catalog/Data/CategoryProduct", name = "ListOfCategoryProduct")
    public JAXBElement<ListOfCategoryProduct> createListOfCategoryProduct(ListOfCategoryProduct value) {
        return new JAXBElement<ListOfCategoryProduct>(_ListOfCategoryProduct_QNAME, ListOfCategoryProduct.class, null, value);
    }

}
