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

import java.util.List;

import javax.xml.ws.Binding;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.handler.Handler;

import atg.nucleus.GenericService;

/**
 * @author Kurt Matarese
 * 
 * Makes the siebel instance address configurable from one place
 */
public class WebServiceHelper
  extends GenericService {

  //-------------------------------------
  /** Class version string */

  public static String CLASS_VERSION = "$Id: //product/Siebel/version/11.2/src/atg/siebel/integration/WebServiceHelper.java#2 $$Change: 1194813 $";


  // private final String STATIC_PART =
  // "/custappsvcs_enu/start.swe?SWEExtSource=WebService&SWEExtCmd=Execute&WSSOAP=1";

  // -------------------------------------
  // Property: Handlers
  @SuppressWarnings("rawtypes")
  Handler[] mHandlers;

  /**
   * @description: List of handlers to process webservice requests
   */
  @SuppressWarnings("rawtypes")
  public void setHandlers(Handler[] pHandlers) {
    mHandlers = pHandlers;
  }

  /**
   * @return List of handlers to process webservice requests
   */
  @SuppressWarnings("rawtypes")
  public Handler[] getHandlers() {
    return mHandlers;
  }

  // -------------------------------------
  // Property: SiebelServer
  String mSiebelServer;

  /**
   * @description: The server name or IP of the Siebel server
   */
  public void setSiebelServer(String pSiebelServer) {
    mSiebelServer = pSiebelServer;
  }

  /**
   * @return The server name or IP of the Siebel server
   */
  public String getSiebelServer() {
    return mSiebelServer;
  }

  // -------------------------------------
  // Property: SiebelApp
  String mSiebelApp;

  /**
   * @description: The server name or IP of the Siebel server
   */
  public void setSiebelApp(String pSiebelApp) {
    mSiebelApp = pSiebelApp;
  }

  /**
   * @return The server name or IP of the Siebel server
   */
  public String getSiebelApp() {
    return mSiebelApp;
  }

  // -------------------------------------
  // Property: SiebelAppParams
  String mSiebelAppParams;

  /**
   * @description: The server name or IP of the Siebel server
   */
  public void setSiebelAppParams(String pSiebelAppParams) {
    mSiebelAppParams = pSiebelAppParams;
  }

  /**
   * @return The server name or IP of the Siebel server
   */
  public String getSiebelAppParams() {
    return mSiebelAppParams;
  }
  
  // -------------------------------------
  // Property: Siebel default organization name
  private String defaultOrganization;
  
  /**
   * @return The default organization id that should be sent during ExecuteQuoting ws request.
   */
	public String getDefaultOrganization() {
		return defaultOrganization;
	}

  /**
   * @description: The default organization id that should be sent during ExecuteQuoting ws request.
   * @param pDefaultOrganization default organization
   */
	public void setDefaultOrganization(String pDefaultOrganization) {
		this.defaultOrganization = pDefaultOrganization;
	}

  /**
   * the siebel session timeout in seconds
   */
  private String mSessionTimeout;

  public String getSessionTimeout()
  {
    return mSessionTimeout;
  }

  public void setSessionTimeout(String pSessionTimeout)
  {
    mSessionTimeout=pSessionTimeout;
  }


	// -------------------------------------
  // Methods
  // -------------------------------------
  /**
   * Gets the connection string by combining a dynamic prefix with a static
   * suffix. The prefix represents the domain to address and the suffix is the
   * application. E.g., SEIBEL_WS (prefix) = "http://some.server.com" and the
   * static suffix is defined by @{link {@link WebServiceHelper.STATIC_PART}.
   * 
   * @return String of the connection string.
   */
  public String getConnectionString() {
    StringBuffer retVal = new StringBuffer();
    String system = System.getProperty("SIEBEL_WS");

    if (system == null || system.isEmpty()) {
      system =
        (((new StringBuffer("http://")).append(getSiebelServer()))).toString();
    }

    // server + app + params
    retVal.append(system).append("/");
    retVal.append(getSiebelApp()).append("?");
    retVal.append(getSiebelAppParams());

    vlogDebug("Connection string = {0}", retVal.toString());
    return retVal.toString();
  }

  /**
   * Prepares the connection information, but does not actually make the
   * connection to Siebel. Connection happens at the time of the actual request.
   * 
   * @param port
   *          BindingProvider representing ... ???
   */
  public void prepareConnection(BindingProvider port) {
    port.getRequestContext().put(
      javax.xml.ws.BindingProvider.ENDPOINT_ADDRESS_PROPERTY,
      getConnectionString());
    Binding binding = port.getBinding();
    @SuppressWarnings("rawtypes")
    List<Handler> handlers = binding.getHandlerChain();
    if (handlers.size() == 0) {
      for (int i = 0; i < getHandlers().length; i++) {
        handlers.add(getHandlers()[i]);
      }
      binding.setHandlerChain(handlers);
    }
  }
}
