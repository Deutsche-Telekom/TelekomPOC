
package com.siebel.ordermanagement.catalog.data.udspublishcatalog.query;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProductQuery complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductQuery">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Quantity" type="{http://siebel.com/OrderManagement/Catalog/Data/UDSPublishCatalog/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PrePick" type="{http://siebel.com/OrderManagement/Catalog/Data/UDSPublishCatalog/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ParentId" type="{http://siebel.com/OrderManagement/Catalog/Data/UDSPublishCatalog/Query}queryType" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://siebel.com/OrderManagement/Catalog/Data/UDSPublishCatalog/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ID" type="{http://siebel.com/OrderManagement/Catalog/Data/UDSPublishCatalog/Query}queryType" minOccurs="0"/>
 *         &lt;element name="Created" type="{http://siebel.com/OrderManagement/Catalog/Data/UDSPublishCatalog/Query}queryType" minOccurs="0"/>
 *         &lt;element name="Updated" type="{http://siebel.com/OrderManagement/Catalog/Data/UDSPublishCatalog/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ProductConfigurationModelId" type="{http://siebel.com/OrderManagement/Catalog/Data/UDSPublishCatalog/Query}queryType" minOccurs="0"/>
 *         &lt;element name="EligibilityReason" type="{http://siebel.com/OrderManagement/Catalog/Data/UDSPublishCatalog/Query}queryType" minOccurs="0"/>
 *         &lt;element name="EligibilityStatus" type="{http://siebel.com/OrderManagement/Catalog/Data/UDSPublishCatalog/Query}queryType" minOccurs="0"/>
 *         &lt;element name="EffectiveTo" type="{http://siebel.com/OrderManagement/Catalog/Data/UDSPublishCatalog/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ImageFileExt" type="{http://siebel.com/OrderManagement/Catalog/Data/UDSPublishCatalog/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ImageFileName" type="{http://siebel.com/OrderManagement/Catalog/Data/UDSPublishCatalog/Query}queryType" minOccurs="0"/>
 *         &lt;element name="InclusiveEligibilityFlag" type="{http://siebel.com/OrderManagement/Catalog/Data/UDSPublishCatalog/Query}queryType" minOccurs="0"/>
 *         &lt;element name="IntegrationId" type="{http://siebel.com/OrderManagement/Catalog/Data/UDSPublishCatalog/Query}queryType" minOccurs="0"/>
 *         &lt;element name="NetPrice" type="{http://siebel.com/OrderManagement/Catalog/Data/UDSPublishCatalog/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ListPrice" type="{http://siebel.com/OrderManagement/Catalog/Data/UDSPublishCatalog/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ListPriceTypeCode" type="{http://siebel.com/OrderManagement/Catalog/Data/UDSPublishCatalog/Query}queryType" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://siebel.com/OrderManagement/Catalog/Data/UDSPublishCatalog/Query}queryType" minOccurs="0"/>
 *         &lt;element name="Orderable" type="{http://siebel.com/OrderManagement/Catalog/Data/UDSPublishCatalog/Query}queryType" minOccurs="0"/>
 *         &lt;element name="Part" type="{http://siebel.com/OrderManagement/Catalog/Data/UDSPublishCatalog/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PriceListId" type="{http://siebel.com/OrderManagement/Catalog/Data/UDSPublishCatalog/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ProductLineId" type="{http://siebel.com/OrderManagement/Catalog/Data/UDSPublishCatalog/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ProductDefTypeCode" type="{http://siebel.com/OrderManagement/Catalog/Data/UDSPublishCatalog/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ProductId" type="{http://siebel.com/OrderManagement/Catalog/Data/UDSPublishCatalog/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ReferencePrice" type="{http://siebel.com/OrderManagement/Catalog/Data/UDSPublishCatalog/Query}queryType" minOccurs="0"/>
 *         &lt;element name="EffectiveFrom" type="{http://siebel.com/OrderManagement/Catalog/Data/UDSPublishCatalog/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ThumbnImageFileExt" type="{http://siebel.com/OrderManagement/Catalog/Data/UDSPublishCatalog/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ThumbnImageFileName" type="{http://siebel.com/OrderManagement/Catalog/Data/UDSPublishCatalog/Query}queryType" minOccurs="0"/>
 *         &lt;element name="UnitofMeasure" type="{http://siebel.com/OrderManagement/Catalog/Data/UDSPublishCatalog/Query}queryType" minOccurs="0"/>
 *         &lt;element name="VendorIntegrationId" type="{http://siebel.com/OrderManagement/Catalog/Data/UDSPublishCatalog/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ClassId" type="{http://siebel.com/OrderManagement/Catalog/Data/UDSPublishCatalog/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ListOfProductAttribute" type="{http://siebel.com/OrderManagement/Catalog/Data/UDSPublishCatalog/Query}ListOfProductAttributeQuery" minOccurs="0"/>
 *         &lt;element name="ListOfNetPriceWaterfall" type="{http://siebel.com/OrderManagement/Catalog/Data/UDSPublishCatalog/Query}ListOfNetPriceWaterfallQuery" minOccurs="0"/>
 *         &lt;element name="ListOfProductTranslation" type="{http://siebel.com/OrderManagement/Catalog/Data/UDSPublishCatalog/Query}ListOfProductTranslationQuery" minOccurs="0"/>
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
@XmlType(name = "ProductQuery", propOrder = {
    "quantity",
    "prePick",
    "parentId",
    "description",
    "id",
    "created",
    "updated",
    "productConfigurationModelId",
    "eligibilityReason",
    "eligibilityStatus",
    "effectiveTo",
    "imageFileExt",
    "imageFileName",
    "inclusiveEligibilityFlag",
    "integrationId",
    "netPrice",
    "listPrice",
    "listPriceTypeCode",
    "name",
    "orderable",
    "part",
    "priceListId",
    "productLineId",
    "productDefTypeCode",
    "productId",
    "referencePrice",
    "effectiveFrom",
    "thumbnImageFileExt",
    "thumbnImageFileName",
    "unitofMeasure",
    "vendorIntegrationId",
    "classId",
    "listOfProductAttribute",
    "listOfNetPriceWaterfall",
    "listOfProductTranslation"
})
public class ProductQuery
    implements Serializable
{

    @XmlElement(name = "Quantity")
    protected QueryType quantity;
    @XmlElement(name = "PrePick")
    protected QueryType prePick;
    @XmlElement(name = "ParentId")
    protected QueryType parentId;
    @XmlElement(name = "Description")
    protected QueryType description;
    @XmlElement(name = "ID")
    protected QueryType id;
    @XmlElement(name = "Created")
    protected QueryType created;
    @XmlElement(name = "Updated")
    protected QueryType updated;
    @XmlElement(name = "ProductConfigurationModelId")
    protected QueryType productConfigurationModelId;
    @XmlElement(name = "EligibilityReason")
    protected QueryType eligibilityReason;
    @XmlElement(name = "EligibilityStatus")
    protected QueryType eligibilityStatus;
    @XmlElement(name = "EffectiveTo")
    protected QueryType effectiveTo;
    @XmlElement(name = "ImageFileExt")
    protected QueryType imageFileExt;
    @XmlElement(name = "ImageFileName")
    protected QueryType imageFileName;
    @XmlElement(name = "InclusiveEligibilityFlag")
    protected QueryType inclusiveEligibilityFlag;
    @XmlElement(name = "IntegrationId")
    protected QueryType integrationId;
    @XmlElement(name = "NetPrice")
    protected QueryType netPrice;
    @XmlElement(name = "ListPrice")
    protected QueryType listPrice;
    @XmlElement(name = "ListPriceTypeCode")
    protected QueryType listPriceTypeCode;
    @XmlElement(name = "Name")
    protected QueryType name;
    @XmlElement(name = "Orderable")
    protected QueryType orderable;
    @XmlElement(name = "Part")
    protected QueryType part;
    @XmlElement(name = "PriceListId")
    protected QueryType priceListId;
    @XmlElement(name = "ProductLineId")
    protected QueryType productLineId;
    @XmlElement(name = "ProductDefTypeCode")
    protected QueryType productDefTypeCode;
    @XmlElement(name = "ProductId")
    protected QueryType productId;
    @XmlElement(name = "ReferencePrice")
    protected QueryType referencePrice;
    @XmlElement(name = "EffectiveFrom")
    protected QueryType effectiveFrom;
    @XmlElement(name = "ThumbnImageFileExt")
    protected QueryType thumbnImageFileExt;
    @XmlElement(name = "ThumbnImageFileName")
    protected QueryType thumbnImageFileName;
    @XmlElement(name = "UnitofMeasure")
    protected QueryType unitofMeasure;
    @XmlElement(name = "VendorIntegrationId")
    protected QueryType vendorIntegrationId;
    @XmlElement(name = "ClassId")
    protected QueryType classId;
    @XmlElement(name = "ListOfProductAttribute")
    protected ListOfProductAttributeQuery listOfProductAttribute;
    @XmlElement(name = "ListOfNetPriceWaterfall")
    protected ListOfNetPriceWaterfallQuery listOfNetPriceWaterfall;
    @XmlElement(name = "ListOfProductTranslation")
    protected ListOfProductTranslationQuery listOfProductTranslation;
    @XmlAttribute
    protected String searchspec;

    /**
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setQuantity(QueryType value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the prePick property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPrePick() {
        return prePick;
    }

    /**
     * Sets the value of the prePick property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPrePick(QueryType value) {
        this.prePick = value;
    }

    /**
     * Gets the value of the parentId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getParentId() {
        return parentId;
    }

    /**
     * Sets the value of the parentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setParentId(QueryType value) {
        this.parentId = value;
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
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getID() {
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
    public void setID(QueryType value) {
        this.id = value;
    }

    /**
     * Gets the value of the created property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getCreated() {
        return created;
    }

    /**
     * Sets the value of the created property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setCreated(QueryType value) {
        this.created = value;
    }

    /**
     * Gets the value of the updated property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getUpdated() {
        return updated;
    }

    /**
     * Sets the value of the updated property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setUpdated(QueryType value) {
        this.updated = value;
    }

    /**
     * Gets the value of the productConfigurationModelId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getProductConfigurationModelId() {
        return productConfigurationModelId;
    }

    /**
     * Sets the value of the productConfigurationModelId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setProductConfigurationModelId(QueryType value) {
        this.productConfigurationModelId = value;
    }

    /**
     * Gets the value of the eligibilityReason property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getEligibilityReason() {
        return eligibilityReason;
    }

    /**
     * Sets the value of the eligibilityReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setEligibilityReason(QueryType value) {
        this.eligibilityReason = value;
    }

    /**
     * Gets the value of the eligibilityStatus property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getEligibilityStatus() {
        return eligibilityStatus;
    }

    /**
     * Sets the value of the eligibilityStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setEligibilityStatus(QueryType value) {
        this.eligibilityStatus = value;
    }

    /**
     * Gets the value of the effectiveTo property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getEffectiveTo() {
        return effectiveTo;
    }

    /**
     * Sets the value of the effectiveTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setEffectiveTo(QueryType value) {
        this.effectiveTo = value;
    }

    /**
     * Gets the value of the imageFileExt property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getImageFileExt() {
        return imageFileExt;
    }

    /**
     * Sets the value of the imageFileExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setImageFileExt(QueryType value) {
        this.imageFileExt = value;
    }

    /**
     * Gets the value of the imageFileName property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getImageFileName() {
        return imageFileName;
    }

    /**
     * Sets the value of the imageFileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setImageFileName(QueryType value) {
        this.imageFileName = value;
    }

    /**
     * Gets the value of the inclusiveEligibilityFlag property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getInclusiveEligibilityFlag() {
        return inclusiveEligibilityFlag;
    }

    /**
     * Sets the value of the inclusiveEligibilityFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setInclusiveEligibilityFlag(QueryType value) {
        this.inclusiveEligibilityFlag = value;
    }

    /**
     * Gets the value of the integrationId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getIntegrationId() {
        return integrationId;
    }

    /**
     * Sets the value of the integrationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setIntegrationId(QueryType value) {
        this.integrationId = value;
    }

    /**
     * Gets the value of the netPrice property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getNetPrice() {
        return netPrice;
    }

    /**
     * Sets the value of the netPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setNetPrice(QueryType value) {
        this.netPrice = value;
    }

    /**
     * Gets the value of the listPrice property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getListPrice() {
        return listPrice;
    }

    /**
     * Sets the value of the listPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setListPrice(QueryType value) {
        this.listPrice = value;
    }

    /**
     * Gets the value of the listPriceTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getListPriceTypeCode() {
        return listPriceTypeCode;
    }

    /**
     * Sets the value of the listPriceTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setListPriceTypeCode(QueryType value) {
        this.listPriceTypeCode = value;
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
     * Gets the value of the orderable property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getOrderable() {
        return orderable;
    }

    /**
     * Sets the value of the orderable property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setOrderable(QueryType value) {
        this.orderable = value;
    }

    /**
     * Gets the value of the part property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPart() {
        return part;
    }

    /**
     * Sets the value of the part property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPart(QueryType value) {
        this.part = value;
    }

    /**
     * Gets the value of the priceListId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPriceListId() {
        return priceListId;
    }

    /**
     * Sets the value of the priceListId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPriceListId(QueryType value) {
        this.priceListId = value;
    }

    /**
     * Gets the value of the productLineId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getProductLineId() {
        return productLineId;
    }

    /**
     * Sets the value of the productLineId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setProductLineId(QueryType value) {
        this.productLineId = value;
    }

    /**
     * Gets the value of the productDefTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getProductDefTypeCode() {
        return productDefTypeCode;
    }

    /**
     * Sets the value of the productDefTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setProductDefTypeCode(QueryType value) {
        this.productDefTypeCode = value;
    }

    /**
     * Gets the value of the productId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getProductId() {
        return productId;
    }

    /**
     * Sets the value of the productId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setProductId(QueryType value) {
        this.productId = value;
    }

    /**
     * Gets the value of the referencePrice property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getReferencePrice() {
        return referencePrice;
    }

    /**
     * Sets the value of the referencePrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setReferencePrice(QueryType value) {
        this.referencePrice = value;
    }

    /**
     * Gets the value of the effectiveFrom property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getEffectiveFrom() {
        return effectiveFrom;
    }

    /**
     * Sets the value of the effectiveFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setEffectiveFrom(QueryType value) {
        this.effectiveFrom = value;
    }

    /**
     * Gets the value of the thumbnImageFileExt property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getThumbnImageFileExt() {
        return thumbnImageFileExt;
    }

    /**
     * Sets the value of the thumbnImageFileExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setThumbnImageFileExt(QueryType value) {
        this.thumbnImageFileExt = value;
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
     * Gets the value of the unitofMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getUnitofMeasure() {
        return unitofMeasure;
    }

    /**
     * Sets the value of the unitofMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setUnitofMeasure(QueryType value) {
        this.unitofMeasure = value;
    }

    /**
     * Gets the value of the vendorIntegrationId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getVendorIntegrationId() {
        return vendorIntegrationId;
    }

    /**
     * Sets the value of the vendorIntegrationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setVendorIntegrationId(QueryType value) {
        this.vendorIntegrationId = value;
    }

    /**
     * Gets the value of the classId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getClassId() {
        return classId;
    }

    /**
     * Sets the value of the classId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setClassId(QueryType value) {
        this.classId = value;
    }

    /**
     * Gets the value of the listOfProductAttribute property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfProductAttributeQuery }
     *     
     */
    public ListOfProductAttributeQuery getListOfProductAttribute() {
        return listOfProductAttribute;
    }

    /**
     * Sets the value of the listOfProductAttribute property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfProductAttributeQuery }
     *     
     */
    public void setListOfProductAttribute(ListOfProductAttributeQuery value) {
        this.listOfProductAttribute = value;
    }

    /**
     * Gets the value of the listOfNetPriceWaterfall property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfNetPriceWaterfallQuery }
     *     
     */
    public ListOfNetPriceWaterfallQuery getListOfNetPriceWaterfall() {
        return listOfNetPriceWaterfall;
    }

    /**
     * Sets the value of the listOfNetPriceWaterfall property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfNetPriceWaterfallQuery }
     *     
     */
    public void setListOfNetPriceWaterfall(ListOfNetPriceWaterfallQuery value) {
        this.listOfNetPriceWaterfall = value;
    }

    /**
     * Gets the value of the listOfProductTranslation property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfProductTranslationQuery }
     *     
     */
    public ListOfProductTranslationQuery getListOfProductTranslation() {
        return listOfProductTranslation;
    }

    /**
     * Sets the value of the listOfProductTranslation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfProductTranslationQuery }
     *     
     */
    public void setListOfProductTranslation(ListOfProductTranslationQuery value) {
        this.listOfProductTranslation = value;
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
