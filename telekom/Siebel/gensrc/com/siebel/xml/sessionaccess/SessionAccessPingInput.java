
package com.siebel.xml.sessionaccess;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="MsgIn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "msgIn"
})
@XmlRootElement(name = "SessionAccessPing_Input")
public class SessionAccessPingInput
    implements Serializable
{

    @XmlElement(name = "MsgIn")
    protected String msgIn;

    /**
     * Gets the value of the msgIn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgIn() {
        return msgIn;
    }

    /**
     * Sets the value of the msgIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsgIn(String value) {
        this.msgIn = value;
    }

}
