
package com.siebel.selfservice.common.account;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.siebel.selfservice.common.account.id.ListOfSSAccountId;


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
 *         &lt;element ref="{http://www.siebel.com/SelfService/Common/Account/Id}ListOfSSAccount"/>
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
@XmlRootElement(name = "SelfServiceAccountExecute_Output")
public class SelfServiceAccountExecuteOutput
    implements Serializable
{

    @XmlElement(name = "ListOfSSAccount", namespace = "http://www.siebel.com/SelfService/Common/Account/Id", required = true)
    protected ListOfSSAccountId listOfSSAccount;

    /**
     * Gets the value of the listOfSSAccount property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfSSAccountId }
     *     
     */
    public ListOfSSAccountId getListOfSSAccount() {
        return listOfSSAccount;
    }

    /**
     * Sets the value of the listOfSSAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfSSAccountId }
     *     
     */
    public void setListOfSSAccount(ListOfSSAccountId value) {
        this.listOfSSAccount = value;
    }

}
