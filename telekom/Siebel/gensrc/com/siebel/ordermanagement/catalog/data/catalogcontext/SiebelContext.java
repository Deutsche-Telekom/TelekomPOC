
package com.siebel.ordermanagement.catalog.data.catalogcontext;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SiebelContext complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SiebelContext">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BusObjName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BusCompName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SignalMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ContextRowId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SiebelContext", propOrder = {
    "busObjName",
    "busCompName",
    "signalMode",
    "contextRowId"
})
public class SiebelContext
    implements Serializable
{

    @XmlElement(name = "BusObjName")
    protected String busObjName;
    @XmlElement(name = "BusCompName")
    protected String busCompName;
    @XmlElement(name = "SignalMode")
    protected String signalMode;
    @XmlElement(name = "ContextRowId")
    protected String contextRowId;

    /**
     * Gets the value of the busObjName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusObjName() {
        return busObjName;
    }

    /**
     * Sets the value of the busObjName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusObjName(String value) {
        this.busObjName = value;
    }

    /**
     * Gets the value of the busCompName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusCompName() {
        return busCompName;
    }

    /**
     * Sets the value of the busCompName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusCompName(String value) {
        this.busCompName = value;
    }

    /**
     * Gets the value of the signalMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignalMode() {
        return signalMode;
    }

    /**
     * Sets the value of the signalMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignalMode(String value) {
        this.signalMode = value;
    }

    /**
     * Gets the value of the contextRowId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContextRowId() {
        return contextRowId;
    }

    /**
     * Sets the value of the contextRowId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContextRowId(String value) {
        this.contextRowId = value;
    }

}
