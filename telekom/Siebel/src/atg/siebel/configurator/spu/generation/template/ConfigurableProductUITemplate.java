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
package atg.siebel.configurator.spu.generation.template;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import atg.siebel.catalog.SiebelCatalogAttribute;
import atg.siebel.catalog.SiebelCatalogProduct;
import atg.siebel.catalog.SiebelCatalogRelationship;
import atg.siebel.configurator.spu.Block;
import atg.siebel.configurator.spu.ProductUI;
import atg.siebel.configurator.spu.StructuredProductUIException;
import atg.siebel.configurator.spu.generation.BlockManager;
import atg.siebel.configurator.spu.generation.ProductUIBuilder;
import atg.siebel.configurator.spu.generation.PromotionProductUIBuilder;


/**
 * 
 *
 * @author Gary McDowell
 * @version $Id: //product/Siebel/version/11.2/src/atg/siebel/configurator/spu/generation/template/ConfigurableProductUITemplate.java#2 $$Change: 1194813 $
 * @updated $DateTime: 2015/09/10 08:26:24 $$Author: saysyed $
 */
public class ConfigurableProductUITemplate extends
    SimpleProductWithAttributesUITemplate
{
  //----------------------------------------------------------------------------------
  // Class version string
  //----------------------------------------------------------------------------------

  public static String CLASS_VERSION = "$Id: //product/Siebel/version/11.2/src/atg/siebel/configurator/spu/generation/template/ConfigurableProductUITemplate.java#2 $$Change: 1194813 $";

  protected static final String RELATIONSHIP_BLOCKS = "RELATIONSHIPS";
  
  /**
   * the productUIBuilder for child products
   */
  protected ProductUIBuilder mProductUIBuilder;
  public ProductUIBuilder getProductUIBuilder()
  {
    return mProductUIBuilder;
  }
  public void setProductUIBuilder(ProductUIBuilder pProductUIBuilder)
  {
    mProductUIBuilder = pProductUIBuilder;
  }
  
  @Override
  public ProductUI build(SiebelCatalogProduct pProduct,
      BlockManager pBlockManager, ProductUIBuilder pProductUIBuilder)
      throws StructuredProductUIException
  {
    //only use the product UI Builder passed in if the configured one is null
    ProductUIBuilder productUIBuilder = determineProductUIBuilder(pProductUIBuilder);
    
    String id = buildID(pProduct, productUIBuilder);
    
    ProductUI productUI = getProductUI(id, productUIBuilder.getSpuTools());
    
    //if the product ui already exists, check it relationship and 
    //attribute blocks, and find out if it's parent relationship 
    //has changed to make it deletable
    if(productUI!=null)
    {
      replaceRelationshipBlocks(pProduct, pBlockManager, productUIBuilder, productUI);
      replaceAttributeBlocks(pProduct, pBlockManager, productUIBuilder, productUI);
      
      //work out if the product's deletable status has changed.
      insertDeletableBlock(pProduct, pBlockManager, pProductUIBuilder,
          productUI);
      saveProductUI(productUIBuilder.getSpuTools(), productUI);
      return productUI;
    }
    productUI = new ProductUI();
    
    
    //it's a new product UI, so create it.
    List<Block> blocks = new ArrayList<Block>();
    
    Iterator<String> it = getBlocks().iterator();
    while(it.hasNext())
    {
      String blockId = it.next();
      
      if(blockId.equals(ATTRIBUTE_BLOCKS))
      {
        List<Block> attBlocks = buildAttributeBlocks(pProduct, pBlockManager, productUIBuilder);
        
        blocks.addAll(attBlocks);
      }
      else if(blockId.equals(RELATIONSHIP_BLOCKS))
      {
        List<Block> attBlocks = buildRelationshipBlocks(pProduct, pBlockManager, productUIBuilder);
        
        blocks.addAll(attBlocks);
      }
      else
      {
        Block newBlock = pBlockManager.createContentBlock(pProduct.getId(), 
            blockId, pProductUIBuilder);
        
        blocks.add(newBlock);
      }
    }
    
    productUI.setBlocks(blocks);
    productUI.setCssPath(getCSSPath());
    productUI.setProductName(pProduct.getName());
    productUI.setId(id);
    productUI.setProductId(pProduct.getId());
    productUI.setRootProductFlag(true);
    
    setExtraProperties(productUI, productUIBuilder);
    
    insertDeletableBlock(pProduct, pBlockManager, pProductUIBuilder,
        productUI);
    
    saveProductUI(productUIBuilder.getSpuTools(), productUI);
    
    return productUI;
  }

  /**
   * method to determine which productUI Builder to use. If the configured
   * one is null, use the supplied one. Over ride this method to copy any data
   * a productUI builder might need, eg a promotion id
   * 
   * @param pProductUIBuilder
   * @return
   */
  protected ProductUIBuilder determineProductUIBuilder(
      ProductUIBuilder pProductUIBuilder)
  {
    return getProductUIBuilder()!=null?
        getProductUIBuilder():
          pProductUIBuilder;
  }
  
  
  protected List<Block> buildRelationshipBlocks(SiebelCatalogProduct pProduct,
      BlockManager pBlockManager, ProductUIBuilder pProductUIBuilder) 
          throws StructuredProductUIException
  {

    List<Block> relBlocks = new ArrayList<Block>();
    
    SiebelCatalogRelationship relationships[] = 
        pProduct.getChildRelationships().toArray(
            new SiebelCatalogRelationship[pProduct.getChildRelationships().size()]);
    
    for(int i = 0; i < relationships.length; i++)
    {
      Block relBlock= pBlockManager.createRelationshipBlock(
          pProduct.getId(), relationships[i], pProductUIBuilder);
      
      relBlocks.add(relBlock);
    }
    
    return relBlocks;
  }
  
  /**
   * replaces the relationship blocks of a product ui
   * 
   * @param pProduct
   * @param pBlockManager
   * @param pProductUIBuilder
   * @throws StructuredProductUIException
   */
  protected void replaceRelationshipBlocks(SiebelCatalogProduct pProduct,
      BlockManager pBlockManager, 
      ProductUIBuilder pProductUIBuilder,
      ProductUI pProductUI)  throws StructuredProductUIException
  {
    List<Block> blocks = pProductUI.getBlocksByType(Block.RELATIONSHIP_BLOCK);
    
    //loop through attributes and make sure they are all accounted for
    SiebelCatalogRelationship relationships[] = 
        pProduct.getChildRelationships().toArray(
            new SiebelCatalogRelationship[pProduct.getChildRelationships().size()]);
    
    for(SiebelCatalogRelationship relationship: relationships)
    {
      //if relationship exists, and att-block exists, make sure it's up to date
      String id = pBlockManager.createRelationshipBlockID(pProduct.getId(), 
            relationship.getRelationshipId(), pProductUIBuilder);
        
      Iterator<Block> blockIt = blocks.iterator();
      boolean found = false;
        
      while(blockIt.hasNext())
      {
        Block block = blockIt.next();
        if(block.getId().equals(id))
        {
          found = true;
          break;
        }
      }
      if(found)
      {
        pBlockManager.createRelationshipBlock(pProduct.getId(), relationship, pProductUIBuilder);
      }
      else
        //if a block isn't found, we need to create a new block, and insert it after the
        //last relationship block in the product-ui
      {
        Block newBlock = pBlockManager.createRelationshipBlock(pProduct.getId(), relationship, pProductUIBuilder);
        int relBlockMarker = getBlocks().indexOf(RELATIONSHIP_BLOCKS);
        pProductUI.insertAsLastBlockOfType(newBlock, relBlockMarker);
      }
    }
    //now we'll look through the list of blocks and make sure we have a corresponding relationship
    Iterator<Block> blockIt = blocks.iterator();
    while(blockIt.hasNext())
    {
      boolean found = false;
      Block block = blockIt.next();

      for(SiebelCatalogRelationship relationship: relationships)
      {
        if(relationship.getRelationshipId().equals(block.getRelationshipId()))
        {
          found = true;
        }
      }
      
      if(!found)
      {
        pProductUI.removeBlock(block);
      }
    }
  }
}
