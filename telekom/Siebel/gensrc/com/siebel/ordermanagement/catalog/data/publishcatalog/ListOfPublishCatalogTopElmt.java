
package com.siebel.ordermanagement.catalog.data.publishcatalog;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListOfPublishCatalogTopElmt complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListOfPublishCatalogTopElmt">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ListOfPublishCatalog" type="{http://siebel.com/OrderManagement/Catalog/Data/PublishCatalog}ListOfPublishCatalog"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfPublishCatalogTopElmt", propOrder = {
    "listOfPublishCatalog"
})
public class ListOfPublishCatalogTopElmt
    implements Serializable
{

    @XmlElement(name = "ListOfPublishCatalog", required = true)
    protected ListOfPublishCatalog listOfPublishCatalog;

    /**
     * Gets the value of the listOfPublishCatalog property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfPublishCatalog }
     *     
     */
    public ListOfPublishCatalog getListOfPublishCatalog() {
        return listOfPublishCatalog;
    }

    /**
     * Sets the value of the listOfPublishCatalog property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfPublishCatalog }
     *     
     */
    public void setListOfPublishCatalog(ListOfPublishCatalog value) {
        this.listOfPublishCatalog = value;
    }

}
