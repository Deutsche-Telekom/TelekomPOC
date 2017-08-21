
package com.siebel.selfservice.common.contact.query;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContactPersonalAddressQuery complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContactPersonalAddressQuery">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AddressType" type="{http://www.siebel.com/SelfService/Common/Contact/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PersonalAddressId" type="{http://www.siebel.com/SelfService/Common/Contact/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PersonalAddressIntegrationId" type="{http://www.siebel.com/SelfService/Common/Contact/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PersonalAddressName" type="{http://www.siebel.com/SelfService/Common/Contact/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PersonalAddressStartDate" type="{http://www.siebel.com/SelfService/Common/Contact/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PersonalCity" type="{http://www.siebel.com/SelfService/Common/Contact/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PersonalCountry" type="{http://www.siebel.com/SelfService/Common/Contact/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PersonalPostalCode" type="{http://www.siebel.com/SelfService/Common/Contact/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PersonalProvince" type="{http://www.siebel.com/SelfService/Common/Contact/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PersonalState" type="{http://www.siebel.com/SelfService/Common/Contact/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PersonalStreetAddress" type="{http://www.siebel.com/SelfService/Common/Contact/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PersonalStreetAddress2" type="{http://www.siebel.com/SelfService/Common/Contact/Query}queryType" minOccurs="0"/>
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
@XmlType(name = "ContactPersonalAddressQuery", propOrder = {
    "addressType",
    "personalAddressId",
    "personalAddressIntegrationId",
    "personalAddressName",
    "personalAddressStartDate",
    "personalCity",
    "personalCountry",
    "personalPostalCode",
    "personalProvince",
    "personalState",
    "personalStreetAddress",
    "personalStreetAddress2"
})
public class ContactPersonalAddressQuery
    implements Serializable
{

    @XmlElement(name = "AddressType")
    protected QueryType addressType;
    @XmlElement(name = "PersonalAddressId")
    protected QueryType personalAddressId;
    @XmlElement(name = "PersonalAddressIntegrationId")
    protected QueryType personalAddressIntegrationId;
    @XmlElement(name = "PersonalAddressName")
    protected QueryType personalAddressName;
    @XmlElement(name = "PersonalAddressStartDate")
    protected QueryType personalAddressStartDate;
    @XmlElement(name = "PersonalCity")
    protected QueryType personalCity;
    @XmlElement(name = "PersonalCountry")
    protected QueryType personalCountry;
    @XmlElement(name = "PersonalPostalCode")
    protected QueryType personalPostalCode;
    @XmlElement(name = "PersonalProvince")
    protected QueryType personalProvince;
    @XmlElement(name = "PersonalState")
    protected QueryType personalState;
    @XmlElement(name = "PersonalStreetAddress")
    protected QueryType personalStreetAddress;
    @XmlElement(name = "PersonalStreetAddress2")
    protected QueryType personalStreetAddress2;
    @XmlAttribute(name = "IsPrimaryMVG")
    protected String isPrimaryMVG;
    @XmlAttribute(name = "Operation")
    protected String operation;
    @XmlAttribute(name = "Searchspec")
    protected String searchspec;

    /**
     * Gets the value of the addressType property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getAddressType() {
        return addressType;
    }

    /**
     * Sets the value of the addressType property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setAddressType(QueryType value) {
        this.addressType = value;
    }

    /**
     * Gets the value of the personalAddressId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPersonalAddressId() {
        return personalAddressId;
    }

    /**
     * Sets the value of the personalAddressId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPersonalAddressId(QueryType value) {
        this.personalAddressId = value;
    }

    /**
     * Gets the value of the personalAddressIntegrationId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPersonalAddressIntegrationId() {
        return personalAddressIntegrationId;
    }

    /**
     * Sets the value of the personalAddressIntegrationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPersonalAddressIntegrationId(QueryType value) {
        this.personalAddressIntegrationId = value;
    }

    /**
     * Gets the value of the personalAddressName property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPersonalAddressName() {
        return personalAddressName;
    }

    /**
     * Sets the value of the personalAddressName property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPersonalAddressName(QueryType value) {
        this.personalAddressName = value;
    }

    /**
     * Gets the value of the personalAddressStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPersonalAddressStartDate() {
        return personalAddressStartDate;
    }

    /**
     * Sets the value of the personalAddressStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPersonalAddressStartDate(QueryType value) {
        this.personalAddressStartDate = value;
    }

    /**
     * Gets the value of the personalCity property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPersonalCity() {
        return personalCity;
    }

    /**
     * Sets the value of the personalCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPersonalCity(QueryType value) {
        this.personalCity = value;
    }

    /**
     * Gets the value of the personalCountry property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPersonalCountry() {
        return personalCountry;
    }

    /**
     * Sets the value of the personalCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPersonalCountry(QueryType value) {
        this.personalCountry = value;
    }

    /**
     * Gets the value of the personalPostalCode property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPersonalPostalCode() {
        return personalPostalCode;
    }

    /**
     * Sets the value of the personalPostalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPersonalPostalCode(QueryType value) {
        this.personalPostalCode = value;
    }

    /**
     * Gets the value of the personalProvince property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPersonalProvince() {
        return personalProvince;
    }

    /**
     * Sets the value of the personalProvince property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPersonalProvince(QueryType value) {
        this.personalProvince = value;
    }

    /**
     * Gets the value of the personalState property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPersonalState() {
        return personalState;
    }

    /**
     * Sets the value of the personalState property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPersonalState(QueryType value) {
        this.personalState = value;
    }

    /**
     * Gets the value of the personalStreetAddress property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPersonalStreetAddress() {
        return personalStreetAddress;
    }

    /**
     * Sets the value of the personalStreetAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPersonalStreetAddress(QueryType value) {
        this.personalStreetAddress = value;
    }

    /**
     * Gets the value of the personalStreetAddress2 property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPersonalStreetAddress2() {
        return personalStreetAddress2;
    }

    /**
     * Sets the value of the personalStreetAddress2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPersonalStreetAddress2(QueryType value) {
        this.personalStreetAddress2 = value;
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
