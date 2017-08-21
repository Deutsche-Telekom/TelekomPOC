
package com.siebel.ordermanagement.order.details.data.data;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for OrderApprovalHistoryData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderApprovalHistoryData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Created" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Updated" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ConflictId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ModId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Action" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ActiveFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Comments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DueTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ItemId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ItemObjectId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PastDue" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Priority" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProtectOwnershipFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StartTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="TaskOwnerFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TaskOwnerFullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TaskOwnerId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TaskOwnerLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TaskOwnerLogin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="operation" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderApprovalHistoryData", propOrder = {
    "id",
    "created",
    "updated",
    "conflictId",
    "modId",
    "action",
    "activeFlag",
    "comments",
    "dueTime",
    "itemId",
    "itemObjectId",
    "pastDue",
    "priority",
    "protectOwnershipFlag",
    "startTime",
    "taskOwnerFirstName",
    "taskOwnerFullName",
    "taskOwnerId",
    "taskOwnerLastName",
    "taskOwnerLogin"
})
public class OrderApprovalHistoryData
    implements Serializable
{

    @XmlElement(name = "Id")
    protected String id;
    @XmlElement(name = "Created")
    protected XMLGregorianCalendar created;
    @XmlElement(name = "Updated")
    protected XMLGregorianCalendar updated;
    @XmlElement(name = "ConflictId")
    protected String conflictId;
    @XmlElement(name = "ModId")
    protected String modId;
    @XmlElement(name = "Action")
    protected String action;
    @XmlElement(name = "ActiveFlag")
    protected Boolean activeFlag;
    @XmlElement(name = "Comments")
    protected String comments;
    @XmlElement(name = "DueTime")
    protected XMLGregorianCalendar dueTime;
    @XmlElement(name = "ItemId")
    protected String itemId;
    @XmlElement(name = "ItemObjectId")
    protected String itemObjectId;
    @XmlElement(name = "PastDue")
    protected Boolean pastDue;
    @XmlElement(name = "Priority")
    protected String priority;
    @XmlElement(name = "ProtectOwnershipFlag")
    protected String protectOwnershipFlag;
    @XmlElement(name = "StartTime")
    protected XMLGregorianCalendar startTime;
    @XmlElement(name = "TaskOwnerFirstName")
    protected String taskOwnerFirstName;
    @XmlElement(name = "TaskOwnerFullName")
    protected String taskOwnerFullName;
    @XmlElement(name = "TaskOwnerId")
    protected String taskOwnerId;
    @XmlElement(name = "TaskOwnerLastName")
    protected String taskOwnerLastName;
    @XmlElement(name = "TaskOwnerLogin")
    protected String taskOwnerLogin;
    @XmlAttribute
    protected String operation;

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
     * Gets the value of the created property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreated() {
        return created;
    }

    /**
     * Sets the value of the created property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreated(XMLGregorianCalendar value) {
        this.created = value;
    }

    /**
     * Gets the value of the updated property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUpdated() {
        return updated;
    }

    /**
     * Sets the value of the updated property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUpdated(XMLGregorianCalendar value) {
        this.updated = value;
    }

    /**
     * Gets the value of the conflictId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConflictId() {
        return conflictId;
    }

    /**
     * Sets the value of the conflictId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConflictId(String value) {
        this.conflictId = value;
    }

    /**
     * Gets the value of the modId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModId() {
        return modId;
    }

    /**
     * Sets the value of the modId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModId(String value) {
        this.modId = value;
    }

    /**
     * Gets the value of the action property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAction() {
        return action;
    }

    /**
     * Sets the value of the action property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAction(String value) {
        this.action = value;
    }

    /**
     * Gets the value of the activeFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isActiveFlag() {
        return activeFlag;
    }

    /**
     * Sets the value of the activeFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setActiveFlag(Boolean value) {
        this.activeFlag = value;
    }

    /**
     * Gets the value of the comments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComments() {
        return comments;
    }

    /**
     * Sets the value of the comments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComments(String value) {
        this.comments = value;
    }

    /**
     * Gets the value of the dueTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDueTime() {
        return dueTime;
    }

    /**
     * Sets the value of the dueTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDueTime(XMLGregorianCalendar value) {
        this.dueTime = value;
    }

    /**
     * Gets the value of the itemId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemId() {
        return itemId;
    }

    /**
     * Sets the value of the itemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemId(String value) {
        this.itemId = value;
    }

    /**
     * Gets the value of the itemObjectId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemObjectId() {
        return itemObjectId;
    }

    /**
     * Sets the value of the itemObjectId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemObjectId(String value) {
        this.itemObjectId = value;
    }

    /**
     * Gets the value of the pastDue property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPastDue() {
        return pastDue;
    }

    /**
     * Sets the value of the pastDue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPastDue(Boolean value) {
        this.pastDue = value;
    }

    /**
     * Gets the value of the priority property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriority() {
        return priority;
    }

    /**
     * Sets the value of the priority property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriority(String value) {
        this.priority = value;
    }

    /**
     * Gets the value of the protectOwnershipFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProtectOwnershipFlag() {
        return protectOwnershipFlag;
    }

    /**
     * Sets the value of the protectOwnershipFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProtectOwnershipFlag(String value) {
        this.protectOwnershipFlag = value;
    }

    /**
     * Gets the value of the startTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartTime() {
        return startTime;
    }

    /**
     * Sets the value of the startTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartTime(XMLGregorianCalendar value) {
        this.startTime = value;
    }

    /**
     * Gets the value of the taskOwnerFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaskOwnerFirstName() {
        return taskOwnerFirstName;
    }

    /**
     * Sets the value of the taskOwnerFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaskOwnerFirstName(String value) {
        this.taskOwnerFirstName = value;
    }

    /**
     * Gets the value of the taskOwnerFullName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaskOwnerFullName() {
        return taskOwnerFullName;
    }

    /**
     * Sets the value of the taskOwnerFullName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaskOwnerFullName(String value) {
        this.taskOwnerFullName = value;
    }

    /**
     * Gets the value of the taskOwnerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaskOwnerId() {
        return taskOwnerId;
    }

    /**
     * Sets the value of the taskOwnerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaskOwnerId(String value) {
        this.taskOwnerId = value;
    }

    /**
     * Gets the value of the taskOwnerLastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaskOwnerLastName() {
        return taskOwnerLastName;
    }

    /**
     * Sets the value of the taskOwnerLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaskOwnerLastName(String value) {
        this.taskOwnerLastName = value;
    }

    /**
     * Gets the value of the taskOwnerLogin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaskOwnerLogin() {
        return taskOwnerLogin;
    }

    /**
     * Sets the value of the taskOwnerLogin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaskOwnerLogin(String value) {
        this.taskOwnerLogin = value;
    }

    /**
     * Gets the value of the operation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperation() {
        return operation;
    }

    /**
     * Sets the value of the operation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperation(String value) {
        this.operation = value;
    }

}
