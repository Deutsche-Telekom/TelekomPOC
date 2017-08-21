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

import java.util.Collection;

import atg.repository.Repository;
import atg.repository.RepositoryException;
import atg.repository.RepositoryItem;
import atg.siebel.catalog.importer.ImportConstants;
import atg.siebel.catalog.mapper.ATGData;
import atg.siebel.catalog.mapper.ItemState;
import atg.siebel.catalog.mapper.MappingException;

public class CheckExistingLinksMapper extends ListOfItemMapper {

  //-------------------------------------
  /** Class version string */

  public static String CLASS_VERSION = "$Id: //product/Siebel/version/11.2/src/atg/siebel/catalog/mappingcomponents/CheckExistingLinksMapper.java#2 $$Change: 1194813 $";


  /**
   * The reason for this method is there are no notifications of existing links being deleted from Siebel.
   * This method checks the existing links against new ones from an import. Any items which were linked 
   * to but no longer are in the new import should be deleted. 
   *
   * The reason this functionality isn't in ListOfItemMapper is there are some cases where we want to
   * keep the existing links and other cases where we want to remove the existing links. For example a
   * product may be removed from a category but we don't want to delete the product, however an Object
   * Decoration may be removed from a configurable product and we need to remove this from ATG. If the
   * existing links need to stay then use ListOfItemMapper otherwise use this.
   *
   * NOTE: This method relies on the repository defining the list of children as 'java.util.List' for
   * the parent-children relationship. If defined as anything else.a custom mapping component will need
   * to be constructed which overrides this method.  
   *
   * @param itemIds the new item id's to against existing item id's 
   */  
  @Override
  protected void checkExistingItemLinks(String itemIds) throws MappingException {
    // get the current property from the repository
    Object existingListObj = getCurrentATGPropertyValue();

    if (existingListObj == null) {
      return;
    }
    if (!(existingListObj instanceof Collection<?>)) {
      String[] messageArguments = { "existingListObj", "List<?>" };      
      String message = formatMappingErrorMessage(INVALID_PROPERTY_TYPE, messageArguments);
      vlogError(message);
      
      String itemId = (String) getSiebelItem().getProperties().get(getSiebelParentItemId());
      getMappingService().processMappingError(
          getSiebelItem().getExportItemId(), message, itemId, getSiebelItemType(), null, null);
    }

    @SuppressWarnings("unchecked")
    Collection<RepositoryItem> existingList = (Collection<RepositoryItem>) existingListObj;

    // loop thru the repository items checking the id is contained within itemIds
    for (RepositoryItem existingItem : existingList) {
      if (itemIds.indexOf(existingItem.getRepositoryId()) == -1) {
        // if not contained generate a delete item for that repository item
        String linkedItemItemDescriptor = null;
        try {
          linkedItemItemDescriptor = existingItem.getItemDescriptor().getItemDescriptorName();
        } catch (RepositoryException e) {
          // TODO Auto-generated catch block
          e.printStackTrace();
        }

        String atgRepositoryName = (String) mAttributes.get(ImportConstants.ATG_REPOSITORY_NAME);        
        Repository targetRepository = mMappingService.getTargetRepository(atgRepositoryName);
        
        ATGData deleteItem = new ATGData(linkedItemItemDescriptor, targetRepository, ItemState.DELETED);
        deleteItem.addProperty(ImportConstants.M_ITEM_ATG_ID, existingItem.getRepositoryId());
        getMappingService().addGeneratedItem(deleteItem);

      }

    }

  }
}
