
package com.siebel.xml.asset_management_complex_io.id;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListOfAssetMgmt-AssetId complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListOfAssetMgmt-AssetId">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AssetMgmt-Asset" type="{http://www.siebel.com/xml/Asset_Management_Complex_IO/Id}AssetMgmt-AssetId" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfAssetMgmt-AssetId", propOrder = {
    "assetMgmtAsset"
})
public class ListOfAssetMgmtAssetId
    implements Serializable
{

    @XmlElement(name = "AssetMgmt-Asset")
    protected List<AssetMgmtAssetId> assetMgmtAsset;

    /**
     * Gets the value of the assetMgmtAsset property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the assetMgmtAsset property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssetMgmtAsset().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AssetMgmtAssetId }
     * 
     * 
     */
    public List<AssetMgmtAssetId> getAssetMgmtAsset() {
        if (assetMgmtAsset == null) {
            assetMgmtAsset = new ArrayList<AssetMgmtAssetId>();
        }
        return this.assetMgmtAsset;
    }

}
