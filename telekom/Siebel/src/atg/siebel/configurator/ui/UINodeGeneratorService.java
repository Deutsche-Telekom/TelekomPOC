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

import java.util.ArrayList;
import java.util.List;

import atg.core.util.StringUtils;
import atg.nucleus.GenericService;
import atg.siebel.configurator.ProductConfigInstance;
import atg.siebel.configurator.ProductConfigRelationship;
import atg.siebel.configurator.attribute.Attribute;
import atg.siebel.configurator.spu.Block;
import atg.siebel.configurator.spu.ProductUI;
import atg.siebel.configurator.spu.StructuredProductUIException;
import atg.siebel.order.SiebelCommerceItem;

/**
 *
 * @author 
 * @version $Id: //product/Siebel/version/11.2/src/atg/siebel/configurator/ui/UINodeGeneratorService.java#2 $$Change: 1194813 $
 * @updated $DateTime: 2015/09/10 08:26:24 $$Author: saysyed $
 **/
public class UINodeGeneratorService extends GenericService {

  //-------------------------------------
  /** Class version string */

  public static String CLASS_VERSION = "$Id: //product/Siebel/version/11.2/src/atg/siebel/configurator/ui/UINodeGeneratorService.java#2 $$Change: 1194813 $";


  protected static final String NULL_PROMOTION_ID = "NULL_PROMOTION_ID";

  /**
   * @param pRootCP
   *          - the root configurable product that we are building UI for
   * @param pUITemplate
   *          - the UI template from the SPURepository for pRootCP
   * @return list of UINode's corresponding to the UI elements that we need to
   *         display
   */
  protected List<UINode> getUINodeList(ProductConfigInstance pRootCP,
      ProductUI pUITemplate) throws StructuredProductUIException{

    if (pRootCP == null) {
      vlogError("pRootCP == null");
      return null;
    }
    if (pUITemplate == null) {
      vlogError("pUITemplate == null");
      return null;
    }
    vlogDebug("generateUI() called with pRootCP = {0}, pUITemplate = {1}",
        pRootCP, pUITemplate);
    List<UINode> uiNodeList = new ArrayList<UINode>();
    addNodesToList(uiNodeList, pRootCP, pUITemplate);
    vlogDebug("uiNodeList == {0}", uiNodeList);
    return uiNodeList;
  }

  /**
   * @param pUINodeList
   * @param pInstance
   * @param pUITemplate
   */
  protected void addNodesToList(List<UINode> pUINodeList,
      ProductConfigInstance pInstance, ProductUI pUITemplate) 
    		  throws StructuredProductUIException
  {

    vlogDebug(
        "addNodesToList called : pUINodeList={0}, pInstance={1}, pUITemplate={2}",
        pUINodeList, pInstance, pUITemplate);

    // if this product has a renderer of its own then we must create a
    // new ProductUINode and add any nodes that we subsequently discover
    // into its childNodes property
    // if (!pUINodeList.isEmpty()) {
    // ProductUINode productUINode = createProductNode(pInstance, pUITemplate);
    // pUINodeList.add(productUINode);
    // doAddNodes(productUINode.getChildNodeList(), pInstance, pUITemplate);
    // } else {
    doAddNodes(pUINodeList, pInstance, pUITemplate);
    // }

  }

  protected void doAddNodes(List<UINode> pUINodeList,
      ProductConfigInstance pInstance, ProductUI pUITemplate) 
    		  throws StructuredProductUIException
 {
    // Retrieve blocks list from ProductUI - these are the displayable
    // elements to be displayed in the given order.
    // For each we'll create a UINode object that encapsulates the display &
    // model of the element to be rendered and add the new object into the
    // UINode list method parameter
    List<Block> blocks = pUITemplate.getBlocks();
    for (Block block : blocks) {
      if (block.getType() != null
          && block.getType().equals(Block.RELATIONSHIP_BLOCK)) {
        // Check if the relationship node is to be created for the instance
        boolean isUIRequired = isUIRequired(pInstance);
        if (isUIRequired) {
          ProductConfigRelationship relationship = pInstance
              .getChildRelationship(block.getRelationshipId());

          if (relationship == null) {
            throw new StructuredProductUIException("Relationship "
                + block.getRelationshipId() + " for PCI "
                + pInstance.getKey().toString() + " is null");
          }

          pUINodeList
              .add(createRelationshipNode(pInstance, relationship, block));

          List<ProductUI> childProductUIs = block.getChildProductUIs();
          for (ProductUI childUI : childProductUIs) {
            // This is the next product that we should display
            String productId = childUI.getProductId();
            // Look for any instances of this product in our PCI tree
            ProductConfigInstance[] instances = relationship
                .getChildInstances();
            if (instances != null && instances.length > 0) {
              for (ProductConfigInstance instance : instances) {
                if (instance.getProductId().equals(productId)) {
                  // And recurse!
                  addNodesToList(pUINodeList, instance, childUI);
                }
              }
            }
          }
        }
      } else {
        //Check if the ui node is to be created
        boolean isUIRequired = isUIRequired(pInstance);
        if (isUIRequired) {
          UINode node = createNode(pInstance, block);
          if (node != null) {
            pUINodeList.add(node);
          } else {
            // Log a warning!
            vlogWarning("null object returned from createNode() - block={0}",
                block);
          }
        }
      }
    }
  }

  /**
   * @param pInstance
   * @param pBlock
   * @return
   */
  protected UINode createNode(ProductConfigInstance pInstance, Block pBlock) {
    // Create a UINode that encapsulates the model (pInstance) and the
    // display (pBlock) for this product

    vlogDebug("createNode() called : pInstance={0}, pBlock={1}", pInstance,
        pBlock);
    UINode node = null;
    String blockType = pBlock.getType();

    if (StringUtils.isEmpty(blockType)) {
      node = new UINode(UINode.UINodeType.DISPLAY_NODE);
      String name = pBlock.getDisplayName();
      node.setDisplayName((!StringUtils.isEmpty(name)) ? name : pBlock
          .getName());
    } else if (blockType.equals(Block.ATTRIBUTE_BLOCK)) {
      node = new UINode(UINode.UINodeType.ATTRIBUTE_NODE);
      String name = pBlock.getDisplayName();
      node.setDisplayName((!StringUtils.isEmpty(name)) ? name : pBlock
          .getAttributeName());
      node.setPciPropertyIdentifier(pBlock.getAttributeName());
      Attribute attribute = pInstance.getAttribute(pBlock.getAttributeName());
      if(attribute!=null&&attribute.getError()!=null)
      {
        node.setErrorMessage(attribute.getError());
        attribute.setError(null);
      }
    } else {
      // un-recognised type property value
      return null;
    }

    node.setRenderer(pBlock.getRenderer());
    node.setProductConfigInstance(pInstance);
    String cssParam = pBlock.getHtmlAttributes();
    node.setHtmlAttributes(!StringUtils.isEmpty(cssParam) ? cssParam : pBlock
        .getRenderer().getHtmlAttributes());
    vlogDebug("node created = {0}", node);
    return node;
  }

  protected UINode createRelationshipNode(ProductConfigInstance pInstance,
      ProductConfigRelationship pRelationship, Block pBlock) {

    // Create a UINode that encapsulates the model (pInstance) and the
    // display (pBlock) for this product

    vlogDebug("createRelationshipNode() called : pInstance={0}, pBlock={1}",
        pInstance, pBlock);
    UINode node = new UINode(UINode.UINodeType.RELATIONSHIP_NODE);
    String name = pBlock.getDisplayName();
    node.setDisplayName((!StringUtils.isEmpty(name)) ? name : pBlock.getName());
    node.setPciPropertyIdentifier(pRelationship.getId());
    node.setProductConfigInstance(pInstance);
    node.setRenderer(pBlock.getRenderer());
    String cssParam = pBlock.getHtmlAttributes();
    node.setHtmlAttributes(!StringUtils.isEmpty(cssParam) ? cssParam : pBlock
            .getRenderer().getHtmlAttributes());
    if(pRelationship.getError()!=null)
    {
      node.setErrorMessage(pRelationship.getError());
      pRelationship.setError(null);
    }
    vlogDebug("node created = {0}", node);
    return node;
  }
	
  /**
   * Method to check if all the relationships for this PCI are present in SPU
   * @param pInstance RootProductConfigInstance 
   * @param pUITemplate ProdeuctUI instance
   * @return boolean value specifying whether the relationships are present in SPU or not
   */
  public boolean checkRelationshipsInSpu(ProductConfigInstance pInstance, ProductUI pUITemplate){
    List<Block> blocks = pUITemplate.getBlocks();
    boolean returnValue = true;
    for (Block block : blocks) {
      if (block.getType() != null && block.getType().equals(Block.RELATIONSHIP_BLOCK)) {
        ProductConfigRelationship relationship = pInstance
            .getChildRelationship(block.getRelationshipId());
        if(relationship==null)
        {
          returnValue = false;
          break;
        }
      }
    }
    return returnValue;
  }
  
	
  /**
   * This method returns if the UI needs to be created or not
   * 
   * @param pInstance, the PCI instance 
   * @return true if UI node is needed
   *         false if UI node is not required
   */
  public boolean isUIRequired(ProductConfigInstance pInstance) {
    boolean isUIRequired = true;
    String commerceItemId = pInstance.getCommerceItemId();
    // Retrieve the commerce item for the given id
    SiebelCommerceItem commerceItem = pInstance.getConfiguratorManager()
        .getConfiguratorTools().getCommerceItem(commerceItemId);
    // Check for the commerce item action code, if it is Delete no UI is
    // required
    if (commerceItem != null
        && commerceItem.getActionCode().equalsIgnoreCase(
            SiebelCommerceItem.M_ACTION_CODE_DELETE)) {
      isUIRequired = false;
    }
    return isUIRequired;
  }
}
