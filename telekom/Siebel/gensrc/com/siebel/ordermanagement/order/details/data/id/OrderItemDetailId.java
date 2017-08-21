
package com.siebel.ordermanagement.order.details.data.id;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrderItemDetailId complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderItemDetailId">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ModId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ListOfOrderItemXADetail" type="{http://siebel.com/OrderManagement/Order/Details/Data/Id}ListOfOrderItemXADetailId" minOccurs="0"/>
 *         &lt;element name="ListOfOrderItemProductLine" type="{http://siebel.com/OrderManagement/Order/Details/Data/Id}ListOfOrderItemProductLineId" minOccurs="0"/>
 *         &lt;element name="OrderItemDetail" type="{http://siebel.com/OrderManagement/Order/Details/Data/Id}OrderItemDetailId" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderItemDetailId", propOrder = {
    "id",
    "modId",
    "listOfOrderItemXADetail",
    "listOfOrderItemProductLine",
    "orderItemDetail"
})
public class OrderItemDetailId
    implements Serializable
{

    @XmlElement(name = "Id")
    protected String id;
    @XmlElement(name = "ModId")
    protected String modId;
    @XmlElement(name = "ListOfOrderItemXADetail")
    protected ListOfOrderItemXADetailId listOfOrderItemXADetail;
    @XmlElement(name = "ListOfOrderItemProductLine")
    protected ListOfOrderItemProductLineId listOfOrderItemProductLine;
    @XmlElement(name = "OrderItemDetail")
    protected List<OrderItemDetailId> orderItemDetail;

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
     * Gets the value of the listOfOrderItemXADetail property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfOrderItemXADetailId }
     *     
     */
    public ListOfOrderItemXADetailId getListOfOrderItemXADetail() {
        return listOfOrderItemXADetail;
    }

    /**
     * Sets the value of the listOfOrderItemXADetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfOrderItemXADetailId }
     *     
     */
    public void setListOfOrderItemXADetail(ListOfOrderItemXADetailId value) {
        this.listOfOrderItemXADetail = value;
    }

    /**
     * Gets the value of the listOfOrderItemProductLine property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfOrderItemProductLineId }
     *     
     */
    public ListOfOrderItemProductLineId getListOfOrderItemProductLine() {
        return listOfOrderItemProductLine;
    }

    /**
     * Sets the value of the listOfOrderItemProductLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfOrderItemProductLineId }
     *     
     */
    public void setListOfOrderItemProductLine(ListOfOrderItemProductLineId value) {
        this.listOfOrderItemProductLine = value;
    }

    /**
     * Gets the value of the orderItemDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the orderItemDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrderItemDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrderItemDetailId }
     * 
     * 
     */
    public List<OrderItemDetailId> getOrderItemDetail() {
        if (orderItemDetail == null) {
            orderItemDetail = new ArrayList<OrderItemDetailId>();
        }
        return this.orderItemDetail;
    }

}
