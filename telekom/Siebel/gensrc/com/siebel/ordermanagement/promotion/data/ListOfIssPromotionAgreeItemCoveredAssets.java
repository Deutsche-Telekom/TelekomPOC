
package com.siebel.ordermanagement.promotion.data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListOfIssPromotionAgreeItemCoveredAssets complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListOfIssPromotionAgreeItemCoveredAssets">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IssPromotionAgreeItemCoveredAssets" type="{http://siebel.com/OrderManagement/Promotion/Data}IssPromotionAgreeItemCoveredAssets" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfIssPromotionAgreeItemCoveredAssets", propOrder = {
    "issPromotionAgreeItemCoveredAssets"
})
public class ListOfIssPromotionAgreeItemCoveredAssets
    implements Serializable
{

    @XmlElement(name = "IssPromotionAgreeItemCoveredAssets")
    protected List<IssPromotionAgreeItemCoveredAssets> issPromotionAgreeItemCoveredAssets;

    /**
     * Gets the value of the issPromotionAgreeItemCoveredAssets property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the issPromotionAgreeItemCoveredAssets property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIssPromotionAgreeItemCoveredAssets().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IssPromotionAgreeItemCoveredAssets }
     * 
     * 
     */
    public List<IssPromotionAgreeItemCoveredAssets> getIssPromotionAgreeItemCoveredAssets() {
        if (issPromotionAgreeItemCoveredAssets == null) {
            issPromotionAgreeItemCoveredAssets = new ArrayList<IssPromotionAgreeItemCoveredAssets>();
        }
        return this.issPromotionAgreeItemCoveredAssets;
    }

}
