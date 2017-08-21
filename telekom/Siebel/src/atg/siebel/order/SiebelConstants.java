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

import java.util.MissingResourceException;

/**
 * This class contains all of the contants used by the Siebel commerce wrappers.
 * 
 * @author Patrick Mc Erlean
 * @version $Id:
 *          //product/Siebel/main/src/atg/siebel/order/SiebelConstants.java#1
 *          $$Change: 1194813 $
 * @updated $DateTime: 2015/09/10 08:26:24 $$Author: saysyed $
 */

public class SiebelConstants {
  // ----------------------------------------------------------------------------------
  // Class version string
  // ----------------------------------------------------------------------------------

  public static String CLASS_VERSION =
    "$Id: //product/Siebel/version/11.2/src/atg/siebel/order/SiebelConstants.java#2 $$Change: 1194813 $";

  // ----------------------------------------------------------------------------------
  // Resources
  // ----------------------------------------------------------------------------------

  static final String RESOURCE_NAME =
    "atg.siebel.resources.SiebelOrderResources";

  private static java.util.ResourceBundle sResourceBundle =
    atg.core.i18n.LayeredResourceBundle.getBundle(RESOURCE_NAME,
      atg.service.dynamo.LangLicense.getLicensedDefault());

  // ----------------------------------------------------------------------------------
  // Constants
  // ----------------------------------------------------------------------------------

  // ----------------------------------------------------------------------------------
  // Messages from the resource bundle
  // ----------------------------------------------------------------------------------

  public static final String NOT_SIEBEL_COMMERCE_ITEM =
    getStringResource("MessageNotSiebelItem");
  public static final String REPOSITORY_ITEM_IN_ATTRIBUTE_NULL =
    getStringResource("MessageRepositoryItemInAttributeIsNull");
  public static final String INVALID_ATTRIBUTE =
    getStringResource("MessageInvalidAttribute");
  public static final String INVALID_ATTRIBUTE_ID =
    getStringResource("MessageInvalidAttributeId");
  public static final String DUPLICATE_ATTRIBUTE =
    getStringResource("MessageDuplicateAttribute");
  public static final String INVALID_INDEX_VALUE =
    getStringResource("MessageInvalidIndexValue");
  public static final String ATTRIBUTE_NOT_FOUND =
    getStringResource("MessageAttributeNotFound");
  public static final String INVALID_ORDER_PARAMETER =
    getStringResource("MessageInvalidOrderParameter");
  public static final String INVALID_REPOSITORY_ITEM_PARAMETER =
    getStringResource("MessageInvalidRepositoryItemParameter");
  public static final String INVALID_REPOSITORY_PARAMETER =
    getStringResource("MessageInvalidRepositoryParameter");
  public static final String INVALID_ORDER_MANAGER_PARAMETER =
    getStringResource("MessageInvalidOrderManagerParameter");
  public static final String CONCURRENT_UPDATE_ATTEMPT =
    getStringResource("MessageConcurrentUpdateAttempt");
  public static final String FAILED_TO_CREATE_ATTRIBUTE_OBJECT =
    getStringResource("MessageAttributeObjectCreationFailed");
  public static final String INVALID_CATALOG_KEY =
    getStringResource("MessageInvalidCatalogKey");
  public static final String INVALID_PRODUCT_ID =
    getStringResource("MessageInvalidProductId");
  public static final String INVALID_QUANTITY =
    getStringResource("MessageInvalidQuantity");
  public static final String INVALID_COMMERCE_ITEM_NAME =
    getStringResource("MessageInvalidCommerceItemName");
  public static final String INVALID_COMMERCE_ITEM_PARAMETER =
    getStringResource("MessageInvalidCommerceItemParameter");
  public static final String ERROR_REPRICING_ORDER_AFTER_ADD_ITEM =
    getStringResource("MessageErrorRepricingOrderAfterAddItem");
  public static final String ERROR_ADDING_ITEM_TO_ORDER =
    getStringResource("MessageErrorAddingItemToOrder");
  public static final String PROFILE_ERROR_CONVERTING_ORDER_TO_QUOTE =
    getStringResource("MessageProfileErrorConvertingOrderToQuote");
  public static final String QUOTE_ERROR_CONVERTING_ORDER_TO_QUOTE =
    getStringResource("MessageQuoteErrorConvertingOrderToQuote");
  public static final String ORDER_ERROR_CONVERTING_QUOTE_TO_ORDER =
    getStringResource("MessageOrderErrorConvertingQuoteToOrder");
  public static final String INVALID_PARAMETER_NOT_MAP =
      getStringResource("MessageInvalidParameterNotMap");

  // ----------------------------------------------------------------------------------

  // ----------------------------------------------------------------------------------
  // Methods
  // ----------------------------------------------------------------------------------

  /**
   * getStringResource
   * 
   * Retrieves a resource message from the specified resource bundle.
   * 
   * @param pResourceName
   *          - the resource name key.
   * @exception MissingResourceException
   */

  public static String getStringResource(String pResourceName)
    throws MissingResourceException {
    try {
      String ret = sResourceBundle.getString(pResourceName);

      if (ret == null) {
        String str = "ERROR: Unable to load resource " + pResourceName;

        throw new MissingResourceException(str, "atg.commerce.order.Constants",
          pResourceName);
      } else {
        return ret;
      }
    } catch (MissingResourceException exc) {
      throw exc;
    }
  }
}
