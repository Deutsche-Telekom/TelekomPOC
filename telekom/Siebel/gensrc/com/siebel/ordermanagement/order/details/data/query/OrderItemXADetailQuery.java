
package com.siebel.ordermanagement.order.details.data.query;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrderItemXADetailQuery complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderItemXADetailQuery">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="Created" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="Updated" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ConflictId" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ModId" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ActionCode" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="AttributeId" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="BCReadOnlyFlag2" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="CfgStateCode" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="DataType" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="DateValue" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="Description2" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="DisplayName" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="Hidden" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="IntegrationId" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="LOVType" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="MLOV" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="NumericValue" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ObjectId" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="OrderItemStatus" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ParentComplexProductFlag" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PreviousDateValue" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PreviousNumericValue" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PreviousTextValue" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="PreviousValue" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ReadOnly" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="Required" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="Sequence" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="TextValue" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="UnitofMeasure" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="Validation" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
 *         &lt;element name="Value" type="{http://siebel.com/OrderManagement/Order/Details/Data/Query}queryType" minOccurs="0"/>
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
@XmlType(name = "OrderItemXADetailQuery", propOrder = {
    "id",
    "created",
    "updated",
    "conflictId",
    "modId",
    "actionCode",
    "attributeId",
    "bcReadOnlyFlag2",
    "cfgStateCode",
    "dataType",
    "dateValue",
    "description2",
    "displayName",
    "hidden",
    "integrationId",
    "lovType",
    "mlov",
    "name",
    "numericValue",
    "objectId",
    "orderItemStatus",
    "parentComplexProductFlag",
    "previousDateValue",
    "previousNumericValue",
    "previousTextValue",
    "previousValue",
    "readOnly",
    "required",
    "sequence",
    "textValue",
    "unitofMeasure",
    "validation",
    "value"
})
public class OrderItemXADetailQuery
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
    @XmlElement(name = "ActionCode")
    protected QueryType actionCode;
    @XmlElement(name = "AttributeId")
    protected QueryType attributeId;
    @XmlElement(name = "BCReadOnlyFlag2")
    protected QueryType bcReadOnlyFlag2;
    @XmlElement(name = "CfgStateCode")
    protected QueryType cfgStateCode;
    @XmlElement(name = "DataType")
    protected QueryType dataType;
    @XmlElement(name = "DateValue")
    protected QueryType dateValue;
    @XmlElement(name = "Description2")
    protected QueryType description2;
    @XmlElement(name = "DisplayName")
    protected QueryType displayName;
    @XmlElement(name = "Hidden")
    protected QueryType hidden;
    @XmlElement(name = "IntegrationId")
    protected QueryType integrationId;
    @XmlElement(name = "LOVType")
    protected QueryType lovType;
    @XmlElement(name = "MLOV")
    protected QueryType mlov;
    @XmlElement(name = "Name")
    protected QueryType name;
    @XmlElement(name = "NumericValue")
    protected QueryType numericValue;
    @XmlElement(name = "ObjectId")
    protected QueryType objectId;
    @XmlElement(name = "OrderItemStatus")
    protected QueryType orderItemStatus;
    @XmlElement(name = "ParentComplexProductFlag")
    protected QueryType parentComplexProductFlag;
    @XmlElement(name = "PreviousDateValue")
    protected QueryType previousDateValue;
    @XmlElement(name = "PreviousNumericValue")
    protected QueryType previousNumericValue;
    @XmlElement(name = "PreviousTextValue")
    protected QueryType previousTextValue;
    @XmlElement(name = "PreviousValue")
    protected QueryType previousValue;
    @XmlElement(name = "ReadOnly")
    protected QueryType readOnly;
    @XmlElement(name = "Required")
    protected QueryType required;
    @XmlElement(name = "Sequence")
    protected QueryType sequence;
    @XmlElement(name = "TextValue")
    protected QueryType textValue;
    @XmlElement(name = "UnitofMeasure")
    protected QueryType unitofMeasure;
    @XmlElement(name = "Validation")
    protected QueryType validation;
    @XmlElement(name = "Value")
    protected QueryType value;
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
     * Gets the value of the actionCode property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getActionCode() {
        return actionCode;
    }

    /**
     * Sets the value of the actionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setActionCode(QueryType value) {
        this.actionCode = value;
    }

    /**
     * Gets the value of the attributeId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getAttributeId() {
        return attributeId;
    }

    /**
     * Sets the value of the attributeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setAttributeId(QueryType value) {
        this.attributeId = value;
    }

    /**
     * Gets the value of the bcReadOnlyFlag2 property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getBCReadOnlyFlag2() {
        return bcReadOnlyFlag2;
    }

    /**
     * Sets the value of the bcReadOnlyFlag2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setBCReadOnlyFlag2(QueryType value) {
        this.bcReadOnlyFlag2 = value;
    }

    /**
     * Gets the value of the cfgStateCode property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getCfgStateCode() {
        return cfgStateCode;
    }

    /**
     * Sets the value of the cfgStateCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setCfgStateCode(QueryType value) {
        this.cfgStateCode = value;
    }

    /**
     * Gets the value of the dataType property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getDataType() {
        return dataType;
    }

    /**
     * Sets the value of the dataType property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setDataType(QueryType value) {
        this.dataType = value;
    }

    /**
     * Gets the value of the dateValue property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getDateValue() {
        return dateValue;
    }

    /**
     * Sets the value of the dateValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setDateValue(QueryType value) {
        this.dateValue = value;
    }

    /**
     * Gets the value of the description2 property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getDescription2() {
        return description2;
    }

    /**
     * Sets the value of the description2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setDescription2(QueryType value) {
        this.description2 = value;
    }

    /**
     * Gets the value of the displayName property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getDisplayName() {
        return displayName;
    }

    /**
     * Sets the value of the displayName property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setDisplayName(QueryType value) {
        this.displayName = value;
    }

    /**
     * Gets the value of the hidden property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getHidden() {
        return hidden;
    }

    /**
     * Sets the value of the hidden property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setHidden(QueryType value) {
        this.hidden = value;
    }

    /**
     * Gets the value of the integrationId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getIntegrationId() {
        return integrationId;
    }

    /**
     * Sets the value of the integrationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setIntegrationId(QueryType value) {
        this.integrationId = value;
    }

    /**
     * Gets the value of the lovType property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getLOVType() {
        return lovType;
    }

    /**
     * Sets the value of the lovType property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setLOVType(QueryType value) {
        this.lovType = value;
    }

    /**
     * Gets the value of the mlov property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getMLOV() {
        return mlov;
    }

    /**
     * Sets the value of the mlov property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setMLOV(QueryType value) {
        this.mlov = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setName(QueryType value) {
        this.name = value;
    }

    /**
     * Gets the value of the numericValue property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getNumericValue() {
        return numericValue;
    }

    /**
     * Sets the value of the numericValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setNumericValue(QueryType value) {
        this.numericValue = value;
    }

    /**
     * Gets the value of the objectId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getObjectId() {
        return objectId;
    }

    /**
     * Sets the value of the objectId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setObjectId(QueryType value) {
        this.objectId = value;
    }

    /**
     * Gets the value of the orderItemStatus property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getOrderItemStatus() {
        return orderItemStatus;
    }

    /**
     * Sets the value of the orderItemStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setOrderItemStatus(QueryType value) {
        this.orderItemStatus = value;
    }

    /**
     * Gets the value of the parentComplexProductFlag property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getParentComplexProductFlag() {
        return parentComplexProductFlag;
    }

    /**
     * Sets the value of the parentComplexProductFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setParentComplexProductFlag(QueryType value) {
        this.parentComplexProductFlag = value;
    }

    /**
     * Gets the value of the previousDateValue property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPreviousDateValue() {
        return previousDateValue;
    }

    /**
     * Sets the value of the previousDateValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPreviousDateValue(QueryType value) {
        this.previousDateValue = value;
    }

    /**
     * Gets the value of the previousNumericValue property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPreviousNumericValue() {
        return previousNumericValue;
    }

    /**
     * Sets the value of the previousNumericValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPreviousNumericValue(QueryType value) {
        this.previousNumericValue = value;
    }

    /**
     * Gets the value of the previousTextValue property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPreviousTextValue() {
        return previousTextValue;
    }

    /**
     * Sets the value of the previousTextValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPreviousTextValue(QueryType value) {
        this.previousTextValue = value;
    }

    /**
     * Gets the value of the previousValue property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPreviousValue() {
        return previousValue;
    }

    /**
     * Sets the value of the previousValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPreviousValue(QueryType value) {
        this.previousValue = value;
    }

    /**
     * Gets the value of the readOnly property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getReadOnly() {
        return readOnly;
    }

    /**
     * Sets the value of the readOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setReadOnly(QueryType value) {
        this.readOnly = value;
    }

    /**
     * Gets the value of the required property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getRequired() {
        return required;
    }

    /**
     * Sets the value of the required property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setRequired(QueryType value) {
        this.required = value;
    }

    /**
     * Gets the value of the sequence property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getSequence() {
        return sequence;
    }

    /**
     * Sets the value of the sequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setSequence(QueryType value) {
        this.sequence = value;
    }

    /**
     * Gets the value of the textValue property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getTextValue() {
        return textValue;
    }

    /**
     * Sets the value of the textValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setTextValue(QueryType value) {
        this.textValue = value;
    }

    /**
     * Gets the value of the unitofMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getUnitofMeasure() {
        return unitofMeasure;
    }

    /**
     * Sets the value of the unitofMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setUnitofMeasure(QueryType value) {
        this.unitofMeasure = value;
    }

    /**
     * Gets the value of the validation property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getValidation() {
        return validation;
    }

    /**
     * Sets the value of the validation property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setValidation(QueryType value) {
        this.validation = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setValue(QueryType value) {
        this.value = value;
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
