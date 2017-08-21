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

package atg.siebel.order;

import java.util.*;

/**
 * This class contains all of the contants used by the Siebel commerce wrappers for
 * property names.
 *
 * @author Patrick Mc Erlean
 * @version $Id: //product/Siebel/version/11.2/src/atg/siebel/order/SiebelPropertyNameConstants.java#2 $$Change: 1194813 $
 * @updated $DateTime: 2015/09/10 08:26:24 $$Author: saysyed $
 */

public class SiebelPropertyNameConstants
{
  //----------------------------------------------------------------------------------
  // Class version string
  //----------------------------------------------------------------------------------

  public static String CLASS_VERSION = "$Id: //product/Siebel/version/11.2/src/atg/siebel/order/SiebelPropertyNameConstants.java#2 $$Change: 1194813 $";

  //----------------------------------------------------------------------------------
  // Resources
  //----------------------------------------------------------------------------------

  static final String RESOURCE_NAME="atg.siebel.resources.SiebelOrderResources";

  private static java.util.ResourceBundle sResourceBundle = atg.core.i18n.LayeredResourceBundle.getBundle (RESOURCE_NAME, atg.service.dynamo.LangLicense.getLicensedDefault());

  //----------------------------------------------------------------------------------
  // Constants from the resource bundle
  //----------------------------------------------------------------------------------

  public static final String ATTRIBUTES = getStringResource("PropertyAttributes");


  public static final String CHILD_ITEMS = getStringResource("PropertyCommerceItems");
  public static final String ACTION_CODE = getStringResource("PropertyActionCode");
  public static final String PARENT_RELATIONSHIP_ID = getStringResource("PropertyParentRelationshipId");
  public static final String DOMAIN_ITEM_ID = getStringResource("PropertyDomainItemId");
  public static final String CFG_STATE_CODE = getStringResource("PropertyCfgStateCode");
  public static final String CONFIGURED = getStringResource("PropertyConfigured");
  public static final String ATTRIBUTE_DEFINITION_ID = getStringResource("PropertyAttributeDefinitionId");
  public static final String ATTRIBUTE_NAME = getStringResource("PropertyAttributeName");
  public static final String VALUE = getStringResource("PropertyValue");
  public static final String BILLING_PROFILE_ID = getStringResource("PropertyValueBillingProfileId");
  public static final String SIEBEL_ID = getStringResource("PropertySiebelId");
  public static final String QUOTE_NUMBER = getStringResource("PropertyQuoteNumber");
  public static final String ACTIVE_DOCUMENT_ID = getStringResource("PropertyActiveDocumentId");
  public static final String QUOTE_ITEM_ID = getStringResource("PropertyQuoteItemId");
  public static final String ASSET_NUMBER = getStringResource("PropertyAssetNumber");
  public static final String ASSET_INTEGRATION_ID = getStringResource("PropertyAssetIntegrationId");
  public static final String PRODUCT_ITEM_DESCRIPTOR = getStringResource("PropertyProductItemDescriptor");
  public static final String PRODUCT_PROMOTION_STRUCTURE = getStringResource("PropertyProductPromotionStructure");
  public static final String PRODUCT_PROMOTION_UPGRADES = getStringResource("PropertyProductPromotionUpgrades");
  public static final String PRODUCT_TARGET_PROMOTION = getStringResource("PropertyProductTargetPromotion");
  public static final String COMMERCE_ITEM_TYPE = getStringResource("PropertyCommerceItemType");
  public static final String PROP_TYPE_CD = getStringResource("PropertyPropTypeCD");
  public static final String PROD_PROMORULE_ID=getStringResource("PropertyProdPromoRuleId");
  public static final String PROD_PROMOINSTANCE_ID=getStringResource("PropertyProdPromoInstanceId");

  //----------------------------------------------------------------------------------

  //----------------------------------------------------------------------------------
  // Methods
  //----------------------------------------------------------------------------------

  /**
   * getStringResource
   *
   * Retrieves a resource message from the specified resource bundle.
   *
   * @param pResourceName - the resource name key.
   * @exception MissingResourceException
   */

  public static String getStringResource (String pResourceName) throws MissingResourceException
  {
    try
    {
      String ret = sResourceBundle.getString (pResourceName);

      if (ret == null)
      {
       String str = "ERROR: Unable to load resource " + pResourceName;

       throw new MissingResourceException(str, "atg.commerce.order.Constants", pResourceName);
      }
      else
      {
       return ret;
      }
    }
    catch (MissingResourceException exc)
    {
      throw exc;
    }
  }
}
