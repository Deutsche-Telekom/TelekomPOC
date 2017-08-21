
package com.siebel.ordermanagement.promotion.data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListOfIssPromotionAgreementTerms complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListOfIssPromotionAgreementTerms">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IssPromotionAgreementTerms" type="{http://siebel.com/OrderManagement/Promotion/Data}IssPromotionAgreementTerms" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfIssPromotionAgreementTerms", propOrder = {
    "issPromotionAgreementTerms"
})
public class ListOfIssPromotionAgreementTerms
    implements Serializable
{

    @XmlElement(name = "IssPromotionAgreementTerms")
    protected List<IssPromotionAgreementTerms> issPromotionAgreementTerms;

    /**
     * Gets the value of the issPromotionAgreementTerms property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the issPromotionAgreementTerms property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIssPromotionAgreementTerms().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IssPromotionAgreementTerms }
     * 
     * 
     */
    public List<IssPromotionAgreementTerms> getIssPromotionAgreementTerms() {
        if (issPromotionAgreementTerms == null) {
            issPromotionAgreementTerms = new ArrayList<IssPromotionAgreementTerms>();
        }
        return this.issPromotionAgreementTerms;
    }

}
