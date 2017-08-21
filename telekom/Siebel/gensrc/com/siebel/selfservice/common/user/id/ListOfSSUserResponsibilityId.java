
package com.siebel.selfservice.common.user.id;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListOfSSUserResponsibilityId complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListOfSSUserResponsibilityId">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SSUserResponsibility" type="{http://www.siebel.com/SelfService/Common/User/Id}SSUserResponsibilityId" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfSSUserResponsibilityId", propOrder = {
    "ssUserResponsibility"
})
public class ListOfSSUserResponsibilityId
    implements Serializable
{

    @XmlElement(name = "SSUserResponsibility")
    protected List<SSUserResponsibilityId> ssUserResponsibility;

    /**
     * Gets the value of the ssUserResponsibility property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ssUserResponsibility property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSSUserResponsibility().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SSUserResponsibilityId }
     * 
     * 
     */
    public List<SSUserResponsibilityId> getSSUserResponsibility() {
        if (ssUserResponsibility == null) {
            ssUserResponsibility = new ArrayList<SSUserResponsibilityId>();
        }
        return this.ssUserResponsibility;
    }

}
