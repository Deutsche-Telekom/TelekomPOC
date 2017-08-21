
package com.siebel.ordermanagement.abo;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.siebel.ordermanagement.order.data.ListOfOrder;


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
 *         &lt;element name="ActiveOrderId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Error_spcCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Error_spcMessage" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element ref="{http://siebel.com/OrderManagement/Order/Data}ListOfOrder"/>
 *         &lt;element name="_XML_spcmessage" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "activeOrderId",
    "errorSpcCode",
    "errorSpcMessage",
    "listOfOrder",
    "xmlSpcmessage"
})
@XmlRootElement(name = "AutoOrder_Output")
public class AutoOrderOutput
    implements Serializable
{

    @XmlElement(name = "ActiveOrderId", required = true)
    protected String activeOrderId;
    @XmlElement(name = "Error_spcCode", required = true)
    protected String errorSpcCode;
    @XmlElement(name = "Error_spcMessage", required = true)
    protected String errorSpcMessage;
    @XmlElement(name = "ListOfOrder", namespace = "http://siebel.com/OrderManagement/Order/Data", required = true)
    protected ListOfOrder listOfOrder;
    @XmlElement(name = "_XML_spcmessage", required = true)
    protected String xmlSpcmessage;

    /**
     * Gets the value of the activeOrderId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActiveOrderId() {
        return activeOrderId;
    }

    /**
     * Sets the value of the activeOrderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActiveOrderId(String value) {
        this.activeOrderId = value;
    }

    /**
     * Gets the value of the errorSpcCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorSpcCode() {
        return errorSpcCode;
    }

    /**
     * Sets the value of the errorSpcCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorSpcCode(String value) {
        this.errorSpcCode = value;
    }

    /**
     * Gets the value of the errorSpcMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorSpcMessage() {
        return errorSpcMessage;
    }

    /**
     * Sets the value of the errorSpcMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorSpcMessage(String value) {
        this.errorSpcMessage = value;
    }

    /**
     * Gets the value of the listOfOrder property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfOrder }
     *     
     */
    public ListOfOrder getListOfOrder() {
        return listOfOrder;
    }

    /**
     * Sets the value of the listOfOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfOrder }
     *     
     */
    public void setListOfOrder(ListOfOrder value) {
        this.listOfOrder = value;
    }

    /**
     * Gets the value of the xmlSpcmessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXMLSpcmessage() {
        return xmlSpcmessage;
    }

    /**
     * Sets the value of the xmlSpcmessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXMLSpcmessage(String value) {
        this.xmlSpcmessage = value;
    }

}
