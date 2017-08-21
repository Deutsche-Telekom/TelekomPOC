
package com.siebel.selfservice.common.accountbillingprofile.query;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListOfSs_Accountbillingprofile_IoTopElmtQuery complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListOfSs_Accountbillingprofile_IoTopElmtQuery">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ListOfSs_Accountbillingprofile_Io" type="{http://www.siebel.com/SelfService/Common/AccountBillingProfile/Query}ListOfSs_Accountbillingprofile_IoQuery" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfSs_Accountbillingprofile_IoTopElmtQuery", propOrder = {
    "listOfSsAccountbillingprofileIo"
})
public class ListOfSsAccountbillingprofileIoTopElmtQuery
    implements Serializable
{

    @XmlElement(name = "ListOfSs_Accountbillingprofile_Io")
    protected ListOfSsAccountbillingprofileIoQuery listOfSsAccountbillingprofileIo;

    /**
     * Gets the value of the listOfSsAccountbillingprofileIo property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfSsAccountbillingprofileIoQuery }
     *     
     */
    public ListOfSsAccountbillingprofileIoQuery getListOfSsAccountbillingprofileIo() {
        return listOfSsAccountbillingprofileIo;
    }

    /**
     * Sets the value of the listOfSsAccountbillingprofileIo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfSsAccountbillingprofileIoQuery }
     *     
     */
    public void setListOfSsAccountbillingprofileIo(ListOfSsAccountbillingprofileIoQuery value) {
        this.listOfSsAccountbillingprofileIo = value;
    }

}
