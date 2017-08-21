
package com.siebel.ordermanagement.catalog.data.udspublishcatalog.query;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.siebel.ordermanagement.catalog.data.udspublishcatalog.query package. 
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

    private final static QName _ListOfUDSPublishCatalog_QNAME = new QName("http://siebel.com/OrderManagement/Catalog/Data/UDSPublishCatalog/Query", "ListOfUDSPublishCatalog");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.siebel.ordermanagement.catalog.data.udspublishcatalog.query
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CatalogQuery }
     * 
     */
    public CatalogQuery createCatalogQuery() {
        return new CatalogQuery();
    }

    /**
     * Create an instance of {@link ListOfCatalogTranslationQuery }
     * 
     */
    public ListOfCatalogTranslationQuery createListOfCatalogTranslationQuery() {
        return new ListOfCatalogTranslationQuery();
    }

    /**
     * Create an instance of {@link ProductTranslationQuery }
     * 
     */
    public ProductTranslationQuery createProductTranslationQuery() {
        return new ProductTranslationQuery();
    }

    /**
     * Create an instance of {@link ListOfNetPriceWaterfallQuery }
     * 
     */
    public ListOfNetPriceWaterfallQuery createListOfNetPriceWaterfallQuery() {
        return new ListOfNetPriceWaterfallQuery();
    }

    /**
     * Create an instance of {@link ListOfProductAttributeQuery }
     * 
     */
    public ListOfProductAttributeQuery createListOfProductAttributeQuery() {
        return new ListOfProductAttributeQuery();
    }

    /**
     * Create an instance of {@link NetPriceWaterfallQuery }
     * 
     */
    public NetPriceWaterfallQuery createNetPriceWaterfallQuery() {
        return new NetPriceWaterfallQuery();
    }

    /**
     * Create an instance of {@link QueryType }
     * 
     */
    public QueryType createQueryType() {
        return new QueryType();
    }

    /**
     * Create an instance of {@link ListOfProductQuery }
     * 
     */
    public ListOfProductQuery createListOfProductQuery() {
        return new ListOfProductQuery();
    }

    /**
     * Create an instance of {@link ListOfProductTranslationQuery }
     * 
     */
    public ListOfProductTranslationQuery createListOfProductTranslationQuery() {
        return new ListOfProductTranslationQuery();
    }

    /**
     * Create an instance of {@link ListOfUDSPublishCatalogTopElmtQuery }
     * 
     */
    public ListOfUDSPublishCatalogTopElmtQuery createListOfUDSPublishCatalogTopElmtQuery() {
        return new ListOfUDSPublishCatalogTopElmtQuery();
    }

    /**
     * Create an instance of {@link CatalogTranslationQuery }
     * 
     */
    public CatalogTranslationQuery createCatalogTranslationQuery() {
        return new CatalogTranslationQuery();
    }

    /**
     * Create an instance of {@link ProductAttributeQuery }
     * 
     */
    public ProductAttributeQuery createProductAttributeQuery() {
        return new ProductAttributeQuery();
    }

    /**
     * Create an instance of {@link ListOfUDSPublishCatalogQuery }
     * 
     */
    public ListOfUDSPublishCatalogQuery createListOfUDSPublishCatalogQuery() {
        return new ListOfUDSPublishCatalogQuery();
    }

    /**
     * Create an instance of {@link ListOfCategoryTranslationQuery }
     * 
     */
    public ListOfCategoryTranslationQuery createListOfCategoryTranslationQuery() {
        return new ListOfCategoryTranslationQuery();
    }

    /**
     * Create an instance of {@link ListOfCategoryQuery }
     * 
     */
    public ListOfCategoryQuery createListOfCategoryQuery() {
        return new ListOfCategoryQuery();
    }

    /**
     * Create an instance of {@link ProductQuery }
     * 
     */
    public ProductQuery createProductQuery() {
        return new ProductQuery();
    }

    /**
     * Create an instance of {@link CategoryTranslationQuery }
     * 
     */
    public CategoryTranslationQuery createCategoryTranslationQuery() {
        return new CategoryTranslationQuery();
    }

    /**
     * Create an instance of {@link CategoryQuery }
     * 
     */
    public CategoryQuery createCategoryQuery() {
        return new CategoryQuery();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListOfUDSPublishCatalogQuery }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://siebel.com/OrderManagement/Catalog/Data/UDSPublishCatalog/Query", name = "ListOfUDSPublishCatalog")
    public JAXBElement<ListOfUDSPublishCatalogQuery> createListOfUDSPublishCatalog(ListOfUDSPublishCatalogQuery value) {
        return new JAXBElement<ListOfUDSPublishCatalogQuery>(_ListOfUDSPublishCatalog_QNAME, ListOfUDSPublishCatalogQuery.class, null, value);
    }

}
