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

import java.util.List;

import atg.nucleus.GenericService;
import atg.repository.RepositoryException;
import atg.siebel.catalog.SiebelCatalogProduct;
import atg.siebel.catalog.SiebelCatalogRelationship;
import atg.siebel.configurator.spu.Block;
import atg.siebel.configurator.spu.ProductUI;
import atg.siebel.configurator.spu.StructuredProductUIException;
import atg.siebel.configurator.spu.StructuredProductUITools;
import atg.siebel.configurator.spu.generation.BlockManager;
import atg.siebel.configurator.spu.generation.ProductUIBuilder;

/**
 * 
 *
 * @author Gary McDowell
 * @version $Id: //product/Siebel/version/11.2/src/atg/siebel/configurator/spu/generation/template/UITemplate.java#2 $$Change: 1194813 $
 * @updated $DateTime: 2015/09/10 08:26:24 $$Author: saysyed $
 */
public abstract class UITemplate extends GenericService 
{
  //----------------------------------------------------------------------------------
  // Class version string
  //----------------------------------------------------------------------------------

  public static String CLASS_VERSION = "$Id: //product/Siebel/version/11.2/src/atg/siebel/configurator/spu/generation/template/UITemplate.java#2 $$Change: 1194813 $";

  public abstract ProductUI build(SiebelCatalogProduct pProduct, 
      BlockManager pBlockManager,
      ProductUIBuilder pProductUIBuilder) 
      throws StructuredProductUIException;

  /**
   * a list of block ids for this template
   */
  protected List<String> mBlocks;
  public List<String> getBlocks()
  {
    return mBlocks;
  }
  public void setBlocks(List<String> pBlocks)
  {
    mBlocks = pBlocks;
  }
  
  protected String mCSSPath;
  public String getCSSPath()
  {
    return mCSSPath;
  }
  public void setCSSPath(String pCSSPath)
  {
    mCSSPath = pCSSPath;
  }
  
  protected String mDeleteButtonBlockId;
  public String getDeleteButtonBlockId()
  {
    return mDeleteButtonBlockId;
  }
  public void setDeleteButtonBlockId(String pDeleteButtonBlockId)
  {
    mDeleteButtonBlockId = pDeleteButtonBlockId;
  }
  
  protected ProductUI getProductUI(String pId, StructuredProductUITools pSpuTools)
  {
    
    try
    {
      return pSpuTools.getProductUIByID(pId);
    } 
    catch (StructuredProductUIException e)
    {
      return null;
    }
  }
  
  protected void saveProductUI(StructuredProductUITools pSpuTools, ProductUI pProdui) throws StructuredProductUIException
  {
    try
    {
      pSpuTools.addProductUI(pProdui);
    } 
    catch (RepositoryException e)
    {
      throw new StructuredProductUIException(e);
    }
  }
  
  /**
   * over-ride this method to set any extra data
   * 
   * @param productUI
   * @param pProductUIBuilder 
   * @throws StructuredProductUIException 
   */
  protected void setExtraProperties(ProductUI productUI, ProductUIBuilder pProductUIBuilder) 
      throws StructuredProductUIException
  {
    //no-op
    
  }

  /**
   * build the id
   * 
   * @param pProduct
   * @param pProductUIBuilder 
   * @return
   */
  protected String buildID(SiebelCatalogProduct pProduct, ProductUIBuilder pProductUIBuilder)
  {
    String parentProductId = null;
    
    if(pProduct.getParentRelationship()!=null)
    {
      parentProductId = pProduct.getParentRelationship().getParentProduct().getId();
    }
    
    String id = pProduct.getId()+"-prod-ui";
    
    if(parentProductId!=null)
    {
      id = parentProductId + "-" + id;
    }
    
    return id;
  }
  
  /**
   * determines if a product is deletable, according to the parent relationship
   * 
   * @param pProduct
   * @return
   */
  protected boolean isDeletable(SiebelCatalogProduct pProduct)
  {

    SiebelCatalogRelationship relationship = pProduct.getParentRelationship();
    
    if(relationship==null)
      return false;
    
    if(relationship.getParentProduct().getProductType().equals("Promotion"))
      return false;
    
    if(relationship.getMaximumCardinality()>1)
      return true;
    
    return false;
  }
  
  /**
   * Works out if the product is deletable and insert a delete button block if so
   * 
   * @param pProduct - the product for which to create a UI
   * @param pBlockManager - the Block Manager
   * @param pProductUIBuilder - The Product UI builder
   * @param pProductUI - the product UI
   * @throws StructuredProductUIException
   */
  protected void insertDeletableBlock(SiebelCatalogProduct pProduct,
      BlockManager pBlockManager, ProductUIBuilder pProductUIBuilder, ProductUI pProductUI) throws StructuredProductUIException
  {
    //work out if the product's deletable status has changed.
    if(isDeletable(pProduct))
    {
      if(pProductUI.getBlockById(pBlockManager.
          createContentBlockId(pProduct.getId(), getDeleteButtonBlockId(), pProductUIBuilder))==null)
      {
        Block newBlock = pBlockManager.createContentBlock(pProduct.getId(), 
            getDeleteButtonBlockId(), pProductUIBuilder);
        pProductUI.getBlocks().add(newBlock);
      }
    }
    else
    {
      Block deleteBlock = pProductUI.getBlockById(pBlockManager.createContentBlockId(pProduct.getId(), getDeleteButtonBlockId(), pProductUIBuilder));
      if(deleteBlock!=null)
      {
        pProductUI.removeBlock(deleteBlock);
      }
    }
  }
  
}
