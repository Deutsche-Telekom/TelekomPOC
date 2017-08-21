
package com.siebel.ordermanagement.asset.data;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.siebel.ordermanagement.asset.data package. 
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

    private final static QName _ListOfAsset_QNAME = new QName("http://siebel.com/OrderManagement/Asset/Data", "ListOfAsset");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.siebel.ordermanagement.asset.data
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ListOfAssetMgmtAssetXa }
     * 
     */
    public ListOfAssetMgmtAssetXa createListOfAssetMgmtAssetXa() {
        return new ListOfAssetMgmtAssetXa();
    }

    /**
     * Create an instance of {@link ListOfAssetTopElmt }
     * 
     */
    public ListOfAssetTopElmt createListOfAssetTopElmt() {
        return new ListOfAssetTopElmt();
    }

    /**
     * Create an instance of {@link ListOfAssetMgmtAsset }
     * 
     */
    public ListOfAssetMgmtAsset createListOfAssetMgmtAsset() {
        return new ListOfAssetMgmtAsset();
    }

    /**
     * Create an instance of {@link AssetMgmtAssetHeader }
     * 
     */
    public AssetMgmtAssetHeader createAssetMgmtAssetHeader() {
        return new AssetMgmtAssetHeader();
    }

    /**
     * Create an instance of {@link AssetMgmtAsset }
     * 
     */
    public AssetMgmtAsset createAssetMgmtAsset() {
        return new AssetMgmtAsset();
    }

    /**
     * Create an instance of {@link ListOfAsset }
     * 
     */
    public ListOfAsset createListOfAsset() {
        return new ListOfAsset();
    }

    /**
     * Create an instance of {@link AssetMgmtAssetXa }
     * 
     */
    public AssetMgmtAssetXa createAssetMgmtAssetXa() {
        return new AssetMgmtAssetXa();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListOfAsset }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://siebel.com/OrderManagement/Asset/Data", name = "ListOfAsset")
    public JAXBElement<ListOfAsset> createListOfAsset(ListOfAsset value) {
        return new JAXBElement<ListOfAsset>(_ListOfAsset_QNAME, ListOfAsset.class, null, value);
    }

}
