
package com.siebel.ordermanagement.catalog.data.searchableproductclass;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListOfSearchableProductClassTopElmt complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListOfSearchableProductClassTopElmt">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ListOfSearchableProductClass" type="{http://siebel.com/OrderManagement/Catalog/Data/SearchableProductClass}ListOfSearchableProductClass"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfSearchableProductClassTopElmt", propOrder = {
    "listOfSearchableProductClass"
})
public class ListOfSearchableProductClassTopElmt
    implements Serializable
{

    @XmlElement(name = "ListOfSearchableProductClass", required = true)
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
