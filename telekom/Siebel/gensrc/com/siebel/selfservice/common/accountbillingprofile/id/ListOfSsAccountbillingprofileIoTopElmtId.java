
package com.siebel.selfservice.common.accountbillingprofile.id;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListOfSs_Accountbillingprofile_IoTopElmtId complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListOfSs_Accountbillingprofile_IoTopElmtId">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ListOfSs_Accountbillingprofile_Io" type="{http://www.siebel.com/SelfService/Common/AccountBillingProfile/Id}ListOfSs_Accountbillingprofile_IoId"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfSs_Accountbillingprofile_IoTopElmtId", propOrder = {
    "listOfSsAccountbillingprofileIo"
})
public class ListOfSsAccountbillingprofileIoTopElmtId
    implements Serializable
{

    @XmlElement(name = "ListOfSs_Accountbillingprofile_Io", required = true)
    protected ListOfSsAccountbillingprofileIoId listOfSsAccountbillingprofileIo;

    /**
     * Gets the value of the listOfSsAccountbillingprofileIo property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfSsAccountbillingprofileIoId }
     *     
     */
    public ListOfSsAccountbillingprofileIoId getListOfSsAccountbillingprofileIo() {
        return listOfSsAccountbillingprofileIo;
    }

    /**
     * Sets the value of the listOfSsAccountbillingprofileIo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfSsAccountbillingprofileIoId }
     *     
     */
    public void setListOfSsAccountbillingprofileIo(ListOfSsAccountbillingprofileIoId value) {
        this.listOfSsAccountbillingprofileIo = value;
    }

}
