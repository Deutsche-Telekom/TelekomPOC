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

import atg.adapter.integrations.IntegrationRepository;
import atg.adapter.integrations.IntegrationRepositoryItemDescriptor;
import atg.beans.DynamicBeans;
import atg.beans.PropertyNotFoundException;
import atg.core.util.StringUtils;
import atg.integrations.CommandInvocationException;
import atg.integrations.CommandResult;
import atg.integrations.CommandTimeoutException;
import atg.integrations.InvalidInputException;
import atg.repository.RepositoryException;
import atg.repository.databinding.PropertyMappingElement;
import atg.service.resourcepool.ResourcePoolException;
import atg.siebel.account.SiebelAccountConstants;
import atg.siebel.integration.SiebelWebServiceConfigurationException;
import com.siebel.selfservice.common.address.SelfServiceAddressQueryPageInput;
import com.siebel.selfservice.common.address.SelfServiceAddressQueryPageOutput;
import com.siebel.selfservice.common.address.data.CutAddressData;
import com.siebel.selfservice.common.address.data.ListOfSsAddressIoData;
import com.siebel.selfservice.common.address.query.CutAddressQuery;
import com.siebel.selfservice.common.address.query.ListOfSsAddressIoQuery;
import com.siebel.selfservice.common.address.query.QueryType;

import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Map;

/**
 * Queries address (CutAddress) data from Siebel.
 * 
 * @author jwheaton
 * @version $Id:
 *          //product/Siebel/main/src/atg/siebel/account/command/ContactInfoQuery
 *          .java#1 $$Change: 1211033 $
 * @updated $DateTime: 2015/11/09 08:12:21 $$Author: saysyed $
 * 
 */
public class ContactInfoQuery
  extends SiebelCommand
  implements SiebelAccountConstants {
  // -------------------------------------
  // Constants
  // -------------------------------------
  public static final String CLASS_VERSION =
    "$Id: //product/Siebel/version/11.2/src/atg/siebel/account/command/ContactInfoQuery.java#3 $$Change: 1211033 $";

  // -------------------------------------
  // Overridden Methods
  // -------------------------------------
  /**
   * Performs the Siebel query.
   * 
   * @param pInput
   *          Map(String, String) of the query parameters.
   * @return CommandResult containing the list of address values.
   * 
   * @see atg.integrations.BaseCommand#invokeRPC(java.lang.Object)
   */
  @Override
  public CommandResult invokeRPC(Object pInput)
    throws CommandInvocationException, CommandTimeoutException,
    InvalidInputException {

    // query -- we know this is a Map
    @SuppressWarnings("unchecked")
    Map<String, String> constraints = (Map<String, String>) pInput;
    IntegrationRepository repository = getSiebelRepository();
    vlogDebug("Querying repository {0} with this criteria: {1}", repository
      .getRepositoryName(), constraints);

    // construct the query for Siebel
    CutAddressQuery addressQuery = new CutAddressQuery();
    try {
      buildQuery(addressQuery, repository, "contactInfo", constraints);
    } catch (RepositoryException rEx) {
      throw new CommandInvocationException(rEx);
    }

    // Call Siebel
    CommandResult commandResult = null;
    try {
      commandResult = makeSiebelCall(addressQuery);
    } catch (Throwable t) {
      throw new CommandInvocationException(t);
    }

    return commandResult;
  }

  /**
   * Makes the call to Siebel. Nothign in this method requires anything from
   * ATG. It should already be setup in the paramter.
   * 
   * @param pAddressQuery
   *          CutAddressQuery with the necessary constraints.
   * @return CommandResult with the results of the Siebel query.
   */
  CommandResult makeSiebelCall(CutAddressQuery pAddressQuery) {

    // setup the port to Siebel
    //SelfServiceAddress_Service service = new SelfServiceAddress_Service();
    //SelfServiceAddress port = service.getSelfServiceAddressPort();
    //getWebServiceHelper().prepareConnection((BindingProvider) port);

    // setup list of address query
    ListOfSsAddressIoQuery listOfQuery = new ListOfSsAddressIoQuery();
    listOfQuery.setCutAddress(pAddressQuery);
    SelfServiceAddressQueryPageInput input =
      new SelfServiceAddressQueryPageInput();
    input.setListOfSsAddressIo(listOfQuery);
    input.setExecutionMode("ForwardOnly");
    input.setLOVLanguageMode("LDC");
    input.setViewMode("All");

    

    //SelfServiceAddressQueryPageOutput result =
    //  port.selfServiceAddressQueryPage(input);

    SelfServiceAddressQueryPageOutput result = null;

    try {
      result = (SelfServiceAddressQueryPageOutput)getWebServiceController().callWebService(
              "com.siebel.selfservice.common.address.SelfServiceAddress_Service",
              "SelfServiceAddressPort",
              "selfServiceAddressQueryPage",
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

    ListOfSsAddressIoData listOfAddresses = result.getListOfSsAddressIo();
    List<CutAddressData> addresses = listOfAddresses.getCutAddress();

    CommandResult commandResult = new CommandResult();
    commandResult.setResult(addresses);
    return commandResult;
  }

  // -------------------------------------
  // Methods
  // -------------------------------------

  /**
   * Populates the given query object based on the mapping in the given
   * integration repository & item descriptor. When iterating through the
   * properties in the mapping, if the property exists in the given query
   * constraints, a constraint is added to the query. If not, an empty QueryType
   * object is added to the query so that Siebel will return the value for that
   * property as part of the results.
   * 
   * @param pQuery
   *          CutAddressQuery of the query to build.
   * @param pRepository
   *          IntgrationRepository where the item descriptor can be looked up.
   * @param pItemDescriptorName
   *          String of the item descriptor name to lookup.
   * @param pQueryConstraints
   *          Map (String, String) of the query constraints.
   * @throws RepositoryException
   */
  protected void buildQuery(CutAddressQuery pQuery,
    IntegrationRepository pRepository, String pItemDescriptorName,
    Map<String, String> pQueryConstraints) throws RepositoryException {

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
   *          CutAddressQuery of the query to build.
   * @param pQueryConstraints
   *          Map (String, String) of the query constraints.
   * @param pTargetMappings
   *          Map (String, String) of the source/target mappings between ATG and
   *          the remote system.
   */
  protected void setQueryProperties(CutAddressQuery pQuery,
    Map<String, String> pQueryConstraints,
    Map<String, PropertyMappingElement> pTargetMappings) {

    for (String propertyName : pTargetMappings.keySet()) {
      QueryType query = new QueryType();

      if (pQueryConstraints == null
        || StringUtils.isBlank(pQueryConstraints.get(propertyName))) {
        continue;
      }

      String value = pQueryConstraints.get(propertyName);
      if (propertyName.equalsIgnoreCase("phoneNumber")) {
        // BUG in Siebel. Phone numbers are sent, but not stored.
        // value = formatPhoneNumberForSiebel(value);
        continue;
      }
      StringBuilder queryFormat =
        (new StringBuilder("='")).append(value).append("'");
      query.setValue(queryFormat.toString());

      try {
        DynamicBeans.setPropertyValue(pQuery, propertyName, query);
      } catch (PropertyNotFoundException pnfe) {
        vlogDebug("Note, unable to set property: {0}", pnfe.getMessage());
      }
    }

    // The ID -must- be part of the query in order to return a value for it.
    // set a blank ID
    if (pQuery.getId() == null || pQuery.getId().getValue() == null) {
      QueryType qt = new QueryType();
      qt.setValue("");
      pQuery.setId(qt);
    }
  }
}
