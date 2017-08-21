
package com.siebel.ordermanagement.order.details.data.id;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListOfOrderPaymentsBankAddressId complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListOfOrderPaymentsBankAddressId">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OrderPaymentsBankAddress" type="{http://siebel.com/OrderManagement/Order/Details/Data/Id}OrderPaymentsBankAddressId" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfOrderPaymentsBankAddressId", propOrder = {
    "orderPaymentsBankAddress"
})
public class ListOfOrderPaymentsBankAddressId
    implements Serializable
{

    @XmlElement(name = "OrderPaymentsBankAddress")
    protected List<OrderPaymentsBankAddressId> orderPaymentsBankAddress;

    /**
     * Gets the value of the orderPaymentsBankAddress property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the orderPaymentsBankAddress property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrderPaymentsBankAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrderPaymentsBankAddressId }
     * 
     * 
     */
    public List<OrderPaymentsBankAddressId> getOrderPaymentsBankAddress() {
        if (orderPaymentsBankAddress == null) {
            orderPaymentsBankAddress = new ArrayList<OrderPaymentsBankAddressId>();
        }
        return this.orderPaymentsBankAddress;
    }

}
