
package com.siebel.xml.asset_management_io.data;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListOfAsset_Management_IoTopElmtData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListOfAsset_Management_IoTopElmtData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ListOfAsset_Management_Io" type="{http://www.siebel.com/xml/Asset_Management_IO/Data}ListOfAsset_Management_IoData"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfAsset_Management_IoTopElmtData", propOrder = {
    "listOfAssetManagementIo"
})
public class ListOfAssetManagementIoTopElmtData
    implements Serializable
{

    @XmlElement(name = "ListOfAsset_Management_Io", required = true)
    protected ListOfAssetManagementIoData listOfAssetManagementIo;

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

}
