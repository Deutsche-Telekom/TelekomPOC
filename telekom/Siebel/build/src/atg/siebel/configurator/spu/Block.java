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

import java.util.List;

import atg.repository.RepositoryItem;

/**
 * This class represents a block. A block references a renderer, which in turn
 * references a JSP fragment.
 *
 * @author Patrick Mc Erlean
 * @version $Id: //product/Siebel/version/11.2/src/atg/siebel/configurator/spu/Block.java#2 $$Change: 1194813 $
 * @updated $DateTime: 2015/09/10 08:26:24 $$Author: saysyed $
 */

public class Block
{
  //----------------------------------------------------------------------------------
  // Class version string
  //----------------------------------------------------------------------------------

  public static String CLASS_VERSION = "$Id: //product/Siebel/version/11.2/src/atg/siebel/configurator/spu/Block.java#2 $$Change: 1194813 $";

  //----------------------------------------------------------------------------------
  // Constants
  //----------------------------------------------------------------------------------

  public static final String ATTRIBUTE_BLOCK = "attributeBlock";
  public static final String RELATIONSHIP_BLOCK = "relationshipBlock";

  //----------------------------------------------------------------------------------
  // Member Variables
  //----------------------------------------------------------------------------------

  //----------------------------------------------------------------------------------
  // Properties
  //----------------------------------------------------------------------------------

  //----------------------------------------------------------------------------------
  // property: blockRepositoryItem

  private RepositoryItem mBlockRepositoryItem = null;

  /**
   * Returns the block repository item
   *
   * @return the block repository item
   */

  public RepositoryItem getBlockRepositoryItem()
  {
    return mBlockRepositoryItem;
  }

  /**
   * Sets the block repository item
   *
   * @param pBlockRepositoryItem the repository item to set
   */

  public void setBlockRepositoryItem (RepositoryItem pBlockRepositoryItem)
  {
    mBlockRepositoryItem = pBlockRepositoryItem;
  }
  
  //----------------------------------------------------------------------------------
  // property: id

  private String mId;

  /**
   * Returns the block id.
   *
   * @return the id of the block.
   */

  public String getId()
  {
    return mId;
  }

  /**
   * Sets the block id.
   *
   * @param pId the id of the block.
   */

  public void setId (String pId)
  {
    mId = pId;
  }

  //----------------------------------------------------------------------------------
  // property: name

  private String mName;

  /**
   * Returns the block name.
   *
   * @return the name of the block.
   */

  public String getName()
  {
    return mName;
  }

  /**
   * Sets the name of the block.
   *
   * @param pName the block name
   */

  public void setName (String pName)
  {
    mName = pName;
  }

  //----------------------------------------------------------------------------------
  // property: displayName

  private String mDisplayName;

  /**
   * Returns the block display name.
   *
   * @return the display name of the block.
   */

  public String getDisplayName()
  {
    return mDisplayName;
  }

  /**
   * Sets the display name of the block.
   *
   * @param pDisplayName the block display name
   */

  public void setDisplayName (String pDisplayName)
  {
  	mDisplayName = pDisplayName;
  }

  //----------------------------------------------------------------------------------
  // property: type

  private String mType;

  /**
   * Returns the block type.
   *
   * @return the type of the block.
   */

  public String getType()
  {
    return mType;
  }

  /**
   * Sets the block type.
   *
   * @param pType the block's type.
   */

  public void setType (String pType)
  {
    mType = pType;
  }

  //----------------------------------------------------------------------------------
  // property: renderer

  private Renderer mRenderer;

  /**
   * Returns the renderer.
   *
   * @return a Renderer that references a JSP fragment.
   */

  public Renderer getRenderer()
  {
    return mRenderer;
  }

  /**
   * Sets the renderer.
   *
   * @param pRenderer the block's renderer.
   */

  public void setRenderer (Renderer pRenderer)
  {
    mRenderer = pRenderer;
  }

  //----------------------------------------------------------------------------------
  // property: activeFlag

  private boolean mActiveFlag = true;

  /**
   * Returns the active flag.
   *
   * @return the value of the active flag.
   */

  public boolean getActiveFlag()
  {
    return mActiveFlag;
  }

  /**
   * Sets the active flag.
   *
   * @param pActiveFlag the block's active flag.
   */

  public void setActiveFlag (boolean pActiveFlag)
  {
    mActiveFlag = pActiveFlag;
  }

  //----------------------------------------------------------------------------------
  // property: htmlAttributes

  private String mHtmlAttributes;

  /**
   * Returns the htmlAttributes parameter.
   *
   * @return the htmlAttributes parameter.
   */

  public String getHtmlAttributes()
  {
    return mHtmlAttributes;
  }

  /**
   * Sets the htmlAttributes parameter.
   *
   * @param pHtmlAttributes the htmlAttributes parameter.
   */

  public void setHtmlAttributes (String pHtmlAttributes)
  {
  	mHtmlAttributes = pHtmlAttributes;
  }

  //----------------------------------------------------------------------------------
  // property: attributeId

  private String mAttributeId;

  /**
   * Returns the attribute id.
   *
   * @return the id of the attribute.
   */

  public String getAttributeId()
  {
    return mAttributeId;
  }

  /**
   * Sets the attribute id.
   *
   * @param pAttributeId the id of the attribute.
   */

  public void setAttributeId (String pAttributeId)
  {
    mAttributeId = pAttributeId;
  }

  //----------------------------------------------------------------------------------
  // property: attributeName

  private String mAttributeName;

  /**
   * Returns the attribute name.
   *
   * @return the name of the attribute.
   */

  public String getAttributeName()
  {
    return mAttributeName;
  }

  /**
   * Sets the attribute name.
   *
   * @param pAttributeName the name of the attribute.
   */

  public void setAttributeName (String pAttributeName)
  {
    mAttributeName = pAttributeName;
  }

  //----------------------------------------------------------------------------------
  // property: relationshipId

  private String mRelationshipId;

  /**
   * Returns the relationship id.
   *
   * @return the id of the relationship.
   */

  public String getRelationshipId()
  {
    return mRelationshipId;
  }

  /**
   * Sets the relationship id.
   *
   * @param pRelationshipId the id of the relationship.
   */

  public void setRelationshipId (String pRelationshipId)
  {
  	mRelationshipId = pRelationshipId;
  }

  //----------------------------------------------------------------------------------
  // property: childBlocks

  private List<ProductUI> mChildBlocks;

  /**
   * Returns the childBlocks.
   *
   * @return the childBlocks.
   */
  public List<ProductUI> getChildProductUIs()
  {
    return mChildBlocks;
  }


  /**
   * Sets the childBlocks.
   *
   * @param pChildBlocks the childBlocks.
   */

  public void setChildProductUIs (List<ProductUI> pChildBlocks)
  {
  	mChildBlocks = pChildBlocks;
  }
}
