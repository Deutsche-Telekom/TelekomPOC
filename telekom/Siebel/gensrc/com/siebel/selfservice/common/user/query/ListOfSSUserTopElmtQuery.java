
package com.siebel.selfservice.common.user.query;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListOfSSUserTopElmtQuery complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListOfSSUserTopElmtQuery">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ListOfSSUser" type="{http://www.siebel.com/SelfService/Common/User/Query}ListOfSSUserQuery" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfSSUserTopElmtQuery", propOrder = {
    "listOfSSUser"
})
public class ListOfSSUserTopElmtQuery
    implements Serializable
{

    @XmlElement(name = "ListOfSSUser")
    protected ListOfSSUserQuery listOfSSUser;

    /**
     * Gets the value of the listOfSSUser property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfSSUserQuery }
     *     
     */
    public ListOfSSUserQuery getListOfSSUser() {
        return listOfSSUser;
    }

    /**
     * Sets the value of the listOfSSUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfSSUserQuery }
     *     
     */
    public void setListOfSSUser(ListOfSSUserQuery value) {
        this.listOfSSUser = value;
    }

}
