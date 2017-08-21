
package com.siebel.ordermanagement.configurator.cfginteractdata;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListOfData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListOfData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProductData" type="{http://siebel.com/OrderManagement/Configurator/CfgInteractData}ProductData" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfData", propOrder = {
    "productData"
})
public class ListOfData
    implements Serializable
{

    @XmlElement(name = "ProductData")
    protected ProductData productData;

    /**
     * Gets the value of the productData property.
     * 
     * @return
     *     possible object is
     *     {@link ProductData }
     *     
     */
    public ProductData getProductData() {
        return productData;
    }

    /**
     * Sets the value of the productData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductData }
     *     
     */
    public void setProductData(ProductData value) {
        this.productData = value;
    }

}
