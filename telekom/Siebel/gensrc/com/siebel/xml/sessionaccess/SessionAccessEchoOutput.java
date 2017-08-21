
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
 *         &lt;element name="MsgOut" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "msgOut"
})
@XmlRootElement(name = "SessionAccessEcho_Output")
public class SessionAccessEchoOutput
    implements Serializable
{

    @XmlElement(name = "MsgOut")
    protected String msgOut;

    /**
     * Gets the value of the msgOut property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgOut() {
        return msgOut;
    }

    /**
     * Sets the value of the msgOut property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsgOut(String value) {
        this.msgOut = value;
    }

}
