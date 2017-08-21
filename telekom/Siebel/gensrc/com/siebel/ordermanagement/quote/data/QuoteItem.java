
package com.siebel.ordermanagement.quote.data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QuoteItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QuoteItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ServiceLength" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ServiceLengthUoM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VolumeUpsellMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VolumeUpsellItemId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VolumeDiscountItemId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VolumeDiscountId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UsageAssetProductId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UnitofMeasure" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TaxAmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShipToState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShipToPostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShipToCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShipToContactWorkPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShipToContactId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShipToContactHomePhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShipToContactFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShipToContactEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShipToCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BusinessShipToAddressId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BusinessShipToZip" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BusinessShipToState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BusinessShipToCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BusinessShipToCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BusinessShipToAddress2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ServicePricePercent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ServicePriceMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ServiceAccountId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SalesServiceFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RootQuoteItemId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RootAssetIntegrationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RequestedDeliveryDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProductXAClassId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProductTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProductStructureType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProdPromSourceId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProdPromRuleId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProdPromInstanceId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProdPromId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProdItemId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PricingAdjustmentAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PriceType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PortItemId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonalShipToZip" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonalShipToState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonalShipToCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonalShipToCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonalShipToAddress2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NetPrice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NRCCxTotal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MinPrice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MaxPrice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MRCCxTotal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LineNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ItemPriceListId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsPromEligible" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IntegrationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QuoteId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HeaderDiscountAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FreightAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ForcastableFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExtendedQuantityRequested" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExcludePricingFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExchangeDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EligibilityStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EligibilityReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Discount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CurrentPrice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CoveredProductNetPrice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CoveredProductId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CoveredAssetProductId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Cost" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ContactWorkPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ContactId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ContactHomePhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ContactFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ContactEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ClassId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CfgType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CfgStateCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AssetIntegrationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ActionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AccountId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CoveredQuoteItemId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShipToAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ServiceAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CarrierPriority" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CarrierCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FreightTerms" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShipToContactLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ContactLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Created" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ConfigurationModelId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ConflictId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsPrePickCartItem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RootProductId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ModId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RootBundleFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Updated" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VolumeDiscountItem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VolumeUpsellItem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SequenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProductLineId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProdPromName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PriceListId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrePickCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PostPickCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ParentQuoteItemId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NeedRefreshBasePrice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InclusiveEligibilityFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HasGenerics" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EffectiveFrom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EffectiveTo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UnitPrice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShipToAccountId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BusinessShipToAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SmartPartNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RollupItemPrice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RollupAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PricingComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProductId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonalShipToAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonalShipToAddressId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrigListPrice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ListPrice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DiscountSource" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DiscountPercent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DiscountAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ListOfQuoteItemXA" type="{http://siebel.com/OrderManagement/Quote/Data}ListOfQuoteItemXA" minOccurs="0"/>
 *         &lt;element name="BillingAccountId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BillingAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BillingAccountAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BillingAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BillingAccountLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BillingProfileId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BillingProfileName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BillingAccountAddress2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BillingAccountAddressId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BillingAccountCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BillingAccountContactId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BillingAccountCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BillingAccountState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BillingAccountZip" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BillingContactEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BillingContactFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BillingContactLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BillingContactWorkPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DonatingServiceProvider" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EndingPhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LegacyAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NumberPortabilityAgencyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NumberToPort" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PIN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RequestedPortingDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ServicePostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StartingPhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ServiceId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QuoteItem" type="{http://siebel.com/OrderManagement/Quote/Data}QuoteItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="searchspec" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="operation" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QuoteItem", propOrder = {
    "serviceLength",
    "serviceLengthUoM",
    "volumeUpsellMessage",
    "volumeUpsellItemId",
    "volumeDiscountItemId",
    "volumeDiscountId",
    "usageAssetProductId",
    "unitofMeasure",
    "taxAmt",
    "shipToState",
    "shipToPostalCode",
    "shipToCountry",
    "shipToContactWorkPhone",
    "shipToContactId",
    "shipToContactHomePhone",
    "shipToContactFirstName",
    "shipToContactEmail",
    "shipToCity",
    "businessShipToAddressId",
    "businessShipToZip",
    "businessShipToState",
    "businessShipToCountry",
    "businessShipToCity",
    "businessShipToAddress2",
    "servicePricePercent",
    "servicePriceMethod",
    "serviceAccountId",
    "salesServiceFlag",
    "rootQuoteItemId",
    "rootAssetIntegrationId",
    "requestedDeliveryDate",
    "productXAClassId",
    "productTypeCode",
    "productStructureType",
    "prodPromSourceId",
    "prodPromRuleId",
    "prodPromInstanceId",
    "prodPromId",
    "prodItemId",
    "pricingAdjustmentAmount",
    "priceType",
    "portItemId",
    "personalShipToZip",
    "personalShipToState",
    "personalShipToCountry",
    "personalShipToCity",
    "personalShipToAddress2",
    "netPrice",
    "nrcCxTotal",
    "minPrice",
    "maxPrice",
    "mrcCxTotal",
    "lineNumber",
    "itemPriceListId",
    "isPromEligible",
    "integrationId",
    "quoteId",
    "headerDiscountAmount",
    "freightAmount",
    "forcastableFlag",
    "extendedQuantityRequested",
    "excludePricingFlag",
    "exchangeDate",
    "eligibilityStatus",
    "eligibilityReason",
    "discount",
    "description",
    "currentPrice",
    "currencyCode",
    "coveredProductNetPrice",
    "coveredProductId",
    "coveredAssetProductId",
    "cost",
    "contactWorkPhone",
    "contactId",
    "contactHomePhone",
    "contactFirstName",
    "contactEmail",
    "classId",
    "cfgType",
    "cfgStateCode",
    "assetIntegrationId",
    "actionCode",
    "accountId",
    "coveredQuoteItemId",
    "shipToAccount",
    "serviceAccount",
    "carrierPriority",
    "carrierCode",
    "freightTerms",
    "shipToContactLastName",
    "contactLastName",
    "created",
    "configurationModelId",
    "conflictId",
    "isPrePickCartItem",
    "rootProductId",
    "modId",
    "rootBundleFlag",
    "updated",
    "volumeDiscountItem",
    "volumeUpsellItem",
    "sequenceNumber",
    "productLineId",
    "prodPromName",
    "priceListId",
    "prePickCD",
    "postPickCD",
    "parentQuoteItemId",
    "needRefreshBasePrice",
    "inclusiveEligibilityFlag",
    "id",
    "hasGenerics",
    "effectiveFrom",
    "effectiveTo",
    "unitPrice",
    "shipToAccountId",
    "businessShipToAddress",
    "smartPartNumber",
    "rollupItemPrice",
    "rollupAmount",
    "quantity",
    "pricingComments",
    "productId",
    "personalShipToAddress",
    "personalShipToAddressId",
    "origListPrice",
    "name",
    "listPrice",
    "discountSource",
    "discountPercent",
    "discountAmount",
    "listOfQuoteItemXA",
    "billingAccountId",
    "billingAccount",
    "billingAccountAddress",
    "billingAccountNumber",
    "billingAccountLocation",
    "billingProfileId",
    "billingProfileName",
    "billingAccountAddress2",
    "billingAccountAddressId",
    "billingAccountCity",
    "billingAccountContactId",
    "billingAccountCountry",
    "billingAccountState",
    "billingAccountZip",
    "billingContactEmail",
    "billingContactFirstName",
    "billingContactLastName",
    "billingContactWorkPhone",
    "donatingServiceProvider",
    "endingPhoneNumber",
    "legacyAccountNumber",
    "numberPortabilityAgencyName",
    "numberToPort",
    "pin",
    "requestedPortingDate",
    "servicePostalCode",
    "startingPhoneNumber",
    "serviceId",
    "quoteItem"
})
public class QuoteItem
    implements Serializable
{

    @XmlElement(name = "ServiceLength")
    protected String serviceLength;
    @XmlElement(name = "ServiceLengthUoM")
    protected String serviceLengthUoM;
    @XmlElement(name = "VolumeUpsellMessage")
    protected String volumeUpsellMessage;
    @XmlElement(name = "VolumeUpsellItemId")
    protected String volumeUpsellItemId;
    @XmlElement(name = "VolumeDiscountItemId")
    protected String volumeDiscountItemId;
    @XmlElement(name = "VolumeDiscountId")
    protected String volumeDiscountId;
    @XmlElement(name = "UsageAssetProductId")
    protected String usageAssetProductId;
    @XmlElement(name = "UnitofMeasure")
    protected String unitofMeasure;
    @XmlElement(name = "TaxAmt")
    protected String taxAmt;
    @XmlElement(name = "ShipToState")
    protected String shipToState;
    @XmlElement(name = "ShipToPostalCode")
    protected String shipToPostalCode;
    @XmlElement(name = "ShipToCountry")
    protected String shipToCountry;
    @XmlElement(name = "ShipToContactWorkPhone")
    protected String shipToContactWorkPhone;
    @XmlElement(name = "ShipToContactId")
    protected String shipToContactId;
    @XmlElement(name = "ShipToContactHomePhone")
    protected String shipToContactHomePhone;
    @XmlElement(name = "ShipToContactFirstName")
    protected String shipToContactFirstName;
    @XmlElement(name = "ShipToContactEmail")
    protected String shipToContactEmail;
    @XmlElement(name = "ShipToCity")
    protected String shipToCity;
    @XmlElement(name = "BusinessShipToAddressId")
    protected String businessShipToAddressId;
    @XmlElement(name = "BusinessShipToZip")
    protected String businessShipToZip;
    @XmlElement(name = "BusinessShipToState")
    protected String businessShipToState;
    @XmlElement(name = "BusinessShipToCountry")
    protected String businessShipToCountry;
    @XmlElement(name = "BusinessShipToCity")
    protected String businessShipToCity;
    @XmlElement(name = "BusinessShipToAddress2")
    protected String businessShipToAddress2;
    @XmlElement(name = "ServicePricePercent")
    protected String servicePricePercent;
    @XmlElement(name = "ServicePriceMethod")
    protected String servicePriceMethod;
    @XmlElement(name = "ServiceAccountId")
    protected String serviceAccountId;
    @XmlElement(name = "SalesServiceFlag")
    protected String salesServiceFlag;
    @XmlElement(name = "RootQuoteItemId")
    protected String rootQuoteItemId;
    @XmlElement(name = "RootAssetIntegrationId")
    protected String rootAssetIntegrationId;
    @XmlElement(name = "RequestedDeliveryDate")
    protected String requestedDeliveryDate;
    @XmlElement(name = "ProductXAClassId")
    protected String productXAClassId;
    @XmlElement(name = "ProductTypeCode")
    protected String productTypeCode;
    @XmlElement(name = "ProductStructureType")
    protected String productStructureType;
    @XmlElement(name = "ProdPromSourceId")
    protected String prodPromSourceId;
    @XmlElement(name = "ProdPromRuleId")
    protected String prodPromRuleId;
    @XmlElement(name = "ProdPromInstanceId")
    protected String prodPromInstanceId;
    @XmlElement(name = "ProdPromId")
    protected String prodPromId;
    @XmlElement(name = "ProdItemId")
    protected String prodItemId;
    @XmlElement(name = "PricingAdjustmentAmount")
    protected String pricingAdjustmentAmount;
    @XmlElement(name = "PriceType")
    protected String priceType;
    @XmlElement(name = "PortItemId")
    protected String portItemId;
    @XmlElement(name = "PersonalShipToZip")
    protected String personalShipToZip;
    @XmlElement(name = "PersonalShipToState")
    protected String personalShipToState;
    @XmlElement(name = "PersonalShipToCountry")
    protected String personalShipToCountry;
    @XmlElement(name = "PersonalShipToCity")
    protected String personalShipToCity;
    @XmlElement(name = "PersonalShipToAddress2")
    protected String personalShipToAddress2;
    @XmlElement(name = "NetPrice")
    protected String netPrice;
    @XmlElement(name = "NRCCxTotal")
    protected String nrcCxTotal;
    @XmlElement(name = "MinPrice")
    protected String minPrice;
    @XmlElement(name = "MaxPrice")
    protected String maxPrice;
    @XmlElement(name = "MRCCxTotal")
    protected String mrcCxTotal;
    @XmlElement(name = "LineNumber")
    protected String lineNumber;
    @XmlElement(name = "ItemPriceListId")
    protected String itemPriceListId;
    @XmlElement(name = "IsPromEligible")
    protected String isPromEligible;
    @XmlElement(name = "IntegrationId")
    protected String integrationId;
    @XmlElement(name = "QuoteId")
    protected String quoteId;
    @XmlElement(name = "HeaderDiscountAmount")
    protected String headerDiscountAmount;
    @XmlElement(name = "FreightAmount")
    protected String freightAmount;
    @XmlElement(name = "ForcastableFlag")
    protected String forcastableFlag;
    @XmlElement(name = "ExtendedQuantityRequested")
    protected String extendedQuantityRequested;
    @XmlElement(name = "ExcludePricingFlag")
    protected String excludePricingFlag;
    @XmlElement(name = "ExchangeDate")
    protected String exchangeDate;
    @XmlElement(name = "EligibilityStatus")
    protected String eligibilityStatus;
    @XmlElement(name = "EligibilityReason")
    protected String eligibilityReason;
    @XmlElement(name = "Discount")
    protected String discount;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "CurrentPrice")
    protected String currentPrice;
    @XmlElement(name = "CurrencyCode")
    protected String currencyCode;
    @XmlElement(name = "CoveredProductNetPrice")
    protected String coveredProductNetPrice;
    @XmlElement(name = "CoveredProductId")
    protected String coveredProductId;
    @XmlElement(name = "CoveredAssetProductId")
    protected String coveredAssetProductId;
    @XmlElement(name = "Cost")
    protected String cost;
    @XmlElement(name = "ContactWorkPhone")
    protected String contactWorkPhone;
    @XmlElement(name = "ContactId")
    protected String contactId;
    @XmlElement(name = "ContactHomePhone")
    protected String contactHomePhone;
    @XmlElement(name = "ContactFirstName")
    protected String contactFirstName;
    @XmlElement(name = "ContactEmail")
    protected String contactEmail;
    @XmlElement(name = "ClassId")
    protected String classId;
    @XmlElement(name = "CfgType")
    protected String cfgType;
    @XmlElement(name = "CfgStateCode")
    protected String cfgStateCode;
    @XmlElement(name = "AssetIntegrationId")
    protected String assetIntegrationId;
    @XmlElement(name = "ActionCode")
    protected String actionCode;
    @XmlElement(name = "AccountId")
    protected String accountId;
    @XmlElement(name = "CoveredQuoteItemId")
    protected String coveredQuoteItemId;
    @XmlElement(name = "ShipToAccount")
    protected String shipToAccount;
    @XmlElement(name = "ServiceAccount")
    protected String serviceAccount;
    @XmlElement(name = "CarrierPriority")
    protected String carrierPriority;
    @XmlElement(name = "CarrierCode")
    protected String carrierCode;
    @XmlElement(name = "FreightTerms")
    protected String freightTerms;
    @XmlElement(name = "ShipToContactLastName")
    protected String shipToContactLastName;
    @XmlElement(name = "ContactLastName")
    protected String contactLastName;
    @XmlElement(name = "Created")
    protected String created;
    @XmlElement(name = "ConfigurationModelId")
    protected String configurationModelId;
    @XmlElement(name = "ConflictId")
    protected String conflictId;
    @XmlElement(name = "IsPrePickCartItem")
    protected String isPrePickCartItem;
    @XmlElement(name = "RootProductId")
    protected String rootProductId;
    @XmlElement(name = "ModId")
    protected String modId;
    @XmlElement(name = "RootBundleFlag")
    protected String rootBundleFlag;
    @XmlElement(name = "Updated")
    protected String updated;
    @XmlElement(name = "VolumeDiscountItem")
    protected String volumeDiscountItem;
    @XmlElement(name = "VolumeUpsellItem")
    protected String volumeUpsellItem;
    @XmlElement(name = "SequenceNumber")
    protected String sequenceNumber;
    @XmlElement(name = "ProductLineId")
    protected String productLineId;
    @XmlElement(name = "ProdPromName")
    protected String prodPromName;
    @XmlElement(name = "PriceListId")
    protected String priceListId;
    @XmlElement(name = "PrePickCD")
    protected String prePickCD;
    @XmlElement(name = "PostPickCD")
    protected String postPickCD;
    @XmlElement(name = "ParentQuoteItemId")
    protected String parentQuoteItemId;
    @XmlElement(name = "NeedRefreshBasePrice")
    protected String needRefreshBasePrice;
    @XmlElement(name = "InclusiveEligibilityFlag")
    protected String inclusiveEligibilityFlag;
    @XmlElement(name = "Id")
    protected String id;
    @XmlElement(name = "HasGenerics")
    protected String hasGenerics;
    @XmlElement(name = "EffectiveFrom")
    protected String effectiveFrom;
    @XmlElement(name = "EffectiveTo")
    protected String effectiveTo;
    @XmlElement(name = "UnitPrice")
    protected String unitPrice;
    @XmlElement(name = "ShipToAccountId")
    protected String shipToAccountId;
    @XmlElement(name = "BusinessShipToAddress")
    protected String businessShipToAddress;
    @XmlElement(name = "SmartPartNumber")
    protected String smartPartNumber;
    @XmlElement(name = "RollupItemPrice")
    protected String rollupItemPrice;
    @XmlElement(name = "RollupAmount")
    protected String rollupAmount;
    @XmlElement(name = "Quantity")
    protected String quantity;
    @XmlElement(name = "PricingComments")
    protected String pricingComments;
    @XmlElement(name = "ProductId")
    protected String productId;
    @XmlElement(name = "PersonalShipToAddress")
    protected String personalShipToAddress;
    @XmlElement(name = "PersonalShipToAddressId")
    protected String personalShipToAddressId;
    @XmlElement(name = "OrigListPrice")
    protected String origListPrice;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "ListPrice")
    protected String listPrice;
    @XmlElement(name = "DiscountSource")
    protected String discountSource;
    @XmlElement(name = "DiscountPercent")
    protected String discountPercent;
    @XmlElement(name = "DiscountAmount")
    protected String discountAmount;
    @XmlElement(name = "ListOfQuoteItemXA")
    protected ListOfQuoteItemXA listOfQuoteItemXA;
    @XmlElement(name = "BillingAccountId")
    protected String billingAccountId;
    @XmlElement(name = "BillingAccount")
    protected String billingAccount;
    @XmlElement(name = "BillingAccountAddress")
    protected String billingAccountAddress;
    @XmlElement(name = "BillingAccountNumber")
    protected String billingAccountNumber;
    @XmlElement(name = "BillingAccountLocation")
    protected String billingAccountLocation;
    @XmlElement(name = "BillingProfileId")
    protected String billingProfileId;
    @XmlElement(name = "BillingProfileName")
    protected String billingProfileName;
    @XmlElement(name = "BillingAccountAddress2")
    protected String billingAccountAddress2;
    @XmlElement(name = "BillingAccountAddressId")
    protected String billingAccountAddressId;
    @XmlElement(name = "BillingAccountCity")
    protected String billingAccountCity;
    @XmlElement(name = "BillingAccountContactId")
    protected String billingAccountContactId;
    @XmlElement(name = "BillingAccountCountry")
    protected String billingAccountCountry;
    @XmlElement(name = "BillingAccountState")
    protected String billingAccountState;
    @XmlElement(name = "BillingAccountZip")
    protected String billingAccountZip;
    @XmlElement(name = "BillingContactEmail")
    protected String billingContactEmail;
    @XmlElement(name = "BillingContactFirstName")
    protected String billingContactFirstName;
    @XmlElement(name = "BillingContactLastName")
    protected String billingContactLastName;
    @XmlElement(name = "BillingContactWorkPhone")
    protected String billingContactWorkPhone;
    @XmlElement(name = "DonatingServiceProvider")
    protected String donatingServiceProvider;
    @XmlElement(name = "EndingPhoneNumber")
    protected String endingPhoneNumber;
    @XmlElement(name = "LegacyAccountNumber")
    protected String legacyAccountNumber;
    @XmlElement(name = "NumberPortabilityAgencyName")
    protected String numberPortabilityAgencyName;
    @XmlElement(name = "NumberToPort")
    protected String numberToPort;
    @XmlElement(name = "PIN")
    protected String pin;
    @XmlElement(name = "RequestedPortingDate")
    protected String requestedPortingDate;
    @XmlElement(name = "ServicePostalCode")
    protected String servicePostalCode;
    @XmlElement(name = "StartingPhoneNumber")
    protected String startingPhoneNumber;
    @XmlElement(name = "ServiceId")
    protected String serviceId;
    @XmlElement(name = "QuoteItem")
    protected List<QuoteItem> quoteItem;
    @XmlAttribute
    protected String searchspec;
    @XmlAttribute
    protected String operation;

    /**
     * Gets the value of the serviceLength property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceLength() {
        return serviceLength;
    }

    /**
     * Sets the value of the serviceLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceLength(String value) {
        this.serviceLength = value;
    }

    /**
     * Gets the value of the serviceLengthUoM property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceLengthUoM() {
        return serviceLengthUoM;
    }

    /**
     * Sets the value of the serviceLengthUoM property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceLengthUoM(String value) {
        this.serviceLengthUoM = value;
    }

    /**
     * Gets the value of the volumeUpsellMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVolumeUpsellMessage() {
        return volumeUpsellMessage;
    }

    /**
     * Sets the value of the volumeUpsellMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVolumeUpsellMessage(String value) {
        this.volumeUpsellMessage = value;
    }

    /**
     * Gets the value of the volumeUpsellItemId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVolumeUpsellItemId() {
        return volumeUpsellItemId;
    }

    /**
     * Sets the value of the volumeUpsellItemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVolumeUpsellItemId(String value) {
        this.volumeUpsellItemId = value;
    }

    /**
     * Gets the value of the volumeDiscountItemId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVolumeDiscountItemId() {
        return volumeDiscountItemId;
    }

    /**
     * Sets the value of the volumeDiscountItemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVolumeDiscountItemId(String value) {
        this.volumeDiscountItemId = value;
    }

    /**
     * Gets the value of the volumeDiscountId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVolumeDiscountId() {
        return volumeDiscountId;
    }

    /**
     * Sets the value of the volumeDiscountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVolumeDiscountId(String value) {
        this.volumeDiscountId = value;
    }

    /**
     * Gets the value of the usageAssetProductId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsageAssetProductId() {
        return usageAssetProductId;
    }

    /**
     * Sets the value of the usageAssetProductId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsageAssetProductId(String value) {
        this.usageAssetProductId = value;
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
     * Gets the value of the taxAmt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxAmt() {
        return taxAmt;
    }

    /**
     * Sets the value of the taxAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxAmt(String value) {
        this.taxAmt = value;
    }

    /**
     * Gets the value of the shipToState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipToState() {
        return shipToState;
    }

    /**
     * Sets the value of the shipToState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipToState(String value) {
        this.shipToState = value;
    }

    /**
     * Gets the value of the shipToPostalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipToPostalCode() {
        return shipToPostalCode;
    }

    /**
     * Sets the value of the shipToPostalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipToPostalCode(String value) {
        this.shipToPostalCode = value;
    }

    /**
     * Gets the value of the shipToCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipToCountry() {
        return shipToCountry;
    }

    /**
     * Sets the value of the shipToCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipToCountry(String value) {
        this.shipToCountry = value;
    }

    /**
     * Gets the value of the shipToContactWorkPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipToContactWorkPhone() {
        return shipToContactWorkPhone;
    }

    /**
     * Sets the value of the shipToContactWorkPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipToContactWorkPhone(String value) {
        this.shipToContactWorkPhone = value;
    }

    /**
     * Gets the value of the shipToContactId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipToContactId() {
        return shipToContactId;
    }

    /**
     * Sets the value of the shipToContactId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipToContactId(String value) {
        this.shipToContactId = value;
    }

    /**
     * Gets the value of the shipToContactHomePhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipToContactHomePhone() {
        return shipToContactHomePhone;
    }

    /**
     * Sets the value of the shipToContactHomePhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipToContactHomePhone(String value) {
        this.shipToContactHomePhone = value;
    }

    /**
     * Gets the value of the shipToContactFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipToContactFirstName() {
        return shipToContactFirstName;
    }

    /**
     * Sets the value of the shipToContactFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipToContactFirstName(String value) {
        this.shipToContactFirstName = value;
    }

    /**
     * Gets the value of the shipToContactEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipToContactEmail() {
        return shipToContactEmail;
    }

    /**
     * Sets the value of the shipToContactEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipToContactEmail(String value) {
        this.shipToContactEmail = value;
    }

    /**
     * Gets the value of the shipToCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipToCity() {
        return shipToCity;
    }

    /**
     * Sets the value of the shipToCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipToCity(String value) {
        this.shipToCity = value;
    }

    /**
     * Gets the value of the businessShipToAddressId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessShipToAddressId() {
        return businessShipToAddressId;
    }

    /**
     * Sets the value of the businessShipToAddressId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessShipToAddressId(String value) {
        this.businessShipToAddressId = value;
    }

    /**
     * Gets the value of the businessShipToZip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessShipToZip() {
        return businessShipToZip;
    }

    /**
     * Sets the value of the businessShipToZip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessShipToZip(String value) {
        this.businessShipToZip = value;
    }

    /**
     * Gets the value of the businessShipToState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessShipToState() {
        return businessShipToState;
    }

    /**
     * Sets the value of the businessShipToState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessShipToState(String value) {
        this.businessShipToState = value;
    }

    /**
     * Gets the value of the businessShipToCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessShipToCountry() {
        return businessShipToCountry;
    }

    /**
     * Sets the value of the businessShipToCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessShipToCountry(String value) {
        this.businessShipToCountry = value;
    }

    /**
     * Gets the value of the businessShipToCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessShipToCity() {
        return businessShipToCity;
    }

    /**
     * Sets the value of the businessShipToCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessShipToCity(String value) {
        this.businessShipToCity = value;
    }

    /**
     * Gets the value of the businessShipToAddress2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessShipToAddress2() {
        return businessShipToAddress2;
    }

    /**
     * Sets the value of the businessShipToAddress2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessShipToAddress2(String value) {
        this.businessShipToAddress2 = value;
    }

    /**
     * Gets the value of the servicePricePercent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServicePricePercent() {
        return servicePricePercent;
    }

    /**
     * Sets the value of the servicePricePercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServicePricePercent(String value) {
        this.servicePricePercent = value;
    }

    /**
     * Gets the value of the servicePriceMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServicePriceMethod() {
        return servicePriceMethod;
    }

    /**
     * Sets the value of the servicePriceMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServicePriceMethod(String value) {
        this.servicePriceMethod = value;
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
     * Gets the value of the salesServiceFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesServiceFlag() {
        return salesServiceFlag;
    }

    /**
     * Sets the value of the salesServiceFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesServiceFlag(String value) {
        this.salesServiceFlag = value;
    }

    /**
     * Gets the value of the rootQuoteItemId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRootQuoteItemId() {
        return rootQuoteItemId;
    }

    /**
     * Sets the value of the rootQuoteItemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRootQuoteItemId(String value) {
        this.rootQuoteItemId = value;
    }

    /**
     * Gets the value of the rootAssetIntegrationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRootAssetIntegrationId() {
        return rootAssetIntegrationId;
    }

    /**
     * Sets the value of the rootAssetIntegrationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRootAssetIntegrationId(String value) {
        this.rootAssetIntegrationId = value;
    }

    /**
     * Gets the value of the requestedDeliveryDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestedDeliveryDate() {
        return requestedDeliveryDate;
    }

    /**
     * Sets the value of the requestedDeliveryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestedDeliveryDate(String value) {
        this.requestedDeliveryDate = value;
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
     * Gets the value of the productTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductTypeCode() {
        return productTypeCode;
    }

    /**
     * Sets the value of the productTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductTypeCode(String value) {
        this.productTypeCode = value;
    }

    /**
     * Gets the value of the productStructureType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductStructureType() {
        return productStructureType;
    }

    /**
     * Sets the value of the productStructureType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductStructureType(String value) {
        this.productStructureType = value;
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
     * Gets the value of the pricingAdjustmentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPricingAdjustmentAmount() {
        return pricingAdjustmentAmount;
    }

    /**
     * Sets the value of the pricingAdjustmentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPricingAdjustmentAmount(String value) {
        this.pricingAdjustmentAmount = value;
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
     * Gets the value of the portItemId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPortItemId() {
        return portItemId;
    }

    /**
     * Sets the value of the portItemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPortItemId(String value) {
        this.portItemId = value;
    }

    /**
     * Gets the value of the personalShipToZip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonalShipToZip() {
        return personalShipToZip;
    }

    /**
     * Sets the value of the personalShipToZip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonalShipToZip(String value) {
        this.personalShipToZip = value;
    }

    /**
     * Gets the value of the personalShipToState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonalShipToState() {
        return personalShipToState;
    }

    /**
     * Sets the value of the personalShipToState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonalShipToState(String value) {
        this.personalShipToState = value;
    }

    /**
     * Gets the value of the personalShipToCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonalShipToCountry() {
        return personalShipToCountry;
    }

    /**
     * Sets the value of the personalShipToCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonalShipToCountry(String value) {
        this.personalShipToCountry = value;
    }

    /**
     * Gets the value of the personalShipToCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonalShipToCity() {
        return personalShipToCity;
    }

    /**
     * Sets the value of the personalShipToCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonalShipToCity(String value) {
        this.personalShipToCity = value;
    }

    /**
     * Gets the value of the personalShipToAddress2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonalShipToAddress2() {
        return personalShipToAddress2;
    }

    /**
     * Sets the value of the personalShipToAddress2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonalShipToAddress2(String value) {
        this.personalShipToAddress2 = value;
    }

    /**
     * Gets the value of the netPrice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetPrice() {
        return netPrice;
    }

    /**
     * Sets the value of the netPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetPrice(String value) {
        this.netPrice = value;
    }

    /**
     * Gets the value of the nrcCxTotal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNRCCxTotal() {
        return nrcCxTotal;
    }

    /**
     * Sets the value of the nrcCxTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNRCCxTotal(String value) {
        this.nrcCxTotal = value;
    }

    /**
     * Gets the value of the minPrice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinPrice() {
        return minPrice;
    }

    /**
     * Sets the value of the minPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinPrice(String value) {
        this.minPrice = value;
    }

    /**
     * Gets the value of the maxPrice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxPrice() {
        return maxPrice;
    }

    /**
     * Sets the value of the maxPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxPrice(String value) {
        this.maxPrice = value;
    }

    /**
     * Gets the value of the mrcCxTotal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMRCCxTotal() {
        return mrcCxTotal;
    }

    /**
     * Sets the value of the mrcCxTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMRCCxTotal(String value) {
        this.mrcCxTotal = value;
    }

    /**
     * Gets the value of the lineNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLineNumber() {
        return lineNumber;
    }

    /**
     * Sets the value of the lineNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLineNumber(String value) {
        this.lineNumber = value;
    }

    /**
     * Gets the value of the itemPriceListId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemPriceListId() {
        return itemPriceListId;
    }

    /**
     * Sets the value of the itemPriceListId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemPriceListId(String value) {
        this.itemPriceListId = value;
    }

    /**
     * Gets the value of the isPromEligible property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsPromEligible() {
        return isPromEligible;
    }

    /**
     * Sets the value of the isPromEligible property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsPromEligible(String value) {
        this.isPromEligible = value;
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
     * Gets the value of the headerDiscountAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeaderDiscountAmount() {
        return headerDiscountAmount;
    }

    /**
     * Sets the value of the headerDiscountAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeaderDiscountAmount(String value) {
        this.headerDiscountAmount = value;
    }

    /**
     * Gets the value of the freightAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFreightAmount() {
        return freightAmount;
    }

    /**
     * Sets the value of the freightAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFreightAmount(String value) {
        this.freightAmount = value;
    }

    /**
     * Gets the value of the forcastableFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForcastableFlag() {
        return forcastableFlag;
    }

    /**
     * Sets the value of the forcastableFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForcastableFlag(String value) {
        this.forcastableFlag = value;
    }

    /**
     * Gets the value of the extendedQuantityRequested property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtendedQuantityRequested() {
        return extendedQuantityRequested;
    }

    /**
     * Sets the value of the extendedQuantityRequested property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtendedQuantityRequested(String value) {
        this.extendedQuantityRequested = value;
    }

    /**
     * Gets the value of the excludePricingFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExcludePricingFlag() {
        return excludePricingFlag;
    }

    /**
     * Sets the value of the excludePricingFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExcludePricingFlag(String value) {
        this.excludePricingFlag = value;
    }

    /**
     * Gets the value of the exchangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExchangeDate() {
        return exchangeDate;
    }

    /**
     * Sets the value of the exchangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExchangeDate(String value) {
        this.exchangeDate = value;
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
     * Gets the value of the discount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscount() {
        return discount;
    }

    /**
     * Sets the value of the discount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscount(String value) {
        this.discount = value;
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
     * Gets the value of the currentPrice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentPrice() {
        return currentPrice;
    }

    /**
     * Sets the value of the currentPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentPrice(String value) {
        this.currentPrice = value;
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
     * Gets the value of the coveredProductNetPrice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoveredProductNetPrice() {
        return coveredProductNetPrice;
    }

    /**
     * Sets the value of the coveredProductNetPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoveredProductNetPrice(String value) {
        this.coveredProductNetPrice = value;
    }

    /**
     * Gets the value of the coveredProductId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoveredProductId() {
        return coveredProductId;
    }

    /**
     * Sets the value of the coveredProductId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoveredProductId(String value) {
        this.coveredProductId = value;
    }

    /**
     * Gets the value of the coveredAssetProductId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoveredAssetProductId() {
        return coveredAssetProductId;
    }

    /**
     * Sets the value of the coveredAssetProductId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoveredAssetProductId(String value) {
        this.coveredAssetProductId = value;
    }

    /**
     * Gets the value of the cost property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCost() {
        return cost;
    }

    /**
     * Sets the value of the cost property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCost(String value) {
        this.cost = value;
    }

    /**
     * Gets the value of the contactWorkPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactWorkPhone() {
        return contactWorkPhone;
    }

    /**
     * Sets the value of the contactWorkPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactWorkPhone(String value) {
        this.contactWorkPhone = value;
    }

    /**
     * Gets the value of the contactId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactId() {
        return contactId;
    }

    /**
     * Sets the value of the contactId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactId(String value) {
        this.contactId = value;
    }

    /**
     * Gets the value of the contactHomePhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactHomePhone() {
        return contactHomePhone;
    }

    /**
     * Sets the value of the contactHomePhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactHomePhone(String value) {
        this.contactHomePhone = value;
    }

    /**
     * Gets the value of the contactFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactFirstName() {
        return contactFirstName;
    }

    /**
     * Sets the value of the contactFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactFirstName(String value) {
        this.contactFirstName = value;
    }

    /**
     * Gets the value of the contactEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactEmail() {
        return contactEmail;
    }

    /**
     * Sets the value of the contactEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactEmail(String value) {
        this.contactEmail = value;
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
     * Gets the value of the assetIntegrationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssetIntegrationId() {
        return assetIntegrationId;
    }

    /**
     * Sets the value of the assetIntegrationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssetIntegrationId(String value) {
        this.assetIntegrationId = value;
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
     * Gets the value of the accountId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountId() {
        return accountId;
    }

    /**
     * Sets the value of the accountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountId(String value) {
        this.accountId = value;
    }

    /**
     * Gets the value of the coveredQuoteItemId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoveredQuoteItemId() {
        return coveredQuoteItemId;
    }

    /**
     * Sets the value of the coveredQuoteItemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoveredQuoteItemId(String value) {
        this.coveredQuoteItemId = value;
    }

    /**
     * Gets the value of the shipToAccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipToAccount() {
        return shipToAccount;
    }

    /**
     * Sets the value of the shipToAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipToAccount(String value) {
        this.shipToAccount = value;
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
     * Gets the value of the carrierPriority property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarrierPriority() {
        return carrierPriority;
    }

    /**
     * Sets the value of the carrierPriority property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarrierPriority(String value) {
        this.carrierPriority = value;
    }

    /**
     * Gets the value of the carrierCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarrierCode() {
        return carrierCode;
    }

    /**
     * Sets the value of the carrierCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarrierCode(String value) {
        this.carrierCode = value;
    }

    /**
     * Gets the value of the freightTerms property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFreightTerms() {
        return freightTerms;
    }

    /**
     * Sets the value of the freightTerms property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFreightTerms(String value) {
        this.freightTerms = value;
    }

    /**
     * Gets the value of the shipToContactLastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipToContactLastName() {
        return shipToContactLastName;
    }

    /**
     * Sets the value of the shipToContactLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipToContactLastName(String value) {
        this.shipToContactLastName = value;
    }

    /**
     * Gets the value of the contactLastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactLastName() {
        return contactLastName;
    }

    /**
     * Sets the value of the contactLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactLastName(String value) {
        this.contactLastName = value;
    }

    /**
     * Gets the value of the created property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreated() {
        return created;
    }

    /**
     * Sets the value of the created property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreated(String value) {
        this.created = value;
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
     * Gets the value of the isPrePickCartItem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsPrePickCartItem() {
        return isPrePickCartItem;
    }

    /**
     * Sets the value of the isPrePickCartItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsPrePickCartItem(String value) {
        this.isPrePickCartItem = value;
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
     * Gets the value of the rootBundleFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRootBundleFlag() {
        return rootBundleFlag;
    }

    /**
     * Sets the value of the rootBundleFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRootBundleFlag(String value) {
        this.rootBundleFlag = value;
    }

    /**
     * Gets the value of the updated property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpdated() {
        return updated;
    }

    /**
     * Sets the value of the updated property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpdated(String value) {
        this.updated = value;
    }

    /**
     * Gets the value of the volumeDiscountItem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVolumeDiscountItem() {
        return volumeDiscountItem;
    }

    /**
     * Sets the value of the volumeDiscountItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVolumeDiscountItem(String value) {
        this.volumeDiscountItem = value;
    }

    /**
     * Gets the value of the volumeUpsellItem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVolumeUpsellItem() {
        return volumeUpsellItem;
    }

    /**
     * Sets the value of the volumeUpsellItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVolumeUpsellItem(String value) {
        this.volumeUpsellItem = value;
    }

    /**
     * Gets the value of the sequenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSequenceNumber() {
        return sequenceNumber;
    }

    /**
     * Sets the value of the sequenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSequenceNumber(String value) {
        this.sequenceNumber = value;
    }

    /**
     * Gets the value of the productLineId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductLineId() {
        return productLineId;
    }

    /**
     * Sets the value of the productLineId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductLineId(String value) {
        this.productLineId = value;
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
     * Gets the value of the parentQuoteItemId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentQuoteItemId() {
        return parentQuoteItemId;
    }

    /**
     * Sets the value of the parentQuoteItemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentQuoteItemId(String value) {
        this.parentQuoteItemId = value;
    }

    /**
     * Gets the value of the needRefreshBasePrice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNeedRefreshBasePrice() {
        return needRefreshBasePrice;
    }

    /**
     * Sets the value of the needRefreshBasePrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNeedRefreshBasePrice(String value) {
        this.needRefreshBasePrice = value;
    }

    /**
     * Gets the value of the inclusiveEligibilityFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInclusiveEligibilityFlag() {
        return inclusiveEligibilityFlag;
    }

    /**
     * Sets the value of the inclusiveEligibilityFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInclusiveEligibilityFlag(String value) {
        this.inclusiveEligibilityFlag = value;
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
     * Gets the value of the hasGenerics property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHasGenerics() {
        return hasGenerics;
    }

    /**
     * Sets the value of the hasGenerics property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHasGenerics(String value) {
        this.hasGenerics = value;
    }

    /**
     * Gets the value of the effectiveFrom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEffectiveFrom() {
        return effectiveFrom;
    }

    /**
     * Sets the value of the effectiveFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEffectiveFrom(String value) {
        this.effectiveFrom = value;
    }

    /**
     * Gets the value of the effectiveTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEffectiveTo() {
        return effectiveTo;
    }

    /**
     * Sets the value of the effectiveTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEffectiveTo(String value) {
        this.effectiveTo = value;
    }

    /**
     * Gets the value of the unitPrice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitPrice() {
        return unitPrice;
    }

    /**
     * Sets the value of the unitPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitPrice(String value) {
        this.unitPrice = value;
    }

    /**
     * Gets the value of the shipToAccountId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipToAccountId() {
        return shipToAccountId;
    }

    /**
     * Sets the value of the shipToAccountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipToAccountId(String value) {
        this.shipToAccountId = value;
    }

    /**
     * Gets the value of the businessShipToAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessShipToAddress() {
        return businessShipToAddress;
    }

    /**
     * Sets the value of the businessShipToAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessShipToAddress(String value) {
        this.businessShipToAddress = value;
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
     * Gets the value of the rollupItemPrice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRollupItemPrice() {
        return rollupItemPrice;
    }

    /**
     * Sets the value of the rollupItemPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRollupItemPrice(String value) {
        this.rollupItemPrice = value;
    }

    /**
     * Gets the value of the rollupAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRollupAmount() {
        return rollupAmount;
    }

    /**
     * Sets the value of the rollupAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRollupAmount(String value) {
        this.rollupAmount = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuantity(String value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the pricingComments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPricingComments() {
        return pricingComments;
    }

    /**
     * Sets the value of the pricingComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPricingComments(String value) {
        this.pricingComments = value;
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
     * Gets the value of the personalShipToAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonalShipToAddress() {
        return personalShipToAddress;
    }

    /**
     * Sets the value of the personalShipToAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonalShipToAddress(String value) {
        this.personalShipToAddress = value;
    }

    /**
     * Gets the value of the personalShipToAddressId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonalShipToAddressId() {
        return personalShipToAddressId;
    }

    /**
     * Sets the value of the personalShipToAddressId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonalShipToAddressId(String value) {
        this.personalShipToAddressId = value;
    }

    /**
     * Gets the value of the origListPrice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrigListPrice() {
        return origListPrice;
    }

    /**
     * Sets the value of the origListPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrigListPrice(String value) {
        this.origListPrice = value;
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
     * Gets the value of the listPrice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getListPrice() {
        return listPrice;
    }

    /**
     * Sets the value of the listPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setListPrice(String value) {
        this.listPrice = value;
    }

    /**
     * Gets the value of the discountSource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscountSource() {
        return discountSource;
    }

    /**
     * Sets the value of the discountSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscountSource(String value) {
        this.discountSource = value;
    }

    /**
     * Gets the value of the discountPercent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscountPercent() {
        return discountPercent;
    }

    /**
     * Sets the value of the discountPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscountPercent(String value) {
        this.discountPercent = value;
    }

    /**
     * Gets the value of the discountAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscountAmount() {
        return discountAmount;
    }

    /**
     * Sets the value of the discountAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscountAmount(String value) {
        this.discountAmount = value;
    }

    /**
     * Gets the value of the listOfQuoteItemXA property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfQuoteItemXA }
     *     
     */
    public ListOfQuoteItemXA getListOfQuoteItemXA() {
        return listOfQuoteItemXA;
    }

    /**
     * Sets the value of the listOfQuoteItemXA property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfQuoteItemXA }
     *     
     */
    public void setListOfQuoteItemXA(ListOfQuoteItemXA value) {
        this.listOfQuoteItemXA = value;
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
     * Gets the value of the billingAccountAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingAccountAddress() {
        return billingAccountAddress;
    }

    /**
     * Sets the value of the billingAccountAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingAccountAddress(String value) {
        this.billingAccountAddress = value;
    }

    /**
     * Gets the value of the billingAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingAccountNumber() {
        return billingAccountNumber;
    }

    /**
     * Sets the value of the billingAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingAccountNumber(String value) {
        this.billingAccountNumber = value;
    }

    /**
     * Gets the value of the billingAccountLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingAccountLocation() {
        return billingAccountLocation;
    }

    /**
     * Sets the value of the billingAccountLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingAccountLocation(String value) {
        this.billingAccountLocation = value;
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
     * Gets the value of the billingAccountAddress2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingAccountAddress2() {
        return billingAccountAddress2;
    }

    /**
     * Sets the value of the billingAccountAddress2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingAccountAddress2(String value) {
        this.billingAccountAddress2 = value;
    }

    /**
     * Gets the value of the billingAccountAddressId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingAccountAddressId() {
        return billingAccountAddressId;
    }

    /**
     * Sets the value of the billingAccountAddressId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingAccountAddressId(String value) {
        this.billingAccountAddressId = value;
    }

    /**
     * Gets the value of the billingAccountCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingAccountCity() {
        return billingAccountCity;
    }

    /**
     * Sets the value of the billingAccountCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingAccountCity(String value) {
        this.billingAccountCity = value;
    }

    /**
     * Gets the value of the billingAccountContactId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingAccountContactId() {
        return billingAccountContactId;
    }

    /**
     * Sets the value of the billingAccountContactId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingAccountContactId(String value) {
        this.billingAccountContactId = value;
    }

    /**
     * Gets the value of the billingAccountCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingAccountCountry() {
        return billingAccountCountry;
    }

    /**
     * Sets the value of the billingAccountCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingAccountCountry(String value) {
        this.billingAccountCountry = value;
    }

    /**
     * Gets the value of the billingAccountState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingAccountState() {
        return billingAccountState;
    }

    /**
     * Sets the value of the billingAccountState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingAccountState(String value) {
        this.billingAccountState = value;
    }

    /**
     * Gets the value of the billingAccountZip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingAccountZip() {
        return billingAccountZip;
    }

    /**
     * Sets the value of the billingAccountZip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingAccountZip(String value) {
        this.billingAccountZip = value;
    }

    /**
     * Gets the value of the billingContactEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingContactEmail() {
        return billingContactEmail;
    }

    /**
     * Sets the value of the billingContactEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingContactEmail(String value) {
        this.billingContactEmail = value;
    }

    /**
     * Gets the value of the billingContactFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingContactFirstName() {
        return billingContactFirstName;
    }

    /**
     * Sets the value of the billingContactFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingContactFirstName(String value) {
        this.billingContactFirstName = value;
    }

    /**
     * Gets the value of the billingContactLastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingContactLastName() {
        return billingContactLastName;
    }

    /**
     * Sets the value of the billingContactLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingContactLastName(String value) {
        this.billingContactLastName = value;
    }

    /**
     * Gets the value of the billingContactWorkPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingContactWorkPhone() {
        return billingContactWorkPhone;
    }

    /**
     * Sets the value of the billingContactWorkPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingContactWorkPhone(String value) {
        this.billingContactWorkPhone = value;
    }

    /**
     * Gets the value of the donatingServiceProvider property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDonatingServiceProvider() {
        return donatingServiceProvider;
    }

    /**
     * Sets the value of the donatingServiceProvider property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDonatingServiceProvider(String value) {
        this.donatingServiceProvider = value;
    }

    /**
     * Gets the value of the endingPhoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndingPhoneNumber() {
        return endingPhoneNumber;
    }

    /**
     * Sets the value of the endingPhoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndingPhoneNumber(String value) {
        this.endingPhoneNumber = value;
    }

    /**
     * Gets the value of the legacyAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLegacyAccountNumber() {
        return legacyAccountNumber;
    }

    /**
     * Sets the value of the legacyAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLegacyAccountNumber(String value) {
        this.legacyAccountNumber = value;
    }

    /**
     * Gets the value of the numberPortabilityAgencyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumberPortabilityAgencyName() {
        return numberPortabilityAgencyName;
    }

    /**
     * Sets the value of the numberPortabilityAgencyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumberPortabilityAgencyName(String value) {
        this.numberPortabilityAgencyName = value;
    }

    /**
     * Gets the value of the numberToPort property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumberToPort() {
        return numberToPort;
    }

    /**
     * Sets the value of the numberToPort property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumberToPort(String value) {
        this.numberToPort = value;
    }

    /**
     * Gets the value of the pin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPIN() {
        return pin;
    }

    /**
     * Sets the value of the pin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPIN(String value) {
        this.pin = value;
    }

    /**
     * Gets the value of the requestedPortingDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestedPortingDate() {
        return requestedPortingDate;
    }

    /**
     * Sets the value of the requestedPortingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestedPortingDate(String value) {
        this.requestedPortingDate = value;
    }

    /**
     * Gets the value of the servicePostalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServicePostalCode() {
        return servicePostalCode;
    }

    /**
     * Sets the value of the servicePostalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServicePostalCode(String value) {
        this.servicePostalCode = value;
    }

    /**
     * Gets the value of the startingPhoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartingPhoneNumber() {
        return startingPhoneNumber;
    }

    /**
     * Sets the value of the startingPhoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartingPhoneNumber(String value) {
        this.startingPhoneNumber = value;
    }

    /**
     * Gets the value of the serviceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceId() {
        return serviceId;
    }

    /**
     * Sets the value of the serviceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceId(String value) {
        this.serviceId = value;
    }

    /**
     * Gets the value of the quoteItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the quoteItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQuoteItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QuoteItem }
     * 
     * 
     */
    public List<QuoteItem> getQuoteItem() {
        if (quoteItem == null) {
            quoteItem = new ArrayList<QuoteItem>();
        }
        return this.quoteItem;
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
