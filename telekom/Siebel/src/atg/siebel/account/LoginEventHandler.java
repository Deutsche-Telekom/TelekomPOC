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

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.ObjectMessage;

import atg.adapter.integrations.IntegrationRepository;
import atg.core.util.StringUtils;
import atg.dms.patchbay.MessageSink;
import atg.nucleus.GenericService;
import atg.repository.Repository;
import atg.repository.RepositoryException;
import atg.repository.RepositoryItem;
import atg.userprofiling.dms.DPSMessage;

/**
 * Handler for login events that trigger synchronization with Siebel
 * 
 * @author Kurt Matarese
 * @version $Id:
 *          //dev/horizon/main/projects/Siebel/src/atg/siebel/account/LoginEventHandler
 *          .java#4 $$Change: 1194813 $
 * @updated $DateTime: 2015/09/10 08:26:24 $$Author: saysyed $
 **/
public class LoginEventHandler
  extends GenericService
  implements MessageSink {

  // -------------------------------------
  /** Class version string */

  public static String CLASS_VERSION =
    "$Id: //product/Siebel/version/11.2/src/atg/siebel/account/LoginEventHandler.java#2 $$Change: 1194813 $";

  // -------------------------------------
  // Constants
  // -------------------------------------

  // -------------------------------------
  // Properties
  // -------------------------------------

  // --------- Property: OrganizationItemDescriptorName ---------------
  String mOrganizationItemDescriptorName = null;

  /**
   * @description: The name of the organization item descriptor in the profile
   *               repository
   */
  public void setOrganizationItemDescriptorName(
    String pOrganizationItemDescriptorName) {
    mOrganizationItemDescriptorName = pOrganizationItemDescriptorName;
  }

  /**
   * @return The name of the organization item descriptor in the profile
   *         repository
   */
  public String getOrganizationItemDescriptorName() {
    return mOrganizationItemDescriptorName;
  }

  // --------- Property: UserItemDescriptorName ---------------
  String mUserItemDescriptorName = null;

  /**
   * @description: The name of the user item descriptor in the profile
   *               repository
   */
  public void setUserItemDescriptorName(String pUserItemDescriptorName) {
    mUserItemDescriptorName = pUserItemDescriptorName;
  }

  /**
   * @return The name of the user item descriptor in the profile repository
   */
  public String getUserItemDescriptorName() {
    return mUserItemDescriptorName;
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

  // --------- Property: ProfileRepository ---------------
  Repository mProfileRepository;

  /**
   * @description: The local ATG profile repository
   */
  public void setProfileRepository(Repository pProfileRepository) {
    mProfileRepository = pProfileRepository;
  }

  /**
   * @return The local ATG profile repository
   */
  public Repository getProfileRepository() {
    return mProfileRepository;
  }

  // --------- Property: SiebelAccountRepository -----------
  protected IntegrationRepository mSiebelAccountRepository;

  /**
   * @description: The integration repository used to interact with Siebel when
   *               managing customer accounts.
   */
  public void setSiebelAccountRepository(
    IntegrationRepository pSiebelAccountRepository) {
    mSiebelAccountRepository = pSiebelAccountRepository;
  }

  /**
   * @return The integration repository used to interact with Siebel when
   *         managing customer accounts.
   */
  public IntegrationRepository getSiebelAccountRepository() {
    return mSiebelAccountRepository;
  }

  // --------- Property: SiebelAccountTools -----------
  SiebelAccountTools mSiebelAccountTools;

  /**
   * @description: The tools class for working with Siebel accounts
   */
  public void setSiebelAccountTools(SiebelAccountTools pSiebelAccountTools) {
    mSiebelAccountTools = pSiebelAccountTools;
  }

  /**
   * @return The tools class for working with Siebel accounts
   */
  public SiebelAccountTools getSiebelAccountTools() {
    return mSiebelAccountTools;
  }

  // -------------------------------------
  // Methods
  // -------------------------------------

  /**
   * Receives a JMS message when a user logs in to the web site. This method
   * triggers a "get" request for the user parent organization in the
   * SiebelAccountRepository. This will trigger a web service request that will
   * sync the account information from the Siebel system.
   */
  public void receiveMessage(String pPortName, Message pMessage)
    throws JMSException {

    vlogDebug("LoginEventHandler:receiveMessage - portName: {0}, message: {1}",
      pPortName, ((ObjectMessage) pMessage).getObject());

    // Get the object of the message
    Object profileObject = ((ObjectMessage) pMessage).getObject();
    if (profileObject == null) {
      if (isLoggingDebug())
        logDebug("LoginEventHandler:receiveMessage: blank message object");
      return;
    }

    // Retrieve the profile ID from the message object
    String profileId = null;
    if (profileObject instanceof DPSMessage) {
      profileId = ((DPSMessage) profileObject).getProfileId();
    } else {
      if (isLoggingDebug())
        logDebug("LoginEventHandler:receiveMessage: unknown message object type");
      return;
    }

    if (profileId == null) {
      if (isLoggingDebug())
        logDebug("LoginEventHandler:receiveMessage: no profileId found");
      return;
    }

    // Check for local profile by id
    RepositoryItem profile = null;
    try {
      profile =
        getProfileRepository().getItem(profileId,
          getSiebelAccountTools().getUserItemDescriptorName());
    } catch (RepositoryException e) {
      e.printStackTrace();
    }

    if (profile == null) {
      if (isLoggingDebug())
        logDebug("LoginEventHandler:receiveMessage: no profile found");
      return;
    }
    vlogDebug("LoginEventHandler:receiveMessage:profile: {0}", profile);

    // Check if there is a siebel ID for that profile
    Object siebelId = profile.getPropertyValue("siebelId");
    if (!(siebelId instanceof String)) {
      if (isLoggingDebug())
        logDebug("LoginEventHandler:receiveMessage: siebelId type should be String");
      return;
    }
    if (StringUtils.isBlank((String) siebelId)) {
      if (isLoggingDebug())
        logDebug("LoginEventHandler:receiveMessage: siebelId not found");
      return;
    }
    vlogDebug("LoginEventHandler:receiveMessage:siebelId: {0}", siebelId);

    // Get the parent organization from the profile and access it through
    // the integration repository. This will result in a Siebel webservices
    // call that will synchronize the account data.
    try {
      // get the parent org -- need that to continue
      RepositoryItem parentOrganization =
        (RepositoryItem) profile
          .getPropertyValue(getOrganizationPropertyName());
      if (parentOrganization == null
        || parentOrganization.getRepositoryId() == null)
        return;

      // get/sync the organization data
      RepositoryItem remoteOrg =
        getSiebelAccountRepository().getItem(
          parentOrganization.getRepositoryId(),
          getOrganizationItemDescriptorName());
      getSiebelAccountTools().syncItemFromSiebel(remoteOrg,
        getOrganizationItemDescriptorName(), true);

      // get/sync the user data
      // get the item via the integration repository
      RepositoryItem remoteUser =
        getSiebelAccountRepository().getItem(profile.getRepositoryId(),
          getSiebelAccountTools().getUserItemDescriptorName());
      getSiebelAccountTools().syncItemFromSiebel(remoteUser,
        getUserItemDescriptorName(), true);

    } catch (Exception re) {
      re.printStackTrace();
    }

  }

}