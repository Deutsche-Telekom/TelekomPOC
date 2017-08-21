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
package atg.siebel.configurator.spu.generation;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import atg.nucleus.GenericService;
import atg.repository.RepositoryException;
import atg.siebel.catalog.SiebelCatalogAttribute;
import atg.siebel.catalog.SiebelCatalogProduct;
import atg.siebel.catalog.SiebelCatalogRelationship;
import atg.siebel.configurator.spu.Block;
import atg.siebel.configurator.spu.ProductUI;
import atg.siebel.configurator.spu.Renderer;
import atg.siebel.configurator.spu.StructuredProductUIException;
import atg.siebel.configurator.spu.StructuredProductUITools;
import atg.siebel.configurator.spu.generation.rules.RelationshipRendererRule;

/**
 * 
 *
 * @author Gary McDowell
 * @version $Id: //product/Siebel/version/11.2/src/atg/siebel/configurator/spu/generation/BlockManager.java#2 $$Change: 1194813 $
 * @updated $DateTime: 2015/09/10 08:26:24 $$Author: saysyed $
 */
public class BlockManager extends GenericService
{
  //----------------------------------------------------------------------------------
  // Class version string
  //----------------------------------------------------------------------------------

  public static String CLASS_VERSION = "$Id: //product/Siebel/version/11.2/src/atg/siebel/configurator/spu/generation/BlockManager.java#2 $$Change: 1194813 $";
  
   
  //----------------------------------------------------------------------------------
  // property:spuTools
  protected StructuredProductUITools mSpuTools;
  public StructuredProductUITools getSpuTools()
  {
    return mSpuTools;
  }
  public void setSpuTools(StructuredProductUITools pSpuTools)
  {
    mSpuTools = pSpuTools;
  }
  //----------------------------------------------------------------------------------
  // property:dataTypeRenderers
  protected Map<String,String> mAttributeDataTypeRenderers;
  public Map<String,String> getAttributeDataTypeRenderers()
  {
    return mAttributeDataTypeRenderers;
  }
  public void setAttributeDataTypeRenderers(Map<String,String> pAttributeDataTypeRenderers)
  {
    mAttributeDataTypeRenderers = pAttributeDataTypeRenderers;
  }
  private String getAttributeRendererForType(String pType)
  {
    return getAttributeDataTypeRenderers().get(pType);
  }
  
  //----------------------------------------------------------------------------------
  // property:relationshipRendererRules
  protected RelationshipRendererRule[] mRelationshipRendererRules;
  public RelationshipRendererRule[] getRelationshipRendererRules()
  {
    return mRelationshipRendererRules;
  }
  public void setRelationshipRendererRules(RelationshipRendererRule[] pRelationshipRendererRules)
  {
    mRelationshipRendererRules = pRelationshipRendererRules;
  }
  
  //----------------------------------------------------------------------------------
  // property:relationshipBlockSuffix
  protected String mRelationshipBlockSuffix;
  public String getRelationshipBlockSuffix()
  {
    return mRelationshipBlockSuffix;
  }
  public void setRelationshipBlockSuffix(String pRelationshipBlockSuffix)
  {
    mRelationshipBlockSuffix = pRelationshipBlockSuffix;
  }
  //----------------------------------------------------------------------------------
  // property:attributeBlockSuffix
  protected String mAttributeBlockSuffix;
  public String getAttributeBlockSuffix()
  {
    return mAttributeBlockSuffix;
  }
  public void setAttributeBlockSuffix(String pAttributeBlockSuffix)
  {
    mAttributeBlockSuffix = pAttributeBlockSuffix;
  }
  
  /**
   * load a block from the repository
   * 
   * @param pBlockId
   * @return
   */
  public Block getBlock(String pBlockId) throws StructuredProductUIException
  {
    return getSpuTools().getBlock(pBlockId);
  }
  
  
  /**
   * saves a block to the SPU repository
   * 
   * @param bBlock
   * @throws RepositoryException 
   */
  public Block saveBlock(Block pBlock) throws RepositoryException
  {
    return getSpuTools().addBlock(pBlock);
  }
  
  /**
   * creates an id for an attribute block
   * 
   * @return
   */
  public String createAttributeBlockID(String pProductID, String pAttributeID, ProductUIBuilder pProductUIBuilder)
  {
    return pProductID + "-" + pAttributeID + getAttributeBlockSuffix();
  }
  
  /**
   * creates a content block Id
   * 
   * @param pProductId
   * @param bBaseBlock
   * @param pProductUIBuilder
   * @return
   */
  public String createContentBlockId(String pProductId, String pBaseBlockId,
      ProductUIBuilder pProductUIBuilder)
  {
    return pProductId + "-" + pBaseBlockId;
  }
  
  /**
   * creates a content block
   * 
   * @param pProductId
   * @param pBaseBlockId
   * @param pProductUIBuilder
   * @return
   * @throws StructuredProductUIException
   */
  public Block createContentBlock(String pProductId, String pBaseBlockId,
      ProductUIBuilder pProductUIBuilder)
      throws StructuredProductUIException
  {
    Block baseBlock = getBlock(pBaseBlockId);
    
    String id = createContentBlockId(pProductId,pBaseBlockId,pProductUIBuilder);
    
    baseBlock.setId(id);
    baseBlock.setName(id);
    
    try
    {
      baseBlock = saveBlock(baseBlock);
    } 
    catch (RepositoryException e)
    {
      throw new StructuredProductUIException(e);
    }
    
    return baseBlock;
  }
  
  /**
   * creates a block based on attribute data type
   * 
   * @param pAttribute
   * @return
   * @throws StructuredProductUIException
   */
  public Block createAttributeBlock(String pProductId, SiebelCatalogAttribute pAttribute,
      ProductUIBuilder pProductUIBuilder) 
      throws StructuredProductUIException
  {

    String id = createAttributeBlockID(pProductId,pAttribute.getOrigId(),pProductUIBuilder);
    
    Block attBlock = getBlock(id);
    
    if(attBlock == null)
    {
      attBlock = new Block();
      attBlock.setId(id);
      attBlock.setName(id);
      attBlock.setActiveFlag(true);
      attBlock.setType(Block.ATTRIBUTE_BLOCK);
      attBlock.setAttributeId(pAttribute.getOrigId());
    }
    
    //make sure type renderer is up to date
    attBlock.setAttributeName(pAttribute.getAttributeName());
    attBlock.setDisplayName(pAttribute.getName());
    String type = pAttribute.getDomainType();
    Renderer renderer = getSpuTools().getRenderer(getAttributeRendererForType(type));
    attBlock.setRenderer(renderer);
    
    try
    {
      attBlock = saveBlock(attBlock);
    } 
    catch (RepositoryException e)
    {
      throw new StructuredProductUIException(e);
    }
    
    return attBlock;
  }
  
  /**
   * creates an id for an relationship block
   * 
   * @return
   */
  public String createRelationshipBlockID(String pProductID, String pRelationshipID, ProductUIBuilder pProductUIBuilder)
  {
    return pProductID + "-" + pRelationshipID + getRelationshipBlockSuffix();
  }
  
  /**
   * create a relationship block
   * 
   * @param pProductId
   * @param pRelationship
   * @param pProductUIBuilder
   * @return
   */
  public Block createRelationshipBlock(String pProductId, SiebelCatalogRelationship pRelationship,
      ProductUIBuilder pProductUIBuilder)
          throws StructuredProductUIException
  {

    String id = createRelationshipBlockID(pProductId,pRelationship.getRelationshipId(),pProductUIBuilder);
    
    Block relBlock = getBlock(id);
    
    //if no block exists, create one
    if(relBlock == null)
    {
    
      relBlock = new Block();
      relBlock.setId(id);
    
      relBlock.setType(Block.RELATIONSHIP_BLOCK);
      relBlock.setRelationshipId(pRelationship.getRelationshipId());
      relBlock.setActiveFlag(true);
    
    }
    //make sure all child product relationships are up to date
    List<ProductUI> productUIs = getProductUIs(pRelationship,
        pProductUIBuilder);
    
    relBlock.setChildProductUIs(productUIs);
    relBlock.setName(pRelationship.getDisplayName());
    Renderer renderer = getRelationshipRenderer(pRelationship);
    relBlock.setRenderer(renderer);
    
    try
    {
      relBlock = saveBlock(relBlock);
    } 
    catch (RepositoryException e)
    {
      throw new StructuredProductUIException(e);
    }
    
    return relBlock;
  }
  /**
   * @param pRelationship
   * @param pProductUIBuilder
   * @param id
   * @param relBlock
   * @return
   * @throws StructuredProductUIException
   */
  private List<ProductUI> getProductUIs(
      SiebelCatalogRelationship pRelationship, ProductUIBuilder pProductUIBuilder)
      throws StructuredProductUIException
  {
    List<ProductUI> productUIs = new ArrayList<ProductUI>();
    
    //create child product UIs for each child
    SiebelCatalogProduct childProducts[] = 
        pRelationship.getChildProducts().toArray(
            new SiebelCatalogProduct[pRelationship.getChildProducts().size()]);
    
    for(int i = 0; i < childProducts.length; i++)
    {
      ProductUI prodUI = pProductUIBuilder.buildProductUI(childProducts[i]);
      
      productUIs.add(prodUI);
    }
    return productUIs;
  }
  
  /**
   * Leaving this public so it can be over-ridden. This method will check against a number of types
   * and determine the renderer to best display it
   * 
   * @param pRelationship
   * @return
   * @throws StructuredProductUIException 
   */
  public String getRendererForRelationship(SiebelCatalogRelationship pRelationship) 
      throws StructuredProductUIException
  {
    String renderer = null;
    
    for(int i = 0; i < getRelationshipRendererRules().length && renderer==null; i++)
    {
      renderer = getRelationshipRendererRules()[i].determineRenderer(pRelationship);
    }
    if(renderer==null)
    {
      //throw new StructuredProductUIException("No rule found for this relationship type");
      //we could have incomplete data (e.g. a relationship with no child products), so we'll
      //just log a message
      vlogDebug("No renderer for for relationship : {0}",
          pRelationship.getRelationshipId());
    }
    
    return renderer;
  }
  
  /**
   * determines the renderer based in the relationship cardinality
   * 
   * @param pRelationship
   * @return
   * @throws StructuredProductUIException 
   */
  private Renderer getRelationshipRenderer(
      SiebelCatalogRelationship pRelationship) throws StructuredProductUIException
  {
    
    String rendererId = getRendererForRelationship(pRelationship);
    
    if(rendererId==null)
      return null;
    
    Renderer renderer = getSpuTools().getRenderer(rendererId);
    
    return renderer;
  }
}
