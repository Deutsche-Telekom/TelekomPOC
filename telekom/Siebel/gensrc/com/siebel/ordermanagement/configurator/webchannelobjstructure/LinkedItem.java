
package com.siebel.ordermanagement.configurator.webchannelobjstructure;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LinkedItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LinkedItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="VariableName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SortSpec" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SearchSpec" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NeedsExecution" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FieldName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Expression" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DisplayName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DefaultValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BusinessObject" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BusinessComponent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Active" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LinkedItemDecoration" type="{http://siebel.com/OrderManagement/Configurator/WebChannelObjStructure}LinkedItemDecoration" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LinkedItem", propOrder = {
    "variableName",
    "sortSpec",
    "searchSpec",
    "needsExecution",
    "name",
    "id",
    "fieldName",
    "expression",
    "displayName",
    "description",
    "defaultValue",
    "businessObject",
    "businessComponent",
    "active",
    "linkedItemDecoration"
})
public class LinkedItem
    implements Serializable
{

    @XmlElement(name = "VariableName")
    protected String variableName;
    @XmlElement(name = "SortSpec")
    protected String sortSpec;
    @XmlElement(name = "SearchSpec")
    protected String searchSpec;
    @XmlElement(name = "NeedsExecution")
    protected String needsExecution;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Id")
    protected String id;
    @XmlElement(name = "FieldName")
    protected String fieldName;
    @XmlElement(name = "Expression")
    protected String expression;
    @XmlElement(name = "DisplayName")
    protected String displayName;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "DefaultValue")
    protected String defaultValue;
    @XmlElement(name = "BusinessObject")
    protected String businessObject;
    @XmlElement(name = "BusinessComponent")
    protected String businessComponent;
    @XmlElement(name = "Active")
    protected String active;
    @XmlElement(name = "LinkedItemDecoration")
    protected List<LinkedItemDecoration> linkedItemDecoration;

    /**
     * Gets the value of the variableName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVariableName() {
        return variableName;
    }

    /**
     * Sets the value of the variableName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVariableName(String value) {
        this.variableName = value;
    }

    /**
     * Gets the value of the sortSpec property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSortSpec() {
        return sortSpec;
    }

    /**
     * Sets the value of the sortSpec property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSortSpec(String value) {
        this.sortSpec = value;
    }

    /**
     * Gets the value of the searchSpec property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchSpec() {
        return searchSpec;
    }

    /**
     * Sets the value of the searchSpec property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchSpec(String value) {
        this.searchSpec = value;
    }

    /**
     * Gets the value of the needsExecution property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNeedsExecution() {
        return needsExecution;
    }

    /**
     * Sets the value of the needsExecution property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNeedsExecution(String value) {
        this.needsExecution = value;
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
     * Gets the value of the fieldName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFieldName() {
        return fieldName;
    }

    /**
     * Sets the value of the fieldName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFieldName(String value) {
        this.fieldName = value;
    }

    /**
     * Gets the value of the expression property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpression() {
        return expression;
    }

    /**
     * Sets the value of the expression property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpression(String value) {
        this.expression = value;
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
     * Gets the value of the businessObject property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessObject() {
        return businessObject;
    }

    /**
     * Sets the value of the businessObject property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessObject(String value) {
        this.businessObject = value;
    }

    /**
     * Gets the value of the businessComponent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessComponent() {
        return businessComponent;
    }

    /**
     * Sets the value of the businessComponent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessComponent(String value) {
        this.businessComponent = value;
    }

    /**
     * Gets the value of the active property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActive() {
        return active;
    }

    /**
     * Sets the value of the active property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActive(String value) {
        this.active = value;
    }

    /**
     * Gets the value of the linkedItemDecoration property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the linkedItemDecoration property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLinkedItemDecoration().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LinkedItemDecoration }
     * 
     * 
     */
    public List<LinkedItemDecoration> getLinkedItemDecoration() {
        if (linkedItemDecoration == null) {
            linkedItemDecoration = new ArrayList<LinkedItemDecoration>();
        }
        return this.linkedItemDecoration;
    }

}
