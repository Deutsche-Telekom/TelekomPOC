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

import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.lang.reflect.InvocationTargetException;

import atg.siebel.catalog.SiebelCatalogProduct;
import atg.siebel.configurator.spu.StructuredProductUIException;
import atg.siebel.configurator.spu.generation.template.UITemplate;

/**
 * 
 *
 * @author Gary McDowell
 * @version $Id: //product/Siebel/version/11.2/src/atg/siebel/configurator/spu/generation/PromotionProductUIBuilder.java#2 $$Change: 1194813 $
 * @updated $DateTime: 2015/09/10 08:26:24 $$Author: saysyed $
 */
public class PromotionProductUIBuilder extends ProductUIBuilder
{
  //----------------------------------------------------------------------------------
  // Class version string
  //----------------------------------------------------------------------------------

  public static String CLASS_VERSION = "$Id: //product/Siebel/version/11.2/src/atg/siebel/configurator/spu/generation/PromotionProductUIBuilder.java#2 $$Change: 1194813 $";

  /**
   * the promotion id to use when build root product ui's
   */
  protected String mId;
  public String getId()
  {
    return mId;
  }
  public void setId(String pId)
  {
    mId = pId;
  }
  /**
   * the name of the property used as a key in the UITemplates map
   */
  protected String mKeyPropertyName;
  public String getKeyPropertyName()
  {
    return mKeyPropertyName;
  }
  public void setKeyPropertyName(String pKeyPropertyName)
  {
    mKeyPropertyName = pKeyPropertyName;
  }
  
  /**
   * Here is an example of how to build a product ui based on a product id. The Id of the 
   * target product is configured in the template map
   * 
   * @param pProduct
   * @return
   */
  public UITemplate getUITemplate(SiebelCatalogProduct pProduct) throws StructuredProductUIException
  {
    //set this initially to an empty string so don't get a null pointer from the Map
    String property = "";
    
    try
    {
      property = (String)new PropertyDescriptor(getKeyPropertyName(), SiebelCatalogProduct.class).getReadMethod().invoke(pProduct);
    } 
    catch (IllegalAccessException e)
    {
      throw new StructuredProductUIException(e);
    } 
    catch (InvocationTargetException e)
    {
      throw new StructuredProductUIException(e);
    } 
    catch (IntrospectionException e)
    {
      //don't do anything, as we might not have a property name
    }
    
    UITemplate template = (UITemplate) mUITemplates.get(property);
    
    if(template==null)
    {
      template = super.getUITemplate(pProduct);
    }
    return template;
  }
}
