
package com.siebel.xml.asset_management_complex_io.data;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.siebel.xml.asset_management_complex_io.data package. 
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

    private final static QName _ListOfAsset_QNAME = new QName("http://www.siebel.com/xml/Asset_Management_Complex_IO/Data", "ListOfAsset");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.siebel.xml.asset_management_complex_io.data
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ListOfAssetMgmtAssetXaData }
     * 
     */
    public ListOfAssetMgmtAssetXaData createListOfAssetMgmtAssetXaData() {
        return new ListOfAssetMgmtAssetXaData();
    }

    /**
     * Create an instance of {@link ListOfAssetData }
     * 
     */
    public ListOfAssetData createListOfAssetData() {
        return new ListOfAssetData();
    }

    /**
     * Create an instance of {@link AssetMgmtAssetData }
     * 
     */
    public AssetMgmtAssetData createAssetMgmtAssetData() {
        return new AssetMgmtAssetData();
    }

    /**
     * Create an instance of {@link AssetMgmtAssetXaData }
     * 
     */
    public AssetMgmtAssetXaData createAssetMgmtAssetXaData() {
        return new AssetMgmtAssetXaData();
    }

    /**
     * Create an instance of {@link ListOfAssetMgmtAssetData }
     * 
     */
    public ListOfAssetMgmtAssetData createListOfAssetMgmtAssetData() {
        return new ListOfAssetMgmtAssetData();
    }

    /**
     * Create an instance of {@link ListOfAssetTopElmtData }
     * 
     */
    public ListOfAssetTopElmtData createListOfAssetTopElmtData() {
        return new ListOfAssetTopElmtData();
    }

    /**
     * Create an instance of {@link AssetMgmtAssetHeaderData }
     * 
     */
    public AssetMgmtAssetHeaderData createAssetMgmtAssetHeaderData() {
        return new AssetMgmtAssetHeaderData();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListOfAssetData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siebel.com/xml/Asset_Management_Complex_IO/Data", name = "ListOfAsset")
    public JAXBElement<ListOfAssetData> createListOfAsset(ListOfAssetData value) {
        return new JAXBElement<ListOfAssetData>(_ListOfAsset_QNAME, ListOfAssetData.class, null, value);
    }

}
