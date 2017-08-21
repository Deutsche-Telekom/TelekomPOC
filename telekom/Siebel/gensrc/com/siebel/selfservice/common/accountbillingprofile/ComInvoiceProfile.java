
package com.siebel.selfservice.common.accountbillingprofile;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ComInvoiceProfile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ComInvoiceProfile">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Created" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreatedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Updated" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UpdatedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ConflictId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ModId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AccountId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AddressId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AccountPrimaryBillingProfileId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BankAccountName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BankAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BankAccountType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BankAuthorizationflag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BankBranch" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BankLanguageCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BankName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BillFrequency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BillType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BudgetBillingFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ContactFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ContactFullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ContactId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ContactLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Country" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreditCardBlockFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreditCardBlockReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreditCardCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreditCardExpirationMonth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreditCardExpirationYear" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreditCardName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreditCardNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreditCardType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DaysToCash" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EmailBillTo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExternalBillingAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InterestatInvoiceFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MediaType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NoPayFormFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PaymentMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReasonforManualOutsource" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SSAPrimaryField" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StandingOrderFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="State" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StreetAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="YearlyAdvancePaymentFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BankRoutingNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreditCardVerificationNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="operation" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="searchspec" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ComInvoiceProfile", propOrder = {
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
public class ComInvoiceProfile
    implements Serializable
{

    @XmlElement(name = "Id")
    protected String id;
    @XmlElement(name = "Created")
    protected String created;
    @XmlElement(name = "CreatedBy")
    protected String createdBy;
    @XmlElement(name = "Updated")
    protected String updated;
    @XmlElement(name = "UpdatedBy")
    protected String updatedBy;
    @XmlElement(name = "ConflictId")
    protected String conflictId;
    @XmlElement(name = "ModId")
    protected String modId;
    @XmlElement(name = "AccountId", required = true)
    protected String accountId;
    @XmlElement(name = "AddressId")
    protected String addressId;
    @XmlElement(name = "AccountPrimaryBillingProfileId")
    protected String accountPrimaryBillingProfileId;
    @XmlElement(name = "BankAccountName")
    protected String bankAccountName;
    @XmlElement(name = "BankAccountNumber")
    protected String bankAccountNumber;
    @XmlElement(name = "BankAccountType")
    protected String bankAccountType;
    @XmlElement(name = "BankAuthorizationflag")
    protected String bankAuthorizationflag;
    @XmlElement(name = "BankBranch")
    protected String bankBranch;
    @XmlElement(name = "BankLanguageCode")
    protected String bankLanguageCode;
    @XmlElement(name = "BankName")
    protected String bankName;
    @XmlElement(name = "BillFrequency")
    protected String billFrequency;
    @XmlElement(name = "BillType")
    protected String billType;
    @XmlElement(name = "BudgetBillingFlag")
    protected String budgetBillingFlag;
    @XmlElement(name = "City")
    protected String city;
    @XmlElement(name = "ContactFirstName")
    protected String contactFirstName;
    @XmlElement(name = "ContactFullName")
    protected String contactFullName;
    @XmlElement(name = "ContactId")
    protected String contactId;
    @XmlElement(name = "ContactLastName")
    protected String contactLastName;
    @XmlElement(name = "Country")
    protected String country;
    @XmlElement(name = "CreditCardBlockFlag")
    protected String creditCardBlockFlag;
    @XmlElement(name = "CreditCardBlockReason")
    protected String creditCardBlockReason;
    @XmlElement(name = "CreditCardCategory")
    protected String creditCardCategory;
    @XmlElement(name = "CreditCardExpirationMonth")
    protected String creditCardExpirationMonth;
    @XmlElement(name = "CreditCardExpirationYear")
    protected String creditCardExpirationYear;
    @XmlElement(name = "CreditCardName")
    protected String creditCardName;
    @XmlElement(name = "CreditCardNumber")
    protected String creditCardNumber;
    @XmlElement(name = "CreditCardType")
    protected String creditCardType;
    @XmlElement(name = "DaysToCash")
    protected String daysToCash;
    @XmlElement(name = "EmailBillTo")
    protected String emailBillTo;
    @XmlElement(name = "ExternalBillingAccountNumber")
    protected String externalBillingAccountNumber;
    @XmlElement(name = "InterestatInvoiceFlag")
    protected String interestatInvoiceFlag;
    @XmlElement(name = "MediaType")
    protected String mediaType;
    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "NoPayFormFlag")
    protected String noPayFormFlag;
    @XmlElement(name = "PaymentMethod")
    protected String paymentMethod;
    @XmlElement(name = "PostalCode")
    protected String postalCode;
    @XmlElement(name = "ReasonforManualOutsource")
    protected String reasonforManualOutsource;
    @XmlElement(name = "SSAPrimaryField")
    protected String ssaPrimaryField;
    @XmlElement(name = "StandingOrderFlag")
    protected String standingOrderFlag;
    @XmlElement(name = "State")
    protected String state;
    @XmlElement(name = "Status")
    protected String status;
    @XmlElement(name = "StreetAddress", required = true)
    protected String streetAddress;
    @XmlElement(name = "YearlyAdvancePaymentFlag")
    protected String yearlyAdvancePaymentFlag;
    @XmlElement(name = "BankRoutingNumber")
    protected String bankRoutingNumber;
    @XmlElement(name = "CreditCardVerificationNumber")
    protected String creditCardVerificationNumber;
    @XmlAttribute
    protected String operation;
    @XmlAttribute
    protected String searchspec;

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
     * Gets the value of the createdBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * Sets the value of the createdBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreatedBy(String value) {
        this.createdBy = value;
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
     * Gets the value of the updatedBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpdatedBy() {
        return updatedBy;
    }

    /**
     * Sets the value of the updatedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpdatedBy(String value) {
        this.updatedBy = value;
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
     * Gets the value of the addressId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressId() {
        return addressId;
    }

    /**
     * Sets the value of the addressId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressId(String value) {
        this.addressId = value;
    }

    /**
     * Gets the value of the accountPrimaryBillingProfileId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountPrimaryBillingProfileId() {
        return accountPrimaryBillingProfileId;
    }

    /**
     * Sets the value of the accountPrimaryBillingProfileId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountPrimaryBillingProfileId(String value) {
        this.accountPrimaryBillingProfileId = value;
    }

    /**
     * Gets the value of the bankAccountName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankAccountName() {
        return bankAccountName;
    }

    /**
     * Sets the value of the bankAccountName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankAccountName(String value) {
        this.bankAccountName = value;
    }

    /**
     * Gets the value of the bankAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankAccountNumber() {
        return bankAccountNumber;
    }

    /**
     * Sets the value of the bankAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankAccountNumber(String value) {
        this.bankAccountNumber = value;
    }

    /**
     * Gets the value of the bankAccountType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankAccountType() {
        return bankAccountType;
    }

    /**
     * Sets the value of the bankAccountType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankAccountType(String value) {
        this.bankAccountType = value;
    }

    /**
     * Gets the value of the bankAuthorizationflag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankAuthorizationflag() {
        return bankAuthorizationflag;
    }

    /**
     * Sets the value of the bankAuthorizationflag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankAuthorizationflag(String value) {
        this.bankAuthorizationflag = value;
    }

    /**
     * Gets the value of the bankBranch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankBranch() {
        return bankBranch;
    }

    /**
     * Sets the value of the bankBranch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankBranch(String value) {
        this.bankBranch = value;
    }

    /**
     * Gets the value of the bankLanguageCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankLanguageCode() {
        return bankLanguageCode;
    }

    /**
     * Sets the value of the bankLanguageCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankLanguageCode(String value) {
        this.bankLanguageCode = value;
    }

    /**
     * Gets the value of the bankName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankName() {
        return bankName;
    }

    /**
     * Sets the value of the bankName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankName(String value) {
        this.bankName = value;
    }

    /**
     * Gets the value of the billFrequency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillFrequency() {
        return billFrequency;
    }

    /**
     * Sets the value of the billFrequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillFrequency(String value) {
        this.billFrequency = value;
    }

    /**
     * Gets the value of the billType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillType() {
        return billType;
    }

    /**
     * Sets the value of the billType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillType(String value) {
        this.billType = value;
    }

    /**
     * Gets the value of the budgetBillingFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBudgetBillingFlag() {
        return budgetBillingFlag;
    }

    /**
     * Sets the value of the budgetBillingFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBudgetBillingFlag(String value) {
        this.budgetBillingFlag = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
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
     * Gets the value of the contactFullName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactFullName() {
        return contactFullName;
    }

    /**
     * Sets the value of the contactFullName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactFullName(String value) {
        this.contactFullName = value;
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
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountry(String value) {
        this.country = value;
    }

    /**
     * Gets the value of the creditCardBlockFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditCardBlockFlag() {
        return creditCardBlockFlag;
    }

    /**
     * Sets the value of the creditCardBlockFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditCardBlockFlag(String value) {
        this.creditCardBlockFlag = value;
    }

    /**
     * Gets the value of the creditCardBlockReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditCardBlockReason() {
        return creditCardBlockReason;
    }

    /**
     * Sets the value of the creditCardBlockReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditCardBlockReason(String value) {
        this.creditCardBlockReason = value;
    }

    /**
     * Gets the value of the creditCardCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditCardCategory() {
        return creditCardCategory;
    }

    /**
     * Sets the value of the creditCardCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditCardCategory(String value) {
        this.creditCardCategory = value;
    }

    /**
     * Gets the value of the creditCardExpirationMonth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditCardExpirationMonth() {
        return creditCardExpirationMonth;
    }

    /**
     * Sets the value of the creditCardExpirationMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditCardExpirationMonth(String value) {
        this.creditCardExpirationMonth = value;
    }

    /**
     * Gets the value of the creditCardExpirationYear property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditCardExpirationYear() {
        return creditCardExpirationYear;
    }

    /**
     * Sets the value of the creditCardExpirationYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditCardExpirationYear(String value) {
        this.creditCardExpirationYear = value;
    }

    /**
     * Gets the value of the creditCardName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditCardName() {
        return creditCardName;
    }

    /**
     * Sets the value of the creditCardName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditCardName(String value) {
        this.creditCardName = value;
    }

    /**
     * Gets the value of the creditCardNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    /**
     * Sets the value of the creditCardNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditCardNumber(String value) {
        this.creditCardNumber = value;
    }

    /**
     * Gets the value of the creditCardType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditCardType() {
        return creditCardType;
    }

    /**
     * Sets the value of the creditCardType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditCardType(String value) {
        this.creditCardType = value;
    }

    /**
     * Gets the value of the daysToCash property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDaysToCash() {
        return daysToCash;
    }

    /**
     * Sets the value of the daysToCash property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDaysToCash(String value) {
        this.daysToCash = value;
    }

    /**
     * Gets the value of the emailBillTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailBillTo() {
        return emailBillTo;
    }

    /**
     * Sets the value of the emailBillTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailBillTo(String value) {
        this.emailBillTo = value;
    }

    /**
     * Gets the value of the externalBillingAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalBillingAccountNumber() {
        return externalBillingAccountNumber;
    }

    /**
     * Sets the value of the externalBillingAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalBillingAccountNumber(String value) {
        this.externalBillingAccountNumber = value;
    }

    /**
     * Gets the value of the interestatInvoiceFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterestatInvoiceFlag() {
        return interestatInvoiceFlag;
    }

    /**
     * Sets the value of the interestatInvoiceFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterestatInvoiceFlag(String value) {
        this.interestatInvoiceFlag = value;
    }

    /**
     * Gets the value of the mediaType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMediaType() {
        return mediaType;
    }

    /**
     * Sets the value of the mediaType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMediaType(String value) {
        this.mediaType = value;
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
     * Gets the value of the noPayFormFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoPayFormFlag() {
        return noPayFormFlag;
    }

    /**
     * Sets the value of the noPayFormFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoPayFormFlag(String value) {
        this.noPayFormFlag = value;
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
     * Gets the value of the postalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * Sets the value of the postalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostalCode(String value) {
        this.postalCode = value;
    }

    /**
     * Gets the value of the reasonforManualOutsource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReasonforManualOutsource() {
        return reasonforManualOutsource;
    }

    /**
     * Sets the value of the reasonforManualOutsource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReasonforManualOutsource(String value) {
        this.reasonforManualOutsource = value;
    }

    /**
     * Gets the value of the ssaPrimaryField property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSSAPrimaryField() {
        return ssaPrimaryField;
    }

    /**
     * Sets the value of the ssaPrimaryField property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSSAPrimaryField(String value) {
        this.ssaPrimaryField = value;
    }

    /**
     * Gets the value of the standingOrderFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStandingOrderFlag() {
        return standingOrderFlag;
    }

    /**
     * Sets the value of the standingOrderFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStandingOrderFlag(String value) {
        this.standingOrderFlag = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setState(String value) {
        this.state = value;
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
     * Gets the value of the streetAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreetAddress() {
        return streetAddress;
    }

    /**
     * Sets the value of the streetAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreetAddress(String value) {
        this.streetAddress = value;
    }

    /**
     * Gets the value of the yearlyAdvancePaymentFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYearlyAdvancePaymentFlag() {
        return yearlyAdvancePaymentFlag;
    }

    /**
     * Sets the value of the yearlyAdvancePaymentFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYearlyAdvancePaymentFlag(String value) {
        this.yearlyAdvancePaymentFlag = value;
    }

    /**
     * Gets the value of the bankRoutingNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankRoutingNumber() {
        return bankRoutingNumber;
    }

    /**
     * Sets the value of the bankRoutingNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankRoutingNumber(String value) {
        this.bankRoutingNumber = value;
    }

    /**
     * Gets the value of the creditCardVerificationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditCardVerificationNumber() {
        return creditCardVerificationNumber;
    }

    /**
     * Sets the value of the creditCardVerificationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditCardVerificationNumber(String value) {
        this.creditCardVerificationNumber = value;
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
