
package com.siebel.ordermanagement.configurator.webchannelobjgroupitems;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UIOption complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UIOption">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Sequence" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProductTheme" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrigId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BaseTheme" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UIOptionDecoration" type="{http://siebel.com/OrderManagement/Configurator/WebChannelObjGroupItems}UIOptionDecoration" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Responsibility" type="{http://siebel.com/OrderManagement/Configurator/WebChannelObjGroupItems}Responsibility" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Group" type="{http://siebel.com/OrderManagement/Configurator/WebChannelObjGroupItems}Group" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UIOption", propOrder = {
    "type",
    "sequence",
    "productTheme",
    "origId",
    "name",
    "id",
    "baseTheme",
    "uiOptionDecoration",
    "responsibility",
    "group"
})
public class UIOption
    implements Serializable
{

    @XmlElement(name = "Type")
    protected String type;
    @XmlElement(name = "Sequence")
    protected String sequence;
    @XmlElement(name = "ProductTheme")
    protected String productTheme;
    @XmlElement(name = "OrigId")
    protected String origId;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Id")
    protected String id;
    @XmlElement(name = "BaseTheme")
    protected String baseTheme;
    @XmlElement(name = "UIOptionDecoration")
    protected List<UIOptionDecoration> uiOptionDecoration;
    @XmlElement(name = "Responsibility")
    protected List<Responsibility> responsibility;
    @XmlElement(name = "Group")
    protected List<Group> group;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the sequence property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSequence() {
        return sequence;
    }

    /**
     * Sets the value of the sequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSequence(String value) {
        this.sequence = value;
    }

    /**
     * Gets the value of the productTheme property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductTheme() {
        return productTheme;
    }

    /**
     * Sets the value of the productTheme property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductTheme(String value) {
        this.productTheme = value;
    }

    /**
     * Gets the value of the origId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrigId() {
        return origId;
    }

    /**
     * Sets the value of the origId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrigId(String value) {
        this.origId = value;
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
     * Gets the value of the baseTheme property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseTheme() {
        return baseTheme;
    }

    /**
     * Sets the value of the baseTheme property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseTheme(String value) {
        this.baseTheme = value;
    }

    /**
     * Gets the value of the uiOptionDecoration property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the uiOptionDecoration property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUIOptionDecoration().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UIOptionDecoration }
     * 
     * 
     */
    public List<UIOptionDecoration> getUIOptionDecoration() {
        if (uiOptionDecoration == null) {
            uiOptionDecoration = new ArrayList<UIOptionDecoration>();
        }
        return this.uiOptionDecoration;
    }

    /**
     * Gets the value of the responsibility property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the responsibility property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResponsibility().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Responsibility }
     * 
     * 
     */
    public List<Responsibility> getResponsibility() {
        if (responsibility == null) {
            responsibility = new ArrayList<Responsibility>();
        }
        return this.responsibility;
    }

    /**
     * Gets the value of the group property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the group property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Group }
     * 
     * 
     */
    public List<Group> getGroup() {
        if (group == null) {
            group = new ArrayList<Group>();
        }
        return this.group;
    }

}
