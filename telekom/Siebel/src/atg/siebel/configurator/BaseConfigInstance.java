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
package atg.siebel.configurator;

import atg.nucleus.logging.ApplicationLogging;
import atg.nucleus.logging.ClassLoggingFactory;
import atg.repository.RepositoryException;
import atg.repository.RepositoryItem;
import atg.siebel.order.SiebelCommerceItem;

import com.siebel.ordermanagement.quote.data.Quote;

/**
 * Abstract class that represents properties and behaviour common to all product or promotion
 * instances being configured by the user.
 *
 * @author Bernard Brady
 * @version $Id: //product/Siebel/version/11.2/src/atg/siebel/configurator/BaseConfigInstance.java#2 $$Change: 1194813 $
 * @updated $DateTime: 2015/09/10 08:26:24 $$Author: saysyed $
 */
public abstract class BaseConfigInstance {

	// -------------------------------------
	/** Class version string */
	public static final String CLASS_VERSION = "$Id: //product/Siebel/version/11.2/src/atg/siebel/configurator/BaseConfigInstance.java#2 $$Change: 1194813 $";

	/** Logger */
	protected static ApplicationLogging mLogger = ClassLoggingFactory
	    .getFactory().getLoggerForClass(BaseConfigInstance.class);

	// -------------------------------------
	// Constants
	// -------------------------------------

	// -------------------------------------
	// Member variables
	// -------------------------------------
	private final String mProductId;
	private final String mOrderId;
	protected ConfiguratorManager mConfiguratorManager;
	protected RepositoryItem mRepositoryItem;
	private final String mProductType;
	private final String mDescription;

	// -------------------------------------
	// Properties
	// -------------------------------------

	// -------------------------------------
	// property: commerceItemId
	protected String mCommerceItemId;

	public String getCommerceItemId() {
	  return mCommerceItemId;
	}

	public void setCommerceItemId(String pCommerceItemId) {
	  mCommerceItemId = pCommerceItemId;
	}


	// -------------------------------------
	// property: integrationId
	private String mIntegrationId;

	public void setIntegrationId(String integrationId) {
		mIntegrationId = integrationId;
	}

	public String getIntegrationId() {
		return mIntegrationId;
	}

	// -------------------------------------
		// property: assetIntegrationId
		private String mAssetIntegrationId;

		public void setAssetIntegrationId(String pAssetIntegrationId) {
			mAssetIntegrationId = pAssetIntegrationId;
		}

		public String getAssetIntegrationId() {
			return mAssetIntegrationId;
		}
	// -------------------------------------
	// property: displayName
	private String mDisplayName;

	public String getDisplayName() {
		return mDisplayName;
	}

	public void setDisplayName(String pDisplayName) {
		this.mDisplayName = pDisplayName;
	}

	//---------------------------------------
	//property: quote
	private Quote quote;
	
	
	public Quote getQuote() {
		return quote;
	}

	public void setQuote(Quote quote) {
		this.quote = quote;
	}
	
	public boolean isABO(){
		return (quote != null);
	}
	
	/**
	 * @param pOrderId
	 * @param pProductId
	 * @param pManager
	 * @throws ConfiguratorException
	 */
	public BaseConfigInstance(String pOrderId, String pProductId,
	    ConfiguratorManager pManager) throws ConfiguratorException {

		if (pProductId == null) {
			throw new IllegalArgumentException(
			    "A product config instance must have a valid product reference");
		}

		mOrderId = pOrderId;
		mProductId = pProductId;
		mConfiguratorManager = pManager;
		try {
			mRepositoryItem = mConfiguratorManager.getConfiguratorTools()
			    .getCatalogTools().findProduct(mProductId);
			if (mRepositoryItem == null) {
				throw new ConfiguratorException(
				    "Product not in Repository : mProductId == "+mProductId);
			}

			mDisplayName = (String) mRepositoryItem
          .getPropertyValue(Constants.PRODUCT_DISPLAY_NAME_PROPERTY);
			mProductType = (String) mRepositoryItem
			    .getPropertyValue(Constants.PRODUCT_TYPE_PROPERTY);
			mDescription = (String) mRepositoryItem
			    .getPropertyValue(Constants.PRODUCT_DESCRIPTION_PROPERTY);
		} catch (RepositoryException e) {
			throw new ConfiguratorException(e);
		}
	}

	/**
	 * @return
	 */
	public String getOrderId() {
		return mOrderId;
	}

	/**
	 * @return
	 */
	public String getProductId() {
		return mProductId;
	}

	/**
	 * @return
	 */
	public String getType() {
		return mProductType;
	}

	/**
	 * @return
	 */
	public String getDescription() {
		return mDescription;
	}

	/**
	 * @return
	 */
	public ConfiguratorManager getConfiguratorManager() {
		return mConfiguratorManager;
	}

	/**
	 * @return
	 */
	public RepositoryItem getProductRepositoryItem() {
		return mRepositoryItem;
	}
	
  /**
   * This method gives the status of the commerce item from the PCI
   * 
   * @param pInstance
   *          , the PCI from which the commerce item is retrieved
   * @return true if commerce item is deleted false, if commerce item is not
   *         deleted
   */
  public boolean isCommerceItemDeleted(RootProductConfigInstance pInstance) {
    boolean isDeleted = false;
    if (pInstance instanceof RootProductConfigInstance) {
      RootProductConfigInstance rootInstance = (RootProductConfigInstance) pInstance;
      SiebelCommerceItem commerceItem = getConfiguratorManager()
          .getConfiguratorTools().getCommerceItem(rootInstance);
      if (commerceItem != null) {
        if (commerceItem.getActionCode().equalsIgnoreCase(
            SiebelCommerceItem.M_ACTION_CODE_DELETE)) {
          isDeleted = true;
        }
      }
    }
    return isDeleted;
  }
}