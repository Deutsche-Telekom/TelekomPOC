
package com.siebel.ordermanagement.order;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.siebel.ordermanagement.order.item.data.ListOfOrderItemBO;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://siebel.com/OrderManagement/Order/Item/Data}ListOfOrderItemBO"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "listOfOrderItemBO"
})
@XmlRootElement(name = "InsertOrderItem_Output")
public class InsertOrderItemOutput
    implements Serializable
{

    @XmlElement(name = "ListOfOrderItemBO", namespace = "http://siebel.com/OrderManagement/Order/Item/Data", required = true)
    protected ListOfOrderItemBO listOfOrderItemBO;

    /**
     * Gets the value of the listOfOrderItemBO property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfOrderItemBO }
     *     
     */
    public ListOfOrderItemBO getListOfOrderItemBO() {
        return listOfOrderItemBO;
    }

    /**
     * Sets the value of the listOfOrderItemBO property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfOrderItemBO }
     *     
     */
    public void setListOfOrderItemBO(ListOfOrderItemBO value) {
        this.listOfOrderItemBO = value;
    }

}
