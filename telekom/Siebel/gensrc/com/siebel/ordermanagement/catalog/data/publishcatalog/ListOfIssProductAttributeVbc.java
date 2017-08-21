
package com.siebel.ordermanagement.catalog.data.publishcatalog;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListOfIssProductAttributeVbc complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListOfIssProductAttributeVbc">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IssProductAttributeVbc" type="{http://siebel.com/OrderManagement/Catalog/Data/PublishCatalog}IssProductAttributeVbc" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfIssProductAttributeVbc", propOrder = {
    "issProductAttributeVbc"
})
public class ListOfIssProductAttributeVbc
    implements Serializable
{

    @XmlElement(name = "IssProductAttributeVbc")
    protected List<IssProductAttributeVbc> issProductAttributeVbc;

    /**
     * Gets the value of the issProductAttributeVbc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the issProductAttributeVbc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIssProductAttributeVbc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IssProductAttributeVbc }
     * 
     * 
     */
    public List<IssProductAttributeVbc> getIssProductAttributeVbc() {
        if (issProductAttributeVbc == null) {
            issProductAttributeVbc = new ArrayList<IssProductAttributeVbc>();
        }
        return this.issProductAttributeVbc;
    }

}
