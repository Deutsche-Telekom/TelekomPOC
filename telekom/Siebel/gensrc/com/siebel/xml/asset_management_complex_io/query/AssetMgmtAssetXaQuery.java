
package com.siebel.xml.asset_management_complex_io.query;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssetMgmt-AssetXaQuery complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AssetMgmt-AssetXaQuery">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://www.siebel.com/xml/Asset_Management_Complex_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="DataType" type="{http://www.siebel.com/xml/Asset_Management_Complex_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.siebel.com/xml/Asset_Management_Complex_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="DisplayName" type="{http://www.siebel.com/xml/Asset_Management_Complex_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="Hidden" type="{http://www.siebel.com/xml/Asset_Management_Complex_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="Name2" type="{http://www.siebel.com/xml/Asset_Management_Complex_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="ReadOnly" type="{http://www.siebel.com/xml/Asset_Management_Complex_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="Required" type="{http://www.siebel.com/xml/Asset_Management_Complex_IO/Query}queryType" minOccurs="0"/>
 *         &lt;element name="Value" type="{http://www.siebel.com/xml/Asset_Management_Complex_IO/Query}queryType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="searchspec" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssetMgmt-AssetXaQuery", propOrder = {
    "id",
    "dataType",
    "description",
    "displayName",
    "hidden",
    "name2",
    "readOnly",
    "required",
    "value"
})
public class AssetMgmtAssetXaQuery
    implements Serializable
{

    @XmlElement(name = "Id")
    protected QueryType id;
    @XmlElement(name = "DataType")
    protected QueryType dataType;
    @XmlElement(name = "Description")
    protected QueryType description;
    @XmlElement(name = "DisplayName")
    protected QueryType displayName;
    @XmlElement(name = "Hidden")
    protected QueryType hidden;
    @XmlElement(name = "Name2")
    protected QueryType name2;
    @XmlElement(name = "ReadOnly")
    protected QueryType readOnly;
    @XmlElement(name = "Required")
    protected QueryType required;
    @XmlElement(name = "Value")
    protected QueryType value;
    @XmlAttribute
    protected String searchspec;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setId(QueryType value) {
        this.id = value;
    }

    /**
     * Gets the value of the dataType property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getDataType() {
        return dataType;
    }

    /**
     * Sets the value of the dataType property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setDataType(QueryType value) {
        this.dataType = value;
    }

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
     * Gets the value of the displayName property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getDisplayName() {
        return displayName;
    }

    /**
     * Sets the value of the displayName property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setDisplayName(QueryType value) {
        this.displayName = value;
    }

    /**
     * Gets the value of the hidden property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getHidden() {
        return hidden;
    }

    /**
     * Sets the value of the hidden property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setHidden(QueryType value) {
        this.hidden = value;
    }

    /**
     * Gets the value of the name2 property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getName2() {
        return name2;
    }

    /**
     * Sets the value of the name2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setName2(QueryType value) {
        this.name2 = value;
    }

    /**
     * Gets the value of the readOnly property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getReadOnly() {
        return readOnly;
    }

    /**
     * Sets the value of the readOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setReadOnly(QueryType value) {
        this.readOnly = value;
    }

    /**
     * Gets the value of the required property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getRequired() {
        return required;
    }

    /**
     * Sets the value of the required property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setRequired(QueryType value) {
        this.required = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setValue(QueryType value) {
        this.value = value;
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
