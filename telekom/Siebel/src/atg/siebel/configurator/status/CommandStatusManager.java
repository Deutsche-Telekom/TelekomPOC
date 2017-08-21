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
package atg.siebel.configurator.status;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.MissingResourceException;

import javax.xml.soap.Detail;
import javax.xml.soap.Node;
import javax.xml.ws.soap.SOAPFaultException;

import org.w3c.dom.NodeList;

import atg.core.i18n.LayeredResourceBundle;
import atg.core.util.ResourceUtils;
import atg.core.util.StringUtils;
import atg.nucleus.GenericService;
import atg.siebel.configurator.Constants.ConfigurationCommandType;
import atg.siebel.configurator.status.CommandStatus.StatusCode;
import atg.siebel.configurator.status.StatusDetails;
import atg.siebel.configurator.status.SiebelResponseStatusDetails;
import atg.siebel.configurator.status.SiebelSoapFaultDetails;
import atg.siebel.configurator.status.SiebelSoapFaultError;

import com.siebel.ordermanagement.configurator.cfginteractstatus.ListOfStatus;

/**
 * 
 * 
 * 
 * @author bbrady
 * @version $Id: //product/Siebel/version/11.2/src/atg/siebel/configurator/status/CommandStatusManager.java#2 $$Change: 1194813 $
 * @updated $DateTime: 2015/09/10 08:26:24 $$Author: saysyed $
 */
public class CommandStatusManager extends GenericService {

  //-------------------------------------
  /** Class version string */

  public static String CLASS_VERSION = "$Id: //product/Siebel/version/11.2/src/atg/siebel/configurator/status/CommandStatusManager.java#2 $$Change: 1194813 $";


  protected static final String MY_RESOURCE_NAME = "atg.siebel.resources.SiebelConfiguratorResources";

  protected static java.util.ResourceBundle sResourceBundle = LayeredResourceBundle
      .getBundle(MY_RESOURCE_NAME,
          atg.service.dynamo.LangLicense.getLicensedDefault());

  // -------------------------------------
  // property: defaultUIMessage
  protected String mDefaultUIMessage = "";

  public String getDefaultUIMessage() {
    return mDefaultUIMessage;
  }

  public void setDefaultUIMessage(String pDefaultSuccessMessage) {
    mDefaultUIMessage = pDefaultSuccessMessage;
  }

  // -------------------------------------
  // property: defaultErrorMessage
  protected String mDefaultErrorMessage = "Default Error Message!";

  public String getDefaultErrorMessage() {
    return mDefaultErrorMessage;
  }

  public void setDefaultErrorMessage(String pDefaultErrorMessage) {
    mDefaultErrorMessage = pDefaultErrorMessage;
  }
  
  // -------------------------------------
  // property: defaultWarningMessage
  protected String mDefaultWarningMessage = "Default Warning Message!";

  public String getDefaultWarningMessage() {
    return mDefaultErrorMessage;
  }

  public void setDefaultWarningMessage(String pDefaultWarningMessage) {
    mDefaultWarningMessage = pDefaultWarningMessage;
  }
  
  // -------------------------------------
  // property: treatWarningAsSuccess
  protected boolean mTreatWarningAsSuccess = true;

  public boolean getTreatWarningAsSuccess() {
    return mTreatWarningAsSuccess;
  }

  public void setTreatWarningAsSuccess(boolean pTreatWarningAsSuccess) {
    mTreatWarningAsSuccess = pTreatWarningAsSuccess;
  }
  
  
  /**
   * @param pCommandType
   * @param pErrorCode
   * @param pErrorDescription
   * @param pStatusCode
   * @param pListOfStatus
   * @return
   */
  public CommandStatus createCommandStatusFromSiebelResponse(
      ConfigurationCommandType pCommandType, String pErrorCode,
      String pErrorDescription, ListOfStatus pListOfStatus) {

    if (isLoggingDebug()) {
      StringBuffer sb = new StringBuffer(
          "Entered createCommandStatusFromSiebelResponse : ");
      sb.append("[pCommandType == ").append(pCommandType).append("]");
      sb.append("[pErrorCode == ").append(pErrorCode).append("]");
      sb.append("[pErrorDescription == ").append(pErrorDescription).append("]");
      sb.append("[pListOfStatus == ").append(pListOfStatus);
      logDebug(sb.toString());
    }

    CommandStatus status = null;
    if (StringUtils.isEmpty(pErrorCode)
        && StringUtils.isEmpty(pErrorDescription)
        && (pListOfStatus == null || pListOfStatus.getStatus().getStatusCode()
            .equalsIgnoreCase(StatusCode.SUCCESS.name()))) {
      status = new CommandStatus(pCommandType);
    } else {
      StatusDetails siebelStatusDetails = new SiebelResponseStatusDetails(
          pErrorCode, pErrorDescription, pListOfStatus);
      if (pListOfStatus != null && pListOfStatus.getStatus().getStatusCode()
          .equalsIgnoreCase(StatusCode.WARNING.name())) {
        status = new CommandStatus(pCommandType, getTreatWarningAsSuccess(),
            siebelStatusDetails);
      } else {
        status = new CommandStatus(pCommandType, siebelStatusDetails);
      }
    }

    if (isLoggingDebug()) {
      StringBuffer sb = new StringBuffer(
          "Leaving createCommandStatusFromSiebelResponse : ");
      sb.append("[status == ").append(status).append("]");
      logDebug(sb.toString());
    }
    return status;
  }

  
  /**
   * @param pCommandType
   * @param pSoapFault
   * @return
   */
  public CommandStatus createCommandStatusFromSoapFault(
      ConfigurationCommandType pCommandType, SOAPFaultException pSoapFault) {

    if (isLoggingDebug()) {
      StringBuffer sb = new StringBuffer("Entered createCommandStatusFromSoapFault : ");
      sb.append("[pCommandType == ").append(pCommandType).append("]");
      sb.append("[pSoapFault == ").append(pSoapFault).append("]");
      logDebug(sb.toString());
    }
    
    List<SiebelSoapFaultError> errorList = new ArrayList<SiebelSoapFaultError>();    
    String faultCode = pSoapFault.getFault().getFaultCode();
    String FaultString = pSoapFault.getFault().getFaultString();
    SiebelSoapFaultDetails soapFaultDetails = new SiebelSoapFaultDetails(
        faultCode, FaultString, errorList);
    
    Detail detail = pSoapFault.getFault().getDetail();
    Iterator siebdetailNodes = detail.getChildElements();
    while (siebdetailNodes.hasNext()) {
      Node nextNode = (Node) siebdetailNodes.next();
      if (nextNode.getNodeName().equals("siebdetail")) {
        NodeList siebdetailChildNodes = nextNode.getChildNodes();
        for (int i = 0; i < siebdetailChildNodes.getLength(); i++) {
          org.w3c.dom.Node siebdetailChildNode = siebdetailChildNodes.item(i);
          if (siebdetailChildNode.getNodeName().equals("errorstack")) {
            NodeList errorNodes = siebdetailChildNode.getChildNodes();
            for (int ii = 0; ii < errorNodes.getLength(); ii++) {
              
              SiebelSoapFaultError soapFaultError = new SiebelSoapFaultError();
              org.w3c.dom.Node errorNode = errorNodes.item(ii);
              NodeList errorNodeChildren = errorNode.getChildNodes();
              for (int iii = 0; iii < errorNodeChildren.getLength(); iii++) {
                org.w3c.dom.Node errorField = errorNodeChildren.item(iii);
                if (errorField.getNodeName().equals("errorcode")) {
                  soapFaultError.setStatusCode(errorField.getNodeValue());
                } else if (errorField.getNodeName().equals("errorsymbol")) {
                  soapFaultError.setErrorSymbol(errorField.getNodeValue());
                } else if (errorField.getNodeName().equals("errormsg")) {
                  soapFaultError.setDescription(errorField.getNodeValue());
                }
              }
              errorList.add(soapFaultError);
              
            }
          }
        }

      }
    }
    CommandStatus status = new CommandStatus(pCommandType, soapFaultDetails);
    if (isLoggingDebug()) {
      StringBuffer sb = new StringBuffer(
          "Leaving createCommandStatusFromSoapFault : ");
      sb.append("[status == ").append(status).append("]");
      logDebug(sb.toString());
    }
    return status;
  }

  /**
   * @param pCommandType
   * @param pErrorCode
   * @param pErrorDescription
   * @return
   */
  public CommandStatus createCommandStatusFromConfiguratorError(
      ConfigurationCommandType pCommandType, String pErrorCode,
      String pErrorDescription) {
    if (isLoggingDebug()) {
      StringBuffer sb = new StringBuffer(
          "Entered createCommandStatusFromConfiguratorError : ");
      sb.append("[pCommandType == ").append(pCommandType).append("]");
      sb.append("[pErrorCode == ").append(pErrorCode).append("]");
      sb.append("[pErrorDescription == ").append(pErrorDescription).append("]");
      logDebug(sb.toString());
    }
    StatusDetails errorDetails = new StatusDetails(pErrorCode, pErrorDescription);
    CommandStatus status = new CommandStatus(pCommandType, errorDetails);
    if (isLoggingDebug()) {
      StringBuffer sb = new StringBuffer(
          "Leaving createCommandStatusFromConfiguratorError : ");
      sb.append("[status == ").append(status).append("]");
      logDebug(sb.toString());
    }
    return status;
  }



  /**
   * @param pStatus
   * @return
   */
  public String getUIMessage(CommandStatus pStatus) {
    if (isLoggingDebug()) {
      logDebug("Entered getUIMessage() - pStatus == "+pStatus);
    }
    String uiMessage = null;
    if (pStatus == null || pStatus.getStatusDetails() == null) {
      // This equates to a CommandStatus of success (statusDetails == null)
      uiMessage = getDefaultUIMessage();      
    } else {
      // This could be a success but with warnings which we may want
      // to interpret and display
      uiMessage =  getUIMessage(pStatus.getStatusDetails());
      if (uiMessage == null) {
        if (pStatus.getStatusDetails().getStatusCode().equalsIgnoreCase(
            (StatusCode.WARNING.name()))) {
          uiMessage = getDefaultWarningMessage();
        } else {
          uiMessage = getDefaultErrorMessage();
        }
      }
    }
    if (isLoggingDebug()) {
      logDebug("Leaving getUIMessage() - uiMessage == "+uiMessage);
    }
    return uiMessage;
  }

  
  /**
   * @param pStatusDetails
   * @return
   */
  protected String getUIMessage(StatusDetails pStatusDetails) {
    if (isLoggingDebug()) {
      logDebug("Entered getUIMessage() - pStatusDetails == " + pStatusDetails);
    }
    String uiMessage = null;

    if (pStatusDetails instanceof SiebelResponseStatusDetails) {
      uiMessage = getUIMessageFromSiebelResponse((SiebelResponseStatusDetails) pStatusDetails);
    } else if (pStatusDetails instanceof SiebelSoapFaultDetails) {
      uiMessage = getUIMessageFromSoapFault((SiebelSoapFaultDetails) pStatusDetails);
    } else {
      try {
        String resourceString = ResourceUtils.getUserMsgResource(
            pStatusDetails.getStatusCode(), MY_RESOURCE_NAME, sResourceBundle);
        if (!resourceString.startsWith("no resource named ")) {
          uiMessage = resourceString;
        }
      } catch (MissingResourceException mre) {
      }
    }
    if (isLoggingDebug()) {
      logDebug("Leaving getUIMessage() - uiMessage == " + uiMessage);
    }
    return uiMessage;
  }
  
  
  /**
   * @param pStatusDetails
   * @return
   */
  protected String getUIMessageFromSiebelResponse(SiebelResponseStatusDetails pSiebelStatusDetails) {
    if (isLoggingDebug()) {
      logDebug("Entered getUIMessageFromSiebelResponse() - pSiebelStatusDetails == "
          +pSiebelStatusDetails);
    }
    String uiMessage = null;
    
    // Shipping with an empty implementation. Customers can provide 
    // their own implementation to map Siebel responses to UI messages.
    
    if (isLoggingDebug()) {
      logDebug("Leaving getUIMessageFromSiebelResponse() - uiMessage == "+uiMessage);
    }
    return uiMessage;
  }
  
  
  /**
   * @param pStatusDetails
   * @return
   */
  protected String getUIMessageFromSoapFault(SiebelSoapFaultDetails pSiebelStatusDetails) {
    if (isLoggingDebug()) {
      logDebug("Entered getUIMessageFromSoapFault() - pSiebelStatusDetails == "
          +pSiebelStatusDetails);
    }
    String uiMessage = null;
    
    // Shipping with an empty implementation. Customers can provide 
    // their own implementation to map Siebel responses to UI messages.
    
    if (isLoggingDebug()) {
      logDebug("Leaving getUIMessageFromSoapFault() - uiMessage == "+uiMessage);
    }
    return uiMessage;
  }


  /**
   * @param pKey
   * @return
   */
  protected String getErrorMessage(String pKey) {
    String errorMessage = null;
    try {
      errorMessage = ResourceUtils.getUserMsgResource(
          pKey, MY_RESOURCE_NAME, sResourceBundle);
      if (errorMessage.startsWith("no resource named ")) {
        errorMessage = getDefaultErrorMessage();
      }
    } catch (MissingResourceException mre) {
      errorMessage = getDefaultErrorMessage();
    }
    return errorMessage;
  }

  

  /**
   * @param pCommandType
   * @return
   */
  public CommandStatus createSuccessCommandStatus(
      ConfigurationCommandType pCommandType) {
    return new CommandStatus(pCommandType);
  }


  /**
   * @param pCommandType
   * @param pWarningCode
   * @param pDescription
   * @return
   */
  public CommandStatus createWarningCommandStatus(
      ConfigurationCommandType pCommandType, String pWarningCode, String pDescription) {
    StatusDetails statusDetails = new StatusDetails(pWarningCode, pDescription);
    return new CommandStatus(pCommandType, getTreatWarningAsSuccess(), statusDetails);
  }
}
