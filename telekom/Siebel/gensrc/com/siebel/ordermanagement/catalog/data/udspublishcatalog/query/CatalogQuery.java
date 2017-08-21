
package com.siebel.ordermanagement.catalog.data.udspublishcatalog.query;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CatalogQuery complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CatalogQuery">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://siebel.com/OrderManagement/Catalog/Data/UDSPublishCatalog/Query}queryType" minOccurs="0"/>
 *         &lt;element name="Active" type="{http://siebel.com/OrderManagement/Catalog/Data/UDSPublishCatalog/Query}queryType" minOccurs="0"/>
 *         &lt;element name="CatalogType" type="{http://siebel.com/OrderManagement/Catalog/Data/UDSPublishCatalog/Query}queryType" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://siebel.com/OrderManagement/Catalog/Data/UDSPublishCatalog/Query}queryType" minOccurs="0"/>
 *         &lt;element name="EffectiveEndDate" type="{http://siebel.com/OrderManagement/Catalog/Data/UDSPublishCatalog/Query}queryType" minOccurs="0"/>
 *         &lt;element name="EffectiveStartDate" type="{http://siebel.com/OrderManagement/Catalog/Data/UDSPublishCatalog/Query}queryType" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://siebel.com/OrderManagement/Catalog/Data/UDSPublishCatalog/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PrivateFlag" type="{http://siebel.com/OrderManagement/Catalog/Data/UDSPublishCatalog/Query}queryType" minOccurs="0"/>
 *         &lt;element name="SequenceNumber" type="{http://siebel.com/OrderManagement/Catalog/Data/UDSPublishCatalog/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ThumbnImageFileName" type="{http://siebel.com/OrderManagement/Catalog/Data/UDSPublishCatalog/Query}queryType" minOccurs="0"/>
 *         &lt;element name="Version" type="{http://siebel.com/OrderManagement/Catalog/Data/UDSPublishCatalog/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ListOfCategory" type="{http://siebel.com/OrderManagement/Catalog/Data/UDSPublishCatalog/Query}ListOfCategoryQuery" minOccurs="0"/>
 *         &lt;element name="ListOfCatalogTranslation" type="{http://siebel.com/OrderManagement/Catalog/Data/UDSPublishCatalog/Query}ListOfCatalogTranslationQuery" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="searchspec" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CatalogQuery", propOrder = {
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
public class CatalogQuery
    implements Serializable
{

    @XmlElement(name = "Id")
    protected QueryType id;
    @XmlElement(name = "Active")
    protected QueryType active;
    @XmlElement(name = "CatalogType")
    protected QueryType catalogType;
    @XmlElement(name = "Description")
    protected QueryType description;
    @XmlElement(name = "EffectiveEndDate")
    protected QueryType effectiveEndDate;
    @XmlElement(name = "EffectiveStartDate")
    protected QueryType effectiveStartDate;
    @XmlElement(name = "Name")
    protected QueryType name;
    @XmlElement(name = "PrivateFlag")
    protected QueryType privateFlag;
    @XmlElement(name = "SequenceNumber")
    protected QueryType sequenceNumber;
    @XmlElement(name = "ThumbnImageFileName")
    protected QueryType thumbnImageFileName;
    @XmlElement(name = "Version")
    protected QueryType version;
    @XmlElement(name = "ListOfCategory")
    protected ListOfCategoryQuery listOfCategory;
    @XmlElement(name = "ListOfCatalogTranslation")
    protected ListOfCatalogTranslationQuery listOfCatalogTranslation;
    @XmlAttribute
    protected String searchspec;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setId(QueryType value) {
        this.id = value;
    }

    /**
     * Gets the value of the active property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getActive() {
        return active;
    }

    /**
     * Sets the value of the active property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setActive(QueryType value) {
        this.active = value;
    }

    /**
     * Gets the value of the catalogType property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getCatalogType() {
        return catalogType;
    }

    /**
     * Sets the value of the catalogType property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setCatalogType(QueryType value) {
        this.catalogType = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setDescription(QueryType value) {
        this.description = value;
    }

    /**
     * Gets the value of the effectiveEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getEffectiveEndDate() {
        return effectiveEndDate;
    }

    /**
     * Sets the value of the effectiveEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setEffectiveEndDate(QueryType value) {
        this.effectiveEndDate = value;
    }

    /**
     * Gets the value of the effectiveStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getEffectiveStartDate() {
        return effectiveStartDate;
    }

    /**
     * Sets the value of the effectiveStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setEffectiveStartDate(QueryType value) {
        this.effectiveStartDate = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setName(QueryType value) {
        this.name = value;
    }

    /**
     * Gets the value of the privateFlag property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPrivateFlag() {
        return privateFlag;
    }

    /**
     * Sets the value of the privateFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPrivateFlag(QueryType value) {
        this.privateFlag = value;
    }

    /**
     * Gets the value of the sequenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getSequenceNumber() {
        return sequenceNumber;
    }

    /**
     * Sets the value of the sequenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setSequenceNumber(QueryType value) {
        this.sequenceNumber = value;
    }

    /**
     * Gets the value of the thumbnImageFileName property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getThumbnImageFileName() {
        return thumbnImageFileName;
    }

    /**
     * Sets the value of the thumbnImageFileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setThumbnImageFileName(QueryType value) {
        this.thumbnImageFileName = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setVersion(QueryType value) {
        this.version = value;
    }

    /**
     * Gets the value of the listOfCategory property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfCategoryQuery }
     *     
     */
    public ListOfCategoryQuery getListOfCategory() {
        return listOfCategory;
    }

    /**
     * Sets the value of the listOfCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfCategoryQuery }
     *     
     */
    public void setListOfCategory(ListOfCategoryQuery value) {
        this.listOfCategory = value;
    }

    /**
     * Gets the value of the listOfCatalogTranslation property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfCatalogTranslationQuery }
     *     
     */
    public ListOfCatalogTranslationQuery getListOfCatalogTranslation() {
        return listOfCatalogTranslation;
    }

    /**
     * Sets the value of the listOfCatalogTranslation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfCatalogTranslationQuery }
     *     
     */
    public void setListOfCatalogTranslation(ListOfCatalogTranslationQuery value) {
        this.listOfCatalogTranslation = value;
    }

    /**
     * Gets the value of the searchspec property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchspec() {
        return searchspec;
    }

    /**
     * Sets the value of the searchspec property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchspec(String value) {
        this.searchspec = value;
    }

}
