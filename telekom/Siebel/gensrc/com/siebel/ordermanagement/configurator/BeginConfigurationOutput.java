
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
 *         &lt;element ref="{http://siebel.com/OrderManagement/Configurator/CfgInteractData}ListOfData"/>
 *         &lt;element name="RootId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="RootIntegrationId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element ref="{http://siebel.com/OrderManagement/Configurator/CfgInteractStatus}ListOfStatus"/>
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
    "listOfData",
    "rootId",
    "rootIntegrationId",
    "listOfStatus"
})
@XmlRootElement(name = "BeginConfiguration_Output")
public class BeginConfigurationOutput
    implements Serializable
{

    @XmlElement(name = "Error_spcCode", required = true)
    protected String errorSpcCode;
    @XmlElement(name = "Error_spcMessage", required = true)
    protected String errorSpcMessage;
    @XmlElement(name = "ListOfData", namespace = "http://siebel.com/OrderManagement/Configurator/CfgInteractData", required = true)
    protected ListOfData listOfData;
    @XmlElement(name = "RootId", required = true)
    protected String rootId;
    @XmlElement(name = "RootIntegrationId", required = true)
    protected String rootIntegrationId;
    @XmlElement(name = "ListOfStatus", namespace = "http://siebel.com/OrderManagement/Configurator/CfgInteractStatus", required = true)
    protected ListOfStatus listOfStatus;

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
     * Gets the value of the rootId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRootId() {
        return rootId;
    }

    /**
     * Sets the value of the rootId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRootId(String value) {
        this.rootId = value;
    }

    /**
     * Gets the value of the rootIntegrationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRootIntegrationId() {
        return rootIntegrationId;
    }

    /**
     * Sets the value of the rootIntegrationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRootIntegrationId(String value) {
        this.rootIntegrationId = value;
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

}
