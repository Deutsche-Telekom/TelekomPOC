
package com.siebel.ordermanagement.catalog.data.udspublishcatalog.query;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CategoryQuery complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CategoryQuery">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://siebel.com/OrderManagement/Catalog/Data/UDSPublishCatalog/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ActiveFlag" type="{http://siebel.com/OrderManagement/Catalog/Data/UDSPublishCatalog/Query}queryType" minOccurs="0"/>
 *         &lt;element name="CatalogId" type="{http://siebel.com/OrderManagement/Catalog/Data/UDSPublishCatalog/Query}queryType" minOccurs="0"/>
 *         &lt;element name="Count" type="{http://siebel.com/OrderManagement/Catalog/Data/UDSPublishCatalog/Query}queryType" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://siebel.com/OrderManagement/Catalog/Data/UDSPublishCatalog/Query}queryType" minOccurs="0"/>
 *         &lt;element name="DisplayName" type="{http://siebel.com/OrderManagement/Catalog/Data/UDSPublishCatalog/Query}queryType" minOccurs="0"/>
 *         &lt;element name="DisplayTemplate" type="{http://siebel.com/OrderManagement/Catalog/Data/UDSPublishCatalog/Query}queryType" minOccurs="0"/>
 *         &lt;element name="EffectiveEndDate" type="{http://siebel.com/OrderManagement/Catalog/Data/UDSPublishCatalog/Query}queryType" minOccurs="0"/>
 *         &lt;element name="EffectiveStartDate" type="{http://siebel.com/OrderManagement/Catalog/Data/UDSPublishCatalog/Query}queryType" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://siebel.com/OrderManagement/Catalog/Data/UDSPublishCatalog/Query}queryType" minOccurs="0"/>
 *         &lt;element name="NoTrainingFlag" type="{http://siebel.com/OrderManagement/Catalog/Data/UDSPublishCatalog/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ParentCategoryId" type="{http://siebel.com/OrderManagement/Catalog/Data/UDSPublishCatalog/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ParentCategoryName" type="{http://siebel.com/OrderManagement/Catalog/Data/UDSPublishCatalog/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PrivateFlag" type="{http://siebel.com/OrderManagement/Catalog/Data/UDSPublishCatalog/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ResponseThreshold" type="{http://siebel.com/OrderManagement/Catalog/Data/UDSPublishCatalog/Query}queryType" minOccurs="0"/>
 *         &lt;element name="RootCategoryFlag" type="{http://siebel.com/OrderManagement/Catalog/Data/UDSPublishCatalog/Query}queryType" minOccurs="0"/>
 *         &lt;element name="RootCategoryId" type="{http://siebel.com/OrderManagement/Catalog/Data/UDSPublishCatalog/Query}queryType" minOccurs="0"/>
 *         &lt;element name="SequenceNumber" type="{http://siebel.com/OrderManagement/Catalog/Data/UDSPublishCatalog/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ThumbnImageFileName" type="{http://siebel.com/OrderManagement/Catalog/Data/UDSPublishCatalog/Query}queryType" minOccurs="0"/>
 *         &lt;element name="Usage" type="{http://siebel.com/OrderManagement/Catalog/Data/UDSPublishCatalog/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ListOfProduct" type="{http://siebel.com/OrderManagement/Catalog/Data/UDSPublishCatalog/Query}ListOfProductQuery" minOccurs="0"/>
 *         &lt;element name="ListOfCategoryTranslation" type="{http://siebel.com/OrderManagement/Catalog/Data/UDSPublishCatalog/Query}ListOfCategoryTranslationQuery" minOccurs="0"/>
 *         &lt;element name="Category" type="{http://siebel.com/OrderManagement/Catalog/Data/UDSPublishCatalog/Query}CategoryQuery" minOccurs="0"/>
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
@XmlType(name = "CategoryQuery", propOrder = {
    "id",
    "activeFlag",
    "catalogId",
    "count",
    "description",
    "displayName",
    "displayTemplate",
    "effectiveEndDate",
    "effectiveStartDate",
    "name",
    "noTrainingFlag",
    "parentCategoryId",
    "parentCategoryName",
    "privateFlag",
    "responseThreshold",
    "rootCategoryFlag",
    "rootCategoryId",
    "sequenceNumber",
    "thumbnImageFileName",
    "usage",
    "listOfProduct",
    "listOfCategoryTranslation",
    "category"
})
public class CategoryQuery
    implements Serializable
{

    @XmlElement(name = "Id")
    protected QueryType id;
    @XmlElement(name = "ActiveFlag")
    protected QueryType activeFlag;
    @XmlElement(name = "CatalogId")
    protected QueryType catalogId;
    @XmlElement(name = "Count")
    protected QueryType count;
    @XmlElement(name = "Description")
    protected QueryType description;
    @XmlElement(name = "DisplayName")
    protected QueryType displayName;
    @XmlElement(name = "DisplayTemplate")
    protected QueryType displayTemplate;
    @XmlElement(name = "EffectiveEndDate")
    protected QueryType effectiveEndDate;
    @XmlElement(name = "EffectiveStartDate")
    protected QueryType effectiveStartDate;
    @XmlElement(name = "Name")
    protected QueryType name;
    @XmlElement(name = "NoTrainingFlag")
    protected QueryType noTrainingFlag;
    @XmlElement(name = "ParentCategoryId")
    protected QueryType parentCategoryId;
    @XmlElement(name = "ParentCategoryName")
    protected QueryType parentCategoryName;
    @XmlElement(name = "PrivateFlag")
    protected QueryType privateFlag;
    @XmlElement(name = "ResponseThreshold")
    protected QueryType responseThreshold;
    @XmlElement(name = "RootCategoryFlag")
    protected QueryType rootCategoryFlag;
    @XmlElement(name = "RootCategoryId")
    protected QueryType rootCategoryId;
    @XmlElement(name = "SequenceNumber")
    protected QueryType sequenceNumber;
    @XmlElement(name = "ThumbnImageFileName")
    protected QueryType thumbnImageFileName;
    @XmlElement(name = "Usage")
    protected QueryType usage;
    @XmlElement(name = "ListOfProduct")
    protected ListOfProductQuery listOfProduct;
    @XmlElement(name = "ListOfCategoryTranslation")
    protected ListOfCategoryTranslationQuery listOfCategoryTranslation;
    @XmlElement(name = "Category")
    protected CategoryQuery category;
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
     * Gets the value of the activeFlag property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getActiveFlag() {
        return activeFlag;
    }

    /**
     * Sets the value of the activeFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setActiveFlag(QueryType value) {
        this.activeFlag = value;
    }

    /**
     * Gets the value of the catalogId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getCatalogId() {
        return catalogId;
    }

    /**
     * Sets the value of the catalogId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setCatalogId(QueryType value) {
        this.catalogId = value;
    }

    /**
     * Gets the value of the count property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getCount() {
        return count;
    }

    /**
     * Sets the value of the count property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setCount(QueryType value) {
        this.count = value;
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
     * Gets the value of the displayName property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getDisplayName() {
        return displayName;
    }

    /**
     * Sets the value of the displayName property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setDisplayName(QueryType value) {
        this.displayName = value;
    }

    /**
     * Gets the value of the displayTemplate property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getDisplayTemplate() {
        return displayTemplate;
    }

    /**
     * Sets the value of the displayTemplate property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setDisplayTemplate(QueryType value) {
        this.displayTemplate = value;
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
     * Gets the value of the noTrainingFlag property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getNoTrainingFlag() {
        return noTrainingFlag;
    }

    /**
     * Sets the value of the noTrainingFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setNoTrainingFlag(QueryType value) {
        this.noTrainingFlag = value;
    }

    /**
     * Gets the value of the parentCategoryId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getParentCategoryId() {
        return parentCategoryId;
    }

    /**
     * Sets the value of the parentCategoryId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setParentCategoryId(QueryType value) {
        this.parentCategoryId = value;
    }

    /**
     * Gets the value of the parentCategoryName property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getParentCategoryName() {
        return parentCategoryName;
    }

    /**
     * Sets the value of the parentCategoryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setParentCategoryName(QueryType value) {
        this.parentCategoryName = value;
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
     * Gets the value of the responseThreshold property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getResponseThreshold() {
        return responseThreshold;
    }

    /**
     * Sets the value of the responseThreshold property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setResponseThreshold(QueryType value) {
        this.responseThreshold = value;
    }

    /**
     * Gets the value of the rootCategoryFlag property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getRootCategoryFlag() {
        return rootCategoryFlag;
    }

    /**
     * Sets the value of the rootCategoryFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setRootCategoryFlag(QueryType value) {
        this.rootCategoryFlag = value;
    }

    /**
     * Gets the value of the rootCategoryId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getRootCategoryId() {
        return rootCategoryId;
    }

    /**
     * Sets the value of the rootCategoryId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setRootCategoryId(QueryType value) {
        this.rootCategoryId = value;
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
     * Gets the value of the usage property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getUsage() {
        return usage;
    }

    /**
     * Sets the value of the usage property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setUsage(QueryType value) {
        this.usage = value;
    }

    /**
     * Gets the value of the listOfProduct property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfProductQuery }
     *     
     */
    public ListOfProductQuery getListOfProduct() {
        return listOfProduct;
    }

    /**
     * Sets the value of the listOfProduct property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfProductQuery }
     *     
     */
    public void setListOfProduct(ListOfProductQuery value) {
        this.listOfProduct = value;
    }

    /**
     * Gets the value of the listOfCategoryTranslation property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfCategoryTranslationQuery }
     *     
     */
    public ListOfCategoryTranslationQuery getListOfCategoryTranslation() {
        return listOfCategoryTranslation;
    }

    /**
     * Sets the value of the listOfCategoryTranslation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfCategoryTranslationQuery }
     *     
     */
    public void setListOfCategoryTranslation(ListOfCategoryTranslationQuery value) {
        this.listOfCategoryTranslation = value;
    }

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link CategoryQuery }
     *     
     */
    public CategoryQuery getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link CategoryQuery }
     *     
     */
    public void setCategory(CategoryQuery value) {
        this.category = value;
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
