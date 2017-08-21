
package com.siebel.selfservice.common.user.data;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListOfSSUserTopElmtData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListOfSSUserTopElmtData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ListOfSSUser" type="{http://www.siebel.com/SelfService/Common/User/Data}ListOfSSUserData"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfSSUserTopElmtData", propOrder = {
    "listOfSSUser"
})
public class ListOfSSUserTopElmtData
    implements Serializable
{

    @XmlElement(name = "ListOfSSUser", required = true)
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
