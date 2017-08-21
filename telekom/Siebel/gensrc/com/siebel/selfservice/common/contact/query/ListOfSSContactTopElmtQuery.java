
package com.siebel.selfservice.common.contact.query;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListOfSSContactTopElmtQuery complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListOfSSContactTopElmtQuery">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ListOfSSContact" type="{http://www.siebel.com/SelfService/Common/Contact/Query}ListOfSSContactQuery" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfSSContactTopElmtQuery", propOrder = {
    "listOfSSContact"
})
public class ListOfSSContactTopElmtQuery
    implements Serializable
{

    @XmlElement(name = "ListOfSSContact")
    protected ListOfSSContactQuery listOfSSContact;

    /**
     * Gets the value of the listOfSSContact property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfSSContactQuery }
     *     
     */
    public ListOfSSContactQuery getListOfSSContact() {
        return listOfSSContact;
    }

    /**
     * Sets the value of the listOfSSContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfSSContactQuery }
     *     
     */
    public void setListOfSSContact(ListOfSSContactQuery value) {
        this.listOfSSContact = value;
    }

}
