
package com.siebel.selfservice.common.contact.query;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContactBusinessAddressQuery complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContactBusinessAddressQuery">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AddressDisableDataCleansing" type="{http://www.siebel.com/SelfService/Common/Contact/Query}queryType" minOccurs="0"/>
 *         &lt;element name="AddressName" type="{http://www.siebel.com/SelfService/Common/Contact/Query}queryType" minOccurs="0"/>
 *         &lt;element name="AddressNameLockedFlag" type="{http://www.siebel.com/SelfService/Common/Contact/Query}queryType" minOccurs="0"/>
 *         &lt;element name="AddressS-SInstance" type="{http://www.siebel.com/SelfService/Common/Contact/Query}queryType" minOccurs="0"/>
 *         &lt;element name="Addressee" type="{http://www.siebel.com/SelfService/Common/Contact/Query}queryType" minOccurs="0"/>
 *         &lt;element name="BusinessCity" type="{http://www.siebel.com/SelfService/Common/Contact/Query}queryType" minOccurs="0"/>
 *         &lt;element name="BusinessCountry" type="{http://www.siebel.com/SelfService/Common/Contact/Query}queryType" minOccurs="0"/>
 *         &lt;element name="BusinessPostalCode" type="{http://www.siebel.com/SelfService/Common/Contact/Query}queryType" minOccurs="0"/>
 *         &lt;element name="BusinessState" type="{http://www.siebel.com/SelfService/Common/Contact/Query}queryType" minOccurs="0"/>
 *         &lt;element name="BusinessStreetAddress" type="{http://www.siebel.com/SelfService/Common/Contact/Query}queryType" minOccurs="0"/>
 *         &lt;element name="BusinessStreetAddress2" type="{http://www.siebel.com/SelfService/Common/Contact/Query}queryType" minOccurs="0"/>
 *         &lt;element name="MailTypeCode" type="{http://www.siebel.com/SelfService/Common/Contact/Query}queryType" minOccurs="0"/>
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
@XmlType(name = "ContactBusinessAddressQuery", propOrder = {
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
public class ContactBusinessAddressQuery
    implements Serializable
{

    @XmlElement(name = "AddressDisableDataCleansing")
    protected QueryType addressDisableDataCleansing;
    @XmlElement(name = "AddressName")
    protected QueryType addressName;
    @XmlElement(name = "AddressNameLockedFlag")
    protected QueryType addressNameLockedFlag;
    @XmlElement(name = "AddressS-SInstance")
    protected QueryType addressSSInstance;
    @XmlElement(name = "Addressee")
    protected QueryType addressee;
    @XmlElement(name = "BusinessCity")
    protected QueryType businessCity;
    @XmlElement(name = "BusinessCountry")
    protected QueryType businessCountry;
    @XmlElement(name = "BusinessPostalCode")
    protected QueryType businessPostalCode;
    @XmlElement(name = "BusinessState")
    protected QueryType businessState;
    @XmlElement(name = "BusinessStreetAddress")
    protected QueryType businessStreetAddress;
    @XmlElement(name = "BusinessStreetAddress2")
    protected QueryType businessStreetAddress2;
    @XmlElement(name = "MailTypeCode")
    protected QueryType mailTypeCode;
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
     *     {@link QueryType }
     *     
     */
    public QueryType getAddressDisableDataCleansing() {
        return addressDisableDataCleansing;
    }

    /**
     * Sets the value of the addressDisableDataCleansing property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setAddressDisableDataCleansing(QueryType value) {
        this.addressDisableDataCleansing = value;
    }

    /**
     * Gets the value of the addressName property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getAddressName() {
        return addressName;
    }

    /**
     * Sets the value of the addressName property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setAddressName(QueryType value) {
        this.addressName = value;
    }

    /**
     * Gets the value of the addressNameLockedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getAddressNameLockedFlag() {
        return addressNameLockedFlag;
    }

    /**
     * Sets the value of the addressNameLockedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setAddressNameLockedFlag(QueryType value) {
        this.addressNameLockedFlag = value;
    }

    /**
     * Gets the value of the addressSSInstance property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getAddressSSInstance() {
        return addressSSInstance;
    }

    /**
     * Sets the value of the addressSSInstance property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setAddressSSInstance(QueryType value) {
        this.addressSSInstance = value;
    }

    /**
     * Gets the value of the addressee property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getAddressee() {
        return addressee;
    }

    /**
     * Sets the value of the addressee property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setAddressee(QueryType value) {
        this.addressee = value;
    }

    /**
     * Gets the value of the businessCity property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getBusinessCity() {
        return businessCity;
    }

    /**
     * Sets the value of the businessCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setBusinessCity(QueryType value) {
        this.businessCity = value;
    }

    /**
     * Gets the value of the businessCountry property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getBusinessCountry() {
        return businessCountry;
    }

    /**
     * Sets the value of the businessCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setBusinessCountry(QueryType value) {
        this.businessCountry = value;
    }

    /**
     * Gets the value of the businessPostalCode property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getBusinessPostalCode() {
        return businessPostalCode;
    }

    /**
     * Sets the value of the businessPostalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setBusinessPostalCode(QueryType value) {
        this.businessPostalCode = value;
    }

    /**
     * Gets the value of the businessState property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getBusinessState() {
        return businessState;
    }

    /**
     * Sets the value of the businessState property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setBusinessState(QueryType value) {
        this.businessState = value;
    }

    /**
     * Gets the value of the businessStreetAddress property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getBusinessStreetAddress() {
        return businessStreetAddress;
    }

    /**
     * Sets the value of the businessStreetAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setBusinessStreetAddress(QueryType value) {
        this.businessStreetAddress = value;
    }

    /**
     * Gets the value of the businessStreetAddress2 property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getBusinessStreetAddress2() {
        return businessStreetAddress2;
    }

    /**
     * Sets the value of the businessStreetAddress2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setBusinessStreetAddress2(QueryType value) {
        this.businessStreetAddress2 = value;
    }

    /**
     * Gets the value of the mailTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getMailTypeCode() {
        return mailTypeCode;
    }

    /**
     * Sets the value of the mailTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setMailTypeCode(QueryType value) {
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
