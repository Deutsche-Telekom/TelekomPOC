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

package atg.siebel.account.command;

import java.beans.IntrospectionException;
import java.lang.reflect.Field;
import java.text.MessageFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import atg.adapter.integrations.ChangedPropertyBean;
import atg.adapter.integrations.IntegrationRepository;
import atg.adapter.integrations.IntegrationRepositoryItemDescriptor;
import atg.beans.DynamicBeanInfo;
import atg.beans.DynamicBeans;
import atg.beans.PropertyNotFoundException;
import atg.core.util.StringUtils;
import atg.integrations.BaseCommand;
import atg.integrations.CommandInvocationException;
import atg.integrations.CommandResult;
import atg.integrations.CommandTimeoutException;
import atg.integrations.InvalidInputException;
import atg.repository.MutableRepositoryItem;
import atg.repository.RepositoryException;
import atg.repository.RepositoryItem;
import atg.repository.databinding.PropertyMappingElement;
import atg.siebel.account.SiebelAccountConstants;
import atg.siebel.integration.WebServiceController;
import atg.siebel.integration.WebServiceHelper;

import com.siebel.selfservice.common.address.data.CutAddressData;

/**
 * This command creates a new address in the Siebel system using the
 * SelfServiceAddress web service
 */
public abstract class SiebelCommand extends BaseCommand implements
		SiebelAccountConstants {

	// -------------------------------------
	// Class version string
	// -------------------------------------

	public static String CLASS_VERSION = "$Id: //product/Siebel/version/11.2/src/atg/siebel/account/command/SiebelCommand.java#2 $$Change: 1194813 $";

	// -------------------------------------
	// Properties
	// -------------------------------------

  protected WebServiceController mWebServiceController;

  // --------- Property: webServicePool ------------
  public void setWebServiceController(WebServiceController pWebServiceController)
  {
    mWebServiceController = pWebServiceController;
  }

  public WebServiceController getWebServiceController()
  {
    return mWebServiceController;
  }

	// --------- Property: BillingAddressPropertyName -----------
	protected String mBillingAddressPropertyName = "billingAddress";

	/**
	 * @description: the name of the property in the organization item
	 *               descriptor that holds the primary billing address
	 */
	public void setBillingAddressPropertyName(String pBillingAddressPropertyName) {
		mBillingAddressPropertyName = pBillingAddressPropertyName;
	}

	/**
	 * @return The name of the property in the organization item descriptor that
	 *         holds the primary billing address
	 */
	public String getBillingAddressPropertyName() {
		return mBillingAddressPropertyName;
	}

	// --------- Property: ContactAddressRepository -----------
	protected IntegrationRepository mContactAddressRepository;

	/**
	 * @description: the integration repository that holds the mapping of
	 *               BusinessAddressData class to contactInfo item descriptor
	 */
	public void setContactAddressRepository(
			IntegrationRepository pContactAddressRepository) {
		mContactAddressRepository = pContactAddressRepository;
	}

	/**
	 * @return The integration repository that holds the mapping of
	 *         BusinessAddressData class to contactInfo item descriptor
	 */
	public IntegrationRepository getContactAddressRepository() {
		return mContactAddressRepository;
	}

	// --------- Property: ContactInfoItemDescriptorName -----------
	protected String mContactInfoItemDescriptorName = "contactInfo";

	/**
	 * @description: the name of the contactInfo item descriptor in the profile
	 *               repository
	 */
	public void setContactInfoItemDescriptorName(
			String pContactInfoItemDescriptorName) {
		mContactInfoItemDescriptorName = pContactInfoItemDescriptorName;
	}

	/**
	 * @return The name of the contactInfo item descriptor in the profile
	 *         repository
	 */
	public String getContactInfoItemDescriptorName() {
		return mContactInfoItemDescriptorName;
	}

	// --------- Property: OrganizationItemDescriptorName -----------
	protected String mOrganizationItemDescriptorName = "organization";

	/**
	 * @description: the name of the organization item descriptor in the profile
	 *               repository
	 */
	public void setOrganizationItemDescriptorName(
			String pOrganizationItemDescriptorName) {
		mOrganizationItemDescriptorName = pOrganizationItemDescriptorName;
	}

	/**
	 * @return The name of the organization item descriptor in the profile
	 *         repository
	 */
	public String getOrganizationItemDescriptorName() {
		return mOrganizationItemDescriptorName;
	}

	// --------- Property: PrimaryBillToRepository -----------
	protected IntegrationRepository mPrimaryBillToRepository;

	/**
	 * @description: the integration repository that holds the mapping of
	 *               "billTo" fields in the AccountData class to contactInfo
	 *               item descriptor
	 */
	public void setPrimaryBillToRepository(
			IntegrationRepository pPrimaryBillToRepository) {
		mPrimaryBillToRepository = pPrimaryBillToRepository;
	}

	// --------- Property: BillingProfileRepository -----------
	protected IntegrationRepository mBillingProfileRepository;

	public IntegrationRepository getBillingProfileRepository() {
		return mBillingProfileRepository;
	}

	public void setBillingProfileRepository(
			IntegrationRepository pBillingProfileRepository) {
		this.mBillingProfileRepository = pBillingProfileRepository;
	}

	// --------- Property: CreditCardsPropertyName -----------
	protected String mCreditCardDescriptorName = "credit-card";

	public String getCreditCardDescriptorName() {
		return mCreditCardDescriptorName;
	}

	public void setCreditCardDescriptorName(String p) {
		this.mCreditCardDescriptorName = p;
	}

	protected String mCreditCardsPropertyName = "creditCards";

	public String geCreditCardsPropertyName() {
		return mCreditCardsPropertyName;
	}

	public void setCreditCardsPropertyName(String p) {
		this.mCreditCardsPropertyName = p;
	}

	public String mDefaultCreditCardPropertyName = "defaultCreditCard";
	
	public String getDefaultCreditCardPropertyName() {
		return mDefaultCreditCardPropertyName;
	}

	public void setDefaultCreditCardPropertyName(String pDefaultCreditPropertyName) {
		this.mDefaultCreditCardPropertyName = pDefaultCreditPropertyName;
	}

	/**
	 * @return the integration repository that holds the mapping of "billTo"
	 *         fields in the AccountData class to contactInfo item descriptor
	 */
	public IntegrationRepository getPrimaryBillToRepository() {
		return mPrimaryBillToRepository;
	}

	// --------- Property: PrimaryShipToRepository -----------
	protected IntegrationRepository mPrimaryShipToRepository;

	/**
	 * @description: the integration repository that holds the mapping of
	 *               "shipTo" fields in the AccountData class to contactInfo
	 *               item descriptor
	 */
	public void setPrimaryShipToRepository(
			IntegrationRepository pPrimaryShipToRepository) {
		mPrimaryShipToRepository = pPrimaryShipToRepository;
	}

	/**
	 * @return the integration repository that holds the mapping of "shipTo"
	 *         fields in the AccountData class to contactInfo item descriptor
	 */
	public IntegrationRepository getPrimaryShipToRepository() {
		return mPrimaryShipToRepository;
	}

	// --------- Property: SecondaryAddressesPropertyName -----------
	protected String mSecondaryAddressesPropertyName = "secondaryAddresses";

	/**
	 * @description: the name of the property in the organization item
	 *               descriptor that holds the list of secondary addresses
	 */
	public void setSecondaryAddressesPropertyName(
			String pSecondaryAddressesPropertyName) {
		mSecondaryAddressesPropertyName = pSecondaryAddressesPropertyName;
	}

	/**
	 * @return The name of the property in the organization item descriptor that
	 *         holds the list of secondary addresses
	 */
	public String getSecondaryAddressesPropertyName() {
		return mSecondaryAddressesPropertyName;
	}

	// --------- Property: ShippingAddressPropertyName -----------
	protected String mShippingAddressPropertyName = "shippingAddress";

	/**
	 * @description: the name of the property in the organization item
	 *               descriptor that holds the primary shipping address
	 */
	public void setShippingAddressPropertyName(
			String pShippingAddressPropertyName) {
		mShippingAddressPropertyName = pShippingAddressPropertyName;
	}

	/**
	 * @return The name of the property in the organization item descriptor that
	 *         holds the primary shipping address
	 */
	public String getShippingAddressPropertyName() {
		return mShippingAddressPropertyName;
	}

	// --------- Property: UserItemDescriptorName -----------
	protected String mUserItemDescriptorName;

	/**
	 * @description: the name of the user item descriptor in the profile
	 *               repository
	 */
	public void setUserItemDescriptorName(String pUserItemDescriptorName) {
		mUserItemDescriptorName = pUserItemDescriptorName;
	}

	/**
	 * @return The name of the user item descriptor in the profile repository
	 */
	public String getUserItemDescriptorName() {
		return mUserItemDescriptorName;
	}

	// --------- Property: UserPrimaryAddressPropertyName -----------
	protected String mUserPrimaryAddressPropertyName = "homeAddress";

	/**
	 * @description: the name of the property in the user item descriptor that
	 *               holds the primary address
	 */
	public void setUserPrimaryAddressPropertyName(
			String pUserPrimaryAddressPropertyName) {
		mUserPrimaryAddressPropertyName = pUserPrimaryAddressPropertyName;
	}

	/**
	 * @return The name of the property in the user item descriptor that holds
	 *         the primary address
	 */
	public String getUserPrimaryAddressPropertyName() {
		return mUserPrimaryAddressPropertyName;
	}

	// --------- Property: SiebelRepository -----------
	protected IntegrationRepository mSiebelRepository;

	/**
	 * @description: The integration repository used to interact with Siebel.
	 */
	public void setSiebelRepository(IntegrationRepository pSiebelRepository) {
		mSiebelRepository = pSiebelRepository;
	}

	/**
	 * @return The integration repository used to interact with Siebel when
	 *         managing customer accounts.
	 */
	public IntegrationRepository getSiebelRepository() {
		return mSiebelRepository;
	}

	// --------- Property: WebServiceHelper -----------
	protected WebServiceHelper mWebServiceHelper;

	/**
	 * @description: Helper class to facilitate webservice invocation.
	 */
	public void setWebServiceHelper(WebServiceHelper pWebServiceHelper) {
		mWebServiceHelper = pWebServiceHelper;
	}

	/**
	 * @return Helper class to facilitate webservice invocation.
	 */
	public WebServiceHelper getWebServiceHelper() {
		return mWebServiceHelper;
	}

	// --------- Property: Operation -----------
	// update, insert, and remove components need to say what operation
	// Siebel is to perform.
	protected String mOperation;

	/**
	 * @description: The type of operation to perform. Valid values are
	 *               "insert", "update", and "delete"
	 */
	public void setOperation(String pOperation) {
		mOperation = pOperation;
	}

	/**
	 * @return The type of operation to perform. Valid values are "insert",
	 *         "update", and "delete"
	 */
	public String getOperation() {
		return mOperation;
	}

	// --------- Property: requiredAddressProperties -----------
	protected String[] mRequiredAddressProperties = null;

	/**
	 * @description: Array of property names required for addresses
	 */
	public void setRequiredAddressProperties(String[] pRequiredProperties) {
		mRequiredAddressProperties = pRequiredProperties;
	}

	/**
	 * @return Array of property names required for addresses
	 */
	public String[] getRequiredAddressProperties() {
		return mRequiredAddressProperties;
	}

	// -------------------------------------
	// Methods
	// -------------------------------------

	/**
	 * This method takes an object that needs to be populated with data to be
	 * used as part of the webservice call, and a repository item that holds
	 * that data. Using the mapping in the integration repository, the data is
	 * transferred from the repository item to the appropriate properties in the
	 * webservices object.
	 */
	protected void populateSiebelObject(Object pSiebelObject,
			IntegrationRepository pRepository, RepositoryItem pItem,
			String pItemDescriptorName) throws RepositoryException {

		// Get the appropriate item descriptor from the integration repository
		IntegrationRepositoryItemDescriptor desc = (IntegrationRepositoryItemDescriptor) pRepository
				.getItemDescriptor(pItemDescriptorName);

		// Get the target mappings
		@SuppressWarnings("unchecked")
		Map<String, PropertyMappingElement> targetMappings = desc
				.getItemMappingElement().getMappingByTargetName();

		// Get the Siebel property names and iterate through them
		for (String propertyName : targetMappings.keySet()) {

			// Get the Siebel property name, and get the local property name
			// using the
			// mapping
			String localPropertyName = targetMappings.get(propertyName)
					.getName();

			// Get the property value from the repository item, and set it on
			// the
			// Siebel object
			if (desc.hasProperty(localPropertyName)) {
				Object value = pItem.getPropertyValue(localPropertyName);
				try {
					DynamicBeans.setPropertyValue(pSiebelObject, propertyName,
							value);
				} catch (PropertyNotFoundException pnfe) {
				}
			}
		}
	}

	/**
	 * Returns null if no existing address is found. Otherwise, it returns the
	 * list of addresses that match the supplied RepositoryItem.
	 * 
	 * @param pItem
	 *            RepositoryItem representing the address to lookup.
	 * @param useExternalId
	 *            boolean indicating if the Siebel ID should be used only as the
	 *            query criteria.
	 * @return null or CommandResult with the result set to
	 *         List(CutAddressData).
	 * @throws RepositoryException
	 * @throws CommandInvocationException
	 * @throws CommandTimeoutException
	 * @throws InvalidInputException
	 */
	protected CommandResult checkForExistingAddress(RepositoryItem pItem,
			boolean useExternalId) throws RepositoryException,
			CommandTimeoutException, InvalidInputException,
			CommandInvocationException {

		// minimum set of address data is required, otherwise nothing will be
		// found
		if (!useExternalId && !hasMinimumAddressData(pItem)) {
			return null;
		}

		// build a query to find -exactly- the same address
		Map<String, String> constraints = new HashMap<String, String>();
		String externalIdPropertyName = lookupExternalIdName(pItem);
		if (useExternalId) {
			vlogDebug(
					"Looking up address using id property {0} with value {1}",
					externalIdPropertyName,
					(String) pItem.getPropertyValue(externalIdPropertyName));
			addExternalIdToConstraints(constraints, pItem,
					externalIdPropertyName);
		} else {
			if (isLoggingDebug()) {
				logDebug("Looking up address without using ID");
			}
			constraints = buildQueryConstraints(pItem);
		}

		// ensure the external ID property is there -- even if a blank value
		// just
		// so a return value is supplied by Siebel
		if (!constraints.containsKey(lookupExternalIdMappedName(pItem,
				externalIdPropertyName))) {
			addExternalIdToConstraints(constraints, pItem,
					externalIdPropertyName, "");
		}

		// create the contact info query and call it
		// this isn't a configured service, but it can be wired up like one here
		ContactInfoQuery ciq = new ContactInfoQuery();
		ciq.setSiebelRepository(getSiebelRepository());
		ciq.setCommandHandler(getCommandHandler());
		ciq.setWebServiceHelper(getWebServiceHelper());
    ciq.setWebServiceController(getWebServiceController());
		CommandResult queryResult = ciq.invokeRPC(constraints);
		@SuppressWarnings("unchecked")
		List<CutAddressData> addressList = (List<CutAddressData>) queryResult
				.getResult();
		vlogDebug("Addresses matching criteria: {0}", addressList.size());
		if (addressList.size() > 0) {
			CommandResult commandResult = new CommandResult();
			commandResult.setResult(addressList);
			return commandResult;
		}

		return null;
	}

	/**
	 * Checks to make sure the source item has the minimum amount of address
	 * data required to interact with Siebel.
	 * 
	 * @param pObject
	 *            Object (often a RepositoryItem) to test.
	 * @return true if the minimum set of data exists.
	 * @throws RepositoryException
	 */
	public boolean hasMinimumAddressData(Object pObject)
			throws RepositoryException {

		Object aBean = pObject;

		/*
		 * First, things like ChangedPropertyBean and MappingRepositoryItem can
		 * be passed in here. They might not have all the properties we're
		 * looking for (e.g., ChangedPropertyBean only contains the list of
		 * -changed- properties). Second, since we're sync'ing the local item,
		 * get it so we know what we have and can therefore see all the
		 * properties.
		 */
		if (pObject instanceof RepositoryItem) {
			String id = ((RepositoryItem) pObject).getRepositoryId();
			String itemDescName = ((RepositoryItem) aBean).getItemDescriptor()
					.getItemDescriptorName();
			aBean = getSiebelRepository().getLocalMutableRepository().getItem(
					id, itemDescName);
		}

		DynamicBeanInfo beanInfo = null;
		try {
			beanInfo = DynamicBeans.getBeanInfo(aBean);
		} catch (IntrospectionException rEx) {
			throw new RepositoryException(rEx);
		}

		// check for required properties
		for (String propertyName : getRequiredAddressProperties()) {
			if (!beanInfo.hasProperty(propertyName)) {
				vlogDebug("Bean does not have required property: {0}",
						propertyName);
				return false;
			}
		}

		return true;
	}

	/**
	 * @param pBean
	 */
	public boolean hasMinimumTargetAddressData(Object pObject)
			throws RepositoryException {

		DynamicBeanInfo beanInfo = null;
		try {
			beanInfo = DynamicBeans.getBeanInfo(pObject);
		} catch (IntrospectionException rEx) {
			throw new RepositoryException(rEx);
		}

		// businessAddress
		if (beanInfo.hasProperty("streetAddress")
				&& beanInfo.hasProperty("city")
				&& beanInfo.hasProperty("state")
				&& beanInfo.hasProperty("postalCode")) {
			return true;
		}

		// contactAddress
		if (beanInfo.hasProperty("primaryStreetAddress")
				&& beanInfo.hasProperty("primaryCity")
				&& beanInfo.hasProperty("primaryState")
				&& beanInfo.hasProperty("primaryPostalCode")) {
			return true;
		}

		// primaryBillTo
		if (beanInfo.hasProperty("primaryBillToStreetAddress")
				&& beanInfo.hasProperty("primaryBillToCity")
				&& beanInfo.hasProperty("primaryBillToState")
				&& beanInfo.hasProperty("primaryBillToPostalCode")) {
			return true;
		}

		// primaryShipTo
		if (beanInfo.hasProperty("primaryShipToStreetAddress")
				&& beanInfo.hasProperty("primaryShipToCity")
				&& beanInfo.hasProperty("primaryShipToState")
				&& beanInfo.hasProperty("primaryShipToPostalCode")) {
			return true;
		}

		return false;
	}

	/**
	 * Looks up the id property from the external system and adds it, with the
	 * value from the RepositoryItem, to the query constraints.
	 * 
	 * @param pConstraints
	 *            Map(String,String) of the query constraints.
	 * @param pItem
	 *            RepositoryItem whose partner is being queried in the external
	 *            system.
	 * @param pExtIdPropName
	 *            String of the external property name on the RepositoryItem.
	 * @param pValue
	 *            String of the value to add to the constraints. If this is null
	 *            the value from the pItem will be added.
	 * @throws RepositoryException
	 *             If there is an issue looking up the RepositoryItem's item
	 *             descriptor, or if there is no mapping for the supplied
	 *             external id property.
	 */
	void addExternalIdToConstraints(Map<String, String> pConstraints,
			RepositoryItem pItem, String pExtIdPropName, String pValue)
			throws RepositoryException {

		// lookup property mapping and get external name
		String idPropNameFromExtSystem = lookupExternalIdMappedName(pItem,
				pExtIdPropName);

		// get value
		String externalIdPropValue = null;
		if (pValue != null) {
			externalIdPropValue = pValue;
		} else {
			externalIdPropValue = (String) pItem
					.getPropertyValue(pExtIdPropName);
		}

		// add value to map using external name as key
		pConstraints.put(idPropNameFromExtSystem, externalIdPropValue);
	}

	/**
	 * Looks up the id property from the external system and adds it, with the
	 * value from the RepositoryItem, to the query constraints.
	 * 
	 * @param pConstraints
	 *            Map(String,String) of the query constraints.
	 * @param pItem
	 *            RepositoryItem whose partner is being queried in the external
	 *            system.
	 * @param pExtIdPropName
	 *            String of the external property name on the RepositoryItem.
	 * @param pValue
	 *            String of the value to add to the constraints.
	 * @throws RepositoryException
	 *             If there is an issue looking up the RepositoryItem's item
	 *             descriptor, or if there is no mapping for the supplied
	 *             external id property.
	 */
	void addExternalIdToConstraints(Map<String, String> pConstraints,
			RepositoryItem pItem, String pExtIdPropName)
			throws RepositoryException {
		addExternalIdToConstraints(pConstraints, pItem, pExtIdPropName, null);
	}

	/**
	 * Looks up the ATG property name that holds the external property ID using
	 * the external property ID name.
	 * 
	 * @param pItem
	 *            RepositoryItem representing the integration repository item.
	 * @param pExtIdPropName
	 *            String of the remote system's ID property name.
	 * @return String of the remoteId property name in ATG.
	 * @throws RepositoryException
	 */
	String lookupExternalIdMappedName(RepositoryItem pItem,
			String pExtIdPropName) throws RepositoryException {

		// lookup the item descriptor
		IntegrationRepositoryItemDescriptor desc = (IntegrationRepositoryItemDescriptor) getSiebelRepository()
				.getItemDescriptor(
						pItem.getItemDescriptor().getItemDescriptorName());

		// get the mappings by target name
		@SuppressWarnings("unchecked")
		Map<String, PropertyMappingElement> mapByName = (Map<String, PropertyMappingElement>) desc
				.getItemMappingElement().getMappingByName();

		PropertyMappingElement pme = mapByName.get(pExtIdPropName);
		if (pme == null)
			throw new RepositoryException(MessageFormat.format(
					"Mapping for property {0} does not exist.", pExtIdPropName));

		String idPropNameFromExtSystem = pme.getTargetName();

		return idPropNameFromExtSystem;
	}

	/**
	 * Looks up the name of the external ID property on an item descriptor.
	 * 
	 * @param pItem
	 * @return
	 * @throws RepositoryException
	 */
	String lookupExternalIdName(RepositoryItem pItem)
			throws RepositoryException {

		String iiDescName = pItem.getItemDescriptor().getItemDescriptorName();
		IntegrationRepositoryItemDescriptor iiDesc = ((IntegrationRepositoryItemDescriptor) getSiebelRepository()
				.getItemDescriptor(iiDescName));
		String externalIdPropertyName = iiDesc.getExternalIdProperty();

		return externalIdPropertyName;

	}

	/**
	 * Makes the query constraints by looping over the property mappings by
	 * source.
	 * 
	 * @param item
	 *            RepositoryItem to make constraints from.
	 * @return Map(String, String) representing the query constraints.
	 * @throws RepositoryException
	 */
	protected Map<String, String> buildQueryConstraints(RepositoryItem pItem)
			throws RepositoryException {
		Map<String, String> retConstraints = new HashMap<String, String>();

		// lookup the item descriptor
		IntegrationRepositoryItemDescriptor desc = (IntegrationRepositoryItemDescriptor) getSiebelRepository()
				.getItemDescriptor(
						pItem.getItemDescriptor().getItemDescriptorName());

		if (desc == null) {
			throw new RepositoryException(
					"Unable to find item descriptor for item: " + pItem);
		}

		// get the mappings by target name
		@SuppressWarnings("unchecked")
		Map<String, PropertyMappingElement> mapByName = (Map<String, PropertyMappingElement>) desc
				.getItemMappingElement().getMappingByName();

		if (mapByName == null) {
			throw new RepositoryException(
					"Unable to get mapping for descriptor: "
							+ desc.getItemDescriptorName());
		}

		for (String propertyName : mapByName.keySet()) {
			String value = (String) pItem.getPropertyValue(propertyName);
			if (!StringUtils.isBlank(value)) {
				// use the targetName in the constraints map as that is what the
				// remote query class will expect
				PropertyMappingElement pme = mapByName.get(propertyName);
				retConstraints.put(pme.getTargetName(), value);
			}
		}

		return retConstraints;
	}

	/**
	 * Parses the invokeRPC parameter and sets up the return map for the
	 * appropriate command.
	 * 
	 * @param pInput
	 * @return
	 * @throws InvalidInputException
	 */
	protected CommandInputBean parseInputParameter(Object pInput,
			String pOperation) throws InvalidInputException {

		MutableRepositoryItem item = null;
		String remoteId = null;
		String operation = pOperation;

		boolean isLegalOp = false;
		for (String siebelOp : SIEBEL_OPERATIONS) {
			if (pOperation.equals(siebelOp)) {
				isLegalOp = true;
			}
		}

		// holler if the operation is not supported
		if (!isLegalOp) {
			throw new InvalidInputException("Illegal Siebel Operation: "
					+ pOperation);
		}

		if (operation.equals(CMD_UPDATE)) {
			// update: this is a repository item & need ID
			item = (MutableRepositoryItem) pInput;
			remoteId = (String) item.getPropertyValue(PROP_EXTERNAL_ID);
		} else if (operation.equals(CMD_INSERT)) {
			// add: this is a repository item
			item = (MutableRepositoryItem) pInput;

		} else if (operation.equals(CMD_DELETE)) {
			// remove: this is a map
			if (!(pInput instanceof Map)) {
				throw new InvalidInputException(
						"For a remove command, intput must be a Map.  It is a "
								+ pInput.getClass().getName());
			}

			@SuppressWarnings("unchecked")
			Map<String, String> inputMap = ((Map<String, String>) pInput);
			String remoteIdPropName = (inputMap.keySet().iterator()).next();
			remoteId = inputMap.get(remoteIdPropName);
		}

		// catch if an update doesn't have a remote ID
		if (operation.equals(CMD_UPDATE) && StringUtils.isBlank(remoteId)) {
			operation = CMD_INSERT;
		} else if (operation.equals(CMD_DELETE)
				&& StringUtils.isBlank(remoteId)) {
			throw new InvalidInputException(
					"Cannot remove item.  No remoteId property value.");
		}

		CommandInputBean retBean = new CommandInputBean(operation, remoteId,
				item);

		return retBean;
	}

	/**
	 * Checks the RepositoryItem (which is assumed to be a ChangedPropertyBean)
	 * to see if it has at least one mapped data field in it.
	 * 
	 * @param pItem
	 *            RepositoryItem (ChangedPropertyBean) to inspect.
	 * @return true if there are no mapped data changes.
	 */
	protected boolean hasMappedData(RepositoryItem pItem)
			throws RepositoryException {

		/*
		 * Not a ChangedPropertyBean, so git outta heah.
		 */
		if (!(pItem instanceof ChangedPropertyBean)) {
			vlogDebug(
					"Even though updating, not using ChangedPropertyBean? {0}",
					pItem);
			return true;
		}

		// polymorph item into CPB
		ChangedPropertyBean cpBean = (ChangedPropertyBean) pItem;

		// get the names of the changed properties
		@SuppressWarnings("unchecked")
		Set<String> changedPropNames = (Set<String>) cpBean
				.getChangedPropertyNames();

		// get the (ATG) names of the mapped properties
		String descName = cpBean.getItemDescriptor().getItemDescriptorName();
		IntegrationRepositoryItemDescriptor irid = (IntegrationRepositoryItemDescriptor) getSiebelRepository()
				.getItemDescriptor(descName);
		@SuppressWarnings("unchecked")
		Set<String> mappingNames = ((Map<String, PropertyMappingElement>) irid
				.getItemMappingElement().getMappingByTargetName()).keySet();
		boolean returnValue=false;

		// reckon smaller set to loop over
		Set<String> smaller = null;
		Set<String> bigger = null;
		if (mappingNames.size() < changedPropNames.size()) {
			smaller = mappingNames;
			bigger = changedPropNames;
		} else {
			smaller = changedPropNames;
			bigger = mappingNames;
		}

		// check bigger loop for occurrence of name in smaller loop
		// IOW look for a single occurrence of a mapped property
		for (String propName : smaller) {
			if (bigger.contains(propName)) {
				vlogDebug("At least one mapped property changed: {0}", propName);
				returnValue=true;
			}
		}

		// no mapped properties were changed
		return returnValue;
	}

	/**
	 * The generated source from Siebel does not have toString() methods so we
	 * need to brute force this.
	 * 
	 * @param obj
	 * @return
	 * @throws PropertyNotFoundException
	 */
	protected String toStringSiebelObject(Object obj) {
		Class<?> clazz = obj.getClass();
		Field[] fields = clazz.getDeclaredFields();

		StringBuffer sb = new StringBuffer();
		sb.append(clazz.getSimpleName()).append(" [");
		for (int fieldIdx = 0; fieldIdx < fields.length; fieldIdx++) {
			Field field = fields[fieldIdx];
			sb.append(field.getName()).append("=");
			try {
				sb.append(DynamicBeans.getPropertyValueAsString(obj,
						field.getName()));
			} catch (PropertyNotFoundException ex) {
				vlogInfo(
						"Cannot include non-existent property in toString(): {0}",
						ex.getMessage());
			}
			if (fieldIdx < (fields.length - 1))
				sb.append(", ");
		}
		sb.append("]");

		return sb.toString();
	}

	/**
	 * Siebel is picky about how it takes phone numbers at all -- queries,
	 * insert, update. Doesn't matter. They have to be an exact format of (###)
	 * ###-###.
	 * 
	 * @param pPhoneNumber
	 *            String of the phone number to fix.
	 * @return
	 */
	protected String formatPhoneNumberForSiebel(String pPhoneNumber) {

		StringBuilder sb = new StringBuilder();

		// make into a character array
		char[] number = pPhoneNumber.toCharArray();

		// loop over array putting in only digits where appropriate
		// @0 -> "("
		// @3 -> ") "
		// @6 -> "-"
		for (int idx = 0; idx < number.length; idx++) {
			boolean isDone = false;

			// add necessary decorator when needed
			switch (idx) {
			case 0:
				sb.append("(");
				break;
			case 3:
				sb.append(") ");
				break;
			case 6:
				sb.append("-");
				break;
			case 13:
				// the rest can be appended
				isDone = true;
				break;
			}

			// append the rest of the initial decorators are done
			if (isDone) {
				sb.append(pPhoneNumber.substring(idx));
			}

			// append only digits
			if (Character.isDigit(number[idx])) {
				sb.append(number[idx]);
			}
		}

		return sb.toString();
	}
} // end of class
