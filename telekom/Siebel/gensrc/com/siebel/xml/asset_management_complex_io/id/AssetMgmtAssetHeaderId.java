
package com.siebel.xml.asset_management_complex_io.id;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssetMgmt-Asset-HeaderId complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AssetMgmt-Asset-HeaderId">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ListOfAssetMgmt-Asset" type="{http://www.siebel.com/xml/Asset_Management_Complex_IO/Id}ListOfAssetMgmt-AssetId" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssetMgmt-Asset-HeaderId", propOrder = {
    "id",
    "listOfAssetMgmtAsset"
})
public class AssetMgmtAssetHeaderId
    implements Serializable
{

    @XmlElement(name = "Id")
    protected String id;
    @XmlElement(name = "ListOfAssetMgmt-Asset")
    protected ListOfAssetMgmtAssetId listOfAssetMgmtAsset;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the listOfAssetMgmtAsset property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfAssetMgmtAssetId }
     *     
     */
    public ListOfAssetMgmtAssetId getListOfAssetMgmtAsset() {
        return listOfAssetMgmtAsset;
    }

    /**
     * Sets the value of the listOfAssetMgmtAsset property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfAssetMgmtAssetId }
     *     
     */
    public void setListOfAssetMgmtAsset(ListOfAssetMgmtAssetId value) {
        this.listOfAssetMgmtAsset = value;
    }

}
