
package com.siebel.xml.asset_management_complex_io.id;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssetMgmt-AssetId complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AssetMgmt-AssetId">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ListOfAssetMgmt-AssetXa" type="{http://www.siebel.com/xml/Asset_Management_Complex_IO/Id}ListOfAssetMgmt-AssetXaId" minOccurs="0"/>
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
@XmlType(name = "AssetMgmt-AssetId", propOrder = {
    "id",
    "listOfAssetMgmtAssetXa",
    "assetMgmtAsset"
})
public class AssetMgmtAssetId
    implements Serializable
{

    @XmlElement(name = "Id")
    protected String id;
    @XmlElement(name = "ListOfAssetMgmt-AssetXa")
    protected ListOfAssetMgmtAssetXaId listOfAssetMgmtAssetXa;
    @XmlElement(name = "AssetMgmt-Asset")
    protected List<AssetMgmtAssetId> assetMgmtAsset;

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
     * Gets the value of the listOfAssetMgmtAssetXa property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfAssetMgmtAssetXaId }
     *     
     */
    public ListOfAssetMgmtAssetXaId getListOfAssetMgmtAssetXa() {
        return listOfAssetMgmtAssetXa;
    }

    /**
     * Sets the value of the listOfAssetMgmtAssetXa property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfAssetMgmtAssetXaId }
     *     
     */
    public void setListOfAssetMgmtAssetXa(ListOfAssetMgmtAssetXaId value) {
        this.listOfAssetMgmtAssetXa = value;
    }

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
