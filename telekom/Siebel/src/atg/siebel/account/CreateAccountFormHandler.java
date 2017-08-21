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

import javax.servlet.ServletException;

import atg.adapter.integrations.IntegrationRepository;
import atg.repository.Repository;
import atg.servlet.DynamoHttpServletRequest;
import atg.servlet.DynamoHttpServletResponse;
import atg.userdirectory.droplet.CreateOrganizationFormHandler;
import atg.userdirectory.repository.OrganizationalEntityImpl;
import atg.userdirectory.repository.RepositoryUserDirectoryImpl;
import atg.userprofiling.Profile;

/**
 * This form handler extends the CreateOrganizationFormHandler to set a new
 * account as the parent organization for the current user.
 * 
 * @author Paul O'Brien
 * @version $Id: //dev/horizon/main/projects/Siebel/src/atg/siebel/account/
 *          CreateAccountFormHandler.java#1 $$Change: 1194813 $
 * @updated $DateTime: 2015/09/10 08:26:24 $$Author: saysyed $
 */

public class CreateAccountFormHandler
  extends CreateOrganizationFormHandler {

  // -------------------------------------
  /** Class version string */
  public static final String CLASS_VERSION =
    "$Id: //product/Siebel/version/11.2/src/atg/siebel/account/CreateAccountFormHandler.java#2 $$Change: 1194813 $";

  // --------- Property: Profile -----------
  protected Profile mProfile;

  /**
   * Sets the property Profile. description: the current user profile
   */
  public void setProfile(Profile pProfile) {
    mProfile = pProfile;
  }

  /**
   * @return The value of the property Profile.
   */
  public Profile getProfile() {
    return mProfile;
  }

  // --------- Property: SiebelAccountTools -----------
  SiebelAccountTools mSiebelAccountTools = null;

  /**
   * @return SiebelAccountTools
   */
  public SiebelAccountTools getSiebelAccountTools() {
    return mSiebelAccountTools;
  }

  /**
   * @param pSiebelAccountTools
   */
  public void setSiebelAccountTools(SiebelAccountTools pSiebelAccountTools) {
    mSiebelAccountTools = pSiebelAccountTools;
  }

  /**
   * Because
   * {@link #createOrganization(DynamoHttpServletRequest, DynamoHttpServletResponse)}
   * will ultimately try to create the 'root' organization this method needs to
   * be overridden to query for it first. The integration repository will pass
   * this query through and if the 'root' organization already exists in the
   * Siebel system it will pull that data back into ATG.
   * 
   * {@inheritDoc}
   * 
   * @see atg.userdirectory.droplet.CreateOrganizationFormHandler#preCreateOrganization(atg.servlet.DynamoHttpServletRequest,
   *      atg.servlet.DynamoHttpServletResponse)
   */
  @Override
  public void preCreateOrganization(DynamoHttpServletRequest pRequest,
    DynamoHttpServletResponse pResponse) throws ServletException, IOException {

    /*
     * This will create the root organization locally if it does not already
     * exist. When it is saved in the IR it will be pushed over to Siebel; if it
     * already exists it will be linked.
     */
    RepositoryUserDirectoryImpl rud =
      (RepositoryUserDirectoryImpl) getRepositoryUserDirectory();
    Repository repo = rud.getRepository();
    Repository tmpRepo = null;
    if (repo instanceof IntegrationRepository) {
      tmpRepo = ((IntegrationRepository) repo).getLocalRepository();
      rud.setRepository(tmpRepo);
    }
    rud.getRootOrganization();

    /*
     * Bit of a switcheroo here. We want the root created in the local
     * repository, but the rest of the functionality to resume in the
     * integration repository
     */
    if (tmpRepo != null) {
      rud.setRepository(repo);
    }

    super.preCreateOrganization(pRequest, pResponse);
  }

  /**
   * Operation called after the organization is created. This sets the parent
   * organization on the profile.
   * 
   * NOTE: If this is called from the initial form where no one is logged in the
   * profile being updated is a transitory profile.
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
  public void postCreateOrganization(DynamoHttpServletRequest pRequest,
    DynamoHttpServletResponse pResponse) throws ServletException, IOException {

    if (getOrganization() instanceof OrganizationalEntityImpl)
      getProfile().setPropertyValue("parentOrganization",
        ((OrganizationalEntityImpl) getOrganization()).getRepositoryItem());
  }
}
