
package com.siebel.ordermanagement.order.details.data.id;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ShipmentId complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShipmentId">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ModId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ListOfShipmentItem" type="{http://siebel.com/OrderManagement/Order/Details/Data/Id}ListOfShipmentItemId" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShipmentId", propOrder = {
    "id",
    "modId",
    "listOfShipmentItem"
})
public class ShipmentId
    implements Serializable
{

    @XmlElement(name = "Id")
    protected String id;
    @XmlElement(name = "ModId")
    protected String modId;
    @XmlElement(name = "ListOfShipmentItem")
    protected ListOfShipmentItemId listOfShipmentItem;

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
     * Gets the value of the listOfShipmentItem property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfShipmentItemId }
     *     
     */
    public ListOfShipmentItemId getListOfShipmentItem() {
        return listOfShipmentItem;
    }

    /**
     * Sets the value of the listOfShipmentItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfShipmentItemId }
     *     
     */
    public void setListOfShipmentItem(ListOfShipmentItemId value) {
        this.listOfShipmentItem = value;
    }

}
