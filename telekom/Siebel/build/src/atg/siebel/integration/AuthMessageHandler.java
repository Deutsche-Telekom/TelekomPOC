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

package atg.siebel.integration;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.xml.soap.*;
import javax.xml.ws.handler.soap.SOAPMessageContext;
import java.util.Iterator;

/**
 * This adds the username/password to the SOAP header
 */
public class AuthMessageHandler
        extends AbstractSOAPHandler {

  //-------------------------------------
  /** Class version string */

  public static String CLASS_VERSION = "$Id: //product/Siebel/version/11.2/src/atg/siebel/integration/AuthMessageHandler.java#3 $$Change: 1194813 $";


  private static final Log log = LogFactory.getLog(AuthMessageHandler.class);

  // private static final String OBJECT_MANAGER_DOWN = "10879185";
  // private static final String LOGIN_FAILED = "10944642";

  protected static final String WS_PREFIX = "sbh";
  protected static final String URI = "http://siebel.com/webservices";

  protected enum SessionType {
    None, ServerDetermine, Stateless, Stateful
  }

  protected enum Locale {
    ENU, DEU, ITA, FRA
  }

  protected enum SOAPHeader {
    SessionType, LangCode, Locale, SessionToken, UsernameToken, PasswordText
  }

  String mPassword;

  /**
   * @description: The password for the Siebel login
   */
  public void setPassword(String pPassword) {
    mPassword = pPassword;
  }

  /**
   * @return The password for the Siebel login
   */
  public String getPassword() {
    return mPassword;
  }

  protected String mDefaultSessionType;

  /**
   * @description: The default session type for siebel web service calls
   */
  public void setDefaultSessionType(String pDefaultSessionType) {
    mDefaultSessionType = pDefaultSessionType;
  }

  /**
   * @return The default session type for siebel web service calls
   */
  public String getDefaultSessionType() {
    return mDefaultSessionType;
  }

  protected SessionType getSessionType() {
    SessionType sessionType = null;

    if (getDefaultSessionType().equals("None"))
      sessionType = SessionType.None;
    else if (getDefaultSessionType().equals("ServerDetermine"))
      sessionType = SessionType.ServerDetermine;
    else if (getDefaultSessionType().equals("Stateless"))
      sessionType = SessionType.Stateless;
    else if (getDefaultSessionType().equals("Stateful"))
      sessionType = SessionType.Stateful;

    return sessionType;
  }


  long mSessionTimeout;

  /**
   * @description: The number of milliseconds until the session token should no
   *               longer be used
   */
  public void setSessionTimeout(long pSessionTimeout) {
    mSessionTimeout = pSessionTimeout;
  }

  /**
   * @return The number of milliseconds until the session token should no longer
   *         be used
   */
  public long getSessionTimeout() {
    return mSessionTimeout;
  }

  String mUsername;

  /**
   * @description: The username for the Siebel login
   */
  public void setUsername(String pUsername) {
    mUsername = pUsername;
  }

  /**
   * @return The password for the Siebel login
   */
  public String getUsername() {
    return mUsername;
  }


  protected SessionTokenContainer mSessionTokenContainer;

  /**
   * get the session token container
   *
   * @return
   */
  public SessionTokenContainer getSessionTokenContainer()
  {
    return mSessionTokenContainer;
  }

  /**
   * set the session token container
   * @param pSessionTokenContainer
   */
  public void setSessionTokenContainer(SessionTokenContainer pSessionTokenContainer)
  {
    mSessionTokenContainer = pSessionTokenContainer;
  }

  @Override
  public void handleInMessage(SOAPMessageContext ctx) {
    if (log.isDebugEnabled()) {
      log.debug("handleInMessage: started");
    }
    try {
      SOAPEnvelope envelope = ctx.getMessage().getSOAPPart().getEnvelope();
      for (@SuppressWarnings("unchecked")
           Iterator<SOAPHeaderElement> iterator =
                   envelope.getHeader().getChildElements(); iterator.hasNext();) {
        SOAPHeaderElement headerElement = iterator.next();
        if (SOAPHeader.SessionToken.name().equalsIgnoreCase(
                headerElement.getLocalName())) {

          String token = headerElement.getTextContent();

          getSessionTokenContainer().addSessionToken(token);

          if (isLoggingDebug()) {
            logDebug("token response:"+token);
          }

          break;
        }
      }
    } catch (SOAPException e) {
      log.error(e, e);
    }
    if (log.isDebugEnabled()) {
      log.debug("handleInMessage: finished");
    }
  }

  @Override
  public void handleOutMessage(SOAPMessageContext ctx) {
    if (log.isDebugEnabled()) {
      log.debug("handleOutMessage: started");
    }

    try {
      SOAPEnvelope envelope = ctx.getMessage().getSOAPPart().getEnvelope();
      addAuthHeader(envelope);
    } catch (SOAPException e) {
      log.error(e, e);
    }

    if (log.isDebugEnabled()) {
      log.debug("handleOutMessage: finished");
    }
  }

  /**
   * Checks to see if the element exists in the header. If it does not, it
   * creates it.
   */
  protected void createHeaderChildElement(SOAPEnvelope pEnvelope,
                                          javax.xml.soap.SOAPHeader pHeader, String pElementName, String pPrefix,
                                          String pUri, String pValue) throws SOAPException {

    Name elementNameObj = pEnvelope.createName(pElementName, pPrefix, pUri);
    @SuppressWarnings("unchecked")
    Iterator<Node> sessionTypeIter =
            (Iterator<Node>) pHeader.getChildElements(elementNameObj);
    if (!sessionTypeIter.hasNext()) {
      SOAPElement element =
              pHeader.addChildElement(pElementName, pPrefix, pUri);
      element.setValue(pValue);
    }
  }

  /**
   * Adds the authorization header (login or session token) to the SOAP request.
   *
   * @param pEnvelope
   * @throws SOAPException
   */
  public void addAuthHeader(SOAPEnvelope pEnvelope) throws SOAPException {

    // if it doesn't have a header add one
    javax.xml.soap.SOAPHeader header = pEnvelope.getHeader();
    if (header == null) {
      header = pEnvelope.addHeader();
    }

    // Add session type, language, and local to header
    createHeaderChildElement(pEnvelope, header, SOAPHeader.SessionType.name(),
            WS_PREFIX, URI, getSessionType().name());
    createHeaderChildElement(pEnvelope, header, SOAPHeader.LangCode.name(),
            WS_PREFIX, URI, Locale.ENU.name());
    createHeaderChildElement(pEnvelope, header, SOAPHeader.Locale.name(),
            WS_PREFIX, URI, Locale.ENU.name());

    String token = getSessionTokenContainer().getSessionToken();

    if(isLoggingDebug())
    {
      logDebug("token:" + token);
    }

    if (token != null && !token.isEmpty()) {
      createHeaderChildElement(pEnvelope, header, SOAPHeader.SessionToken
              .name(), WS_PREFIX, URI, token);
    } else {
      createHeaderChildElement(pEnvelope, header, SOAPHeader.UsernameToken
              .name(), WS_PREFIX, URI, getUsername());

      createHeaderChildElement(pEnvelope, header, SOAPHeader.PasswordText
              .name(), WS_PREFIX, URI, getPassword());
    }
  }
}
