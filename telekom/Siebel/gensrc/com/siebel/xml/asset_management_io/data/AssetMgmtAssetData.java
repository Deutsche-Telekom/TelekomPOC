
package com.siebel.xml.asset_management_io.data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for AssetMgmt-AssetData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AssetMgmt-AssetData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Created" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Updated" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ConflictId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ModId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AccountCompetitor" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="AccountIntegrationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AccountLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AccountName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AccountOrgId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AccountPrimaryAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AccountPrimaryAddressId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AccountPrimaryAddressLine2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AccountPrimaryCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AccountPrimaryCompleteAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AccountPrimaryCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AccountPrimaryServiceAgreementId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AccountPrimaryState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AccountPrimaryZip" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AccountingMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ActionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AdjustedListPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="AdjustedValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="AssetAge" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="AssetCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AssetCurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AssetDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AssetId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AssetLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AssetNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AssetValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="AssetValueExchangeDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="BasePrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="BillingAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BillingAccountId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BucketID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Build" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CDAPagesetId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CfgLatestReleasedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CfgReleasedFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CfgStateCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CfgType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CfgVersion" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ChangeinValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Comments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CommitmentCoveredFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CompoundProductFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CompoundProductNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Condition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ConfigurationModelId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ConvertToAgreementFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ConvertToAssetFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CostList" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CostListId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CustomizableFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="DaysOn-Hand" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DiscountAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DiscountPercent" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DomainName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DueDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EffectiveEndDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="EligibilityReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EligibilityStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EndDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="ExchangeDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="ExcludePricingFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ExplorerLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExtendedQuantity" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ForcastableFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="HasChildren" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="HasGenericsFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="HouseholdNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InclusiveEligibilityFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="InstallDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="IntegrationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InternalAssetFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="InventoryLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InventoryLocationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsExpanded" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ItemType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ItemType-LanguageIndependent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="License" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LicenseNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LineNumber" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="MeterCount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="MfgDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NetworkElementType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Node" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OperatingStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Options" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrderAccountId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrderHeaderId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrderIntegrationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Organization" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrganizationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrganizationalUnitAddressId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OriginalCost" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="OriginalOrderId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutlineNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Owner" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OwnerAccountId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OwnerAssetNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OwnerContactId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OwnerFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OwnerLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OwnerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Ownership" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ParentAssetId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ParentAssetNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonalAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonalAddressId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonalCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonalCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonalState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonalZip" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PostPickCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrePickCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PriceListId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PriceType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryContactAccountId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryContactId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryEmployeeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryWarrantyCoverageId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryWarrantyEndDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="PrimaryWarrantyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryWarrantyStartDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="PrimaryWarrantyType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryWarranyId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProdItemId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProdPromId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProdPromInstanceId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProdPromName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProdPromRuleId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProdPromSourceId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProductBuild" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProductDefTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProductDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProductEffectiveFrom" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="ProductEffectiveTo" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="ProductId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProductInventoryId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProductName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProductPartNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProductPortId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProductPrimaryProductLine" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProductPrimaryProductLineId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProductSerializedFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ProductType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProductVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProductXAClassId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PurchaseDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="PurchaseLocationDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="QuoteId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QuoteIntegrationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReferenceFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ReferenceNumber2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReferenceNumber3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RegisteredDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="ReplacementValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="RootAssetId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RootAssetNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RootCfgLatestReleasedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RootCfgType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RootIntegrationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RootProductDefTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RootProductId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ScenarioTestFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SerialNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SerialNumberVerifiedFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ServiceAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ServiceAccountId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShipDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="SmartPartNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StartDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ToNode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ToServiceAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ToServiceAccountId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ToolFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UnitPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="UnitofMeasure" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VODRowId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ValidationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ValidationStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ValueBasis" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Version" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WarrantyEndDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="WarrantyStartDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="WarrantyType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BillingProfileName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BillingProfileId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AssetMgmt-Asset" type="{http://www.siebel.com/xml/Asset_Management_IO/Data}AssetMgmt-AssetData" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "AssetMgmt-AssetData", propOrder = {
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
public class AssetMgmtAssetData
    implements Serializable
{

    @XmlElement(name = "Id")
    protected String id;
    @XmlElement(name = "Created")
    protected XMLGregorianCalendar created;
    @XmlElement(name = "Updated")
    protected XMLGregorianCalendar updated;
    @XmlElement(name = "ConflictId")
    protected String conflictId;
    @XmlElement(name = "ModId")
    protected String modId;
    @XmlElement(name = "AccountCompetitor")
    protected Boolean accountCompetitor;
    @XmlElement(name = "AccountIntegrationId")
    protected String accountIntegrationId;
    @XmlElement(name = "AccountLocation")
    protected String accountLocation;
    @XmlElement(name = "AccountName")
    protected String accountName;
    @XmlElement(name = "AccountOrgId")
    protected String accountOrgId;
    @XmlElement(name = "AccountPrimaryAddress")
    protected String accountPrimaryAddress;
    @XmlElement(name = "AccountPrimaryAddressId")
    protected String accountPrimaryAddressId;
    @XmlElement(name = "AccountPrimaryAddressLine2")
    protected String accountPrimaryAddressLine2;
    @XmlElement(name = "AccountPrimaryCity")
    protected String accountPrimaryCity;
    @XmlElement(name = "AccountPrimaryCompleteAddress")
    protected String accountPrimaryCompleteAddress;
    @XmlElement(name = "AccountPrimaryCountry")
    protected String accountPrimaryCountry;
    @XmlElement(name = "AccountPrimaryServiceAgreementId")
    protected String accountPrimaryServiceAgreementId;
    @XmlElement(name = "AccountPrimaryState")
    protected String accountPrimaryState;
    @XmlElement(name = "AccountPrimaryZip")
    protected String accountPrimaryZip;
    @XmlElement(name = "AccountingMethod")
    protected String accountingMethod;
    @XmlElement(name = "ActionCode")
    protected String actionCode;
    @XmlElement(name = "AdjustedListPrice")
    protected BigDecimal adjustedListPrice;
    @XmlElement(name = "AdjustedValue")
    protected BigDecimal adjustedValue;
    @XmlElement(name = "AssetAge")
    protected BigDecimal assetAge;
    @XmlElement(name = "AssetCategory")
    protected String assetCategory;
    @XmlElement(name = "AssetCurrencyCode")
    protected String assetCurrencyCode;
    @XmlElement(name = "AssetDescription")
    protected String assetDescription;
    @XmlElement(name = "AssetId")
    protected String assetId;
    @XmlElement(name = "AssetLabel")
    protected String assetLabel;
    @XmlElement(name = "AssetNumber")
    protected String assetNumber;
    @XmlElement(name = "AssetValue")
    protected BigDecimal assetValue;
    @XmlElement(name = "AssetValueExchangeDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar assetValueExchangeDate;
    @XmlElement(name = "BasePrice")
    protected BigDecimal basePrice;
    @XmlElement(name = "BillingAccount")
    protected String billingAccount;
    @XmlElement(name = "BillingAccountId")
    protected String billingAccountId;
    @XmlElement(name = "BucketID")
    protected String bucketID;
    @XmlElement(name = "Build")
    protected String build;
    @XmlElement(name = "CDAPagesetId")
    protected String cdaPagesetId;
    @XmlElement(name = "CfgLatestReleasedFlag")
    protected String cfgLatestReleasedFlag;
    @XmlElement(name = "CfgReleasedFlag")
    protected Boolean cfgReleasedFlag;
    @XmlElement(name = "CfgStateCode")
    protected String cfgStateCode;
    @XmlElement(name = "CfgType")
    protected String cfgType;
    @XmlElement(name = "CfgVersion")
    protected BigDecimal cfgVersion;
    @XmlElement(name = "ChangeinValue")
    protected BigDecimal changeinValue;
    @XmlElement(name = "Comments")
    protected String comments;
    @XmlElement(name = "CommitmentCoveredFlag")
    protected Boolean commitmentCoveredFlag;
    @XmlElement(name = "CompoundProductFlag")
    protected Boolean compoundProductFlag;
    @XmlElement(name = "CompoundProductNumber")
    protected String compoundProductNumber;
    @XmlElement(name = "Condition")
    protected String condition;
    @XmlElement(name = "ConfigurationModelId")
    protected String configurationModelId;
    @XmlElement(name = "ConvertToAgreementFlag")
    protected Boolean convertToAgreementFlag;
    @XmlElement(name = "ConvertToAssetFlag")
    protected Boolean convertToAssetFlag;
    @XmlElement(name = "CostList")
    protected String costList;
    @XmlElement(name = "CostListId")
    protected String costListId;
    @XmlElement(name = "CurrencyCode")
    protected String currencyCode;
    @XmlElement(name = "CustomizableFlag")
    protected Boolean customizableFlag;
    @XmlElement(name = "DaysOn-Hand")
    protected BigDecimal daysOnHand;
    @XmlElement(name = "DiscountAmount")
    protected BigDecimal discountAmount;
    @XmlElement(name = "DiscountPercent")
    protected BigDecimal discountPercent;
    @XmlElement(name = "DomainName")
    protected String domainName;
    @XmlElement(name = "DueDate")
    protected String dueDate;
    @XmlElement(name = "EffectiveEndDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar effectiveEndDate;
    @XmlElement(name = "EligibilityReason")
    protected String eligibilityReason;
    @XmlElement(name = "EligibilityStatus")
    protected String eligibilityStatus;
    @XmlElement(name = "EndDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar endDate;
    @XmlElement(name = "ExchangeDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar exchangeDate;
    @XmlElement(name = "ExcludePricingFlag")
    protected Boolean excludePricingFlag;
    @XmlElement(name = "ExplorerLabel")
    protected String explorerLabel;
    @XmlElement(name = "ExtendedQuantity")
    protected BigDecimal extendedQuantity;
    @XmlElement(name = "ForcastableFlag")
    protected Boolean forcastableFlag;
    @XmlElement(name = "HasChildren")
    protected Boolean hasChildren;
    @XmlElement(name = "HasGenericsFlag")
    protected Boolean hasGenericsFlag;
    @XmlElement(name = "HouseholdNumber")
    protected String householdNumber;
    @XmlElement(name = "InclusiveEligibilityFlag")
    protected Boolean inclusiveEligibilityFlag;
    @XmlElement(name = "InstallDate")
    protected XMLGregorianCalendar installDate;
    @XmlElement(name = "IntegrationId")
    protected String integrationId;
    @XmlElement(name = "InternalAssetFlag")
    protected Boolean internalAssetFlag;
    @XmlElement(name = "InventoryLocation")
    protected String inventoryLocation;
    @XmlElement(name = "InventoryLocationId")
    protected String inventoryLocationId;
    @XmlElement(name = "IsExpanded")
    protected Boolean isExpanded;
    @XmlElement(name = "ItemType")
    protected String itemType;
    @XmlElement(name = "ItemType-LanguageIndependent")
    protected String itemTypeLanguageIndependent;
    @XmlElement(name = "License")
    protected String license;
    @XmlElement(name = "LicenseNumber")
    protected String licenseNumber;
    @XmlElement(name = "LineNumber")
    protected BigDecimal lineNumber;
    @XmlElement(name = "MeterCount")
    protected BigDecimal meterCount;
    @XmlElement(name = "MfgDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar mfgDate;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "NetworkElementType")
    protected String networkElementType;
    @XmlElement(name = "Node")
    protected String node;
    @XmlElement(name = "OperatingStatus")
    protected String operatingStatus;
    @XmlElement(name = "Options")
    protected String options;
    @XmlElement(name = "OrderAccountId")
    protected String orderAccountId;
    @XmlElement(name = "OrderHeaderId")
    protected String orderHeaderId;
    @XmlElement(name = "OrderIntegrationId")
    protected String orderIntegrationId;
    @XmlElement(name = "Organization")
    protected String organization;
    @XmlElement(name = "OrganizationId")
    protected String organizationId;
    @XmlElement(name = "OrganizationalUnitAddressId")
    protected String organizationalUnitAddressId;
    @XmlElement(name = "OriginalCost")
    protected BigDecimal originalCost;
    @XmlElement(name = "OriginalOrderId")
    protected String originalOrderId;
    @XmlElement(name = "OutlineNumber")
    protected String outlineNumber;
    @XmlElement(name = "Owner")
    protected String owner;
    @XmlElement(name = "OwnerAccountId")
    protected String ownerAccountId;
    @XmlElement(name = "OwnerAssetNumber")
    protected String ownerAssetNumber;
    @XmlElement(name = "OwnerContactId")
    protected String ownerContactId;
    @XmlElement(name = "OwnerFirstName")
    protected String ownerFirstName;
    @XmlElement(name = "OwnerLastName")
    protected String ownerLastName;
    @XmlElement(name = "OwnerName")
    protected String ownerName;
    @XmlElement(name = "Ownership")
    protected String ownership;
    @XmlElement(name = "ParentAssetId")
    protected String parentAssetId;
    @XmlElement(name = "ParentAssetNumber")
    protected String parentAssetNumber;
    @XmlElement(name = "PersonalAddress")
    protected String personalAddress;
    @XmlElement(name = "PersonalAddressId")
    protected String personalAddressId;
    @XmlElement(name = "PersonalCity")
    protected String personalCity;
    @XmlElement(name = "PersonalCountry")
    protected String personalCountry;
    @XmlElement(name = "PersonalState")
    protected String personalState;
    @XmlElement(name = "PersonalZip")
    protected String personalZip;
    @XmlElement(name = "PostPickCD")
    protected String postPickCD;
    @XmlElement(name = "PrePickCD")
    protected String prePickCD;
    @XmlElement(name = "PriceListId")
    protected String priceListId;
    @XmlElement(name = "PriceType")
    protected String priceType;
    @XmlElement(name = "PrimaryContactAccountId")
    protected String primaryContactAccountId;
    @XmlElement(name = "PrimaryContactId")
    protected String primaryContactId;
    @XmlElement(name = "PrimaryEmployeeId")
    protected String primaryEmployeeId;
    @XmlElement(name = "PrimaryWarrantyCoverageId")
    protected String primaryWarrantyCoverageId;
    @XmlElement(name = "PrimaryWarrantyEndDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar primaryWarrantyEndDate;
    @XmlElement(name = "PrimaryWarrantyName")
    protected String primaryWarrantyName;
    @XmlElement(name = "PrimaryWarrantyStartDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar primaryWarrantyStartDate;
    @XmlElement(name = "PrimaryWarrantyType")
    protected String primaryWarrantyType;
    @XmlElement(name = "PrimaryWarranyId")
    protected String primaryWarranyId;
    @XmlElement(name = "ProdItemId")
    protected String prodItemId;
    @XmlElement(name = "ProdPromId")
    protected String prodPromId;
    @XmlElement(name = "ProdPromInstanceId")
    protected String prodPromInstanceId;
    @XmlElement(name = "ProdPromName")
    protected String prodPromName;
    @XmlElement(name = "ProdPromRuleId")
    protected String prodPromRuleId;
    @XmlElement(name = "ProdPromSourceId")
    protected String prodPromSourceId;
    @XmlElement(name = "ProductBuild")
    protected String productBuild;
    @XmlElement(name = "ProductDefTypeCode")
    protected String productDefTypeCode;
    @XmlElement(name = "ProductDescription")
    protected String productDescription;
    @XmlElement(name = "ProductEffectiveFrom")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar productEffectiveFrom;
    @XmlElement(name = "ProductEffectiveTo")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar productEffectiveTo;
    @XmlElement(name = "ProductId")
    protected String productId;
    @XmlElement(name = "ProductInventoryId")
    protected String productInventoryId;
    @XmlElement(name = "ProductName")
    protected String productName;
    @XmlElement(name = "ProductPartNumber")
    protected String productPartNumber;
    @XmlElement(name = "ProductPortId")
    protected String productPortId;
    @XmlElement(name = "ProductPrimaryProductLine")
    protected String productPrimaryProductLine;
    @XmlElement(name = "ProductPrimaryProductLineId")
    protected String productPrimaryProductLineId;
    @XmlElement(name = "ProductSerializedFlag")
    protected Boolean productSerializedFlag;
    @XmlElement(name = "ProductType")
    protected String productType;
    @XmlElement(name = "ProductVersion")
    protected String productVersion;
    @XmlElement(name = "ProductXAClassId")
    protected String productXAClassId;
    @XmlElement(name = "PurchaseDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar purchaseDate;
    @XmlElement(name = "PurchaseLocationDescription")
    protected String purchaseLocationDescription;
    @XmlElement(name = "Quantity")
    protected Integer quantity;
    @XmlElement(name = "QuoteId")
    protected String quoteId;
    @XmlElement(name = "QuoteIntegrationId")
    protected String quoteIntegrationId;
    @XmlElement(name = "ReferenceFlag")
    protected Boolean referenceFlag;
    @XmlElement(name = "ReferenceNumber2")
    protected String referenceNumber2;
    @XmlElement(name = "ReferenceNumber3")
    protected String referenceNumber3;
    @XmlElement(name = "RegisteredDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar registeredDate;
    @XmlElement(name = "ReplacementValue")
    protected BigDecimal replacementValue;
    @XmlElement(name = "RootAssetId")
    protected String rootAssetId;
    @XmlElement(name = "RootAssetNumber")
    protected String rootAssetNumber;
    @XmlElement(name = "RootCfgLatestReleasedFlag")
    protected String rootCfgLatestReleasedFlag;
    @XmlElement(name = "RootCfgType")
    protected String rootCfgType;
    @XmlElement(name = "RootIntegrationId")
    protected String rootIntegrationId;
    @XmlElement(name = "RootProductDefTypeCode")
    protected String rootProductDefTypeCode;
    @XmlElement(name = "RootProductId")
    protected String rootProductId;
    @XmlElement(name = "ScenarioTestFlag")
    protected Boolean scenarioTestFlag;
    @XmlElement(name = "SerialNumber")
    protected String serialNumber;
    @XmlElement(name = "SerialNumberVerifiedFlag")
    protected Boolean serialNumberVerifiedFlag;
    @XmlElement(name = "ServiceAccount")
    protected String serviceAccount;
    @XmlElement(name = "ServiceAccountId")
    protected String serviceAccountId;
    @XmlElement(name = "ShipDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar shipDate;
    @XmlElement(name = "SmartPartNumber")
    protected String smartPartNumber;
    @XmlElement(name = "StartDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar startDate;
    @XmlElement(name = "Status")
    protected String status;
    @XmlElement(name = "ToNode")
    protected String toNode;
    @XmlElement(name = "ToServiceAccount")
    protected String toServiceAccount;
    @XmlElement(name = "ToServiceAccountId")
    protected String toServiceAccountId;
    @XmlElement(name = "ToolFlag")
    protected Boolean toolFlag;
    @XmlElement(name = "UnitPrice")
    protected BigDecimal unitPrice;
    @XmlElement(name = "UnitofMeasure")
    protected String unitofMeasure;
    @XmlElement(name = "VODRowId")
    protected String vodRowId;
    @XmlElement(name = "ValidationDate")
    protected XMLGregorianCalendar validationDate;
    @XmlElement(name = "ValidationStatus")
    protected String validationStatus;
    @XmlElement(name = "ValueBasis")
    protected String valueBasis;
    @XmlElement(name = "Version")
    protected String version;
    @XmlElement(name = "WarrantyEndDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar warrantyEndDate;
    @XmlElement(name = "WarrantyStartDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar warrantyStartDate;
    @XmlElement(name = "WarrantyType")
    protected String warrantyType;
    @XmlElement(name = "Type")
    protected String type;
    @XmlElement(name = "BillingProfileName")
    protected String billingProfileName;
    @XmlElement(name = "BillingProfileId")
    protected String billingProfileId;
    @XmlElement(name = "AssetMgmt-Asset")
    protected List<AssetMgmtAssetData> assetMgmtAsset;
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
     * Gets the value of the created property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreated() {
        return created;
    }

    /**
     * Sets the value of the created property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreated(XMLGregorianCalendar value) {
        this.created = value;
    }

    /**
     * Gets the value of the updated property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUpdated() {
        return updated;
    }

    /**
     * Sets the value of the updated property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUpdated(XMLGregorianCalendar value) {
        this.updated = value;
    }

    /**
     * Gets the value of the conflictId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConflictId() {
        return conflictId;
    }

    /**
     * Sets the value of the conflictId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConflictId(String value) {
        this.conflictId = value;
    }

    /**
     * Gets the value of the modId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModId() {
        return modId;
    }

    /**
     * Sets the value of the modId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModId(String value) {
        this.modId = value;
    }

    /**
     * Gets the value of the accountCompetitor property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAccountCompetitor() {
        return accountCompetitor;
    }

    /**
     * Sets the value of the accountCompetitor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAccountCompetitor(Boolean value) {
        this.accountCompetitor = value;
    }

    /**
     * Gets the value of the accountIntegrationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountIntegrationId() {
        return accountIntegrationId;
    }

    /**
     * Sets the value of the accountIntegrationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountIntegrationId(String value) {
        this.accountIntegrationId = value;
    }

    /**
     * Gets the value of the accountLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountLocation() {
        return accountLocation;
    }

    /**
     * Sets the value of the accountLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountLocation(String value) {
        this.accountLocation = value;
    }

    /**
     * Gets the value of the accountName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountName() {
        return accountName;
    }

    /**
     * Sets the value of the accountName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountName(String value) {
        this.accountName = value;
    }

    /**
     * Gets the value of the accountOrgId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountOrgId() {
        return accountOrgId;
    }

    /**
     * Sets the value of the accountOrgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountOrgId(String value) {
        this.accountOrgId = value;
    }

    /**
     * Gets the value of the accountPrimaryAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountPrimaryAddress() {
        return accountPrimaryAddress;
    }

    /**
     * Sets the value of the accountPrimaryAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountPrimaryAddress(String value) {
        this.accountPrimaryAddress = value;
    }

    /**
     * Gets the value of the accountPrimaryAddressId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountPrimaryAddressId() {
        return accountPrimaryAddressId;
    }

    /**
     * Sets the value of the accountPrimaryAddressId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountPrimaryAddressId(String value) {
        this.accountPrimaryAddressId = value;
    }

    /**
     * Gets the value of the accountPrimaryAddressLine2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountPrimaryAddressLine2() {
        return accountPrimaryAddressLine2;
    }

    /**
     * Sets the value of the accountPrimaryAddressLine2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountPrimaryAddressLine2(String value) {
        this.accountPrimaryAddressLine2 = value;
    }

    /**
     * Gets the value of the accountPrimaryCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountPrimaryCity() {
        return accountPrimaryCity;
    }

    /**
     * Sets the value of the accountPrimaryCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountPrimaryCity(String value) {
        this.accountPrimaryCity = value;
    }

    /**
     * Gets the value of the accountPrimaryCompleteAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountPrimaryCompleteAddress() {
        return accountPrimaryCompleteAddress;
    }

    /**
     * Sets the value of the accountPrimaryCompleteAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountPrimaryCompleteAddress(String value) {
        this.accountPrimaryCompleteAddress = value;
    }

    /**
     * Gets the value of the accountPrimaryCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountPrimaryCountry() {
        return accountPrimaryCountry;
    }

    /**
     * Sets the value of the accountPrimaryCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountPrimaryCountry(String value) {
        this.accountPrimaryCountry = value;
    }

    /**
     * Gets the value of the accountPrimaryServiceAgreementId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountPrimaryServiceAgreementId() {
        return accountPrimaryServiceAgreementId;
    }

    /**
     * Sets the value of the accountPrimaryServiceAgreementId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountPrimaryServiceAgreementId(String value) {
        this.accountPrimaryServiceAgreementId = value;
    }

    /**
     * Gets the value of the accountPrimaryState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountPrimaryState() {
        return accountPrimaryState;
    }

    /**
     * Sets the value of the accountPrimaryState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountPrimaryState(String value) {
        this.accountPrimaryState = value;
    }

    /**
     * Gets the value of the accountPrimaryZip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountPrimaryZip() {
        return accountPrimaryZip;
    }

    /**
     * Sets the value of the accountPrimaryZip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountPrimaryZip(String value) {
        this.accountPrimaryZip = value;
    }

    /**
     * Gets the value of the accountingMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountingMethod() {
        return accountingMethod;
    }

    /**
     * Sets the value of the accountingMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountingMethod(String value) {
        this.accountingMethod = value;
    }

    /**
     * Gets the value of the actionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActionCode() {
        return actionCode;
    }

    /**
     * Sets the value of the actionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActionCode(String value) {
        this.actionCode = value;
    }

    /**
     * Gets the value of the adjustedListPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAdjustedListPrice() {
        return adjustedListPrice;
    }

    /**
     * Sets the value of the adjustedListPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAdjustedListPrice(BigDecimal value) {
        this.adjustedListPrice = value;
    }

    /**
     * Gets the value of the adjustedValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAdjustedValue() {
        return adjustedValue;
    }

    /**
     * Sets the value of the adjustedValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAdjustedValue(BigDecimal value) {
        this.adjustedValue = value;
    }

    /**
     * Gets the value of the assetAge property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAssetAge() {
        return assetAge;
    }

    /**
     * Sets the value of the assetAge property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAssetAge(BigDecimal value) {
        this.assetAge = value;
    }

    /**
     * Gets the value of the assetCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssetCategory() {
        return assetCategory;
    }

    /**
     * Sets the value of the assetCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssetCategory(String value) {
        this.assetCategory = value;
    }

    /**
     * Gets the value of the assetCurrencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssetCurrencyCode() {
        return assetCurrencyCode;
    }

    /**
     * Sets the value of the assetCurrencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssetCurrencyCode(String value) {
        this.assetCurrencyCode = value;
    }

    /**
     * Gets the value of the assetDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssetDescription() {
        return assetDescription;
    }

    /**
     * Sets the value of the assetDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssetDescription(String value) {
        this.assetDescription = value;
    }

    /**
     * Gets the value of the assetId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssetId() {
        return assetId;
    }

    /**
     * Sets the value of the assetId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssetId(String value) {
        this.assetId = value;
    }

    /**
     * Gets the value of the assetLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssetLabel() {
        return assetLabel;
    }

    /**
     * Sets the value of the assetLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssetLabel(String value) {
        this.assetLabel = value;
    }

    /**
     * Gets the value of the assetNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssetNumber() {
        return assetNumber;
    }

    /**
     * Sets the value of the assetNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssetNumber(String value) {
        this.assetNumber = value;
    }

    /**
     * Gets the value of the assetValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAssetValue() {
        return assetValue;
    }

    /**
     * Sets the value of the assetValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAssetValue(BigDecimal value) {
        this.assetValue = value;
    }

    /**
     * Gets the value of the assetValueExchangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAssetValueExchangeDate() {
        return assetValueExchangeDate;
    }

    /**
     * Sets the value of the assetValueExchangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAssetValueExchangeDate(XMLGregorianCalendar value) {
        this.assetValueExchangeDate = value;
    }

    /**
     * Gets the value of the basePrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBasePrice() {
        return basePrice;
    }

    /**
     * Sets the value of the basePrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBasePrice(BigDecimal value) {
        this.basePrice = value;
    }

    /**
     * Gets the value of the billingAccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingAccount() {
        return billingAccount;
    }

    /**
     * Sets the value of the billingAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingAccount(String value) {
        this.billingAccount = value;
    }

    /**
     * Gets the value of the billingAccountId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingAccountId() {
        return billingAccountId;
    }

    /**
     * Sets the value of the billingAccountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingAccountId(String value) {
        this.billingAccountId = value;
    }

    /**
     * Gets the value of the bucketID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBucketID() {
        return bucketID;
    }

    /**
     * Sets the value of the bucketID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBucketID(String value) {
        this.bucketID = value;
    }

    /**
     * Gets the value of the build property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuild() {
        return build;
    }

    /**
     * Sets the value of the build property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuild(String value) {
        this.build = value;
    }

    /**
     * Gets the value of the cdaPagesetId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCDAPagesetId() {
        return cdaPagesetId;
    }

    /**
     * Sets the value of the cdaPagesetId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCDAPagesetId(String value) {
        this.cdaPagesetId = value;
    }

    /**
     * Gets the value of the cfgLatestReleasedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCfgLatestReleasedFlag() {
        return cfgLatestReleasedFlag;
    }

    /**
     * Sets the value of the cfgLatestReleasedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCfgLatestReleasedFlag(String value) {
        this.cfgLatestReleasedFlag = value;
    }

    /**
     * Gets the value of the cfgReleasedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCfgReleasedFlag() {
        return cfgReleasedFlag;
    }

    /**
     * Sets the value of the cfgReleasedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCfgReleasedFlag(Boolean value) {
        this.cfgReleasedFlag = value;
    }

    /**
     * Gets the value of the cfgStateCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCfgStateCode() {
        return cfgStateCode;
    }

    /**
     * Sets the value of the cfgStateCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCfgStateCode(String value) {
        this.cfgStateCode = value;
    }

    /**
     * Gets the value of the cfgType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCfgType() {
        return cfgType;
    }

    /**
     * Sets the value of the cfgType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCfgType(String value) {
        this.cfgType = value;
    }

    /**
     * Gets the value of the cfgVersion property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCfgVersion() {
        return cfgVersion;
    }

    /**
     * Sets the value of the cfgVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCfgVersion(BigDecimal value) {
        this.cfgVersion = value;
    }

    /**
     * Gets the value of the changeinValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getChangeinValue() {
        return changeinValue;
    }

    /**
     * Sets the value of the changeinValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setChangeinValue(BigDecimal value) {
        this.changeinValue = value;
    }

    /**
     * Gets the value of the comments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComments() {
        return comments;
    }

    /**
     * Sets the value of the comments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComments(String value) {
        this.comments = value;
    }

    /**
     * Gets the value of the commitmentCoveredFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCommitmentCoveredFlag() {
        return commitmentCoveredFlag;
    }

    /**
     * Sets the value of the commitmentCoveredFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCommitmentCoveredFlag(Boolean value) {
        this.commitmentCoveredFlag = value;
    }

    /**
     * Gets the value of the compoundProductFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCompoundProductFlag() {
        return compoundProductFlag;
    }

    /**
     * Sets the value of the compoundProductFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCompoundProductFlag(Boolean value) {
        this.compoundProductFlag = value;
    }

    /**
     * Gets the value of the compoundProductNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompoundProductNumber() {
        return compoundProductNumber;
    }

    /**
     * Sets the value of the compoundProductNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompoundProductNumber(String value) {
        this.compoundProductNumber = value;
    }

    /**
     * Gets the value of the condition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCondition() {
        return condition;
    }

    /**
     * Sets the value of the condition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCondition(String value) {
        this.condition = value;
    }

    /**
     * Gets the value of the configurationModelId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfigurationModelId() {
        return configurationModelId;
    }

    /**
     * Sets the value of the configurationModelId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfigurationModelId(String value) {
        this.configurationModelId = value;
    }

    /**
     * Gets the value of the convertToAgreementFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isConvertToAgreementFlag() {
        return convertToAgreementFlag;
    }

    /**
     * Sets the value of the convertToAgreementFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setConvertToAgreementFlag(Boolean value) {
        this.convertToAgreementFlag = value;
    }

    /**
     * Gets the value of the convertToAssetFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isConvertToAssetFlag() {
        return convertToAssetFlag;
    }

    /**
     * Sets the value of the convertToAssetFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setConvertToAssetFlag(Boolean value) {
        this.convertToAssetFlag = value;
    }

    /**
     * Gets the value of the costList property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCostList() {
        return costList;
    }

    /**
     * Sets the value of the costList property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCostList(String value) {
        this.costList = value;
    }

    /**
     * Gets the value of the costListId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCostListId() {
        return costListId;
    }

    /**
     * Sets the value of the costListId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCostListId(String value) {
        this.costListId = value;
    }

    /**
     * Gets the value of the currencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Sets the value of the currencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyCode(String value) {
        this.currencyCode = value;
    }

    /**
     * Gets the value of the customizableFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCustomizableFlag() {
        return customizableFlag;
    }

    /**
     * Sets the value of the customizableFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCustomizableFlag(Boolean value) {
        this.customizableFlag = value;
    }

    /**
     * Gets the value of the daysOnHand property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDaysOnHand() {
        return daysOnHand;
    }

    /**
     * Sets the value of the daysOnHand property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDaysOnHand(BigDecimal value) {
        this.daysOnHand = value;
    }

    /**
     * Gets the value of the discountAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDiscountAmount() {
        return discountAmount;
    }

    /**
     * Sets the value of the discountAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDiscountAmount(BigDecimal value) {
        this.discountAmount = value;
    }

    /**
     * Gets the value of the discountPercent property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDiscountPercent() {
        return discountPercent;
    }

    /**
     * Sets the value of the discountPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDiscountPercent(BigDecimal value) {
        this.discountPercent = value;
    }

    /**
     * Gets the value of the domainName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDomainName() {
        return domainName;
    }

    /**
     * Sets the value of the domainName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDomainName(String value) {
        this.domainName = value;
    }

    /**
     * Gets the value of the dueDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDueDate() {
        return dueDate;
    }

    /**
     * Sets the value of the dueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDueDate(String value) {
        this.dueDate = value;
    }

    /**
     * Gets the value of the effectiveEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEffectiveEndDate() {
        return effectiveEndDate;
    }

    /**
     * Sets the value of the effectiveEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEffectiveEndDate(XMLGregorianCalendar value) {
        this.effectiveEndDate = value;
    }

    /**
     * Gets the value of the eligibilityReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEligibilityReason() {
        return eligibilityReason;
    }

    /**
     * Sets the value of the eligibilityReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEligibilityReason(String value) {
        this.eligibilityReason = value;
    }

    /**
     * Gets the value of the eligibilityStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEligibilityStatus() {
        return eligibilityStatus;
    }

    /**
     * Sets the value of the eligibilityStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEligibilityStatus(String value) {
        this.eligibilityStatus = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDate(XMLGregorianCalendar value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the exchangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExchangeDate() {
        return exchangeDate;
    }

    /**
     * Sets the value of the exchangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExchangeDate(XMLGregorianCalendar value) {
        this.exchangeDate = value;
    }

    /**
     * Gets the value of the excludePricingFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExcludePricingFlag() {
        return excludePricingFlag;
    }

    /**
     * Sets the value of the excludePricingFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExcludePricingFlag(Boolean value) {
        this.excludePricingFlag = value;
    }

    /**
     * Gets the value of the explorerLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExplorerLabel() {
        return explorerLabel;
    }

    /**
     * Sets the value of the explorerLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExplorerLabel(String value) {
        this.explorerLabel = value;
    }

    /**
     * Gets the value of the extendedQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getExtendedQuantity() {
        return extendedQuantity;
    }

    /**
     * Sets the value of the extendedQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setExtendedQuantity(BigDecimal value) {
        this.extendedQuantity = value;
    }

    /**
     * Gets the value of the forcastableFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isForcastableFlag() {
        return forcastableFlag;
    }

    /**
     * Sets the value of the forcastableFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setForcastableFlag(Boolean value) {
        this.forcastableFlag = value;
    }

    /**
     * Gets the value of the hasChildren property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasChildren() {
        return hasChildren;
    }

    /**
     * Sets the value of the hasChildren property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasChildren(Boolean value) {
        this.hasChildren = value;
    }

    /**
     * Gets the value of the hasGenericsFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasGenericsFlag() {
        return hasGenericsFlag;
    }

    /**
     * Sets the value of the hasGenericsFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasGenericsFlag(Boolean value) {
        this.hasGenericsFlag = value;
    }

    /**
     * Gets the value of the householdNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHouseholdNumber() {
        return householdNumber;
    }

    /**
     * Sets the value of the householdNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHouseholdNumber(String value) {
        this.householdNumber = value;
    }

    /**
     * Gets the value of the inclusiveEligibilityFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInclusiveEligibilityFlag() {
        return inclusiveEligibilityFlag;
    }

    /**
     * Sets the value of the inclusiveEligibilityFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInclusiveEligibilityFlag(Boolean value) {
        this.inclusiveEligibilityFlag = value;
    }

    /**
     * Gets the value of the installDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInstallDate() {
        return installDate;
    }

    /**
     * Sets the value of the installDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInstallDate(XMLGregorianCalendar value) {
        this.installDate = value;
    }

    /**
     * Gets the value of the integrationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntegrationId() {
        return integrationId;
    }

    /**
     * Sets the value of the integrationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntegrationId(String value) {
        this.integrationId = value;
    }

    /**
     * Gets the value of the internalAssetFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInternalAssetFlag() {
        return internalAssetFlag;
    }

    /**
     * Sets the value of the internalAssetFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInternalAssetFlag(Boolean value) {
        this.internalAssetFlag = value;
    }

    /**
     * Gets the value of the inventoryLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInventoryLocation() {
        return inventoryLocation;
    }

    /**
     * Sets the value of the inventoryLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInventoryLocation(String value) {
        this.inventoryLocation = value;
    }

    /**
     * Gets the value of the inventoryLocationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInventoryLocationId() {
        return inventoryLocationId;
    }

    /**
     * Sets the value of the inventoryLocationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInventoryLocationId(String value) {
        this.inventoryLocationId = value;
    }

    /**
     * Gets the value of the isExpanded property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsExpanded() {
        return isExpanded;
    }

    /**
     * Sets the value of the isExpanded property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsExpanded(Boolean value) {
        this.isExpanded = value;
    }

    /**
     * Gets the value of the itemType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemType() {
        return itemType;
    }

    /**
     * Sets the value of the itemType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemType(String value) {
        this.itemType = value;
    }

    /**
     * Gets the value of the itemTypeLanguageIndependent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemTypeLanguageIndependent() {
        return itemTypeLanguageIndependent;
    }

    /**
     * Sets the value of the itemTypeLanguageIndependent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemTypeLanguageIndependent(String value) {
        this.itemTypeLanguageIndependent = value;
    }

    /**
     * Gets the value of the license property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLicense() {
        return license;
    }

    /**
     * Sets the value of the license property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLicense(String value) {
        this.license = value;
    }

    /**
     * Gets the value of the licenseNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLicenseNumber() {
        return licenseNumber;
    }

    /**
     * Sets the value of the licenseNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLicenseNumber(String value) {
        this.licenseNumber = value;
    }

    /**
     * Gets the value of the lineNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLineNumber() {
        return lineNumber;
    }

    /**
     * Sets the value of the lineNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLineNumber(BigDecimal value) {
        this.lineNumber = value;
    }

    /**
     * Gets the value of the meterCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMeterCount() {
        return meterCount;
    }

    /**
     * Sets the value of the meterCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMeterCount(BigDecimal value) {
        this.meterCount = value;
    }

    /**
     * Gets the value of the mfgDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMfgDate() {
        return mfgDate;
    }

    /**
     * Sets the value of the mfgDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMfgDate(XMLGregorianCalendar value) {
        this.mfgDate = value;
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
     * Gets the value of the networkElementType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetworkElementType() {
        return networkElementType;
    }

    /**
     * Sets the value of the networkElementType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetworkElementType(String value) {
        this.networkElementType = value;
    }

    /**
     * Gets the value of the node property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNode() {
        return node;
    }

    /**
     * Sets the value of the node property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNode(String value) {
        this.node = value;
    }

    /**
     * Gets the value of the operatingStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperatingStatus() {
        return operatingStatus;
    }

    /**
     * Sets the value of the operatingStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperatingStatus(String value) {
        this.operatingStatus = value;
    }

    /**
     * Gets the value of the options property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOptions() {
        return options;
    }

    /**
     * Sets the value of the options property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOptions(String value) {
        this.options = value;
    }

    /**
     * Gets the value of the orderAccountId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderAccountId() {
        return orderAccountId;
    }

    /**
     * Sets the value of the orderAccountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderAccountId(String value) {
        this.orderAccountId = value;
    }

    /**
     * Gets the value of the orderHeaderId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderHeaderId() {
        return orderHeaderId;
    }

    /**
     * Sets the value of the orderHeaderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderHeaderId(String value) {
        this.orderHeaderId = value;
    }

    /**
     * Gets the value of the orderIntegrationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderIntegrationId() {
        return orderIntegrationId;
    }

    /**
     * Sets the value of the orderIntegrationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderIntegrationId(String value) {
        this.orderIntegrationId = value;
    }

    /**
     * Gets the value of the organization property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganization() {
        return organization;
    }

    /**
     * Sets the value of the organization property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganization(String value) {
        this.organization = value;
    }

    /**
     * Gets the value of the organizationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganizationId() {
        return organizationId;
    }

    /**
     * Sets the value of the organizationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganizationId(String value) {
        this.organizationId = value;
    }

    /**
     * Gets the value of the organizationalUnitAddressId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganizationalUnitAddressId() {
        return organizationalUnitAddressId;
    }

    /**
     * Sets the value of the organizationalUnitAddressId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganizationalUnitAddressId(String value) {
        this.organizationalUnitAddressId = value;
    }

    /**
     * Gets the value of the originalCost property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOriginalCost() {
        return originalCost;
    }

    /**
     * Sets the value of the originalCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOriginalCost(BigDecimal value) {
        this.originalCost = value;
    }

    /**
     * Gets the value of the originalOrderId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginalOrderId() {
        return originalOrderId;
    }

    /**
     * Sets the value of the originalOrderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginalOrderId(String value) {
        this.originalOrderId = value;
    }

    /**
     * Gets the value of the outlineNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutlineNumber() {
        return outlineNumber;
    }

    /**
     * Sets the value of the outlineNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutlineNumber(String value) {
        this.outlineNumber = value;
    }

    /**
     * Gets the value of the owner property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwner() {
        return owner;
    }

    /**
     * Sets the value of the owner property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwner(String value) {
        this.owner = value;
    }

    /**
     * Gets the value of the ownerAccountId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnerAccountId() {
        return ownerAccountId;
    }

    /**
     * Sets the value of the ownerAccountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnerAccountId(String value) {
        this.ownerAccountId = value;
    }

    /**
     * Gets the value of the ownerAssetNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnerAssetNumber() {
        return ownerAssetNumber;
    }

    /**
     * Sets the value of the ownerAssetNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnerAssetNumber(String value) {
        this.ownerAssetNumber = value;
    }

    /**
     * Gets the value of the ownerContactId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnerContactId() {
        return ownerContactId;
    }

    /**
     * Sets the value of the ownerContactId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnerContactId(String value) {
        this.ownerContactId = value;
    }

    /**
     * Gets the value of the ownerFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnerFirstName() {
        return ownerFirstName;
    }

    /**
     * Sets the value of the ownerFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnerFirstName(String value) {
        this.ownerFirstName = value;
    }

    /**
     * Gets the value of the ownerLastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnerLastName() {
        return ownerLastName;
    }

    /**
     * Sets the value of the ownerLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnerLastName(String value) {
        this.ownerLastName = value;
    }

    /**
     * Gets the value of the ownerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnerName() {
        return ownerName;
    }

    /**
     * Sets the value of the ownerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnerName(String value) {
        this.ownerName = value;
    }

    /**
     * Gets the value of the ownership property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnership() {
        return ownership;
    }

    /**
     * Sets the value of the ownership property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnership(String value) {
        this.ownership = value;
    }

    /**
     * Gets the value of the parentAssetId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentAssetId() {
        return parentAssetId;
    }

    /**
     * Sets the value of the parentAssetId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentAssetId(String value) {
        this.parentAssetId = value;
    }

    /**
     * Gets the value of the parentAssetNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentAssetNumber() {
        return parentAssetNumber;
    }

    /**
     * Sets the value of the parentAssetNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentAssetNumber(String value) {
        this.parentAssetNumber = value;
    }

    /**
     * Gets the value of the personalAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonalAddress() {
        return personalAddress;
    }

    /**
     * Sets the value of the personalAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonalAddress(String value) {
        this.personalAddress = value;
    }

    /**
     * Gets the value of the personalAddressId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonalAddressId() {
        return personalAddressId;
    }

    /**
     * Sets the value of the personalAddressId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonalAddressId(String value) {
        this.personalAddressId = value;
    }

    /**
     * Gets the value of the personalCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonalCity() {
        return personalCity;
    }

    /**
     * Sets the value of the personalCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonalCity(String value) {
        this.personalCity = value;
    }

    /**
     * Gets the value of the personalCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonalCountry() {
        return personalCountry;
    }

    /**
     * Sets the value of the personalCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonalCountry(String value) {
        this.personalCountry = value;
    }

    /**
     * Gets the value of the personalState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonalState() {
        return personalState;
    }

    /**
     * Sets the value of the personalState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonalState(String value) {
        this.personalState = value;
    }

    /**
     * Gets the value of the personalZip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonalZip() {
        return personalZip;
    }

    /**
     * Sets the value of the personalZip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonalZip(String value) {
        this.personalZip = value;
    }

    /**
     * Gets the value of the postPickCD property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostPickCD() {
        return postPickCD;
    }

    /**
     * Sets the value of the postPickCD property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostPickCD(String value) {
        this.postPickCD = value;
    }

    /**
     * Gets the value of the prePickCD property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrePickCD() {
        return prePickCD;
    }

    /**
     * Sets the value of the prePickCD property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrePickCD(String value) {
        this.prePickCD = value;
    }

    /**
     * Gets the value of the priceListId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriceListId() {
        return priceListId;
    }

    /**
     * Sets the value of the priceListId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriceListId(String value) {
        this.priceListId = value;
    }

    /**
     * Gets the value of the priceType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriceType() {
        return priceType;
    }

    /**
     * Sets the value of the priceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriceType(String value) {
        this.priceType = value;
    }

    /**
     * Gets the value of the primaryContactAccountId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryContactAccountId() {
        return primaryContactAccountId;
    }

    /**
     * Sets the value of the primaryContactAccountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryContactAccountId(String value) {
        this.primaryContactAccountId = value;
    }

    /**
     * Gets the value of the primaryContactId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryContactId() {
        return primaryContactId;
    }

    /**
     * Sets the value of the primaryContactId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryContactId(String value) {
        this.primaryContactId = value;
    }

    /**
     * Gets the value of the primaryEmployeeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryEmployeeId() {
        return primaryEmployeeId;
    }

    /**
     * Sets the value of the primaryEmployeeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryEmployeeId(String value) {
        this.primaryEmployeeId = value;
    }

    /**
     * Gets the value of the primaryWarrantyCoverageId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryWarrantyCoverageId() {
        return primaryWarrantyCoverageId;
    }

    /**
     * Sets the value of the primaryWarrantyCoverageId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryWarrantyCoverageId(String value) {
        this.primaryWarrantyCoverageId = value;
    }

    /**
     * Gets the value of the primaryWarrantyEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPrimaryWarrantyEndDate() {
        return primaryWarrantyEndDate;
    }

    /**
     * Sets the value of the primaryWarrantyEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPrimaryWarrantyEndDate(XMLGregorianCalendar value) {
        this.primaryWarrantyEndDate = value;
    }

    /**
     * Gets the value of the primaryWarrantyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryWarrantyName() {
        return primaryWarrantyName;
    }

    /**
     * Sets the value of the primaryWarrantyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryWarrantyName(String value) {
        this.primaryWarrantyName = value;
    }

    /**
     * Gets the value of the primaryWarrantyStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPrimaryWarrantyStartDate() {
        return primaryWarrantyStartDate;
    }

    /**
     * Sets the value of the primaryWarrantyStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPrimaryWarrantyStartDate(XMLGregorianCalendar value) {
        this.primaryWarrantyStartDate = value;
    }

    /**
     * Gets the value of the primaryWarrantyType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryWarrantyType() {
        return primaryWarrantyType;
    }

    /**
     * Sets the value of the primaryWarrantyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryWarrantyType(String value) {
        this.primaryWarrantyType = value;
    }

    /**
     * Gets the value of the primaryWarranyId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryWarranyId() {
        return primaryWarranyId;
    }

    /**
     * Sets the value of the primaryWarranyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryWarranyId(String value) {
        this.primaryWarranyId = value;
    }

    /**
     * Gets the value of the prodItemId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProdItemId() {
        return prodItemId;
    }

    /**
     * Sets the value of the prodItemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProdItemId(String value) {
        this.prodItemId = value;
    }

    /**
     * Gets the value of the prodPromId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProdPromId() {
        return prodPromId;
    }

    /**
     * Sets the value of the prodPromId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProdPromId(String value) {
        this.prodPromId = value;
    }

    /**
     * Gets the value of the prodPromInstanceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProdPromInstanceId() {
        return prodPromInstanceId;
    }

    /**
     * Sets the value of the prodPromInstanceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProdPromInstanceId(String value) {
        this.prodPromInstanceId = value;
    }

    /**
     * Gets the value of the prodPromName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProdPromName() {
        return prodPromName;
    }

    /**
     * Sets the value of the prodPromName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProdPromName(String value) {
        this.prodPromName = value;
    }

    /**
     * Gets the value of the prodPromRuleId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProdPromRuleId() {
        return prodPromRuleId;
    }

    /**
     * Sets the value of the prodPromRuleId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProdPromRuleId(String value) {
        this.prodPromRuleId = value;
    }

    /**
     * Gets the value of the prodPromSourceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProdPromSourceId() {
        return prodPromSourceId;
    }

    /**
     * Sets the value of the prodPromSourceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProdPromSourceId(String value) {
        this.prodPromSourceId = value;
    }

    /**
     * Gets the value of the productBuild property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductBuild() {
        return productBuild;
    }

    /**
     * Sets the value of the productBuild property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductBuild(String value) {
        this.productBuild = value;
    }

    /**
     * Gets the value of the productDefTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductDefTypeCode() {
        return productDefTypeCode;
    }

    /**
     * Sets the value of the productDefTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductDefTypeCode(String value) {
        this.productDefTypeCode = value;
    }

    /**
     * Gets the value of the productDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductDescription() {
        return productDescription;
    }

    /**
     * Sets the value of the productDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductDescription(String value) {
        this.productDescription = value;
    }

    /**
     * Gets the value of the productEffectiveFrom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getProductEffectiveFrom() {
        return productEffectiveFrom;
    }

    /**
     * Sets the value of the productEffectiveFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setProductEffectiveFrom(XMLGregorianCalendar value) {
        this.productEffectiveFrom = value;
    }

    /**
     * Gets the value of the productEffectiveTo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getProductEffectiveTo() {
        return productEffectiveTo;
    }

    /**
     * Sets the value of the productEffectiveTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setProductEffectiveTo(XMLGregorianCalendar value) {
        this.productEffectiveTo = value;
    }

    /**
     * Gets the value of the productId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductId() {
        return productId;
    }

    /**
     * Sets the value of the productId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductId(String value) {
        this.productId = value;
    }

    /**
     * Gets the value of the productInventoryId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductInventoryId() {
        return productInventoryId;
    }

    /**
     * Sets the value of the productInventoryId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductInventoryId(String value) {
        this.productInventoryId = value;
    }

    /**
     * Gets the value of the productName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductName() {
        return productName;
    }

    /**
     * Sets the value of the productName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductName(String value) {
        this.productName = value;
    }

    /**
     * Gets the value of the productPartNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductPartNumber() {
        return productPartNumber;
    }

    /**
     * Sets the value of the productPartNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductPartNumber(String value) {
        this.productPartNumber = value;
    }

    /**
     * Gets the value of the productPortId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductPortId() {
        return productPortId;
    }

    /**
     * Sets the value of the productPortId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductPortId(String value) {
        this.productPortId = value;
    }

    /**
     * Gets the value of the productPrimaryProductLine property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductPrimaryProductLine() {
        return productPrimaryProductLine;
    }

    /**
     * Sets the value of the productPrimaryProductLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductPrimaryProductLine(String value) {
        this.productPrimaryProductLine = value;
    }

    /**
     * Gets the value of the productPrimaryProductLineId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductPrimaryProductLineId() {
        return productPrimaryProductLineId;
    }

    /**
     * Sets the value of the productPrimaryProductLineId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductPrimaryProductLineId(String value) {
        this.productPrimaryProductLineId = value;
    }

    /**
     * Gets the value of the productSerializedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isProductSerializedFlag() {
        return productSerializedFlag;
    }

    /**
     * Sets the value of the productSerializedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setProductSerializedFlag(Boolean value) {
        this.productSerializedFlag = value;
    }

    /**
     * Gets the value of the productType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductType() {
        return productType;
    }

    /**
     * Sets the value of the productType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductType(String value) {
        this.productType = value;
    }

    /**
     * Gets the value of the productVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductVersion() {
        return productVersion;
    }

    /**
     * Sets the value of the productVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductVersion(String value) {
        this.productVersion = value;
    }

    /**
     * Gets the value of the productXAClassId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductXAClassId() {
        return productXAClassId;
    }

    /**
     * Sets the value of the productXAClassId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductXAClassId(String value) {
        this.productXAClassId = value;
    }

    /**
     * Gets the value of the purchaseDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPurchaseDate() {
        return purchaseDate;
    }

    /**
     * Sets the value of the purchaseDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPurchaseDate(XMLGregorianCalendar value) {
        this.purchaseDate = value;
    }

    /**
     * Gets the value of the purchaseLocationDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurchaseLocationDescription() {
        return purchaseLocationDescription;
    }

    /**
     * Sets the value of the purchaseLocationDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurchaseLocationDescription(String value) {
        this.purchaseLocationDescription = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setQuantity(Integer value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the quoteId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuoteId() {
        return quoteId;
    }

    /**
     * Sets the value of the quoteId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuoteId(String value) {
        this.quoteId = value;
    }

    /**
     * Gets the value of the quoteIntegrationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuoteIntegrationId() {
        return quoteIntegrationId;
    }

    /**
     * Sets the value of the quoteIntegrationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuoteIntegrationId(String value) {
        this.quoteIntegrationId = value;
    }

    /**
     * Gets the value of the referenceFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReferenceFlag() {
        return referenceFlag;
    }

    /**
     * Sets the value of the referenceFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReferenceFlag(Boolean value) {
        this.referenceFlag = value;
    }

    /**
     * Gets the value of the referenceNumber2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceNumber2() {
        return referenceNumber2;
    }

    /**
     * Sets the value of the referenceNumber2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceNumber2(String value) {
        this.referenceNumber2 = value;
    }

    /**
     * Gets the value of the referenceNumber3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceNumber3() {
        return referenceNumber3;
    }

    /**
     * Sets the value of the referenceNumber3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceNumber3(String value) {
        this.referenceNumber3 = value;
    }

    /**
     * Gets the value of the registeredDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRegisteredDate() {
        return registeredDate;
    }

    /**
     * Sets the value of the registeredDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRegisteredDate(XMLGregorianCalendar value) {
        this.registeredDate = value;
    }

    /**
     * Gets the value of the replacementValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getReplacementValue() {
        return replacementValue;
    }

    /**
     * Sets the value of the replacementValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setReplacementValue(BigDecimal value) {
        this.replacementValue = value;
    }

    /**
     * Gets the value of the rootAssetId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRootAssetId() {
        return rootAssetId;
    }

    /**
     * Sets the value of the rootAssetId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRootAssetId(String value) {
        this.rootAssetId = value;
    }

    /**
     * Gets the value of the rootAssetNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRootAssetNumber() {
        return rootAssetNumber;
    }

    /**
     * Sets the value of the rootAssetNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRootAssetNumber(String value) {
        this.rootAssetNumber = value;
    }

    /**
     * Gets the value of the rootCfgLatestReleasedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRootCfgLatestReleasedFlag() {
        return rootCfgLatestReleasedFlag;
    }

    /**
     * Sets the value of the rootCfgLatestReleasedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRootCfgLatestReleasedFlag(String value) {
        this.rootCfgLatestReleasedFlag = value;
    }

    /**
     * Gets the value of the rootCfgType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRootCfgType() {
        return rootCfgType;
    }

    /**
     * Sets the value of the rootCfgType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRootCfgType(String value) {
        this.rootCfgType = value;
    }

    /**
     * Gets the value of the rootIntegrationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRootIntegrationId() {
        return rootIntegrationId;
    }

    /**
     * Sets the value of the rootIntegrationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRootIntegrationId(String value) {
        this.rootIntegrationId = value;
    }

    /**
     * Gets the value of the rootProductDefTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRootProductDefTypeCode() {
        return rootProductDefTypeCode;
    }

    /**
     * Sets the value of the rootProductDefTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRootProductDefTypeCode(String value) {
        this.rootProductDefTypeCode = value;
    }

    /**
     * Gets the value of the rootProductId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRootProductId() {
        return rootProductId;
    }

    /**
     * Sets the value of the rootProductId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRootProductId(String value) {
        this.rootProductId = value;
    }

    /**
     * Gets the value of the scenarioTestFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isScenarioTestFlag() {
        return scenarioTestFlag;
    }

    /**
     * Sets the value of the scenarioTestFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setScenarioTestFlag(Boolean value) {
        this.scenarioTestFlag = value;
    }

    /**
     * Gets the value of the serialNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerialNumber() {
        return serialNumber;
    }

    /**
     * Sets the value of the serialNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerialNumber(String value) {
        this.serialNumber = value;
    }

    /**
     * Gets the value of the serialNumberVerifiedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSerialNumberVerifiedFlag() {
        return serialNumberVerifiedFlag;
    }

    /**
     * Sets the value of the serialNumberVerifiedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSerialNumberVerifiedFlag(Boolean value) {
        this.serialNumberVerifiedFlag = value;
    }

    /**
     * Gets the value of the serviceAccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceAccount() {
        return serviceAccount;
    }

    /**
     * Sets the value of the serviceAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceAccount(String value) {
        this.serviceAccount = value;
    }

    /**
     * Gets the value of the serviceAccountId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceAccountId() {
        return serviceAccountId;
    }

    /**
     * Sets the value of the serviceAccountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceAccountId(String value) {
        this.serviceAccountId = value;
    }

    /**
     * Gets the value of the shipDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getShipDate() {
        return shipDate;
    }

    /**
     * Sets the value of the shipDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setShipDate(XMLGregorianCalendar value) {
        this.shipDate = value;
    }

    /**
     * Gets the value of the smartPartNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSmartPartNumber() {
        return smartPartNumber;
    }

    /**
     * Sets the value of the smartPartNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSmartPartNumber(String value) {
        this.smartPartNumber = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDate(XMLGregorianCalendar value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the toNode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToNode() {
        return toNode;
    }

    /**
     * Sets the value of the toNode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToNode(String value) {
        this.toNode = value;
    }

    /**
     * Gets the value of the toServiceAccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToServiceAccount() {
        return toServiceAccount;
    }

    /**
     * Sets the value of the toServiceAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToServiceAccount(String value) {
        this.toServiceAccount = value;
    }

    /**
     * Gets the value of the toServiceAccountId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToServiceAccountId() {
        return toServiceAccountId;
    }

    /**
     * Sets the value of the toServiceAccountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToServiceAccountId(String value) {
        this.toServiceAccountId = value;
    }

    /**
     * Gets the value of the toolFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isToolFlag() {
        return toolFlag;
    }

    /**
     * Sets the value of the toolFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setToolFlag(Boolean value) {
        this.toolFlag = value;
    }

    /**
     * Gets the value of the unitPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    /**
     * Sets the value of the unitPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUnitPrice(BigDecimal value) {
        this.unitPrice = value;
    }

    /**
     * Gets the value of the unitofMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitofMeasure() {
        return unitofMeasure;
    }

    /**
     * Sets the value of the unitofMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitofMeasure(String value) {
        this.unitofMeasure = value;
    }

    /**
     * Gets the value of the vodRowId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVODRowId() {
        return vodRowId;
    }

    /**
     * Sets the value of the vodRowId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVODRowId(String value) {
        this.vodRowId = value;
    }

    /**
     * Gets the value of the validationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValidationDate() {
        return validationDate;
    }

    /**
     * Sets the value of the validationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setValidationDate(XMLGregorianCalendar value) {
        this.validationDate = value;
    }

    /**
     * Gets the value of the validationStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidationStatus() {
        return validationStatus;
    }

    /**
     * Sets the value of the validationStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidationStatus(String value) {
        this.validationStatus = value;
    }

    /**
     * Gets the value of the valueBasis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValueBasis() {
        return valueBasis;
    }

    /**
     * Sets the value of the valueBasis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValueBasis(String value) {
        this.valueBasis = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Gets the value of the warrantyEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getWarrantyEndDate() {
        return warrantyEndDate;
    }

    /**
     * Sets the value of the warrantyEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setWarrantyEndDate(XMLGregorianCalendar value) {
        this.warrantyEndDate = value;
    }

    /**
     * Gets the value of the warrantyStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getWarrantyStartDate() {
        return warrantyStartDate;
    }

    /**
     * Sets the value of the warrantyStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setWarrantyStartDate(XMLGregorianCalendar value) {
        this.warrantyStartDate = value;
    }

    /**
     * Gets the value of the warrantyType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWarrantyType() {
        return warrantyType;
    }

    /**
     * Sets the value of the warrantyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWarrantyType(String value) {
        this.warrantyType = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the billingProfileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingProfileName() {
        return billingProfileName;
    }

    /**
     * Sets the value of the billingProfileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingProfileName(String value) {
        this.billingProfileName = value;
    }

    /**
     * Gets the value of the billingProfileId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingProfileId() {
        return billingProfileId;
    }

    /**
     * Sets the value of the billingProfileId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingProfileId(String value) {
        this.billingProfileId = value;
    }

    /**
     * Gets the value of the assetMgmtAsset property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the assetMgmtAsset property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssetMgmtAsset().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AssetMgmtAssetData }
     * 
     * 
     */
    public List<AssetMgmtAssetData> getAssetMgmtAsset() {
        if (assetMgmtAsset == null) {
            assetMgmtAsset = new ArrayList<AssetMgmtAssetData>();
        }
        return this.assetMgmtAsset;
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
