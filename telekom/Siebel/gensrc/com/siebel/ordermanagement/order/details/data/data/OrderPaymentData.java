
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
 * <p>Java class for OrderPaymentData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderPaymentData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Created" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Updated" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ConflictId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ModId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ABACode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AVSCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AccountNumber-ReadOnly" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ActualCharge" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="AuthorizationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AuthorizationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="BCReadOnlyFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BankAccountId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BankAddressId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BillToAddressId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BillToAddressIntegrationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CalculatedOrderType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CardHolder" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ContactEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ContactFirstLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ContactFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ContactLastFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ContactLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ContactName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ContactPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreatedByName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreditCardNumber-Display" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreditCardTransactionResponseCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreditCardTransactionResponseMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreditCheckMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreditCheckStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreditCheckStatusAsOfDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CustomerId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DateOfBirth" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DesiredPayDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="EncryptionKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExchangeDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="ExpirationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="ExpirationMonth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExpirationYear" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IntegrationId2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InvoiceId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InvoiceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IssuingBankCustomerId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IssuingBankName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IssuingBankPhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LineNumber3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ManualAuthorizationFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MerchantId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrderCustomerId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrderId2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrderNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrderTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Payment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PaymentAccountId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PaymentAccountIntegrationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PaymentAccountLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PaymentAccountName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PaymentAccountSite" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PaymentContactId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PaymentContactIntegrationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PaymentDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="PaymentImportFlg" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PaymentMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PaymentMethodLIC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PaymentProfileName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PaymentStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PaymentStatusAsOfDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="PaymentType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PaymentTypeReadOnlyFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PersonalBillToCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonalBillToCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonalBillToPostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonalBillToState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonalBillToStreetAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonalBillToStreetAddress2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QuoteCustomerId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QuoteId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QuoteNumber2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SSNEncryptionKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SaveCreditCard" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SocialSecurityNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TransactionAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TransactionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TransactionMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TransactionTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="TransactionType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VendorId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VerificationNumber" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ListOfOrderPaymentsBankAddress" type="{http://siebel.com/OrderManagement/Order/Details/Data/Data}ListOfOrderPaymentsBankAddressData" minOccurs="0"/>
 *         &lt;element name="ListOfOrderPaymentsBillToAddress" type="{http://siebel.com/OrderManagement/Order/Details/Data/Data}ListOfOrderPaymentsBillToAddressData" minOccurs="0"/>
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
@XmlType(name = "OrderPaymentData", propOrder = {
    "id",
    "created",
    "updated",
    "conflictId",
    "modId",
    "abaCode",
    "avsCode",
    "accountNumber",
    "accountNumberReadOnly",
    "actualCharge",
    "authorizationCode",
    "authorizationDate",
    "bcReadOnlyFlag",
    "bankAccountId",
    "bankAddressId",
    "billToAddressId",
    "billToAddressIntegrationId",
    "calculatedOrderType",
    "cardHolder",
    "contactEmail",
    "contactFirstLastName",
    "contactFirstName",
    "contactLastFirstName",
    "contactLastName",
    "contactName",
    "contactPhone",
    "createdByName",
    "creditCardNumberDisplay",
    "creditCardTransactionResponseCode",
    "creditCardTransactionResponseMessage",
    "creditCheckMessage",
    "creditCheckStatus",
    "creditCheckStatusAsOfDate",
    "currencyCode",
    "customerId",
    "dateOfBirth",
    "description",
    "desiredPayDate",
    "encryptionKey",
    "exchangeDate",
    "expirationDate",
    "expirationMonth",
    "expirationYear",
    "firstName",
    "integrationId2",
    "invoiceId",
    "invoiceNumber",
    "issuingBankCustomerId",
    "issuingBankName",
    "issuingBankPhoneNumber",
    "lastName",
    "lineNumber3",
    "manualAuthorizationFlag",
    "merchantId",
    "orderCustomerId",
    "orderId2",
    "orderNumber",
    "orderTypeCode",
    "payment",
    "paymentAccountId",
    "paymentAccountIntegrationId",
    "paymentAccountLocation",
    "paymentAccountName",
    "paymentAccountSite",
    "paymentContactId",
    "paymentContactIntegrationId",
    "paymentDate",
    "paymentImportFlg",
    "paymentMethod",
    "paymentMethodLIC",
    "paymentProfileName",
    "paymentStatus",
    "paymentStatusAsOfDate",
    "paymentType",
    "paymentTypeReadOnlyFlag",
    "personalBillToCity",
    "personalBillToCountry",
    "personalBillToPostalCode",
    "personalBillToState",
    "personalBillToStreetAddress",
    "personalBillToStreetAddress2",
    "quoteCustomerId",
    "quoteId",
    "quoteNumber2",
    "ssnEncryptionKey",
    "saveCreditCard",
    "socialSecurityNumber",
    "transactionAmount",
    "transactionId",
    "transactionMessage",
    "transactionTime",
    "transactionType",
    "vendorId",
    "verificationNumber",
    "listOfOrderPaymentsBankAddress",
    "listOfOrderPaymentsBillToAddress"
})
public class OrderPaymentData
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
    @XmlElement(name = "ABACode")
    protected String abaCode;
    @XmlElement(name = "AVSCode")
    protected String avsCode;
    @XmlElement(name = "AccountNumber")
    protected String accountNumber;
    @XmlElement(name = "AccountNumber-ReadOnly")
    protected String accountNumberReadOnly;
    @XmlElement(name = "ActualCharge")
    protected BigDecimal actualCharge;
    @XmlElement(name = "AuthorizationCode")
    protected String authorizationCode;
    @XmlElement(name = "AuthorizationDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar authorizationDate;
    @XmlElement(name = "BCReadOnlyFlag")
    protected String bcReadOnlyFlag;
    @XmlElement(name = "BankAccountId")
    protected String bankAccountId;
    @XmlElement(name = "BankAddressId")
    protected String bankAddressId;
    @XmlElement(name = "BillToAddressId")
    protected String billToAddressId;
    @XmlElement(name = "BillToAddressIntegrationId")
    protected String billToAddressIntegrationId;
    @XmlElement(name = "CalculatedOrderType")
    protected String calculatedOrderType;
    @XmlElement(name = "CardHolder")
    protected String cardHolder;
    @XmlElement(name = "ContactEmail")
    protected String contactEmail;
    @XmlElement(name = "ContactFirstLastName")
    protected String contactFirstLastName;
    @XmlElement(name = "ContactFirstName")
    protected String contactFirstName;
    @XmlElement(name = "ContactLastFirstName")
    protected String contactLastFirstName;
    @XmlElement(name = "ContactLastName")
    protected String contactLastName;
    @XmlElement(name = "ContactName")
    protected String contactName;
    @XmlElement(name = "ContactPhone")
    protected String contactPhone;
    @XmlElement(name = "CreatedByName")
    protected String createdByName;
    @XmlElement(name = "CreditCardNumber-Display")
    protected String creditCardNumberDisplay;
    @XmlElement(name = "CreditCardTransactionResponseCode")
    protected String creditCardTransactionResponseCode;
    @XmlElement(name = "CreditCardTransactionResponseMessage")
    protected String creditCardTransactionResponseMessage;
    @XmlElement(name = "CreditCheckMessage")
    protected String creditCheckMessage;
    @XmlElement(name = "CreditCheckStatus")
    protected String creditCheckStatus;
    @XmlElement(name = "CreditCheckStatusAsOfDate")
    protected XMLGregorianCalendar creditCheckStatusAsOfDate;
    @XmlElement(name = "CurrencyCode")
    protected String currencyCode;
    @XmlElement(name = "CustomerId")
    protected String customerId;
    @XmlElement(name = "DateOfBirth")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateOfBirth;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "DesiredPayDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar desiredPayDate;
    @XmlElement(name = "EncryptionKey")
    protected String encryptionKey;
    @XmlElement(name = "ExchangeDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar exchangeDate;
    @XmlElement(name = "ExpirationDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar expirationDate;
    @XmlElement(name = "ExpirationMonth")
    protected String expirationMonth;
    @XmlElement(name = "ExpirationYear")
    protected String expirationYear;
    @XmlElement(name = "FirstName")
    protected String firstName;
    @XmlElement(name = "IntegrationId2")
    protected String integrationId2;
    @XmlElement(name = "InvoiceId")
    protected String invoiceId;
    @XmlElement(name = "InvoiceNumber")
    protected String invoiceNumber;
    @XmlElement(name = "IssuingBankCustomerId")
    protected String issuingBankCustomerId;
    @XmlElement(name = "IssuingBankName")
    protected String issuingBankName;
    @XmlElement(name = "IssuingBankPhoneNumber")
    protected String issuingBankPhoneNumber;
    @XmlElement(name = "LastName")
    protected String lastName;
    @XmlElement(name = "LineNumber3")
    protected String lineNumber3;
    @XmlElement(name = "ManualAuthorizationFlag")
    protected Boolean manualAuthorizationFlag;
    @XmlElement(name = "MerchantId")
    protected String merchantId;
    @XmlElement(name = "OrderCustomerId")
    protected String orderCustomerId;
    @XmlElement(name = "OrderId2")
    protected String orderId2;
    @XmlElement(name = "OrderNumber")
    protected String orderNumber;
    @XmlElement(name = "OrderTypeCode")
    protected String orderTypeCode;
    @XmlElement(name = "Payment")
    protected String payment;
    @XmlElement(name = "PaymentAccountId")
    protected String paymentAccountId;
    @XmlElement(name = "PaymentAccountIntegrationId")
    protected String paymentAccountIntegrationId;
    @XmlElement(name = "PaymentAccountLocation")
    protected String paymentAccountLocation;
    @XmlElement(name = "PaymentAccountName")
    protected String paymentAccountName;
    @XmlElement(name = "PaymentAccountSite")
    protected String paymentAccountSite;
    @XmlElement(name = "PaymentContactId")
    protected String paymentContactId;
    @XmlElement(name = "PaymentContactIntegrationId")
    protected String paymentContactIntegrationId;
    @XmlElement(name = "PaymentDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar paymentDate;
    @XmlElement(name = "PaymentImportFlg")
    protected Boolean paymentImportFlg;
    @XmlElement(name = "PaymentMethod")
    protected String paymentMethod;
    @XmlElement(name = "PaymentMethodLIC")
    protected String paymentMethodLIC;
    @XmlElement(name = "PaymentProfileName")
    protected String paymentProfileName;
    @XmlElement(name = "PaymentStatus")
    protected String paymentStatus;
    @XmlElement(name = "PaymentStatusAsOfDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar paymentStatusAsOfDate;
    @XmlElement(name = "PaymentType")
    protected String paymentType;
    @XmlElement(name = "PaymentTypeReadOnlyFlag")
    protected Boolean paymentTypeReadOnlyFlag;
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
    @XmlElement(name = "QuoteCustomerId")
    protected String quoteCustomerId;
    @XmlElement(name = "QuoteId")
    protected String quoteId;
    @XmlElement(name = "QuoteNumber2")
    protected String quoteNumber2;
    @XmlElement(name = "SSNEncryptionKey")
    protected String ssnEncryptionKey;
    @XmlElement(name = "SaveCreditCard")
    protected String saveCreditCard;
    @XmlElement(name = "SocialSecurityNumber")
    protected String socialSecurityNumber;
    @XmlElement(name = "TransactionAmount")
    protected BigDecimal transactionAmount;
    @XmlElement(name = "TransactionId")
    protected String transactionId;
    @XmlElement(name = "TransactionMessage")
    protected String transactionMessage;
    @XmlElement(name = "TransactionTime")
    protected XMLGregorianCalendar transactionTime;
    @XmlElement(name = "TransactionType")
    protected String transactionType;
    @XmlElement(name = "VendorId")
    protected String vendorId;
    @XmlElement(name = "VerificationNumber")
    protected BigDecimal verificationNumber;
    @XmlElement(name = "ListOfOrderPaymentsBankAddress")
    protected ListOfOrderPaymentsBankAddressData listOfOrderPaymentsBankAddress;
    @XmlElement(name = "ListOfOrderPaymentsBillToAddress")
    protected ListOfOrderPaymentsBillToAddressData listOfOrderPaymentsBillToAddress;
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
     * Gets the value of the abaCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getABACode() {
        return abaCode;
    }

    /**
     * Sets the value of the abaCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setABACode(String value) {
        this.abaCode = value;
    }

    /**
     * Gets the value of the avsCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAVSCode() {
        return avsCode;
    }

    /**
     * Sets the value of the avsCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAVSCode(String value) {
        this.avsCode = value;
    }

    /**
     * Gets the value of the accountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * Sets the value of the accountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountNumber(String value) {
        this.accountNumber = value;
    }

    /**
     * Gets the value of the accountNumberReadOnly property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountNumberReadOnly() {
        return accountNumberReadOnly;
    }

    /**
     * Sets the value of the accountNumberReadOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountNumberReadOnly(String value) {
        this.accountNumberReadOnly = value;
    }

    /**
     * Gets the value of the actualCharge property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getActualCharge() {
        return actualCharge;
    }

    /**
     * Sets the value of the actualCharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setActualCharge(BigDecimal value) {
        this.actualCharge = value;
    }

    /**
     * Gets the value of the authorizationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthorizationCode() {
        return authorizationCode;
    }

    /**
     * Sets the value of the authorizationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorizationCode(String value) {
        this.authorizationCode = value;
    }

    /**
     * Gets the value of the authorizationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAuthorizationDate() {
        return authorizationDate;
    }

    /**
     * Sets the value of the authorizationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAuthorizationDate(XMLGregorianCalendar value) {
        this.authorizationDate = value;
    }

    /**
     * Gets the value of the bcReadOnlyFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBCReadOnlyFlag() {
        return bcReadOnlyFlag;
    }

    /**
     * Sets the value of the bcReadOnlyFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBCReadOnlyFlag(String value) {
        this.bcReadOnlyFlag = value;
    }

    /**
     * Gets the value of the bankAccountId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankAccountId() {
        return bankAccountId;
    }

    /**
     * Sets the value of the bankAccountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankAccountId(String value) {
        this.bankAccountId = value;
    }

    /**
     * Gets the value of the bankAddressId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankAddressId() {
        return bankAddressId;
    }

    /**
     * Sets the value of the bankAddressId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankAddressId(String value) {
        this.bankAddressId = value;
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
     * Gets the value of the billToAddressIntegrationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillToAddressIntegrationId() {
        return billToAddressIntegrationId;
    }

    /**
     * Sets the value of the billToAddressIntegrationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillToAddressIntegrationId(String value) {
        this.billToAddressIntegrationId = value;
    }

    /**
     * Gets the value of the calculatedOrderType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalculatedOrderType() {
        return calculatedOrderType;
    }

    /**
     * Sets the value of the calculatedOrderType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalculatedOrderType(String value) {
        this.calculatedOrderType = value;
    }

    /**
     * Gets the value of the cardHolder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardHolder() {
        return cardHolder;
    }

    /**
     * Sets the value of the cardHolder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardHolder(String value) {
        this.cardHolder = value;
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
     * Gets the value of the contactFirstLastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactFirstLastName() {
        return contactFirstLastName;
    }

    /**
     * Sets the value of the contactFirstLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactFirstLastName(String value) {
        this.contactFirstLastName = value;
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
     * Gets the value of the contactLastFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactLastFirstName() {
        return contactLastFirstName;
    }

    /**
     * Sets the value of the contactLastFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactLastFirstName(String value) {
        this.contactLastFirstName = value;
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
     * Gets the value of the contactName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactName() {
        return contactName;
    }

    /**
     * Sets the value of the contactName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactName(String value) {
        this.contactName = value;
    }

    /**
     * Gets the value of the contactPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactPhone() {
        return contactPhone;
    }

    /**
     * Sets the value of the contactPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactPhone(String value) {
        this.contactPhone = value;
    }

    /**
     * Gets the value of the createdByName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreatedByName() {
        return createdByName;
    }

    /**
     * Sets the value of the createdByName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreatedByName(String value) {
        this.createdByName = value;
    }

    /**
     * Gets the value of the creditCardNumberDisplay property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditCardNumberDisplay() {
        return creditCardNumberDisplay;
    }

    /**
     * Sets the value of the creditCardNumberDisplay property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditCardNumberDisplay(String value) {
        this.creditCardNumberDisplay = value;
    }

    /**
     * Gets the value of the creditCardTransactionResponseCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditCardTransactionResponseCode() {
        return creditCardTransactionResponseCode;
    }

    /**
     * Sets the value of the creditCardTransactionResponseCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditCardTransactionResponseCode(String value) {
        this.creditCardTransactionResponseCode = value;
    }

    /**
     * Gets the value of the creditCardTransactionResponseMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditCardTransactionResponseMessage() {
        return creditCardTransactionResponseMessage;
    }

    /**
     * Sets the value of the creditCardTransactionResponseMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditCardTransactionResponseMessage(String value) {
        this.creditCardTransactionResponseMessage = value;
    }

    /**
     * Gets the value of the creditCheckMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditCheckMessage() {
        return creditCheckMessage;
    }

    /**
     * Sets the value of the creditCheckMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditCheckMessage(String value) {
        this.creditCheckMessage = value;
    }

    /**
     * Gets the value of the creditCheckStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditCheckStatus() {
        return creditCheckStatus;
    }

    /**
     * Sets the value of the creditCheckStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditCheckStatus(String value) {
        this.creditCheckStatus = value;
    }

    /**
     * Gets the value of the creditCheckStatusAsOfDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreditCheckStatusAsOfDate() {
        return creditCheckStatusAsOfDate;
    }

    /**
     * Sets the value of the creditCheckStatusAsOfDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreditCheckStatusAsOfDate(XMLGregorianCalendar value) {
        this.creditCheckStatusAsOfDate = value;
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
     * Gets the value of the customerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerId() {
        return customerId;
    }

    /**
     * Sets the value of the customerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerId(String value) {
        this.customerId = value;
    }

    /**
     * Gets the value of the dateOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * Sets the value of the dateOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateOfBirth(XMLGregorianCalendar value) {
        this.dateOfBirth = value;
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
     * Gets the value of the desiredPayDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDesiredPayDate() {
        return desiredPayDate;
    }

    /**
     * Sets the value of the desiredPayDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDesiredPayDate(XMLGregorianCalendar value) {
        this.desiredPayDate = value;
    }

    /**
     * Gets the value of the encryptionKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEncryptionKey() {
        return encryptionKey;
    }

    /**
     * Sets the value of the encryptionKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEncryptionKey(String value) {
        this.encryptionKey = value;
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
     * Gets the value of the expirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpirationDate() {
        return expirationDate;
    }

    /**
     * Sets the value of the expirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpirationDate(XMLGregorianCalendar value) {
        this.expirationDate = value;
    }

    /**
     * Gets the value of the expirationMonth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpirationMonth() {
        return expirationMonth;
    }

    /**
     * Sets the value of the expirationMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpirationMonth(String value) {
        this.expirationMonth = value;
    }

    /**
     * Gets the value of the expirationYear property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpirationYear() {
        return expirationYear;
    }

    /**
     * Sets the value of the expirationYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpirationYear(String value) {
        this.expirationYear = value;
    }

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the integrationId2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntegrationId2() {
        return integrationId2;
    }

    /**
     * Sets the value of the integrationId2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntegrationId2(String value) {
        this.integrationId2 = value;
    }

    /**
     * Gets the value of the invoiceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceId() {
        return invoiceId;
    }

    /**
     * Sets the value of the invoiceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceId(String value) {
        this.invoiceId = value;
    }

    /**
     * Gets the value of the invoiceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    /**
     * Sets the value of the invoiceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceNumber(String value) {
        this.invoiceNumber = value;
    }

    /**
     * Gets the value of the issuingBankCustomerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssuingBankCustomerId() {
        return issuingBankCustomerId;
    }

    /**
     * Sets the value of the issuingBankCustomerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssuingBankCustomerId(String value) {
        this.issuingBankCustomerId = value;
    }

    /**
     * Gets the value of the issuingBankName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssuingBankName() {
        return issuingBankName;
    }

    /**
     * Sets the value of the issuingBankName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssuingBankName(String value) {
        this.issuingBankName = value;
    }

    /**
     * Gets the value of the issuingBankPhoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssuingBankPhoneNumber() {
        return issuingBankPhoneNumber;
    }

    /**
     * Sets the value of the issuingBankPhoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssuingBankPhoneNumber(String value) {
        this.issuingBankPhoneNumber = value;
    }

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the lineNumber3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLineNumber3() {
        return lineNumber3;
    }

    /**
     * Sets the value of the lineNumber3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLineNumber3(String value) {
        this.lineNumber3 = value;
    }

    /**
     * Gets the value of the manualAuthorizationFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isManualAuthorizationFlag() {
        return manualAuthorizationFlag;
    }

    /**
     * Sets the value of the manualAuthorizationFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setManualAuthorizationFlag(Boolean value) {
        this.manualAuthorizationFlag = value;
    }

    /**
     * Gets the value of the merchantId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantId() {
        return merchantId;
    }

    /**
     * Sets the value of the merchantId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantId(String value) {
        this.merchantId = value;
    }

    /**
     * Gets the value of the orderCustomerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderCustomerId() {
        return orderCustomerId;
    }

    /**
     * Sets the value of the orderCustomerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderCustomerId(String value) {
        this.orderCustomerId = value;
    }

    /**
     * Gets the value of the orderId2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderId2() {
        return orderId2;
    }

    /**
     * Sets the value of the orderId2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderId2(String value) {
        this.orderId2 = value;
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
     * Gets the value of the payment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayment() {
        return payment;
    }

    /**
     * Sets the value of the payment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayment(String value) {
        this.payment = value;
    }

    /**
     * Gets the value of the paymentAccountId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentAccountId() {
        return paymentAccountId;
    }

    /**
     * Sets the value of the paymentAccountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentAccountId(String value) {
        this.paymentAccountId = value;
    }

    /**
     * Gets the value of the paymentAccountIntegrationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentAccountIntegrationId() {
        return paymentAccountIntegrationId;
    }

    /**
     * Sets the value of the paymentAccountIntegrationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentAccountIntegrationId(String value) {
        this.paymentAccountIntegrationId = value;
    }

    /**
     * Gets the value of the paymentAccountLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentAccountLocation() {
        return paymentAccountLocation;
    }

    /**
     * Sets the value of the paymentAccountLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentAccountLocation(String value) {
        this.paymentAccountLocation = value;
    }

    /**
     * Gets the value of the paymentAccountName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentAccountName() {
        return paymentAccountName;
    }

    /**
     * Sets the value of the paymentAccountName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentAccountName(String value) {
        this.paymentAccountName = value;
    }

    /**
     * Gets the value of the paymentAccountSite property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentAccountSite() {
        return paymentAccountSite;
    }

    /**
     * Sets the value of the paymentAccountSite property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentAccountSite(String value) {
        this.paymentAccountSite = value;
    }

    /**
     * Gets the value of the paymentContactId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentContactId() {
        return paymentContactId;
    }

    /**
     * Sets the value of the paymentContactId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentContactId(String value) {
        this.paymentContactId = value;
    }

    /**
     * Gets the value of the paymentContactIntegrationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentContactIntegrationId() {
        return paymentContactIntegrationId;
    }

    /**
     * Sets the value of the paymentContactIntegrationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentContactIntegrationId(String value) {
        this.paymentContactIntegrationId = value;
    }

    /**
     * Gets the value of the paymentDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPaymentDate() {
        return paymentDate;
    }

    /**
     * Sets the value of the paymentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPaymentDate(XMLGregorianCalendar value) {
        this.paymentDate = value;
    }

    /**
     * Gets the value of the paymentImportFlg property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPaymentImportFlg() {
        return paymentImportFlg;
    }

    /**
     * Sets the value of the paymentImportFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPaymentImportFlg(Boolean value) {
        this.paymentImportFlg = value;
    }

    /**
     * Gets the value of the paymentMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentMethod() {
        return paymentMethod;
    }

    /**
     * Sets the value of the paymentMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentMethod(String value) {
        this.paymentMethod = value;
    }

    /**
     * Gets the value of the paymentMethodLIC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentMethodLIC() {
        return paymentMethodLIC;
    }

    /**
     * Sets the value of the paymentMethodLIC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentMethodLIC(String value) {
        this.paymentMethodLIC = value;
    }

    /**
     * Gets the value of the paymentProfileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentProfileName() {
        return paymentProfileName;
    }

    /**
     * Sets the value of the paymentProfileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentProfileName(String value) {
        this.paymentProfileName = value;
    }

    /**
     * Gets the value of the paymentStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentStatus() {
        return paymentStatus;
    }

    /**
     * Sets the value of the paymentStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentStatus(String value) {
        this.paymentStatus = value;
    }

    /**
     * Gets the value of the paymentStatusAsOfDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPaymentStatusAsOfDate() {
        return paymentStatusAsOfDate;
    }

    /**
     * Sets the value of the paymentStatusAsOfDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPaymentStatusAsOfDate(XMLGregorianCalendar value) {
        this.paymentStatusAsOfDate = value;
    }

    /**
     * Gets the value of the paymentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentType() {
        return paymentType;
    }

    /**
     * Sets the value of the paymentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentType(String value) {
        this.paymentType = value;
    }

    /**
     * Gets the value of the paymentTypeReadOnlyFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPaymentTypeReadOnlyFlag() {
        return paymentTypeReadOnlyFlag;
    }

    /**
     * Sets the value of the paymentTypeReadOnlyFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPaymentTypeReadOnlyFlag(Boolean value) {
        this.paymentTypeReadOnlyFlag = value;
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
     * Gets the value of the quoteCustomerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuoteCustomerId() {
        return quoteCustomerId;
    }

    /**
     * Sets the value of the quoteCustomerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuoteCustomerId(String value) {
        this.quoteCustomerId = value;
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
     * Gets the value of the quoteNumber2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuoteNumber2() {
        return quoteNumber2;
    }

    /**
     * Sets the value of the quoteNumber2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuoteNumber2(String value) {
        this.quoteNumber2 = value;
    }

    /**
     * Gets the value of the ssnEncryptionKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSSNEncryptionKey() {
        return ssnEncryptionKey;
    }

    /**
     * Sets the value of the ssnEncryptionKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSSNEncryptionKey(String value) {
        this.ssnEncryptionKey = value;
    }

    /**
     * Gets the value of the saveCreditCard property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSaveCreditCard() {
        return saveCreditCard;
    }

    /**
     * Sets the value of the saveCreditCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSaveCreditCard(String value) {
        this.saveCreditCard = value;
    }

    /**
     * Gets the value of the socialSecurityNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    /**
     * Sets the value of the socialSecurityNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSocialSecurityNumber(String value) {
        this.socialSecurityNumber = value;
    }

    /**
     * Gets the value of the transactionAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTransactionAmount() {
        return transactionAmount;
    }

    /**
     * Sets the value of the transactionAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTransactionAmount(BigDecimal value) {
        this.transactionAmount = value;
    }

    /**
     * Gets the value of the transactionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionId() {
        return transactionId;
    }

    /**
     * Sets the value of the transactionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionId(String value) {
        this.transactionId = value;
    }

    /**
     * Gets the value of the transactionMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionMessage() {
        return transactionMessage;
    }

    /**
     * Sets the value of the transactionMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionMessage(String value) {
        this.transactionMessage = value;
    }

    /**
     * Gets the value of the transactionTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTransactionTime() {
        return transactionTime;
    }

    /**
     * Sets the value of the transactionTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTransactionTime(XMLGregorianCalendar value) {
        this.transactionTime = value;
    }

    /**
     * Gets the value of the transactionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionType() {
        return transactionType;
    }

    /**
     * Sets the value of the transactionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionType(String value) {
        this.transactionType = value;
    }

    /**
     * Gets the value of the vendorId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendorId() {
        return vendorId;
    }

    /**
     * Sets the value of the vendorId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendorId(String value) {
        this.vendorId = value;
    }

    /**
     * Gets the value of the verificationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVerificationNumber() {
        return verificationNumber;
    }

    /**
     * Sets the value of the verificationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVerificationNumber(BigDecimal value) {
        this.verificationNumber = value;
    }

    /**
     * Gets the value of the listOfOrderPaymentsBankAddress property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfOrderPaymentsBankAddressData }
     *     
     */
    public ListOfOrderPaymentsBankAddressData getListOfOrderPaymentsBankAddress() {
        return listOfOrderPaymentsBankAddress;
    }

    /**
     * Sets the value of the listOfOrderPaymentsBankAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfOrderPaymentsBankAddressData }
     *     
     */
    public void setListOfOrderPaymentsBankAddress(ListOfOrderPaymentsBankAddressData value) {
        this.listOfOrderPaymentsBankAddress = value;
    }

    /**
     * Gets the value of the listOfOrderPaymentsBillToAddress property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfOrderPaymentsBillToAddressData }
     *     
     */
    public ListOfOrderPaymentsBillToAddressData getListOfOrderPaymentsBillToAddress() {
        return listOfOrderPaymentsBillToAddress;
    }

    /**
     * Sets the value of the listOfOrderPaymentsBillToAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfOrderPaymentsBillToAddressData }
     *     
     */
    public void setListOfOrderPaymentsBillToAddress(ListOfOrderPaymentsBillToAddressData value) {
        this.listOfOrderPaymentsBillToAddress = value;
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
