
package com.siebel.ordermanagement.catalog.data.category;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListOfCatalogTopElmt complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListOfCatalogTopElmt">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ListOfCatalog" type="{http://siebel.com/OrderManagement/Catalog/Data/Category}ListOfCatalog"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfCatalogTopElmt", propOrder = {
    "listOfCatalog"
})
public class ListOfCatalogTopElmt
    implements Serializable
{

    @XmlElement(name = "ListOfCatalog", required = true)
    protected ListOfCatalog listOfCatalog;

    /**
     * Gets the value of the listOfCatalog property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfCatalog }
     *     
     */
    public ListOfCatalog getListOfCatalog() {
        return listOfCatalog;
    }

    /**
     * Sets the value of the listOfCatalog property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfCatalog }
     *     
     */
    public void setListOfCatalog(ListOfCatalog value) {
        this.listOfCatalog = value;
    }

}
