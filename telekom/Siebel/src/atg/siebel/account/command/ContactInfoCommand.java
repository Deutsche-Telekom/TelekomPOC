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
import com.siebel.selfservice.common.address.SelfServiceAddressExecuteInput;
import com.siebel.selfservice.common.address.SelfServiceAddressExecuteOutput;
import com.siebel.selfservice.common.address.data.CutAddressData;
import com.siebel.selfservice.common.address.data.ListOfSsAddressIoData;
import com.siebel.selfservice.common.address.id.CutAddressId;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

/**
 * This command creates a new address in the Siebel system using the
 * SelfServiceAddress web service
 */
public class ContactInfoCommand
  extends SiebelCommand {

  // -------------------------------------
  // Class version string
  // -------------------------------------

  public static String CLASS_VERSION =
    "$Id: //product/Siebel/version/11.2/src/atg/siebel/account/command/ContactInfoCommand.java#2 $$Change: 1194813 $";

  /**
   * Construct a SelfServiceAddressExecuteInput object using the local
   * contactInfo repository input and invoke the web service to add the address
   * to the Siebel system.
   * 
   * @param pInput
   *          the local contactInfo repository item created
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
       * For "add" and "update" this will be needed to create a new remote item
       * or copy property values. pInput will be a repository item.
       * 
       * For "remove" pInput will be a map containing the remote id property
       * name and the value.
       */
      CommandInputBean parsedInput =
        parseInputParameter(pInput, getOperation());
      MutableRepositoryItem item = parsedInput.getItem();
      String remoteId = parsedInput.getRemoteId();

      // update operation b/c an update w/o an ID will be an insert
      setOperation(parsedInput.getCommand());

      // if insert, check for existing address
      if (getOperation().equals(CMD_INSERT)
        || getOperation().equals(CMD_UPDATE)) {
        vlogDebug("Checking for existing address for {0}", item);
        
        if (!hasMappedData(item)) {
          vlogDebug("No changed mapped properties on bean: {0}", item);
          return commandResult;
        }

        // commandResult contains a List<CutAddressData>
        CommandResult checkResult = null;
        /*
         * Previously using the external ID (i.e., the Siebel ID) here but the
         * problem is that if the address changed in ATG the Siebel ID will
         * still match... but the address is different.
         * 
         * For simplicity, just going to create a new address in that case.
         * Therefore will lookup without the Siebel ID in order to return no
         * address found (i.e., null). Though it could be possible that the
         * address is changed to an identical existing one, in which case an ID
         * will come back -- which is perfect.
         * 
         * Another approach could be to blank the "siebelId" value when the
         * contactInfo changes.
         */
        // if (getOperation().equals(CMD_INSERT)) {
        // checkResult = checkForExistingAddress(item, false);
        // } else {
        // checkResult = checkForExistingAddress(item, true);
        // }
        checkResult = checkForExistingAddress(item, false);

        // handle an existing address -- then return
        if (checkResult != null) {
          // adding the address returns a CutAddressId, fabricate one
          // assume we only want the first result
          @SuppressWarnings("unchecked")
          List<CutAddressData> tmpAddressData =
            (List<CutAddressData>) checkResult.getResult();
          CutAddressId addressId = new CutAddressId();
          addressId.setId(tmpAddressData.get(0).getId());

          commandResult.setResult(addressId);
          return commandResult;
        } else if (!hasMinimumAddressData(item)) {
          // Address was looked up with fields (not ID)
          // null was returned
          // means either no address (which is okay) or not enough fields

          // this catches not enough data provided (e.g., just the ZIP).
          return commandResult;
        }
        
      }
      
      // Instantiate the object that will hold the address data for the
      // webservice call
      CutAddressData address = new CutAddressData();
      address.setOperation(getOperation());

      // If doing an "add" or an "update", populate the contents of the
      // webservice object. Otherwise, it is a delete and we only need to
      // populate the ID
      if (getOperation().equals(CMD_INSERT)
        || getOperation().equals(CMD_UPDATE)) {
        populateSiebelObject(address, getSiebelRepository(), item,
          "contactInfo");
      } else {
        address.setId(remoteId);
      }

      commandResult = makeSiebelCall(address);
    } catch (Throwable e) {
      throw new CommandInvocationException(e);
    }

    return commandResult;
  }

  /**
   * Makes the call to Siebel and returns the resulting data. This assumes the
   * CutAddressData object is all setup. For unit testing, no other access to
   * ATG would be required.
   * 
   * @param pAddress
   * @return
   */
  protected CommandResult makeSiebelCall(CutAddressData pAddress) {
    CommandResult commandResult = new CommandResult();

    // Instantiate the webservice port
    //SelfServiceAddress_Service service = new SelfServiceAddress_Service();
    //SelfServiceAddress port = service.getSelfServiceAddressPort();
    //getWebServiceHelper().prepareConnection((BindingProvider) port);

    // The web service takes a list of addresses, so we need to create a list
    // and add the one address to it
    ListOfSsAddressIoData listOfAddresses = new ListOfSsAddressIoData();
    List<CutAddressData> addresses = listOfAddresses.getCutAddress();
    addresses.add(pAddress);

    // Fill out the rest of the input properties of the webservice
    SelfServiceAddressExecuteInput input = new SelfServiceAddressExecuteInput();
    input.setListOfSsAddressIo(listOfAddresses);
    input.setExecutionMode("BiDirectional");
    input.setLOVLanguageMode("LDC");
    input.setViewMode("All");

    // Invoke the webservice
    //vlogDebug("Calling Siebel with URL: {0}", ((BindingProvider) port)
    //  .getRequestContext().get(
    //    javax.xml.ws.BindingProvider.ENDPOINT_ADDRESS_PROPERTY));

    
    //SelfServiceAddressExecuteOutput result =
    //    port.selfServiceAddressExecute(input);

    SelfServiceAddressExecuteOutput result = null;
    try {
      result = (SelfServiceAddressExecuteOutput)getWebServiceController().callWebService(
              "com.siebel.selfservice.common.address.SelfServiceAddress_Service",
              "SelfServiceAddressPort",
              "selfServiceAddressExecute",
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
    CutAddressId output = result.getListOfSsAddressIo().getCutAddress().get(0);
    commandResult.setResult(output);
    return commandResult;
  }

} // end of class
