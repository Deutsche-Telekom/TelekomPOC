
package com.siebel.selfservice.common.contact.id;

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
 *         &lt;element name="ListOfAccountBusinessAddress" type="{http://www.siebel.com/SelfService/Common/Contact/Id}ListOfAccountBusinessAddressId" minOccurs="0"/>
 *         &lt;element name="ListOfAccountOrganization" type="{http://www.siebel.com/SelfService/Common/Contact/Id}ListOfAccountOrganizationId" minOccurs="0"/>
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
    "listOfAccountOrganization"
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
    @XmlElement(name = "ListOfAccountOrganization")
    protected ListOfAccountOrganizationId listOfAccountOrganization;

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
     * Gets the value of the listOfAccountOrganization property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfAccountOrganizationId }
     *     
     */
    public ListOfAccountOrganizationId getListOfAccountOrganization() {
        return listOfAccountOrganization;
    }

    /**
     * Sets the value of the listOfAccountOrganization property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfAccountOrganizationId }
     *     
     */
    public void setListOfAccountOrganization(ListOfAccountOrganizationId value) {
        this.listOfAccountOrganization = value;
    }

}
