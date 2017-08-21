
package com.siebel.selfservice.common.account;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.siebel.selfservice.common.account.data.ListOfSSAccountData;


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
 *         &lt;element ref="{http://www.siebel.com/SelfService/Common/Account/Data}ListOfSSAccount"/>
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
    "listOfSSAccount"
})
@XmlRootElement(name = "SelfServiceAccountQueryPage_Output")
public class SelfServiceAccountQueryPageOutput
    implements Serializable
{

    @XmlElement(name = "ListOfSSAccount", namespace = "http://www.siebel.com/SelfService/Common/Account/Data", required = true)
    protected ListOfSSAccountData listOfSSAccount;

    /**
     * Gets the value of the listOfSSAccount property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfSSAccountData }
     *     
     */
    public ListOfSSAccountData getListOfSSAccount() {
        return listOfSSAccount;
    }

    /**
     * Sets the value of the listOfSSAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfSSAccountData }
     *     
     */
    public void setListOfSSAccount(ListOfSSAccountData value) {
        this.listOfSSAccount = value;
    }

}
