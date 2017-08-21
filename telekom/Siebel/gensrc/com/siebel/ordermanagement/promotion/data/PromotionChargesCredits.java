
package com.siebel.ordermanagement.promotion.data;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PromotionChargesCredits complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PromotionChargesCredits">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ChargeAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ChargeAmountCurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ChargeAmountExchangeDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Period" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProratePlanId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProratePlanName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StartLagPeriod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StartLagUOM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="operation" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="searchspec" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PromotionChargesCredits", propOrder = {
    "id",
    "chargeAmount",
    "chargeAmountCurrencyCode",
    "chargeAmountExchangeDate",
    "period",
    "proratePlanId",
    "proratePlanName",
    "startLagPeriod",
    "startLagUOM",
    "type"
})
public class PromotionChargesCredits
    implements Serializable
{

    @XmlElement(name = "Id")
    protected String id;
    @XmlElement(name = "ChargeAmount")
    protected String chargeAmount;
    @XmlElement(name = "ChargeAmountCurrencyCode")
    protected String chargeAmountCurrencyCode;
    @XmlElement(name = "ChargeAmountExchangeDate")
    protected String chargeAmountExchangeDate;
    @XmlElement(name = "Period")
    protected String period;
    @XmlElement(name = "ProratePlanId")
    protected String proratePlanId;
    @XmlElement(name = "ProratePlanName")
    protected String proratePlanName;
    @XmlElement(name = "StartLagPeriod")
    protected String startLagPeriod;
    @XmlElement(name = "StartLagUOM")
    protected String startLagUOM;
    @XmlElement(name = "Type")
    protected String type;
    @XmlAttribute
    protected String operation;
    @XmlAttribute
    protected String searchspec;

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
     * Gets the value of the chargeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChargeAmount() {
        return chargeAmount;
    }

    /**
     * Sets the value of the chargeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChargeAmount(String value) {
        this.chargeAmount = value;
    }

    /**
     * Gets the value of the chargeAmountCurrencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChargeAmountCurrencyCode() {
        return chargeAmountCurrencyCode;
    }

    /**
     * Sets the value of the chargeAmountCurrencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChargeAmountCurrencyCode(String value) {
        this.chargeAmountCurrencyCode = value;
    }

    /**
     * Gets the value of the chargeAmountExchangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChargeAmountExchangeDate() {
        return chargeAmountExchangeDate;
    }

    /**
     * Sets the value of the chargeAmountExchangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChargeAmountExchangeDate(String value) {
        this.chargeAmountExchangeDate = value;
    }

    /**
     * Gets the value of the period property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPeriod() {
        return period;
    }

    /**
     * Sets the value of the period property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPeriod(String value) {
        this.period = value;
    }

    /**
     * Gets the value of the proratePlanId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProratePlanId() {
        return proratePlanId;
    }

    /**
     * Sets the value of the proratePlanId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProratePlanId(String value) {
        this.proratePlanId = value;
    }

    /**
     * Gets the value of the proratePlanName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProratePlanName() {
        return proratePlanName;
    }

    /**
     * Sets the value of the proratePlanName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProratePlanName(String value) {
        this.proratePlanName = value;
    }

    /**
     * Gets the value of the startLagPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartLagPeriod() {
        return startLagPeriod;
    }

    /**
     * Sets the value of the startLagPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartLagPeriod(String value) {
        this.startLagPeriod = value;
    }

    /**
     * Gets the value of the startLagUOM property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartLagUOM() {
        return startLagUOM;
    }

    /**
     * Sets the value of the startLagUOM property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartLagUOM(String value) {
        this.startLagUOM = value;
    }

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
