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

package atg.siebel.configurator.ui;

import atg.siebel.configurator.BaseConfigInstance;
import atg.siebel.configurator.ConfiguratorException;
import atg.siebel.configurator.Constants;
import atg.siebel.configurator.Constants.ProductConfigInstanceStatus;
import atg.siebel.configurator.RootProductConfigInstance;
import atg.siebel.configurator.spu.StructuredProductUIException;
import atg.siebel.order.SiebelCommerceItem;

public class RootProductUIHandler extends UIHandler {

  //-------------------------------------
  /** Class version string */

  public static String CLASS_VERSION = "$Id: //product/Siebel/version/11.2/src/atg/siebel/configurator/ui/RootProductUIHandler.java#2 $$Change: 1194813 $";


	public UINodeWrapper generateUI(BaseConfigInstance pPCI)  throws StructuredProductUIException
	{
		RootProductConfigInstance rootPCI = (RootProductConfigInstance)pPCI;
		
		return generateUI(rootPCI);
	}
	
	public UINodeWrapper getCachedUI(BaseConfigInstance pPCI)
	{
		//return getUiCache().getUINodeWrapper(((RootProductConfigInstance)pPCI).getKey().toString());
		
		
		try {
			return generateUI(pPCI);
		} catch (StructuredProductUIException e) {
			if(isLoggingError())
			{
				logError(e);
			}
			return null;
		}
	}
	
	public void cacheUI(BaseConfigInstance pPCI, UINodeWrapper pWrapper)
	{
		//getUiCache().cacheUINodeWrapper(((RootProductConfigInstance)pPCI).getKey().toString(), pWrapper);
	}
	
	public void removeUI(BaseConfigInstance pPCI)
	{
		getUiCache().removeUINodeWrapper(((RootProductConfigInstance)pPCI).getKey().toString());
	}
	
  public void endConfiguration(BaseConfigInstance pPCI) {
    boolean isDeleted = pPCI
        .isCommerceItemDeleted((RootProductConfigInstance) pPCI);
    if (!isDeleted) {
      ((RootProductConfigInstance) pPCI).endConfiguration();
    }
  }
	
  public void beginConfiguration(BaseConfigInstance pPCI)
      throws ConfiguratorException {
    boolean isDeleted = pPCI
        .isCommerceItemDeleted((RootProductConfigInstance) pPCI);
    if (((RootProductConfigInstance) pPCI).getStatus().equals(
        ProductConfigInstanceStatus.CONFIGURED)) {
      if (!isDeleted) {
        ((RootProductConfigInstance) pPCI).editConfiguration();
      } else {
        // Since we require the PCI for sending the delete actions in quoting
        // web service,
        // we are setting the status as configured for Deleted root products.
        ((RootProductConfigInstance) pPCI)
            .setStatus(Constants.ProductConfigInstanceStatus.CONFIGURED);
        SiebelCommerceItem commerceItem = ((RootProductConfigInstance) pPCI)
            .getConfiguratorManager().getConfiguratorTools()
            .getCommerceItem((RootProductConfigInstance) pPCI);
        commerceItem.setConfigured(true);
      }
    } else if (((RootProductConfigInstance) pPCI).getStatus().equals(
        ProductConfigInstanceStatus.NEW)) {
      if (!isDeleted) {
        ((RootProductConfigInstance) pPCI).beginConfiguration();
      } else {
        // Since we require the PCI for sending the delete actions in quoting
        // webservice,
        // we are setting the status as configured for Deleted root products.
        ((RootProductConfigInstance) pPCI)
            .setStatus(Constants.ProductConfigInstanceStatus.CONFIGURED);
        SiebelCommerceItem commerceItem = ((RootProductConfigInstance) pPCI)
            .getConfiguratorManager().getConfiguratorTools()
            .getCommerceItem((RootProductConfigInstance) pPCI);
        commerceItem.setConfigured(true);
      }
    }
  }
	  
}
