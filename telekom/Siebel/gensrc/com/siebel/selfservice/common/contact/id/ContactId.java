
package com.siebel.selfservice.common.contact.id;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContactId complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContactId">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ModId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ListOfContactAccount" type="{http://www.siebel.com/SelfService/Common/Contact/Id}ListOfContactAccountId" minOccurs="0"/>
 *         &lt;element name="ListOfContactCommunicationAddress" type="{http://www.siebel.com/SelfService/Common/Contact/Id}ListOfContactCommunicationAddressId" minOccurs="0"/>
 *         &lt;element name="ListOfAccount" type="{http://www.siebel.com/SelfService/Common/Contact/Id}ListOfAccountId" minOccurs="0"/>
 *         &lt;element name="ListOfPersonalAddress" type="{http://www.siebel.com/SelfService/Common/Contact/Id}ListOfPersonalAddressId" minOccurs="0"/>
 *         &lt;element name="ListOfContactAlternatePhone" type="{http://www.siebel.com/SelfService/Common/Contact/Id}ListOfContactAlternatePhoneId" minOccurs="0"/>
 *         &lt;element name="ListOfContactBusinessAddress" type="{http://www.siebel.com/SelfService/Common/Contact/Id}ListOfContactBusinessAddressId" minOccurs="0"/>
 *         &lt;element name="ListOfContactOrganization" type="{http://www.siebel.com/SelfService/Common/Contact/Id}ListOfContactOrganizationId" minOccurs="0"/>
 *         &lt;element name="ListOfContactPersonalAddress" type="{http://www.siebel.com/SelfService/Common/Contact/Id}ListOfContactPersonalAddressId" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContactId", propOrder = {
    "id",
    "modId",
    "listOfContactAccount",
    "listOfContactCommunicationAddress",
    "listOfAccount",
    "listOfPersonalAddress",
    "listOfContactAlternatePhone",
    "listOfContactBusinessAddress",
    "listOfContactOrganization",
    "listOfContactPersonalAddress"
})
public class ContactId
    implements Serializable
{

    @XmlElement(name = "Id")
    protected String id;
    @XmlElement(name = "ModId")
    protected String modId;
    @XmlElement(name = "ListOfContactAccount")
    protected ListOfContactAccountId listOfContactAccount;
    @XmlElement(name = "ListOfContactCommunicationAddress")
    protected ListOfContactCommunicationAddressId listOfContactCommunicationAddress;
    @XmlElement(name = "ListOfAccount")
    protected ListOfAccountId listOfAccount;
    @XmlElement(name = "ListOfPersonalAddress")
    protected ListOfPersonalAddressId listOfPersonalAddress;
    @XmlElement(name = "ListOfContactAlternatePhone")
    protected ListOfContactAlternatePhoneId listOfContactAlternatePhone;
    @XmlElement(name = "ListOfContactBusinessAddress")
    protected ListOfContactBusinessAddressId listOfContactBusinessAddress;
    @XmlElement(name = "ListOfContactOrganization")
    protected ListOfContactOrganizationId listOfContactOrganization;
    @XmlElement(name = "ListOfContactPersonalAddress")
    protected ListOfContactPersonalAddressId listOfContactPersonalAddress;

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
     * Gets the value of the listOfContactAccount property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfContactAccountId }
     *     
     */
    public ListOfContactAccountId getListOfContactAccount() {
        return listOfContactAccount;
    }

    /**
     * Sets the value of the listOfContactAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfContactAccountId }
     *     
     */
    public void setListOfContactAccount(ListOfContactAccountId value) {
        this.listOfContactAccount = value;
    }

    /**
     * Gets the value of the listOfContactCommunicationAddress property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfContactCommunicationAddressId }
     *     
     */
    public ListOfContactCommunicationAddressId getListOfContactCommunicationAddress() {
        return listOfContactCommunicationAddress;
    }

    /**
     * Sets the value of the listOfContactCommunicationAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfContactCommunicationAddressId }
     *     
     */
    public void setListOfContactCommunicationAddress(ListOfContactCommunicationAddressId value) {
        this.listOfContactCommunicationAddress = value;
    }

    /**
     * Gets the value of the listOfAccount property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfAccountId }
     *     
     */
    public ListOfAccountId getListOfAccount() {
        return listOfAccount;
    }

    /**
     * Sets the value of the listOfAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfAccountId }
     *     
     */
    public void setListOfAccount(ListOfAccountId value) {
        this.listOfAccount = value;
    }

    /**
     * Gets the value of the listOfPersonalAddress property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfPersonalAddressId }
     *     
     */
    public ListOfPersonalAddressId getListOfPersonalAddress() {
        return listOfPersonalAddress;
    }

    /**
     * Sets the value of the listOfPersonalAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfPersonalAddressId }
     *     
     */
    public void setListOfPersonalAddress(ListOfPersonalAddressId value) {
        this.listOfPersonalAddress = value;
    }

    /**
     * Gets the value of the listOfContactAlternatePhone property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfContactAlternatePhoneId }
     *     
     */
    public ListOfContactAlternatePhoneId getListOfContactAlternatePhone() {
        return listOfContactAlternatePhone;
    }

    /**
     * Sets the value of the listOfContactAlternatePhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfContactAlternatePhoneId }
     *     
     */
    public void setListOfContactAlternatePhone(ListOfContactAlternatePhoneId value) {
        this.listOfContactAlternatePhone = value;
    }

    /**
     * Gets the value of the listOfContactBusinessAddress property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfContactBusinessAddressId }
     *     
     */
    public ListOfContactBusinessAddressId getListOfContactBusinessAddress() {
        return listOfContactBusinessAddress;
    }

    /**
     * Sets the value of the listOfContactBusinessAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfContactBusinessAddressId }
     *     
     */
    public void setListOfContactBusinessAddress(ListOfContactBusinessAddressId value) {
        this.listOfContactBusinessAddress = value;
    }

    /**
     * Gets the value of the listOfContactOrganization property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfContactOrganizationId }
     *     
     */
    public ListOfContactOrganizationId getListOfContactOrganization() {
        return listOfContactOrganization;
    }

    /**
     * Sets the value of the listOfContactOrganization property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfContactOrganizationId }
     *     
     */
    public void setListOfContactOrganization(ListOfContactOrganizationId value) {
        this.listOfContactOrganization = value;
    }

    /**
     * Gets the value of the listOfContactPersonalAddress property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfContactPersonalAddressId }
     *     
     */
    public ListOfContactPersonalAddressId getListOfContactPersonalAddress() {
        return listOfContactPersonalAddress;
    }

    /**
     * Sets the value of the listOfContactPersonalAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfContactPersonalAddressId }
     *     
     */
    public void setListOfContactPersonalAddress(ListOfContactPersonalAddressId value) {
        this.listOfContactPersonalAddress = value;
    }

}
