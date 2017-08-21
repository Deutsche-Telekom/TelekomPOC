
package com.siebel.ordermanagement.configurator;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.siebel.ordermanagement.configurator.cfginteractdata.ListOfData;
import com.siebel.ordermanagement.configurator.cfginteractstatus.ListOfStatus;


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
 *         &lt;element name="Error_spcCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Error_spcMessage" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FinishConfigurationOutFlag" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element ref="{http://siebel.com/OrderManagement/Configurator/CfgInteractData}ListOfData"/>
 *         &lt;element ref="{http://siebel.com/OrderManagement/Configurator/CfgInteractStatus}ListOfStatus"/>
 *         &lt;element name="RepriceOutFlag" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SaveInstanceOutFlag" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="VerifyOutFlag" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "errorSpcCode",
    "errorSpcMessage",
    "finishConfigurationOutFlag",
    "listOfData",
    "listOfStatus",
    "repriceOutFlag",
    "saveInstanceOutFlag",
    "verifyOutFlag"
})
@XmlRootElement(name = "UpdateConfiguration_Output")
public class UpdateConfigurationOutput
    implements Serializable
{

    @XmlElement(name = "Error_spcCode", required = true)
    protected String errorSpcCode;
    @XmlElement(name = "Error_spcMessage", required = true)
    protected String errorSpcMessage;
    @XmlElement(name = "FinishConfigurationOutFlag", required = true)
    protected String finishConfigurationOutFlag;
    @XmlElement(name = "ListOfData", namespace = "http://siebel.com/OrderManagement/Configurator/CfgInteractData", required = true)
    protected ListOfData listOfData;
    @XmlElement(name = "ListOfStatus", namespace = "http://siebel.com/OrderManagement/Configurator/CfgInteractStatus", required = true)
    protected ListOfStatus listOfStatus;
    @XmlElement(name = "RepriceOutFlag", required = true)
    protected String repriceOutFlag;
    @XmlElement(name = "SaveInstanceOutFlag", required = true)
    protected String saveInstanceOutFlag;
    @XmlElement(name = "VerifyOutFlag", required = true)
    protected String verifyOutFlag;

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
     * Gets the value of the finishConfigurationOutFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFinishConfigurationOutFlag() {
        return finishConfigurationOutFlag;
    }

    /**
     * Sets the value of the finishConfigurationOutFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFinishConfigurationOutFlag(String value) {
        this.finishConfigurationOutFlag = value;
    }

    /**
     * Gets the value of the listOfData property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfData }
     *     
     */
    public ListOfData getListOfData() {
        return listOfData;
    }

    /**
     * Sets the value of the listOfData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfData }
     *     
     */
    public void setListOfData(ListOfData value) {
        this.listOfData = value;
    }

    /**
     * Gets the value of the listOfStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfStatus }
     *     
     */
    public ListOfStatus getListOfStatus() {
        return listOfStatus;
    }

    /**
     * Sets the value of the listOfStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfStatus }
     *     
     */
    public void setListOfStatus(ListOfStatus value) {
        this.listOfStatus = value;
    }

    /**
     * Gets the value of the repriceOutFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRepriceOutFlag() {
        return repriceOutFlag;
    }

    /**
     * Sets the value of the repriceOutFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRepriceOutFlag(String value) {
        this.repriceOutFlag = value;
    }

    /**
     * Gets the value of the saveInstanceOutFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSaveInstanceOutFlag() {
        return saveInstanceOutFlag;
    }

    /**
     * Sets the value of the saveInstanceOutFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSaveInstanceOutFlag(String value) {
        this.saveInstanceOutFlag = value;
    }

    /**
     * Gets the value of the verifyOutFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVerifyOutFlag() {
        return verifyOutFlag;
    }

    /**
     * Sets the value of the verifyOutFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVerifyOutFlag(String value) {
        this.verifyOutFlag = value;
    }

}
