
package com.siebel.ordermanagement.order.details.data.query;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ShipmentItemQuery complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShipmentItemQuery">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="Created" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="Updated" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ConflictId" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ModId" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="AssetNumber" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="BillingDate" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="BillingQuantity" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="DeliveryDate" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="DeliveryQuantity" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="LineItemActionType" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="LineItemActionTypeId" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="LineNumber4" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PickingDate" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PickingQuantity" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PlanDispatchDate" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PlanDispatchQuantity" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="Product2" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ProductName" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ShipmentDate" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ShipmentId" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ShipmentQuantity" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="StatusAsOfDate" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
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
@XmlType(name = "ShipmentItemQuery", propOrder = {
    "id",
    "created",
    "updated",
    "conflictId",
    "modId",
    "assetNumber",
    "billingDate",
    "billingQuantity",
    "deliveryDate",
    "deliveryQuantity",
    "lineItemActionType",
    "lineItemActionTypeId",
    "lineNumber4",
    "pickingDate",
    "pickingQuantity",
    "planDispatchDate",
    "planDispatchQuantity",
    "product2",
    "productName",
    "shipmentDate",
    "shipmentId",
    "shipmentQuantity",
    "status",
    "statusAsOfDate"
})
public class ShipmentItemQuery
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
    @XmlElement(name = "AssetNumber")
    protected QueryType assetNumber;
    @XmlElement(name = "BillingDate")
    protected QueryType billingDate;
    @XmlElement(name = "BillingQuantity")
    protected QueryType billingQuantity;
    @XmlElement(name = "DeliveryDate")
    protected QueryType deliveryDate;
    @XmlElement(name = "DeliveryQuantity")
    protected QueryType deliveryQuantity;
    @XmlElement(name = "LineItemActionType")
    protected QueryType lineItemActionType;
    @XmlElement(name = "LineItemActionTypeId")
    protected QueryType lineItemActionTypeId;
    @XmlElement(name = "LineNumber4")
    protected QueryType lineNumber4;
    @XmlElement(name = "PickingDate")
    protected QueryType pickingDate;
    @XmlElement(name = "PickingQuantity")
    protected QueryType pickingQuantity;
    @XmlElement(name = "PlanDispatchDate")
    protected QueryType planDispatchDate;
    @XmlElement(name = "PlanDispatchQuantity")
    protected QueryType planDispatchQuantity;
    @XmlElement(name = "Product2")
    protected QueryType product2;
    @XmlElement(name = "ProductName")
    protected QueryType productName;
    @XmlElement(name = "ShipmentDate")
    protected QueryType shipmentDate;
    @XmlElement(name = "ShipmentId")
    protected QueryType shipmentId;
    @XmlElement(name = "ShipmentQuantity")
    protected QueryType shipmentQuantity;
    @XmlElement(name = "Status")
    protected QueryType status;
    @XmlElement(name = "StatusAsOfDate")
    protected QueryType statusAsOfDate;
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
     * Gets the value of the assetNumber property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getAssetNumber() {
        return assetNumber;
    }

    /**
     * Sets the value of the assetNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setAssetNumber(QueryType value) {
        this.assetNumber = value;
    }

    /**
     * Gets the value of the billingDate property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getBillingDate() {
        return billingDate;
    }

    /**
     * Sets the value of the billingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setBillingDate(QueryType value) {
        this.billingDate = value;
    }

    /**
     * Gets the value of the billingQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getBillingQuantity() {
        return billingQuantity;
    }

    /**
     * Sets the value of the billingQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setBillingQuantity(QueryType value) {
        this.billingQuantity = value;
    }

    /**
     * Gets the value of the deliveryDate property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getDeliveryDate() {
        return deliveryDate;
    }

    /**
     * Sets the value of the deliveryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setDeliveryDate(QueryType value) {
        this.deliveryDate = value;
    }

    /**
     * Gets the value of the deliveryQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getDeliveryQuantity() {
        return deliveryQuantity;
    }

    /**
     * Sets the value of the deliveryQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setDeliveryQuantity(QueryType value) {
        this.deliveryQuantity = value;
    }

    /**
     * Gets the value of the lineItemActionType property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getLineItemActionType() {
        return lineItemActionType;
    }

    /**
     * Sets the value of the lineItemActionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setLineItemActionType(QueryType value) {
        this.lineItemActionType = value;
    }

    /**
     * Gets the value of the lineItemActionTypeId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getLineItemActionTypeId() {
        return lineItemActionTypeId;
    }

    /**
     * Sets the value of the lineItemActionTypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setLineItemActionTypeId(QueryType value) {
        this.lineItemActionTypeId = value;
    }

    /**
     * Gets the value of the lineNumber4 property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getLineNumber4() {
        return lineNumber4;
    }

    /**
     * Sets the value of the lineNumber4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setLineNumber4(QueryType value) {
        this.lineNumber4 = value;
    }

    /**
     * Gets the value of the pickingDate property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPickingDate() {
        return pickingDate;
    }

    /**
     * Sets the value of the pickingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPickingDate(QueryType value) {
        this.pickingDate = value;
    }

    /**
     * Gets the value of the pickingQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPickingQuantity() {
        return pickingQuantity;
    }

    /**
     * Sets the value of the pickingQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPickingQuantity(QueryType value) {
        this.pickingQuantity = value;
    }

    /**
     * Gets the value of the planDispatchDate property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPlanDispatchDate() {
        return planDispatchDate;
    }

    /**
     * Sets the value of the planDispatchDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPlanDispatchDate(QueryType value) {
        this.planDispatchDate = value;
    }

    /**
     * Gets the value of the planDispatchQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPlanDispatchQuantity() {
        return planDispatchQuantity;
    }

    /**
     * Sets the value of the planDispatchQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPlanDispatchQuantity(QueryType value) {
        this.planDispatchQuantity = value;
    }

    /**
     * Gets the value of the product2 property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getProduct2() {
        return product2;
    }

    /**
     * Sets the value of the product2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setProduct2(QueryType value) {
        this.product2 = value;
    }

    /**
     * Gets the value of the productName property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getProductName() {
        return productName;
    }

    /**
     * Sets the value of the productName property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setProductName(QueryType value) {
        this.productName = value;
    }

    /**
     * Gets the value of the shipmentDate property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getShipmentDate() {
        return shipmentDate;
    }

    /**
     * Sets the value of the shipmentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setShipmentDate(QueryType value) {
        this.shipmentDate = value;
    }

    /**
     * Gets the value of the shipmentId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getShipmentId() {
        return shipmentId;
    }

    /**
     * Sets the value of the shipmentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setShipmentId(QueryType value) {
        this.shipmentId = value;
    }

    /**
     * Gets the value of the shipmentQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getShipmentQuantity() {
        return shipmentQuantity;
    }

    /**
     * Sets the value of the shipmentQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setShipmentQuantity(QueryType value) {
        this.shipmentQuantity = value;
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
