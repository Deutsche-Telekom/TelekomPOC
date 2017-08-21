
package com.siebel.ordermanagement.catalog.data.udspublishcatalog.data;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.siebel.ordermanagement.catalog.data.udspublishcatalog.data package. 
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

    private final static QName _ListOfUDSPublishCatalog_QNAME = new QName("http://siebel.com/OrderManagement/Catalog/Data/UDSPublishCatalog/Data", "ListOfUDSPublishCatalog");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.siebel.ordermanagement.catalog.data.udspublishcatalog.data
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CatalogTranslationData }
     * 
     */
    public CatalogTranslationData createCatalogTranslationData() {
        return new CatalogTranslationData();
    }

    /**
     * Create an instance of {@link ProductData }
     * 
     */
    public ProductData createProductData() {
        return new ProductData();
    }

    /**
     * Create an instance of {@link NetPriceWaterfallData }
     * 
     */
    public NetPriceWaterfallData createNetPriceWaterfallData() {
        return new NetPriceWaterfallData();
    }

    /**
     * Create an instance of {@link ListOfUDSPublishCatalogTopElmtData }
     * 
     */
    public ListOfUDSPublishCatalogTopElmtData createListOfUDSPublishCatalogTopElmtData() {
        return new ListOfUDSPublishCatalogTopElmtData();
    }

    /**
     * Create an instance of {@link ProductAttributeData }
     * 
     */
    public ProductAttributeData createProductAttributeData() {
        return new ProductAttributeData();
    }

    /**
     * Create an instance of {@link ListOfCatalogTranslationData }
     * 
     */
    public ListOfCatalogTranslationData createListOfCatalogTranslationData() {
        return new ListOfCatalogTranslationData();
    }

    /**
     * Create an instance of {@link ListOfProductData }
     * 
     */
    public ListOfProductData createListOfProductData() {
        return new ListOfProductData();
    }

    /**
     * Create an instance of {@link CategoryTranslationData }
     * 
     */
    public CategoryTranslationData createCategoryTranslationData() {
        return new CategoryTranslationData();
    }

    /**
     * Create an instance of {@link ListOfCategoryData }
     * 
     */
    public ListOfCategoryData createListOfCategoryData() {
        return new ListOfCategoryData();
    }

    /**
     * Create an instance of {@link ListOfNetPriceWaterfallData }
     * 
     */
    public ListOfNetPriceWaterfallData createListOfNetPriceWaterfallData() {
        return new ListOfNetPriceWaterfallData();
    }

    /**
     * Create an instance of {@link ListOfUDSPublishCatalogData }
     * 
     */
    public ListOfUDSPublishCatalogData createListOfUDSPublishCatalogData() {
        return new ListOfUDSPublishCatalogData();
    }

    /**
     * Create an instance of {@link ListOfProductAttributeData }
     * 
     */
    public ListOfProductAttributeData createListOfProductAttributeData() {
        return new ListOfProductAttributeData();
    }

    /**
     * Create an instance of {@link CatalogData }
     * 
     */
    public CatalogData createCatalogData() {
        return new CatalogData();
    }

    /**
     * Create an instance of {@link ProductTranslationData }
     * 
     */
    public ProductTranslationData createProductTranslationData() {
        return new ProductTranslationData();
    }

    /**
     * Create an instance of {@link CategoryData }
     * 
     */
    public CategoryData createCategoryData() {
        return new CategoryData();
    }

    /**
     * Create an instance of {@link ListOfProductTranslationData }
     * 
     */
    public ListOfProductTranslationData createListOfProductTranslationData() {
        return new ListOfProductTranslationData();
    }

    /**
     * Create an instance of {@link ListOfCategoryTranslationData }
     * 
     */
    public ListOfCategoryTranslationData createListOfCategoryTranslationData() {
        return new ListOfCategoryTranslationData();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListOfUDSPublishCatalogData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://siebel.com/OrderManagement/Catalog/Data/UDSPublishCatalog/Data", name = "ListOfUDSPublishCatalog")
    public JAXBElement<ListOfUDSPublishCatalogData> createListOfUDSPublishCatalog(ListOfUDSPublishCatalogData value) {
        return new JAXBElement<ListOfUDSPublishCatalogData>(_ListOfUDSPublishCatalog_QNAME, ListOfUDSPublishCatalogData.class, null, value);
    }

}
