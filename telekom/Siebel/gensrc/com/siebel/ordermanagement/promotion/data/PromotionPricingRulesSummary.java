
package com.siebel.ordermanagement.promotion.data;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PromotionPricingRulesSummary complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PromotionPricingRulesSummary">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MatrixRuleNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AdjustmentGroupId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AdjustmentType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AdjustmentValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ClassName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ClassVodNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProductId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ProductLine" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProductLineId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProductName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PromotionId2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExchangeDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PromotionPricingRulesSummary", propOrder = {
    "id",
    "matrixRuleNum",
    "adjustmentGroupId",
    "adjustmentType",
    "adjustmentValue",
    "className",
    "classVodNum",
    "productId",
    "productLine",
    "productLineId",
    "productName",
    "promotionId2",
    "type",
    "currencyCode",
    "exchangeDate"
})
public class PromotionPricingRulesSummary
    implements Serializable
{

    @XmlElement(name = "Id")
    protected String id;
    @XmlElement(name = "MatrixRuleNum")
    protected String matrixRuleNum;
    @XmlElement(name = "AdjustmentGroupId")
    protected String adjustmentGroupId;
    @XmlElement(name = "AdjustmentType")
    protected String adjustmentType;
    @XmlElement(name = "AdjustmentValue")
    protected String adjustmentValue;
    @XmlElement(name = "ClassName")
    protected String className;
    @XmlElement(name = "ClassVodNum")
    protected String classVodNum;
    @XmlElement(name = "ProductId", required = true)
    protected String productId;
    @XmlElement(name = "ProductLine")
    protected String productLine;
    @XmlElement(name = "ProductLineId")
    protected String productLineId;
    @XmlElement(name = "ProductName")
    protected String productName;
    @XmlElement(name = "PromotionId2", required = true)
    protected String promotionId2;
    @XmlElement(name = "Type")
    protected String type;
    @XmlElement(name = "CurrencyCode")
    protected String currencyCode;
    @XmlElement(name = "ExchangeDate")
    protected String exchangeDate;

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
     * Gets the value of the matrixRuleNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatrixRuleNum() {
        return matrixRuleNum;
    }

    /**
     * Sets the value of the matrixRuleNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatrixRuleNum(String value) {
        this.matrixRuleNum = value;
    }

    /**
     * Gets the value of the adjustmentGroupId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdjustmentGroupId() {
        return adjustmentGroupId;
    }

    /**
     * Sets the value of the adjustmentGroupId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdjustmentGroupId(String value) {
        this.adjustmentGroupId = value;
    }

    /**
     * Gets the value of the adjustmentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdjustmentType() {
        return adjustmentType;
    }

    /**
     * Sets the value of the adjustmentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdjustmentType(String value) {
        this.adjustmentType = value;
    }

    /**
     * Gets the value of the adjustmentValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdjustmentValue() {
        return adjustmentValue;
    }

    /**
     * Sets the value of the adjustmentValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdjustmentValue(String value) {
        this.adjustmentValue = value;
    }

    /**
     * Gets the value of the className property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassName() {
        return className;
    }

    /**
     * Sets the value of the className property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassName(String value) {
        this.className = value;
    }

    /**
     * Gets the value of the classVodNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassVodNum() {
        return classVodNum;
    }

    /**
     * Sets the value of the classVodNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassVodNum(String value) {
        this.classVodNum = value;
    }

    /**
     * Gets the value of the productId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductId() {
        return productId;
    }

    /**
     * Sets the value of the productId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductId(String value) {
        this.productId = value;
    }

    /**
     * Gets the value of the productLine property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductLine() {
        return productLine;
    }

    /**
     * Sets the value of the productLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductLine(String value) {
        this.productLine = value;
    }

    /**
     * Gets the value of the productLineId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductLineId() {
        return productLineId;
    }

    /**
     * Sets the value of the productLineId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductLineId(String value) {
        this.productLineId = value;
    }

    /**
     * Gets the value of the productName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductName() {
        return productName;
    }

    /**
     * Sets the value of the productName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductName(String value) {
        this.productName = value;
    }

    /**
     * Gets the value of the promotionId2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromotionId2() {
        return promotionId2;
    }

    /**
     * Sets the value of the promotionId2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromotionId2(String value) {
        this.promotionId2 = value;
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
     * Gets the value of the currencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Sets the value of the currencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyCode(String value) {
        this.currencyCode = value;
    }

    /**
     * Gets the value of the exchangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExchangeDate() {
        return exchangeDate;
    }

    /**
     * Sets the value of the exchangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExchangeDate(String value) {
        this.exchangeDate = value;
    }

}
