
package com.siebel.ordermanagement.promotion.data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListOfPromotionProductAggregate-DefaultProducts complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListOfPromotionProductAggregate-DefaultProducts">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PromotionProductAggregate-DefaultProducts" type="{http://siebel.com/OrderManagement/Promotion/Data}PromotionProductAggregate-DefaultProducts" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfPromotionProductAggregate-DefaultProducts", propOrder = {
    "promotionProductAggregateDefaultProducts"
})
public class ListOfPromotionProductAggregateDefaultProducts
    implements Serializable
{

    @XmlElement(name = "PromotionProductAggregate-DefaultProducts")
    protected List<PromotionProductAggregateDefaultProducts> promotionProductAggregateDefaultProducts;

    /**
     * Gets the value of the promotionProductAggregateDefaultProducts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the promotionProductAggregateDefaultProducts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPromotionProductAggregateDefaultProducts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PromotionProductAggregateDefaultProducts }
     * 
     * 
     */
    public List<PromotionProductAggregateDefaultProducts> getPromotionProductAggregateDefaultProducts() {
        if (promotionProductAggregateDefaultProducts == null) {
            promotionProductAggregateDefaultProducts = new ArrayList<PromotionProductAggregateDefaultProducts>();
        }
        return this.promotionProductAggregateDefaultProducts;
    }

}
