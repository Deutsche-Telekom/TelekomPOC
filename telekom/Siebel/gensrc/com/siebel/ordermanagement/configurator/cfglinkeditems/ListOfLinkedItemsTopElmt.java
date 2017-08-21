
package com.siebel.ordermanagement.configurator.cfglinkeditems;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListOfLinkedItemsTopElmt complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListOfLinkedItemsTopElmt">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ListOfLinkedItems" type="{http://siebel.com/OrderManagement/Configurator/CfgLinkedItems}ListOfLinkedItems"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfLinkedItemsTopElmt", propOrder = {
    "listOfLinkedItems"
})
public class ListOfLinkedItemsTopElmt
    implements Serializable
{

    @XmlElement(name = "ListOfLinkedItems", required = true)
    protected ListOfLinkedItems listOfLinkedItems;

    /**
     * Gets the value of the listOfLinkedItems property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfLinkedItems }
     *     
     */
    public ListOfLinkedItems getListOfLinkedItems() {
        return listOfLinkedItems;
    }

    /**
     * Sets the value of the listOfLinkedItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfLinkedItems }
     *     
     */
    public void setListOfLinkedItems(ListOfLinkedItems value) {
        this.listOfLinkedItems = value;
    }

}
