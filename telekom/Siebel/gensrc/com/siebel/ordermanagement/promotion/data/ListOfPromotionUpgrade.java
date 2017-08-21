
package com.siebel.ordermanagement.promotion.data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListOfPromotionUpgrade complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListOfPromotionUpgrade">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PromotionUpgrade" type="{http://siebel.com/OrderManagement/Promotion/Data}PromotionUpgrade" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfPromotionUpgrade", propOrder = {
    "promotionUpgrade"
})
public class ListOfPromotionUpgrade
    implements Serializable
{

    @XmlElement(name = "PromotionUpgrade")
    protected List<PromotionUpgrade> promotionUpgrade;

    /**
     * Gets the value of the promotionUpgrade property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the promotionUpgrade property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPromotionUpgrade().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PromotionUpgrade }
     * 
     * 
     */
    public List<PromotionUpgrade> getPromotionUpgrade() {
        if (promotionUpgrade == null) {
            promotionUpgrade = new ArrayList<PromotionUpgrade>();
        }
        return this.promotionUpgrade;
    }

}
