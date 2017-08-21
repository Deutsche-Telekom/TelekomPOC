
package com.siebel.xml.asset_management_io.query;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.siebel.xml.asset_management_io.query package. 
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

    private final static QName _ListOfAssetManagementIo_QNAME = new QName("http://www.siebel.com/xml/Asset_Management_IO/Query", "ListOfAsset_Management_Io");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.siebel.xml.asset_management_io.query
     * 
     */
    public ObjectFactory() {
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
     * Create an instance of {@link ListOfAssetManagementIoTopElmtQuery }
     * 
     */
    public ListOfAssetManagementIoTopElmtQuery createListOfAssetManagementIoTopElmtQuery() {
        return new ListOfAssetManagementIoTopElmtQuery();
    }

    /**
     * Create an instance of {@link ListOfAssetManagementIoQuery }
     * 
     */
    public ListOfAssetManagementIoQuery createListOfAssetManagementIoQuery() {
        return new ListOfAssetManagementIoQuery();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListOfAssetManagementIoQuery }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siebel.com/xml/Asset_Management_IO/Query", name = "ListOfAsset_Management_Io")
    public JAXBElement<ListOfAssetManagementIoQuery> createListOfAssetManagementIo(ListOfAssetManagementIoQuery value) {
        return new JAXBElement<ListOfAssetManagementIoQuery>(_ListOfAssetManagementIo_QNAME, ListOfAssetManagementIoQuery.class, null, value);
    }

}
