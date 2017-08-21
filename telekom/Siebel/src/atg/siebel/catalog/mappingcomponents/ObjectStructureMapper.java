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
 * We extend the ListOfItemMapper even though there is only ever 1 
 * ObjectSimpleBundle/ObjectConfigurableProduct/ObjectPromotion (or zero) per object.
 * This is because when the tag exists in a Product it is parsed into an ArrayList object
 * and so is very convenient to use ListOfItemMapper functionality.  
 */
public class ObjectStructureMapper extends ListOfItemMapper {

  //-------------------------------------
  /** Class version string */

  public static String CLASS_VERSION = "$Id: //product/Siebel/version/11.2/src/atg/siebel/catalog/mappingcomponents/ObjectStructureMapper.java#2 $$Change: 1194813 $";


  // -----------------------------
  // property: objectStructurePropertyName
  // -----------------------------
  private String mObjectStructurePropertyName;

  public String getObjectStructurePropertyName() {
    return mObjectStructurePropertyName;
  }

  public void setObjectStructurePropertyName(String pObjectStructurePropertyName) {
    mObjectStructurePropertyName = pObjectStructurePropertyName;
  }

  /*
   * For Siebel entities where an id doesn't exist we may want to check whether the entity already exists in the ATG
   * repository. It can vary between different Siebel entities how we determine whether it exists in ATG repository so
   * this method can be overridden in sub-classes to implement this. The method should return the ATG id of the item or
   * null if the item doesn't exist.
   */
  @Override
  protected String getExistingATGId(ItemData itemData) throws MappingException {

    // get the product id
    String productId = (String) getSiebelValue(getSiebelParentItemId());

    // query repository and get repository item
    RepositoryItem product = null;
    RepositoryItem objectStructure = null;
    try {
      String atgRepositoryName = (String) mAttributes.get(ImportConstants.ATG_REPOSITORY_NAME);
      Repository targetRepository = getMappingService().getTargetRepository(atgRepositoryName);
      product = targetRepository.getItem(productId, ImportConstants.M_ITEM_PRODUCT);
      if (product == null) {
        return null;
      }
      Object obj = product.getPropertyValue(getObjectStructurePropertyName());
      if (obj == null) {
        return null;
      } else if (!(obj instanceof RepositoryItem)) {
        // TODO throw exception.....
      }
      objectStructure = (RepositoryItem) obj;
    } catch (RepositoryException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }

    return objectStructure.getRepositoryId();
  }

  /*
   * (non-Javadoc)
   * 
   * @see atg.siebel.catalog.mappingcomponents.ListOfItemMapper# checkExistingItemLinks(java.lang.String)
   */
  @Override
  protected void checkExistingItemLinks(String itemIds) throws MappingException {
    // get the current property from the repository
    Object existingObjectStructureObj = getCurrentATGPropertyValue();

    if (existingObjectStructureObj == null) {
      return;
    }
    if (!(existingObjectStructureObj instanceof RepositoryItem)) {
      String[] messageArguments = {
          "existingObjectStructureObj",
          "RepositoryItem" };
      String message = formatMappingErrorMessage(INVALID_PROPERTY_TYPE, messageArguments);
      logError(message);

      String itemId = (String) getSiebelItem().getProperties().get(getSiebelParentItemId());
      getMappingService().processMappingError(
          getSiebelItem().getExportItemId(), message, itemId, getSiebelItemType(), null, null);
      return;
    }

    RepositoryItem existingObjectStructure = (RepositoryItem) existingObjectStructureObj;
    String existingObjectId = existingObjectStructure.getRepositoryId();

    // compare the itemIds with the id of the existing item
    if (!itemIds.equalsIgnoreCase(existingObjectId) && existingObjectId != "") {
      // generate a delete item for the existing object structure 
      String objectStructureItemDescriptor = null;
      try {
        objectStructureItemDescriptor = existingObjectStructure.getItemDescriptor().getItemDescriptorName();
      } catch (RepositoryException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }
      
      String atgRepositoryName = (String) mAttributes.get(ImportConstants.ATG_REPOSITORY_NAME);
      Repository targetRepository = mMappingService.getTargetRepository(atgRepositoryName);

      ATGData deleteItem = new ATGData(objectStructureItemDescriptor, targetRepository, ItemState.DELETED);
      deleteItem.addProperty(ImportConstants.M_ITEM_ATG_ID, existingObjectId);
      getMappingService().addGeneratedItem(deleteItem);

    }

  }

}
