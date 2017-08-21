
package com.siebel.ordermanagement.catalog;

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
 *         &lt;element name="Product_spcConfiguration_spcModel_spcId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Attribute_spcId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "productSpcConfigurationSpcModelSpcId",
    "attributeSpcId"
})
@XmlRootElement(name = "GetProductAttributeDomain_Input")
public class GetProductAttributeDomainInput
    implements Serializable
{

    @XmlElement(name = "Product_spcConfiguration_spcModel_spcId", required = true)
    protected String productSpcConfigurationSpcModelSpcId;
    @XmlElement(name = "Attribute_spcId")
    protected String attributeSpcId;

    /**
     * Gets the value of the productSpcConfigurationSpcModelSpcId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductSpcConfigurationSpcModelSpcId() {
        return productSpcConfigurationSpcModelSpcId;
    }

    /**
     * Sets the value of the productSpcConfigurationSpcModelSpcId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductSpcConfigurationSpcModelSpcId(String value) {
        this.productSpcConfigurationSpcModelSpcId = value;
    }

    /**
     * Gets the value of the attributeSpcId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttributeSpcId() {
        return attributeSpcId;
    }

    /**
     * Sets the value of the attributeSpcId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttributeSpcId(String value) {
        this.attributeSpcId = value;
    }

}
