
package com.siebel.ordermanagement.catalog;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.siebel.ordermanagement.catalog.data.productclassattributes.ListOfProductClassAttributes;


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
 *         &lt;element ref="{http://siebel.com/OrderManagement/Catalog/Data/ProductClassAttributes}ListOfProductClassAttributes" minOccurs="0"/>
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
    "listOfProductClassAttributes"
})
@XmlRootElement(name = "GetSearchParameters_Output")
public class GetSearchParametersOutput
    implements Serializable
{

    @XmlElement(name = "ListOfProductClassAttributes", namespace = "http://siebel.com/OrderManagement/Catalog/Data/ProductClassAttributes")
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
