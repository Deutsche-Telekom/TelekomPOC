
package com.siebel.ordermanagement.promotion.data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListOfIssPromotionCommitments complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListOfIssPromotionCommitments">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ServiceAgreement" type="{http://siebel.com/OrderManagement/Promotion/Data}ServiceAgreement" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfIssPromotionCommitments", propOrder = {
    "serviceAgreement"
})
public class ListOfIssPromotionCommitments
    implements Serializable
{

    @XmlElement(name = "ServiceAgreement")
    protected List<ServiceAgreement> serviceAgreement;

    /**
     * Gets the value of the serviceAgreement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceAgreement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceAgreement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceAgreement }
     * 
     * 
     */
    public List<ServiceAgreement> getServiceAgreement() {
        if (serviceAgreement == null) {
            serviceAgreement = new ArrayList<ServiceAgreement>();
        }
        return this.serviceAgreement;
    }

}
