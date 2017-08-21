
package com.siebel.selfservice.common.address.data;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListOfSs_Address_IoTopElmtData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListOfSs_Address_IoTopElmtData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ListOfSs_Address_Io" type="{http://siebel.com/SelfService/Common/Address/Data}ListOfSs_Address_IoData"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfSs_Address_IoTopElmtData", propOrder = {
    "listOfSsAddressIo"
})
public class ListOfSsAddressIoTopElmtData
    implements Serializable
{

    @XmlElement(name = "ListOfSs_Address_Io", required = true)
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
