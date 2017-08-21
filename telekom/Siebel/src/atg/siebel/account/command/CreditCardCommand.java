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
import atg.service.resourcepool.ResourcePoolException;
import atg.siebel.integration.SiebelWebServiceConfigurationException;
import com.siebel.selfservice.common.accountbillingprofile.SelfServiceAccountBillingProfileExecuteInput;
import com.siebel.selfservice.common.accountbillingprofile.SelfServiceAccountBillingProfileExecuteOutput;
import com.siebel.selfservice.common.accountbillingprofile.data.ComInvoiceProfileData;
import com.siebel.selfservice.common.accountbillingprofile.data.ListOfSsAccountbillingprofileIoData;
import com.siebel.selfservice.common.accountbillingprofile.id.ComInvoiceProfileId;
import com.siebel.selfservice.common.accountbillingprofile.query.ComInvoiceProfileQuery;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

/**
 * This command creates a new address in the Siebel system using the
 * SelfServiceAddress web service
 */
public class CreditCardCommand extends SiebelCommand {

	// -------------------------------------
	// Class version string
	// -------------------------------------

	public static String CLASS_VERSION = "$Id: //product/Siebel/version/11.2/src/atg/siebel/account/command/CreditCardCommand.java#2 $$Change: 1194813 $";

	/**
	 * Construct a SelfServiceAddressExecuteInput object using the local
	 * contactInfo repository input and invoke the web service to add the
	 * address to the Siebel system.
	 * 
	 * @param pInput
	 *            the local contactInfo repository item created
	 * @return a CommandResult containing the Siebel Id of the newly-created
	 *         address.
	 */
	public CommandResult invokeRPC(Object pInput)
			throws CommandInvocationException, CommandTimeoutException,
			InvalidInputException {
		vlogDebug("invokeRPC with Object: {0}", pInput);

		// Instantiate the command result outside the try block so it can be
		// returned outside the try block
		CommandResult commandResult = new CommandResult();

		// Any number of exceptions can occur during this process, so we have a
		// catch-all try block
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
			MutableRepositoryItem item = parsedInput.getItem();
			String remoteId = parsedInput.getRemoteId();

			// update operation b/c an update w/o an ID will be an insert
			setOperation(parsedInput.getCommand());

			// if insert, check for existing address
			if (getOperation().equals(CMD_UPDATE)) {
				vlogDebug("Checking for existing credit card for {0}", item);

				if (!hasMappedData(item)) {
					vlogDebug("No changed mapped properties on bean: {0}", item);
					return commandResult;
				}
			}

			// Instantiate the object that will hold the address data for the
			// webservice call
			ComInvoiceProfileData billingprofile = new ComInvoiceProfileData();
			billingprofile.setOperation(getOperation());

			// If doing an "add" or an "update", populate the contents of the
			// webservice object. Otherwise, it is a delete and we only need to
			// populate the ID
			if (getOperation().equals(CMD_UPDATE)) {
				populateSiebelObject(billingprofile, getSiebelRepository(),
						item, "credit-card");
			} else {
				billingprofile.setId(remoteId);
			}

			commandResult = makeSiebelCall(billingprofile);
		} catch (Throwable e) {
			throw new CommandInvocationException(e);
		}

		return commandResult;
	}

	/**
	 * Makes the call to Siebel and returns the resulting data. This assumes the
	 * ComInvoiceProfile object is all setup. THIS HANDLES UPDATE & SET PRIMARY
	 * ONLY Billingprofiles CANNOT BE CREATED from ATG
	 * 
	 * @param pAddress
	 * @return
	 */
	protected CommandResult makeSiebelCall(ComInvoiceProfileData pBP) {
		CommandResult commandResult = new CommandResult();

		// Instantiate the webservice port
		//SelfServiceAccountBillingProfile_Service service = new SelfServiceAccountBillingProfile_Service();
		//SelfServiceAccountBillingProfile port = service
		//		.getSelfServiceAccountBillingProfilePort();
		//getWebServiceHelper().prepareConnection((BindingProvider) port);

		ListOfSsAccountbillingprofileIoData listOfBP = new ListOfSsAccountbillingprofileIoData();
		ComInvoiceProfileQuery comQuery = new ComInvoiceProfileQuery();
		List<ComInvoiceProfileData> bprofiles = listOfBP.getComInvoiceProfile();
		bprofiles.add(pBP);

		// Fill out the rest of the input properties of the webservice
		SelfServiceAccountBillingProfileExecuteInput input = new SelfServiceAccountBillingProfileExecuteInput();
		input.setListOfSsAccountbillingprofileIo(listOfBP);
		input.setExecutionMode("BiDirectional");
		input.setLOVLanguageMode("LDC");
		input.setViewMode("All");


    //SelfServiceAccountBillingProfileExecuteOutput result = port
    //    .selfServiceAccountBillingProfileExecute(input);

    SelfServiceAccountBillingProfileExecuteOutput result = null;

    try {
      result = (SelfServiceAccountBillingProfileExecuteOutput)getWebServiceController().callWebService(
              "com.siebel.selfservice.common.accountbillingprofile.SelfServiceAccountBillingProfile_Service",
              "SelfServiceAccountBillingProfilePort",
              "selfServiceAccountBillingProfileExecute",
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
		
		// Get the Siebel Id from the webservices result and put it into the
		// command result

		ComInvoiceProfileId output = result
				.getListOfSsAccountbillingprofileIo().getComInvoiceProfile()
				.get(0);
		commandResult.setResult(output);

		return commandResult;
	}

} // end of class
