
package com.siebel.ordermanagement.configurator.webchannelobjgroupitems;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Group complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Group">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Sequence" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GroupTheme" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DisplayName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GroupItem" type="{http://siebel.com/OrderManagement/Configurator/WebChannelObjGroupItems}GroupItem" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="GroupDecoration" type="{http://siebel.com/OrderManagement/Configurator/WebChannelObjGroupItems}GroupDecoration" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Group", propOrder = {
    "sequence",
    "name",
    "id",
    "groupTheme",
    "displayName",
    "description",
    "groupItem",
    "groupDecoration"
})
public class Group
    implements Serializable
{

    @XmlElement(name = "Sequence")
    protected String sequence;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Id")
    protected String id;
    @XmlElement(name = "GroupTheme")
    protected String groupTheme;
    @XmlElement(name = "DisplayName")
    protected String displayName;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "GroupItem")
    protected List<GroupItem> groupItem;
    @XmlElement(name = "GroupDecoration")
    protected List<GroupDecoration> groupDecoration;

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
     * Gets the value of the groupTheme property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupTheme() {
        return groupTheme;
    }

    /**
     * Sets the value of the groupTheme property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupTheme(String value) {
        this.groupTheme = value;
    }

    /**
     * Gets the value of the displayName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Sets the value of the displayName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayName(String value) {
        this.displayName = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the groupItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the groupItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGroupItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GroupItem }
     * 
     * 
     */
    public List<GroupItem> getGroupItem() {
        if (groupItem == null) {
            groupItem = new ArrayList<GroupItem>();
        }
        return this.groupItem;
    }

    /**
     * Gets the value of the groupDecoration property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the groupDecoration property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGroupDecoration().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GroupDecoration }
     * 
     * 
     */
    public List<GroupDecoration> getGroupDecoration() {
        if (groupDecoration == null) {
            groupDecoration = new ArrayList<GroupDecoration>();
        }
        return this.groupDecoration;
    }

}
