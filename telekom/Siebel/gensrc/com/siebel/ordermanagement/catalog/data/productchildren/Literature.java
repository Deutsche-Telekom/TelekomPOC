
package com.siebel.ordermanagement.catalog.data.productchildren;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Literature complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Literature">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Updated" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IntegrationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Internal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LitFileAutoUpdFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LitFileDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LitFileExt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LitFileName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LitFileSize" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Name2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SalesToolType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReleaseDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExpirationDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WebDisplay" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Synopsis" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "Literature", propOrder = {
    "updated",
    "description",
    "integrationId",
    "internal",
    "litFileAutoUpdFlg",
    "litFileDate",
    "litFileExt",
    "litFileName",
    "litFileSize",
    "name2",
    "salesToolType",
    "releaseDate",
    "expirationDate",
    "webDisplay",
    "synopsis"
})
public class Literature
    implements Serializable
{

    @XmlElement(name = "Updated")
    protected String updated;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "IntegrationId")
    protected String integrationId;
    @XmlElement(name = "Internal")
    protected String internal;
    @XmlElement(name = "LitFileAutoUpdFlg")
    protected String litFileAutoUpdFlg;
    @XmlElement(name = "LitFileDate")
    protected String litFileDate;
    @XmlElement(name = "LitFileExt")
    protected String litFileExt;
    @XmlElement(name = "LitFileName")
    protected String litFileName;
    @XmlElement(name = "LitFileSize")
    protected String litFileSize;
    @XmlElement(name = "Name2")
    protected String name2;
    @XmlElement(name = "SalesToolType")
    protected String salesToolType;
    @XmlElement(name = "ReleaseDate")
    protected String releaseDate;
    @XmlElement(name = "ExpirationDate")
    protected String expirationDate;
    @XmlElement(name = "WebDisplay")
    protected String webDisplay;
    @XmlElement(name = "Synopsis")
    protected String synopsis;
    @XmlAttribute
    protected String operation;
    @XmlAttribute
    protected String searchspec;

    /**
     * Gets the value of the updated property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpdated() {
        return updated;
    }

    /**
     * Sets the value of the updated property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpdated(String value) {
        this.updated = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
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
     * Gets the value of the internal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternal() {
        return internal;
    }

    /**
     * Sets the value of the internal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternal(String value) {
        this.internal = value;
    }

    /**
     * Gets the value of the litFileAutoUpdFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLitFileAutoUpdFlg() {
        return litFileAutoUpdFlg;
    }

    /**
     * Sets the value of the litFileAutoUpdFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLitFileAutoUpdFlg(String value) {
        this.litFileAutoUpdFlg = value;
    }

    /**
     * Gets the value of the litFileDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLitFileDate() {
        return litFileDate;
    }

    /**
     * Sets the value of the litFileDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLitFileDate(String value) {
        this.litFileDate = value;
    }

    /**
     * Gets the value of the litFileExt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLitFileExt() {
        return litFileExt;
    }

    /**
     * Sets the value of the litFileExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLitFileExt(String value) {
        this.litFileExt = value;
    }

    /**
     * Gets the value of the litFileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLitFileName() {
        return litFileName;
    }

    /**
     * Sets the value of the litFileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLitFileName(String value) {
        this.litFileName = value;
    }

    /**
     * Gets the value of the litFileSize property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLitFileSize() {
        return litFileSize;
    }

    /**
     * Sets the value of the litFileSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLitFileSize(String value) {
        this.litFileSize = value;
    }

    /**
     * Gets the value of the name2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName2() {
        return name2;
    }

    /**
     * Sets the value of the name2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName2(String value) {
        this.name2 = value;
    }

    /**
     * Gets the value of the salesToolType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesToolType() {
        return salesToolType;
    }

    /**
     * Sets the value of the salesToolType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesToolType(String value) {
        this.salesToolType = value;
    }

    /**
     * Gets the value of the releaseDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReleaseDate() {
        return releaseDate;
    }

    /**
     * Sets the value of the releaseDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReleaseDate(String value) {
        this.releaseDate = value;
    }

    /**
     * Gets the value of the expirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpirationDate() {
        return expirationDate;
    }

    /**
     * Sets the value of the expirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpirationDate(String value) {
        this.expirationDate = value;
    }

    /**
     * Gets the value of the webDisplay property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWebDisplay() {
        return webDisplay;
    }

    /**
     * Sets the value of the webDisplay property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWebDisplay(String value) {
        this.webDisplay = value;
    }

    /**
     * Gets the value of the synopsis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSynopsis() {
        return synopsis;
    }

    /**
     * Sets the value of the synopsis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSynopsis(String value) {
        this.synopsis = value;
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
