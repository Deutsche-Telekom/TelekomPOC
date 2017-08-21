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

import java.util.Iterator;

import javax.xml.soap.Name;
import javax.xml.soap.Node;
import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPHeaderElement;
import javax.xml.ws.handler.soap.SOAPMessageContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import atg.siebel.integration.AuthMessageHandler;
import atg.siebel.integration.SiebelSession;
import atg.siebel.integration.SiebelUserSessionStore;


/**
 * This adds the username/password to the SOAP header
 */
public class ConfiguratorAuthMessageHandler
  extends AuthMessageHandler {

  //-------------------------------------
  /** Class version string */

  public static String CLASS_VERSION = "$Id: //product/Siebel/version/11.2/src/atg/siebel/configurator/ConfiguratorAuthMessageHandler.java#2 $$Change: 1194813 $";


  private static final Log log = LogFactory.getLog(ConfiguratorAuthMessageHandler.class);

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
      WS_PREFIX, URI, SessionType.ServerDetermine.name());
    createHeaderChildElement(pEnvelope, header, SOAPHeader.LangCode.name(),
      WS_PREFIX, URI, Locale.ENU.name());
    createHeaderChildElement(pEnvelope, header, SOAPHeader.Locale.name(),
      WS_PREFIX, URI, Locale.ENU.name());

    // determine to add the user credentials to the header
    SiebelSession session = SiebelUserSessionStore.getSiebelSession();
    String token = session.getUserToken();
    if (token == null || token.isEmpty()) {
      createHeaderChildElement(pEnvelope, header, SOAPHeader.UsernameToken
        .name(), WS_PREFIX, URI, getUsername());

      createHeaderChildElement(pEnvelope, header, SOAPHeader.PasswordText
        .name(), WS_PREFIX, URI, getPassword());
    } else {
      createHeaderChildElement(pEnvelope, header, SOAPHeader.SessionToken
        .name(), WS_PREFIX, URI, session.getUserToken());
    }
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
          SiebelSession session = SiebelUserSessionStore.getSiebelSession();
          session.setUserToken(headerElement.getTextContent());
          SiebelUserSessionStore.setSiebelSession(session);
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
}
