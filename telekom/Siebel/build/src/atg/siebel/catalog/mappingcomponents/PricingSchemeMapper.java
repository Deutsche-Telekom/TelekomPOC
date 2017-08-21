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

import java.util.List;
import java.util.Map;

import atg.siebel.catalog.mapper.ATGData;
import atg.siebel.catalog.mapper.MappingConstants;
import atg.siebel.catalog.mapper.MappingException;

/*
 * This Mapper assumes that all the VolumeDiscount Siebel elements have 
 * been processed before the PriceListItem elements. We can assume this because
 * the VolumeDiscount elements are top level which get processed first. The 
 * PriceListItem is a nested element and nested elements get processed
 * after all top level elements are processed.
 * 
 * Obviously this assumption makes this Mapper a potential source of bugs if the
 * order that Siebel elements are processed was to change.
 * 
 */
public class PricingSchemeMapper extends BaseMapper {

  //-------------------------------------
  /** Class version string */

  public static String CLASS_VERSION = "$Id: //product/Siebel/version/11.2/src/atg/siebel/catalog/mappingcomponents/PricingSchemeMapper.java#2 $$Change: 1194813 $";


  // Siebel element name
  private static final String VOLUME_DISCOUNT_ID = "VolumeDiscountId";
  
  // ATG item-descriptor name
  private static final String COMPLEX_PRICE_ITEM_DESC = "complexPrice";
  
  // ATG item-descriptor property name
  private static final String ID = "id";
  private static final String DISCOUNT_METHOD = "discountMethod";
  
  @Override
  public Object mapSiebelToATG(Object pSiebelFields, Map<String, Object> pAttributes) 
        throws MappingException {
    mAttributes = pAttributes;

    // check to see if there is a volume discount associated with this PriceListItem
    Object obj = getSiebelValue(VOLUME_DISCOUNT_ID);
    // if not the pricingScheme accordingly
    if (obj == null) {
      return MappingConstants.PRICING_SCHEME_LIST;
    }
    
    String volumeDiscountId = (String) obj;
        
    // loop through all items that have already been mapped
    List<ATGData> mappedItems = getMappingService().getMappedItems();
    for (ATGData atgData : mappedItems) {
      // looked for all complexPrice items (what Siebel VolumeDiscount maps to)
      if (!atgData.getName().equalsIgnoreCase(COMPLEX_PRICE_ITEM_DESC)) {
        continue;
      }
      // attempt to find the complexPrice with id equal to VolumeDiscountId from the
      // PriceListItem
      String complexPriceId = (String)atgData.getProperties().get(ID);
      if (!complexPriceId.equalsIgnoreCase(volumeDiscountId)) {
        continue;
      }
    
      // now check the discount method property
      String discountMethod = (String)atgData.getProperties().get(DISCOUNT_METHOD);
      if (discountMethod.equalsIgnoreCase(MappingConstants.DISCOUNT_METHOD_SIMPLE)) {
        return MappingConstants.PRICING_SCHEME_BULK;
      }
      if (discountMethod.equalsIgnoreCase(MappingConstants.DISCOUNT_METHOD_TIERED)) {
        return MappingConstants.PRICING_SCHEME_TIERED;
      }
    }
    
    return MappingConstants.PRICING_SCHEME_LIST;
  }

}
