
package com.siebel.selfservice.common.address.id;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListOfSs_Address_IoTopElmtId complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListOfSs_Address_IoTopElmtId">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ListOfSs_Address_Io" type="{http://siebel.com/SelfService/Common/Address/Id}ListOfSs_Address_IoId"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfSs_Address_IoTopElmtId", propOrder = {
    "listOfSsAddressIo"
})
public class ListOfSsAddressIoTopElmtId
    implements Serializable
{

    @XmlElement(name = "ListOfSs_Address_Io", required = true)
    protected ListOfSsAddressIoId listOfSsAddressIo;

    /**
     * Gets the value of the listOfSsAddressIo property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfSsAddressIoId }
     *     
     */
    public ListOfSsAddressIoId getListOfSsAddressIo() {
        return listOfSsAddressIo;
    }

    /**
     * Sets the value of the listOfSsAddressIo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfSsAddressIoId }
     *     
     */
    public void setListOfSsAddressIo(ListOfSsAddressIoId value) {
        this.listOfSsAddressIo = value;
    }

}
