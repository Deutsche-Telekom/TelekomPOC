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

import java.io.IOException;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.ResourceBundle;

import javax.servlet.ServletException;

import atg.beans.DynamicBeans;
import atg.commerce.order.OrderHolder;
import atg.core.i18n.LayeredResourceBundle;
import atg.core.util.StringUtils;
import atg.droplet.DropletException;
import atg.droplet.GenericFormHandler;
import atg.repository.RepositoryException;
import atg.repository.RepositoryItem;
import atg.servlet.DynamoHttpServletRequest;
import atg.servlet.DynamoHttpServletResponse;
import atg.siebel.profile.SiebelProfileTools;
import atg.userprofiling.Profile;

/**
 * The Class is for creation of a new siebel account
 * 
 * @author shaikuku
 * 
 */
public class SiebelAccountCreationFormHandler extends GenericFormHandler implements SiebelAccountConstants {

  // -------------------------------------
  /** Class version string */
  public static String CLASS_VERSION = "$Id: //product/Siebel/version/11.2/src/atg/siebel/account/SiebelAccountCreationFormHandler.java#2 $$Change: 1194813 $";

  // -------------------------------------
  /** ResourceBundle **/
 // ResourceBundle
  private static ResourceBundle sResourceBundle = LayeredResourceBundle
      .getBundle(SiebelAccountConstants.SIEBEL_WEBAPP_RESOURCE_BUNDLE_NAME,
          atg.service.dynamo.LangLicense.getLicensedDefault());

  /** Form properties **/

  // Account name
  private String mAccountName;
  // Account main phone number
  private String mAccountMainPhoneNumber;
  // First name of the user
  private String mFirstName;
  // Last name of the user
  private String mLastName;
  // Success URLs
  private String mCreateOrganizationSuccessURL;
  private String mBillingProfileSuccessURL;
  
  // Failure URLs
  private String mCreateOrganizationErrorURL;
  private String mBillingProfileErrorURL;
  
  private String mSiebelAccountId;
  private String mOrganizationId;
  private String mAddressId;
  protected String mContactInfoItemDescriptorName;
  
  //Credit Card 
  private String mPaymentMethod;

  /** helper objects **/

  // SiebelAccountTools
  private SiebelAccountTools mSiebelAccountTools;
  // Profile
  private Profile mProfile;
  // SiebelProfileTools
  private SiebelProfileTools mProfileTools;
  // OrderHolder (shopping cart)
  private OrderHolder mShoppingCart;

  
  
  private SiebelAccountInputBean mSiebelAccountInputBean;
  
  
  // ------------getters and setters-------

  /**
   * @return the mProfile
   */
  public Profile getProfile() {
    return mProfile;
  }

  /**
   * @param pProfile
   *          the mProfile to set
   */
  public void setProfile(Profile pProfile) {
    this.mProfile = pProfile;
  }

  /**
   * @return the mAccountName
   */
  public String getAccountName() {
    return mAccountName;
  }

  /**
   * @param pAccountName
   *          the mAccountName to set
   */
  public void setAccountName(String pAccountName) {
    this.mAccountName = pAccountName;
  }

  /**
   * @return the mAccountMainPhoneNumber
   */
  public String getAccountMainPhoneNumber() {
    return mAccountMainPhoneNumber;
  }

  /**
   * @param pAccountMainPhoneNumber
   *          the mAccountMainPhoneNumber to set
   */
  public void setAccountMainPhoneNumber(String pAccountMainPhoneNumber) {
    this.mAccountMainPhoneNumber = pAccountMainPhoneNumber;
  }

  /**
   * @return the mFirstName
   */
  public String getFirstName() {
    return mFirstName;
  }

  /**
   * @param pFirstName
   *          the mFirstName to set
   */
  public void setFirstName(String pFirstName) {
    this.mFirstName = pFirstName;
  }

  /**
   * @return the mLastName
   */
  public String getLastName() {
    return mLastName;
  }

  /**
   * @param pLastName
   *          the mLastName to set
   */
  public void setLastName(String pLastName) {
    this.mLastName = pLastName;
  }

  public String getPaymentMethod() {
    return mPaymentMethod;
  }

  public void setPaymentMethod(String pPaymentMethod) {
    this.mPaymentMethod = pPaymentMethod;
  }

  
  public String getAddressId() {
    return mAddressId;
  }

  public void setAddressId(String pAddressId) {
    this.mAddressId = pAddressId;
  }
  
  public String getSiebelAccountId() {
    return mSiebelAccountId;
  }

  public void setSiebelAccountId(String pSiebelAccountId) {
    this.mSiebelAccountId = pSiebelAccountId;
  }

  public String getOrganizationId() {
    return mOrganizationId;
  }

  public void setOrganizationId(String pOrganizationId) {
    mOrganizationId = pOrganizationId;
  }

  /**
   * @return the mSiebelAccountTools
   */
  public SiebelAccountTools getSiebelAccountTools() {
    return mSiebelAccountTools;
  }

  /**
   * @param pSiebelAccountTools
   *          the mSiebelAccountTools to set
   */
  public void setSiebelAccountTools(SiebelAccountTools pSiebelAccountTools) {
    this.mSiebelAccountTools = pSiebelAccountTools;
  }

  /**
   * @return the mSiebelAccountTools
   */
  public SiebelAccountInputBean getSiebelAccountInputBean() {
    return mSiebelAccountInputBean;
  }

  /**
   * @param pSiebelAccountTools
   *          the mSiebelAccountTools to set
   */
  public void setSiebelAccountInputBean(SiebelAccountInputBean pSiebelAccountInputBean) {
    this.mSiebelAccountInputBean = pSiebelAccountInputBean;
  }

  
  /**
   * @return the mCreteOrganizationSuccessURL
   */
  public String getCreateOrganizationSuccessURL() {
    return mCreateOrganizationSuccessURL;
  }

  /**
   * @param pCreateOrganizationSuccessURL
   *          the mCreateOrganizationSuccessURL to set
   */
  public void setCreateOrganizationSuccessURL(String pCreateOrganizationSuccessURL) {
    this.mCreateOrganizationSuccessURL = pCreateOrganizationSuccessURL;
  }

  /**
   * @return the mCreateOrganizationErrorURL
   */
  public String getCreateOrganizationErrorURL() {
    return mCreateOrganizationErrorURL;
  }

  /**
   * @param pCreateOrganizationErrorURL
   *          the mCreateOrganizationErrorURL to set
   */
  public void setCreateOrganizationErrorURL(String pCreateOrganizationErrorURL) {
    this.mCreateOrganizationErrorURL = pCreateOrganizationErrorURL;
  }

  public String getBillingProfileSuccessURL() {
    return mBillingProfileSuccessURL;
  }

  public void setBillingProfileSuccessURL(String pBillingProfileSuccessURL) {
    mBillingProfileSuccessURL = pBillingProfileSuccessURL;
  }

  public String getBillingProfileErrorURL() {
    return mBillingProfileErrorURL;
  }

  public void setBillingProfileErrorURL(String pBillingProfileErrorURL) {
    mBillingProfileErrorURL = pBillingProfileErrorURL;
  }

  /**
   * @return the mProfileTools
   */
  public SiebelProfileTools getProfileTools() {
    return mProfileTools;
  }

  /**
   * @param pProfileTools
   *          the mProfileTools to set
   */
  public void setProfileTools(SiebelProfileTools pProfileTools) {
    mProfileTools = pProfileTools;
  }

 
  /**
   * @return the mShoppingCart
   */
  
  public OrderHolder getShoppingCart() {
    return mShoppingCart;
  }
  

  /**
   * @param pShoppingCart
   *          the mShoppingCart to set
   */
  
  public void setShoppingCart(OrderHolder pShoppingCart) {
    mShoppingCart = pShoppingCart;
  }
  
  /**
   * Sets the property ContactInfoItemDescriptorName. description: the name of the contactInfo
   * item descriptor in the profile repository
   */
  public void setContactInfoItemDescriptorName(String pContactInfoItemDescriptorName) {
    mContactInfoItemDescriptorName = pContactInfoItemDescriptorName;
  }

  /**
   * @return The value of the property ContactInfoItemDescriptorName.
   */
  public String getContactInfoItemDescriptorName() {
    return mContactInfoItemDescriptorName;
  }

 
  // ----Methods----------------------

  /**
   * This method creates an account in Siebel and sync the account with local repository
   * @param pRequest
   * @param pResponse
   * @return
   * @throws ServletException
   * @throws IOException
   */
  public boolean handleCreateAccount(DynamoHttpServletRequest pRequest,
      DynamoHttpServletResponse pResponse) throws ServletException, IOException {
    try {      
      // create account at Siebel side and update the Profile adapter Repository
      RepositoryItem[] accounts = getSiebelAccountTools()
          .createAccountInSiebel(mSiebelAccountInputBean);

      // sync the session profile
      if (accounts != null && accounts.length > 0) {
        Map<String, String> userQueryConstraint = new HashMap<String, String>();
        userQueryConstraint.put("firstName",mSiebelAccountInputBean.getUserFirstName());
        userQueryConstraint.put("lastName", mSiebelAccountInputBean.getUserLastName());
        userQueryConstraint.put("siebelId",
            mSiebelAccountInputBean.getSiebelContactId());
        getSiebelAccountTools().updateSeesionProfile(getProfile(),
            userQueryConstraint, accounts[0]);

      } else {
        addFormException(new DropletException(
            sResourceBundle
                .getString(SiebelAccountConstants.SIEBEL_GENERIC_EXCEPTION_MESSAGE)));
      }

      getProfileTools().persistShoppingCarts(getProfile(), getShoppingCart());

    } catch (RepositoryException rpex) {

      addFormException(new DropletException(
          sResourceBundle
              .getString(SiebelAccountConstants.SIEBEL_GENERIC_EXCEPTION_MESSAGE)));
      if (isLoggingError()) {
        logError(rpex);
      }

    } catch (Exception ex) {
      addFormException(new DropletException(ex.getMessage()));
      if (isLoggingError()) {
        logError(ex);
      }

    }

    // If form errors are found, redirect to the error URL else redirect to
    // successURL.
    return checkFormRedirect(getCreateOrganizationSuccessURL(),
        getCreateOrganizationErrorURL(), pRequest, pResponse);

  }
  
  /**
   * This method creates a billing profile Siebel and updates the information in
   * the local repository
   * 
   * @param pRequest
   * @param pResponse
   * @return
   * @throws ServletException
   * @throws IOException
   */
  public boolean handleCreateBillingProfile(DynamoHttpServletRequest pRequest,
      DynamoHttpServletResponse pResponse) throws ServletException, IOException {

    try {

      // get the contactInfo item using the id
      Map<String, String> contactQueryConstraint = new HashMap<String, String>();
      contactQueryConstraint.put(INPUT_KEY_ID,
          mSiebelAccountInputBean.getAddressId());
      RepositoryItem[] contact = getSiebelAccountTools().performQuery(
          getContactInfoItemDescriptorName(), contactQueryConstraint);

      // set the properties of the retrieved item to the SiebelAccountInputBean
      mSiebelAccountInputBean.setStreetAddress((String) contact[0]
          .getPropertyValue(PROP_CONTACT_ADDRESS1));
      mSiebelAccountInputBean.setCity((String) contact[0]
          .getPropertyValue(PROP_CONTACT_CITY));
      mSiebelAccountInputBean.setState((String) contact[0]
          .getPropertyValue(PROP_CONTACT_STATE));
      mSiebelAccountInputBean.setPostalCode((String) contact[0]
          .getPropertyValue(PROP_CONTACT_POSTALCODE));

      mSiebelAccountInputBean.setPaymentMethod(getPaymentMethod());
      // creates a billing profile
      getSiebelAccountTools().createBillingProfileInSiebel(
          mSiebelAccountInputBean, contact);

    } catch (Exception ex) {
      addFormException(new DropletException(ex.getMessage()));
      if (isLoggingError()) {
        logError(ex);
      }
    }

    return checkFormRedirect(getBillingProfileSuccessURL(),
        getBillingProfileErrorURL(), pRequest, pResponse);
  }

}
