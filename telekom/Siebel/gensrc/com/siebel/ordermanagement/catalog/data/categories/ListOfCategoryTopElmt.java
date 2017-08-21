
package com.siebel.ordermanagement.catalog.data.categories;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListOfCategoryTopElmt complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListOfCategoryTopElmt">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ListOfCategory" type="{http://siebel.com/OrderManagement/Catalog/Data/Categories}ListOfCategory"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfCategoryTopElmt", propOrder = {
    "listOfCategory"
})
public class ListOfCategoryTopElmt
    implements Serializable
{

    @XmlElement(name = "ListOfCategory", required = true)
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
