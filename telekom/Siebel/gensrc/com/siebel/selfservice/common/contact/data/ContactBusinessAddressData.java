
package com.siebel.selfservice.common.contact.data;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContactBusinessAddressData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContactBusinessAddressData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AddressDisableDataCleansing" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="AddressName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AddressNameLockedFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="AddressS-SInstance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Addressee" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BusinessCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BusinessCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BusinessPostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BusinessState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BusinessStreetAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BusinessStreetAddress2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MailTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="IsPrimaryMVG" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Operation" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Searchspec" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContactBusinessAddressData", propOrder = {
    "addressDisableDataCleansing",
    "addressName",
    "addressNameLockedFlag",
    "addressSSInstance",
    "addressee",
    "businessCity",
    "businessCountry",
    "businessPostalCode",
    "businessState",
    "businessStreetAddress",
    "businessStreetAddress2",
    "mailTypeCode"
})
public class ContactBusinessAddressData
    implements Serializable
{

    @XmlElement(name = "AddressDisableDataCleansing")
    protected Boolean addressDisableDataCleansing;
    @XmlElement(name = "AddressName")
    protected String addressName;
    @XmlElement(name = "AddressNameLockedFlag")
    protected Boolean addressNameLockedFlag;
    @XmlElement(name = "AddressS-SInstance")
    protected String addressSSInstance;
    @XmlElement(name = "Addressee")
    protected String addressee;
    @XmlElement(name = "BusinessCity")
    protected String businessCity;
    @XmlElement(name = "BusinessCountry")
    protected String businessCountry;
    @XmlElement(name = "BusinessPostalCode")
    protected String businessPostalCode;
    @XmlElement(name = "BusinessState")
    protected String businessState;
    @XmlElement(name = "BusinessStreetAddress")
    protected String businessStreetAddress;
    @XmlElement(name = "BusinessStreetAddress2")
    protected String businessStreetAddress2;
    @XmlElement(name = "MailTypeCode")
    protected String mailTypeCode;
    @XmlAttribute(name = "IsPrimaryMVG")
    protected String isPrimaryMVG;
    @XmlAttribute(name = "Operation")
    protected String operation;
    @XmlAttribute(name = "Searchspec")
    protected String searchspec;

    /**
     * Gets the value of the addressDisableDataCleansing property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAddressDisableDataCleansing() {
        return addressDisableDataCleansing;
    }

    /**
     * Sets the value of the addressDisableDataCleansing property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAddressDisableDataCleansing(Boolean value) {
        this.addressDisableDataCleansing = value;
    }

    /**
     * Gets the value of the addressName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressName() {
        return addressName;
    }

    /**
     * Sets the value of the addressName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressName(String value) {
        this.addressName = value;
    }

    /**
     * Gets the value of the addressNameLockedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAddressNameLockedFlag() {
        return addressNameLockedFlag;
    }

    /**
     * Sets the value of the addressNameLockedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAddressNameLockedFlag(Boolean value) {
        this.addressNameLockedFlag = value;
    }

    /**
     * Gets the value of the addressSSInstance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressSSInstance() {
        return addressSSInstance;
    }

    /**
     * Sets the value of the addressSSInstance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressSSInstance(String value) {
        this.addressSSInstance = value;
    }

    /**
     * Gets the value of the addressee property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressee() {
        return addressee;
    }

    /**
     * Sets the value of the addressee property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressee(String value) {
        this.addressee = value;
    }

    /**
     * Gets the value of the businessCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessCity() {
        return businessCity;
    }

    /**
     * Sets the value of the businessCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessCity(String value) {
        this.businessCity = value;
    }

    /**
     * Gets the value of the businessCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessCountry() {
        return businessCountry;
    }

    /**
     * Sets the value of the businessCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessCountry(String value) {
        this.businessCountry = value;
    }

    /**
     * Gets the value of the businessPostalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessPostalCode() {
        return businessPostalCode;
    }

    /**
     * Sets the value of the businessPostalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessPostalCode(String value) {
        this.businessPostalCode = value;
    }

    /**
     * Gets the value of the businessState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessState() {
        return businessState;
    }

    /**
     * Sets the value of the businessState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessState(String value) {
        this.businessState = value;
    }

    /**
     * Gets the value of the businessStreetAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessStreetAddress() {
        return businessStreetAddress;
    }

    /**
     * Sets the value of the businessStreetAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessStreetAddress(String value) {
        this.businessStreetAddress = value;
    }

    /**
     * Gets the value of the businessStreetAddress2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessStreetAddress2() {
        return businessStreetAddress2;
    }

    /**
     * Sets the value of the businessStreetAddress2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessStreetAddress2(String value) {
        this.businessStreetAddress2 = value;
    }

    /**
     * Gets the value of the mailTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMailTypeCode() {
        return mailTypeCode;
    }

    /**
     * Sets the value of the mailTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMailTypeCode(String value) {
        this.mailTypeCode = value;
    }

    /**
     * Gets the value of the isPrimaryMVG property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsPrimaryMVG() {
        return isPrimaryMVG;
    }

    /**
     * Sets the value of the isPrimaryMVG property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsPrimaryMVG(String value) {
        this.isPrimaryMVG = value;
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
