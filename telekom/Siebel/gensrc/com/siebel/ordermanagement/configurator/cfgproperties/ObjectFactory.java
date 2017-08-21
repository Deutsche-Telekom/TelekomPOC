
package com.siebel.ordermanagement.configurator.cfgproperties;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.siebel.ordermanagement.configurator.cfgproperties package. 
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

    private final static QName _ListOfProperties_QNAME = new QName("http://siebel.com/OrderManagement/Configurator/CfgProperties", "ListOfProperties");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.siebel.ordermanagement.configurator.cfgproperties
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PropertyType }
     * 
     */
    public PropertyType createPropertyType() {
        return new PropertyType();
    }

    /**
     * Create an instance of {@link ListOfProperties }
     * 
     */
    public ListOfProperties createListOfProperties() {
        return new ListOfProperties();
    }

    /**
     * Create an instance of {@link ListOfPropertiesTopElmt }
     * 
     */
    public ListOfPropertiesTopElmt createListOfPropertiesTopElmt() {
        return new ListOfPropertiesTopElmt();
    }

    /**
     * Create an instance of {@link Properties }
     * 
     */
    public Properties createProperties() {
        return new Properties();
    }

    /**
     * Create an instance of {@link Property }
     * 
     */
    public Property createProperty() {
        return new Property();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListOfProperties }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://siebel.com/OrderManagement/Configurator/CfgProperties", name = "ListOfProperties")
    public JAXBElement<ListOfProperties> createListOfProperties(ListOfProperties value) {
        return new JAXBElement<ListOfProperties>(_ListOfProperties_QNAME, ListOfProperties.class, null, value);
    }

}
