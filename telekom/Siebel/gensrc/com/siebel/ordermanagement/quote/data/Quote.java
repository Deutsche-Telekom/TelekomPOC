
package com.siebel.ordermanagement.quote.data;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Quote complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Quote">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TaxRate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TaxExemptNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TaxExempt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TaxAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShippingStreetAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShipToContactId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShipToAddressId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ServiceAccountId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Revision" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RequestedShipDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QuoteType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QuoteSubType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QuoteNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PriceListId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrePickMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonalShipToStreetAddress2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonalShipToPostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonalShipToCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonalBillToStreetAddress2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonalBillToPostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonalBillToCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OpportunityId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NRCTotal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MRCTotal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IntegrationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Freight" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DueDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DiscountAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Discount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShippingCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BillingAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BillToContactId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BillToAddressId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BillToAccountId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Active" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AccountType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AccountShipToZip" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AccountShipToState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AccountShipToIntegrationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AccountShipToCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AccountShipToAddress2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AccountId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AccountContractedProductsOnlyFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonalBillToState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonalBillToCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AccountShipToContactHomePhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AccountShipToContactWorkPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AccountShipToContactCellPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AccountShipToContactEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AccountShipToContactLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AccountShipToContactFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FreightTerms" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AccountShipToAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CarrierCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TaxExemptReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CarrierPriority" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CompoundProductNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ServiceAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonalShipToState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonalShipToCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Updated" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AccountLoc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Account" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ModId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryOrganizationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExchangeDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShippingPostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShippingState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShippingCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ConflictId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Created" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonalBillToStreetAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonalShipToStreetAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShipToAccountId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShipToAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonalShipToAddressId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonalBillToAddressId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ContactId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ListOfQuoteItem" type="{http://siebel.com/OrderManagement/Quote/Data}ListOfQuoteItem" minOccurs="0"/>
 *         &lt;element name="BillingAccountId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "Quote", propOrder = {
    "taxRate",
    "taxExemptNumber",
    "taxExempt",
    "taxAmount",
    "shippingStreetAddress",
    "status",
    "shipToContactId",
    "shipToAddressId",
    "serviceAccountId",
    "revision",
    "requestedShipDate",
    "quoteType",
    "quoteSubType",
    "quoteNumber",
    "priceListId",
    "prePickMode",
    "personalShipToStreetAddress2",
    "personalShipToPostalCode",
    "personalShipToCity",
    "personalBillToStreetAddress2",
    "personalBillToPostalCode",
    "personalBillToCity",
    "opportunityId",
    "nrcTotal",
    "mrcTotal",
    "integrationId",
    "freight",
    "dueDate",
    "discountAmount",
    "discount",
    "description",
    "currencyCode",
    "shippingCountry",
    "billingAccount",
    "billToContactId",
    "billToAddressId",
    "billToAccountId",
    "active",
    "accountType",
    "accountShipToZip",
    "accountShipToState",
    "accountShipToIntegrationId",
    "accountShipToCity",
    "accountShipToAddress2",
    "accountId",
    "accountContractedProductsOnlyFlag",
    "personalBillToState",
    "personalBillToCountry",
    "accountShipToContactHomePhone",
    "accountShipToContactWorkPhone",
    "accountShipToContactCellPhone",
    "accountShipToContactEmail",
    "accountShipToContactLastName",
    "accountShipToContactFirstName",
    "freightTerms",
    "accountShipToAddress",
    "carrierCode",
    "taxExemptReason",
    "carrierPriority",
    "compoundProductNumber",
    "serviceAccount",
    "personalShipToState",
    "personalShipToCountry",
    "updated",
    "accountLoc",
    "account",
    "modId",
    "primaryOrganizationId",
    "exchangeDate",
    "shippingPostalCode",
    "startDate",
    "shippingState",
    "id",
    "endDate",
    "shippingCity",
    "conflictId",
    "created",
    "personalBillToStreetAddress",
    "personalShipToStreetAddress",
    "shipToAccountId",
    "shipToAccount",
    "personalShipToAddressId",
    "personalBillToAddressId",
    "contactId",
    "name",
    "listOfQuoteItem",
    "billingAccountId",
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
    "billingContactWorkPhone"
})
public class Quote
    implements Serializable
{

    @XmlElement(name = "TaxRate")
    protected String taxRate;
    @XmlElement(name = "TaxExemptNumber")
    protected String taxExemptNumber;
    @XmlElement(name = "TaxExempt")
    protected String taxExempt;
    @XmlElement(name = "TaxAmount")
    protected String taxAmount;
    @XmlElement(name = "ShippingStreetAddress")
    protected String shippingStreetAddress;
    @XmlElement(name = "Status")
    protected String status;
    @XmlElement(name = "ShipToContactId")
    protected String shipToContactId;
    @XmlElement(name = "ShipToAddressId")
    protected String shipToAddressId;
    @XmlElement(name = "ServiceAccountId")
    protected String serviceAccountId;
    @XmlElement(name = "Revision")
    protected String revision;
    @XmlElement(name = "RequestedShipDate")
    protected String requestedShipDate;
    @XmlElement(name = "QuoteType")
    protected String quoteType;
    @XmlElement(name = "QuoteSubType")
    protected String quoteSubType;
    @XmlElement(name = "QuoteNumber")
    protected String quoteNumber;
    @XmlElement(name = "PriceListId")
    protected String priceListId;
    @XmlElement(name = "PrePickMode")
    protected String prePickMode;
    @XmlElement(name = "PersonalShipToStreetAddress2")
    protected String personalShipToStreetAddress2;
    @XmlElement(name = "PersonalShipToPostalCode")
    protected String personalShipToPostalCode;
    @XmlElement(name = "PersonalShipToCity")
    protected String personalShipToCity;
    @XmlElement(name = "PersonalBillToStreetAddress2")
    protected String personalBillToStreetAddress2;
    @XmlElement(name = "PersonalBillToPostalCode")
    protected String personalBillToPostalCode;
    @XmlElement(name = "PersonalBillToCity")
    protected String personalBillToCity;
    @XmlElement(name = "OpportunityId")
    protected String opportunityId;
    @XmlElement(name = "NRCTotal")
    protected String nrcTotal;
    @XmlElement(name = "MRCTotal")
    protected String mrcTotal;
    @XmlElement(name = "IntegrationId")
    protected String integrationId;
    @XmlElement(name = "Freight")
    protected String freight;
    @XmlElement(name = "DueDate")
    protected String dueDate;
    @XmlElement(name = "DiscountAmount")
    protected String discountAmount;
    @XmlElement(name = "Discount")
    protected String discount;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "CurrencyCode")
    protected String currencyCode;
    @XmlElement(name = "ShippingCountry")
    protected String shippingCountry;
    @XmlElement(name = "BillingAccount")
    protected String billingAccount;
    @XmlElement(name = "BillToContactId")
    protected String billToContactId;
    @XmlElement(name = "BillToAddressId")
    protected String billToAddressId;
    @XmlElement(name = "BillToAccountId")
    protected String billToAccountId;
    @XmlElement(name = "Active")
    protected String active;
    @XmlElement(name = "AccountType")
    protected String accountType;
    @XmlElement(name = "AccountShipToZip")
    protected String accountShipToZip;
    @XmlElement(name = "AccountShipToState")
    protected String accountShipToState;
    @XmlElement(name = "AccountShipToIntegrationId")
    protected String accountShipToIntegrationId;
    @XmlElement(name = "AccountShipToCity")
    protected String accountShipToCity;
    @XmlElement(name = "AccountShipToAddress2")
    protected String accountShipToAddress2;
    @XmlElement(name = "AccountId")
    protected String accountId;
    @XmlElement(name = "AccountContractedProductsOnlyFlag")
    protected String accountContractedProductsOnlyFlag;
    @XmlElement(name = "PersonalBillToState")
    protected String personalBillToState;
    @XmlElement(name = "PersonalBillToCountry")
    protected String personalBillToCountry;
    @XmlElement(name = "AccountShipToContactHomePhone")
    protected String accountShipToContactHomePhone;
    @XmlElement(name = "AccountShipToContactWorkPhone")
    protected String accountShipToContactWorkPhone;
    @XmlElement(name = "AccountShipToContactCellPhone")
    protected String accountShipToContactCellPhone;
    @XmlElement(name = "AccountShipToContactEmail")
    protected String accountShipToContactEmail;
    @XmlElement(name = "AccountShipToContactLastName")
    protected String accountShipToContactLastName;
    @XmlElement(name = "AccountShipToContactFirstName")
    protected String accountShipToContactFirstName;
    @XmlElement(name = "FreightTerms")
    protected String freightTerms;
    @XmlElement(name = "AccountShipToAddress")
    protected String accountShipToAddress;
    @XmlElement(name = "CarrierCode")
    protected String carrierCode;
    @XmlElement(name = "TaxExemptReason")
    protected String taxExemptReason;
    @XmlElement(name = "CarrierPriority")
    protected String carrierPriority;
    @XmlElement(name = "CompoundProductNumber")
    protected String compoundProductNumber;
    @XmlElement(name = "ServiceAccount")
    protected String serviceAccount;
    @XmlElement(name = "PersonalShipToState")
    protected String personalShipToState;
    @XmlElement(name = "PersonalShipToCountry")
    protected String personalShipToCountry;
    @XmlElement(name = "Updated")
    protected String updated;
    @XmlElement(name = "AccountLoc")
    protected String accountLoc;
    @XmlElement(name = "Account")
    protected String account;
    @XmlElement(name = "ModId")
    protected String modId;
    @XmlElement(name = "PrimaryOrganizationId")
    protected String primaryOrganizationId;
    @XmlElement(name = "ExchangeDate")
    protected String exchangeDate;
    @XmlElement(name = "ShippingPostalCode")
    protected String shippingPostalCode;
    @XmlElement(name = "StartDate")
    protected String startDate;
    @XmlElement(name = "ShippingState")
    protected String shippingState;
    @XmlElement(name = "Id")
    protected String id;
    @XmlElement(name = "EndDate")
    protected String endDate;
    @XmlElement(name = "ShippingCity")
    protected String shippingCity;
    @XmlElement(name = "ConflictId")
    protected String conflictId;
    @XmlElement(name = "Created")
    protected String created;
    @XmlElement(name = "PersonalBillToStreetAddress")
    protected String personalBillToStreetAddress;
    @XmlElement(name = "PersonalShipToStreetAddress")
    protected String personalShipToStreetAddress;
    @XmlElement(name = "ShipToAccountId")
    protected String shipToAccountId;
    @XmlElement(name = "ShipToAccount")
    protected String shipToAccount;
    @XmlElement(name = "PersonalShipToAddressId")
    protected String personalShipToAddressId;
    @XmlElement(name = "PersonalBillToAddressId")
    protected String personalBillToAddressId;
    @XmlElement(name = "ContactId")
    protected String contactId;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "ListOfQuoteItem")
    protected ListOfQuoteItem listOfQuoteItem;
    @XmlElement(name = "BillingAccountId")
    protected String billingAccountId;
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
    @XmlAttribute
    protected String searchspec;

    /**
     * Gets the value of the taxRate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxRate() {
        return taxRate;
    }

    /**
     * Sets the value of the taxRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxRate(String value) {
        this.taxRate = value;
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
     * Gets the value of the taxExempt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxExempt() {
        return taxExempt;
    }

    /**
     * Sets the value of the taxExempt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxExempt(String value) {
        this.taxExempt = value;
    }

    /**
     * Gets the value of the taxAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxAmount() {
        return taxAmount;
    }

    /**
     * Sets the value of the taxAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxAmount(String value) {
        this.taxAmount = value;
    }

    /**
     * Gets the value of the shippingStreetAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingStreetAddress() {
        return shippingStreetAddress;
    }

    /**
     * Sets the value of the shippingStreetAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingStreetAddress(String value) {
        this.shippingStreetAddress = value;
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
     * Gets the value of the revision property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRevision() {
        return revision;
    }

    /**
     * Sets the value of the revision property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRevision(String value) {
        this.revision = value;
    }

    /**
     * Gets the value of the requestedShipDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestedShipDate() {
        return requestedShipDate;
    }

    /**
     * Sets the value of the requestedShipDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestedShipDate(String value) {
        this.requestedShipDate = value;
    }

    /**
     * Gets the value of the quoteType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuoteType() {
        return quoteType;
    }

    /**
     * Sets the value of the quoteType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuoteType(String value) {
        this.quoteType = value;
    }

    /**
     * Gets the value of the quoteSubType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuoteSubType() {
        return quoteSubType;
    }

    /**
     * Sets the value of the quoteSubType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuoteSubType(String value) {
        this.quoteSubType = value;
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
     * Gets the value of the prePickMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrePickMode() {
        return prePickMode;
    }

    /**
     * Sets the value of the prePickMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrePickMode(String value) {
        this.prePickMode = value;
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
     * Gets the value of the opportunityId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpportunityId() {
        return opportunityId;
    }

    /**
     * Sets the value of the opportunityId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpportunityId(String value) {
        this.opportunityId = value;
    }

    /**
     * Gets the value of the nrcTotal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNRCTotal() {
        return nrcTotal;
    }

    /**
     * Sets the value of the nrcTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNRCTotal(String value) {
        this.nrcTotal = value;
    }

    /**
     * Gets the value of the mrcTotal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMRCTotal() {
        return mrcTotal;
    }

    /**
     * Sets the value of the mrcTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMRCTotal(String value) {
        this.mrcTotal = value;
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
     * Gets the value of the freight property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFreight() {
        return freight;
    }

    /**
     * Sets the value of the freight property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFreight(String value) {
        this.freight = value;
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
     * Gets the value of the shippingCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingCountry() {
        return shippingCountry;
    }

    /**
     * Sets the value of the shippingCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingCountry(String value) {
        this.shippingCountry = value;
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
     * Gets the value of the active property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActive() {
        return active;
    }

    /**
     * Sets the value of the active property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActive(String value) {
        this.active = value;
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
     * Gets the value of the accountShipToZip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountShipToZip() {
        return accountShipToZip;
    }

    /**
     * Sets the value of the accountShipToZip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountShipToZip(String value) {
        this.accountShipToZip = value;
    }

    /**
     * Gets the value of the accountShipToState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountShipToState() {
        return accountShipToState;
    }

    /**
     * Sets the value of the accountShipToState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountShipToState(String value) {
        this.accountShipToState = value;
    }

    /**
     * Gets the value of the accountShipToIntegrationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountShipToIntegrationId() {
        return accountShipToIntegrationId;
    }

    /**
     * Sets the value of the accountShipToIntegrationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountShipToIntegrationId(String value) {
        this.accountShipToIntegrationId = value;
    }

    /**
     * Gets the value of the accountShipToCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountShipToCity() {
        return accountShipToCity;
    }

    /**
     * Sets the value of the accountShipToCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountShipToCity(String value) {
        this.accountShipToCity = value;
    }

    /**
     * Gets the value of the accountShipToAddress2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountShipToAddress2() {
        return accountShipToAddress2;
    }

    /**
     * Sets the value of the accountShipToAddress2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountShipToAddress2(String value) {
        this.accountShipToAddress2 = value;
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
     * Gets the value of the accountContractedProductsOnlyFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountContractedProductsOnlyFlag() {
        return accountContractedProductsOnlyFlag;
    }

    /**
     * Sets the value of the accountContractedProductsOnlyFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountContractedProductsOnlyFlag(String value) {
        this.accountContractedProductsOnlyFlag = value;
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
     * Gets the value of the accountShipToContactHomePhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountShipToContactHomePhone() {
        return accountShipToContactHomePhone;
    }

    /**
     * Sets the value of the accountShipToContactHomePhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountShipToContactHomePhone(String value) {
        this.accountShipToContactHomePhone = value;
    }

    /**
     * Gets the value of the accountShipToContactWorkPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountShipToContactWorkPhone() {
        return accountShipToContactWorkPhone;
    }

    /**
     * Sets the value of the accountShipToContactWorkPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountShipToContactWorkPhone(String value) {
        this.accountShipToContactWorkPhone = value;
    }

    /**
     * Gets the value of the accountShipToContactCellPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountShipToContactCellPhone() {
        return accountShipToContactCellPhone;
    }

    /**
     * Sets the value of the accountShipToContactCellPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountShipToContactCellPhone(String value) {
        this.accountShipToContactCellPhone = value;
    }

    /**
     * Gets the value of the accountShipToContactEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountShipToContactEmail() {
        return accountShipToContactEmail;
    }

    /**
     * Sets the value of the accountShipToContactEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountShipToContactEmail(String value) {
        this.accountShipToContactEmail = value;
    }

    /**
     * Gets the value of the accountShipToContactLastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountShipToContactLastName() {
        return accountShipToContactLastName;
    }

    /**
     * Sets the value of the accountShipToContactLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountShipToContactLastName(String value) {
        this.accountShipToContactLastName = value;
    }

    /**
     * Gets the value of the accountShipToContactFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountShipToContactFirstName() {
        return accountShipToContactFirstName;
    }

    /**
     * Sets the value of the accountShipToContactFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountShipToContactFirstName(String value) {
        this.accountShipToContactFirstName = value;
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
     * Gets the value of the accountShipToAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountShipToAddress() {
        return accountShipToAddress;
    }

    /**
     * Sets the value of the accountShipToAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountShipToAddress(String value) {
        this.accountShipToAddress = value;
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
     * Gets the value of the accountLoc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountLoc() {
        return accountLoc;
    }

    /**
     * Sets the value of the accountLoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountLoc(String value) {
        this.accountLoc = value;
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
     * Gets the value of the shippingPostalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingPostalCode() {
        return shippingPostalCode;
    }

    /**
     * Sets the value of the shippingPostalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingPostalCode(String value) {
        this.shippingPostalCode = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartDate(String value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the shippingState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingState() {
        return shippingState;
    }

    /**
     * Sets the value of the shippingState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingState(String value) {
        this.shippingState = value;
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
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndDate(String value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the shippingCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingCity() {
        return shippingCity;
    }

    /**
     * Sets the value of the shippingCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingCity(String value) {
        this.shippingCity = value;
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
     * Gets the value of the listOfQuoteItem property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfQuoteItem }
     *     
     */
    public ListOfQuoteItem getListOfQuoteItem() {
        return listOfQuoteItem;
    }

    /**
     * Sets the value of the listOfQuoteItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfQuoteItem }
     *     
     */
    public void setListOfQuoteItem(ListOfQuoteItem value) {
        this.listOfQuoteItem = value;
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
