
package com.siebel.ordermanagement.catalog;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.siebel.ordermanagement.catalog.data.catalogcontext.ListOfContext;
import com.siebel.ordermanagement.catalog.data.udspublishcatalog.query.ListOfUDSPublishCatalogQuery;


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
 *         &lt;element name="NamedSearchSpec" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{http://siebel.com/OrderManagement/Catalog/Data/UDSPublishCatalog/Query}ListOfUDSPublishCatalog" minOccurs="0"/>
 *         &lt;element ref="{http://siebel.com/OrderManagement/Catalog/Data/CatalogContext}ListOfContext" minOccurs="0"/>
 *         &lt;element name="ContextMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PricingMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LOVLanguageMode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ViewMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "namedSearchSpec",
    "listOfUDSPublishCatalog",
    "listOfContext",
    "contextMode",
    "pricingMode",
    "lovLanguageMode",
    "viewMode"
})
@XmlRootElement(name = "CatalogQueryPage_Input")
public class CatalogQueryPageInput
    implements Serializable
{

    @XmlElement(name = "EligibilityMode")
    protected String eligibilityMode;
    @XmlElement(name = "NamedSearchSpec")
    protected String namedSearchSpec;
    @XmlElement(name = "ListOfUDSPublishCatalog", namespace = "http://siebel.com/OrderManagement/Catalog/Data/UDSPublishCatalog/Query")
    protected ListOfUDSPublishCatalogQuery listOfUDSPublishCatalog;
    @XmlElement(name = "ListOfContext", namespace = "http://siebel.com/OrderManagement/Catalog/Data/CatalogContext")
    protected ListOfContext listOfContext;
    @XmlElement(name = "ContextMode")
    protected String contextMode;
    @XmlElement(name = "PricingMode")
    protected String pricingMode;
    @XmlElement(name = "LOVLanguageMode", required = true)
    protected String lovLanguageMode;
    @XmlElement(name = "ViewMode")
    protected String viewMode;

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
     * Gets the value of the namedSearchSpec property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNamedSearchSpec() {
        return namedSearchSpec;
    }

    /**
     * Sets the value of the namedSearchSpec property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNamedSearchSpec(String value) {
        this.namedSearchSpec = value;
    }

    /**
     * Gets the value of the listOfUDSPublishCatalog property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfUDSPublishCatalogQuery }
     *     
     */
    public ListOfUDSPublishCatalogQuery getListOfUDSPublishCatalog() {
        return listOfUDSPublishCatalog;
    }

    /**
     * Sets the value of the listOfUDSPublishCatalog property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfUDSPublishCatalogQuery }
     *     
     */
    public void setListOfUDSPublishCatalog(ListOfUDSPublishCatalogQuery value) {
        this.listOfUDSPublishCatalog = value;
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
     * Gets the value of the lovLanguageMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLOVLanguageMode() {
        return lovLanguageMode;
    }

    /**
     * Sets the value of the lovLanguageMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLOVLanguageMode(String value) {
        this.lovLanguageMode = value;
    }

    /**
     * Gets the value of the viewMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getViewMode() {
        return viewMode;
    }

    /**
     * Sets the value of the viewMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setViewMode(String value) {
        this.viewMode = value;
    }

}
