
package com.siebel.selfservice.common.accountbillingprofile;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="Account_spcId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Billing_spcProfile_spcId" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "accountSpcId",
    "billingSpcProfileSpcId"
})
@XmlRootElement(name = "SelfServiceAccountBillingProfileSetPrimary_Input")
public class SelfServiceAccountBillingProfileSetPrimaryInput
    implements Serializable
{

    @XmlElement(name = "Account_spcId", required = true)
    protected String accountSpcId;
    @XmlElement(name = "Billing_spcProfile_spcId", required = true)
    protected String billingSpcProfileSpcId;

    /**
     * Gets the value of the accountSpcId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountSpcId() {
        return accountSpcId;
    }

    /**
     * Sets the value of the accountSpcId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountSpcId(String value) {
        this.accountSpcId = value;
    }

    /**
     * Gets the value of the billingSpcProfileSpcId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingSpcProfileSpcId() {
        return billingSpcProfileSpcId;
    }

    /**
     * Sets the value of the billingSpcProfileSpcId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingSpcProfileSpcId(String value) {
        this.billingSpcProfileSpcId = value;
    }

}
