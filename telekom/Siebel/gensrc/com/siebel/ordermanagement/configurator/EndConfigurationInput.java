
package com.siebel.ordermanagement.configurator;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="SaveInstanceFlag" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "saveInstanceFlag"
})
@XmlRootElement(name = "EndConfiguration_Input")
public class EndConfigurationInput
    implements Serializable
{

    @XmlElement(name = "SaveInstanceFlag", required = true)
    protected String saveInstanceFlag;

    /**
     * Gets the value of the saveInstanceFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSaveInstanceFlag() {
        return saveInstanceFlag;
    }

    /**
     * Sets the value of the saveInstanceFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSaveInstanceFlag(String value) {
        this.saveInstanceFlag = value;
    }

}
