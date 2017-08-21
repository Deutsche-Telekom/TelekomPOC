
package com.siebel.ordermanagement.promotion.data;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServiceAgreement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceAgreement">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Account" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AccountId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AccountLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AccountType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Active" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AgreementEndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AgreementId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AgreementNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AgreementStartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AgreementStatus" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AgreementType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Contact" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ContactFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ContactPersonId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EffectiveDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ListOfFsAgreementItem" type="{http://siebel.com/OrderManagement/Promotion/Data}ListOfFsAgreementItem" minOccurs="0"/>
 *         &lt;element name="ListOfIssPromotionAgreementTerms" type="{http://siebel.com/OrderManagement/Promotion/Data}ListOfIssPromotionAgreementTerms" minOccurs="0"/>
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
@XmlType(name = "ServiceAgreement", propOrder = {
    "account",
    "accountId",
    "accountLocation",
    "accountType",
    "active",
    "agreementEndDate",
    "agreementId",
    "agreementNumber",
    "agreementStartDate",
    "agreementStatus",
    "agreementType",
    "contact",
    "contactFirstName",
    "contactPersonId",
    "effectiveDate",
    "name",
    "listOfFsAgreementItem",
    "listOfIssPromotionAgreementTerms"
})
public class ServiceAgreement
    implements Serializable
{

    @XmlElement(name = "Account")
    protected String account;
    @XmlElement(name = "AccountId")
    protected String accountId;
    @XmlElement(name = "AccountLocation")
    protected String accountLocation;
    @XmlElement(name = "AccountType")
    protected String accountType;
    @XmlElement(name = "Active")
    protected String active;
    @XmlElement(name = "AgreementEndDate")
    protected String agreementEndDate;
    @XmlElement(name = "AgreementId")
    protected String agreementId;
    @XmlElement(name = "AgreementNumber")
    protected String agreementNumber;
    @XmlElement(name = "AgreementStartDate")
    protected String agreementStartDate;
    @XmlElement(name = "AgreementStatus", required = true)
    protected String agreementStatus;
    @XmlElement(name = "AgreementType", required = true)
    protected String agreementType;
    @XmlElement(name = "Contact")
    protected String contact;
    @XmlElement(name = "ContactFirstName")
    protected String contactFirstName;
    @XmlElement(name = "ContactPersonId")
    protected String contactPersonId;
    @XmlElement(name = "EffectiveDate")
    protected String effectiveDate;
    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "ListOfFsAgreementItem")
    protected ListOfFsAgreementItem listOfFsAgreementItem;
    @XmlElement(name = "ListOfIssPromotionAgreementTerms")
    protected ListOfIssPromotionAgreementTerms listOfIssPromotionAgreementTerms;
    @XmlAttribute
    protected String operation;
    @XmlAttribute
    protected String searchspec;

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
     * Gets the value of the agreementEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgreementEndDate() {
        return agreementEndDate;
    }

    /**
     * Sets the value of the agreementEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgreementEndDate(String value) {
        this.agreementEndDate = value;
    }

    /**
     * Gets the value of the agreementId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgreementId() {
        return agreementId;
    }

    /**
     * Sets the value of the agreementId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgreementId(String value) {
        this.agreementId = value;
    }

    /**
     * Gets the value of the agreementNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgreementNumber() {
        return agreementNumber;
    }

    /**
     * Sets the value of the agreementNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgreementNumber(String value) {
        this.agreementNumber = value;
    }

    /**
     * Gets the value of the agreementStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgreementStartDate() {
        return agreementStartDate;
    }

    /**
     * Sets the value of the agreementStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgreementStartDate(String value) {
        this.agreementStartDate = value;
    }

    /**
     * Gets the value of the agreementStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgreementStatus() {
        return agreementStatus;
    }

    /**
     * Sets the value of the agreementStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgreementStatus(String value) {
        this.agreementStatus = value;
    }

    /**
     * Gets the value of the agreementType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgreementType() {
        return agreementType;
    }

    /**
     * Sets the value of the agreementType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgreementType(String value) {
        this.agreementType = value;
    }

    /**
     * Gets the value of the contact property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContact() {
        return contact;
    }

    /**
     * Sets the value of the contact property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContact(String value) {
        this.contact = value;
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
     * Gets the value of the contactPersonId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactPersonId() {
        return contactPersonId;
    }

    /**
     * Sets the value of the contactPersonId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactPersonId(String value) {
        this.contactPersonId = value;
    }

    /**
     * Gets the value of the effectiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEffectiveDate() {
        return effectiveDate;
    }

    /**
     * Sets the value of the effectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEffectiveDate(String value) {
        this.effectiveDate = value;
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
     * Gets the value of the listOfFsAgreementItem property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfFsAgreementItem }
     *     
     */
    public ListOfFsAgreementItem getListOfFsAgreementItem() {
        return listOfFsAgreementItem;
    }

    /**
     * Sets the value of the listOfFsAgreementItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfFsAgreementItem }
     *     
     */
    public void setListOfFsAgreementItem(ListOfFsAgreementItem value) {
        this.listOfFsAgreementItem = value;
    }

    /**
     * Gets the value of the listOfIssPromotionAgreementTerms property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfIssPromotionAgreementTerms }
     *     
     */
    public ListOfIssPromotionAgreementTerms getListOfIssPromotionAgreementTerms() {
        return listOfIssPromotionAgreementTerms;
    }

    /**
     * Sets the value of the listOfIssPromotionAgreementTerms property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfIssPromotionAgreementTerms }
     *     
     */
    public void setListOfIssPromotionAgreementTerms(ListOfIssPromotionAgreementTerms value) {
        this.listOfIssPromotionAgreementTerms = value;
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
