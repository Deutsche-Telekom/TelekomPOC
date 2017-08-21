
package com.siebel.selfservice.common.account.id;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccountId complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccountId">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ModId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ListOfAccountBusinessAddress" type="{http://www.siebel.com/SelfService/Common/Account/Id}ListOfAccountBusinessAddressId" minOccurs="0"/>
 *         &lt;element name="ListOfBusinessAddress" type="{http://www.siebel.com/SelfService/Common/Account/Id}ListOfBusinessAddressId" minOccurs="0"/>
 *         &lt;element name="ListOfContact" type="{http://www.siebel.com/SelfService/Common/Account/Id}ListOfContactId" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountId", propOrder = {
    "id",
    "modId",
    "listOfAccountBusinessAddress",
    "listOfBusinessAddress",
    "listOfContact"
})
public class AccountId
    implements Serializable
{

    @XmlElement(name = "Id")
    protected String id;
    @XmlElement(name = "ModId")
    protected String modId;
    @XmlElement(name = "ListOfAccountBusinessAddress")
    protected ListOfAccountBusinessAddressId listOfAccountBusinessAddress;
    @XmlElement(name = "ListOfBusinessAddress")
    protected ListOfBusinessAddressId listOfBusinessAddress;
    @XmlElement(name = "ListOfContact")
    protected ListOfContactId listOfContact;

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
     * Gets the value of the listOfAccountBusinessAddress property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfAccountBusinessAddressId }
     *     
     */
    public ListOfAccountBusinessAddressId getListOfAccountBusinessAddress() {
        return listOfAccountBusinessAddress;
    }

    /**
     * Sets the value of the listOfAccountBusinessAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfAccountBusinessAddressId }
     *     
     */
    public void setListOfAccountBusinessAddress(ListOfAccountBusinessAddressId value) {
        this.listOfAccountBusinessAddress = value;
    }

    /**
     * Gets the value of the listOfBusinessAddress property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfBusinessAddressId }
     *     
     */
    public ListOfBusinessAddressId getListOfBusinessAddress() {
        return listOfBusinessAddress;
    }

    /**
     * Sets the value of the listOfBusinessAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfBusinessAddressId }
     *     
     */
    public void setListOfBusinessAddress(ListOfBusinessAddressId value) {
        this.listOfBusinessAddress = value;
    }

    /**
     * Gets the value of the listOfContact property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfContactId }
     *     
     */
    public ListOfContactId getListOfContact() {
        return listOfContact;
    }

    /**
     * Sets the value of the listOfContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfContactId }
     *     
     */
    public void setListOfContact(ListOfContactId value) {
        this.listOfContact = value;
    }

}
