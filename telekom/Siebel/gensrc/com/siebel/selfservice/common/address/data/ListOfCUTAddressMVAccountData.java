
package com.siebel.selfservice.common.address.data;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListOfCUTAddress_MVAccountData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListOfCUTAddress_MVAccountData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CUTAddress_MVAccount" type="{http://siebel.com/SelfService/Common/Address/Data}CUTAddress_MVAccountData" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="lastpage" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="recordcount" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfCUTAddress_MVAccountData", propOrder = {
    "cutAddressMVAccount"
})
public class ListOfCUTAddressMVAccountData
    implements Serializable
{

    @XmlElement(name = "CUTAddress_MVAccount")
    protected List<CUTAddressMVAccountData> cutAddressMVAccount;
    @XmlAttribute
    protected Boolean lastpage;
    @XmlAttribute
    protected BigInteger recordcount;

    /**
     * Gets the value of the cutAddressMVAccount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cutAddressMVAccount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCUTAddressMVAccount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CUTAddressMVAccountData }
     * 
     * 
     */
    public List<CUTAddressMVAccountData> getCUTAddressMVAccount() {
        if (cutAddressMVAccount == null) {
            cutAddressMVAccount = new ArrayList<CUTAddressMVAccountData>();
        }
        return this.cutAddressMVAccount;
    }

    /**
     * Gets the value of the lastpage property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLastpage() {
        return lastpage;
    }

    /**
     * Sets the value of the lastpage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLastpage(Boolean value) {
        this.lastpage = value;
    }

    /**
     * Gets the value of the recordcount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRecordcount() {
        return recordcount;
    }

    /**
     * Sets the value of the recordcount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRecordcount(BigInteger value) {
        this.recordcount = value;
    }

}
