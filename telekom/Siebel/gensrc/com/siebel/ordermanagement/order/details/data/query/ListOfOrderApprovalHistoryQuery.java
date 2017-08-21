
package com.siebel.ordermanagement.order.details.data.query;

import java.io.Serializable;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListOfOrderApprovalHistoryQuery complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListOfOrderApprovalHistoryQuery">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OrderApprovalHistory" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}OrderApprovalHistoryQuery" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="pagesize" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="startrownum" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="recordcountneeded" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfOrderApprovalHistoryQuery", propOrder = {
    "orderApprovalHistory"
})
public class ListOfOrderApprovalHistoryQuery
    implements Serializable
{

    @XmlElement(name = "OrderApprovalHistory")
    protected OrderApprovalHistoryQuery orderApprovalHistory;
    @XmlAttribute
    protected BigInteger pagesize;
    @XmlAttribute
    protected BigInteger startrownum;
    @XmlAttribute
    protected Boolean recordcountneeded;

    /**
     * Gets the value of the orderApprovalHistory property.
     * 
     * @return
     *     possible object is
     *     {@link OrderApprovalHistoryQuery }
     *     
     */
    public OrderApprovalHistoryQuery getOrderApprovalHistory() {
        return orderApprovalHistory;
    }

    /**
     * Sets the value of the orderApprovalHistory property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderApprovalHistoryQuery }
     *     
     */
    public void setOrderApprovalHistory(OrderApprovalHistoryQuery value) {
        this.orderApprovalHistory = value;
    }

    /**
     * Gets the value of the pagesize property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPagesize() {
        return pagesize;
    }

    /**
     * Sets the value of the pagesize property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPagesize(BigInteger value) {
        this.pagesize = value;
    }

    /**
     * Gets the value of the startrownum property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getStartrownum() {
        return startrownum;
    }

    /**
     * Sets the value of the startrownum property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setStartrownum(BigInteger value) {
        this.startrownum = value;
    }

    /**
     * Gets the value of the recordcountneeded property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRecordcountneeded() {
        return recordcountneeded;
    }

    /**
     * Sets the value of the recordcountneeded property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRecordcountneeded(Boolean value) {
        this.recordcountneeded = value;
    }

}
