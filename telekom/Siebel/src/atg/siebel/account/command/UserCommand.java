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

import atg.adapter.integrations.ChangedPropertyBean;
import atg.adapter.integrations.IntegrationRepository;
import atg.adapter.integrations.IntegrationRepositoryItemDescriptor;
import atg.beans.DynamicBeans;
import atg.beans.DynamicPropertyDescriptor;
import atg.beans.PropertyNotFoundException;
import atg.core.util.StringUtils;
import atg.integrations.CommandInvocationException;
import atg.integrations.CommandResult;
import atg.integrations.CommandTimeoutException;
import atg.integrations.InvalidInputException;
import atg.repository.*;
import atg.repository.databinding.PropertyMappingElement;
import atg.service.resourcepool.ResourcePoolException;
import atg.siebel.account.SiebelAccountConstants;
import atg.siebel.integration.SiebelWebServiceConfigurationException;
import com.siebel.selfservice.common.account.SelfServiceAccountExecuteInput;
import com.siebel.selfservice.common.account.SelfServiceAccountExecuteOutput;
import com.siebel.selfservice.common.account.data.AccountData;
import com.siebel.selfservice.common.account.data.ListOfContactData;
import com.siebel.selfservice.common.account.data.ListOfSSAccountData;
import com.siebel.selfservice.common.account.id.AccountId;
import com.siebel.selfservice.common.address.data.CutAddressData;
import com.siebel.selfservice.common.contact.SelfServiceContactExecuteInput;
import com.siebel.selfservice.common.contact.SelfServiceContactExecuteOutput;
import com.siebel.selfservice.common.contact.data.ContactData;
import com.siebel.selfservice.common.contact.data.ListOfPersonalAddressData;
import com.siebel.selfservice.common.contact.data.ListOfSSContactData;
import com.siebel.selfservice.common.contact.data.PersonalAddressData;
import com.siebel.selfservice.common.contact.id.ContactId;
import com.siebel.selfservice.common.contact.query.QueryType;

import java.lang.reflect.InvocationTargetException;
import java.text.MessageFormat;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * This command handles updates to ATG user information, which is transferred to
 * Siebel as updates to contact information.
 */
public class UserCommand
  extends SiebelCommand
  implements SiebelAccountConstants {

  // -------------------------------------
  // Class version string
  // -------------------------------------

  public static String CLASS_VERSION =
    "$Id: //product/Siebel/version/11.2/src/atg/siebel/account/command/UserCommand.java#2 $$Change: 1194813 $";

  /**
   * Based on whether this is an "insert" or "update" operation, this method
   * will either invoke adding a user to an account (insert) or updating an
   * existing ContactData item (update). This will cause the appropriate
   * SelfServiceAccount or SelfServiceContact service to be called.
   * 
   * @param pInput
   *          the local user repository item that has been added or updated
   * @return CommandResult object that contains the Siebel Id of the updated
   *         contact
   * @throws InvalidInputException
   *           If the user item does not have a value set for the
   *           siebelAccountId.
   */
  public CommandResult invokeRPC(Object pInput)
    throws CommandInvocationException, CommandTimeoutException,
    InvalidInputException {

    CommandResult commandResult = new CommandResult();

    try {
      CommandInputBean parsedInput =
        parseInputParameter(pInput, getOperation());
      MutableRepositoryItem user = parsedInput.getItem();

      // update operation b/c an update w/o an ID will be an insert
      setOperation(parsedInput.getCommand());

      // User object must have the siebelAccountId property set, even for
      // insert, to properly associate them with an account.
      if (user.getPropertyValue(PROP_SIEBEL_ACCOUNT_ID) == null) {
        throw new InvalidInputException(
          "User must have a siebel account ID (siebelAccountId) set.");
      }

      if (getOperation().equals(CMD_INSERT)) {
        /*
         * INSERT: user must be added via the Siebel account so they are linked
         * to the account.
         */
        vlogDebug(".. operation is INSERT");
        commandResult = syncUserToSiebelAccount(user);
      } else if (getOperation().equals(CMD_UPDATE)) {
        /*
         * UPDATE: user/contact needs to be updated directly.
         */
        vlogDebug(".. operation is UPDATE");

        if (!hasMappedData(user)) {
          return commandResult;
        }

        commandResult = syncUserToSiebel(user);
      }

    } catch (InvalidInputException iiEx) {
      // want to make sure these are thrown as is.
      throw iiEx;
    } catch (RepositoryException rEx) {
      // not right now, but might want to handle differently
      // here as a reminder.
      throw new CommandInvocationException(rEx);
    } catch (CommandInvocationException ciEx) {
      // not right now, but might want to handle differently
      // here as a reminder.
      throw new CommandInvocationException(ciEx);
    } catch (Throwable e) {
      throw new CommandInvocationException("Unplanned exception.", e);
    }

    return commandResult;
  }

  /**
   * Looks up the configured external ID property name and retrieves the value
   * from the RepositoryItem supplied.
   * 
   * @param pItem
   *          RepositoryItem from which the external ID value will be retrieved.
   * @return String of the external ID value.
   * @throws RepositoryException
   */
  protected String getExternalIdValue(RepositoryItem pItem)
    throws RepositoryException {

    // get integration repository for item descriptor def'n
    IntegrationRepository repo = (IntegrationRepository) getSiebelRepository();

    // get the item's item descriptor name
    String name = pItem.getItemDescriptor().getItemDescriptorName();

    // get external ID property from Integration Repo Item Desc
    String extIdPropName =
      ((IntegrationRepositoryItemDescriptor) repo.getItemDescriptor(name))
        .getExternalIdProperty();

    // get value
    String id = (String) pItem.getPropertyValue(extIdPropName);

    return id;
  }

  /**
   * Adds the user to the Siebel Account and returns the (Siebel) ID of the
   * contact (user) created.
   * 
   * @param pUserItem
   *          RepositoryItem representing the ATG user to create.
   * @return CommandResult containing the ContactId data.
   * @throws RepositoryException
   *           If there is an error populating the siebel object with the user
   *           data.
   * @throws CommandInvocationException
   *           If the return results from Siebel contains null IDs.
   */
  protected CommandResult syncUserToSiebelAccount(RepositoryItem pUserItem)
    throws RepositoryException, CommandInvocationException {
    vlogDebug("Adding user to Siebel Account, user: {0}", pUserItem);
    CommandResult commandResult = new CommandResult();

    // setup account port
    //SelfServiceAccount_Service service = new SelfServiceAccount_Service();
    //SelfServiceAccount port = service.getSelfServiceAccountPort();
    //getWebServiceHelper().prepareConnection((BindingProvider) port);

    // setup account data from user
    AccountData account = new AccountData();
    account.setId((String) pUserItem.getPropertyValue(PROP_SIEBEL_ACCOUNT_ID));
    account.setOperation(OP_SKIPNODE);

    // setup list of contact on account using user
    // Note carefully -- there is a difference between CONTACT contact data and
    // ACCOUNT contact data. So, fully qualified class names.
    ListOfContactData listOfContactData = new ListOfContactData();
    List<com.siebel.selfservice.common.account.data.ContactData> contacts =
      listOfContactData.getContact();
    com.siebel.selfservice.common.account.data.ContactData accountContact =
      new com.siebel.selfservice.common.account.data.ContactData();
    populateSiebelObject(accountContact, getSiebelRepository(), pUserItem,
      getUserItemDescriptorName());
    accountContact.setOperation(getOperation());
    contacts.add(accountContact);
    account.setListOfContact(listOfContactData);

    // setup to make the Siebel call
    ListOfSSAccountData listOfSSAccount = new ListOfSSAccountData();
    List<AccountData> accounts = listOfSSAccount.getAccount();
    accounts.add(account);
    SelfServiceAccountExecuteInput input = new SelfServiceAccountExecuteInput();
    input.setListOfSSAccount(listOfSSAccount);
    input.setExecutionMode("BiDirectional");
    input.setLOVLanguageMode("LDC");
    input.setViewMode("All");

    // make siebel call
    //vlogDebug("Calling Siebel with URL: {0}", ((BindingProvider) port)
    //  .getRequestContext().get(
    //    javax.xml.ws.BindingProvider.ENDPOINT_ADDRESS_PROPERTY));


    SelfServiceAccountExecuteOutput result = null;
    //    port.selfServiceAccountExecute(input);

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

    // verify the account data was returned
    AccountId aiData = result.getListOfSSAccount().getAccount().get(0);
    if (aiData == null) {
      throw new CommandInvocationException(MessageFormat.format(
        "Account update to add user did not return ID: {0}", aiData));
    }

    // verify the contact data was returned
    com.siebel.selfservice.common.account.id.ContactId ciData =
      aiData.getListOfContact().getContact().get(0);
    if (ciData == null) {
      throw new CommandInvocationException(MessageFormat.format(
        "Contact ID returned was null: {0}", aiData.getListOfContact()
          .getContact().get(0)));
    }

    // return the contact data
    commandResult.setResult(ciData);
    return commandResult;
  }

  /**
   * Checks the item for any changed addresses and returns a set of the property
   * names.
   * 
   * @param pItem
   *          RepositoryItem to check.
   * @return Set (String) of the property names.
   * @throws RepositoryException
   */
  Set<String> getChangedAddressNames(RepositoryItem pItem)
    throws RepositoryException {
    Set<String> ret = new HashSet<String>();

    if (pItem instanceof ChangedPropertyBean) {
      ChangedPropertyBean cpb = (ChangedPropertyBean) pItem;
      @SuppressWarnings("unchecked")
      Set<String> changedPropNames =
        (Set<String>) cpb.getChangedPropertyNames();
      for (String name : changedPropNames) {
        DynamicPropertyDescriptor dynamicPropDesc =
          pItem.getItemDescriptor().getPropertyDescriptor(name);
        RepositoryItemDescriptor rid =
          ((RepositoryPropertyDescriptor) dynamicPropDesc)
            .getPropertyItemDescriptor();
        if (rid == null)
          continue;
        if (rid.getItemDescriptorName().equals(
          getContactInfoItemDescriptorName()))
          ret.add(rid.getItemDescriptorName());
      }
    }

    return ret;
  }

  /**
   * Adds or updates the user based on the operation setting.
   * 
   * @param pUserItem
   *          RepositoryItem representing the user.
   * @return CommandResult of the response from Siebel (which contains the ID of
   *         the added or updated user).
   * @throws RepositoryException
   *           If there is an error populating the user information onto the
   *           Siebel object.
   * @throws CommandInvocationException
   *           If there is a null ID returned from Siebel.
   */
  protected CommandResult syncUserToSiebel(RepositoryItem pUserItem)
    throws RepositoryException, CommandInvocationException {
    vlogDebug("synUserToSiebel with user: {0}", pUserItem);
    CommandResult commandResult = new CommandResult();

    /*
     * UNUSED maybe want to sync more than just home address? Right now the home
     * address is assumed to be the primary address in Siebel. If more than just
     * that should be sync'd, would need to write this to add additional
     * addresses in the ListOfContactPersonalAddressData Siebel (WSDL) property.
     */
    // Set<String> changedAddressValues = getChangedAddressNames(pUserItem);

    // setup contact port
    //SelfServiceContact_Service service = new SelfServiceContact_Service();
    //SelfServiceContact port = service.getSelfServiceContactPort();
    //getWebServiceHelper().prepareConnection((BindingProvider) port);

    // Populate Siebel ContactData object with updated user information
    ContactData contact = new ContactData();
    contact.setOperation(getOperation());
    populateSiebelObject(contact, getSiebelRepository(), pUserItem,
      getUserItemDescriptorName());

    // Get home address
    RepositoryItem homeAddress =
      (RepositoryItem) pUserItem
        .getPropertyValue(getUserPrimaryAddressPropertyName());

    // Create/update if it exists
    if (homeAddress != null) {

      // check for address siebelId
      String siebelId = getExternalIdValue(homeAddress);

      // retrieve address, set flag if ID can be used
      CommandResult existingAddressResult = null;
      if (StringUtils.isBlank(siebelId)) {
        existingAddressResult = checkForExistingAddress(homeAddress, false);
      } else {
        existingAddressResult = checkForExistingAddress(homeAddress, true);
      }

      // Insert by ID, or create/update the address?
      ListOfPersonalAddressData lopaData = new ListOfPersonalAddressData();
      List<PersonalAddressData> personalAddressList =
        lopaData.getPersonalAddress();
      PersonalAddressData personalAddress = new PersonalAddressData();

      if (existingAddressResult == null
        || (homeAddress instanceof ChangedPropertyBean)) {
        if (existingAddressResult == null && isLoggingDebug())
          logDebug("Existing address result is null");
        if (homeAddress instanceof ChangedPropertyBean)
          vlogDebug("Home address is a changed property bean with props: {0}",
            ((ChangedPropertyBean) homeAddress).getChangedPropertyNames());

        /*
         * If, for some reason, the address does not exist try creating it this
         * way. This code should not get hit -- it's more of a safety net.
         * 
         * NOTE that this is populating the object using the "siebel repository"
         * and the personalAddress. If the "contact data repository" and the
         * "contact" are used, the "primary***" fields on the ContactData are
         * populated and that does not work out right.
         */
        populateSiebelObject(personalAddress, getSiebelRepository(),
          homeAddress, getContactInfoItemDescriptorName());
        personalAddress.setOperation(CMD_INSERT);
        vlogDebug("Populated personalAddress as: {0}",
          toStringSiebelObject(personalAddress));
      } else {
        if (isLoggingDebug())
          logDebug("Adding address to user as new address.");

        // Address exists, and is new to this contact

        // get the (Siebel) address ID -- from the first address
        @SuppressWarnings("unchecked")
        List<CutAddressData> tmpData =
          (List<CutAddressData>) existingAddressResult.getResult();
        String addressId = tmpData.get(0).getId();

        // associate address by setting ONLY the ID on personal address
        personalAddress.setId(addressId);

        // {A} (see below) Set the operation to 'update' no matter what
        personalAddress.setOperation(CMD_UPDATE);
      }

      personalAddressList.add(personalAddress);
      contact.setListOfPersonalAddress(lopaData);

    }

    // Setup the list of contacts and set the contact on it
    ListOfSSContactData listOfContacts = new ListOfSSContactData();
    List<ContactData> contacts = listOfContacts.getContact();
    contacts.add(contact);

    // set the Siebel call
    SelfServiceContactExecuteInput input = new SelfServiceContactExecuteInput();
    input.setListOfSSContact(listOfContacts);
    input.setExecutionMode("BiDirectional");
    input.setLOVLanguageMode("LDC");
    input.setViewMode("All");

    /*
     * {A} (see above) This will make the Siebel call with the address set to
     * "update". If this can be determined to fail because of that, the address
     * will be set to 'insert' on the assumption that the address is new to this
     * user in Siebel. If that still fails, the error will be reported.
     * 
     * Note that this means in the case of a necessary insert or a meaningful
     * error, Siebel will be called twice. However, in all cases of an update to
     * the user (and address), this will only be called once. While this is not
     * perfect, the overhead is more desirable than querying Siebel every time
     * to determine if this address is set on the user. That is an option you
     * may choose to pursue if you find your SOAP calls to Siebel are acceptably
     * fast.
     */

    // make siebel call
    SelfServiceContactExecuteOutput result = null;
    try {
      


      //result = port.selfServiceContactExecute(input);

        result = (SelfServiceContactExecuteOutput)getWebServiceController().callWebService(
                "com.siebel.selfservice.common.contact.SelfServiceContact_Service",
                "SelfServiceContactPort",
                "selfServiceContactExecute",
                input,
                this,
                getWebServiceHelper());

      
      
    } catch (Throwable ex) {
      
      vlogDebug(
        "Exception occurred updating the user. Trying insert for address.  Mesg: {0}",
        ex.getMessage());

      // get the information from the contact
      ListOfPersonalAddressData lopaData = contact.getListOfPersonalAddress();
      List<PersonalAddressData> personalAddressList =
        lopaData.getPersonalAddress();

      // there is only one address for now... obviously more intelligent logic
      // would be needed otherwise
      PersonalAddressData personalAddress = personalAddressList.get(0);

      // alter the operation
      personalAddress.setOperation(CMD_INSERT);

      // overwrite the list item
      personalAddressList.set(0, personalAddress);

      // reissue the call -- all values are by reference, so this should work
      try {

        result = (SelfServiceContactExecuteOutput)getWebServiceController().callWebService(
                "com.siebel.selfservice.common.contact.SelfServiceContact_Service",
                "SelfServiceContactPort",
                "selfServiceContactExecute",
                input,
                this,
                getWebServiceHelper());

        //result = port.selfServiceContactExecute(input);
      } catch (Throwable t) {
        throw new CommandInvocationException(
          "User update failed with address set to update or insert.", t);
      }
    }

    // make sure the results list has a contact ID to return
    ContactId ciData = result.getListOfSSContact().getContact().get(0);
    if (ciData == null) {
      throw new CommandInvocationException(MessageFormat.format(
        "Contact ID returned was null: {0}", result.getListOfSSContact()));
    }

    // set the result & return
    commandResult.setResult(ciData);
    return commandResult;
  }

  /**
   * Populates the given query object based on the mapping in the given
   * integration repository & item descriptor. When iterating through the
   * properties in the mapping, if the property exists in the given query
   * constraints, a constraint is added to the query. If not, an empty QueryType
   * object is added to the query so that Siebel will return the value for that
   * property as part of the results.
   * 
   * @param pQuery
   *          Object of the query to build.
   * @param pRepository
   *          IntgrationRepository where the item descriptor can be looked up.
   * @param pItemDescriptorName
   *          String of the item descriptor name to lookup.
   * @param pQueryConstraints
   *          Map (String, String) of the query constraints.
   * @throws RepositoryException
   */
  protected void buildQuery(Object pQuery, IntegrationRepository pRepository,
    String pItemDescriptorName, Map<String, String> pQueryConstraints)
    throws RepositoryException {

    // lookup the item descriptor
    IntegrationRepositoryItemDescriptor desc =
      (IntegrationRepositoryItemDescriptor) pRepository
        .getItemDescriptor(pItemDescriptorName);

    // get the mappings by target name
    @SuppressWarnings("unchecked")
    Map<String, PropertyMappingElement> targetMappings =
      (Map<String, PropertyMappingElement>) desc.getItemMappingElement()
        .getMappingByTargetName();

    // set the query properties based on the mapping
    setQueryProperties(pQuery, pQueryConstraints, targetMappings);
  }

  /**
   * Sets the properties on the query based on the source and target mappings.
   * 
   * @param pQuery
   *          Object of the query to build.
   * @param pQueryConstraints
   *          Map (String, String) of the query constraints.
   * @param pTargetMappings
   *          Map (String, String) of the source/target mappings between ATG and
   *          the remote system.
   */
  protected void setQueryProperties(Object pQuery,
    Map<String, String> pQueryConstraints,
    Map<String, PropertyMappingElement> pTargetMappings) {
    for (String propertyName : pTargetMappings.keySet()) {
      QueryType query = new QueryType();
      if (pQueryConstraints != null
        && pQueryConstraints.get(propertyName) != null) {
        String queryFormat = "='" + pQueryConstraints.get(propertyName) + "'";
        query.setValue(queryFormat);
      }
      try {
        DynamicBeans.setPropertyValue(pQuery, propertyName, query);
      } catch (PropertyNotFoundException pnfe) {
        // Mapping is based on ContactData class.
        // ContactQuery doesn't have all the fields, and that's OK
      }
    }

    // Set the ID property, if it exists
    if (pQueryConstraints != null && pQueryConstraints.containsKey("id")) {
      try {
        QueryType query = new QueryType();
        String queryFormat = "='" + pQueryConstraints.get("id") + "'";
        query.setValue(queryFormat);
        DynamicBeans.setPropertyValue(pQuery, "id", query);
      } catch (PropertyNotFoundException pnfe) {
      }
    }
  }
} // end of class
