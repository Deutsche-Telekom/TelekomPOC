
package com.siebel.xml.asset_management_io.id;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListOfAsset_Management_IoTopElmtId complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListOfAsset_Management_IoTopElmtId">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ListOfAsset_Management_Io" type="{http://www.siebel.com/xml/Asset_Management_IO/Id}ListOfAsset_Management_IoId"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfAsset_Management_IoTopElmtId", propOrder = {
    "listOfAssetManagementIo"
})
public class ListOfAssetManagementIoTopElmtId
    implements Serializable
{

    @XmlElement(name = "ListOfAsset_Management_Io", required = true)
    protected ListOfAssetManagementIoId listOfAssetManagementIo;

    /**
     * Gets the value of the listOfAssetManagementIo property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfAssetManagementIoId }
     *     
     */
    public ListOfAssetManagementIoId getListOfAssetManagementIo() {
        return listOfAssetManagementIo;
    }

    /**
     * Sets the value of the listOfAssetManagementIo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfAssetManagementIoId }
     *     
     */
    public void setListOfAssetManagementIo(ListOfAssetManagementIoId value) {
        this.listOfAssetManagementIo = value;
    }

}
