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

import atg.nucleus.GenericService;
import atg.nucleus.ServiceMap;
import atg.service.perfmonitor.PerformanceMonitor;
import atg.service.resourcepool.ResourceObject;
import atg.service.resourcepool.ResourcePoolException;

import javax.xml.ws.BindingProvider;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Component through which all WS communication should go. Has a configured map of Web Service Facade Components, from
 * which a client can obtain a port
 *
 * @author gamcdowe
 * @version $Id:
 *          //product/Siebel/main/src/atg/siebel/configurator/ConfiguratorTools
 *          .java#3 $$Change: 1194813 $
 * @updated $DateTime: 2015/09/10 08:26:24 $$Author: saysyed $
 */
public class WebServiceController extends GenericService{


  //-------------------------------------
  /** Class version string */

  public static String CLASS_VERSION = "$Id: //product/Siebel/version/11.2/src/atg/siebel/integration/WebServiceController.java#2 $$Change: 1194813 $";


  /**
   * a collection of resource pools, keyed on the Class Name of the Service they manage
   */
  protected ServiceMap mWebServices = new ServiceMap();
  public void setWebServices(ServiceMap pWebServices) {
    mWebServices = pWebServices;
  }

  public ServiceMap getWebServices()
  {
    return mWebServices;
  }

  /**
   * get a ResourcePool from the collection, based on the class name
   *
   * @param pClassName
   * @return
   */
  private WebServiceFacade getWebService(String pClassName) throws SiebelWebServiceConfigurationException {
    WebServiceFacade service = (WebServiceFacade)getWebServices().get(pClassName);

    if(service==null)
      throw new SiebelWebServiceConfigurationException("No web service configured for class : " + pClassName);

    return service;
  }

  /**
   * This is the method through which all Web Service calls are made.
   *
   * @param pWebServiceName - the Class Name of the web service
   * @param pPortName - the name of the binding provider port
   * @param pWebServiceMethodName - the name of the method on the port which invokes the web service
   * @param pInput - The input object
   * @param pClient - the Client object, used to track the usage
   * @param pWebServiceHelper - The WebServiceHelper to use. Each client can use a different one, so they must pass it
   *                          in as a parameter.
   * @return Object - the Web Service output object
   * @throws ResourcePoolException - thrown if the a resource pool cannot be found for the given pClassName
   * @throws NoSuchMethodException - thrown if the method cannot be found on the Service for the given pPortName
   * @throws InvocationTargetException - thrown when invoking the the webservice method through reflection
   * @throws IllegalAccessException - thrown when invoking the the webservice method through reflection
   */
  public Object callWebService(String pWebServiceName,
                               String pPortName,
                               String pWebServiceMethodName,
                               Object pInput,
                               Object pClient,
                               WebServiceHelper pWebServiceHelper)
          throws ResourcePoolException,
          NoSuchMethodException,
          InvocationTargetException,
          IllegalAccessException,
          SiebelWebServiceConfigurationException {

    if(isLoggingDebug())
    {
      logDebug("Entered WebServiceController.callWebService: Web Service Class: "+  pWebServiceName +
      "\n Port: " + pPortName +
      "\n Web Service Method: " + pWebServiceMethodName +
      "\n Client object : " + pClient.toString());
    }

    ResourceObject resourceObject = getPort(pWebServiceName, pPortName, pClient);

    BindingProvider port = (BindingProvider)resourceObject.getResource();

    //now that we have the port, prepare the connection
    pWebServiceHelper.prepareConnection(port);

    //get the method to invoke the WS from the port
    Method webServiceInvokationMethod = port.getClass().getMethod(pWebServiceMethodName, pInput.getClass());

    Object output = invokeWebservice(pInput, port, webServiceInvokationMethod);

    //check the resource back in. Needed to ensure this resource is available to other clients
    closePort(pWebServiceName, pPortName, pClient, resourceObject);

    if(isLoggingDebug())
    {
      logDebug("Exiting callWebService");
    }

    return output;
  }

  private Object invokeWebservice(Object pInput, BindingProvider pPort, Method pWebServiceInvokationMethod)
          throws IllegalAccessException, InvocationTargetException
  {
    if(isLoggingDebug())
    {
      logDebug("Invoking webservice");
    }

    PerformanceMonitor.startOperation(pPort.toString() + "." + pWebServiceInvokationMethod.toString());

    preInvokeWesbservice();

    //invoke the method
    Object output = pWebServiceInvokationMethod.invoke(pPort, pInput);

    postInvokeWebservice();

    PerformanceMonitor.endOperation(pPort.toString() + "." + pWebServiceInvokationMethod.toString());
    return output;
  }

  /**
   * post invoke no-op method
   */
  public void postInvokeWebservice() {
  }

  /**
   * pre invoke no-op method
   */
  public void preInvokeWesbservice() {
  }

  /**
   * closes the specified port
   *
   * @param pWebServiceName
   * @param pPortName
   * @param pClient
   * @param resourceObject
   */
  private void closePort(String pWebServiceName, String pPortName, Object pClient, ResourceObject resourceObject)
          throws ResourcePoolException, SiebelWebServiceConfigurationException {
    getWebService(pWebServiceName).closePort(pPortName,resourceObject);
  }

  /**
   * gets a ResourceObject (Port) from the specified web service
   *
   * @param pWebServiceName
   * @param pPortName
   * @param pClient
   * @return
   */
  private ResourceObject getPort(String pWebServiceName, String pPortName, Object pClient)
          throws ResourcePoolException, SiebelWebServiceConfigurationException {

    return getWebService(pWebServiceName).openPort(pPortName,pClient.toString());
  }


}
