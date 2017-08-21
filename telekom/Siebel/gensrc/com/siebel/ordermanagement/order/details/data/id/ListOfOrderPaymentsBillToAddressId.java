
package com.siebel.ordermanagement.order.details.data.id;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListOfOrderPaymentsBillToAddressId complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListOfOrderPaymentsBillToAddressId">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OrderPaymentsBillToAddress" type="{http://siebel.com/OrderManagement/Order/Details/Data/Id}OrderPaymentsBillToAddressId" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfOrderPaymentsBillToAddressId", propOrder = {
    "orderPaymentsBillToAddress"
})
public class ListOfOrderPaymentsBillToAddressId
    implements Serializable
{

    @XmlElement(name = "OrderPaymentsBillToAddress")
    protected List<OrderPaymentsBillToAddressId> orderPaymentsBillToAddress;

    /**
     * Gets the value of the orderPaymentsBillToAddress property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the orderPaymentsBillToAddress property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrderPaymentsBillToAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrderPaymentsBillToAddressId }
     * 
     * 
     */
    public List<OrderPaymentsBillToAddressId> getOrderPaymentsBillToAddress() {
        if (orderPaymentsBillToAddress == null) {
            orderPaymentsBillToAddress = new ArrayList<OrderPaymentsBillToAddressId>();
        }
        return this.orderPaymentsBillToAddress;
    }

}
