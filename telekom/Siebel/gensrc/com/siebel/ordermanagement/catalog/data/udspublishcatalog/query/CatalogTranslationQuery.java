
package com.siebel.ordermanagement.catalog.data.udspublishcatalog.query;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CatalogTranslationQuery complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CatalogTranslationQuery">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Description" type="{http://siebel.com/OrderManagement/Catalog/Data/UDSPublishCatalog/Query}queryType" minOccurs="0"/>
 *         &lt;element name="LanguageCode" type="{http://siebel.com/OrderManagement/Catalog/Data/UDSPublishCatalog/Query}queryType" minOccurs="0"/>
 *         &lt;element name="LanguageName" type="{http://siebel.com/OrderManagement/Catalog/Data/UDSPublishCatalog/Query}queryType" minOccurs="0"/>
 *         &lt;element name="CatalogId" type="{http://siebel.com/OrderManagement/Catalog/Data/UDSPublishCatalog/Query}queryType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CatalogTranslationQuery", propOrder = {
    "description",
    "languageCode",
    "languageName",
    "catalogId"
})
public class CatalogTranslationQuery
    implements Serializable
{

    @XmlElement(name = "Description")
    protected QueryType description;
    @XmlElement(name = "LanguageCode")
    protected QueryType languageCode;
    @XmlElement(name = "LanguageName")
    protected QueryType languageName;
    @XmlElement(name = "CatalogId")
    protected QueryType catalogId;

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setDescription(QueryType value) {
        this.description = value;
    }

    /**
     * Gets the value of the languageCode property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getLanguageCode() {
        return languageCode;
    }

    /**
     * Sets the value of the languageCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setLanguageCode(QueryType value) {
        this.languageCode = value;
    }

    /**
     * Gets the value of the languageName property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getLanguageName() {
        return languageName;
    }

    /**
     * Sets the value of the languageName property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setLanguageName(QueryType value) {
        this.languageName = value;
    }

    /**
     * Gets the value of the catalogId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getCatalogId() {
        return catalogId;
    }

    /**
     * Sets the value of the catalogId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setCatalogId(QueryType value) {
        this.catalogId = value;
    }

}
