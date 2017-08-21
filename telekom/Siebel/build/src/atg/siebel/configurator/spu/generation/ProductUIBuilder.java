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

import atg.nucleus.GenericService;
import atg.nucleus.ServiceMap;
import atg.repository.RepositoryException;
import atg.siebel.catalog.SiebelCatalogProduct;
import atg.siebel.configurator.spu.ProductUI;
import atg.siebel.configurator.spu.StructuredProductUIException;
import atg.siebel.configurator.spu.StructuredProductUITools;
import atg.siebel.configurator.spu.generation.template.UITemplate;

/**
 * This class is the entry point for the UI generation service. It uses a map of UITemplates
 * keyed on the tagret product's Product Type e.g.:
 * 
 * UITemplates=\DEFAULT=/atg/siebel/configurator/spu/generation/template/SimpleProductUITemplate,\
 * Simple Product With Attributes=/atg/siebel/configurator/spu/generation/template/SimpleProductWithAttributesUITemplate,\
 * Configurable Product=/atg/siebel/configurator/spu/generation/template/ConfigurableProductUITemplate,\
 * Promotion=/atg/siebel/configurator/spu/generation/template/PromotionUITemplate
 *
 * @author Gary McDowell
 * @version $Id: //product/Siebel/version/11.2/src/atg/siebel/configurator/spu/generation/ProductUIBuilder.java#2 $$Change: 1194813 $
 * @updated $DateTime: 2015/09/10 08:26:24 $$Author: saysyed $
 */
public class ProductUIBuilder extends GenericService 
{
  //----------------------------------------------------------------------------------
  // Class version string
  //----------------------------------------------------------------------------------

  public static String CLASS_VERSION = "$Id: //product/Siebel/version/11.2/src/atg/siebel/configurator/spu/generation/ProductUIBuilder.java#2 $$Change: 1194813 $";

  //----------------------------------------------------------------------------------
  // Constants
  //----------------------------------------------------------------------------------

  public static final String DEFAULT = "DEFAULT";
  //----------------------------------------------------------------------------------
  // Member Variables
  //----------------------------------------------------------------------------------

  //----------------------------------------------------------------------------------
  // Properties
  //----------------------------------------------------------------------------------

  //----------------------------------------------------------------------------------
  // property: uITemplates
  protected ServiceMap mUITemplates;
	public ServiceMap getUITemplates()
	{
	  return mUITemplates;
	}
	public void setUITemplates(ServiceMap pUITemplates)
	{
	  mUITemplates=pUITemplates;
	}
	//----------------------------------------------------------------------------------
  // property: isUsingDefaultTemplate
  protected boolean mIsUsingDefaultTemplate = true;
  public boolean isUsingDefaultTemplate()
  {
    return mIsUsingDefaultTemplate;
  }
  public void setIsUsingDefaultTemplate(boolean pIsUsingDefaultTemplate)
  {
    mIsUsingDefaultTemplate = pIsUsingDefaultTemplate;
  }
  //----------------------------------------------------------------------------------
  // property: blockManager
  protected BlockManager mBlockManager;
  public BlockManager getBlockManager()
  {
    return mBlockManager;
  }
  public void setBlockManager(BlockManager pBlockManager)
  {
    mBlockManager = pBlockManager;
  }
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
  
  
  /**
   * returns the UITemplate for the specified product type. This method is left public
   * so customers can specialise the rules for which template a type of product uses.
   * 
   * 
   * @param pProductType
   * @return
   * @throws StructuredProductUIException 
   */
	public UITemplate getUITemplate(SiebelCatalogProduct pProduct) throws StructuredProductUIException
	{
	  UITemplate template = (UITemplate) mUITemplates.get(getTemplateKey(pProduct));
	  
	  if(template==null)
    {
      if(isUsingDefaultTemplate())
      {
        template = (UITemplate)mUITemplates.get(DEFAULT);
      }
    }
	  return template;
	}
	
	/**
	 * override this method if you wish to use different keys for templates. For example
	 * templates could be keyed from product id
	 * 
	 * @param pProduct
	 * @return
	 */
	public String getTemplateKey(SiebelCatalogProduct pProduct)
	{
	  return pProduct.getProductType();
	}
	
	/**
	 * returns a constructed product UI for the product provided
	 * 
	 * @param pProduct
	 * @return
	 * @throws StructuredProductUIException
	 */
	public ProductUI buildProductUI(SiebelCatalogProduct pProduct) 
	    throws StructuredProductUIException
	{
	  
	  UITemplate template = getUITemplate(pProduct);	
	  if(template==null)
	  {
	    throw new StructuredProductUIException("No UITemplate found for product " + pProduct.getId());
	  }
	  
	  ProductUI prodUI = template.build(pProduct, getBlockManager(), this); 
	  
	  if(isLoggingDebug()&&prodUI!=null)
	    logDebug("Created a new product UI for product : " + pProduct.getId() + ", "
	        + pProduct.getName() + " with id :" + prodUI.getId());
	  
	  return prodUI;
	}
	
}
