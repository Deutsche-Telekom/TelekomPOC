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

package atg.siebel.pricing;

import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPException;
import javax.xml.ws.handler.soap.SOAPMessageContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import atg.siebel.integration.AuthMessageHandler;


/**
 * This adds the username/password to the SOAP header
 */
public class PricingAuthMessageHandler
  extends AuthMessageHandler {

  //-------------------------------------
  /** Class version string */

  public static String CLASS_VERSION = "$Id: //product/Siebel/version/11.2/src/atg/siebel/pricing/PricingAuthMessageHandler.java#2 $$Change: 1194813 $";


  private static final Log log = LogFactory.getLog(PricingAuthMessageHandler.class);

  
  @Override
  public void handleInMessage(SOAPMessageContext ctx) {
    if (log.isDebugEnabled()) {
      log.debug("handleInMessage() called: this method does nothing!");
    }
  }
  
  
  /**
   * Adds the authorization login header to the SOAP request.
   * This method will always add login details to the header
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
    createHeaderChildElement(pEnvelope, header, SessionType.ServerDetermine
        .name(), WS_PREFIX, URI, SOAPHeader.SessionType.name());
    createHeaderChildElement(pEnvelope, header, SOAPHeader.LangCode.name(),
        WS_PREFIX, URI, Locale.ENU.name());
    createHeaderChildElement(pEnvelope, header, SOAPHeader.Locale.name(),
        WS_PREFIX, URI, Locale.ENU.name());
    createHeaderChildElement(pEnvelope, header,
        SOAPHeader.UsernameToken.name(), WS_PREFIX, URI, getUsername());
    createHeaderChildElement(pEnvelope, header, SOAPHeader.PasswordText.name(),
        WS_PREFIX, URI, getPassword());

  }
}
