
package com.siebel.ordermanagement.order.details.data.id;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrderDetailId complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderDetailId">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ModId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ListOfOrderApprovalHistory" type="{http://siebel.com/OrderManagement/Order/Details/Data/Id}ListOfOrderApprovalHistoryId" minOccurs="0"/>
 *         &lt;element name="ListOfShipment" type="{http://siebel.com/OrderManagement/Order/Details/Data/Id}ListOfShipmentId" minOccurs="0"/>
 *         &lt;element name="ListOfOrderItemDetail" type="{http://siebel.com/OrderManagement/Order/Details/Data/Id}ListOfOrderItemDetailId" minOccurs="0"/>
 *         &lt;element name="ListOfOrderPayment" type="{http://siebel.com/OrderManagement/Order/Details/Data/Id}ListOfOrderPaymentId" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderDetailId", propOrder = {
    "id",
    "modId",
    "listOfOrderApprovalHistory",
    "listOfShipment",
    "listOfOrderItemDetail",
    "listOfOrderPayment"
})
public class OrderDetailId
    implements Serializable
{

    @XmlElement(name = "Id")
    protected String id;
    @XmlElement(name = "ModId")
    protected String modId;
    @XmlElement(name = "ListOfOrderApprovalHistory")
    protected ListOfOrderApprovalHistoryId listOfOrderApprovalHistory;
    @XmlElement(name = "ListOfShipment")
    protected ListOfShipmentId listOfShipment;
    @XmlElement(name = "ListOfOrderItemDetail")
    protected ListOfOrderItemDetailId listOfOrderItemDetail;
    @XmlElement(name = "ListOfOrderPayment")
    protected ListOfOrderPaymentId listOfOrderPayment;

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
     * Gets the value of the listOfOrderApprovalHistory property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfOrderApprovalHistoryId }
     *     
     */
    public ListOfOrderApprovalHistoryId getListOfOrderApprovalHistory() {
        return listOfOrderApprovalHistory;
    }

    /**
     * Sets the value of the listOfOrderApprovalHistory property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfOrderApprovalHistoryId }
     *     
     */
    public void setListOfOrderApprovalHistory(ListOfOrderApprovalHistoryId value) {
        this.listOfOrderApprovalHistory = value;
    }

    /**
     * Gets the value of the listOfShipment property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfShipmentId }
     *     
     */
    public ListOfShipmentId getListOfShipment() {
        return listOfShipment;
    }

    /**
     * Sets the value of the listOfShipment property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfShipmentId }
     *     
     */
    public void setListOfShipment(ListOfShipmentId value) {
        this.listOfShipment = value;
    }

    /**
     * Gets the value of the listOfOrderItemDetail property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfOrderItemDetailId }
     *     
     */
    public ListOfOrderItemDetailId getListOfOrderItemDetail() {
        return listOfOrderItemDetail;
    }

    /**
     * Sets the value of the listOfOrderItemDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfOrderItemDetailId }
     *     
     */
    public void setListOfOrderItemDetail(ListOfOrderItemDetailId value) {
        this.listOfOrderItemDetail = value;
    }

    /**
     * Gets the value of the listOfOrderPayment property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfOrderPaymentId }
     *     
     */
    public ListOfOrderPaymentId getListOfOrderPayment() {
        return listOfOrderPayment;
    }

    /**
     * Sets the value of the listOfOrderPayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfOrderPaymentId }
     *     
     */
    public void setListOfOrderPayment(ListOfOrderPaymentId value) {
        this.listOfOrderPayment = value;
    }

}
