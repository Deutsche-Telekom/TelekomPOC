
package com.siebel.ordermanagement.quote.data.projectedasset;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.siebel.ordermanagement.quote.data.projectedasset package. 
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

    private final static QName _ListOfAsset_QNAME = new QName("http://siebel.com/OrderManagement/Quote/Data/ProjectedAsset", "ListOfAsset");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.siebel.ordermanagement.quote.data.projectedasset
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ListOfAsset }
     * 
     */
    public ListOfAsset createListOfAsset() {
        return new ListOfAsset();
    }

    /**
     * Create an instance of {@link ProjectedAsset }
     * 
     */
    public ProjectedAsset createProjectedAsset() {
        return new ProjectedAsset();
    }

    /**
     * Create an instance of {@link ListOfPropSet }
     * 
     */
    public ListOfPropSet createListOfPropSet() {
        return new ListOfPropSet();
    }

    /**
     * Create an instance of {@link ListOfAssetTopElmt }
     * 
     */
    public ListOfAssetTopElmt createListOfAssetTopElmt() {
        return new ListOfAssetTopElmt();
    }

    /**
     * Create an instance of {@link PropertySet }
     * 
     */
    public PropertySet createPropertySet() {
        return new PropertySet();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListOfAsset }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://siebel.com/OrderManagement/Quote/Data/ProjectedAsset", name = "ListOfAsset")
    public JAXBElement<ListOfAsset> createListOfAsset(ListOfAsset value) {
        return new JAXBElement<ListOfAsset>(_ListOfAsset_QNAME, ListOfAsset.class, null, value);
    }

}
