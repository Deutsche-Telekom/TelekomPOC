
package com.siebel.ordermanagement.promotion;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.siebel.ordermanagement.catalog.data.catalogcontext.ListOfContext;


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
 *         &lt;element name="EligibilityMode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ProdPromRuleId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="LoadAllDomainFlag" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ContextMode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element ref="{http://siebel.com/OrderManagement/Catalog/Data/CatalogContext}ListOfContext"/>
 *         &lt;element name="PricingMode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="LoadDefaultDomainFlag" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ProdPromRuleType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ProdPromId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="LoadPromDefFlag" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "prodPromRuleId",
    "loadAllDomainFlag",
    "contextMode",
    "listOfContext",
    "pricingMode",
    "loadDefaultDomainFlag",
    "prodPromRuleType",
    "prodPromId",
    "loadPromDefFlag"
})
@XmlRootElement(name = "GetProductPromotionDefinition_Input")
public class GetProductPromotionDefinitionInput
    implements Serializable
{

    @XmlElement(name = "EligibilityMode", required = true)
    protected String eligibilityMode;
    @XmlElement(name = "ProdPromRuleId", required = true)
    protected String prodPromRuleId;
    @XmlElement(name = "LoadAllDomainFlag", required = true)
    protected String loadAllDomainFlag;
    @XmlElement(name = "ContextMode", required = true)
    protected String contextMode;
    @XmlElement(name = "ListOfContext", namespace = "http://siebel.com/OrderManagement/Catalog/Data/CatalogContext", required = true)
    protected ListOfContext listOfContext;
    @XmlElement(name = "PricingMode", required = true)
    protected String pricingMode;
    @XmlElement(name = "LoadDefaultDomainFlag", required = true)
    protected String loadDefaultDomainFlag;
    @XmlElement(name = "ProdPromRuleType", required = true)
    protected String prodPromRuleType;
    @XmlElement(name = "ProdPromId", required = true)
    protected String prodPromId;
    @XmlElement(name = "LoadPromDefFlag", required = true)
    protected String loadPromDefFlag;

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
     * Gets the value of the prodPromRuleId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProdPromRuleId() {
        return prodPromRuleId;
    }

    /**
     * Sets the value of the prodPromRuleId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProdPromRuleId(String value) {
        this.prodPromRuleId = value;
    }

    /**
     * Gets the value of the loadAllDomainFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoadAllDomainFlag() {
        return loadAllDomainFlag;
    }

    /**
     * Sets the value of the loadAllDomainFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoadAllDomainFlag(String value) {
        this.loadAllDomainFlag = value;
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
     * Gets the value of the loadDefaultDomainFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoadDefaultDomainFlag() {
        return loadDefaultDomainFlag;
    }

    /**
     * Sets the value of the loadDefaultDomainFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoadDefaultDomainFlag(String value) {
        this.loadDefaultDomainFlag = value;
    }

    /**
     * Gets the value of the prodPromRuleType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProdPromRuleType() {
        return prodPromRuleType;
    }

    /**
     * Sets the value of the prodPromRuleType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProdPromRuleType(String value) {
        this.prodPromRuleType = value;
    }

    /**
     * Gets the value of the prodPromId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProdPromId() {
        return prodPromId;
    }

    /**
     * Sets the value of the prodPromId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProdPromId(String value) {
        this.prodPromId = value;
    }

    /**
     * Gets the value of the loadPromDefFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoadPromDefFlag() {
        return loadPromDefFlag;
    }

    /**
     * Sets the value of the loadPromDefFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoadPromDefFlag(String value) {
        this.loadPromDefFlag = value;
    }

}
