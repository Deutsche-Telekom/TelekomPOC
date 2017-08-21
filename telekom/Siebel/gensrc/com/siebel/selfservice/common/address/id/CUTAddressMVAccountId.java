
package com.siebel.selfservice.common.address.id;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CUTAddress_MVAccountId complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CUTAddress_MVAccountId">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MVAccountId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CUTAddress_MVAccountId", propOrder = {
    "mvAccountId"
})
public class CUTAddressMVAccountId
    implements Serializable
{

    @XmlElement(name = "MVAccountId")
    protected String mvAccountId;

    /**
     * Gets the value of the mvAccountId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMVAccountId() {
        return mvAccountId;
    }

    /**
     * Sets the value of the mvAccountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMVAccountId(String value) {
        this.mvAccountId = value;
    }

}
