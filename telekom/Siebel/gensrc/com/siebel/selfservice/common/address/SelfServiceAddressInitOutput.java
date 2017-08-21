
package com.siebel.selfservice.common.address;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.siebel.selfservice.common.address.data.ListOfSsAddressIoData;


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
 *         &lt;element ref="{http://siebel.com/SelfService/Common/Address/Data}ListOfSs_Address_Io"/>
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
    "listOfSsAddressIo"
})
@XmlRootElement(name = "SelfServiceAddressInit_Output")
public class SelfServiceAddressInitOutput
    implements Serializable
{

    @XmlElement(name = "ListOfSs_Address_Io", namespace = "http://siebel.com/SelfService/Common/Address/Data", required = true)
    protected ListOfSsAddressIoData listOfSsAddressIo;

    /**
     * Gets the value of the listOfSsAddressIo property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfSsAddressIoData }
     *     
     */
    public ListOfSsAddressIoData getListOfSsAddressIo() {
        return listOfSsAddressIo;
    }

    /**
     * Sets the value of the listOfSsAddressIo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfSsAddressIoData }
     *     
     */
    public void setListOfSsAddressIo(ListOfSsAddressIoData value) {
        this.listOfSsAddressIo = value;
    }

}
