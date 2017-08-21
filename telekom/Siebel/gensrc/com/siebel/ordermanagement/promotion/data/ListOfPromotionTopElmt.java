
package com.siebel.ordermanagement.promotion.data;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListOfPromotionTopElmt complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListOfPromotionTopElmt">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ListOfPromotion" type="{http://siebel.com/OrderManagement/Promotion/Data}ListOfPromotion"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfPromotionTopElmt", propOrder = {
    "listOfPromotion"
})
public class ListOfPromotionTopElmt
    implements Serializable
{

    @XmlElement(name = "ListOfPromotion", required = true)
    protected ListOfPromotion listOfPromotion;

    /**
     * Gets the value of the listOfPromotion property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfPromotion }
     *     
     */
    public ListOfPromotion getListOfPromotion() {
        return listOfPromotion;
    }

    /**
     * Sets the value of the listOfPromotion property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfPromotion }
     *     
     */
    public void setListOfPromotion(ListOfPromotion value) {
        this.listOfPromotion = value;
    }

}
