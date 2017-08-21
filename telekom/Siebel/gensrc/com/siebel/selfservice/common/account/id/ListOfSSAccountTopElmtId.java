
package com.siebel.selfservice.common.account.id;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListOfSSAccountTopElmtId complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListOfSSAccountTopElmtId">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ListOfSSAccount" type="{http://www.siebel.com/SelfService/Common/Account/Id}ListOfSSAccountId"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfSSAccountTopElmtId", propOrder = {
    "listOfSSAccount"
})
public class ListOfSSAccountTopElmtId
    implements Serializable
{

    @XmlElement(name = "ListOfSSAccount", required = true)
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
