
package com.siebel.ordermanagement.promotion;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.siebel.ordermanagement.catalog.data.product.ListOfProduct;
import com.siebel.ordermanagement.promotion.data.ListOfPromotion;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Error_spcCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Error_spcMessage" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element ref="{http://siebel.com/OrderManagement/Promotion/Data}ListOfPromotion"/>
 *         &lt;element ref="{http://siebel.com/OrderManagement/Catalog/Data/Product}ListOfProduct"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "errorSpcCode",
    "errorSpcMessage",
    "listOfPromotion",
    "listOfProduct"
})
@XmlRootElement(name = "GetProductPromotionDefinition_Output")
public class GetProductPromotionDefinitionOutput
    implements Serializable
{

    @XmlElement(name = "Error_spcCode", required = true)
    protected String errorSpcCode;
    @XmlElement(name = "Error_spcMessage", required = true)
    protected String errorSpcMessage;
    @XmlElement(name = "ListOfPromotion", namespace = "http://siebel.com/OrderManagement/Promotion/Data", required = true)
    protected ListOfPromotion listOfPromotion;
    @XmlElement(name = "ListOfProduct", namespace = "http://siebel.com/OrderManagement/Catalog/Data/Product", required = true)
    protected ListOfProduct listOfProduct;

    /**
     * Gets the value of the errorSpcCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorSpcCode() {
        return errorSpcCode;
    }

    /**
     * Sets the value of the errorSpcCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorSpcCode(String value) {
        this.errorSpcCode = value;
    }

    /**
     * Gets the value of the errorSpcMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorSpcMessage() {
        return errorSpcMessage;
    }

    /**
     * Sets the value of the errorSpcMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorSpcMessage(String value) {
        this.errorSpcMessage = value;
    }

    /**
     * Gets the value of the listOfPromotion property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfPromotion }
     *     
     */
    public ListOfPromotion getListOfPromotion() {
        return listOfPromotion;
    }

    /**
     * Sets the value of the listOfPromotion property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfPromotion }
     *     
     */
    public void setListOfPromotion(ListOfPromotion value) {
        this.listOfPromotion = value;
    }

    /**
     * Gets the value of the listOfProduct property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfProduct }
     *     
     */
    public ListOfProduct getListOfProduct() {
        return listOfProduct;
    }

    /**
     * Sets the value of the listOfProduct property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfProduct }
     *     
     */
    public void setListOfProduct(ListOfProduct value) {
        this.listOfProduct = value;
    }

}
