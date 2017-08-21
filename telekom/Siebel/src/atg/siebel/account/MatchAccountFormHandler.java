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
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.servlet.ServletException;

import atg.adapter.integrations.IntegrationRepositoryItem;
import atg.commerce.CommerceException;
import atg.commerce.order.OrderHolder;
import atg.core.util.StringUtils;
import atg.droplet.DropletException;
import atg.droplet.GenericFormHandler;
import atg.repository.MutableRepository;
import atg.repository.MutableRepositoryItem;
import atg.repository.RepositoryException;
import atg.repository.RepositoryItem;
import atg.servlet.DynamoHttpServletRequest;
import atg.servlet.DynamoHttpServletResponse;
import atg.siebel.profile.SiebelProfileTools;
import atg.userprofiling.Profile;

/**
 * This form handler handles matching a remote Siebel account & contact based on
 * a map of query constraints. The "primary" query constraints will match on the
 * account, while the "secondary" will match on the contact.
 * 
 * @author Paul O'Brien
 * @version $Id: //dev/horizon/main/projects/Siebel/src/atg/siebel/account/
 *          MatchAccountFormHandler.java#4 $$Change: 1194813 $
 * @updated $DateTime: 2015/09/10 08:26:24 $$Author: saysyed $
 */

public class MatchAccountFormHandler
  extends GenericFormHandler {
  // -------------------------------------
  /** Class version string */
  public static final String CLASS_VERSION =
    "$Id: //product/Siebel/version/11.2/src/atg/siebel/account/MatchAccountFormHandler.java#2 $$Change: 1194813 $";

  // -------------------------------------
  // Property: queryConstraints
  // -------------------------------------
  protected Map<String, String> mQueryConstraints =
    new HashMap<String, String>();

  /**
   * @return Returns the map of query constraints. The keys are the names of the
   *         properties to query on.
   */
  public Map<String, String> getQueryConstraints() {
    return mQueryConstraints;
  }

  /**
   * @param pQueryConstraints
   *          The map of query constraints. The keys are the names of the
   *          properties to query on.
   * @beaninfo description: The map of query constraints. The keys are the names
   *           of the properties to query on.
   */
  public void setQueryConstraints(Map<String, String> pQueryConstraints) {
    mQueryConstraints = pQueryConstraints;
  }

  // -------------------------------------
  // Property: secondaryQueryConstraints
  // -------------------------------------
  protected Map<String, String> mSecondaryQueryConstraints =
    new HashMap<String, String>();

  /**
   * @return Returns the map of query constraints. The keys are the names of the
   *         properties to query on.
   */
  public Map<String, String> getSecondaryQueryConstraints() {
    return mSecondaryQueryConstraints;
  }

  /**
   * @param pQueryConstraints
   *          The map of query constraints. The keys are the names of the
   *          properties to query on.
   * @beaninfo description: The map of query constraints. The keys are the names
   *           of the properties to query on.
   */
  public void setSecondaryQueryConstraints(
    Map<String, String> pSecondaryQueryConstraints) {
    mSecondaryQueryConstraints = pSecondaryQueryConstraints;
  }

  // -------------------------------------
  // Property: itemDescriptorName
  // -------------------------------------
  protected String mItemDescriptorName;

  /**
   * @return String of the Item Descriptor Name set in the JSP.
   */
  public String getItemDescriptorName() {
    return mItemDescriptorName;
  }

  /**
   * @param pItemDescriptorName
   *          The name of the item descriptor in the local repository to query
   *          for
   * @beaninfo description: The name of the item descriptor in the local
   *           repository to query for
   */
  public void setItemDescriptorName(String pItemDescriptorName) {
    mItemDescriptorName = pItemDescriptorName;
  }

  // -------------------------------------
  // Property: secondaryItemDescriptorName
  // -------------------------------------
  protected String mSecondaryItemDescriptorName;

  /**
   * @return String of the Item Descriptor Name set in the JSP.
   */
  public String getSecondaryItemDescriptorName() {
    return mSecondaryItemDescriptorName;
  }

  /**
   * @param pItemDescriptorName
   *          The name of the item descriptor in the local repository to query
   *          for
   * @beaninfo description: The name of the item descriptor in the local
   *           repository to query for
   */
  public void
    setSecondaryItemDescriptorName(String pSecondaryItemDescriptorName) {
    mSecondaryItemDescriptorName = pSecondaryItemDescriptorName;
  }

  // -------------------------------------
  // Property: profile
  // -------------------------------------
  protected Profile mProfile;

  /**
   * @return The current user profile.
   */
  public Profile getProfile() {
    return mProfile;
  }

  /**
   * @param pProfile
   *          the current user profile
   * @beaninfo description: The current user profile
   */
  public void setProfile(Profile pProfile) {
    mProfile = pProfile;
  }

  // -------------------------------------
  // Property: alphanumericProperties
  // -------------------------------------
  protected List<String> mAlphanumericProperties;

  /**
   * @return The properties whose values should only contain alphanumeric
   *         characters.
   */
  public List<String> getAlphanumericProperties() {
    return mAlphanumericProperties;
  }

  /**
   * @param pAlphanumericProperties
   *          The properties whose values should only contain alphanumeric
   *          characters.
   * @beaninfo description: The properties whose values should only contain
   *           alphanumeric characters.
   */
  public void setAlphanumericProperties(List<String> pAlphanumericProperties) {
    mAlphanumericProperties = pAlphanumericProperties;
  }

  // -------------------------------------
  // Property: siebelAccountTools
  // -------------------------------------
  protected SiebelAccountTools mSiebelAccountTools;

  /**
   * @return The SiebelAccountTools instance
   */
  public SiebelAccountTools getSiebelAccountTools() {
    return mSiebelAccountTools;
  }

  /**
   * @param pSiebelAccountTools
   *          the SiebelAccountTools instance
   * @beaninfo description: The SiebelAccountTools instance
   */
  public void setSiebelAccountTools(SiebelAccountTools pSiebelAccountTools) {
    mSiebelAccountTools = pSiebelAccountTools;
  }

  // -------------------------------------
  // Property: successURL
  // -------------------------------------
  protected String mSuccessURL;

  /**
   * @return Returns the successURL.
   */
  public String getSuccessURL() {
    return mSuccessURL;
  }

  /**
   * @param pSuccessURL
   *          The successURL to set.
   * @beaninfo description: the property to store the success url
   */
  public void setSuccessURL(String pSuccessURL) {
    mSuccessURL = pSuccessURL;
  }

  // -------------------------------------
  // Property: errorURL
  // -------------------------------------
  protected String mErrorURL;

  /**
   * @return Returns the errorURL.
   */
  public String getErrorURL() {
    return mErrorURL;
  }

  /**
   * @param pErrorURL
   *          The errorURL to set.
   * @beaninfo description: the property to store the error url
   */
  public void setErrorURL(String pErrorURL) {
    mErrorURL = pErrorURL;
  }
  
  // -------------------------------------
  // Property: shoppingCart
  // -------------------------------------
  protected OrderHolder mShoppingCart;

  /**
   * Returns the shoppingCart.
   */
  public OrderHolder getShoppingCart() {
    return mShoppingCart;
  }

  /**
   * Sets the shopping cart
   */
  public void setShoppingCart(OrderHolder pShoppingCart) {
  	mShoppingCart = pShoppingCart;
  }
  
  //-------------------------------------
  // property: profileTools
  //-------------------------------------
  private SiebelProfileTools mProfileTools = null;

  /**
   * Returns the profileTools
   */
  public SiebelProfileTools getProfileTools() {
    return mProfileTools;
  }

  /**
   * Sets the profileTools
   */
  public void setProfileTools(SiebelProfileTools pProfileTools) {
    mProfileTools = pProfileTools;
  }

  // -------------------------------------
  // Constructors
  // -------------------------------------

  /**
   * Constructs an instanceof MatchAccountFormHandler
   */
  public MatchAccountFormHandler() {
  }

  /**
   * Try to find a matching Siebel account & contact based on the query
   * constraints
   * 
   * @param pRequest
   *          the servlet's request
   * @param pResponse
   *          the servlet's response
   * @exception ServletException
   *              if there was an error while executing the code
   * @exception IOException
   *              if there was an error with servlet io
   */
  public boolean handleMatchAccount(DynamoHttpServletRequest pRequest,
    DynamoHttpServletResponse pResponse) throws ServletException, IOException {

    vlogDebug("handleMatchAccount -- entering");

    try {
      // If any form errors found, redirect to error URL:
      if (!checkFormRedirect(null, getErrorURL(), pRequest, pResponse))
        return false;

      /*
       * Organization -- this will get it locally first then get it from Siebel.
       * This is necessary at this point due to a problem with querying at this
       * point in the process.
       */
      RepositoryItem[] organization =
        performQuery(getQueryConstraints(), getItemDescriptorName());

      if (organization == null || organization.length == 0)
        addFormException(new DropletException(
          "No account matches the given criteria"));

      // If any form errors found, redirect to error URL:
      if (!checkFormRedirect(null, getErrorURL(), pRequest, pResponse))
        return false;

      // sync the account data
      RepositoryItem remoteOrg = organization[0];
      getSiebelAccountTools().syncItemFromSiebel(remoteOrg,
        getItemDescriptorName(), true);

      // If any form errors found, redirect to error URL:
      if (!checkFormRedirect(null, getErrorURL(), pRequest, pResponse))
        return false;

      /*
       * User -- this will get it locally first then get it from Siebel. This is
       * necessary at this point due to a problem with querying at this point in
       * the process.
       */
      RepositoryItem[] users =
        performQuery(getSecondaryQueryConstraints(),
          getSecondaryItemDescriptorName());

      // If any form errors found, redirect to error URL:
      if (!checkFormRedirect(null, getErrorURL(), pRequest, pResponse))
        return false;

      if (users == null || users.length == 0) {
        addFormException(new DropletException(
          "No user matches the given criteria"));
        return false;
      }

      // If any form errors found, redirect to error URL:
      if (!checkFormRedirect(null, getErrorURL(), pRequest, pResponse))
        return false;

      // Get the user as an IntegrationRepositoryItem
      RepositoryItem remoteUser =
        getSiebelAccountTools().getSiebelAccountRepository().getItem(
          users[0].getRepositoryId(), getSecondaryItemDescriptorName());
      // sync the user data
      getSiebelAccountTools().syncItemFromSiebel(remoteUser,
        getSecondaryItemDescriptorName(), true);

      /*
       * Update the Local Repository with the current account Id after the sync.
       * Since the usage of any other account's contact may result a different
       * account Id,this ensures that the current account is used.
       */
      String siebelId = (String) remoteOrg.getPropertyValue("siebelId");
      MutableRepository mutableRepository = (MutableRepository) users[0]
          .getRepository();
      MutableRepositoryItem mutableUser = mutableRepository.getItemForUpdate(
          users[0].getRepositoryId(), users[0].getItemDescriptor()
              .getItemDescriptorName());
      mutableUser.setPropertyValue("siebelAccountId", siebelId);
      mutableRepository.updateItem(mutableUser);

      getProfile().setDataSource(users[0]);

      // Set the account as the parent organization of the current user profile
      RepositoryItem localOrg = remoteOrg;
      if (remoteOrg instanceof IntegrationRepositoryItem)
        localOrg =
          ((IntegrationRepositoryItem) remoteOrg).getLocalRepositoryItem();

      getProfile().setPropertyValue("parentOrganization", localOrg);
      getProfile().setPropertyValue("password", "dummyPassword");
      getProfileTools().persistShoppingCarts(getProfile(), getShoppingCart());

      vlogDebug("handleMatchAccount -- returning");

      // If NO form errors are found, redirect to the success URL.
      // If form errors are found, redirect to the error URL.
      return checkFormRedirect(getSuccessURL(), getErrorURL(), pRequest,
        pResponse);
    } catch (RepositoryException re) {
      throw new ServletException(re);
    } catch (CommerceException e) {
      throw new ServletException(e);
    }
  }

  /**
   * Validate the query constraints, then perform a query using the constraints
   * on the given item descriptor
   */
  public RepositoryItem[] performQuery(Map<String, String> pQueryConstraints,
    String pItemDescriptorName) {

    if (!validateQueryConstraints(pQueryConstraints)) {
      addFormException(new DropletException(
        "Values must be provided for all search fields"));
      return null;
    }

    return getSiebelAccountTools().performQuery(pItemDescriptorName,
      pQueryConstraints);
  }

  /**
   * Assure that all query fields have non-null values, and strip any properties
   * that are listed as "alphanumeric" properties of all non-alphanumeric
   * characters
   */
  public boolean
    validateQueryConstraints(Map<String, String> pQueryConstraints) {

    List<String> alphanumericProperties = getAlphanumericProperties();

    Set<String> keys = pQueryConstraints.keySet();
    Iterator<String> keyIter = keys.iterator();
    while (keyIter.hasNext()) {
      String key = (String) keyIter.next();
      String value = (String) pQueryConstraints.get(key);
      if (StringUtils.isEmpty(value))
        return false;

      if (alphanumericProperties.contains(key)) {
        value = value.replaceAll("[^a-zA-Z0-9]", "");
        pQueryConstraints.put(key, value);
      }
    }

    return true;
  }
}