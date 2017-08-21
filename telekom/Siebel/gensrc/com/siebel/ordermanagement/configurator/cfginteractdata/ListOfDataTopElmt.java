
package com.siebel.ordermanagement.configurator.cfginteractdata;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListOfDataTopElmt complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListOfDataTopElmt">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ListOfData" type="{http://siebel.com/OrderManagement/Configurator/CfgInteractData}ListOfData"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfDataTopElmt", propOrder = {
    "listOfData"
})
public class ListOfDataTopElmt
    implements Serializable
{

    @XmlElement(name = "ListOfData", required = true)
    protected ListOfData listOfData;

    /**
     * Gets the value of the listOfData property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfData }
     *     
     */
    public ListOfData getListOfData() {
        return listOfData;
    }

    /**
     * Sets the value of the listOfData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfData }
     *     
     */
    public void setListOfData(ListOfData value) {
        this.listOfData = value;
    }

}
