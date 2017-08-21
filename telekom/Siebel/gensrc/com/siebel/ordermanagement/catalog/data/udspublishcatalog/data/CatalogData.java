
package com.siebel.ordermanagement.catalog.data.udspublishcatalog.data;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CatalogData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CatalogData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Active" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CatalogType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EffectiveEndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EffectiveStartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrivateFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SequenceNumber" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ThumbnImageFileName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Version" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ListOfCategory" type="{http://siebel.com/OrderManagement/Catalog/Data/UDSPublishCatalog/Data}ListOfCategoryData" minOccurs="0"/>
 *         &lt;element name="ListOfCatalogTranslation" type="{http://siebel.com/OrderManagement/Catalog/Data/UDSPublishCatalog/Data}ListOfCatalogTranslationData" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="operation" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CatalogData", propOrder = {
    "id",
    "active",
    "catalogType",
    "description",
    "effectiveEndDate",
    "effectiveStartDate",
    "name",
    "privateFlag",
    "sequenceNumber",
    "thumbnImageFileName",
    "version",
    "listOfCategory",
    "listOfCatalogTranslation"
})
public class CatalogData
    implements Serializable
{

    @XmlElement(name = "Id")
    protected String id;
    @XmlElement(name = "Active")
    protected String active;
    @XmlElement(name = "CatalogType")
    protected String catalogType;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "EffectiveEndDate")
    protected String effectiveEndDate;
    @XmlElement(name = "EffectiveStartDate")
    protected String effectiveStartDate;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "PrivateFlag")
    protected String privateFlag;
    @XmlElement(name = "SequenceNumber")
    protected BigDecimal sequenceNumber;
    @XmlElement(name = "ThumbnImageFileName")
    protected String thumbnImageFileName;
    @XmlElement(name = "Version")
    protected BigDecimal version;
    @XmlElement(name = "ListOfCategory")
    protected ListOfCategoryData listOfCategory;
    @XmlElement(name = "ListOfCatalogTranslation")
    protected ListOfCatalogTranslationData listOfCatalogTranslation;
    @XmlAttribute
    protected String operation;

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
     * Gets the value of the catalogType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCatalogType() {
        return catalogType;
    }

    /**
     * Sets the value of the catalogType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCatalogType(String value) {
        this.catalogType = value;
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
     * Gets the value of the effectiveEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEffectiveEndDate() {
        return effectiveEndDate;
    }

    /**
     * Sets the value of the effectiveEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEffectiveEndDate(String value) {
        this.effectiveEndDate = value;
    }

    /**
     * Gets the value of the effectiveStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEffectiveStartDate() {
        return effectiveStartDate;
    }

    /**
     * Sets the value of the effectiveStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEffectiveStartDate(String value) {
        this.effectiveStartDate = value;
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
     * Gets the value of the privateFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrivateFlag() {
        return privateFlag;
    }

    /**
     * Sets the value of the privateFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrivateFlag(String value) {
        this.privateFlag = value;
    }

    /**
     * Gets the value of the sequenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSequenceNumber() {
        return sequenceNumber;
    }

    /**
     * Sets the value of the sequenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSequenceNumber(BigDecimal value) {
        this.sequenceNumber = value;
    }

    /**
     * Gets the value of the thumbnImageFileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThumbnImageFileName() {
        return thumbnImageFileName;
    }

    /**
     * Sets the value of the thumbnImageFileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThumbnImageFileName(String value) {
        this.thumbnImageFileName = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVersion(BigDecimal value) {
        this.version = value;
    }

    /**
     * Gets the value of the listOfCategory property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfCategoryData }
     *     
     */
    public ListOfCategoryData getListOfCategory() {
        return listOfCategory;
    }

    /**
     * Sets the value of the listOfCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfCategoryData }
     *     
     */
    public void setListOfCategory(ListOfCategoryData value) {
        this.listOfCategory = value;
    }

    /**
     * Gets the value of the listOfCatalogTranslation property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfCatalogTranslationData }
     *     
     */
    public ListOfCatalogTranslationData getListOfCatalogTranslation() {
        return listOfCatalogTranslation;
    }

    /**
     * Sets the value of the listOfCatalogTranslation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfCatalogTranslationData }
     *     
     */
    public void setListOfCatalogTranslation(ListOfCatalogTranslationData value) {
        this.listOfCatalogTranslation = value;
    }

    /**
     * Gets the value of the operation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperation() {
        return operation;
    }

    /**
     * Sets the value of the operation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperation(String value) {
        this.operation = value;
    }

}
