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

package atg.siebel.configurator;

/**
 * Some constants used by Configurator
 * 
 * @author bbrady
 * @version $Id: //product/Siebel/version/11.2/src/atg/siebel/configurator/Constants.java#2 $$Change: 1194813 $
 * @updated $DateTime: 2015/09/10 08:26:24 $$Author: saysyed $
 */
public class Constants {

  //-------------------------------------
  /** Class version string */

  public static String CLASS_VERSION = "$Id: //product/Siebel/version/11.2/src/atg/siebel/configurator/Constants.java#2 $$Change: 1194813 $";

  public final static String YES = "Y";
  public final static String NO = "N";

  public final static String MINUS = "-";

  /**
   * Valid Configurator commands
   *
   */
  public enum ConfigurationCommandType {
    ADD_PRODUCT, REMOVE_PRODUCT, UPDATE_PRODUCT, REPLACE_PRODUCT, CREATE_PRODUCT, SET_ATTRIBUTES, BEGIN_CONFIG, END_CONFIG, GET_PROMOTION_DEFINITION, MULTI_COMMAND_UPDATE
  }

  /**
   * Valid status's of a ProductConfigInstance
   *
   */
  public enum ProductConfigInstanceStatus {
    NEW, INITIALISED, CONFIGURED
  }

  /**
   * Siebel Aggregate or Component product type
   *
   */
  public enum ProductType {
    AGGREGATE, COMPONENTS
  }

  /**
   * Type of ConfigInstance, Promotion or Product
   *
   */
  public enum ConfigInstanceType {
    PROMOTION_CONFIG_INSTANCE, PRODUCT_CONFIG_INSTANCE
  }

  /**
   * Valid Siebel commerce item type
   *
   */
  public enum SiebelCommerceItemType {
    DEFAULT, MODIFYASSET, UPGRADEPROMOTION
  }
  //-------------------------------------
  // Constants
  //-------------------------------------
  
  // Product Type Constants
  public static final String PROD_TYPE_SIMPLE = "Simple Product";
  public static final String PROD_TYPE_SIMPLE_WITH_ATTRIBUTES = "Simple Product With Attributes";
  public static final String PROD_TYPE_SIMPLE_BUNDLE = "Simple Product Bundle";
  public static final String PROD_TYPE_CONFIGURABLE = "Configurable Product";
  public static final String PROD_TYPE_PROMOTION = "Promotion";
  
  public final static String NEW_INSTANCE = "NEW_INSTANCE";
  public final static String REMOVED_INSTANCE = "REMOVED_INSTANCE";
  public final static String REPLACED_INSTANCE = "REPLACED_INSTANCE";
  public final static String TARGET_INSTANCE = "TARGET_INSTANCE";
  public final static String RELATIONSHIP_OBJECT = "RELATIONSHIP_OBJECT";
  public final static String RELATIONSHIP_ID = "RELATIONSHIP_ID";
  public final static String NEW_ATTRIBUTES = "NEW_ATTRIBUTES";
  public final static String PRODUCT_ID = "PRODUCT_ID";
  public final static String NEW_INTEGRATION_ID = "NEW_INTEGRATION_ID";

  public static final String PRODUCT_TYPE_PROPERTY = "siebelType";
  public static final String PRODUCT_DESCRIPTION_PROPERTY = "description";
  public static final String RELATIONSHIPS_PROPERTY = "relationships";
  public static final String PROMOTION_STRUCTURE = "promotionStructure";
  public static final String CONFIGURABLE_PRODUCT_STRUCTURE = "configurableProductStructure";
  public static final String SIMPLE_BUNDLE_STRUCTURE = "simpleBundleStructure";
  public static final String ROOT_PRODUCTS = "ROOT_PRODUCTS";
  public static final String QUOTE_ITEM = "QUOTE_ITEM";
  public static final String PRODUCT_ITEM_DESCRIPTOR_NAME = "product";
  public static final String PRODUCT_DISPLAY_NAME_PROPERTY = "displayName";

  public static final String RELATIONSHIP_REPOSITORY_ITEM = "relationship";
  public static final String RELATIONSHIP_PRODUCT_PROPERTY = "product";
  public static final String RELATIONSHIP_DEFAULT_PRODUCT_PROPERTY = "defaultProduct";
  public static final String RELATIONSHIP_DOMAINS_PROPERTY = "relationshipDomains";
  public static final String RELATIONSHIP_DEFAULT_QUANTITY_PROPERTY = "defaultQuantity";
  public static final String RELATIONSHIP_MIN_QUANTITY_PROPERTY = "minimumQuantity";
  public static final String RELATIONSHIP_MAX_QUANTITY_PROPERTY = "maximumQuantity";
  public static final String RELATIONSHIP_DEFAULT_CARDINALITY_PROPERTY = "defaultCardinality";
  public static final String RELATIONSHIP_MIN_CARDINALITY_PROPERTY = "minimumCardinality";
  public static final String RELATIONSHIP_MAX_CARDINALITY_PROPERTY = "maximumCardinality";

  public static final String APPLICATION_ERROR = "generalApplicationError";
  public static final String ERROR_INVALID_STATE = "invalidStateError";
  public static final String INVALID_ATTRIBUTE_VALUE_ERROR = "invalidAttributeValuesError";
  public static final String INVALID_ID_ERROR = "invalidIdError";
  public static final String ERROR_CARDINALITY = "cardinalityViolationError";
  public static final String ERROR_MAX_CARDINALITY = "maxCardinalityViolationError";
  public static final String ERROR_MIN_CARDINALITY = "minCardinalityViolationError";
  public static final String UNSUPPORTED_OPERATION = "unsupportedOperation";
  public static final String ERROR_ADD_PRODUCT = "addProductError";
  public static final String ERROR_SET_ATTRIBUTES = "setAttributesError";
  public static final String ERROR_DELETE_PRODUCT = "deleteProductError";
  public static final String ERROR_END_CONFIG = "endConfigError";
  public static final String ERROR_ABO_REQUEST = "Upgrade/Modify for the Promotion is already in progress, Please edit the Item in Cart";
  
  public static final String INSTANCE_BEING_CONFIGURED = "warningInstanceBeingConfigured";
  
  public static final String UNEXPECTED_ERROR = 
      "An unexpected error has occurred!";
  public static final String INSTANCE_NOT_CONFIGURABLE = 
      "ProductConfigInstance is not configurable - {0}";
  public static final String INSTANCE_NOT_INITIALISED = 
      "Instance configuration not initialised: ProductConfigInstance = {0}: Operation = {1}";
  public static final String INSTANCE_CONFIGURATION_COMPLETE = 
      "Instance configuration complete: ProductConfigInstance = {0}: Operation = {1}";
  public static final String INSTANCE_INVALID_STATE = 
      "Instance in invalid state for operation: ProductConfigInstance = {0}: Operation = {1}";
  public static final String INSTANCE_BEING_CONFIGURED_MESSAGE = 
      "Instance already being configured: ProductConfigInstance = {0}: Operation = {1}";
  public static final String NO_VALID_CHANGES = 
      "No valid changes for operation: ProductConfigInstance = {0}: Operation = {1}";
  public static final String INVALID_CHANGES = 
      "Invalid changes for operation: ProductConfigInstance = {0}: Operation = {1}: Invalid changes = {2}";
  public static final String RELATIONSHIP_CARDINALITY_VIOLATION = 
      "Cardinality violation: RelationshipId = {1} : ProductId = {0}";
  public static final String MIN_CARDINALITY_VIOLATION = 
      "Cardinality violation: RelationshipId = {1} : quantity to delete = {0}";
  public static final String MAX_CARDINALITY_VIOLATION = 
      "Cardinality violation: RelationshipId = {1} : quantity to add = {0}";
  
  public static final int ZERO = 0;
}
