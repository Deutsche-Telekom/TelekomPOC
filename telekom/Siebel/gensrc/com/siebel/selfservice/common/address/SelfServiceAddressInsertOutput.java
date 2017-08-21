
package com.siebel.selfservice.common.address;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.siebel.selfservice.common.address.id.ListOfSsAddressIoId;


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
 *         &lt;element ref="{http://siebel.com/SelfService/Common/Address/Id}ListOfSs_Address_Io"/>
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
@XmlRootElement(name = "SelfServiceAddressInsert_Output")
public class SelfServiceAddressInsertOutput
    implements Serializable
{

    @XmlElement(name = "ListOfSs_Address_Io", namespace = "http://siebel.com/SelfService/Common/Address/Id", required = true)
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
