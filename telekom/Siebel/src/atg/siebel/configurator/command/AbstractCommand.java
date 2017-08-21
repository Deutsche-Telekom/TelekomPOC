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

package atg.siebel.configurator.command;

import javax.xml.ws.soap.SOAPFaultException;

import atg.commerce.order.Order;
import atg.nucleus.logging.ApplicationLogging;
import atg.nucleus.logging.ClassLoggingFactory;
import atg.repository.RepositoryItem;
import atg.servlet.ServletUtil;
import atg.siebel.configurator.BaseConfigInstance;
import atg.siebel.configurator.ConfigurationContext;
import atg.siebel.configurator.ConfigurationParams;
import atg.siebel.configurator.ConfiguratorException;
import atg.siebel.configurator.ConfiguratorTools;
import atg.siebel.configurator.Constants.ConfigurationCommandType;
import atg.siebel.configurator.status.CommandStatus;

import com.siebel.ordermanagement.configurator.cfginteractstatus.ListOfStatus;

/**
 * Encapsulates data & behavior common to all *Command classes
 * 
 * @author bbrady
 * @version $Id: //product/Siebel/version/11.2/src/atg/siebel/configurator/command/AbstractCommand.java#2 $$Change: 1194813 $
 * @updated $DateTime: 2015/09/10 08:26:24 $$Author: saysyed $
 */
public abstract class AbstractCommand {

  //-------------------------------------
  /** Class version string */

  public static String CLASS_VERSION = "$Id: //product/Siebel/version/11.2/src/atg/siebel/configurator/command/AbstractCommand.java#2 $$Change: 1194813 $";


  /** Logger */
  protected static ApplicationLogging mLogger = ClassLoggingFactory
      .getFactory().getLoggerForClass(AbstractCommand.class);

  private final BaseConfigInstance mInstance;
  public BaseConfigInstance getInstance() {
    return mInstance;
  }
  
  private final ConfigurationParams mConfigurationParams;
  public ConfigurationParams getConfigurationParams() {
    return mConfigurationParams;
  }
  
  protected final ConfigurationCommandType mCommandType;
  public ConfigurationCommandType getCommandType() {
      return mCommandType;
  }

  // --------- Property: configuratorManager -----------
  protected ConfiguratorTools mConfiguratorTools;

  public void setConfiguratorTools(ConfiguratorTools pConfiguratorTools) {
    mConfiguratorTools = pConfiguratorTools;
  }

  public ConfiguratorTools getConfiguratorTools() {
    return mConfiguratorTools;
  }

  /**
   * @param pContext
   */
  public AbstractCommand(ConfigurationContext pContext) {
    if (mLogger.isLoggingDebug()) {
      mLogger.logDebug("AbstractCommand constructor called : pEvent == "
          + pContext);
    }
    mConfigurationParams = pContext.getConfigurationParams();
    mInstance = pContext.getInstance();
    mCommandType = pContext.getCommandType();
  }

  /**
   * Executes relevant logic according to the type of command
   * 
   * @return
   * @throws CfgException
   */
  public CommandResult execute() throws ConfiguratorException {
    if (mLogger.isLoggingDebug()) {
      mLogger.logDebug("execute() called");
    }
    CommandResult result = doExecute();
    if (mLogger.isLoggingDebug()) {
      mLogger.logDebug("Leaving execute() : result == " + result);
    }
    return result;
  }

  /**
   * PRocess list of statuses from the executed command
   * 
   * @return
   */
  protected CommandStatus createCommandStatus(String pErrorCode,
      String pErrorMessage, ListOfStatus pListOfStatus) {
    if (mLogger.isLoggingDebug()) {
      mLogger.logDebug("processStatus called : listOfStatus == "
          + pListOfStatus);
    }

    CommandStatus commandStatus = getConfiguratorTools()
        .getCommandStatusManager().createCommandStatusFromSiebelResponse(
            getCommandType(), pErrorCode, pErrorMessage, pListOfStatus);

    if (mLogger.isLoggingDebug()) {
      mLogger.logDebug("Leaving processStatus : commandStatus == "
          + commandStatus);
    }
    return commandStatus;
  }


  protected abstract CommandResult doExecute() throws ConfiguratorException;

  
  /**
   * @param pException
   * @return
   */
  protected CommandResult produceResult(SOAPFaultException pException) {
    if (mLogger.isLoggingDebug()) {
      mLogger.logDebug("produceResult called : pException == "
          + pException);
    }
    
    CommandResult result = new CommandResult();
    CommandStatus status = getConfiguratorTools()
        .getCommandStatusManager().createCommandStatusFromSoapFault(
        getCommandType(), pException);
    result.setStatus(status);
    
    if (mLogger.isLoggingDebug()) {
      mLogger.logDebug("Leaving produceResult : result == "
          + result);
    }
    return result;
  }

  
  /**
   * @param pOrderId
   * @return
   * @throws ConfiguratorException
   */
  protected RepositoryItem getUserProfile(String pOrderId) {
    RepositoryItem profile = null;
    try {
      profile = getConfiguratorTools().getProfileTools().getProfileForOrder(
          pOrderId);
      if (profile == null) {
        profile = ServletUtil.getCurrentUserProfile();
        if (profile != null) {
          Order order = getConfiguratorTools().getOrderHolder().getCurrent();
          // Should this check ever fail??? We should always be working
          // with the order in the cart.
          if (order.getId().equals(pOrderId)) {
            order.setProfileId(profile.getRepositoryId());
            getConfiguratorTools().getOrderManager().updateOrder(order);
          } else {
            mLogger.logError("Unable to get profileId for order = "+pOrderId);
          }
        }
      }
    } catch (Exception e) {
      mLogger.logError(e);
    }
    return profile;
  }

}
