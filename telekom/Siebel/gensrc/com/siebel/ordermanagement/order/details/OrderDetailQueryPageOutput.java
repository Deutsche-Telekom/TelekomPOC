
package com.siebel.ordermanagement.order.details;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.siebel.ordermanagement.order.details.data.data.ListOfOrderDetailData;


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
 *         &lt;element ref="{http://siebel.com/OrderManagement/Order/Details/Data/Data}ListOfOrderDetail"/>
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
    "listOfOrderDetail"
})
@XmlRootElement(name = "OrderDetailQueryPage_Output")
public class OrderDetailQueryPageOutput
    implements Serializable
{

    @XmlElement(name = "ListOfOrderDetail", namespace = "http://siebel.com/OrderManagement/Order/Details/Data/Data", required = true)
    protected ListOfOrderDetailData listOfOrderDetail;

    /**
     * Gets the value of the listOfOrderDetail property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfOrderDetailData }
     *     
     */
    public ListOfOrderDetailData getListOfOrderDetail() {
        return listOfOrderDetail;
    }

    /**
     * Sets the value of the listOfOrderDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfOrderDetailData }
     *     
     */
    public void setListOfOrderDetail(ListOfOrderDetailData value) {
        this.listOfOrderDetail = value;
    }

}
