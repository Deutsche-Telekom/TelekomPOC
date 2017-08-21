
package com.siebel.ordermanagement.promotion;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.siebel.ordermanagement.order.data.ListOfOrder;


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
 *         &lt;element name="EligibilityMode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DueDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NewPromotionId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AssetNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="OverridePenaltyAmount" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Old_spcProd_spcPromotion_spcInstance_spcId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PricingMode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element ref="{http://siebel.com/OrderManagement/Order/Data}ListOfOrder"/>
 *         &lt;element name="OverrideProratePlanId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AssetIntegrationId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AccountId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ContactId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CompoundProductNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ActiveDocumentId" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "eligibilityMode",
    "dueDate",
    "newPromotionId",
    "assetNumber",
    "overridePenaltyAmount",
    "oldSpcProdSpcPromotionSpcInstanceSpcId",
    "pricingMode",
    "listOfOrder",
    "overrideProratePlanId",
    "assetIntegrationId",
    "accountId",
    "contactId",
    "compoundProductNumber",
    "activeDocumentId"
})
@XmlRootElement(name = "UpgradePromotionToOrder_Input")
public class UpgradePromotionToOrderInput
    implements Serializable
{

    @XmlElement(name = "EligibilityMode", required = true)
    protected String eligibilityMode;
    @XmlElement(name = "DueDate", required = true)
    protected String dueDate;
    @XmlElement(name = "NewPromotionId", required = true)
    protected String newPromotionId;
    @XmlElement(name = "AssetNumber", required = true)
    protected String assetNumber;
    @XmlElement(name = "OverridePenaltyAmount", required = true)
    protected String overridePenaltyAmount;
    @XmlElement(name = "Old_spcProd_spcPromotion_spcInstance_spcId", required = true)
    protected String oldSpcProdSpcPromotionSpcInstanceSpcId;
    @XmlElement(name = "PricingMode", required = true)
    protected String pricingMode;
    @XmlElement(name = "ListOfOrder", namespace = "http://siebel.com/OrderManagement/Order/Data", required = true)
    protected ListOfOrder listOfOrder;
    @XmlElement(name = "OverrideProratePlanId", required = true)
    protected String overrideProratePlanId;
    @XmlElement(name = "AssetIntegrationId", required = true)
    protected String assetIntegrationId;
    @XmlElement(name = "AccountId", required = true)
    protected String accountId;
    @XmlElement(name = "ContactId", required = true)
    protected String contactId;
    @XmlElement(name = "CompoundProductNumber", required = true)
    protected String compoundProductNumber;
    @XmlElement(name = "ActiveDocumentId", required = true)
    protected String activeDocumentId;

    /**
     * Gets the value of the eligibilityMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEligibilityMode() {
        return eligibilityMode;
    }

    /**
     * Sets the value of the eligibilityMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEligibilityMode(String value) {
        this.eligibilityMode = value;
    }

    /**
     * Gets the value of the dueDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDueDate() {
        return dueDate;
    }

    /**
     * Sets the value of the dueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDueDate(String value) {
        this.dueDate = value;
    }

    /**
     * Gets the value of the newPromotionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewPromotionId() {
        return newPromotionId;
    }

    /**
     * Sets the value of the newPromotionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewPromotionId(String value) {
        this.newPromotionId = value;
    }

    /**
     * Gets the value of the assetNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssetNumber() {
        return assetNumber;
    }

    /**
     * Sets the value of the assetNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssetNumber(String value) {
        this.assetNumber = value;
    }

    /**
     * Gets the value of the overridePenaltyAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOverridePenaltyAmount() {
        return overridePenaltyAmount;
    }

    /**
     * Sets the value of the overridePenaltyAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOverridePenaltyAmount(String value) {
        this.overridePenaltyAmount = value;
    }

    /**
     * Gets the value of the oldSpcProdSpcPromotionSpcInstanceSpcId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOldSpcProdSpcPromotionSpcInstanceSpcId() {
        return oldSpcProdSpcPromotionSpcInstanceSpcId;
    }

    /**
     * Sets the value of the oldSpcProdSpcPromotionSpcInstanceSpcId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOldSpcProdSpcPromotionSpcInstanceSpcId(String value) {
        this.oldSpcProdSpcPromotionSpcInstanceSpcId = value;
    }

    /**
     * Gets the value of the pricingMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPricingMode() {
        return pricingMode;
    }

    /**
     * Sets the value of the pricingMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPricingMode(String value) {
        this.pricingMode = value;
    }

    /**
     * Gets the value of the listOfOrder property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfOrder }
     *     
     */
    public ListOfOrder getListOfOrder() {
        return listOfOrder;
    }

    /**
     * Sets the value of the listOfOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfOrder }
     *     
     */
    public void setListOfOrder(ListOfOrder value) {
        this.listOfOrder = value;
    }

    /**
     * Gets the value of the overrideProratePlanId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOverrideProratePlanId() {
        return overrideProratePlanId;
    }

    /**
     * Sets the value of the overrideProratePlanId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOverrideProratePlanId(String value) {
        this.overrideProratePlanId = value;
    }

    /**
     * Gets the value of the assetIntegrationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssetIntegrationId() {
        return assetIntegrationId;
    }

    /**
     * Sets the value of the assetIntegrationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssetIntegrationId(String value) {
        this.assetIntegrationId = value;
    }

    /**
     * Gets the value of the accountId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountId() {
        return accountId;
    }

    /**
     * Sets the value of the accountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountId(String value) {
        this.accountId = value;
    }

    /**
     * Gets the value of the contactId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactId() {
        return contactId;
    }

    /**
     * Sets the value of the contactId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactId(String value) {
        this.contactId = value;
    }

    /**
     * Gets the value of the compoundProductNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompoundProductNumber() {
        return compoundProductNumber;
    }

    /**
     * Sets the value of the compoundProductNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompoundProductNumber(String value) {
        this.compoundProductNumber = value;
    }

    /**
     * Gets the value of the activeDocumentId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActiveDocumentId() {
        return activeDocumentId;
    }

    /**
     * Sets the value of the activeDocumentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActiveDocumentId(String value) {
        this.activeDocumentId = value;
    }

}
