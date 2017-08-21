
package com.siebel.selfservice.common.contact.id;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListOfContactAccountId complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListOfContactAccountId">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ContactAccount" type="{http://www.siebel.com/SelfService/Common/Contact/Id}ContactAccountId" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfContactAccountId", propOrder = {
    "contactAccount"
})
public class ListOfContactAccountId
    implements Serializable
{

    @XmlElement(name = "ContactAccount")
    protected List<ContactAccountId> contactAccount;

    /**
     * Gets the value of the contactAccount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contactAccount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContactAccount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContactAccountId }
     * 
     * 
     */
    public List<ContactAccountId> getContactAccount() {
        if (contactAccount == null) {
            contactAccount = new ArrayList<ContactAccountId>();
        }
        return this.contactAccount;
    }

}
