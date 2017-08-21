
package com.siebel.ordermanagement.configurator.webchannelobjstructure;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Attribute complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Attribute">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ValidationSpec" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UnitOfMeasure" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Required" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReadOnly" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrigId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LocalType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InternalType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Hidden" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DisplayName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AttributeRejectedValue" type="{http://siebel.com/OrderManagement/Configurator/WebChannelObjStructure}AttributeRejectedValue" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AttributeDomain" type="{http://siebel.com/OrderManagement/Configurator/WebChannelObjStructure}AttributeDomain" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AttributeDefaultValue" type="{http://siebel.com/OrderManagement/Configurator/WebChannelObjStructure}AttributeDefaultValue" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AttributeDecoration" type="{http://siebel.com/OrderManagement/Configurator/WebChannelObjStructure}AttributeDecoration" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Attribute", propOrder = {
    "validationSpec",
    "unitOfMeasure",
    "required",
    "readOnly",
    "origId",
    "name",
    "localType",
    "internalType",
    "hidden",
    "displayName",
    "description",
    "attributeRejectedValue",
    "attributeDomain",
    "attributeDefaultValue",
    "attributeDecoration"
})
public class Attribute
    implements Serializable
{

    @XmlElement(name = "ValidationSpec")
    protected String validationSpec;
    @XmlElement(name = "UnitOfMeasure")
    protected String unitOfMeasure;
    @XmlElement(name = "Required")
    protected String required;
    @XmlElement(name = "ReadOnly")
    protected String readOnly;
    @XmlElement(name = "OrigId")
    protected String origId;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "LocalType")
    protected String localType;
    @XmlElement(name = "InternalType")
    protected String internalType;
    @XmlElement(name = "Hidden")
    protected String hidden;
    @XmlElement(name = "DisplayName")
    protected String displayName;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "AttributeRejectedValue")
    protected List<AttributeRejectedValue> attributeRejectedValue;
    @XmlElement(name = "AttributeDomain")
    protected List<AttributeDomain> attributeDomain;
    @XmlElement(name = "AttributeDefaultValue")
    protected List<AttributeDefaultValue> attributeDefaultValue;
    @XmlElement(name = "AttributeDecoration")
    protected List<AttributeDecoration> attributeDecoration;

    /**
     * Gets the value of the validationSpec property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidationSpec() {
        return validationSpec;
    }

    /**
     * Sets the value of the validationSpec property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidationSpec(String value) {
        this.validationSpec = value;
    }

    /**
     * Gets the value of the unitOfMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitOfMeasure() {
        return unitOfMeasure;
    }

    /**
     * Sets the value of the unitOfMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitOfMeasure(String value) {
        this.unitOfMeasure = value;
    }

    /**
     * Gets the value of the required property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequired() {
        return required;
    }

    /**
     * Sets the value of the required property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequired(String value) {
        this.required = value;
    }

    /**
     * Gets the value of the readOnly property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReadOnly() {
        return readOnly;
    }

    /**
     * Sets the value of the readOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReadOnly(String value) {
        this.readOnly = value;
    }

    /**
     * Gets the value of the origId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrigId() {
        return origId;
    }

    /**
     * Sets the value of the origId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrigId(String value) {
        this.origId = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the localType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalType() {
        return localType;
    }

    /**
     * Sets the value of the localType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalType(String value) {
        this.localType = value;
    }

    /**
     * Gets the value of the internalType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternalType() {
        return internalType;
    }

    /**
     * Sets the value of the internalType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternalType(String value) {
        this.internalType = value;
    }

    /**
     * Gets the value of the hidden property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHidden() {
        return hidden;
    }

    /**
     * Sets the value of the hidden property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHidden(String value) {
        this.hidden = value;
    }

    /**
     * Gets the value of the displayName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Sets the value of the displayName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayName(String value) {
        this.displayName = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the attributeRejectedValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attributeRejectedValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttributeRejectedValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AttributeRejectedValue }
     * 
     * 
     */
    public List<AttributeRejectedValue> getAttributeRejectedValue() {
        if (attributeRejectedValue == null) {
            attributeRejectedValue = new ArrayList<AttributeRejectedValue>();
        }
        return this.attributeRejectedValue;
    }

    /**
     * Gets the value of the attributeDomain property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attributeDomain property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttributeDomain().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AttributeDomain }
     * 
     * 
     */
    public List<AttributeDomain> getAttributeDomain() {
        if (attributeDomain == null) {
            attributeDomain = new ArrayList<AttributeDomain>();
        }
        return this.attributeDomain;
    }

    /**
     * Gets the value of the attributeDefaultValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attributeDefaultValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttributeDefaultValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AttributeDefaultValue }
     * 
     * 
     */
    public List<AttributeDefaultValue> getAttributeDefaultValue() {
        if (attributeDefaultValue == null) {
            attributeDefaultValue = new ArrayList<AttributeDefaultValue>();
        }
        return this.attributeDefaultValue;
    }

    /**
     * Gets the value of the attributeDecoration property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attributeDecoration property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttributeDecoration().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AttributeDecoration }
     * 
     * 
     */
    public List<AttributeDecoration> getAttributeDecoration() {
        if (attributeDecoration == null) {
            attributeDecoration = new ArrayList<AttributeDecoration>();
        }
        return this.attributeDecoration;
    }

}
