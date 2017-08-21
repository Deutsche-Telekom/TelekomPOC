
package com.siebel.ordermanagement.order.details.data.id;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrderPaymentId complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderPaymentId">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ModId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ListOfOrderPaymentsBankAddress" type="{http://siebel.com/OrderManagement/Order/Details/Data/Id}ListOfOrderPaymentsBankAddressId" minOccurs="0"/>
 *         &lt;element name="ListOfOrderPaymentsBillToAddress" type="{http://siebel.com/OrderManagement/Order/Details/Data/Id}ListOfOrderPaymentsBillToAddressId" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderPaymentId", propOrder = {
    "id",
    "modId",
    "listOfOrderPaymentsBankAddress",
    "listOfOrderPaymentsBillToAddress"
})
public class OrderPaymentId
    implements Serializable
{

    @XmlElement(name = "Id")
    protected String id;
    @XmlElement(name = "ModId")
    protected String modId;
    @XmlElement(name = "ListOfOrderPaymentsBankAddress")
    protected ListOfOrderPaymentsBankAddressId listOfOrderPaymentsBankAddress;
    @XmlElement(name = "ListOfOrderPaymentsBillToAddress")
    protected ListOfOrderPaymentsBillToAddressId listOfOrderPaymentsBillToAddress;

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
     * Gets the value of the listOfOrderPaymentsBankAddress property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfOrderPaymentsBankAddressId }
     *     
     */
    public ListOfOrderPaymentsBankAddressId getListOfOrderPaymentsBankAddress() {
        return listOfOrderPaymentsBankAddress;
    }

    /**
     * Sets the value of the listOfOrderPaymentsBankAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfOrderPaymentsBankAddressId }
     *     
     */
    public void setListOfOrderPaymentsBankAddress(ListOfOrderPaymentsBankAddressId value) {
        this.listOfOrderPaymentsBankAddress = value;
    }

    /**
     * Gets the value of the listOfOrderPaymentsBillToAddress property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfOrderPaymentsBillToAddressId }
     *     
     */
    public ListOfOrderPaymentsBillToAddressId getListOfOrderPaymentsBillToAddress() {
        return listOfOrderPaymentsBillToAddress;
    }

    /**
     * Sets the value of the listOfOrderPaymentsBillToAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfOrderPaymentsBillToAddressId }
     *     
     */
    public void setListOfOrderPaymentsBillToAddress(ListOfOrderPaymentsBillToAddressId value) {
        this.listOfOrderPaymentsBillToAddress = value;
    }

}
