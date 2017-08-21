
package com.siebel.ordermanagement.catalog.data.categoryproduct;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListOfCategoryProduct complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListOfCategoryProduct">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CatalogCategory" type="{http://siebel.com/OrderManagement/Catalog/Data/CategoryProduct}CatalogCategory" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfCategoryProduct", propOrder = {
    "catalogCategory"
})
public class ListOfCategoryProduct
    implements Serializable
{

    @XmlElement(name = "CatalogCategory")
    protected List<CatalogCategory> catalogCategory;

    /**
     * Gets the value of the catalogCategory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the catalogCategory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCatalogCategory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CatalogCategory }
     * 
     * 
     */
    public List<CatalogCategory> getCatalogCategory() {
        if (catalogCategory == null) {
            catalogCategory = new ArrayList<CatalogCategory>();
        }
        return this.catalogCategory;
    }

}
