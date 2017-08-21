
package com.siebel.ordermanagement.asset.data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListOfAsset complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListOfAsset">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AssetMgmt-Asset-Header" type="{http://siebel.com/OrderManagement/Asset/Data}AssetMgmt-Asset-Header" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfAsset", propOrder = {
    "assetMgmtAssetHeader"
})
public class ListOfAsset
    implements Serializable
{

    @XmlElement(name = "AssetMgmt-Asset-Header")
    protected List<AssetMgmtAssetHeader> assetMgmtAssetHeader;

    /**
     * Gets the value of the assetMgmtAssetHeader property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the assetMgmtAssetHeader property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssetMgmtAssetHeader().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AssetMgmtAssetHeader }
     * 
     * 
     */
    public List<AssetMgmtAssetHeader> getAssetMgmtAssetHeader() {
        if (assetMgmtAssetHeader == null) {
            assetMgmtAssetHeader = new ArrayList<AssetMgmtAssetHeader>();
        }
        return this.assetMgmtAssetHeader;
    }

}
