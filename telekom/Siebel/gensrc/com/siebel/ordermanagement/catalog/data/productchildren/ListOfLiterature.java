
package com.siebel.ordermanagement.catalog.data.productchildren;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListOfLiterature complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListOfLiterature">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Literature" type="{http://siebel.com/OrderManagement/Catalog/Data/ProductChildren}Literature" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfLiterature", propOrder = {
    "literature"
})
public class ListOfLiterature
    implements Serializable
{

    @XmlElement(name = "Literature")
    protected List<Literature> literature;

    /**
     * Gets the value of the literature property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the literature property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLiterature().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Literature }
     * 
     * 
     */
    public List<Literature> getLiterature() {
        if (literature == null) {
            literature = new ArrayList<Literature>();
        }
        return this.literature;
    }

}
