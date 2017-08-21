
package com.siebel.ordermanagement.order.details.data.query;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for queryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="queryType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *       &lt;attribute name="sortorder" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="sortsequence" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "queryType", propOrder = {
    "value"
})
public class QueryType
    implements Serializable
{

    @XmlValue
    protected String value;
    @XmlAttribute
    protected String sortorder;
    @XmlAttribute
    protected String sortsequence;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the sortorder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSortorder() {
        return sortorder;
    }

    /**
     * Sets the value of the sortorder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSortorder(String value) {
        this.sortorder = value;
    }

    /**
     * Gets the value of the sortsequence property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSortsequence() {
        return sortsequence;
    }

    /**
     * Sets the value of the sortsequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSortsequence(String value) {
        this.sortsequence = value;
    }

}
