
package com.siebel.selfservice.common.contact.query;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccountBusinessAddressQuery complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccountBusinessAddressQuery">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AddressActiveStatus" type="{http://www.siebel.com/SelfService/Common/Contact/Query}queryType" minOccurs="0"/>
 *         &lt;element name="AddressId" type="{http://www.siebel.com/SelfService/Common/Contact/Query}queryType" minOccurs="0"/>
 *         &lt;element name="AddressIntegrationId" type="{http://www.siebel.com/SelfService/Common/Contact/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ApartmentNumber" type="{http://www.siebel.com/SelfService/Common/Contact/Query}queryType" minOccurs="0"/>
 *         &lt;element name="BillAddressFlag" type="{http://www.siebel.com/SelfService/Common/Contact/Query}queryType" minOccurs="0"/>
 *         &lt;element name="BrickId" type="{http://www.siebel.com/SelfService/Common/Contact/Query}queryType" minOccurs="0"/>
 *         &lt;element name="BrickName" type="{http://www.siebel.com/SelfService/Common/Contact/Query}queryType" minOccurs="0"/>
 *         &lt;element name="City" type="{http://www.siebel.com/SelfService/Common/Contact/Query}queryType" minOccurs="0"/>
 *         &lt;element name="Country" type="{http://www.siebel.com/SelfService/Common/Contact/Query}queryType" minOccurs="0"/>
 *         &lt;element name="County" type="{http://www.siebel.com/SelfService/Common/Contact/Query}queryType" minOccurs="0"/>
 *         &lt;element name="Descriptor" type="{http://www.siebel.com/SelfService/Common/Contact/Query}queryType" minOccurs="0"/>
 *         &lt;element name="EmailAddress" type="{http://www.siebel.com/SelfService/Common/Contact/Query}queryType" minOccurs="0"/>
 *         &lt;element name="FaxNumber" type="{http://www.siebel.com/SelfService/Common/Contact/Query}queryType" minOccurs="0"/>
 *         &lt;element name="LandlordName" type="{http://www.siebel.com/SelfService/Common/Contact/Query}queryType" minOccurs="0"/>
 *         &lt;element name="LandlordPhoneNumber" type="{http://www.siebel.com/SelfService/Common/Contact/Query}queryType" minOccurs="0"/>
 *         &lt;element name="MailCodeORG" type="{http://www.siebel.com/SelfService/Common/Contact/Query}queryType" minOccurs="0"/>
 *         &lt;element name="MainAddressFlag" type="{http://www.siebel.com/SelfService/Common/Contact/Query}queryType" minOccurs="0"/>
 *         &lt;element name="OccupancyCD" type="{http://www.siebel.com/SelfService/Common/Contact/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PhoneNumber" type="{http://www.siebel.com/SelfService/Common/Contact/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PostalCode" type="{http://www.siebel.com/SelfService/Common/Contact/Query}queryType" minOccurs="0"/>
 *         &lt;element name="Province" type="{http://www.siebel.com/SelfService/Common/Contact/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ShipAddressFlag" type="{http://www.siebel.com/SelfService/Common/Contact/Query}queryType" minOccurs="0"/>
 *         &lt;element name="State" type="{http://www.siebel.com/SelfService/Common/Contact/Query}queryType" minOccurs="0"/>
 *         &lt;element name="StreetAddress" type="{http://www.siebel.com/SelfService/Common/Contact/Query}queryType" minOccurs="0"/>
 *         &lt;element name="StreetAddress2" type="{http://www.siebel.com/SelfService/Common/Contact/Query}queryType" minOccurs="0"/>
 *         &lt;element name="AddressName" type="{http://www.siebel.com/SelfService/Common/Contact/Query}queryType" minOccurs="0"/>
 *         &lt;element name="AddressLine3" type="{http://www.siebel.com/SelfService/Common/Contact/Query}queryType" minOccurs="0"/>
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
@XmlType(name = "AccountBusinessAddressQuery", propOrder = {
    "addressActiveStatus",
    "addressId",
    "addressIntegrationId",
    "apartmentNumber",
    "billAddressFlag",
    "brickId",
    "brickName",
    "city",
    "country",
    "county",
    "descriptor",
    "emailAddress",
    "faxNumber",
    "landlordName",
    "landlordPhoneNumber",
    "mailCodeORG",
    "mainAddressFlag",
    "occupancyCD",
    "phoneNumber",
    "postalCode",
    "province",
    "shipAddressFlag",
    "state",
    "streetAddress",
    "streetAddress2",
    "addressName",
    "addressLine3"
})
public class AccountBusinessAddressQuery
    implements Serializable
{

    @XmlElement(name = "AddressActiveStatus")
    protected QueryType addressActiveStatus;
    @XmlElement(name = "AddressId")
    protected QueryType addressId;
    @XmlElement(name = "AddressIntegrationId")
    protected QueryType addressIntegrationId;
    @XmlElement(name = "ApartmentNumber")
    protected QueryType apartmentNumber;
    @XmlElement(name = "BillAddressFlag")
    protected QueryType billAddressFlag;
    @XmlElement(name = "BrickId")
    protected QueryType brickId;
    @XmlElement(name = "BrickName")
    protected QueryType brickName;
    @XmlElement(name = "City")
    protected QueryType city;
    @XmlElement(name = "Country")
    protected QueryType country;
    @XmlElement(name = "County")
    protected QueryType county;
    @XmlElement(name = "Descriptor")
    protected QueryType descriptor;
    @XmlElement(name = "EmailAddress")
    protected QueryType emailAddress;
    @XmlElement(name = "FaxNumber")
    protected QueryType faxNumber;
    @XmlElement(name = "LandlordName")
    protected QueryType landlordName;
    @XmlElement(name = "LandlordPhoneNumber")
    protected QueryType landlordPhoneNumber;
    @XmlElement(name = "MailCodeORG")
    protected QueryType mailCodeORG;
    @XmlElement(name = "MainAddressFlag")
    protected QueryType mainAddressFlag;
    @XmlElement(name = "OccupancyCD")
    protected QueryType occupancyCD;
    @XmlElement(name = "PhoneNumber")
    protected QueryType phoneNumber;
    @XmlElement(name = "PostalCode")
    protected QueryType postalCode;
    @XmlElement(name = "Province")
    protected QueryType province;
    @XmlElement(name = "ShipAddressFlag")
    protected QueryType shipAddressFlag;
    @XmlElement(name = "State")
    protected QueryType state;
    @XmlElement(name = "StreetAddress")
    protected QueryType streetAddress;
    @XmlElement(name = "StreetAddress2")
    protected QueryType streetAddress2;
    @XmlElement(name = "AddressName")
    protected QueryType addressName;
    @XmlElement(name = "AddressLine3")
    protected QueryType addressLine3;
    @XmlAttribute(name = "IsPrimaryMVG")
    protected String isPrimaryMVG;
    @XmlAttribute(name = "Operation")
    protected String operation;
    @XmlAttribute(name = "Searchspec")
    protected String searchspec;

    /**
     * Gets the value of the addressActiveStatus property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getAddressActiveStatus() {
        return addressActiveStatus;
    }

    /**
     * Sets the value of the addressActiveStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setAddressActiveStatus(QueryType value) {
        this.addressActiveStatus = value;
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
     * Gets the value of the addressIntegrationId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getAddressIntegrationId() {
        return addressIntegrationId;
    }

    /**
     * Sets the value of the addressIntegrationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setAddressIntegrationId(QueryType value) {
        this.addressIntegrationId = value;
    }

    /**
     * Gets the value of the apartmentNumber property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getApartmentNumber() {
        return apartmentNumber;
    }

    /**
     * Sets the value of the apartmentNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setApartmentNumber(QueryType value) {
        this.apartmentNumber = value;
    }

    /**
     * Gets the value of the billAddressFlag property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getBillAddressFlag() {
        return billAddressFlag;
    }

    /**
     * Sets the value of the billAddressFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setBillAddressFlag(QueryType value) {
        this.billAddressFlag = value;
    }

    /**
     * Gets the value of the brickId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getBrickId() {
        return brickId;
    }

    /**
     * Sets the value of the brickId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setBrickId(QueryType value) {
        this.brickId = value;
    }

    /**
     * Gets the value of the brickName property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getBrickName() {
        return brickName;
    }

    /**
     * Sets the value of the brickName property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setBrickName(QueryType value) {
        this.brickName = value;
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
     * Gets the value of the county property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getCounty() {
        return county;
    }

    /**
     * Sets the value of the county property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setCounty(QueryType value) {
        this.county = value;
    }

    /**
     * Gets the value of the descriptor property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getDescriptor() {
        return descriptor;
    }

    /**
     * Sets the value of the descriptor property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setDescriptor(QueryType value) {
        this.descriptor = value;
    }

    /**
     * Gets the value of the emailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getEmailAddress() {
        return emailAddress;
    }

    /**
     * Sets the value of the emailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setEmailAddress(QueryType value) {
        this.emailAddress = value;
    }

    /**
     * Gets the value of the faxNumber property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getFaxNumber() {
        return faxNumber;
    }

    /**
     * Sets the value of the faxNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setFaxNumber(QueryType value) {
        this.faxNumber = value;
    }

    /**
     * Gets the value of the landlordName property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getLandlordName() {
        return landlordName;
    }

    /**
     * Sets the value of the landlordName property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setLandlordName(QueryType value) {
        this.landlordName = value;
    }

    /**
     * Gets the value of the landlordPhoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getLandlordPhoneNumber() {
        return landlordPhoneNumber;
    }

    /**
     * Sets the value of the landlordPhoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setLandlordPhoneNumber(QueryType value) {
        this.landlordPhoneNumber = value;
    }

    /**
     * Gets the value of the mailCodeORG property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getMailCodeORG() {
        return mailCodeORG;
    }

    /**
     * Sets the value of the mailCodeORG property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setMailCodeORG(QueryType value) {
        this.mailCodeORG = value;
    }

    /**
     * Gets the value of the mainAddressFlag property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getMainAddressFlag() {
        return mainAddressFlag;
    }

    /**
     * Sets the value of the mainAddressFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setMainAddressFlag(QueryType value) {
        this.mainAddressFlag = value;
    }

    /**
     * Gets the value of the occupancyCD property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getOccupancyCD() {
        return occupancyCD;
    }

    /**
     * Sets the value of the occupancyCD property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setOccupancyCD(QueryType value) {
        this.occupancyCD = value;
    }

    /**
     * Gets the value of the phoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets the value of the phoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPhoneNumber(QueryType value) {
        this.phoneNumber = value;
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
     * Gets the value of the province property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getProvince() {
        return province;
    }

    /**
     * Sets the value of the province property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setProvince(QueryType value) {
        this.province = value;
    }

    /**
     * Gets the value of the shipAddressFlag property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getShipAddressFlag() {
        return shipAddressFlag;
    }

    /**
     * Sets the value of the shipAddressFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setShipAddressFlag(QueryType value) {
        this.shipAddressFlag = value;
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
     * Gets the value of the streetAddress2 property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getStreetAddress2() {
        return streetAddress2;
    }

    /**
     * Sets the value of the streetAddress2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setStreetAddress2(QueryType value) {
        this.streetAddress2 = value;
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
     * Gets the value of the addressLine3 property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getAddressLine3() {
        return addressLine3;
    }

    /**
     * Sets the value of the addressLine3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setAddressLine3(QueryType value) {
        this.addressLine3 = value;
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
