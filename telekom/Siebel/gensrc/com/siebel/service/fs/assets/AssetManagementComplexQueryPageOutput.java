
package com.siebel.service.fs.assets;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.siebel.xml.asset_management_complex_io.data.ListOfAssetData;


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
 *         &lt;element ref="{http://www.siebel.com/xml/Asset_Management_Complex_IO/Data}ListOfAsset"/>
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
    "listOfAsset"
})
@XmlRootElement(name = "AssetManagementComplexQueryPage_Output")
public class AssetManagementComplexQueryPageOutput
    implements Serializable
{

    @XmlElement(name = "ListOfAsset", namespace = "http://www.siebel.com/xml/Asset_Management_Complex_IO/Data", required = true)
    protected ListOfAssetData listOfAsset;

    /**
     * Gets the value of the listOfAsset property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfAssetData }
     *     
     */
    public ListOfAssetData getListOfAsset() {
        return listOfAsset;
    }

    /**
     * Sets the value of the listOfAsset property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfAssetData }
     *     
     */
    public void setListOfAsset(ListOfAssetData value) {
        this.listOfAsset = value;
    }

}
