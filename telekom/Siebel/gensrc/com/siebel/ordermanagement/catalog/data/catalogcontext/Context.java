
package com.siebel.ordermanagement.catalog.data.catalogcontext;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Context complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Context">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ExternalContext" type="{http://siebel.com/OrderManagement/Catalog/Data/CatalogContext}ExternalContext" minOccurs="0"/>
 *         &lt;element name="SiebelContext" type="{http://siebel.com/OrderManagement/Catalog/Data/CatalogContext}SiebelContext" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Context", propOrder = {
    "externalContext",
    "siebelContext"
})
public class Context
    implements Serializable
{

    @XmlElement(name = "ExternalContext")
    protected ExternalContext externalContext;
    @XmlElement(name = "SiebelContext")
    protected SiebelContext siebelContext;

    /**
     * Gets the value of the externalContext property.
     * 
     * @return
     *     possible object is
     *     {@link ExternalContext }
     *     
     */
    public ExternalContext getExternalContext() {
        return externalContext;
    }

    /**
     * Sets the value of the externalContext property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExternalContext }
     *     
     */
    public void setExternalContext(ExternalContext value) {
        this.externalContext = value;
    }

    /**
     * Gets the value of the siebelContext property.
     * 
     * @return
     *     possible object is
     *     {@link SiebelContext }
     *     
     */
    public SiebelContext getSiebelContext() {
        return siebelContext;
    }

    /**
     * Sets the value of the siebelContext property.
     * 
     * @param value
     *     allowed object is
     *     {@link SiebelContext }
     *     
     */
    public void setSiebelContext(SiebelContext value) {
        this.siebelContext = value;
    }

}
