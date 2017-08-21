
package com.siebel.ordermanagement.promotion;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="Asset_spcIntegration_spcId" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "assetSpcIntegrationSpcId"
})
@XmlRootElement(name = "GetPromotionCommitments_Input")
public class GetPromotionCommitmentsInput
    implements Serializable
{

    @XmlElement(name = "Asset_spcIntegration_spcId", required = true)
    protected String assetSpcIntegrationSpcId;

    /**
     * Gets the value of the assetSpcIntegrationSpcId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssetSpcIntegrationSpcId() {
        return assetSpcIntegrationSpcId;
    }

    /**
     * Sets the value of the assetSpcIntegrationSpcId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssetSpcIntegrationSpcId(String value) {
        this.assetSpcIntegrationSpcId = value;
    }

}
