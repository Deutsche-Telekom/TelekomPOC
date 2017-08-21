
package com.siebel.ordermanagement.order.item.data;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListOfOrderItemBO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListOfOrderItemBO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ListOfOrderItem" type="{http://siebel.com/OrderManagement/Order/Item/Data}ListOfOrderItem" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfOrderItemBO", propOrder = {
    "listOfOrderItem"
})
public class ListOfOrderItemBO
    implements Serializable
{

    @XmlElement(name = "ListOfOrderItem")
    protected ListOfOrderItem listOfOrderItem;

    /**
     * Gets the value of the listOfOrderItem property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfOrderItem }
     *     
     */
    public ListOfOrderItem getListOfOrderItem() {
        return listOfOrderItem;
    }

    /**
     * Sets the value of the listOfOrderItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfOrderItem }
     *     
     */
    public void setListOfOrderItem(ListOfOrderItem value) {
        this.listOfOrderItem = value;
    }

}
