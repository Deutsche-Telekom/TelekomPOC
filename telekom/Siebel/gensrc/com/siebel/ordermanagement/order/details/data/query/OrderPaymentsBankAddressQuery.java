
package com.siebel.ordermanagement.order.details.data.query;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrderPaymentsBankAddressQuery complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderPaymentsBankAddressQuery">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="Created" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="Updated" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ConflictId" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ModId" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="BankAddress" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="BankAddress2" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="BankCity" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="BankCountry" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="BankState" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="BankZip" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="IsPrimaryMVG" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="searchspec" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderPaymentsBankAddressQuery", propOrder = {
    "id",
    "created",
    "updated",
    "conflictId",
    "modId",
    "bankAddress",
    "bankAddress2",
    "bankCity",
    "bankCountry",
    "bankState",
    "bankZip"
})
public class OrderPaymentsBankAddressQuery
    implements Serializable
{

    @XmlElement(name = "Id")
    protected QueryType id;
    @XmlElement(name = "Created")
    protected QueryType created;
    @XmlElement(name = "Updated")
    protected QueryType updated;
    @XmlElement(name = "ConflictId")
    protected QueryType conflictId;
    @XmlElement(name = "ModId")
    protected QueryType modId;
    @XmlElement(name = "BankAddress")
    protected QueryType bankAddress;
    @XmlElement(name = "BankAddress2")
    protected QueryType bankAddress2;
    @XmlElement(name = "BankCity")
    protected QueryType bankCity;
    @XmlElement(name = "BankCountry")
    protected QueryType bankCountry;
    @XmlElement(name = "BankState")
    protected QueryType bankState;
    @XmlElement(name = "BankZip")
    protected QueryType bankZip;
    @XmlAttribute(name = "IsPrimaryMVG")
    protected String isPrimaryMVG;
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
     * Gets the value of the bankAddress property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getBankAddress() {
        return bankAddress;
    }

    /**
     * Sets the value of the bankAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setBankAddress(QueryType value) {
        this.bankAddress = value;
    }

    /**
     * Gets the value of the bankAddress2 property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getBankAddress2() {
        return bankAddress2;
    }

    /**
     * Sets the value of the bankAddress2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setBankAddress2(QueryType value) {
        this.bankAddress2 = value;
    }

    /**
     * Gets the value of the bankCity property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getBankCity() {
        return bankCity;
    }

    /**
     * Sets the value of the bankCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setBankCity(QueryType value) {
        this.bankCity = value;
    }

    /**
     * Gets the value of the bankCountry property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getBankCountry() {
        return bankCountry;
    }

    /**
     * Sets the value of the bankCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setBankCountry(QueryType value) {
        this.bankCountry = value;
    }

    /**
     * Gets the value of the bankState property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getBankState() {
        return bankState;
    }

    /**
     * Sets the value of the bankState property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setBankState(QueryType value) {
        this.bankState = value;
    }

    /**
     * Gets the value of the bankZip property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getBankZip() {
        return bankZip;
    }

    /**
     * Sets the value of the bankZip property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setBankZip(QueryType value) {
        this.bankZip = value;
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
