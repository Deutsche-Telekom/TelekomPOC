
package com.siebel.selfservice.common.accountbillingprofile;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.siebel.selfservice.common.accountbillingprofile.data.ListOfSsAccountbillingprofileIoData;


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
 *         &lt;element ref="{http://www.siebel.com/SelfService/Common/AccountBillingProfile/Data}ListOfSs_Accountbillingprofile_Io"/>
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
    "listOfSsAccountbillingprofileIo"
})
@XmlRootElement(name = "SelfServiceAccountBillingProfileQueryPage_Output")
public class SelfServiceAccountBillingProfileQueryPageOutput
    implements Serializable
{

    @XmlElement(name = "ListOfSs_Accountbillingprofile_Io", namespace = "http://www.siebel.com/SelfService/Common/AccountBillingProfile/Data", required = true)
    protected ListOfSsAccountbillingprofileIoData listOfSsAccountbillingprofileIo;

    /**
     * Gets the value of the listOfSsAccountbillingprofileIo property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfSsAccountbillingprofileIoData }
     *     
     */
    public ListOfSsAccountbillingprofileIoData getListOfSsAccountbillingprofileIo() {
        return listOfSsAccountbillingprofileIo;
    }

    /**
     * Sets the value of the listOfSsAccountbillingprofileIo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfSsAccountbillingprofileIoData }
     *     
     */
    public void setListOfSsAccountbillingprofileIo(ListOfSsAccountbillingprofileIoData value) {
        this.listOfSsAccountbillingprofileIo = value;
    }

}
