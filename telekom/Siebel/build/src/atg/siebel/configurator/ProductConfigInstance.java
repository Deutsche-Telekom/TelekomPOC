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

import atg.core.util.StringUtils;
import atg.siebel.configurator.ConfigurationParams.ContextParameters;
import atg.siebel.configurator.Constants.ConfigurationCommandType;
import atg.siebel.configurator.attribute.Attribute;
import atg.siebel.configurator.attribute.AttributeHolder;
import atg.siebel.configurator.command.CommandResult;
import atg.siebel.configurator.status.CommandStatus;
import atg.siebel.integration.SiebelSessionToken;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 * This object contains all information that is required for one specific
 * product instance being configured by the user.
 */
public abstract class ProductConfigInstance extends BaseConfigInstance {

  // -------------------------------------
  /** Class version string */
  public static final String CLASS_VERSION = "$Id: //product/Siebel/version/11.2/src/atg/siebel/configurator/ProductConfigInstance.java#2 $$Change: 1194813 $";

  // -------------------------------------
  // Constants
  // -------------------------------------

  // -------------------------------------
  // Member variables
  // -------------------------------------
  protected ProductConfigInstanceKey mKey;
  protected PromotionConfigInstance mPromotionInstance;

  /*
   * This map is used to store a PCI's attributes. They are stored in a map that
   * is keyed off the attribute's name property so that we can easily reference
   * an attribute by name.
   */
  protected Map<String, Attribute> mAttributeMap = null;

  // -------------------------------------
  // Properties
  // -------------------------------------

  // -------------------------------------
  // property: lastCommandStatus
  protected CommandStatus mCommandStatus = null;

  public CommandStatus getLastCommandStatus() {
    return mCommandStatus;
  }

  public void setLastCommandStatus(CommandStatus pCommandStatus) {
    mCommandStatus = pCommandStatus;
  }

  // -------------------------------------
  // property: delete
  private boolean mDelete;

  public boolean isDelete() {
    return mDelete;
  }

  public void setDelete(boolean pDelete) {
    mDelete = pDelete;
  }

  // -------------------------------------
  // property: quantity
  private int mQuantity = 1;

  public int getQuantity() {
    return mQuantity;
  }

  public void setQuantity(int pQuantity) {
    mQuantity = pQuantity;
  }

  // -------------------------------------
  // property: childRelationships
  private ProductConfigRelationship[] mChildRelationships = new ProductConfigRelationship[0];

  public void setChildRelationships(
      ProductConfigRelationship[] pChildRelationships) {
    if (pChildRelationships != null && pChildRelationships.length > 0) {
      mChildRelationships = pChildRelationships;
    }
  }

  public ProductConfigRelationship[] getChildRelationships() {
    return mChildRelationships;
  }

  // -------------------------------------
  // Constructors
  // -------------------------------------

  /**
   * @param pOrderId
   * @param pProductId
   * @param pConfiguratorManager
   * @throws ConfiguratorException
   */
  public ProductConfigInstance(String pOrderId, String pProductId,
      ConfiguratorManager pConfiguratorManager) throws ConfiguratorException {
    super(pOrderId, pProductId, pConfiguratorManager);
  }

  // -------------------------------------
  // Methods
  // -------------------------------------

  /**
   * @return
   */
  public PromotionConfigInstance getPromotionInstance() {
    return mPromotionInstance;
  }

  /**
   * @param pProductId
   * @param pInstanceNumber
   * @return
   */
  protected ProductConfigInstanceKey createKey(String commerceItemId, String pProductId,
      int pInstanceNumber) {

    ProductConfigInstanceKey newKey = new ProductConfigInstanceKey(commerceItemId);
    newKey.appendKeyElement(pProductId, pInstanceNumber);

    return newKey;
  }

  /**
   * @param pParentInstance
   * @param pProductId
   * @param pInstanceNumber
   * @return
   */
  protected ProductConfigInstanceKey createKey(
      ProductConfigInstance pParentInstance, String pProductId,
      int pInstanceNumber) {

    if (mLogger.isLoggingDebug()) {
      mLogger.logDebug("Entered createKey() : pParentInstance = "
          + pParentInstance + " : pProductId = " + pProductId
          + " : pInstanceNumber = " + pInstanceNumber);
    }
    ProductConfigInstanceKey newKey = (ProductConfigInstanceKey) pParentInstance
        .getKey().clone();
    newKey.appendKeyElement(pProductId, pInstanceNumber);

    if (mLogger.isLoggingDebug()) {
      mLogger.logDebug("Created new ProductConfigInstanceKey : "
          + newKey.toString());
    }

    return newKey;
  }

  /**
   * @return
   */
  public ProductConfigInstanceKey getKey() {
    return mKey;
  }
  
  /**
   * @return
   */
  public String getKeyString() {
    return mKey.toString();
  }

  /**
   * This method is called when a new PCI's is being created from a Siebel
   * response.
   * 
   * @param pAttributes
   *          - array of attributes
   */
  public void setAttributes(Attribute[] pAttributes) {
    if (mLogger.isLoggingDebug()) {
      mLogger
          .logDebug("Entered setAttributes() : pAttributes = " + pAttributes);
    }
    mAttributeMap = new LinkedHashMap<String, Attribute>(pAttributes.length);
    for (Attribute attr : pAttributes) {
      mAttributeMap.put(attr.getName(), attr);
    }
    if (mLogger.isLoggingDebug()) {
      mLogger.logDebug("Leaving setAttributes() : mAttributeMap = "
          + mAttributeMap);
    }
  }

  /**
   * @return
   */
  public AttributeHolder[] getAttributeHolders() {
    Attribute[] attributes = (mAttributeMap != null && mAttributeMap.size() > 0) ? mAttributeMap
        .values().toArray(new Attribute[mAttributeMap.size()]) : null;
    AttributeHolder[] copy = new AttributeHolder[0];
    if (attributes != null) {
      copy = new AttributeHolder[attributes.length];
      for (int i = 0; i < attributes.length; i++) {
        copy[i] = attributes[i].getHolder();
      }
    }
    return copy;
  }

  /**
   * @return
   */
  public Attribute[] getAttributes() {
    Attribute[] attributes = (mAttributeMap != null && mAttributeMap.size() > 0) ? mAttributeMap
        .values().toArray(new Attribute[mAttributeMap.size()]) : null;
    Attribute[] copy = new Attribute[0];
    if (attributes != null) {
      copy = new Attribute[attributes.length];
      for (int i = 0; i < attributes.length; i++) {
        copy[i] = getConfiguratorManager().getConfiguratorTools()
            .getAttributeFactory().copyAttribute(attributes[i]);
      }
    }
    return copy;
  }

  /**
   * @param pName
   * @param pValue
   * @throws ConfiguratorException
   */
  public synchronized CommandResult setAttributeValue(String pName,
      String pValue) {

    if (mLogger.isLoggingDebug()) {
      mLogger.logDebug("Entered setAttributeValue() : pName = " + pName
          + " :  pValue = " + pValue);
    }

    CommandResult result = null;

    Attribute attribute = getAttribute(pName);
    if (attribute != null) {
      AttributeHolder holder = getConfiguratorManager().getConfiguratorTools()
          .getAttributeFactory().copyAttribute(attribute).getHolder();
      holder.setValue(pValue);
      result = updateAttributes(new AttributeHolder[] { holder });

    } else {
      Object[] args = new Object[] { this.getKey(),
          ConfigurationCommandType.SET_ATTRIBUTES };
      String error = MessageFormat.format(Constants.NO_VALID_CHANGES, args);
      result = getConfiguratorManager().createErrorResult(
          ConfigurationCommandType.SET_ATTRIBUTES,
          Constants.INVALID_ATTRIBUTE_VALUE_ERROR, error);
    }

    processResult(ConfigurationCommandType.SET_ATTRIBUTES, result);

    if (mLogger.isLoggingDebug()) {
      mLogger.logDebug("Leaving setAttributeValue() : result = " + result);
    }

    return result;
  }

  /**
   * @param pName
   * @return
   */
  public Attribute getAttribute(String pName) {
    return mAttributeMap.get(pName);
  }

  /**
   * @return
   */
  public boolean getIsRootInstance() {
    return false;
  }

  /**
   * @return
   */
  public String getUiMessage() {
    return getConfiguratorManager().getConfiguratorTools()
        .getCommandStatusManager().getUIMessage(getLastCommandStatus());
  }

  // ============= CONFIGURATION CHANGE METHODS - START ===================//

  /**
   * @param pRelationshipId
   * @param pProductId
   * @return
   */
  public synchronized CommandResult addChildProduct(String pRelationshipId,
      String pProductId) {

    if (mLogger.isLoggingDebug()) {
      mLogger.logDebug("Entered addChildProduct() : pRelationshipId == "
          + pRelationshipId + " : pProductId ==" + pProductId);
    }

    CommandResult result = null;

    if (!isConfigurableProduct()) {
      String error = MessageFormat.format(Constants.INSTANCE_NOT_CONFIGURABLE,
          this.getKey());
      result = getConfiguratorManager().createErrorResult(
          ConfigurationCommandType.ADD_PRODUCT, Constants.APPLICATION_ERROR,
          error);
      mLogger.logError(error);

    } else if (!isValidStateForConfigurationChange()) {
      Object[] args = new Object[] { this.getKey(),
          ConfigurationCommandType.ADD_PRODUCT };
      String error = MessageFormat.format(Constants.INSTANCE_INVALID_STATE,
          args);
      result = getConfiguratorManager().createErrorResult(
          ConfigurationCommandType.ADD_PRODUCT, Constants.APPLICATION_ERROR,
          error);
      mLogger.logError(error);
    }

    if (result == null) {
      ProductConfigRelationship relationship = getChildRelationship(pRelationshipId);

      try {
        if (relationship.canAddOrReplaceChildProduct(pProductId)) {
          ConfigurationContext context = createAddProductContext(
              pRelationshipId, pProductId);
          result = getConfiguratorManager().performProductConfigurationChange(
              context);
        } else {
          Object[] args = new Object[] { pProductId, pRelationshipId };
          String error = MessageFormat.format(
              Constants.RELATIONSHIP_CARDINALITY_VIOLATION, args);
          result = getConfiguratorManager().createErrorResult(
              ConfigurationCommandType.ADD_PRODUCT,
              Constants.ERROR_MAX_CARDINALITY, error);
          mLogger.logError(error);
          relationship.setError(Constants.ERROR_MAX_CARDINALITY);
        }
      } catch (ConfiguratorException e) {
        result = getConfiguratorManager().createErrorResult(
            ConfigurationCommandType.ADD_PRODUCT, e.getErrorCode(),
            e.getMessage());
        mLogger.logError(e);
      }
    }

    processResult(ConfigurationCommandType.ADD_PRODUCT, result);

    if (mLogger.isLoggingDebug()) {
      mLogger.logDebug("Leaving addChildProduct() : result = " + result);
    }
    return result;
  }

  /**
   * @param pAttributes
   * @return
   */
  public synchronized CommandResult updateAttributes(
      AttributeHolder[] pAttributes) {

    if (mLogger.isLoggingDebug()) {
      mLogger.logDebug("Entered updateAttributes() : pAttributes == "
          + pAttributes);
    }

    List<AttributeHolder> invalidAttributes = new ArrayList<AttributeHolder>();
    List<AttributeHolder> changedAttributes = new ArrayList<AttributeHolder>();
    CommandResult result = null;

    if (!isValidStateForConfigurationChange()) {
      Object[] args = new Object[] { this.getKey(),
          ConfigurationCommandType.SET_ATTRIBUTES };
      String error = MessageFormat.format(Constants.INSTANCE_INVALID_STATE,
          args);
      result = getConfiguratorManager().createErrorResult(
          ConfigurationCommandType.SET_ATTRIBUTES, Constants.ERROR_INVALID_STATE,
          error);
      mLogger.logError(error);
    } else {

      int i = 0;
      while (i < pAttributes.length) {
        Attribute current = mAttributeMap.get(pAttributes[i].getName());
        if (hasAttributeValueChanged(current, pAttributes[i])) {
//        if (current != null && !current.getValue().equals(pAttributes[i].getValue())) {
          boolean validValue = current.isValidAttributeValue(pAttributes[i]
              .getValue());
          if (validValue) {
            changedAttributes.add(pAttributes[i]);
          } else {
            mLogger.logError("Invalid value [" + pAttributes[i].getValue()
                + "] for " + getAttributes()[i]);
            invalidAttributes.add(pAttributes[i]);
            current.setError(Constants.INVALID_ATTRIBUTE_VALUE_ERROR);
          }
        }
        i++;
      }

      // If we have invalid attribute values OR if we have no valid
      // attribute values then we will create a CommandResult object
      if (!invalidAttributes.isEmpty()) {
        Object[] args = new Object[] { this.getKey(),
            ConfigurationCommandType.SET_ATTRIBUTES, invalidAttributes };
        String error = MessageFormat.format(Constants.INVALID_CHANGES, args);
        result = getConfiguratorManager().createErrorResult(
            ConfigurationCommandType.SET_ATTRIBUTES,
            Constants.INVALID_ATTRIBUTE_VALUE_ERROR, error);
        mLogger.logError(error);

      } else if (changedAttributes.isEmpty()) {
        Object[] args = new Object[] { this.getKey(),
            ConfigurationCommandType.SET_ATTRIBUTES };
        String error = MessageFormat.format(Constants.NO_VALID_CHANGES, args);
        result = getConfiguratorManager().createErrorResult(
            ConfigurationCommandType.SET_ATTRIBUTES,
            Constants.INVALID_ATTRIBUTE_VALUE_ERROR, error);
        mLogger.logError(error);
      }
    }

    // Only proceed with the call to Siebel if everything has validated ok
    if (result == null) {
      // if (isConfigurableProduct()) {
        ConfigurationContext context = createSetAttributesContext(changedAttributes);
        result = getConfiguratorManager().performProductConfigurationChange(
            context);
//      } else {
//        // SPWA which isn't a CP
//        for (AttributeHolder holder : changedAttributes) {
//          Attribute attribute = mAttributeMap.get(holder.getName());
//          attribute.setValue(holder.getValue());
//        }
//        CommandStatus status = getConfiguratorManager()
//            .getConfiguratorTools()
//            .getCommandStatusManager()
//            .createSuccessCommandStatus(ConfigurationCommandType.SET_ATTRIBUTES);
//        result = new CommandResult(status);
//      }
    }

    processResult(ConfigurationCommandType.SET_ATTRIBUTES, result);

    if (mLogger.isLoggingDebug()) {
      mLogger.logDebug("Leaving updateAttributes(Attribute[]) : result = "
          + result);
    }
    return result;
  }

  /**
   * @param pDeletes
   * @return
   */
  public synchronized CommandResult deleteChildInstances(
      ProductConfigRelationship pProductConfigRelationship,
      List<ChildProductConfigInstance> pDeletes) {

    if (mLogger.isLoggingDebug()) {
      mLogger.logDebug("Entered deleteChildInstances() : pDeletes == "
          + pDeletes);
    }

    CommandResult result = null;

    if (!isConfigurableProduct()) {
      String error = MessageFormat.format(Constants.INSTANCE_NOT_CONFIGURABLE,
          this.getKey());
      result = getConfiguratorManager().createErrorResult(
          ConfigurationCommandType.MULTI_COMMAND_UPDATE,
          Constants.APPLICATION_ERROR, error);
      mLogger.logError(error);

    } else if (!isValidStateForConfigurationChange()) {
      Object[] args = new Object[] { this.getKey(),
          ConfigurationCommandType.MULTI_COMMAND_UPDATE };
      String error = MessageFormat.format(Constants.INSTANCE_INVALID_STATE,
          args);
      result = getConfiguratorManager().createErrorResult(
          ConfigurationCommandType.MULTI_COMMAND_UPDATE,
          Constants.ERROR_INVALID_STATE, error);
      mLogger.logError(error);
    } else if (!pProductConfigRelationship.canDeletedChildProducts(pDeletes
        .size())) {
      Object[] args = new Object[] { null, pProductConfigRelationship.getId() };
      String error = MessageFormat.format(
          Constants.RELATIONSHIP_CARDINALITY_VIOLATION, args);
      result = getConfiguratorManager().createErrorResult(
          ConfigurationCommandType.MULTI_COMMAND_UPDATE,
          Constants.ERROR_MIN_CARDINALITY, error);
      mLogger.logError(error);
    }

    if (result == null) {
      List<ConfigurationContext> toDelete = new ArrayList<ConfigurationContext>();
      for (ChildProductConfigInstance instance : pDeletes) {
        toDelete.add(instance.createDeleteProductContext());
      }
      ConfigurationContext context = createMultiFacetUpdateContext(toDelete);
      result = getConfiguratorManager().performProductConfigurationChange(
          context);
      if (result.getStatus().isSuccessfull()) {
        for (ChildProductConfigInstance instance : pDeletes) {
          getConfiguratorManager().getConfiguratorTools()
              .getProductConfigInstanceCache()
              .removeProductConfigInstanceFromCache(instance);
        }
      }
    }

    processResult(ConfigurationCommandType.MULTI_COMMAND_UPDATE, result);

    if (mLogger.isLoggingDebug()) {
      mLogger.logDebug("Leaving deleteChildInstances() : result = " + result);
    }
    return result;
  }

  // ============= CONFIGURATION CHANGE METHODS - END ===================//

  public ProductConfigRelationship getChildRelationship(String pRelationshipId) {

    if (mLogger.isLoggingDebug()) {
      mLogger.logDebug("Entered getChildRelationship() : pRelationshipId == "
          + pRelationshipId);
    }

    ProductConfigRelationship targetRelationship = null;
    for (ProductConfigRelationship relationship : mChildRelationships) {
      if (relationship.getId().equals(pRelationshipId)) {
        targetRelationship = relationship;
        break;
      }
    }

    if (mLogger.isLoggingDebug()) {
      mLogger
          .logDebug("Leaving getChildRelationship() : targetRelationship == "
              + targetRelationship);
    }
    return targetRelationship;
  }

  // ============= CREATE CONTEXTS (MAYBE MOVE INTO FACTORY CLASS ???)
  // ================//

  /**
   * @param pRelationshipId
   * @param pProductId
   * @return
   * @throws ConfiguratorException
   */
  protected ConfigurationContext createAddProductContext(
      String pRelationshipId, String pProductId) throws ConfiguratorException {

    if (mLogger.isLoggingDebug()) {
      mLogger
          .logDebug("Entered createAddProductContext() : pRelationshipId == "
              + pRelationshipId + " : pProductId ==" + pProductId);
    }

    ProductConfigRelationship relationship = getChildRelationship(pRelationshipId);
    ConfigurationContext context = relationship
        .createAddProductContext(pProductId);

    if (mLogger.isLoggingDebug()) {
      mLogger.logDebug("Leaving createAddProductContext() : context == "
          + context);
    }
    return context;
  }

  /**
   * @param pAttributes
   * @return
   * @throws ConfiguratorException
   */
  protected ConfigurationContext createSetAttributesContext(
      List<AttributeHolder> pAttributes) {

    if (mLogger.isLoggingDebug()) {
      mLogger.logDebug("Entered createSetAttributesContext() : pAttributes == "
          + pAttributes);
    }

    ConfigurationContext context = new ConfigurationContext(this,
        ConfigurationCommandType.SET_ATTRIBUTES);
    context.getConfigurationParams().setParam(ContextParameters.NEW_ATTRIBUTES,
        pAttributes);

    if (mLogger.isLoggingDebug()) {
      mLogger.logDebug("Leaving createSetAttributesContext() : context == "
          + context);
    }
    return context;
  }

  /**
   * @param pContextList
   * @return
   * @throws ConfiguratorException
   */
  protected ConfigurationContext createMultiFacetUpdateContext(
      List<ConfigurationContext> pContextList) {

    if (mLogger.isLoggingDebug()) {
      mLogger
          .logDebug("Entered createMultiFacetUpdateContext() : pContextList == "
              + pContextList);
    }

    ConfigurationContext context = new ConfigurationContext(this,
        ConfigurationCommandType.MULTI_COMMAND_UPDATE);
    context.getConfigurationParams().setParam(
        ContextParameters.CHILD_CONTEXT_LIST, pContextList);

    if (mLogger.isLoggingDebug()) {
      mLogger.logDebug("Leaving createMultiFacetUpdateContext() : context == "
          + context);
    }
    return context;
  }

  /**
   * @param pCommandType
   * @param pResult
   */
  protected void processResult(ConfigurationCommandType pCommandType,
      CommandResult pResult) {

    if (mLogger.isLoggingDebug()) {
      mLogger.logDebug("Status of command [" + pCommandType + "] for PCI ["
          + getKey() + "] == " + pResult.getStatus());
    }

    setLastCommandStatus(pResult.getStatus());

    if (!pResult.getStatus().isSuccessfull()) {
      mLogger.logError("Command Failed - [" + pCommandType + "] for PCI ["
          + getKey() + "] == " + pResult.getStatus());
    }
  }

  /**
   * @return
   */
  public boolean isConfigurableProduct() {
    return getConfiguratorManager().getConfiguratorTools().isConfigurableProduct(getType());
  }

  /**
   * @return
   */
  public boolean getIsConfigurableProduct() {
    return isConfigurableProduct();
  }
  
  /**
   * @return
   */
  public abstract boolean isConfigurableViaSiebelWebservice(); 
 
  /**
   * @return
   */
  protected abstract boolean isValidStateForConfigurationChange();
  
  
  /**
   * @return
   */
  protected boolean hasAttributeValueChanged(
      Attribute pAttribute, AttributeHolder pAttributeHolder) {
    
    String value1 = pAttribute.getValue();
    String value2 = pAttributeHolder.getValue();
    if (StringUtils.isEmpty(value1) && StringUtils.isEmpty(value2)) {
      return false;
    }
    if (StringUtils.isEmpty(value1)) {
      return true;
    }
    if (StringUtils.isEmpty(value2)) {
      return true;
    }
    if (value1.equals(value2)) {
      return false;
    }
    return true;
  }

  
  @Override
  public String toString() {
    return "ProductConfigInstance {\n\tmProductId=" + getProductId()
        + "\n\tmKey=" + mKey + "\n\tmOrderId=" + getOrderId() 
        + "\n\tmIntegrationId=" + getIntegrationId()
        // + "\n\tmCommerceItemId=" + mCommerceItemId
        + "\n\tmAttrs=[" + mAttributeMap + "]\n}"
        + "\n\tmChildren=[" + mChildRelationships + "]\n}";
  }

  protected SiebelSessionToken mSiebelSessionToken;

  public void setSiebelSessionToken(SiebelSessionToken pSiebelSessionToken) {
    mSiebelSessionToken=pSiebelSessionToken;
  }


  public SiebelSessionToken getSiebelSessionToken() {
    return mSiebelSessionToken;
  }
}
