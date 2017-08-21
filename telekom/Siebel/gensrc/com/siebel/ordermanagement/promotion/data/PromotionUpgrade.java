
package com.siebel.ordermanagement.promotion.data;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PromotionUpgrade complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PromotionUpgrade">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OriginalPromotionId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TargetPromotionId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CommitmentStart" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Duration" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OriginalGracePeriod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OriginalGracePeriodUOM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OriginalPeriod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OriginalPeriodUOM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OriginalPromotionDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OriginalPromotionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PenaltyAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PenaltyAmountCurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PenaltyAmountExchangeDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProratePlanId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProratePlanName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RelationshipType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TargetGracePeriod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TargetGracePeriodUOM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TargetPeriod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TargetPeriodUOM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TargetPromotionDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TargetPromotionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="operation" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="searchspec" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PromotionUpgrade", propOrder = {
    "id",
    "originalPromotionId",
    "targetPromotionId",
    "commitmentStart",
    "duration",
    "originalGracePeriod",
    "originalGracePeriodUOM",
    "originalPeriod",
    "originalPeriodUOM",
    "originalPromotionDescription",
    "originalPromotionName",
    "penaltyAmount",
    "penaltyAmountCurrencyCode",
    "penaltyAmountExchangeDate",
    "proratePlanId",
    "proratePlanName",
    "relationshipType",
    "targetGracePeriod",
    "targetGracePeriodUOM",
    "targetPeriod",
    "targetPeriodUOM",
    "targetPromotionDescription",
    "targetPromotionName"
})
public class PromotionUpgrade
    implements Serializable
{

    @XmlElement(name = "Id")
    protected String id;
    @XmlElement(name = "OriginalPromotionId", required = true)
    protected String originalPromotionId;
    @XmlElement(name = "TargetPromotionId", required = true)
    protected String targetPromotionId;
    @XmlElement(name = "CommitmentStart")
    protected String commitmentStart;
    @XmlElement(name = "Duration")
    protected String duration;
    @XmlElement(name = "OriginalGracePeriod")
    protected String originalGracePeriod;
    @XmlElement(name = "OriginalGracePeriodUOM")
    protected String originalGracePeriodUOM;
    @XmlElement(name = "OriginalPeriod")
    protected String originalPeriod;
    @XmlElement(name = "OriginalPeriodUOM")
    protected String originalPeriodUOM;
    @XmlElement(name = "OriginalPromotionDescription")
    protected String originalPromotionDescription;
    @XmlElement(name = "OriginalPromotionName")
    protected String originalPromotionName;
    @XmlElement(name = "PenaltyAmount")
    protected String penaltyAmount;
    @XmlElement(name = "PenaltyAmountCurrencyCode")
    protected String penaltyAmountCurrencyCode;
    @XmlElement(name = "PenaltyAmountExchangeDate")
    protected String penaltyAmountExchangeDate;
    @XmlElement(name = "ProratePlanId")
    protected String proratePlanId;
    @XmlElement(name = "ProratePlanName")
    protected String proratePlanName;
    @XmlElement(name = "RelationshipType")
    protected String relationshipType;
    @XmlElement(name = "TargetGracePeriod")
    protected String targetGracePeriod;
    @XmlElement(name = "TargetGracePeriodUOM")
    protected String targetGracePeriodUOM;
    @XmlElement(name = "TargetPeriod")
    protected String targetPeriod;
    @XmlElement(name = "TargetPeriodUOM")
    protected String targetPeriodUOM;
    @XmlElement(name = "TargetPromotionDescription")
    protected String targetPromotionDescription;
    @XmlElement(name = "TargetPromotionName")
    protected String targetPromotionName;
    @XmlAttribute
    protected String operation;
    @XmlAttribute
    protected String searchspec;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the originalPromotionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginalPromotionId() {
        return originalPromotionId;
    }

    /**
     * Sets the value of the originalPromotionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginalPromotionId(String value) {
        this.originalPromotionId = value;
    }

    /**
     * Gets the value of the targetPromotionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetPromotionId() {
        return targetPromotionId;
    }

    /**
     * Sets the value of the targetPromotionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetPromotionId(String value) {
        this.targetPromotionId = value;
    }

    /**
     * Gets the value of the commitmentStart property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommitmentStart() {
        return commitmentStart;
    }

    /**
     * Sets the value of the commitmentStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommitmentStart(String value) {
        this.commitmentStart = value;
    }

    /**
     * Gets the value of the duration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDuration() {
        return duration;
    }

    /**
     * Sets the value of the duration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDuration(String value) {
        this.duration = value;
    }

    /**
     * Gets the value of the originalGracePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginalGracePeriod() {
        return originalGracePeriod;
    }

    /**
     * Sets the value of the originalGracePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginalGracePeriod(String value) {
        this.originalGracePeriod = value;
    }

    /**
     * Gets the value of the originalGracePeriodUOM property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginalGracePeriodUOM() {
        return originalGracePeriodUOM;
    }

    /**
     * Sets the value of the originalGracePeriodUOM property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginalGracePeriodUOM(String value) {
        this.originalGracePeriodUOM = value;
    }

    /**
     * Gets the value of the originalPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginalPeriod() {
        return originalPeriod;
    }

    /**
     * Sets the value of the originalPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginalPeriod(String value) {
        this.originalPeriod = value;
    }

    /**
     * Gets the value of the originalPeriodUOM property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginalPeriodUOM() {
        return originalPeriodUOM;
    }

    /**
     * Sets the value of the originalPeriodUOM property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginalPeriodUOM(String value) {
        this.originalPeriodUOM = value;
    }

    /**
     * Gets the value of the originalPromotionDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginalPromotionDescription() {
        return originalPromotionDescription;
    }

    /**
     * Sets the value of the originalPromotionDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginalPromotionDescription(String value) {
        this.originalPromotionDescription = value;
    }

    /**
     * Gets the value of the originalPromotionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginalPromotionName() {
        return originalPromotionName;
    }

    /**
     * Sets the value of the originalPromotionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginalPromotionName(String value) {
        this.originalPromotionName = value;
    }

    /**
     * Gets the value of the penaltyAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPenaltyAmount() {
        return penaltyAmount;
    }

    /**
     * Sets the value of the penaltyAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPenaltyAmount(String value) {
        this.penaltyAmount = value;
    }

    /**
     * Gets the value of the penaltyAmountCurrencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPenaltyAmountCurrencyCode() {
        return penaltyAmountCurrencyCode;
    }

    /**
     * Sets the value of the penaltyAmountCurrencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPenaltyAmountCurrencyCode(String value) {
        this.penaltyAmountCurrencyCode = value;
    }

    /**
     * Gets the value of the penaltyAmountExchangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPenaltyAmountExchangeDate() {
        return penaltyAmountExchangeDate;
    }

    /**
     * Sets the value of the penaltyAmountExchangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPenaltyAmountExchangeDate(String value) {
        this.penaltyAmountExchangeDate = value;
    }

    /**
     * Gets the value of the proratePlanId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProratePlanId() {
        return proratePlanId;
    }

    /**
     * Sets the value of the proratePlanId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProratePlanId(String value) {
        this.proratePlanId = value;
    }

    /**
     * Gets the value of the proratePlanName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProratePlanName() {
        return proratePlanName;
    }

    /**
     * Sets the value of the proratePlanName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProratePlanName(String value) {
        this.proratePlanName = value;
    }

    /**
     * Gets the value of the relationshipType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelationshipType() {
        return relationshipType;
    }

    /**
     * Sets the value of the relationshipType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelationshipType(String value) {
        this.relationshipType = value;
    }

    /**
     * Gets the value of the targetGracePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetGracePeriod() {
        return targetGracePeriod;
    }

    /**
     * Sets the value of the targetGracePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetGracePeriod(String value) {
        this.targetGracePeriod = value;
    }

    /**
     * Gets the value of the targetGracePeriodUOM property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetGracePeriodUOM() {
        return targetGracePeriodUOM;
    }

    /**
     * Sets the value of the targetGracePeriodUOM property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetGracePeriodUOM(String value) {
        this.targetGracePeriodUOM = value;
    }

    /**
     * Gets the value of the targetPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetPeriod() {
        return targetPeriod;
    }

    /**
     * Sets the value of the targetPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetPeriod(String value) {
        this.targetPeriod = value;
    }

    /**
     * Gets the value of the targetPeriodUOM property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetPeriodUOM() {
        return targetPeriodUOM;
    }

    /**
     * Sets the value of the targetPeriodUOM property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetPeriodUOM(String value) {
        this.targetPeriodUOM = value;
    }

    /**
     * Gets the value of the targetPromotionDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetPromotionDescription() {
        return targetPromotionDescription;
    }

    /**
     * Sets the value of the targetPromotionDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetPromotionDescription(String value) {
        this.targetPromotionDescription = value;
    }

    /**
     * Gets the value of the targetPromotionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetPromotionName() {
        return targetPromotionName;
    }

    /**
     * Sets the value of the targetPromotionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetPromotionName(String value) {
        this.targetPromotionName = value;
    }

    /**
     * Gets the value of the operation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperation() {
        return operation;
    }

    /**
     * Sets the value of the operation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperation(String value) {
        this.operation = value;
    }

    /**
     * Gets the value of the searchspec property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchspec() {
        return searchspec;
    }

    /**
     * Sets the value of the searchspec property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchspec(String value) {
        this.searchspec = value;
    }

}
