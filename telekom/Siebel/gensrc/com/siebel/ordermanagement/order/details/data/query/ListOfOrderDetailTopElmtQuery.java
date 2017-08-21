
package com.siebel.ordermanagement.order.details.data.query;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListOfOrderDetailTopElmtQuery complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListOfOrderDetailTopElmtQuery">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ListOfOrderDetail" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}ListOfOrderDetailQuery" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfOrderDetailTopElmtQuery", propOrder = {
    "listOfOrderDetail"
})
public class ListOfOrderDetailTopElmtQuery
    implements Serializable
{

    @XmlElement(name = "ListOfOrderDetail")
    protected ListOfOrderDetailQuery listOfOrderDetail;

    /**
     * Gets the value of the listOfOrderDetail property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfOrderDetailQuery }
     *     
     */
    public ListOfOrderDetailQuery getListOfOrderDetail() {
        return listOfOrderDetail;
    }

    /**
     * Sets the value of the listOfOrderDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfOrderDetailQuery }
     *     
     */
    public void setListOfOrderDetail(ListOfOrderDetailQuery value) {
        this.listOfOrderDetail = value;
    }

}
