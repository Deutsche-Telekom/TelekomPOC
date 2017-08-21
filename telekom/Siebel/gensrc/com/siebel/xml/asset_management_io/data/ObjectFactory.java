
package com.siebel.xml.asset_management_io.data;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.siebel.xml.asset_management_io.data package. 
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

    private final static QName _ListOfAssetManagementIo_QNAME = new QName("http://www.siebel.com/xml/Asset_Management_IO/Data", "ListOfAsset_Management_Io");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.siebel.xml.asset_management_io.data
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ListOfAssetManagementIoData }
     * 
     */
    public ListOfAssetManagementIoData createListOfAssetManagementIoData() {
        return new ListOfAssetManagementIoData();
    }

    /**
     * Create an instance of {@link AssetMgmtAssetData }
     * 
     */
    public AssetMgmtAssetData createAssetMgmtAssetData() {
        return new AssetMgmtAssetData();
    }

    /**
     * Create an instance of {@link ListOfAssetManagementIoTopElmtData }
     * 
     */
    public ListOfAssetManagementIoTopElmtData createListOfAssetManagementIoTopElmtData() {
        return new ListOfAssetManagementIoTopElmtData();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListOfAssetManagementIoData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siebel.com/xml/Asset_Management_IO/Data", name = "ListOfAsset_Management_Io")
    public JAXBElement<ListOfAssetManagementIoData> createListOfAssetManagementIo(ListOfAssetManagementIoData value) {
        return new JAXBElement<ListOfAssetManagementIoData>(_ListOfAssetManagementIo_QNAME, ListOfAssetManagementIoData.class, null, value);
    }

}
