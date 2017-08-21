
package com.siebel.ordermanagement.promotion.data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListOfPromotionPricingRulesSummary complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListOfPromotionPricingRulesSummary">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PromotionPricingRulesSummary" type="{http://siebel.com/OrderManagement/Promotion/Data}PromotionPricingRulesSummary" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfPromotionPricingRulesSummary", propOrder = {
    "promotionPricingRulesSummary"
})
public class ListOfPromotionPricingRulesSummary
    implements Serializable
{

    @XmlElement(name = "PromotionPricingRulesSummary")
    protected List<PromotionPricingRulesSummary> promotionPricingRulesSummary;

    /**
     * Gets the value of the promotionPricingRulesSummary property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the promotionPricingRulesSummary property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPromotionPricingRulesSummary().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PromotionPricingRulesSummary }
     * 
     * 
     */
    public List<PromotionPricingRulesSummary> getPromotionPricingRulesSummary() {
        if (promotionPricingRulesSummary == null) {
            promotionPricingRulesSummary = new ArrayList<PromotionPricingRulesSummary>();
        }
        return this.promotionPricingRulesSummary;
    }

}
