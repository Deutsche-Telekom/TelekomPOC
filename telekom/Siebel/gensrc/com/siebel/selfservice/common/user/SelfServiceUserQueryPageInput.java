
package com.siebel.selfservice.common.user;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.siebel.selfservice.common.user.query.ListOfSSUserQuery;


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
 *         &lt;element name="NamedSearchSpec" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{http://www.siebel.com/SelfService/Common/User/Query}ListOfSSUser" minOccurs="0"/>
 *         &lt;element name="ExecutionMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LOVLanguageMode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ViewMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PickListName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "namedSearchSpec",
    "listOfSSUser",
    "executionMode",
    "lovLanguageMode",
    "viewMode",
    "pickListName"
})
@XmlRootElement(name = "SelfServiceUserQueryPage_Input")
public class SelfServiceUserQueryPageInput
    implements Serializable
{

    @XmlElement(name = "NamedSearchSpec")
    protected String namedSearchSpec;
    @XmlElement(name = "ListOfSSUser", namespace = "http://www.siebel.com/SelfService/Common/User/Query")
    protected ListOfSSUserQuery listOfSSUser;
    @XmlElement(name = "ExecutionMode")
    protected String executionMode;
    @XmlElement(name = "LOVLanguageMode", required = true)
    protected String lovLanguageMode;
    @XmlElement(name = "ViewMode")
    protected String viewMode;
    @XmlElement(name = "PickListName")
    protected String pickListName;

    /**
     * Gets the value of the namedSearchSpec property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNamedSearchSpec() {
        return namedSearchSpec;
    }

    /**
     * Sets the value of the namedSearchSpec property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNamedSearchSpec(String value) {
        this.namedSearchSpec = value;
    }

    /**
     * Gets the value of the listOfSSUser property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfSSUserQuery }
     *     
     */
    public ListOfSSUserQuery getListOfSSUser() {
        return listOfSSUser;
    }

    /**
     * Sets the value of the listOfSSUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfSSUserQuery }
     *     
     */
    public void setListOfSSUser(ListOfSSUserQuery value) {
        this.listOfSSUser = value;
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

    /**
     * Gets the value of the pickListName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPickListName() {
        return pickListName;
    }

    /**
     * Sets the value of the pickListName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPickListName(String value) {
        this.pickListName = value;
    }

}
