
package com.siebel.ordermanagement.catalog.data.productclassattributes;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListOfProductClassAttributes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListOfProductClassAttributes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SearchableProductClass" type="{http://siebel.com/OrderManagement/Catalog/Data/ProductClassAttributes}SearchableProductClass" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfProductClassAttributes", propOrder = {
    "searchableProductClass"
})
public class ListOfProductClassAttributes
    implements Serializable
{

    @XmlElement(name = "SearchableProductClass")
    protected List<SearchableProductClass> searchableProductClass;

    /**
     * Gets the value of the searchableProductClass property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the searchableProductClass property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSearchableProductClass().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchableProductClass }
     * 
     * 
     */
    public List<SearchableProductClass> getSearchableProductClass() {
        if (searchableProductClass == null) {
            searchableProductClass = new ArrayList<SearchableProductClass>();
        }
        return this.searchableProductClass;
    }

}
