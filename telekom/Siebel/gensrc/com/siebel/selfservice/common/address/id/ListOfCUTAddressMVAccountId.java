
package com.siebel.selfservice.common.address.id;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListOfCUTAddress_MVAccountId complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListOfCUTAddress_MVAccountId">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CUTAddress_MVAccount" type="{http://siebel.com/SelfService/Common/Address/Id}CUTAddress_MVAccountId" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfCUTAddress_MVAccountId", propOrder = {
    "cutAddressMVAccount"
})
public class ListOfCUTAddressMVAccountId
    implements Serializable
{

    @XmlElement(name = "CUTAddress_MVAccount")
    protected List<CUTAddressMVAccountId> cutAddressMVAccount;

    /**
     * Gets the value of the cutAddressMVAccount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cutAddressMVAccount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCUTAddressMVAccount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CUTAddressMVAccountId }
     * 
     * 
     */
    public List<CUTAddressMVAccountId> getCUTAddressMVAccount() {
        if (cutAddressMVAccount == null) {
            cutAddressMVAccount = new ArrayList<CUTAddressMVAccountId>();
        }
        return this.cutAddressMVAccount;
    }

}
