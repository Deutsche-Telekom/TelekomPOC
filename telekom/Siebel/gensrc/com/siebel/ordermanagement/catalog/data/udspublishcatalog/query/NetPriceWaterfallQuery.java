
package com.siebel.ordermanagement.catalog.data.udspublishcatalog.query;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NetPriceWaterfallQuery complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NetPriceWaterfallQuery">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Text" type="{http://siebel.com/OrderManagement/Catalog/Data/UDSPublishCatalog/Query}queryType" minOccurs="0"/>
 *         &lt;element name="Price" type="{http://siebel.com/OrderManagement/Catalog/Data/UDSPublishCatalog/Query}queryType" minOccurs="0"/>
 *         &lt;element name="CurrencyCode" type="{http://siebel.com/OrderManagement/Catalog/Data/UDSPublishCatalog/Query}queryType" minOccurs="0"/>
 *         &lt;element name="AdjustmentType" type="{http://siebel.com/OrderManagement/Catalog/Data/UDSPublishCatalog/Query}queryType" minOccurs="0"/>
 *         &lt;element name="AdjustmentAmount" type="{http://siebel.com/OrderManagement/Catalog/Data/UDSPublishCatalog/Query}queryType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetPriceWaterfallQuery", propOrder = {
    "text",
    "price",
    "currencyCode",
    "adjustmentType",
    "adjustmentAmount"
})
public class NetPriceWaterfallQuery
    implements Serializable
{

    @XmlElement(name = "Text")
    protected QueryType text;
    @XmlElement(name = "Price")
    protected QueryType price;
    @XmlElement(name = "CurrencyCode")
    protected QueryType currencyCode;
    @XmlElement(name = "AdjustmentType")
    protected QueryType adjustmentType;
    @XmlElement(name = "AdjustmentAmount")
    protected QueryType adjustmentAmount;

    /**
     * Gets the value of the text property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getText() {
        return text;
    }

    /**
     * Sets the value of the text property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setText(QueryType value) {
        this.text = value;
    }

    /**
     * Gets the value of the price property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setPrice(QueryType value) {
        this.price = value;
    }

    /**
     * Gets the value of the currencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Sets the value of the currencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setCurrencyCode(QueryType value) {
        this.currencyCode = value;
    }

    /**
     * Gets the value of the adjustmentType property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getAdjustmentType() {
        return adjustmentType;
    }

    /**
     * Sets the value of the adjustmentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setAdjustmentType(QueryType value) {
        this.adjustmentType = value;
    }

    /**
     * Gets the value of the adjustmentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getAdjustmentAmount() {
        return adjustmentAmount;
    }

    /**
     * Sets the value of the adjustmentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setAdjustmentAmount(QueryType value) {
        this.adjustmentAmount = value;
    }

}
