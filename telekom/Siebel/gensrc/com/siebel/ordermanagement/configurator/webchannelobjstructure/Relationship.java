
package com.siebel.ordermanagement.configurator.webchannelobjstructure;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Relationship complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Relationship">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MinimumCardinality" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MaximumCardinality" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DisplayName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DefaultProductId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DefaultCardinality" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ClassName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ClassId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RelationshipDomain" type="{http://siebel.com/OrderManagement/Configurator/WebChannelObjStructure}RelationshipDomain" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RelationshipDecoration" type="{http://siebel.com/OrderManagement/Configurator/WebChannelObjStructure}RelationshipDecoration" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Relationship", propOrder = {
    "name",
    "minimumCardinality",
    "maximumCardinality",
    "id",
    "displayName",
    "defaultProductId",
    "defaultCardinality",
    "className",
    "classId",
    "relationshipDomain",
    "relationshipDecoration"
})
public class Relationship
    implements Serializable
{

    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "MinimumCardinality")
    protected String minimumCardinality;
    @XmlElement(name = "MaximumCardinality")
    protected String maximumCardinality;
    @XmlElement(name = "Id")
    protected String id;
    @XmlElement(name = "DisplayName")
    protected String displayName;
    @XmlElement(name = "DefaultProductId")
    protected String defaultProductId;
    @XmlElement(name = "DefaultCardinality")
    protected String defaultCardinality;
    @XmlElement(name = "ClassName")
    protected String className;
    @XmlElement(name = "ClassId")
    protected String classId;
    @XmlElement(name = "RelationshipDomain")
    protected List<RelationshipDomain> relationshipDomain;
    @XmlElement(name = "RelationshipDecoration")
    protected List<RelationshipDecoration> relationshipDecoration;

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
     * Gets the value of the minimumCardinality property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinimumCardinality() {
        return minimumCardinality;
    }

    /**
     * Sets the value of the minimumCardinality property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinimumCardinality(String value) {
        this.minimumCardinality = value;
    }

    /**
     * Gets the value of the maximumCardinality property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumCardinality() {
        return maximumCardinality;
    }

    /**
     * Sets the value of the maximumCardinality property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumCardinality(String value) {
        this.maximumCardinality = value;
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
     * Gets the value of the defaultProductId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultProductId() {
        return defaultProductId;
    }

    /**
     * Sets the value of the defaultProductId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultProductId(String value) {
        this.defaultProductId = value;
    }

    /**
     * Gets the value of the defaultCardinality property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultCardinality() {
        return defaultCardinality;
    }

    /**
     * Sets the value of the defaultCardinality property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultCardinality(String value) {
        this.defaultCardinality = value;
    }

    /**
     * Gets the value of the className property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassName() {
        return className;
    }

    /**
     * Sets the value of the className property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassName(String value) {
        this.className = value;
    }

    /**
     * Gets the value of the classId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassId() {
        return classId;
    }

    /**
     * Sets the value of the classId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassId(String value) {
        this.classId = value;
    }

    /**
     * Gets the value of the relationshipDomain property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relationshipDomain property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelationshipDomain().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RelationshipDomain }
     * 
     * 
     */
    public List<RelationshipDomain> getRelationshipDomain() {
        if (relationshipDomain == null) {
            relationshipDomain = new ArrayList<RelationshipDomain>();
        }
        return this.relationshipDomain;
    }

    /**
     * Gets the value of the relationshipDecoration property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relationshipDecoration property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelationshipDecoration().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RelationshipDecoration }
     * 
     * 
     */
    public List<RelationshipDecoration> getRelationshipDecoration() {
        if (relationshipDecoration == null) {
            relationshipDecoration = new ArrayList<RelationshipDecoration>();
        }
        return this.relationshipDecoration;
    }

}
