
package com.siebel.xml.asset_management_complex_io.query;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssetMgmt-Asset-HeaderQuery complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AssetMgmt-Asset-HeaderQuery">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://www.siebel.com/xml/Asset_Management_Complex_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="Created" type="{http://www.siebel.com/xml/Asset_Management_Complex_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="AccountLocation" type="{http://www.siebel.com/xml/Asset_Management_Complex_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="AccountName" type="{http://www.siebel.com/xml/Asset_Management_Complex_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="AdjustedListPrice" type="{http://www.siebel.com/xml/Asset_Management_Complex_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="AssetCurrencyCode" type="{http://www.siebel.com/xml/Asset_Management_Complex_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="AssetDescription" type="{http://www.siebel.com/xml/Asset_Management_Complex_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="AssetNumber" type="{http://www.siebel.com/xml/Asset_Management_Complex_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="BillingAccount" type="{http://www.siebel.com/xml/Asset_Management_Complex_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="BillingAccountId" type="{http://www.siebel.com/xml/Asset_Management_Complex_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="Comments" type="{http://www.siebel.com/xml/Asset_Management_Complex_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="CompoundProductNumber" type="{http://www.siebel.com/xml/Asset_Management_Complex_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="InstallDate" type="{http://www.siebel.com/xml/Asset_Management_Complex_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="IntegrationId" type="{http://www.siebel.com/xml/Asset_Management_Complex_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="MfgDate" type="{http://www.siebel.com/xml/Asset_Management_Complex_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.siebel.com/xml/Asset_Management_Complex_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="OwnerAccountId" type="{http://www.siebel.com/xml/Asset_Management_Complex_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="OwnerContactFirstName" type="{http://www.siebel.com/xml/Asset_Management_Complex_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="OwnerContactId" type="{http://www.siebel.com/xml/Asset_Management_Complex_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="OwnerContactLastName" type="{http://www.siebel.com/xml/Asset_Management_Complex_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PrimaryContactId" type="{http://www.siebel.com/xml/Asset_Management_Complex_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PrimaryEmployeeId" type="{http://www.siebel.com/xml/Asset_Management_Complex_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ProdPromInstanceId" type="{http://www.siebel.com/xml/Asset_Management_Complex_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ProductDescription" type="{http://www.siebel.com/xml/Asset_Management_Complex_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ProductId" type="{http://www.siebel.com/xml/Asset_Management_Complex_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ProductName" type="{http://www.siebel.com/xml/Asset_Management_Complex_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ProductPartNumber" type="{http://www.siebel.com/xml/Asset_Management_Complex_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="Quantity" type="{http://www.siebel.com/xml/Asset_Management_Complex_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="RegisteredDate" type="{http://www.siebel.com/xml/Asset_Management_Complex_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="RootAssetId" type="{http://www.siebel.com/xml/Asset_Management_Complex_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="SerialNumber" type="{http://www.siebel.com/xml/Asset_Management_Complex_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ServiceAccount" type="{http://www.siebel.com/xml/Asset_Management_Complex_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ServiceAccountId" type="{http://www.siebel.com/xml/Asset_Management_Complex_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ShipDate" type="{http://www.siebel.com/xml/Asset_Management_Complex_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://www.siebel.com/xml/Asset_Management_Complex_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="UnitofMeasure" type="{http://www.siebel.com/xml/Asset_Management_Complex_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ListOfAssetMgmt-Asset" type="{http://www.siebel.com/xml/Asset_Management_Complex_IO/Query}ListOfAssetMgmt-AssetQuery" minOccurs="0"/>
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
@XmlType(name = "AssetMgmt-Asset-HeaderQuery", propOrder = {
    "id",
    "created",
    "accountLocation",
    "accountName",
    "adjustedListPrice",
    "assetCurrencyCode",
    "assetDescription",
    "assetNumber",
    "billingAccount",
    "billingAccountId",
    "comments",
    "compoundProductNumber",
    "installDate",
    "integrationId",
    "mfgDate",
    "name",
    "ownerAccountId",
    "ownerContactFirstName",
    "ownerContactId",
    "ownerContactLastName",
    "primaryContactId",
    "primaryEmployeeId",
    "prodPromInstanceId",
    "productDescription",
    "productId",
    "productName",
    "productPartNumber",
    "quantity",
    "registeredDate",
    "rootAssetId",
    "serialNumber",
    "serviceAccount",
    "serviceAccountId",
    "shipDate",
    "status",
    "unitofMeasure",
    "listOfAssetMgmtAsset"
})
public class AssetMgmtAssetHeaderQuery
    implements Serializable
{

    @XmlElement(name = "Id")
    protected QueryType id;
    @XmlElement(name = "Created")
    protected QueryType created;
    @XmlElement(name = "AccountLocation")
    protected QueryType accountLocation;
    @XmlElement(name = "AccountName")
    protected QueryType accountName;
    @XmlElement(name = "AdjustedListPrice")
    protected QueryType adjustedListPrice;
    @XmlElement(name = "AssetCurrencyCode")
    protected QueryType assetCurrencyCode;
    @XmlElement(name = "AssetDescription")
    protected QueryType assetDescription;
    @XmlElement(name = "AssetNumber")
    protected QueryType assetNumber;
    @XmlElement(name = "BillingAccount")
    protected QueryType billingAccount;
    @XmlElement(name = "BillingAccountId")
    protected QueryType billingAccountId;
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
    @XmlElement(name = "OwnerAccountId")
    protected QueryType ownerAccountId;
    @XmlElement(name = "OwnerContactFirstName")
    protected QueryType ownerContactFirstName;
    @XmlElement(name = "OwnerContactId")
    protected QueryType ownerContactId;
    @XmlElement(name = "OwnerContactLastName")
    protected QueryType ownerContactLastName;
    @XmlElement(name = "PrimaryContactId")
    protected QueryType primaryContactId;
    @XmlElement(name = "PrimaryEmployeeId")
    protected QueryType primaryEmployeeId;
    @XmlElement(name = "ProdPromInstanceId")
    protected QueryType prodPromInstanceId;
    @XmlElement(name = "ProductDescription")
    protected QueryType productDescription;
    @XmlElement(name = "ProductId")
    protected QueryType productId;
    @XmlElement(name = "ProductName")
    protected QueryType productName;
    @XmlElement(name = "ProductPartNumber")
    protected QueryType productPartNumber;
    @XmlElement(name = "Quantity")
    protected QueryType quantity;
    @XmlElement(name = "RegisteredDate")
    protected QueryType registeredDate;
    @XmlElement(name = "RootAssetId")
    protected QueryType rootAssetId;
    @XmlElement(name = "SerialNumber")
    protected QueryType serialNumber;
    @XmlElement(name = "ServiceAccount")
    protected QueryType serviceAccount;
    @XmlElement(name = "ServiceAccountId")
    protected QueryType serviceAccountId;
    @XmlElement(name = "ShipDate")
    protected QueryType shipDate;
    @XmlElement(name = "Status")
    protected QueryType status;
    @XmlElement(name = "UnitofMeasure")
    protected QueryType unitofMeasure;
    @XmlElement(name = "ListOfAssetMgmt-Asset")
    protected ListOfAssetMgmtAssetQuery listOfAssetMgmtAsset;
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
     * Gets the value of the accountLocation property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getAccountLocation() {
        return accountLocation;
    }

    /**
     * Sets the value of the accountLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setAccountLocation(QueryType value) {
        this.accountLocation = value;
    }

    /**
     * Gets the value of the accountName property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getAccountName() {
        return accountName;
    }

    /**
     * Sets the value of the accountName property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setAccountName(QueryType value) {
        this.accountName = value;
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
     * Gets the value of the billingAccountId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getBillingAccountId() {
        return billingAccountId;
    }

    /**
     * Sets the value of the billingAccountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setBillingAccountId(QueryType value) {
        this.billingAccountId = value;
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
     * Gets the value of the ownerAccountId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getOwnerAccountId() {
        return ownerAccountId;
    }

    /**
     * Sets the value of the ownerAccountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setOwnerAccountId(QueryType value) {
        this.ownerAccountId = value;
    }

    /**
     * Gets the value of the ownerContactFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getOwnerContactFirstName() {
        return ownerContactFirstName;
    }

    /**
     * Sets the value of the ownerContactFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setOwnerContactFirstName(QueryType value) {
        this.ownerContactFirstName = value;
    }

    /**
     * Gets the value of the ownerContactId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getOwnerContactId() {
        return ownerContactId;
    }

    /**
     * Sets the value of the ownerContactId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setOwnerContactId(QueryType value) {
        this.ownerContactId = value;
    }

    /**
     * Gets the value of the ownerContactLastName property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getOwnerContactLastName() {
        return ownerContactLastName;
    }

    /**
     * Sets the value of the ownerContactLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setOwnerContactLastName(QueryType value) {
        this.ownerContactLastName = value;
    }

    /**
     * Gets the value of the primaryContactId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPrimaryContactId() {
        return primaryContactId;
    }

    /**
     * Sets the value of the primaryContactId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPrimaryContactId(QueryType value) {
        this.primaryContactId = value;
    }

    /**
     * Gets the value of the primaryEmployeeId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPrimaryEmployeeId() {
        return primaryEmployeeId;
    }

    /**
     * Sets the value of the primaryEmployeeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPrimaryEmployeeId(QueryType value) {
        this.primaryEmployeeId = value;
    }

    /**
     * Gets the value of the prodPromInstanceId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getProdPromInstanceId() {
        return prodPromInstanceId;
    }

    /**
     * Sets the value of the prodPromInstanceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setProdPromInstanceId(QueryType value) {
        this.prodPromInstanceId = value;
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
     * Gets the value of the serviceAccountId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getServiceAccountId() {
        return serviceAccountId;
    }

    /**
     * Sets the value of the serviceAccountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setServiceAccountId(QueryType value) {
        this.serviceAccountId = value;
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
     * Gets the value of the listOfAssetMgmtAsset property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfAssetMgmtAssetQuery }
     *     
     */
    public ListOfAssetMgmtAssetQuery getListOfAssetMgmtAsset() {
        return listOfAssetMgmtAsset;
    }

    /**
     * Sets the value of the listOfAssetMgmtAsset property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfAssetMgmtAssetQuery }
     *     
     */
    public void setListOfAssetMgmtAsset(ListOfAssetMgmtAssetQuery value) {
        this.listOfAssetMgmtAsset = value;
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
