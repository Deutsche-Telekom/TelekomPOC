
package com.siebel.ordermanagement.quote.quoting;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.siebel.ordermanagement.quote.data.ListOfQuote;


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
 *         &lt;element name="Wait_spcFlag" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Continue_spcRecomm" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="QueryQuoteFlag" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PricingFlag" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Delta_spcAction_spcCode_spcFlag" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element ref="{http://siebel.com/OrderManagement/Quote/Data}ListOfQuote"/>
 *         &lt;element name="CheckEligibilityFlag" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SyncQuoteFlag" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="VerifyPromotionFlag" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Target_spcDocument" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CalculateShippingCostFlag" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Use_spcUMF" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="RepricingFlag" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Error_spcCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CalculateTaxFlag" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Error_spcMessage" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "waitSpcFlag",
    "continueSpcRecomm",
    "queryQuoteFlag",
    "pricingFlag",
    "deltaSpcActionSpcCodeSpcFlag",
    "listOfQuote",
    "checkEligibilityFlag",
    "syncQuoteFlag",
    "verifyPromotionFlag",
    "targetSpcDocument",
    "calculateShippingCostFlag",
    "useSpcUMF",
    "repricingFlag",
    "errorSpcCode",
    "calculateTaxFlag",
    "errorSpcMessage"
})
@XmlRootElement(name = "ExecuteQuoting_Input")
public class ExecuteQuotingInput
    implements Serializable
{

    @XmlElement(name = "Wait_spcFlag", required = true)
    protected String waitSpcFlag;
    @XmlElement(name = "Continue_spcRecomm", required = true)
    protected String continueSpcRecomm;
    @XmlElement(name = "QueryQuoteFlag", required = true)
    protected String queryQuoteFlag;
    @XmlElement(name = "PricingFlag", required = true)
    protected String pricingFlag;
    @XmlElement(name = "Delta_spcAction_spcCode_spcFlag", required = true)
    protected String deltaSpcActionSpcCodeSpcFlag;
    @XmlElement(name = "ListOfQuote", namespace = "http://siebel.com/OrderManagement/Quote/Data", required = true)
    protected ListOfQuote listOfQuote;
    @XmlElement(name = "CheckEligibilityFlag", required = true)
    protected String checkEligibilityFlag;
    @XmlElement(name = "SyncQuoteFlag", required = true)
    protected String syncQuoteFlag;
    @XmlElement(name = "VerifyPromotionFlag", required = true)
    protected String verifyPromotionFlag;
    @XmlElement(name = "Target_spcDocument", required = true)
    protected String targetSpcDocument;
    @XmlElement(name = "CalculateShippingCostFlag", required = true)
    protected String calculateShippingCostFlag;
    @XmlElement(name = "Use_spcUMF", required = true)
    protected String useSpcUMF;
    @XmlElement(name = "RepricingFlag", required = true)
    protected String repricingFlag;
    @XmlElement(name = "Error_spcCode", required = true)
    protected String errorSpcCode;
    @XmlElement(name = "CalculateTaxFlag", required = true)
    protected String calculateTaxFlag;
    @XmlElement(name = "Error_spcMessage", required = true)
    protected String errorSpcMessage;

    /**
     * Gets the value of the waitSpcFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWaitSpcFlag() {
        return waitSpcFlag;
    }

    /**
     * Sets the value of the waitSpcFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWaitSpcFlag(String value) {
        this.waitSpcFlag = value;
    }

    /**
     * Gets the value of the continueSpcRecomm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContinueSpcRecomm() {
        return continueSpcRecomm;
    }

    /**
     * Sets the value of the continueSpcRecomm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContinueSpcRecomm(String value) {
        this.continueSpcRecomm = value;
    }

    /**
     * Gets the value of the queryQuoteFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQueryQuoteFlag() {
        return queryQuoteFlag;
    }

    /**
     * Sets the value of the queryQuoteFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQueryQuoteFlag(String value) {
        this.queryQuoteFlag = value;
    }

    /**
     * Gets the value of the pricingFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPricingFlag() {
        return pricingFlag;
    }

    /**
     * Sets the value of the pricingFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPricingFlag(String value) {
        this.pricingFlag = value;
    }

    /**
     * Gets the value of the deltaSpcActionSpcCodeSpcFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeltaSpcActionSpcCodeSpcFlag() {
        return deltaSpcActionSpcCodeSpcFlag;
    }

    /**
     * Sets the value of the deltaSpcActionSpcCodeSpcFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeltaSpcActionSpcCodeSpcFlag(String value) {
        this.deltaSpcActionSpcCodeSpcFlag = value;
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

    /**
     * Gets the value of the checkEligibilityFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckEligibilityFlag() {
        return checkEligibilityFlag;
    }

    /**
     * Sets the value of the checkEligibilityFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckEligibilityFlag(String value) {
        this.checkEligibilityFlag = value;
    }

    /**
     * Gets the value of the syncQuoteFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSyncQuoteFlag() {
        return syncQuoteFlag;
    }

    /**
     * Sets the value of the syncQuoteFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSyncQuoteFlag(String value) {
        this.syncQuoteFlag = value;
    }

    /**
     * Gets the value of the verifyPromotionFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVerifyPromotionFlag() {
        return verifyPromotionFlag;
    }

    /**
     * Sets the value of the verifyPromotionFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVerifyPromotionFlag(String value) {
        this.verifyPromotionFlag = value;
    }

    /**
     * Gets the value of the targetSpcDocument property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetSpcDocument() {
        return targetSpcDocument;
    }

    /**
     * Sets the value of the targetSpcDocument property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetSpcDocument(String value) {
        this.targetSpcDocument = value;
    }

    /**
     * Gets the value of the calculateShippingCostFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalculateShippingCostFlag() {
        return calculateShippingCostFlag;
    }

    /**
     * Sets the value of the calculateShippingCostFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalculateShippingCostFlag(String value) {
        this.calculateShippingCostFlag = value;
    }

    /**
     * Gets the value of the useSpcUMF property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUseSpcUMF() {
        return useSpcUMF;
    }

    /**
     * Sets the value of the useSpcUMF property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUseSpcUMF(String value) {
        this.useSpcUMF = value;
    }

    /**
     * Gets the value of the repricingFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRepricingFlag() {
        return repricingFlag;
    }

    /**
     * Sets the value of the repricingFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRepricingFlag(String value) {
        this.repricingFlag = value;
    }

    /**
     * Gets the value of the errorSpcCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorSpcCode() {
        return errorSpcCode;
    }

    /**
     * Sets the value of the errorSpcCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorSpcCode(String value) {
        this.errorSpcCode = value;
    }

    /**
     * Gets the value of the calculateTaxFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalculateTaxFlag() {
        return calculateTaxFlag;
    }

    /**
     * Sets the value of the calculateTaxFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalculateTaxFlag(String value) {
        this.calculateTaxFlag = value;
    }

    /**
     * Gets the value of the errorSpcMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorSpcMessage() {
        return errorSpcMessage;
    }

    /**
     * Sets the value of the errorSpcMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorSpcMessage(String value) {
        this.errorSpcMessage = value;
    }

}
