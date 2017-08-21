
package com.siebel.ordermanagement.catalog.data.productchildren;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListOfKeyFeature complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListOfKeyFeature">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="KeyFeature" type="{http://siebel.com/OrderManagement/Catalog/Data/ProductChildren}KeyFeature" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfKeyFeature", propOrder = {
    "keyFeature"
})
public class ListOfKeyFeature
    implements Serializable
{

    @XmlElement(name = "KeyFeature")
    protected List<KeyFeature> keyFeature;

    /**
     * Gets the value of the keyFeature property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the keyFeature property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKeyFeature().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KeyFeature }
     * 
     * 
     */
    public List<KeyFeature> getKeyFeature() {
        if (keyFeature == null) {
            keyFeature = new ArrayList<KeyFeature>();
        }
        return this.keyFeature;
    }

}
