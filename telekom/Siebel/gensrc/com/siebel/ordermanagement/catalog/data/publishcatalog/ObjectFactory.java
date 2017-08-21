
package com.siebel.ordermanagement.catalog.data.publishcatalog;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.siebel.ordermanagement.catalog.data.publishcatalog package. 
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

    private final static QName _ListOfPublishCatalog_QNAME = new QName("http://siebel.com/OrderManagement/Catalog/Data/PublishCatalog", "ListOfPublishCatalog");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.siebel.ordermanagement.catalog.data.publishcatalog
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Catalog }
     * 
     */
    public Catalog createCatalog() {
        return new Catalog();
    }

    /**
     * Create an instance of {@link Product }
     * 
     */
    public Product createProduct() {
        return new Product();
    }

    /**
     * Create an instance of {@link NetPriceWaterfall }
     * 
     */
    public NetPriceWaterfall createNetPriceWaterfall() {
        return new NetPriceWaterfall();
    }

    /**
     * Create an instance of {@link IssProductAttributeVbc }
     * 
     */
    public IssProductAttributeVbc createIssProductAttributeVbc() {
        return new IssProductAttributeVbc();
    }

    /**
     * Create an instance of {@link Category }
     * 
     */
    public Category createCategory() {
        return new Category();
    }

    /**
     * Create an instance of {@link ListOfPublishCatalog }
     * 
     */
    public ListOfPublishCatalog createListOfPublishCatalog() {
        return new ListOfPublishCatalog();
    }

    /**
     * Create an instance of {@link ListOfProduct }
     * 
     */
    public ListOfProduct createListOfProduct() {
        return new ListOfProduct();
    }

    /**
     * Create an instance of {@link ListOfCategory }
     * 
     */
    public ListOfCategory createListOfCategory() {
        return new ListOfCategory();
    }

    /**
     * Create an instance of {@link ListOfNetPriceWaterfall }
     * 
     */
    public ListOfNetPriceWaterfall createListOfNetPriceWaterfall() {
        return new ListOfNetPriceWaterfall();
    }

    /**
     * Create an instance of {@link ListOfIssProductAttributeVbc }
     * 
     */
    public ListOfIssProductAttributeVbc createListOfIssProductAttributeVbc() {
        return new ListOfIssProductAttributeVbc();
    }

    /**
     * Create an instance of {@link ListOfPublishCatalogTopElmt }
     * 
     */
    public ListOfPublishCatalogTopElmt createListOfPublishCatalogTopElmt() {
        return new ListOfPublishCatalogTopElmt();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListOfPublishCatalog }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://siebel.com/OrderManagement/Catalog/Data/PublishCatalog", name = "ListOfPublishCatalog")
    public JAXBElement<ListOfPublishCatalog> createListOfPublishCatalog(ListOfPublishCatalog value) {
        return new JAXBElement<ListOfPublishCatalog>(_ListOfPublishCatalog_QNAME, ListOfPublishCatalog.class, null, value);
    }

}
