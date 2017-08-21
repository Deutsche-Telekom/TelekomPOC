
package com.siebel.ordermanagement.configurator.cfginteractdata;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AttributeValue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AttributeValue">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StringValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Selected" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NumberValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IntegerValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Excluded" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DisplayValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DateTimeValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BooleanValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AttributeValue", propOrder = {
    "stringValue",
    "selected",
    "numberValue",
    "integerValue",
    "excluded",
    "displayValue",
    "dateTimeValue",
    "booleanValue"
})
public class AttributeValue
    implements Serializable
{

    @XmlElement(name = "StringValue")
    protected String stringValue;
    @XmlElement(name = "Selected")
    protected String selected;
    @XmlElement(name = "NumberValue")
    protected String numberValue;
    @XmlElement(name = "IntegerValue")
    protected String integerValue;
    @XmlElement(name = "Excluded")
    protected String excluded;
    @XmlElement(name = "DisplayValue")
    protected String displayValue;
    @XmlElement(name = "DateTimeValue")
    protected String dateTimeValue;
    @XmlElement(name = "BooleanValue")
    protected String booleanValue;

    /**
     * Gets the value of the stringValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStringValue() {
        return stringValue;
    }

    /**
     * Sets the value of the stringValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStringValue(String value) {
        this.stringValue = value;
    }

    /**
     * Gets the value of the selected property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSelected() {
        return selected;
    }

    /**
     * Sets the value of the selected property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSelected(String value) {
        this.selected = value;
    }

    /**
     * Gets the value of the numberValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumberValue() {
        return numberValue;
    }

    /**
     * Sets the value of the numberValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumberValue(String value) {
        this.numberValue = value;
    }

    /**
     * Gets the value of the integerValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntegerValue() {
        return integerValue;
    }

    /**
     * Sets the value of the integerValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntegerValue(String value) {
        this.integerValue = value;
    }

    /**
     * Gets the value of the excluded property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExcluded() {
        return excluded;
    }

    /**
     * Sets the value of the excluded property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExcluded(String value) {
        this.excluded = value;
    }

    /**
     * Gets the value of the displayValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayValue() {
        return displayValue;
    }

    /**
     * Sets the value of the displayValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayValue(String value) {
        this.displayValue = value;
    }

    /**
     * Gets the value of the dateTimeValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateTimeValue() {
        return dateTimeValue;
    }

    /**
     * Sets the value of the dateTimeValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateTimeValue(String value) {
        this.dateTimeValue = value;
    }

    /**
     * Gets the value of the booleanValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBooleanValue() {
        return booleanValue;
    }

    /**
     * Sets the value of the booleanValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBooleanValue(String value) {
        this.booleanValue = value;
    }

}
