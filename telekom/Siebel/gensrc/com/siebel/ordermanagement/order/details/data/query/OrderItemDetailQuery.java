
package com.siebel.ordermanagement.order.details.data.query;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrderItemDetailQuery complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderItemDetailQuery">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="Created" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="Updated" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ConflictId" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ModId" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ActionCode" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="AdjustedListPrice" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="AmountExchangeDate" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="AssetId" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="AssetIntegrationId" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="AssetStatus" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="AutoExplodeFlag" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="BasePrice" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="BillingAccountId" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="CalculatedAssetStatus" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="CalculatedDueDate" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="CarrierCode" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="CarrierPriority" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="CfgActiveFlag" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="CfgEndDate" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="CfgLatestReleasedFlag" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="CfgObjectDefFirstVersion" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="CfgObjectDefLastVersion" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="CfgReleasedFlag" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="CfgStartDate" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="CfgStateCode" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="CfgType" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="CfgVersion" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ChangeCost" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ClassRegistrationId" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="CommitmentCoveredFlag" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="CompoundProductFlag" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="CompoundProductNumber" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ConfigurationModelId" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ContactEmail" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ContactFirstName" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ContactId" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ContactLastName" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ContactWorkPhone" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ConvertToAgreementFlag" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ConvertToAssetFlag" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="Cost" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="CurrencyCode" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="Discount2" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="DiscountAmount" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="DiscountPercent" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="DiscountSource" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="DueDate" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="EligibilityReason" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="EligibilityStatus" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ExchangeDate" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ExcludePricingFlag" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ExtendedQuantity" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ForcastableFlag" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="HasGenericsFlag" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="HeaderCurrencyCode" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="HeaderDiscount" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="HeaderExchangeDate" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="InclusiveEligibilityFlag" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="IntegrationId" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="IsComplexProduct" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="IsComplexProductComponent" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="IsComplexProductRoot" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ItemPrice" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ItemPriceListId" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="JointWorkspaceId" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="LineNumber" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="LineNumber2" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="MRCCxTotal" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="MRCCxTotalinHeaderCurrency" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="MaximumQuantity" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="MinimumQuantity" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="NRCCxTotal" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="NRCCxTotalinHeaderCurrency" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="NeedRefreshBasePrice" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="NetPrice" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="NetworkElementType" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="Node" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="OrderActiveFlag" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="OrderCPN" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="OrderHeaderId" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="OwnerAccountId" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ParentOrderItemId" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PartNumber" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PostPickCD" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PrePickCD" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PreviousAssetStatus" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PreviousBillingAccountId" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PreviousServiceAccountId" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PreviousServiceId" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PreviousUsageAssetId" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PriceListId" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PriceType" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PricingComments" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ProcessedFlag" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ProdItemId" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ProdPromId" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ProdPromInstanceId" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ProdPromName" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ProdPromRuleId" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ProdPromSourceId" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="Product" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ProductDefTypeCode" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ProductEffectiveFrom" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ProductEffectiveTo" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ProductId" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ProductPortId" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ProductPrimaryProductLineId" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ProductTypeCode" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ProductXAClassId" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PromotionItemFlag" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="Quantity" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="QuantityRequested" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="QuantityShipped" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="RevisedLineItemId" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="RollupAmount" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="RollupItemPrice" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="RootAssetIntegrationId" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="RootItemPriceListId" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="RootOrderItemId" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="RootProductId" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="SalesServiceFlag" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ServiceAccount" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ServiceAccountAddress" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ServiceAccountAddress2" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ServiceAccountAddressId" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ServiceAccountCity" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ServiceAccountCountry" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ServiceAccountId" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ServiceAccountLocation" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ServiceAccountState" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ServiceAccountZip" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ServiceId" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ShipInstrustions" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ShipToAccount" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ShipToAccountId" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ShipToAccountLocation" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ShipToAddress" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ShipToAddress2" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ShipToAddressId" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ShipToCity" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ShipToContact-Email" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ShipToContact-FirstName" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ShipToContact-LastName" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ShipToContact-WorkPhone" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ShipToContactId" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ShipToCountry" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ShipToState" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ShipToZip" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="SmartPartNumber" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="TaxAmount" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="TaxExemptFlag" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ToNode" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ToServiceAccount" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ToServiceAccountId" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="UnitPrice" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="UnitofMeasure" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="VODRowId" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="VolumeDiscountId" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="VolumeDiscountItem" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="VolumeDiscountItemId" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="VolumeUpsellItem" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="VolumeUpsellItemId" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="VolumeUpsellMessage" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="Write-InProduct" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PersonalShipToAddress" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PersonalShipToAddress2" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PersonalShipToAddressId" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PersonalShipToCity" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PersonalShipToCountry" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PersonalShipToState" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PersonalShipToZip" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PersonalShipToAddressee" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ShipToAddressee" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="BillingAccount" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="BillingAccountAddress" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="BillingAccountNumber" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="BillingAccountLocation" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="BillingProfileId" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="BillingProfileName" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="BillingAccountAddress2" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="BillingAccountAddressId" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="BillingAccountCity" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="BillingAccountContactId" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="BillingAccountCountry" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="BillingAccountState" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="BillingAccountZip" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="BillingContactEmail" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="BillingContactFirstName" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="BillingContactLastName" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="BillingContactWorkPhone" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="DonatingServiceProvider" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="EndingPhoneNumber" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="LegacyAccountNumber" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="NumberPortabilityAgencyName" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="NumberToPort" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PIN" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="RequestedPortingDate" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ServicePostalCode" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="StartingPhoneNumber" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ListOfOrderItemXADetail" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}ListOfOrderItemXADetailQuery" minOccurs="0"/>
 *         &lt;element name="ListOfOrderItemProductLine" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}ListOfOrderItemProductLineQuery" minOccurs="0"/>
 *         &lt;element name="OrderItemDetail" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}OrderItemDetailQuery" minOccurs="0"/>
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
@XmlType(name = "OrderItemDetailQuery", propOrder = {
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
public class OrderItemDetailQuery
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
    @XmlElement(name = "ActionCode")
    protected QueryType actionCode;
    @XmlElement(name = "AdjustedListPrice")
    protected QueryType adjustedListPrice;
    @XmlElement(name = "AmountExchangeDate")
    protected QueryType amountExchangeDate;
    @XmlElement(name = "AssetId")
    protected QueryType assetId;
    @XmlElement(name = "AssetIntegrationId")
    protected QueryType assetIntegrationId;
    @XmlElement(name = "AssetStatus")
    protected QueryType assetStatus;
    @XmlElement(name = "AutoExplodeFlag")
    protected QueryType autoExplodeFlag;
    @XmlElement(name = "BasePrice")
    protected QueryType basePrice;
    @XmlElement(name = "BillingAccountId")
    protected QueryType billingAccountId;
    @XmlElement(name = "CalculatedAssetStatus")
    protected QueryType calculatedAssetStatus;
    @XmlElement(name = "CalculatedDueDate")
    protected QueryType calculatedDueDate;
    @XmlElement(name = "CarrierCode")
    protected QueryType carrierCode;
    @XmlElement(name = "CarrierPriority")
    protected QueryType carrierPriority;
    @XmlElement(name = "CfgActiveFlag")
    protected QueryType cfgActiveFlag;
    @XmlElement(name = "CfgEndDate")
    protected QueryType cfgEndDate;
    @XmlElement(name = "CfgLatestReleasedFlag")
    protected QueryType cfgLatestReleasedFlag;
    @XmlElement(name = "CfgObjectDefFirstVersion")
    protected QueryType cfgObjectDefFirstVersion;
    @XmlElement(name = "CfgObjectDefLastVersion")
    protected QueryType cfgObjectDefLastVersion;
    @XmlElement(name = "CfgReleasedFlag")
    protected QueryType cfgReleasedFlag;
    @XmlElement(name = "CfgStartDate")
    protected QueryType cfgStartDate;
    @XmlElement(name = "CfgStateCode")
    protected QueryType cfgStateCode;
    @XmlElement(name = "CfgType")
    protected QueryType cfgType;
    @XmlElement(name = "CfgVersion")
    protected QueryType cfgVersion;
    @XmlElement(name = "ChangeCost")
    protected QueryType changeCost;
    @XmlElement(name = "ClassRegistrationId")
    protected QueryType classRegistrationId;
    @XmlElement(name = "CommitmentCoveredFlag")
    protected QueryType commitmentCoveredFlag;
    @XmlElement(name = "CompoundProductFlag")
    protected QueryType compoundProductFlag;
    @XmlElement(name = "CompoundProductNumber")
    protected QueryType compoundProductNumber;
    @XmlElement(name = "ConfigurationModelId")
    protected QueryType configurationModelId;
    @XmlElement(name = "ContactEmail")
    protected QueryType contactEmail;
    @XmlElement(name = "ContactFirstName")
    protected QueryType contactFirstName;
    @XmlElement(name = "ContactId")
    protected QueryType contactId;
    @XmlElement(name = "ContactLastName")
    protected QueryType contactLastName;
    @XmlElement(name = "ContactWorkPhone")
    protected QueryType contactWorkPhone;
    @XmlElement(name = "ConvertToAgreementFlag")
    protected QueryType convertToAgreementFlag;
    @XmlElement(name = "ConvertToAssetFlag")
    protected QueryType convertToAssetFlag;
    @XmlElement(name = "Cost")
    protected QueryType cost;
    @XmlElement(name = "CurrencyCode")
    protected QueryType currencyCode;
    @XmlElement(name = "Discount2")
    protected QueryType discount2;
    @XmlElement(name = "DiscountAmount")
    protected QueryType discountAmount;
    @XmlElement(name = "DiscountPercent")
    protected QueryType discountPercent;
    @XmlElement(name = "DiscountSource")
    protected QueryType discountSource;
    @XmlElement(name = "DueDate")
    protected QueryType dueDate;
    @XmlElement(name = "EligibilityReason")
    protected QueryType eligibilityReason;
    @XmlElement(name = "EligibilityStatus")
    protected QueryType eligibilityStatus;
    @XmlElement(name = "ExchangeDate")
    protected QueryType exchangeDate;
    @XmlElement(name = "ExcludePricingFlag")
    protected QueryType excludePricingFlag;
    @XmlElement(name = "ExtendedQuantity")
    protected QueryType extendedQuantity;
    @XmlElement(name = "ForcastableFlag")
    protected QueryType forcastableFlag;
    @XmlElement(name = "HasGenericsFlag")
    protected QueryType hasGenericsFlag;
    @XmlElement(name = "HeaderCurrencyCode")
    protected QueryType headerCurrencyCode;
    @XmlElement(name = "HeaderDiscount")
    protected QueryType headerDiscount;
    @XmlElement(name = "HeaderExchangeDate")
    protected QueryType headerExchangeDate;
    @XmlElement(name = "InclusiveEligibilityFlag")
    protected QueryType inclusiveEligibilityFlag;
    @XmlElement(name = "IntegrationId")
    protected QueryType integrationId;
    @XmlElement(name = "IsComplexProduct")
    protected QueryType isComplexProduct;
    @XmlElement(name = "IsComplexProductComponent")
    protected QueryType isComplexProductComponent;
    @XmlElement(name = "IsComplexProductRoot")
    protected QueryType isComplexProductRoot;
    @XmlElement(name = "ItemPrice")
    protected QueryType itemPrice;
    @XmlElement(name = "ItemPriceListId")
    protected QueryType itemPriceListId;
    @XmlElement(name = "JointWorkspaceId")
    protected QueryType jointWorkspaceId;
    @XmlElement(name = "LineNumber")
    protected QueryType lineNumber;
    @XmlElement(name = "LineNumber2")
    protected QueryType lineNumber2;
    @XmlElement(name = "MRCCxTotal")
    protected QueryType mrcCxTotal;
    @XmlElement(name = "MRCCxTotalinHeaderCurrency")
    protected QueryType mrcCxTotalinHeaderCurrency;
    @XmlElement(name = "MaximumQuantity")
    protected QueryType maximumQuantity;
    @XmlElement(name = "MinimumQuantity")
    protected QueryType minimumQuantity;
    @XmlElement(name = "NRCCxTotal")
    protected QueryType nrcCxTotal;
    @XmlElement(name = "NRCCxTotalinHeaderCurrency")
    protected QueryType nrcCxTotalinHeaderCurrency;
    @XmlElement(name = "NeedRefreshBasePrice")
    protected QueryType needRefreshBasePrice;
    @XmlElement(name = "NetPrice")
    protected QueryType netPrice;
    @XmlElement(name = "NetworkElementType")
    protected QueryType networkElementType;
    @XmlElement(name = "Node")
    protected QueryType node;
    @XmlElement(name = "OrderActiveFlag")
    protected QueryType orderActiveFlag;
    @XmlElement(name = "OrderCPN")
    protected QueryType orderCPN;
    @XmlElement(name = "OrderHeaderId")
    protected QueryType orderHeaderId;
    @XmlElement(name = "OwnerAccountId")
    protected QueryType ownerAccountId;
    @XmlElement(name = "ParentOrderItemId")
    protected QueryType parentOrderItemId;
    @XmlElement(name = "PartNumber")
    protected QueryType partNumber;
    @XmlElement(name = "PostPickCD")
    protected QueryType postPickCD;
    @XmlElement(name = "PrePickCD")
    protected QueryType prePickCD;
    @XmlElement(name = "PreviousAssetStatus")
    protected QueryType previousAssetStatus;
    @XmlElement(name = "PreviousBillingAccountId")
    protected QueryType previousBillingAccountId;
    @XmlElement(name = "PreviousServiceAccountId")
    protected QueryType previousServiceAccountId;
    @XmlElement(name = "PreviousServiceId")
    protected QueryType previousServiceId;
    @XmlElement(name = "PreviousUsageAssetId")
    protected QueryType previousUsageAssetId;
    @XmlElement(name = "PriceListId")
    protected QueryType priceListId;
    @XmlElement(name = "PriceType")
    protected QueryType priceType;
    @XmlElement(name = "PricingComments")
    protected QueryType pricingComments;
    @XmlElement(name = "ProcessedFlag")
    protected QueryType processedFlag;
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
    @XmlElement(name = "Product")
    protected QueryType product;
    @XmlElement(name = "ProductDefTypeCode")
    protected QueryType productDefTypeCode;
    @XmlElement(name = "ProductEffectiveFrom")
    protected QueryType productEffectiveFrom;
    @XmlElement(name = "ProductEffectiveTo")
    protected QueryType productEffectiveTo;
    @XmlElement(name = "ProductId")
    protected QueryType productId;
    @XmlElement(name = "ProductPortId")
    protected QueryType productPortId;
    @XmlElement(name = "ProductPrimaryProductLineId")
    protected QueryType productPrimaryProductLineId;
    @XmlElement(name = "ProductTypeCode")
    protected QueryType productTypeCode;
    @XmlElement(name = "ProductXAClassId")
    protected QueryType productXAClassId;
    @XmlElement(name = "PromotionItemFlag")
    protected QueryType promotionItemFlag;
    @XmlElement(name = "Quantity")
    protected QueryType quantity;
    @XmlElement(name = "QuantityRequested")
    protected QueryType quantityRequested;
    @XmlElement(name = "QuantityShipped")
    protected QueryType quantityShipped;
    @XmlElement(name = "RevisedLineItemId")
    protected QueryType revisedLineItemId;
    @XmlElement(name = "RollupAmount")
    protected QueryType rollupAmount;
    @XmlElement(name = "RollupItemPrice")
    protected QueryType rollupItemPrice;
    @XmlElement(name = "RootAssetIntegrationId")
    protected QueryType rootAssetIntegrationId;
    @XmlElement(name = "RootItemPriceListId")
    protected QueryType rootItemPriceListId;
    @XmlElement(name = "RootOrderItemId")
    protected QueryType rootOrderItemId;
    @XmlElement(name = "RootProductId")
    protected QueryType rootProductId;
    @XmlElement(name = "SalesServiceFlag")
    protected QueryType salesServiceFlag;
    @XmlElement(name = "ServiceAccount")
    protected QueryType serviceAccount;
    @XmlElement(name = "ServiceAccountAddress")
    protected QueryType serviceAccountAddress;
    @XmlElement(name = "ServiceAccountAddress2")
    protected QueryType serviceAccountAddress2;
    @XmlElement(name = "ServiceAccountAddressId")
    protected QueryType serviceAccountAddressId;
    @XmlElement(name = "ServiceAccountCity")
    protected QueryType serviceAccountCity;
    @XmlElement(name = "ServiceAccountCountry")
    protected QueryType serviceAccountCountry;
    @XmlElement(name = "ServiceAccountId")
    protected QueryType serviceAccountId;
    @XmlElement(name = "ServiceAccountLocation")
    protected QueryType serviceAccountLocation;
    @XmlElement(name = "ServiceAccountState")
    protected QueryType serviceAccountState;
    @XmlElement(name = "ServiceAccountZip")
    protected QueryType serviceAccountZip;
    @XmlElement(name = "ServiceId")
    protected QueryType serviceId;
    @XmlElement(name = "ShipInstrustions")
    protected QueryType shipInstrustions;
    @XmlElement(name = "ShipToAccount")
    protected QueryType shipToAccount;
    @XmlElement(name = "ShipToAccountId")
    protected QueryType shipToAccountId;
    @XmlElement(name = "ShipToAccountLocation")
    protected QueryType shipToAccountLocation;
    @XmlElement(name = "ShipToAddress")
    protected QueryType shipToAddress;
    @XmlElement(name = "ShipToAddress2")
    protected QueryType shipToAddress2;
    @XmlElement(name = "ShipToAddressId")
    protected QueryType shipToAddressId;
    @XmlElement(name = "ShipToCity")
    protected QueryType shipToCity;
    @XmlElement(name = "ShipToContact-Email")
    protected QueryType shipToContactEmail;
    @XmlElement(name = "ShipToContact-FirstName")
    protected QueryType shipToContactFirstName;
    @XmlElement(name = "ShipToContact-LastName")
    protected QueryType shipToContactLastName;
    @XmlElement(name = "ShipToContact-WorkPhone")
    protected QueryType shipToContactWorkPhone;
    @XmlElement(name = "ShipToContactId")
    protected QueryType shipToContactId;
    @XmlElement(name = "ShipToCountry")
    protected QueryType shipToCountry;
    @XmlElement(name = "ShipToState")
    protected QueryType shipToState;
    @XmlElement(name = "ShipToZip")
    protected QueryType shipToZip;
    @XmlElement(name = "SmartPartNumber")
    protected QueryType smartPartNumber;
    @XmlElement(name = "Status")
    protected QueryType status;
    @XmlElement(name = "TaxAmount")
    protected QueryType taxAmount;
    @XmlElement(name = "TaxExemptFlag")
    protected QueryType taxExemptFlag;
    @XmlElement(name = "ToNode")
    protected QueryType toNode;
    @XmlElement(name = "ToServiceAccount")
    protected QueryType toServiceAccount;
    @XmlElement(name = "ToServiceAccountId")
    protected QueryType toServiceAccountId;
    @XmlElement(name = "UnitPrice")
    protected QueryType unitPrice;
    @XmlElement(name = "UnitofMeasure")
    protected QueryType unitofMeasure;
    @XmlElement(name = "VODRowId")
    protected QueryType vodRowId;
    @XmlElement(name = "VolumeDiscountId")
    protected QueryType volumeDiscountId;
    @XmlElement(name = "VolumeDiscountItem")
    protected QueryType volumeDiscountItem;
    @XmlElement(name = "VolumeDiscountItemId")
    protected QueryType volumeDiscountItemId;
    @XmlElement(name = "VolumeUpsellItem")
    protected QueryType volumeUpsellItem;
    @XmlElement(name = "VolumeUpsellItemId")
    protected QueryType volumeUpsellItemId;
    @XmlElement(name = "VolumeUpsellMessage")
    protected QueryType volumeUpsellMessage;
    @XmlElement(name = "Write-InProduct")
    protected QueryType writeInProduct;
    @XmlElement(name = "PersonalShipToAddress")
    protected QueryType personalShipToAddress;
    @XmlElement(name = "PersonalShipToAddress2")
    protected QueryType personalShipToAddress2;
    @XmlElement(name = "PersonalShipToAddressId")
    protected QueryType personalShipToAddressId;
    @XmlElement(name = "PersonalShipToCity")
    protected QueryType personalShipToCity;
    @XmlElement(name = "PersonalShipToCountry")
    protected QueryType personalShipToCountry;
    @XmlElement(name = "PersonalShipToState")
    protected QueryType personalShipToState;
    @XmlElement(name = "PersonalShipToZip")
    protected QueryType personalShipToZip;
    @XmlElement(name = "PersonalShipToAddressee")
    protected QueryType personalShipToAddressee;
    @XmlElement(name = "ShipToAddressee")
    protected QueryType shipToAddressee;
    @XmlElement(name = "BillingAccount")
    protected QueryType billingAccount;
    @XmlElement(name = "BillingAccountAddress")
    protected QueryType billingAccountAddress;
    @XmlElement(name = "BillingAccountNumber")
    protected QueryType billingAccountNumber;
    @XmlElement(name = "BillingAccountLocation")
    protected QueryType billingAccountLocation;
    @XmlElement(name = "BillingProfileId")
    protected QueryType billingProfileId;
    @XmlElement(name = "BillingProfileName")
    protected QueryType billingProfileName;
    @XmlElement(name = "BillingAccountAddress2")
    protected QueryType billingAccountAddress2;
    @XmlElement(name = "BillingAccountAddressId")
    protected QueryType billingAccountAddressId;
    @XmlElement(name = "BillingAccountCity")
    protected QueryType billingAccountCity;
    @XmlElement(name = "BillingAccountContactId")
    protected QueryType billingAccountContactId;
    @XmlElement(name = "BillingAccountCountry")
    protected QueryType billingAccountCountry;
    @XmlElement(name = "BillingAccountState")
    protected QueryType billingAccountState;
    @XmlElement(name = "BillingAccountZip")
    protected QueryType billingAccountZip;
    @XmlElement(name = "BillingContactEmail")
    protected QueryType billingContactEmail;
    @XmlElement(name = "BillingContactFirstName")
    protected QueryType billingContactFirstName;
    @XmlElement(name = "BillingContactLastName")
    protected QueryType billingContactLastName;
    @XmlElement(name = "BillingContactWorkPhone")
    protected QueryType billingContactWorkPhone;
    @XmlElement(name = "DonatingServiceProvider")
    protected QueryType donatingServiceProvider;
    @XmlElement(name = "EndingPhoneNumber")
    protected QueryType endingPhoneNumber;
    @XmlElement(name = "LegacyAccountNumber")
    protected QueryType legacyAccountNumber;
    @XmlElement(name = "NumberPortabilityAgencyName")
    protected QueryType numberPortabilityAgencyName;
    @XmlElement(name = "NumberToPort")
    protected QueryType numberToPort;
    @XmlElement(name = "PIN")
    protected QueryType pin;
    @XmlElement(name = "RequestedPortingDate")
    protected QueryType requestedPortingDate;
    @XmlElement(name = "ServicePostalCode")
    protected QueryType servicePostalCode;
    @XmlElement(name = "StartingPhoneNumber")
    protected QueryType startingPhoneNumber;
    @XmlElement(name = "ListOfOrderItemXADetail")
    protected ListOfOrderItemXADetailQuery listOfOrderItemXADetail;
    @XmlElement(name = "ListOfOrderItemProductLine")
    protected ListOfOrderItemProductLineQuery listOfOrderItemProductLine;
    @XmlElement(name = "OrderItemDetail")
    protected OrderItemDetailQuery orderItemDetail;
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
     * Gets the value of the amountExchangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getAmountExchangeDate() {
        return amountExchangeDate;
    }

    /**
     * Sets the value of the amountExchangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setAmountExchangeDate(QueryType value) {
        this.amountExchangeDate = value;
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
     * Gets the value of the assetIntegrationId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getAssetIntegrationId() {
        return assetIntegrationId;
    }

    /**
     * Sets the value of the assetIntegrationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setAssetIntegrationId(QueryType value) {
        this.assetIntegrationId = value;
    }

    /**
     * Gets the value of the assetStatus property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getAssetStatus() {
        return assetStatus;
    }

    /**
     * Sets the value of the assetStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setAssetStatus(QueryType value) {
        this.assetStatus = value;
    }

    /**
     * Gets the value of the autoExplodeFlag property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getAutoExplodeFlag() {
        return autoExplodeFlag;
    }

    /**
     * Sets the value of the autoExplodeFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setAutoExplodeFlag(QueryType value) {
        this.autoExplodeFlag = value;
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
     * Gets the value of the calculatedAssetStatus property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getCalculatedAssetStatus() {
        return calculatedAssetStatus;
    }

    /**
     * Sets the value of the calculatedAssetStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setCalculatedAssetStatus(QueryType value) {
        this.calculatedAssetStatus = value;
    }

    /**
     * Gets the value of the calculatedDueDate property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getCalculatedDueDate() {
        return calculatedDueDate;
    }

    /**
     * Sets the value of the calculatedDueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setCalculatedDueDate(QueryType value) {
        this.calculatedDueDate = value;
    }

    /**
     * Gets the value of the carrierCode property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getCarrierCode() {
        return carrierCode;
    }

    /**
     * Sets the value of the carrierCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setCarrierCode(QueryType value) {
        this.carrierCode = value;
    }

    /**
     * Gets the value of the carrierPriority property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getCarrierPriority() {
        return carrierPriority;
    }

    /**
     * Sets the value of the carrierPriority property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setCarrierPriority(QueryType value) {
        this.carrierPriority = value;
    }

    /**
     * Gets the value of the cfgActiveFlag property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getCfgActiveFlag() {
        return cfgActiveFlag;
    }

    /**
     * Sets the value of the cfgActiveFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setCfgActiveFlag(QueryType value) {
        this.cfgActiveFlag = value;
    }

    /**
     * Gets the value of the cfgEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getCfgEndDate() {
        return cfgEndDate;
    }

    /**
     * Sets the value of the cfgEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setCfgEndDate(QueryType value) {
        this.cfgEndDate = value;
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
     * Gets the value of the cfgObjectDefFirstVersion property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getCfgObjectDefFirstVersion() {
        return cfgObjectDefFirstVersion;
    }

    /**
     * Sets the value of the cfgObjectDefFirstVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setCfgObjectDefFirstVersion(QueryType value) {
        this.cfgObjectDefFirstVersion = value;
    }

    /**
     * Gets the value of the cfgObjectDefLastVersion property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getCfgObjectDefLastVersion() {
        return cfgObjectDefLastVersion;
    }

    /**
     * Sets the value of the cfgObjectDefLastVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setCfgObjectDefLastVersion(QueryType value) {
        this.cfgObjectDefLastVersion = value;
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
     * Gets the value of the cfgStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getCfgStartDate() {
        return cfgStartDate;
    }

    /**
     * Sets the value of the cfgStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setCfgStartDate(QueryType value) {
        this.cfgStartDate = value;
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
     * Gets the value of the changeCost property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getChangeCost() {
        return changeCost;
    }

    /**
     * Sets the value of the changeCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setChangeCost(QueryType value) {
        this.changeCost = value;
    }

    /**
     * Gets the value of the classRegistrationId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getClassRegistrationId() {
        return classRegistrationId;
    }

    /**
     * Sets the value of the classRegistrationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setClassRegistrationId(QueryType value) {
        this.classRegistrationId = value;
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
     * Gets the value of the contactEmail property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getContactEmail() {
        return contactEmail;
    }

    /**
     * Sets the value of the contactEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setContactEmail(QueryType value) {
        this.contactEmail = value;
    }

    /**
     * Gets the value of the contactFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getContactFirstName() {
        return contactFirstName;
    }

    /**
     * Sets the value of the contactFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setContactFirstName(QueryType value) {
        this.contactFirstName = value;
    }

    /**
     * Gets the value of the contactId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getContactId() {
        return contactId;
    }

    /**
     * Sets the value of the contactId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setContactId(QueryType value) {
        this.contactId = value;
    }

    /**
     * Gets the value of the contactLastName property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getContactLastName() {
        return contactLastName;
    }

    /**
     * Sets the value of the contactLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setContactLastName(QueryType value) {
        this.contactLastName = value;
    }

    /**
     * Gets the value of the contactWorkPhone property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getContactWorkPhone() {
        return contactWorkPhone;
    }

    /**
     * Sets the value of the contactWorkPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setContactWorkPhone(QueryType value) {
        this.contactWorkPhone = value;
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
     * Gets the value of the cost property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getCost() {
        return cost;
    }

    /**
     * Sets the value of the cost property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setCost(QueryType value) {
        this.cost = value;
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
     * Gets the value of the discount2 property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getDiscount2() {
        return discount2;
    }

    /**
     * Sets the value of the discount2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setDiscount2(QueryType value) {
        this.discount2 = value;
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
     * Gets the value of the discountSource property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getDiscountSource() {
        return discountSource;
    }

    /**
     * Sets the value of the discountSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setDiscountSource(QueryType value) {
        this.discountSource = value;
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
     * Gets the value of the headerCurrencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getHeaderCurrencyCode() {
        return headerCurrencyCode;
    }

    /**
     * Sets the value of the headerCurrencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setHeaderCurrencyCode(QueryType value) {
        this.headerCurrencyCode = value;
    }

    /**
     * Gets the value of the headerDiscount property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getHeaderDiscount() {
        return headerDiscount;
    }

    /**
     * Sets the value of the headerDiscount property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setHeaderDiscount(QueryType value) {
        this.headerDiscount = value;
    }

    /**
     * Gets the value of the headerExchangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getHeaderExchangeDate() {
        return headerExchangeDate;
    }

    /**
     * Sets the value of the headerExchangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setHeaderExchangeDate(QueryType value) {
        this.headerExchangeDate = value;
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
     * Gets the value of the isComplexProduct property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getIsComplexProduct() {
        return isComplexProduct;
    }

    /**
     * Sets the value of the isComplexProduct property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setIsComplexProduct(QueryType value) {
        this.isComplexProduct = value;
    }

    /**
     * Gets the value of the isComplexProductComponent property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getIsComplexProductComponent() {
        return isComplexProductComponent;
    }

    /**
     * Sets the value of the isComplexProductComponent property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setIsComplexProductComponent(QueryType value) {
        this.isComplexProductComponent = value;
    }

    /**
     * Gets the value of the isComplexProductRoot property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getIsComplexProductRoot() {
        return isComplexProductRoot;
    }

    /**
     * Sets the value of the isComplexProductRoot property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setIsComplexProductRoot(QueryType value) {
        this.isComplexProductRoot = value;
    }

    /**
     * Gets the value of the itemPrice property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getItemPrice() {
        return itemPrice;
    }

    /**
     * Sets the value of the itemPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setItemPrice(QueryType value) {
        this.itemPrice = value;
    }

    /**
     * Gets the value of the itemPriceListId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getItemPriceListId() {
        return itemPriceListId;
    }

    /**
     * Sets the value of the itemPriceListId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setItemPriceListId(QueryType value) {
        this.itemPriceListId = value;
    }

    /**
     * Gets the value of the jointWorkspaceId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getJointWorkspaceId() {
        return jointWorkspaceId;
    }

    /**
     * Sets the value of the jointWorkspaceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setJointWorkspaceId(QueryType value) {
        this.jointWorkspaceId = value;
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
     * Gets the value of the lineNumber2 property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getLineNumber2() {
        return lineNumber2;
    }

    /**
     * Sets the value of the lineNumber2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setLineNumber2(QueryType value) {
        this.lineNumber2 = value;
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
     * Gets the value of the mrcCxTotalinHeaderCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getMRCCxTotalinHeaderCurrency() {
        return mrcCxTotalinHeaderCurrency;
    }

    /**
     * Sets the value of the mrcCxTotalinHeaderCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setMRCCxTotalinHeaderCurrency(QueryType value) {
        this.mrcCxTotalinHeaderCurrency = value;
    }

    /**
     * Gets the value of the maximumQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getMaximumQuantity() {
        return maximumQuantity;
    }

    /**
     * Sets the value of the maximumQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setMaximumQuantity(QueryType value) {
        this.maximumQuantity = value;
    }

    /**
     * Gets the value of the minimumQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getMinimumQuantity() {
        return minimumQuantity;
    }

    /**
     * Sets the value of the minimumQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setMinimumQuantity(QueryType value) {
        this.minimumQuantity = value;
    }

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
     * Gets the value of the nrcCxTotalinHeaderCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getNRCCxTotalinHeaderCurrency() {
        return nrcCxTotalinHeaderCurrency;
    }

    /**
     * Sets the value of the nrcCxTotalinHeaderCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setNRCCxTotalinHeaderCurrency(QueryType value) {
        this.nrcCxTotalinHeaderCurrency = value;
    }

    /**
     * Gets the value of the needRefreshBasePrice property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getNeedRefreshBasePrice() {
        return needRefreshBasePrice;
    }

    /**
     * Sets the value of the needRefreshBasePrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setNeedRefreshBasePrice(QueryType value) {
        this.needRefreshBasePrice = value;
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
     * Gets the value of the orderActiveFlag property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getOrderActiveFlag() {
        return orderActiveFlag;
    }

    /**
     * Sets the value of the orderActiveFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setOrderActiveFlag(QueryType value) {
        this.orderActiveFlag = value;
    }

    /**
     * Gets the value of the orderCPN property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getOrderCPN() {
        return orderCPN;
    }

    /**
     * Sets the value of the orderCPN property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setOrderCPN(QueryType value) {
        this.orderCPN = value;
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
     * Gets the value of the parentOrderItemId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getParentOrderItemId() {
        return parentOrderItemId;
    }

    /**
     * Sets the value of the parentOrderItemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setParentOrderItemId(QueryType value) {
        this.parentOrderItemId = value;
    }

    /**
     * Gets the value of the partNumber property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPartNumber() {
        return partNumber;
    }

    /**
     * Sets the value of the partNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPartNumber(QueryType value) {
        this.partNumber = value;
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
     * Gets the value of the previousAssetStatus property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPreviousAssetStatus() {
        return previousAssetStatus;
    }

    /**
     * Sets the value of the previousAssetStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPreviousAssetStatus(QueryType value) {
        this.previousAssetStatus = value;
    }

    /**
     * Gets the value of the previousBillingAccountId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPreviousBillingAccountId() {
        return previousBillingAccountId;
    }

    /**
     * Sets the value of the previousBillingAccountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPreviousBillingAccountId(QueryType value) {
        this.previousBillingAccountId = value;
    }

    /**
     * Gets the value of the previousServiceAccountId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPreviousServiceAccountId() {
        return previousServiceAccountId;
    }

    /**
     * Sets the value of the previousServiceAccountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPreviousServiceAccountId(QueryType value) {
        this.previousServiceAccountId = value;
    }

    /**
     * Gets the value of the previousServiceId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPreviousServiceId() {
        return previousServiceId;
    }

    /**
     * Sets the value of the previousServiceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPreviousServiceId(QueryType value) {
        this.previousServiceId = value;
    }

    /**
     * Gets the value of the previousUsageAssetId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPreviousUsageAssetId() {
        return previousUsageAssetId;
    }

    /**
     * Sets the value of the previousUsageAssetId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPreviousUsageAssetId(QueryType value) {
        this.previousUsageAssetId = value;
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
     * Gets the value of the pricingComments property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPricingComments() {
        return pricingComments;
    }

    /**
     * Sets the value of the pricingComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPricingComments(QueryType value) {
        this.pricingComments = value;
    }

    /**
     * Gets the value of the processedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getProcessedFlag() {
        return processedFlag;
    }

    /**
     * Sets the value of the processedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setProcessedFlag(QueryType value) {
        this.processedFlag = value;
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
     * Gets the value of the product property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getProduct() {
        return product;
    }

    /**
     * Sets the value of the product property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setProduct(QueryType value) {
        this.product = value;
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
     * Gets the value of the productTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getProductTypeCode() {
        return productTypeCode;
    }

    /**
     * Sets the value of the productTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setProductTypeCode(QueryType value) {
        this.productTypeCode = value;
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
     * Gets the value of the promotionItemFlag property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPromotionItemFlag() {
        return promotionItemFlag;
    }

    /**
     * Sets the value of the promotionItemFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPromotionItemFlag(QueryType value) {
        this.promotionItemFlag = value;
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
     * Gets the value of the quantityRequested property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getQuantityRequested() {
        return quantityRequested;
    }

    /**
     * Sets the value of the quantityRequested property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setQuantityRequested(QueryType value) {
        this.quantityRequested = value;
    }

    /**
     * Gets the value of the quantityShipped property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getQuantityShipped() {
        return quantityShipped;
    }

    /**
     * Sets the value of the quantityShipped property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setQuantityShipped(QueryType value) {
        this.quantityShipped = value;
    }

    /**
     * Gets the value of the revisedLineItemId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getRevisedLineItemId() {
        return revisedLineItemId;
    }

    /**
     * Sets the value of the revisedLineItemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setRevisedLineItemId(QueryType value) {
        this.revisedLineItemId = value;
    }

    /**
     * Gets the value of the rollupAmount property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getRollupAmount() {
        return rollupAmount;
    }

    /**
     * Sets the value of the rollupAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setRollupAmount(QueryType value) {
        this.rollupAmount = value;
    }

    /**
     * Gets the value of the rollupItemPrice property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getRollupItemPrice() {
        return rollupItemPrice;
    }

    /**
     * Sets the value of the rollupItemPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setRollupItemPrice(QueryType value) {
        this.rollupItemPrice = value;
    }

    /**
     * Gets the value of the rootAssetIntegrationId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getRootAssetIntegrationId() {
        return rootAssetIntegrationId;
    }

    /**
     * Sets the value of the rootAssetIntegrationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setRootAssetIntegrationId(QueryType value) {
        this.rootAssetIntegrationId = value;
    }

    /**
     * Gets the value of the rootItemPriceListId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getRootItemPriceListId() {
        return rootItemPriceListId;
    }

    /**
     * Sets the value of the rootItemPriceListId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setRootItemPriceListId(QueryType value) {
        this.rootItemPriceListId = value;
    }

    /**
     * Gets the value of the rootOrderItemId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getRootOrderItemId() {
        return rootOrderItemId;
    }

    /**
     * Sets the value of the rootOrderItemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setRootOrderItemId(QueryType value) {
        this.rootOrderItemId = value;
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
     * Gets the value of the salesServiceFlag property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getSalesServiceFlag() {
        return salesServiceFlag;
    }

    /**
     * Sets the value of the salesServiceFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setSalesServiceFlag(QueryType value) {
        this.salesServiceFlag = value;
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
     * Gets the value of the serviceAccountAddress property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getServiceAccountAddress() {
        return serviceAccountAddress;
    }

    /**
     * Sets the value of the serviceAccountAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setServiceAccountAddress(QueryType value) {
        this.serviceAccountAddress = value;
    }

    /**
     * Gets the value of the serviceAccountAddress2 property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getServiceAccountAddress2() {
        return serviceAccountAddress2;
    }

    /**
     * Sets the value of the serviceAccountAddress2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setServiceAccountAddress2(QueryType value) {
        this.serviceAccountAddress2 = value;
    }

    /**
     * Gets the value of the serviceAccountAddressId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getServiceAccountAddressId() {
        return serviceAccountAddressId;
    }

    /**
     * Sets the value of the serviceAccountAddressId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setServiceAccountAddressId(QueryType value) {
        this.serviceAccountAddressId = value;
    }

    /**
     * Gets the value of the serviceAccountCity property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getServiceAccountCity() {
        return serviceAccountCity;
    }

    /**
     * Sets the value of the serviceAccountCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setServiceAccountCity(QueryType value) {
        this.serviceAccountCity = value;
    }

    /**
     * Gets the value of the serviceAccountCountry property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getServiceAccountCountry() {
        return serviceAccountCountry;
    }

    /**
     * Sets the value of the serviceAccountCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setServiceAccountCountry(QueryType value) {
        this.serviceAccountCountry = value;
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
     * Gets the value of the serviceAccountLocation property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getServiceAccountLocation() {
        return serviceAccountLocation;
    }

    /**
     * Sets the value of the serviceAccountLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setServiceAccountLocation(QueryType value) {
        this.serviceAccountLocation = value;
    }

    /**
     * Gets the value of the serviceAccountState property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getServiceAccountState() {
        return serviceAccountState;
    }

    /**
     * Sets the value of the serviceAccountState property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setServiceAccountState(QueryType value) {
        this.serviceAccountState = value;
    }

    /**
     * Gets the value of the serviceAccountZip property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getServiceAccountZip() {
        return serviceAccountZip;
    }

    /**
     * Sets the value of the serviceAccountZip property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setServiceAccountZip(QueryType value) {
        this.serviceAccountZip = value;
    }

    /**
     * Gets the value of the serviceId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getServiceId() {
        return serviceId;
    }

    /**
     * Sets the value of the serviceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setServiceId(QueryType value) {
        this.serviceId = value;
    }

    /**
     * Gets the value of the shipInstrustions property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getShipInstrustions() {
        return shipInstrustions;
    }

    /**
     * Sets the value of the shipInstrustions property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setShipInstrustions(QueryType value) {
        this.shipInstrustions = value;
    }

    /**
     * Gets the value of the shipToAccount property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getShipToAccount() {
        return shipToAccount;
    }

    /**
     * Sets the value of the shipToAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setShipToAccount(QueryType value) {
        this.shipToAccount = value;
    }

    /**
     * Gets the value of the shipToAccountId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getShipToAccountId() {
        return shipToAccountId;
    }

    /**
     * Sets the value of the shipToAccountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setShipToAccountId(QueryType value) {
        this.shipToAccountId = value;
    }

    /**
     * Gets the value of the shipToAccountLocation property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getShipToAccountLocation() {
        return shipToAccountLocation;
    }

    /**
     * Sets the value of the shipToAccountLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setShipToAccountLocation(QueryType value) {
        this.shipToAccountLocation = value;
    }

    /**
     * Gets the value of the shipToAddress property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getShipToAddress() {
        return shipToAddress;
    }

    /**
     * Sets the value of the shipToAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setShipToAddress(QueryType value) {
        this.shipToAddress = value;
    }

    /**
     * Gets the value of the shipToAddress2 property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getShipToAddress2() {
        return shipToAddress2;
    }

    /**
     * Sets the value of the shipToAddress2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setShipToAddress2(QueryType value) {
        this.shipToAddress2 = value;
    }

    /**
     * Gets the value of the shipToAddressId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getShipToAddressId() {
        return shipToAddressId;
    }

    /**
     * Sets the value of the shipToAddressId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setShipToAddressId(QueryType value) {
        this.shipToAddressId = value;
    }

    /**
     * Gets the value of the shipToCity property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getShipToCity() {
        return shipToCity;
    }

    /**
     * Sets the value of the shipToCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setShipToCity(QueryType value) {
        this.shipToCity = value;
    }

    /**
     * Gets the value of the shipToContactEmail property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getShipToContactEmail() {
        return shipToContactEmail;
    }

    /**
     * Sets the value of the shipToContactEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setShipToContactEmail(QueryType value) {
        this.shipToContactEmail = value;
    }

    /**
     * Gets the value of the shipToContactFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getShipToContactFirstName() {
        return shipToContactFirstName;
    }

    /**
     * Sets the value of the shipToContactFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setShipToContactFirstName(QueryType value) {
        this.shipToContactFirstName = value;
    }

    /**
     * Gets the value of the shipToContactLastName property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getShipToContactLastName() {
        return shipToContactLastName;
    }

    /**
     * Sets the value of the shipToContactLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setShipToContactLastName(QueryType value) {
        this.shipToContactLastName = value;
    }

    /**
     * Gets the value of the shipToContactWorkPhone property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getShipToContactWorkPhone() {
        return shipToContactWorkPhone;
    }

    /**
     * Sets the value of the shipToContactWorkPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setShipToContactWorkPhone(QueryType value) {
        this.shipToContactWorkPhone = value;
    }

    /**
     * Gets the value of the shipToContactId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getShipToContactId() {
        return shipToContactId;
    }

    /**
     * Sets the value of the shipToContactId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setShipToContactId(QueryType value) {
        this.shipToContactId = value;
    }

    /**
     * Gets the value of the shipToCountry property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getShipToCountry() {
        return shipToCountry;
    }

    /**
     * Sets the value of the shipToCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setShipToCountry(QueryType value) {
        this.shipToCountry = value;
    }

    /**
     * Gets the value of the shipToState property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getShipToState() {
        return shipToState;
    }

    /**
     * Sets the value of the shipToState property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setShipToState(QueryType value) {
        this.shipToState = value;
    }

    /**
     * Gets the value of the shipToZip property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getShipToZip() {
        return shipToZip;
    }

    /**
     * Sets the value of the shipToZip property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setShipToZip(QueryType value) {
        this.shipToZip = value;
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
     * Gets the value of the taxAmount property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getTaxAmount() {
        return taxAmount;
    }

    /**
     * Sets the value of the taxAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setTaxAmount(QueryType value) {
        this.taxAmount = value;
    }

    /**
     * Gets the value of the taxExemptFlag property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getTaxExemptFlag() {
        return taxExemptFlag;
    }

    /**
     * Sets the value of the taxExemptFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setTaxExemptFlag(QueryType value) {
        this.taxExemptFlag = value;
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
     * Gets the value of the volumeDiscountId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getVolumeDiscountId() {
        return volumeDiscountId;
    }

    /**
     * Sets the value of the volumeDiscountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setVolumeDiscountId(QueryType value) {
        this.volumeDiscountId = value;
    }

    /**
     * Gets the value of the volumeDiscountItem property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getVolumeDiscountItem() {
        return volumeDiscountItem;
    }

    /**
     * Sets the value of the volumeDiscountItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setVolumeDiscountItem(QueryType value) {
        this.volumeDiscountItem = value;
    }

    /**
     * Gets the value of the volumeDiscountItemId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getVolumeDiscountItemId() {
        return volumeDiscountItemId;
    }

    /**
     * Sets the value of the volumeDiscountItemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setVolumeDiscountItemId(QueryType value) {
        this.volumeDiscountItemId = value;
    }

    /**
     * Gets the value of the volumeUpsellItem property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getVolumeUpsellItem() {
        return volumeUpsellItem;
    }

    /**
     * Sets the value of the volumeUpsellItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setVolumeUpsellItem(QueryType value) {
        this.volumeUpsellItem = value;
    }

    /**
     * Gets the value of the volumeUpsellItemId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getVolumeUpsellItemId() {
        return volumeUpsellItemId;
    }

    /**
     * Sets the value of the volumeUpsellItemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setVolumeUpsellItemId(QueryType value) {
        this.volumeUpsellItemId = value;
    }

    /**
     * Gets the value of the volumeUpsellMessage property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getVolumeUpsellMessage() {
        return volumeUpsellMessage;
    }

    /**
     * Sets the value of the volumeUpsellMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setVolumeUpsellMessage(QueryType value) {
        this.volumeUpsellMessage = value;
    }

    /**
     * Gets the value of the writeInProduct property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getWriteInProduct() {
        return writeInProduct;
    }

    /**
     * Sets the value of the writeInProduct property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setWriteInProduct(QueryType value) {
        this.writeInProduct = value;
    }

    /**
     * Gets the value of the personalShipToAddress property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPersonalShipToAddress() {
        return personalShipToAddress;
    }

    /**
     * Sets the value of the personalShipToAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPersonalShipToAddress(QueryType value) {
        this.personalShipToAddress = value;
    }

    /**
     * Gets the value of the personalShipToAddress2 property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPersonalShipToAddress2() {
        return personalShipToAddress2;
    }

    /**
     * Sets the value of the personalShipToAddress2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPersonalShipToAddress2(QueryType value) {
        this.personalShipToAddress2 = value;
    }

    /**
     * Gets the value of the personalShipToAddressId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPersonalShipToAddressId() {
        return personalShipToAddressId;
    }

    /**
     * Sets the value of the personalShipToAddressId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPersonalShipToAddressId(QueryType value) {
        this.personalShipToAddressId = value;
    }

    /**
     * Gets the value of the personalShipToCity property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPersonalShipToCity() {
        return personalShipToCity;
    }

    /**
     * Sets the value of the personalShipToCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPersonalShipToCity(QueryType value) {
        this.personalShipToCity = value;
    }

    /**
     * Gets the value of the personalShipToCountry property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPersonalShipToCountry() {
        return personalShipToCountry;
    }

    /**
     * Sets the value of the personalShipToCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPersonalShipToCountry(QueryType value) {
        this.personalShipToCountry = value;
    }

    /**
     * Gets the value of the personalShipToState property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPersonalShipToState() {
        return personalShipToState;
    }

    /**
     * Sets the value of the personalShipToState property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPersonalShipToState(QueryType value) {
        this.personalShipToState = value;
    }

    /**
     * Gets the value of the personalShipToZip property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPersonalShipToZip() {
        return personalShipToZip;
    }

    /**
     * Sets the value of the personalShipToZip property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPersonalShipToZip(QueryType value) {
        this.personalShipToZip = value;
    }

    /**
     * Gets the value of the personalShipToAddressee property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPersonalShipToAddressee() {
        return personalShipToAddressee;
    }

    /**
     * Sets the value of the personalShipToAddressee property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPersonalShipToAddressee(QueryType value) {
        this.personalShipToAddressee = value;
    }

    /**
     * Gets the value of the shipToAddressee property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getShipToAddressee() {
        return shipToAddressee;
    }

    /**
     * Sets the value of the shipToAddressee property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setShipToAddressee(QueryType value) {
        this.shipToAddressee = value;
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
     * Gets the value of the billingAccountAddress property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getBillingAccountAddress() {
        return billingAccountAddress;
    }

    /**
     * Sets the value of the billingAccountAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setBillingAccountAddress(QueryType value) {
        this.billingAccountAddress = value;
    }

    /**
     * Gets the value of the billingAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getBillingAccountNumber() {
        return billingAccountNumber;
    }

    /**
     * Sets the value of the billingAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setBillingAccountNumber(QueryType value) {
        this.billingAccountNumber = value;
    }

    /**
     * Gets the value of the billingAccountLocation property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getBillingAccountLocation() {
        return billingAccountLocation;
    }

    /**
     * Sets the value of the billingAccountLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setBillingAccountLocation(QueryType value) {
        this.billingAccountLocation = value;
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
     * Gets the value of the billingAccountAddress2 property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getBillingAccountAddress2() {
        return billingAccountAddress2;
    }

    /**
     * Sets the value of the billingAccountAddress2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setBillingAccountAddress2(QueryType value) {
        this.billingAccountAddress2 = value;
    }

    /**
     * Gets the value of the billingAccountAddressId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getBillingAccountAddressId() {
        return billingAccountAddressId;
    }

    /**
     * Sets the value of the billingAccountAddressId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setBillingAccountAddressId(QueryType value) {
        this.billingAccountAddressId = value;
    }

    /**
     * Gets the value of the billingAccountCity property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getBillingAccountCity() {
        return billingAccountCity;
    }

    /**
     * Sets the value of the billingAccountCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setBillingAccountCity(QueryType value) {
        this.billingAccountCity = value;
    }

    /**
     * Gets the value of the billingAccountContactId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getBillingAccountContactId() {
        return billingAccountContactId;
    }

    /**
     * Sets the value of the billingAccountContactId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setBillingAccountContactId(QueryType value) {
        this.billingAccountContactId = value;
    }

    /**
     * Gets the value of the billingAccountCountry property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getBillingAccountCountry() {
        return billingAccountCountry;
    }

    /**
     * Sets the value of the billingAccountCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setBillingAccountCountry(QueryType value) {
        this.billingAccountCountry = value;
    }

    /**
     * Gets the value of the billingAccountState property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getBillingAccountState() {
        return billingAccountState;
    }

    /**
     * Sets the value of the billingAccountState property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setBillingAccountState(QueryType value) {
        this.billingAccountState = value;
    }

    /**
     * Gets the value of the billingAccountZip property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getBillingAccountZip() {
        return billingAccountZip;
    }

    /**
     * Sets the value of the billingAccountZip property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setBillingAccountZip(QueryType value) {
        this.billingAccountZip = value;
    }

    /**
     * Gets the value of the billingContactEmail property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getBillingContactEmail() {
        return billingContactEmail;
    }

    /**
     * Sets the value of the billingContactEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setBillingContactEmail(QueryType value) {
        this.billingContactEmail = value;
    }

    /**
     * Gets the value of the billingContactFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getBillingContactFirstName() {
        return billingContactFirstName;
    }

    /**
     * Sets the value of the billingContactFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setBillingContactFirstName(QueryType value) {
        this.billingContactFirstName = value;
    }

    /**
     * Gets the value of the billingContactLastName property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getBillingContactLastName() {
        return billingContactLastName;
    }

    /**
     * Sets the value of the billingContactLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setBillingContactLastName(QueryType value) {
        this.billingContactLastName = value;
    }

    /**
     * Gets the value of the billingContactWorkPhone property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getBillingContactWorkPhone() {
        return billingContactWorkPhone;
    }

    /**
     * Sets the value of the billingContactWorkPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setBillingContactWorkPhone(QueryType value) {
        this.billingContactWorkPhone = value;
    }

    /**
     * Gets the value of the donatingServiceProvider property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getDonatingServiceProvider() {
        return donatingServiceProvider;
    }

    /**
     * Sets the value of the donatingServiceProvider property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setDonatingServiceProvider(QueryType value) {
        this.donatingServiceProvider = value;
    }

    /**
     * Gets the value of the endingPhoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getEndingPhoneNumber() {
        return endingPhoneNumber;
    }

    /**
     * Sets the value of the endingPhoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setEndingPhoneNumber(QueryType value) {
        this.endingPhoneNumber = value;
    }

    /**
     * Gets the value of the legacyAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getLegacyAccountNumber() {
        return legacyAccountNumber;
    }

    /**
     * Sets the value of the legacyAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setLegacyAccountNumber(QueryType value) {
        this.legacyAccountNumber = value;
    }

    /**
     * Gets the value of the numberPortabilityAgencyName property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getNumberPortabilityAgencyName() {
        return numberPortabilityAgencyName;
    }

    /**
     * Sets the value of the numberPortabilityAgencyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setNumberPortabilityAgencyName(QueryType value) {
        this.numberPortabilityAgencyName = value;
    }

    /**
     * Gets the value of the numberToPort property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getNumberToPort() {
        return numberToPort;
    }

    /**
     * Sets the value of the numberToPort property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setNumberToPort(QueryType value) {
        this.numberToPort = value;
    }

    /**
     * Gets the value of the pin property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPIN() {
        return pin;
    }

    /**
     * Sets the value of the pin property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPIN(QueryType value) {
        this.pin = value;
    }

    /**
     * Gets the value of the requestedPortingDate property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getRequestedPortingDate() {
        return requestedPortingDate;
    }

    /**
     * Sets the value of the requestedPortingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setRequestedPortingDate(QueryType value) {
        this.requestedPortingDate = value;
    }

    /**
     * Gets the value of the servicePostalCode property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getServicePostalCode() {
        return servicePostalCode;
    }

    /**
     * Sets the value of the servicePostalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setServicePostalCode(QueryType value) {
        this.servicePostalCode = value;
    }

    /**
     * Gets the value of the startingPhoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getStartingPhoneNumber() {
        return startingPhoneNumber;
    }

    /**
     * Sets the value of the startingPhoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setStartingPhoneNumber(QueryType value) {
        this.startingPhoneNumber = value;
    }

    /**
     * Gets the value of the listOfOrderItemXADetail property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfOrderItemXADetailQuery }
     *     
     */
    public ListOfOrderItemXADetailQuery getListOfOrderItemXADetail() {
        return listOfOrderItemXADetail;
    }

    /**
     * Sets the value of the listOfOrderItemXADetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfOrderItemXADetailQuery }
     *     
     */
    public void setListOfOrderItemXADetail(ListOfOrderItemXADetailQuery value) {
        this.listOfOrderItemXADetail = value;
    }

    /**
     * Gets the value of the listOfOrderItemProductLine property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfOrderItemProductLineQuery }
     *     
     */
    public ListOfOrderItemProductLineQuery getListOfOrderItemProductLine() {
        return listOfOrderItemProductLine;
    }

    /**
     * Sets the value of the listOfOrderItemProductLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfOrderItemProductLineQuery }
     *     
     */
    public void setListOfOrderItemProductLine(ListOfOrderItemProductLineQuery value) {
        this.listOfOrderItemProductLine = value;
    }

    /**
     * Gets the value of the orderItemDetail property.
     * 
     * @return
     *     possible object is
     *     {@link OrderItemDetailQuery }
     *     
     */
    public OrderItemDetailQuery getOrderItemDetail() {
        return orderItemDetail;
    }

    /**
     * Sets the value of the orderItemDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderItemDetailQuery }
     *     
     */
    public void setOrderItemDetail(OrderItemDetailQuery value) {
        this.orderItemDetail = value;
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
