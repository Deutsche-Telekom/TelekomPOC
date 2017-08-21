
package com.siebel.ordermanagement.abo;

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
 *         &lt;element name="Skip_spcQuery_spcOrder" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Object_spcId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="_XML_spcmessage" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "skipSpcQuerySpcOrder",
    "objectSpcId",
    "xmlSpcmessage"
})
@XmlRootElement(name = "AutoOrder_Input")
public class AutoOrderInput
    implements Serializable
{

    @XmlElement(name = "Skip_spcQuery_spcOrder", required = true)
    protected String skipSpcQuerySpcOrder;
    @XmlElement(name = "Object_spcId", required = true)
    protected String objectSpcId;
    @XmlElement(name = "_XML_spcmessage", required = true)
    protected String xmlSpcmessage;

    /**
     * Gets the value of the skipSpcQuerySpcOrder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSkipSpcQuerySpcOrder() {
        return skipSpcQuerySpcOrder;
    }

    /**
     * Sets the value of the skipSpcQuerySpcOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSkipSpcQuerySpcOrder(String value) {
        this.skipSpcQuerySpcOrder = value;
    }

    /**
     * Gets the value of the objectSpcId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjectSpcId() {
        return objectSpcId;
    }

    /**
     * Sets the value of the objectSpcId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjectSpcId(String value) {
        this.objectSpcId = value;
    }

    /**
     * Gets the value of the xmlSpcmessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXMLSpcmessage() {
        return xmlSpcmessage;
    }

    /**
     * Sets the value of the xmlSpcmessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXMLSpcmessage(String value) {
        this.xmlSpcmessage = value;
    }

}
