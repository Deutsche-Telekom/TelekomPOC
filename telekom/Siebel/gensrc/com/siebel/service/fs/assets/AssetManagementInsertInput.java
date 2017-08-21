
package com.siebel.service.fs.assets;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.siebel.xml.asset_management_io.data.ListOfAssetManagementIoData;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.siebel.com/xml/Asset_Management_IO/Data}ListOfAsset_Management_Io"/>
 *         &lt;element name="LOVLanguageMode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ViewMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "listOfAssetManagementIo",
    "lovLanguageMode",
    "viewMode"
})
@XmlRootElement(name = "AssetManagementInsert_Input")
public class AssetManagementInsertInput
    implements Serializable
{

    @XmlElement(name = "ListOfAsset_Management_Io", namespace = "http://www.siebel.com/xml/Asset_Management_IO/Data", required = true)
    protected ListOfAssetManagementIoData listOfAssetManagementIo;
    @XmlElement(name = "LOVLanguageMode", required = true)
    protected String lovLanguageMode;
    @XmlElement(name = "ViewMode")
    protected String viewMode;

    /**
     * Gets the value of the listOfAssetManagementIo property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfAssetManagementIoData }
     *     
     */
    public ListOfAssetManagementIoData getListOfAssetManagementIo() {
        return listOfAssetManagementIo;
    }

    /**
     * Sets the value of the listOfAssetManagementIo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfAssetManagementIoData }
     *     
     */
    public void setListOfAssetManagementIo(ListOfAssetManagementIoData value) {
        this.listOfAssetManagementIo = value;
    }

    /**
     * Gets the value of the lovLanguageMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLOVLanguageMode() {
        return lovLanguageMode;
    }

    /**
     * Sets the value of the lovLanguageMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLOVLanguageMode(String value) {
        this.lovLanguageMode = value;
    }

    /**
     * Gets the value of the viewMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getViewMode() {
        return viewMode;
    }

    /**
     * Sets the value of the viewMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setViewMode(String value) {
        this.viewMode = value;
    }

}
