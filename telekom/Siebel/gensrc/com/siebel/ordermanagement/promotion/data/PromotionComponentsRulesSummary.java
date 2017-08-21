
package com.siebel.ordermanagement.promotion.data;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PromotionComponentsRulesSummary complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PromotionComponentsRulesSummary">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ClassName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ClassVodNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DefaultQuantity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IntegrationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MaximumQuantity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MinimumQuantity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProdId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProductLine" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProductLineId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProductName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PromotionId2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ListOfPromotionItemAttributeforImport" type="{http://siebel.com/OrderManagement/Promotion/Data}ListOfPromotionItemAttributeforImport" minOccurs="0"/>
 *         &lt;element name="ListOfPromotionProductComponentsMessages" type="{http://siebel.com/OrderManagement/Promotion/Data}ListOfPromotionProductComponentsMessages" minOccurs="0"/>
 *         &lt;element name="ListOfPromotionProductAggregate-DefaultProducts" type="{http://siebel.com/OrderManagement/Promotion/Data}ListOfPromotionProductAggregate-DefaultProducts" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PromotionComponentsRulesSummary", propOrder = {
    "id",
    "className",
    "classVodNum",
    "defaultQuantity",
    "integrationId",
    "maximumQuantity",
    "minimumQuantity",
    "prodId",
    "productLine",
    "productLineId",
    "productName",
    "promotionId2",
    "type",
    "listOfPromotionItemAttributeforImport",
    "listOfPromotionProductComponentsMessages",
    "listOfPromotionProductAggregateDefaultProducts"
})
public class PromotionComponentsRulesSummary
    implements Serializable
{

    @XmlElement(name = "Id")
    protected String id;
    @XmlElement(name = "ClassName")
    protected String className;
    @XmlElement(name = "ClassVodNum")
    protected String classVodNum;
    @XmlElement(name = "DefaultQuantity")
    protected String defaultQuantity;
    @XmlElement(name = "IntegrationId")
    protected String integrationId;
    @XmlElement(name = "MaximumQuantity")
    protected String maximumQuantity;
    @XmlElement(name = "MinimumQuantity")
    protected String minimumQuantity;
    @XmlElement(name = "ProdId")
    protected String prodId;
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
    @XmlElement(name = "ListOfPromotionItemAttributeforImport")
    protected ListOfPromotionItemAttributeforImport listOfPromotionItemAttributeforImport;
    @XmlElement(name = "ListOfPromotionProductComponentsMessages")
    protected ListOfPromotionProductComponentsMessages listOfPromotionProductComponentsMessages;
    @XmlElement(name = "ListOfPromotionProductAggregate-DefaultProducts")
    protected ListOfPromotionProductAggregateDefaultProducts listOfPromotionProductAggregateDefaultProducts;

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
     * Gets the value of the defaultQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultQuantity() {
        return defaultQuantity;
    }

    /**
     * Sets the value of the defaultQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultQuantity(String value) {
        this.defaultQuantity = value;
    }

    /**
     * Gets the value of the integrationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntegrationId() {
        return integrationId;
    }

    /**
     * Sets the value of the integrationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntegrationId(String value) {
        this.integrationId = value;
    }

    /**
     * Gets the value of the maximumQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumQuantity() {
        return maximumQuantity;
    }

    /**
     * Sets the value of the maximumQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumQuantity(String value) {
        this.maximumQuantity = value;
    }

    /**
     * Gets the value of the minimumQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinimumQuantity() {
        return minimumQuantity;
    }

    /**
     * Sets the value of the minimumQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinimumQuantity(String value) {
        this.minimumQuantity = value;
    }

    /**
     * Gets the value of the prodId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProdId() {
        return prodId;
    }

    /**
     * Sets the value of the prodId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProdId(String value) {
        this.prodId = value;
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
     * Gets the value of the listOfPromotionItemAttributeforImport property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfPromotionItemAttributeforImport }
     *     
     */
    public ListOfPromotionItemAttributeforImport getListOfPromotionItemAttributeforImport() {
        return listOfPromotionItemAttributeforImport;
    }

    /**
     * Sets the value of the listOfPromotionItemAttributeforImport property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfPromotionItemAttributeforImport }
     *     
     */
    public void setListOfPromotionItemAttributeforImport(ListOfPromotionItemAttributeforImport value) {
        this.listOfPromotionItemAttributeforImport = value;
    }

    /**
     * Gets the value of the listOfPromotionProductComponentsMessages property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfPromotionProductComponentsMessages }
     *     
     */
    public ListOfPromotionProductComponentsMessages getListOfPromotionProductComponentsMessages() {
        return listOfPromotionProductComponentsMessages;
    }

    /**
     * Sets the value of the listOfPromotionProductComponentsMessages property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfPromotionProductComponentsMessages }
     *     
     */
    public void setListOfPromotionProductComponentsMessages(ListOfPromotionProductComponentsMessages value) {
        this.listOfPromotionProductComponentsMessages = value;
    }

    /**
     * Gets the value of the listOfPromotionProductAggregateDefaultProducts property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfPromotionProductAggregateDefaultProducts }
     *     
     */
    public ListOfPromotionProductAggregateDefaultProducts getListOfPromotionProductAggregateDefaultProducts() {
        return listOfPromotionProductAggregateDefaultProducts;
    }

    /**
     * Sets the value of the listOfPromotionProductAggregateDefaultProducts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfPromotionProductAggregateDefaultProducts }
     *     
     */
    public void setListOfPromotionProductAggregateDefaultProducts(ListOfPromotionProductAggregateDefaultProducts value) {
        this.listOfPromotionProductAggregateDefaultProducts = value;
    }

}
