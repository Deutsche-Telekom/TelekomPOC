
package com.siebel.ordermanagement.catalog;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.siebel.ordermanagement.catalog.data.searchableproductclass.ListOfSearchableProductClass;


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
 *         &lt;element name="LookupFromCache" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MaximumAttributes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{http://siebel.com/OrderManagement/Catalog/Data/SearchableProductClass}ListOfSearchableProductClass" minOccurs="0"/>
 *         &lt;element name="NoAllOptionInLOVDomainValues" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FieldNameClassId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "lookupFromCache",
    "maximumAttributes",
    "listOfSearchableProductClass",
    "noAllOptionInLOVDomainValues",
    "fieldNameClassId"
})
@XmlRootElement(name = "GetSearchParameters_Input")
public class GetSearchParametersInput
    implements Serializable
{

    @XmlElement(name = "LookupFromCache")
    protected String lookupFromCache;
    @XmlElement(name = "MaximumAttributes")
    protected String maximumAttributes;
    @XmlElement(name = "ListOfSearchableProductClass", namespace = "http://siebel.com/OrderManagement/Catalog/Data/SearchableProductClass")
    protected ListOfSearchableProductClass listOfSearchableProductClass;
    @XmlElement(name = "NoAllOptionInLOVDomainValues")
    protected String noAllOptionInLOVDomainValues;
    @XmlElement(name = "FieldNameClassId")
    protected String fieldNameClassId;

    /**
     * Gets the value of the lookupFromCache property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLookupFromCache() {
        return lookupFromCache;
    }

    /**
     * Sets the value of the lookupFromCache property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLookupFromCache(String value) {
        this.lookupFromCache = value;
    }

    /**
     * Gets the value of the maximumAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumAttributes() {
        return maximumAttributes;
    }

    /**
     * Sets the value of the maximumAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumAttributes(String value) {
        this.maximumAttributes = value;
    }

    /**
     * Gets the value of the listOfSearchableProductClass property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfSearchableProductClass }
     *     
     */
    public ListOfSearchableProductClass getListOfSearchableProductClass() {
        return listOfSearchableProductClass;
    }

    /**
     * Sets the value of the listOfSearchableProductClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfSearchableProductClass }
     *     
     */
    public void setListOfSearchableProductClass(ListOfSearchableProductClass value) {
        this.listOfSearchableProductClass = value;
    }

    /**
     * Gets the value of the noAllOptionInLOVDomainValues property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoAllOptionInLOVDomainValues() {
        return noAllOptionInLOVDomainValues;
    }

    /**
     * Sets the value of the noAllOptionInLOVDomainValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoAllOptionInLOVDomainValues(String value) {
        this.noAllOptionInLOVDomainValues = value;
    }

    /**
     * Gets the value of the fieldNameClassId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFieldNameClassId() {
        return fieldNameClassId;
    }

    /**
     * Sets the value of the fieldNameClassId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFieldNameClassId(String value) {
        this.fieldNameClassId = value;
    }

}
