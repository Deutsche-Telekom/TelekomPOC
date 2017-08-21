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

import atg.siebel.configurator.Constants.ConfigurationCommandType;
import atg.siebel.configurator.command.CommandResult;
import atg.siebel.integration.SiebelSessionToken;

import java.text.MessageFormat;

/**
 * An instance of a child product
 *
 * @author bbrady
 * @version $Id: //product/Siebel/version/11.2/src/atg/siebel/configurator/ChildProductConfigInstance.java#2 $$Change: 1194813 $
 * @updated $DateTime: 2015/09/10 08:26:24 $$Author: saysyed $
 */
public class ChildProductConfigInstance extends ProductConfigInstance {
  
 
  //-------------------------------------
  // Constants
  //-------------------------------------
  /** Class version string */
  public static final String CLASS_VERSION = "$Id: //product/Siebel/version/11.2/src/atg/siebel/configurator/ChildProductConfigInstance.java#2 $$Change: 1194813 $";


  //-------------------------------------
  // Member variables
  //-------------------------------------
  protected ProductConfigRelationship mParentRelationship;
  
  
  //-------------------------------------
  // Properties
  //-------------------------------------
  
  // -------------------------------------
  // property: rootInstance
  protected RootProductConfigInstance mRootInstance;

  public void setRootInstance(RootProductConfigInstance pRootInstance) {
    mRootInstance = pRootInstance;
  }

  public RootProductConfigInstance getRootInstance() {
    return mRootInstance;
  }
  
  /**
   * Constructor for creating a child product instance.
   * 
   * @param pParentRelationship
   * @param pProductId
   * @param pInstanceNumber
   * @throws ConfiguratorException
   */
  protected ChildProductConfigInstance(ProductConfigRelationship pParentRelationship,
      String pProductId, int pInstanceNumber) throws ConfiguratorException {

    super(pParentRelationship.getParentInstance().getOrderId(), pProductId,
        pParentRelationship.getParentInstance().getConfiguratorManager());

    if (mLogger.isLoggingDebug()) {
      mLogger.logDebug("Entered ProductConfigInstance() : pProductId = "
          + pProductId + " : pInstanceNumber = " + pInstanceNumber
          + " : pParentRelationship = "+pParentRelationship);
    }

    mParentRelationship = pParentRelationship;

    // Inherit everything else from the parent
    ProductConfigInstance parentInstance = (ProductConfigInstance) pParentRelationship
        .getParentInstance();
    mKey = createKey(parentInstance, pProductId, pInstanceNumber);
    
    //The mRootInstance should be set to updated PCI.
    //During ABO edit, the mRootInstance was not getting updated and its status was remaining as CONFIGURED,
    if (parentInstance instanceof RootProductConfigInstance) {
      mRootInstance = (RootProductConfigInstance) parentInstance;
    } else {
      mRootInstance = ((ChildProductConfigInstance) parentInstance).getRootInstance();
    }    
    mPromotionInstance = parentInstance.getPromotionInstance();
    
    if (mLogger.isLoggingDebug()) {
      mLogger.logDebug("Created new ProductConfigInstance : "
          + this.toString());
    }
  }
  
  
  /**
   * This method is used to attach this child instance to the parent 
   * relationship parameter value and to re-evaluate its key property
   * value.
   * 
   * @param pParentRelationship - new parent of this child instance
   * @throws ConfiguratorException
   */
  protected void refreshChildProductConfigInstance(
      ProductConfigRelationship pParentRelationship) throws ConfiguratorException {

    if (mLogger.isLoggingDebug()) {
      mLogger.logDebug("Entered refreshChildProductConfigInstance() : pParentRelationship = "
          +pParentRelationship);
    }

    mParentRelationship = pParentRelationship;

    // Inherit everything else from the parent
    ProductConfigInstance parentInstance = (ProductConfigInstance) pParentRelationship
        .getParentInstance();
    mKey = createKey(parentInstance, getProductId(), 
        mParentRelationship.getNextInstanceNumber(getProductId()));
    
    if (parentInstance instanceof RootProductConfigInstance) {
        mRootInstance = (RootProductConfigInstance) parentInstance;
      } else {
        mRootInstance = ((ChildProductConfigInstance) parentInstance).getRootInstance();
      }    
      mPromotionInstance = parentInstance.getPromotionInstance();
    
    if (mLogger.isLoggingDebug()) {
      mLogger.logDebug("Leaving refreshChildProductConfigInstance : instance == "
          + this.toString());
    }
  }
  
  
  /**
   * @return this child's parent relationship
   */
  public AbstractRelationship getParentRelationship() {
      return mParentRelationship;
  }
  
  
  /**
   * Subject to cardinality values being honoured this will 
   * result in a removeItem webservice call going out to Siebel.
   * If the outcome of that call is a success then this child instance
   * is "de-commissioned"
   * 
   * @return CommandResult which will have the status of the 
   *         delete operation
   */
  public synchronized CommandResult deleteInstance() {

    if (mLogger.isLoggingDebug()) {
      mLogger.logDebug("Entered deleteInstance() : PCI = " + this.toString());
    }
    
    CommandResult result = null;
    
    if (!isValidStateForConfigurationChange()) {
      Object[] args = new Object[] { this.getKey(),
          ConfigurationCommandType.REMOVE_PRODUCT };
      String error = MessageFormat.format(Constants.INSTANCE_INVALID_STATE,
          args);
      result = getConfiguratorManager().createErrorResult(
          ConfigurationCommandType.REMOVE_PRODUCT, Constants.ERROR_INVALID_STATE,
          error);
      mLogger.logError(error);
    }

    if (result == null) {
      if (mParentRelationship.getChildInstanceCount() > mParentRelationship
          .getMinimumQuantity()) {
        ConfigurationContext context = createDeleteProductContext();
        result = getConfiguratorManager().performProductConfigurationChange(
            context);
        if (result.getStatus().isSuccessfull()) {
          // If successful then detach this instance from the
          // parent relationship object and remove from cache
          mParentRelationship.removeChildInstance(this);
          getConfiguratorManager().getConfiguratorTools()
              .getProductConfigInstanceCache()
              .removeProductConfigInstanceFromCache(this);
        }

      } else {
        Object[] args = new Object[] { getProductId(),
            mParentRelationship.getId() };
        String error = MessageFormat.format(
            Constants.RELATIONSHIP_CARDINALITY_VIOLATION, args);
        result = getConfiguratorManager().createErrorResult(
            ConfigurationCommandType.REMOVE_PRODUCT,
            Constants.ERROR_MIN_CARDINALITY, error);
        mLogger.logError(error);
        mParentRelationship.setError(Constants.ERROR_MIN_CARDINALITY);
      }
    }

    ((ProductConfigInstance) mParentRelationship.getParentInstance())
        .processResult(ConfigurationCommandType.REMOVE_PRODUCT, result);
    
    if (result.getStatus().isSuccessfull()) {
      mParentRelationship = null;
      mRootInstance = null;
      mPromotionInstance = null;
      mConfiguratorManager = null;
      mRepositoryItem = null;
    }

    if (mLogger.isLoggingDebug()) {
      mLogger.logDebug("Leaving deleteInstance() : result = " + result);
    }
    return result;
  }
  
  
  /**
   * Creates context object used in delete instance operation
   * 
   * @return context information for delete operation
   * @throws ConfiguratorException
   */
  public ConfigurationContext createDeleteProductContext() {
    
    if (mLogger.isLoggingDebug()) {
      mLogger.logDebug("Entered createDeleteProductContext()");
    }
    
    ConfigurationContext context = new ConfigurationContext(this,
        ConfigurationCommandType.REMOVE_PRODUCT);
    
    if (mLogger.isLoggingDebug()) {
      mLogger.logDebug("Leaving createDeleteProductContext() : context == "
          + context);
    }
    
    return context;
  }

  
  
  @Override
  protected boolean isValidStateForConfigurationChange() {
    return getRootInstance().isValidStateForConfigurationChange();
  }
  
  
  /* (non-Javadoc)
   * @see atg.siebel.configurator.ProductConfigInstance#isConfigurableViaSiebelWebservice()
   */
  public boolean isConfigurableViaSiebelWebservice() {
    return getConfiguratorManager().getConfiguratorTools()
        .isConfigurableViaSiebelWebservice(getRootInstance().getType(), true, getRootInstance().isABO());
  }

  /**
   * get the token from the root instance
   * @return
   */
  public SiebelSessionToken getSiebelSessionToken()
  {
    return getRootInstance().getSiebelSessionToken();
  }

  public void setSiebelSessionToken(SiebelSessionToken pSiebelSessionToken)
  {
    getRootInstance().setSiebelSessionToken(pSiebelSessionToken);
  }
  
}
