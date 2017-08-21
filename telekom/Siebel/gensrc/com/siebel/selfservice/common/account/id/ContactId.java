
package com.siebel.selfservice.common.account.id;

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
 *         &lt;element name="ListOfContactCommunicationAddress" type="{http://www.siebel.com/SelfService/Common/Account/Id}ListOfContactCommunicationAddressId" minOccurs="0"/>
 *         &lt;element name="ListOfContactAlternatePhone" type="{http://www.siebel.com/SelfService/Common/Account/Id}ListOfContactAlternatePhoneId" minOccurs="0"/>
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
    "listOfContactCommunicationAddress",
    "listOfContactAlternatePhone"
})
public class ContactId
    implements Serializable
{

    @XmlElement(name = "Id")
    protected String id;
    @XmlElement(name = "ModId")
    protected String modId;
    @XmlElement(name = "ListOfContactCommunicationAddress")
    protected ListOfContactCommunicationAddressId listOfContactCommunicationAddress;
    @XmlElement(name = "ListOfContactAlternatePhone")
    protected ListOfContactAlternatePhoneId listOfContactAlternatePhone;

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

}
