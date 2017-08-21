
package com.siebel.ordermanagement.order.details.data.data;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for OrderDetailData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderDetailData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Created" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Updated" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ConflictId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ModId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Account" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AccountAddressId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AccountContractedProductsOnlyFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="AccountId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AccountLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AccountType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Active" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Approved" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="BillToAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BillToAccountId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BillToAccountLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BillToAddressId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BillToContactId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BillableFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="BillingAccountId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CarrierPriority" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CarrierType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CompoundProductNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ContactEmailAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ContactFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ContactId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ContactLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ContactWorkPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Discount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DiscountAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ExchangeDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Freight" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="IntegrationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MRCTotal" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="NRCTotal" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="OptyId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrderDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="OrderNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrderPriority" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrderTotal" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="OrderType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrderTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrderTypeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PaymentTerm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PaymentTermId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonalShipToAddressId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonalShipToCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonalShipToCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonalShipToPostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonalShipToState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonalShipToStreetAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonalShipToStreetAddress2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PriceListId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryBillToAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryBillToAddress2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryBillToCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryBillToCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryBillToEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryBillToFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryBillToLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryBillToPostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryBillToState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryBillToWorkPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryOrganizationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryPositionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryShipToAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryShipToAddress2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryShipToAddressId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryShipToCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryShipToCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryShipToEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryShipToFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryShipToLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryShipToPostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryShipToState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryShipToWorkPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QuoteId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QuoteNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RequestedShipDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Revision" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ScenarioTestFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
 *         &lt;element name="ServiceContactEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ServiceContactFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ServiceContactId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ServiceContactLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ServiceContactWorkPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShipInstructions" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShipToAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShipToAccountId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShipToAccountLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShipToAddressId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShipToContactId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TaxAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TaxExempt" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="TaxExemptNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TaxExemptReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TaxRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PersonalBillToAddressId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonalBillToCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonalBillToCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonalBillToPostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonalBillToState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonalBillToStreetAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonalBillToStreetAddress2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BillingAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BillingAccountLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BillingAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BillingProfileId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BillingProfileName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ServiceAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Comments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BillingAccountAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *         &lt;element name="PersonalShipToAddressee" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryShipToAddressee" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ListOfOrderApprovalHistory" type="{http://siebel.com/OrderManagement/Order/Details/Data/Data}ListOfOrderApprovalHistoryData" minOccurs="0"/>
 *         &lt;element name="ListOfShipment" type="{http://siebel.com/OrderManagement/Order/Details/Data/Data}ListOfShipmentData" minOccurs="0"/>
 *         &lt;element name="ListOfOrderItemDetail" type="{http://siebel.com/OrderManagement/Order/Details/Data/Data}ListOfOrderItemDetailData" minOccurs="0"/>
 *         &lt;element name="ListOfOrderPayment" type="{http://siebel.com/OrderManagement/Order/Details/Data/Data}ListOfOrderPaymentData" minOccurs="0"/>
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
@XmlType(name = "OrderDetailData", propOrder = {
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
public class OrderDetailData
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
    @XmlElement(name = "Account")
    protected String account;
    @XmlElement(name = "AccountAddressId")
    protected String accountAddressId;
    @XmlElement(name = "AccountContractedProductsOnlyFlag")
    protected Boolean accountContractedProductsOnlyFlag;
    @XmlElement(name = "AccountId")
    protected String accountId;
    @XmlElement(name = "AccountLocation")
    protected String accountLocation;
    @XmlElement(name = "AccountType")
    protected String accountType;
    @XmlElement(name = "Active")
    protected Boolean active;
    @XmlElement(name = "Approved")
    protected Boolean approved;
    @XmlElement(name = "BillToAccount")
    protected String billToAccount;
    @XmlElement(name = "BillToAccountId")
    protected String billToAccountId;
    @XmlElement(name = "BillToAccountLocation")
    protected String billToAccountLocation;
    @XmlElement(name = "BillToAddressId")
    protected String billToAddressId;
    @XmlElement(name = "BillToContactId")
    protected String billToContactId;
    @XmlElement(name = "BillableFlag")
    protected Boolean billableFlag;
    @XmlElement(name = "BillingAccountId")
    protected String billingAccountId;
    @XmlElement(name = "CarrierPriority")
    protected String carrierPriority;
    @XmlElement(name = "CarrierType")
    protected String carrierType;
    @XmlElement(name = "CompoundProductNumber")
    protected String compoundProductNumber;
    @XmlElement(name = "ContactEmailAddress")
    protected String contactEmailAddress;
    @XmlElement(name = "ContactFirstName")
    protected String contactFirstName;
    @XmlElement(name = "ContactId")
    protected String contactId;
    @XmlElement(name = "ContactLastName")
    protected String contactLastName;
    @XmlElement(name = "ContactWorkPhone")
    protected String contactWorkPhone;
    @XmlElement(name = "CurrencyCode")
    protected String currencyCode;
    @XmlElement(name = "Discount")
    protected BigDecimal discount;
    @XmlElement(name = "DiscountAmount")
    protected BigDecimal discountAmount;
    @XmlElement(name = "ExchangeDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar exchangeDate;
    @XmlElement(name = "Freight")
    protected BigDecimal freight;
    @XmlElement(name = "IntegrationId")
    protected String integrationId;
    @XmlElement(name = "MRCTotal")
    protected BigDecimal mrcTotal;
    @XmlElement(name = "NRCTotal")
    protected BigDecimal nrcTotal;
    @XmlElement(name = "OptyId")
    protected String optyId;
    @XmlElement(name = "OrderDate")
    protected XMLGregorianCalendar orderDate;
    @XmlElement(name = "OrderNumber")
    protected String orderNumber;
    @XmlElement(name = "OrderPriority")
    protected String orderPriority;
    @XmlElement(name = "OrderTotal")
    protected BigDecimal orderTotal;
    @XmlElement(name = "OrderType")
    protected String orderType;
    @XmlElement(name = "OrderTypeCode")
    protected String orderTypeCode;
    @XmlElement(name = "OrderTypeId")
    protected String orderTypeId;
    @XmlElement(name = "PaymentTerm")
    protected String paymentTerm;
    @XmlElement(name = "PaymentTermId")
    protected String paymentTermId;
    @XmlElement(name = "PersonalShipToAddressId")
    protected String personalShipToAddressId;
    @XmlElement(name = "PersonalShipToCity")
    protected String personalShipToCity;
    @XmlElement(name = "PersonalShipToCountry")
    protected String personalShipToCountry;
    @XmlElement(name = "PersonalShipToPostalCode")
    protected String personalShipToPostalCode;
    @XmlElement(name = "PersonalShipToState")
    protected String personalShipToState;
    @XmlElement(name = "PersonalShipToStreetAddress")
    protected String personalShipToStreetAddress;
    @XmlElement(name = "PersonalShipToStreetAddress2")
    protected String personalShipToStreetAddress2;
    @XmlElement(name = "PriceListId")
    protected String priceListId;
    @XmlElement(name = "PrimaryBillToAddress")
    protected String primaryBillToAddress;
    @XmlElement(name = "PrimaryBillToAddress2")
    protected String primaryBillToAddress2;
    @XmlElement(name = "PrimaryBillToCity")
    protected String primaryBillToCity;
    @XmlElement(name = "PrimaryBillToCountry")
    protected String primaryBillToCountry;
    @XmlElement(name = "PrimaryBillToEmail")
    protected String primaryBillToEmail;
    @XmlElement(name = "PrimaryBillToFirstName")
    protected String primaryBillToFirstName;
    @XmlElement(name = "PrimaryBillToLastName")
    protected String primaryBillToLastName;
    @XmlElement(name = "PrimaryBillToPostalCode")
    protected String primaryBillToPostalCode;
    @XmlElement(name = "PrimaryBillToState")
    protected String primaryBillToState;
    @XmlElement(name = "PrimaryBillToWorkPhone")
    protected String primaryBillToWorkPhone;
    @XmlElement(name = "PrimaryOrganizationId")
    protected String primaryOrganizationId;
    @XmlElement(name = "PrimaryPositionId")
    protected String primaryPositionId;
    @XmlElement(name = "PrimaryShipToAddress")
    protected String primaryShipToAddress;
    @XmlElement(name = "PrimaryShipToAddress2")
    protected String primaryShipToAddress2;
    @XmlElement(name = "PrimaryShipToAddressId")
    protected String primaryShipToAddressId;
    @XmlElement(name = "PrimaryShipToCity")
    protected String primaryShipToCity;
    @XmlElement(name = "PrimaryShipToCountry")
    protected String primaryShipToCountry;
    @XmlElement(name = "PrimaryShipToEmail")
    protected String primaryShipToEmail;
    @XmlElement(name = "PrimaryShipToFirstName")
    protected String primaryShipToFirstName;
    @XmlElement(name = "PrimaryShipToLastName")
    protected String primaryShipToLastName;
    @XmlElement(name = "PrimaryShipToPostalCode")
    protected String primaryShipToPostalCode;
    @XmlElement(name = "PrimaryShipToState")
    protected String primaryShipToState;
    @XmlElement(name = "PrimaryShipToWorkPhone")
    protected String primaryShipToWorkPhone;
    @XmlElement(name = "QuoteId")
    protected String quoteId;
    @XmlElement(name = "QuoteNumber")
    protected String quoteNumber;
    @XmlElement(name = "RequestedShipDate")
    protected XMLGregorianCalendar requestedShipDate;
    @XmlElement(name = "Revision")
    protected Integer revision;
    @XmlElement(name = "ScenarioTestFlag")
    protected Boolean scenarioTestFlag;
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
    @XmlElement(name = "ServiceContactEmail")
    protected String serviceContactEmail;
    @XmlElement(name = "ServiceContactFirstName")
    protected String serviceContactFirstName;
    @XmlElement(name = "ServiceContactId")
    protected String serviceContactId;
    @XmlElement(name = "ServiceContactLastName")
    protected String serviceContactLastName;
    @XmlElement(name = "ServiceContactWorkPhone")
    protected String serviceContactWorkPhone;
    @XmlElement(name = "ShipInstructions")
    protected String shipInstructions;
    @XmlElement(name = "ShipToAccount")
    protected String shipToAccount;
    @XmlElement(name = "ShipToAccountId")
    protected String shipToAccountId;
    @XmlElement(name = "ShipToAccountLocation")
    protected String shipToAccountLocation;
    @XmlElement(name = "ShipToAddressId")
    protected String shipToAddressId;
    @XmlElement(name = "ShipToContactId")
    protected String shipToContactId;
    @XmlElement(name = "Status")
    protected String status;
    @XmlElement(name = "TaxAmount")
    protected BigDecimal taxAmount;
    @XmlElement(name = "TaxExempt")
    protected Boolean taxExempt;
    @XmlElement(name = "TaxExemptNumber")
    protected String taxExemptNumber;
    @XmlElement(name = "TaxExemptReason")
    protected String taxExemptReason;
    @XmlElement(name = "TaxRate")
    protected BigDecimal taxRate;
    @XmlElement(name = "PersonalBillToAddressId")
    protected String personalBillToAddressId;
    @XmlElement(name = "PersonalBillToCity")
    protected String personalBillToCity;
    @XmlElement(name = "PersonalBillToCountry")
    protected String personalBillToCountry;
    @XmlElement(name = "PersonalBillToPostalCode")
    protected String personalBillToPostalCode;
    @XmlElement(name = "PersonalBillToState")
    protected String personalBillToState;
    @XmlElement(name = "PersonalBillToStreetAddress")
    protected String personalBillToStreetAddress;
    @XmlElement(name = "PersonalBillToStreetAddress2")
    protected String personalBillToStreetAddress2;
    @XmlElement(name = "BillingAccount")
    protected String billingAccount;
    @XmlElement(name = "BillingAccountLocation")
    protected String billingAccountLocation;
    @XmlElement(name = "BillingAccountNumber")
    protected String billingAccountNumber;
    @XmlElement(name = "BillingProfileId")
    protected String billingProfileId;
    @XmlElement(name = "BillingProfileName")
    protected String billingProfileName;
    @XmlElement(name = "ServiceAccountNumber")
    protected String serviceAccountNumber;
    @XmlElement(name = "Comments")
    protected String comments;
    @XmlElement(name = "BillingAccountAddress")
    protected String billingAccountAddress;
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
    @XmlElement(name = "PersonalShipToAddressee")
    protected String personalShipToAddressee;
    @XmlElement(name = "PrimaryShipToAddressee")
    protected String primaryShipToAddressee;
    @XmlElement(name = "ListOfOrderApprovalHistory")
    protected ListOfOrderApprovalHistoryData listOfOrderApprovalHistory;
    @XmlElement(name = "ListOfShipment")
    protected ListOfShipmentData listOfShipment;
    @XmlElement(name = "ListOfOrderItemDetail")
    protected ListOfOrderItemDetailData listOfOrderItemDetail;
    @XmlElement(name = "ListOfOrderPayment")
    protected ListOfOrderPaymentData listOfOrderPayment;
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
     * Gets the value of the account property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccount() {
        return account;
    }

    /**
     * Sets the value of the account property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccount(String value) {
        this.account = value;
    }

    /**
     * Gets the value of the accountAddressId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountAddressId() {
        return accountAddressId;
    }

    /**
     * Sets the value of the accountAddressId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountAddressId(String value) {
        this.accountAddressId = value;
    }

    /**
     * Gets the value of the accountContractedProductsOnlyFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAccountContractedProductsOnlyFlag() {
        return accountContractedProductsOnlyFlag;
    }

    /**
     * Sets the value of the accountContractedProductsOnlyFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAccountContractedProductsOnlyFlag(Boolean value) {
        this.accountContractedProductsOnlyFlag = value;
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
     * Gets the value of the accountType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountType() {
        return accountType;
    }

    /**
     * Sets the value of the accountType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountType(String value) {
        this.accountType = value;
    }

    /**
     * Gets the value of the active property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isActive() {
        return active;
    }

    /**
     * Sets the value of the active property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setActive(Boolean value) {
        this.active = value;
    }

    /**
     * Gets the value of the approved property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isApproved() {
        return approved;
    }

    /**
     * Sets the value of the approved property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setApproved(Boolean value) {
        this.approved = value;
    }

    /**
     * Gets the value of the billToAccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillToAccount() {
        return billToAccount;
    }

    /**
     * Sets the value of the billToAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillToAccount(String value) {
        this.billToAccount = value;
    }

    /**
     * Gets the value of the billToAccountId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillToAccountId() {
        return billToAccountId;
    }

    /**
     * Sets the value of the billToAccountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillToAccountId(String value) {
        this.billToAccountId = value;
    }

    /**
     * Gets the value of the billToAccountLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillToAccountLocation() {
        return billToAccountLocation;
    }

    /**
     * Sets the value of the billToAccountLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillToAccountLocation(String value) {
        this.billToAccountLocation = value;
    }

    /**
     * Gets the value of the billToAddressId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillToAddressId() {
        return billToAddressId;
    }

    /**
     * Sets the value of the billToAddressId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillToAddressId(String value) {
        this.billToAddressId = value;
    }

    /**
     * Gets the value of the billToContactId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillToContactId() {
        return billToContactId;
    }

    /**
     * Sets the value of the billToContactId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillToContactId(String value) {
        this.billToContactId = value;
    }

    /**
     * Gets the value of the billableFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBillableFlag() {
        return billableFlag;
    }

    /**
     * Sets the value of the billableFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBillableFlag(Boolean value) {
        this.billableFlag = value;
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
     * Gets the value of the carrierType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarrierType() {
        return carrierType;
    }

    /**
     * Sets the value of the carrierType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarrierType(String value) {
        this.carrierType = value;
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
     * Gets the value of the contactEmailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactEmailAddress() {
        return contactEmailAddress;
    }

    /**
     * Sets the value of the contactEmailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactEmailAddress(String value) {
        this.contactEmailAddress = value;
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
     * Gets the value of the discount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDiscount() {
        return discount;
    }

    /**
     * Sets the value of the discount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDiscount(BigDecimal value) {
        this.discount = value;
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
     * Gets the value of the freight property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFreight() {
        return freight;
    }

    /**
     * Sets the value of the freight property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFreight(BigDecimal value) {
        this.freight = value;
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
     * Gets the value of the mrcTotal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMRCTotal() {
        return mrcTotal;
    }

    /**
     * Sets the value of the mrcTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMRCTotal(BigDecimal value) {
        this.mrcTotal = value;
    }

    /**
     * Gets the value of the nrcTotal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNRCTotal() {
        return nrcTotal;
    }

    /**
     * Sets the value of the nrcTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNRCTotal(BigDecimal value) {
        this.nrcTotal = value;
    }

    /**
     * Gets the value of the optyId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOptyId() {
        return optyId;
    }

    /**
     * Sets the value of the optyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOptyId(String value) {
        this.optyId = value;
    }

    /**
     * Gets the value of the orderDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOrderDate() {
        return orderDate;
    }

    /**
     * Sets the value of the orderDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOrderDate(XMLGregorianCalendar value) {
        this.orderDate = value;
    }

    /**
     * Gets the value of the orderNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderNumber() {
        return orderNumber;
    }

    /**
     * Sets the value of the orderNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderNumber(String value) {
        this.orderNumber = value;
    }

    /**
     * Gets the value of the orderPriority property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderPriority() {
        return orderPriority;
    }

    /**
     * Sets the value of the orderPriority property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderPriority(String value) {
        this.orderPriority = value;
    }

    /**
     * Gets the value of the orderTotal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOrderTotal() {
        return orderTotal;
    }

    /**
     * Sets the value of the orderTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOrderTotal(BigDecimal value) {
        this.orderTotal = value;
    }

    /**
     * Gets the value of the orderType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderType() {
        return orderType;
    }

    /**
     * Sets the value of the orderType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderType(String value) {
        this.orderType = value;
    }

    /**
     * Gets the value of the orderTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderTypeCode() {
        return orderTypeCode;
    }

    /**
     * Sets the value of the orderTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderTypeCode(String value) {
        this.orderTypeCode = value;
    }

    /**
     * Gets the value of the orderTypeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderTypeId() {
        return orderTypeId;
    }

    /**
     * Sets the value of the orderTypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderTypeId(String value) {
        this.orderTypeId = value;
    }

    /**
     * Gets the value of the paymentTerm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentTerm() {
        return paymentTerm;
    }

    /**
     * Sets the value of the paymentTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentTerm(String value) {
        this.paymentTerm = value;
    }

    /**
     * Gets the value of the paymentTermId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentTermId() {
        return paymentTermId;
    }

    /**
     * Sets the value of the paymentTermId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentTermId(String value) {
        this.paymentTermId = value;
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
     * Gets the value of the personalShipToPostalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonalShipToPostalCode() {
        return personalShipToPostalCode;
    }

    /**
     * Sets the value of the personalShipToPostalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonalShipToPostalCode(String value) {
        this.personalShipToPostalCode = value;
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
     * Gets the value of the personalShipToStreetAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonalShipToStreetAddress() {
        return personalShipToStreetAddress;
    }

    /**
     * Sets the value of the personalShipToStreetAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonalShipToStreetAddress(String value) {
        this.personalShipToStreetAddress = value;
    }

    /**
     * Gets the value of the personalShipToStreetAddress2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonalShipToStreetAddress2() {
        return personalShipToStreetAddress2;
    }

    /**
     * Sets the value of the personalShipToStreetAddress2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonalShipToStreetAddress2(String value) {
        this.personalShipToStreetAddress2 = value;
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
     * Gets the value of the primaryBillToAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryBillToAddress() {
        return primaryBillToAddress;
    }

    /**
     * Sets the value of the primaryBillToAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryBillToAddress(String value) {
        this.primaryBillToAddress = value;
    }

    /**
     * Gets the value of the primaryBillToAddress2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryBillToAddress2() {
        return primaryBillToAddress2;
    }

    /**
     * Sets the value of the primaryBillToAddress2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryBillToAddress2(String value) {
        this.primaryBillToAddress2 = value;
    }

    /**
     * Gets the value of the primaryBillToCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryBillToCity() {
        return primaryBillToCity;
    }

    /**
     * Sets the value of the primaryBillToCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryBillToCity(String value) {
        this.primaryBillToCity = value;
    }

    /**
     * Gets the value of the primaryBillToCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryBillToCountry() {
        return primaryBillToCountry;
    }

    /**
     * Sets the value of the primaryBillToCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryBillToCountry(String value) {
        this.primaryBillToCountry = value;
    }

    /**
     * Gets the value of the primaryBillToEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryBillToEmail() {
        return primaryBillToEmail;
    }

    /**
     * Sets the value of the primaryBillToEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryBillToEmail(String value) {
        this.primaryBillToEmail = value;
    }

    /**
     * Gets the value of the primaryBillToFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryBillToFirstName() {
        return primaryBillToFirstName;
    }

    /**
     * Sets the value of the primaryBillToFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryBillToFirstName(String value) {
        this.primaryBillToFirstName = value;
    }

    /**
     * Gets the value of the primaryBillToLastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryBillToLastName() {
        return primaryBillToLastName;
    }

    /**
     * Sets the value of the primaryBillToLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryBillToLastName(String value) {
        this.primaryBillToLastName = value;
    }

    /**
     * Gets the value of the primaryBillToPostalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryBillToPostalCode() {
        return primaryBillToPostalCode;
    }

    /**
     * Sets the value of the primaryBillToPostalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryBillToPostalCode(String value) {
        this.primaryBillToPostalCode = value;
    }

    /**
     * Gets the value of the primaryBillToState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryBillToState() {
        return primaryBillToState;
    }

    /**
     * Sets the value of the primaryBillToState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryBillToState(String value) {
        this.primaryBillToState = value;
    }

    /**
     * Gets the value of the primaryBillToWorkPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryBillToWorkPhone() {
        return primaryBillToWorkPhone;
    }

    /**
     * Sets the value of the primaryBillToWorkPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryBillToWorkPhone(String value) {
        this.primaryBillToWorkPhone = value;
    }

    /**
     * Gets the value of the primaryOrganizationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryOrganizationId() {
        return primaryOrganizationId;
    }

    /**
     * Sets the value of the primaryOrganizationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryOrganizationId(String value) {
        this.primaryOrganizationId = value;
    }

    /**
     * Gets the value of the primaryPositionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryPositionId() {
        return primaryPositionId;
    }

    /**
     * Sets the value of the primaryPositionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryPositionId(String value) {
        this.primaryPositionId = value;
    }

    /**
     * Gets the value of the primaryShipToAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryShipToAddress() {
        return primaryShipToAddress;
    }

    /**
     * Sets the value of the primaryShipToAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryShipToAddress(String value) {
        this.primaryShipToAddress = value;
    }

    /**
     * Gets the value of the primaryShipToAddress2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryShipToAddress2() {
        return primaryShipToAddress2;
    }

    /**
     * Sets the value of the primaryShipToAddress2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryShipToAddress2(String value) {
        this.primaryShipToAddress2 = value;
    }

    /**
     * Gets the value of the primaryShipToAddressId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryShipToAddressId() {
        return primaryShipToAddressId;
    }

    /**
     * Sets the value of the primaryShipToAddressId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryShipToAddressId(String value) {
        this.primaryShipToAddressId = value;
    }

    /**
     * Gets the value of the primaryShipToCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryShipToCity() {
        return primaryShipToCity;
    }

    /**
     * Sets the value of the primaryShipToCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryShipToCity(String value) {
        this.primaryShipToCity = value;
    }

    /**
     * Gets the value of the primaryShipToCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryShipToCountry() {
        return primaryShipToCountry;
    }

    /**
     * Sets the value of the primaryShipToCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryShipToCountry(String value) {
        this.primaryShipToCountry = value;
    }

    /**
     * Gets the value of the primaryShipToEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryShipToEmail() {
        return primaryShipToEmail;
    }

    /**
     * Sets the value of the primaryShipToEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryShipToEmail(String value) {
        this.primaryShipToEmail = value;
    }

    /**
     * Gets the value of the primaryShipToFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryShipToFirstName() {
        return primaryShipToFirstName;
    }

    /**
     * Sets the value of the primaryShipToFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryShipToFirstName(String value) {
        this.primaryShipToFirstName = value;
    }

    /**
     * Gets the value of the primaryShipToLastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryShipToLastName() {
        return primaryShipToLastName;
    }

    /**
     * Sets the value of the primaryShipToLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryShipToLastName(String value) {
        this.primaryShipToLastName = value;
    }

    /**
     * Gets the value of the primaryShipToPostalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryShipToPostalCode() {
        return primaryShipToPostalCode;
    }

    /**
     * Sets the value of the primaryShipToPostalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryShipToPostalCode(String value) {
        this.primaryShipToPostalCode = value;
    }

    /**
     * Gets the value of the primaryShipToState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryShipToState() {
        return primaryShipToState;
    }

    /**
     * Sets the value of the primaryShipToState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryShipToState(String value) {
        this.primaryShipToState = value;
    }

    /**
     * Gets the value of the primaryShipToWorkPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryShipToWorkPhone() {
        return primaryShipToWorkPhone;
    }

    /**
     * Sets the value of the primaryShipToWorkPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryShipToWorkPhone(String value) {
        this.primaryShipToWorkPhone = value;
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
     * Gets the value of the quoteNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuoteNumber() {
        return quoteNumber;
    }

    /**
     * Sets the value of the quoteNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuoteNumber(String value) {
        this.quoteNumber = value;
    }

    /**
     * Gets the value of the requestedShipDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRequestedShipDate() {
        return requestedShipDate;
    }

    /**
     * Sets the value of the requestedShipDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRequestedShipDate(XMLGregorianCalendar value) {
        this.requestedShipDate = value;
    }

    /**
     * Gets the value of the revision property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRevision() {
        return revision;
    }

    /**
     * Sets the value of the revision property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRevision(Integer value) {
        this.revision = value;
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
     * Gets the value of the serviceContactEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceContactEmail() {
        return serviceContactEmail;
    }

    /**
     * Sets the value of the serviceContactEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceContactEmail(String value) {
        this.serviceContactEmail = value;
    }

    /**
     * Gets the value of the serviceContactFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceContactFirstName() {
        return serviceContactFirstName;
    }

    /**
     * Sets the value of the serviceContactFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceContactFirstName(String value) {
        this.serviceContactFirstName = value;
    }

    /**
     * Gets the value of the serviceContactId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceContactId() {
        return serviceContactId;
    }

    /**
     * Sets the value of the serviceContactId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceContactId(String value) {
        this.serviceContactId = value;
    }

    /**
     * Gets the value of the serviceContactLastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceContactLastName() {
        return serviceContactLastName;
    }

    /**
     * Sets the value of the serviceContactLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceContactLastName(String value) {
        this.serviceContactLastName = value;
    }

    /**
     * Gets the value of the serviceContactWorkPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceContactWorkPhone() {
        return serviceContactWorkPhone;
    }

    /**
     * Sets the value of the serviceContactWorkPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceContactWorkPhone(String value) {
        this.serviceContactWorkPhone = value;
    }

    /**
     * Gets the value of the shipInstructions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipInstructions() {
        return shipInstructions;
    }

    /**
     * Sets the value of the shipInstructions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipInstructions(String value) {
        this.shipInstructions = value;
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
     * Gets the value of the taxExempt property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTaxExempt() {
        return taxExempt;
    }

    /**
     * Sets the value of the taxExempt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTaxExempt(Boolean value) {
        this.taxExempt = value;
    }

    /**
     * Gets the value of the taxExemptNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxExemptNumber() {
        return taxExemptNumber;
    }

    /**
     * Sets the value of the taxExemptNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxExemptNumber(String value) {
        this.taxExemptNumber = value;
    }

    /**
     * Gets the value of the taxExemptReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxExemptReason() {
        return taxExemptReason;
    }

    /**
     * Sets the value of the taxExemptReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxExemptReason(String value) {
        this.taxExemptReason = value;
    }

    /**
     * Gets the value of the taxRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTaxRate() {
        return taxRate;
    }

    /**
     * Sets the value of the taxRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTaxRate(BigDecimal value) {
        this.taxRate = value;
    }

    /**
     * Gets the value of the personalBillToAddressId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonalBillToAddressId() {
        return personalBillToAddressId;
    }

    /**
     * Sets the value of the personalBillToAddressId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonalBillToAddressId(String value) {
        this.personalBillToAddressId = value;
    }

    /**
     * Gets the value of the personalBillToCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonalBillToCity() {
        return personalBillToCity;
    }

    /**
     * Sets the value of the personalBillToCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonalBillToCity(String value) {
        this.personalBillToCity = value;
    }

    /**
     * Gets the value of the personalBillToCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonalBillToCountry() {
        return personalBillToCountry;
    }

    /**
     * Sets the value of the personalBillToCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonalBillToCountry(String value) {
        this.personalBillToCountry = value;
    }

    /**
     * Gets the value of the personalBillToPostalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonalBillToPostalCode() {
        return personalBillToPostalCode;
    }

    /**
     * Sets the value of the personalBillToPostalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonalBillToPostalCode(String value) {
        this.personalBillToPostalCode = value;
    }

    /**
     * Gets the value of the personalBillToState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonalBillToState() {
        return personalBillToState;
    }

    /**
     * Sets the value of the personalBillToState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonalBillToState(String value) {
        this.personalBillToState = value;
    }

    /**
     * Gets the value of the personalBillToStreetAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonalBillToStreetAddress() {
        return personalBillToStreetAddress;
    }

    /**
     * Sets the value of the personalBillToStreetAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonalBillToStreetAddress(String value) {
        this.personalBillToStreetAddress = value;
    }

    /**
     * Gets the value of the personalBillToStreetAddress2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonalBillToStreetAddress2() {
        return personalBillToStreetAddress2;
    }

    /**
     * Sets the value of the personalBillToStreetAddress2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonalBillToStreetAddress2(String value) {
        this.personalBillToStreetAddress2 = value;
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
     * Gets the value of the serviceAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceAccountNumber() {
        return serviceAccountNumber;
    }

    /**
     * Sets the value of the serviceAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceAccountNumber(String value) {
        this.serviceAccountNumber = value;
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
     * Gets the value of the primaryShipToAddressee property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryShipToAddressee() {
        return primaryShipToAddressee;
    }

    /**
     * Sets the value of the primaryShipToAddressee property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryShipToAddressee(String value) {
        this.primaryShipToAddressee = value;
    }

    /**
     * Gets the value of the listOfOrderApprovalHistory property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfOrderApprovalHistoryData }
     *     
     */
    public ListOfOrderApprovalHistoryData getListOfOrderApprovalHistory() {
        return listOfOrderApprovalHistory;
    }

    /**
     * Sets the value of the listOfOrderApprovalHistory property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfOrderApprovalHistoryData }
     *     
     */
    public void setListOfOrderApprovalHistory(ListOfOrderApprovalHistoryData value) {
        this.listOfOrderApprovalHistory = value;
    }

    /**
     * Gets the value of the listOfShipment property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfShipmentData }
     *     
     */
    public ListOfShipmentData getListOfShipment() {
        return listOfShipment;
    }

    /**
     * Sets the value of the listOfShipment property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfShipmentData }
     *     
     */
    public void setListOfShipment(ListOfShipmentData value) {
        this.listOfShipment = value;
    }

    /**
     * Gets the value of the listOfOrderItemDetail property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfOrderItemDetailData }
     *     
     */
    public ListOfOrderItemDetailData getListOfOrderItemDetail() {
        return listOfOrderItemDetail;
    }

    /**
     * Sets the value of the listOfOrderItemDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfOrderItemDetailData }
     *     
     */
    public void setListOfOrderItemDetail(ListOfOrderItemDetailData value) {
        this.listOfOrderItemDetail = value;
    }

    /**
     * Gets the value of the listOfOrderPayment property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfOrderPaymentData }
     *     
     */
    public ListOfOrderPaymentData getListOfOrderPayment() {
        return listOfOrderPayment;
    }

    /**
     * Sets the value of the listOfOrderPayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfOrderPaymentData }
     *     
     */
    public void setListOfOrderPayment(ListOfOrderPaymentData value) {
        this.listOfOrderPayment = value;
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
