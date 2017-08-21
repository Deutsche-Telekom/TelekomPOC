
package com.siebel.xml.asset_management_complex_io.query;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.siebel.xml.asset_management_complex_io.query package. 
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

    private final static QName _ListOfAsset_QNAME = new QName("http://www.siebel.com/xml/Asset_Management_Complex_IO/Query", "ListOfAsset");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.siebel.xml.asset_management_complex_io.query
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ListOfAssetTopElmtQuery }
     * 
     */
    public ListOfAssetTopElmtQuery createListOfAssetTopElmtQuery() {
        return new ListOfAssetTopElmtQuery();
    }

    /**
     * Create an instance of {@link AssetMgmtAssetQuery }
     * 
     */
    public AssetMgmtAssetQuery createAssetMgmtAssetQuery() {
        return new AssetMgmtAssetQuery();
    }

    /**
     * Create an instance of {@link QueryType }
     * 
     */
    public QueryType createQueryType() {
        return new QueryType();
    }

    /**
     * Create an instance of {@link ListOfAssetMgmtAssetQuery }
     * 
     */
    public ListOfAssetMgmtAssetQuery createListOfAssetMgmtAssetQuery() {
        return new ListOfAssetMgmtAssetQuery();
    }

    /**
     * Create an instance of {@link AssetMgmtAssetXaQuery }
     * 
     */
    public AssetMgmtAssetXaQuery createAssetMgmtAssetXaQuery() {
        return new AssetMgmtAssetXaQuery();
    }

    /**
     * Create an instance of {@link ListOfAssetMgmtAssetXaQuery }
     * 
     */
    public ListOfAssetMgmtAssetXaQuery createListOfAssetMgmtAssetXaQuery() {
        return new ListOfAssetMgmtAssetXaQuery();
    }

    /**
     * Create an instance of {@link AssetMgmtAssetHeaderQuery }
     * 
     */
    public AssetMgmtAssetHeaderQuery createAssetMgmtAssetHeaderQuery() {
        return new AssetMgmtAssetHeaderQuery();
    }

    /**
     * Create an instance of {@link ListOfAssetQuery }
     * 
     */
    public ListOfAssetQuery createListOfAssetQuery() {
        return new ListOfAssetQuery();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListOfAssetQuery }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siebel.com/xml/Asset_Management_Complex_IO/Query", name = "ListOfAsset")
    public JAXBElement<ListOfAssetQuery> createListOfAsset(ListOfAssetQuery value) {
        return new JAXBElement<ListOfAssetQuery>(_ListOfAsset_QNAME, ListOfAssetQuery.class, null, value);
    }

}
