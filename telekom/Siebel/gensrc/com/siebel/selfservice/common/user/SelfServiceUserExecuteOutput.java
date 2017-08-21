
package com.siebel.selfservice.common.user;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.siebel.selfservice.common.user.id.ListOfSSUserId;


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
 *         &lt;element ref="{http://www.siebel.com/SelfService/Common/User/Id}ListOfSSUser"/>
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
    "listOfSSUser"
})
@XmlRootElement(name = "SelfServiceUserExecute_Output")
public class SelfServiceUserExecuteOutput
    implements Serializable
{

    @XmlElement(name = "ListOfSSUser", namespace = "http://www.siebel.com/SelfService/Common/User/Id", required = true)
    protected ListOfSSUserId listOfSSUser;

    /**
     * Gets the value of the listOfSSUser property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfSSUserId }
     *     
     */
    public ListOfSSUserId getListOfSSUser() {
        return listOfSSUser;
    }

    /**
     * Sets the value of the listOfSSUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfSSUserId }
     *     
     */
    public void setListOfSSUser(ListOfSSUserId value) {
        this.listOfSSUser = value;
    }

}
