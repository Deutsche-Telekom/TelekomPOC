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
import java.util.List;
import java.util.Map;

import atg.nucleus.ServiceException;
import atg.repository.Query;
import atg.repository.QueryBuilder;
import atg.repository.QueryExpression;
import atg.repository.Repository;
import atg.repository.RepositoryException;
import atg.repository.RepositoryItem;
import atg.repository.RepositoryItemDescriptor;
import atg.repository.RepositoryView;
import atg.siebel.catalog.mapper.ATGData;
import atg.siebel.catalog.mapper.ItemData;
import atg.siebel.catalog.mapper.ItemState;
import atg.siebel.catalog.mapper.MappingConstants;
import atg.siebel.catalog.mapper.MappingEventListener;
import atg.siebel.catalog.mapper.MappingException;

/**
 * 
 * @author dreiman
 *
 */
public class PriceListFolderMapper extends BaseMapper implements MappingEventListener {

  //-------------------------------------
  /** Class version string */

  public static String CLASS_VERSION = "$Id: //product/Siebel/version/11.2/src/atg/siebel/catalog/mappingcomponents/PriceListFolderMapper.java#2 $$Change: 1194813 $";


  private List<String> mPriceListIds = null;
  
  
  @Override
  public Object mapSiebelToATG(Object pSiebelFields, Map<String, Object> pAttributes) throws MappingException {
    mSiebelFields = pSiebelFields;
    mAttributes = pAttributes;

    String priceListId = (String) getSiebelValue();
    
    ItemData siebelPriceList = getSiebelItem();
    // only want to add the price list if action code not delete    
    if (siebelPriceList.getActionCode().equalsIgnoreCase(MappingConstants.ACTION_DELETE)) {
      deletePriceListItems(priceListId, siebelPriceList);
      return priceListId;
    }
    
    if (mPriceListIds == null) {
      mPriceListIds = new ArrayList<String>();
      getMappingService().addEventListener(this);
    }
    mPriceListIds.add(priceListId);      
    return priceListId;
  }

  /*
   * When a price list is deleted we need to delete all the child price's.
   * 
   * Normally this would be a simple case of setting cascade="delete" in the
   * repository definition for the child property and no need for special 
   * code to handle the children, however the parent-child 
   * relationship is defined slightly differently in the repository for 
   * priceLists and price's. Because a priceList could have a huge number of
   * price's the priceList doesn't have a property pointing to child price's
   * (for performance reasons) rather price's have a property pointing to
   * their parent PriceList. This means if a priceList is deleted with 
   * price's pointed at it there are RepositoryException's. Therefore need
   * to ensure that all the price's are deleted before the priceList.
   * 
   */
  private void deletePriceListItems(String pPriceListId, ItemData pSiebelPriceList) {
    String exportItemId = pSiebelPriceList.getExportItemId();
    
    // get price list repository
    Repository repository = getMappingService().getTargetRepository(
        MappingConstants.REPOSITORY_PRICE_LIST);
    
    // get all prices that have pricelist = pPriceListId
    RepositoryItemDescriptor itemDescriptor;
    RepositoryItem[] result = null;
    try {
      itemDescriptor =
        repository.getItemDescriptor("price");
      RepositoryView view = repository.getView(itemDescriptor);
      QueryBuilder queryBuilder = view.getQueryBuilder();
      QueryExpression priceListPropertyExp =
        queryBuilder.createPropertyQueryExpression("priceList");
      QueryExpression priceListConstantExp =
        queryBuilder.createConstantQueryExpression(pPriceListId);
      Query priceListEquals =
        queryBuilder.createComparisonQuery(priceListPropertyExp,
            priceListConstantExp, QueryBuilder.EQUALS);

      result = view.executeQuery(priceListEquals);

    } catch (RepositoryException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }

    // create delete's for all prices
    for (RepositoryItem price : result) {
      ATGData deletePrice = new ATGData("price", repository, 
          MappingConstants.ACTION_DELETE, exportItemId);
      deletePrice.addProperty(MappingConstants.ATG_ID, 
          price.getRepositoryId());
      getMappingService().addGeneratedItem(deletePrice);
    }    
  }

  /*
   * Once the top level items have been processed create a price list
   * folder and add all the processed price lists to that folder. (or get
   * the existing folder and add the new price lists to it)
   * 
   * (non-Javadoc)
   * @see atg.siebel.catalog.mapper.MappingEventListener#topLevelItemsProcessed()
   */
  @Override
  public void topLevelItemsProcessed() {
    if (mPriceListIds == null || mPriceListIds.isEmpty()) {
      return;
    }
    
    // define a price list folder id and name that we always use
    final String PRICELIST_FOLDER_ID = "SIEBEL_PR_LST_FOLDER";
    final String PRICELIST_FOLDER_NAME = "Siebel Price List Folder";
    
    // get price list folder from repository
    Repository priceListRepository = getMappingService().
        getTargetRepository(MappingConstants.REPOSITORY_PRICE_LIST);
    RepositoryItem folder = null;
    try {
      folder = priceListRepository.getItem(PRICELIST_FOLDER_ID, "priceListFolder");
      
    } catch (RepositoryException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    
    ATGData priceListFolder = null;
    // No Folder exists yet so lets create a new one
    if (folder == null) {
      priceListFolder = new ATGData("priceListFolder", priceListRepository, ItemState.NEW);
      priceListFolder.addProperty("id", PRICELIST_FOLDER_ID);
      priceListFolder.addProperty("name", PRICELIST_FOLDER_NAME);
      StringBuilder priceLists = new StringBuilder();
      for (String priceList : mPriceListIds) {
        if (priceLists.length() > 0) {
          priceLists.append(',');
        }
        priceLists.append(priceList);
      }
      priceListFolder.addProperty("childItems", priceLists.toString());
    }
    // a Folder already exists so we want to merge the new price lists into
    // the price list folder
    else {
      priceListFolder = new ATGData("priceListFolder", priceListRepository, ItemState.CHANGED);
      priceListFolder.addProperty("id", PRICELIST_FOLDER_ID);
      priceListFolder.addProperty("name", PRICELIST_FOLDER_NAME);
      
      // get price lists already in the folder 
      Object obj = folder.getPropertyValue("childItems");
      if (! (obj instanceof List<?>)) {
        // TODO call the job manager with an error
      }
      
      StringBuilder priceLists = new StringBuilder();
      @SuppressWarnings("unchecked")
      List<RepositoryItem> existingPriceLists = (List<RepositoryItem>) obj;
      // add the existing price lists 
      for (RepositoryItem existingPriceList : existingPriceLists) {
        if (priceLists.length() > 0) {
          priceLists.append(',');
        }
        priceLists.append(existingPriceList.getRepositoryId());
      }
      // add the new price lists after checking they aren't already present
      for (String priceList : mPriceListIds) {
        if (priceLists.indexOf(priceList) < 0) {
          if (priceLists.length() > 0) {
            priceLists.append(',');
          }
          priceLists.append(priceList);
        }
      }
      priceListFolder.addProperty("childItems", priceLists.toString());
      
    }
    getMappingService().addGeneratedItem(priceListFolder);
    
    mPriceListIds = null;
  }
  
  @Override
  public void doStopService() throws ServiceException {
    getMappingService().removeEventListener(this);
  }
  
}
