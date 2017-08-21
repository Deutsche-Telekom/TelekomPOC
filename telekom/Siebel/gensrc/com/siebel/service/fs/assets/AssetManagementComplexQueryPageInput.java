
package com.siebel.service.fs.assets;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.siebel.xml.asset_management_complex_io.query.ListOfAssetQuery;


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
 *         &lt;element name="NamedSearchSpec" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{http://www.siebel.com/xml/Asset_Management_Complex_IO/Query}ListOfAsset" minOccurs="0"/>
 *         &lt;element name="ExecutionMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "namedSearchSpec",
    "listOfAsset",
    "executionMode",
    "lovLanguageMode",
    "viewMode"
})
@XmlRootElement(name = "AssetManagementComplexQueryPage_Input")
public class AssetManagementComplexQueryPageInput
    implements Serializable
{

    @XmlElement(name = "NamedSearchSpec")
    protected String namedSearchSpec;
    @XmlElement(name = "ListOfAsset", namespace = "http://www.siebel.com/xml/Asset_Management_Complex_IO/Query")
    protected ListOfAssetQuery listOfAsset;
    @XmlElement(name = "ExecutionMode")
    protected String executionMode;
    @XmlElement(name = "LOVLanguageMode", required = true)
    protected String lovLanguageMode;
    @XmlElement(name = "ViewMode")
    protected String viewMode;

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
     * Gets the value of the listOfAsset property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfAssetQuery }
     *     
     */
    public ListOfAssetQuery getListOfAsset() {
        return listOfAsset;
    }

    /**
     * Sets the value of the listOfAsset property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfAssetQuery }
     *     
     */
    public void setListOfAsset(ListOfAssetQuery value) {
        this.listOfAsset = value;
    }

    /**
     * Gets the value of the executionMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExecutionMode() {
        return executionMode;
    }

    /**
     * Sets the value of the executionMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExecutionMode(String value) {
        this.executionMode = value;
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
