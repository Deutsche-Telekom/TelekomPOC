
package com.siebel.selfservice.common.address.query;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListOfSs_Address_IoTopElmtQuery complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListOfSs_Address_IoTopElmtQuery">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ListOfSs_Address_Io" type="{http://siebel.com/SelfService/Common/Address/Query}ListOfSs_Address_IoQuery" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfSs_Address_IoTopElmtQuery", propOrder = {
    "listOfSsAddressIo"
})
public class ListOfSsAddressIoTopElmtQuery
    implements Serializable
{

    @XmlElement(name = "ListOfSs_Address_Io")
    protected ListOfSsAddressIoQuery listOfSsAddressIo;

    /**
     * Gets the value of the listOfSsAddressIo property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfSsAddressIoQuery }
     *     
     */
    public ListOfSsAddressIoQuery getListOfSsAddressIo() {
        return listOfSsAddressIo;
    }

    /**
     * Sets the value of the listOfSsAddressIo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfSsAddressIoQuery }
     *     
     */
    public void setListOfSsAddressIo(ListOfSsAddressIoQuery value) {
        this.listOfSsAddressIo = value;
    }

}
