
package com.siebel.xml.asset_management_complex_io.query;

import java.io.Serializable;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListOfAssetMgmt-AssetXaQuery complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListOfAssetMgmt-AssetXaQuery">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AssetMgmt-AssetXa" type="{http://www.siebel.com/xml/Asset_Management_Complex_IO/Query}AssetMgmt-AssetXaQuery" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="pagesize" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="startrownum" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="recordcountneeded" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfAssetMgmt-AssetXaQuery", propOrder = {
    "assetMgmtAssetXa"
})
public class ListOfAssetMgmtAssetXaQuery
    implements Serializable
{

    @XmlElement(name = "AssetMgmt-AssetXa")
    protected AssetMgmtAssetXaQuery assetMgmtAssetXa;
    @XmlAttribute
    protected BigInteger pagesize;
    @XmlAttribute
    protected BigInteger startrownum;
    @XmlAttribute
    protected Boolean recordcountneeded;

    /**
     * Gets the value of the assetMgmtAssetXa property.
     * 
     * @return
     *     possible object is
     *     {@link AssetMgmtAssetXaQuery }
     *     
     */
    public AssetMgmtAssetXaQuery getAssetMgmtAssetXa() {
        return assetMgmtAssetXa;
    }

    /**
     * Sets the value of the assetMgmtAssetXa property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetMgmtAssetXaQuery }
     *     
     */
    public void setAssetMgmtAssetXa(AssetMgmtAssetXaQuery value) {
        this.assetMgmtAssetXa = value;
    }

    /**
     * Gets the value of the pagesize property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPagesize() {
        return pagesize;
    }

    /**
     * Sets the value of the pagesize property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPagesize(BigInteger value) {
        this.pagesize = value;
    }

    /**
     * Gets the value of the startrownum property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getStartrownum() {
        return startrownum;
    }

    /**
     * Sets the value of the startrownum property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setStartrownum(BigInteger value) {
        this.startrownum = value;
    }

    /**
     * Gets the value of the recordcountneeded property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRecordcountneeded() {
        return recordcountneeded;
    }

    /**
     * Sets the value of the recordcountneeded property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRecordcountneeded(Boolean value) {
        this.recordcountneeded = value;
    }

}
