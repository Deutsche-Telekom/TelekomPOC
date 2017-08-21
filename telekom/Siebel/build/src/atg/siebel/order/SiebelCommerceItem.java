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

package atg.siebel.order;

import java.util.Iterator;
import java.util.List;

import atg.commerce.order.ChangedProperties;
import atg.commerce.order.CommerceItem;
import atg.commerce.order.CommerceItemContainer;
import atg.commerce.order.CommerceItemImpl;
import atg.commerce.order.CommerceItemNotFoundException;
import atg.commerce.order.DuplicateCommerceItemException;
import atg.commerce.order.InvalidParameterException;
import atg.commerce.order.SiebelCommerceItemContainerImpl;
import atg.core.util.StringUtils;
import atg.nucleus.logging.ApplicationLogging;
import atg.nucleus.logging.ClassLoggingFactory;
import atg.repository.MutableRepository;
import atg.repository.MutableRepositoryItem;
import atg.repository.RepositoryException;
import atg.repository.RepositoryItem;
import atg.siebel.configurator.Constants;
import atg.siebel.configurator.Constants.SiebelCommerceItemType;

/**
 * This class represents a Siebel commerce item. Siebel commerce items differ
 * from regular commerce items in that they may be arranged in a hierarchy
 * within the order.
 *
 * @author Patrick Mc Erlean
 * @version $Id:
 *          //product/Siebel/main/src/atg/siebel/order/SiebelCommerceItem.java#1
 *          $$Change: 1194813 $
 * @updated $DateTime: 2015/09/10 08:26:24 $$Author: saysyed $
 */
@SuppressWarnings("serial")
public class SiebelCommerceItem
  extends CommerceItemImpl
  implements CommerceItemContainer, SiebelAttributeContainer
{
  // ----------------------------------------------------------------------------------
  // Class version string
  // ----------------------------------------------------------------------------------

  public static String CLASS_VERSION =
    "$Id: //product/Siebel/version/11.2/src/atg/siebel/order/SiebelCommerceItem.java#3 $$Change: 1194813 $";

  /** Logger */
  protected static ApplicationLogging mLogger = ClassLoggingFactory
      .getFactory().getLoggerForClass(SiebelCommerceItem.class);

  // ----------------------------------------------------------------------------------
  // Constants
  // ----------------------------------------------------------------------------------

  public static final String M_ACTION_CODE_NO_ACTION = "NoAction";
  public static final String M_ACTION_CODE_ADD = "Add";
  public static final String M_ACTION_CODE_UPDATE = "Update";
  public static final String M_ACTION_CODE_DELETE = "Delete";

  // ----------------------------------------------------------------------------------
  // Member Variables
  // ----------------------------------------------------------------------------------

  private SiebelCommerceItemContainerImpl mChildCommerceItemContainer =
    new SiebelCommerceItemContainerImpl();
  private SiebelAttributeContainerImpl mAttributeContainer =
    new SiebelAttributeContainerImpl();

  // ----------------------------------------------------------------------------------
  // Properties
  // ----------------------------------------------------------------------------------

  // ----------------------------------------------------------------------------------
  // property: actionCode

  private String mActionCode = M_ACTION_CODE_NO_ACTION;

  /**
   * Sets property actionCode
   **/

  public void setActionCode(String pActionCode) {
    mActionCode = pActionCode;
    setPropertyValue(SiebelPropertyNameConstants.ACTION_CODE, pActionCode);
  }

  /**
   * Returns property actionCode
   **/

  public String getActionCode() {
    return (String) getPropertyValue(SiebelPropertyNameConstants.ACTION_CODE);
  }

  // ----------------------------------------------------------------------------------
  // property: parentRelationshipId

  private String mParentRelationshipId = null;

  /**
   * Sets property parentRelationshipId
   **/

  public void setParentRelationshipId(String pParentRelationshipId) {
    mParentRelationshipId = pParentRelationshipId;
    setPropertyValue(SiebelPropertyNameConstants.PARENT_RELATIONSHIP_ID, pParentRelationshipId);
  }

  /**
   * Returns property parentRelationshipId
   **/

  public String getParentRelationshipId() {
    return (String) getPropertyValue(SiebelPropertyNameConstants.PARENT_RELATIONSHIP_ID);
  }

  // ----------------------------------------------------------------------------------
  // property: domainItemId

  private String mDomainItemId = null;

  /**
   * Sets property domainItemId
   **/

  public void setDomainItemId(String pDomainItemId) {
    mDomainItemId = pDomainItemId;
    setPropertyValue(SiebelPropertyNameConstants.DOMAIN_ITEM_ID, pDomainItemId);
  }

  /**
   * Returns property domainItemId
   **/

  public String getDomainItemId() {
    return (String) getPropertyValue(SiebelPropertyNameConstants.DOMAIN_ITEM_ID);
  }

  // ----------------------------------------------------------------------------------
  // property: cfgStateCode

  private String mCfgStateCode = null;

  /**
   * Sets property cfgStateCode
   **/

  public void setCfgStateCode(String pCfgStateCode) {
    mCfgStateCode = pCfgStateCode;
    setPropertyValue(SiebelPropertyNameConstants.CFG_STATE_CODE, pCfgStateCode);
  }

  /**
   * Returns property cfgStateCode
   **/

  public String getCfgStateCode() {
    return (String) getPropertyValue(SiebelPropertyNameConstants.CFG_STATE_CODE);
  }


  // ----------------------------------------------------------------------------------
  // property: configured
  /**
   * Sets property configured
   **/

  public void setConfigured(boolean pConfigured) {
  	setPropertyValue(SiebelPropertyNameConstants.CONFIGURED, pConfigured);
  }

  /**
   * Returns property configured
   **/

  public boolean isConfigured() {
  	return (Boolean) getPropertyValue(SiebelPropertyNameConstants.CONFIGURED);
  }


  // ----------------------------------------------------------------------------------
  // property: abo
  /**
   * Returns property abo
   **/

  public boolean isAbo() {
	return (getAssetNumber() != null);
  }

  /**
   * @return the commerceItemType
   */
  public String getCommerceItemType() {
    return (String) getPropertyValue(SiebelPropertyNameConstants.COMMERCE_ITEM_TYPE);
  }

  /**
   * @param pCommerceItemType the commerceItemType to set
   */
  public void setCommerceItemType(String pCommerceItemType) {
    if(pCommerceItemType == null || "".equals(pCommerceItemType)){
      setPropertyValue(SiebelPropertyNameConstants.COMMERCE_ITEM_TYPE, Constants.SiebelCommerceItemType.DEFAULT.toString());
    }else{
    setPropertyValue(SiebelPropertyNameConstants.COMMERCE_ITEM_TYPE, pCommerceItemType);
    }
  }

  // ----------------------------------------------------------------------------------
  // property: assetId
  /**
   * Sets property assetId
   **/

  public void setAssetNumber(String pAssetNumber) {
	  setPropertyValue(SiebelPropertyNameConstants.ASSET_NUMBER, pAssetNumber);
  }

  /**
   * Returns property asset id
   **/

  public String getAssetNumber() {
	  return (String) getPropertyValue(SiebelPropertyNameConstants.ASSET_NUMBER);
  }

  // ----------------------------------------------------------------------------------
  // property: asset integration id
  /**
   * Sets property asset integration id
   **/

  public void setAssetIntegrationId(String pAssetIntegrationId) {
	  setPropertyValue(SiebelPropertyNameConstants.ASSET_INTEGRATION_ID, pAssetIntegrationId);
  }

  /**
   * Returns property asset integration id
   **/

  public String getAssetIntegrationId() {
	  return (String) getPropertyValue(SiebelPropertyNameConstants.ASSET_INTEGRATION_ID);
  }

  // ----------------------------------------------------------------------------------
  // property: quote item id
  /**
   * Sets property quote item id
   **/

  public void setQuoteItemId(String pQuoteItemId) {
	  setPropertyValue(SiebelPropertyNameConstants.QUOTE_ITEM_ID, pQuoteItemId);
  }

  /**
   * Returns property quote item id
   **/

  public String getQuoteItemId() {
	  String quoteItemId = (String) getPropertyValue(SiebelPropertyNameConstants.QUOTE_ITEM_ID);
	  return quoteItemId;
  }

  // ----------------------------------------------------------------------------------
  // property: repositoryItem

  /**
   * setRepositoryItem
   *
   * Sets the Siebel commerce item repositoryItem in the parent CommerceItem
   * class and in the commerce item container.
   *
   * @param pRepositoryItem
   *          - the repository item to set.
   */

  public void setRepositoryItem(MutableRepositoryItem pRepositoryItem) {
    // Set the repository item in the parent class.

    super.setRepositoryItem(pRepositoryItem);

    // Set the repository item in the commerce item container.

    mChildCommerceItemContainer.setRepositoryItem(pRepositoryItem);
  }

  // -------------------------------------------------------------------------------
  // property: prodPromoRuleId
  private String mProdPromoRuleId;

  /**
   * Returns the prod promo rule id
   * @return
   */
  public String getProdPromoRuleId() {
	  return (String) getPropertyValue(SiebelPropertyNameConstants.PROD_PROMORULE_ID);
  }

  /**
   * Sets the Prod promo rule id
   * @param mProdPromoRuleId
   */
  public void setProdPromoRuleId(String pProdPromoRuleId) {
	  mProdPromoRuleId = pProdPromoRuleId;
	  setPropertyValue(SiebelPropertyNameConstants.PROD_PROMORULE_ID, pProdPromoRuleId);
  }

  // --------------------------------------------------------------------------------
  // property: prodPromoInstanceId
  private String mProdPromoInstanceId;

  /**
   * Returns the prod promo instance id
   * @return
   */
  public String getProdPromoInstanceId(){
	  return (String) getPropertyValue(SiebelPropertyNameConstants.PROD_PROMOINSTANCE_ID);
  }

  /**
   * Sets the prod prom instance id
   * @param pProdPromoInstanceId
   */
  public void setProdPromoInstanceId(String pProdPromoInstanceId) {
	  mProdPromoInstanceId=pProdPromoInstanceId;
	  setPropertyValue(SiebelPropertyNameConstants.PROD_PROMOINSTANCE_ID, pProdPromoInstanceId);
  }

  // ----------------------------------------------------------------------------------
  // CommerceItemContainer implementation (i.e. for the childItems)
  // ----------------------------------------------------------------------------------

  /**
   * Returns a List of CommerceItems
   */
  @SuppressWarnings("rawtypes")
  public List getCommerceItems() {
    return mChildCommerceItemContainer.getCommerceItems();
  }

  /**
   * addCommerceItem
   *
   * Adds a commerce item to the container. If the commerce item already exists
   * then a DuplicateCommerceItemException is thrown.
   *
   * @param pCommerceItem
   *          - the commerce item to be added.
   * @exception DuplicateCommerceItemException
   * @exception InvalidParameterException
   */

  public void addCommerceItem(CommerceItem pCommerceItem)
    throws DuplicateCommerceItemException, InvalidParameterException {
    RepositoryItem repositoryItem = null;

    // Check that the item specified is a SiebelCommerceItem.

    if (!(pCommerceItem instanceof SiebelCommerceItem)) {
      throw new InvalidParameterException(
        SiebelConstants.NOT_SIEBEL_COMMERCE_ITEM);
    }

    // Add the item to the container.

    mChildCommerceItemContainer.addCommerceItem(pCommerceItem);

    // ??? Clare

    @SuppressWarnings("unchecked")
    List<RepositoryItem> items =
      (List<RepositoryItem>) getPropertyValue(SiebelPropertyNameConstants.CHILD_ITEMS);

    repositoryItem = ((ChangedProperties) pCommerceItem).getRepositoryItem();

    if (!(items.contains(repositoryItem))) {
      items.add(repositoryItem);
    }
  }

  /**
   * addCommerceItem
   *
   * Adds a commerce item to the container at the given index. If the commerce
   * item already exists then a DuplicateCommerceItemException is thrown.
   *
   * @param pCommerceItem
   *          - the commerce item to be added.
   * @param pIndex
   *          - the index where the commerce item is to be added.
   * @exception DuplicateCommerceItemException
   * @exception InvalidParameterException
   */

  public void addCommerceItem(CommerceItem pCommerceItem, int pIndex)
    throws DuplicateCommerceItemException, InvalidParameterException {

    RepositoryItem repositoryItem = null;

    // Check that the item specified is a SiebelCommerceItem.

    if (!(pCommerceItem instanceof SiebelCommerceItem)) {
      throw new InvalidParameterException(
        SiebelConstants.NOT_SIEBEL_COMMERCE_ITEM);
    }

    // Add the item to the container.

    mChildCommerceItemContainer.addCommerceItem(pCommerceItem, pIndex);

    // ??? Clare

    @SuppressWarnings("unchecked")
    List<RepositoryItem> items =
      (List<RepositoryItem>) getPropertyValue(SiebelPropertyNameConstants.CHILD_ITEMS);

    repositoryItem = ((ChangedProperties) pCommerceItem).getRepositoryItem();

    if (!(items.contains(repositoryItem))) {
      items.add(pIndex, repositoryItem);
    }
  }

  /**
   * removeCommerceItem
   *
   * Removes the CommerceItem specified by the id passed in. If the CommerceItem
   * is not in the container then a CommerceItemNotFoundException is thrown.
   * Otherwise a reference to the removed CommerceItem is returned.
   *
   * @param pCommerceItemId
   *          - the commerce item id to be removed.
   * @exception CommerceItemNotFoundException
   * @exception InvalidParameterException
   */

  public CommerceItem removeCommerceItem(String pCommerceItemId)
    throws CommerceItemNotFoundException, InvalidParameterException {
    SiebelCommerceItem item = null;

    // Remove the item from the commerce item container.

    item = (SiebelCommerceItem) mChildCommerceItemContainer.removeCommerceItem(pCommerceItemId);
    item.removeAllAttributes();
    item.removeAllCommerceItems();
    return item;
  }


  /**
   * Removes this commerce item, all of its child items, its
   * attributes and all associated repositoryItems.
   */
  public void removeItem() {
    removeAllAttributes();
    removeAllCommerceItems();

    MutableRepositoryItem reposItem = getRepositoryItem();
    MutableRepository repos = (MutableRepository) reposItem.getRepository();
    try {
      repos.removeItem(reposItem.getRepositoryId(), reposItem
          .getItemDescriptor().getItemDescriptorName());
    } catch (RepositoryException e) {
      mLogger.logError(e);
    }
  }


  /**
   * removeAllCommerceItems
   *
   * Removes all of the commerce items.
   *
   */

  public void removeAllCommerceItems() {

    @SuppressWarnings("unchecked")
    List<RepositoryItem> items =
      (List<RepositoryItem>) getPropertyValue(SiebelPropertyNameConstants.CHILD_ITEMS);

    items.clear();

    // Remove the commerce items from the container.

    List<SiebelCommerceItem> children = mChildCommerceItemContainer
        .getCommerceItems();

    for (SiebelCommerceItem nextCommerceItem : children) {
      nextCommerceItem.removeItem();
    }

    mChildCommerceItemContainer.removeAllCommerceItems();

  }

  /**
   * getCommerceItem
   *
   * Returns the CommerceItem specified by the id passed in. If the
   * corrseponding CommerceItem is not in the container then a
   * CommerceItemNotFoundException is thrown.
   *
   * @param pCommerceItemId
   *          - the commerce item id to be returned.
   * @exception CommerceItemNotFoundException
   * @exception InvalidParameterException
   */

  public CommerceItem getCommerceItem(String pCommerceItemId)
    throws CommerceItemNotFoundException, InvalidParameterException {
	if(getId().equals(pCommerceItemId))
		return this;
    return mChildCommerceItemContainer.getCommerceItem(pCommerceItemId);
  }

  /**
   * getCommerceItem
   *
   * Returns a List of CommerceItems whose catalogRefId matches the catalog
   * reference id passed in. If a CommerceItem with the corresponding
   * catalogRefId is not in the container then a CommerceItemNotFoundException
   * is thrown.
   *
   * @param pCatalogRefId
   *          - the catalog reference id to use for the search.
   * @exception CommerceItemNotFoundException
   * @exception InvalidParameterException
   */

  @SuppressWarnings("rawtypes")
  public List getCommerceItemsByCatalogRefId(String pCatalogRefId)
    throws CommerceItemNotFoundException, InvalidParameterException {
    return mChildCommerceItemContainer
      .getCommerceItemsByCatalogRefId(pCatalogRefId);
  }

  /**
   * getCommerceItemCount
   *
   * Returns the number of CommerceItems in the container.
   */

  public int getCommerceItemCount() {
    return mChildCommerceItemContainer.getCommerceItemCount();
  }

  /**
   * getTotalCommerceItemCount
   *
   * Totals the quantities for each of the CommerceItems in the container and
   * returns the result.
   */

  public long getTotalCommerceItemCount() {
    return mChildCommerceItemContainer.getTotalCommerceItemCount();
  }

  // ----------------------------------------------------------------------------------
  // SiebelAttributeContainer implementation.
  // ----------------------------------------------------------------------------------

  /**
   * getSiebelAttributes
   *
   * Returns a List of attributes. Note that the returned List should not be
   * edited directly. Doing so will result in unexpected behavior. Any editing
   * should be done through this class.
   */

  public List<SiebelAttribute> getSiebelAttributes() {
    return mAttributeContainer.getSiebelAttributes();
  }

  /**
   * addSiebelAttribute
   *
   * Add an attribute to the container. If the attribute was already in the
   * container a DuplicateAttributeException is thrown.
   *
   * @param pAttribute
   *          the attribute to be added
   * @exception DuplicateAttributeException
   * @exception InvalidParameterException
   */

  public void addSiebelAttribute(SiebelAttribute pAttribute)
    throws DuplicateAttributeException, InvalidParameterException {
    RepositoryItem repositoryItem = null;

    mAttributeContainer.addSiebelAttribute(pAttribute);

    if (!(pAttribute instanceof ChangedProperties)) {
      throw new InvalidParameterException(SiebelConstants.INVALID_ATTRIBUTE);
    }

    @SuppressWarnings("unchecked")
    List<RepositoryItem> attributes =
      (List<RepositoryItem>) getPropertyValue(SiebelPropertyNameConstants.ATTRIBUTES);

    repositoryItem = ((ChangedProperties) pAttribute).getRepositoryItem();

    if (!attributes.contains(repositoryItem)) {
      attributes.add(repositoryItem);
    }
    setChanged(true);
  }

  /**
   * addSiebelAttribute
   *
   * Add an attribute to the container at the given index. If the attribute was
   * already in the container a DuplicateAttributeException is thrown.
   *
   * @param pAttribute
   *          the attribute to be added
   * @param pIndex
   *          the container index where the attribute is to be added
   * @exception DuplicateAttributeException
   * @exception InvalidParameterException
   */

  public void addSiebelAttribute(SiebelAttribute pAttribute, int pIndex)
    throws DuplicateAttributeException, InvalidParameterException {
    RepositoryItem repositoryItem = null;

    mAttributeContainer.addSiebelAttribute(pAttribute, pIndex);

    if (!(pAttribute instanceof ChangedProperties)) {
      throw new InvalidParameterException(SiebelConstants.INVALID_ATTRIBUTE);
    }

    @SuppressWarnings("unchecked")
    List<RepositoryItem> attributes =
      (List<RepositoryItem>) getPropertyValue(SiebelPropertyNameConstants.ATTRIBUTES);

    repositoryItem = ((ChangedProperties) pAttribute).getRepositoryItem();

    if (!attributes.contains(repositoryItem)) {
      attributes.add(pIndex, repositoryItem);
    }
    setChanged(true);
  }

  /**
   * removeAttribute
   *
   * Removes the attribute whose id is passed as a parameter. If the attribute
   * is not in the container then a AttributeNotFoundException is thrown.
   * Otherwise a reference to the removed attribute is returned.
   *
   * @param pAttributeId
   *          the id of the attribute to be removed
   * @exception AttributeNotFoundException
   * @exception InvalidParameterException
   */

  public SiebelAttribute removeAttribute(String pAttributeId)
    throws AttributeNotFoundException, InvalidParameterException {
    SiebelAttribute attribute = null;
    Iterator<RepositoryItem> iterator = null;
    RepositoryItem item = null;

    attribute = mAttributeContainer.removeAttribute(pAttributeId);

    @SuppressWarnings("unchecked")
    List<RepositoryItem> attributes =
      (List<RepositoryItem>) getPropertyValue(SiebelPropertyNameConstants.ATTRIBUTES);

    iterator = attributes.iterator();

    while (iterator.hasNext()) {
      item = (RepositoryItem) iterator.next();
      MutableRepository repos = (MutableRepository) item.getRepository();
      if (pAttributeId.equals(item.getRepositoryId())) {
        iterator.remove();
        try {
          repos.removeItem(
              item.getRepositoryId(),
              item.getItemDescriptor().getItemDescriptorName());
        } catch (RepositoryException e) {
          mLogger.logError(e);
        }
        break;
      }
    }
    setChanged(true);

    return attribute;
  }

  /**
   * removeAllAttributes
   *
   * Removes all of the attributes from the container.
   */
  public void removeAllAttributes() {

    mAttributeContainer.removeAllAttributes();

    @SuppressWarnings("unchecked")
    List<RepositoryItem> attributes =
      (List<RepositoryItem>) getPropertyValue(SiebelPropertyNameConstants.ATTRIBUTES);

    for (RepositoryItem attributeItem : attributes) {
      MutableRepository repos = (MutableRepository) attributeItem.getRepository();
      try {
        repos.removeItem(
            attributeItem.getRepositoryId(),
            attributeItem.getItemDescriptor().getItemDescriptorName());
      } catch (RepositoryException e) {
        mLogger.logError(e);
      }
    }

    attributes.clear();
    setChanged(true);
  }

  /**
   * removeAttribute
   *
   * Returns the attribute specified by the id passed in. If the attribute with
   * the corresponding id is not in the container then an
   * AttributeNotFoundException is thrown.
   *
   * @param pAttributeId
   *          the id of the attribute to be returned
   * @exception AttributeNotFoundException
   * @exception InvalidParameterException
   */

  public SiebelAttribute getAttribute(String pAttributeId)
    throws AttributeNotFoundException, InvalidParameterException {
    return mAttributeContainer.getAttribute(pAttributeId);
  }

  /**
   * getAttributeCount
   *
   * Returns the number of attributes in the container
   */

  public int getAttributeCount() {
    return mAttributeContainer.getAttributeCount();
  }

  /**
  *
  * no - op implementation. Fractional quantities unsupported by Siebel.
  *
  */
  public double getTotalCommerceItemCountWithFraction()
  {
	return 0.0;
  }

  //-------------------------------------
  /**
   * Returns the commerce item whose id is pCommerceItemId. If pSearchChildItems is true, any commerce items that are
   * also CommerceItemContainers will be searched recursively. CommerceItemNotFoundException is thrown
   * if pSearchChildItems is false and a commerce item with the specified id does not exist in this container or
   * if pSearchChildItems is true and a commerce item with the specified id does not exist anywhere in the tree of
   * nested containers.
   * @exception CommerceItemNotFoundException
   * @exception InvalidParameterException
   */
  public CommerceItem getCommerceItem(String pCommerceItemId, boolean pSearchChildItems)
          throws CommerceItemNotFoundException, InvalidParameterException
  {
	if(pSearchChildItems)
	{
	  return getCommerceItem(pCommerceItemId);
	}
	else
	{
	  if(getId().equals(pCommerceItemId))
	  {
		  return this;
	  }
	  else
	  {
		  throw new CommerceItemNotFoundException("Commerce item " + pCommerceItemId + " not found");
	  }
	}
  }

}
