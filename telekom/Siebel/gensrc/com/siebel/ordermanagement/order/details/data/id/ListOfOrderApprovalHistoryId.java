
package com.siebel.ordermanagement.order.details.data.id;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListOfOrderApprovalHistoryId complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListOfOrderApprovalHistoryId">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OrderApprovalHistory" type="{http://siebel.com/OrderManagement/Order/Details/Data/Id}OrderApprovalHistoryId" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfOrderApprovalHistoryId", propOrder = {
    "orderApprovalHistory"
})
public class ListOfOrderApprovalHistoryId
    implements Serializable
{

    @XmlElement(name = "OrderApprovalHistory")
    protected List<OrderApprovalHistoryId> orderApprovalHistory;

    /**
     * Gets the value of the orderApprovalHistory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the orderApprovalHistory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrderApprovalHistory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrderApprovalHistoryId }
     * 
     * 
     */
    public List<OrderApprovalHistoryId> getOrderApprovalHistory() {
        if (orderApprovalHistory == null) {
            orderApprovalHistory = new ArrayList<OrderApprovalHistoryId>();
        }
        return this.orderApprovalHistory;
    }

}
