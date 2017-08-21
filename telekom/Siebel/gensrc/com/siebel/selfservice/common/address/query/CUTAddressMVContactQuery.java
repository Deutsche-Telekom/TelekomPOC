
package com.siebel.selfservice.common.address.query;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CUTAddress_MVContactQuery complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CUTAddress_MVContactQuery">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MVContactId" type="{http://siebel.com/SelfService/Common/Address/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PersonalContact" type="{http://siebel.com/SelfService/Common/Address/Query}queryType" minOccurs="0"/>
 *         &lt;element name="EmployeeNumber" type="{http://siebel.com/SelfService/Common/Address/Query}queryType" minOccurs="0"/>
 *         &lt;element name="AccountIntegrationId" type="{http://siebel.com/SelfService/Common/Address/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PrimaryAccountName" type="{http://siebel.com/SelfService/Common/Address/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PersonUId" type="{http://siebel.com/SelfService/Common/Address/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PrimaryOrganization2" type="{http://siebel.com/SelfService/Common/Address/Query}queryType" minOccurs="0"/>
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
@XmlType(name = "CUTAddress_MVContactQuery", propOrder = {
    "mvContactId",
    "personalContact",
    "employeeNumber",
    "accountIntegrationId",
    "primaryAccountName",
    "personUId",
    "primaryOrganization2"
})
public class CUTAddressMVContactQuery
    implements Serializable
{

    @XmlElement(name = "MVContactId")
    protected QueryType mvContactId;
    @XmlElement(name = "PersonalContact")
    protected QueryType personalContact;
    @XmlElement(name = "EmployeeNumber")
    protected QueryType employeeNumber;
    @XmlElement(name = "AccountIntegrationId")
    protected QueryType accountIntegrationId;
    @XmlElement(name = "PrimaryAccountName")
    protected QueryType primaryAccountName;
    @XmlElement(name = "PersonUId")
    protected QueryType personUId;
    @XmlElement(name = "PrimaryOrganization2")
    protected QueryType primaryOrganization2;
    @XmlAttribute(name = "IsPrimaryMVG")
    protected String isPrimaryMVG;
    @XmlAttribute
    protected String searchspec;

    /**
     * Gets the value of the mvContactId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getMVContactId() {
        return mvContactId;
    }

    /**
     * Sets the value of the mvContactId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setMVContactId(QueryType value) {
        this.mvContactId = value;
    }

    /**
     * Gets the value of the personalContact property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPersonalContact() {
        return personalContact;
    }

    /**
     * Sets the value of the personalContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPersonalContact(QueryType value) {
        this.personalContact = value;
    }

    /**
     * Gets the value of the employeeNumber property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getEmployeeNumber() {
        return employeeNumber;
    }

    /**
     * Sets the value of the employeeNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setEmployeeNumber(QueryType value) {
        this.employeeNumber = value;
    }

    /**
     * Gets the value of the accountIntegrationId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getAccountIntegrationId() {
        return accountIntegrationId;
    }

    /**
     * Sets the value of the accountIntegrationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setAccountIntegrationId(QueryType value) {
        this.accountIntegrationId = value;
    }

    /**
     * Gets the value of the primaryAccountName property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPrimaryAccountName() {
        return primaryAccountName;
    }

    /**
     * Sets the value of the primaryAccountName property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPrimaryAccountName(QueryType value) {
        this.primaryAccountName = value;
    }

    /**
     * Gets the value of the personUId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPersonUId() {
        return personUId;
    }

    /**
     * Sets the value of the personUId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPersonUId(QueryType value) {
        this.personUId = value;
    }

    /**
     * Gets the value of the primaryOrganization2 property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPrimaryOrganization2() {
        return primaryOrganization2;
    }

    /**
     * Sets the value of the primaryOrganization2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPrimaryOrganization2(QueryType value) {
        this.primaryOrganization2 = value;
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
