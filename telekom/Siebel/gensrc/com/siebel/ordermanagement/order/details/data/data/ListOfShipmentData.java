
package com.siebel.ordermanagement.order.details.data.data;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListOfShipmentData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListOfShipmentData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Shipment" type="{http://siebel.com/OrderManagement/Order/Details/Data/Data}ShipmentData" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="lastpage" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="recordcount" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfShipmentData", propOrder = {
    "shipment"
})
public class ListOfShipmentData
    implements Serializable
{

    @XmlElement(name = "Shipment")
    protected List<ShipmentData> shipment;
    @XmlAttribute
    protected Boolean lastpage;
    @XmlAttribute
    protected BigInteger recordcount;

    /**
     * Gets the value of the shipment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shipment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShipment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShipmentData }
     * 
     * 
     */
    public List<ShipmentData> getShipment() {
        if (shipment == null) {
            shipment = new ArrayList<ShipmentData>();
        }
        return this.shipment;
    }

    /**
     * Gets the value of the lastpage property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLastpage() {
        return lastpage;
    }

    /**
     * Sets the value of the lastpage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLastpage(Boolean value) {
        this.lastpage = value;
    }

    /**
     * Gets the value of the recordcount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRecordcount() {
        return recordcount;
    }

    /**
     * Sets the value of the recordcount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRecordcount(BigInteger value) {
        this.recordcount = value;
    }

}
