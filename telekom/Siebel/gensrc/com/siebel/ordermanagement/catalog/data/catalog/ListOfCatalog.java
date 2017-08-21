
package com.siebel.ordermanagement.catalog.data.catalog;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListOfCatalog complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListOfCatalog">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Catalog" type="{http://siebel.com/OrderManagement/Catalog/Data/Catalog}Catalog" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfCatalog", propOrder = {
    "catalog"
})
public class ListOfCatalog
    implements Serializable
{

    @XmlElement(name = "Catalog")
    protected List<Catalog> catalog;

    /**
     * Gets the value of the catalog property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the catalog property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCatalog().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Catalog }
     * 
     * 
     */
    public List<Catalog> getCatalog() {
        if (catalog == null) {
            catalog = new ArrayList<Catalog>();
        }
        return this.catalog;
    }

}
