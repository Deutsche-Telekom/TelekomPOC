
package com.siebel.ordermanagement.configurator.cfgproperties;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListOfPropertiesTopElmt complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListOfPropertiesTopElmt">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ListOfProperties" type="{http://siebel.com/OrderManagement/Configurator/CfgProperties}ListOfProperties"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfPropertiesTopElmt", propOrder = {
    "listOfProperties"
})
public class ListOfPropertiesTopElmt
    implements Serializable
{

    @XmlElement(name = "ListOfProperties", required = true)
    protected ListOfProperties listOfProperties;

    /**
     * Gets the value of the listOfProperties property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfProperties }
     *     
     */
    public ListOfProperties getListOfProperties() {
        return listOfProperties;
    }

    /**
     * Sets the value of the listOfProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfProperties }
     *     
     */
    public void setListOfProperties(ListOfProperties value) {
        this.listOfProperties = value;
    }

}
