
package com.siebel.selfservice.common.accountbillingprofile.query;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ComInvoiceProfileQuery complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ComInvoiceProfileQuery">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://www.siebel.com/SelfService/Common/AccountBillingProfile/Query}queryType" minOccurs="0"/>
 *         &lt;element name="Created" type="{http://www.siebel.com/SelfService/Common/AccountBillingProfile/Query}queryType" minOccurs="0"/>
 *         &lt;element name="CreatedBy" type="{http://www.siebel.com/SelfService/Common/AccountBillingProfile/Query}queryType" minOccurs="0"/>
 *         &lt;element name="Updated" type="{http://www.siebel.com/SelfService/Common/AccountBillingProfile/Query}queryType" minOccurs="0"/>
 *         &lt;element name="UpdatedBy" type="{http://www.siebel.com/SelfService/Common/AccountBillingProfile/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ConflictId" type="{http://www.siebel.com/SelfService/Common/AccountBillingProfile/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ModId" type="{http://www.siebel.com/SelfService/Common/AccountBillingProfile/Query}queryType" minOccurs="0"/>
 *         &lt;element name="AccountId" type="{http://www.siebel.com/SelfService/Common/AccountBillingProfile/Query}queryType" minOccurs="0"/>
 *         &lt;element name="AddressId" type="{http://www.siebel.com/SelfService/Common/AccountBillingProfile/Query}queryType" minOccurs="0"/>
 *         &lt;element name="AccountPrimaryBillingProfileId" type="{http://www.siebel.com/SelfService/Common/AccountBillingProfile/Query}queryType" minOccurs="0"/>
 *         &lt;element name="BankAccountName" type="{http://www.siebel.com/SelfService/Common/AccountBillingProfile/Query}queryType" minOccurs="0"/>
 *         &lt;element name="BankAccountNumber" type="{http://www.siebel.com/SelfService/Common/AccountBillingProfile/Query}queryType" minOccurs="0"/>
 *         &lt;element name="BankAccountType" type="{http://www.siebel.com/SelfService/Common/AccountBillingProfile/Query}queryType" minOccurs="0"/>
 *         &lt;element name="BankAuthorizationflag" type="{http://www.siebel.com/SelfService/Common/AccountBillingProfile/Query}queryType" minOccurs="0"/>
 *         &lt;element name="BankBranch" type="{http://www.siebel.com/SelfService/Common/AccountBillingProfile/Query}queryType" minOccurs="0"/>
 *         &lt;element name="BankLanguageCode" type="{http://www.siebel.com/SelfService/Common/AccountBillingProfile/Query}queryType" minOccurs="0"/>
 *         &lt;element name="BankName" type="{http://www.siebel.com/SelfService/Common/AccountBillingProfile/Query}queryType" minOccurs="0"/>
 *         &lt;element name="BillFrequency" type="{http://www.siebel.com/SelfService/Common/AccountBillingProfile/Query}queryType" minOccurs="0"/>
 *         &lt;element name="BillType" type="{http://www.siebel.com/SelfService/Common/AccountBillingProfile/Query}queryType" minOccurs="0"/>
 *         &lt;element name="BudgetBillingFlag" type="{http://www.siebel.com/SelfService/Common/AccountBillingProfile/Query}queryType" minOccurs="0"/>
 *         &lt;element name="City" type="{http://www.siebel.com/SelfService/Common/AccountBillingProfile/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ContactFirstName" type="{http://www.siebel.com/SelfService/Common/AccountBillingProfile/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ContactFullName" type="{http://www.siebel.com/SelfService/Common/AccountBillingProfile/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ContactId" type="{http://www.siebel.com/SelfService/Common/AccountBillingProfile/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ContactLastName" type="{http://www.siebel.com/SelfService/Common/AccountBillingProfile/Query}queryType" minOccurs="0"/>
 *         &lt;element name="Country" type="{http://www.siebel.com/SelfService/Common/AccountBillingProfile/Query}queryType" minOccurs="0"/>
 *         &lt;element name="CreditCardBlockFlag" type="{http://www.siebel.com/SelfService/Common/AccountBillingProfile/Query}queryType" minOccurs="0"/>
 *         &lt;element name="CreditCardBlockReason" type="{http://www.siebel.com/SelfService/Common/AccountBillingProfile/Query}queryType" minOccurs="0"/>
 *         &lt;element name="CreditCardCategory" type="{http://www.siebel.com/SelfService/Common/AccountBillingProfile/Query}queryType" minOccurs="0"/>
 *         &lt;element name="CreditCardExpirationMonth" type="{http://www.siebel.com/SelfService/Common/AccountBillingProfile/Query}queryType" minOccurs="0"/>
 *         &lt;element name="CreditCardExpirationYear" type="{http://www.siebel.com/SelfService/Common/AccountBillingProfile/Query}queryType" minOccurs="0"/>
 *         &lt;element name="CreditCardName" type="{http://www.siebel.com/SelfService/Common/AccountBillingProfile/Query}queryType" minOccurs="0"/>
 *         &lt;element name="CreditCardNumber" type="{http://www.siebel.com/SelfService/Common/AccountBillingProfile/Query}queryType" minOccurs="0"/>
 *         &lt;element name="CreditCardType" type="{http://www.siebel.com/SelfService/Common/AccountBillingProfile/Query}queryType" minOccurs="0"/>
 *         &lt;element name="DaysToCash" type="{http://www.siebel.com/SelfService/Common/AccountBillingProfile/Query}queryType" minOccurs="0"/>
 *         &lt;element name="EmailBillTo" type="{http://www.siebel.com/SelfService/Common/AccountBillingProfile/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ExternalBillingAccountNumber" type="{http://www.siebel.com/SelfService/Common/AccountBillingProfile/Query}queryType" minOccurs="0"/>
 *         &lt;element name="InterestatInvoiceFlag" type="{http://www.siebel.com/SelfService/Common/AccountBillingProfile/Query}queryType" minOccurs="0"/>
 *         &lt;element name="MediaType" type="{http://www.siebel.com/SelfService/Common/AccountBillingProfile/Query}queryType" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.siebel.com/SelfService/Common/AccountBillingProfile/Query}queryType" minOccurs="0"/>
 *         &lt;element name="NoPayFormFlag" type="{http://www.siebel.com/SelfService/Common/AccountBillingProfile/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PaymentMethod" type="{http://www.siebel.com/SelfService/Common/AccountBillingProfile/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PostalCode" type="{http://www.siebel.com/SelfService/Common/AccountBillingProfile/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ReasonforManualOutsource" type="{http://www.siebel.com/SelfService/Common/AccountBillingProfile/Query}queryType" minOccurs="0"/>
 *         &lt;element name="SSAPrimaryField" type="{http://www.siebel.com/SelfService/Common/AccountBillingProfile/Query}queryType" minOccurs="0"/>
 *         &lt;element name="StandingOrderFlag" type="{http://www.siebel.com/SelfService/Common/AccountBillingProfile/Query}queryType" minOccurs="0"/>
 *         &lt;element name="State" type="{http://www.siebel.com/SelfService/Common/AccountBillingProfile/Query}queryType" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://www.siebel.com/SelfService/Common/AccountBillingProfile/Query}queryType" minOccurs="0"/>
 *         &lt;element name="StreetAddress" type="{http://www.siebel.com/SelfService/Common/AccountBillingProfile/Query}queryType" minOccurs="0"/>
 *         &lt;element name="YearlyAdvancePaymentFlag" type="{http://www.siebel.com/SelfService/Common/AccountBillingProfile/Query}queryType" minOccurs="0"/>
 *         &lt;element name="BankRoutingNumber" type="{http://www.siebel.com/SelfService/Common/AccountBillingProfile/Query}queryType" minOccurs="0"/>
 *         &lt;element name="CreditCardVerificationNumber" type="{http://www.siebel.com/SelfService/Common/AccountBillingProfile/Query}queryType" minOccurs="0"/>
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
@XmlType(name = "ComInvoiceProfileQuery", propOrder = {
    "id",
    "created",
    "createdBy",
    "updated",
    "updatedBy",
    "conflictId",
    "modId",
    "accountId",
    "addressId",
    "accountPrimaryBillingProfileId",
    "bankAccountName",
    "bankAccountNumber",
    "bankAccountType",
    "bankAuthorizationflag",
    "bankBranch",
    "bankLanguageCode",
    "bankName",
    "billFrequency",
    "billType",
    "budgetBillingFlag",
    "city",
    "contactFirstName",
    "contactFullName",
    "contactId",
    "contactLastName",
    "country",
    "creditCardBlockFlag",
    "creditCardBlockReason",
    "creditCardCategory",
    "creditCardExpirationMonth",
    "creditCardExpirationYear",
    "creditCardName",
    "creditCardNumber",
    "creditCardType",
    "daysToCash",
    "emailBillTo",
    "externalBillingAccountNumber",
    "interestatInvoiceFlag",
    "mediaType",
    "name",
    "noPayFormFlag",
    "paymentMethod",
    "postalCode",
    "reasonforManualOutsource",
    "ssaPrimaryField",
    "standingOrderFlag",
    "state",
    "status",
    "streetAddress",
    "yearlyAdvancePaymentFlag",
    "bankRoutingNumber",
    "creditCardVerificationNumber"
})
public class ComInvoiceProfileQuery
    implements Serializable
{

    @XmlElement(name = "Id")
    protected QueryType id;
    @XmlElement(name = "Created")
    protected QueryType created;
    @XmlElement(name = "CreatedBy")
    protected QueryType createdBy;
    @XmlElement(name = "Updated")
    protected QueryType updated;
    @XmlElement(name = "UpdatedBy")
    protected QueryType updatedBy;
    @XmlElement(name = "ConflictId")
    protected QueryType conflictId;
    @XmlElement(name = "ModId")
    protected QueryType modId;
    @XmlElement(name = "AccountId")
    protected QueryType accountId;
    @XmlElement(name = "AddressId")
    protected QueryType addressId;
    @XmlElement(name = "AccountPrimaryBillingProfileId")
    protected QueryType accountPrimaryBillingProfileId;
    @XmlElement(name = "BankAccountName")
    protected QueryType bankAccountName;
    @XmlElement(name = "BankAccountNumber")
    protected QueryType bankAccountNumber;
    @XmlElement(name = "BankAccountType")
    protected QueryType bankAccountType;
    @XmlElement(name = "BankAuthorizationflag")
    protected QueryType bankAuthorizationflag;
    @XmlElement(name = "BankBranch")
    protected QueryType bankBranch;
    @XmlElement(name = "BankLanguageCode")
    protected QueryType bankLanguageCode;
    @XmlElement(name = "BankName")
    protected QueryType bankName;
    @XmlElement(name = "BillFrequency")
    protected QueryType billFrequency;
    @XmlElement(name = "BillType")
    protected QueryType billType;
    @XmlElement(name = "BudgetBillingFlag")
    protected QueryType budgetBillingFlag;
    @XmlElement(name = "City")
    protected QueryType city;
    @XmlElement(name = "ContactFirstName")
    protected QueryType contactFirstName;
    @XmlElement(name = "ContactFullName")
    protected QueryType contactFullName;
    @XmlElement(name = "ContactId")
    protected QueryType contactId;
    @XmlElement(name = "ContactLastName")
    protected QueryType contactLastName;
    @XmlElement(name = "Country")
    protected QueryType country;
    @XmlElement(name = "CreditCardBlockFlag")
    protected QueryType creditCardBlockFlag;
    @XmlElement(name = "CreditCardBlockReason")
    protected QueryType creditCardBlockReason;
    @XmlElement(name = "CreditCardCategory")
    protected QueryType creditCardCategory;
    @XmlElement(name = "CreditCardExpirationMonth")
    protected QueryType creditCardExpirationMonth;
    @XmlElement(name = "CreditCardExpirationYear")
    protected QueryType creditCardExpirationYear;
    @XmlElement(name = "CreditCardName")
    protected QueryType creditCardName;
    @XmlElement(name = "CreditCardNumber")
    protected QueryType creditCardNumber;
    @XmlElement(name = "CreditCardType")
    protected QueryType creditCardType;
    @XmlElement(name = "DaysToCash")
    protected QueryType daysToCash;
    @XmlElement(name = "EmailBillTo")
    protected QueryType emailBillTo;
    @XmlElement(name = "ExternalBillingAccountNumber")
    protected QueryType externalBillingAccountNumber;
    @XmlElement(name = "InterestatInvoiceFlag")
    protected QueryType interestatInvoiceFlag;
    @XmlElement(name = "MediaType")
    protected QueryType mediaType;
    @XmlElement(name = "Name")
    protected QueryType name;
    @XmlElement(name = "NoPayFormFlag")
    protected QueryType noPayFormFlag;
    @XmlElement(name = "PaymentMethod")
    protected QueryType paymentMethod;
    @XmlElement(name = "PostalCode")
    protected QueryType postalCode;
    @XmlElement(name = "ReasonforManualOutsource")
    protected QueryType reasonforManualOutsource;
    @XmlElement(name = "SSAPrimaryField")
    protected QueryType ssaPrimaryField;
    @XmlElement(name = "StandingOrderFlag")
    protected QueryType standingOrderFlag;
    @XmlElement(name = "State")
    protected QueryType state;
    @XmlElement(name = "Status")
    protected QueryType status;
    @XmlElement(name = "StreetAddress")
    protected QueryType streetAddress;
    @XmlElement(name = "YearlyAdvancePaymentFlag")
    protected QueryType yearlyAdvancePaymentFlag;
    @XmlElement(name = "BankRoutingNumber")
    protected QueryType bankRoutingNumber;
    @XmlElement(name = "CreditCardVerificationNumber")
    protected QueryType creditCardVerificationNumber;
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
     * Gets the value of the createdBy property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getCreatedBy() {
        return createdBy;
    }

    /**
     * Sets the value of the createdBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setCreatedBy(QueryType value) {
        this.createdBy = value;
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
     * Gets the value of the updatedBy property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getUpdatedBy() {
        return updatedBy;
    }

    /**
     * Sets the value of the updatedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setUpdatedBy(QueryType value) {
        this.updatedBy = value;
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
     * Gets the value of the addressId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getAddressId() {
        return addressId;
    }

    /**
     * Sets the value of the addressId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setAddressId(QueryType value) {
        this.addressId = value;
    }

    /**
     * Gets the value of the accountPrimaryBillingProfileId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getAccountPrimaryBillingProfileId() {
        return accountPrimaryBillingProfileId;
    }

    /**
     * Sets the value of the accountPrimaryBillingProfileId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setAccountPrimaryBillingProfileId(QueryType value) {
        this.accountPrimaryBillingProfileId = value;
    }

    /**
     * Gets the value of the bankAccountName property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getBankAccountName() {
        return bankAccountName;
    }

    /**
     * Sets the value of the bankAccountName property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setBankAccountName(QueryType value) {
        this.bankAccountName = value;
    }

    /**
     * Gets the value of the bankAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getBankAccountNumber() {
        return bankAccountNumber;
    }

    /**
     * Sets the value of the bankAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setBankAccountNumber(QueryType value) {
        this.bankAccountNumber = value;
    }

    /**
     * Gets the value of the bankAccountType property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getBankAccountType() {
        return bankAccountType;
    }

    /**
     * Sets the value of the bankAccountType property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setBankAccountType(QueryType value) {
        this.bankAccountType = value;
    }

    /**
     * Gets the value of the bankAuthorizationflag property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getBankAuthorizationflag() {
        return bankAuthorizationflag;
    }

    /**
     * Sets the value of the bankAuthorizationflag property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setBankAuthorizationflag(QueryType value) {
        this.bankAuthorizationflag = value;
    }

    /**
     * Gets the value of the bankBranch property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getBankBranch() {
        return bankBranch;
    }

    /**
     * Sets the value of the bankBranch property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setBankBranch(QueryType value) {
        this.bankBranch = value;
    }

    /**
     * Gets the value of the bankLanguageCode property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getBankLanguageCode() {
        return bankLanguageCode;
    }

    /**
     * Sets the value of the bankLanguageCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setBankLanguageCode(QueryType value) {
        this.bankLanguageCode = value;
    }

    /**
     * Gets the value of the bankName property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getBankName() {
        return bankName;
    }

    /**
     * Sets the value of the bankName property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setBankName(QueryType value) {
        this.bankName = value;
    }

    /**
     * Gets the value of the billFrequency property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getBillFrequency() {
        return billFrequency;
    }

    /**
     * Sets the value of the billFrequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setBillFrequency(QueryType value) {
        this.billFrequency = value;
    }

    /**
     * Gets the value of the billType property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getBillType() {
        return billType;
    }

    /**
     * Sets the value of the billType property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setBillType(QueryType value) {
        this.billType = value;
    }

    /**
     * Gets the value of the budgetBillingFlag property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getBudgetBillingFlag() {
        return budgetBillingFlag;
    }

    /**
     * Sets the value of the budgetBillingFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setBudgetBillingFlag(QueryType value) {
        this.budgetBillingFlag = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setCity(QueryType value) {
        this.city = value;
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
     * Gets the value of the contactFullName property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getContactFullName() {
        return contactFullName;
    }

    /**
     * Sets the value of the contactFullName property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setContactFullName(QueryType value) {
        this.contactFullName = value;
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
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setCountry(QueryType value) {
        this.country = value;
    }

    /**
     * Gets the value of the creditCardBlockFlag property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getCreditCardBlockFlag() {
        return creditCardBlockFlag;
    }

    /**
     * Sets the value of the creditCardBlockFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setCreditCardBlockFlag(QueryType value) {
        this.creditCardBlockFlag = value;
    }

    /**
     * Gets the value of the creditCardBlockReason property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getCreditCardBlockReason() {
        return creditCardBlockReason;
    }

    /**
     * Sets the value of the creditCardBlockReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setCreditCardBlockReason(QueryType value) {
        this.creditCardBlockReason = value;
    }

    /**
     * Gets the value of the creditCardCategory property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getCreditCardCategory() {
        return creditCardCategory;
    }

    /**
     * Sets the value of the creditCardCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setCreditCardCategory(QueryType value) {
        this.creditCardCategory = value;
    }

    /**
     * Gets the value of the creditCardExpirationMonth property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getCreditCardExpirationMonth() {
        return creditCardExpirationMonth;
    }

    /**
     * Sets the value of the creditCardExpirationMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setCreditCardExpirationMonth(QueryType value) {
        this.creditCardExpirationMonth = value;
    }

    /**
     * Gets the value of the creditCardExpirationYear property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getCreditCardExpirationYear() {
        return creditCardExpirationYear;
    }

    /**
     * Sets the value of the creditCardExpirationYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setCreditCardExpirationYear(QueryType value) {
        this.creditCardExpirationYear = value;
    }

    /**
     * Gets the value of the creditCardName property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getCreditCardName() {
        return creditCardName;
    }

    /**
     * Sets the value of the creditCardName property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setCreditCardName(QueryType value) {
        this.creditCardName = value;
    }

    /**
     * Gets the value of the creditCardNumber property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getCreditCardNumber() {
        return creditCardNumber;
    }

    /**
     * Sets the value of the creditCardNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setCreditCardNumber(QueryType value) {
        this.creditCardNumber = value;
    }

    /**
     * Gets the value of the creditCardType property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getCreditCardType() {
        return creditCardType;
    }

    /**
     * Sets the value of the creditCardType property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setCreditCardType(QueryType value) {
        this.creditCardType = value;
    }

    /**
     * Gets the value of the daysToCash property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getDaysToCash() {
        return daysToCash;
    }

    /**
     * Sets the value of the daysToCash property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setDaysToCash(QueryType value) {
        this.daysToCash = value;
    }

    /**
     * Gets the value of the emailBillTo property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getEmailBillTo() {
        return emailBillTo;
    }

    /**
     * Sets the value of the emailBillTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setEmailBillTo(QueryType value) {
        this.emailBillTo = value;
    }

    /**
     * Gets the value of the externalBillingAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getExternalBillingAccountNumber() {
        return externalBillingAccountNumber;
    }

    /**
     * Sets the value of the externalBillingAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setExternalBillingAccountNumber(QueryType value) {
        this.externalBillingAccountNumber = value;
    }

    /**
     * Gets the value of the interestatInvoiceFlag property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getInterestatInvoiceFlag() {
        return interestatInvoiceFlag;
    }

    /**
     * Sets the value of the interestatInvoiceFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setInterestatInvoiceFlag(QueryType value) {
        this.interestatInvoiceFlag = value;
    }

    /**
     * Gets the value of the mediaType property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getMediaType() {
        return mediaType;
    }

    /**
     * Sets the value of the mediaType property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setMediaType(QueryType value) {
        this.mediaType = value;
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
     * Gets the value of the noPayFormFlag property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getNoPayFormFlag() {
        return noPayFormFlag;
    }

    /**
     * Sets the value of the noPayFormFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setNoPayFormFlag(QueryType value) {
        this.noPayFormFlag = value;
    }

    /**
     * Gets the value of the paymentMethod property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPaymentMethod() {
        return paymentMethod;
    }

    /**
     * Sets the value of the paymentMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPaymentMethod(QueryType value) {
        this.paymentMethod = value;
    }

    /**
     * Gets the value of the postalCode property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPostalCode() {
        return postalCode;
    }

    /**
     * Sets the value of the postalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPostalCode(QueryType value) {
        this.postalCode = value;
    }

    /**
     * Gets the value of the reasonforManualOutsource property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getReasonforManualOutsource() {
        return reasonforManualOutsource;
    }

    /**
     * Sets the value of the reasonforManualOutsource property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setReasonforManualOutsource(QueryType value) {
        this.reasonforManualOutsource = value;
    }

    /**
     * Gets the value of the ssaPrimaryField property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getSSAPrimaryField() {
        return ssaPrimaryField;
    }

    /**
     * Sets the value of the ssaPrimaryField property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setSSAPrimaryField(QueryType value) {
        this.ssaPrimaryField = value;
    }

    /**
     * Gets the value of the standingOrderFlag property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getStandingOrderFlag() {
        return standingOrderFlag;
    }

    /**
     * Sets the value of the standingOrderFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setStandingOrderFlag(QueryType value) {
        this.standingOrderFlag = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setState(QueryType value) {
        this.state = value;
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
     * Gets the value of the streetAddress property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getStreetAddress() {
        return streetAddress;
    }

    /**
     * Sets the value of the streetAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setStreetAddress(QueryType value) {
        this.streetAddress = value;
    }

    /**
     * Gets the value of the yearlyAdvancePaymentFlag property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getYearlyAdvancePaymentFlag() {
        return yearlyAdvancePaymentFlag;
    }

    /**
     * Sets the value of the yearlyAdvancePaymentFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setYearlyAdvancePaymentFlag(QueryType value) {
        this.yearlyAdvancePaymentFlag = value;
    }

    /**
     * Gets the value of the bankRoutingNumber property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getBankRoutingNumber() {
        return bankRoutingNumber;
    }

    /**
     * Sets the value of the bankRoutingNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setBankRoutingNumber(QueryType value) {
        this.bankRoutingNumber = value;
    }

    /**
     * Gets the value of the creditCardVerificationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getCreditCardVerificationNumber() {
        return creditCardVerificationNumber;
    }

    /**
     * Sets the value of the creditCardVerificationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setCreditCardVerificationNumber(QueryType value) {
        this.creditCardVerificationNumber = value;
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
