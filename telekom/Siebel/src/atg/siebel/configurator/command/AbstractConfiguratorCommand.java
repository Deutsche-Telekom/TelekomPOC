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

import atg.siebel.configurator.ChildProductConfigInstance;
import atg.siebel.configurator.ConfigurationContext;
import atg.siebel.configurator.ConfiguratorException;
import atg.siebel.configurator.RootProductConfigInstance;

import com.siebel.ordermanagement.configurator.cfginteractdata.Attribute;
import com.siebel.ordermanagement.configurator.cfginteractdata.Explanation;
import com.siebel.ordermanagement.configurator.cfginteractdata.Item;
import com.siebel.ordermanagement.configurator.cfginteractdata.ProductData;
import com.siebel.ordermanagement.configurator.cfginteractdata.Relationship;


/**
 * 
 *
 * @author bbrady
 * @version $Id: //product/Siebel/version/11.2/src/atg/siebel/configurator/command/AbstractConfiguratorCommand.java#2 $$Change: 1194813 $
 * @updated $DateTime: 2015/09/10 08:26:24 $$Author: saysyed $
 */
public abstract class AbstractConfiguratorCommand extends AbstractCommand {

  //-------------------------------------
  /** Class version string */

  public static String CLASS_VERSION = "$Id: //product/Siebel/version/11.2/src/atg/siebel/configurator/command/AbstractConfiguratorCommand.java#2 $$Change: 1194813 $";

  
  private final RootProductConfigInstance mRootInstance;
  protected RootProductConfigInstance getRootInstance() {
    return mRootInstance;
  }

  
  /**
   * @param pContext
   */
  public AbstractConfiguratorCommand(ConfigurationContext pContext) {
    super(pContext);
    if (getInstance() instanceof RootProductConfigInstance) {
      mRootInstance = (RootProductConfigInstance) getInstance();
    } else {
      mRootInstance = ((ChildProductConfigInstance) getInstance())
          .getRootInstance();
    }
  }

  
  /**
   * @param pInstance
   * @param pConfiguredItem
   * @throws ConfiguratorException
   */
  protected void configureInstancefromProductData(ProductData pProductData)
      throws ConfiguratorException {

    getConfiguratorTools().configureInstancefromSiebelItem(
        mRootInstance, pProductData.getItem().get(0));
  }
  
  /**
   * Creates Single item for Product
   * 
   * @return
   */
  protected Item createProductItem() {
    int subLevels = mRootInstance.getProductDepth();
    String integrationId = mRootInstance.getIntegrationId();
    if (integrationId == null) {
      integrationId = "";
    }
       
    Item item = new Item();
    item.setProductId(mRootInstance.getProductId());
    
    item.setQuantity("1");
    item.setName("");
    item.setCanDrilldown("");
    item.setCurrencyCode("");
    item.setCurrentPrice("");
    item.setEligibilityReason("");
    item.setEligibilityStatus("");
    item.setExchangeDate("");
    item.setHasGenericsFlag("");
    item.setIntegrationId(integrationId);
    item.setListPrice("");
    item.setMRCCxTotal("");
    item.setNRCCxTotal("");
    item.setParentIntegrationId("");
    item.setParentProductId("");
    item.setPortId("");
    item.setRootIntegrationId("");

    // TODO Make static objects
    item.getAttribute().add(createAttribute());
    item.getExplanation().add(new Explanation());
    item.getItem().add(createSubProductItem(subLevels));
    item.getRelationship().add(createRelationship());
    return item;
  }

  /**
   * @return
   */
  protected Attribute createAttribute() {
    Attribute attr = new Attribute();
    attr.setName("");
    return attr;
  }

  /**
   * @return
   */
  protected Relationship createRelationship() {
    Relationship rel = new Relationship();
    rel.setName("");
    return rel;
  }

  /**
   * @param pSubLevels
   * @return
   */
  protected Item createSubProductItem(
      int pSubLevels) {
    pSubLevels--;
    Item item = new Item();
    item.setQuantity("1");
    item.setName("");
    item.setCanDrilldown("");
    item.setCurrencyCode("");
    item.setCurrentPrice("");
    item.setEligibilityReason("");
    item.setEligibilityStatus("");
    item.setExchangeDate("");
    item.setHasGenericsFlag("");
    item.setIntegrationId("");
    item.setListPrice("");
    item.setMRCCxTotal("");
    item.setNRCCxTotal("");
    item.setParentIntegrationId("");
    item.setParentProductId("");
    item.setPortId("");
    item.setProductId("");
    item.setRootIntegrationId("");

    // TODO Make static objects
    item.getAttribute().add(createAttribute());
    item.getExplanation().add(new Explanation());
    if (pSubLevels > 0) {
      item.getItem().add(createSubProductItem(pSubLevels));
    } else {
      item.getItem().add(
          new Item());
    }
    item.getRelationship().add(createRelationship());
    return item;
  }

}
