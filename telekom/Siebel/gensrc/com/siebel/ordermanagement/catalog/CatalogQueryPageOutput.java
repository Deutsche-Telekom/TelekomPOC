
package com.siebel.ordermanagement.catalog;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.siebel.ordermanagement.catalog.data.udspublishcatalog.data.ListOfUDSPublishCatalogData;


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
 *         &lt;element ref="{http://siebel.com/OrderManagement/Catalog/Data/UDSPublishCatalog/Data}ListOfUDSPublishCatalog" minOccurs="0"/>
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
    "listOfUDSPublishCatalog"
})
@XmlRootElement(name = "CatalogQueryPage_Output")
public class CatalogQueryPageOutput
    implements Serializable
{

    @XmlElement(name = "ListOfUDSPublishCatalog", namespace = "http://siebel.com/OrderManagement/Catalog/Data/UDSPublishCatalog/Data")
    protected ListOfUDSPublishCatalogData listOfUDSPublishCatalog;

    /**
     * Gets the value of the listOfUDSPublishCatalog property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfUDSPublishCatalogData }
     *     
     */
    public ListOfUDSPublishCatalogData getListOfUDSPublishCatalog() {
        return listOfUDSPublishCatalog;
    }

    /**
     * Sets the value of the listOfUDSPublishCatalog property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfUDSPublishCatalogData }
     *     
     */
    public void setListOfUDSPublishCatalog(ListOfUDSPublishCatalogData value) {
        this.listOfUDSPublishCatalog = value;
    }

}
