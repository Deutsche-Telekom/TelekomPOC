
package com.siebel.ordermanagement.catalog.data.productclassattributes;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListOfProductClassAttributesTopElmt complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListOfProductClassAttributesTopElmt">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ListOfProductClassAttributes" type="{http://siebel.com/OrderManagement/Catalog/Data/ProductClassAttributes}ListOfProductClassAttributes"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfProductClassAttributesTopElmt", propOrder = {
    "listOfProductClassAttributes"
})
public class ListOfProductClassAttributesTopElmt
    implements Serializable
{

    @XmlElement(name = "ListOfProductClassAttributes", required = true)
    protected ListOfProductClassAttributes listOfProductClassAttributes;

    /**
     * Gets the value of the listOfProductClassAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfProductClassAttributes }
     *     
     */
    public ListOfProductClassAttributes getListOfProductClassAttributes() {
        return listOfProductClassAttributes;
    }

    /**
     * Sets the value of the listOfProductClassAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfProductClassAttributes }
     *     
     */
    public void setListOfProductClassAttributes(ListOfProductClassAttributes value) {
        this.listOfProductClassAttributes = value;
    }

}
