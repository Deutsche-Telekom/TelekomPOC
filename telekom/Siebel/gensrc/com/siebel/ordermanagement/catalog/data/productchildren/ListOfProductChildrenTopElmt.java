
package com.siebel.ordermanagement.catalog.data.productchildren;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListOfProductChildrenTopElmt complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListOfProductChildrenTopElmt">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ListOfProductChildren" type="{http://siebel.com/OrderManagement/Catalog/Data/ProductChildren}ListOfProductChildren"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfProductChildrenTopElmt", propOrder = {
    "listOfProductChildren"
})
public class ListOfProductChildrenTopElmt
    implements Serializable
{

    @XmlElement(name = "ListOfProductChildren", required = true)
    protected ListOfProductChildren listOfProductChildren;

    /**
     * Gets the value of the listOfProductChildren property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfProductChildren }
     *     
     */
    public ListOfProductChildren getListOfProductChildren() {
        return listOfProductChildren;
    }

    /**
     * Sets the value of the listOfProductChildren property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfProductChildren }
     *     
     */
    public void setListOfProductChildren(ListOfProductChildren value) {
        this.listOfProductChildren = value;
    }

}
