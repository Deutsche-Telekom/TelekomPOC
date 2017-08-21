
package com.siebel.selfservice.common.contact;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.siebel.selfservice.common.contact.data.ListOfSSContactData;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.siebel.com/SelfService/Common/Contact/Data}ListOfSSContact"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "listOfSSContact"
})
@XmlRootElement(name = "SelfServiceContactQueryPage_Output")
public class SelfServiceContactQueryPageOutput
    implements Serializable
{

    @XmlElement(name = "ListOfSSContact", namespace = "http://www.siebel.com/SelfService/Common/Contact/Data", required = true)
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
