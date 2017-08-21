
package com.siebel.selfservice.common.accountbillingprofile;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListOfSs_Accountbillingprofile_IoTopElmt complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListOfSs_Accountbillingprofile_IoTopElmt">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ListOfSs_Accountbillingprofile_Io" type="{http://www.siebel.com/SelfService/Common/AccountBillingProfile}ListOfSs_Accountbillingprofile_Io"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfSs_Accountbillingprofile_IoTopElmt", propOrder = {
    "listOfSsAccountbillingprofileIo"
})
public class ListOfSsAccountbillingprofileIoTopElmt
    implements Serializable
{

    @XmlElement(name = "ListOfSs_Accountbillingprofile_Io", required = true)
    protected ListOfSsAccountbillingprofileIo listOfSsAccountbillingprofileIo;

    /**
     * Gets the value of the listOfSsAccountbillingprofileIo property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfSsAccountbillingprofileIo }
     *     
     */
    public ListOfSsAccountbillingprofileIo getListOfSsAccountbillingprofileIo() {
        return listOfSsAccountbillingprofileIo;
    }

    /**
     * Sets the value of the listOfSsAccountbillingprofileIo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfSsAccountbillingprofileIo }
     *     
     */
    public void setListOfSsAccountbillingprofileIo(ListOfSsAccountbillingprofileIo value) {
        this.listOfSsAccountbillingprofileIo = value;
    }

}
