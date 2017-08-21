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

// ATG classes

import atg.adapter.integrations.IntegrationRepository;
import atg.adapter.integrations.IntegrationRepositoryItemDescriptor;
import atg.beans.DynamicBeans;
import atg.beans.PropertyNotFoundException;
import atg.integrations.CommandInvocationException;
import atg.integrations.CommandResult;
import atg.integrations.CommandTimeoutException;
import atg.integrations.InvalidInputException;
import atg.repository.RepositoryException;
import atg.repository.RepositoryItem;
import atg.repository.databinding.PropertyMappingElement;
import atg.service.resourcepool.ResourcePoolException;
import atg.siebel.integration.SiebelWebServiceConfigurationException;
import atg.siebel.integration.ThreadLocalPropertyChanges;
import com.siebel.selfservice.common.contact.SelfServiceContactQueryPageInput;
import com.siebel.selfservice.common.contact.SelfServiceContactQueryPageOutput;
import com.siebel.selfservice.common.contact.data.ContactData;
import com.siebel.selfservice.common.contact.data.ListOfPersonalAddressData;
import com.siebel.selfservice.common.contact.data.ListOfSSContactData;
import com.siebel.selfservice.common.contact.data.PersonalAddressData;
import com.siebel.selfservice.common.contact.query.*;

import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Map;

/**
 * This command handles queries for Siebel contacts. It also acts as the action
 * class for "get" operations.
 */
public class UserQuery
  extends SiebelCommand {

  // -------------------------------------
  // Class version string
  // -------------------------------------

  public static String CLASS_VERSION =
    "$Id: //product/Siebel/version/11.2/src/atg/siebel/account/command/UserQuery.java#2 $$Change: 1194813 $";

  /**
   * Constructs a query using the constraints contained in the input object. The
   * query is run by invoking the SelfServiceContact web service. The matching
   * contacts are returned
   * 
   * @param pInput
   *          a map of properties to query on to the values to constrain on
   * @return the list of matching Siebel contacts
   */
  public CommandResult invokeRPC(Object pInput)
    throws CommandInvocationException, CommandTimeoutException,
    InvalidInputException {
    vlogDebug("QueryContact:invokeRPC(), input: {0}", pInput);

    CommandResult commandResult = new CommandResult();
    @SuppressWarnings("unchecked")
    Map<String, String> queryConstraints = (Map<String, String>) pInput;
    IntegrationRepository repository = getSiebelRepository();

    try {
      // Set up the query to request all properties contained in the repository
      // mapping
      ContactQuery contactQuery = new ContactQuery();
      buildQuery(contactQuery, repository, getUserItemDescriptorName(),
        queryConstraints);

      // setup and make the Siebel call
      commandResult = makeSiebelCall(contactQuery);

    } catch (Throwable e) {
      vlogError("EXCEPTION: {0}", e.getMessage());
      throw new CommandInvocationException(e);
    }

    vlogDebug("QueryContact:invokeRPC(), result: {0}", commandResult
      .getResult());
    return commandResult;
  }

  /**
   * Wraps the call to Siebel which (1) sets up the service item to use, (2)
   * creates the list of self-service contact query items, (3) sets other
   * features of the SOAP call, (4) makes the call, and (5) removes the return
   * data from the call result.
   * 
   * @param pContactQuery
   *          ContactQuery representing the Siebel query information for a
   *          contact
   * @return CommandResult containing the list of contacts that were returned
   *         from the query.
   * @throws RepositoryException
   */
  protected CommandResult makeSiebelCall(ContactQuery pContactQuery)
    throws RepositoryException {

    //SelfServiceContact_Service service = new SelfServiceContact_Service();
    //SelfServiceContact port = service.getSelfServiceContactPort();
    //getWebServiceHelper().prepareConnection((BindingProvider) port);

    // Add getting the user's address
    ListOfPersonalAddressQuery personalAddrQuery =
      createPersonalAddressQuery(mSiebelRepository);
    pContactQuery.setListOfPersonalAddress(personalAddrQuery);

    // Put together the rest of the query
    ListOfSSContactQuery listOfQuery = new ListOfSSContactQuery();
    listOfQuery.setContact(pContactQuery);
    SelfServiceContactQueryPageInput input =
      new SelfServiceContactQueryPageInput();
    input.setListOfSSContact(listOfQuery);
    input.setExecutionMode("ForwardOnly");
    input.setLOVLanguageMode("LDC");
    input.setViewMode("All");

    // Invocation
    //vlogDebug("Calling Siebel with URL: {0}", ((BindingProvider) port)
    //  .getRequestContext().get(
    //    javax.xml.ws.BindingProvider.ENDPOINT_ADDRESS_PROPERTY));

    SelfServiceContactQueryPageOutput result = null;
    //    port.selfServiceContactQueryPage(input);

    try {
      result = (SelfServiceContactQueryPageOutput)getWebServiceController().callWebService(
              "com.siebel.selfservice.common.contact.SelfServiceContact_Service",
              "SelfServiceContactPort",
              "selfServiceContactQueryPage",
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

    ListOfSSContactData listOfContacts = result.getListOfSSContact();
    List<ContactData> contacts = listOfContacts.getContact();

    // make user personal addresses
    for (ContactData contact : contacts) {
      createUserAddresses(contact, getSiebelRepository(),
        getContactInfoItemDescriptorName());
    }

    CommandResult commandResult = new CommandResult();
    commandResult.setResult(contacts);
    return commandResult;
  }

  /**
   * Creates a user home address. This is put in the thread local because the
   * user won't be created until after this command finishes executing. The
   * integration repository client (e.g., login event handler, etc.) is
   * responsible for setting the value on the user.
   * 
   * @param pContact
   *          ContactData holding the users home address.
   * @param pRepository
   *          IntegrationRepository in which the address should be created.
   * @param pContactInfoItemDescriptorName
   *          Item Descriptor name for the address (i.e., contact info) to
   *          create.
   * @throws RepositoryException
   */
  public void createUserAddresses(ContactData pContact,
    IntegrationRepository pRepository, String pContactInfoItemDescriptorName)
    throws RepositoryException {

    ListOfPersonalAddressData lopaData = pContact.getListOfPersonalAddress();
    List<PersonalAddressData> personalAddresses = lopaData.getPersonalAddress();
    IntegrationRepositoryItemDescriptor contactInfoDesc =
      (IntegrationRepositoryItemDescriptor) pRepository
        .getItemDescriptor(pContactInfoItemDescriptorName);

    if (personalAddresses.size() > 1)
      vlogDebug("Personal addresses bigger than 1: {0}", personalAddresses
        .size());

    RepositoryItem homeAddressItem =
      contactInfoDesc.getIntegrationRepositoryTools().createRepositoryItem(
        personalAddresses, contactInfoDesc, null, this);

    ThreadLocalPropertyChanges.put("homeAddress", homeAddressItem);
  }

  /**
   * @param pRepository
   * @return
   * @throws RepositoryException
   */
  public ListOfPersonalAddressQuery createPersonalAddressQuery(
    IntegrationRepository pRepository) throws RepositoryException {
    PersonalAddressQuery personalAddrQuery = new PersonalAddressQuery();
    buildQuery(personalAddrQuery, pRepository,
      getContactInfoItemDescriptorName(), null);
    personalAddrQuery.setAddressName(new QueryType());

    ListOfPersonalAddressQuery retQuery = new ListOfPersonalAddressQuery();
    retQuery.setPersonalAddress(personalAddrQuery);
    return retQuery;
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
