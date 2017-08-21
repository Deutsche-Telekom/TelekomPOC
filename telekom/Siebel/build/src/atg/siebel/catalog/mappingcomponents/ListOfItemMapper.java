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

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import atg.core.util.ResourceUtils;
import atg.repository.RepositoryItem;
import atg.service.idgen.IdGeneratorException;
import atg.siebel.catalog.importer.ImportConstants;
import atg.siebel.catalog.mapper.ItemData;
import atg.siebel.catalog.mapper.MappingConstants;
import atg.siebel.catalog.mapper.MappingException;
import atg.siebel.catalog.mapper.SiebelCatalogMappingService;


/**
 * The Siebel XML export follows the ListOf pattern when there are multiple children
 * entities of another Siebel entity. For this scenario we need to determine the id's
 * of the children entities so the relationships can be maintained in the ATG
 * repository. To complicate this the Siebel system doesn't currently advise when these
 * relationships change on subsequent imports. This means we need to be able to
 * determine if and how the relationships have changed and take appropriate action. 
 * 
 * There are a few different relationship scenarios due to peculiarities of the
 * Siebel system
 * - Some Siebel entities do not have Id's, in these cases we need to generate id's
 *     since they are required in the ATG repository. When re-importing these items 
 *     there are some cases where we want to keep the existing ATG id. In some 
 *     cases however it is extremely hard to determine the existing id so we simply
 *     delete existing items and import entities as new.  
 * - When a relationship is deleted in Siebel there are some cases where we want to
 *     keep the child entity in ATG and other cases where we want to remove the child
 *     entity. For example a product may be removed from a category but we don't want
 *     to delete the product, however an Object Decoration may be removed from a
 *     configurable product and we need to remove this from ATG.
 * - Also there are cases where Siebel id exists for an entity however it is not 
 *     a unique id for that entity type. For example Configurable Product Attribute
 *     has the OrigId field as its id however multiple products can have Configured
 *     Attributes with this same OrigId (all with different properties). For this
 *     scenario a new ATG id is generated for each Configured Attribute. 
 * 
 * Because of these different scenarios it isn't possible to have one mapping class
 * handle all of the ListOf occurrences in the Siebel XML. Instead we have this
 * generic class which provides the basis of the functionality for this purpose. It
 * can then be extended to handle the needs of each scenario.
 *
 * @author dreiman
 */
public class ListOfItemMapper extends BaseMapper {

  //-------------------------------------
  /** Class version string */

  public static String CLASS_VERSION = "$Id: //product/Siebel/version/11.2/src/atg/siebel/catalog/mappingcomponents/ListOfItemMapper.java#2 $$Change: 1194813 $";


  // -----------------------------
  // property: siebelIdExistsForChildren
  //
  // There are some Siebel entities for which Id's dont exist, this property
  // defines whether the Siebel children entities have an Id.
  // -----------------------------
  private boolean mSiebelIdExistsForChildren = true;

  public boolean getSiebelIdExistsForChildren() {
    return mSiebelIdExistsForChildren;
  }

  public void setSiebelIdExistsForChildren(boolean pSiebelIdExistsForChildren) {
    mSiebelIdExistsForChildren = pSiebelIdExistsForChildren;
  }


  /**
   * This method builds up a String of comma separated id's of children
   * Siebel entities.
   * 
   * @see
   * atg.siebel.catalog.mapper.BaseMapper#mapSiebelToATG(java.lang
   * .Object, java.util.Map, java.util.Map)
   */
  @SuppressWarnings("rawtypes")
  @Override
  public Object mapSiebelToATG(Object pSiebelFields, Map<String, Object> pAttributes) 
      throws MappingException {
    mSiebelFields = pSiebelFields;
    mAttributes = pAttributes;

    Object propertyValue = getSiebelValue();
    if (propertyValue == null) {
      checkExistingItemLinks("");
      return "";
    }

    // Make sure the property is definitely a list
    if (!(propertyValue instanceof List)) {
      String[] messageArguments = { "propertyValue", "List" };
      String message = formatMappingErrorMessage(INVALID_PROPERTY_TYPE, messageArguments);
      vlogError(message);
      
      String itemId = (String) getSiebelItem().getProperties().get(getSiebelParentItemId());
      getMappingService().processMappingError(
          getSiebelItem().getExportItemId(), message, itemId, 
          getSiebelItemType(), null, null);
      return "";
    }

    StringBuilder itemIds = new StringBuilder();
    List list = (List) propertyValue;
    List<String> deletes = new ArrayList<String>(); 
    
    // Loop through all the items in the list and get their id's
    for (Object obj : list) {
      if (!(obj instanceof ItemData)) {
        String[] messageArguments = {getSiebelItemType(),  "ItemData", obj.toString() };
        String message = formatMappingErrorMessage(INVALID_PARSED_CHILD_ITEM_TYPE, messageArguments);
        vlogError(message);
        
        String itemId = (String) getSiebelItem().getProperties().get(getSiebelParentItemId());
        String itemType = getSiebelItemType();
        getMappingService().processMappingError(
              null, message, itemId, itemType, null, null);
        continue;
      }

      ItemData itemData = (ItemData) obj;
      
      // check whether item is valid and if not dont process
      String invalidBecause = isValidItem(itemData);
      if (invalidBecause.length() > 0) {
        String[] messageArguments = {getSiebelItemType(),  invalidBecause };
        String message = ResourceUtils.getMsgResource(ImportConstants.INVALID_PARSED_CHILD_ITEM_TYPE,
            SiebelCatalogMappingService.MY_RESOURCE_NAME, 
            SiebelCatalogMappingService.sResourceBundle, messageArguments);
        vlogError(message);
        
        String itemId = (String) getSiebelItem().getProperties().get(getSiebelParentItemId());
        getMappingService().processMappingError(
            null, message, itemId, getSiebelItemType(), null, null);
        continue;
      }
      
      Map<String, Object> props = itemData.getProperties();
      String id = getItemId(itemData, props);

      // Sometimes get empty entities coming from Siebel
      // hence we need to check if the id is null
      if (id != null) {
        // only append the id if action code not DELETE
        if (itemData.getActionCode().equalsIgnoreCase(MappingConstants.ACTION_DELETE)) {
          deletes.add(id);
        }
        else {
          if (itemIds.length() > 0) {
            itemIds.append(",");
          }
          itemIds.append(id);
        }
        addNestedItem(itemData);
      }
    }
    
    ItemData parentItem = getSiebelItem();
    if (parentItem.getActionCode().equalsIgnoreCase(MappingConstants.ACTION_REFERENCE)) {
      String additionalIds = getOtherExistingChildrenIds(itemIds.toString(), deletes);
      if (itemIds.length() > 0 && additionalIds.length() > 0) {
        itemIds.append(",");
        itemIds.append(additionalIds);        
      }
      else if (additionalIds.length() > 0) {
        itemIds.append(additionalIds);        
      }
    }
        
    // either delete all existing item links or check them against the ones
    // being imported
    checkExistingItemLinks(itemIds.toString());
    return itemIds.toString();
  }

  /*
   * This convenience method will retrieve or generate the id for an entity.
   */
  private String getItemId(ItemData itemData, Map<String, Object> props) throws MappingException {
    String id = null;

    // If a Siebel Id exists then simply retrieve this
    if (getSiebelIdExistsForChildren()) {
      id = (String) props.get(getSiebelChildItemId());
    } 
    // If Siebel Id's don't exist for children and we are not deleting existing
    // links then try and retrieve an existing ATG id for the child
    else {
      id = getExistingATGId(itemData);
      // If we couldn't find an existing ATG id then generate one
      if (id == null) {
        id = generateId();
      }
      // if we retrieved an existing ATG id or we generated a new id we also
      // need to put it into the ItemData to be mapped to the ATG repository
      props.put(getSiebelChildItemId(), id);
    }
    return id;
  }

  /*
   * Some Siebel entities don't have Id's (For example AttributeLOVValue,
   * RelatedProduct) and ATG repository requires them to have an 'id'. For these
   * entities we may want to generate a new Id. (in some cases we want to check
   * if the item exists in ATG already and have the entity retain their ATG
   * 'id', see the checkIfItemExists() method)
   */
  private String generateId() throws MappingException {

    String id = null;
    try {
      id = getMappingService().getIdGenerator().generateStringId(getIdSpaceName());
    } catch (IdGeneratorException e) {
      String[] messageArguments = {getSiebelItemType(), e.getMessage()};
      String message = formatMappingErrorMessage(INVALID_PARSED_CHILD_ITEM_TYPE, messageArguments);
      vlogError(message);
      
      String itemId = getSiebelItemId();
      getMappingService().processMappingError(
          getSiebelItem().getExportItemId(), message, itemId, getSiebelItemType(), null, null);
    }
    return id;
  }

  
  /**
   * 
   */
  protected String isValidItem(ItemData itemData) {
    return "";
  }
  
  
  
  private String getOtherExistingChildrenIds(String pItemIds, List<String> pDeletes)
      throws MappingException {
    
    Object obj = getCurrentATGPropertyValue();
    StringBuilder otherIds = new StringBuilder();
    
    if (obj == null) {
      return "";
    }
    
    if (obj instanceof Collection<?>) {  
      @SuppressWarnings("unchecked")
      Collection<RepositoryItem> existingChildren = (Collection<RepositoryItem>) obj;

      for (RepositoryItem child : existingChildren) {
        if (!pItemIds.contains(child.getRepositoryId()) && 
            !pDeletes.contains(child.getRepositoryId())  ) {
          if (otherIds.length() > 0) {
            otherIds.append(",");
          }

          otherIds.append(child.getRepositoryId());
        }
      }
    }
    return otherIds.toString();
  }
  
  /**
   * When adding the nested item we sometimes need to make alterations to the
   * ItemData, for example we might need to add more data to ItemData, therefore
   * this method can be overridden in sub-classes.
   * 
   * @param itemData the nested item to add
   */
  protected void addNestedItem(ItemData itemData) throws MappingException {
    if (isFullItemMode()) {
      mMappingService.addNestedItem(itemData);
    }
  }

  /**
   * For Siebel entities where an id doesn't exist we may want to check whether
   * the entity already exists in the ATG repository. It can vary between
   * different Siebel entities how we determine whether it exists in ATG
   * repository so this method should be overridden in sub-classes. The method
   * should return the ATG id of the item or null if the item doesn't exist.
   *
   * @param itemData the item to check for an existing atg id
   * @return the existing atg id 
   */
  protected String getExistingATGId(ItemData itemData) throws MappingException {
    return null;
  }

  /**
   * This method is intended to be implemented in sub-classes. The purpose is that 
   * because we will not be notified of existing links have been deleted this method
   * should check the existing links against new ones from an import. Any items which
   * were linked to but no longer are in the new import should be deleted. 
   *
   * The reason this isn't simply implemented in this class is there are some cases 
   * where we want to keep the existing links and other cases where we want to remove
   * the existing links. For example a product may be removed from a category but we 
   * don't want to delete the product, however an Object Decoration may be removed from
   * a configurable product and we need to remove this from ATG.
   * 
   * @param itemIds the new item id's to against existing item id's 
   */
  protected void checkExistingItemLinks(String itemIds) throws MappingException {
    return;
  }

}
