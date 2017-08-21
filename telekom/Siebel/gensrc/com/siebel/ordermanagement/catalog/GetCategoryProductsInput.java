
package com.siebel.ordermanagement.catalog;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.siebel.ordermanagement.catalog.data.catalogcontext.ListOfContext;
import com.siebel.ordermanagement.catalog.data.categoryproduct.ListOfCategoryProduct;


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
 *         &lt;element name="EligibilityMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{http://siebel.com/OrderManagement/Catalog/Data/CatalogContext}ListOfContext" minOccurs="0"/>
 *         &lt;element name="ContextMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PricingMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{http://siebel.com/OrderManagement/Catalog/Data/CategoryProduct}ListOfCategoryProduct" minOccurs="0"/>
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
    "eligibilityMode",
    "listOfContext",
    "contextMode",
    "pricingMode",
    "listOfCategoryProduct"
})
@XmlRootElement(name = "GetCategoryProducts_Input")
public class GetCategoryProductsInput
    implements Serializable
{

    @XmlElement(name = "EligibilityMode")
    protected String eligibilityMode;
    @XmlElement(name = "ListOfContext", namespace = "http://siebel.com/OrderManagement/Catalog/Data/CatalogContext")
    protected ListOfContext listOfContext;
    @XmlElement(name = "ContextMode")
    protected String contextMode;
    @XmlElement(name = "PricingMode")
    protected String pricingMode;
    @XmlElement(name = "ListOfCategoryProduct", namespace = "http://siebel.com/OrderManagement/Catalog/Data/CategoryProduct")
    protected ListOfCategoryProduct listOfCategoryProduct;

    /**
     * Gets the value of the eligibilityMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEligibilityMode() {
        return eligibilityMode;
    }

    /**
     * Sets the value of the eligibilityMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEligibilityMode(String value) {
        this.eligibilityMode = value;
    }

    /**
     * Gets the value of the listOfContext property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfContext }
     *     
     */
    public ListOfContext getListOfContext() {
        return listOfContext;
    }

    /**
     * Sets the value of the listOfContext property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfContext }
     *     
     */
    public void setListOfContext(ListOfContext value) {
        this.listOfContext = value;
    }

    /**
     * Gets the value of the contextMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContextMode() {
        return contextMode;
    }

    /**
     * Sets the value of the contextMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContextMode(String value) {
        this.contextMode = value;
    }

    /**
     * Gets the value of the pricingMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPricingMode() {
        return pricingMode;
    }

    /**
     * Sets the value of the pricingMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPricingMode(String value) {
        this.pricingMode = value;
    }

    /**
     * Gets the value of the listOfCategoryProduct property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfCategoryProduct }
     *     
     */
    public ListOfCategoryProduct getListOfCategoryProduct() {
        return listOfCategoryProduct;
    }

    /**
     * Sets the value of the listOfCategoryProduct property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfCategoryProduct }
     *     
     */
    public void setListOfCategoryProduct(ListOfCategoryProduct value) {
        this.listOfCategoryProduct = value;
    }

}
