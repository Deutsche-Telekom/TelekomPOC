
package com.siebel.ordermanagement.configurator.cfginteractstatus;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Messages complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Messages">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MessageType" type="{http://siebel.com/OrderManagement/Configurator/CfgInteractStatus}MessageType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Messages", propOrder = {
    "messageType"
})
public class Messages
    implements Serializable
{

    @XmlElement(name = "MessageType")
    protected List<MessageType> messageType;

    /**
     * Gets the value of the messageType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the messageType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMessageType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MessageType }
     * 
     * 
     */
    public List<MessageType> getMessageType() {
        if (messageType == null) {
            messageType = new ArrayList<MessageType>();
        }
        return this.messageType;
    }

}
