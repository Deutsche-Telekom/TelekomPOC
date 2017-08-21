
package com.siebel.selfservice.common.contact.data;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListOfSSContactTopElmtData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListOfSSContactTopElmtData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ListOfSSContact" type="{http://www.siebel.com/SelfService/Common/Contact/Data}ListOfSSContactData"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfSSContactTopElmtData", propOrder = {
    "listOfSSContact"
})
public class ListOfSSContactTopElmtData
    implements Serializable
{

    @XmlElement(name = "ListOfSSContact", required = true)
    protected ListOfSSContactData listOfSSContact;

    /**
     * Gets the value of the listOfSSContact property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfSSContactData }
     *     
     */
    public ListOfSSContactData getListOfSSContact() {
        return listOfSSContact;
    }

    /**
     * Sets the value of the listOfSSContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfSSContactData }
     *     
     */
    public void setListOfSSContact(ListOfSSContactData value) {
        this.listOfSSContact = value;
    }

}
