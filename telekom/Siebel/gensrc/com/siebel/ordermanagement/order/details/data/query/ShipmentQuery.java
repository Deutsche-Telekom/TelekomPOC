
package com.siebel.ordermanagement.order.details.data.query;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ShipmentQuery complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShipmentQuery">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="Created" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="Updated" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ConflictId" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ModId" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="AssignedTo" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="AssignedToID" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="Carrier" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="CarrierPriority" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="Condition" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="FreightCost" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="Incoterms" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="Instructions" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="InsuranceCost" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="InsuredValue" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="IntegrationId2" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="NoofContainers" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="OrderId" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="POD" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PrimaryOrderId" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ReceiveDate" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ReceiveInvLocation" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ReceiveLocationId" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ReceiveUnknownFlag" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ReceivedBy" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ReceivedContact" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ScheduledDeliveryDate" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ScheduledPickUpDate" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ShipDate" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ShipDueDate" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ShipInvLocId" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ShipInvLocation" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ShipInvLocationIntegrationId" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ShipTo" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ShipToAccount" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ShipToAccountId" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ShipToAccountIntegrationId" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ShipToAccountLocation" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ShipToAddress2" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ShipToAddressIntegrationId" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ShipToCity" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ShipToCityState" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ShipToCityStateZip" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ShipToContactId" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ShipToContactIntegrationId" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ShipToCountry" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ShipToFirstName" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ShipToID" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ShipToLastName" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ShipToState" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ShipToZip" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ShipVia" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ShipmentNumber" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ShippedBy" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ShippedContact" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="StatusAsOfDate" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="TransitToAccount" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="TransitToAccountId" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="TransitToAccountIntegrationId" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="TransitToAccountLocation" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="TransitToAddress" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="TransitToAddressId" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="TransitToAddressIntegrationId" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="TransitToContactId" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="TransitToContactIntegrationId" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="TransitToFirstName" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="TransitToLastName" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="UOMFreight" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="UOMInsuranceCost" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="UOMInsuranceValue" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="UOMWeight" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="UnknownOrderMatch" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="UnknownOrderNum" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="UnknownOrdertype" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="WaybillNumber" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="Weight" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ListOfShipmentItem" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}ListOfShipmentItemQuery" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="searchspec" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShipmentQuery", propOrder = {
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
public class ShipmentQuery
    implements Serializable
{

    @XmlElement(name = "Id")
    protected QueryType id;
    @XmlElement(name = "Created")
    protected QueryType created;
    @XmlElement(name = "Updated")
    protected QueryType updated;
    @XmlElement(name = "ConflictId")
    protected QueryType conflictId;
    @XmlElement(name = "ModId")
    protected QueryType modId;
    @XmlElement(name = "AssignedTo")
    protected QueryType assignedTo;
    @XmlElement(name = "AssignedToID")
    protected QueryType assignedToID;
    @XmlElement(name = "Carrier")
    protected QueryType carrier;
    @XmlElement(name = "CarrierPriority")
    protected QueryType carrierPriority;
    @XmlElement(name = "Condition")
    protected QueryType condition;
    @XmlElement(name = "FreightCost")
    protected QueryType freightCost;
    @XmlElement(name = "Incoterms")
    protected QueryType incoterms;
    @XmlElement(name = "Instructions")
    protected QueryType instructions;
    @XmlElement(name = "InsuranceCost")
    protected QueryType insuranceCost;
    @XmlElement(name = "InsuredValue")
    protected QueryType insuredValue;
    @XmlElement(name = "IntegrationId2")
    protected QueryType integrationId2;
    @XmlElement(name = "NoofContainers")
    protected QueryType noofContainers;
    @XmlElement(name = "OrderId")
    protected QueryType orderId;
    @XmlElement(name = "POD")
    protected QueryType pod;
    @XmlElement(name = "PrimaryOrderId")
    protected QueryType primaryOrderId;
    @XmlElement(name = "ReceiveDate")
    protected QueryType receiveDate;
    @XmlElement(name = "ReceiveInvLocation")
    protected QueryType receiveInvLocation;
    @XmlElement(name = "ReceiveLocationId")
    protected QueryType receiveLocationId;
    @XmlElement(name = "ReceiveUnknownFlag")
    protected QueryType receiveUnknownFlag;
    @XmlElement(name = "ReceivedBy")
    protected QueryType receivedBy;
    @XmlElement(name = "ReceivedContact")
    protected QueryType receivedContact;
    @XmlElement(name = "ScheduledDeliveryDate")
    protected QueryType scheduledDeliveryDate;
    @XmlElement(name = "ScheduledPickUpDate")
    protected QueryType scheduledPickUpDate;
    @XmlElement(name = "ShipDate")
    protected QueryType shipDate;
    @XmlElement(name = "ShipDueDate")
    protected QueryType shipDueDate;
    @XmlElement(name = "ShipInvLocId")
    protected QueryType shipInvLocId;
    @XmlElement(name = "ShipInvLocation")
    protected QueryType shipInvLocation;
    @XmlElement(name = "ShipInvLocationIntegrationId")
    protected QueryType shipInvLocationIntegrationId;
    @XmlElement(name = "ShipTo")
    protected QueryType shipTo;
    @XmlElement(name = "ShipToAccount")
    protected QueryType shipToAccount;
    @XmlElement(name = "ShipToAccountId")
    protected QueryType shipToAccountId;
    @XmlElement(name = "ShipToAccountIntegrationId")
    protected QueryType shipToAccountIntegrationId;
    @XmlElement(name = "ShipToAccountLocation")
    protected QueryType shipToAccountLocation;
    @XmlElement(name = "ShipToAddress2")
    protected QueryType shipToAddress2;
    @XmlElement(name = "ShipToAddressIntegrationId")
    protected QueryType shipToAddressIntegrationId;
    @XmlElement(name = "ShipToCity")
    protected QueryType shipToCity;
    @XmlElement(name = "ShipToCityState")
    protected QueryType shipToCityState;
    @XmlElement(name = "ShipToCityStateZip")
    protected QueryType shipToCityStateZip;
    @XmlElement(name = "ShipToContactId")
    protected QueryType shipToContactId;
    @XmlElement(name = "ShipToContactIntegrationId")
    protected QueryType shipToContactIntegrationId;
    @XmlElement(name = "ShipToCountry")
    protected QueryType shipToCountry;
    @XmlElement(name = "ShipToFirstName")
    protected QueryType shipToFirstName;
    @XmlElement(name = "ShipToID")
    protected QueryType shipToID;
    @XmlElement(name = "ShipToLastName")
    protected QueryType shipToLastName;
    @XmlElement(name = "ShipToState")
    protected QueryType shipToState;
    @XmlElement(name = "ShipToZip")
    protected QueryType shipToZip;
    @XmlElement(name = "ShipVia")
    protected QueryType shipVia;
    @XmlElement(name = "ShipmentNumber")
    protected QueryType shipmentNumber;
    @XmlElement(name = "ShippedBy")
    protected QueryType shippedBy;
    @XmlElement(name = "ShippedContact")
    protected QueryType shippedContact;
    @XmlElement(name = "Status")
    protected QueryType status;
    @XmlElement(name = "StatusAsOfDate")
    protected QueryType statusAsOfDate;
    @XmlElement(name = "TransitToAccount")
    protected QueryType transitToAccount;
    @XmlElement(name = "TransitToAccountId")
    protected QueryType transitToAccountId;
    @XmlElement(name = "TransitToAccountIntegrationId")
    protected QueryType transitToAccountIntegrationId;
    @XmlElement(name = "TransitToAccountLocation")
    protected QueryType transitToAccountLocation;
    @XmlElement(name = "TransitToAddress")
    protected QueryType transitToAddress;
    @XmlElement(name = "TransitToAddressId")
    protected QueryType transitToAddressId;
    @XmlElement(name = "TransitToAddressIntegrationId")
    protected QueryType transitToAddressIntegrationId;
    @XmlElement(name = "TransitToContactId")
    protected QueryType transitToContactId;
    @XmlElement(name = "TransitToContactIntegrationId")
    protected QueryType transitToContactIntegrationId;
    @XmlElement(name = "TransitToFirstName")
    protected QueryType transitToFirstName;
    @XmlElement(name = "TransitToLastName")
    protected QueryType transitToLastName;
    @XmlElement(name = "UOMFreight")
    protected QueryType uomFreight;
    @XmlElement(name = "UOMInsuranceCost")
    protected QueryType uomInsuranceCost;
    @XmlElement(name = "UOMInsuranceValue")
    protected QueryType uomInsuranceValue;
    @XmlElement(name = "UOMWeight")
    protected QueryType uomWeight;
    @XmlElement(name = "UnknownOrderMatch")
    protected QueryType unknownOrderMatch;
    @XmlElement(name = "UnknownOrderNum")
    protected QueryType unknownOrderNum;
    @XmlElement(name = "UnknownOrdertype")
    protected QueryType unknownOrdertype;
    @XmlElement(name = "WaybillNumber")
    protected QueryType waybillNumber;
    @XmlElement(name = "Weight")
    protected QueryType weight;
    @XmlElement(name = "ListOfShipmentItem")
    protected ListOfShipmentItemQuery listOfShipmentItem;
    @XmlAttribute
    protected String searchspec;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setId(QueryType value) {
        this.id = value;
    }

    /**
     * Gets the value of the created property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getCreated() {
        return created;
    }

    /**
     * Sets the value of the created property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setCreated(QueryType value) {
        this.created = value;
    }

    /**
     * Gets the value of the updated property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getUpdated() {
        return updated;
    }

    /**
     * Sets the value of the updated property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setUpdated(QueryType value) {
        this.updated = value;
    }

    /**
     * Gets the value of the conflictId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getConflictId() {
        return conflictId;
    }

    /**
     * Sets the value of the conflictId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setConflictId(QueryType value) {
        this.conflictId = value;
    }

    /**
     * Gets the value of the modId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getModId() {
        return modId;
    }

    /**
     * Sets the value of the modId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setModId(QueryType value) {
        this.modId = value;
    }

    /**
     * Gets the value of the assignedTo property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getAssignedTo() {
        return assignedTo;
    }

    /**
     * Sets the value of the assignedTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setAssignedTo(QueryType value) {
        this.assignedTo = value;
    }

    /**
     * Gets the value of the assignedToID property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getAssignedToID() {
        return assignedToID;
    }

    /**
     * Sets the value of the assignedToID property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setAssignedToID(QueryType value) {
        this.assignedToID = value;
    }

    /**
     * Gets the value of the carrier property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getCarrier() {
        return carrier;
    }

    /**
     * Sets the value of the carrier property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setCarrier(QueryType value) {
        this.carrier = value;
    }

    /**
     * Gets the value of the carrierPriority property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getCarrierPriority() {
        return carrierPriority;
    }

    /**
     * Sets the value of the carrierPriority property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setCarrierPriority(QueryType value) {
        this.carrierPriority = value;
    }

    /**
     * Gets the value of the condition property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getCondition() {
        return condition;
    }

    /**
     * Sets the value of the condition property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setCondition(QueryType value) {
        this.condition = value;
    }

    /**
     * Gets the value of the freightCost property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getFreightCost() {
        return freightCost;
    }

    /**
     * Sets the value of the freightCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setFreightCost(QueryType value) {
        this.freightCost = value;
    }

    /**
     * Gets the value of the incoterms property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getIncoterms() {
        return incoterms;
    }

    /**
     * Sets the value of the incoterms property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setIncoterms(QueryType value) {
        this.incoterms = value;
    }

    /**
     * Gets the value of the instructions property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getInstructions() {
        return instructions;
    }

    /**
     * Sets the value of the instructions property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setInstructions(QueryType value) {
        this.instructions = value;
    }

    /**
     * Gets the value of the insuranceCost property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getInsuranceCost() {
        return insuranceCost;
    }

    /**
     * Sets the value of the insuranceCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setInsuranceCost(QueryType value) {
        this.insuranceCost = value;
    }

    /**
     * Gets the value of the insuredValue property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getInsuredValue() {
        return insuredValue;
    }

    /**
     * Sets the value of the insuredValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setInsuredValue(QueryType value) {
        this.insuredValue = value;
    }

    /**
     * Gets the value of the integrationId2 property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getIntegrationId2() {
        return integrationId2;
    }

    /**
     * Sets the value of the integrationId2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setIntegrationId2(QueryType value) {
        this.integrationId2 = value;
    }

    /**
     * Gets the value of the noofContainers property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getNoofContainers() {
        return noofContainers;
    }

    /**
     * Sets the value of the noofContainers property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setNoofContainers(QueryType value) {
        this.noofContainers = value;
    }

    /**
     * Gets the value of the orderId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getOrderId() {
        return orderId;
    }

    /**
     * Sets the value of the orderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setOrderId(QueryType value) {
        this.orderId = value;
    }

    /**
     * Gets the value of the pod property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPOD() {
        return pod;
    }

    /**
     * Sets the value of the pod property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPOD(QueryType value) {
        this.pod = value;
    }

    /**
     * Gets the value of the primaryOrderId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPrimaryOrderId() {
        return primaryOrderId;
    }

    /**
     * Sets the value of the primaryOrderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPrimaryOrderId(QueryType value) {
        this.primaryOrderId = value;
    }

    /**
     * Gets the value of the receiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getReceiveDate() {
        return receiveDate;
    }

    /**
     * Sets the value of the receiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setReceiveDate(QueryType value) {
        this.receiveDate = value;
    }

    /**
     * Gets the value of the receiveInvLocation property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getReceiveInvLocation() {
        return receiveInvLocation;
    }

    /**
     * Sets the value of the receiveInvLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setReceiveInvLocation(QueryType value) {
        this.receiveInvLocation = value;
    }

    /**
     * Gets the value of the receiveLocationId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getReceiveLocationId() {
        return receiveLocationId;
    }

    /**
     * Sets the value of the receiveLocationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setReceiveLocationId(QueryType value) {
        this.receiveLocationId = value;
    }

    /**
     * Gets the value of the receiveUnknownFlag property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getReceiveUnknownFlag() {
        return receiveUnknownFlag;
    }

    /**
     * Sets the value of the receiveUnknownFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setReceiveUnknownFlag(QueryType value) {
        this.receiveUnknownFlag = value;
    }

    /**
     * Gets the value of the receivedBy property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getReceivedBy() {
        return receivedBy;
    }

    /**
     * Sets the value of the receivedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setReceivedBy(QueryType value) {
        this.receivedBy = value;
    }

    /**
     * Gets the value of the receivedContact property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getReceivedContact() {
        return receivedContact;
    }

    /**
     * Sets the value of the receivedContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setReceivedContact(QueryType value) {
        this.receivedContact = value;
    }

    /**
     * Gets the value of the scheduledDeliveryDate property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getScheduledDeliveryDate() {
        return scheduledDeliveryDate;
    }

    /**
     * Sets the value of the scheduledDeliveryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setScheduledDeliveryDate(QueryType value) {
        this.scheduledDeliveryDate = value;
    }

    /**
     * Gets the value of the scheduledPickUpDate property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getScheduledPickUpDate() {
        return scheduledPickUpDate;
    }

    /**
     * Sets the value of the scheduledPickUpDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setScheduledPickUpDate(QueryType value) {
        this.scheduledPickUpDate = value;
    }

    /**
     * Gets the value of the shipDate property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getShipDate() {
        return shipDate;
    }

    /**
     * Sets the value of the shipDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setShipDate(QueryType value) {
        this.shipDate = value;
    }

    /**
     * Gets the value of the shipDueDate property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getShipDueDate() {
        return shipDueDate;
    }

    /**
     * Sets the value of the shipDueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setShipDueDate(QueryType value) {
        this.shipDueDate = value;
    }

    /**
     * Gets the value of the shipInvLocId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getShipInvLocId() {
        return shipInvLocId;
    }

    /**
     * Sets the value of the shipInvLocId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setShipInvLocId(QueryType value) {
        this.shipInvLocId = value;
    }

    /**
     * Gets the value of the shipInvLocation property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getShipInvLocation() {
        return shipInvLocation;
    }

    /**
     * Sets the value of the shipInvLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setShipInvLocation(QueryType value) {
        this.shipInvLocation = value;
    }

    /**
     * Gets the value of the shipInvLocationIntegrationId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getShipInvLocationIntegrationId() {
        return shipInvLocationIntegrationId;
    }

    /**
     * Sets the value of the shipInvLocationIntegrationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setShipInvLocationIntegrationId(QueryType value) {
        this.shipInvLocationIntegrationId = value;
    }

    /**
     * Gets the value of the shipTo property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getShipTo() {
        return shipTo;
    }

    /**
     * Sets the value of the shipTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setShipTo(QueryType value) {
        this.shipTo = value;
    }

    /**
     * Gets the value of the shipToAccount property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getShipToAccount() {
        return shipToAccount;
    }

    /**
     * Sets the value of the shipToAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setShipToAccount(QueryType value) {
        this.shipToAccount = value;
    }

    /**
     * Gets the value of the shipToAccountId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getShipToAccountId() {
        return shipToAccountId;
    }

    /**
     * Sets the value of the shipToAccountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setShipToAccountId(QueryType value) {
        this.shipToAccountId = value;
    }

    /**
     * Gets the value of the shipToAccountIntegrationId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getShipToAccountIntegrationId() {
        return shipToAccountIntegrationId;
    }

    /**
     * Sets the value of the shipToAccountIntegrationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setShipToAccountIntegrationId(QueryType value) {
        this.shipToAccountIntegrationId = value;
    }

    /**
     * Gets the value of the shipToAccountLocation property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getShipToAccountLocation() {
        return shipToAccountLocation;
    }

    /**
     * Sets the value of the shipToAccountLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setShipToAccountLocation(QueryType value) {
        this.shipToAccountLocation = value;
    }

    /**
     * Gets the value of the shipToAddress2 property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getShipToAddress2() {
        return shipToAddress2;
    }

    /**
     * Sets the value of the shipToAddress2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setShipToAddress2(QueryType value) {
        this.shipToAddress2 = value;
    }

    /**
     * Gets the value of the shipToAddressIntegrationId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getShipToAddressIntegrationId() {
        return shipToAddressIntegrationId;
    }

    /**
     * Sets the value of the shipToAddressIntegrationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setShipToAddressIntegrationId(QueryType value) {
        this.shipToAddressIntegrationId = value;
    }

    /**
     * Gets the value of the shipToCity property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getShipToCity() {
        return shipToCity;
    }

    /**
     * Sets the value of the shipToCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setShipToCity(QueryType value) {
        this.shipToCity = value;
    }

    /**
     * Gets the value of the shipToCityState property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getShipToCityState() {
        return shipToCityState;
    }

    /**
     * Sets the value of the shipToCityState property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setShipToCityState(QueryType value) {
        this.shipToCityState = value;
    }

    /**
     * Gets the value of the shipToCityStateZip property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getShipToCityStateZip() {
        return shipToCityStateZip;
    }

    /**
     * Sets the value of the shipToCityStateZip property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setShipToCityStateZip(QueryType value) {
        this.shipToCityStateZip = value;
    }

    /**
     * Gets the value of the shipToContactId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getShipToContactId() {
        return shipToContactId;
    }

    /**
     * Sets the value of the shipToContactId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setShipToContactId(QueryType value) {
        this.shipToContactId = value;
    }

    /**
     * Gets the value of the shipToContactIntegrationId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getShipToContactIntegrationId() {
        return shipToContactIntegrationId;
    }

    /**
     * Sets the value of the shipToContactIntegrationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setShipToContactIntegrationId(QueryType value) {
        this.shipToContactIntegrationId = value;
    }

    /**
     * Gets the value of the shipToCountry property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getShipToCountry() {
        return shipToCountry;
    }

    /**
     * Sets the value of the shipToCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setShipToCountry(QueryType value) {
        this.shipToCountry = value;
    }

    /**
     * Gets the value of the shipToFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getShipToFirstName() {
        return shipToFirstName;
    }

    /**
     * Sets the value of the shipToFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setShipToFirstName(QueryType value) {
        this.shipToFirstName = value;
    }

    /**
     * Gets the value of the shipToID property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getShipToID() {
        return shipToID;
    }

    /**
     * Sets the value of the shipToID property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setShipToID(QueryType value) {
        this.shipToID = value;
    }

    /**
     * Gets the value of the shipToLastName property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getShipToLastName() {
        return shipToLastName;
    }

    /**
     * Sets the value of the shipToLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setShipToLastName(QueryType value) {
        this.shipToLastName = value;
    }

    /**
     * Gets the value of the shipToState property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getShipToState() {
        return shipToState;
    }

    /**
     * Sets the value of the shipToState property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setShipToState(QueryType value) {
        this.shipToState = value;
    }

    /**
     * Gets the value of the shipToZip property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getShipToZip() {
        return shipToZip;
    }

    /**
     * Sets the value of the shipToZip property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setShipToZip(QueryType value) {
        this.shipToZip = value;
    }

    /**
     * Gets the value of the shipVia property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getShipVia() {
        return shipVia;
    }

    /**
     * Sets the value of the shipVia property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setShipVia(QueryType value) {
        this.shipVia = value;
    }

    /**
     * Gets the value of the shipmentNumber property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getShipmentNumber() {
        return shipmentNumber;
    }

    /**
     * Sets the value of the shipmentNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setShipmentNumber(QueryType value) {
        this.shipmentNumber = value;
    }

    /**
     * Gets the value of the shippedBy property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getShippedBy() {
        return shippedBy;
    }

    /**
     * Sets the value of the shippedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setShippedBy(QueryType value) {
        this.shippedBy = value;
    }

    /**
     * Gets the value of the shippedContact property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getShippedContact() {
        return shippedContact;
    }

    /**
     * Sets the value of the shippedContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setShippedContact(QueryType value) {
        this.shippedContact = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setStatus(QueryType value) {
        this.status = value;
    }

    /**
     * Gets the value of the statusAsOfDate property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getStatusAsOfDate() {
        return statusAsOfDate;
    }

    /**
     * Sets the value of the statusAsOfDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setStatusAsOfDate(QueryType value) {
        this.statusAsOfDate = value;
    }

    /**
     * Gets the value of the transitToAccount property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getTransitToAccount() {
        return transitToAccount;
    }

    /**
     * Sets the value of the transitToAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setTransitToAccount(QueryType value) {
        this.transitToAccount = value;
    }

    /**
     * Gets the value of the transitToAccountId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getTransitToAccountId() {
        return transitToAccountId;
    }

    /**
     * Sets the value of the transitToAccountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setTransitToAccountId(QueryType value) {
        this.transitToAccountId = value;
    }

    /**
     * Gets the value of the transitToAccountIntegrationId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getTransitToAccountIntegrationId() {
        return transitToAccountIntegrationId;
    }

    /**
     * Sets the value of the transitToAccountIntegrationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setTransitToAccountIntegrationId(QueryType value) {
        this.transitToAccountIntegrationId = value;
    }

    /**
     * Gets the value of the transitToAccountLocation property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getTransitToAccountLocation() {
        return transitToAccountLocation;
    }

    /**
     * Sets the value of the transitToAccountLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setTransitToAccountLocation(QueryType value) {
        this.transitToAccountLocation = value;
    }

    /**
     * Gets the value of the transitToAddress property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getTransitToAddress() {
        return transitToAddress;
    }

    /**
     * Sets the value of the transitToAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setTransitToAddress(QueryType value) {
        this.transitToAddress = value;
    }

    /**
     * Gets the value of the transitToAddressId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getTransitToAddressId() {
        return transitToAddressId;
    }

    /**
     * Sets the value of the transitToAddressId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setTransitToAddressId(QueryType value) {
        this.transitToAddressId = value;
    }

    /**
     * Gets the value of the transitToAddressIntegrationId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getTransitToAddressIntegrationId() {
        return transitToAddressIntegrationId;
    }

    /**
     * Sets the value of the transitToAddressIntegrationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setTransitToAddressIntegrationId(QueryType value) {
        this.transitToAddressIntegrationId = value;
    }

    /**
     * Gets the value of the transitToContactId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getTransitToContactId() {
        return transitToContactId;
    }

    /**
     * Sets the value of the transitToContactId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setTransitToContactId(QueryType value) {
        this.transitToContactId = value;
    }

    /**
     * Gets the value of the transitToContactIntegrationId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getTransitToContactIntegrationId() {
        return transitToContactIntegrationId;
    }

    /**
     * Sets the value of the transitToContactIntegrationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setTransitToContactIntegrationId(QueryType value) {
        this.transitToContactIntegrationId = value;
    }

    /**
     * Gets the value of the transitToFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getTransitToFirstName() {
        return transitToFirstName;
    }

    /**
     * Sets the value of the transitToFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setTransitToFirstName(QueryType value) {
        this.transitToFirstName = value;
    }

    /**
     * Gets the value of the transitToLastName property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getTransitToLastName() {
        return transitToLastName;
    }

    /**
     * Sets the value of the transitToLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setTransitToLastName(QueryType value) {
        this.transitToLastName = value;
    }

    /**
     * Gets the value of the uomFreight property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getUOMFreight() {
        return uomFreight;
    }

    /**
     * Sets the value of the uomFreight property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setUOMFreight(QueryType value) {
        this.uomFreight = value;
    }

    /**
     * Gets the value of the uomInsuranceCost property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getUOMInsuranceCost() {
        return uomInsuranceCost;
    }

    /**
     * Sets the value of the uomInsuranceCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setUOMInsuranceCost(QueryType value) {
        this.uomInsuranceCost = value;
    }

    /**
     * Gets the value of the uomInsuranceValue property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getUOMInsuranceValue() {
        return uomInsuranceValue;
    }

    /**
     * Sets the value of the uomInsuranceValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setUOMInsuranceValue(QueryType value) {
        this.uomInsuranceValue = value;
    }

    /**
     * Gets the value of the uomWeight property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getUOMWeight() {
        return uomWeight;
    }

    /**
     * Sets the value of the uomWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setUOMWeight(QueryType value) {
        this.uomWeight = value;
    }

    /**
     * Gets the value of the unknownOrderMatch property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getUnknownOrderMatch() {
        return unknownOrderMatch;
    }

    /**
     * Sets the value of the unknownOrderMatch property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setUnknownOrderMatch(QueryType value) {
        this.unknownOrderMatch = value;
    }

    /**
     * Gets the value of the unknownOrderNum property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getUnknownOrderNum() {
        return unknownOrderNum;
    }

    /**
     * Sets the value of the unknownOrderNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setUnknownOrderNum(QueryType value) {
        this.unknownOrderNum = value;
    }

    /**
     * Gets the value of the unknownOrdertype property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getUnknownOrdertype() {
        return unknownOrdertype;
    }

    /**
     * Sets the value of the unknownOrdertype property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setUnknownOrdertype(QueryType value) {
        this.unknownOrdertype = value;
    }

    /**
     * Gets the value of the waybillNumber property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getWaybillNumber() {
        return waybillNumber;
    }

    /**
     * Sets the value of the waybillNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setWaybillNumber(QueryType value) {
        this.waybillNumber = value;
    }

    /**
     * Gets the value of the weight property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getWeight() {
        return weight;
    }

    /**
     * Sets the value of the weight property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setWeight(QueryType value) {
        this.weight = value;
    }

    /**
     * Gets the value of the listOfShipmentItem property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfShipmentItemQuery }
     *     
     */
    public ListOfShipmentItemQuery getListOfShipmentItem() {
        return listOfShipmentItem;
    }

    /**
     * Sets the value of the listOfShipmentItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfShipmentItemQuery }
     *     
     */
    public void setListOfShipmentItem(ListOfShipmentItemQuery value) {
        this.listOfShipmentItem = value;
    }

    /**
     * Gets the value of the searchspec property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchspec() {
        return searchspec;
    }

    /**
     * Sets the value of the searchspec property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchspec(String value) {
        this.searchspec = value;
    }

}
