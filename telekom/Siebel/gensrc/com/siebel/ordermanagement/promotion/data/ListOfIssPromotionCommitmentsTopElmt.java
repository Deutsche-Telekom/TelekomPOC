
package com.siebel.ordermanagement.promotion.data;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListOfIssPromotionCommitmentsTopElmt complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListOfIssPromotionCommitmentsTopElmt">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ListOfIssPromotionCommitments" type="{http://siebel.com/OrderManagement/Promotion/Data}ListOfIssPromotionCommitments"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfIssPromotionCommitmentsTopElmt", propOrder = {
    "listOfIssPromotionCommitments"
})
public class ListOfIssPromotionCommitmentsTopElmt
    implements Serializable
{

    @XmlElement(name = "ListOfIssPromotionCommitments", required = true)
    protected ListOfIssPromotionCommitments listOfIssPromotionCommitments;

    /**
     * Gets the value of the listOfIssPromotionCommitments property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfIssPromotionCommitments }
     *     
     */
    public ListOfIssPromotionCommitments getListOfIssPromotionCommitments() {
        return listOfIssPromotionCommitments;
    }

    /**
     * Sets the value of the listOfIssPromotionCommitments property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfIssPromotionCommitments }
     *     
     */
    public void setListOfIssPromotionCommitments(ListOfIssPromotionCommitments value) {
        this.listOfIssPromotionCommitments = value;
    }

}
