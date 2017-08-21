
package com.siebel.service.fs.assets;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.siebel.xml.asset_management_io.id.ListOfAssetManagementIoId;


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
 *         &lt;element ref="{http://www.siebel.com/xml/Asset_Management_IO/Id}ListOfAsset_Management_Io"/>
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
    "listOfAssetManagementIo"
})
@XmlRootElement(name = "AssetManagementUpdate_Output")
public class AssetManagementUpdateOutput
    implements Serializable
{

    @XmlElement(name = "ListOfAsset_Management_Io", namespace = "http://www.siebel.com/xml/Asset_Management_IO/Id", required = true)
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
