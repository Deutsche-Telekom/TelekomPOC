
package com.siebel.ordermanagement.order.details.data.query;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrderDetailQuery complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderDetailQuery">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="Created" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="Updated" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ConflictId" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ModId" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="Account" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="AccountAddressId" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="AccountContractedProductsOnlyFlag" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="AccountId" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="AccountLocation" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="AccountType" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="Active" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="Approved" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="BillToAccount" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="BillToAccountId" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="BillToAccountLocation" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="BillToAddressId" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="BillToContactId" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="BillableFlag" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="BillingAccountId" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="CarrierPriority" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="CarrierType" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="CompoundProductNumber" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ContactEmailAddress" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ContactFirstName" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ContactId" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ContactLastName" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ContactWorkPhone" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="CurrencyCode" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="Discount" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="DiscountAmount" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ExchangeDate" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="Freight" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="IntegrationId" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="MRCTotal" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="NRCTotal" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="OptyId" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="OrderDate" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="OrderNumber" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="OrderPriority" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="OrderTotal" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="OrderType" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="OrderTypeCode" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="OrderTypeId" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PaymentTerm" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PaymentTermId" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PersonalShipToAddressId" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PersonalShipToCity" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PersonalShipToCountry" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PersonalShipToPostalCode" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PersonalShipToState" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PersonalShipToStreetAddress" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PersonalShipToStreetAddress2" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PriceListId" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PrimaryBillToAddress" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PrimaryBillToAddress2" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PrimaryBillToCity" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PrimaryBillToCountry" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PrimaryBillToEmail" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PrimaryBillToFirstName" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PrimaryBillToLastName" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PrimaryBillToPostalCode" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PrimaryBillToState" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PrimaryBillToWorkPhone" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PrimaryOrganizationId" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PrimaryPositionId" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PrimaryShipToAddress" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PrimaryShipToAddress2" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PrimaryShipToAddressId" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PrimaryShipToCity" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PrimaryShipToCountry" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PrimaryShipToEmail" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PrimaryShipToFirstName" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PrimaryShipToLastName" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PrimaryShipToPostalCode" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PrimaryShipToState" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PrimaryShipToWorkPhone" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="QuoteId" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="QuoteNumber" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="RequestedShipDate" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="Revision" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ScenarioTestFlag" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
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
 *         &lt;element name="ServiceContactEmail" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ServiceContactFirstName" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ServiceContactId" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ServiceContactLastName" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ServiceContactWorkPhone" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ShipInstructions" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ShipToAccount" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ShipToAccountId" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ShipToAccountLocation" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ShipToAddressId" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ShipToContactId" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="TaxAmount" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="TaxExempt" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="TaxExemptNumber" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="TaxExemptReason" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="TaxRate" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PersonalBillToAddressId" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PersonalBillToCity" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PersonalBillToCountry" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PersonalBillToPostalCode" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PersonalBillToState" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PersonalBillToStreetAddress" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PersonalBillToStreetAddress2" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="BillingAccount" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="BillingAccountLocation" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="BillingAccountNumber" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="BillingProfileId" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="BillingProfileName" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ServiceAccountNumber" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="Comments" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="BillingAccountAddress" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
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
 *         &lt;element name="PersonalShipToAddressee" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PrimaryShipToAddressee" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ListOfOrderApprovalHistory" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}ListOfOrderApprovalHistoryQuery" minOccurs="0"/>
 *         &lt;element name="ListOfShipment" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}ListOfShipmentQuery" minOccurs="0"/>
 *         &lt;element name="ListOfOrderItemDetail" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}ListOfOrderItemDetailQuery" minOccurs="0"/>
 *         &lt;element name="ListOfOrderPayment" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}ListOfOrderPaymentQuery" minOccurs="0"/>
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
@XmlType(name = "OrderDetailQuery", propOrder = {
    "id",
    "created",
    "updated",
    "conflictId",
    "modId",
    "account",
    "accountAddressId",
    "accountContractedProductsOnlyFlag",
    "accountId",
    "accountLocation",
    "accountType",
    "active",
    "approved",
    "billToAccount",
    "billToAccountId",
    "billToAccountLocation",
    "billToAddressId",
    "billToContactId",
    "billableFlag",
    "billingAccountId",
    "carrierPriority",
    "carrierType",
    "compoundProductNumber",
    "contactEmailAddress",
    "contactFirstName",
    "contactId",
    "contactLastName",
    "contactWorkPhone",
    "currencyCode",
    "discount",
    "discountAmount",
    "exchangeDate",
    "freight",
    "integrationId",
    "mrcTotal",
    "nrcTotal",
    "optyId",
    "orderDate",
    "orderNumber",
    "orderPriority",
    "orderTotal",
    "orderType",
    "orderTypeCode",
    "orderTypeId",
    "paymentTerm",
    "paymentTermId",
    "personalShipToAddressId",
    "personalShipToCity",
    "personalShipToCountry",
    "personalShipToPostalCode",
    "personalShipToState",
    "personalShipToStreetAddress",
    "personalShipToStreetAddress2",
    "priceListId",
    "primaryBillToAddress",
    "primaryBillToAddress2",
    "primaryBillToCity",
    "primaryBillToCountry",
    "primaryBillToEmail",
    "primaryBillToFirstName",
    "primaryBillToLastName",
    "primaryBillToPostalCode",
    "primaryBillToState",
    "primaryBillToWorkPhone",
    "primaryOrganizationId",
    "primaryPositionId",
    "primaryShipToAddress",
    "primaryShipToAddress2",
    "primaryShipToAddressId",
    "primaryShipToCity",
    "primaryShipToCountry",
    "primaryShipToEmail",
    "primaryShipToFirstName",
    "primaryShipToLastName",
    "primaryShipToPostalCode",
    "primaryShipToState",
    "primaryShipToWorkPhone",
    "quoteId",
    "quoteNumber",
    "requestedShipDate",
    "revision",
    "scenarioTestFlag",
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
    "serviceContactEmail",
    "serviceContactFirstName",
    "serviceContactId",
    "serviceContactLastName",
    "serviceContactWorkPhone",
    "shipInstructions",
    "shipToAccount",
    "shipToAccountId",
    "shipToAccountLocation",
    "shipToAddressId",
    "shipToContactId",
    "status",
    "taxAmount",
    "taxExempt",
    "taxExemptNumber",
    "taxExemptReason",
    "taxRate",
    "personalBillToAddressId",
    "personalBillToCity",
    "personalBillToCountry",
    "personalBillToPostalCode",
    "personalBillToState",
    "personalBillToStreetAddress",
    "personalBillToStreetAddress2",
    "billingAccount",
    "billingAccountLocation",
    "billingAccountNumber",
    "billingProfileId",
    "billingProfileName",
    "serviceAccountNumber",
    "comments",
    "billingAccountAddress",
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
    "personalShipToAddressee",
    "primaryShipToAddressee",
    "listOfOrderApprovalHistory",
    "listOfShipment",
    "listOfOrderItemDetail",
    "listOfOrderPayment"
})
public class OrderDetailQuery
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
    @XmlElement(name = "Account")
    protected QueryType account;
    @XmlElement(name = "AccountAddressId")
    protected QueryType accountAddressId;
    @XmlElement(name = "AccountContractedProductsOnlyFlag")
    protected QueryType accountContractedProductsOnlyFlag;
    @XmlElement(name = "AccountId")
    protected QueryType accountId;
    @XmlElement(name = "AccountLocation")
    protected QueryType accountLocation;
    @XmlElement(name = "AccountType")
    protected QueryType accountType;
    @XmlElement(name = "Active")
    protected QueryType active;
    @XmlElement(name = "Approved")
    protected QueryType approved;
    @XmlElement(name = "BillToAccount")
    protected QueryType billToAccount;
    @XmlElement(name = "BillToAccountId")
    protected QueryType billToAccountId;
    @XmlElement(name = "BillToAccountLocation")
    protected QueryType billToAccountLocation;
    @XmlElement(name = "BillToAddressId")
    protected QueryType billToAddressId;
    @XmlElement(name = "BillToContactId")
    protected QueryType billToContactId;
    @XmlElement(name = "BillableFlag")
    protected QueryType billableFlag;
    @XmlElement(name = "BillingAccountId")
    protected QueryType billingAccountId;
    @XmlElement(name = "CarrierPriority")
    protected QueryType carrierPriority;
    @XmlElement(name = "CarrierType")
    protected QueryType carrierType;
    @XmlElement(name = "CompoundProductNumber")
    protected QueryType compoundProductNumber;
    @XmlElement(name = "ContactEmailAddress")
    protected QueryType contactEmailAddress;
    @XmlElement(name = "ContactFirstName")
    protected QueryType contactFirstName;
    @XmlElement(name = "ContactId")
    protected QueryType contactId;
    @XmlElement(name = "ContactLastName")
    protected QueryType contactLastName;
    @XmlElement(name = "ContactWorkPhone")
    protected QueryType contactWorkPhone;
    @XmlElement(name = "CurrencyCode")
    protected QueryType currencyCode;
    @XmlElement(name = "Discount")
    protected QueryType discount;
    @XmlElement(name = "DiscountAmount")
    protected QueryType discountAmount;
    @XmlElement(name = "ExchangeDate")
    protected QueryType exchangeDate;
    @XmlElement(name = "Freight")
    protected QueryType freight;
    @XmlElement(name = "IntegrationId")
    protected QueryType integrationId;
    @XmlElement(name = "MRCTotal")
    protected QueryType mrcTotal;
    @XmlElement(name = "NRCTotal")
    protected QueryType nrcTotal;
    @XmlElement(name = "OptyId")
    protected QueryType optyId;
    @XmlElement(name = "OrderDate")
    protected QueryType orderDate;
    @XmlElement(name = "OrderNumber")
    protected QueryType orderNumber;
    @XmlElement(name = "OrderPriority")
    protected QueryType orderPriority;
    @XmlElement(name = "OrderTotal")
    protected QueryType orderTotal;
    @XmlElement(name = "OrderType")
    protected QueryType orderType;
    @XmlElement(name = "OrderTypeCode")
    protected QueryType orderTypeCode;
    @XmlElement(name = "OrderTypeId")
    protected QueryType orderTypeId;
    @XmlElement(name = "PaymentTerm")
    protected QueryType paymentTerm;
    @XmlElement(name = "PaymentTermId")
    protected QueryType paymentTermId;
    @XmlElement(name = "PersonalShipToAddressId")
    protected QueryType personalShipToAddressId;
    @XmlElement(name = "PersonalShipToCity")
    protected QueryType personalShipToCity;
    @XmlElement(name = "PersonalShipToCountry")
    protected QueryType personalShipToCountry;
    @XmlElement(name = "PersonalShipToPostalCode")
    protected QueryType personalShipToPostalCode;
    @XmlElement(name = "PersonalShipToState")
    protected QueryType personalShipToState;
    @XmlElement(name = "PersonalShipToStreetAddress")
    protected QueryType personalShipToStreetAddress;
    @XmlElement(name = "PersonalShipToStreetAddress2")
    protected QueryType personalShipToStreetAddress2;
    @XmlElement(name = "PriceListId")
    protected QueryType priceListId;
    @XmlElement(name = "PrimaryBillToAddress")
    protected QueryType primaryBillToAddress;
    @XmlElement(name = "PrimaryBillToAddress2")
    protected QueryType primaryBillToAddress2;
    @XmlElement(name = "PrimaryBillToCity")
    protected QueryType primaryBillToCity;
    @XmlElement(name = "PrimaryBillToCountry")
    protected QueryType primaryBillToCountry;
    @XmlElement(name = "PrimaryBillToEmail")
    protected QueryType primaryBillToEmail;
    @XmlElement(name = "PrimaryBillToFirstName")
    protected QueryType primaryBillToFirstName;
    @XmlElement(name = "PrimaryBillToLastName")
    protected QueryType primaryBillToLastName;
    @XmlElement(name = "PrimaryBillToPostalCode")
    protected QueryType primaryBillToPostalCode;
    @XmlElement(name = "PrimaryBillToState")
    protected QueryType primaryBillToState;
    @XmlElement(name = "PrimaryBillToWorkPhone")
    protected QueryType primaryBillToWorkPhone;
    @XmlElement(name = "PrimaryOrganizationId")
    protected QueryType primaryOrganizationId;
    @XmlElement(name = "PrimaryPositionId")
    protected QueryType primaryPositionId;
    @XmlElement(name = "PrimaryShipToAddress")
    protected QueryType primaryShipToAddress;
    @XmlElement(name = "PrimaryShipToAddress2")
    protected QueryType primaryShipToAddress2;
    @XmlElement(name = "PrimaryShipToAddressId")
    protected QueryType primaryShipToAddressId;
    @XmlElement(name = "PrimaryShipToCity")
    protected QueryType primaryShipToCity;
    @XmlElement(name = "PrimaryShipToCountry")
    protected QueryType primaryShipToCountry;
    @XmlElement(name = "PrimaryShipToEmail")
    protected QueryType primaryShipToEmail;
    @XmlElement(name = "PrimaryShipToFirstName")
    protected QueryType primaryShipToFirstName;
    @XmlElement(name = "PrimaryShipToLastName")
    protected QueryType primaryShipToLastName;
    @XmlElement(name = "PrimaryShipToPostalCode")
    protected QueryType primaryShipToPostalCode;
    @XmlElement(name = "PrimaryShipToState")
    protected QueryType primaryShipToState;
    @XmlElement(name = "PrimaryShipToWorkPhone")
    protected QueryType primaryShipToWorkPhone;
    @XmlElement(name = "QuoteId")
    protected QueryType quoteId;
    @XmlElement(name = "QuoteNumber")
    protected QueryType quoteNumber;
    @XmlElement(name = "RequestedShipDate")
    protected QueryType requestedShipDate;
    @XmlElement(name = "Revision")
    protected QueryType revision;
    @XmlElement(name = "ScenarioTestFlag")
    protected QueryType scenarioTestFlag;
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
    @XmlElement(name = "ServiceContactEmail")
    protected QueryType serviceContactEmail;
    @XmlElement(name = "ServiceContactFirstName")
    protected QueryType serviceContactFirstName;
    @XmlElement(name = "ServiceContactId")
    protected QueryType serviceContactId;
    @XmlElement(name = "ServiceContactLastName")
    protected QueryType serviceContactLastName;
    @XmlElement(name = "ServiceContactWorkPhone")
    protected QueryType serviceContactWorkPhone;
    @XmlElement(name = "ShipInstructions")
    protected QueryType shipInstructions;
    @XmlElement(name = "ShipToAccount")
    protected QueryType shipToAccount;
    @XmlElement(name = "ShipToAccountId")
    protected QueryType shipToAccountId;
    @XmlElement(name = "ShipToAccountLocation")
    protected QueryType shipToAccountLocation;
    @XmlElement(name = "ShipToAddressId")
    protected QueryType shipToAddressId;
    @XmlElement(name = "ShipToContactId")
    protected QueryType shipToContactId;
    @XmlElement(name = "Status")
    protected QueryType status;
    @XmlElement(name = "TaxAmount")
    protected QueryType taxAmount;
    @XmlElement(name = "TaxExempt")
    protected QueryType taxExempt;
    @XmlElement(name = "TaxExemptNumber")
    protected QueryType taxExemptNumber;
    @XmlElement(name = "TaxExemptReason")
    protected QueryType taxExemptReason;
    @XmlElement(name = "TaxRate")
    protected QueryType taxRate;
    @XmlElement(name = "PersonalBillToAddressId")
    protected QueryType personalBillToAddressId;
    @XmlElement(name = "PersonalBillToCity")
    protected QueryType personalBillToCity;
    @XmlElement(name = "PersonalBillToCountry")
    protected QueryType personalBillToCountry;
    @XmlElement(name = "PersonalBillToPostalCode")
    protected QueryType personalBillToPostalCode;
    @XmlElement(name = "PersonalBillToState")
    protected QueryType personalBillToState;
    @XmlElement(name = "PersonalBillToStreetAddress")
    protected QueryType personalBillToStreetAddress;
    @XmlElement(name = "PersonalBillToStreetAddress2")
    protected QueryType personalBillToStreetAddress2;
    @XmlElement(name = "BillingAccount")
    protected QueryType billingAccount;
    @XmlElement(name = "BillingAccountLocation")
    protected QueryType billingAccountLocation;
    @XmlElement(name = "BillingAccountNumber")
    protected QueryType billingAccountNumber;
    @XmlElement(name = "BillingProfileId")
    protected QueryType billingProfileId;
    @XmlElement(name = "BillingProfileName")
    protected QueryType billingProfileName;
    @XmlElement(name = "ServiceAccountNumber")
    protected QueryType serviceAccountNumber;
    @XmlElement(name = "Comments")
    protected QueryType comments;
    @XmlElement(name = "BillingAccountAddress")
    protected QueryType billingAccountAddress;
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
    @XmlElement(name = "PersonalShipToAddressee")
    protected QueryType personalShipToAddressee;
    @XmlElement(name = "PrimaryShipToAddressee")
    protected QueryType primaryShipToAddressee;
    @XmlElement(name = "ListOfOrderApprovalHistory")
    protected ListOfOrderApprovalHistoryQuery listOfOrderApprovalHistory;
    @XmlElement(name = "ListOfShipment")
    protected ListOfShipmentQuery listOfShipment;
    @XmlElement(name = "ListOfOrderItemDetail")
    protected ListOfOrderItemDetailQuery listOfOrderItemDetail;
    @XmlElement(name = "ListOfOrderPayment")
    protected ListOfOrderPaymentQuery listOfOrderPayment;
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
     * Gets the value of the account property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getAccount() {
        return account;
    }

    /**
     * Sets the value of the account property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setAccount(QueryType value) {
        this.account = value;
    }

    /**
     * Gets the value of the accountAddressId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getAccountAddressId() {
        return accountAddressId;
    }

    /**
     * Sets the value of the accountAddressId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setAccountAddressId(QueryType value) {
        this.accountAddressId = value;
    }

    /**
     * Gets the value of the accountContractedProductsOnlyFlag property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getAccountContractedProductsOnlyFlag() {
        return accountContractedProductsOnlyFlag;
    }

    /**
     * Sets the value of the accountContractedProductsOnlyFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setAccountContractedProductsOnlyFlag(QueryType value) {
        this.accountContractedProductsOnlyFlag = value;
    }

    /**
     * Gets the value of the accountId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getAccountId() {
        return accountId;
    }

    /**
     * Sets the value of the accountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setAccountId(QueryType value) {
        this.accountId = value;
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
     * Gets the value of the accountType property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getAccountType() {
        return accountType;
    }

    /**
     * Sets the value of the accountType property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setAccountType(QueryType value) {
        this.accountType = value;
    }

    /**
     * Gets the value of the active property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getActive() {
        return active;
    }

    /**
     * Sets the value of the active property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setActive(QueryType value) {
        this.active = value;
    }

    /**
     * Gets the value of the approved property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getApproved() {
        return approved;
    }

    /**
     * Sets the value of the approved property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setApproved(QueryType value) {
        this.approved = value;
    }

    /**
     * Gets the value of the billToAccount property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getBillToAccount() {
        return billToAccount;
    }

    /**
     * Sets the value of the billToAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setBillToAccount(QueryType value) {
        this.billToAccount = value;
    }

    /**
     * Gets the value of the billToAccountId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getBillToAccountId() {
        return billToAccountId;
    }

    /**
     * Sets the value of the billToAccountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setBillToAccountId(QueryType value) {
        this.billToAccountId = value;
    }

    /**
     * Gets the value of the billToAccountLocation property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getBillToAccountLocation() {
        return billToAccountLocation;
    }

    /**
     * Sets the value of the billToAccountLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setBillToAccountLocation(QueryType value) {
        this.billToAccountLocation = value;
    }

    /**
     * Gets the value of the billToAddressId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getBillToAddressId() {
        return billToAddressId;
    }

    /**
     * Sets the value of the billToAddressId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setBillToAddressId(QueryType value) {
        this.billToAddressId = value;
    }

    /**
     * Gets the value of the billToContactId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getBillToContactId() {
        return billToContactId;
    }

    /**
     * Sets the value of the billToContactId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setBillToContactId(QueryType value) {
        this.billToContactId = value;
    }

    /**
     * Gets the value of the billableFlag property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getBillableFlag() {
        return billableFlag;
    }

    /**
     * Sets the value of the billableFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setBillableFlag(QueryType value) {
        this.billableFlag = value;
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
     * Gets the value of the carrierType property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getCarrierType() {
        return carrierType;
    }

    /**
     * Sets the value of the carrierType property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setCarrierType(QueryType value) {
        this.carrierType = value;
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
     * Gets the value of the contactEmailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getContactEmailAddress() {
        return contactEmailAddress;
    }

    /**
     * Sets the value of the contactEmailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setContactEmailAddress(QueryType value) {
        this.contactEmailAddress = value;
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
     * Gets the value of the discount property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getDiscount() {
        return discount;
    }

    /**
     * Sets the value of the discount property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setDiscount(QueryType value) {
        this.discount = value;
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
     * Gets the value of the freight property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getFreight() {
        return freight;
    }

    /**
     * Sets the value of the freight property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setFreight(QueryType value) {
        this.freight = value;
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
     * Gets the value of the mrcTotal property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getMRCTotal() {
        return mrcTotal;
    }

    /**
     * Sets the value of the mrcTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setMRCTotal(QueryType value) {
        this.mrcTotal = value;
    }

    /**
     * Gets the value of the nrcTotal property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getNRCTotal() {
        return nrcTotal;
    }

    /**
     * Sets the value of the nrcTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setNRCTotal(QueryType value) {
        this.nrcTotal = value;
    }

    /**
     * Gets the value of the optyId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getOptyId() {
        return optyId;
    }

    /**
     * Sets the value of the optyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setOptyId(QueryType value) {
        this.optyId = value;
    }

    /**
     * Gets the value of the orderDate property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getOrderDate() {
        return orderDate;
    }

    /**
     * Sets the value of the orderDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setOrderDate(QueryType value) {
        this.orderDate = value;
    }

    /**
     * Gets the value of the orderNumber property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getOrderNumber() {
        return orderNumber;
    }

    /**
     * Sets the value of the orderNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setOrderNumber(QueryType value) {
        this.orderNumber = value;
    }

    /**
     * Gets the value of the orderPriority property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getOrderPriority() {
        return orderPriority;
    }

    /**
     * Sets the value of the orderPriority property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setOrderPriority(QueryType value) {
        this.orderPriority = value;
    }

    /**
     * Gets the value of the orderTotal property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getOrderTotal() {
        return orderTotal;
    }

    /**
     * Sets the value of the orderTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setOrderTotal(QueryType value) {
        this.orderTotal = value;
    }

    /**
     * Gets the value of the orderType property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getOrderType() {
        return orderType;
    }

    /**
     * Sets the value of the orderType property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setOrderType(QueryType value) {
        this.orderType = value;
    }

    /**
     * Gets the value of the orderTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getOrderTypeCode() {
        return orderTypeCode;
    }

    /**
     * Sets the value of the orderTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setOrderTypeCode(QueryType value) {
        this.orderTypeCode = value;
    }

    /**
     * Gets the value of the orderTypeId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getOrderTypeId() {
        return orderTypeId;
    }

    /**
     * Sets the value of the orderTypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setOrderTypeId(QueryType value) {
        this.orderTypeId = value;
    }

    /**
     * Gets the value of the paymentTerm property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPaymentTerm() {
        return paymentTerm;
    }

    /**
     * Sets the value of the paymentTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPaymentTerm(QueryType value) {
        this.paymentTerm = value;
    }

    /**
     * Gets the value of the paymentTermId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPaymentTermId() {
        return paymentTermId;
    }

    /**
     * Sets the value of the paymentTermId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPaymentTermId(QueryType value) {
        this.paymentTermId = value;
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
     * Gets the value of the personalShipToPostalCode property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPersonalShipToPostalCode() {
        return personalShipToPostalCode;
    }

    /**
     * Sets the value of the personalShipToPostalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPersonalShipToPostalCode(QueryType value) {
        this.personalShipToPostalCode = value;
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
     * Gets the value of the personalShipToStreetAddress property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPersonalShipToStreetAddress() {
        return personalShipToStreetAddress;
    }

    /**
     * Sets the value of the personalShipToStreetAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPersonalShipToStreetAddress(QueryType value) {
        this.personalShipToStreetAddress = value;
    }

    /**
     * Gets the value of the personalShipToStreetAddress2 property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPersonalShipToStreetAddress2() {
        return personalShipToStreetAddress2;
    }

    /**
     * Sets the value of the personalShipToStreetAddress2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPersonalShipToStreetAddress2(QueryType value) {
        this.personalShipToStreetAddress2 = value;
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
     * Gets the value of the primaryBillToAddress property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPrimaryBillToAddress() {
        return primaryBillToAddress;
    }

    /**
     * Sets the value of the primaryBillToAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPrimaryBillToAddress(QueryType value) {
        this.primaryBillToAddress = value;
    }

    /**
     * Gets the value of the primaryBillToAddress2 property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPrimaryBillToAddress2() {
        return primaryBillToAddress2;
    }

    /**
     * Sets the value of the primaryBillToAddress2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPrimaryBillToAddress2(QueryType value) {
        this.primaryBillToAddress2 = value;
    }

    /**
     * Gets the value of the primaryBillToCity property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPrimaryBillToCity() {
        return primaryBillToCity;
    }

    /**
     * Sets the value of the primaryBillToCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPrimaryBillToCity(QueryType value) {
        this.primaryBillToCity = value;
    }

    /**
     * Gets the value of the primaryBillToCountry property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPrimaryBillToCountry() {
        return primaryBillToCountry;
    }

    /**
     * Sets the value of the primaryBillToCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPrimaryBillToCountry(QueryType value) {
        this.primaryBillToCountry = value;
    }

    /**
     * Gets the value of the primaryBillToEmail property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPrimaryBillToEmail() {
        return primaryBillToEmail;
    }

    /**
     * Sets the value of the primaryBillToEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPrimaryBillToEmail(QueryType value) {
        this.primaryBillToEmail = value;
    }

    /**
     * Gets the value of the primaryBillToFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPrimaryBillToFirstName() {
        return primaryBillToFirstName;
    }

    /**
     * Sets the value of the primaryBillToFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPrimaryBillToFirstName(QueryType value) {
        this.primaryBillToFirstName = value;
    }

    /**
     * Gets the value of the primaryBillToLastName property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPrimaryBillToLastName() {
        return primaryBillToLastName;
    }

    /**
     * Sets the value of the primaryBillToLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPrimaryBillToLastName(QueryType value) {
        this.primaryBillToLastName = value;
    }

    /**
     * Gets the value of the primaryBillToPostalCode property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPrimaryBillToPostalCode() {
        return primaryBillToPostalCode;
    }

    /**
     * Sets the value of the primaryBillToPostalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPrimaryBillToPostalCode(QueryType value) {
        this.primaryBillToPostalCode = value;
    }

    /**
     * Gets the value of the primaryBillToState property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPrimaryBillToState() {
        return primaryBillToState;
    }

    /**
     * Sets the value of the primaryBillToState property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPrimaryBillToState(QueryType value) {
        this.primaryBillToState = value;
    }

    /**
     * Gets the value of the primaryBillToWorkPhone property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPrimaryBillToWorkPhone() {
        return primaryBillToWorkPhone;
    }

    /**
     * Sets the value of the primaryBillToWorkPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPrimaryBillToWorkPhone(QueryType value) {
        this.primaryBillToWorkPhone = value;
    }

    /**
     * Gets the value of the primaryOrganizationId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPrimaryOrganizationId() {
        return primaryOrganizationId;
    }

    /**
     * Sets the value of the primaryOrganizationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPrimaryOrganizationId(QueryType value) {
        this.primaryOrganizationId = value;
    }

    /**
     * Gets the value of the primaryPositionId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPrimaryPositionId() {
        return primaryPositionId;
    }

    /**
     * Sets the value of the primaryPositionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPrimaryPositionId(QueryType value) {
        this.primaryPositionId = value;
    }

    /**
     * Gets the value of the primaryShipToAddress property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPrimaryShipToAddress() {
        return primaryShipToAddress;
    }

    /**
     * Sets the value of the primaryShipToAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPrimaryShipToAddress(QueryType value) {
        this.primaryShipToAddress = value;
    }

    /**
     * Gets the value of the primaryShipToAddress2 property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPrimaryShipToAddress2() {
        return primaryShipToAddress2;
    }

    /**
     * Sets the value of the primaryShipToAddress2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPrimaryShipToAddress2(QueryType value) {
        this.primaryShipToAddress2 = value;
    }

    /**
     * Gets the value of the primaryShipToAddressId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPrimaryShipToAddressId() {
        return primaryShipToAddressId;
    }

    /**
     * Sets the value of the primaryShipToAddressId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPrimaryShipToAddressId(QueryType value) {
        this.primaryShipToAddressId = value;
    }

    /**
     * Gets the value of the primaryShipToCity property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPrimaryShipToCity() {
        return primaryShipToCity;
    }

    /**
     * Sets the value of the primaryShipToCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPrimaryShipToCity(QueryType value) {
        this.primaryShipToCity = value;
    }

    /**
     * Gets the value of the primaryShipToCountry property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPrimaryShipToCountry() {
        return primaryShipToCountry;
    }

    /**
     * Sets the value of the primaryShipToCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPrimaryShipToCountry(QueryType value) {
        this.primaryShipToCountry = value;
    }

    /**
     * Gets the value of the primaryShipToEmail property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPrimaryShipToEmail() {
        return primaryShipToEmail;
    }

    /**
     * Sets the value of the primaryShipToEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPrimaryShipToEmail(QueryType value) {
        this.primaryShipToEmail = value;
    }

    /**
     * Gets the value of the primaryShipToFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPrimaryShipToFirstName() {
        return primaryShipToFirstName;
    }

    /**
     * Sets the value of the primaryShipToFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPrimaryShipToFirstName(QueryType value) {
        this.primaryShipToFirstName = value;
    }

    /**
     * Gets the value of the primaryShipToLastName property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPrimaryShipToLastName() {
        return primaryShipToLastName;
    }

    /**
     * Sets the value of the primaryShipToLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPrimaryShipToLastName(QueryType value) {
        this.primaryShipToLastName = value;
    }

    /**
     * Gets the value of the primaryShipToPostalCode property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPrimaryShipToPostalCode() {
        return primaryShipToPostalCode;
    }

    /**
     * Sets the value of the primaryShipToPostalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPrimaryShipToPostalCode(QueryType value) {
        this.primaryShipToPostalCode = value;
    }

    /**
     * Gets the value of the primaryShipToState property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPrimaryShipToState() {
        return primaryShipToState;
    }

    /**
     * Sets the value of the primaryShipToState property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPrimaryShipToState(QueryType value) {
        this.primaryShipToState = value;
    }

    /**
     * Gets the value of the primaryShipToWorkPhone property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPrimaryShipToWorkPhone() {
        return primaryShipToWorkPhone;
    }

    /**
     * Sets the value of the primaryShipToWorkPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPrimaryShipToWorkPhone(QueryType value) {
        this.primaryShipToWorkPhone = value;
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
     * Gets the value of the quoteNumber property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getQuoteNumber() {
        return quoteNumber;
    }

    /**
     * Sets the value of the quoteNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setQuoteNumber(QueryType value) {
        this.quoteNumber = value;
    }

    /**
     * Gets the value of the requestedShipDate property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getRequestedShipDate() {
        return requestedShipDate;
    }

    /**
     * Sets the value of the requestedShipDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setRequestedShipDate(QueryType value) {
        this.requestedShipDate = value;
    }

    /**
     * Gets the value of the revision property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getRevision() {
        return revision;
    }

    /**
     * Sets the value of the revision property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setRevision(QueryType value) {
        this.revision = value;
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
     * Gets the value of the serviceContactEmail property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getServiceContactEmail() {
        return serviceContactEmail;
    }

    /**
     * Sets the value of the serviceContactEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setServiceContactEmail(QueryType value) {
        this.serviceContactEmail = value;
    }

    /**
     * Gets the value of the serviceContactFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getServiceContactFirstName() {
        return serviceContactFirstName;
    }

    /**
     * Sets the value of the serviceContactFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setServiceContactFirstName(QueryType value) {
        this.serviceContactFirstName = value;
    }

    /**
     * Gets the value of the serviceContactId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getServiceContactId() {
        return serviceContactId;
    }

    /**
     * Sets the value of the serviceContactId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setServiceContactId(QueryType value) {
        this.serviceContactId = value;
    }

    /**
     * Gets the value of the serviceContactLastName property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getServiceContactLastName() {
        return serviceContactLastName;
    }

    /**
     * Sets the value of the serviceContactLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setServiceContactLastName(QueryType value) {
        this.serviceContactLastName = value;
    }

    /**
     * Gets the value of the serviceContactWorkPhone property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getServiceContactWorkPhone() {
        return serviceContactWorkPhone;
    }

    /**
     * Sets the value of the serviceContactWorkPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setServiceContactWorkPhone(QueryType value) {
        this.serviceContactWorkPhone = value;
    }

    /**
     * Gets the value of the shipInstructions property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getShipInstructions() {
        return shipInstructions;
    }

    /**
     * Sets the value of the shipInstructions property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setShipInstructions(QueryType value) {
        this.shipInstructions = value;
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
     * Gets the value of the taxExempt property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getTaxExempt() {
        return taxExempt;
    }

    /**
     * Sets the value of the taxExempt property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setTaxExempt(QueryType value) {
        this.taxExempt = value;
    }

    /**
     * Gets the value of the taxExemptNumber property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getTaxExemptNumber() {
        return taxExemptNumber;
    }

    /**
     * Sets the value of the taxExemptNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setTaxExemptNumber(QueryType value) {
        this.taxExemptNumber = value;
    }

    /**
     * Gets the value of the taxExemptReason property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getTaxExemptReason() {
        return taxExemptReason;
    }

    /**
     * Sets the value of the taxExemptReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setTaxExemptReason(QueryType value) {
        this.taxExemptReason = value;
    }

    /**
     * Gets the value of the taxRate property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getTaxRate() {
        return taxRate;
    }

    /**
     * Sets the value of the taxRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setTaxRate(QueryType value) {
        this.taxRate = value;
    }

    /**
     * Gets the value of the personalBillToAddressId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPersonalBillToAddressId() {
        return personalBillToAddressId;
    }

    /**
     * Sets the value of the personalBillToAddressId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPersonalBillToAddressId(QueryType value) {
        this.personalBillToAddressId = value;
    }

    /**
     * Gets the value of the personalBillToCity property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPersonalBillToCity() {
        return personalBillToCity;
    }

    /**
     * Sets the value of the personalBillToCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPersonalBillToCity(QueryType value) {
        this.personalBillToCity = value;
    }

    /**
     * Gets the value of the personalBillToCountry property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPersonalBillToCountry() {
        return personalBillToCountry;
    }

    /**
     * Sets the value of the personalBillToCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPersonalBillToCountry(QueryType value) {
        this.personalBillToCountry = value;
    }

    /**
     * Gets the value of the personalBillToPostalCode property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPersonalBillToPostalCode() {
        return personalBillToPostalCode;
    }

    /**
     * Sets the value of the personalBillToPostalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPersonalBillToPostalCode(QueryType value) {
        this.personalBillToPostalCode = value;
    }

    /**
     * Gets the value of the personalBillToState property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPersonalBillToState() {
        return personalBillToState;
    }

    /**
     * Sets the value of the personalBillToState property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPersonalBillToState(QueryType value) {
        this.personalBillToState = value;
    }

    /**
     * Gets the value of the personalBillToStreetAddress property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPersonalBillToStreetAddress() {
        return personalBillToStreetAddress;
    }

    /**
     * Sets the value of the personalBillToStreetAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPersonalBillToStreetAddress(QueryType value) {
        this.personalBillToStreetAddress = value;
    }

    /**
     * Gets the value of the personalBillToStreetAddress2 property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPersonalBillToStreetAddress2() {
        return personalBillToStreetAddress2;
    }

    /**
     * Sets the value of the personalBillToStreetAddress2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPersonalBillToStreetAddress2(QueryType value) {
        this.personalBillToStreetAddress2 = value;
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
     * Gets the value of the serviceAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getServiceAccountNumber() {
        return serviceAccountNumber;
    }

    /**
     * Sets the value of the serviceAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setServiceAccountNumber(QueryType value) {
        this.serviceAccountNumber = value;
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
     * Gets the value of the primaryShipToAddressee property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPrimaryShipToAddressee() {
        return primaryShipToAddressee;
    }

    /**
     * Sets the value of the primaryShipToAddressee property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPrimaryShipToAddressee(QueryType value) {
        this.primaryShipToAddressee = value;
    }

    /**
     * Gets the value of the listOfOrderApprovalHistory property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfOrderApprovalHistoryQuery }
     *     
     */
    public ListOfOrderApprovalHistoryQuery getListOfOrderApprovalHistory() {
        return listOfOrderApprovalHistory;
    }

    /**
     * Sets the value of the listOfOrderApprovalHistory property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfOrderApprovalHistoryQuery }
     *     
     */
    public void setListOfOrderApprovalHistory(ListOfOrderApprovalHistoryQuery value) {
        this.listOfOrderApprovalHistory = value;
    }

    /**
     * Gets the value of the listOfShipment property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfShipmentQuery }
     *     
     */
    public ListOfShipmentQuery getListOfShipment() {
        return listOfShipment;
    }

    /**
     * Sets the value of the listOfShipment property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfShipmentQuery }
     *     
     */
    public void setListOfShipment(ListOfShipmentQuery value) {
        this.listOfShipment = value;
    }

    /**
     * Gets the value of the listOfOrderItemDetail property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfOrderItemDetailQuery }
     *     
     */
    public ListOfOrderItemDetailQuery getListOfOrderItemDetail() {
        return listOfOrderItemDetail;
    }

    /**
     * Sets the value of the listOfOrderItemDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfOrderItemDetailQuery }
     *     
     */
    public void setListOfOrderItemDetail(ListOfOrderItemDetailQuery value) {
        this.listOfOrderItemDetail = value;
    }

    /**
     * Gets the value of the listOfOrderPayment property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfOrderPaymentQuery }
     *     
     */
    public ListOfOrderPaymentQuery getListOfOrderPayment() {
        return listOfOrderPayment;
    }

    /**
     * Sets the value of the listOfOrderPayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfOrderPaymentQuery }
     *     
     */
    public void setListOfOrderPayment(ListOfOrderPaymentQuery value) {
        this.listOfOrderPayment = value;
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
