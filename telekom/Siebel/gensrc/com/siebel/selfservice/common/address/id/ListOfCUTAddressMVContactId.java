
package com.siebel.selfservice.common.address.id;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListOfCUTAddress_MVContactId complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListOfCUTAddress_MVContactId">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CUTAddress_MVContact" type="{http://siebel.com/SelfService/Common/Address/Id}CUTAddress_MVContactId" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfCUTAddress_MVContactId", propOrder = {
    "cutAddressMVContact"
})
public class ListOfCUTAddressMVContactId
    implements Serializable
{

    @XmlElement(name = "CUTAddress_MVContact")
    protected List<CUTAddressMVContactId> cutAddressMVContact;

    /**
     * Gets the value of the cutAddressMVContact property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cutAddressMVContact property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCUTAddressMVContact().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CUTAddressMVContactId }
     * 
     * 
     */
    public List<CUTAddressMVContactId> getCUTAddressMVContact() {
        if (cutAddressMVContact == null) {
            cutAddressMVContact = new ArrayList<CUTAddressMVContactId>();
        }
        return this.cutAddressMVContact;
    }

}
