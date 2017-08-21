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
import java.util.Map;

import atg.repository.Repository;
import atg.repository.RepositoryException;
import atg.repository.RepositoryItem;
import atg.siebel.catalog.importer.ImportConstants;
import atg.siebel.catalog.mapper.ATGData;
import atg.siebel.catalog.mapper.ItemData;
import atg.siebel.catalog.mapper.MappingConstants;
import atg.siebel.catalog.mapper.MappingException;

public class CatalogMapper extends BaseMapper {

  //-------------------------------------
  /** Class version string */

  public static String CLASS_VERSION = "$Id: //product/Siebel/version/11.2/src/atg/siebel/catalog/mappingcomponents/CatalogMapper.java#2 $$Change: 1194813 $";


  private static final String ROOT_CATEGORIES = "rootCategories";
  
  private static final String FIXED_CHILD_CATEGORIES = "fixedChildCategories";
  
  @Override
  public Object mapSiebelToATG(Object pSiebelFields, 
      Map<String, Object> pAttributes) throws MappingException {
    mSiebelFields = pSiebelFields;
    mAttributes = pAttributes;

    String catalogId = (String) getSiebelValue();
    
    ItemData catalog = getSiebelItem();

    // check if we are deleting this catalog, if so delete its categories 
    if (catalog.getActionCode().equalsIgnoreCase(MappingConstants.ACTION_DELETE)) {
      deleteCategories(catalogId, catalog);
    }
    
    return catalogId;

  }

  
  private void deleteCategories(String pCatalogId, ItemData pCatalog) {
    String exportItemId = pCatalog.getExportItemId();
    
    // get the catalog repository item
    Repository repository = getMappingService().getTargetRepository(
        MappingConstants.REPOSITORY_PRODUCT_CATALOG);
    RepositoryItem catalog = null;
    try {
      catalog = repository.getItem(pCatalogId, 
          ImportConstants.M_ITEM_CATALOG);
    } catch (RepositoryException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    
    if (catalog == null) {
      return;
    }
    
    // get the root categories
    @SuppressWarnings("unchecked")
    Collection<RepositoryItem> categories = (Collection<RepositoryItem>) 
        catalog.getPropertyValue(ROOT_CATEGORIES);
    
    if (categories == null || categories.isEmpty()) {
      return;
    }
    
    // create delete's for all root categories
    for (RepositoryItem category : categories) {
      
      deleteSubCategories(category, exportItemId, repository);
      
      ATGData deleteCategory = new ATGData(ImportConstants.M_ITEM_CATEGORY,
          repository, MappingConstants.ACTION_DELETE, exportItemId);
      deleteCategory.addProperty(MappingConstants.ATG_ID, 
          category.getRepositoryId());
      getMappingService().addGeneratedItem(deleteCategory);
    }    
    
  }
  
  /*
   * Need to recurse through all the sub categories and delete them as well.
   * 
   * Don't need to delete the category products because the repository
   * property for them is set as cascade delete so when the categories are
   * deleted the category products will be automatically deleted. We dont 
   * want to delete the child products of the categories. 
   * 
   */
  private void deleteSubCategories(RepositoryItem pCategory, 
      String pExportItemId, Repository repository) {
    
    // get child categories
    @SuppressWarnings("unchecked")
    Collection<RepositoryItem> categories = (Collection<RepositoryItem>) 
        pCategory.getPropertyValue(FIXED_CHILD_CATEGORIES);
    
    if (categories == null || categories.isEmpty()) {
      return;
    }
        
    // create delete's for all sub categories
    for (RepositoryItem category : categories) {
      
      deleteSubCategories(category, pExportItemId, repository);
      
      ATGData deleteCategory = new ATGData(ImportConstants.M_ITEM_CATEGORY,
          repository, MappingConstants.ACTION_DELETE, pExportItemId);
      deleteCategory.addProperty(MappingConstants.ATG_ID, 
          category.getRepositoryId());
      getMappingService().addGeneratedItem(deleteCategory);
    }        
  }
  
  
}
