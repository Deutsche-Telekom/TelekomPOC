
package com.siebel.xml.asset_management_complex_io.id;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.siebel.xml.asset_management_complex_io.id package. 
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

    private final static QName _ListOfAsset_QNAME = new QName("http://www.siebel.com/xml/Asset_Management_Complex_IO/Id", "ListOfAsset");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.siebel.xml.asset_management_complex_io.id
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ListOfAssetMgmtAssetXaId }
     * 
     */
    public ListOfAssetMgmtAssetXaId createListOfAssetMgmtAssetXaId() {
        return new ListOfAssetMgmtAssetXaId();
    }

    /**
     * Create an instance of {@link AssetMgmtAssetId }
     * 
     */
    public AssetMgmtAssetId createAssetMgmtAssetId() {
        return new AssetMgmtAssetId();
    }

    /**
     * Create an instance of {@link ListOfAssetTopElmtId }
     * 
     */
    public ListOfAssetTopElmtId createListOfAssetTopElmtId() {
        return new ListOfAssetTopElmtId();
    }

    /**
     * Create an instance of {@link AssetMgmtAssetXaId }
     * 
     */
    public AssetMgmtAssetXaId createAssetMgmtAssetXaId() {
        return new AssetMgmtAssetXaId();
    }

    /**
     * Create an instance of {@link AssetMgmtAssetHeaderId }
     * 
     */
    public AssetMgmtAssetHeaderId createAssetMgmtAssetHeaderId() {
        return new AssetMgmtAssetHeaderId();
    }

    /**
     * Create an instance of {@link ListOfAssetId }
     * 
     */
    public ListOfAssetId createListOfAssetId() {
        return new ListOfAssetId();
    }

    /**
     * Create an instance of {@link ListOfAssetMgmtAssetId }
     * 
     */
    public ListOfAssetMgmtAssetId createListOfAssetMgmtAssetId() {
        return new ListOfAssetMgmtAssetId();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListOfAssetId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siebel.com/xml/Asset_Management_Complex_IO/Id", name = "ListOfAsset")
    public JAXBElement<ListOfAssetId> createListOfAsset(ListOfAssetId value) {
        return new JAXBElement<ListOfAssetId>(_ListOfAsset_QNAME, ListOfAssetId.class, null, value);
    }

}
