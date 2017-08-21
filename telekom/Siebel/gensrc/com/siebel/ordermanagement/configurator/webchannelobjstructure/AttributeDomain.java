
package com.siebel.ordermanagement.configurator.webchannelobjstructure;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AttributeDomain complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AttributeDomain">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LocalValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InternalValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AttributeDomainDecoration" type="{http://siebel.com/OrderManagement/Configurator/WebChannelObjStructure}AttributeDomainDecoration" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AttributeDomain", propOrder = {
    "localValue",
    "internalValue",
    "attributeDomainDecoration"
})
public class AttributeDomain
    implements Serializable
{

    @XmlElement(name = "LocalValue")
    protected String localValue;
    @XmlElement(name = "InternalValue")
    protected String internalValue;
    @XmlElement(name = "AttributeDomainDecoration")
    protected List<AttributeDomainDecoration> attributeDomainDecoration;

    /**
     * Gets the value of the localValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalValue() {
        return localValue;
    }

    /**
     * Sets the value of the localValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalValue(String value) {
        this.localValue = value;
    }

    /**
     * Gets the value of the internalValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternalValue() {
        return internalValue;
    }

    /**
     * Sets the value of the internalValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternalValue(String value) {
        this.internalValue = value;
    }

    /**
     * Gets the value of the attributeDomainDecoration property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attributeDomainDecoration property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttributeDomainDecoration().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AttributeDomainDecoration }
     * 
     * 
     */
    public List<AttributeDomainDecoration> getAttributeDomainDecoration() {
        if (attributeDomainDecoration == null) {
            attributeDomainDecoration = new ArrayList<AttributeDomainDecoration>();
        }
        return this.attributeDomainDecoration;
    }

}
