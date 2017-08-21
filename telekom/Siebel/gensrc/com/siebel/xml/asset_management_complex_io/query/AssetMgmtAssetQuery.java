
package com.siebel.xml.asset_management_complex_io.query;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssetMgmt-AssetQuery complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AssetMgmt-AssetQuery">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NRCCxTotal" type="{http://www.siebel.com/xml/Asset_Management_Complex_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="MRCCxTotal" type="{http://www.siebel.com/xml/Asset_Management_Complex_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="Id" type="{http://www.siebel.com/xml/Asset_Management_Complex_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="Created" type="{http://www.siebel.com/xml/Asset_Management_Complex_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="Updated" type="{http://www.siebel.com/xml/Asset_Management_Complex_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="AdjustedListPrice" type="{http://www.siebel.com/xml/Asset_Management_Complex_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="AssetCurrencyCode" type="{http://www.siebel.com/xml/Asset_Management_Complex_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="AssetDescription" type="{http://www.siebel.com/xml/Asset_Management_Complex_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="AssetId" type="{http://www.siebel.com/xml/Asset_Management_Complex_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="AssetNumber" type="{http://www.siebel.com/xml/Asset_Management_Complex_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="BillingAccount" type="{http://www.siebel.com/xml/Asset_Management_Complex_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="Comments" type="{http://www.siebel.com/xml/Asset_Management_Complex_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="CompoundProductNumber" type="{http://www.siebel.com/xml/Asset_Management_Complex_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="InstallDate" type="{http://www.siebel.com/xml/Asset_Management_Complex_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="IntegrationId" type="{http://www.siebel.com/xml/Asset_Management_Complex_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="MfgDate" type="{http://www.siebel.com/xml/Asset_Management_Complex_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.siebel.com/xml/Asset_Management_Complex_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ParentAssetId" type="{http://www.siebel.com/xml/Asset_Management_Complex_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PriceType" type="{http://www.siebel.com/xml/Asset_Management_Complex_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ProdPromId" type="{http://www.siebel.com/xml/Asset_Management_Complex_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ProductDefTypeCode" type="{http://www.siebel.com/xml/Asset_Management_Complex_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ProductDescription" type="{http://www.siebel.com/xml/Asset_Management_Complex_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ProductId" type="{http://www.siebel.com/xml/Asset_Management_Complex_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ProductName" type="{http://www.siebel.com/xml/Asset_Management_Complex_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ProductPartNumber" type="{http://www.siebel.com/xml/Asset_Management_Complex_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ProductType" type="{http://www.siebel.com/xml/Asset_Management_Complex_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="Quantity2" type="{http://www.siebel.com/xml/Asset_Management_Complex_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="RegisteredDate" type="{http://www.siebel.com/xml/Asset_Management_Complex_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="RootAssetId" type="{http://www.siebel.com/xml/Asset_Management_Complex_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="RootIntegrationId" type="{http://www.siebel.com/xml/Asset_Management_Complex_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="SerialNumber" type="{http://www.siebel.com/xml/Asset_Management_Complex_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ServiceAccount" type="{http://www.siebel.com/xml/Asset_Management_Complex_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ShipDate" type="{http://www.siebel.com/xml/Asset_Management_Complex_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="SmartPartNumber" type="{http://www.siebel.com/xml/Asset_Management_Complex_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://www.siebel.com/xml/Asset_Management_Complex_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="UnitofMeasure" type="{http://www.siebel.com/xml/Asset_Management_Complex_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="Version" type="{http://www.siebel.com/xml/Asset_Management_Complex_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ListOfAssetMgmt-AssetXa" type="{http://www.siebel.com/xml/Asset_Management_Complex_IO/Query}ListOfAssetMgmt-AssetXaQuery" minOccurs="0"/>
 *         &lt;element name="AssetMgmt-Asset" type="{http://www.siebel.com/xml/Asset_Management_Complex_IO/Query}AssetMgmt-AssetQuery" minOccurs="0"/>
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
@XmlType(name = "AssetMgmt-AssetQuery", propOrder = {
    "nrcCxTotal",
    "mrcCxTotal",
    "id",
    "created",
    "updated",
    "adjustedListPrice",
    "assetCurrencyCode",
    "assetDescription",
    "assetId",
    "assetNumber",
    "billingAccount",
    "comments",
    "compoundProductNumber",
    "installDate",
    "integrationId",
    "mfgDate",
    "name",
    "parentAssetId",
    "priceType",
    "prodPromId",
    "productDefTypeCode",
    "productDescription",
    "productId",
    "productName",
    "productPartNumber",
    "productType",
    "quantity2",
    "registeredDate",
    "rootAssetId",
    "rootIntegrationId",
    "serialNumber",
    "serviceAccount",
    "shipDate",
    "smartPartNumber",
    "status",
    "unitofMeasure",
    "version",
    "listOfAssetMgmtAssetXa",
    "assetMgmtAsset"
})
public class AssetMgmtAssetQuery
    implements Serializable
{

    @XmlElement(name = "NRCCxTotal")
    protected QueryType nrcCxTotal;
    @XmlElement(name = "MRCCxTotal")
    protected QueryType mrcCxTotal;
    @XmlElement(name = "Id")
    protected QueryType id;
    @XmlElement(name = "Created")
    protected QueryType created;
    @XmlElement(name = "Updated")
    protected QueryType updated;
    @XmlElement(name = "AdjustedListPrice")
    protected QueryType adjustedListPrice;
    @XmlElement(name = "AssetCurrencyCode")
    protected QueryType assetCurrencyCode;
    @XmlElement(name = "AssetDescription")
    protected QueryType assetDescription;
    @XmlElement(name = "AssetId")
    protected QueryType assetId;
    @XmlElement(name = "AssetNumber")
    protected QueryType assetNumber;
    @XmlElement(name = "BillingAccount")
    protected QueryType billingAccount;
    @XmlElement(name = "Comments")
    protected QueryType comments;
    @XmlElement(name = "CompoundProductNumber")
    protected QueryType compoundProductNumber;
    @XmlElement(name = "InstallDate")
    protected QueryType installDate;
    @XmlElement(name = "IntegrationId")
    protected QueryType integrationId;
    @XmlElement(name = "MfgDate")
    protected QueryType mfgDate;
    @XmlElement(name = "Name")
    protected QueryType name;
    @XmlElement(name = "ParentAssetId")
    protected QueryType parentAssetId;
    @XmlElement(name = "PriceType")
    protected QueryType priceType;
    @XmlElement(name = "ProdPromId")
    protected QueryType prodPromId;
    @XmlElement(name = "ProductDefTypeCode")
    protected QueryType productDefTypeCode;
    @XmlElement(name = "ProductDescription")
    protected QueryType productDescription;
    @XmlElement(name = "ProductId")
    protected QueryType productId;
    @XmlElement(name = "ProductName")
    protected QueryType productName;
    @XmlElement(name = "ProductPartNumber")
    protected QueryType productPartNumber;
    @XmlElement(name = "ProductType")
    protected QueryType productType;
    @XmlElement(name = "Quantity2")
    protected QueryType quantity2;
    @XmlElement(name = "RegisteredDate")
    protected QueryType registeredDate;
    @XmlElement(name = "RootAssetId")
    protected QueryType rootAssetId;
    @XmlElement(name = "RootIntegrationId")
    protected QueryType rootIntegrationId;
    @XmlElement(name = "SerialNumber")
    protected QueryType serialNumber;
    @XmlElement(name = "ServiceAccount")
    protected QueryType serviceAccount;
    @XmlElement(name = "ShipDate")
    protected QueryType shipDate;
    @XmlElement(name = "SmartPartNumber")
    protected QueryType smartPartNumber;
    @XmlElement(name = "Status")
    protected QueryType status;
    @XmlElement(name = "UnitofMeasure")
    protected QueryType unitofMeasure;
    @XmlElement(name = "Version")
    protected QueryType version;
    @XmlElement(name = "ListOfAssetMgmt-AssetXa")
    protected ListOfAssetMgmtAssetXaQuery listOfAssetMgmtAssetXa;
    @XmlElement(name = "AssetMgmt-Asset")
    protected AssetMgmtAssetQuery assetMgmtAsset;
    @XmlAttribute
    protected String searchspec;

    /**
     * Gets the value of the nrcCxTotal property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getNRCCxTotal() {
        return nrcCxTotal;
    }

    /**
     * Sets the value of the nrcCxTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setNRCCxTotal(QueryType value) {
        this.nrcCxTotal = value;
    }

    /**
     * Gets the value of the mrcCxTotal property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getMRCCxTotal() {
        return mrcCxTotal;
    }

    /**
     * Sets the value of the mrcCxTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setMRCCxTotal(QueryType value) {
        this.mrcCxTotal = value;
    }

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
     * Gets the value of the adjustedListPrice property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getAdjustedListPrice() {
        return adjustedListPrice;
    }

    /**
     * Sets the value of the adjustedListPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setAdjustedListPrice(QueryType value) {
        this.adjustedListPrice = value;
    }

    /**
     * Gets the value of the assetCurrencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getAssetCurrencyCode() {
        return assetCurrencyCode;
    }

    /**
     * Sets the value of the assetCurrencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setAssetCurrencyCode(QueryType value) {
        this.assetCurrencyCode = value;
    }

    /**
     * Gets the value of the assetDescription property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getAssetDescription() {
        return assetDescription;
    }

    /**
     * Sets the value of the assetDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setAssetDescription(QueryType value) {
        this.assetDescription = value;
    }

    /**
     * Gets the value of the assetId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getAssetId() {
        return assetId;
    }

    /**
     * Sets the value of the assetId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setAssetId(QueryType value) {
        this.assetId = value;
    }

    /**
     * Gets the value of the assetNumber property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getAssetNumber() {
        return assetNumber;
    }

    /**
     * Sets the value of the assetNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setAssetNumber(QueryType value) {
        this.assetNumber = value;
    }

    /**
     * Gets the value of the billingAccount property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getBillingAccount() {
        return billingAccount;
    }

    /**
     * Sets the value of the billingAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setBillingAccount(QueryType value) {
        this.billingAccount = value;
    }

    /**
     * Gets the value of the comments property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getComments() {
        return comments;
    }

    /**
     * Sets the value of the comments property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setComments(QueryType value) {
        this.comments = value;
    }

    /**
     * Gets the value of the compoundProductNumber property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getCompoundProductNumber() {
        return compoundProductNumber;
    }

    /**
     * Sets the value of the compoundProductNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setCompoundProductNumber(QueryType value) {
        this.compoundProductNumber = value;
    }

    /**
     * Gets the value of the installDate property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getInstallDate() {
        return installDate;
    }

    /**
     * Sets the value of the installDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setInstallDate(QueryType value) {
        this.installDate = value;
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
     * Gets the value of the mfgDate property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getMfgDate() {
        return mfgDate;
    }

    /**
     * Sets the value of the mfgDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setMfgDate(QueryType value) {
        this.mfgDate = value;
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
     * Gets the value of the parentAssetId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getParentAssetId() {
        return parentAssetId;
    }

    /**
     * Sets the value of the parentAssetId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setParentAssetId(QueryType value) {
        this.parentAssetId = value;
    }

    /**
     * Gets the value of the priceType property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPriceType() {
        return priceType;
    }

    /**
     * Sets the value of the priceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPriceType(QueryType value) {
        this.priceType = value;
    }

    /**
     * Gets the value of the prodPromId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getProdPromId() {
        return prodPromId;
    }

    /**
     * Sets the value of the prodPromId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setProdPromId(QueryType value) {
        this.prodPromId = value;
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
     * Gets the value of the productDescription property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getProductDescription() {
        return productDescription;
    }

    /**
     * Sets the value of the productDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setProductDescription(QueryType value) {
        this.productDescription = value;
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
     * Gets the value of the productName property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getProductName() {
        return productName;
    }

    /**
     * Sets the value of the productName property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setProductName(QueryType value) {
        this.productName = value;
    }

    /**
     * Gets the value of the productPartNumber property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getProductPartNumber() {
        return productPartNumber;
    }

    /**
     * Sets the value of the productPartNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setProductPartNumber(QueryType value) {
        this.productPartNumber = value;
    }

    /**
     * Gets the value of the productType property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getProductType() {
        return productType;
    }

    /**
     * Sets the value of the productType property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setProductType(QueryType value) {
        this.productType = value;
    }

    /**
     * Gets the value of the quantity2 property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getQuantity2() {
        return quantity2;
    }

    /**
     * Sets the value of the quantity2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setQuantity2(QueryType value) {
        this.quantity2 = value;
    }

    /**
     * Gets the value of the registeredDate property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getRegisteredDate() {
        return registeredDate;
    }

    /**
     * Sets the value of the registeredDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setRegisteredDate(QueryType value) {
        this.registeredDate = value;
    }

    /**
     * Gets the value of the rootAssetId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getRootAssetId() {
        return rootAssetId;
    }

    /**
     * Sets the value of the rootAssetId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setRootAssetId(QueryType value) {
        this.rootAssetId = value;
    }

    /**
     * Gets the value of the rootIntegrationId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getRootIntegrationId() {
        return rootIntegrationId;
    }

    /**
     * Sets the value of the rootIntegrationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setRootIntegrationId(QueryType value) {
        this.rootIntegrationId = value;
    }

    /**
     * Gets the value of the serialNumber property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getSerialNumber() {
        return serialNumber;
    }

    /**
     * Sets the value of the serialNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setSerialNumber(QueryType value) {
        this.serialNumber = value;
    }

    /**
     * Gets the value of the serviceAccount property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getServiceAccount() {
        return serviceAccount;
    }

    /**
     * Sets the value of the serviceAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setServiceAccount(QueryType value) {
        this.serviceAccount = value;
    }

    /**
     * Gets the value of the shipDate property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getShipDate() {
        return shipDate;
    }

    /**
     * Sets the value of the shipDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setShipDate(QueryType value) {
        this.shipDate = value;
    }

    /**
     * Gets the value of the smartPartNumber property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getSmartPartNumber() {
        return smartPartNumber;
    }

    /**
     * Sets the value of the smartPartNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setSmartPartNumber(QueryType value) {
        this.smartPartNumber = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setStatus(QueryType value) {
        this.status = value;
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
     * Gets the value of the listOfAssetMgmtAssetXa property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfAssetMgmtAssetXaQuery }
     *     
     */
    public ListOfAssetMgmtAssetXaQuery getListOfAssetMgmtAssetXa() {
        return listOfAssetMgmtAssetXa;
    }

    /**
     * Sets the value of the listOfAssetMgmtAssetXa property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfAssetMgmtAssetXaQuery }
     *     
     */
    public void setListOfAssetMgmtAssetXa(ListOfAssetMgmtAssetXaQuery value) {
        this.listOfAssetMgmtAssetXa = value;
    }

    /**
     * Gets the value of the assetMgmtAsset property.
     * 
     * @return
     *     possible object is
     *     {@link AssetMgmtAssetQuery }
     *     
     */
    public AssetMgmtAssetQuery getAssetMgmtAsset() {
        return assetMgmtAsset;
    }

    /**
     * Sets the value of the assetMgmtAsset property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetMgmtAssetQuery }
     *     
     */
    public void setAssetMgmtAsset(AssetMgmtAssetQuery value) {
        this.assetMgmtAsset = value;
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
