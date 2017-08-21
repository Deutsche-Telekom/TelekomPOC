
package com.siebel.ordermanagement.catalog.data.categories;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.siebel.ordermanagement.catalog.data.categories package. 
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

    private final static QName _ListOfCategory_QNAME = new QName("http://siebel.com/OrderManagement/Catalog/Data/Categories", "ListOfCategory");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.siebel.ordermanagement.catalog.data.categories
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ListOfCategory }
     * 
     */
    public ListOfCategory createListOfCategory() {
        return new ListOfCategory();
    }

    /**
     * Create an instance of {@link ListOfCategoryTopElmt }
     * 
     */
    public ListOfCategoryTopElmt createListOfCategoryTopElmt() {
        return new ListOfCategoryTopElmt();
    }

    /**
     * Create an instance of {@link Category }
     * 
     */
    public Category createCategory() {
        return new Category();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListOfCategory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://siebel.com/OrderManagement/Catalog/Data/Categories", name = "ListOfCategory")
    public JAXBElement<ListOfCategory> createListOfCategory(ListOfCategory value) {
        return new JAXBElement<ListOfCategory>(_ListOfCategory_QNAME, ListOfCategory.class, null, value);
    }

}
