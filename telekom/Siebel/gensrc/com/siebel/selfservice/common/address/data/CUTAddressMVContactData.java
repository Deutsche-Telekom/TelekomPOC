
package com.siebel.selfservice.common.address.data;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CUTAddress_MVContactData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CUTAddress_MVContactData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MVContactId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonalContact" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="EmployeeNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AccountIntegrationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryAccountName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonUId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryOrganization2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="IsPrimaryMVG" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="operation" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CUTAddress_MVContactData", propOrder = {
    "mvContactId",
    "personalContact",
    "employeeNumber",
    "accountIntegrationId",
    "primaryAccountName",
    "personUId",
    "primaryOrganization2"
})
public class CUTAddressMVContactData
    implements Serializable
{

    @XmlElement(name = "MVContactId")
    protected String mvContactId;
    @XmlElement(name = "PersonalContact")
    protected Boolean personalContact;
    @XmlElement(name = "EmployeeNumber")
    protected String employeeNumber;
    @XmlElement(name = "AccountIntegrationId")
    protected String accountIntegrationId;
    @XmlElement(name = "PrimaryAccountName")
    protected String primaryAccountName;
    @XmlElement(name = "PersonUId")
    protected String personUId;
    @XmlElement(name = "PrimaryOrganization2")
    protected String primaryOrganization2;
    @XmlAttribute(name = "IsPrimaryMVG")
    protected String isPrimaryMVG;
    @XmlAttribute
    protected String operation;

    /**
     * Gets the value of the mvContactId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMVContactId() {
        return mvContactId;
    }

    /**
     * Sets the value of the mvContactId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMVContactId(String value) {
        this.mvContactId = value;
    }

    /**
     * Gets the value of the personalContact property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPersonalContact() {
        return personalContact;
    }

    /**
     * Sets the value of the personalContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPersonalContact(Boolean value) {
        this.personalContact = value;
    }

    /**
     * Gets the value of the employeeNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmployeeNumber() {
        return employeeNumber;
    }

    /**
     * Sets the value of the employeeNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmployeeNumber(String value) {
        this.employeeNumber = value;
    }

    /**
     * Gets the value of the accountIntegrationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountIntegrationId() {
        return accountIntegrationId;
    }

    /**
     * Sets the value of the accountIntegrationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountIntegrationId(String value) {
        this.accountIntegrationId = value;
    }

    /**
     * Gets the value of the primaryAccountName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryAccountName() {
        return primaryAccountName;
    }

    /**
     * Sets the value of the primaryAccountName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryAccountName(String value) {
        this.primaryAccountName = value;
    }

    /**
     * Gets the value of the personUId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonUId() {
        return personUId;
    }

    /**
     * Sets the value of the personUId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonUId(String value) {
        this.personUId = value;
    }

    /**
     * Gets the value of the primaryOrganization2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryOrganization2() {
        return primaryOrganization2;
    }

    /**
     * Sets the value of the primaryOrganization2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryOrganization2(String value) {
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

}
