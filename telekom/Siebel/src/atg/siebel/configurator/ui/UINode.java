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
import atg.siebel.configurator.AbstractRelationship.DomainProduct;
import atg.siebel.configurator.ProductConfigInstance;
import atg.siebel.configurator.ProductConfigRelationship;
import atg.siebel.configurator.attribute.Attribute;
import atg.siebel.configurator.attribute.EnumeratedAttribute;
import atg.siebel.configurator.command.CommandResult;
import atg.siebel.configurator.spu.Renderer;
import atg.siebel.configurator.status.CommandStatus;

/**
 * 
 * @author
 * @version $Id:
 *          //product/Siebel/main/src/atg/siebel/configurator/ui/UINode.java#4
 *          $$Change: 1194813 $
 * @updated $DateTime: 2015/09/10 08:26:24 $$Author: saysyed $
 **/
public class UINode {

  //-------------------------------------
  /** Class version string */

  public static String CLASS_VERSION = "$Id: //product/Siebel/version/11.2/src/atg/siebel/configurator/ui/UINode.java#2 $$Change: 1194813 $";


  /**
   * All possible types of UINode
   */
  enum UINodeType {
    DISPLAY_NODE, ATTRIBUTE_NODE, PRODUCT_NODE, RELATIONSHIP_NODE
  }

  private final UINodeType mType;

  public UINodeType getType() {
    return mType;
  }

  // -------------------------------------
  // Properties

  // -------------------------------------
  // renderer property
  private Renderer mRenderer;

  public Renderer getRenderer() {
    return mRenderer;
  }

  public void setRenderer(Renderer pRenderer) {
    mRenderer = pRenderer;
  }

  // -------------------------------------
  // productConfigInstance property
  private ProductConfigInstance mProductConfigInstance;

  public ProductConfigInstance getProductConfigInstance() {
    return mProductConfigInstance;
  }

  public void setProductConfigInstance(
      ProductConfigInstance pProductConfigInstance) {
    mProductConfigInstance = pProductConfigInstance;

  }

  // -------------------------------------
  // pciPropertyIdentifier property
  private String mPciPropertyIdentifier;

  public String getPciPropertyIdentifier() {
    return mPciPropertyIdentifier;
  }

  public void setPciPropertyIdentifier(String pPciPropertyIdentifier) {
    mPciPropertyIdentifier = pPciPropertyIdentifier;
  }

  // -------------------------------------
  // property: htmlAttributes
  private String mHtmlAttributes = null;

  public String getHtmlAttributes() {
    return mHtmlAttributes;
  }

  public void setHtmlAttributes(String pHtmlAttributes) {
    mHtmlAttributes = pHtmlAttributes;
  }

  // -------------------------------------
  // displayName property
  private String mDisplayName;

  public String getDisplayName() {
    return mDisplayName;
  }

  public void setDisplayName(String pDisplayName) {
    mDisplayName = pDisplayName;
  }


  // -------------------------------------
  // value selectedValue property
  private String mValue;

  public String getSelectedValue() {
    if (mValue == null && mType.equals(UINodeType.ATTRIBUTE_NODE)) {
      mValue = mProductConfigInstance.getAttribute(mPciPropertyIdentifier)
          .getValue();
    }
    return mValue;
  }

  public void setSelectedValue(String pValue) {
    if (StringUtils.isEmpty(pValue) || pValue.equals("--None--")) {
      return;
    }
    CommandResult result = null;
    switch (mType) {
    case ATTRIBUTE_NODE:
      if (StringUtils.isEmpty(getSelectedValue())
          || !getSelectedValue().equals(pValue)) {
        result = mProductConfigInstance
            .setAttributeValue(mPciPropertyIdentifier, pValue);
      }
      break;
    case RELATIONSHIP_NODE:
      result = mProductConfigInstance.addChildProduct(mPciPropertyIdentifier, pValue);
      break;
    default:
      break;
    }
    
    if(result != null)
    {
      //get the command status
      CommandStatus status = result.getStatus();
      if(status!=null&&!status.getIsSuccessful())
      {
        mErrorMessage=status.getStatusDetails().getStatusCode();
      }
    }
  }
  
  
  /**
   * returns a unique id so so the page coder can access the node via javascript
   * 
   * @return
   */
  public String getUniqueID()
  {
	  if (mType.equals(UINodeType.ATTRIBUTE_NODE)) 
	  {
	      return mProductConfigInstance.getKey().getHashCode()+Math.abs(mPciPropertyIdentifier.hashCode());
	  }
	  return null;
  }
  
  public boolean getReadOnly()
  {
	  if (mType.equals(UINodeType.ATTRIBUTE_NODE)) 
	  {
	      return mProductConfigInstance.getAttribute(mPciPropertyIdentifier).getReadOnly();
	  }
	  return false;
  }
  
  public boolean getRequired()
  {
	  if (mType.equals(UINodeType.ATTRIBUTE_NODE)) 
	  {
	      return mProductConfigInstance.getAttribute(mPciPropertyIdentifier).getRequired();
	  }
	  return false;
  }
  
  public boolean getHidden()
  {
	  if (mType.equals(UINodeType.ATTRIBUTE_NODE)) 
	  {
	      return mProductConfigInstance.getAttribute(mPciPropertyIdentifier).getHidden();
	  }
	  return false;
  }

  /**
   * @param pNodeType
   */
  public UINode(UINodeType pNodeType) {
    mType = pNodeType;
  }

  /**
   * @return the page with which we render this node
   */
  public String getPage() {
    String page = null;
    if (getRenderer() != null) {
      Renderer renderer = getRenderer();
      page = renderer.getJspPath();
    }
    return page;
  }

  /**
   * @return enumerated attribute values; if this is not an attribute node then
   *         return an empty array.
   */
  public String[] getDomainValues() {
    if (mType.equals(UINodeType.ATTRIBUTE_NODE)) {
      Attribute attribute = mProductConfigInstance
          .getAttribute(getPciPropertyIdentifier());
      if (attribute instanceof EnumeratedAttribute) {
        return ((EnumeratedAttribute) attribute).getDomainValues();
      }
    }
    return new String[0];
  }

  /**
   * @return DomainProduct's having excluded flag value as false that belong to
   *         the relationship; if this is not a domain node then return an empty
   *         array.
   */
  public DomainProduct[] getDomainProducts() {
    if (mType.equals(UINodeType.RELATIONSHIP_NODE)) {
      ProductConfigRelationship relationship = mProductConfigInstance
          .getChildRelationship(getPciPropertyIdentifier());
      if (relationship != null && relationship.getDomainProductCount() > 0) {
        // return domain Products that has excluded flag as false
        List<DomainProduct> domainProducts = new ArrayList<DomainProduct>();
        for (DomainProduct product : relationship.getDomainProducts()) {
          if (!product.isExcluded())
            domainProducts.add(product);
        }
        return domainProducts.toArray(new DomainProduct[domainProducts.size()]);
      }
    }
    return new DomainProduct[0];
  }

  /**
   * if the UINode is a of type RELATIONSHIP_NODE, this returns the relationship instance
   * from the PCI
   * 
   * @return
   */
  public ProductConfigRelationship getProductConfigRelationship()
  {
	if(mType.equals(UINodeType.RELATIONSHIP_NODE))
	{
		return getProductConfigInstance().getChildRelationship(getPciPropertyIdentifier());
	}
	else
		return null;
  }
  
  protected String mErrorMessage = null;
  
  /**
   * return any error messages, then reset the error message to null
   * 
   * @return
   */
  public String getErrorMessage()
  {
    String message = mErrorMessage;
    return message;
  }
  
  /**
   * set an error message on the node
   * 
   * @param pErrorMessage
   */
  public void setErrorMessage(String pErrorMessage)
  {
    this.mErrorMessage=pErrorMessage;
  }
  
  @Override
  public String toString() {
    return "UINode [mType=" + mType + ", mRenderer=" + mRenderer
        + ", mProductConfigInstance=" + mProductConfigInstance
        + ", mPciPropertyIdentifier=" + mPciPropertyIdentifier
        + ", mDisplayName=" + mDisplayName + ", mValue=" + mValue + "]";
  }

}
