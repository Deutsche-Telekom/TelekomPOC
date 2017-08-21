
package com.siebel.ordermanagement.quote.quoting;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.siebel.ordermanagement.quote.data.ListOfQuote;


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
 *         &lt;element name="CC_spcViolated_spcFlag" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Error_spcCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Error_spcMessage" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element ref="{http://siebel.com/OrderManagement/Quote/Data}ListOfQuote"/>
 *         &lt;element name="Return_spcMessage_spc-_spcPromotion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Wait_spcFlag" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "ccSpcViolatedSpcFlag",
    "errorSpcCode",
    "errorSpcMessage",
    "listOfQuote",
    "returnSpcMessageSpcSpcPromotion",
    "waitSpcFlag"
})
@XmlRootElement(name = "ExecuteQuoting_Output")
public class ExecuteQuotingOutput
    implements Serializable
{

    @XmlElement(name = "CC_spcViolated_spcFlag", required = true)
    protected String ccSpcViolatedSpcFlag;
    @XmlElement(name = "Error_spcCode", required = true)
    protected String errorSpcCode;
    @XmlElement(name = "Error_spcMessage", required = true)
    protected String errorSpcMessage;
    @XmlElement(name = "ListOfQuote", namespace = "http://siebel.com/OrderManagement/Quote/Data", required = true)
    protected ListOfQuote listOfQuote;
    @XmlElement(name = "Return_spcMessage_spc-_spcPromotion", required = true)
    protected String returnSpcMessageSpcSpcPromotion;
    @XmlElement(name = "Wait_spcFlag", required = true)
    protected String waitSpcFlag;

    /**
     * Gets the value of the ccSpcViolatedSpcFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCCSpcViolatedSpcFlag() {
        return ccSpcViolatedSpcFlag;
    }

    /**
     * Sets the value of the ccSpcViolatedSpcFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCCSpcViolatedSpcFlag(String value) {
        this.ccSpcViolatedSpcFlag = value;
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
     * Gets the value of the listOfQuote property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfQuote }
     *     
     */
    public ListOfQuote getListOfQuote() {
        return listOfQuote;
    }

    /**
     * Sets the value of the listOfQuote property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfQuote }
     *     
     */
    public void setListOfQuote(ListOfQuote value) {
        this.listOfQuote = value;
    }

    /**
     * Gets the value of the returnSpcMessageSpcSpcPromotion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnSpcMessageSpcSpcPromotion() {
        return returnSpcMessageSpcSpcPromotion;
    }

    /**
     * Sets the value of the returnSpcMessageSpcSpcPromotion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnSpcMessageSpcSpcPromotion(String value) {
        this.returnSpcMessageSpcSpcPromotion = value;
    }

    /**
     * Gets the value of the waitSpcFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWaitSpcFlag() {
        return waitSpcFlag;
    }

    /**
     * Sets the value of the waitSpcFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWaitSpcFlag(String value) {
        this.waitSpcFlag = value;
    }

}
