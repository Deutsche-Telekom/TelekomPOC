
package com.siebel.selfservice.common.address.id;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CutAddressId complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CutAddressId">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ModId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AddressId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ListOfCUTAddress_MVAccount" type="{http://siebel.com/SelfService/Common/Address/Id}ListOfCUTAddress_MVAccountId" minOccurs="0"/>
 *         &lt;element name="ListOfCUTAddress_MVContact" type="{http://siebel.com/SelfService/Common/Address/Id}ListOfCUTAddress_MVContactId" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CutAddressId", propOrder = {
    "id",
    "modId",
    "addressId",
    "listOfCUTAddressMVAccount",
    "listOfCUTAddressMVContact"
})
public class CutAddressId
    implements Serializable
{

    @XmlElement(name = "Id")
    protected String id;
    @XmlElement(name = "ModId")
    protected String modId;
    @XmlElement(name = "AddressId")
    protected String addressId;
    @XmlElement(name = "ListOfCUTAddress_MVAccount")
    protected ListOfCUTAddressMVAccountId listOfCUTAddressMVAccount;
    @XmlElement(name = "ListOfCUTAddress_MVContact")
    protected ListOfCUTAddressMVContactId listOfCUTAddressMVContact;

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
     * Gets the value of the addressId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressId() {
        return addressId;
    }

    /**
     * Sets the value of the addressId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressId(String value) {
        this.addressId = value;
    }

    /**
     * Gets the value of the listOfCUTAddressMVAccount property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfCUTAddressMVAccountId }
     *     
     */
    public ListOfCUTAddressMVAccountId getListOfCUTAddressMVAccount() {
        return listOfCUTAddressMVAccount;
    }

    /**
     * Sets the value of the listOfCUTAddressMVAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfCUTAddressMVAccountId }
     *     
     */
    public void setListOfCUTAddressMVAccount(ListOfCUTAddressMVAccountId value) {
        this.listOfCUTAddressMVAccount = value;
    }

    /**
     * Gets the value of the listOfCUTAddressMVContact property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfCUTAddressMVContactId }
     *     
     */
    public ListOfCUTAddressMVContactId getListOfCUTAddressMVContact() {
        return listOfCUTAddressMVContact;
    }

    /**
     * Sets the value of the listOfCUTAddressMVContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfCUTAddressMVContactId }
     *     
     */
    public void setListOfCUTAddressMVContact(ListOfCUTAddressMVContactId value) {
        this.listOfCUTAddressMVContact = value;
    }

}
