/*<ORACLECOPYRIGHT>
 * Copyright (C) 1994, 2015, Oracle and/or its affiliates. All rights reserved.
 * Oracle and Java are registered trademarks of Oracle and/or its affiliates.
 * Other names may be trademarks of their respective owners.
 * UNIX is a registered trademark of The Open Group.
 *
 * This software and related documentation are provided under a license agreement
 * containing restrictions on use and disclosure and are protected by intellectual property laws.
 * Except as expressly permitted in your license agreement or allowed by law, you may not use, copy,
 * reproduce, translate, broadcast, modify, license, transmit, distribute, exhibit, perform, publish,
 * or display any part, in any form, or by any means. Reverse engineering, disassembly,
 * or decompilation of this software, unless required by law for interoperability, is prohibited.
 *
 * The information contained herein is subject to change without notice and is not warranted to be error-free.
 * If you find any errors, please report them to us in writing.
 *
 * U.S. GOVERNMENT RIGHTS Programs, software, databases, and related documentation and technical data delivered to U.S.
 * Government customers are "commercial computer software" or "commercial technical data" pursuant to the applicable
 * Federal Acquisition Regulation and agency-specific supplemental regulations.
 * As such, the use, duplication, disclosure, modification, and adaptation shall be subject to the restrictions and
 * license terms set forth in the applicable Government contract, and, to the extent applicable by the terms of the
 * Government contract, the additional rights set forth in FAR 52.227-19, Commercial Computer Software License
 * (December 2007). Oracle America, Inc., 500 Oracle Parkway, Redwood City, CA 94065.
 *
 * This software or hardware is developed for general use in a variety of information management applications.
 * It is not developed or intended for use in any inherently dangerous applications, including applications that
 * may create a risk of personal injury. If you use this software or hardware in dangerous applications,
 * then you shall be responsible to take all appropriate fail-safe, backup, redundancy,
 * and other measures to ensure its safe use. Oracle Corporation and its affiliates disclaim any liability for any
 * damages caused by use of this software or hardware in dangerous applications.
 *
 * This software or hardware and documentation may provide access to or information on content,
 * products, and services from third parties. Oracle Corporation and its affiliates are not responsible for and
 * expressly disclaim all warranties of any kind with respect to third-party content, products, and services.
 * Oracle Corporation and its affiliates will not be responsible for any loss, costs,
 * or damages incurred due to your access to or use of third-party content, products, or services.
 </ORACLECOPYRIGHT>*/

package atg.siebel.asset;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import atg.repository.RepositoryItem;

/**
 * This class represents a Siebel Asset.
 * 
 * @author Sameena Y Patel
 */

public class SiebelAsset {
	// ----------------------------------------------------------------------------------
	// Class version string
	// ----------------------------------------------------------------------------------

	public static String CLASS_VERSION = "$Id: //product/Siebel/version/11.2/src/atg/siebel/asset/SiebelAsset.java#2 $$Change: 1194813 $";

	// ----------------------------------------------------------------------------------
	// Constants
	// ----------------------------------------------------------------------------------

	// ----------------------------------------------------------------------------------
	// Member Variables
	// ----------------------------------------------------------------------------------

	// ----------------------------------------------------------------------------------
	// Constructor
	// ----------------------------------------------------------------------------------

	/**
	 * Constructs a SiebelAttribute object.
	 */

	public SiebelAsset() {

	}

	// ----------------------------------------------------------------------------------
	// Properties
	// ----------------------------------------------------------------------------------

	private Integer mQuantity = null;
	// ----------------------------------------------------------------------------------
	// property: id

	private String mId = null;

	public Integer getQuantity() {
		return mQuantity;
	}

	public void setQuantity(Integer pQuantity) {
		mQuantity = pQuantity;
	}

	/**
	 * Returns the asset id
	 * 
	 * @return the asset id
	 */

	public String getId() {
		return mId;
	}

	/**
	 * Sets the asset id
	 * 
	 * @param pId
	 *            the asset id to set
	 */

	public void setId(String pId) {
		mId = pId;
	}

	// ----------------------------------------------------------------------------------
	// Properties
	// ----------------------------------------------------------------------------------

	// ----------------------------------------------------------------------------------
	// property: assetNumber

	private String mAssetNumber = null;

	/**
	 * Returns the asset number
	 * 
	 * @return the asset number
	 */

	public String getAssetNumber() {
		return mAssetNumber;
	}

	/**
	 * Sets the asset number
	 * 
	 * @param pAssetNumber
	 *            the asset number to set
	 */

	public void setAssetNumber(String pAssetNumber) {
		mAssetNumber = pAssetNumber;
	}

	// ----------------------------------------------------------------------------------
	// Properties
	// ----------------------------------------------------------------------------------

	// ----------------------------------------------------------------------------------
	// property: productId

	private String mProductId = null;

	/**
	 * Returns the product id
	 * 
	 * @return the product id
	 */

	public String getProductId() {
		return mProductId;
	}

	/**
	 * Sets the product id
	 * 
	 * @param pProductId
	 *            the product id to set
	 */

	public void setProductId(String pProductId) {
		mProductId = pProductId;
	}

	// ----------------------------------------------------------------------------------
	// Properties
	// ----------------------------------------------------------------------------------

	// ----------------------------------------------------------------------------------
	// property: productName

	private String mProductName = null;

	/**
	 * Returns the product name
	 * 
	 * @return the product name
	 */

	public String getProductName() {
		return mProductName;
	}

	/**
	 * Sets the product name
	 * 
	 * @param pProductName
	 *            the product name to set
	 */

	public void setProductName(String pProductName) {
		mProductName = pProductName;
	}

	// ----------------------------------------------------------------------------------
	// Properties
	// ----------------------------------------------------------------------------------

	// property: siebelType
	private String mSiebelType = null;
 
	/**
	 * Returns the siebel type
	 * 
	 * @return the siebel type
	*/
 
	public String getSiebelType() {
		return mSiebelType;
	}

	/**
	 * Sets the siebel type
	 * 
	 * @param pSiebelType
	 *            the siebel type to set
	*/
	public void setSiebelType(String pSiebelType) {
		mSiebelType = pSiebelType;
	}
 
	// ----------------------------------------------------------------------------------
	// property: productType

	
	private String mProductType = null;

	/**
	 * Returns the product type
	 * 
	 * @return the product type
	 */

	public String getProductType() {
		return mProductType;
	}

	/**
	 * Sets the product type
	 * 
	 * @param pProductType
	 *            the product type to set
	 */

	public void setProductType(String pProductType) {
		mProductType = pProductType;
	}

	// ----------------------------------------------------------------------------------
	// Properties
	// ----------------------------------------------------------------------------------

	// ----------------------------------------------------------------------------------
	// property: installDate

	private Date mInstallDate = null;

	/**
	 * Returns the install date
	 * 
	 * @return the install date
	 */

	public Date getInstallDate() {
		return mInstallDate;
	}

	/**
	 * Sets the install date
	 * 
	 * @param pInstallDate
	 *            the install date to set
	 */

	public void setInstallDate(Date pInstallDate) {
		mInstallDate = pInstallDate;
	}

	// ----------------------------------------------------------------------------------
	// Properties
	// ----------------------------------------------------------------------------------

	// ----------------------------------------------------------------------------------
	// property: status

	private String mStatus = null;

	/**
	 * Returns the asset status
	 * 
	 * @return the asset status
	 */

	public String getStatus() {
		return mStatus;
	}

	/**
	 * Sets the asset status
	 * 
	 * @param pStatus
	 *            the asset status
	 */

	public void setStatus(String pStatus) {
		mStatus = pStatus;
	}

	// ----------------------------------------------------------------------------------
	// Properties
	// ----------------------------------------------------------------------------------

	// ----------------------------------------------------------------------------------
	// property: ownerAccountId

	private String mOwnerAccountId = null;

	/**
	 * Returns the owner account id
	 * 
	 * @return the owner account id
	 */

	public String getOwnerAccountId() {
		return mOwnerAccountId;
	}

	/**
	 * Sets the owner account id
	 * 
	 * @param pOwnerAccountId
	 *            the owner account id
	 */

	public void setOwnerAccountId(String pOwnerAccountId) {
		mOwnerAccountId = pOwnerAccountId;
	}

	// ----------------------------------------------------------------------------------
	// Properties
	// ----------------------------------------------------------------------------------

	// ----------------------------------------------------------------------------------
	// property: owner

	private String mOwner = null;

	/**
	 * Returns the owner
	 * 
	 * @return the owner
	 */

	public String getOwner() {
		return mOwner;
	}

	/**
	 * Sets the owner
	 * 
	 * @param pOwner
	 *            the owner
	 */

	public void setOwner(String pOwner) {
		mOwner = pOwner;
	}

	// ----------------------------------------------------------------------------------
	// Properties
	// ----------------------------------------------------------------------------------

	// ----------------------------------------------------------------------------------
	// property: ownerContactId

	private String mOwnerContactId = null;

	/**
	 * Returns the owner contact id
	 * 
	 * @return the owner contact id
	 */

	public String getOwnerContactId() {
		return mOwnerContactId;
	}

	/**
	 * Sets the owner contact id
	 * 
	 * @param pOwnerContactId
	 *            the owner contact id
	 */

	public void setOwnerContactId(String pOwnerContactId) {
		mOwnerContactId = pOwnerContactId;
	}

	// ----------------------------------------------------------------------------------
	// Properties
	// ----------------------------------------------------------------------------------

	// ----------------------------------------------------------------------------------
	// property: prodPromId

	private String mProdPromId = null;

	/**
	 * Returns the product promotion id
	 * 
	 * @return the product promotion id
	 */

	public String getProdPromId() {
		return mProdPromId;
	}

	/**
	 * Sets the product promotion id
	 * 
	 * @param pProdPromId
	 *            the product promotion id
	 */

	public void setProdPromId(String pProdPromId) {
		mProdPromId = pProdPromId;
	}

	// ----------------------------------------------------------------------------------
	// Properties
	// ----------------------------------------------------------------------------------

	// ----------------------------------------------------------------------------------
	// property: integrationId

	private String mIntegrationId = null;

	/**
	 * Returns the integration id
	 * 
	 * @return the integration id
	 */

	public String getIntegrationId() {
		return mIntegrationId;
	}

	/**
	 * Sets the integration id
	 * 
	 * @param pIntegrationId
	 *            the integration id
	 */

	public void setIntegrationId(String pIntegrationId) {
		mIntegrationId = pIntegrationId;
	}

	// ----------------------------------------------------------------------------------
	// Properties
	// ----------------------------------------------------------------------------------

	// ----------------------------------------------------------------------------------
	// property: billingAccount

	private String mBillingAccount = null;

	/**
	 * Returns the billing account
	 * 
	 * @return the billing account
	 */

	public String getBillingAccount() {
		return mBillingAccount;
	}

	/**
	 * Sets the billing account
	 * 
	 * @param pBillingAccount
	 *            the billing account
	 */

	public void setBillingAccount(String pBillingAccount) {
		mBillingAccount = pBillingAccount;
	}

	// ----------------------------------------------------------------------------------
	// Properties
	// ----------------------------------------------------------------------------------

	// ----------------------------------------------------------------------------------
	// property: SoldToAccount

	private String mSoldToAccount = null;

	/**
	 * Returns the sold to account
	 * 
	 * @return the sold to account
	 */

	public String getSoldToAccount() {
		return mSoldToAccount;
	}

	/**
	 * Sets the sold to account
	 * 
	 * @param pSoldToAccount
	 *            the sold to account
	 */

	public void setSoldToAccount(String pSoldToAccount) {
		mSoldToAccount = pSoldToAccount;
	}

	// ----------------------------------------------------------------------------------
	// Properties
	// ----------------------------------------------------------------------------------

	// ----------------------------------------------------------------------------------
	// property: Description

	private String mDescription = null;

	/**
	 * Returns the description
	 * 
	 * @return the description
	 */

	public String getDescription() {
		return mDescription;
	}

	/**
	 * Sets the description
	 * 
	 * @param pDescription
	 *            the description
	 */

	public void setDescription(String pDescription) {
		mDescription = pDescription;
	}

	// ----------------------------------------------------------------------------------
	// Properties
	// ----------------------------------------------------------------------------------

	// ----------------------------------------------------------------------------------
	// property: EffectiveEndDate

	private Date mEffectiveEndDate = null;

	/**
	 * Returns the effective end date
	 * 
	 * @return the effective end date
	 */

	public Date getEffectiveEndDate() {
		return mEffectiveEndDate;
	}

	/**
	 * Sets the effective end date
	 * 
	 * @param pEffectiveEndDate
	 *            the effective end date
	 */

	public void setEffectiveEndDate(Date pEffectiveEndDate) {
		mEffectiveEndDate = pEffectiveEndDate;
	}

	// ----------------------------------------------------------------------------------
	// Properties
	// ----------------------------------------------------------------------------------

	// ----------------------------------------------------------------------------------
	// property: ExtendedQuantity

	private String mExtendedQuantity = null;

	/**
	 * Returns the extended quantity
	 * 
	 * @return the extended quantity
	 */

	public String getExtendedQuantity() {
		return mExtendedQuantity;
	}

	/**
	 * Sets the extended quantity
	 * 
	 * @param pExtendedQuantity
	 *            the extended quantity
	 */

	public void setExtendedQuantity(String pExtendedQuantity) {
		mExtendedQuantity = pExtendedQuantity;
	}

	// ----------------------------------------------------------------------------------
	// Properties
	// ----------------------------------------------------------------------------------

	// ----------------------------------------------------------------------------------
	// property: SerialNumber

	private String mSerialNumber = null;

	/**
	 * Returns the serial number
	 * 
	 * @return the serial number
	 */

	public String getSerialNumber() {
		return mSerialNumber;
	}

	/**
	 * Sets the serial number
	 * 
	 * @param pSerialNumber
	 *            the serial number
	 */

	public void setSerialNumber(String pSerialNumber) {
		mSerialNumber = pSerialNumber;
	}

	// ----------------------------------------------------------------------------------
	// Properties
	// ----------------------------------------------------------------------------------

	// ----------------------------------------------------------------------------------
	// property: WarrantyEndDate

	private Date mWarrantyEndDate = null;

	/**
	 * Returns the warranty end date
	 * 
	 * @return the warranty end date
	 */

	public Date getWarrantyEndDate() {
		return mWarrantyEndDate;
	}

	/**
	 * Sets the warranty end date
	 * 
	 * @param pWarrantyEndDate
	 *            the warranty end date
	 */

	public void setWarrantyEndDate(Date pWarrantyEndDate) {
		mWarrantyEndDate = pWarrantyEndDate;
	}

	// ----------------------------------------------------------------------------------
	// Properties
	// ----------------------------------------------------------------------------------

	// ----------------------------------------------------------------------------------
	// property: WarrantyStartDate

	private Date mWarrantyStartDate = null;

	/**
	 * Returns the warranty start date
	 * 
	 * @return the warranty start date
	 */

	public Date getWarrantyStartDate() {
		return mWarrantyStartDate;
	}

	/**
	 * Sets the warranty start date
	 * 
	 * @param pWarrantyStartDate
	 *            the warranty start date
	 */

	public void setWarrantyStartDate(Date pWarrantyStartDate) {
		mWarrantyStartDate = pWarrantyStartDate;
	}

	// ----------------------------------------------------------------------------------
	// Properties
	// ----------------------------------------------------------------------------------

	// ----------------------------------------------------------------------------------
	// property: WarrantyType

	private String mWarrantyType = null;

	/**
	 * Returns the warranty type
	 * 
	 * @return the warranty type
	 */

	public String getWarrantyType() {
		return mWarrantyType;
	}

	/**
	 * Sets the warranty type
	 * 
	 * @param pWarrantyType
	 *            the warranty type
	 */

	public void setWarrantyType(String pWarrantyType) {
		mWarrantyType = pWarrantyType;
	}

	// ----------------------------------------------------------------------------------
	// Properties
	// ----------------------------------------------------------------------------------

	// ----------------------------------------------------------------------------------
	// property: BillingProfileName

	private String mBillingProfileName = null;

	/**
	 * Returns the billing profile name
	 * 
	 * @return the billing profile name
	 */

	public String getBillingProfileName() {
		return mBillingProfileName;
	}

	/**
	 * Sets the billing profile name
	 * 
	 * @param pBillingProfileName
	 *            the billing profile name
	 */

	public void setBillingProfileName(String pBillingProfileName) {
		mBillingProfileName = pBillingProfileName;
	}

	// ----------------------------------------------------------------------------------
	// Properties
	// ----------------------------------------------------------------------------------

	// ----------------------------------------------------------------------------------
	// property: childAssets

	private ArrayList<SiebelAsset> mChildAssets = null;

	/**
	 * Returns the child assets
	 * 
	 * @return the child assets
	 */

	public ArrayList<SiebelAsset> getChildAssets() {
		return mChildAssets;
	}

	/**
	 * Sets the child assets
	 * 
	 * @param pChildAssets
	 *            the child assets
	 */

	public void setChildAssets(ArrayList<SiebelAsset> pChildAssets) {
		mChildAssets = pChildAssets;
	}

	// ----------------------------------------------------------------------------------
	// Properties
	// ----------------------------------------------------------------------------------

	// ----------------------------------------------------------------------------------
	// property: adjustedListPrice

	private String mAdjustedListPrice = null;

	/**
	 * Returns the adjusted list price
	 * 
	 * @return the adjusted list price
	 */

	public String getAdjustedListPrice() {
		return mAdjustedListPrice;
	}

	/**
	 * Sets the adjustedListPrice
	 * 
	 * @param pAdjustedListPrice
	 *            the adjusted list price
	 */

	public void setAdjustedListPrice(String pAdjustedListPrice) {
		mAdjustedListPrice = pAdjustedListPrice;
	}

	// ----------------------------------------------------------------------------------
	// Properties
	// ----------------------------------------------------------------------------------

	// ----------------------------------------------------------------------------------
	// property: attributes

	private ArrayList<SiebelAttribute> mAttributes = null;

	/**
	 * Returns the attributes
	 * 
	 * @return the attributes
	 */

	public ArrayList<SiebelAttribute> getAttributes() {
		return mAttributes;
	}

	/**
	 * Sets the attributes
	 * 
	 * @param pAttributes
	 *            the attributes
	 */

	public void setAttributes(ArrayList<SiebelAttribute> pAttributes) {
		mAttributes = pAttributes;
	}

	// ----------------------------------------------------------------------------------
	// property: mRelatedPromotions

	private ArrayList<String> mRelatedPromotions = null;

	public ArrayList<String> getRelatedPromotions() {
		return mRelatedPromotions;
	}

	public void setRelatedPromotions(ArrayList<String> mRelatedPromotions) {
		this.mRelatedPromotions = mRelatedPromotions;
	}
	
	//----------------------------------------------------------------------------------
	// property: upgradePromotion

	private ArrayList<UpgradePromotion> mUpgradePromotions = null;

	/**
	 * @return the upgradePromotions
	 */
	public ArrayList<UpgradePromotion> getUpgradePromotions() {
	  return mUpgradePromotions;
	}

	/**
	 * @param pUpgradePromotions
	 *          the upgradePromotions to set
	 */
	public void setUpgradePromotions(
	    ArrayList<UpgradePromotion> pUpgradePromotions) {
	  this.mUpgradePromotions = pUpgradePromotions;
	}
}
