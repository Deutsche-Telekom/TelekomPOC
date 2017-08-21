
package com.siebel.ordermanagement.catalog.data.udspublishcatalog.query;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProductAttributeQuery complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductAttributeQuery">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DataType" type="{http://siebel.com/OrderManagement/Catalog/Data/UDSPublishCatalog/Query}queryType" minOccurs="0"/>
 *         &lt;element name="DefaultValue" type="{http://siebel.com/OrderManagement/Catalog/Data/UDSPublishCatalog/Query}queryType" minOccurs="0"/>
 *         &lt;element name="DisplayName" type="{http://siebel.com/OrderManagement/Catalog/Data/UDSPublishCatalog/Query}queryType" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://siebel.com/OrderManagement/Catalog/Data/UDSPublishCatalog/Query}queryType" minOccurs="0"/>
 *         &lt;element name="Value" type="{http://siebel.com/OrderManagement/Catalog/Data/UDSPublishCatalog/Query}queryType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductAttributeQuery", propOrder = {
    "dataType",
    "defaultValue",
    "displayName",
    "name",
    "value"
})
public class ProductAttributeQuery
    implements Serializable
{

    @XmlElement(name = "DataType")
    protected QueryType dataType;
    @XmlElement(name = "DefaultValue")
    protected QueryType defaultValue;
    @XmlElement(name = "DisplayName")
    protected QueryType displayName;
    @XmlElement(name = "Name")
    protected QueryType name;
    @XmlElement(name = "Value")
    protected QueryType value;

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
     * Gets the value of the defaultValue property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getDefaultValue() {
        return defaultValue;
    }

    /**
     * Sets the value of the defaultValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setDefaultValue(QueryType value) {
        this.defaultValue = value;
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

}
