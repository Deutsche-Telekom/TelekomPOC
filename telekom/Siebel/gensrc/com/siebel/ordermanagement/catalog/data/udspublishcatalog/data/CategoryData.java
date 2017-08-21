
package com.siebel.ordermanagement.catalog.data.udspublishcatalog.data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CategoryData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CategoryData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ActiveFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CatalogId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Count" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DisplayName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DisplayTemplate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EffectiveEndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EffectiveStartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NoTrainingFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ParentCategoryId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ParentCategoryName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrivateFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ResponseThreshold" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="RootCategoryFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RootCategoryId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SequenceNumber" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ThumbnImageFileName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Usage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ListOfProduct" type="{http://siebel.com/OrderManagement/Catalog/Data/UDSPublishCatalog/Data}ListOfProductData" minOccurs="0"/>
 *         &lt;element name="ListOfCategoryTranslation" type="{http://siebel.com/OrderManagement/Catalog/Data/UDSPublishCatalog/Data}ListOfCategoryTranslationData" minOccurs="0"/>
 *         &lt;element name="Category" type="{http://siebel.com/OrderManagement/Catalog/Data/UDSPublishCatalog/Data}CategoryData" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "CategoryData", propOrder = {
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
public class CategoryData
    implements Serializable
{

    @XmlElement(name = "Id")
    protected String id;
    @XmlElement(name = "ActiveFlag")
    protected String activeFlag;
    @XmlElement(name = "CatalogId")
    protected String catalogId;
    @XmlElement(name = "Count")
    protected BigDecimal count;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "DisplayName")
    protected String displayName;
    @XmlElement(name = "DisplayTemplate")
    protected String displayTemplate;
    @XmlElement(name = "EffectiveEndDate")
    protected String effectiveEndDate;
    @XmlElement(name = "EffectiveStartDate")
    protected String effectiveStartDate;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "NoTrainingFlag")
    protected String noTrainingFlag;
    @XmlElement(name = "ParentCategoryId")
    protected String parentCategoryId;
    @XmlElement(name = "ParentCategoryName")
    protected String parentCategoryName;
    @XmlElement(name = "PrivateFlag")
    protected String privateFlag;
    @XmlElement(name = "ResponseThreshold")
    protected BigDecimal responseThreshold;
    @XmlElement(name = "RootCategoryFlag")
    protected String rootCategoryFlag;
    @XmlElement(name = "RootCategoryId")
    protected String rootCategoryId;
    @XmlElement(name = "SequenceNumber")
    protected BigDecimal sequenceNumber;
    @XmlElement(name = "ThumbnImageFileName")
    protected String thumbnImageFileName;
    @XmlElement(name = "Usage")
    protected String usage;
    @XmlElement(name = "ListOfProduct")
    protected ListOfProductData listOfProduct;
    @XmlElement(name = "ListOfCategoryTranslation")
    protected ListOfCategoryTranslationData listOfCategoryTranslation;
    @XmlElement(name = "Category")
    protected List<CategoryData> category;
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
     * Gets the value of the activeFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActiveFlag() {
        return activeFlag;
    }

    /**
     * Sets the value of the activeFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActiveFlag(String value) {
        this.activeFlag = value;
    }

    /**
     * Gets the value of the catalogId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCatalogId() {
        return catalogId;
    }

    /**
     * Sets the value of the catalogId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCatalogId(String value) {
        this.catalogId = value;
    }

    /**
     * Gets the value of the count property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCount() {
        return count;
    }

    /**
     * Sets the value of the count property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCount(BigDecimal value) {
        this.count = value;
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
     * Gets the value of the displayTemplate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayTemplate() {
        return displayTemplate;
    }

    /**
     * Sets the value of the displayTemplate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayTemplate(String value) {
        this.displayTemplate = value;
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
     * Gets the value of the noTrainingFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoTrainingFlag() {
        return noTrainingFlag;
    }

    /**
     * Sets the value of the noTrainingFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoTrainingFlag(String value) {
        this.noTrainingFlag = value;
    }

    /**
     * Gets the value of the parentCategoryId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentCategoryId() {
        return parentCategoryId;
    }

    /**
     * Sets the value of the parentCategoryId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentCategoryId(String value) {
        this.parentCategoryId = value;
    }

    /**
     * Gets the value of the parentCategoryName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentCategoryName() {
        return parentCategoryName;
    }

    /**
     * Sets the value of the parentCategoryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentCategoryName(String value) {
        this.parentCategoryName = value;
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
     * Gets the value of the responseThreshold property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getResponseThreshold() {
        return responseThreshold;
    }

    /**
     * Sets the value of the responseThreshold property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setResponseThreshold(BigDecimal value) {
        this.responseThreshold = value;
    }

    /**
     * Gets the value of the rootCategoryFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRootCategoryFlag() {
        return rootCategoryFlag;
    }

    /**
     * Sets the value of the rootCategoryFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRootCategoryFlag(String value) {
        this.rootCategoryFlag = value;
    }

    /**
     * Gets the value of the rootCategoryId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRootCategoryId() {
        return rootCategoryId;
    }

    /**
     * Sets the value of the rootCategoryId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRootCategoryId(String value) {
        this.rootCategoryId = value;
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
     * Gets the value of the usage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsage() {
        return usage;
    }

    /**
     * Sets the value of the usage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsage(String value) {
        this.usage = value;
    }

    /**
     * Gets the value of the listOfProduct property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfProductData }
     *     
     */
    public ListOfProductData getListOfProduct() {
        return listOfProduct;
    }

    /**
     * Sets the value of the listOfProduct property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfProductData }
     *     
     */
    public void setListOfProduct(ListOfProductData value) {
        this.listOfProduct = value;
    }

    /**
     * Gets the value of the listOfCategoryTranslation property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfCategoryTranslationData }
     *     
     */
    public ListOfCategoryTranslationData getListOfCategoryTranslation() {
        return listOfCategoryTranslation;
    }

    /**
     * Sets the value of the listOfCategoryTranslation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfCategoryTranslationData }
     *     
     */
    public void setListOfCategoryTranslation(ListOfCategoryTranslationData value) {
        this.listOfCategoryTranslation = value;
    }

    /**
     * Gets the value of the category property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the category property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCategory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CategoryData }
     * 
     * 
     */
    public List<CategoryData> getCategory() {
        if (category == null) {
            category = new ArrayList<CategoryData>();
        }
        return this.category;
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
