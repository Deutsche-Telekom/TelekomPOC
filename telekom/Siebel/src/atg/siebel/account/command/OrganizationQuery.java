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
import atg.repository.MutableRepository;
import atg.repository.MutableRepositoryItem;
import atg.repository.RepositoryException;
import atg.repository.RepositoryItem;
import atg.service.resourcepool.ResourcePoolException;
import atg.siebel.integration.SiebelQueryView;
import atg.siebel.integration.SiebelWebServiceConfigurationException;
import atg.siebel.integration.ThreadLocalPropertyChanges;
import com.siebel.selfservice.common.account.SelfServiceAccountQueryPageInput;
import com.siebel.selfservice.common.account.SelfServiceAccountQueryPageOutput;
import com.siebel.selfservice.common.account.data.*;
import com.siebel.selfservice.common.account.query.*;
import com.siebel.selfservice.common.accountbillingprofile.SelfServiceAccountBillingProfileQueryPageInput;
import com.siebel.selfservice.common.accountbillingprofile.SelfServiceAccountBillingProfileQueryPageOutput;
import com.siebel.selfservice.common.accountbillingprofile.data.ComInvoiceProfileData;
import com.siebel.selfservice.common.accountbillingprofile.data.ListOfSsAccountbillingprofileIoData;
import com.siebel.selfservice.common.accountbillingprofile.query.ComInvoiceProfileQuery;
import com.siebel.selfservice.common.accountbillingprofile.query.ListOfSsAccountbillingprofileIoQuery;

import java.lang.reflect.InvocationTargetException;
import java.math.BigInteger;
import java.util.*;

/**
 * This command handles queries for Siebel accounts. It also acts as the action
 * class for "get" operations.
 */
public class OrganizationQuery extends SiebelCommand {

  // -------------------------------------
  // Class version string
  // -------------------------------------

  public static String CLASS_VERSION = "$Id: //product/Siebel/version/11.2/src/atg/siebel/account/command/OrganizationQuery.java#2 $$Change: 1194813 $";

  // --------- Property: RetrieveContacts -----------
  protected boolean mRetrieveContacts = true;

  /**
   * @description: Boolean indicating if all the contacts associated with the
   *               account should be retrieved as part of the webservice request
   */
  public void setRetrieveContacts(boolean pRetrieveContacts) {
    mRetrieveContacts = pRetrieveContacts;
  }

  /**
   * @return Boolean indicating if all the contacts associated with the account
   *         should be retrieved as part of the webservice request
   */
  public boolean isRetrieveContacts() {
    return mRetrieveContacts;
  }

  // --------- Property: RetrieveContacts -----------
  private String mAddressNameSeparator = null;

  /**
   * @return String of the character (or sequence) to use in separating the id
   *         and name of the address for uniqueness in Siebel. If this is null,
   *         this feature is considered to be disabled.
   */
  public String getAddressNameSeparator() {
    return mAddressNameSeparator;
  }

  /**
   * @param pAddressNameSeparator
   *          String of the character (or sequence) to use in separating the id
   *          and name of the address for uniqueness in Siebel. If this is null,
   *          this feature is considered to be disabled.
   */
  public void setAddressNameSeparator(String pAddressNameSeparator) {
    mAddressNameSeparator = pAddressNameSeparator;
  }
  
 //--------- Property: mOrganizationItemDescriptorName -----------
  private String mOrganizationItemDescriptorName;
  
  /**
   * @return the mOrganizationItemDescriptorName
   */
  public String getOrganizationItemDescriptorName() {
    return mOrganizationItemDescriptorName;
  }

  /**
   * @param pOrganizationItemDescriptorName the mOrganizationItemDescriptorName to set
   */
  public void setOrganizationItemDescriptorName(
      String pOrganizationItemDescriptorName) {
    this.mOrganizationItemDescriptorName = pOrganizationItemDescriptorName;
  }

  private HashMap<String, RepositoryItem> mSiebelIdAddressMap = new HashMap<String, RepositoryItem>();

  /**
   * Constructs a query using the constraints contained in the input object. The
   * query is run by invoking the SelfServiceAccount web service. The matching
   * accounts are returned
   * 
   * @param pInput
   *          a map of properties to query on to the values to constrain on
   * @return the list of matching Siebel accounts
   */
  public CommandResult invokeRPC(Object pInput)
      throws CommandInvocationException, CommandTimeoutException,
      InvalidInputException {
    vlogDebug("SIEBEL : QueryAccount:invokeRPC(), input: {0}", pInput);

    CommandResult commandResult = new CommandResult();
    @SuppressWarnings("rawtypes")
    Map queryConstraints = (Map) pInput;
    IntegrationRepository repository = getSiebelRepository();
    mSiebelIdAddressMap.clear();
    int lineItemsRecordCount = -1;
    int noOfItemsRetrieved = 0;
    try {
      //SelfServiceAccount_Service service = new SelfServiceAccount_Service();
      //SelfServiceAccount port = service.getSelfServiceAccountPort();
      //getWebServiceHelper().prepareConnection((BindingProvider) port);

      AccountQuery accountQuery = new AccountQuery();

      // Set up the query to request all properties contained in the
      // repository
      // mapping
      buildQuery(accountQuery, repository, getOrganizationItemDescriptorName(),
          queryConstraints);
      // Add requests for "primaryBillTo" and "primaryShipTo" fields
      buildQuery(accountQuery, getPrimaryBillToRepository(),
          getContactInfoItemDescriptorName(), queryConstraints);
      buildQuery(accountQuery, getPrimaryShipToRepository(),
          getContactInfoItemDescriptorName(), queryConstraints);

      // Add a ListOfContact query so we get all the contacts back
      if (isRetrieveContacts()) {
        ListOfContactQuery contactQuery = createContactQuery(repository);
        accountQuery.setListOfContact(contactQuery);
      }

      // Add a ListOfBusinessAddress query so we get all the addresses
      // back
      /*
       * Bug 17351387 - Get the record count in the first web service call and
       * verify with the size of line items retrieved. If line items retrieved
       * is less than the record count make web service call again by specifying
       * the record count as page size in the input
       */
      ListOfBusinessAddressQuery businessAddressQuery = createBusinessAddressQuery(
          repository, lineItemsRecordCount);
      accountQuery.setListOfBusinessAddress(businessAddressQuery);

      // Put together the rest of the query
      ListOfSSAccountQuery listOfQuery = new ListOfSSAccountQuery();
      listOfQuery.setAccount(accountQuery);
      SelfServiceAccountQueryPageInput input = new SelfServiceAccountQueryPageInput();
      input.setListOfSSAccount(listOfQuery);
      input.setExecutionMode("ForwardOnly");
      input.setLOVLanguageMode("LDC");
      input.setViewMode("All");

      // Invocation
      //vlogDebug(
      //    "Calling Siebel with URL: {0}",
      //    ((BindingProvider) port).getRequestContext().get(
      //        javax.xml.ws.BindingProvider.ENDPOINT_ADDRESS_PROPERTY));
      //SelfServiceAccountQueryPageOutput result = port
      //    .selfServiceAccountQueryPage(input);

      SelfServiceAccountQueryPageOutput result = null;

      try {
        result = (SelfServiceAccountQueryPageOutput)getWebServiceController().callWebService(
                "com.siebel.selfservice.common.account.SelfServiceAccount_Service",
                "SelfServiceAccountPort",
                "selfServiceAccountQueryPage",
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

      // Retrieve the record count from the result
      lineItemsRecordCount = result.getListOfSSAccount().getAccount().get(0)
          .getListOfBusinessAddress().getRecordcount().intValue();
      // Get the actual no of line items retrieved
      noOfItemsRetrieved = result.getListOfSSAccount().getAccount().get(0)
          .getListOfBusinessAddress().getBusinessAddress().size();
      if (noOfItemsRetrieved < lineItemsRecordCount) {
        businessAddressQuery = createBusinessAddressQuery(repository,
            lineItemsRecordCount);
        accountQuery.setListOfBusinessAddress(businessAddressQuery);
        // Put together the rest of the query
        listOfQuery = new ListOfSSAccountQuery();
        listOfQuery.setAccount(accountQuery);
        listOfQuery.setRecordcountneeded(true);
        input = new SelfServiceAccountQueryPageInput();
        input.setListOfSSAccount(listOfQuery);
        input.setExecutionMode("ForwardOnly");
        input.setLOVLanguageMode("LDC");
        input.setViewMode("All");

        try {
          result = (SelfServiceAccountQueryPageOutput)getWebServiceController().callWebService(
                  "com.siebel.selfservice.common.account.SelfServiceAccount_Service",
                  "SelfServiceAccountPort",
                  "selfServiceAccountQueryPage",
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

        
        //result = port.selfServiceAccountQueryPage(input);

        
      }

      //
      ListOfSSAccountData listOfAccounts = result.getListOfSSAccount();
      List<AccountData> accounts = listOfAccounts.getAccount();
      HashMap<String, RepositoryItem> siebelAddressCache = new HashMap<String, RepositoryItem>();
      for (AccountData account : accounts) {
        createOrganizationDetails(account);
      }

      commandResult.setResult(accounts);
    } catch (Throwable e) {
      throw new CommandInvocationException(e);
    }
    mSiebelIdAddressMap.clear();
    vlogDebug("QueryAccount:invokeRPC(), result: {0}", commandResult);
    return commandResult;
  }

  /**
   * Creates a repository item to be attached to the organization that will be
   * created based on the Siebel account. Used to create the primary billing and
   * shipping addresses. We store the new address item in a thread local because
   * the organization won't be created until after this command finishes
   * executing. The integration repository client is responsible for setting the
   * value on the organization.
   */
  public void createItemForOrganization(AccountData pAccount,
      IntegrationRepository pRepository, String pItemDescriptorName,
      String pPropertyName) throws RepositoryException {

    IntegrationRepositoryItemDescriptor itemDesc = (IntegrationRepositoryItemDescriptor) pRepository
        .getItemDescriptor(pItemDescriptorName);
    RepositoryItem localItem = itemDesc.getIntegrationRepositoryTools()
        .createRepositoryItem(pAccount, itemDesc, null, this);
    ThreadLocalPropertyChanges.put(pPropertyName, localItem);
  }

  /**
   * Creates the contactInfo items that will be the secondary addresses for the
   * organization based on the given account. These items are put in a thread
   * local because the organization won't be created until after this command
   * finishes executing. The integration repository client is responsible for
   * setting the value on the organization.
   */
  public void createSecondaryAddressesForOrganization(AccountData pAccount,
      IntegrationRepository pRepository, String pContactInfoItemDescriptorName,
      String pSecondaryAddressesPropertyName) throws RepositoryException {

    ListOfBusinessAddressData lobaData = pAccount.getListOfBusinessAddress();
    List<BusinessAddressData> businessAddresses = lobaData.getBusinessAddress();
    IntegrationRepositoryItemDescriptor contactInfoDesc = (IntegrationRepositoryItemDescriptor) pRepository
        .getItemDescriptor(pContactInfoItemDescriptorName);

    HashMap<String, RepositoryItem> secondaryAddressMap = new HashMap<String, RepositoryItem>();
    RepositoryItem localBusinessAddressItem = null;
    for (BusinessAddressData businessAddress : businessAddresses) {
      localBusinessAddressItem = contactInfoDesc
          .getIntegrationRepositoryTools().createRepositoryItem(
              businessAddress, contactInfoDesc, null, this);

      // NOTE the key of this map ends up being the "nickname" or "tag" of
      // the address in ATG.
      secondaryAddressMap.put(businessAddress.getAddressName(),
          localBusinessAddressItem);
      // cache this data for future use in creating credit card address items
      mSiebelIdAddressMap
          .put(businessAddress.getId(), localBusinessAddressItem);
    }

    ThreadLocalPropertyChanges.put(pSecondaryAddressesPropertyName,
        secondaryAddressMap);
  }

  /**
   * creates Credit cards(ie billing profiles) for each account
   */
  public void createCreditCardsForOrganization(AccountData pAccount,
      IntegrationRepository pRepository, String pCreditCardDescriptorName,
      String pCreditCardsPropertyName) throws RepositoryException {

    int lineItemsRecordCount = -1;
    int noOfItemsRetrieved = 0;

    // Billing profile query
    //SelfServiceAccountBillingProfile_Service bpservice = new SelfServiceAccountBillingProfile_Service();
    //SelfServiceAccountBillingProfile bpPort = bpservice
    //    .getSelfServiceAccountBillingProfilePort();
    //getWebServiceHelper().prepareConnection((BindingProvider) bpPort);

    ListOfSsAccountbillingprofileIoQuery billingProfQuery = new ListOfSsAccountbillingprofileIoQuery();
    ComInvoiceProfileQuery comQuery = new ComInvoiceProfileQuery();
    billingProfQuery.setRecordcountneeded(true);

    // Set the page size to the record count value
    if (lineItemsRecordCount > 0) {
      billingProfQuery.setPagesize(new BigInteger(lineItemsRecordCount + ""));
    }
    billingProfQuery.setStartrownum(new BigInteger("0"));

    // build business profile query with required attribs mapped from mapping
    // file
    Map<String, String> queryConstraints = new HashMap<String, String>(2);
    queryConstraints.put(PROP_ACCOUNT_ID, pAccount.getId());
    bpBuildQuery(comQuery, getBillingProfileRepository(),
        getCreditCardDescriptorName(), queryConstraints);

    billingProfQuery.setComInvoiceProfile(comQuery);
    SelfServiceAccountBillingProfileQueryPageInput bpInput = new SelfServiceAccountBillingProfileQueryPageInput();
    bpInput.setExecutionMode("ForwardOnly");
    bpInput.setLOVLanguageMode("LDC");
    bpInput.setViewMode("All");
    bpInput.setListOfSsAccountbillingprofileIo(billingProfQuery);

    //vlogDebug(
    //    "Calling Billingprofile WS : {0}",
    //    ((BindingProvider) bpPort).getRequestContext().get(
    //        javax.xml.ws.BindingProvider.ENDPOINT_ADDRESS_PROPERTY));
    //SelfServiceAccountBillingProfileQueryPageOutput bpResult = bpPort
    //    .selfServiceAccountBillingProfileQueryPage(bpInput);

    SelfServiceAccountBillingProfileQueryPageOutput bpResult = null;

    try {
      bpResult = (SelfServiceAccountBillingProfileQueryPageOutput)getWebServiceController().callWebService(
              "com.siebel.selfservice.common.accountbillingprofile.SelfServiceAccountBillingProfile_Service",
              "SelfServiceAccountBillingProfilePort",
              "selfServiceAccountBillingProfileQueryPage",
              bpInput,
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


    ListOfSsAccountbillingprofileIoData bpList = bpResult
        .getListOfSsAccountbillingprofileIo();
    // Retrieve the record count from the result
    lineItemsRecordCount = bpList.getRecordcount().intValue();
    // Get the actual no of line items retrieved
    noOfItemsRetrieved = bpList.getComInvoiceProfile().size();

    if (noOfItemsRetrieved < lineItemsRecordCount) {
      billingProfQuery = new ListOfSsAccountbillingprofileIoQuery();
      comQuery = new ComInvoiceProfileQuery();
      billingProfQuery.setRecordcountneeded(true);
      // Set the page size to the record count value
      if (lineItemsRecordCount > 0) {
        billingProfQuery.setPagesize(new BigInteger(lineItemsRecordCount + ""));
      }
      billingProfQuery.setStartrownum(new BigInteger("0"));

      // build business profile query with required attribs mapped from mapping
      // file
      queryConstraints = new HashMap<String, String>(2);
      queryConstraints.put(PROP_ACCOUNT_ID, pAccount.getId());
      bpBuildQuery(comQuery, getBillingProfileRepository(),
          getCreditCardDescriptorName(), queryConstraints);

      billingProfQuery.setComInvoiceProfile(comQuery);
      bpInput = new SelfServiceAccountBillingProfileQueryPageInput();
      bpInput.setExecutionMode("ForwardOnly");
      bpInput.setLOVLanguageMode("LDC");
      bpInput.setViewMode("All");
      bpInput.setListOfSsAccountbillingprofileIo(billingProfQuery);
      //bpResult = bpPort.selfServiceAccountBillingProfileQueryPage(bpInput);

      try {
        bpResult = (SelfServiceAccountBillingProfileQueryPageOutput)getWebServiceController().callWebService(
                "com.siebel.selfservice.common.accountbillingprofile.SelfServiceAccountBillingProfile_Service",
                "SelfServiceAccountBillingProfilePort",
                "selfServiceAccountBillingProfileQueryPage",
                bpInput,
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

      bpList = bpResult.getListOfSsAccountbillingprofileIo();
    }

    List<ComInvoiceProfileData> bpListData = bpList.getComInvoiceProfile();

    // From the results create credit-card data ,then associate with this
    // organization
    HashMap<String, RepositoryItem> bpMap = new HashMap<String, RepositoryItem>();
    // item descriptor for the credit-card Item
    IntegrationRepositoryItemDescriptor ccDesc = (IntegrationRepositoryItemDescriptor) pRepository
        .getItemDescriptor(pCreditCardDescriptorName);
    MutableRepositoryItem bpItem = null;
    // for each of returned results
    for (ComInvoiceProfileData bp : bpListData) {
      // create a bpItem .
      bpItem = (MutableRepositoryItem) ccDesc.getIntegrationRepositoryTools()
          .createRepositoryItem(bp, ccDesc, null, this);
      // query for contactInfo rep Item using Siebel-AddressId from thread local
      // map
      // link this with CC descriptor item
      if (mSiebelIdAddressMap.containsKey(bp.getAddressId())) {
        bpItem.setPropertyValue(getBillingAddressPropertyName(),
            mSiebelIdAddressMap.get(bp.getAddressId()));
      }

      // check if this is the default billing profile
      if (bp.getAccountPrimaryBillingProfileId().equals(bp.getId())) {
        ThreadLocalPropertyChanges.put(getDefaultCreditCardPropertyName(),
            bpItem);
      }
      // also link/create contactInfo ,by querying account
      bpMap.put(bp.getId(), bpItem);
    }
    // set the 'creditcards' property in Organization to this map
    ThreadLocalPropertyChanges.put(pCreditCardsPropertyName, bpMap);
  }

  /**
   * Creates user and contactInfo items for each contact associated with the
   * given account.
   * 
   * @param pAccount
   *          AccountData retrieved from Siebel.
   * @param pRepository
   *          IntegrationRepository in which the users need to be created.
   * @throws RepositoryException
   */
  public void createUsersFromContacts(AccountData pAccount,
      IntegrationRepository pRepository) throws RepositoryException {

    ListOfContactData locData = pAccount.getListOfContact();
    if (locData == null)
      return;

    List<ContactData> contacts = locData.getContact();

    // get contact info (address) and user item descriptors
    IntegrationRepositoryItemDescriptor contactInfoDesc = (IntegrationRepositoryItemDescriptor) getContactAddressRepository()
        .getItemDescriptor(getContactInfoItemDescriptorName());
    IntegrationRepositoryItemDescriptor userDesc = (IntegrationRepositoryItemDescriptor) pRepository
        .getItemDescriptor(getUserItemDescriptorName());

    for (ContactData contact : contacts) {
      // Siebel does not presently return user addresses as part of the
      // organization query.
      // Leaving this logic here in case that changes in the future.
      // note, this will RETRIEVE an existing address if the data isn't
      // expired
      RepositoryItem localContactInfoItem = contactInfoDesc
          .getIntegrationRepositoryTools().createRepositoryItem(contact,
              contactInfoDesc, null, this);
      // create the user
      // note, this will RETRIEVE an existing user if the data isn't
      // expired
      MutableRepositoryItem localUserItem = (MutableRepositoryItem) userDesc
          .getIntegrationRepositoryTools().createRepositoryItem(contact,
              userDesc, null, this);

      if (localContactInfoItem != null) {
        localUserItem.setPropertyValue(getUserPrimaryAddressPropertyName(),
            localContactInfoItem);
      }
      ((MutableRepository) getSiebelRepository().getLocalRepository())
          .updateItem(localUserItem);
    }
  }

  /**
   * Creates a ContactQuery so that the webservice call will return the list of
   * contacts associated with the account
   */
  public ListOfContactQuery createContactQuery(IntegrationRepository pRepository)
      throws RepositoryException {
    ContactQuery contactQuery = new ContactQuery();
    buildQuery(contactQuery, pRepository, getContactInfoItemDescriptorName(),
        null);
    buildQuery(contactQuery, pRepository, getUserItemDescriptorName(), null);
    ListOfContactQuery locQuery = new ListOfContactQuery();
    locQuery.setContact(contactQuery);
    return locQuery;
  }

  /**
   * Creates a BusinessAddressQuery so that the webservice call will return the
   * list of addresses associated with the account
   */
  public ListOfBusinessAddressQuery createBusinessAddressQuery(
      IntegrationRepository pRepository, int plineItemsRecordCount)
      throws RepositoryException {
    BusinessAddressQuery businessAddressQuery = new BusinessAddressQuery();
    buildQuery(businessAddressQuery, pRepository,
        getContactInfoItemDescriptorName(), null);
    businessAddressQuery.setBillAddressFlag(new QueryType());
    businessAddressQuery.setShipAddressFlag(new QueryType());
    businessAddressQuery.setAddressName(new QueryType());

    ListOfBusinessAddressQuery lobaQuery = new ListOfBusinessAddressQuery();
    lobaQuery.setBusinessAddress(businessAddressQuery);
    lobaQuery.setRecordcountneeded(true);
    //Set the page size to the record count value
    if (plineItemsRecordCount > 0) {
      lobaQuery.setPagesize(new BigInteger(plineItemsRecordCount + ""));
    }
    lobaQuery.setStartrownum(new BigInteger("0"));
    return lobaQuery;
  }

  /**
   * Populates the given query object based on the mapping in the given
   * integration repository & item descriptor. When iterating through the
   * properties in the mapping, if the property exists in the given query
   * constraints, a constraint is added to the query. If not, an empty QueryType
   * object is added to the query so that Siebel will return the value for that
   * property as part of the results.
   */
  protected void buildQuery(Object pQuery, IntegrationRepository pRepository,
      String pItemDescriptorName,
      @SuppressWarnings("rawtypes") Map pQueryConstraints)
      throws RepositoryException {

    IntegrationRepositoryItemDescriptor desc = (IntegrationRepositoryItemDescriptor) pRepository
        .getItemDescriptor(pItemDescriptorName);
    @SuppressWarnings("rawtypes")
    Map targetMappings = desc.getItemMappingElement().getMappingByTargetName();
    @SuppressWarnings("rawtypes")
    Collection targetProps = targetMappings.keySet();
    @SuppressWarnings("rawtypes")
    Iterator targetPropIter = targetProps.iterator();
    while (targetPropIter.hasNext()) {
      String propertyName = (String) targetPropIter.next();
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
    if (pQueryConstraints != null && pQueryConstraints.containsKey("Id")) {
      try {
        QueryType query = new QueryType();
        String queryFormat = "='" + pQueryConstraints.get("Id") + "'";
        query.setValue(queryFormat);
        DynamicBeans.setPropertyValue(pQuery, "id", query);
      } catch (PropertyNotFoundException pnfe) {
      }
    }
  }

  // TODO ,merge buildQuery with bpBuildQuery with generics
  protected void bpBuildQuery(Object pQuery, IntegrationRepository pRepository,
      String pItemDescriptorName,
      @SuppressWarnings("rawtypes") Map pQueryConstraints)
      throws RepositoryException {

    IntegrationRepositoryItemDescriptor desc = (IntegrationRepositoryItemDescriptor) pRepository
        .getItemDescriptor(pItemDescriptorName);
    @SuppressWarnings("rawtypes")
    Map targetMappings = desc.getItemMappingElement().getMappingByTargetName();
    @SuppressWarnings("rawtypes")
    Collection targetProps = targetMappings.keySet();
    @SuppressWarnings("rawtypes")
    Iterator targetPropIter = targetProps.iterator();
    while (targetPropIter.hasNext()) {
      String propertyName = (String) targetPropIter.next();
      com.siebel.selfservice.common.accountbillingprofile.query.QueryType query = new com.siebel.selfservice.common.accountbillingprofile.query.QueryType();
      if (pQueryConstraints != null
          && pQueryConstraints.get(propertyName) != null) {
        String queryFormat = "='" + pQueryConstraints.get(propertyName) + "'";
        query.setValue(queryFormat);
      }
      try {
        DynamicBeans.setPropertyValue(pQuery, propertyName, query);
      } catch (PropertyNotFoundException pnfe) {
      }
    }

    // Set the AccountId property, if it exists: THIS IS SPECIFICALLY FOR
    // Billing profiles,which are associated to Accounts
    if (pQueryConstraints != null && pQueryConstraints.containsKey("AccountId")) {
      try {
        com.siebel.selfservice.common.accountbillingprofile.query.QueryType query = new com.siebel.selfservice.common.accountbillingprofile.query.QueryType();
        String queryFormat = "='" + pQueryConstraints.get("AccountId") + "'";
        query.setValue(queryFormat);
        DynamicBeans.setPropertyValue(pQuery, "AccountId", query);
      } catch (PropertyNotFoundException pnfe) {
      }
    }
  }
  

  /**
   * This method takes account data as an input creates organization, user,
   * contact info, address in local repository
   * 
   * @param pAccountData
   * @return RepositoryItem[] array containing organization
   * @throws RepositoryException
   * @throws Exception
   */
  public RepositoryItem[] createOrganization(AccountData pAccountData)
      throws RepositoryException, Exception {

    IntegrationRepository repository = getSiebelRepository();
    mSiebelIdAddressMap.clear();

    // Create the organization details
    createOrganizationDetails(pAccountData);
    // create root organization in local repository

    List<AccountData> accounts = new ArrayList<AccountData>();
    accounts.add(pAccountData);
    CommandResult commandResult = new CommandResult();
    commandResult.setResult(accounts);
    SiebelQueryView view = (SiebelQueryView) Class.forName(
        repository.getDefaultViewClass()).newInstance();
    view.setItemDescriptor((IntegrationRepositoryItemDescriptor) repository
        .getItemDescriptor(getOrganizationItemDescriptorName()));
    RepositoryItem[] organisation = view.processResults(this, commandResult);

    mSiebelIdAddressMap.clear();
    return organisation;
  }
  
  /**
   * This method creates the organization details in local repository
   * 
   * @param pAccountData
   */
  protected void createOrganizationDetails(AccountData pAccountData)
      throws RepositoryException, Exception {
    // Create the primary bill to and ship to contactInfo items
    createItemForOrganization(pAccountData, getPrimaryBillToRepository(),
        getContactInfoItemDescriptorName(), getBillingAddressPropertyName());
    createItemForOrganization(pAccountData, getPrimaryShipToRepository(),
        getContactInfoItemDescriptorName(), getShippingAddressPropertyName());

    // Create the list of secondary addresses for the organization
    createSecondaryAddressesForOrganization(pAccountData,
        getSiebelRepository(), getContactInfoItemDescriptorName(),
        getSecondaryAddressesPropertyName());

    // Create the user
    createUsersFromContacts(pAccountData, getSiebelRepository());
    /*
     * create all credit-cards <-> Billing profiles createCreditCards(account,
     * repository, getBillingProfileRepository,getCreditCardDescriptorName() );
     */
    createCreditCardsForOrganization(pAccountData,
        getBillingProfileRepository(), getCreditCardDescriptorName(),
        geCreditCardsPropertyName());
  }
} // end of class
