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

import atg.repository.Repository;
import atg.repository.RepositoryException;
import atg.repository.RepositoryItem;
import atg.siebel.catalog.importer.ImportConstants;
import atg.siebel.catalog.mapper.ATGData;
import atg.siebel.catalog.mapper.ItemData;
import atg.siebel.catalog.mapper.ItemState;
import atg.siebel.catalog.mapper.MappingException;

/*
 * We extend the ListOfItemMapper even though there is only ever 1 AttributeDefaultValue
 * (or zero) per object. This is because when the tag exists in a Product it is parsed
 * into an ArrayList object and so is very convenient to use ListOfItemMapper functionality.  
 */
public class AttributeConfigurableDefaultValueMapper extends ListOfItemMapper {

  //-------------------------------------
  /** Class version string */

  public static String CLASS_VERSION = "$Id: //product/Siebel/version/11.2/src/atg/siebel/catalog/mappingcomponents/AttributeConfigurableDefaultValueMapper.java#2 $$Change: 1194813 $";


  private static final String SIEBEL_DISPLAY_VALUE = "DisplayValue";
  
  private static final String DISPLAY_VALUE_PROPERTY = "displayValue";
  
  protected String getExistingATGId(ItemData pItemData) throws MappingException {
    // get the current configured attribute default value property from the
    // repository
    Object existingConfiguredAttributeDefaultValueObj = getCurrentATGPropertyValue();

    if (existingConfiguredAttributeDefaultValueObj == null) {
      return null;
    }
    if (!(existingConfiguredAttributeDefaultValueObj instanceof RepositoryItem)) {
      String[] messageArguments = { "existingConfiguredAttributeDefaultValueObj",
          RepositoryItem.class.getName() };    
      String message = formatMappingErrorMessage(INVALID_PROPERTY_TYPE, messageArguments);
      logError(message);
      
      // Create and process the error
      String itemId = (String) pItemData.getProperties().get(getSiebelChildItemId());
      getMappingService().processMappingError(
          pItemData.getExportItemId(), message, itemId, pItemData.getName(), null, null);
      return null;
    }
    RepositoryItem existingConfiguredAttributeDefaultValue = 
        (RepositoryItem) existingConfiguredAttributeDefaultValueObj;

    // Check if the default value is the same as the one being imported 
    String existingDisplayValue = (String) existingConfiguredAttributeDefaultValue.getPropertyValue(DISPLAY_VALUE_PROPERTY);
    String newDisplayValue = (String) pItemData.getProperties().get(SIEBEL_DISPLAY_VALUE);
    
    if (existingDisplayValue.equalsIgnoreCase(newDisplayValue)) {
      // if it is the same then return the id of the existing.
      return existingConfiguredAttributeDefaultValue.getRepositoryId();
    }
    else {
      // otherwise we need to remove the existing default value
      String itemDesc = null;
      try {
        itemDesc = existingConfiguredAttributeDefaultValue.getItemDescriptor().getItemDescriptorName();
      } catch (RepositoryException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }
      
      String atgRepositoryName = (String) mAttributes.get(ImportConstants.ATG_REPOSITORY_NAME);
      Repository targetRepository = mMappingService.getTargetRepository(atgRepositoryName);

      ATGData deleteItem = new ATGData(itemDesc, targetRepository, ItemState.DELETED);
      deleteItem.addProperty(ImportConstants.M_ITEM_ATG_ID, existingConfiguredAttributeDefaultValue.getRepositoryId());
      getMappingService().addGeneratedItem(deleteItem);
    }
    return null;
  }

  /*
   * (non-Javadoc)
   * 
   * @see atg.siebel.catalog.mappingcomponents.ListOfItemMapper# checkExistingItemLinks(java.lang.String)
   */
  @Override
  protected void checkExistingItemLinks(String pItemIds) throws MappingException {
    // get the current property from the repository
    Object existingAttributeDefaultValueObj = getCurrentATGPropertyValue();

    if (existingAttributeDefaultValueObj == null) {
      return;
    }
    if (!(existingAttributeDefaultValueObj instanceof RepositoryItem)) {
      String[] messageArguments = { "existingAttributeDefaultValueObj", "RepositoryItem" };    
      String message = formatMappingErrorMessage(INVALID_PROPERTY_TYPE, messageArguments);
      vlogError(message);
      
      String itemId = ((String) getSiebelItem().getProperties().get(getSiebelParentItemId()));
      getMappingService().processMappingError(
          getSiebelItem().getExportItemId(), message, itemId, getSiebelItemType(), null, null);
      return;
    }

    RepositoryItem existingAttributeDefaultValue = (RepositoryItem) existingAttributeDefaultValueObj;
    String existingAttributeDefaultValueId = existingAttributeDefaultValue.getRepositoryId();

    // compare the itemIds with the id of the existing item
    if (!pItemIds.equalsIgnoreCase(existingAttributeDefaultValueId) && existingAttributeDefaultValueId != "") {
      // generate a delete item for the existing attribute default value
      String attributeDefaultValueItemDescriptor = null;
      try {
        attributeDefaultValueItemDescriptor = existingAttributeDefaultValue.getItemDescriptor().getItemDescriptorName();
      } catch (RepositoryException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }

      ATGData deleteItem = new ATGData(attributeDefaultValueItemDescriptor, getProductCatalogRepository());
      deleteItem.addProperty(ImportConstants.M_ITEM_ATG_ID, existingAttributeDefaultValueId);
      getMappingService().addGeneratedItem(deleteItem);

    }

  }
  
}
