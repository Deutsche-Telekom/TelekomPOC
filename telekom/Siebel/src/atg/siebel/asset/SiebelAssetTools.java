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

import atg.beans.PropertyNotFoundException;
import atg.commerce.order.Order;
import atg.core.util.StringUtils;
import atg.nucleus.GenericService;
import atg.repository.*;
import atg.service.resourcepool.ResourcePoolException;
import atg.siebel.catalog.SiebelCatalogTools;
import atg.siebel.configurator.Constants;
import atg.siebel.integration.SiebelWebServiceConfigurationException;
import atg.siebel.integration.WebServiceController;
import atg.siebel.integration.WebServiceHelper;
import atg.siebel.order.SiebelCommerceItem;
import atg.siebel.order.SiebelPropertyNameConstants;
import com.siebel.ordermanagement.abo.ModifyAssetToQuoteInput;
import com.siebel.ordermanagement.abo.ModifyAssetToQuoteOutput;
import com.siebel.ordermanagement.promotion.UpgradePromotionToQuoteInput;
import com.siebel.ordermanagement.promotion.UpgradePromotionToQuoteOutput;
import com.siebel.ordermanagement.quote.DeleteQuoteItemInput;
import com.siebel.ordermanagement.quote.data.Quote;
import com.siebel.ordermanagement.quote.item.data.ListOfQuoteItem;
import com.siebel.ordermanagement.quote.item.data.ListOfQuoteItemBO;
import com.siebel.ordermanagement.quote.item.data.QuoteItem;
import com.siebel.service.fs.assets.AssetManagementComplexQueryPageInput;
import com.siebel.service.fs.assets.AssetManagementComplexQueryPageOutput;
import com.siebel.service.fs.assets.AssetManagementQueryPageInput;
import com.siebel.service.fs.assets.AssetManagementQueryPageOutput;
import com.siebel.xml.asset_management_complex_io.data.AssetMgmtAssetHeaderData;
import com.siebel.xml.asset_management_complex_io.data.AssetMgmtAssetXaData;
import com.siebel.xml.asset_management_complex_io.data.ListOfAssetMgmtAssetXaData;
import com.siebel.xml.asset_management_complex_io.query.*;
import com.siebel.xml.asset_management_io.data.AssetMgmtAssetData;
import com.siebel.xml.asset_management_io.query.AssetMgmtAssetQuery;
import com.siebel.xml.asset_management_io.query.ListOfAssetManagementIoQuery;

import javax.xml.datatype.XMLGregorianCalendar;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.NumberFormat;
import java.util.*;

/**
 * A collection of helper methods for interacting with Siebel.
 * 
 * @author Sameena Y Patel
 * @version $Id: //product/Siebel/version/11.2/src/atg/siebel/asset/SiebelAssetTools.java#2 $$Change: 1194813 $
 * @updated $DateTime: 2015/09/10 08:26:24 $$Author: saysyed $
 */
public class SiebelAssetTools extends GenericService  {
	// ----------------------------------------------------------------------------------
	// Class version string
	// ----------------------------------------------------------------------------------

	public static String CLASS_VERSION = "$Id: //product/Siebel/version/11.2/src/atg/siebel/asset/SiebelAssetTools.java#2 $$Change: 1194813 $";

	public static final String M_PROMOTION = "Promotion";


  protected WebServiceController mWebServiceController;

  // --------- Property: WebServiceController ------------
  public void setWebServiceController(WebServiceController pWebServiceController)
  {
    mWebServiceController = pWebServiceController;
  }

  public WebServiceController getWebServiceController()
  {
    return mWebServiceController;
  }

	// --------- Property: webServiceHelper -----------
	protected WebServiceHelper mWebServiceHelper;

	public void setWebServiceHelper(WebServiceHelper pWebServiceHelper) {
		mWebServiceHelper = pWebServiceHelper;
	}

	public WebServiceHelper getWebServiceHelper() {
		return mWebServiceHelper;
	}

	// --------- Property: catalogTools -----------
	protected SiebelCatalogTools mCatalogTools;

	public void setCatalogTools(SiebelCatalogTools pCatalogTools) {
		mCatalogTools = pCatalogTools;
	}

	public SiebelCatalogTools getCatalogTools() {
		return mCatalogTools;
	}

	// property: promotionRelationshipDescriptor

	private String mPromotionRelationshipDescriptor = "promotion-relationship";

	/**
	 * Returns the product class item descriptor name
	 * 
	 * @return the product class item descriptor name
	 */

	public String getPromotionRelationshipDescriptor() {
		return mPromotionRelationshipDescriptor;
	}

	/**
	 * Sets the product class item descriptor name
	 * 
	 * @param pPromotionRelationshipDescriptor
	 *            the product class item descriptor name to set
	 */

	public void setPromotionRelationshipDescriptor(
			String pPromotionRelationshipDescriptor) {
		mPromotionRelationshipDescriptor = pPromotionRelationshipDescriptor;
	}

	public ArrayList<SiebelAsset> getAssets(String accountId, String contactId,
			String status, SiebelAssetList siebelAssetList) {
		LinkedHashMap<String, SiebelAsset> customerAssets = siebelAssetList.getCustomerAssets();

		if(customerAssets != null){
		  return new ArrayList<SiebelAsset>(customerAssets.values());
		}
		AssetManagementQueryPageOutput output = invokeAssetManagementWS(
				accountId, contactId, status);

		if (output != null) {
			if (output.getListOfAssetManagementIo().getAssetMgmtAsset() != null
					&& output.getListOfAssetManagementIo().getAssetMgmtAsset()
							.size() > 0) {
				customerAssets = new LinkedHashMap<String, SiebelAsset>();
				Iterator<AssetMgmtAssetData> assetItr = output
						.getListOfAssetManagementIo().getAssetMgmtAsset()
						.iterator();

				while (assetItr.hasNext()) {
					AssetMgmtAssetData asset = (AssetMgmtAssetData) assetItr
							.next();

					SiebelAsset sblAsset = new SiebelAsset();
					sblAsset.setAssetNumber(asset.getAssetNumber());
					sblAsset.setId(asset.getAssetId());
					sblAsset.setIntegrationId(asset.getIntegrationId());
					sblAsset.setInstallDate(convertToDate(asset
							.getInstallDate()));
					sblAsset.setOwnerAccountId(asset.getOwnerAccountId());
					sblAsset.setOwnerContactId(asset.getOwnerContactId());
					sblAsset.setProdPromId(asset.getProdPromId());
					sblAsset.setProductId(asset.getProductId());
					sblAsset.setProductName(asset.getProductName());
					sblAsset.setProductType(asset.getProductType());
					//Modified by SYPATEL for bug# 17502220
					sblAsset.setOwner(asset.getAccountName());
					sblAsset.setBillingAccount(asset.getBillingAccount());
					sblAsset.setSoldToAccount(asset.getServiceAccount());
					sblAsset.setStatus(asset.getStatus());
					sblAsset.setBillingProfileName(asset
							.getBillingProfileName());
					sblAsset.setDescription(asset.getAssetDescription());
					sblAsset.setEffectiveEndDate(convertToDate(asset
							.getEffectiveEndDate()));
					if (asset.getExtendedQuantity() != null) {
						sblAsset.setExtendedQuantity(asset
								.getExtendedQuantity().toString());
					}
					sblAsset.setSerialNumber(asset.getSerialNumber());
					sblAsset.setWarrantyEndDate(convertToDate(asset
							.getWarrantyEndDate()));
					sblAsset.setWarrantyStartDate(convertToDate(asset
							.getWarrantyStartDate()));
					sblAsset.setWarrantyType(asset.getWarrantyType());
					sblAsset.setAdjustedListPrice(formatPrice(asset
							.getAdjustedListPrice()));

					if (asset.getAssetMgmtAsset() != null
							&& asset.getAssetMgmtAsset().size() > 0) {
						populateChildAssets(sblAsset, asset.getAssetMgmtAsset());
					}
					if (isLoggingDebug()) {
					    logDebug("Adding to the map: " + asset.getAssetId());
						logDebug("Size of the map: " + customerAssets.size());
					}
					customerAssets.put(asset.getAssetId(), sblAsset);
				}
				siebelAssetList.setCustomerAssets(customerAssets);
				return new ArrayList<SiebelAsset>(customerAssets.values());
			}
		}
		return null;
	}

	private String formatPrice(BigDecimal adjustedListPrice) {
		// TODO Auto-generated method stub
		if (adjustedListPrice != null) {
			NumberFormat currencyFormatter = NumberFormat
					.getCurrencyInstance(Locale.US);

			return currencyFormatter.format(adjustedListPrice);

		}
		return null;
	}

	private void populateChildAssets(SiebelAsset sblAsset,
			List<AssetMgmtAssetData> assetMgmtAsset) {
		// TODO Auto-generated method stub
		if (assetMgmtAsset != null && assetMgmtAsset.size() > 0) {
			Iterator<AssetMgmtAssetData> itr = assetMgmtAsset.iterator();
			ArrayList<SiebelAsset> childAssets = new ArrayList<SiebelAsset>();

			while (itr.hasNext()) {
				AssetMgmtAssetData asset = (AssetMgmtAssetData) itr.next();

				SiebelAsset childAsset = new SiebelAsset();
				childAsset.setAssetNumber(asset.getAssetNumber());
				childAsset.setQuantity(asset.getQuantity());
				childAsset.setId(asset.getAssetId());
				childAsset.setInstallDate(convertToDate(asset.getInstallDate()));
				childAsset.setDescription(asset.getAssetDescription());
				childAsset.setProductName(asset.getProductName());
				childAsset.setDescription(asset.getProductDescription());
				childAsset.setAdjustedListPrice(formatPrice(asset.getAdjustedListPrice()));
				childAssets.add(childAsset);
			}
			sblAsset.setChildAssets(childAssets);
		}

	}

	public Date convertToDate(XMLGregorianCalendar javaUtilCalendar) {
		if (javaUtilCalendar == null)
			return null;
		long javaMilliSeconds = javaUtilCalendar.toGregorianCalendar()
				.getTimeInMillis();
		java.util.Date javaDate = new java.util.Date();
		javaDate.setTime(javaMilliSeconds);
		return javaDate;
	}

	public ArrayList<SiebelAsset> getAssets(String accountId, String contactId, SiebelAssetList siebelAssetList) {
		return getAssets(accountId, contactId, null, siebelAssetList);
	}

	public ArrayList<SiebelAsset> getAssets(String accountId, String contactId,
			String status, int startIndex, int endIndex, SiebelAssetList siebelAssetList) {
		getAssets(accountId, contactId, status, siebelAssetList);

		LinkedHashMap<String, SiebelAsset> customerAssets = siebelAssetList.getCustomerAssets();
		if (customerAssets != null && !(startIndex < 0) && !(endIndex < 0)) {
			int start = 0, end = 0;
			if ((startIndex + 1) <= customerAssets.size()) {
				start = startIndex;
			}

			if ((endIndex + 1) <= customerAssets.size()) {
				end = endIndex + 1;
			} else {
				end = customerAssets.size();
			}

			ArrayList<SiebelAsset> subAssets = new ArrayList<SiebelAsset>(
					(new ArrayList<SiebelAsset>(customerAssets.values()))
							.subList(start, end));

			Iterator<SiebelAsset> itr = subAssets.iterator();

			while (itr.hasNext()) {
				SiebelAsset asset = itr.next();
				if (asset.getProductType().equalsIgnoreCase("Promotion")
						&& null == asset.getChildAssets()) {
				    if (isLoggingDebug()) {
						logDebug("Populating child assets for: " + asset.getProductName());
					}
				    populatePromoAssetChildren(asset);
				}
			}
			return subAssets;
		}

		return null;
	}

	/**
	 * Calls the webservice - uses webServiceHelper to provide port
	 * configuration
	 * 
	 * @param accountId
	 *            contactId status
	 * 
	 * @return
	 */
	protected AssetManagementQueryPageOutput invokeAssetManagementWS(
			String accountId, String contactId, String status) {
		if (isLoggingDebug()) {
		logDebug("invokeAssetManagementWS() called : pInput == {0}" + accountId);
		logDebug("invokeAssetManagementWS() called : pInput == {1}" + contactId);
		}
		AssetManagementQueryPageInput input = new AssetManagementQueryPageInput();
		input.setLOVLanguageMode("LDC");
		input.setViewMode("All");

		ListOfAssetManagementIoQuery listOfAssetMgmtQuery = new ListOfAssetManagementIoQuery();
		listOfAssetMgmtQuery
				.setStartrownum(new BigInteger(Integer.toString(0)));
		listOfAssetMgmtQuery.setPagesize(new BigInteger("100"));
		listOfAssetMgmtQuery.setRecordcountneeded(true);

		AssetMgmtAssetQuery assetQuery = new AssetMgmtAssetQuery();

		assetQuery.setAssetId(getEmptyQueryType());
		assetQuery.setAssetNumber(getEmptyQueryType());
		assetQuery.setProductPartNumber(getEmptyQueryType());
		assetQuery.setProductId(getEmptyQueryType());
		assetQuery.setProductName(getEmptyQueryType());
		assetQuery.setProductDescription(getEmptyQueryType());
		assetQuery.setProductType(getEmptyQueryType());
		assetQuery.setBillingAccountId(getEmptyQueryType());
		assetQuery.setBillingAccount(getEmptyQueryType());
		assetQuery.setServiceAccountId(getEmptyQueryType());
		assetQuery.setServiceAccount(getEmptyQueryType());
		assetQuery.setOwnerContactId(getEmptyQueryType());
		assetQuery.setPriceType(getEmptyQueryType());
		assetQuery.setAdjustedValue(getEmptyQueryType());
		assetQuery.setInstallDate(getEmptyQueryType());
		assetQuery.setIntegrationId(getEmptyQueryType());
		assetQuery.setSerialNumber(getEmptyQueryType());
		assetQuery.setInstallDate(getEmptyQueryType());
		assetQuery.setStatus(getEmptyQueryType());
		assetQuery.setProdPromId(getEmptyQueryType());
		assetQuery.setProductType(getEmptyQueryType());
		assetQuery.setProductDefTypeCode(getEmptyQueryType());
		assetQuery.setPurchaseDate(getEmptyQueryType());
		assetQuery.setAssetCurrencyCode(getEmptyQueryType());
		assetQuery.setAdjustedListPrice(getEmptyQueryType());
		assetQuery.setConvertToAgreementFlag(getEmptyQueryType());
		assetQuery.setAssetDescription(getEmptyQueryType());
		//Bug 17442026 - set empty query type for owner
		assetQuery.setOwnerAccountId(getEmptyQueryType());
		//Modified by SYPATEL for bug# 17502220
		assetQuery.setAccountName(getEmptyQueryType());

		if (isLoggingDebug()) {
		  logDebug("Setting the passed criteria in the query to WS");
		}
		String searchSpec = "[ProdPromId] = ''";
		boolean addANDClause = true;

		if (isNonNull(accountId)) {
			if (addANDClause)
				searchSpec = searchSpec + " AND";
			searchSpec = searchSpec + "(";
			searchSpec = searchSpec + "[BillingAccountId] = '" + accountId
					+ "' OR [ServiceAccountId] = '" + accountId
					+ "' OR [OwnerAccountId] = '" + accountId + "'";
			if (isNonNull(contactId)) {
				searchSpec = searchSpec + " OR [OwnerContactId] = '"
						+ contactId + "'";
			}
			searchSpec = searchSpec + ")";
			addANDClause = true;
		}
		if (!isNonNull(accountId) && isNonNull(contactId)) {
			if (addANDClause)
				searchSpec = searchSpec + " AND";
			searchSpec = searchSpec + " [OwnerContactId] = '" + contactId + "'";
			addANDClause = true;
		}
		if (isNonNull(status)) {
			if (addANDClause)
				searchSpec = searchSpec + " AND";
			searchSpec = searchSpec + " [Status] ='" + status + "'";
			addANDClause = true;
		}

		if (isLoggingDebug()) {
		  logDebug("Setting the following searchspec in the Asset WebService Call : "
						+ searchSpec);
		}
		assetQuery.setSearchspec(searchSpec);

		listOfAssetMgmtQuery.setAssetMgmtAsset(assetQuery);
		input.setListOfAssetManagementIo(listOfAssetMgmtQuery);

		//AssetManagement assetWS = new AssetManagement();
		//AssetManagementPort assetWSPort = assetWS.getAssetManagementPort();
		//getWebServiceHelper().prepareConnection((BindingProvider) assetWSPort);


    //AssetManagementQueryPageOutput output = assetWSPort
    //    .assetManagementQueryPage(input);

    AssetManagementQueryPageOutput output = null;
    try {
      output = (AssetManagementQueryPageOutput)getWebServiceController().callWebService(
              "com.siebel.service.fs.assets.AssetManagement",
              "AssetManagementPort",
              "assetManagementQueryPage",
              input,
              this,
              getWebServiceHelper());
    } catch (ResourcePoolException e) {
      if(isLoggingError())
        logError(e);
    } catch (NoSuchMethodException e) {
      if(isLoggingError())
        logError(e);
    } catch (InvocationTargetException e) {
      if(isLoggingError())
        logError(e);
    } catch (IllegalAccessException e) {
      if(isLoggingError())
        logError(e);
    } catch (SiebelWebServiceConfigurationException e) {
      if(isLoggingError())
        logError(e);
    }


    return output;
	}

	protected void populatePromoAssetChildren(SiebelAsset parentAsset) {
		if (parentAsset != null && parentAsset.getIntegrationId() != null) {
		  
		    if (isLoggingDebug()) {
		      logDebug("queryAssetChildren() called : pInput "
					+ parentAsset.getIntegrationId());
		    }

			AssetManagementQueryPageInput input = new AssetManagementQueryPageInput();
			input.setLOVLanguageMode("LDC");
			input.setViewMode("All");

			ListOfAssetManagementIoQuery listOfAssetMgmtQuery = new ListOfAssetManagementIoQuery();
			listOfAssetMgmtQuery.setStartrownum(new BigInteger(Integer
					.toString(0)));
			listOfAssetMgmtQuery.setPagesize(new BigInteger("100"));
			listOfAssetMgmtQuery.setRecordcountneeded(true);

			AssetMgmtAssetQuery assetQuery = new AssetMgmtAssetQuery();

			assetQuery.setAssetId(getEmptyQueryType());
			assetQuery.setAssetNumber(getEmptyQueryType());
			assetQuery.setProductPartNumber(getEmptyQueryType());
			assetQuery.setProductId(getEmptyQueryType());
			assetQuery.setProductName(getEmptyQueryType());
			assetQuery.setProductDescription(getEmptyQueryType());
			assetQuery.setProductType(getEmptyQueryType());
			assetQuery.setBillingAccountId(getEmptyQueryType());
			assetQuery.setBillingAccount(getEmptyQueryType());
			assetQuery.setServiceAccountId(getEmptyQueryType());
			assetQuery.setServiceAccount(getEmptyQueryType());
			assetQuery.setOwnerContactId(getEmptyQueryType());
			assetQuery.setPriceType(getEmptyQueryType());
			assetQuery.setAdjustedValue(getEmptyQueryType());
			assetQuery.setInstallDate(getEmptyQueryType());
			assetQuery.setIntegrationId(getEmptyQueryType());
			assetQuery.setSerialNumber(getEmptyQueryType());
			assetQuery.setInstallDate(getEmptyQueryType());
			assetQuery.setStatus(getEmptyQueryType());
			assetQuery.setProdPromId(getEmptyQueryType());
			assetQuery.setProductType(getEmptyQueryType());
			assetQuery.setProductDefTypeCode(getEmptyQueryType());
			assetQuery.setPurchaseDate(getEmptyQueryType());
			assetQuery.setAssetCurrencyCode(getEmptyQueryType());
			assetQuery.setAdjustedListPrice(getEmptyQueryType());
			assetQuery.setConvertToAgreementFlag(getEmptyQueryType());

			if (isLoggingDebug()) {
			  logDebug("Setting the passed criteria in the query to WS");
			}

			StringBuffer searchSpec = new StringBuffer("");
			
			if (parentAsset.getOwnerAccountId() != null && parentAsset.getOwnerAccountId().trim().length() > 0) {
				searchSpec.append("[OwnerAccountId] = '").append(parentAsset.getOwnerAccountId()).append("' AND ");
			}
			
			searchSpec.append("[ProdPromInstanceId] = '").append(parentAsset.getIntegrationId()).append("' AND [Status] ='Active'");
				
			if (isLoggingDebug()) {
			  logDebug("Setting the following searchspec in the Asset WebService Call : "
                    + searchSpec.toString());
			}
			assetQuery.setSearchspec(searchSpec.toString());

			listOfAssetMgmtQuery.setAssetMgmtAsset(assetQuery);
			input.setListOfAssetManagementIo(listOfAssetMgmtQuery);

			//AssetManagement assetWS = new AssetManagement();
			//AssetManagementPort assetWSPort = assetWS.getAssetManagementPort();
			//getWebServiceHelper().prepareConnection(
			//		(BindingProvider) assetWSPort);


	     //AssetManagementQueryPageOutput output = assetWSPort
	     //     .assetManagementQueryPage(input);

      AssetManagementQueryPageOutput output = null;
      try {
        output = (AssetManagementQueryPageOutput)getWebServiceController().callWebService(
              "com.siebel.service.fs.assets.AssetManagement",
              "AssetManagementPort",
              "assetManagementQueryPage",
              input,
              this,
              getWebServiceHelper());
      } catch (ResourcePoolException e) {
        if(isLoggingError())
          logError(e);
      } catch (NoSuchMethodException e) {
        if(isLoggingError())
          logError(e);
      } catch (InvocationTargetException e) {
        if(isLoggingError())
          logError(e);
      } catch (IllegalAccessException e) {
        if(isLoggingError())
          logError(e);
      } catch (SiebelWebServiceConfigurationException e) {
        if(isLoggingError())
          logError(e);
      }


      if (output != null && output.getListOfAssetManagementIo() != null) {
				populateChildAssets(parentAsset, output
						.getListOfAssetManagementIo().getAssetMgmtAsset());
			}

		}
	}

	protected void populateAssetAttributes(SiebelAsset _asset) {
		if (_asset != null) {
			if (isLoggingDebug()) {
			  logDebug("getAssetAttributes() called : pInput " + _asset.getId());
			}

			AssetManagementComplexQueryPageInput input = new AssetManagementComplexQueryPageInput();
			input.setLOVLanguageMode("LDC");
			input.setViewMode("All");
			input.setExecutionMode("ForwardOnly");

			ListOfAssetQuery lstAssetQuery = new ListOfAssetQuery();
			lstAssetQuery.setPagesize(new BigInteger("10"));
			lstAssetQuery.setRecordcountneeded(true);

			AssetMgmtAssetHeaderQuery assetHeaderQuery = new AssetMgmtAssetHeaderQuery();

			assetHeaderQuery.setAssetNumber(getEmptyComplexQueryType());
			assetHeaderQuery.setProductId(getEmptyComplexQueryType());
			assetHeaderQuery.setProductName(getEmptyComplexQueryType());
			assetHeaderQuery.setId(getEmptyComplexQueryType());

			if (isLoggingDebug()) {
			  logDebug("Setting the passed criteria in the query to WS");
			}

			String searchSpec = "[Id] ='" + _asset.getId() + "'";

			if (_asset.getProductType().equals(M_PROMOTION)
					&& _asset.getChildAssets() != null) {
				Iterator<SiebelAsset> childAssetItr = _asset.getChildAssets()
						.iterator();

				while (childAssetItr.hasNext()) {
					SiebelAsset childAsset = childAssetItr.next();
					searchSpec.concat(" OR [Id] = '");
					searchSpec.concat(childAsset.getId());
					searchSpec.concat("'");
				}
			}
			if (isLoggingDebug()) {
			  logDebug("Setting the following searchspec in the Asset WebService Call : "
				    + searchSpec);
			}

			assetHeaderQuery.setSearchspec(searchSpec);

			ListOfAssetMgmtAssetQuery lstAssetMgmtAssetQuery = new ListOfAssetMgmtAssetQuery();
			lstAssetMgmtAssetQuery.setPagesize(new BigInteger("10"));

			com.siebel.xml.asset_management_complex_io.query.AssetMgmtAssetQuery assetMgmtAssetQuery = new com.siebel.xml.asset_management_complex_io.query.AssetMgmtAssetQuery();
			assetMgmtAssetQuery.setAssetId(getEmptyComplexQueryType());
			assetMgmtAssetQuery.setAssetNumber(getEmptyComplexQueryType());

			ListOfAssetMgmtAssetXaQuery lstAssetMgmtAssetXaQuery = new ListOfAssetMgmtAssetXaQuery();
			AssetMgmtAssetXaQuery assetMgmtAssetXaQuery = new AssetMgmtAssetXaQuery();
			assetMgmtAssetXaQuery.setDisplayName(getEmptyComplexQueryType());
			assetMgmtAssetXaQuery.setDescription(getEmptyComplexQueryType());
			assetMgmtAssetXaQuery.setValue(getEmptyComplexQueryType());
			lstAssetMgmtAssetXaQuery.setAssetMgmtAssetXa(assetMgmtAssetXaQuery);

			assetMgmtAssetQuery
					.setListOfAssetMgmtAssetXa(lstAssetMgmtAssetXaQuery);
			lstAssetMgmtAssetQuery.setAssetMgmtAsset(assetMgmtAssetQuery);

			assetHeaderQuery.setListOfAssetMgmtAsset(lstAssetMgmtAssetQuery);
			lstAssetQuery.setAssetMgmtAssetHeader(assetHeaderQuery);
			input.setListOfAsset(lstAssetQuery);

			//AssetManagementComplex assetComplexWS = new AssetManagementComplex();
			//AssetManagementComplexPort assetComplexWSPort = assetComplexWS
			//		.getAssetManagementComplexPort();
			//getWebServiceHelper().prepareConnection(
			//		(BindingProvider) assetComplexWSPort);

	    //AssetManagementComplexQueryPageOutput output = assetComplexWSPort
	    //    .assetManagementComplexQueryPage(input);

      AssetManagementComplexQueryPageOutput output = null;
      try {
        output = (AssetManagementComplexQueryPageOutput)getWebServiceController().callWebService(
                "com.siebel.service.fs.assets.AssetManagementComplex",
                "AssetManagementComplexPort",
                "assetManagementComplexQueryPage",
                input,
                this,
                getWebServiceHelper());
      } catch (ResourcePoolException e) {
        if(isLoggingError())
          logError(e);
      } catch (NoSuchMethodException e) {
        if(isLoggingError())
          logError(e);
      } catch (InvocationTargetException e) {
        if(isLoggingError())
          logError(e);
      } catch (IllegalAccessException e) {
        if(isLoggingError())
          logError(e);
      } catch (SiebelWebServiceConfigurationException e) {
        if(isLoggingError())
          logError(e);
      }


      if (output != null
					&& output.getListOfAsset() != null
					&& output.getListOfAsset().getAssetMgmtAssetHeader() != null
					&& output.getListOfAsset().getAssetMgmtAssetHeader().size() > 0) {
				if (_asset.getProductType().equals(M_PROMOTION)) {
					populatePromotionAndChildAttributes(_asset, output
							.getListOfAsset().getAssetMgmtAssetHeader());
				} else {
					if (output.getListOfAsset().getAssetMgmtAssetHeader()
							.get(0) != null
							&& output.getListOfAsset()
									.getAssetMgmtAssetHeader().get(0)
									.getListOfAssetMgmtAsset() != null
							&& output.getListOfAsset()
									.getAssetMgmtAssetHeader().get(0)
									.getListOfAssetMgmtAsset()
									.getAssetMgmtAsset() != null
							&& output.getListOfAsset()
									.getAssetMgmtAssetHeader().get(0)
									.getListOfAssetMgmtAsset()
									.getAssetMgmtAsset().size() > 0) {
						populateProductAndChildAttributes(_asset, output
								.getListOfAsset().getAssetMgmtAssetHeader()
								.get(0).getListOfAssetMgmtAsset()
								.getAssetMgmtAsset().get(0));
					}
				}

			}

		}
	}

	protected void populateRelatedPromotions(SiebelAsset pAsset)
      throws RepositoryException, PropertyNotFoundException {

    try {
      if (pAsset != null) {
        if (isLoggingDebug()) {
          logDebug("Inside populateRelatedPromotions " + pAsset.getId());
        }
        String prodId = pAsset.getProductId();
        RepositoryView prodPromoRepositoryView = getCatalogTools()
            .getCatalog().getView(
                getPromotionRelationshipDescriptor());
        QueryBuilder prodPromoQueryBuilder = prodPromoRepositoryView
            .getQueryBuilder();

        // Build query
        //Modified by SYPATEL in order avoid the NullPointerException that causes
        //asset details page to display asset not found message for valid assets.
        RepositoryItem prodItem = null;
        if (getCatalogTools().getProductDetails(prodId) != null) {
                prodItem = getCatalogTools().getProductDetails(
                prodId).getProductRepositoryItem();
                pAsset.setSiebelType(getCatalogTools().getProductDetails(prodId).getProductType());
          }

              Query prodPromoQuery = prodPromoQueryBuilder
            .createComparisonQuery(
                prodPromoQueryBuilder
                    .createPropertyQueryExpression("product"),
                prodPromoQueryBuilder
                    .createConstantQueryExpression(prodItem),
                QueryBuilder.EQUALS);
        // Execute query

        RepositoryItem[] relPromoItems = prodPromoRepositoryView
            .executeQuery(prodPromoQuery);
        //Bug 17439609 - Only if related promo items are not null
        //add it to the asset
        if(relPromoItems != null){
         ArrayList<String>  promoItems = new  ArrayList<String>() ;
         RepositoryItem riProd;
          for (int index = 0; index < relPromoItems.length; index++)
            {
              riProd = (RepositoryItem)relPromoItems[index].getPropertyValue("promotion");
              if (riProd != null){
                promoItems.add((String)riProd.getPropertyValue("displayName"));
              }
            }
        pAsset.setRelatedPromotions(promoItems);
        }

      }
    } catch (RepositoryException e) {
      throw new RepositoryException(e);
    } catch (PropertyNotFoundException e) {
      throw new PropertyNotFoundException(e);
    } 
	}

	private void populateProductAndChildAttributes(
			SiebelAsset _asset,
			com.siebel.xml.asset_management_complex_io.data.AssetMgmtAssetData _assetData) {
		if (_asset != null && _assetData != null) {
			_asset.setAttributes(convertToSiebelAttributes(_assetData
					.getListOfAssetMgmtAssetXa()));

			if (_assetData.getAssetMgmtAsset() != null
					&& _assetData.getAssetMgmtAsset().size() > 0) {
				Iterator<com.siebel.xml.asset_management_complex_io.data.AssetMgmtAssetData> childAssetItr = _assetData
						.getAssetMgmtAsset().iterator();

				while (childAssetItr.hasNext()) {
					com.siebel.xml.asset_management_complex_io.data.AssetMgmtAssetData childAssetData = childAssetItr
							.next();

					if (childAssetData != null) {
						SiebelAsset childAsset = findChildAsset(_asset,
								childAssetData.getAssetId());

						if (childAsset != null) {
							childAsset
									.setAttributes(convertToSiebelAttributes(childAssetData
											.getListOfAssetMgmtAssetXa()));
						}
					}
				}
			}
		}
	}

	private void populatePromotionAndChildAttributes(SiebelAsset _asset,
			List<AssetMgmtAssetHeaderData> _assetHeaders) {
		if (_asset != null && _assetHeaders != null && !_assetHeaders.isEmpty()) {
			Iterator<AssetMgmtAssetHeaderData> assetHeaderItr = _assetHeaders
					.iterator();

			while (assetHeaderItr.hasNext()) {
				AssetMgmtAssetHeaderData assetHeader = assetHeaderItr.next();

				if (assetHeader != null) {
					if (assetHeader.getId().equalsIgnoreCase(_asset.getId())) {
						if (assetHeader.getListOfAssetMgmtAsset() != null
								&& assetHeader.getListOfAssetMgmtAsset()
										.getAssetMgmtAsset() != null
								&& !assetHeader.getListOfAssetMgmtAsset()
										.getAssetMgmtAsset().isEmpty()
								&& assetHeader.getListOfAssetMgmtAsset()
										.getAssetMgmtAsset().get(0) != null) {
							_asset.setAttributes(convertToSiebelAttributes(assetHeader
									.getListOfAssetMgmtAsset()
									.getAssetMgmtAsset().get(0)
									.getListOfAssetMgmtAssetXa()));
						}
					} else {
						SiebelAsset childAsset = findChildAsset(_asset,
								assetHeader.getId());
						if (assetHeader.getListOfAssetMgmtAsset() != null
								&& assetHeader.getListOfAssetMgmtAsset()
										.getAssetMgmtAsset() != null
								&& !assetHeader.getListOfAssetMgmtAsset()
										.getAssetMgmtAsset().isEmpty()
								&& assetHeader.getListOfAssetMgmtAsset()
										.getAssetMgmtAsset().get(0) != null) {
							childAsset
									.setAttributes(convertToSiebelAttributes(assetHeader
											.getListOfAssetMgmtAsset()
											.getAssetMgmtAsset().get(0)
											.getListOfAssetMgmtAssetXa()));
						}
					}
				}
			}
		}
	}

	private SiebelAsset findChildAsset(SiebelAsset _asset, String _id) {
		// TODO Auto-generated method stub
		if (_asset != null && _asset.getChildAssets() != null
				&& _asset.getChildAssets().size() > 0) {
			Iterator<SiebelAsset> childAssetItr = _asset.getChildAssets()
					.iterator();

			while (childAssetItr.hasNext()) {
				SiebelAsset childAsset = childAssetItr.next();

				if (childAsset != null
						&& childAsset.getId().equalsIgnoreCase(_id)) {
					return childAsset;
				}
			}
		}
		return null;
	}

	private ArrayList<SiebelAttribute> convertToSiebelAttributes(
			ListOfAssetMgmtAssetXaData listOfAssetMgmtAssetXa) {
		// TODO Auto-generated method stub
		if (listOfAssetMgmtAssetXa != null
				&& listOfAssetMgmtAssetXa.getAssetMgmtAssetXa() != null) {
			ArrayList<AssetMgmtAssetXaData> lstAssetMgmtAssetXaData = (ArrayList<AssetMgmtAssetXaData>) listOfAssetMgmtAssetXa
					.getAssetMgmtAssetXa();
			if (lstAssetMgmtAssetXaData.size() > 0) {
				Iterator<AssetMgmtAssetXaData> itr = lstAssetMgmtAssetXaData
						.iterator();
				ArrayList<SiebelAttribute> attributes = new ArrayList<SiebelAttribute>();

				while (itr.hasNext()) {
					AssetMgmtAssetXaData assetXaData = (AssetMgmtAssetXaData) itr
							.next();
					SiebelAttribute attr = new SiebelAttribute();
					attr.setDescription(assetXaData.getDescription());
					attr.setDisplayName(assetXaData.getDisplayName());
					attr.setValue(assetXaData.getValue());
					attributes.add(attr);
				}
				return attributes;
			}
		}
		return null;
	}

	private com.siebel.xml.asset_management_io.query.QueryType getEmptyQueryType() {
		com.siebel.xml.asset_management_io.query.QueryType emptyQuery = new com.siebel.xml.asset_management_io.query.QueryType();
		emptyQuery.setValue("");
		return emptyQuery;
	}

	private QueryType getEmptyComplexQueryType() {
		QueryType emptyQuery = new QueryType();
		emptyQuery.setValue("");
		return emptyQuery;
	}

	private boolean isNonNull(String str) {
		if ("".equals(str) || str == null) {
			return false;
		}
		return true;
	}

	public SiebelAsset getAssetDetail(String assetId, SiebelAssetList siebelAssetList)
			throws RepositoryException, PropertyNotFoundException {
	  LinkedHashMap<String, SiebelAsset> customerAssets = siebelAssetList.getCustomerAssets();
		try {
			if (customerAssets != null && customerAssets.size() > 0) {
				if (customerAssets.containsKey(assetId)) {
					SiebelAsset asset = (SiebelAsset) customerAssets
							.get(assetId);
					populateAssetAttributes(asset);
					populateRelatedPromotions(asset);
					if("Promotion".equals(asset.getSiebelType())){
						populateUpgradePromotions(asset);
					}
					return asset;
				}
			}
		} catch (RepositoryException e) {
			throw new RepositoryException(e);
		} catch (PropertyNotFoundException e) {
			throw new PropertyNotFoundException(e);
		}

		return null;
	}

	/**
	 * This method invokes ModifyAssetToQuote web service of ABOWebService, to
	 * retrieve a Siebel quote for a given asset number. The quote thus
	 * retrieved is returned.
	 * 
	 * @param pAssetNumber
	 *            - Asset Number for which the quote should be retrieved.
	 * @param pActiveDocumentId
	 *            - Active Document Id
	 * @return instance of Quote retrieved.
	 */
	public Quote getSiebelQuoteForAsset(final String pAssetNumber,
			final String pActiveDocumentId) throws Exception {
		//ABOWebService aboWebService = new ABOWebService();
		//ModifyAssetToQuotePort modifyAssetToQuotePort = aboWebService
		//		.getModifyAssetToQuotePort();
		ModifyAssetToQuoteInput request = new ModifyAssetToQuoteInput();
		request.setAssetNumber(pAssetNumber);
		if (!StringUtils.isBlank(pActiveDocumentId)) {
			request.setActiveDocumentId(pActiveDocumentId);
		}
		//getWebServiceHelper().prepareConnection(
		//		(BindingProvider) modifyAssetToQuotePort);


    //ModifyAssetToQuoteOutput response = modifyAssetToQuotePort
    //    .modifyAssetToQuote(request);

    ModifyAssetToQuoteOutput response = (ModifyAssetToQuoteOutput)getWebServiceController().callWebService(
            "com.siebel.ordermanagement.abo.ABOWebService",
            "ModifyAssetToQuotePort",
            "modifyAssetToQuote",
            request,
            this,
            getWebServiceHelper());
    

		
		Quote quote = null;
		if (response.getListOfQuote() != null
				&& response.getListOfQuote().getQuote() != null
				&& !response.getListOfQuote().getQuote().isEmpty()) {
			quote = response.getListOfQuote().getQuote().get(0);
		} else {
			throw new Exception("Unable to retrieve Quote for the asset "
					+ pAssetNumber);
		}
		return quote;
	}

	/**
	 * Method to remove a Quote Item from Siebel Quote.
	 * This method uses <code>QuoteWebService</code> webservice.
	 * This is required while removing ABO asset from the cart.
	 * @param sblCommerceItem Siebel commerce item 
	 */
	public void removeQuoteItem(final List<SiebelCommerceItem> pSblCommerceItem) {
		DeleteQuoteItemInput input = createDeleteQuoteItemInput(pSblCommerceItem);
		//QuoteWebService quoteWebService = new QuoteWebService();
		//QuoteItemPort quoteItemPort = quoteWebService.getQuoteItemPort();

		//getWebServiceHelper()
		//		.prepareConnection((BindingProvider) quoteItemPort);



    //quoteItemPort.deleteQuoteItem(input);

    try {
      getWebServiceController().callWebService(
              "com.siebel.ordermanagement.quote.QuoteWebService",
              "QuoteItemPort",
              "deleteQuoteItem",
              input,
              this,
              getWebServiceHelper());
    } catch (NoSuchMethodException e) {
      if(isLoggingError())
        logError(e);
    } catch (IllegalAccessException e) {
      if(isLoggingError())
        logError(e);
    } catch (ResourcePoolException e) {
      if(isLoggingError())
        logError(e);
    } catch (InvocationTargetException e) {
      if(isLoggingError())
        logError(e);
    } catch (SiebelWebServiceConfigurationException e) {
      if(isLoggingError())
        logError(e);
    }


  }

	/**
	 * Method to create <code>DeleteQuoteItemInput</code> input request for <code>QuoteItemPort</code>.
	 * @param sblCommerceItem Siebel Commerce Item
	 * @return instance of <code>DeleteQuoteItemInput</code>
	 */
	private DeleteQuoteItemInput createDeleteQuoteItemInput(
			final List<SiebelCommerceItem> pSblCommerceItems) {
		DeleteQuoteItemInput input = new DeleteQuoteItemInput();
		QuoteItem quoteItem = null;
		ListOfQuoteItemBO listOfQuoteItemBO = new ListOfQuoteItemBO();
		listOfQuoteItemBO.setListOfQuoteItem(new ListOfQuoteItem());
		for(SiebelCommerceItem sblCommerceItem : pSblCommerceItems){
			quoteItem = createQuoteItemsFromCommerceItem(sblCommerceItem);
			listOfQuoteItemBO.getListOfQuoteItem().getQuoteItem().add(quoteItem);
		}
		input.setListOfQuoteItemBO(listOfQuoteItemBO);
		return input;
	}

	/**
	 * Method to create <code>QuoteItems</code> corresponding to <code>SiebelCommerceItem</code>.
	 * @param sblCommerceItem Siebel Commerce Item.
	 * @return instance of <code>QuoteItem</code>
	 */
	private QuoteItem createQuoteItemsFromCommerceItem(
			final SiebelCommerceItem sblCommerceItem) {
		QuoteItem quoteItem = new QuoteItem();
		String id = (!StringUtils.isBlank(sblCommerceItem.getQuoteItemId()))?sblCommerceItem.getQuoteItemId():sblCommerceItem.getId();
		quoteItem.setId(id);
		for (SiebelCommerceItem childCommerceItem : (List<SiebelCommerceItem>) sblCommerceItem
				.getCommerceItems()) {
			QuoteItem childQuote = createQuoteItemsFromCommerceItem(childCommerceItem);
			quoteItem.getQuoteItem().add(childQuote);
		}
		return quoteItem;
	}

	/**
      * The method makes a web service call to get the Siebel Quote for an Asset
      * upgradation
      *
      * @param pAssetNumber
      * @param pActiveDocumentId
      * @param pNewProductId
      * @param pSiebelAccountId
      * @return Quote
      * @throws Exception
      */
   
     public Quote getSiebelQuoteForAssetUpgradation(final String pAssetNumber,
         final String pActiveDocumentId, final String pNewProductId,
         final String pSiebelAccountId) throws Exception {
       //PromotionWebService service = new PromotionWebService();
       //UpgradePromotionToQuotePort upgradeAssetToQuotePort = service
       //     .getUpgradePromotionToQuotePort();
        UpgradePromotionToQuoteInput upgradePromotionToQuoteInput = new UpgradePromotionToQuoteInput();
        upgradePromotionToQuoteInput.setAssetNumber(pAssetNumber);
        upgradePromotionToQuoteInput.setNewPromotionId(pNewProductId);
        upgradePromotionToQuoteInput.setAccountId(pSiebelAccountId);
        if (!StringUtils.isBlank(pActiveDocumentId)) {
          upgradePromotionToQuoteInput.setActiveDocumentId(pActiveDocumentId);
        }
        //getWebServiceHelper().prepareConnection(
        //    (BindingProvider) upgradeAssetToQuotePort);


        //UpgradePromotionToQuoteOutput response = upgradeAssetToQuotePort
        //    .upgradePromotionToQuote(upgradePromotionToQuoteInput);


       UpgradePromotionToQuoteOutput response = (UpgradePromotionToQuoteOutput)getWebServiceController().callWebService(
               "com.siebel.ordermanagement.promotion.PromotionWebService",
               "UpgradePromotionToQuotePort",
               "upgradePromotionToQuote",
               upgradePromotionToQuoteInput,
               this,
               getWebServiceHelper());
        
        Quote quote = null;
        if (response.getListOfQuote() != null
            && response.getListOfQuote().getQuote() != null
            && !response.getListOfQuote().getQuote().isEmpty()) {
          quote = response.getListOfQuote().getQuote().get(0);
        } else {
          throw new Exception("Unable to retrieve Quote for the asset "
              + pAssetNumber);
        }
        return quote;
      }
    
      /**
       * This method retrieves the upgrade promotions for a promotion asset
       *
       * @param pAsset
       * @throws RepositoryException
       * @throws PropertyNotFoundException
       */
      protected void populateUpgradePromotions(SiebelAsset pAsset)
          throws RepositoryException {
    
        try {
          if (pAsset != null) {
            Repository productCatalog = getCatalogTools().getCatalog();
    
            // getting the productId for the promotion asset
            String[] assetPromoIds = { pAsset.getProductId() };
            // getting product repository item for the asset promotion(only one
            // record)
            RepositoryItem[] assetPromoProduct = productCatalog.getItems(
                assetPromoIds, SiebelPropertyNameConstants.PRODUCT_ITEM_DESCRIPTOR);
    
            // getting the promotion-structure from the assetPromoProduct(only one
            // record)
            RepositoryItem promoStructure = (RepositoryItem) assetPromoProduct[0]
                .getPropertyValue(SiebelPropertyNameConstants.PRODUCT_PROMOTION_STRUCTURE);
    
            // getting the upgrades from the promoStructure(multi records; a set)
            Set promoUpgrades = (Set) promoStructure
                .getPropertyValue(SiebelPropertyNameConstants.PRODUCT_PROMOTION_UPGRADES);
            RepositoryItem targetPromotion = null;
            ArrayList<UpgradePromotion> upgradePromoProducts = new ArrayList<UpgradePromotion>();
            for (Object promotionupgrade : promoUpgrades) {
              targetPromotion = (RepositoryItem) ((RepositoryItem) promotionupgrade)
                  .getPropertyValue(SiebelPropertyNameConstants.PRODUCT_TARGET_PROMOTION);
              upgradePromoProducts.add(new UpgradePromotion(
                  pAsset.getAssetNumber(), targetPromotion.getRepositoryId(),
                  targetPromotion.getItemDisplayName()));
            }
    
            pAsset.setUpgradePromotions(upgradePromoProducts);
    
          }
        } catch (RepositoryException e) {
          throw new RepositoryException(e);
        }
    
      }
    
      /**
       * Checks if there is already an item in the current cart with upgrade/modify
       * request for the asset
       *
       * @param pAssetNumber
       * @param pOrder
       * @return
       */
      public String checkAboapplicability(final String pAssetNumber,
          final Order pOrder) {
        String aboApplicabilityMessage = null;
        List<SiebelCommerceItem> orderItems = pOrder.getCommerceItems();
        for (SiebelCommerceItem commerceItem : orderItems) {
          if (commerceItem.getAssetNumber() != null
              && pAssetNumber.equals(commerceItem.getAssetNumber())) {
            aboApplicabilityMessage = Constants.ERROR_ABO_REQUEST;
            break;
          }
        }
  
      return aboApplicabilityMessage;
    }

}
