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


package atg.siebel.catalog.mappingcomponents;

import java.util.Map;

import atg.siebel.catalog.mapper.ItemData;
import atg.siebel.catalog.mapper.MappingException;

/*
 *  
 * The Price List 'Description' is a straight mapping to the ATG 'description'
 * so we dont actually need a custom mapping component for this. This is 
 * somewhat of a hack to ensure that PriceListItem's are processed. The way the
 * mapper is setup we cant process the sub-items unless they map to an ATG property
 * and there is no property on priceList for the Price List Items. Therefore 
 * Description,ListOfPriceListItem are combined so Price List Item's can be
 * processed and 'Description' returned to map to 'description'.   
 */
public class PriceListDescriptionMapper extends ListOfItemMapper {

  //-------------------------------------
  /** Class version string */

  public static String CLASS_VERSION = "$Id: //product/Siebel/version/11.2/src/atg/siebel/catalog/mappingcomponents/PriceListDescriptionMapper.java#2 $$Change: 1194813 $";


  // Siebel Export PriceList properties 
  private static final String LIST_OF_PRICE_LIST_ITEM = "ListOfPriceListItem";
  
  // Siebel Export PriceListItem properties
  private static final String DESCRIPTION = "Description";
  
  // Dummy Siebel property to ensure price list id gets mapped
  private static final String SIEBEL_PRICE_LIST_ID = "PriceListId";
  
  private String mPriceListId;
  
  @Override
  public Object mapSiebelToATG(Object pSiebelFields, Map<String, Object> pAttributes) 
      throws MappingException {    
    mSiebelFields = pSiebelFields;
    mAttributes = pAttributes;
    
    mPriceListId = (String)getSiebelValue(getSiebelParentItemId());
    // This call simply ensures that the Price List Item's get added onto the nested
    // stack to be processed by the mapper. They aren't referenced from a PriceList
    // so we dont need to worry about what is returned from this call. 
    super.mapSiebelToATG(LIST_OF_PRICE_LIST_ITEM, pAttributes);
    
    return getSiebelValue(DESCRIPTION);
  }

  @Override
  protected void addNestedItem(ItemData itemData) throws MappingException {
    itemData.getProperties().put(SIEBEL_PRICE_LIST_ID, mPriceListId);
    super.addNestedItem(itemData);
  }

}
