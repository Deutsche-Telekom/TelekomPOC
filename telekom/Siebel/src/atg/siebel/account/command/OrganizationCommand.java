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

import atg.integrations.CommandInvocationException;
import atg.integrations.CommandResult;
import atg.integrations.CommandTimeoutException;
import atg.integrations.InvalidInputException;
import atg.repository.MutableRepositoryItem;
import atg.repository.RepositoryItem;
import atg.service.resourcepool.ResourcePoolException;
import atg.siebel.integration.SiebelWebServiceConfigurationException;
import com.siebel.selfservice.common.account.SelfServiceAccountExecuteInput;
import com.siebel.selfservice.common.account.SelfServiceAccountExecuteOutput;
import com.siebel.selfservice.common.account.data.AccountData;
import com.siebel.selfservice.common.account.data.BusinessAddressData;
import com.siebel.selfservice.common.account.data.ListOfBusinessAddressData;
import com.siebel.selfservice.common.account.data.ListOfSSAccountData;
import com.siebel.selfservice.common.account.id.AccountId;
import com.siebel.selfservice.common.accountbillingprofile.SelfServiceAccountBillingProfileSetPrimaryInput;
import com.siebel.selfservice.common.accountbillingprofile.SelfServiceAccountBillingProfileSetPrimaryOutput;

import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Map;

/**
 * This command handles queries for Siebel accounts
 */
public class OrganizationCommand extends SiebelCommand {

	// -------------------------------------
	// Class version string
	// -------------------------------------

	public static String CLASS_VERSION = "$Id: //product/Siebel/version/11.2/src/atg/siebel/account/command/OrganizationCommand.java#2 $$Change: 1194813 $";

	// -------------------------------------
	// Properties
	// -------------------------------------

	// --------- Property: RetrieveContacts -----------
	private String mAddressNameSeparator = null;

	/**
	 * @return String of the character (or sequence) to use in separating the id
	 *         and name of the address for uniqueness in Siebel. If this is
	 *         null, this feature is considered to be disabled.
	 */
	public String getAddressNameSeparator() {
		return mAddressNameSeparator;
	}

	/**
	 * @param pAddressNameSeparator
	 *            String of the character (or sequence) to use in separating the
	 *            id and name of the address for uniqueness in Siebel. If this
	 *            is null, this feature is considered to be disabled.
	 */
	public void setAddressNameSeparator(String pAddressNameSeparator) {
		mAddressNameSeparator = pAddressNameSeparator;
	}

	// -------------------------------------
	// Methods
	// -------------------------------------

	/**
	 * This will populate a Siebel AccountData object with information about the
	 * updated organization, and use the SelfServiceAccount webservice to
	 * transfer that data to Siebel
	 * 
	 * @param pInput
	 *            the local organization repository item that has been updated
	 * @return a CommandResult object that contains the Siebel Id of the updated
	 *         account
	 */
	public CommandResult invokeRPC(Object pInput)
			throws CommandInvocationException, CommandTimeoutException,
			InvalidInputException {

		CommandResult commandResult = new CommandResult();

		try {
			/*
			 * For "add" and "update" this will be needed to create a new remote
			 * item or copy property values. pInput will be a repository item.
			 * 
			 * For "remove" pInput will be a map containing the remote id
			 * property name and the value.
			 */
			CommandInputBean parsedInput = parseInputParameter(pInput,
					getOperation());
			MutableRepositoryItem orgItem = parsedInput.getItem();
			String remoteId = parsedInput.getRemoteId();

			// update operation b/c an update w/o an ID will be an insert
			setOperation(parsedInput.getCommand());

			// Populate Siebel AccountData object with updated organization
			// information
			AccountData account = new AccountData();
			account.setOperation(getOperation());

			// If doing an "add" or an "update", populate the contents of the
			// webservice object; otherwise, it is a delete and we only need to
			// populate the ID
			if (getOperation().equals("insert")
					|| getOperation().equals("update")) {
				populateSiebelObject(account, getSiebelRepository(), orgItem,
						getOrganizationItemDescriptorName());
			} else {
				account.setId(remoteId);
			}

			// Populate the address information
			String billingAddressProp = getBillingAddressPropertyName();
			RepositoryItem billingAddress = (RepositoryItem) orgItem
					.getPropertyValue(billingAddressProp);

			String shippingAddressProp = getShippingAddressPropertyName();
			RepositoryItem shippingAddress = (RepositoryItem) orgItem
					.getPropertyValue(shippingAddressProp);

			// this list will have the billing & shipping addresses in them
			@SuppressWarnings("unchecked")
			Map<String, RepositoryItem> secondaryAddresses = (Map<String, RepositoryItem>) orgItem
					.getPropertyValue(getSecondaryAddressesPropertyName());
			ListOfBusinessAddressData lobaData = new ListOfBusinessAddressData();
			List<BusinessAddressData> addresses = lobaData.getBusinessAddress();

			for (RepositoryItem address : secondaryAddresses.values()) {
				/*
				 * To set an address as the primary billing (or shipping)
				 * address the ID of the address needs to be set on the
				 * appropriate field on the account object.
				 * 
				 * This needs to be two separate tests b/c the billing and
				 * shipping could be the same address.
				 */
				if (billingAddress != null
						&& address.getRepositoryId().equals(
								billingAddress.getRepositoryId())) {
					// siebelAddress.setBillAddressFlag(true);
					account.setPrimaryBillToAddressId((String) address
							.getPropertyValue("siebelId"));
				}

				if (shippingAddress != null
						&& address.getRepositoryId().equals(
								shippingAddress.getRepositoryId())) {
					// siebelAddress.setShipAddressFlag(true);
					account.setPrimaryShipToAddressId((String) address
							.getPropertyValue("siebelId"));
				}

				/*
				 * No matter what, include the address in the LoBA. If the
				 * address is a shipping or billing address, and the ID is
				 * specified above, and the address is not included in this
				 * list, then Siebel assumes the address has been removed from
				 * this account.
				 */
				BusinessAddressData siebelAddress = new BusinessAddressData();
				populateSiebelObject(siebelAddress, getSiebelRepository(),
						address, getContactInfoItemDescriptorName());

				addresses.add(siebelAddress);
			} // for

			account.setListOfBusinessAddress(lobaData);

			ListOfSSAccountData listOfAccounts = new ListOfSSAccountData();
			List<AccountData> accounts = listOfAccounts.getAccount();
			accounts.add(account);

			SelfServiceAccountExecuteInput input = new SelfServiceAccountExecuteInput();
			input.setListOfSSAccount(listOfAccounts);
			input.setExecutionMode("BiDirectional");
			input.setLOVLanguageMode("LDC");
			input.setViewMode("All");

			// Instantiate web service connection
			//SelfServiceAccount_Service service = new SelfServiceAccount_Service();
			//SelfServiceAccount port = service.getSelfServiceAccountPort();
			//getWebServiceHelper().prepareConnection((BindingProvider) port);

			// Invocation
			//vlogDebug(
			//		"Calling Siebel with URL: {0}",
			//		((BindingProvider) port)
			//				.getRequestContext()
			//				.get(javax.xml.ws.BindingProvider.ENDPOINT_ADDRESS_PROPERTY));
			//SelfServiceAccountExecuteOutput result = port
			//		.selfServiceAccountExecute(input);

      SelfServiceAccountExecuteOutput result = null;

      try {
        result = (SelfServiceAccountExecuteOutput)getWebServiceController().callWebService(
                "com.siebel.selfservice.common.account.SelfServiceAccount_Service",
                "SelfServiceAccountPort",
                "selfServiceAccountExecute",
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

			AccountId output = result.getListOfSSAccount().getAccount().get(0);
			// Instantiate the webservice port
			//SelfServiceAccountBillingProfile_Service bpService = new SelfServiceAccountBillingProfile_Service();
			//SelfServiceAccountBillingProfile bpPort = bpService
			//		.getSelfServiceAccountBillingProfilePort();
			//getWebServiceHelper().prepareConnection((BindingProvider) bpPort);
			// update primary billing profile for this account
			RepositoryItem defCreditCardItem = (RepositoryItem) orgItem
					.getPropertyValue(getDefaultCreditCardPropertyName());
			
			// IF no default credit card Item on ATG , ignore siebel call to set primary
			if (null != defCreditCardItem) {
				SelfServiceAccountBillingProfileSetPrimaryInput sPI = new SelfServiceAccountBillingProfileSetPrimaryInput();
				sPI.setAccountSpcId((String) orgItem
						.getPropertyValue("siebelId"));
				sPI.setBillingSpcProfileSpcId((String) defCreditCardItem
						.getPropertyValue("siebelId"));
				

        
      //  SelfServiceAccountBillingProfileSetPrimaryOutput sPO = bpPort
      //      .selfServiceAccountBillingProfileSetPrimary(sPI);

        SelfServiceAccountBillingProfileSetPrimaryOutput sPO = null;
        try {
          sPO = (SelfServiceAccountBillingProfileSetPrimaryOutput)getWebServiceController().callWebService(
                  "com.siebel.selfservice.common.accountbillingprofile.SelfServiceAccountBillingProfile_Service",
                  "SelfServiceAccountBillingProfilePort",
                  "selfServiceAccountBillingProfileSetPrimary",
                  sPI,
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
			}
			
			commandResult.setResult(output);
		} catch (Throwable e) {
			throw new CommandInvocationException(e);
		}

		return commandResult;
	}
} // end of class
