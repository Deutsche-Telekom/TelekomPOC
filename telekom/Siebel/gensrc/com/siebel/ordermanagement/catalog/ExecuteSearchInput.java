
package com.siebel.ordermanagement.catalog;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.siebel.ordermanagement.catalog.data.catalogcontext.ListOfContext;
import com.siebel.ordermanagement.catalog.data.product.ListOfProduct;
import com.siebel.ordermanagement.catalog.data.productclassattributes.ListOfProductClassAttributes;


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
 *         &lt;element name="ProductSearchSpec" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PriceSearchExpression" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{http://siebel.com/OrderManagement/Catalog/Data/ProductClassAttributes}ListOfProductClassAttributes" minOccurs="0"/>
 *         &lt;element ref="{http://siebel.com/OrderManagement/Catalog/Data/CatalogContext}ListOfContext" minOccurs="0"/>
 *         &lt;element name="ContextMode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ResultSize" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PricingMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{http://siebel.com/OrderManagement/Catalog/Data/Product}ListOfProduct" minOccurs="0"/>
 *         &lt;element name="SearchOption" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "productSearchSpec",
    "priceSearchExpression",
    "listOfProductClassAttributes",
    "listOfContext",
    "contextMode",
    "resultSize",
    "pricingMode",
    "listOfProduct",
    "searchOption"
})
@XmlRootElement(name = "ExecuteSearch_Input")
public class ExecuteSearchInput
    implements Serializable
{

    @XmlElement(name = "EligibilityMode")
    protected String eligibilityMode;
    @XmlElement(name = "ProductSearchSpec")
    protected String productSearchSpec;
    @XmlElement(name = "PriceSearchExpression")
    protected String priceSearchExpression;
    @XmlElement(name = "ListOfProductClassAttributes", namespace = "http://siebel.com/OrderManagement/Catalog/Data/ProductClassAttributes")
    protected ListOfProductClassAttributes listOfProductClassAttributes;
    @XmlElement(name = "ListOfContext", namespace = "http://siebel.com/OrderManagement/Catalog/Data/CatalogContext")
    protected ListOfContext listOfContext;
    @XmlElement(name = "ContextMode", required = true)
    protected String contextMode;
    @XmlElement(name = "ResultSize")
    protected String resultSize;
    @XmlElement(name = "PricingMode")
    protected String pricingMode;
    @XmlElement(name = "ListOfProduct", namespace = "http://siebel.com/OrderManagement/Catalog/Data/Product")
    protected ListOfProduct listOfProduct;
    @XmlElement(name = "SearchOption")
    protected String searchOption;

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
     * Gets the value of the productSearchSpec property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductSearchSpec() {
        return productSearchSpec;
    }

    /**
     * Sets the value of the productSearchSpec property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductSearchSpec(String value) {
        this.productSearchSpec = value;
    }

    /**
     * Gets the value of the priceSearchExpression property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriceSearchExpression() {
        return priceSearchExpression;
    }

    /**
     * Sets the value of the priceSearchExpression property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriceSearchExpression(String value) {
        this.priceSearchExpression = value;
    }

    /**
     * Gets the value of the listOfProductClassAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfProductClassAttributes }
     *     
     */
    public ListOfProductClassAttributes getListOfProductClassAttributes() {
        return listOfProductClassAttributes;
    }

    /**
     * Sets the value of the listOfProductClassAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfProductClassAttributes }
     *     
     */
    public void setListOfProductClassAttributes(ListOfProductClassAttributes value) {
        this.listOfProductClassAttributes = value;
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
     * Gets the value of the resultSize property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResultSize() {
        return resultSize;
    }

    /**
     * Sets the value of the resultSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResultSize(String value) {
        this.resultSize = value;
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

    /**
     * Gets the value of the searchOption property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchOption() {
        return searchOption;
    }

    /**
     * Sets the value of the searchOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchOption(String value) {
        this.searchOption = value;
    }

}
