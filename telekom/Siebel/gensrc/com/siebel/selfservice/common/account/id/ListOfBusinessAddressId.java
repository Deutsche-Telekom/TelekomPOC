
package com.siebel.selfservice.common.account.id;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListOfBusinessAddressId complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListOfBusinessAddressId">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BusinessAddress" type="{http://www.siebel.com/SelfService/Common/Account/Id}BusinessAddressId" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfBusinessAddressId", propOrder = {
    "businessAddress"
})
public class ListOfBusinessAddressId
    implements Serializable
{

    @XmlElement(name = "BusinessAddress")
    protected List<BusinessAddressId> businessAddress;

    /**
     * Gets the value of the businessAddress property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the businessAddress property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBusinessAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BusinessAddressId }
     * 
     * 
     */
    public List<BusinessAddressId> getBusinessAddress() {
        if (businessAddress == null) {
            businessAddress = new ArrayList<BusinessAddressId>();
        }
        return this.businessAddress;
    }

}
