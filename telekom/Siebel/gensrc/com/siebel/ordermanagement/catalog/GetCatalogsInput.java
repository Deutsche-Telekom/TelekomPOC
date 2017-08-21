
package com.siebel.ordermanagement.catalog;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.siebel.ordermanagement.catalog.data.catalog.ListOfCatalog;


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
 *         &lt;element ref="{http://siebel.com/OrderManagement/Catalog/Data/Catalog}ListOfCatalog" minOccurs="0"/>
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
    "listOfCatalog"
})
@XmlRootElement(name = "GetCatalogs_Input")
public class GetCatalogsInput
    implements Serializable
{

    @XmlElement(name = "ListOfCatalog", namespace = "http://siebel.com/OrderManagement/Catalog/Data/Catalog")
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
