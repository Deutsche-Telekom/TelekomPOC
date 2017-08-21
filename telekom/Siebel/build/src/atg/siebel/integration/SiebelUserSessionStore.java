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

import atg.service.resourcepool.ResourcePoolException;
import atg.servlet.ServletUtil;
import com.siebel.xml.sessionaccess.SessionAccessPingInput;

import java.lang.reflect.InvocationTargetException;

/**
 * User: Anton Gavazuk
 * Mail: anton.gavazuk@oracle.com
 * Date: 09/03/11
 * Time: 15:01
 * Created for Oracle ATG integration
 */
public class SiebelUserSessionStore {
   

  //-------------------------------------
  /** Class version string */

  public static String CLASS_VERSION = "$Id: //product/Siebel/version/11.2/src/atg/siebel/integration/SiebelUserSessionStore.java#3 $$Change: 1194813 $";
  


  private static final String SIEBEL_SESSION_TOKEN = "SIEBEL_SESSION_TOKEN";
  
    private static final ThreadLocal<SiebelSession>
            siebelSessionStorage = new ThreadLocal<SiebelSession>(){
        @Override
        protected SiebelSession initialValue() {
            return new SiebelSession();
        }
    };

    public static void setSiebelSession(SiebelSession session){
        siebelSessionStorage.set(session);
    }

    public static SiebelSession getSiebelSession(){
        return siebelSessionStorage.get();
    }

    public static void reset() {
    	siebelSessionStorage.remove();
    }

    /**
     * logs the current session out of Siebel and resets the session store in the integration
     * 
     * @param pWebServiceHelper
     */
  public static void logout(WebServiceHelper pWebServiceHelper, Object pClient, WebServiceController pWebServiceController)
          throws NoSuchMethodException,
          IllegalAccessException,
          ResourcePoolException,
          InvocationTargetException,
          SiebelWebServiceConfigurationException {
    // create the logout input
    SessionAccessPingInput sessionAccessPingInput = new SessionAccessPingInput();

    sessionAccessPingInput.setMsgIn("\"Logout Request\"");

    //SessionAccessWS sessionAccessWS = new SessionAccessWS();
    //Port port = sessionAccessWS.getPort();

    //pWebServiceHelper.prepareConnection((BindingProvider) port);

    //port.sessionAccessPing(sessionAccessPingInput);

    pWebServiceController.callWebService(
            "com.siebel.xml.sessionaccess.SessionAccessWS",
            "Port",
            "sessionAccessPing",
            sessionAccessPingInput,
            pClient,
            pWebServiceHelper);

    reset();
    // clear the session token from user web session
    if (ServletUtil.getCurrentRequest() != null
        && ServletUtil.getCurrentRequest().getSession() != null) {
      ServletUtil.getCurrentRequest().getSession()
          .setAttribute(SIEBEL_SESSION_TOKEN, null);
    }
  }
}
