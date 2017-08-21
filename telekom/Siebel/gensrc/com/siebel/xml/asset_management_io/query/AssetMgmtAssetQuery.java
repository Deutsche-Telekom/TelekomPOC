
package com.siebel.xml.asset_management_io.query;

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
 *         &lt;element name="Id" type="{http://www.siebel.com/xml/Asset_Management_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="Created" type="{http://www.siebel.com/xml/Asset_Management_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="Updated" type="{http://www.siebel.com/xml/Asset_Management_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ConflictId" type="{http://www.siebel.com/xml/Asset_Management_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ModId" type="{http://www.siebel.com/xml/Asset_Management_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="AccountCompetitor" type="{http://www.siebel.com/xml/Asset_Management_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="AccountIntegrationId" type="{http://www.siebel.com/xml/Asset_Management_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="AccountLocation" type="{http://www.siebel.com/xml/Asset_Management_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="AccountName" type="{http://www.siebel.com/xml/Asset_Management_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="AccountOrgId" type="{http://www.siebel.com/xml/Asset_Management_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="AccountPrimaryAddress" type="{http://www.siebel.com/xml/Asset_Management_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="AccountPrimaryAddressId" type="{http://www.siebel.com/xml/Asset_Management_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="AccountPrimaryAddressLine2" type="{http://www.siebel.com/xml/Asset_Management_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="AccountPrimaryCity" type="{http://www.siebel.com/xml/Asset_Management_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="AccountPrimaryCompleteAddress" type="{http://www.siebel.com/xml/Asset_Management_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="AccountPrimaryCountry" type="{http://www.siebel.com/xml/Asset_Management_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="AccountPrimaryServiceAgreementId" type="{http://www.siebel.com/xml/Asset_Management_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="AccountPrimaryState" type="{http://www.siebel.com/xml/Asset_Management_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="AccountPrimaryZip" type="{http://www.siebel.com/xml/Asset_Management_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="AccountingMethod" type="{http://www.siebel.com/xml/Asset_Management_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ActionCode" type="{http://www.siebel.com/xml/Asset_Management_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="AdjustedListPrice" type="{http://www.siebel.com/xml/Asset_Management_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="AdjustedValue" type="{http://www.siebel.com/xml/Asset_Management_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="AssetAge" type="{http://www.siebel.com/xml/Asset_Management_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="AssetCategory" type="{http://www.siebel.com/xml/Asset_Management_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="AssetCurrencyCode" type="{http://www.siebel.com/xml/Asset_Management_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="AssetDescription" type="{http://www.siebel.com/xml/Asset_Management_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="AssetId" type="{http://www.siebel.com/xml/Asset_Management_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="AssetLabel" type="{http://www.siebel.com/xml/Asset_Management_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="AssetNumber" type="{http://www.siebel.com/xml/Asset_Management_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="AssetValue" type="{http://www.siebel.com/xml/Asset_Management_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="AssetValueExchangeDate" type="{http://www.siebel.com/xml/Asset_Management_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="BasePrice" type="{http://www.siebel.com/xml/Asset_Management_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="BillingAccount" type="{http://www.siebel.com/xml/Asset_Management_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="BillingAccountId" type="{http://www.siebel.com/xml/Asset_Management_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="BucketID" type="{http://www.siebel.com/xml/Asset_Management_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="Build" type="{http://www.siebel.com/xml/Asset_Management_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="CDAPagesetId" type="{http://www.siebel.com/xml/Asset_Management_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="CfgLatestReleasedFlag" type="{http://www.siebel.com/xml/Asset_Management_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="CfgReleasedFlag" type="{http://www.siebel.com/xml/Asset_Management_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="CfgStateCode" type="{http://www.siebel.com/xml/Asset_Management_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="CfgType" type="{http://www.siebel.com/xml/Asset_Management_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="CfgVersion" type="{http://www.siebel.com/xml/Asset_Management_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ChangeinValue" type="{http://www.siebel.com/xml/Asset_Management_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="Comments" type="{http://www.siebel.com/xml/Asset_Management_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="CommitmentCoveredFlag" type="{http://www.siebel.com/xml/Asset_Management_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="CompoundProductFlag" type="{http://www.siebel.com/xml/Asset_Management_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="CompoundProductNumber" type="{http://www.siebel.com/xml/Asset_Management_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="Condition" type="{http://www.siebel.com/xml/Asset_Management_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ConfigurationModelId" type="{http://www.siebel.com/xml/Asset_Management_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ConvertToAgreementFlag" type="{http://www.siebel.com/xml/Asset_Management_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ConvertToAssetFlag" type="{http://www.siebel.com/xml/Asset_Management_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="CostList" type="{http://www.siebel.com/xml/Asset_Management_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="CostListId" type="{http://www.siebel.com/xml/Asset_Management_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="CurrencyCode" type="{http://www.siebel.com/xml/Asset_Management_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="CustomizableFlag" type="{http://www.siebel.com/xml/Asset_Management_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="DaysOn-Hand" type="{http://www.siebel.com/xml/Asset_Management_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="DiscountAmount" type="{http://www.siebel.com/xml/Asset_Management_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="DiscountPercent" type="{http://www.siebel.com/xml/Asset_Management_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="DomainName" type="{http://www.siebel.com/xml/Asset_Management_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="DueDate" type="{http://www.siebel.com/xml/Asset_Management_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="EffectiveEndDate" type="{http://www.siebel.com/xml/Asset_Management_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="EligibilityReason" type="{http://www.siebel.com/xml/Asset_Management_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="EligibilityStatus" type="{http://www.siebel.com/xml/Asset_Management_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="EndDate" type="{http://www.siebel.com/xml/Asset_Management_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ExchangeDate" type="{http://www.siebel.com/xml/Asset_Management_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ExcludePricingFlag" type="{http://www.siebel.com/xml/Asset_Management_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ExplorerLabel" type="{http://www.siebel.com/xml/Asset_Management_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ExtendedQuantity" type="{http://www.siebel.com/xml/Asset_Management_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ForcastableFlag" type="{http://www.siebel.com/xml/Asset_Management_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="HasChildren" type="{http://www.siebel.com/xml/Asset_Management_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="HasGenericsFlag" type="{http://www.siebel.com/xml/Asset_Management_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="HouseholdNumber" type="{http://www.siebel.com/xml/Asset_Management_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="InclusiveEligibilityFlag" type="{http://www.siebel.com/xml/Asset_Management_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="InstallDate" type="{http://www.siebel.com/xml/Asset_Management_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="IntegrationId" type="{http://www.siebel.com/xml/Asset_Management_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="InternalAssetFlag" type="{http://www.siebel.com/xml/Asset_Management_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="InventoryLocation" type="{http://www.siebel.com/xml/Asset_Management_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="InventoryLocationId" type="{http://www.siebel.com/xml/Asset_Management_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="IsExpanded" type="{http://www.siebel.com/xml/Asset_Management_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ItemType" type="{http://www.siebel.com/xml/Asset_Management_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ItemType-LanguageIndependent" type="{http://www.siebel.com/xml/Asset_Management_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="License" type="{http://www.siebel.com/xml/Asset_Management_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="LicenseNumber" type="{http://www.siebel.com/xml/Asset_Management_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="LineNumber" type="{http://www.siebel.com/xml/Asset_Management_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="MeterCount" type="{http://www.siebel.com/xml/Asset_Management_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="MfgDate" type="{http://www.siebel.com/xml/Asset_Management_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.siebel.com/xml/Asset_Management_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="NetworkElementType" type="{http://www.siebel.com/xml/Asset_Management_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="Node" type="{http://www.siebel.com/xml/Asset_Management_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="OperatingStatus" type="{http://www.siebel.com/xml/Asset_Management_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="Options" type="{http://www.siebel.com/xml/Asset_Management_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="OrderAccountId" type="{http://www.siebel.com/xml/Asset_Management_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="OrderHeaderId" type="{http://www.siebel.com/xml/Asset_Management_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="OrderIntegrationId" type="{http://www.siebel.com/xml/Asset_Management_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="Organization" type="{http://www.siebel.com/xml/Asset_Management_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="OrganizationId" type="{http://www.siebel.com/xml/Asset_Management_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="OrganizationalUnitAddressId" type="{http://www.siebel.com/xml/Asset_Management_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="OriginalCost" type="{http://www.siebel.com/xml/Asset_Management_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="OriginalOrderId" type="{http://www.siebel.com/xml/Asset_Management_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="OutlineNumber" type="{http://www.siebel.com/xml/Asset_Management_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="Owner" type="{http://www.siebel.com/xml/Asset_Management_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="OwnerAccountId" type="{http://www.siebel.com/xml/Asset_Management_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="OwnerAssetNumber" type="{http://www.siebel.com/xml/Asset_Management_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="OwnerContactId" type="{http://www.siebel.com/xml/Asset_Management_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="OwnerFirstName" type="{http://www.siebel.com/xml/Asset_Management_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="OwnerLastName" type="{http://www.siebel.com/xml/Asset_Management_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="OwnerName" type="{http://www.siebel.com/xml/Asset_Management_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="Ownership" type="{http://www.siebel.com/xml/Asset_Management_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ParentAssetId" type="{http://www.siebel.com/xml/Asset_Management_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ParentAssetNumber" type="{http://www.siebel.com/xml/Asset_Management_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PersonalAddress" type="{http://www.siebel.com/xml/Asset_Management_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PersonalAddressId" type="{http://www.siebel.com/xml/Asset_Management_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PersonalCity" type="{http://www.siebel.com/xml/Asset_Management_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PersonalCountry" type="{http://www.siebel.com/xml/Asset_Management_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PersonalState" type="{http://www.siebel.com/xml/Asset_Management_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PersonalZip" type="{http://www.siebel.com/xml/Asset_Management_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PostPickCD" type="{http://www.siebel.com/xml/Asset_Management_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PrePickCD" type="{http://www.siebel.com/xml/Asset_Management_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PriceListId" type="{http://www.siebel.com/xml/Asset_Management_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PriceType" type="{http://www.siebel.com/xml/Asset_Management_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PrimaryContactAccountId" type="{http://www.siebel.com/xml/Asset_Management_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PrimaryContactId" type="{http://www.siebel.com/xml/Asset_Management_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PrimaryEmployeeId" type="{http://www.siebel.com/xml/Asset_Management_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PrimaryWarrantyCoverageId" type="{http://www.siebel.com/xml/Asset_Management_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PrimaryWarrantyEndDate" type="{http://www.siebel.com/xml/Asset_Management_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PrimaryWarrantyName" type="{http://www.siebel.com/xml/Asset_Management_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PrimaryWarrantyStartDate" type="{http://www.siebel.com/xml/Asset_Management_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PrimaryWarrantyType" type="{http://www.siebel.com/xml/Asset_Management_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PrimaryWarranyId" type="{http://www.siebel.com/xml/Asset_Management_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ProdItemId" type="{http://www.siebel.com/xml/Asset_Management_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ProdPromId" type="{http://www.siebel.com/xml/Asset_Management_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ProdPromInstanceId" type="{http://www.siebel.com/xml/Asset_Management_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ProdPromName" type="{http://www.siebel.com/xml/Asset_Management_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ProdPromRuleId" type="{http://www.siebel.com/xml/Asset_Management_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ProdPromSourceId" type="{http://www.siebel.com/xml/Asset_Management_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ProductBuild" type="{http://www.siebel.com/xml/Asset_Management_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ProductDefTypeCode" type="{http://www.siebel.com/xml/Asset_Management_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ProductDescription" type="{http://www.siebel.com/xml/Asset_Management_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ProductEffectiveFrom" type="{http://www.siebel.com/xml/Asset_Management_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ProductEffectiveTo" type="{http://www.siebel.com/xml/Asset_Management_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ProductId" type="{http://www.siebel.com/xml/Asset_Management_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ProductInventoryId" type="{http://www.siebel.com/xml/Asset_Management_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ProductName" type="{http://www.siebel.com/xml/Asset_Management_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ProductPartNumber" type="{http://www.siebel.com/xml/Asset_Management_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ProductPortId" type="{http://www.siebel.com/xml/Asset_Management_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ProductPrimaryProductLine" type="{http://www.siebel.com/xml/Asset_Management_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ProductPrimaryProductLineId" type="{http://www.siebel.com/xml/Asset_Management_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ProductSerializedFlag" type="{http://www.siebel.com/xml/Asset_Management_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ProductType" type="{http://www.siebel.com/xml/Asset_Management_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ProductVersion" type="{http://www.siebel.com/xml/Asset_Management_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ProductXAClassId" type="{http://www.siebel.com/xml/Asset_Management_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PurchaseDate" type="{http://www.siebel.com/xml/Asset_Management_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PurchaseLocationDescription" type="{http://www.siebel.com/xml/Asset_Management_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="Quantity" type="{http://www.siebel.com/xml/Asset_Management_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="QuoteId" type="{http://www.siebel.com/xml/Asset_Management_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="QuoteIntegrationId" type="{http://www.siebel.com/xml/Asset_Management_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ReferenceFlag" type="{http://www.siebel.com/xml/Asset_Management_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ReferenceNumber2" type="{http://www.siebel.com/xml/Asset_Management_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ReferenceNumber3" type="{http://www.siebel.com/xml/Asset_Management_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="RegisteredDate" type="{http://www.siebel.com/xml/Asset_Management_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ReplacementValue" type="{http://www.siebel.com/xml/Asset_Management_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="RootAssetId" type="{http://www.siebel.com/xml/Asset_Management_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="RootAssetNumber" type="{http://www.siebel.com/xml/Asset_Management_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="RootCfgLatestReleasedFlag" type="{http://www.siebel.com/xml/Asset_Management_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="RootCfgType" type="{http://www.siebel.com/xml/Asset_Management_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="RootIntegrationId" type="{http://www.siebel.com/xml/Asset_Management_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="RootProductDefTypeCode" type="{http://www.siebel.com/xml/Asset_Management_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="RootProductId" type="{http://www.siebel.com/xml/Asset_Management_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ScenarioTestFlag" type="{http://www.siebel.com/xml/Asset_Management_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="SerialNumber" type="{http://www.siebel.com/xml/Asset_Management_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="SerialNumberVerifiedFlag" type="{http://www.siebel.com/xml/Asset_Management_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ServiceAccount" type="{http://www.siebel.com/xml/Asset_Management_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ServiceAccountId" type="{http://www.siebel.com/xml/Asset_Management_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ShipDate" type="{http://www.siebel.com/xml/Asset_Management_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="SmartPartNumber" type="{http://www.siebel.com/xml/Asset_Management_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="StartDate" type="{http://www.siebel.com/xml/Asset_Management_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://www.siebel.com/xml/Asset_Management_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ToNode" type="{http://www.siebel.com/xml/Asset_Management_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ToServiceAccount" type="{http://www.siebel.com/xml/Asset_Management_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ToServiceAccountId" type="{http://www.siebel.com/xml/Asset_Management_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ToolFlag" type="{http://www.siebel.com/xml/Asset_Management_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="UnitPrice" type="{http://www.siebel.com/xml/Asset_Management_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="UnitofMeasure" type="{http://www.siebel.com/xml/Asset_Management_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="VODRowId" type="{http://www.siebel.com/xml/Asset_Management_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ValidationDate" type="{http://www.siebel.com/xml/Asset_Management_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ValidationStatus" type="{http://www.siebel.com/xml/Asset_Management_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ValueBasis" type="{http://www.siebel.com/xml/Asset_Management_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="Version" type="{http://www.siebel.com/xml/Asset_Management_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="WarrantyEndDate" type="{http://www.siebel.com/xml/Asset_Management_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="WarrantyStartDate" type="{http://www.siebel.com/xml/Asset_Management_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="WarrantyType" type="{http://www.siebel.com/xml/Asset_Management_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="Type" type="{http://www.siebel.com/xml/Asset_Management_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="BillingProfileName" type="{http://www.siebel.com/xml/Asset_Management_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="BillingProfileId" type="{http://www.siebel.com/xml/Asset_Management_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="AssetMgmt-Asset" type="{http://www.siebel.com/xml/Asset_Management_IO/Query}AssetMgmt-AssetQuery" minOccurs="0"/>
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
    "id",
    "created",
    "updated",
    "conflictId",
    "modId",
    "accountCompetitor",
    "accountIntegrationId",
    "accountLocation",
    "accountName",
    "accountOrgId",
    "accountPrimaryAddress",
    "accountPrimaryAddressId",
    "accountPrimaryAddressLine2",
    "accountPrimaryCity",
    "accountPrimaryCompleteAddress",
    "accountPrimaryCountry",
    "accountPrimaryServiceAgreementId",
    "accountPrimaryState",
    "accountPrimaryZip",
    "accountingMethod",
    "actionCode",
    "adjustedListPrice",
    "adjustedValue",
    "assetAge",
    "assetCategory",
    "assetCurrencyCode",
    "assetDescription",
    "assetId",
    "assetLabel",
    "assetNumber",
    "assetValue",
    "assetValueExchangeDate",
    "basePrice",
    "billingAccount",
    "billingAccountId",
    "bucketID",
    "build",
    "cdaPagesetId",
    "cfgLatestReleasedFlag",
    "cfgReleasedFlag",
    "cfgStateCode",
    "cfgType",
    "cfgVersion",
    "changeinValue",
    "comments",
    "commitmentCoveredFlag",
    "compoundProductFlag",
    "compoundProductNumber",
    "condition",
    "configurationModelId",
    "convertToAgreementFlag",
    "convertToAssetFlag",
    "costList",
    "costListId",
    "currencyCode",
    "customizableFlag",
    "daysOnHand",
    "discountAmount",
    "discountPercent",
    "domainName",
    "dueDate",
    "effectiveEndDate",
    "eligibilityReason",
    "eligibilityStatus",
    "endDate",
    "exchangeDate",
    "excludePricingFlag",
    "explorerLabel",
    "extendedQuantity",
    "forcastableFlag",
    "hasChildren",
    "hasGenericsFlag",
    "householdNumber",
    "inclusiveEligibilityFlag",
    "installDate",
    "integrationId",
    "internalAssetFlag",
    "inventoryLocation",
    "inventoryLocationId",
    "isExpanded",
    "itemType",
    "itemTypeLanguageIndependent",
    "license",
    "licenseNumber",
    "lineNumber",
    "meterCount",
    "mfgDate",
    "name",
    "networkElementType",
    "node",
    "operatingStatus",
    "options",
    "orderAccountId",
    "orderHeaderId",
    "orderIntegrationId",
    "organization",
    "organizationId",
    "organizationalUnitAddressId",
    "originalCost",
    "originalOrderId",
    "outlineNumber",
    "owner",
    "ownerAccountId",
    "ownerAssetNumber",
    "ownerContactId",
    "ownerFirstName",
    "ownerLastName",
    "ownerName",
    "ownership",
    "parentAssetId",
    "parentAssetNumber",
    "personalAddress",
    "personalAddressId",
    "personalCity",
    "personalCountry",
    "personalState",
    "personalZip",
    "postPickCD",
    "prePickCD",
    "priceListId",
    "priceType",
    "primaryContactAccountId",
    "primaryContactId",
    "primaryEmployeeId",
    "primaryWarrantyCoverageId",
    "primaryWarrantyEndDate",
    "primaryWarrantyName",
    "primaryWarrantyStartDate",
    "primaryWarrantyType",
    "primaryWarranyId",
    "prodItemId",
    "prodPromId",
    "prodPromInstanceId",
    "prodPromName",
    "prodPromRuleId",
    "prodPromSourceId",
    "productBuild",
    "productDefTypeCode",
    "productDescription",
    "productEffectiveFrom",
    "productEffectiveTo",
    "productId",
    "productInventoryId",
    "productName",
    "productPartNumber",
    "productPortId",
    "productPrimaryProductLine",
    "productPrimaryProductLineId",
    "productSerializedFlag",
    "productType",
    "productVersion",
    "productXAClassId",
    "purchaseDate",
    "purchaseLocationDescription",
    "quantity",
    "quoteId",
    "quoteIntegrationId",
    "referenceFlag",
    "referenceNumber2",
    "referenceNumber3",
    "registeredDate",
    "replacementValue",
    "rootAssetId",
    "rootAssetNumber",
    "rootCfgLatestReleasedFlag",
    "rootCfgType",
    "rootIntegrationId",
    "rootProductDefTypeCode",
    "rootProductId",
    "scenarioTestFlag",
    "serialNumber",
    "serialNumberVerifiedFlag",
    "serviceAccount",
    "serviceAccountId",
    "shipDate",
    "smartPartNumber",
    "startDate",
    "status",
    "toNode",
    "toServiceAccount",
    "toServiceAccountId",
    "toolFlag",
    "unitPrice",
    "unitofMeasure",
    "vodRowId",
    "validationDate",
    "validationStatus",
    "valueBasis",
    "version",
    "warrantyEndDate",
    "warrantyStartDate",
    "warrantyType",
    "type",
    "billingProfileName",
    "billingProfileId",
    "assetMgmtAsset"
})
public class AssetMgmtAssetQuery
    implements Serializable
{

    @XmlElement(name = "Id")
    protected QueryType id;
    @XmlElement(name = "Created")
    protected QueryType created;
    @XmlElement(name = "Updated")
    protected QueryType updated;
    @XmlElement(name = "ConflictId")
    protected QueryType conflictId;
    @XmlElement(name = "ModId")
    protected QueryType modId;
    @XmlElement(name = "AccountCompetitor")
    protected QueryType accountCompetitor;
    @XmlElement(name = "AccountIntegrationId")
    protected QueryType accountIntegrationId;
    @XmlElement(name = "AccountLocation")
    protected QueryType accountLocation;
    @XmlElement(name = "AccountName")
    protected QueryType accountName;
    @XmlElement(name = "AccountOrgId")
    protected QueryType accountOrgId;
    @XmlElement(name = "AccountPrimaryAddress")
    protected QueryType accountPrimaryAddress;
    @XmlElement(name = "AccountPrimaryAddressId")
    protected QueryType accountPrimaryAddressId;
    @XmlElement(name = "AccountPrimaryAddressLine2")
    protected QueryType accountPrimaryAddressLine2;
    @XmlElement(name = "AccountPrimaryCity")
    protected QueryType accountPrimaryCity;
    @XmlElement(name = "AccountPrimaryCompleteAddress")
    protected QueryType accountPrimaryCompleteAddress;
    @XmlElement(name = "AccountPrimaryCountry")
    protected QueryType accountPrimaryCountry;
    @XmlElement(name = "AccountPrimaryServiceAgreementId")
    protected QueryType accountPrimaryServiceAgreementId;
    @XmlElement(name = "AccountPrimaryState")
    protected QueryType accountPrimaryState;
    @XmlElement(name = "AccountPrimaryZip")
    protected QueryType accountPrimaryZip;
    @XmlElement(name = "AccountingMethod")
    protected QueryType accountingMethod;
    @XmlElement(name = "ActionCode")
    protected QueryType actionCode;
    @XmlElement(name = "AdjustedListPrice")
    protected QueryType adjustedListPrice;
    @XmlElement(name = "AdjustedValue")
    protected QueryType adjustedValue;
    @XmlElement(name = "AssetAge")
    protected QueryType assetAge;
    @XmlElement(name = "AssetCategory")
    protected QueryType assetCategory;
    @XmlElement(name = "AssetCurrencyCode")
    protected QueryType assetCurrencyCode;
    @XmlElement(name = "AssetDescription")
    protected QueryType assetDescription;
    @XmlElement(name = "AssetId")
    protected QueryType assetId;
    @XmlElement(name = "AssetLabel")
    protected QueryType assetLabel;
    @XmlElement(name = "AssetNumber")
    protected QueryType assetNumber;
    @XmlElement(name = "AssetValue")
    protected QueryType assetValue;
    @XmlElement(name = "AssetValueExchangeDate")
    protected QueryType assetValueExchangeDate;
    @XmlElement(name = "BasePrice")
    protected QueryType basePrice;
    @XmlElement(name = "BillingAccount")
    protected QueryType billingAccount;
    @XmlElement(name = "BillingAccountId")
    protected QueryType billingAccountId;
    @XmlElement(name = "BucketID")
    protected QueryType bucketID;
    @XmlElement(name = "Build")
    protected QueryType build;
    @XmlElement(name = "CDAPagesetId")
    protected QueryType cdaPagesetId;
    @XmlElement(name = "CfgLatestReleasedFlag")
    protected QueryType cfgLatestReleasedFlag;
    @XmlElement(name = "CfgReleasedFlag")
    protected QueryType cfgReleasedFlag;
    @XmlElement(name = "CfgStateCode")
    protected QueryType cfgStateCode;
    @XmlElement(name = "CfgType")
    protected QueryType cfgType;
    @XmlElement(name = "CfgVersion")
    protected QueryType cfgVersion;
    @XmlElement(name = "ChangeinValue")
    protected QueryType changeinValue;
    @XmlElement(name = "Comments")
    protected QueryType comments;
    @XmlElement(name = "CommitmentCoveredFlag")
    protected QueryType commitmentCoveredFlag;
    @XmlElement(name = "CompoundProductFlag")
    protected QueryType compoundProductFlag;
    @XmlElement(name = "CompoundProductNumber")
    protected QueryType compoundProductNumber;
    @XmlElement(name = "Condition")
    protected QueryType condition;
    @XmlElement(name = "ConfigurationModelId")
    protected QueryType configurationModelId;
    @XmlElement(name = "ConvertToAgreementFlag")
    protected QueryType convertToAgreementFlag;
    @XmlElement(name = "ConvertToAssetFlag")
    protected QueryType convertToAssetFlag;
    @XmlElement(name = "CostList")
    protected QueryType costList;
    @XmlElement(name = "CostListId")
    protected QueryType costListId;
    @XmlElement(name = "CurrencyCode")
    protected QueryType currencyCode;
    @XmlElement(name = "CustomizableFlag")
    protected QueryType customizableFlag;
    @XmlElement(name = "DaysOn-Hand")
    protected QueryType daysOnHand;
    @XmlElement(name = "DiscountAmount")
    protected QueryType discountAmount;
    @XmlElement(name = "DiscountPercent")
    protected QueryType discountPercent;
    @XmlElement(name = "DomainName")
    protected QueryType domainName;
    @XmlElement(name = "DueDate")
    protected QueryType dueDate;
    @XmlElement(name = "EffectiveEndDate")
    protected QueryType effectiveEndDate;
    @XmlElement(name = "EligibilityReason")
    protected QueryType eligibilityReason;
    @XmlElement(name = "EligibilityStatus")
    protected QueryType eligibilityStatus;
    @XmlElement(name = "EndDate")
    protected QueryType endDate;
    @XmlElement(name = "ExchangeDate")
    protected QueryType exchangeDate;
    @XmlElement(name = "ExcludePricingFlag")
    protected QueryType excludePricingFlag;
    @XmlElement(name = "ExplorerLabel")
    protected QueryType explorerLabel;
    @XmlElement(name = "ExtendedQuantity")
    protected QueryType extendedQuantity;
    @XmlElement(name = "ForcastableFlag")
    protected QueryType forcastableFlag;
    @XmlElement(name = "HasChildren")
    protected QueryType hasChildren;
    @XmlElement(name = "HasGenericsFlag")
    protected QueryType hasGenericsFlag;
    @XmlElement(name = "HouseholdNumber")
    protected QueryType householdNumber;
    @XmlElement(name = "InclusiveEligibilityFlag")
    protected QueryType inclusiveEligibilityFlag;
    @XmlElement(name = "InstallDate")
    protected QueryType installDate;
    @XmlElement(name = "IntegrationId")
    protected QueryType integrationId;
    @XmlElement(name = "InternalAssetFlag")
    protected QueryType internalAssetFlag;
    @XmlElement(name = "InventoryLocation")
    protected QueryType inventoryLocation;
    @XmlElement(name = "InventoryLocationId")
    protected QueryType inventoryLocationId;
    @XmlElement(name = "IsExpanded")
    protected QueryType isExpanded;
    @XmlElement(name = "ItemType")
    protected QueryType itemType;
    @XmlElement(name = "ItemType-LanguageIndependent")
    protected QueryType itemTypeLanguageIndependent;
    @XmlElement(name = "License")
    protected QueryType license;
    @XmlElement(name = "LicenseNumber")
    protected QueryType licenseNumber;
    @XmlElement(name = "LineNumber")
    protected QueryType lineNumber;
    @XmlElement(name = "MeterCount")
    protected QueryType meterCount;
    @XmlElement(name = "MfgDate")
    protected QueryType mfgDate;
    @XmlElement(name = "Name")
    protected QueryType name;
    @XmlElement(name = "NetworkElementType")
    protected QueryType networkElementType;
    @XmlElement(name = "Node")
    protected QueryType node;
    @XmlElement(name = "OperatingStatus")
    protected QueryType operatingStatus;
    @XmlElement(name = "Options")
    protected QueryType options;
    @XmlElement(name = "OrderAccountId")
    protected QueryType orderAccountId;
    @XmlElement(name = "OrderHeaderId")
    protected QueryType orderHeaderId;
    @XmlElement(name = "OrderIntegrationId")
    protected QueryType orderIntegrationId;
    @XmlElement(name = "Organization")
    protected QueryType organization;
    @XmlElement(name = "OrganizationId")
    protected QueryType organizationId;
    @XmlElement(name = "OrganizationalUnitAddressId")
    protected QueryType organizationalUnitAddressId;
    @XmlElement(name = "OriginalCost")
    protected QueryType originalCost;
    @XmlElement(name = "OriginalOrderId")
    protected QueryType originalOrderId;
    @XmlElement(name = "OutlineNumber")
    protected QueryType outlineNumber;
    @XmlElement(name = "Owner")
    protected QueryType owner;
    @XmlElement(name = "OwnerAccountId")
    protected QueryType ownerAccountId;
    @XmlElement(name = "OwnerAssetNumber")
    protected QueryType ownerAssetNumber;
    @XmlElement(name = "OwnerContactId")
    protected QueryType ownerContactId;
    @XmlElement(name = "OwnerFirstName")
    protected QueryType ownerFirstName;
    @XmlElement(name = "OwnerLastName")
    protected QueryType ownerLastName;
    @XmlElement(name = "OwnerName")
    protected QueryType ownerName;
    @XmlElement(name = "Ownership")
    protected QueryType ownership;
    @XmlElement(name = "ParentAssetId")
    protected QueryType parentAssetId;
    @XmlElement(name = "ParentAssetNumber")
    protected QueryType parentAssetNumber;
    @XmlElement(name = "PersonalAddress")
    protected QueryType personalAddress;
    @XmlElement(name = "PersonalAddressId")
    protected QueryType personalAddressId;
    @XmlElement(name = "PersonalCity")
    protected QueryType personalCity;
    @XmlElement(name = "PersonalCountry")
    protected QueryType personalCountry;
    @XmlElement(name = "PersonalState")
    protected QueryType personalState;
    @XmlElement(name = "PersonalZip")
    protected QueryType personalZip;
    @XmlElement(name = "PostPickCD")
    protected QueryType postPickCD;
    @XmlElement(name = "PrePickCD")
    protected QueryType prePickCD;
    @XmlElement(name = "PriceListId")
    protected QueryType priceListId;
    @XmlElement(name = "PriceType")
    protected QueryType priceType;
    @XmlElement(name = "PrimaryContactAccountId")
    protected QueryType primaryContactAccountId;
    @XmlElement(name = "PrimaryContactId")
    protected QueryType primaryContactId;
    @XmlElement(name = "PrimaryEmployeeId")
    protected QueryType primaryEmployeeId;
    @XmlElement(name = "PrimaryWarrantyCoverageId")
    protected QueryType primaryWarrantyCoverageId;
    @XmlElement(name = "PrimaryWarrantyEndDate")
    protected QueryType primaryWarrantyEndDate;
    @XmlElement(name = "PrimaryWarrantyName")
    protected QueryType primaryWarrantyName;
    @XmlElement(name = "PrimaryWarrantyStartDate")
    protected QueryType primaryWarrantyStartDate;
    @XmlElement(name = "PrimaryWarrantyType")
    protected QueryType primaryWarrantyType;
    @XmlElement(name = "PrimaryWarranyId")
    protected QueryType primaryWarranyId;
    @XmlElement(name = "ProdItemId")
    protected QueryType prodItemId;
    @XmlElement(name = "ProdPromId")
    protected QueryType prodPromId;
    @XmlElement(name = "ProdPromInstanceId")
    protected QueryType prodPromInstanceId;
    @XmlElement(name = "ProdPromName")
    protected QueryType prodPromName;
    @XmlElement(name = "ProdPromRuleId")
    protected QueryType prodPromRuleId;
    @XmlElement(name = "ProdPromSourceId")
    protected QueryType prodPromSourceId;
    @XmlElement(name = "ProductBuild")
    protected QueryType productBuild;
    @XmlElement(name = "ProductDefTypeCode")
    protected QueryType productDefTypeCode;
    @XmlElement(name = "ProductDescription")
    protected QueryType productDescription;
    @XmlElement(name = "ProductEffectiveFrom")
    protected QueryType productEffectiveFrom;
    @XmlElement(name = "ProductEffectiveTo")
    protected QueryType productEffectiveTo;
    @XmlElement(name = "ProductId")
    protected QueryType productId;
    @XmlElement(name = "ProductInventoryId")
    protected QueryType productInventoryId;
    @XmlElement(name = "ProductName")
    protected QueryType productName;
    @XmlElement(name = "ProductPartNumber")
    protected QueryType productPartNumber;
    @XmlElement(name = "ProductPortId")
    protected QueryType productPortId;
    @XmlElement(name = "ProductPrimaryProductLine")
    protected QueryType productPrimaryProductLine;
    @XmlElement(name = "ProductPrimaryProductLineId")
    protected QueryType productPrimaryProductLineId;
    @XmlElement(name = "ProductSerializedFlag")
    protected QueryType productSerializedFlag;
    @XmlElement(name = "ProductType")
    protected QueryType productType;
    @XmlElement(name = "ProductVersion")
    protected QueryType productVersion;
    @XmlElement(name = "ProductXAClassId")
    protected QueryType productXAClassId;
    @XmlElement(name = "PurchaseDate")
    protected QueryType purchaseDate;
    @XmlElement(name = "PurchaseLocationDescription")
    protected QueryType purchaseLocationDescription;
    @XmlElement(name = "Quantity")
    protected QueryType quantity;
    @XmlElement(name = "QuoteId")
    protected QueryType quoteId;
    @XmlElement(name = "QuoteIntegrationId")
    protected QueryType quoteIntegrationId;
    @XmlElement(name = "ReferenceFlag")
    protected QueryType referenceFlag;
    @XmlElement(name = "ReferenceNumber2")
    protected QueryType referenceNumber2;
    @XmlElement(name = "ReferenceNumber3")
    protected QueryType referenceNumber3;
    @XmlElement(name = "RegisteredDate")
    protected QueryType registeredDate;
    @XmlElement(name = "ReplacementValue")
    protected QueryType replacementValue;
    @XmlElement(name = "RootAssetId")
    protected QueryType rootAssetId;
    @XmlElement(name = "RootAssetNumber")
    protected QueryType rootAssetNumber;
    @XmlElement(name = "RootCfgLatestReleasedFlag")
    protected QueryType rootCfgLatestReleasedFlag;
    @XmlElement(name = "RootCfgType")
    protected QueryType rootCfgType;
    @XmlElement(name = "RootIntegrationId")
    protected QueryType rootIntegrationId;
    @XmlElement(name = "RootProductDefTypeCode")
    protected QueryType rootProductDefTypeCode;
    @XmlElement(name = "RootProductId")
    protected QueryType rootProductId;
    @XmlElement(name = "ScenarioTestFlag")
    protected QueryType scenarioTestFlag;
    @XmlElement(name = "SerialNumber")
    protected QueryType serialNumber;
    @XmlElement(name = "SerialNumberVerifiedFlag")
    protected QueryType serialNumberVerifiedFlag;
    @XmlElement(name = "ServiceAccount")
    protected QueryType serviceAccount;
    @XmlElement(name = "ServiceAccountId")
    protected QueryType serviceAccountId;
    @XmlElement(name = "ShipDate")
    protected QueryType shipDate;
    @XmlElement(name = "SmartPartNumber")
    protected QueryType smartPartNumber;
    @XmlElement(name = "StartDate")
    protected QueryType startDate;
    @XmlElement(name = "Status")
    protected QueryType status;
    @XmlElement(name = "ToNode")
    protected QueryType toNode;
    @XmlElement(name = "ToServiceAccount")
    protected QueryType toServiceAccount;
    @XmlElement(name = "ToServiceAccountId")
    protected QueryType toServiceAccountId;
    @XmlElement(name = "ToolFlag")
    protected QueryType toolFlag;
    @XmlElement(name = "UnitPrice")
    protected QueryType unitPrice;
    @XmlElement(name = "UnitofMeasure")
    protected QueryType unitofMeasure;
    @XmlElement(name = "VODRowId")
    protected QueryType vodRowId;
    @XmlElement(name = "ValidationDate")
    protected QueryType validationDate;
    @XmlElement(name = "ValidationStatus")
    protected QueryType validationStatus;
    @XmlElement(name = "ValueBasis")
    protected QueryType valueBasis;
    @XmlElement(name = "Version")
    protected QueryType version;
    @XmlElement(name = "WarrantyEndDate")
    protected QueryType warrantyEndDate;
    @XmlElement(name = "WarrantyStartDate")
    protected QueryType warrantyStartDate;
    @XmlElement(name = "WarrantyType")
    protected QueryType warrantyType;
    @XmlElement(name = "Type")
    protected QueryType type;
    @XmlElement(name = "BillingProfileName")
    protected QueryType billingProfileName;
    @XmlElement(name = "BillingProfileId")
    protected QueryType billingProfileId;
    @XmlElement(name = "AssetMgmt-Asset")
    protected AssetMgmtAssetQuery assetMgmtAsset;
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
     * Gets the value of the conflictId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getConflictId() {
        return conflictId;
    }

    /**
     * Sets the value of the conflictId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setConflictId(QueryType value) {
        this.conflictId = value;
    }

    /**
     * Gets the value of the modId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getModId() {
        return modId;
    }

    /**
     * Sets the value of the modId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setModId(QueryType value) {
        this.modId = value;
    }

    /**
     * Gets the value of the accountCompetitor property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getAccountCompetitor() {
        return accountCompetitor;
    }

    /**
     * Sets the value of the accountCompetitor property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setAccountCompetitor(QueryType value) {
        this.accountCompetitor = value;
    }

    /**
     * Gets the value of the accountIntegrationId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getAccountIntegrationId() {
        return accountIntegrationId;
    }

    /**
     * Sets the value of the accountIntegrationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setAccountIntegrationId(QueryType value) {
        this.accountIntegrationId = value;
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
     * Gets the value of the accountOrgId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getAccountOrgId() {
        return accountOrgId;
    }

    /**
     * Sets the value of the accountOrgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setAccountOrgId(QueryType value) {
        this.accountOrgId = value;
    }

    /**
     * Gets the value of the accountPrimaryAddress property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getAccountPrimaryAddress() {
        return accountPrimaryAddress;
    }

    /**
     * Sets the value of the accountPrimaryAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setAccountPrimaryAddress(QueryType value) {
        this.accountPrimaryAddress = value;
    }

    /**
     * Gets the value of the accountPrimaryAddressId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getAccountPrimaryAddressId() {
        return accountPrimaryAddressId;
    }

    /**
     * Sets the value of the accountPrimaryAddressId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setAccountPrimaryAddressId(QueryType value) {
        this.accountPrimaryAddressId = value;
    }

    /**
     * Gets the value of the accountPrimaryAddressLine2 property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getAccountPrimaryAddressLine2() {
        return accountPrimaryAddressLine2;
    }

    /**
     * Sets the value of the accountPrimaryAddressLine2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setAccountPrimaryAddressLine2(QueryType value) {
        this.accountPrimaryAddressLine2 = value;
    }

    /**
     * Gets the value of the accountPrimaryCity property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getAccountPrimaryCity() {
        return accountPrimaryCity;
    }

    /**
     * Sets the value of the accountPrimaryCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setAccountPrimaryCity(QueryType value) {
        this.accountPrimaryCity = value;
    }

    /**
     * Gets the value of the accountPrimaryCompleteAddress property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getAccountPrimaryCompleteAddress() {
        return accountPrimaryCompleteAddress;
    }

    /**
     * Sets the value of the accountPrimaryCompleteAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setAccountPrimaryCompleteAddress(QueryType value) {
        this.accountPrimaryCompleteAddress = value;
    }

    /**
     * Gets the value of the accountPrimaryCountry property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getAccountPrimaryCountry() {
        return accountPrimaryCountry;
    }

    /**
     * Sets the value of the accountPrimaryCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setAccountPrimaryCountry(QueryType value) {
        this.accountPrimaryCountry = value;
    }

    /**
     * Gets the value of the accountPrimaryServiceAgreementId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getAccountPrimaryServiceAgreementId() {
        return accountPrimaryServiceAgreementId;
    }

    /**
     * Sets the value of the accountPrimaryServiceAgreementId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setAccountPrimaryServiceAgreementId(QueryType value) {
        this.accountPrimaryServiceAgreementId = value;
    }

    /**
     * Gets the value of the accountPrimaryState property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getAccountPrimaryState() {
        return accountPrimaryState;
    }

    /**
     * Sets the value of the accountPrimaryState property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setAccountPrimaryState(QueryType value) {
        this.accountPrimaryState = value;
    }

    /**
     * Gets the value of the accountPrimaryZip property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getAccountPrimaryZip() {
        return accountPrimaryZip;
    }

    /**
     * Sets the value of the accountPrimaryZip property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setAccountPrimaryZip(QueryType value) {
        this.accountPrimaryZip = value;
    }

    /**
     * Gets the value of the accountingMethod property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getAccountingMethod() {
        return accountingMethod;
    }

    /**
     * Sets the value of the accountingMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setAccountingMethod(QueryType value) {
        this.accountingMethod = value;
    }

    /**
     * Gets the value of the actionCode property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getActionCode() {
        return actionCode;
    }

    /**
     * Sets the value of the actionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setActionCode(QueryType value) {
        this.actionCode = value;
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
     * Gets the value of the adjustedValue property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getAdjustedValue() {
        return adjustedValue;
    }

    /**
     * Sets the value of the adjustedValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setAdjustedValue(QueryType value) {
        this.adjustedValue = value;
    }

    /**
     * Gets the value of the assetAge property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getAssetAge() {
        return assetAge;
    }

    /**
     * Sets the value of the assetAge property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setAssetAge(QueryType value) {
        this.assetAge = value;
    }

    /**
     * Gets the value of the assetCategory property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getAssetCategory() {
        return assetCategory;
    }

    /**
     * Sets the value of the assetCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setAssetCategory(QueryType value) {
        this.assetCategory = value;
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
     * Gets the value of the assetLabel property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getAssetLabel() {
        return assetLabel;
    }

    /**
     * Sets the value of the assetLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setAssetLabel(QueryType value) {
        this.assetLabel = value;
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
     * Gets the value of the assetValue property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getAssetValue() {
        return assetValue;
    }

    /**
     * Sets the value of the assetValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setAssetValue(QueryType value) {
        this.assetValue = value;
    }

    /**
     * Gets the value of the assetValueExchangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getAssetValueExchangeDate() {
        return assetValueExchangeDate;
    }

    /**
     * Sets the value of the assetValueExchangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setAssetValueExchangeDate(QueryType value) {
        this.assetValueExchangeDate = value;
    }

    /**
     * Gets the value of the basePrice property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getBasePrice() {
        return basePrice;
    }

    /**
     * Sets the value of the basePrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setBasePrice(QueryType value) {
        this.basePrice = value;
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
     * Gets the value of the bucketID property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getBucketID() {
        return bucketID;
    }

    /**
     * Sets the value of the bucketID property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setBucketID(QueryType value) {
        this.bucketID = value;
    }

    /**
     * Gets the value of the build property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getBuild() {
        return build;
    }

    /**
     * Sets the value of the build property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setBuild(QueryType value) {
        this.build = value;
    }

    /**
     * Gets the value of the cdaPagesetId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getCDAPagesetId() {
        return cdaPagesetId;
    }

    /**
     * Sets the value of the cdaPagesetId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setCDAPagesetId(QueryType value) {
        this.cdaPagesetId = value;
    }

    /**
     * Gets the value of the cfgLatestReleasedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getCfgLatestReleasedFlag() {
        return cfgLatestReleasedFlag;
    }

    /**
     * Sets the value of the cfgLatestReleasedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setCfgLatestReleasedFlag(QueryType value) {
        this.cfgLatestReleasedFlag = value;
    }

    /**
     * Gets the value of the cfgReleasedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getCfgReleasedFlag() {
        return cfgReleasedFlag;
    }

    /**
     * Sets the value of the cfgReleasedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setCfgReleasedFlag(QueryType value) {
        this.cfgReleasedFlag = value;
    }

    /**
     * Gets the value of the cfgStateCode property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getCfgStateCode() {
        return cfgStateCode;
    }

    /**
     * Sets the value of the cfgStateCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setCfgStateCode(QueryType value) {
        this.cfgStateCode = value;
    }

    /**
     * Gets the value of the cfgType property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getCfgType() {
        return cfgType;
    }

    /**
     * Sets the value of the cfgType property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setCfgType(QueryType value) {
        this.cfgType = value;
    }

    /**
     * Gets the value of the cfgVersion property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getCfgVersion() {
        return cfgVersion;
    }

    /**
     * Sets the value of the cfgVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setCfgVersion(QueryType value) {
        this.cfgVersion = value;
    }

    /**
     * Gets the value of the changeinValue property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getChangeinValue() {
        return changeinValue;
    }

    /**
     * Sets the value of the changeinValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setChangeinValue(QueryType value) {
        this.changeinValue = value;
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
     * Gets the value of the commitmentCoveredFlag property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getCommitmentCoveredFlag() {
        return commitmentCoveredFlag;
    }

    /**
     * Sets the value of the commitmentCoveredFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setCommitmentCoveredFlag(QueryType value) {
        this.commitmentCoveredFlag = value;
    }

    /**
     * Gets the value of the compoundProductFlag property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getCompoundProductFlag() {
        return compoundProductFlag;
    }

    /**
     * Sets the value of the compoundProductFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setCompoundProductFlag(QueryType value) {
        this.compoundProductFlag = value;
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
     * Gets the value of the condition property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getCondition() {
        return condition;
    }

    /**
     * Sets the value of the condition property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setCondition(QueryType value) {
        this.condition = value;
    }

    /**
     * Gets the value of the configurationModelId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getConfigurationModelId() {
        return configurationModelId;
    }

    /**
     * Sets the value of the configurationModelId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setConfigurationModelId(QueryType value) {
        this.configurationModelId = value;
    }

    /**
     * Gets the value of the convertToAgreementFlag property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getConvertToAgreementFlag() {
        return convertToAgreementFlag;
    }

    /**
     * Sets the value of the convertToAgreementFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setConvertToAgreementFlag(QueryType value) {
        this.convertToAgreementFlag = value;
    }

    /**
     * Gets the value of the convertToAssetFlag property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getConvertToAssetFlag() {
        return convertToAssetFlag;
    }

    /**
     * Sets the value of the convertToAssetFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setConvertToAssetFlag(QueryType value) {
        this.convertToAssetFlag = value;
    }

    /**
     * Gets the value of the costList property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getCostList() {
        return costList;
    }

    /**
     * Sets the value of the costList property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setCostList(QueryType value) {
        this.costList = value;
    }

    /**
     * Gets the value of the costListId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getCostListId() {
        return costListId;
    }

    /**
     * Sets the value of the costListId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setCostListId(QueryType value) {
        this.costListId = value;
    }

    /**
     * Gets the value of the currencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Sets the value of the currencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setCurrencyCode(QueryType value) {
        this.currencyCode = value;
    }

    /**
     * Gets the value of the customizableFlag property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getCustomizableFlag() {
        return customizableFlag;
    }

    /**
     * Sets the value of the customizableFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setCustomizableFlag(QueryType value) {
        this.customizableFlag = value;
    }

    /**
     * Gets the value of the daysOnHand property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getDaysOnHand() {
        return daysOnHand;
    }

    /**
     * Sets the value of the daysOnHand property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setDaysOnHand(QueryType value) {
        this.daysOnHand = value;
    }

    /**
     * Gets the value of the discountAmount property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getDiscountAmount() {
        return discountAmount;
    }

    /**
     * Sets the value of the discountAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setDiscountAmount(QueryType value) {
        this.discountAmount = value;
    }

    /**
     * Gets the value of the discountPercent property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getDiscountPercent() {
        return discountPercent;
    }

    /**
     * Sets the value of the discountPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setDiscountPercent(QueryType value) {
        this.discountPercent = value;
    }

    /**
     * Gets the value of the domainName property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getDomainName() {
        return domainName;
    }

    /**
     * Sets the value of the domainName property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setDomainName(QueryType value) {
        this.domainName = value;
    }

    /**
     * Gets the value of the dueDate property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getDueDate() {
        return dueDate;
    }

    /**
     * Sets the value of the dueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setDueDate(QueryType value) {
        this.dueDate = value;
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
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setEndDate(QueryType value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the exchangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getExchangeDate() {
        return exchangeDate;
    }

    /**
     * Sets the value of the exchangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setExchangeDate(QueryType value) {
        this.exchangeDate = value;
    }

    /**
     * Gets the value of the excludePricingFlag property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getExcludePricingFlag() {
        return excludePricingFlag;
    }

    /**
     * Sets the value of the excludePricingFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setExcludePricingFlag(QueryType value) {
        this.excludePricingFlag = value;
    }

    /**
     * Gets the value of the explorerLabel property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getExplorerLabel() {
        return explorerLabel;
    }

    /**
     * Sets the value of the explorerLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setExplorerLabel(QueryType value) {
        this.explorerLabel = value;
    }

    /**
     * Gets the value of the extendedQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getExtendedQuantity() {
        return extendedQuantity;
    }

    /**
     * Sets the value of the extendedQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setExtendedQuantity(QueryType value) {
        this.extendedQuantity = value;
    }

    /**
     * Gets the value of the forcastableFlag property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getForcastableFlag() {
        return forcastableFlag;
    }

    /**
     * Sets the value of the forcastableFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setForcastableFlag(QueryType value) {
        this.forcastableFlag = value;
    }

    /**
     * Gets the value of the hasChildren property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getHasChildren() {
        return hasChildren;
    }

    /**
     * Sets the value of the hasChildren property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setHasChildren(QueryType value) {
        this.hasChildren = value;
    }

    /**
     * Gets the value of the hasGenericsFlag property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getHasGenericsFlag() {
        return hasGenericsFlag;
    }

    /**
     * Sets the value of the hasGenericsFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setHasGenericsFlag(QueryType value) {
        this.hasGenericsFlag = value;
    }

    /**
     * Gets the value of the householdNumber property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getHouseholdNumber() {
        return householdNumber;
    }

    /**
     * Sets the value of the householdNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setHouseholdNumber(QueryType value) {
        this.householdNumber = value;
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
     * Gets the value of the internalAssetFlag property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getInternalAssetFlag() {
        return internalAssetFlag;
    }

    /**
     * Sets the value of the internalAssetFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setInternalAssetFlag(QueryType value) {
        this.internalAssetFlag = value;
    }

    /**
     * Gets the value of the inventoryLocation property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getInventoryLocation() {
        return inventoryLocation;
    }

    /**
     * Sets the value of the inventoryLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setInventoryLocation(QueryType value) {
        this.inventoryLocation = value;
    }

    /**
     * Gets the value of the inventoryLocationId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getInventoryLocationId() {
        return inventoryLocationId;
    }

    /**
     * Sets the value of the inventoryLocationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setInventoryLocationId(QueryType value) {
        this.inventoryLocationId = value;
    }

    /**
     * Gets the value of the isExpanded property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getIsExpanded() {
        return isExpanded;
    }

    /**
     * Sets the value of the isExpanded property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setIsExpanded(QueryType value) {
        this.isExpanded = value;
    }

    /**
     * Gets the value of the itemType property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getItemType() {
        return itemType;
    }

    /**
     * Sets the value of the itemType property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setItemType(QueryType value) {
        this.itemType = value;
    }

    /**
     * Gets the value of the itemTypeLanguageIndependent property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getItemTypeLanguageIndependent() {
        return itemTypeLanguageIndependent;
    }

    /**
     * Sets the value of the itemTypeLanguageIndependent property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setItemTypeLanguageIndependent(QueryType value) {
        this.itemTypeLanguageIndependent = value;
    }

    /**
     * Gets the value of the license property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getLicense() {
        return license;
    }

    /**
     * Sets the value of the license property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setLicense(QueryType value) {
        this.license = value;
    }

    /**
     * Gets the value of the licenseNumber property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getLicenseNumber() {
        return licenseNumber;
    }

    /**
     * Sets the value of the licenseNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setLicenseNumber(QueryType value) {
        this.licenseNumber = value;
    }

    /**
     * Gets the value of the lineNumber property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getLineNumber() {
        return lineNumber;
    }

    /**
     * Sets the value of the lineNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setLineNumber(QueryType value) {
        this.lineNumber = value;
    }

    /**
     * Gets the value of the meterCount property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getMeterCount() {
        return meterCount;
    }

    /**
     * Sets the value of the meterCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setMeterCount(QueryType value) {
        this.meterCount = value;
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
     * Gets the value of the networkElementType property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getNetworkElementType() {
        return networkElementType;
    }

    /**
     * Sets the value of the networkElementType property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setNetworkElementType(QueryType value) {
        this.networkElementType = value;
    }

    /**
     * Gets the value of the node property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getNode() {
        return node;
    }

    /**
     * Sets the value of the node property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setNode(QueryType value) {
        this.node = value;
    }

    /**
     * Gets the value of the operatingStatus property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getOperatingStatus() {
        return operatingStatus;
    }

    /**
     * Sets the value of the operatingStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setOperatingStatus(QueryType value) {
        this.operatingStatus = value;
    }

    /**
     * Gets the value of the options property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getOptions() {
        return options;
    }

    /**
     * Sets the value of the options property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setOptions(QueryType value) {
        this.options = value;
    }

    /**
     * Gets the value of the orderAccountId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getOrderAccountId() {
        return orderAccountId;
    }

    /**
     * Sets the value of the orderAccountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setOrderAccountId(QueryType value) {
        this.orderAccountId = value;
    }

    /**
     * Gets the value of the orderHeaderId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getOrderHeaderId() {
        return orderHeaderId;
    }

    /**
     * Sets the value of the orderHeaderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setOrderHeaderId(QueryType value) {
        this.orderHeaderId = value;
    }

    /**
     * Gets the value of the orderIntegrationId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getOrderIntegrationId() {
        return orderIntegrationId;
    }

    /**
     * Sets the value of the orderIntegrationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setOrderIntegrationId(QueryType value) {
        this.orderIntegrationId = value;
    }

    /**
     * Gets the value of the organization property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getOrganization() {
        return organization;
    }

    /**
     * Sets the value of the organization property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setOrganization(QueryType value) {
        this.organization = value;
    }

    /**
     * Gets the value of the organizationId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getOrganizationId() {
        return organizationId;
    }

    /**
     * Sets the value of the organizationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setOrganizationId(QueryType value) {
        this.organizationId = value;
    }

    /**
     * Gets the value of the organizationalUnitAddressId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getOrganizationalUnitAddressId() {
        return organizationalUnitAddressId;
    }

    /**
     * Sets the value of the organizationalUnitAddressId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setOrganizationalUnitAddressId(QueryType value) {
        this.organizationalUnitAddressId = value;
    }

    /**
     * Gets the value of the originalCost property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getOriginalCost() {
        return originalCost;
    }

    /**
     * Sets the value of the originalCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setOriginalCost(QueryType value) {
        this.originalCost = value;
    }

    /**
     * Gets the value of the originalOrderId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getOriginalOrderId() {
        return originalOrderId;
    }

    /**
     * Sets the value of the originalOrderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setOriginalOrderId(QueryType value) {
        this.originalOrderId = value;
    }

    /**
     * Gets the value of the outlineNumber property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getOutlineNumber() {
        return outlineNumber;
    }

    /**
     * Sets the value of the outlineNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setOutlineNumber(QueryType value) {
        this.outlineNumber = value;
    }

    /**
     * Gets the value of the owner property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getOwner() {
        return owner;
    }

    /**
     * Sets the value of the owner property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setOwner(QueryType value) {
        this.owner = value;
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
     * Gets the value of the ownerAssetNumber property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getOwnerAssetNumber() {
        return ownerAssetNumber;
    }

    /**
     * Sets the value of the ownerAssetNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setOwnerAssetNumber(QueryType value) {
        this.ownerAssetNumber = value;
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
     * Gets the value of the ownerFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getOwnerFirstName() {
        return ownerFirstName;
    }

    /**
     * Sets the value of the ownerFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setOwnerFirstName(QueryType value) {
        this.ownerFirstName = value;
    }

    /**
     * Gets the value of the ownerLastName property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getOwnerLastName() {
        return ownerLastName;
    }

    /**
     * Sets the value of the ownerLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setOwnerLastName(QueryType value) {
        this.ownerLastName = value;
    }

    /**
     * Gets the value of the ownerName property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getOwnerName() {
        return ownerName;
    }

    /**
     * Sets the value of the ownerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setOwnerName(QueryType value) {
        this.ownerName = value;
    }

    /**
     * Gets the value of the ownership property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getOwnership() {
        return ownership;
    }

    /**
     * Sets the value of the ownership property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setOwnership(QueryType value) {
        this.ownership = value;
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
     * Gets the value of the parentAssetNumber property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getParentAssetNumber() {
        return parentAssetNumber;
    }

    /**
     * Sets the value of the parentAssetNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setParentAssetNumber(QueryType value) {
        this.parentAssetNumber = value;
    }

    /**
     * Gets the value of the personalAddress property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPersonalAddress() {
        return personalAddress;
    }

    /**
     * Sets the value of the personalAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPersonalAddress(QueryType value) {
        this.personalAddress = value;
    }

    /**
     * Gets the value of the personalAddressId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPersonalAddressId() {
        return personalAddressId;
    }

    /**
     * Sets the value of the personalAddressId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPersonalAddressId(QueryType value) {
        this.personalAddressId = value;
    }

    /**
     * Gets the value of the personalCity property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPersonalCity() {
        return personalCity;
    }

    /**
     * Sets the value of the personalCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPersonalCity(QueryType value) {
        this.personalCity = value;
    }

    /**
     * Gets the value of the personalCountry property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPersonalCountry() {
        return personalCountry;
    }

    /**
     * Sets the value of the personalCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPersonalCountry(QueryType value) {
        this.personalCountry = value;
    }

    /**
     * Gets the value of the personalState property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPersonalState() {
        return personalState;
    }

    /**
     * Sets the value of the personalState property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPersonalState(QueryType value) {
        this.personalState = value;
    }

    /**
     * Gets the value of the personalZip property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPersonalZip() {
        return personalZip;
    }

    /**
     * Sets the value of the personalZip property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPersonalZip(QueryType value) {
        this.personalZip = value;
    }

    /**
     * Gets the value of the postPickCD property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPostPickCD() {
        return postPickCD;
    }

    /**
     * Sets the value of the postPickCD property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPostPickCD(QueryType value) {
        this.postPickCD = value;
    }

    /**
     * Gets the value of the prePickCD property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPrePickCD() {
        return prePickCD;
    }

    /**
     * Sets the value of the prePickCD property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPrePickCD(QueryType value) {
        this.prePickCD = value;
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
     * Gets the value of the primaryContactAccountId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPrimaryContactAccountId() {
        return primaryContactAccountId;
    }

    /**
     * Sets the value of the primaryContactAccountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPrimaryContactAccountId(QueryType value) {
        this.primaryContactAccountId = value;
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
     * Gets the value of the primaryWarrantyCoverageId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPrimaryWarrantyCoverageId() {
        return primaryWarrantyCoverageId;
    }

    /**
     * Sets the value of the primaryWarrantyCoverageId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPrimaryWarrantyCoverageId(QueryType value) {
        this.primaryWarrantyCoverageId = value;
    }

    /**
     * Gets the value of the primaryWarrantyEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPrimaryWarrantyEndDate() {
        return primaryWarrantyEndDate;
    }

    /**
     * Sets the value of the primaryWarrantyEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPrimaryWarrantyEndDate(QueryType value) {
        this.primaryWarrantyEndDate = value;
    }

    /**
     * Gets the value of the primaryWarrantyName property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPrimaryWarrantyName() {
        return primaryWarrantyName;
    }

    /**
     * Sets the value of the primaryWarrantyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPrimaryWarrantyName(QueryType value) {
        this.primaryWarrantyName = value;
    }

    /**
     * Gets the value of the primaryWarrantyStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPrimaryWarrantyStartDate() {
        return primaryWarrantyStartDate;
    }

    /**
     * Sets the value of the primaryWarrantyStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPrimaryWarrantyStartDate(QueryType value) {
        this.primaryWarrantyStartDate = value;
    }

    /**
     * Gets the value of the primaryWarrantyType property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPrimaryWarrantyType() {
        return primaryWarrantyType;
    }

    /**
     * Sets the value of the primaryWarrantyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPrimaryWarrantyType(QueryType value) {
        this.primaryWarrantyType = value;
    }

    /**
     * Gets the value of the primaryWarranyId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPrimaryWarranyId() {
        return primaryWarranyId;
    }

    /**
     * Sets the value of the primaryWarranyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPrimaryWarranyId(QueryType value) {
        this.primaryWarranyId = value;
    }

    /**
     * Gets the value of the prodItemId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getProdItemId() {
        return prodItemId;
    }

    /**
     * Sets the value of the prodItemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setProdItemId(QueryType value) {
        this.prodItemId = value;
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
     * Gets the value of the prodPromName property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getProdPromName() {
        return prodPromName;
    }

    /**
     * Sets the value of the prodPromName property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setProdPromName(QueryType value) {
        this.prodPromName = value;
    }

    /**
     * Gets the value of the prodPromRuleId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getProdPromRuleId() {
        return prodPromRuleId;
    }

    /**
     * Sets the value of the prodPromRuleId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setProdPromRuleId(QueryType value) {
        this.prodPromRuleId = value;
    }

    /**
     * Gets the value of the prodPromSourceId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getProdPromSourceId() {
        return prodPromSourceId;
    }

    /**
     * Sets the value of the prodPromSourceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setProdPromSourceId(QueryType value) {
        this.prodPromSourceId = value;
    }

    /**
     * Gets the value of the productBuild property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getProductBuild() {
        return productBuild;
    }

    /**
     * Sets the value of the productBuild property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setProductBuild(QueryType value) {
        this.productBuild = value;
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
     * Gets the value of the productEffectiveFrom property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getProductEffectiveFrom() {
        return productEffectiveFrom;
    }

    /**
     * Sets the value of the productEffectiveFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setProductEffectiveFrom(QueryType value) {
        this.productEffectiveFrom = value;
    }

    /**
     * Gets the value of the productEffectiveTo property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getProductEffectiveTo() {
        return productEffectiveTo;
    }

    /**
     * Sets the value of the productEffectiveTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setProductEffectiveTo(QueryType value) {
        this.productEffectiveTo = value;
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
     * Gets the value of the productInventoryId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getProductInventoryId() {
        return productInventoryId;
    }

    /**
     * Sets the value of the productInventoryId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setProductInventoryId(QueryType value) {
        this.productInventoryId = value;
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
     * Gets the value of the productPortId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getProductPortId() {
        return productPortId;
    }

    /**
     * Sets the value of the productPortId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setProductPortId(QueryType value) {
        this.productPortId = value;
    }

    /**
     * Gets the value of the productPrimaryProductLine property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getProductPrimaryProductLine() {
        return productPrimaryProductLine;
    }

    /**
     * Sets the value of the productPrimaryProductLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setProductPrimaryProductLine(QueryType value) {
        this.productPrimaryProductLine = value;
    }

    /**
     * Gets the value of the productPrimaryProductLineId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getProductPrimaryProductLineId() {
        return productPrimaryProductLineId;
    }

    /**
     * Sets the value of the productPrimaryProductLineId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setProductPrimaryProductLineId(QueryType value) {
        this.productPrimaryProductLineId = value;
    }

    /**
     * Gets the value of the productSerializedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getProductSerializedFlag() {
        return productSerializedFlag;
    }

    /**
     * Sets the value of the productSerializedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setProductSerializedFlag(QueryType value) {
        this.productSerializedFlag = value;
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
     * Gets the value of the productVersion property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getProductVersion() {
        return productVersion;
    }

    /**
     * Sets the value of the productVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setProductVersion(QueryType value) {
        this.productVersion = value;
    }

    /**
     * Gets the value of the productXAClassId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getProductXAClassId() {
        return productXAClassId;
    }

    /**
     * Sets the value of the productXAClassId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setProductXAClassId(QueryType value) {
        this.productXAClassId = value;
    }

    /**
     * Gets the value of the purchaseDate property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPurchaseDate() {
        return purchaseDate;
    }

    /**
     * Sets the value of the purchaseDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPurchaseDate(QueryType value) {
        this.purchaseDate = value;
    }

    /**
     * Gets the value of the purchaseLocationDescription property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPurchaseLocationDescription() {
        return purchaseLocationDescription;
    }

    /**
     * Sets the value of the purchaseLocationDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPurchaseLocationDescription(QueryType value) {
        this.purchaseLocationDescription = value;
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
     * Gets the value of the quoteId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getQuoteId() {
        return quoteId;
    }

    /**
     * Sets the value of the quoteId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setQuoteId(QueryType value) {
        this.quoteId = value;
    }

    /**
     * Gets the value of the quoteIntegrationId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getQuoteIntegrationId() {
        return quoteIntegrationId;
    }

    /**
     * Sets the value of the quoteIntegrationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setQuoteIntegrationId(QueryType value) {
        this.quoteIntegrationId = value;
    }

    /**
     * Gets the value of the referenceFlag property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getReferenceFlag() {
        return referenceFlag;
    }

    /**
     * Sets the value of the referenceFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setReferenceFlag(QueryType value) {
        this.referenceFlag = value;
    }

    /**
     * Gets the value of the referenceNumber2 property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getReferenceNumber2() {
        return referenceNumber2;
    }

    /**
     * Sets the value of the referenceNumber2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setReferenceNumber2(QueryType value) {
        this.referenceNumber2 = value;
    }

    /**
     * Gets the value of the referenceNumber3 property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getReferenceNumber3() {
        return referenceNumber3;
    }

    /**
     * Sets the value of the referenceNumber3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setReferenceNumber3(QueryType value) {
        this.referenceNumber3 = value;
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
     * Gets the value of the replacementValue property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getReplacementValue() {
        return replacementValue;
    }

    /**
     * Sets the value of the replacementValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setReplacementValue(QueryType value) {
        this.replacementValue = value;
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
     * Gets the value of the rootAssetNumber property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getRootAssetNumber() {
        return rootAssetNumber;
    }

    /**
     * Sets the value of the rootAssetNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setRootAssetNumber(QueryType value) {
        this.rootAssetNumber = value;
    }

    /**
     * Gets the value of the rootCfgLatestReleasedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getRootCfgLatestReleasedFlag() {
        return rootCfgLatestReleasedFlag;
    }

    /**
     * Sets the value of the rootCfgLatestReleasedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setRootCfgLatestReleasedFlag(QueryType value) {
        this.rootCfgLatestReleasedFlag = value;
    }

    /**
     * Gets the value of the rootCfgType property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getRootCfgType() {
        return rootCfgType;
    }

    /**
     * Sets the value of the rootCfgType property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setRootCfgType(QueryType value) {
        this.rootCfgType = value;
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
     * Gets the value of the rootProductDefTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getRootProductDefTypeCode() {
        return rootProductDefTypeCode;
    }

    /**
     * Sets the value of the rootProductDefTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setRootProductDefTypeCode(QueryType value) {
        this.rootProductDefTypeCode = value;
    }

    /**
     * Gets the value of the rootProductId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getRootProductId() {
        return rootProductId;
    }

    /**
     * Sets the value of the rootProductId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setRootProductId(QueryType value) {
        this.rootProductId = value;
    }

    /**
     * Gets the value of the scenarioTestFlag property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getScenarioTestFlag() {
        return scenarioTestFlag;
    }

    /**
     * Sets the value of the scenarioTestFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setScenarioTestFlag(QueryType value) {
        this.scenarioTestFlag = value;
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
     * Gets the value of the serialNumberVerifiedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getSerialNumberVerifiedFlag() {
        return serialNumberVerifiedFlag;
    }

    /**
     * Sets the value of the serialNumberVerifiedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setSerialNumberVerifiedFlag(QueryType value) {
        this.serialNumberVerifiedFlag = value;
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
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setStartDate(QueryType value) {
        this.startDate = value;
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
     * Gets the value of the toNode property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getToNode() {
        return toNode;
    }

    /**
     * Sets the value of the toNode property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setToNode(QueryType value) {
        this.toNode = value;
    }

    /**
     * Gets the value of the toServiceAccount property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getToServiceAccount() {
        return toServiceAccount;
    }

    /**
     * Sets the value of the toServiceAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setToServiceAccount(QueryType value) {
        this.toServiceAccount = value;
    }

    /**
     * Gets the value of the toServiceAccountId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getToServiceAccountId() {
        return toServiceAccountId;
    }

    /**
     * Sets the value of the toServiceAccountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setToServiceAccountId(QueryType value) {
        this.toServiceAccountId = value;
    }

    /**
     * Gets the value of the toolFlag property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getToolFlag() {
        return toolFlag;
    }

    /**
     * Sets the value of the toolFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setToolFlag(QueryType value) {
        this.toolFlag = value;
    }

    /**
     * Gets the value of the unitPrice property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getUnitPrice() {
        return unitPrice;
    }

    /**
     * Sets the value of the unitPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setUnitPrice(QueryType value) {
        this.unitPrice = value;
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
     * Gets the value of the vodRowId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getVODRowId() {
        return vodRowId;
    }

    /**
     * Sets the value of the vodRowId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setVODRowId(QueryType value) {
        this.vodRowId = value;
    }

    /**
     * Gets the value of the validationDate property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getValidationDate() {
        return validationDate;
    }

    /**
     * Sets the value of the validationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setValidationDate(QueryType value) {
        this.validationDate = value;
    }

    /**
     * Gets the value of the validationStatus property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getValidationStatus() {
        return validationStatus;
    }

    /**
     * Sets the value of the validationStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setValidationStatus(QueryType value) {
        this.validationStatus = value;
    }

    /**
     * Gets the value of the valueBasis property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getValueBasis() {
        return valueBasis;
    }

    /**
     * Sets the value of the valueBasis property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setValueBasis(QueryType value) {
        this.valueBasis = value;
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
     * Gets the value of the warrantyEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getWarrantyEndDate() {
        return warrantyEndDate;
    }

    /**
     * Sets the value of the warrantyEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setWarrantyEndDate(QueryType value) {
        this.warrantyEndDate = value;
    }

    /**
     * Gets the value of the warrantyStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getWarrantyStartDate() {
        return warrantyStartDate;
    }

    /**
     * Sets the value of the warrantyStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setWarrantyStartDate(QueryType value) {
        this.warrantyStartDate = value;
    }

    /**
     * Gets the value of the warrantyType property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getWarrantyType() {
        return warrantyType;
    }

    /**
     * Sets the value of the warrantyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setWarrantyType(QueryType value) {
        this.warrantyType = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setType(QueryType value) {
        this.type = value;
    }

    /**
     * Gets the value of the billingProfileName property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getBillingProfileName() {
        return billingProfileName;
    }

    /**
     * Sets the value of the billingProfileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setBillingProfileName(QueryType value) {
        this.billingProfileName = value;
    }

    /**
     * Gets the value of the billingProfileId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getBillingProfileId() {
        return billingProfileId;
    }

    /**
     * Sets the value of the billingProfileId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setBillingProfileId(QueryType value) {
        this.billingProfileId = value;
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
