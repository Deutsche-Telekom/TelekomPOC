
package com.siebel.selfservice.common.contact.id;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListOfAccountBusinessAddressId complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListOfAccountBusinessAddressId">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AccountBusinessAddress" type="{http://www.siebel.com/SelfService/Common/Contact/Id}AccountBusinessAddressId" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfAccountBusinessAddressId", propOrder = {
    "accountBusinessAddress"
})
public class ListOfAccountBusinessAddressId
    implements Serializable
{

    @XmlElement(name = "AccountBusinessAddress")
    protected List<AccountBusinessAddressId> accountBusinessAddress;

    /**
     * Gets the value of the accountBusinessAddress property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accountBusinessAddress property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccountBusinessAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccountBusinessAddressId }
     * 
     * 
     */
    public List<AccountBusinessAddressId> getAccountBusinessAddress() {
        if (accountBusinessAddress == null) {
            accountBusinessAddress = new ArrayList<AccountBusinessAddressId>();
        }
        return this.accountBusinessAddress;
    }

}
