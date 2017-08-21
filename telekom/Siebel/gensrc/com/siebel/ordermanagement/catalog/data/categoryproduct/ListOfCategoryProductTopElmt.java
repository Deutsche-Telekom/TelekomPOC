
package com.siebel.ordermanagement.catalog.data.categoryproduct;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListOfCategoryProductTopElmt complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListOfCategoryProductTopElmt">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ListOfCategoryProduct" type="{http://siebel.com/OrderManagement/Catalog/Data/CategoryProduct}ListOfCategoryProduct"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfCategoryProductTopElmt", propOrder = {
    "listOfCategoryProduct"
})
public class ListOfCategoryProductTopElmt
    implements Serializable
{

    @XmlElement(name = "ListOfCategoryProduct", required = true)
    protected ListOfCategoryProduct listOfCategoryProduct;

    /**
     * Gets the value of the listOfCategoryProduct property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfCategoryProduct }
     *     
     */
    public ListOfCategoryProduct getListOfCategoryProduct() {
        return listOfCategoryProduct;
    }

    /**
     * Sets the value of the listOfCategoryProduct property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfCategoryProduct }
     *     
     */
    public void setListOfCategoryProduct(ListOfCategoryProduct value) {
        this.listOfCategoryProduct = value;
    }

}
