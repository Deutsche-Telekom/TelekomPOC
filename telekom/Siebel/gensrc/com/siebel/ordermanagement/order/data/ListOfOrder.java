
package com.siebel.ordermanagement.order.data;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListOfOrder complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListOfOrder">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ListOfOrderHeader" type="{http://siebel.com/OrderManagement/Order/Data}ListOfOrderHeader" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfOrder", propOrder = {
    "listOfOrderHeader"
})
public class ListOfOrder
    implements Serializable
{

    @XmlElement(name = "ListOfOrderHeader")
    protected ListOfOrderHeader listOfOrderHeader;

    /**
     * Gets the value of the listOfOrderHeader property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfOrderHeader }
     *     
     */
    public ListOfOrderHeader getListOfOrderHeader() {
        return listOfOrderHeader;
    }

    /**
     * Sets the value of the listOfOrderHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfOrderHeader }
     *     
     */
    public void setListOfOrderHeader(ListOfOrderHeader value) {
        this.listOfOrderHeader = value;
    }

}
