
package com.siebel.ordermanagement.quote.psp;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.siebel.ordermanagement.quote.data.ListOfQuote;
import com.siebel.ordermanagement.quote.data.projectedasset.ListOfAsset;


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
 *         &lt;element name="PickMode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element ref="{http://siebel.com/OrderManagement/Quote/Data/ProjectedAsset}ListOfAsset"/>
 *         &lt;element name="PSPMode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element ref="{http://siebel.com/OrderManagement/Quote/Data}ListOfQuote"/>
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
    "pickMode",
    "listOfAsset",
    "pspMode",
    "listOfQuote"
})
@XmlRootElement(name = "CheckQuoteEligibilityCompatibility_Input")
public class CheckQuoteEligibilityCompatibilityInput
    implements Serializable
{

    @XmlElement(name = "PickMode", required = true)
    protected String pickMode;
    @XmlElement(name = "ListOfAsset", namespace = "http://siebel.com/OrderManagement/Quote/Data/ProjectedAsset", required = true)
    protected ListOfAsset listOfAsset;
    @XmlElement(name = "PSPMode", required = true)
    protected String pspMode;
    @XmlElement(name = "ListOfQuote", namespace = "http://siebel.com/OrderManagement/Quote/Data", required = true)
    protected ListOfQuote listOfQuote;

    /**
     * Gets the value of the pickMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPickMode() {
        return pickMode;
    }

    /**
     * Sets the value of the pickMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPickMode(String value) {
        this.pickMode = value;
    }

    /**
     * Gets the value of the listOfAsset property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfAsset }
     *     
     */
    public ListOfAsset getListOfAsset() {
        return listOfAsset;
    }

    /**
     * Sets the value of the listOfAsset property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfAsset }
     *     
     */
    public void setListOfAsset(ListOfAsset value) {
        this.listOfAsset = value;
    }

    /**
     * Gets the value of the pspMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPSPMode() {
        return pspMode;
    }

    /**
     * Sets the value of the pspMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPSPMode(String value) {
        this.pspMode = value;
    }

    /**
     * Gets the value of the listOfQuote property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfQuote }
     *     
     */
    public ListOfQuote getListOfQuote() {
        return listOfQuote;
    }

    /**
     * Sets the value of the listOfQuote property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfQuote }
     *     
     */
    public void setListOfQuote(ListOfQuote value) {
        this.listOfQuote = value;
    }

}
