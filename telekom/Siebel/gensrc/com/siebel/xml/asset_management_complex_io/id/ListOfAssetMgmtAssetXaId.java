
package com.siebel.xml.asset_management_complex_io.id;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListOfAssetMgmt-AssetXaId complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListOfAssetMgmt-AssetXaId">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AssetMgmt-AssetXa" type="{http://www.siebel.com/xml/Asset_Management_Complex_IO/Id}AssetMgmt-AssetXaId" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfAssetMgmt-AssetXaId", propOrder = {
    "assetMgmtAssetXa"
})
public class ListOfAssetMgmtAssetXaId
    implements Serializable
{

    @XmlElement(name = "AssetMgmt-AssetXa")
    protected List<AssetMgmtAssetXaId> assetMgmtAssetXa;

    /**
     * Gets the value of the assetMgmtAssetXa property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the assetMgmtAssetXa property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssetMgmtAssetXa().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AssetMgmtAssetXaId }
     * 
     * 
     */
    public List<AssetMgmtAssetXaId> getAssetMgmtAssetXa() {
        if (assetMgmtAssetXa == null) {
            assetMgmtAssetXa = new ArrayList<AssetMgmtAssetXaId>();
        }
        return this.assetMgmtAssetXa;
    }

}
