
package com.siebel.ordermanagement.configurator.cfginteractrequest;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListOfRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListOfRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Requests" type="{http://siebel.com/OrderManagement/Configurator/CfgInteractRequest}Requests" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfRequest", propOrder = {
    "requests"
})
public class ListOfRequest
    implements Serializable
{

    @XmlElement(name = "Requests")
    protected Requests requests;

    /**
     * Gets the value of the requests property.
     * 
     * @return
     *     possible object is
     *     {@link Requests }
     *     
     */
    public Requests getRequests() {
        return requests;
    }

    /**
     * Sets the value of the requests property.
     * 
     * @param value
     *     allowed object is
     *     {@link Requests }
     *     
     */
    public void setRequests(Requests value) {
        this.requests = value;
    }

}
