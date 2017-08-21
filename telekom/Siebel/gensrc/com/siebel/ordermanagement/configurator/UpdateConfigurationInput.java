
package com.siebel.ordermanagement.configurator;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.siebel.ordermanagement.configurator.cfginteractdata.ListOfData;
import com.siebel.ordermanagement.configurator.cfginteractrequest.ListOfRequest;


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
 *         &lt;element ref="{http://siebel.com/OrderManagement/Configurator/CfgInteractRequest}ListOfRequest"/>
 *         &lt;element ref="{http://siebel.com/OrderManagement/Configurator/CfgInteractData}ListOfData"/>
 *         &lt;element name="FinishConfigurationInFlag" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="RepriceInFlag" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SaveInstanceInFlag" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="VerifyInFlag" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ConflictAutoResolve" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "listOfRequest",
    "listOfData",
    "finishConfigurationInFlag",
    "repriceInFlag",
    "saveInstanceInFlag",
    "verifyInFlag",
    "conflictAutoResolve"
})
@XmlRootElement(name = "UpdateConfiguration_Input")
public class UpdateConfigurationInput
    implements Serializable
{

    @XmlElement(name = "ListOfRequest", namespace = "http://siebel.com/OrderManagement/Configurator/CfgInteractRequest", required = true)
    protected ListOfRequest listOfRequest;
    @XmlElement(name = "ListOfData", namespace = "http://siebel.com/OrderManagement/Configurator/CfgInteractData", required = true)
    protected ListOfData listOfData;
    @XmlElement(name = "FinishConfigurationInFlag", required = true)
    protected String finishConfigurationInFlag;
    @XmlElement(name = "RepriceInFlag", required = true)
    protected String repriceInFlag;
    @XmlElement(name = "SaveInstanceInFlag", required = true)
    protected String saveInstanceInFlag;
    @XmlElement(name = "VerifyInFlag", required = true)
    protected String verifyInFlag;
    @XmlElement(name = "ConflictAutoResolve", required = true)
    protected String conflictAutoResolve;

    /**
     * Gets the value of the listOfRequest property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfRequest }
     *     
     */
    public ListOfRequest getListOfRequest() {
        return listOfRequest;
    }

    /**
     * Sets the value of the listOfRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfRequest }
     *     
     */
    public void setListOfRequest(ListOfRequest value) {
        this.listOfRequest = value;
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
     * Gets the value of the finishConfigurationInFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFinishConfigurationInFlag() {
        return finishConfigurationInFlag;
    }

    /**
     * Sets the value of the finishConfigurationInFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFinishConfigurationInFlag(String value) {
        this.finishConfigurationInFlag = value;
    }

    /**
     * Gets the value of the repriceInFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRepriceInFlag() {
        return repriceInFlag;
    }

    /**
     * Sets the value of the repriceInFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRepriceInFlag(String value) {
        this.repriceInFlag = value;
    }

    /**
     * Gets the value of the saveInstanceInFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSaveInstanceInFlag() {
        return saveInstanceInFlag;
    }

    /**
     * Sets the value of the saveInstanceInFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSaveInstanceInFlag(String value) {
        this.saveInstanceInFlag = value;
    }

    /**
     * Gets the value of the verifyInFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVerifyInFlag() {
        return verifyInFlag;
    }

    /**
     * Sets the value of the verifyInFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVerifyInFlag(String value) {
        this.verifyInFlag = value;
    }

    /**
     * Gets the value of the conflictAutoResolve property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConflictAutoResolve() {
        return conflictAutoResolve;
    }

    /**
     * Sets the value of the conflictAutoResolve property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConflictAutoResolve(String value) {
        this.conflictAutoResolve = value;
    }

}
