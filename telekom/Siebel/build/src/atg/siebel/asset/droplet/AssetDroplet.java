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

package atg.siebel.asset.droplet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;

import atg.servlet.DynamoHttpServletRequest;
import atg.servlet.DynamoHttpServletResponse;
import atg.servlet.DynamoServlet;
import atg.siebel.asset.SiebelAsset;
import atg.siebel.asset.SiebelAssetList;
import atg.siebel.asset.SiebelAssetTools;
import atg.siebel.profile.SiebelProfileTools;
import atg.userprofiling.Profile;

public class AssetDroplet extends DynamoServlet {

  //-------------------------------------
  /** Class version string */

  public static String CLASS_VERSION = "$Id: //product/Siebel/version/11.2/src/atg/siebel/asset/droplet/AssetDroplet.java#2 $$Change: 1194813 $";

  // INPUT PARAMS
  public static final String INPUT_ACCOUNT_ID_PARAM = "accountId";
  public static final String INPUT_CONTACT_ID_PARAM = "contactId";
  public static final String INPUT_PAGE_NUM_PARAM = "pageNum";

  // OUTPUT PARAMS
  public static final String OUTPUT_MESSAGE = "message";
  public static final String OUTPUT_SUCCESS = "success";
  public static final String OUTPUT_ASSETS = "assets";
  public static final String OUTPUT_ASSETS_ON_PAGE = "assetsOnPage";
  public static final String OUTPUT_NO_OF_PAGES = "noOfPages";
  public static final String OUTPUT_ERROR_MESSAGE = "errorMessage";

  // OPARAMS
  public static final String OPARAM_OUTPUT = "output";
  public static final String OPARAM_EMPTY = "empty";
  public static final String OPARAM_ERROR = "error";

  // -------------------------------------
  // Properties
  // -------------------------------------

  // -------------------------------------
  // property: siebelAssetTools
  private SiebelAssetTools sblAssetTools;

  public SiebelAssetTools getSiebelAssetTools() {
    return sblAssetTools;
  }

  public void setSiebelAssetTools(SiebelAssetTools _sblAssetTools) {
    sblAssetTools = _sblAssetTools;
  }

  // -------------------------------------
  // property: assetsDisplayedOnPage
  private int assetsDisplayedOnPage;

  public int getAssetsDisplayedOnPage() {
    return assetsDisplayedOnPage;
  }

  public void setAssetsDisplayedOnPage(int _assetsDisplayedOnPage) {
    assetsDisplayedOnPage = _assetsDisplayedOnPage;
  }

  // property: Profile
  protected Profile mProfile;

  public Profile getProfile() {
    return mProfile;
  }

  public void setProfile(Profile pProfile) {
    mProfile = pProfile;
  }
  
  // property: SiebelAssetList
  protected SiebelAssetList mSiebelAssetList;

  public SiebelAssetList getSiebelAssetList() {
    return mSiebelAssetList;
  }

  public void setSiebelAssetList(SiebelAssetList pSiebelAssetList) {
    this.mSiebelAssetList = pSiebelAssetList;
  }

  /** {@inheritDoc} */
  @Override
  public void service(DynamoHttpServletRequest req,
      DynamoHttpServletResponse res) throws ServletException, IOException {

    String accountId = req.getParameter(INPUT_ACCOUNT_ID_PARAM);
    String contactId = req.getParameter(INPUT_CONTACT_ID_PARAM);
    int pageNum = 1;

    // Bug 17439558-Check if the profile is logged in and add error meesage if
    // not
    if (getProfile() == null) {
      req.serviceParameter(OPARAM_ERROR, req, res);
      return;
    }

    if (getProfile().isTransient()) {
      req.setParameter(OUTPUT_ERROR_MESSAGE, "assetTransient");
      req.serviceParameter(OPARAM_ERROR, req, res);
      return;
    }

    if (!((SiebelProfileTools) getProfile().getProfileTools())
        .isLoginUser(getProfile())) {
      req.setParameter(OUTPUT_ERROR_MESSAGE, "assetNotLoggedIn");
      req.serviceParameter(OPARAM_ERROR, req, res);
      return;
    }

    if (null != req.getParameter(INPUT_PAGE_NUM_PARAM)) {
      pageNum = Integer.valueOf(
          ((String) req.getParameter(INPUT_PAGE_NUM_PARAM))).intValue();
    }

    if (isLoggingDebug()) {
      logDebug("Account id is: " + accountId);
      logDebug("Contact id is: " + contactId);
    }

    if (accountId == null && contactId == null) {
      throw new ServletException("No accountId or contactId specified!!");
    }

    ArrayList<SiebelAsset> assets = null;
    try {
      assets = sblAssetTools.getAssets(accountId, contactId, "Active",
          calcStartIndex(pageNum), calcEndIndex(pageNum), getSiebelAssetList());
    } catch (Exception ex) {
      ex.printStackTrace();
    }

    req.setParameter(OUTPUT_ASSETS, assets);

    if (null == assets) {
      req.serviceParameter(OPARAM_EMPTY, req, res);
    } else {
      req.setParameter(OUTPUT_NO_OF_PAGES, calcNoOfPages(getSiebelAssetList().getCustomerAssets().size()));
      req.setParameter(OUTPUT_ASSETS_ON_PAGE, assetsDisplayedOnPage);
      req.serviceParameter(OPARAM_OUTPUT, req, res);
    }

  }

  private int calcNoOfPages(int assetSize) {
    if (assetSize > 0) {
      if (assetSize < assetsDisplayedOnPage) {
        return 1;
      } else {
        if ((assetSize % assetsDisplayedOnPage) > 0) {
          return (assetSize / assetsDisplayedOnPage) + 1;
        } else {
          return assetSize / assetsDisplayedOnPage;
        }
      }
    } else {
      return 0;
    }
  }

  private int calcStartIndex(int pageNum) {
    return (pageNum - 1) * assetsDisplayedOnPage;
  }

  private int calcEndIndex(int pageNum) {
    return (pageNum * assetsDisplayedOnPage) - 1;
  }
}
