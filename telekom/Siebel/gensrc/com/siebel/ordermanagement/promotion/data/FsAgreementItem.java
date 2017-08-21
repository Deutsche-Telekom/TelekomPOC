
package com.siebel.ordermanagement.promotion.data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FsAgreementItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FsAgreementItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AgreementId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AgreementItemEndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AgreementItemStartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AgreementName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AgreementNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AssetIntegrationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GracePeriod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GracePeriodUOM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IntegrationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ParentAgreementItemId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Period" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PeriodUOM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProdItemId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProdPromId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProdPromInstanceId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProdPromName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProdPromRuleId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProdPromSourceId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Product" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProductDefTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProductId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProductTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PromotionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RootAgreementItemId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ListOfAgreementItemConditionalCharge" type="{http://siebel.com/OrderManagement/Promotion/Data}ListOfAgreementItemConditionalCharge" minOccurs="0"/>
 *         &lt;element name="ListOfIssPromotionAgreeItemCoveredAssets" type="{http://siebel.com/OrderManagement/Promotion/Data}ListOfIssPromotionAgreeItemCoveredAssets" minOccurs="0"/>
 *         &lt;element name="FsAgreementItem" type="{http://siebel.com/OrderManagement/Promotion/Data}FsAgreementItem" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "FsAgreementItem", propOrder = {
    "agreementId",
    "agreementItemEndDate",
    "agreementItemStartDate",
    "agreementName",
    "agreementNumber",
    "assetIntegrationId",
    "gracePeriod",
    "gracePeriodUOM",
    "integrationId",
    "parentAgreementItemId",
    "period",
    "periodUOM",
    "prodItemId",
    "prodPromId",
    "prodPromInstanceId",
    "prodPromName",
    "prodPromRuleId",
    "prodPromSourceId",
    "product",
    "productDefTypeCode",
    "productId",
    "productTypeCode",
    "promotionId",
    "rootAgreementItemId",
    "status",
    "listOfAgreementItemConditionalCharge",
    "listOfIssPromotionAgreeItemCoveredAssets",
    "fsAgreementItem"
})
public class FsAgreementItem
    implements Serializable
{

    @XmlElement(name = "AgreementId")
    protected String agreementId;
    @XmlElement(name = "AgreementItemEndDate")
    protected String agreementItemEndDate;
    @XmlElement(name = "AgreementItemStartDate")
    protected String agreementItemStartDate;
    @XmlElement(name = "AgreementName")
    protected String agreementName;
    @XmlElement(name = "AgreementNumber")
    protected String agreementNumber;
    @XmlElement(name = "AssetIntegrationId")
    protected String assetIntegrationId;
    @XmlElement(name = "GracePeriod")
    protected String gracePeriod;
    @XmlElement(name = "GracePeriodUOM")
    protected String gracePeriodUOM;
    @XmlElement(name = "IntegrationId")
    protected String integrationId;
    @XmlElement(name = "ParentAgreementItemId")
    protected String parentAgreementItemId;
    @XmlElement(name = "Period")
    protected String period;
    @XmlElement(name = "PeriodUOM")
    protected String periodUOM;
    @XmlElement(name = "ProdItemId")
    protected String prodItemId;
    @XmlElement(name = "ProdPromId")
    protected String prodPromId;
    @XmlElement(name = "ProdPromInstanceId")
    protected String prodPromInstanceId;
    @XmlElement(name = "ProdPromName")
    protected String prodPromName;
    @XmlElement(name = "ProdPromRuleId")
    protected String prodPromRuleId;
    @XmlElement(name = "ProdPromSourceId")
    protected String prodPromSourceId;
    @XmlElement(name = "Product")
    protected String product;
    @XmlElement(name = "ProductDefTypeCode")
    protected String productDefTypeCode;
    @XmlElement(name = "ProductId")
    protected String productId;
    @XmlElement(name = "ProductTypeCode")
    protected String productTypeCode;
    @XmlElement(name = "PromotionId")
    protected String promotionId;
    @XmlElement(name = "RootAgreementItemId")
    protected String rootAgreementItemId;
    @XmlElement(name = "Status")
    protected String status;
    @XmlElement(name = "ListOfAgreementItemConditionalCharge")
    protected ListOfAgreementItemConditionalCharge listOfAgreementItemConditionalCharge;
    @XmlElement(name = "ListOfIssPromotionAgreeItemCoveredAssets")
    protected ListOfIssPromotionAgreeItemCoveredAssets listOfIssPromotionAgreeItemCoveredAssets;
    @XmlElement(name = "FsAgreementItem")
    protected List<FsAgreementItem> fsAgreementItem;
    @XmlAttribute
    protected String operation;
    @XmlAttribute
    protected String searchspec;

    /**
     * Gets the value of the agreementId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgreementId() {
        return agreementId;
    }

    /**
     * Sets the value of the agreementId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgreementId(String value) {
        this.agreementId = value;
    }

    /**
     * Gets the value of the agreementItemEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgreementItemEndDate() {
        return agreementItemEndDate;
    }

    /**
     * Sets the value of the agreementItemEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgreementItemEndDate(String value) {
        this.agreementItemEndDate = value;
    }

    /**
     * Gets the value of the agreementItemStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgreementItemStartDate() {
        return agreementItemStartDate;
    }

    /**
     * Sets the value of the agreementItemStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgreementItemStartDate(String value) {
        this.agreementItemStartDate = value;
    }

    /**
     * Gets the value of the agreementName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgreementName() {
        return agreementName;
    }

    /**
     * Sets the value of the agreementName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgreementName(String value) {
        this.agreementName = value;
    }

    /**
     * Gets the value of the agreementNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgreementNumber() {
        return agreementNumber;
    }

    /**
     * Sets the value of the agreementNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgreementNumber(String value) {
        this.agreementNumber = value;
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
     * Gets the value of the integrationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntegrationId() {
        return integrationId;
    }

    /**
     * Sets the value of the integrationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntegrationId(String value) {
        this.integrationId = value;
    }

    /**
     * Gets the value of the parentAgreementItemId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentAgreementItemId() {
        return parentAgreementItemId;
    }

    /**
     * Sets the value of the parentAgreementItemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentAgreementItemId(String value) {
        this.parentAgreementItemId = value;
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
     * Gets the value of the prodItemId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProdItemId() {
        return prodItemId;
    }

    /**
     * Sets the value of the prodItemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProdItemId(String value) {
        this.prodItemId = value;
    }

    /**
     * Gets the value of the prodPromId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProdPromId() {
        return prodPromId;
    }

    /**
     * Sets the value of the prodPromId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProdPromId(String value) {
        this.prodPromId = value;
    }

    /**
     * Gets the value of the prodPromInstanceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProdPromInstanceId() {
        return prodPromInstanceId;
    }

    /**
     * Sets the value of the prodPromInstanceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProdPromInstanceId(String value) {
        this.prodPromInstanceId = value;
    }

    /**
     * Gets the value of the prodPromName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProdPromName() {
        return prodPromName;
    }

    /**
     * Sets the value of the prodPromName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProdPromName(String value) {
        this.prodPromName = value;
    }

    /**
     * Gets the value of the prodPromRuleId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProdPromRuleId() {
        return prodPromRuleId;
    }

    /**
     * Sets the value of the prodPromRuleId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProdPromRuleId(String value) {
        this.prodPromRuleId = value;
    }

    /**
     * Gets the value of the prodPromSourceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProdPromSourceId() {
        return prodPromSourceId;
    }

    /**
     * Sets the value of the prodPromSourceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProdPromSourceId(String value) {
        this.prodPromSourceId = value;
    }

    /**
     * Gets the value of the product property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProduct() {
        return product;
    }

    /**
     * Sets the value of the product property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProduct(String value) {
        this.product = value;
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
     * Gets the value of the productId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductId() {
        return productId;
    }

    /**
     * Sets the value of the productId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductId(String value) {
        this.productId = value;
    }

    /**
     * Gets the value of the productTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductTypeCode() {
        return productTypeCode;
    }

    /**
     * Sets the value of the productTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductTypeCode(String value) {
        this.productTypeCode = value;
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
     * Gets the value of the rootAgreementItemId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRootAgreementItemId() {
        return rootAgreementItemId;
    }

    /**
     * Sets the value of the rootAgreementItemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRootAgreementItemId(String value) {
        this.rootAgreementItemId = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the listOfAgreementItemConditionalCharge property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfAgreementItemConditionalCharge }
     *     
     */
    public ListOfAgreementItemConditionalCharge getListOfAgreementItemConditionalCharge() {
        return listOfAgreementItemConditionalCharge;
    }

    /**
     * Sets the value of the listOfAgreementItemConditionalCharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfAgreementItemConditionalCharge }
     *     
     */
    public void setListOfAgreementItemConditionalCharge(ListOfAgreementItemConditionalCharge value) {
        this.listOfAgreementItemConditionalCharge = value;
    }

    /**
     * Gets the value of the listOfIssPromotionAgreeItemCoveredAssets property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfIssPromotionAgreeItemCoveredAssets }
     *     
     */
    public ListOfIssPromotionAgreeItemCoveredAssets getListOfIssPromotionAgreeItemCoveredAssets() {
        return listOfIssPromotionAgreeItemCoveredAssets;
    }

    /**
     * Sets the value of the listOfIssPromotionAgreeItemCoveredAssets property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfIssPromotionAgreeItemCoveredAssets }
     *     
     */
    public void setListOfIssPromotionAgreeItemCoveredAssets(ListOfIssPromotionAgreeItemCoveredAssets value) {
        this.listOfIssPromotionAgreeItemCoveredAssets = value;
    }

    /**
     * Gets the value of the fsAgreementItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fsAgreementItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFsAgreementItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FsAgreementItem }
     * 
     * 
     */
    public List<FsAgreementItem> getFsAgreementItem() {
        if (fsAgreementItem == null) {
            fsAgreementItem = new ArrayList<FsAgreementItem>();
        }
        return this.fsAgreementItem;
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
