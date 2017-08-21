
package com.siebel.selfservice.common.contact.id;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListOfSSContactTopElmtId complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListOfSSContactTopElmtId">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ListOfSSContact" type="{http://www.siebel.com/SelfService/Common/Contact/Id}ListOfSSContactId"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfSSContactTopElmtId", propOrder = {
    "listOfSSContact"
})
public class ListOfSSContactTopElmtId
    implements Serializable
{

    @XmlElement(name = "ListOfSSContact", required = true)
    protected ListOfSSContactId listOfSSContact;

    /**
     * Gets the value of the listOfSSContact property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfSSContactId }
     *     
     */
    public ListOfSSContactId getListOfSSContact() {
        return listOfSSContact;
    }

    /**
     * Sets the value of the listOfSSContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfSSContactId }
     *     
     */
    public void setListOfSSContact(ListOfSSContactId value) {
        this.listOfSSContact = value;
    }

}
