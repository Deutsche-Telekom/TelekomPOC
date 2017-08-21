
package com.siebel.ordermanagement.promotion.data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListOfPromotionItemAttributeforImport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListOfPromotionItemAttributeforImport">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PromotionItemAttributeforImport" type="{http://siebel.com/OrderManagement/Promotion/Data}PromotionItemAttributeforImport" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfPromotionItemAttributeforImport", propOrder = {
    "promotionItemAttributeforImport"
})
public class ListOfPromotionItemAttributeforImport
    implements Serializable
{

    @XmlElement(name = "PromotionItemAttributeforImport")
    protected List<PromotionItemAttributeforImport> promotionItemAttributeforImport;

    /**
     * Gets the value of the promotionItemAttributeforImport property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the promotionItemAttributeforImport property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPromotionItemAttributeforImport().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PromotionItemAttributeforImport }
     * 
     * 
     */
    public List<PromotionItemAttributeforImport> getPromotionItemAttributeforImport() {
        if (promotionItemAttributeforImport == null) {
            promotionItemAttributeforImport = new ArrayList<PromotionItemAttributeforImport>();
        }
        return this.promotionItemAttributeforImport;
    }

}
