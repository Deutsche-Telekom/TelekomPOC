
package com.siebel.ordermanagement.configurator.cfglinkeditems;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LinkedItems complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LinkedItems">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LinkedItemValue" type="{http://siebel.com/OrderManagement/Configurator/CfgLinkedItems}LinkedItemValue" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LinkedItems", propOrder = {
    "linkedItemValue"
})
public class LinkedItems
    implements Serializable
{

    @XmlElement(name = "LinkedItemValue", required = true)
    protected List<LinkedItemValue> linkedItemValue;

    /**
     * Gets the value of the linkedItemValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the linkedItemValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLinkedItemValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LinkedItemValue }
     * 
     * 
     */
    public List<LinkedItemValue> getLinkedItemValue() {
        if (linkedItemValue == null) {
            linkedItemValue = new ArrayList<LinkedItemValue>();
        }
        return this.linkedItemValue;
    }

}
