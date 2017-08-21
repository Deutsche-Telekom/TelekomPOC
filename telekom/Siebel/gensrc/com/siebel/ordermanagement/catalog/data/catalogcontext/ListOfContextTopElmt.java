
package com.siebel.ordermanagement.catalog.data.catalogcontext;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListOfContextTopElmt complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListOfContextTopElmt">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ListOfContext" type="{http://siebel.com/OrderManagement/Catalog/Data/CatalogContext}ListOfContext"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfContextTopElmt", propOrder = {
    "listOfContext"
})
public class ListOfContextTopElmt
    implements Serializable
{

    @XmlElement(name = "ListOfContext", required = true)
    protected ListOfContext listOfContext;

    /**
     * Gets the value of the listOfContext property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfContext }
     *     
     */
    public ListOfContext getListOfContext() {
        return listOfContext;
    }

    /**
     * Sets the value of the listOfContext property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfContext }
     *     
     */
    public void setListOfContext(ListOfContext value) {
        this.listOfContext = value;
    }

}
