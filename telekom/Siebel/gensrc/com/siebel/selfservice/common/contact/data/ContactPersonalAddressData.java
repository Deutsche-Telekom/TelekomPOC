
package com.siebel.selfservice.common.contact.data;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ContactPersonalAddressData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContactPersonalAddressData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AddressType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonalAddressId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonalAddressIntegrationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonalAddressName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonalAddressStartDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="PersonalCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonalCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonalPostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonalProvince" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonalState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonalStreetAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonalStreetAddress2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "ContactPersonalAddressData", propOrder = {
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
public class ContactPersonalAddressData
    implements Serializable
{

    @XmlElement(name = "AddressType")
    protected String addressType;
    @XmlElement(name = "PersonalAddressId")
    protected String personalAddressId;
    @XmlElement(name = "PersonalAddressIntegrationId")
    protected String personalAddressIntegrationId;
    @XmlElement(name = "PersonalAddressName")
    protected String personalAddressName;
    @XmlElement(name = "PersonalAddressStartDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar personalAddressStartDate;
    @XmlElement(name = "PersonalCity")
    protected String personalCity;
    @XmlElement(name = "PersonalCountry")
    protected String personalCountry;
    @XmlElement(name = "PersonalPostalCode")
    protected String personalPostalCode;
    @XmlElement(name = "PersonalProvince")
    protected String personalProvince;
    @XmlElement(name = "PersonalState")
    protected String personalState;
    @XmlElement(name = "PersonalStreetAddress")
    protected String personalStreetAddress;
    @XmlElement(name = "PersonalStreetAddress2")
    protected String personalStreetAddress2;
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
     *     {@link String }
     *     
     */
    public String getAddressType() {
        return addressType;
    }

    /**
     * Sets the value of the addressType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressType(String value) {
        this.addressType = value;
    }

    /**
     * Gets the value of the personalAddressId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonalAddressId() {
        return personalAddressId;
    }

    /**
     * Sets the value of the personalAddressId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonalAddressId(String value) {
        this.personalAddressId = value;
    }

    /**
     * Gets the value of the personalAddressIntegrationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonalAddressIntegrationId() {
        return personalAddressIntegrationId;
    }

    /**
     * Sets the value of the personalAddressIntegrationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonalAddressIntegrationId(String value) {
        this.personalAddressIntegrationId = value;
    }

    /**
     * Gets the value of the personalAddressName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonalAddressName() {
        return personalAddressName;
    }

    /**
     * Sets the value of the personalAddressName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonalAddressName(String value) {
        this.personalAddressName = value;
    }

    /**
     * Gets the value of the personalAddressStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPersonalAddressStartDate() {
        return personalAddressStartDate;
    }

    /**
     * Sets the value of the personalAddressStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPersonalAddressStartDate(XMLGregorianCalendar value) {
        this.personalAddressStartDate = value;
    }

    /**
     * Gets the value of the personalCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonalCity() {
        return personalCity;
    }

    /**
     * Sets the value of the personalCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonalCity(String value) {
        this.personalCity = value;
    }

    /**
     * Gets the value of the personalCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonalCountry() {
        return personalCountry;
    }

    /**
     * Sets the value of the personalCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonalCountry(String value) {
        this.personalCountry = value;
    }

    /**
     * Gets the value of the personalPostalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonalPostalCode() {
        return personalPostalCode;
    }

    /**
     * Sets the value of the personalPostalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonalPostalCode(String value) {
        this.personalPostalCode = value;
    }

    /**
     * Gets the value of the personalProvince property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonalProvince() {
        return personalProvince;
    }

    /**
     * Sets the value of the personalProvince property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonalProvince(String value) {
        this.personalProvince = value;
    }

    /**
     * Gets the value of the personalState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonalState() {
        return personalState;
    }

    /**
     * Sets the value of the personalState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonalState(String value) {
        this.personalState = value;
    }

    /**
     * Gets the value of the personalStreetAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonalStreetAddress() {
        return personalStreetAddress;
    }

    /**
     * Sets the value of the personalStreetAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonalStreetAddress(String value) {
        this.personalStreetAddress = value;
    }

    /**
     * Gets the value of the personalStreetAddress2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonalStreetAddress2() {
        return personalStreetAddress2;
    }

    /**
     * Sets the value of the personalStreetAddress2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonalStreetAddress2(String value) {
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
