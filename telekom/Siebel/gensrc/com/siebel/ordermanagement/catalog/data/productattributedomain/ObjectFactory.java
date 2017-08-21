
package com.siebel.ordermanagement.catalog.data.productattributedomain;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.siebel.ordermanagement.catalog.data.productattributedomain package. 
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

    private final static QName _ListOfProductAttributeDomain_QNAME = new QName("http://siebel.com/OrderManagement/Catalog/Data/ProductAttributeDomain", "ListOfProductAttributeDomain");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.siebel.ordermanagement.catalog.data.productattributedomain
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ListOfProductAttributeDomainTopElmt }
     * 
     */
    public ListOfProductAttributeDomainTopElmt createListOfProductAttributeDomainTopElmt() {
        return new ListOfProductAttributeDomainTopElmt();
    }

    /**
     * Create an instance of {@link ListOfProductAttributeDomain }
     * 
     */
    public ListOfProductAttributeDomain createListOfProductAttributeDomain() {
        return new ListOfProductAttributeDomain();
    }

    /**
     * Create an instance of {@link ProductAttribute }
     * 
     */
    public ProductAttribute createProductAttribute() {
        return new ProductAttribute();
    }

    /**
     * Create an instance of {@link AttributeLOVValue }
     * 
     */
    public AttributeLOVValue createAttributeLOVValue() {
        return new AttributeLOVValue();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListOfProductAttributeDomain }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://siebel.com/OrderManagement/Catalog/Data/ProductAttributeDomain", name = "ListOfProductAttributeDomain")
    public JAXBElement<ListOfProductAttributeDomain> createListOfProductAttributeDomain(ListOfProductAttributeDomain value) {
        return new JAXBElement<ListOfProductAttributeDomain>(_ListOfProductAttributeDomain_QNAME, ListOfProductAttributeDomain.class, null, value);
    }

}
