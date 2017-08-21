
package com.siebel.ordermanagement.order.details.data.data;

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
 * <p>Java class for OrderItemDetailData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderItemDetailData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Created" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Updated" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ConflictId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ModId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ActionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AdjustedListPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="AmountExchangeDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="AssetId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AssetIntegrationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AssetStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AutoExplodeFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="BasePrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="BillingAccountId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CalculatedAssetStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CalculatedDueDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="CarrierCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CarrierPriority" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CfgActiveFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CfgEndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="CfgLatestReleasedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CfgObjectDefFirstVersion" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CfgObjectDefLastVersion" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CfgReleasedFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CfgStartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="CfgStateCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CfgType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CfgVersion" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ChangeCost" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ClassRegistrationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CommitmentCoveredFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CompoundProductFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CompoundProductNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ConfigurationModelId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ContactEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ContactFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ContactId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ContactLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ContactWorkPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ConvertToAgreementFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ConvertToAssetFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Cost" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Discount2" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DiscountAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DiscountPercent" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DiscountSource" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DueDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="EligibilityReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EligibilityStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExchangeDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="ExcludePricingFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ExtendedQuantity" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ForcastableFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="HasGenericsFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="HeaderCurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HeaderDiscount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="HeaderExchangeDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InclusiveEligibilityFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IntegrationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsComplexProduct" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsComplexProductComponent" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsComplexProductRoot" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ItemPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ItemPriceListId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="JointWorkspaceId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LineNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="LineNumber2" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="MRCCxTotal" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="MRCCxTotalinHeaderCurrency" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="MaximumQuantity" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="MinimumQuantity" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="NRCCxTotal" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="NRCCxTotalinHeaderCurrency" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="NeedRefreshBasePrice" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="NetPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="NetworkElementType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Node" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrderActiveFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="OrderCPN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrderHeaderId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OwnerAccountId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ParentOrderItemId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PartNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PostPickCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrePickCD" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PreviousAssetStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PreviousBillingAccountId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PreviousServiceAccountId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PreviousServiceId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PreviousUsageAssetId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PriceListId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PriceType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PricingComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProcessedFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ProdItemId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProdPromId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProdPromInstanceId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProdPromName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProdPromRuleId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProdPromSourceId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Product" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProductDefTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProductEffectiveFrom" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="ProductEffectiveTo" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="ProductId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProductPortId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProductPrimaryProductLineId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProductTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProductXAClassId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PromotionItemFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="QuantityRequested" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="QuantityShipped" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="RevisedLineItemId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RollupAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="RollupItemPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="RootAssetIntegrationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RootItemPriceListId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RootOrderItemId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RootProductId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SalesServiceFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ServiceAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ServiceAccountAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ServiceAccountAddress2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ServiceAccountAddressId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ServiceAccountCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ServiceAccountCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ServiceAccountId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ServiceAccountLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ServiceAccountState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ServiceAccountZip" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ServiceId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShipInstrustions" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShipToAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShipToAccountId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShipToAccountLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShipToAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShipToAddress2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShipToAddressId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShipToCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShipToContact-Email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShipToContact-FirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShipToContact-LastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShipToContact-WorkPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShipToContactId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShipToCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShipToState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShipToZip" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SmartPartNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TaxAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TaxExemptFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ToNode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ToServiceAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ToServiceAccountId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UnitPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="UnitofMeasure" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VODRowId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VolumeDiscountId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VolumeDiscountItem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VolumeDiscountItemId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VolumeUpsellItem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VolumeUpsellItemId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VolumeUpsellMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Write-InProduct" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonalShipToAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonalShipToAddress2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonalShipToAddressId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonalShipToCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonalShipToCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonalShipToState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonalShipToZip" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonalShipToAddressee" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShipToAddressee" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *         &lt;element name="RequestedPortingDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ServicePostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StartingPhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ListOfOrderItemXADetail" type="{http://siebel.com/OrderManagement/Order/Details/Data/Data}ListOfOrderItemXADetailData" minOccurs="0"/>
 *         &lt;element name="ListOfOrderItemProductLine" type="{http://siebel.com/OrderManagement/Order/Details/Data/Data}ListOfOrderItemProductLineData" minOccurs="0"/>
 *         &lt;element name="OrderItemDetail" type="{http://siebel.com/OrderManagement/Order/Details/Data/Data}OrderItemDetailData" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "OrderItemDetailData", propOrder = {
    "id",
    "created",
    "updated",
    "conflictId",
    "modId",
    "actionCode",
    "adjustedListPrice",
    "amountExchangeDate",
    "assetId",
    "assetIntegrationId",
    "assetStatus",
    "autoExplodeFlag",
    "basePrice",
    "billingAccountId",
    "calculatedAssetStatus",
    "calculatedDueDate",
    "carrierCode",
    "carrierPriority",
    "cfgActiveFlag",
    "cfgEndDate",
    "cfgLatestReleasedFlag",
    "cfgObjectDefFirstVersion",
    "cfgObjectDefLastVersion",
    "cfgReleasedFlag",
    "cfgStartDate",
    "cfgStateCode",
    "cfgType",
    "cfgVersion",
    "changeCost",
    "classRegistrationId",
    "commitmentCoveredFlag",
    "compoundProductFlag",
    "compoundProductNumber",
    "configurationModelId",
    "contactEmail",
    "contactFirstName",
    "contactId",
    "contactLastName",
    "contactWorkPhone",
    "convertToAgreementFlag",
    "convertToAssetFlag",
    "cost",
    "currencyCode",
    "discount2",
    "discountAmount",
    "discountPercent",
    "discountSource",
    "dueDate",
    "eligibilityReason",
    "eligibilityStatus",
    "exchangeDate",
    "excludePricingFlag",
    "extendedQuantity",
    "forcastableFlag",
    "hasGenericsFlag",
    "headerCurrencyCode",
    "headerDiscount",
    "headerExchangeDate",
    "inclusiveEligibilityFlag",
    "integrationId",
    "isComplexProduct",
    "isComplexProductComponent",
    "isComplexProductRoot",
    "itemPrice",
    "itemPriceListId",
    "jointWorkspaceId",
    "lineNumber",
    "lineNumber2",
    "mrcCxTotal",
    "mrcCxTotalinHeaderCurrency",
    "maximumQuantity",
    "minimumQuantity",
    "nrcCxTotal",
    "nrcCxTotalinHeaderCurrency",
    "needRefreshBasePrice",
    "netPrice",
    "networkElementType",
    "node",
    "orderActiveFlag",
    "orderCPN",
    "orderHeaderId",
    "ownerAccountId",
    "parentOrderItemId",
    "partNumber",
    "postPickCD",
    "prePickCD",
    "previousAssetStatus",
    "previousBillingAccountId",
    "previousServiceAccountId",
    "previousServiceId",
    "previousUsageAssetId",
    "priceListId",
    "priceType",
    "pricingComments",
    "processedFlag",
    "prodItemId",
    "prodPromId",
    "prodPromInstanceId",
    "prodPromName",
    "prodPromRuleId",
    "prodPromSourceId",
    "product",
    "productDefTypeCode",
    "productEffectiveFrom",
    "productEffectiveTo",
    "productId",
    "productPortId",
    "productPrimaryProductLineId",
    "productTypeCode",
    "productXAClassId",
    "promotionItemFlag",
    "quantity",
    "quantityRequested",
    "quantityShipped",
    "revisedLineItemId",
    "rollupAmount",
    "rollupItemPrice",
    "rootAssetIntegrationId",
    "rootItemPriceListId",
    "rootOrderItemId",
    "rootProductId",
    "salesServiceFlag",
    "serviceAccount",
    "serviceAccountAddress",
    "serviceAccountAddress2",
    "serviceAccountAddressId",
    "serviceAccountCity",
    "serviceAccountCountry",
    "serviceAccountId",
    "serviceAccountLocation",
    "serviceAccountState",
    "serviceAccountZip",
    "serviceId",
    "shipInstrustions",
    "shipToAccount",
    "shipToAccountId",
    "shipToAccountLocation",
    "shipToAddress",
    "shipToAddress2",
    "shipToAddressId",
    "shipToCity",
    "shipToContactEmail",
    "shipToContactFirstName",
    "shipToContactLastName",
    "shipToContactWorkPhone",
    "shipToContactId",
    "shipToCountry",
    "shipToState",
    "shipToZip",
    "smartPartNumber",
    "status",
    "taxAmount",
    "taxExemptFlag",
    "toNode",
    "toServiceAccount",
    "toServiceAccountId",
    "unitPrice",
    "unitofMeasure",
    "vodRowId",
    "volumeDiscountId",
    "volumeDiscountItem",
    "volumeDiscountItemId",
    "volumeUpsellItem",
    "volumeUpsellItemId",
    "volumeUpsellMessage",
    "writeInProduct",
    "personalShipToAddress",
    "personalShipToAddress2",
    "personalShipToAddressId",
    "personalShipToCity",
    "personalShipToCountry",
    "personalShipToState",
    "personalShipToZip",
    "personalShipToAddressee",
    "shipToAddressee",
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
    "listOfOrderItemXADetail",
    "listOfOrderItemProductLine",
    "orderItemDetail"
})
public class OrderItemDetailData
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
    @XmlElement(name = "ActionCode")
    protected String actionCode;
    @XmlElement(name = "AdjustedListPrice")
    protected BigDecimal adjustedListPrice;
    @XmlElement(name = "AmountExchangeDate")
    protected XMLGregorianCalendar amountExchangeDate;
    @XmlElement(name = "AssetId")
    protected String assetId;
    @XmlElement(name = "AssetIntegrationId")
    protected String assetIntegrationId;
    @XmlElement(name = "AssetStatus")
    protected String assetStatus;
    @XmlElement(name = "AutoExplodeFlag")
    protected Boolean autoExplodeFlag;
    @XmlElement(name = "BasePrice")
    protected BigDecimal basePrice;
    @XmlElement(name = "BillingAccountId")
    protected String billingAccountId;
    @XmlElement(name = "CalculatedAssetStatus")
    protected String calculatedAssetStatus;
    @XmlElement(name = "CalculatedDueDate")
    protected XMLGregorianCalendar calculatedDueDate;
    @XmlElement(name = "CarrierCode")
    protected String carrierCode;
    @XmlElement(name = "CarrierPriority")
    protected String carrierPriority;
    @XmlElement(name = "CfgActiveFlag")
    protected Boolean cfgActiveFlag;
    @XmlElement(name = "CfgEndDate")
    protected XMLGregorianCalendar cfgEndDate;
    @XmlElement(name = "CfgLatestReleasedFlag")
    protected String cfgLatestReleasedFlag;
    @XmlElement(name = "CfgObjectDefFirstVersion")
    protected Integer cfgObjectDefFirstVersion;
    @XmlElement(name = "CfgObjectDefLastVersion")
    protected Integer cfgObjectDefLastVersion;
    @XmlElement(name = "CfgReleasedFlag")
    protected Boolean cfgReleasedFlag;
    @XmlElement(name = "CfgStartDate")
    protected XMLGregorianCalendar cfgStartDate;
    @XmlElement(name = "CfgStateCode")
    protected String cfgStateCode;
    @XmlElement(name = "CfgType")
    protected String cfgType;
    @XmlElement(name = "CfgVersion")
    protected BigDecimal cfgVersion;
    @XmlElement(name = "ChangeCost")
    protected String changeCost;
    @XmlElement(name = "ClassRegistrationId")
    protected String classRegistrationId;
    @XmlElement(name = "CommitmentCoveredFlag")
    protected Boolean commitmentCoveredFlag;
    @XmlElement(name = "CompoundProductFlag")
    protected Boolean compoundProductFlag;
    @XmlElement(name = "CompoundProductNumber")
    protected String compoundProductNumber;
    @XmlElement(name = "ConfigurationModelId")
    protected String configurationModelId;
    @XmlElement(name = "ContactEmail")
    protected String contactEmail;
    @XmlElement(name = "ContactFirstName")
    protected String contactFirstName;
    @XmlElement(name = "ContactId")
    protected String contactId;
    @XmlElement(name = "ContactLastName")
    protected String contactLastName;
    @XmlElement(name = "ContactWorkPhone")
    protected String contactWorkPhone;
    @XmlElement(name = "ConvertToAgreementFlag")
    protected Boolean convertToAgreementFlag;
    @XmlElement(name = "ConvertToAssetFlag")
    protected Boolean convertToAssetFlag;
    @XmlElement(name = "Cost")
    protected BigDecimal cost;
    @XmlElement(name = "CurrencyCode")
    protected String currencyCode;
    @XmlElement(name = "Discount2")
    protected BigDecimal discount2;
    @XmlElement(name = "DiscountAmount")
    protected BigDecimal discountAmount;
    @XmlElement(name = "DiscountPercent")
    protected BigDecimal discountPercent;
    @XmlElement(name = "DiscountSource")
    protected String discountSource;
    @XmlElement(name = "DueDate")
    protected XMLGregorianCalendar dueDate;
    @XmlElement(name = "EligibilityReason")
    protected String eligibilityReason;
    @XmlElement(name = "EligibilityStatus")
    protected String eligibilityStatus;
    @XmlElement(name = "ExchangeDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar exchangeDate;
    @XmlElement(name = "ExcludePricingFlag")
    protected Boolean excludePricingFlag;
    @XmlElement(name = "ExtendedQuantity")
    protected BigDecimal extendedQuantity;
    @XmlElement(name = "ForcastableFlag")
    protected Boolean forcastableFlag;
    @XmlElement(name = "HasGenericsFlag")
    protected Boolean hasGenericsFlag;
    @XmlElement(name = "HeaderCurrencyCode")
    protected String headerCurrencyCode;
    @XmlElement(name = "HeaderDiscount")
    protected BigDecimal headerDiscount;
    @XmlElement(name = "HeaderExchangeDate")
    protected String headerExchangeDate;
    @XmlElement(name = "InclusiveEligibilityFlag")
    protected Boolean inclusiveEligibilityFlag;
    @XmlElement(name = "IntegrationId")
    protected String integrationId;
    @XmlElement(name = "IsComplexProduct")
    protected Boolean isComplexProduct;
    @XmlElement(name = "IsComplexProductComponent")
    protected Boolean isComplexProductComponent;
    @XmlElement(name = "IsComplexProductRoot")
    protected Boolean isComplexProductRoot;
    @XmlElement(name = "ItemPrice")
    protected BigDecimal itemPrice;
    @XmlElement(name = "ItemPriceListId")
    protected String itemPriceListId;
    @XmlElement(name = "JointWorkspaceId")
    protected String jointWorkspaceId;
    @XmlElement(name = "LineNumber")
    protected Integer lineNumber;
    @XmlElement(name = "LineNumber2")
    protected BigDecimal lineNumber2;
    @XmlElement(name = "MRCCxTotal")
    protected BigDecimal mrcCxTotal;
    @XmlElement(name = "MRCCxTotalinHeaderCurrency")
    protected BigDecimal mrcCxTotalinHeaderCurrency;
    @XmlElement(name = "MaximumQuantity")
    protected BigDecimal maximumQuantity;
    @XmlElement(name = "MinimumQuantity")
    protected BigDecimal minimumQuantity;
    @XmlElement(name = "NRCCxTotal")
    protected BigDecimal nrcCxTotal;
    @XmlElement(name = "NRCCxTotalinHeaderCurrency")
    protected BigDecimal nrcCxTotalinHeaderCurrency;
    @XmlElement(name = "NeedRefreshBasePrice")
    protected Boolean needRefreshBasePrice;
    @XmlElement(name = "NetPrice")
    protected BigDecimal netPrice;
    @XmlElement(name = "NetworkElementType")
    protected String networkElementType;
    @XmlElement(name = "Node")
    protected String node;
    @XmlElement(name = "OrderActiveFlag")
    protected Boolean orderActiveFlag;
    @XmlElement(name = "OrderCPN")
    protected String orderCPN;
    @XmlElement(name = "OrderHeaderId")
    protected String orderHeaderId;
    @XmlElement(name = "OwnerAccountId")
    protected String ownerAccountId;
    @XmlElement(name = "ParentOrderItemId")
    protected String parentOrderItemId;
    @XmlElement(name = "PartNumber")
    protected String partNumber;
    @XmlElement(name = "PostPickCD")
    protected String postPickCD;
    @XmlElement(name = "PrePickCD")
    protected Boolean prePickCD;
    @XmlElement(name = "PreviousAssetStatus")
    protected String previousAssetStatus;
    @XmlElement(name = "PreviousBillingAccountId")
    protected String previousBillingAccountId;
    @XmlElement(name = "PreviousServiceAccountId")
    protected String previousServiceAccountId;
    @XmlElement(name = "PreviousServiceId")
    protected String previousServiceId;
    @XmlElement(name = "PreviousUsageAssetId")
    protected String previousUsageAssetId;
    @XmlElement(name = "PriceListId")
    protected String priceListId;
    @XmlElement(name = "PriceType")
    protected String priceType;
    @XmlElement(name = "PricingComments")
    protected String pricingComments;
    @XmlElement(name = "ProcessedFlag")
    protected Boolean processedFlag;
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
    @XmlElement(name = "Product")
    protected String product;
    @XmlElement(name = "ProductDefTypeCode")
    protected String productDefTypeCode;
    @XmlElement(name = "ProductEffectiveFrom")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar productEffectiveFrom;
    @XmlElement(name = "ProductEffectiveTo")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar productEffectiveTo;
    @XmlElement(name = "ProductId")
    protected String productId;
    @XmlElement(name = "ProductPortId")
    protected String productPortId;
    @XmlElement(name = "ProductPrimaryProductLineId")
    protected String productPrimaryProductLineId;
    @XmlElement(name = "ProductTypeCode")
    protected String productTypeCode;
    @XmlElement(name = "ProductXAClassId")
    protected String productXAClassId;
    @XmlElement(name = "PromotionItemFlag")
    protected Boolean promotionItemFlag;
    @XmlElement(name = "Quantity")
    protected Integer quantity;
    @XmlElement(name = "QuantityRequested")
    protected Integer quantityRequested;
    @XmlElement(name = "QuantityShipped")
    protected Integer quantityShipped;
    @XmlElement(name = "RevisedLineItemId")
    protected String revisedLineItemId;
    @XmlElement(name = "RollupAmount")
    protected BigDecimal rollupAmount;
    @XmlElement(name = "RollupItemPrice")
    protected BigDecimal rollupItemPrice;
    @XmlElement(name = "RootAssetIntegrationId")
    protected String rootAssetIntegrationId;
    @XmlElement(name = "RootItemPriceListId")
    protected String rootItemPriceListId;
    @XmlElement(name = "RootOrderItemId")
    protected String rootOrderItemId;
    @XmlElement(name = "RootProductId")
    protected String rootProductId;
    @XmlElement(name = "SalesServiceFlag")
    protected Boolean salesServiceFlag;
    @XmlElement(name = "ServiceAccount")
    protected String serviceAccount;
    @XmlElement(name = "ServiceAccountAddress")
    protected String serviceAccountAddress;
    @XmlElement(name = "ServiceAccountAddress2")
    protected String serviceAccountAddress2;
    @XmlElement(name = "ServiceAccountAddressId")
    protected String serviceAccountAddressId;
    @XmlElement(name = "ServiceAccountCity")
    protected String serviceAccountCity;
    @XmlElement(name = "ServiceAccountCountry")
    protected String serviceAccountCountry;
    @XmlElement(name = "ServiceAccountId")
    protected String serviceAccountId;
    @XmlElement(name = "ServiceAccountLocation")
    protected String serviceAccountLocation;
    @XmlElement(name = "ServiceAccountState")
    protected String serviceAccountState;
    @XmlElement(name = "ServiceAccountZip")
    protected String serviceAccountZip;
    @XmlElement(name = "ServiceId")
    protected String serviceId;
    @XmlElement(name = "ShipInstrustions")
    protected String shipInstrustions;
    @XmlElement(name = "ShipToAccount")
    protected String shipToAccount;
    @XmlElement(name = "ShipToAccountId")
    protected String shipToAccountId;
    @XmlElement(name = "ShipToAccountLocation")
    protected String shipToAccountLocation;
    @XmlElement(name = "ShipToAddress")
    protected String shipToAddress;
    @XmlElement(name = "ShipToAddress2")
    protected String shipToAddress2;
    @XmlElement(name = "ShipToAddressId")
    protected String shipToAddressId;
    @XmlElement(name = "ShipToCity")
    protected String shipToCity;
    @XmlElement(name = "ShipToContact-Email")
    protected String shipToContactEmail;
    @XmlElement(name = "ShipToContact-FirstName")
    protected String shipToContactFirstName;
    @XmlElement(name = "ShipToContact-LastName")
    protected String shipToContactLastName;
    @XmlElement(name = "ShipToContact-WorkPhone")
    protected String shipToContactWorkPhone;
    @XmlElement(name = "ShipToContactId")
    protected String shipToContactId;
    @XmlElement(name = "ShipToCountry")
    protected String shipToCountry;
    @XmlElement(name = "ShipToState")
    protected String shipToState;
    @XmlElement(name = "ShipToZip")
    protected String shipToZip;
    @XmlElement(name = "SmartPartNumber")
    protected String smartPartNumber;
    @XmlElement(name = "Status")
    protected String status;
    @XmlElement(name = "TaxAmount")
    protected BigDecimal taxAmount;
    @XmlElement(name = "TaxExemptFlag")
    protected Boolean taxExemptFlag;
    @XmlElement(name = "ToNode")
    protected String toNode;
    @XmlElement(name = "ToServiceAccount")
    protected String toServiceAccount;
    @XmlElement(name = "ToServiceAccountId")
    protected String toServiceAccountId;
    @XmlElement(name = "UnitPrice")
    protected BigDecimal unitPrice;
    @XmlElement(name = "UnitofMeasure")
    protected String unitofMeasure;
    @XmlElement(name = "VODRowId")
    protected String vodRowId;
    @XmlElement(name = "VolumeDiscountId")
    protected String volumeDiscountId;
    @XmlElement(name = "VolumeDiscountItem")
    protected String volumeDiscountItem;
    @XmlElement(name = "VolumeDiscountItemId")
    protected String volumeDiscountItemId;
    @XmlElement(name = "VolumeUpsellItem")
    protected String volumeUpsellItem;
    @XmlElement(name = "VolumeUpsellItemId")
    protected String volumeUpsellItemId;
    @XmlElement(name = "VolumeUpsellMessage")
    protected String volumeUpsellMessage;
    @XmlElement(name = "Write-InProduct")
    protected String writeInProduct;
    @XmlElement(name = "PersonalShipToAddress")
    protected String personalShipToAddress;
    @XmlElement(name = "PersonalShipToAddress2")
    protected String personalShipToAddress2;
    @XmlElement(name = "PersonalShipToAddressId")
    protected String personalShipToAddressId;
    @XmlElement(name = "PersonalShipToCity")
    protected String personalShipToCity;
    @XmlElement(name = "PersonalShipToCountry")
    protected String personalShipToCountry;
    @XmlElement(name = "PersonalShipToState")
    protected String personalShipToState;
    @XmlElement(name = "PersonalShipToZip")
    protected String personalShipToZip;
    @XmlElement(name = "PersonalShipToAddressee")
    protected String personalShipToAddressee;
    @XmlElement(name = "ShipToAddressee")
    protected String shipToAddressee;
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
    protected XMLGregorianCalendar requestedPortingDate;
    @XmlElement(name = "ServicePostalCode")
    protected String servicePostalCode;
    @XmlElement(name = "StartingPhoneNumber")
    protected String startingPhoneNumber;
    @XmlElement(name = "ListOfOrderItemXADetail")
    protected ListOfOrderItemXADetailData listOfOrderItemXADetail;
    @XmlElement(name = "ListOfOrderItemProductLine")
    protected ListOfOrderItemProductLineData listOfOrderItemProductLine;
    @XmlElement(name = "OrderItemDetail")
    protected List<OrderItemDetailData> orderItemDetail;
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
     * Gets the value of the amountExchangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAmountExchangeDate() {
        return amountExchangeDate;
    }

    /**
     * Sets the value of the amountExchangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAmountExchangeDate(XMLGregorianCalendar value) {
        this.amountExchangeDate = value;
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
     * Gets the value of the assetStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssetStatus() {
        return assetStatus;
    }

    /**
     * Sets the value of the assetStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssetStatus(String value) {
        this.assetStatus = value;
    }

    /**
     * Gets the value of the autoExplodeFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAutoExplodeFlag() {
        return autoExplodeFlag;
    }

    /**
     * Sets the value of the autoExplodeFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutoExplodeFlag(Boolean value) {
        this.autoExplodeFlag = value;
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
     * Gets the value of the calculatedAssetStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalculatedAssetStatus() {
        return calculatedAssetStatus;
    }

    /**
     * Sets the value of the calculatedAssetStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalculatedAssetStatus(String value) {
        this.calculatedAssetStatus = value;
    }

    /**
     * Gets the value of the calculatedDueDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCalculatedDueDate() {
        return calculatedDueDate;
    }

    /**
     * Sets the value of the calculatedDueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCalculatedDueDate(XMLGregorianCalendar value) {
        this.calculatedDueDate = value;
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
     * Gets the value of the cfgActiveFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCfgActiveFlag() {
        return cfgActiveFlag;
    }

    /**
     * Sets the value of the cfgActiveFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCfgActiveFlag(Boolean value) {
        this.cfgActiveFlag = value;
    }

    /**
     * Gets the value of the cfgEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCfgEndDate() {
        return cfgEndDate;
    }

    /**
     * Sets the value of the cfgEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCfgEndDate(XMLGregorianCalendar value) {
        this.cfgEndDate = value;
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
     * Gets the value of the cfgObjectDefFirstVersion property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCfgObjectDefFirstVersion() {
        return cfgObjectDefFirstVersion;
    }

    /**
     * Sets the value of the cfgObjectDefFirstVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCfgObjectDefFirstVersion(Integer value) {
        this.cfgObjectDefFirstVersion = value;
    }

    /**
     * Gets the value of the cfgObjectDefLastVersion property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCfgObjectDefLastVersion() {
        return cfgObjectDefLastVersion;
    }

    /**
     * Sets the value of the cfgObjectDefLastVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCfgObjectDefLastVersion(Integer value) {
        this.cfgObjectDefLastVersion = value;
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
     * Gets the value of the cfgStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCfgStartDate() {
        return cfgStartDate;
    }

    /**
     * Sets the value of the cfgStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCfgStartDate(XMLGregorianCalendar value) {
        this.cfgStartDate = value;
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
     * Gets the value of the changeCost property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChangeCost() {
        return changeCost;
    }

    /**
     * Sets the value of the changeCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChangeCost(String value) {
        this.changeCost = value;
    }

    /**
     * Gets the value of the classRegistrationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassRegistrationId() {
        return classRegistrationId;
    }

    /**
     * Sets the value of the classRegistrationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassRegistrationId(String value) {
        this.classRegistrationId = value;
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
     * Gets the value of the cost property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCost() {
        return cost;
    }

    /**
     * Sets the value of the cost property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCost(BigDecimal value) {
        this.cost = value;
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
     * Gets the value of the discount2 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDiscount2() {
        return discount2;
    }

    /**
     * Sets the value of the discount2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDiscount2(BigDecimal value) {
        this.discount2 = value;
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
     * Gets the value of the dueDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDueDate() {
        return dueDate;
    }

    /**
     * Sets the value of the dueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDueDate(XMLGregorianCalendar value) {
        this.dueDate = value;
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
     * Gets the value of the headerCurrencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeaderCurrencyCode() {
        return headerCurrencyCode;
    }

    /**
     * Sets the value of the headerCurrencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeaderCurrencyCode(String value) {
        this.headerCurrencyCode = value;
    }

    /**
     * Gets the value of the headerDiscount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getHeaderDiscount() {
        return headerDiscount;
    }

    /**
     * Sets the value of the headerDiscount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setHeaderDiscount(BigDecimal value) {
        this.headerDiscount = value;
    }

    /**
     * Gets the value of the headerExchangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeaderExchangeDate() {
        return headerExchangeDate;
    }

    /**
     * Sets the value of the headerExchangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeaderExchangeDate(String value) {
        this.headerExchangeDate = value;
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
     * Gets the value of the isComplexProduct property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsComplexProduct() {
        return isComplexProduct;
    }

    /**
     * Sets the value of the isComplexProduct property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsComplexProduct(Boolean value) {
        this.isComplexProduct = value;
    }

    /**
     * Gets the value of the isComplexProductComponent property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsComplexProductComponent() {
        return isComplexProductComponent;
    }

    /**
     * Sets the value of the isComplexProductComponent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsComplexProductComponent(Boolean value) {
        this.isComplexProductComponent = value;
    }

    /**
     * Gets the value of the isComplexProductRoot property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsComplexProductRoot() {
        return isComplexProductRoot;
    }

    /**
     * Sets the value of the isComplexProductRoot property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsComplexProductRoot(Boolean value) {
        this.isComplexProductRoot = value;
    }

    /**
     * Gets the value of the itemPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getItemPrice() {
        return itemPrice;
    }

    /**
     * Sets the value of the itemPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setItemPrice(BigDecimal value) {
        this.itemPrice = value;
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
     * Gets the value of the jointWorkspaceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJointWorkspaceId() {
        return jointWorkspaceId;
    }

    /**
     * Sets the value of the jointWorkspaceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJointWorkspaceId(String value) {
        this.jointWorkspaceId = value;
    }

    /**
     * Gets the value of the lineNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLineNumber() {
        return lineNumber;
    }

    /**
     * Sets the value of the lineNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLineNumber(Integer value) {
        this.lineNumber = value;
    }

    /**
     * Gets the value of the lineNumber2 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLineNumber2() {
        return lineNumber2;
    }

    /**
     * Sets the value of the lineNumber2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLineNumber2(BigDecimal value) {
        this.lineNumber2 = value;
    }

    /**
     * Gets the value of the mrcCxTotal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMRCCxTotal() {
        return mrcCxTotal;
    }

    /**
     * Sets the value of the mrcCxTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMRCCxTotal(BigDecimal value) {
        this.mrcCxTotal = value;
    }

    /**
     * Gets the value of the mrcCxTotalinHeaderCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMRCCxTotalinHeaderCurrency() {
        return mrcCxTotalinHeaderCurrency;
    }

    /**
     * Sets the value of the mrcCxTotalinHeaderCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMRCCxTotalinHeaderCurrency(BigDecimal value) {
        this.mrcCxTotalinHeaderCurrency = value;
    }

    /**
     * Gets the value of the maximumQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaximumQuantity() {
        return maximumQuantity;
    }

    /**
     * Sets the value of the maximumQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaximumQuantity(BigDecimal value) {
        this.maximumQuantity = value;
    }

    /**
     * Gets the value of the minimumQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMinimumQuantity() {
        return minimumQuantity;
    }

    /**
     * Sets the value of the minimumQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMinimumQuantity(BigDecimal value) {
        this.minimumQuantity = value;
    }

    /**
     * Gets the value of the nrcCxTotal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNRCCxTotal() {
        return nrcCxTotal;
    }

    /**
     * Sets the value of the nrcCxTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNRCCxTotal(BigDecimal value) {
        this.nrcCxTotal = value;
    }

    /**
     * Gets the value of the nrcCxTotalinHeaderCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNRCCxTotalinHeaderCurrency() {
        return nrcCxTotalinHeaderCurrency;
    }

    /**
     * Sets the value of the nrcCxTotalinHeaderCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNRCCxTotalinHeaderCurrency(BigDecimal value) {
        this.nrcCxTotalinHeaderCurrency = value;
    }

    /**
     * Gets the value of the needRefreshBasePrice property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNeedRefreshBasePrice() {
        return needRefreshBasePrice;
    }

    /**
     * Sets the value of the needRefreshBasePrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNeedRefreshBasePrice(Boolean value) {
        this.needRefreshBasePrice = value;
    }

    /**
     * Gets the value of the netPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNetPrice() {
        return netPrice;
    }

    /**
     * Sets the value of the netPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNetPrice(BigDecimal value) {
        this.netPrice = value;
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
     * Gets the value of the orderActiveFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOrderActiveFlag() {
        return orderActiveFlag;
    }

    /**
     * Sets the value of the orderActiveFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOrderActiveFlag(Boolean value) {
        this.orderActiveFlag = value;
    }

    /**
     * Gets the value of the orderCPN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderCPN() {
        return orderCPN;
    }

    /**
     * Sets the value of the orderCPN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderCPN(String value) {
        this.orderCPN = value;
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
     * Gets the value of the parentOrderItemId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentOrderItemId() {
        return parentOrderItemId;
    }

    /**
     * Sets the value of the parentOrderItemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentOrderItemId(String value) {
        this.parentOrderItemId = value;
    }

    /**
     * Gets the value of the partNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartNumber() {
        return partNumber;
    }

    /**
     * Sets the value of the partNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartNumber(String value) {
        this.partNumber = value;
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
     *     {@link Boolean }
     *     
     */
    public Boolean isPrePickCD() {
        return prePickCD;
    }

    /**
     * Sets the value of the prePickCD property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPrePickCD(Boolean value) {
        this.prePickCD = value;
    }

    /**
     * Gets the value of the previousAssetStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreviousAssetStatus() {
        return previousAssetStatus;
    }

    /**
     * Sets the value of the previousAssetStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreviousAssetStatus(String value) {
        this.previousAssetStatus = value;
    }

    /**
     * Gets the value of the previousBillingAccountId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreviousBillingAccountId() {
        return previousBillingAccountId;
    }

    /**
     * Sets the value of the previousBillingAccountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreviousBillingAccountId(String value) {
        this.previousBillingAccountId = value;
    }

    /**
     * Gets the value of the previousServiceAccountId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreviousServiceAccountId() {
        return previousServiceAccountId;
    }

    /**
     * Sets the value of the previousServiceAccountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreviousServiceAccountId(String value) {
        this.previousServiceAccountId = value;
    }

    /**
     * Gets the value of the previousServiceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreviousServiceId() {
        return previousServiceId;
    }

    /**
     * Sets the value of the previousServiceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreviousServiceId(String value) {
        this.previousServiceId = value;
    }

    /**
     * Gets the value of the previousUsageAssetId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreviousUsageAssetId() {
        return previousUsageAssetId;
    }

    /**
     * Sets the value of the previousUsageAssetId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreviousUsageAssetId(String value) {
        this.previousUsageAssetId = value;
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
     * Gets the value of the processedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isProcessedFlag() {
        return processedFlag;
    }

    /**
     * Sets the value of the processedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setProcessedFlag(Boolean value) {
        this.processedFlag = value;
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
     * Gets the value of the product property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProduct() {
        return product;
    }

    /**
     * Sets the value of the product property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProduct(String value) {
        this.product = value;
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
     * Gets the value of the promotionItemFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPromotionItemFlag() {
        return promotionItemFlag;
    }

    /**
     * Sets the value of the promotionItemFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPromotionItemFlag(Boolean value) {
        this.promotionItemFlag = value;
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
     * Gets the value of the quantityRequested property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getQuantityRequested() {
        return quantityRequested;
    }

    /**
     * Sets the value of the quantityRequested property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setQuantityRequested(Integer value) {
        this.quantityRequested = value;
    }

    /**
     * Gets the value of the quantityShipped property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getQuantityShipped() {
        return quantityShipped;
    }

    /**
     * Sets the value of the quantityShipped property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setQuantityShipped(Integer value) {
        this.quantityShipped = value;
    }

    /**
     * Gets the value of the revisedLineItemId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRevisedLineItemId() {
        return revisedLineItemId;
    }

    /**
     * Sets the value of the revisedLineItemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRevisedLineItemId(String value) {
        this.revisedLineItemId = value;
    }

    /**
     * Gets the value of the rollupAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRollupAmount() {
        return rollupAmount;
    }

    /**
     * Sets the value of the rollupAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRollupAmount(BigDecimal value) {
        this.rollupAmount = value;
    }

    /**
     * Gets the value of the rollupItemPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRollupItemPrice() {
        return rollupItemPrice;
    }

    /**
     * Sets the value of the rollupItemPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRollupItemPrice(BigDecimal value) {
        this.rollupItemPrice = value;
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
     * Gets the value of the rootItemPriceListId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRootItemPriceListId() {
        return rootItemPriceListId;
    }

    /**
     * Sets the value of the rootItemPriceListId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRootItemPriceListId(String value) {
        this.rootItemPriceListId = value;
    }

    /**
     * Gets the value of the rootOrderItemId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRootOrderItemId() {
        return rootOrderItemId;
    }

    /**
     * Sets the value of the rootOrderItemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRootOrderItemId(String value) {
        this.rootOrderItemId = value;
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
     * Gets the value of the salesServiceFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSalesServiceFlag() {
        return salesServiceFlag;
    }

    /**
     * Sets the value of the salesServiceFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSalesServiceFlag(Boolean value) {
        this.salesServiceFlag = value;
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
     * Gets the value of the serviceAccountAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceAccountAddress() {
        return serviceAccountAddress;
    }

    /**
     * Sets the value of the serviceAccountAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceAccountAddress(String value) {
        this.serviceAccountAddress = value;
    }

    /**
     * Gets the value of the serviceAccountAddress2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceAccountAddress2() {
        return serviceAccountAddress2;
    }

    /**
     * Sets the value of the serviceAccountAddress2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceAccountAddress2(String value) {
        this.serviceAccountAddress2 = value;
    }

    /**
     * Gets the value of the serviceAccountAddressId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceAccountAddressId() {
        return serviceAccountAddressId;
    }

    /**
     * Sets the value of the serviceAccountAddressId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceAccountAddressId(String value) {
        this.serviceAccountAddressId = value;
    }

    /**
     * Gets the value of the serviceAccountCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceAccountCity() {
        return serviceAccountCity;
    }

    /**
     * Sets the value of the serviceAccountCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceAccountCity(String value) {
        this.serviceAccountCity = value;
    }

    /**
     * Gets the value of the serviceAccountCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceAccountCountry() {
        return serviceAccountCountry;
    }

    /**
     * Sets the value of the serviceAccountCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceAccountCountry(String value) {
        this.serviceAccountCountry = value;
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
     * Gets the value of the serviceAccountLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceAccountLocation() {
        return serviceAccountLocation;
    }

    /**
     * Sets the value of the serviceAccountLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceAccountLocation(String value) {
        this.serviceAccountLocation = value;
    }

    /**
     * Gets the value of the serviceAccountState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceAccountState() {
        return serviceAccountState;
    }

    /**
     * Sets the value of the serviceAccountState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceAccountState(String value) {
        this.serviceAccountState = value;
    }

    /**
     * Gets the value of the serviceAccountZip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceAccountZip() {
        return serviceAccountZip;
    }

    /**
     * Sets the value of the serviceAccountZip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceAccountZip(String value) {
        this.serviceAccountZip = value;
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
     * Gets the value of the shipInstrustions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipInstrustions() {
        return shipInstrustions;
    }

    /**
     * Sets the value of the shipInstrustions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipInstrustions(String value) {
        this.shipInstrustions = value;
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
     * Gets the value of the shipToAccountLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipToAccountLocation() {
        return shipToAccountLocation;
    }

    /**
     * Sets the value of the shipToAccountLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipToAccountLocation(String value) {
        this.shipToAccountLocation = value;
    }

    /**
     * Gets the value of the shipToAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipToAddress() {
        return shipToAddress;
    }

    /**
     * Sets the value of the shipToAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipToAddress(String value) {
        this.shipToAddress = value;
    }

    /**
     * Gets the value of the shipToAddress2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipToAddress2() {
        return shipToAddress2;
    }

    /**
     * Sets the value of the shipToAddress2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipToAddress2(String value) {
        this.shipToAddress2 = value;
    }

    /**
     * Gets the value of the shipToAddressId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipToAddressId() {
        return shipToAddressId;
    }

    /**
     * Sets the value of the shipToAddressId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipToAddressId(String value) {
        this.shipToAddressId = value;
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
     * Gets the value of the shipToZip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipToZip() {
        return shipToZip;
    }

    /**
     * Sets the value of the shipToZip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipToZip(String value) {
        this.shipToZip = value;
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
     * Gets the value of the taxAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTaxAmount() {
        return taxAmount;
    }

    /**
     * Sets the value of the taxAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTaxAmount(BigDecimal value) {
        this.taxAmount = value;
    }

    /**
     * Gets the value of the taxExemptFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTaxExemptFlag() {
        return taxExemptFlag;
    }

    /**
     * Sets the value of the taxExemptFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTaxExemptFlag(Boolean value) {
        this.taxExemptFlag = value;
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
     * Gets the value of the writeInProduct property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWriteInProduct() {
        return writeInProduct;
    }

    /**
     * Sets the value of the writeInProduct property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWriteInProduct(String value) {
        this.writeInProduct = value;
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
     * Gets the value of the personalShipToAddressee property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonalShipToAddressee() {
        return personalShipToAddressee;
    }

    /**
     * Sets the value of the personalShipToAddressee property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonalShipToAddressee(String value) {
        this.personalShipToAddressee = value;
    }

    /**
     * Gets the value of the shipToAddressee property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipToAddressee() {
        return shipToAddressee;
    }

    /**
     * Sets the value of the shipToAddressee property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipToAddressee(String value) {
        this.shipToAddressee = value;
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
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRequestedPortingDate() {
        return requestedPortingDate;
    }

    /**
     * Sets the value of the requestedPortingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRequestedPortingDate(XMLGregorianCalendar value) {
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
     * Gets the value of the listOfOrderItemXADetail property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfOrderItemXADetailData }
     *     
     */
    public ListOfOrderItemXADetailData getListOfOrderItemXADetail() {
        return listOfOrderItemXADetail;
    }

    /**
     * Sets the value of the listOfOrderItemXADetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfOrderItemXADetailData }
     *     
     */
    public void setListOfOrderItemXADetail(ListOfOrderItemXADetailData value) {
        this.listOfOrderItemXADetail = value;
    }

    /**
     * Gets the value of the listOfOrderItemProductLine property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfOrderItemProductLineData }
     *     
     */
    public ListOfOrderItemProductLineData getListOfOrderItemProductLine() {
        return listOfOrderItemProductLine;
    }

    /**
     * Sets the value of the listOfOrderItemProductLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfOrderItemProductLineData }
     *     
     */
    public void setListOfOrderItemProductLine(ListOfOrderItemProductLineData value) {
        this.listOfOrderItemProductLine = value;
    }

    /**
     * Gets the value of the orderItemDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the orderItemDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrderItemDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrderItemDetailData }
     * 
     * 
     */
    public List<OrderItemDetailData> getOrderItemDetail() {
        if (orderItemDetail == null) {
            orderItemDetail = new ArrayList<OrderItemDetailData>();
        }
        return this.orderItemDetail;
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
