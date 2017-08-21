
package com.siebel.selfservice.common.contact;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.siebel.selfservice.common.contact.data.ListOfSSContactData;


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
 *         &lt;element ref="{http://www.siebel.com/SelfService/Common/Contact/Data}ListOfSSContact"/>
 *         &lt;element name="ExecutionMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LOVLanguageMode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ViewMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "listOfSSContact",
    "executionMode",
    "lovLanguageMode",
    "viewMode"
})
@XmlRootElement(name = "SelfServiceContactExecute_Input")
public class SelfServiceContactExecuteInput
    implements Serializable
{

    @XmlElement(name = "ListOfSSContact", namespace = "http://www.siebel.com/SelfService/Common/Contact/Data", required = true)
    protected ListOfSSContactData listOfSSContact;
    @XmlElement(name = "ExecutionMode")
    protected String executionMode;
    @XmlElement(name = "LOVLanguageMode", required = true)
    protected String lovLanguageMode;
    @XmlElement(name = "ViewMode")
    protected String viewMode;

    /**
     * Gets the value of the listOfSSContact property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfSSContactData }
     *     
     */
    public ListOfSSContactData getListOfSSContact() {
        return listOfSSContact;
    }

    /**
     * Sets the value of the listOfSSContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfSSContactData }
     *     
     */
    public void setListOfSSContact(ListOfSSContactData value) {
        this.listOfSSContact = value;
    }

    /**
     * Gets the value of the executionMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExecutionMode() {
        return executionMode;
    }

    /**
     * Sets the value of the executionMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExecutionMode(String value) {
        this.executionMode = value;
    }

    /**
     * Gets the value of the lovLanguageMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLOVLanguageMode() {
        return lovLanguageMode;
    }

    /**
     * Sets the value of the lovLanguageMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLOVLanguageMode(String value) {
        this.lovLanguageMode = value;
    }

    /**
     * Gets the value of the viewMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getViewMode() {
        return viewMode;
    }

    /**
     * Sets the value of the viewMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setViewMode(String value) {
        this.viewMode = value;
    }

}
