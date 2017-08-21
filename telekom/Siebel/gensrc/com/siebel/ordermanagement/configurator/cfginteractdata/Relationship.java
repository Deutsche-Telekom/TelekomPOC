
package com.siebel.ordermanagement.configurator.cfginteractdata;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Relationship complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Relationship">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RequestType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HasGenericsFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DomainItem" type="{http://siebel.com/OrderManagement/Configurator/CfgInteractData}DomainItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Relationship", propOrder = {
    "requestType",
    "name",
    "id",
    "hasGenericsFlag",
    "domainItem"
})
public class Relationship
    implements Serializable
{

    @XmlElement(name = "RequestType")
    protected String requestType;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Id")
    protected String id;
    @XmlElement(name = "HasGenericsFlag")
    protected String hasGenericsFlag;
    @XmlElement(name = "DomainItem")
    protected List<DomainItem> domainItem;

    /**
     * Gets the value of the requestType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestType() {
        return requestType;
    }

    /**
     * Sets the value of the requestType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestType(String value) {
        this.requestType = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the hasGenericsFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHasGenericsFlag() {
        return hasGenericsFlag;
    }

    /**
     * Sets the value of the hasGenericsFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHasGenericsFlag(String value) {
        this.hasGenericsFlag = value;
    }

    /**
     * Gets the value of the domainItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the domainItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDomainItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DomainItem }
     * 
     * 
     */
    public List<DomainItem> getDomainItem() {
        if (domainItem == null) {
            domainItem = new ArrayList<DomainItem>();
        }
        return this.domainItem;
    }

}
