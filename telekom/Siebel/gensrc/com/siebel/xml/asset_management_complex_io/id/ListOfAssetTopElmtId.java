
package com.siebel.xml.asset_management_complex_io.id;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListOfAssetTopElmtId complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListOfAssetTopElmtId">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ListOfAsset" type="{http://www.siebel.com/xml/Asset_Management_Complex_IO/Id}ListOfAssetId"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfAssetTopElmtId", propOrder = {
    "listOfAsset"
})
public class ListOfAssetTopElmtId
    implements Serializable
{

    @XmlElement(name = "ListOfAsset", required = true)
    protected ListOfAssetId listOfAsset;

    /**
     * Gets the value of the listOfAsset property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfAssetId }
     *     
     */
    public ListOfAssetId getListOfAsset() {
        return listOfAsset;
    }

    /**
     * Sets the value of the listOfAsset property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfAssetId }
     *     
     */
    public void setListOfAsset(ListOfAssetId value) {
        this.listOfAsset = value;
    }

}
