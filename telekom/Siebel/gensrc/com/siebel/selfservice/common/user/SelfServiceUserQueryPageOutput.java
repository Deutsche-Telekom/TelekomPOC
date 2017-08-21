
package com.siebel.selfservice.common.user;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.siebel.selfservice.common.user.data.ListOfSSUserData;


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
 *         &lt;element ref="{http://www.siebel.com/SelfService/Common/User/Data}ListOfSSUser"/>
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
@XmlRootElement(name = "SelfServiceUserQueryPage_Output")
public class SelfServiceUserQueryPageOutput
    implements Serializable
{

    @XmlElement(name = "ListOfSSUser", namespace = "http://www.siebel.com/SelfService/Common/User/Data", required = true)
    protected ListOfSSUserData listOfSSUser;

    /**
     * Gets the value of the listOfSSUser property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfSSUserData }
     *     
     */
    public ListOfSSUserData getListOfSSUser() {
        return listOfSSUser;
    }

    /**
     * Sets the value of the listOfSSUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfSSUserData }
     *     
     */
    public void setListOfSSUser(ListOfSSUserData value) {
        this.listOfSSUser = value;
    }

}
