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

/**
 * Constants for the Siebel account integration.
 * 
 * @author jwheaton
 * @version $Id:
 *          //product/Siebel/main/src/atg/siebel/account/SiebelAccountConstants
 *          .java#1 $$Change: 1194813 $
 * @updated $DateTime: 2015/09/10 08:26:24 $$Author: saysyed $
 * 
 */
public interface SiebelAccountConstants {

  //-------------------------------------
  /** Class version string */

  public static String CLASS_VERSION = "$Id: //product/Siebel/version/11.2/src/atg/siebel/account/SiebelAccountConstants.java#2 $$Change: 1194813 $";


  /*
   * Action commands
   */
  public static final String CMD_INSERT = "insert";
  public static final String CMD_UPDATE = "update";
  public static final String CMD_DELETE = "delete";
  public static final String[] SIEBEL_OPERATIONS = { CMD_INSERT, CMD_UPDATE,
    CMD_DELETE };

  /*
   * Siebel operations
   */
  public static final String OP_SKIPNODE = "skipnode";
  
  /*
   * Shared property names
   */
  public static final String PROP_SIEBEL_ACCOUNT_ID = "siebelAccountId";
  public static final String PROP_ACCOUNT_ID = "AccountId"; 
  public static final String PROP_EXTERNAL_ID = "siebelId";
  public static final String PROP_SIEBEL_ADDRESS_ID = "siebelAddressId";
  
  public static final String CARD_STATUS = "Active";  
  public static final String PROP_CREDIT_CARD_ID = "id";
  public static final String PROP_CREDIT_CARD_NUMBER = "creditCardNumber";
  public static final String PROP_EXPIRATION_YEAR = "expirationYear";
  public static final String PROP_EXPIRATION_MONTH = "expirationMonth";
  public static final String PROP_CREDIT_CARD_TYPE = "creditCardType";
  public static final String PROP_PAYMENT_METHOD_CREDIT_CARD = "Credit Card";
  public static final String PROP_CREDIT_CARD_BILLING_ADDRESS = "billingAddress";
  public static final String PROP_ORG_CREDIT_CARDS = "creditCards" ;
  public static final String PROP_CONTACT_ADDRESS1 = "address1" ;
  public static final String PROP_CONTACT_CITY  = "city" ;
  public static final String PROP_CONTACT_STATE   = "state" ;
  public static final String PROP_CONTACT_POSTALCODE  = "postalCode" ;
  
  /*
   * Organization property names
   */
  public static final String PROP_ORG_MEMBERS = "members";

  public static final String PROP_ORG_NAME = "name";

  /*
   * User property names
   */
  public static final String PROP_USER_FIRST_NAME = "firstName";

  public static final String PROP_USER_LAST_NAME = "lastName";

  public static final String PROP_USER_PARENT_ORG = "parentOrganization";

  /*
   * keys for command processing
   */
  public static final String INPUT_KEY_CMD = "command";
  public static final String INPUT_KEY_ITEM = "item";
  public static final String INPUT_KEY_ID = "id";
  
  public static final String SIEBEL_WEBAPP_RESOURCE_BUNDLE_NAME = "atg.siebel.WebAppResources";
  public static final String SIEBEL_GENERIC_EXCEPTION_MESSAGE = "genericExceptionMessage";
  public static final String SIEBEL_INTEGRATION = "SIEBEL_ECOMMERCE_INTEGRATION";
  public static final String SIEBEL_ACCOUNT_EXECUTION_MODE = "BiDirectional";
  public static final String SIEBEL_ACCOUNT_LOV_LANGUAGE_MODE = "LDC";
  public static final String SIEBEL_USER_NOT_FOUND = "userNotFound";
  public static final String SIEBEL_INVALID_WEBSERVICE_RESPONSE = "invalidWebserviceResponse";
  public static final String SIEBEL_WEBSERVICE_RESPONSE = "Error";
  public static final String SIEBEL_INVALID_WEBSERVICE_RESPONSE_COMINVOICEPROFILE = "invalidComInvoiceProfileResponse ";

}
