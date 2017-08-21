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

package atg.siebel.account;

import atg.adapter.integrations.IntegrationRepository;
import atg.adapter.integrations.IntegrationRepositoryItem;
import atg.core.i18n.LayeredResourceBundle;
import atg.droplet.DropletException;
import atg.nucleus.logging.ApplicationLoggingImpl;
import atg.repository.*;
import atg.service.resourcepool.ResourcePoolException;
import atg.siebel.account.command.OrganizationQuery;
import atg.siebel.integration.SiebelWebServiceConfigurationException;
import atg.siebel.integration.ThreadLocalPropertyChanges;
import atg.siebel.integration.WebServiceHelper;
import atg.siebel.integration.WebServiceController;
import atg.userdirectory.DirectoryModificationException;
import atg.userdirectory.Organization;
import atg.userdirectory.repository.RepositoryUserDirectory;
import atg.userprofiling.Profile;
import com.siebel.selfservice.common.account.SelfServiceAccountExecuteInput;
import com.siebel.selfservice.common.account.SelfServiceAccountExecuteOutput;
import com.siebel.selfservice.common.account.data.*;
import com.siebel.selfservice.common.accountbillingprofile.SelfServiceAccountBillingProfileExecuteInput;
import com.siebel.selfservice.common.accountbillingprofile.SelfServiceAccountBillingProfileExecuteOutput;
import com.siebel.selfservice.common.accountbillingprofile.data.ComInvoiceProfileData;
import com.siebel.selfservice.common.accountbillingprofile.data.ListOfSsAccountbillingprofileIoData;
import com.siebel.selfservice.common.accountbillingprofile.id.ComInvoiceProfileId;

import java.lang.reflect.InvocationTargetException;
import java.math.BigInteger;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * A collection of helper methods for interacting with Siebel.
 * 
 * @author Paul O'Brien
 * @version $Id: //dev/horizon/main/projects/Siebel/src/atg/siebel/account/
 *          SiebelAccountTools.java#5 $$Change: 1224864 $
 * @updated $DateTime: 2015/11/25 06:38:52 $$Author: saysyed $
 */

public class SiebelAccountTools
  extends ApplicationLoggingImpl
  implements SiebelAccountConstants {
  // -------------------------------------
  /** Class version string */
  public static String CLASS_VERSION =
    "$Id: //product/Siebel/version/11.2/src/atg/siebel/account/SiebelAccountTools.java#5 $$Change: 1224864 $";

  // ResourceBundle
  private static ResourceBundle sResourceBundle = LayeredResourceBundle
      .getBundle(SiebelAccountConstants.SIEBEL_WEBAPP_RESOURCE_BUNDLE_NAME,
          atg.service.dynamo.LangLicense.getLicensedDefault());
  // --------- Property: SiebelAccountRepository -----------
  protected IntegrationRepository mSiebelAccountRepository;

  /**
   * Sets the property SiebelAccountRepository. description: the
   * SiebelAccountRepository used to interact with the remote Siebel instance
   */
  public void setSiebelAccountRepository(
    IntegrationRepository pSiebelAccountRepository) {
    mSiebelAccountRepository = pSiebelAccountRepository;
  }

  /**
   * @return The value of the property SiebelAccountRepository.
   */
  public IntegrationRepository getSiebelAccountRepository() {
    return mSiebelAccountRepository;
  }

  // --------- Property: UserItemDescriptorName -----------
  protected String mUserItemDescriptorName;

  /**
   * Sets the property UserItemDescriptorName. description: the name of the user
   * item descriptor in the profile repository
   */
  public void setUserItemDescriptorName(String pUserItemDescriptorName) {
    mUserItemDescriptorName = pUserItemDescriptorName;
  }

  /**
   * @return The value of the property UserItemDescriptorName.
   */
  public String getUserItemDescriptorName() {
    return mUserItemDescriptorName;
  }

  // --------- Property: OrganizationItemDescriptorName -----------
  protected String mOrganizationItemDescriptorName;

  /**
   * Sets the property UserItemDescriptorName. description: the name of the user
   * item descriptor in the profile repository
   */
  public void setOrganizationItemDescriptorName(
    String pOrganizationItemDescriptorName) {
    mOrganizationItemDescriptorName = pOrganizationItemDescriptorName;
  }

  /**
   * @return The value of the property UserItemDescriptorName.
   */
  public String getOrganizationItemDescriptorName() {
    return mOrganizationItemDescriptorName;
  }

  // --------- Property: repositoryUserDirectory -----------
  private RepositoryUserDirectory mRepositoryUserDirectory = null;

  /**
   * @param pRUD
   */
  public void setRepositoryUserDirectory(RepositoryUserDirectory pRUD) {
    mRepositoryUserDirectory = pRUD;
  }
  
  // --------- Property: OrganizationPropertyName ---------------
  String mOrganizationPropertyName;

  /**
   * @description: The name of the organization property in the user item
   *               descriptor
   */
  public void setOrganizationPropertyName(String pOrganizationPropertyName) {
    mOrganizationPropertyName = pOrganizationPropertyName;
  }

  /**
   * @return The name of the organization item descriptor in the profile
   *         repository
   */
  public String getOrganizationPropertyName() {
    return mOrganizationPropertyName;
  }

  /**
   * @return
   */
  public RepositoryUserDirectory getRepositoryUserDirectory() {
    return mRepositoryUserDirectory;
  }

  // --------- Property: webServiceHelper -----------

  private WebServiceHelper mWebServiceHelper;

  /**
   * @return the Web Service Helper
   */

  public WebServiceHelper getWebServiceHelper() {
    return mWebServiceHelper;
  }

  /**
   * Sets the Web Service Helper
   * 
   * @param pWebServiceHelper
   *          the Web Service Helper to set
   */

  public void setWebServiceHelper(WebServiceHelper pWebServiceHelper) {
    mWebServiceHelper = pWebServiceHelper;
  }

  protected WebServiceController mWebServiceController;

  // --------- Property: WebServiceController ------------
  public void setWebServiceController(WebServiceController pWebServiceController)
  {
    mWebServiceController = pWebServiceController;
  }

  public WebServiceController getWebServiceController()
  {
    return mWebServiceController;
  }

  // --------- Property: mOrganizationQuery -----------
  private OrganizationQuery mOrganizationQuery;

  /**
   * @return the mOrganizationQuery
   */
  public OrganizationQuery getOrganizationQuery() {
    return mOrganizationQuery;
  }

  /**
   * @param pOrganizationQuery
   *          the mOrganizationQuery to set
   */
  public void setOrganizationQuery(OrganizationQuery pOrganizationQuery) {
    this.mOrganizationQuery = pOrganizationQuery;
  }
  
  // --------- Property: ParentOrgPropertyName -----------
  private String mParentOrgPropertyName;

  /**
   * @return the mParentOrgPropertyName
   */
  public String getParentOrgPropertyName() {
    return mParentOrgPropertyName;
  }

  /**
   * @param pParentOrgPropertyName
   *          the mParentOrgPropertyName to set
   */
  public void setParentOrgPropertyName(String pParentOrgPropertyName) {
    this.mParentOrgPropertyName = pParentOrgPropertyName;
  }
  
  // --------- Property: PasswordPropertyName -----------
  private String mPasswordPropertyName;

  /**
   * @return the mPasswordPropertyName
   */
  public String getPasswordPropertyName() {
    return mPasswordPropertyName;
  }

  /**
   * @param pPasswordPropertyName
   *          the mPasswordPropertyName to set
   */
  public void setPasswordPropertyName(String pPasswordPropertyName) {
    this.mPasswordPropertyName = pPasswordPropertyName;
  }

  // --------- Property: DefaultPassword -----------
  private String mDefaultPassword;

  /**
   * @return the mDefaultPassword
   */
  public String getDefaultPassword() {
    return mDefaultPassword;
  }

  /**
   * @param pDefaultPassword
   *          the mDefaultPassword to set
   */
  public void setDefaultPassword(String pDefaultPassword) {
    this.mDefaultPassword = pDefaultPassword;
  }
  
//--------- Property: BillingProfileRepository -----------
 protected IntegrationRepository mBillingProfileRepository;

 public IntegrationRepository getBillingProfileRepository() {
   return mBillingProfileRepository;
 }

 public void setBillingProfileRepository(
     IntegrationRepository pBillingProfileRepository) {
   this.mBillingProfileRepository = pBillingProfileRepository;
 }

  // --------- Property: CreditCardsPropertyName -----------
  protected String mCreditCardDescriptorName;

  public String getCreditCardDescriptorName() {
    return mCreditCardDescriptorName;
  }

  public void setCreditCardDescriptorName(String pCreditCardDescriptorName) {
    this.mCreditCardDescriptorName = pCreditCardDescriptorName;
  }

  protected String mCreditCardsPropertyName;

  public String getCreditCardsPropertyName() {
    return mCreditCardsPropertyName;
  }

  public void setCreditCardsPropertyName(String pCreditCardsPropertyName) {
    this.mCreditCardsPropertyName = pCreditCardsPropertyName;
  }
  
  


  /**
   * Synchronizes the item from Siebel. If the some or all of the item does not
   * exist it will be created. This exists specifically to ensure the properties
   * are updated with the ThreadLocalPropertyChanges call.
   * 
   * @param pItem
   *          RepositoryItem of the item to be sync'd.
   * @param pItemDescriptorName
   *          String of the item descriptor name for the item to be sync'd.
   * @param pClearThreadLocal
   *          boolean flag indicating if ThreadLocal data should be cleared
   *          after sync. The data may want to be kept for multipe similar item
   *          sync's. The data should be cleared if different items will be
   *          sync'd in series.
   * @throws RepositoryException
   */
  public void syncItemFromSiebel(RepositoryItem pItem,
    String pItemDescriptorName, boolean pClearThreadLocal)
    throws RepositoryException {

    // now have to talk directly to the local repo to update the properties
    MutableRepository localRepository =
      (MutableRepository) getSiebelAccountRepository().getLocalRepository();
    MutableRepositoryItem localItem =
      localRepository.getItemForUpdate(pItem.getRepositoryId(),
        pItemDescriptorName);

    if (ThreadLocalPropertyChanges.get().size() > 0) {
      // clear it or you'll try to set things elsewhere that aren't there...
      ThreadLocalPropertyChanges.updateProperties(localItem, localRepository,
        pClearThreadLocal);
    }
  }

  /**
   * First attempts to query the local repository. If no results are found, it
   * queries the integration repository to make the remote call to Siebel.
   */
  public RepositoryItem[] performQuery(String pItemType,
    @SuppressWarnings("rawtypes") Map pConstraints) {

    // Try a local query first
    RepositoryItem[] results =
      queryRepository(getSiebelAccountRepository().getLocalRepository(),
        pItemType, pConstraints);
    if (results != null && results.length > 0)
      return results;

    // Otherwise, do a remote call
    return queryRepository(getSiebelAccountRepository(), pItemType,
      pConstraints);
  }

  /**
   * Query for an item descriptor with the given constraints
   * 
   * @param pRepository
   *          Repository to query.
   * @param pItemType
   *          String of the Repository Item Type Name to be queried.
   * @param pConstraints
   *          Map (String, String) of the query constraints.
   * @return RepositoryItem array of the query results.
   */
  public RepositoryItem[] queryRepository(Repository pRepository,
    String pItemType, @SuppressWarnings("rawtypes") Map pConstraints) {

    try {
      RepositoryView view = pRepository.getView(pItemType);
      QueryBuilder qb = view.getQueryBuilder();
      Vector<Query> queries = new Vector<Query>();

      @SuppressWarnings("unchecked")
      Iterator<String> keyIter = pConstraints.keySet().iterator();
      while (keyIter.hasNext()) {
        String propertyName = keyIter.next();
        String value = (String) pConstraints.get(propertyName);
        QueryExpression propertyExpression =
          qb.createPropertyQueryExpression(propertyName);
        QueryExpression valueExpression =
          qb.createConstantQueryExpression(value);
        Query q =
          qb.createComparisonQuery(propertyExpression, valueExpression,
            QueryBuilder.EQUALS);
        queries.add(q);
      }

      Query[] qArray = new Query[queries.size()];
      Query fullQuery = qb.createAndQuery((Query[]) queries.toArray(qArray));
      return view.executeQuery(fullQuery);
    } catch (RepositoryException re) {
      re.printStackTrace();
    }

    return null;
  }

  /**
   * Method to create an organization. Nothing fancy, just takes a name and the
   * item type to create.
   * 
   * @param pRepository
   *          IntegrationRepository in which the organization will be created.
   * @param pOrganizationName
   * @param pForceUnique
   * @return
   * @throws RepositoryException
   */
  public RepositoryItem createUserOrganization(
    IntegrationRepository pRepository, String pOrganizationName,
    boolean pForceUnique) throws RepositoryException {

    pRepository.vlogDebug("createUserOrganization (repo, org name): {0}. {1}",
      pRepository, pOrganizationName);

    StringBuilder orgName = new StringBuilder(pOrganizationName);
    /*
     * Siebel yells if we try to create an Account that already exists. This
     * avoids that.
     */
    if (pForceUnique) {
      SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd-HHmmssSSS");
      String date = sdf.format(new Date());
      orgName.append(" ").append(date);
    }

    // create organization -- creates an Account in Siebel
    IntegrationRepositoryItem orgItem =
      (IntegrationRepositoryItem) pRepository
        .createItem(getOrganizationItemDescriptorName());
    orgItem.setPropertyValue(PROP_ORG_NAME, orgName.toString());

    // add the organization
    IntegrationRepositoryItem addedOrgItem =
      (IntegrationRepositoryItem) pRepository.addItem(orgItem);

    if (addedOrgItem == null) {
      throw new RepositoryException(
        "There was an error creating Siebel Account.  Item is null.");
    }

    /*
     * Need to set the parent organization to 'root' or the organization will
     * not appear in the ACC.
     * 
     * Normally we'd want to see if the parent already has a child of this name,
     * but we are ensuring naming uniqueness. If that ever changes then
     * obviously this code will need to change. Take a look at
     * RepositoryUserDirectoryImpl.
     */
    // get the RepositoryUserDirectory
    RepositoryUserDirectory rud = getRepositoryUserDirectory();

    // get local organization
    Organization localOrg =
      rud.findOrganizationByPrimaryKey(addedOrgItem.getRepositoryId());

    // get root organization
    Organization parent = rud.getRootOrganization();

    // set parent
    try {
      parent.addChild(localOrg);
    } catch (DirectoryModificationException dmEx) {
      throw new RepositoryException(dmEx);
    }

    return addedOrgItem;
  }

  /**
   * This gets interesting. The Profile has a data source (i.e., user item)
   * which is actually an integration repository item. So we need to do a little
   * digging at the data to get something compatible.
   * 
   * @param pRepo
   * @param pProfile
   * @throws RepositoryException
   */
  @SuppressWarnings("unchecked")
  public void addUserAsOrganizationMember(IntegrationRepository pRepo,
    Profile pProfile) throws RepositoryException {

    IntegrationRepositoryItem user =
      (IntegrationRepositoryItem) pProfile.getDataSource();

    // get the parent organization
    MutableRepositoryItem orgItem =
      (MutableRepositoryItem) user.getPropertyValue("parentOrganization");

    // make sure we really have it
    if (orgItem == null) {
      // get by ID if we don't
      String siebelAccountId =
        (String) user.getPropertyValue(PROP_SIEBEL_ACCOUNT_ID);
      vlogDebug("User did not have parent org set.  Getting by id: {0}",
        siebelAccountId);

      // lookup by external ID
      /*
       * 1) query the local repository for the item
       * 
       * 2) get the item from remote
       * 
       * there's a problem querying the remote system at this point.
       */

      Map<String, String> constraints = new HashMap<String, String>();
      constraints.put(PROP_EXTERNAL_ID, siebelAccountId);
      // RepositoryItem[] results =
      // queryRepository(pRepo, "organization", constraints);
      RepositoryItem[] results =
        queryRepository(pRepo.getLocalRepository(), "organization", constraints);

      // there should be only one result
      if (results.length < 1) {
        vlogDebug("results was not length 1:  {0}", results.length);
        throw new RepositoryException(
          "No organization found with external id: {0}", siebelAccountId);
      }

      // set the org item based on the results
      orgItem = (MutableRepositoryItem) results[0];
    }

    // need to make sure the item is an integration repository item
    if (!(orgItem instanceof IntegrationRepositoryItem)) {
      vlogDebug("Re-getting the org item to make it an Int'Repo'Item: {0}",
        orgItem.getRepositoryId());
      orgItem =
        (MutableRepositoryItem) getSiebelAccountRepository().getItem(
          orgItem.getRepositoryId(), "organization");
    }

    // get the members Set
    @SuppressWarnings("rawtypes")
    Set members = (Set) orgItem.getPropertyValue("members");

    // add user if they aren't already a member
    if (!members.contains(user)) {

      // pass in the RepositoryItem (i.e., the "dataSource") or this won't work
      members.add(user);

      // update that item!
      pRepo.updateItem(orgItem);
    }

  }

  /**
   * This method creates organization/account at siebel side, add the
   * organization in local repository and returns the organization in a
   * RepositoryItem array
   * 
   * @param pSiebelAccountInputBean
   * @return An array of Repository Item containing the Organization as member
   * @throws RepositoryException
   * @throws Exception
   */
  public RepositoryItem[] createAccountInSiebel(
      SiebelAccountInputBean pSiebelAccountInputBean)
      throws RepositoryException, Exception {

    SelfServiceAccountExecuteInput input = constructSelfServiceAccountExecuteInput(pSiebelAccountInputBean);
    SelfServiceAccountExecuteOutput output = callSelfServiceAccountExecuteWebService(input);

    // inserting the records in local repository
    pSiebelAccountInputBean.setSiebelAccountId(output.getListOfSSAccount()
        .getAccount().get(0).getId());
    pSiebelAccountInputBean.setSiebelContactId(output.getListOfSSAccount()
        .getAccount().get(0).getListOfContact().getContact().get(0).getId());
    AccountData accountData = input.getListOfSSAccount().getAccount().get(0);
    accountData.setId(pSiebelAccountInputBean.getSiebelAccountId());
    accountData.getListOfContact().getContact().get(0)
        .setId(pSiebelAccountInputBean.getSiebelContactId());
    RepositoryItem[] organizations = getOrganizationQuery()
        .createOrganization(accountData);

    return organizations;
  }

  /**
   * The method creates the input to for SelfServiceAccountExecute web service
   * call
   * 
   * @param pSiebelAccountInputBean
   * @return SelfServiceAccountExecuteInput for
   */
  private SelfServiceAccountExecuteInput constructSelfServiceAccountExecuteInput(
      SiebelAccountInputBean pSiebelAccountInputBean) {
    // account creation
    ListOfSSAccountData listOfSSAccountData = new ListOfSSAccountData();

    List<AccountData> accountList = listOfSSAccountData.getAccount();

    AccountData accountData = new AccountData();
    accountData.setOperation(SiebelAccountConstants.CMD_INSERT);
    accountData.setCreatedBy(SiebelAccountConstants.SIEBEL_INTEGRATION);
    accountData.setName(pSiebelAccountInputBean.getAccountName());
    accountData.setMainPhoneNumber(pSiebelAccountInputBean
        .getAccountMainPhoneNumber());
    accountList.add(accountData);

    // contacts creation
    ListOfContactData listOfContactDataObj = new ListOfContactData();

    List<ContactData> contactDataList = listOfContactDataObj.getContact();

    ContactData contactData = new ContactData();
    contactData.setOperation(SiebelAccountConstants.CMD_INSERT);
    contactData.setFirstName(pSiebelAccountInputBean.getUserFirstName());
    contactData.setLastName(pSiebelAccountInputBean.getUserLastName());

    contactDataList.add(contactData);
    accountData.setListOfContact(listOfContactDataObj);

    // business address preparation
    ListOfBusinessAddressData listOfBusinessAddressData = new ListOfBusinessAddressData();
    listOfBusinessAddressData.setRecordcount(new BigInteger("0"));
    accountData.setListOfBusinessAddress(listOfBusinessAddressData);

    SelfServiceAccountExecuteInput input = new SelfServiceAccountExecuteInput();
    input.setListOfSSAccount(listOfSSAccountData);
    input.setExecutionMode(SiebelAccountConstants.SIEBEL_ACCOUNT_EXECUTION_MODE);
    input.setLOVLanguageMode(SiebelAccountConstants.SIEBEL_ACCOUNT_LOV_LANGUAGE_MODE);

    return input;
  }

  /**
   * The method makes a call to Siebel webservice SelfServiceAccountExecute and
   * returns the response
   * 
   * @param pInput
   * @return SelfServiceAccountExecuteOutput
   */
  protected SelfServiceAccountExecuteOutput callSelfServiceAccountExecuteWebService(
      SelfServiceAccountExecuteInput pInput) {

    //SelfServiceAccount_Service service = new SelfServiceAccount_Service();
    //SelfServiceAccount selfServiceAccountPort = service
    //    .getSelfServiceAccountPort();
    //getWebServiceHelper().prepareConnection(
    //    (BindingProvider) selfServiceAccountPort);

    
    //SelfServiceAccountExecuteOutput output = selfServiceAccountPort
    //    .selfServiceAccountExecute(pInput);


    SelfServiceAccountExecuteOutput output = null;
    try {
      output = (SelfServiceAccountExecuteOutput)getWebServiceController().callWebService(
              "com.siebel.selfservice.common.account.SelfServiceAccount_Service",
              "SelfServiceAccountPort",
              "selfServiceAccountExecute",
              pInput,
              this,
              getWebServiceHelper());
    } catch (ResourcePoolException e) {
      if(isLoggingError())
        logError(e.toString());
    } catch (NoSuchMethodException e) {
      if(isLoggingError())
        logError(e.toString());
    } catch (InvocationTargetException e) {
      if(isLoggingError())
        logError(e.toString());
    } catch (IllegalAccessException e) {
      if(isLoggingError())
        logError(e.toString());
    } catch (SiebelWebServiceConfigurationException e) {
      if(isLoggingError())
        logError(e.toString());
    }

    return output;

  }

  /**
   * This method update the session profile based on the organization and user
   * 
   * @param pProfile
   * @param pUserQueryConstraint
   * @param pRemoteOrg
   * @throws RepositoryException
   * @throws Exception
   */
  public void updateSeesionProfile(Profile pProfile,
      Map<String, String> pUserQueryConstraint, RepositoryItem pRemoteOrg)
      throws RepositoryException, Exception {

    /*
     * User -- this will get it locally first then get it from Siebel. This is
     * necessary at this point due to a problem with querying at this point in
     * the process.
     */
    RepositoryItem[] users = performQuery(getUserItemDescriptorName(),
        pUserQueryConstraint);

    if (users == null || users.length == 0) {
      throw new DropletException(sResourceBundle.getString(SiebelAccountConstants.SIEBEL_USER_NOT_FOUND));
    }

    // Get the user as an IntegrationRepositoryItem
    RepositoryItem remoteUser = getSiebelAccountRepository().getItem(
        users[0].getRepositoryId(), getUserItemDescriptorName());
    // sync the user data
    syncItemFromSiebel(remoteUser, getUserItemDescriptorName(), true);

    // user[0];
    pProfile.setDataSource(remoteUser);

    // Set the account as the parent organization of the current user profile
    RepositoryItem localOrg = pRemoteOrg;
    if (pRemoteOrg instanceof IntegrationRepositoryItem) {
      localOrg = ((IntegrationRepositoryItem) pRemoteOrg)
          .getLocalRepositoryItem();

    }

    pProfile.setPropertyValue("parentOrganization", localOrg);
    pProfile.setPropertyValue("password", "dummyPassword");

  }
  
  /**
   * This method creates a billing profile in siebel and updates the local
   * repository
   * 
   * @param pSiebelAccountInputBean
   * @param contact
   * @throws RepositoryException
   * @throws Exception
   */
  public void createBillingProfileInSiebel(
      SiebelAccountInputBean pSiebelAccountInputBean, RepositoryItem[] contact)
      throws RepositoryException, Exception {

    SelfServiceAccountBillingProfileExecuteInput input = constructSelfServiceAccountBillingProfileExecuteInput(pSiebelAccountInputBean);
    SelfServiceAccountBillingProfileExecuteOutput output = callSelfServiceAccountBillingProfileExecute(input);
    // get the local repository
      MutableRepository localRepo = getBillingProfileRepository()
          .getLocalMutableRepository();
      String creditCardDesc = getCreditCardDescriptorName();
      String organizationDesc = getOrganizationItemDescriptorName();
      // create item in local repository
      try {
        // Adding the new credit card details in credit-card item descriptor of
        // local repository
        if (pSiebelAccountInputBean.getPaymentMethod().equalsIgnoreCase(
            PROP_PAYMENT_METHOD_CREDIT_CARD)) {
          MutableRepositoryItem creditCardItem = localRepo
              .createItem(creditCardDesc);
//        creditCardItem.setPropertyValue(PROP_EXTERNAL_ID,
//          pSiebelAccountInputBean.getSiebelAccountId());
          if (output.getListOfSsAccountbillingprofileIo() != null
            && output.getListOfSsAccountbillingprofileIo().getComInvoiceProfile() != null
            && !output.getListOfSsAccountbillingprofileIo()
              .getComInvoiceProfile().isEmpty()) {
            creditCardItem.setPropertyValue(PROP_EXTERNAL_ID, output
              .getListOfSsAccountbillingprofileIo().getComInvoiceProfile().get(0)
              .getId());
          }
          creditCardItem.setPropertyValue(PROP_SIEBEL_ADDRESS_ID,
              pSiebelAccountInputBean.getAddressId());
          creditCardItem.setPropertyValue(PROP_CREDIT_CARD_NUMBER,
              pSiebelAccountInputBean.getCreditCardNumber());
          creditCardItem.setPropertyValue(PROP_EXPIRATION_MONTH,
              pSiebelAccountInputBean.getExpirationMonth());
          creditCardItem.setPropertyValue(PROP_EXPIRATION_YEAR,
              pSiebelAccountInputBean.getExpirationYear());
          creditCardItem.setPropertyValue(PROP_CREDIT_CARD_TYPE,
              pSiebelAccountInputBean.getCreditCardType());
          creditCardItem.setPropertyValue(PROP_CREDIT_CARD_BILLING_ADDRESS,
              contact[0]);
          localRepo.addItem(creditCardItem);

          // Adding the new credit card details in creditCards property of
          // organization item descriptor of local repository
          MutableRepositoryItem organizationItem = localRepo.getItemForUpdate(
              pSiebelAccountInputBean.getOrganizationId(), organizationDesc);
          Map creditCardsMap = (Map) organizationItem
              .getPropertyValue(PROP_ORG_CREDIT_CARDS);
          creditCardsMap.put(creditCardItem.getRepositoryId(), creditCardItem);
          organizationItem.setPropertyValue(PROP_ORG_CREDIT_CARDS,
              creditCardsMap);
          localRepo.updateItem(organizationItem);
        }
      }

      catch (RepositoryException ex) {
        ex.printStackTrace();
        if (isLoggingError()) {
          logError(ex);
        }
      }

  }

  /**
   * The method creates the input to for SelfServiceAccountBillingProfileExecute
   * web service call
   * 
   * @param pSiebelAccountInputBean
   * @return SelfServiceAccountBillingProfileExecuteInput
   */
  private SelfServiceAccountBillingProfileExecuteInput constructSelfServiceAccountBillingProfileExecuteInput(
      SiebelAccountInputBean pSiebelAccountInputBean) {

    ListOfSsAccountbillingprofileIoData listOfSsAccountbillingprofileIodata = new ListOfSsAccountbillingprofileIoData();
    List<ComInvoiceProfileData> billingProfileList = listOfSsAccountbillingprofileIodata
        .getComInvoiceProfile();

    ComInvoiceProfileData comInvoiceProfileData = new ComInvoiceProfileData();
    comInvoiceProfileData.setOperation(SiebelAccountConstants.CMD_INSERT);
    comInvoiceProfileData
        .setCreatedBy(SiebelAccountConstants.SIEBEL_INTEGRATION);
    comInvoiceProfileData.setAccountId(pSiebelAccountInputBean
        .getSiebelAccountId());

    // adding credit card details
    if (pSiebelAccountInputBean.getPaymentMethod().equalsIgnoreCase(
        PROP_PAYMENT_METHOD_CREDIT_CARD)) {
      comInvoiceProfileData.setCreditCardNumber(pSiebelAccountInputBean
          .getCreditCardNumber());
      comInvoiceProfileData
          .setCreditCardExpirationMonth(pSiebelAccountInputBean
              .getExpirationMonth());
      comInvoiceProfileData.setCreditCardExpirationYear(pSiebelAccountInputBean
          .getExpirationYear());
      comInvoiceProfileData.setCreditCardType(pSiebelAccountInputBean
          .getCreditCardType());
      comInvoiceProfileData.setPaymentMethod(pSiebelAccountInputBean
          .getPaymentMethod());
    }
    // sets the credit card status as Active
    comInvoiceProfileData.setStatus(CARD_STATUS);

    // adding address details
    comInvoiceProfileData.setStreetAddress(pSiebelAccountInputBean
        .getStreetAddress());
    comInvoiceProfileData.setState(pSiebelAccountInputBean.getState());
    comInvoiceProfileData
        .setPostalCode(pSiebelAccountInputBean.getPostalCode());

    billingProfileList.add(comInvoiceProfileData);

    SelfServiceAccountBillingProfileExecuteInput input = new SelfServiceAccountBillingProfileExecuteInput();
    input
        .setListOfSsAccountbillingprofileIo(listOfSsAccountbillingprofileIodata);
    input
        .setExecutionMode(SiebelAccountConstants.SIEBEL_ACCOUNT_EXECUTION_MODE);
    input
        .setLOVLanguageMode(SiebelAccountConstants.SIEBEL_ACCOUNT_LOV_LANGUAGE_MODE);

    return input;
  }

  /**
   * The method makes a call to Siebel webservice
   * SelfServiceAccountBillingProfileExecute and returns the response
   * 
   * @param pInput
   * @return SelfServiceAccountExecuteOutput
   * @throws DropletException
   */
  protected SelfServiceAccountBillingProfileExecuteOutput callSelfServiceAccountBillingProfileExecute(
      SelfServiceAccountBillingProfileExecuteInput pInput)
      throws DropletException {


    SelfServiceAccountBillingProfileExecuteOutput output = null;

    try {
      //SelfServiceAccountBillingProfile_Service service = new SelfServiceAccountBillingProfile_Service();
      //SelfServiceAccountBillingProfile selfServiceAccountBillingProfilePort = service
      //    .getSelfServiceAccountBillingProfilePort();
      //getWebServiceHelper().prepareConnection(
      //    (BindingProvider) selfServiceAccountBillingProfilePort);

      
      //output = selfServiceAccountBillingProfilePort
      //    .selfServiceAccountBillingProfileExecute(pInput);


      try {
        output = (SelfServiceAccountBillingProfileExecuteOutput)getWebServiceController().callWebService(
                "com.siebel.selfservice.common.accountbillingprofile.SelfServiceAccountBillingProfile_Service",
                "SelfServiceAccountBillingProfilePort",
                "selfServiceAccountBillingProfileExecute",
                pInput,
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


      if (output == null) {
        throw new DropletException(
            MessageFormat.format(
                sResourceBundle
                    .getString(SiebelAccountConstants.SIEBEL_INVALID_WEBSERVICE_RESPONSE),
                SIEBEL_WEBSERVICE_RESPONSE));
      } else {
        List<ComInvoiceProfileId> comInvoiceProfile = output
            .getListOfSsAccountbillingprofileIo().getComInvoiceProfile();

        if (comInvoiceProfile == null || comInvoiceProfile.isEmpty()) {
          throw new DropletException(
              MessageFormat.format(
                  sResourceBundle
                      .getString(SiebelAccountConstants.SIEBEL_INVALID_WEBSERVICE_RESPONSE),
                  SIEBEL_INVALID_WEBSERVICE_RESPONSE_COMINVOICEPROFILE));
        }
      }
    } catch (javax.xml.ws.soap.SOAPFaultException sfe) {
      throw new DropletException(sfe.getMessage());
    }

    return output;
  }
  
  public void syncAccountFromSiebel(RepositoryItem pProfile)
  {
    try {
      // get the parent org -- need that to continue
      RepositoryItem parentOrganization =
        (RepositoryItem) pProfile
          .getPropertyValue(getOrganizationPropertyName());
      if (parentOrganization == null
        || parentOrganization.getRepositoryId() == null)
        return;

      // get/sync the organization data
      RepositoryItem remoteOrg =
        getSiebelAccountRepository().getItem(
          parentOrganization.getRepositoryId(),
          getOrganizationItemDescriptorName());
      syncItemFromSiebel(remoteOrg,
        getOrganizationItemDescriptorName(), true);

      // get/sync the user data
      // get the item via the integration repository
      RepositoryItem remoteUser =
        getSiebelAccountRepository().getItem(pProfile.getRepositoryId(),
          getUserItemDescriptorName());
      syncItemFromSiebel(remoteUser,
        getUserItemDescriptorName(), true);

    } catch (Exception re) {
      re.printStackTrace();
    }
  }

}
