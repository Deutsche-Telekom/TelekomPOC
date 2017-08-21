
package com.siebel.ordermanagement.promotion.data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListOfPromotionProductComponentsMessages complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListOfPromotionProductComponentsMessages">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PromotionProductComponentsMessages" type="{http://siebel.com/OrderManagement/Promotion/Data}PromotionProductComponentsMessages" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfPromotionProductComponentsMessages", propOrder = {
    "promotionProductComponentsMessages"
})
public class ListOfPromotionProductComponentsMessages
    implements Serializable
{

    @XmlElement(name = "PromotionProductComponentsMessages")
    protected List<PromotionProductComponentsMessages> promotionProductComponentsMessages;

    /**
     * Gets the value of the promotionProductComponentsMessages property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the promotionProductComponentsMessages property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPromotionProductComponentsMessages().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PromotionProductComponentsMessages }
     * 
     * 
     */
    public List<PromotionProductComponentsMessages> getPromotionProductComponentsMessages() {
        if (promotionProductComponentsMessages == null) {
            promotionProductComponentsMessages = new ArrayList<PromotionProductComponentsMessages>();
        }
        return this.promotionProductComponentsMessages;
    }

}
