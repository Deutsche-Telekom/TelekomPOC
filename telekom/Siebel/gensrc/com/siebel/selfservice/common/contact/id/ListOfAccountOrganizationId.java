
package com.siebel.selfservice.common.contact.id;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListOfAccountOrganizationId complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListOfAccountOrganizationId">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AccountOrganization" type="{http://www.siebel.com/SelfService/Common/Contact/Id}AccountOrganizationId" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfAccountOrganizationId", propOrder = {
    "accountOrganization"
})
public class ListOfAccountOrganizationId
    implements Serializable
{

    @XmlElement(name = "AccountOrganization")
    protected List<AccountOrganizationId> accountOrganization;

    /**
     * Gets the value of the accountOrganization property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accountOrganization property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccountOrganization().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccountOrganizationId }
     * 
     * 
     */
    public List<AccountOrganizationId> getAccountOrganization() {
        if (accountOrganization == null) {
            accountOrganization = new ArrayList<AccountOrganizationId>();
        }
        return this.accountOrganization;
    }

}
