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

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import atg.core.util.StringUtils;
import atg.nucleus.GenericService;
import atg.nucleus.Nucleus;
import atg.nucleus.ServiceAdminServlet;


/**
 * @author bbrady
 *
 */
public class ProductConfigInstanceCache extends GenericService {

  //-------------------------------------
  /** Class version string */

  public static String CLASS_VERSION = "$Id: //product/Siebel/version/11.2/src/atg/siebel/configurator/ProductConfigInstanceCache.java#2 $$Change: 1194813 $";


	
	//-------------------------------------
	// Properties
	//-------------------------------------

	
	protected Map<String, BaseConfigInstance> mInstanceMap 
			= new HashMap<String, BaseConfigInstance>();
    
    

    /**
     * @param pKey
     * @param pInstance
     */
    public void cacheInstance (String pKey, BaseConfigInstance pInstance) {
    	mInstanceMap.put(pKey, pInstance);
    }
    
    
    /**
     * Adds a ProductConfigInstance to the cache using all available keys
     * 
     * @param pInstance - ProductConfigInstance to cache
     */
    public void cacheProductConfigInstance(ProductConfigInstance pInstance) {
      if (isLoggingDebug()) {
        logDebug("cacheProductConfigInstance() called : pInstance == "+pInstance);
      }
      if (!StringUtils.isEmpty(pInstance.getIntegrationId())) {
        mInstanceMap.put(pInstance.getIntegrationId(), pInstance);
      }      
      if (!StringUtils.isEmpty(pInstance.getCommerceItemId())) {
        mInstanceMap.put(pInstance.getCommerceItemId(), pInstance);
      }
      mInstanceMap.put(pInstance.getKey().toString(), pInstance);
      if (isLoggingDebug()) {
        logDebug("Leaving cacheProductConfigInstance() called : cache == "
            +toString());
      }
    }
    

    /**
     * Removes all mappings for the ProductConfigInstance from the cache
     * 
     * @param pInstance - ProductConfigInstance to remove from cache
     */
    public void removeProductConfigInstanceFromCache(
        ProductConfigInstance pInstance) {
      if (isLoggingDebug()) {
        logDebug("removeProductConfigInstanceFromCache() called : pInstance == "+pInstance);
      }
      
      if (!StringUtils.isEmpty(pInstance.getCommerceItemId())) {
        if (mInstanceMap.get(pInstance.getCommerceItemId()) == pInstance) {
          mInstanceMap.remove(pInstance.getCommerceItemId());
        }
      }
      if (!StringUtils.isEmpty(pInstance.getIntegrationId())) {
        if (mInstanceMap.get(pInstance.getIntegrationId()) == pInstance) {
          mInstanceMap.remove(pInstance.getIntegrationId());
        }
      }
      if (mInstanceMap.get(pInstance.getKey().toString()) == pInstance) {
        mInstanceMap.remove(pInstance.getKey().toString());
      }
      
      if (isLoggingDebug()) {
        logDebug("Leaving removeProductConfigInstanceFromCache() called : cache == "
            +toString());
      }
    }
    

    /**
     * Use the CommerceItem id to retrieve the entry from the cache
     * @param pCommerceItemId
     * @return
     */
    public BaseConfigInstance getInstance(String pKey) {
    	return mInstanceMap.get(pKey);
    }

    
    public void removeProductConfigInstanceFromCache (String pKey) {
    	mInstanceMap.remove(pKey);
    }
    
    /**
     * invalidates the entire cache
     */
    public void invalidateCache()
    {
    	mInstanceMap = new HashMap<String, BaseConfigInstance>();
    } 
    
    
    @Override
    public String toString() {
      StringBuffer sb = new StringBuffer("mInstanceMap=");
      for (Entry<String, BaseConfigInstance> entry : mInstanceMap.entrySet()) {
        sb.append("\n<").append(entry.getKey()).append(" : ")
            .append(entry.getValue()).append(">");
      }
      return "ProductConfigInstanceCache [" + sb.toString() + "]";
    }
    
    /**
     * Create an admin servlet for administering this service.
     * @return the servlet
     **/
    protected Servlet createAdminServlet () {
      return new ProductConfigInstanceCache.AdminServlet(this, getNucleus());
    }
    
    /**
     * Admin servlet which displays the detailed status of the agent
     **/
    class AdminServlet extends ServiceAdminServlet {
      // Constructor.
      public AdminServlet(ProductConfigInstanceCache pService, Nucleus pNucleus) {
        super(pService, pNucleus);
      }

      // Override print method to add in our fun stuff.
      protected void printAdmin(HttpServletRequest pRequest,
          HttpServletResponse pResponse, ServletOutputStream pOut)
          throws ServletException, IOException {
        
        ProductConfigInstanceCache intstanceStore = (ProductConfigInstanceCache) mService;

        // Print our job status
        pOut.println("<H3>Cache Entries</H3>");

        pOut.println("<TABLE BORDER='2'>");

        pOut.println("<TR><TH>Key</TH><TH>Value</TH></TR>");
        int rowCount = 1;
        for (Entry<String, BaseConfigInstance> entry : intstanceStore.mInstanceMap.entrySet()) {
          if (rowCount++ % 2 == 0) {
            pOut.println("<TR bgcolor='#F2F2F2'>");
          } else {
            pOut.println("<TR>");
          }
          pOut.println("<TD>" + entry.getKey() + "</TD>");
          pOut.println("<TD>" + entry.getValue() + "</TD>");
          pOut.println("</TR>");
        }
        pOut.println("</TABLE>");
        pOut.println("<BR>");

        // print standard stuff like properties
        super.printAdmin(pRequest, pResponse, pOut);
      }

    } // End of supporting inner class AdminServlet
}
