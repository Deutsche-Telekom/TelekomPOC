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

import java.text.MessageFormat;

import atg.siebel.configurator.Constants.ConfigurationCommandType;
import atg.siebel.configurator.Constants.ProductConfigInstanceStatus;
import atg.siebel.configurator.command.CommandResult;
import atg.siebel.order.SiebelCommerceItem;

/**
 * An instance of a root product
 *
 * @author bbrady
 * @version $Id: //product/Siebel/version/11.2/src/atg/siebel/configurator/RootProductConfigInstance.java#2 $$Change: 1194813 $
 * @updated $DateTime: 2015/09/10 08:26:24 $$Author: saysyed $
 */
public class RootProductConfigInstance extends ProductConfigInstance {

  //-------------------------------------
  // Constants
  //-------------------------------------
  /** Class version string */
  public static final String CLASS_VERSION = "$Id: //product/Siebel/version/11.2/src/atg/siebel/configurator/RootProductConfigInstance.java#2 $$Change: 1194813 $";
  
  //-------------------------------------
  // Variables
  //-------------------------------------
  protected int mDepth;
  
  // -------------------------------------
  // Properties
  // -------------------------------------
  // property: status
  private ProductConfigInstanceStatus mStatus = ProductConfigInstanceStatus.NEW;

  public ProductConfigInstanceStatus getStatus() {
    return mStatus;
  }

  public void setStatus(ProductConfigInstanceStatus pStatus) {
    mStatus = pStatus;
  }


  /**
   * Constructor for creating a root level CP which IS in a Promotion
   * 
   * @param pPromotion
   * @param pProductId
   * @param pInstanceNumber
   * @throws ConfiguratorException
   */
  public RootProductConfigInstance(PromotionConfigInstance pPromotion,
      String pProductId, int pInstanceNumber) throws ConfiguratorException {

    super(pPromotion.getOrderId(), pProductId, pPromotion
        .getConfiguratorManager());

    if (mLogger.isLoggingDebug()) {
      mLogger.logDebug("Entered ProductConfigInstance() : pProductId = "
          + pProductId + " : pInstanceNumber = " + pInstanceNumber
          + " : pPromotion = "+pPromotion);
    }
    
    init(pPromotion, pProductId, pInstanceNumber, pPromotion.getCommerceItemId());
    
    if (mLogger.isLoggingDebug()) {
      mLogger.logDebug("Created new ProductConfigInstance : "
          + this.toString());
    }
  }

  /**
   * Constructor for creating a root level CP which IS NOT in a Promotion
   * 
   * @param pOrderId
   * @param pCommerceItemId
   * @param pProductId
   * @param pInstanceNumber
   * @throws ConfiguratorException
   */
  public RootProductConfigInstance(String pOrderId, String pCommerceItemId,
      String pProductId, int pInstanceNumber, ConfiguratorManager pManager)
      throws ConfiguratorException {

    super(pOrderId, pProductId, pManager);
    
    if (mLogger.isLoggingDebug()) {
      mLogger.logDebug("Entered ProductConfigInstance() : pProductId = "
          + pProductId + " : pInstanceNumber = " + pInstanceNumber
          + " : pCommerceItemId = "+pCommerceItemId);
    }
    
    init(null, pProductId, pInstanceNumber, pCommerceItemId);

    mCommerceItemId = pCommerceItemId;
    
    if (mLogger.isLoggingDebug()) {
      mLogger.logDebug("Created new ProductConfigInstance : "
          + this.toString());
    }
  }

  
  /**
   * @param pPromotion
   * @param pProductId
   * @param pInstanceNumber
   * @throws ConfiguratorException
   */
  protected void init(
      PromotionConfigInstance pPromotion, String pProductId, int pInstanceNumber, String pCommerceItemId) 
      throws ConfiguratorException {
    
    mKey = createKey(pCommerceItemId, pProductId, pInstanceNumber);
    mDepth = determineProductDepth();
    mPromotionInstance = pPromotion;
  }
  
  /**
   * @return
   */
  public boolean getIsRootInstance() {
    return true;
  }
  
  // ============= CONFIGURATION CHANGE METHODS - START ===================// 
  /**
   * @return
   * @throws ConfiguratorException
   */
  public synchronized CommandResult beginConfiguration() {

    if (mLogger.isLoggingDebug()) {
      mLogger.logDebug("beginConfiguration() called - PCI == "+this);
    }
    CommandResult result = null;

    //could be re-entering configuration
    if (mStatus != ProductConfigInstanceStatus.NEW) {
       Object[] args = new Object[] { this, ConfigurationCommandType.END_CONFIG };
       String error = MessageFormat.format(Constants.INSTANCE_INVALID_STATE, args);
       result = getConfiguratorManager().createErrorResult(
       ConfigurationCommandType.BEGIN_CONFIG, Constants.ERROR_INVALID_STATE, error);
       mLogger.logError(error);
    } else {
      // Set the related CommerceItem status to false - this will prevent the user 
      // "checking out" their cart with un-configured products
      SiebelCommerceItem commerceItem = 
          getConfiguratorManager().getConfiguratorTools().getCommerceItem(this);
      if (commerceItem != null) {
        commerceItem.setConfigured(false);
        if (getPromotionInstance() != null) {
          // In this case we need to get the parent promotion to re-evaluate
          // the configured property of its related commerceItem
          getPromotionInstance().rootProductUpdated(getKey());
        }
      }
      
      ConfigurationContext context = new ConfigurationContext(this,
          ConfigurationCommandType.BEGIN_CONFIG);
      result = getConfiguratorManager().performProductConfigurationChange(
          context);
    }

    processResult(ConfigurationCommandType.BEGIN_CONFIG, result);
    if (result.getStatus().isSuccessfull()) {
      setStatus(ProductConfigInstanceStatus.INITIALISED);
    }
    
    if (mLogger.isLoggingDebug()) {
      mLogger.logDebug("Leaving beginConfiguration() - result == "+result);
    }
    return result;
  }
  
  
  /**
   * @return
   */
  public synchronized CommandResult editConfiguration() {
    
    if (mLogger.isLoggingDebug()) {
      mLogger.logDebug("editConfiguration() called - PCI == "+this);
    }
    CommandResult result = null;

    if (mStatus == ProductConfigInstanceStatus.INITIALISED) {
      // This PCI is already being configured i.e. BeginConfig already called
      // It could be that the customer has already started configuring the 
      // product from another browser window. We'll report a warning but 
      // allow things to proceed.
      Object[] args = new Object[] { this.getKey(), ConfigurationCommandType.END_CONFIG };
      String warning = MessageFormat.format(Constants.INSTANCE_BEING_CONFIGURED_MESSAGE, args);
      result = new CommandResult(getConfiguratorManager()
          .getConfiguratorTools().getCommandStatusManager()
          .createWarningCommandStatus(
              ConfigurationCommandType.BEGIN_CONFIG, 
              Constants.INSTANCE_BEING_CONFIGURED, warning));
      mLogger.logWarning(warning);
    } else {
      setStatus(ProductConfigInstanceStatus.CONFIGURED);
      ConfigurationContext context = new ConfigurationContext(this,
          ConfigurationCommandType.BEGIN_CONFIG);
      result = getConfiguratorManager().performProductConfigurationChange(
          context);
    }

    processResult(ConfigurationCommandType.BEGIN_CONFIG, result);
    if (result.getStatus().isSuccessfull()) {
      setStatus(ProductConfigInstanceStatus.INITIALISED);
    }
    
    if (mLogger.isLoggingDebug()) {
      mLogger.logDebug("Leaving editConfiguration() - result == "+result);
    }
    return result;
  }

  /**
   * @return
   * @throws ConfiguratorException
   */
  public synchronized CommandResult endConfiguration() {
    
    if (mLogger.isLoggingDebug()) {
      mLogger.logDebug("endConfiguration() called - PCI == "+this);
    }
    CommandResult result = null;

    if (mStatus != ProductConfigInstanceStatus.INITIALISED) {      
      Object[] args = new Object[] { this, ConfigurationCommandType.END_CONFIG };
      String error = null;
      if (mStatus.equals(ProductConfigInstanceStatus.NEW)) {
        error = MessageFormat.format(Constants.INSTANCE_NOT_INITIALISED, args);
      } else if (mStatus.equals(ProductConfigInstanceStatus.CONFIGURED)) {
        error = MessageFormat.format(Constants.INSTANCE_CONFIGURATION_COMPLETE, args);
      }
      result = getConfiguratorManager().createErrorResult(
          ConfigurationCommandType.END_CONFIG, Constants.ERROR_INVALID_STATE, error);
      mLogger.logError(error);
    } else {
      ConfigurationContext context = new ConfigurationContext(this,
          ConfigurationCommandType.END_CONFIG);
      result = getConfiguratorManager().performProductConfigurationChange(
          context);
    }
    
    processResult(ConfigurationCommandType.END_CONFIG, result);
    if (result.getStatus().isSuccessfull()) {
      // Set the related CommerceItem status to true - this will allow the user 
      // to "check out" their cart provided that all other root products/ci's are 
      // also configured
      setStatus(ProductConfigInstanceStatus.CONFIGURED);
      SiebelCommerceItem commerceItem = 
          getConfiguratorManager().getConfiguratorTools().getCommerceItem(this);
      commerceItem.setConfigured(true);
      if (getPromotionInstance() != null) {
        // In this case we need to get the parent promotion to re-evaluate 
        // the configured property of its related commerceItem
        getPromotionInstance().rootProductUpdated(getKey());
      }
    }

    if (mLogger.isLoggingDebug()) {
      mLogger.logDebug("Leaving endConfiguration() - result == "+result);
    }
    return result;
  }
  
  
  /**
   * @return
   * @throws ConfiguratorException
   */
  protected int determineProductDepth() throws ConfiguratorException {
    int depth = 1;
    if (isConfigurableProduct()) {
      depth = getConfiguratorManager().getConfiguratorTools()
          .determineProductDepth(getProductRepositoryItem(), depth);
    }
    return depth;
  }
  

  /**
   * @return
   */
  public int getProductDepth() {
    return mDepth;
  }

  
  @Override
  protected boolean isValidStateForConfigurationChange() {
    return (mStatus == ProductConfigInstanceStatus.INITIALISED);
  }

  public void setPromotionInstance(PromotionConfigInstance pPromo)
  {
    mPromotionInstance = pPromo;
  }
  
  
  /* (non-Javadoc)
   * @see atg.siebel.configurator.ProductConfigInstance#isConfigurableViaSiebelWebservice()
   */
  public boolean isConfigurableViaSiebelWebservice() {
    return getConfiguratorManager().getConfiguratorTools()
        .isConfigurableViaSiebelWebservice(getType(), true, isABO());
  }
  
}
