
package com.siebel.selfservice.common.user.id;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UserId complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UserId">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ModId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ListOfSSUserResponsibility" type="{http://www.siebel.com/SelfService/Common/User/Id}ListOfSSUserResponsibilityId" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserId", propOrder = {
    "id",
    "modId",
    "listOfSSUserResponsibility"
})
public class UserId
    implements Serializable
{

    @XmlElement(name = "Id")
    protected String id;
    @XmlElement(name = "ModId")
    protected String modId;
    @XmlElement(name = "ListOfSSUserResponsibility")
    protected ListOfSSUserResponsibilityId listOfSSUserResponsibility;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the modId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModId() {
        return modId;
    }

    /**
     * Sets the value of the modId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModId(String value) {
        this.modId = value;
    }

    /**
     * Gets the value of the listOfSSUserResponsibility property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfSSUserResponsibilityId }
     *     
     */
    public ListOfSSUserResponsibilityId getListOfSSUserResponsibility() {
        return listOfSSUserResponsibility;
    }

    /**
     * Sets the value of the listOfSSUserResponsibility property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfSSUserResponsibilityId }
     *     
     */
    public void setListOfSSUserResponsibility(ListOfSSUserResponsibilityId value) {
        this.listOfSSUserResponsibility = value;
    }

}
