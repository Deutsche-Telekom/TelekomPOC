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

package atg.siebel.configurator.spu;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import atg.repository.RepositoryItem;

/**
 * This class represents the UI configuration for a configurable product.
 *
 * @author Patrick Mc Erlean
 * @version $Id: //product/Siebel/version/11.2/src/atg/siebel/configurator/spu/ProductUI.java#2 $$Change: 1194813 $
 * @updated $DateTime: 2015/09/10 08:26:24 $$Author: saysyed $
 */

public class ProductUI
{
  //----------------------------------------------------------------------------------
  // Class version string
  //----------------------------------------------------------------------------------

  public static String CLASS_VERSION = "$Id: //product/Siebel/version/11.2/src/atg/siebel/configurator/spu/ProductUI.java#2 $$Change: 1194813 $";

  //----------------------------------------------------------------------------------
  // Constants
  //----------------------------------------------------------------------------------

  //----------------------------------------------------------------------------------
  // Member Variables
  //----------------------------------------------------------------------------------

  //----------------------------------------------------------------------------------
  // Properties
  //----------------------------------------------------------------------------------

  //----------------------------------------------------------------------------------
  // property: productUIRepositoryItem

  private RepositoryItem mProductUIRepositoryItem = null;

  /**
   * Returns the product UI repository item
   *
   * @return the product UI repository item
   */

  public RepositoryItem getProducUIRepositoryItem()
  {
    return mProductUIRepositoryItem;
  }

  /**
   * Sets the product UI repository item
   *
   * @param pProductUIRepositoryItem the repository item to set
   */

  public void setProductUIRepositoryItem (RepositoryItem pProductUIRepositoryItem)
  {
    mProductUIRepositoryItem = pProductUIRepositoryItem;
  }

  //----------------------------------------------------------------------------------
  // property: id

  private String mId;

  /**
   * Returns the product UI id.
   *
   * @return the id of the product UI.
   */

  public String getId()
  {
    return mId;
  }

  /**
   * Sets the product UI id.
   *
   * @param pId the id of the product UI.
   */

  public void setId (String pId)
  {
    mId = pId;
  }

  //----------------------------------------------------------------------------------
  // property: productId

  private String mProductId;

  /**
   * Returns the product id.
   *
   * @return the id of the product.
   */

  public String getProductId()
  {
    return mProductId;
  }

  /**
   * Sets the product id.
   *
   * @param pProductId the id of the product.
   */

  public void setProductId (String pProductId)
  {
    mProductId = pProductId;
  }

  //----------------------------------------------------------------------------------
  // property: productName

  private String mProductName;

  /**
   * Returns the product name.
   *
   * @return the name of the product.
   */

  public String getProductName()
  {
    return mProductName;
  }

  /**
   * Sets the product name.
   *
   * @param pName the name of the product.
   */

  public void setProductName (String pProductName)
  {
    mProductName = pProductName;
  }

  //----------------------------------------------------------------------------------
  // property: promotionUI

  private PromotionUI mPromotionUI;

  /**
   * Returns the parent promotion UI.
   *
   * @return the parent promotion UI.
   */

  public PromotionUI getPromotionUI()
  {
    return mPromotionUI;
  }

  /**
   * Sets the parent promotion UI.
   *
   * @param pPromotionUI the parent promotion UI.
   */

  public void setPromotionUI (PromotionUI pPromotionUI)
  {
    mPromotionUI = pPromotionUI;
  }

  //----------------------------------------------------------------------------------
  // property: rootProductFlag

  private boolean mRootProductFlag;

  /**
   * Returns the root product flag.
   *
   * @return the root product flag.
   */

  public boolean getRootProductFlag()
  {
    return mRootProductFlag;
  }

  /**
   * Sets the root product flag.
   *
   * @param pRootProductFlag the root product flag.
   */

  public void setRootProductFlag (boolean pRootProductFlag)
  {
    mRootProductFlag = pRootProductFlag;
  }
  
  //----------------------------------------------------------------------------------
  // property: cssPath

  private String mCssPath;

  /**
   * Returns the css file path.
   *
   * @return the css file path.
   */

  public String getCssPath()
  {
    return mCssPath;
  }

  /**
   * Sets the css file path.
   *
   * @param pRootProductFlag the css file path.
   */

  public void setCssPath (String pCssPath)
  {
    mCssPath = pCssPath;
  }

  //----------------------------------------------------------------------------------
  // property: blocks

  private List<Block> mBlocks;

  /**
   * Returns the list of blocks.
   *
   * @return a list of blocks that compose the product UI.
   */

  public List<Block> getBlocks()
  {
    if (mBlocks == null)
    {
      mBlocks = new ArrayList<Block>();
    }

    return mBlocks;
  }

  /**
   * Sets the list of blocks.
   *
   * @param pBlocks the list of UI blocks.
   */

  public void setBlocks (List<Block> pBlocks)
  {
    mBlocks = pBlocks;
  }



  
	@Override
  public String toString() {
	  return "ProductUI [mId=" + mId + ", mProductId=" + mProductId
	      + ", mProductName=" + mProductName + ", mPromotionUI=" + mPromotionUI
	      + ", mRootProductFlag=" + mRootProductFlag + ", mBlocks=" + mBlocks + "]";
  }

	/**
	 * returns a list of blocks by type
	 * 
	 * @param pType
	 * @return
	 */
  public List<Block> getBlocksByType(String pType)
  {
    List<Block> blocks = new ArrayList<Block>();
    
    Iterator<Block> it = getBlocks().iterator();
    
    while(it.hasNext())
    {
      Block block = it.next();
      if(block.getType()!=null && 
          block.getType().equals(pType))
        blocks.add(block);
    }
    
    return blocks;
  }
  
  /**
   * remove a specified block 
   * 
   * @param pBlock
   */
  public void removeBlock(Block pBlock)
  {
    getBlocks().remove(pBlock);
  }
  
  /**
   * Insert a blog after a specified block
   * 
   * @param pAfterThis
   * @param pBlock
   */
  public void insertBlockAfter(Block pAfterThis, Block pBlock)
    throws StructuredProductUIException
  {
    int index = getBlocks().indexOf(pAfterThis);
    
    if(index == -1)
      throw new StructuredProductUIException("Trying to insert a block after " 
        + pAfterThis.getId() + " in productUI  " + getId() + " but block doesn't exist");
    
    getBlocks().add(index+1, pBlock);
  }

  /**
   * inserts a block as the last of it's type in the block index
   * 
   * @param pNewBlock
   */
  public void insertAsLastBlockOfType(Block pNewBlock, int pMarker)
    throws StructuredProductUIException
  {
    Iterator<Block> it = getBlocks().iterator();
    
    int counter = 0;
    int lastIndex = 0;
    while(it.hasNext())
    {
      Block block = it.next();
      
      if(block.getType()!=null && 
          block.getType().equals(pNewBlock.getType()))
      {
        lastIndex=counter;
      }
      
      counter++;
    }
    
    if(lastIndex < pMarker)
    {
      lastIndex = pMarker;
    }
    
    insertBlockAfter(getBlocks().get(lastIndex), pNewBlock);
  }
  
  /**
   * returns a block from the block list with a given ID. If 
   * it doesn't exist, return null
   * 
   * @param pId
   * @return
   */
  public Block getBlockById(String pId)
  {
    Iterator<Block> it = getBlocks().iterator();
    
    while(it.hasNext())
    {
      Block block = it.next();
      if(block.getId().equals(pId))
      {
        return block;
      }
    }
    
    return null;
  }

}
