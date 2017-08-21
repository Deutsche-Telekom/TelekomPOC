
package com.siebel.ordermanagement.configurator.cfginteractdata;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Explanation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Explanation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ExplanationText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Explanation", propOrder = {
    "explanationText"
})
public class Explanation
    implements Serializable
{

    @XmlElement(name = "ExplanationText")
    protected String explanationText;

    /**
     * Gets the value of the explanationText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExplanationText() {
        return explanationText;
    }

    /**
     * Sets the value of the explanationText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExplanationText(String value) {
        this.explanationText = value;
    }

}
