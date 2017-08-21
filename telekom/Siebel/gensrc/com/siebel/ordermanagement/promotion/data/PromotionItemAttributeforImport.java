
package com.siebel.ordermanagement.promotion.data;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PromotionItemAttributeforImport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PromotionItemAttributeforImport">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AttributeName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Condition" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PromotionItemId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ListOfPromotionItemAttributeValueforImport" type="{http://siebel.com/OrderManagement/Promotion/Data}ListOfPromotionItemAttributeValueforImport" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PromotionItemAttributeforImport", propOrder = {
    "id",
    "attributeName",
    "condition",
    "promotionItemId",
    "listOfPromotionItemAttributeValueforImport"
})
public class PromotionItemAttributeforImport
    implements Serializable
{

    @XmlElement(name = "Id")
    protected String id;
    @XmlElement(name = "AttributeName", required = true)
    protected String attributeName;
    @XmlElement(name = "Condition", required = true)
    protected String condition;
    @XmlElement(name = "PromotionItemId", required = true)
    protected String promotionItemId;
    @XmlElement(name = "ListOfPromotionItemAttributeValueforImport")
    protected ListOfPromotionItemAttributeValueforImport listOfPromotionItemAttributeValueforImport;

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
     * Gets the value of the attributeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttributeName() {
        return attributeName;
    }

    /**
     * Sets the value of the attributeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttributeName(String value) {
        this.attributeName = value;
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
     * Gets the value of the promotionItemId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromotionItemId() {
        return promotionItemId;
    }

    /**
     * Sets the value of the promotionItemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromotionItemId(String value) {
        this.promotionItemId = value;
    }

    /**
     * Gets the value of the listOfPromotionItemAttributeValueforImport property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfPromotionItemAttributeValueforImport }
     *     
     */
    public ListOfPromotionItemAttributeValueforImport getListOfPromotionItemAttributeValueforImport() {
        return listOfPromotionItemAttributeValueforImport;
    }

    /**
     * Sets the value of the listOfPromotionItemAttributeValueforImport property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfPromotionItemAttributeValueforImport }
     *     
     */
    public void setListOfPromotionItemAttributeValueforImport(ListOfPromotionItemAttributeValueforImport value) {
        this.listOfPromotionItemAttributeValueforImport = value;
    }

}
