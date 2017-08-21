
package com.siebel.ordermanagement.quote.data.projectedasset;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProjectedAsset complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProjectedAsset">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ListOfPropSet" type="{http://siebel.com/OrderManagement/Quote/Data/ProjectedAsset}ListOfPropSet" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProjectedAsset", propOrder = {
    "id",
    "listOfPropSet"
})
public class ProjectedAsset
    implements Serializable
{

    @XmlElement(name = "Id")
    protected String id;
    @XmlElement(name = "ListOfPropSet")
    protected ListOfPropSet listOfPropSet;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the listOfPropSet property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfPropSet }
     *     
     */
    public ListOfPropSet getListOfPropSet() {
        return listOfPropSet;
    }

    /**
     * Sets the value of the listOfPropSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfPropSet }
     *     
     */
    public void setListOfPropSet(ListOfPropSet value) {
        this.listOfPropSet = value;
    }

}
