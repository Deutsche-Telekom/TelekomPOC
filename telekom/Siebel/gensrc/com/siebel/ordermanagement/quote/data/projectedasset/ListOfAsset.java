
package com.siebel.ordermanagement.quote.data.projectedasset;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListOfAsset complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListOfAsset">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProjectedAsset" type="{http://siebel.com/OrderManagement/Quote/Data/ProjectedAsset}ProjectedAsset" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfAsset", propOrder = {
    "projectedAsset"
})
public class ListOfAsset
    implements Serializable
{

    @XmlElement(name = "ProjectedAsset")
    protected ProjectedAsset projectedAsset;

    /**
     * Gets the value of the projectedAsset property.
     * 
     * @return
     *     possible object is
     *     {@link ProjectedAsset }
     *     
     */
    public ProjectedAsset getProjectedAsset() {
        return projectedAsset;
    }

    /**
     * Sets the value of the projectedAsset property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProjectedAsset }
     *     
     */
    public void setProjectedAsset(ProjectedAsset value) {
        this.projectedAsset = value;
    }

}
