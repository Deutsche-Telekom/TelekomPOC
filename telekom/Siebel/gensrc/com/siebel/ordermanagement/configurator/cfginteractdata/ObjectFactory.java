
package com.siebel.ordermanagement.configurator.cfginteractdata;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.siebel.ordermanagement.configurator.cfginteractdata package. 
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

    private final static QName _ListOfData_QNAME = new QName("http://siebel.com/OrderManagement/Configurator/CfgInteractData", "ListOfData");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.siebel.ordermanagement.configurator.cfginteractdata
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Attribute }
     * 
     */
    public Attribute createAttribute() {
        return new Attribute();
    }

    /**
     * Create an instance of {@link Item }
     * 
     */
    public Item createItem() {
        return new Item();
    }

    /**
     * Create an instance of {@link DomainItem }
     * 
     */
    public DomainItem createDomainItem() {
        return new DomainItem();
    }

    /**
     * Create an instance of {@link ListOfDataTopElmt }
     * 
     */
    public ListOfDataTopElmt createListOfDataTopElmt() {
        return new ListOfDataTopElmt();
    }

    /**
     * Create an instance of {@link Relationship }
     * 
     */
    public Relationship createRelationship() {
        return new Relationship();
    }

    /**
     * Create an instance of {@link ProductData }
     * 
     */
    public ProductData createProductData() {
        return new ProductData();
    }

    /**
     * Create an instance of {@link AttributeValue }
     * 
     */
    public AttributeValue createAttributeValue() {
        return new AttributeValue();
    }

    /**
     * Create an instance of {@link ListOfData }
     * 
     */
    public ListOfData createListOfData() {
        return new ListOfData();
    }

    /**
     * Create an instance of {@link Explanation }
     * 
     */
    public Explanation createExplanation() {
        return new Explanation();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListOfData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://siebel.com/OrderManagement/Configurator/CfgInteractData", name = "ListOfData")
    public JAXBElement<ListOfData> createListOfData(ListOfData value) {
        return new JAXBElement<ListOfData>(_ListOfData_QNAME, ListOfData.class, null, value);
    }

}
