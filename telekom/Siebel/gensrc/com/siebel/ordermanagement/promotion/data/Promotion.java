
package com.siebel.ordermanagement.promotion.data;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Promotion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Promotion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AdjustCharge" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AdjustReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ChargeBasis" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CommitFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ConfigurationModelId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GracePeriod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GracePeriodUOM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ImageName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ImageFileDockReqFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ImageFileDockStatFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ImageFileExt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ImageFileName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ImageFileRev" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ImageFileSize" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Instance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NRCAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NRCAmountCurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NRCAmountExchangeDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NRCPlanId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NRCPlanName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NRCQty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NRCSchedule" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NRCScheduleId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Period" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PeriodUOM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PositionBillProductFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProductDefTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PromotionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PromotionImageIntegrationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PromotionType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RCAdjustmentAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RCAdjustmentUM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RCAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RCAmountCurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RCAmountExchangeDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RCSchedule" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RCScheduleId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Reason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SalesProductFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Score" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TrackAsAgreementFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TrackAsAssetFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TrackAsInstanceFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UsagePlanId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UsagePlanName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UsageSchedule" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UsageScheduleId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ThumbnImageFileDockReqFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ThumbnImageFileDockStatFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ThumbnImageFileExt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ThumbnImageFileName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ThumbnImageFileRev" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ThumbnImageFileSize" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ListOfPromotionComponentsRulesSummary" type="{http://siebel.com/OrderManagement/Promotion/Data}ListOfPromotionComponentsRulesSummary" minOccurs="0"/>
 *         &lt;element name="ListOfPromotionPricingRulesSummary" type="{http://siebel.com/OrderManagement/Promotion/Data}ListOfPromotionPricingRulesSummary" minOccurs="0"/>
 *         &lt;element name="ListOfPromotionChargesCredits" type="{http://siebel.com/OrderManagement/Promotion/Data}ListOfPromotionChargesCredits" minOccurs="0"/>
 *         &lt;element name="ListOfPromotionMessages" type="{http://siebel.com/OrderManagement/Promotion/Data}ListOfPromotionMessages" minOccurs="0"/>
 *         &lt;element name="ListOfPromotionTerms" type="{http://siebel.com/OrderManagement/Promotion/Data}ListOfPromotionTerms" minOccurs="0"/>
 *         &lt;element name="ListOfPromotionUpgrade" type="{http://siebel.com/OrderManagement/Promotion/Data}ListOfPromotionUpgrade" minOccurs="0"/>
 *         &lt;element name="ListOfIssPromotionVersionsBuscomp" type="{http://siebel.com/OrderManagement/Promotion/Data}ListOfIssPromotionVersionsBuscomp" minOccurs="0"/>
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
@XmlType(name = "Promotion", propOrder = {
    "id",
    "adjustCharge",
    "adjustReason",
    "chargeBasis",
    "commitFlag",
    "configurationModelId",
    "description",
    "endDate",
    "gracePeriod",
    "gracePeriodUOM",
    "imageName",
    "imageFileDockReqFlg",
    "imageFileDockStatFlg",
    "imageFileExt",
    "imageFileName",
    "imageFileRev",
    "imageFileSize",
    "instance",
    "nrcAmount",
    "nrcAmountCurrencyCode",
    "nrcAmountExchangeDate",
    "nrcPlanId",
    "nrcPlanName",
    "nrcQty",
    "nrcSchedule",
    "nrcScheduleId",
    "name",
    "period",
    "periodUOM",
    "positionBillProductFlag",
    "productDefTypeCode",
    "promotionId",
    "promotionImageIntegrationId",
    "promotionType",
    "rcAdjustmentAmount",
    "rcAdjustmentUM",
    "rcAmount",
    "rcAmountCurrencyCode",
    "rcAmountExchangeDate",
    "rcSchedule",
    "rcScheduleId",
    "reason",
    "salesProductFlag",
    "score",
    "startDate",
    "trackAsAgreementFlag",
    "trackAsAssetFlag",
    "trackAsInstanceFlag",
    "usagePlanId",
    "usagePlanName",
    "usageSchedule",
    "usageScheduleId",
    "thumbnImageFileDockReqFlg",
    "thumbnImageFileDockStatFlg",
    "thumbnImageFileExt",
    "thumbnImageFileName",
    "thumbnImageFileRev",
    "thumbnImageFileSize",
    "listOfPromotionComponentsRulesSummary",
    "listOfPromotionPricingRulesSummary",
    "listOfPromotionChargesCredits",
    "listOfPromotionMessages",
    "listOfPromotionTerms",
    "listOfPromotionUpgrade",
    "listOfIssPromotionVersionsBuscomp"
})
public class Promotion
    implements Serializable
{

    @XmlElement(name = "Id")
    protected String id;
    @XmlElement(name = "AdjustCharge")
    protected String adjustCharge;
    @XmlElement(name = "AdjustReason")
    protected String adjustReason;
    @XmlElement(name = "ChargeBasis")
    protected String chargeBasis;
    @XmlElement(name = "CommitFlag")
    protected String commitFlag;
    @XmlElement(name = "ConfigurationModelId")
    protected String configurationModelId;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "EndDate")
    protected String endDate;
    @XmlElement(name = "GracePeriod")
    protected String gracePeriod;
    @XmlElement(name = "GracePeriodUOM")
    protected String gracePeriodUOM;
    @XmlElement(name = "ImageName")
    protected String imageName;
    @XmlElement(name = "ImageFileDockReqFlg")
    protected String imageFileDockReqFlg;
    @XmlElement(name = "ImageFileDockStatFlg")
    protected String imageFileDockStatFlg;
    @XmlElement(name = "ImageFileExt")
    protected String imageFileExt;
    @XmlElement(name = "ImageFileName")
    protected String imageFileName;
    @XmlElement(name = "ImageFileRev")
    protected String imageFileRev;
    @XmlElement(name = "ImageFileSize")
    protected String imageFileSize;
    @XmlElement(name = "Instance")
    protected String instance;
    @XmlElement(name = "NRCAmount")
    protected String nrcAmount;
    @XmlElement(name = "NRCAmountCurrencyCode")
    protected String nrcAmountCurrencyCode;
    @XmlElement(name = "NRCAmountExchangeDate")
    protected String nrcAmountExchangeDate;
    @XmlElement(name = "NRCPlanId")
    protected String nrcPlanId;
    @XmlElement(name = "NRCPlanName")
    protected String nrcPlanName;
    @XmlElement(name = "NRCQty")
    protected String nrcQty;
    @XmlElement(name = "NRCSchedule")
    protected String nrcSchedule;
    @XmlElement(name = "NRCScheduleId")
    protected String nrcScheduleId;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Period")
    protected String period;
    @XmlElement(name = "PeriodUOM")
    protected String periodUOM;
    @XmlElement(name = "PositionBillProductFlag")
    protected String positionBillProductFlag;
    @XmlElement(name = "ProductDefTypeCode")
    protected String productDefTypeCode;
    @XmlElement(name = "PromotionId")
    protected String promotionId;
    @XmlElement(name = "PromotionImageIntegrationId")
    protected String promotionImageIntegrationId;
    @XmlElement(name = "PromotionType")
    protected String promotionType;
    @XmlElement(name = "RCAdjustmentAmount")
    protected String rcAdjustmentAmount;
    @XmlElement(name = "RCAdjustmentUM")
    protected String rcAdjustmentUM;
    @XmlElement(name = "RCAmount")
    protected String rcAmount;
    @XmlElement(name = "RCAmountCurrencyCode")
    protected String rcAmountCurrencyCode;
    @XmlElement(name = "RCAmountExchangeDate")
    protected String rcAmountExchangeDate;
    @XmlElement(name = "RCSchedule")
    protected String rcSchedule;
    @XmlElement(name = "RCScheduleId")
    protected String rcScheduleId;
    @XmlElement(name = "Reason")
    protected String reason;
    @XmlElement(name = "SalesProductFlag")
    protected String salesProductFlag;
    @XmlElement(name = "Score")
    protected String score;
    @XmlElement(name = "StartDate")
    protected String startDate;
    @XmlElement(name = "TrackAsAgreementFlag")
    protected String trackAsAgreementFlag;
    @XmlElement(name = "TrackAsAssetFlag")
    protected String trackAsAssetFlag;
    @XmlElement(name = "TrackAsInstanceFlag")
    protected String trackAsInstanceFlag;
    @XmlElement(name = "UsagePlanId")
    protected String usagePlanId;
    @XmlElement(name = "UsagePlanName")
    protected String usagePlanName;
    @XmlElement(name = "UsageSchedule")
    protected String usageSchedule;
    @XmlElement(name = "UsageScheduleId")
    protected String usageScheduleId;
    @XmlElement(name = "ThumbnImageFileDockReqFlg")
    protected String thumbnImageFileDockReqFlg;
    @XmlElement(name = "ThumbnImageFileDockStatFlg")
    protected String thumbnImageFileDockStatFlg;
    @XmlElement(name = "ThumbnImageFileExt")
    protected String thumbnImageFileExt;
    @XmlElement(name = "ThumbnImageFileName")
    protected String thumbnImageFileName;
    @XmlElement(name = "ThumbnImageFileRev")
    protected String thumbnImageFileRev;
    @XmlElement(name = "ThumbnImageFileSize")
    protected String thumbnImageFileSize;
    @XmlElement(name = "ListOfPromotionComponentsRulesSummary")
    protected ListOfPromotionComponentsRulesSummary listOfPromotionComponentsRulesSummary;
    @XmlElement(name = "ListOfPromotionPricingRulesSummary")
    protected ListOfPromotionPricingRulesSummary listOfPromotionPricingRulesSummary;
    @XmlElement(name = "ListOfPromotionChargesCredits")
    protected ListOfPromotionChargesCredits listOfPromotionChargesCredits;
    @XmlElement(name = "ListOfPromotionMessages")
    protected ListOfPromotionMessages listOfPromotionMessages;
    @XmlElement(name = "ListOfPromotionTerms")
    protected ListOfPromotionTerms listOfPromotionTerms;
    @XmlElement(name = "ListOfPromotionUpgrade")
    protected ListOfPromotionUpgrade listOfPromotionUpgrade;
    @XmlElement(name = "ListOfIssPromotionVersionsBuscomp")
    protected ListOfIssPromotionVersionsBuscomp listOfIssPromotionVersionsBuscomp;
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
     * Gets the value of the adjustCharge property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdjustCharge() {
        return adjustCharge;
    }

    /**
     * Sets the value of the adjustCharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdjustCharge(String value) {
        this.adjustCharge = value;
    }

    /**
     * Gets the value of the adjustReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdjustReason() {
        return adjustReason;
    }

    /**
     * Sets the value of the adjustReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdjustReason(String value) {
        this.adjustReason = value;
    }

    /**
     * Gets the value of the chargeBasis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChargeBasis() {
        return chargeBasis;
    }

    /**
     * Sets the value of the chargeBasis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChargeBasis(String value) {
        this.chargeBasis = value;
    }

    /**
     * Gets the value of the commitFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommitFlag() {
        return commitFlag;
    }

    /**
     * Sets the value of the commitFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommitFlag(String value) {
        this.commitFlag = value;
    }

    /**
     * Gets the value of the configurationModelId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfigurationModelId() {
        return configurationModelId;
    }

    /**
     * Sets the value of the configurationModelId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfigurationModelId(String value) {
        this.configurationModelId = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndDate(String value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the gracePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGracePeriod() {
        return gracePeriod;
    }

    /**
     * Sets the value of the gracePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGracePeriod(String value) {
        this.gracePeriod = value;
    }

    /**
     * Gets the value of the gracePeriodUOM property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGracePeriodUOM() {
        return gracePeriodUOM;
    }

    /**
     * Sets the value of the gracePeriodUOM property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGracePeriodUOM(String value) {
        this.gracePeriodUOM = value;
    }

    /**
     * Gets the value of the imageName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImageName() {
        return imageName;
    }

    /**
     * Sets the value of the imageName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImageName(String value) {
        this.imageName = value;
    }

    /**
     * Gets the value of the imageFileDockReqFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImageFileDockReqFlg() {
        return imageFileDockReqFlg;
    }

    /**
     * Sets the value of the imageFileDockReqFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImageFileDockReqFlg(String value) {
        this.imageFileDockReqFlg = value;
    }

    /**
     * Gets the value of the imageFileDockStatFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImageFileDockStatFlg() {
        return imageFileDockStatFlg;
    }

    /**
     * Sets the value of the imageFileDockStatFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImageFileDockStatFlg(String value) {
        this.imageFileDockStatFlg = value;
    }

    /**
     * Gets the value of the imageFileExt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImageFileExt() {
        return imageFileExt;
    }

    /**
     * Sets the value of the imageFileExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImageFileExt(String value) {
        this.imageFileExt = value;
    }

    /**
     * Gets the value of the imageFileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImageFileName() {
        return imageFileName;
    }

    /**
     * Sets the value of the imageFileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImageFileName(String value) {
        this.imageFileName = value;
    }

    /**
     * Gets the value of the imageFileRev property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImageFileRev() {
        return imageFileRev;
    }

    /**
     * Sets the value of the imageFileRev property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImageFileRev(String value) {
        this.imageFileRev = value;
    }

    /**
     * Gets the value of the imageFileSize property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImageFileSize() {
        return imageFileSize;
    }

    /**
     * Sets the value of the imageFileSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImageFileSize(String value) {
        this.imageFileSize = value;
    }

    /**
     * Gets the value of the instance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstance() {
        return instance;
    }

    /**
     * Sets the value of the instance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstance(String value) {
        this.instance = value;
    }

    /**
     * Gets the value of the nrcAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNRCAmount() {
        return nrcAmount;
    }

    /**
     * Sets the value of the nrcAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNRCAmount(String value) {
        this.nrcAmount = value;
    }

    /**
     * Gets the value of the nrcAmountCurrencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNRCAmountCurrencyCode() {
        return nrcAmountCurrencyCode;
    }

    /**
     * Sets the value of the nrcAmountCurrencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNRCAmountCurrencyCode(String value) {
        this.nrcAmountCurrencyCode = value;
    }

    /**
     * Gets the value of the nrcAmountExchangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNRCAmountExchangeDate() {
        return nrcAmountExchangeDate;
    }

    /**
     * Sets the value of the nrcAmountExchangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNRCAmountExchangeDate(String value) {
        this.nrcAmountExchangeDate = value;
    }

    /**
     * Gets the value of the nrcPlanId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNRCPlanId() {
        return nrcPlanId;
    }

    /**
     * Sets the value of the nrcPlanId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNRCPlanId(String value) {
        this.nrcPlanId = value;
    }

    /**
     * Gets the value of the nrcPlanName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNRCPlanName() {
        return nrcPlanName;
    }

    /**
     * Sets the value of the nrcPlanName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNRCPlanName(String value) {
        this.nrcPlanName = value;
    }

    /**
     * Gets the value of the nrcQty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNRCQty() {
        return nrcQty;
    }

    /**
     * Sets the value of the nrcQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNRCQty(String value) {
        this.nrcQty = value;
    }

    /**
     * Gets the value of the nrcSchedule property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNRCSchedule() {
        return nrcSchedule;
    }

    /**
     * Sets the value of the nrcSchedule property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNRCSchedule(String value) {
        this.nrcSchedule = value;
    }

    /**
     * Gets the value of the nrcScheduleId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNRCScheduleId() {
        return nrcScheduleId;
    }

    /**
     * Sets the value of the nrcScheduleId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNRCScheduleId(String value) {
        this.nrcScheduleId = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the period property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPeriod() {
        return period;
    }

    /**
     * Sets the value of the period property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPeriod(String value) {
        this.period = value;
    }

    /**
     * Gets the value of the periodUOM property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPeriodUOM() {
        return periodUOM;
    }

    /**
     * Sets the value of the periodUOM property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPeriodUOM(String value) {
        this.periodUOM = value;
    }

    /**
     * Gets the value of the positionBillProductFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPositionBillProductFlag() {
        return positionBillProductFlag;
    }

    /**
     * Sets the value of the positionBillProductFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPositionBillProductFlag(String value) {
        this.positionBillProductFlag = value;
    }

    /**
     * Gets the value of the productDefTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductDefTypeCode() {
        return productDefTypeCode;
    }

    /**
     * Sets the value of the productDefTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductDefTypeCode(String value) {
        this.productDefTypeCode = value;
    }

    /**
     * Gets the value of the promotionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromotionId() {
        return promotionId;
    }

    /**
     * Sets the value of the promotionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromotionId(String value) {
        this.promotionId = value;
    }

    /**
     * Gets the value of the promotionImageIntegrationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromotionImageIntegrationId() {
        return promotionImageIntegrationId;
    }

    /**
     * Sets the value of the promotionImageIntegrationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromotionImageIntegrationId(String value) {
        this.promotionImageIntegrationId = value;
    }

    /**
     * Gets the value of the promotionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromotionType() {
        return promotionType;
    }

    /**
     * Sets the value of the promotionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromotionType(String value) {
        this.promotionType = value;
    }

    /**
     * Gets the value of the rcAdjustmentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRCAdjustmentAmount() {
        return rcAdjustmentAmount;
    }

    /**
     * Sets the value of the rcAdjustmentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRCAdjustmentAmount(String value) {
        this.rcAdjustmentAmount = value;
    }

    /**
     * Gets the value of the rcAdjustmentUM property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRCAdjustmentUM() {
        return rcAdjustmentUM;
    }

    /**
     * Sets the value of the rcAdjustmentUM property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRCAdjustmentUM(String value) {
        this.rcAdjustmentUM = value;
    }

    /**
     * Gets the value of the rcAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRCAmount() {
        return rcAmount;
    }

    /**
     * Sets the value of the rcAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRCAmount(String value) {
        this.rcAmount = value;
    }

    /**
     * Gets the value of the rcAmountCurrencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRCAmountCurrencyCode() {
        return rcAmountCurrencyCode;
    }

    /**
     * Sets the value of the rcAmountCurrencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRCAmountCurrencyCode(String value) {
        this.rcAmountCurrencyCode = value;
    }

    /**
     * Gets the value of the rcAmountExchangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRCAmountExchangeDate() {
        return rcAmountExchangeDate;
    }

    /**
     * Sets the value of the rcAmountExchangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRCAmountExchangeDate(String value) {
        this.rcAmountExchangeDate = value;
    }

    /**
     * Gets the value of the rcSchedule property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRCSchedule() {
        return rcSchedule;
    }

    /**
     * Sets the value of the rcSchedule property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRCSchedule(String value) {
        this.rcSchedule = value;
    }

    /**
     * Gets the value of the rcScheduleId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRCScheduleId() {
        return rcScheduleId;
    }

    /**
     * Sets the value of the rcScheduleId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRCScheduleId(String value) {
        this.rcScheduleId = value;
    }

    /**
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReason(String value) {
        this.reason = value;
    }

    /**
     * Gets the value of the salesProductFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesProductFlag() {
        return salesProductFlag;
    }

    /**
     * Sets the value of the salesProductFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesProductFlag(String value) {
        this.salesProductFlag = value;
    }

    /**
     * Gets the value of the score property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScore() {
        return score;
    }

    /**
     * Sets the value of the score property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScore(String value) {
        this.score = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartDate(String value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the trackAsAgreementFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrackAsAgreementFlag() {
        return trackAsAgreementFlag;
    }

    /**
     * Sets the value of the trackAsAgreementFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrackAsAgreementFlag(String value) {
        this.trackAsAgreementFlag = value;
    }

    /**
     * Gets the value of the trackAsAssetFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrackAsAssetFlag() {
        return trackAsAssetFlag;
    }

    /**
     * Sets the value of the trackAsAssetFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrackAsAssetFlag(String value) {
        this.trackAsAssetFlag = value;
    }

    /**
     * Gets the value of the trackAsInstanceFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrackAsInstanceFlag() {
        return trackAsInstanceFlag;
    }

    /**
     * Sets the value of the trackAsInstanceFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrackAsInstanceFlag(String value) {
        this.trackAsInstanceFlag = value;
    }

    /**
     * Gets the value of the usagePlanId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsagePlanId() {
        return usagePlanId;
    }

    /**
     * Sets the value of the usagePlanId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsagePlanId(String value) {
        this.usagePlanId = value;
    }

    /**
     * Gets the value of the usagePlanName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsagePlanName() {
        return usagePlanName;
    }

    /**
     * Sets the value of the usagePlanName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsagePlanName(String value) {
        this.usagePlanName = value;
    }

    /**
     * Gets the value of the usageSchedule property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsageSchedule() {
        return usageSchedule;
    }

    /**
     * Sets the value of the usageSchedule property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsageSchedule(String value) {
        this.usageSchedule = value;
    }

    /**
     * Gets the value of the usageScheduleId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsageScheduleId() {
        return usageScheduleId;
    }

    /**
     * Sets the value of the usageScheduleId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsageScheduleId(String value) {
        this.usageScheduleId = value;
    }

    /**
     * Gets the value of the thumbnImageFileDockReqFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThumbnImageFileDockReqFlg() {
        return thumbnImageFileDockReqFlg;
    }

    /**
     * Sets the value of the thumbnImageFileDockReqFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThumbnImageFileDockReqFlg(String value) {
        this.thumbnImageFileDockReqFlg = value;
    }

    /**
     * Gets the value of the thumbnImageFileDockStatFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThumbnImageFileDockStatFlg() {
        return thumbnImageFileDockStatFlg;
    }

    /**
     * Sets the value of the thumbnImageFileDockStatFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThumbnImageFileDockStatFlg(String value) {
        this.thumbnImageFileDockStatFlg = value;
    }

    /**
     * Gets the value of the thumbnImageFileExt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThumbnImageFileExt() {
        return thumbnImageFileExt;
    }

    /**
     * Sets the value of the thumbnImageFileExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThumbnImageFileExt(String value) {
        this.thumbnImageFileExt = value;
    }

    /**
     * Gets the value of the thumbnImageFileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThumbnImageFileName() {
        return thumbnImageFileName;
    }

    /**
     * Sets the value of the thumbnImageFileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThumbnImageFileName(String value) {
        this.thumbnImageFileName = value;
    }

    /**
     * Gets the value of the thumbnImageFileRev property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThumbnImageFileRev() {
        return thumbnImageFileRev;
    }

    /**
     * Sets the value of the thumbnImageFileRev property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThumbnImageFileRev(String value) {
        this.thumbnImageFileRev = value;
    }

    /**
     * Gets the value of the thumbnImageFileSize property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThumbnImageFileSize() {
        return thumbnImageFileSize;
    }

    /**
     * Sets the value of the thumbnImageFileSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThumbnImageFileSize(String value) {
        this.thumbnImageFileSize = value;
    }

    /**
     * Gets the value of the listOfPromotionComponentsRulesSummary property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfPromotionComponentsRulesSummary }
     *     
     */
    public ListOfPromotionComponentsRulesSummary getListOfPromotionComponentsRulesSummary() {
        return listOfPromotionComponentsRulesSummary;
    }

    /**
     * Sets the value of the listOfPromotionComponentsRulesSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfPromotionComponentsRulesSummary }
     *     
     */
    public void setListOfPromotionComponentsRulesSummary(ListOfPromotionComponentsRulesSummary value) {
        this.listOfPromotionComponentsRulesSummary = value;
    }

    /**
     * Gets the value of the listOfPromotionPricingRulesSummary property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfPromotionPricingRulesSummary }
     *     
     */
    public ListOfPromotionPricingRulesSummary getListOfPromotionPricingRulesSummary() {
        return listOfPromotionPricingRulesSummary;
    }

    /**
     * Sets the value of the listOfPromotionPricingRulesSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfPromotionPricingRulesSummary }
     *     
     */
    public void setListOfPromotionPricingRulesSummary(ListOfPromotionPricingRulesSummary value) {
        this.listOfPromotionPricingRulesSummary = value;
    }

    /**
     * Gets the value of the listOfPromotionChargesCredits property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfPromotionChargesCredits }
     *     
     */
    public ListOfPromotionChargesCredits getListOfPromotionChargesCredits() {
        return listOfPromotionChargesCredits;
    }

    /**
     * Sets the value of the listOfPromotionChargesCredits property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfPromotionChargesCredits }
     *     
     */
    public void setListOfPromotionChargesCredits(ListOfPromotionChargesCredits value) {
        this.listOfPromotionChargesCredits = value;
    }

    /**
     * Gets the value of the listOfPromotionMessages property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfPromotionMessages }
     *     
     */
    public ListOfPromotionMessages getListOfPromotionMessages() {
        return listOfPromotionMessages;
    }

    /**
     * Sets the value of the listOfPromotionMessages property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfPromotionMessages }
     *     
     */
    public void setListOfPromotionMessages(ListOfPromotionMessages value) {
        this.listOfPromotionMessages = value;
    }

    /**
     * Gets the value of the listOfPromotionTerms property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfPromotionTerms }
     *     
     */
    public ListOfPromotionTerms getListOfPromotionTerms() {
        return listOfPromotionTerms;
    }

    /**
     * Sets the value of the listOfPromotionTerms property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfPromotionTerms }
     *     
     */
    public void setListOfPromotionTerms(ListOfPromotionTerms value) {
        this.listOfPromotionTerms = value;
    }

    /**
     * Gets the value of the listOfPromotionUpgrade property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfPromotionUpgrade }
     *     
     */
    public ListOfPromotionUpgrade getListOfPromotionUpgrade() {
        return listOfPromotionUpgrade;
    }

    /**
     * Sets the value of the listOfPromotionUpgrade property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfPromotionUpgrade }
     *     
     */
    public void setListOfPromotionUpgrade(ListOfPromotionUpgrade value) {
        this.listOfPromotionUpgrade = value;
    }

    /**
     * Gets the value of the listOfIssPromotionVersionsBuscomp property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfIssPromotionVersionsBuscomp }
     *     
     */
    public ListOfIssPromotionVersionsBuscomp getListOfIssPromotionVersionsBuscomp() {
        return listOfIssPromotionVersionsBuscomp;
    }

    /**
     * Sets the value of the listOfIssPromotionVersionsBuscomp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfIssPromotionVersionsBuscomp }
     *     
     */
    public void setListOfIssPromotionVersionsBuscomp(ListOfIssPromotionVersionsBuscomp value) {
        this.listOfIssPromotionVersionsBuscomp = value;
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
