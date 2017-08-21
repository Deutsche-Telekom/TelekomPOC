
package com.siebel.xml.asset_management_complex_io.query;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListOfAssetTopElmtQuery complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListOfAssetTopElmtQuery">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ListOfAsset" type="{http://www.siebel.com/xml/Asset_Management_Complex_IO/Query}ListOfAssetQuery" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfAssetTopElmtQuery", propOrder = {
    "listOfAsset"
})
public class ListOfAssetTopElmtQuery
    implements Serializable
{

    @XmlElement(name = "ListOfAsset")
    protected ListOfAssetQuery listOfAsset;

    /**
     * Gets the value of the listOfAsset property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfAssetQuery }
     *     
     */
    public ListOfAssetQuery getListOfAsset() {
        return listOfAsset;
    }

    /**
     * Sets the value of the listOfAsset property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfAssetQuery }
     *     
     */
    public void setListOfAsset(ListOfAssetQuery value) {
        this.listOfAsset = value;
    }

}
