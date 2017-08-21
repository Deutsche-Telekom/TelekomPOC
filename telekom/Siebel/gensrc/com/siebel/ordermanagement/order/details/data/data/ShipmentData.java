
package com.siebel.ordermanagement.order.details.data.data;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ShipmentData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShipmentData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Created" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Updated" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ConflictId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ModId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AssignedTo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AssignedToID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Carrier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CarrierPriority" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Condition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FreightCost" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Incoterms" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Instructions" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InsuranceCost" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="InsuredValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="IntegrationId2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NoofContainers" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="OrderId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="POD" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PrimaryOrderId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReceiveDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ReceiveInvLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReceiveLocationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReceiveUnknownFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ReceivedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReceivedContact" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ScheduledDeliveryDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ScheduledPickUpDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ShipDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ShipDueDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ShipInvLocId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShipInvLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShipInvLocationIntegrationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShipTo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShipToAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShipToAccountId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShipToAccountIntegrationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShipToAccountLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShipToAddress2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShipToAddressIntegrationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShipToCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShipToCityState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShipToCityStateZip" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShipToContactId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShipToContactIntegrationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShipToCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShipToFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShipToID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShipToLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShipToState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShipToZip" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShipVia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShipmentNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShippedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShippedContact" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StatusAsOfDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="TransitToAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TransitToAccountId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TransitToAccountIntegrationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TransitToAccountLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TransitToAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TransitToAddressId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TransitToAddressIntegrationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TransitToContactId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TransitToContactIntegrationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TransitToFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TransitToLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UOMFreight" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UOMInsuranceCost" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UOMInsuranceValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UOMWeight" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UnknownOrderMatch" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UnknownOrderNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UnknownOrdertype" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WaybillNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Weight" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ListOfShipmentItem" type="{http://siebel.com/OrderManagement/Order/Details/Data/Data}ListOfShipmentItemData" minOccurs="0"/>
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
@XmlType(name = "ShipmentData", propOrder = {
    "id",
    "created",
    "updated",
    "conflictId",
    "modId",
    "assignedTo",
    "assignedToID",
    "carrier",
    "carrierPriority",
    "condition",
    "freightCost",
    "incoterms",
    "instructions",
    "insuranceCost",
    "insuredValue",
    "integrationId2",
    "noofContainers",
    "orderId",
    "pod",
    "primaryOrderId",
    "receiveDate",
    "receiveInvLocation",
    "receiveLocationId",
    "receiveUnknownFlag",
    "receivedBy",
    "receivedContact",
    "scheduledDeliveryDate",
    "scheduledPickUpDate",
    "shipDate",
    "shipDueDate",
    "shipInvLocId",
    "shipInvLocation",
    "shipInvLocationIntegrationId",
    "shipTo",
    "shipToAccount",
    "shipToAccountId",
    "shipToAccountIntegrationId",
    "shipToAccountLocation",
    "shipToAddress2",
    "shipToAddressIntegrationId",
    "shipToCity",
    "shipToCityState",
    "shipToCityStateZip",
    "shipToContactId",
    "shipToContactIntegrationId",
    "shipToCountry",
    "shipToFirstName",
    "shipToID",
    "shipToLastName",
    "shipToState",
    "shipToZip",
    "shipVia",
    "shipmentNumber",
    "shippedBy",
    "shippedContact",
    "status",
    "statusAsOfDate",
    "transitToAccount",
    "transitToAccountId",
    "transitToAccountIntegrationId",
    "transitToAccountLocation",
    "transitToAddress",
    "transitToAddressId",
    "transitToAddressIntegrationId",
    "transitToContactId",
    "transitToContactIntegrationId",
    "transitToFirstName",
    "transitToLastName",
    "uomFreight",
    "uomInsuranceCost",
    "uomInsuranceValue",
    "uomWeight",
    "unknownOrderMatch",
    "unknownOrderNum",
    "unknownOrdertype",
    "waybillNumber",
    "weight",
    "listOfShipmentItem"
})
public class ShipmentData
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
    @XmlElement(name = "AssignedTo")
    protected String assignedTo;
    @XmlElement(name = "AssignedToID")
    protected String assignedToID;
    @XmlElement(name = "Carrier")
    protected String carrier;
    @XmlElement(name = "CarrierPriority")
    protected String carrierPriority;
    @XmlElement(name = "Condition")
    protected String condition;
    @XmlElement(name = "FreightCost")
    protected BigDecimal freightCost;
    @XmlElement(name = "Incoterms")
    protected String incoterms;
    @XmlElement(name = "Instructions")
    protected String instructions;
    @XmlElement(name = "InsuranceCost")
    protected BigDecimal insuranceCost;
    @XmlElement(name = "InsuredValue")
    protected BigDecimal insuredValue;
    @XmlElement(name = "IntegrationId2")
    protected String integrationId2;
    @XmlElement(name = "NoofContainers")
    protected Integer noofContainers;
    @XmlElement(name = "OrderId")
    protected String orderId;
    @XmlElement(name = "POD")
    protected Boolean pod;
    @XmlElement(name = "PrimaryOrderId")
    protected String primaryOrderId;
    @XmlElement(name = "ReceiveDate")
    protected XMLGregorianCalendar receiveDate;
    @XmlElement(name = "ReceiveInvLocation")
    protected String receiveInvLocation;
    @XmlElement(name = "ReceiveLocationId")
    protected String receiveLocationId;
    @XmlElement(name = "ReceiveUnknownFlag")
    protected Boolean receiveUnknownFlag;
    @XmlElement(name = "ReceivedBy")
    protected String receivedBy;
    @XmlElement(name = "ReceivedContact")
    protected String receivedContact;
    @XmlElement(name = "ScheduledDeliveryDate")
    protected XMLGregorianCalendar scheduledDeliveryDate;
    @XmlElement(name = "ScheduledPickUpDate")
    protected XMLGregorianCalendar scheduledPickUpDate;
    @XmlElement(name = "ShipDate")
    protected XMLGregorianCalendar shipDate;
    @XmlElement(name = "ShipDueDate")
    protected XMLGregorianCalendar shipDueDate;
    @XmlElement(name = "ShipInvLocId")
    protected String shipInvLocId;
    @XmlElement(name = "ShipInvLocation")
    protected String shipInvLocation;
    @XmlElement(name = "ShipInvLocationIntegrationId")
    protected String shipInvLocationIntegrationId;
    @XmlElement(name = "ShipTo")
    protected String shipTo;
    @XmlElement(name = "ShipToAccount")
    protected String shipToAccount;
    @XmlElement(name = "ShipToAccountId")
    protected String shipToAccountId;
    @XmlElement(name = "ShipToAccountIntegrationId")
    protected String shipToAccountIntegrationId;
    @XmlElement(name = "ShipToAccountLocation")
    protected String shipToAccountLocation;
    @XmlElement(name = "ShipToAddress2")
    protected String shipToAddress2;
    @XmlElement(name = "ShipToAddressIntegrationId")
    protected String shipToAddressIntegrationId;
    @XmlElement(name = "ShipToCity")
    protected String shipToCity;
    @XmlElement(name = "ShipToCityState")
    protected String shipToCityState;
    @XmlElement(name = "ShipToCityStateZip")
    protected String shipToCityStateZip;
    @XmlElement(name = "ShipToContactId")
    protected String shipToContactId;
    @XmlElement(name = "ShipToContactIntegrationId")
    protected String shipToContactIntegrationId;
    @XmlElement(name = "ShipToCountry")
    protected String shipToCountry;
    @XmlElement(name = "ShipToFirstName")
    protected String shipToFirstName;
    @XmlElement(name = "ShipToID")
    protected String shipToID;
    @XmlElement(name = "ShipToLastName")
    protected String shipToLastName;
    @XmlElement(name = "ShipToState")
    protected String shipToState;
    @XmlElement(name = "ShipToZip")
    protected String shipToZip;
    @XmlElement(name = "ShipVia")
    protected String shipVia;
    @XmlElement(name = "ShipmentNumber")
    protected String shipmentNumber;
    @XmlElement(name = "ShippedBy")
    protected String shippedBy;
    @XmlElement(name = "ShippedContact")
    protected String shippedContact;
    @XmlElement(name = "Status")
    protected String status;
    @XmlElement(name = "StatusAsOfDate")
    protected XMLGregorianCalendar statusAsOfDate;
    @XmlElement(name = "TransitToAccount")
    protected String transitToAccount;
    @XmlElement(name = "TransitToAccountId")
    protected String transitToAccountId;
    @XmlElement(name = "TransitToAccountIntegrationId")
    protected String transitToAccountIntegrationId;
    @XmlElement(name = "TransitToAccountLocation")
    protected String transitToAccountLocation;
    @XmlElement(name = "TransitToAddress")
    protected String transitToAddress;
    @XmlElement(name = "TransitToAddressId")
    protected String transitToAddressId;
    @XmlElement(name = "TransitToAddressIntegrationId")
    protected String transitToAddressIntegrationId;
    @XmlElement(name = "TransitToContactId")
    protected String transitToContactId;
    @XmlElement(name = "TransitToContactIntegrationId")
    protected String transitToContactIntegrationId;
    @XmlElement(name = "TransitToFirstName")
    protected String transitToFirstName;
    @XmlElement(name = "TransitToLastName")
    protected String transitToLastName;
    @XmlElement(name = "UOMFreight")
    protected String uomFreight;
    @XmlElement(name = "UOMInsuranceCost")
    protected String uomInsuranceCost;
    @XmlElement(name = "UOMInsuranceValue")
    protected String uomInsuranceValue;
    @XmlElement(name = "UOMWeight")
    protected String uomWeight;
    @XmlElement(name = "UnknownOrderMatch")
    protected String unknownOrderMatch;
    @XmlElement(name = "UnknownOrderNum")
    protected String unknownOrderNum;
    @XmlElement(name = "UnknownOrdertype")
    protected String unknownOrdertype;
    @XmlElement(name = "WaybillNumber")
    protected String waybillNumber;
    @XmlElement(name = "Weight")
    protected BigDecimal weight;
    @XmlElement(name = "ListOfShipmentItem")
    protected ListOfShipmentItemData listOfShipmentItem;
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
     * Gets the value of the assignedTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssignedTo() {
        return assignedTo;
    }

    /**
     * Sets the value of the assignedTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssignedTo(String value) {
        this.assignedTo = value;
    }

    /**
     * Gets the value of the assignedToID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssignedToID() {
        return assignedToID;
    }

    /**
     * Sets the value of the assignedToID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssignedToID(String value) {
        this.assignedToID = value;
    }

    /**
     * Gets the value of the carrier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarrier() {
        return carrier;
    }

    /**
     * Sets the value of the carrier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarrier(String value) {
        this.carrier = value;
    }

    /**
     * Gets the value of the carrierPriority property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarrierPriority() {
        return carrierPriority;
    }

    /**
     * Sets the value of the carrierPriority property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarrierPriority(String value) {
        this.carrierPriority = value;
    }

    /**
     * Gets the value of the condition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCondition() {
        return condition;
    }

    /**
     * Sets the value of the condition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCondition(String value) {
        this.condition = value;
    }

    /**
     * Gets the value of the freightCost property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFreightCost() {
        return freightCost;
    }

    /**
     * Sets the value of the freightCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFreightCost(BigDecimal value) {
        this.freightCost = value;
    }

    /**
     * Gets the value of the incoterms property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncoterms() {
        return incoterms;
    }

    /**
     * Sets the value of the incoterms property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncoterms(String value) {
        this.incoterms = value;
    }

    /**
     * Gets the value of the instructions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstructions() {
        return instructions;
    }

    /**
     * Sets the value of the instructions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstructions(String value) {
        this.instructions = value;
    }

    /**
     * Gets the value of the insuranceCost property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInsuranceCost() {
        return insuranceCost;
    }

    /**
     * Sets the value of the insuranceCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInsuranceCost(BigDecimal value) {
        this.insuranceCost = value;
    }

    /**
     * Gets the value of the insuredValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInsuredValue() {
        return insuredValue;
    }

    /**
     * Sets the value of the insuredValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInsuredValue(BigDecimal value) {
        this.insuredValue = value;
    }

    /**
     * Gets the value of the integrationId2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntegrationId2() {
        return integrationId2;
    }

    /**
     * Sets the value of the integrationId2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntegrationId2(String value) {
        this.integrationId2 = value;
    }

    /**
     * Gets the value of the noofContainers property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNoofContainers() {
        return noofContainers;
    }

    /**
     * Sets the value of the noofContainers property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNoofContainers(Integer value) {
        this.noofContainers = value;
    }

    /**
     * Gets the value of the orderId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * Sets the value of the orderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderId(String value) {
        this.orderId = value;
    }

    /**
     * Gets the value of the pod property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPOD() {
        return pod;
    }

    /**
     * Sets the value of the pod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPOD(Boolean value) {
        this.pod = value;
    }

    /**
     * Gets the value of the primaryOrderId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryOrderId() {
        return primaryOrderId;
    }

    /**
     * Sets the value of the primaryOrderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryOrderId(String value) {
        this.primaryOrderId = value;
    }

    /**
     * Gets the value of the receiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReceiveDate() {
        return receiveDate;
    }

    /**
     * Sets the value of the receiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReceiveDate(XMLGregorianCalendar value) {
        this.receiveDate = value;
    }

    /**
     * Gets the value of the receiveInvLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiveInvLocation() {
        return receiveInvLocation;
    }

    /**
     * Sets the value of the receiveInvLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiveInvLocation(String value) {
        this.receiveInvLocation = value;
    }

    /**
     * Gets the value of the receiveLocationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiveLocationId() {
        return receiveLocationId;
    }

    /**
     * Sets the value of the receiveLocationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiveLocationId(String value) {
        this.receiveLocationId = value;
    }

    /**
     * Gets the value of the receiveUnknownFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReceiveUnknownFlag() {
        return receiveUnknownFlag;
    }

    /**
     * Sets the value of the receiveUnknownFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReceiveUnknownFlag(Boolean value) {
        this.receiveUnknownFlag = value;
    }

    /**
     * Gets the value of the receivedBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceivedBy() {
        return receivedBy;
    }

    /**
     * Sets the value of the receivedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceivedBy(String value) {
        this.receivedBy = value;
    }

    /**
     * Gets the value of the receivedContact property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceivedContact() {
        return receivedContact;
    }

    /**
     * Sets the value of the receivedContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceivedContact(String value) {
        this.receivedContact = value;
    }

    /**
     * Gets the value of the scheduledDeliveryDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getScheduledDeliveryDate() {
        return scheduledDeliveryDate;
    }

    /**
     * Sets the value of the scheduledDeliveryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setScheduledDeliveryDate(XMLGregorianCalendar value) {
        this.scheduledDeliveryDate = value;
    }

    /**
     * Gets the value of the scheduledPickUpDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getScheduledPickUpDate() {
        return scheduledPickUpDate;
    }

    /**
     * Sets the value of the scheduledPickUpDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setScheduledPickUpDate(XMLGregorianCalendar value) {
        this.scheduledPickUpDate = value;
    }

    /**
     * Gets the value of the shipDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getShipDate() {
        return shipDate;
    }

    /**
     * Sets the value of the shipDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setShipDate(XMLGregorianCalendar value) {
        this.shipDate = value;
    }

    /**
     * Gets the value of the shipDueDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getShipDueDate() {
        return shipDueDate;
    }

    /**
     * Sets the value of the shipDueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setShipDueDate(XMLGregorianCalendar value) {
        this.shipDueDate = value;
    }

    /**
     * Gets the value of the shipInvLocId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipInvLocId() {
        return shipInvLocId;
    }

    /**
     * Sets the value of the shipInvLocId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipInvLocId(String value) {
        this.shipInvLocId = value;
    }

    /**
     * Gets the value of the shipInvLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipInvLocation() {
        return shipInvLocation;
    }

    /**
     * Sets the value of the shipInvLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipInvLocation(String value) {
        this.shipInvLocation = value;
    }

    /**
     * Gets the value of the shipInvLocationIntegrationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipInvLocationIntegrationId() {
        return shipInvLocationIntegrationId;
    }

    /**
     * Sets the value of the shipInvLocationIntegrationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipInvLocationIntegrationId(String value) {
        this.shipInvLocationIntegrationId = value;
    }

    /**
     * Gets the value of the shipTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipTo() {
        return shipTo;
    }

    /**
     * Sets the value of the shipTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipTo(String value) {
        this.shipTo = value;
    }

    /**
     * Gets the value of the shipToAccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipToAccount() {
        return shipToAccount;
    }

    /**
     * Sets the value of the shipToAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipToAccount(String value) {
        this.shipToAccount = value;
    }

    /**
     * Gets the value of the shipToAccountId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipToAccountId() {
        return shipToAccountId;
    }

    /**
     * Sets the value of the shipToAccountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipToAccountId(String value) {
        this.shipToAccountId = value;
    }

    /**
     * Gets the value of the shipToAccountIntegrationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipToAccountIntegrationId() {
        return shipToAccountIntegrationId;
    }

    /**
     * Sets the value of the shipToAccountIntegrationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipToAccountIntegrationId(String value) {
        this.shipToAccountIntegrationId = value;
    }

    /**
     * Gets the value of the shipToAccountLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipToAccountLocation() {
        return shipToAccountLocation;
    }

    /**
     * Sets the value of the shipToAccountLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipToAccountLocation(String value) {
        this.shipToAccountLocation = value;
    }

    /**
     * Gets the value of the shipToAddress2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipToAddress2() {
        return shipToAddress2;
    }

    /**
     * Sets the value of the shipToAddress2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipToAddress2(String value) {
        this.shipToAddress2 = value;
    }

    /**
     * Gets the value of the shipToAddressIntegrationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipToAddressIntegrationId() {
        return shipToAddressIntegrationId;
    }

    /**
     * Sets the value of the shipToAddressIntegrationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipToAddressIntegrationId(String value) {
        this.shipToAddressIntegrationId = value;
    }

    /**
     * Gets the value of the shipToCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipToCity() {
        return shipToCity;
    }

    /**
     * Sets the value of the shipToCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipToCity(String value) {
        this.shipToCity = value;
    }

    /**
     * Gets the value of the shipToCityState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipToCityState() {
        return shipToCityState;
    }

    /**
     * Sets the value of the shipToCityState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipToCityState(String value) {
        this.shipToCityState = value;
    }

    /**
     * Gets the value of the shipToCityStateZip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipToCityStateZip() {
        return shipToCityStateZip;
    }

    /**
     * Sets the value of the shipToCityStateZip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipToCityStateZip(String value) {
        this.shipToCityStateZip = value;
    }

    /**
     * Gets the value of the shipToContactId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipToContactId() {
        return shipToContactId;
    }

    /**
     * Sets the value of the shipToContactId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipToContactId(String value) {
        this.shipToContactId = value;
    }

    /**
     * Gets the value of the shipToContactIntegrationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipToContactIntegrationId() {
        return shipToContactIntegrationId;
    }

    /**
     * Sets the value of the shipToContactIntegrationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipToContactIntegrationId(String value) {
        this.shipToContactIntegrationId = value;
    }

    /**
     * Gets the value of the shipToCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipToCountry() {
        return shipToCountry;
    }

    /**
     * Sets the value of the shipToCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipToCountry(String value) {
        this.shipToCountry = value;
    }

    /**
     * Gets the value of the shipToFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipToFirstName() {
        return shipToFirstName;
    }

    /**
     * Sets the value of the shipToFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipToFirstName(String value) {
        this.shipToFirstName = value;
    }

    /**
     * Gets the value of the shipToID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipToID() {
        return shipToID;
    }

    /**
     * Sets the value of the shipToID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipToID(String value) {
        this.shipToID = value;
    }

    /**
     * Gets the value of the shipToLastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipToLastName() {
        return shipToLastName;
    }

    /**
     * Sets the value of the shipToLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipToLastName(String value) {
        this.shipToLastName = value;
    }

    /**
     * Gets the value of the shipToState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipToState() {
        return shipToState;
    }

    /**
     * Sets the value of the shipToState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipToState(String value) {
        this.shipToState = value;
    }

    /**
     * Gets the value of the shipToZip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipToZip() {
        return shipToZip;
    }

    /**
     * Sets the value of the shipToZip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipToZip(String value) {
        this.shipToZip = value;
    }

    /**
     * Gets the value of the shipVia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipVia() {
        return shipVia;
    }

    /**
     * Sets the value of the shipVia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipVia(String value) {
        this.shipVia = value;
    }

    /**
     * Gets the value of the shipmentNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipmentNumber() {
        return shipmentNumber;
    }

    /**
     * Sets the value of the shipmentNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipmentNumber(String value) {
        this.shipmentNumber = value;
    }

    /**
     * Gets the value of the shippedBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippedBy() {
        return shippedBy;
    }

    /**
     * Sets the value of the shippedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippedBy(String value) {
        this.shippedBy = value;
    }

    /**
     * Gets the value of the shippedContact property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippedContact() {
        return shippedContact;
    }

    /**
     * Sets the value of the shippedContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippedContact(String value) {
        this.shippedContact = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the statusAsOfDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStatusAsOfDate() {
        return statusAsOfDate;
    }

    /**
     * Sets the value of the statusAsOfDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStatusAsOfDate(XMLGregorianCalendar value) {
        this.statusAsOfDate = value;
    }

    /**
     * Gets the value of the transitToAccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransitToAccount() {
        return transitToAccount;
    }

    /**
     * Sets the value of the transitToAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransitToAccount(String value) {
        this.transitToAccount = value;
    }

    /**
     * Gets the value of the transitToAccountId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransitToAccountId() {
        return transitToAccountId;
    }

    /**
     * Sets the value of the transitToAccountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransitToAccountId(String value) {
        this.transitToAccountId = value;
    }

    /**
     * Gets the value of the transitToAccountIntegrationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransitToAccountIntegrationId() {
        return transitToAccountIntegrationId;
    }

    /**
     * Sets the value of the transitToAccountIntegrationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransitToAccountIntegrationId(String value) {
        this.transitToAccountIntegrationId = value;
    }

    /**
     * Gets the value of the transitToAccountLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransitToAccountLocation() {
        return transitToAccountLocation;
    }

    /**
     * Sets the value of the transitToAccountLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransitToAccountLocation(String value) {
        this.transitToAccountLocation = value;
    }

    /**
     * Gets the value of the transitToAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransitToAddress() {
        return transitToAddress;
    }

    /**
     * Sets the value of the transitToAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransitToAddress(String value) {
        this.transitToAddress = value;
    }

    /**
     * Gets the value of the transitToAddressId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransitToAddressId() {
        return transitToAddressId;
    }

    /**
     * Sets the value of the transitToAddressId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransitToAddressId(String value) {
        this.transitToAddressId = value;
    }

    /**
     * Gets the value of the transitToAddressIntegrationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransitToAddressIntegrationId() {
        return transitToAddressIntegrationId;
    }

    /**
     * Sets the value of the transitToAddressIntegrationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransitToAddressIntegrationId(String value) {
        this.transitToAddressIntegrationId = value;
    }

    /**
     * Gets the value of the transitToContactId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransitToContactId() {
        return transitToContactId;
    }

    /**
     * Sets the value of the transitToContactId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransitToContactId(String value) {
        this.transitToContactId = value;
    }

    /**
     * Gets the value of the transitToContactIntegrationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransitToContactIntegrationId() {
        return transitToContactIntegrationId;
    }

    /**
     * Sets the value of the transitToContactIntegrationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransitToContactIntegrationId(String value) {
        this.transitToContactIntegrationId = value;
    }

    /**
     * Gets the value of the transitToFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransitToFirstName() {
        return transitToFirstName;
    }

    /**
     * Sets the value of the transitToFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransitToFirstName(String value) {
        this.transitToFirstName = value;
    }

    /**
     * Gets the value of the transitToLastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransitToLastName() {
        return transitToLastName;
    }

    /**
     * Sets the value of the transitToLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransitToLastName(String value) {
        this.transitToLastName = value;
    }

    /**
     * Gets the value of the uomFreight property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUOMFreight() {
        return uomFreight;
    }

    /**
     * Sets the value of the uomFreight property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUOMFreight(String value) {
        this.uomFreight = value;
    }

    /**
     * Gets the value of the uomInsuranceCost property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUOMInsuranceCost() {
        return uomInsuranceCost;
    }

    /**
     * Sets the value of the uomInsuranceCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUOMInsuranceCost(String value) {
        this.uomInsuranceCost = value;
    }

    /**
     * Gets the value of the uomInsuranceValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUOMInsuranceValue() {
        return uomInsuranceValue;
    }

    /**
     * Sets the value of the uomInsuranceValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUOMInsuranceValue(String value) {
        this.uomInsuranceValue = value;
    }

    /**
     * Gets the value of the uomWeight property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUOMWeight() {
        return uomWeight;
    }

    /**
     * Sets the value of the uomWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUOMWeight(String value) {
        this.uomWeight = value;
    }

    /**
     * Gets the value of the unknownOrderMatch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnknownOrderMatch() {
        return unknownOrderMatch;
    }

    /**
     * Sets the value of the unknownOrderMatch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnknownOrderMatch(String value) {
        this.unknownOrderMatch = value;
    }

    /**
     * Gets the value of the unknownOrderNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnknownOrderNum() {
        return unknownOrderNum;
    }

    /**
     * Sets the value of the unknownOrderNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnknownOrderNum(String value) {
        this.unknownOrderNum = value;
    }

    /**
     * Gets the value of the unknownOrdertype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnknownOrdertype() {
        return unknownOrdertype;
    }

    /**
     * Sets the value of the unknownOrdertype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnknownOrdertype(String value) {
        this.unknownOrdertype = value;
    }

    /**
     * Gets the value of the waybillNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWaybillNumber() {
        return waybillNumber;
    }

    /**
     * Sets the value of the waybillNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWaybillNumber(String value) {
        this.waybillNumber = value;
    }

    /**
     * Gets the value of the weight property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWeight() {
        return weight;
    }

    /**
     * Sets the value of the weight property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setWeight(BigDecimal value) {
        this.weight = value;
    }

    /**
     * Gets the value of the listOfShipmentItem property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfShipmentItemData }
     *     
     */
    public ListOfShipmentItemData getListOfShipmentItem() {
        return listOfShipmentItem;
    }

    /**
     * Sets the value of the listOfShipmentItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfShipmentItemData }
     *     
     */
    public void setListOfShipmentItem(ListOfShipmentItemData value) {
        this.listOfShipmentItem = value;
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
