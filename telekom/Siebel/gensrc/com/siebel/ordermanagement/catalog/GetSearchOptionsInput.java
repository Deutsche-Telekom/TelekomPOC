
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
 *         &lt;element ref="{http://siebel.com/OrderManagement/Catalog/Data/SearchableProductClass}ListOfSearchableProductClass" minOccurs="0"/>
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
    "listOfSearchableProductClass"
})
@XmlRootElement(name = "GetSearchOptions_Input")
public class GetSearchOptionsInput
    implements Serializable
{

    @XmlElement(name = "ListOfSearchableProductClass", namespace = "http://siebel.com/OrderManagement/Catalog/Data/SearchableProductClass")
    protected ListOfSearchableProductClass listOfSearchableProductClass;

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

}
