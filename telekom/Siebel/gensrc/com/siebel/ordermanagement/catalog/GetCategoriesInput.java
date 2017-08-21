
package com.siebel.ordermanagement.catalog;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.siebel.ordermanagement.catalog.data.categories.ListOfCategory;


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
 *         &lt;element ref="{http://siebel.com/OrderManagement/Catalog/Data/Categories}ListOfCategory" minOccurs="0"/>
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
    "listOfCategory"
})
@XmlRootElement(name = "GetCategories_Input")
public class GetCategoriesInput
    implements Serializable
{

    @XmlElement(name = "ListOfCategory", namespace = "http://siebel.com/OrderManagement/Catalog/Data/Categories")
    protected ListOfCategory listOfCategory;

    /**
     * Gets the value of the listOfCategory property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfCategory }
     *     
     */
    public ListOfCategory getListOfCategory() {
        return listOfCategory;
    }

    /**
     * Sets the value of the listOfCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfCategory }
     *     
     */
    public void setListOfCategory(ListOfCategory value) {
        this.listOfCategory = value;
    }

}
