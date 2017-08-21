
package com.siebel.ordermanagement.promotion.data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListOfIssPromotionVersionsBuscomp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListOfIssPromotionVersionsBuscomp">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PromotionVersions" type="{http://siebel.com/OrderManagement/Promotion/Data}PromotionVersions" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfIssPromotionVersionsBuscomp", propOrder = {
    "promotionVersions"
})
public class ListOfIssPromotionVersionsBuscomp
    implements Serializable
{

    @XmlElement(name = "PromotionVersions")
    protected List<PromotionVersions> promotionVersions;

    /**
     * Gets the value of the promotionVersions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the promotionVersions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPromotionVersions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PromotionVersions }
     * 
     * 
     */
    public List<PromotionVersions> getPromotionVersions() {
        if (promotionVersions == null) {
            promotionVersions = new ArrayList<PromotionVersions>();
        }
        return this.promotionVersions;
    }

}
