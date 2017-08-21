
package com.siebel.ordermanagement.order.details.data.id;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListOfOrderDetailTopElmtId complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListOfOrderDetailTopElmtId">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ListOfOrderDetail" type="{http://siebel.com/OrderManagement/Order/Details/Data/Id}ListOfOrderDetailId"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfOrderDetailTopElmtId", propOrder = {
    "listOfOrderDetail"
})
public class ListOfOrderDetailTopElmtId
    implements Serializable
{

    @XmlElement(name = "ListOfOrderDetail", required = true)
    protected ListOfOrderDetailId listOfOrderDetail;

    /**
     * Gets the value of the listOfOrderDetail property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfOrderDetailId }
     *     
     */
    public ListOfOrderDetailId getListOfOrderDetail() {
        return listOfOrderDetail;
    }

    /**
     * Sets the value of the listOfOrderDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfOrderDetailId }
     *     
     */
    public void setListOfOrderDetail(ListOfOrderDetailId value) {
        this.listOfOrderDetail = value;
    }

}
