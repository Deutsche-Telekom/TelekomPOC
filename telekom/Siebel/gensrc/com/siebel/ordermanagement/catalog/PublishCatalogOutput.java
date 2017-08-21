
package com.siebel.ordermanagement.catalog;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.siebel.ordermanagement.catalog.data.publishcatalog.ListOfPublishCatalog;


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
 *         &lt;element ref="{http://siebel.com/OrderManagement/Catalog/Data/PublishCatalog}ListOfPublishCatalog" minOccurs="0"/>
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
    "listOfPublishCatalog"
})
@XmlRootElement(name = "PublishCatalog_Output")
public class PublishCatalogOutput
    implements Serializable
{

    @XmlElement(name = "ListOfPublishCatalog", namespace = "http://siebel.com/OrderManagement/Catalog/Data/PublishCatalog")
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
