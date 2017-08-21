
package com.siebel.ordermanagement.promotion.data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListOfPromotionComponentsRulesSummary complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListOfPromotionComponentsRulesSummary">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PromotionComponentsRulesSummary" type="{http://siebel.com/OrderManagement/Promotion/Data}PromotionComponentsRulesSummary" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfPromotionComponentsRulesSummary", propOrder = {
    "promotionComponentsRulesSummary"
})
public class ListOfPromotionComponentsRulesSummary
    implements Serializable
{

    @XmlElement(name = "PromotionComponentsRulesSummary")
    protected List<PromotionComponentsRulesSummary> promotionComponentsRulesSummary;

    /**
     * Gets the value of the promotionComponentsRulesSummary property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the promotionComponentsRulesSummary property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPromotionComponentsRulesSummary().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PromotionComponentsRulesSummary }
     * 
     * 
     */
    public List<PromotionComponentsRulesSummary> getPromotionComponentsRulesSummary() {
        if (promotionComponentsRulesSummary == null) {
            promotionComponentsRulesSummary = new ArrayList<PromotionComponentsRulesSummary>();
        }
        return this.promotionComponentsRulesSummary;
    }

}
