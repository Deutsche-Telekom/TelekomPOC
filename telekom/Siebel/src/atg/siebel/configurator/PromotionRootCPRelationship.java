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

import java.util.ArrayList;
import java.util.List;

import atg.core.util.StringUtils;
import atg.siebel.configurator.Constants.ProductConfigInstanceStatus;
import atg.siebel.order.SiebelCommerceItem;

/**
 * This class represents the relationship between a promotion and its root-level products.
 *
 * @author Bernard Brady
 * @version $Id: //product/Siebel/version/11.2/src/atg/siebel/configurator/PromotionRootCPRelationship.java#2 $$Change: 1194813 $
 * @updated $DateTime: 2015/09/10 08:26:24 $$Author: saysyed $
 */
public class PromotionRootCPRelationship extends AbstractRelationship {

	// -------------------------------------
	/** Class version string */
	public static final String CLASS_VERSION = "$Id: //product/Siebel/version/11.2/src/atg/siebel/configurator/PromotionRootCPRelationship.java#2 $$Change: 1194813 $";

	// -------------------------------------
	// Constants
	// -------------------------------------

	// -------------------------------------
	// Properties
	// -------------------------------------


	/**
	 * @param pInstance - parent promotion instance
	 * @param pRelationshipId - this relationsip's unique id
	 * @param pMinQuantity - min cardinality
	 * @param pMaxQuantity - max cardinality
	 * @param pDefaultQuantity - default cardinality
	 */
	public PromotionRootCPRelationship(
			PromotionConfigInstance pInstance,
			String pRelationshipId,
			String pMinQuantity, 
			String pMaxQuantity,
			String pDefaultQuantity) {

		super(pInstance, pRelationshipId, pMinQuantity, pMaxQuantity, pDefaultQuantity);
		setCardinality(pMinQuantity, pMaxQuantity, pDefaultQuantity);
		mChildInstances = new ArrayList<ProductConfigInstance>(getMaximumQuantity());
	}

	int getChildCount(String domainProductId){
		int count=0;
		for(ProductConfigInstance productConfigInstance : getChildInstances()){
			if(domainProductId.equals(productConfigInstance.getProductId())){
				count++;
			}
		}
		return count;
	}

	/**
	 * @param pPromotion
	 * @param pProductConfigInstanceCache 
	 * @param pOrderId
	 * @throws ConfiguratorException 
	 */
	protected void createRootCPInstances(
			ProductConfigInstanceCache pProductConfigInstanceCache)
			throws ConfiguratorException {

		if (mLogger.isLoggingDebug()) {
			mLogger.logDebug("Entered createRootCPs : pProductConfigInstanceCache == "
					+ pProductConfigInstanceCache);
		}

		ProductConfigInstance productConfigInstances[] = getChildInstances();

		// mChildInstances = new ArrayList<ProductConfigInstance>();

		if (getDomainProductCount() > Constants.ZERO) {
			DomainProduct[] domainProducts = getDomainProducts();
			for (int i = 0; i < getDomainProductCount(); i++) {
				DomainProduct nextProduct = domainProducts[i];
				int quantity = nextProduct.getRelationshipQuantity() != null ? nextProduct
						.getRelationshipQuantity().intValue() : 0;
				int existingChildProductCount = getChildCount(nextProduct
						.getId());
				int qty = 0;

				while (qty < (quantity - existingChildProductCount)) {
					RootProductConfigInstance instance = createRootProductConfigInstance(nextProduct
							.getId());
					if (mLogger.isLoggingDebug()) {
						mLogger.logDebug("Created new CP - " + instance);
					}
					// if we've already configured this instance
					RootProductConfigInstance cachedInstance = (RootProductConfigInstance) pProductConfigInstanceCache
							.getInstance(instance.getKey().toString());

					if (cachedInstance == null
							|| !cachedInstance.getStatus().equals(
									ProductConfigInstanceStatus.CONFIGURED)) {
						pProductConfigInstanceCache.cacheInstance(instance
								.getKey().toString(), instance);
						addRootProductInstance(instance);
					} else {
						addRootProductInstance(cachedInstance);

					}
					qty++;
				}

        while (qty < (existingChildProductCount - quantity)) {
          if (!getParentInstance().isABO()) {
            removeRootProductInstance(nextProduct.getId(),
                pProductConfigInstanceCache);
            qty++;
          } else {
            // In case of ABO, if the root product quantity is made zero, change
            // the action code of commerce item as delete
            int index = getRootProductInstanceIndex(nextProduct.getId());
            pProductConfigInstanceCache
                .removeProductConfigInstanceFromCache((ProductConfigInstance) mChildInstances
                    .get(index));
            RootProductConfigInstance rootInstance = (RootProductConfigInstance) mChildInstances
                .get(index);
            SiebelCommerceItem comm = rootInstance.getConfiguratorManager()
                .getConfiguratorTools().getCommerceItem(rootInstance);
            comm.setActionCode(SiebelCommerceItem.M_ACTION_CODE_DELETE);
            comm.getCommerceItemCount();
            List<SiebelCommerceItem> items = comm.getCommerceItems();
            for (SiebelCommerceItem childItem : items) {
              childItem.setActionCode(SiebelCommerceItem.M_ACTION_CODE_DELETE);
            }
            // Since we are not removing the item the instance, set the quantity
            // to the one given by user
            setQuantity(quantity);
            qty++;
          }
        }

			}
		} else {
			String prodId = null;
			prodId = getDefaultProductId();
			if (StringUtils.isEmpty(prodId)) {
				// see promotion 88-23AOX
				prodId = getProductLineId();
			}
			if (StringUtils.isEmpty(prodId)) {
				// Log an ERROR
				return;
			}
			int productConfigInstanceCount = 0;
			int quantity = getQuantity();
			int existingProductConfigInstanceCount = productConfigInstances != null ? productConfigInstances.length
					: 0;
			int qty = 0;
			while (qty < (quantity - existingProductConfigInstanceCount)) {
				ProductConfigInstance instance = createRootProductConfigInstance(prodId);
				instance.setDisplayName(getDisplayName());
				if (mLogger.isLoggingDebug()) {
					mLogger.logDebug("Created new CP - " + instance);
				}
				// if we're updating an exiting item, copy commerce item id
				RootProductConfigInstance cachedInstance = (RootProductConfigInstance) pProductConfigInstanceCache
						.getInstance(instance.getKey().toString());

				if (cachedInstance == null
						|| !cachedInstance.getStatus().equals(
								ProductConfigInstanceStatus.CONFIGURED)) {
					pProductConfigInstanceCache.cacheInstance(instance.getKey()
							.toString(), instance);
					addRootProductInstance((RootProductConfigInstance) instance);
				} else {
					addRootProductInstance(cachedInstance);
				}
				qty++;
			}

			while (qty < existingProductConfigInstanceCount - quantity) {

				removeRootProductInstance(
						productConfigInstances[0].getProductId(),
						pProductConfigInstanceCache);
				qty++;
			}

		}

		if (mLogger.isLoggingDebug()) {
			mLogger.logDebug("Leaving createRootCPs()");
		}
	}

	/**
	 * @param pPromotion
	 * @param pProductId
	 * @return
	 * @throws ConfiguratorException 
	 */
	protected RootProductConfigInstance createRootProductConfigInstance(String pProductId) 
	    throws ConfiguratorException {
		
		if (mLogger.isLoggingDebug()) {
			mLogger.logDebug("Entered addChildInstance : pProductId == "+pProductId);
		}
	    PromotionConfigInstance promotion = (PromotionConfigInstance) getParentInstance();
		RootProductConfigInstance instance = new RootProductConfigInstance(
		    promotion, pProductId, getNextInstanceNumber(pProductId));
		if (mLogger.isLoggingDebug()) {
			mLogger.logDebug("Leaving addChildInstance() : instance == "+instance);
		}
		return instance;
	}

	/**
	 * adds a root product to the list of child instances and increments the quantity
	 * 
	 * @param pRootProduct
	 */
	public void addRootProductInstance(RootProductConfigInstance pRootProduct)
	{
		mChildInstances.add(pRootProduct);
		if(getDomainProductCount()==0)
		{
			/**
			 * quantity should be set to the number of ChildInstances present and not getQuantity()+1. Otherwise it will affect the other promotions
			 */
			setQuantity(mChildInstances.size());
		}
		//this will fail for more than 1 domain products as even if index is 1 in domain in child instances it can vary.
	}

	public void removeRootProductInstance(String id,
			ProductConfigInstanceCache pProductConfigInstanceCache) {
		int index = getRootProductInstanceIndex(id);
		pProductConfigInstanceCache
				.removeProductConfigInstanceFromCache((ProductConfigInstance) mChildInstances
						.get(index));
		mChildInstances.remove(index);
		/**
		 * quantity should be set to the number of ChildInstances present and not getQuantity()-1.Otherwise it will affect the other promotions
		 */
		setQuantity(mChildInstances.size());

	}

	/**
	 * Returns the index of that product with the productId that matches given id 
	 * and whose commerce item's action code is not Delete
	 * @param id, the product id
	 * @return
	 */
  int getRootProductInstanceIndex(String id) {
    int index = -1;
    for (index = 0; index < getChildInstances().length; index++)
      // for(ProductConfigInstance productConfigInstances :
      // getChildInstances()){
      if (id.equals(getChildInstances()[index].getProductId())) {
        // Check if the commerce item action code is not Delete, then return the
        // index
        SiebelCommerceItem commItem=getChildInstances()[index].getConfiguratorManager()
            .getConfiguratorTools()
            .getCommerceItem(getChildInstances()[index].getCommerceItemId());
        if (commItem != null && !commItem.getActionCode()
            .equalsIgnoreCase(SiebelCommerceItem.M_ACTION_CODE_DELETE))
          break;
      }
    // }
    return index;
  }

}
