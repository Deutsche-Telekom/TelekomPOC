
package com.siebel.ordermanagement.catalog.data.productattributedomain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProductAttribute complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductAttribute">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AttributeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DefaultValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Description2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DomainType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HiddenFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MaximumValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MinimumValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrigId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReadOnlyFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RequiredFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SequenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UnitofMeasure" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VectorFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DisplayName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IncrementValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NoneValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ParametricSearchFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AssetFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AttributeDefinitionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AttributeVersionNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OverwrittenFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InheritedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EligibilityProcedureName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ValidationSpec" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrePickCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EnumeratedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AttributeLOVValue" type="{http://siebel.com/OrderManagement/Catalog/Data/ProductAttributeDomain}AttributeLOVValue" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductAttribute", propOrder = {
    "id",
    "attributeName",
    "defaultValue",
    "description2",
    "domainType",
    "hiddenFlag",
    "maximumValue",
    "minimumValue",
    "origId",
    "readOnlyFlag",
    "requiredFlag",
    "sequenceNumber",
    "unitofMeasure",
    "vectorFlag",
    "displayName",
    "incrementValue",
    "noneValue",
    "parametricSearchFlag",
    "assetFlag",
    "attributeDefinitionId",
    "attributeVersionNumber",
    "overwrittenFlag",
    "inheritedFlag",
    "eligibilityProcedureName",
    "validationSpec",
    "prePickCD",
    "enumeratedFlag",
    "attributeLOVValue"
})
public class ProductAttribute
    implements Serializable
{

    @XmlElement(name = "Id")
    protected String id;
    @XmlElement(name = "AttributeName")
    protected String attributeName;
    @XmlElement(name = "DefaultValue")
    protected String defaultValue;
    @XmlElement(name = "Description2")
    protected String description2;
    @XmlElement(name = "DomainType")
    protected String domainType;
    @XmlElement(name = "HiddenFlag")
    protected String hiddenFlag;
    @XmlElement(name = "MaximumValue")
    protected String maximumValue;
    @XmlElement(name = "MinimumValue")
    protected String minimumValue;
    @XmlElement(name = "OrigId")
    protected String origId;
    @XmlElement(name = "ReadOnlyFlag")
    protected String readOnlyFlag;
    @XmlElement(name = "RequiredFlag")
    protected String requiredFlag;
    @XmlElement(name = "SequenceNumber")
    protected String sequenceNumber;
    @XmlElement(name = "UnitofMeasure")
    protected String unitofMeasure;
    @XmlElement(name = "VectorFlag")
    protected String vectorFlag;
    @XmlElement(name = "DisplayName")
    protected String displayName;
    @XmlElement(name = "IncrementValue")
    protected String incrementValue;
    @XmlElement(name = "NoneValue")
    protected String noneValue;
    @XmlElement(name = "ParametricSearchFlag")
    protected String parametricSearchFlag;
    @XmlElement(name = "AssetFlag")
    protected String assetFlag;
    @XmlElement(name = "AttributeDefinitionId")
    protected String attributeDefinitionId;
    @XmlElement(name = "AttributeVersionNumber")
    protected String attributeVersionNumber;
    @XmlElement(name = "OverwrittenFlag")
    protected String overwrittenFlag;
    @XmlElement(name = "InheritedFlag")
    protected String inheritedFlag;
    @XmlElement(name = "EligibilityProcedureName")
    protected String eligibilityProcedureName;
    @XmlElement(name = "ValidationSpec")
    protected String validationSpec;
    @XmlElement(name = "PrePickCD")
    protected String prePickCD;
    @XmlElement(name = "EnumeratedFlag")
    protected String enumeratedFlag;
    @XmlElement(name = "AttributeLOVValue")
    protected List<AttributeLOVValue> attributeLOVValue;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the attributeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttributeName() {
        return attributeName;
    }

    /**
     * Sets the value of the attributeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttributeName(String value) {
        this.attributeName = value;
    }

    /**
     * Gets the value of the defaultValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultValue() {
        return defaultValue;
    }

    /**
     * Sets the value of the defaultValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultValue(String value) {
        this.defaultValue = value;
    }

    /**
     * Gets the value of the description2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription2() {
        return description2;
    }

    /**
     * Sets the value of the description2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription2(String value) {
        this.description2 = value;
    }

    /**
     * Gets the value of the domainType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDomainType() {
        return domainType;
    }

    /**
     * Sets the value of the domainType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDomainType(String value) {
        this.domainType = value;
    }

    /**
     * Gets the value of the hiddenFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHiddenFlag() {
        return hiddenFlag;
    }

    /**
     * Sets the value of the hiddenFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHiddenFlag(String value) {
        this.hiddenFlag = value;
    }

    /**
     * Gets the value of the maximumValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumValue() {
        return maximumValue;
    }

    /**
     * Sets the value of the maximumValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumValue(String value) {
        this.maximumValue = value;
    }

    /**
     * Gets the value of the minimumValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinimumValue() {
        return minimumValue;
    }

    /**
     * Sets the value of the minimumValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinimumValue(String value) {
        this.minimumValue = value;
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
     * Gets the value of the readOnlyFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReadOnlyFlag() {
        return readOnlyFlag;
    }

    /**
     * Sets the value of the readOnlyFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReadOnlyFlag(String value) {
        this.readOnlyFlag = value;
    }

    /**
     * Gets the value of the requiredFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequiredFlag() {
        return requiredFlag;
    }

    /**
     * Sets the value of the requiredFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequiredFlag(String value) {
        this.requiredFlag = value;
    }

    /**
     * Gets the value of the sequenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSequenceNumber() {
        return sequenceNumber;
    }

    /**
     * Sets the value of the sequenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSequenceNumber(String value) {
        this.sequenceNumber = value;
    }

    /**
     * Gets the value of the unitofMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitofMeasure() {
        return unitofMeasure;
    }

    /**
     * Sets the value of the unitofMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitofMeasure(String value) {
        this.unitofMeasure = value;
    }

    /**
     * Gets the value of the vectorFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVectorFlag() {
        return vectorFlag;
    }

    /**
     * Sets the value of the vectorFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVectorFlag(String value) {
        this.vectorFlag = value;
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
     * Gets the value of the incrementValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncrementValue() {
        return incrementValue;
    }

    /**
     * Sets the value of the incrementValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncrementValue(String value) {
        this.incrementValue = value;
    }

    /**
     * Gets the value of the noneValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoneValue() {
        return noneValue;
    }

    /**
     * Sets the value of the noneValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoneValue(String value) {
        this.noneValue = value;
    }

    /**
     * Gets the value of the parametricSearchFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParametricSearchFlag() {
        return parametricSearchFlag;
    }

    /**
     * Sets the value of the parametricSearchFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParametricSearchFlag(String value) {
        this.parametricSearchFlag = value;
    }

    /**
     * Gets the value of the assetFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssetFlag() {
        return assetFlag;
    }

    /**
     * Sets the value of the assetFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssetFlag(String value) {
        this.assetFlag = value;
    }

    /**
     * Gets the value of the attributeDefinitionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttributeDefinitionId() {
        return attributeDefinitionId;
    }

    /**
     * Sets the value of the attributeDefinitionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttributeDefinitionId(String value) {
        this.attributeDefinitionId = value;
    }

    /**
     * Gets the value of the attributeVersionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttributeVersionNumber() {
        return attributeVersionNumber;
    }

    /**
     * Sets the value of the attributeVersionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttributeVersionNumber(String value) {
        this.attributeVersionNumber = value;
    }

    /**
     * Gets the value of the overwrittenFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOverwrittenFlag() {
        return overwrittenFlag;
    }

    /**
     * Sets the value of the overwrittenFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOverwrittenFlag(String value) {
        this.overwrittenFlag = value;
    }

    /**
     * Gets the value of the inheritedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInheritedFlag() {
        return inheritedFlag;
    }

    /**
     * Sets the value of the inheritedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInheritedFlag(String value) {
        this.inheritedFlag = value;
    }

    /**
     * Gets the value of the eligibilityProcedureName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEligibilityProcedureName() {
        return eligibilityProcedureName;
    }

    /**
     * Sets the value of the eligibilityProcedureName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEligibilityProcedureName(String value) {
        this.eligibilityProcedureName = value;
    }

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
     * Gets the value of the prePickCD property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrePickCD() {
        return prePickCD;
    }

    /**
     * Sets the value of the prePickCD property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrePickCD(String value) {
        this.prePickCD = value;
    }

    /**
     * Gets the value of the enumeratedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnumeratedFlag() {
        return enumeratedFlag;
    }

    /**
     * Sets the value of the enumeratedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnumeratedFlag(String value) {
        this.enumeratedFlag = value;
    }

    /**
     * Gets the value of the attributeLOVValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attributeLOVValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttributeLOVValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AttributeLOVValue }
     * 
     * 
     */
    public List<AttributeLOVValue> getAttributeLOVValue() {
        if (attributeLOVValue == null) {
            attributeLOVValue = new ArrayList<AttributeLOVValue>();
        }
        return this.attributeLOVValue;
    }

}
