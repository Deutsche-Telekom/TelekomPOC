
package com.siebel.ordermanagement.catalog.data.relatedproducts;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListOfRelatedProduct complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListOfRelatedProduct">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RelatedProduct" type="{http://siebel.com/OrderManagement/Catalog/Data/RelatedProducts}RelatedProduct" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfRelatedProduct", propOrder = {
    "relatedProduct"
})
public class ListOfRelatedProduct
    implements Serializable
{

    @XmlElement(name = "RelatedProduct")
    protected List<RelatedProduct> relatedProduct;

    /**
     * Gets the value of the relatedProduct property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relatedProduct property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelatedProduct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RelatedProduct }
     * 
     * 
     */
    public List<RelatedProduct> getRelatedProduct() {
        if (relatedProduct == null) {
            relatedProduct = new ArrayList<RelatedProduct>();
        }
        return this.relatedProduct;
    }

}
