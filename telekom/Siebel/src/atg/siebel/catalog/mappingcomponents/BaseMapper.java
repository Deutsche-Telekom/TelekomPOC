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

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Map;

import atg.core.util.ResourceUtils;
import atg.nucleus.GenericService;
import atg.repository.Repository;
import atg.repository.RepositoryException;
import atg.repository.RepositoryItem;
import atg.service.idgen.IdGeneratorException;
import atg.siebel.catalog.importer.ImportConstants;
import atg.siebel.catalog.mapper.ATGData;
import atg.siebel.catalog.mapper.CustomMappingComponent;
import atg.siebel.catalog.mapper.ItemData;
import atg.siebel.catalog.mapper.MappingConstants;
import atg.siebel.catalog.mapper.MappingException;
import atg.siebel.catalog.mapper.SiebelCatalogMappingService;

/**
 * BaseMapper abstracts functionality that many of the custom mapping components
 * require.
 * 
 * @author dreiman
 */
public abstract class BaseMapper extends GenericService implements CustomMappingComponent {

  //-------------------------------------
  /** Class version string */

  public static String CLASS_VERSION = "$Id: //product/Siebel/version/11.2/src/atg/siebel/catalog/mappingcomponents/BaseMapper.java#2 $$Change: 1194813 $";


  protected static final String INVALID_PROPERTY_TYPE = 
      ResourceUtils.getMsgResource(ImportConstants.REPOSITORY_PROPERTY_INVALID_TYPE,
          SiebelCatalogMappingService.MY_RESOURCE_NAME, 
          SiebelCatalogMappingService.sResourceBundle);
  
  protected static final String INVALID_PARSED_CHILD_ITEM_TYPE = 
      ResourceUtils.getMsgResource(ImportConstants.INVALID_PARSED_CHILD_ITEM_TYPE,
          SiebelCatalogMappingService.MY_RESOURCE_NAME, 
          SiebelCatalogMappingService.sResourceBundle);
  
  // -----------------------------
  // property: siebelCatalogMappingService
  // -----------------------------
  protected SiebelCatalogMappingService mMappingService;

  public SiebelCatalogMappingService getMappingService() {
    return mMappingService;
  }

  public void setMappingService(SiebelCatalogMappingService pMappingService) {
    mMappingService = pMappingService;
  }

  // -----------------------------
  // property: fullItemMode
  //
  // This determines whether the item needs to be put back onto the stack to be
  // mapped. Full Item Mode means that an item is totally
  // defined under its parent.
  //
  // In the Siebel export XML when there is a parent-child relationship between
  // 2 entities the child entity can be defined totally
  // within the parent or simply linked using the Id of the child. For example
  // Categories under Catalogs are totally defined in the Catalog,
  // Products under Categories however are simple linked using Id and the
  // Product is defined elsewhere. In these examples the Categories
  // need to be put back onto the stack to be mapped but the Products under
  // Categories do not.
  // -----------------------------
  private boolean mFullItemMode = false;

  public boolean isFullItemMode() {
    return mFullItemMode;
  }

  public void setFullItemMode(boolean pFullItemMode) {
    mFullItemMode = pFullItemMode;
  }

  // -----------------------------
  // property: siebelChildItemId
  
  // TODO: change this to siebelChildItemIdField since
  // it is not the id it is the name of the id field
  // -----------------------------
  private String mSiebelChildItemId;

  public String getSiebelChildItemId() {
    return mSiebelChildItemId;
  }

  public void setSiebelChildItemId(String pSiebelChildItemId) {
    mSiebelChildItemId = pSiebelChildItemId;
  }

  // -----------------------------
  // property: siebelParentItemId

  // TODO: change this to siebelParentItemIdField since
  // it is not the id it is the name of the id field
  // -----------------------------
  private String mSiebelParentItemId;

  public String getSiebelParentItemId() {
    return mSiebelParentItemId;
  }

  public void setSiebelParentItemId(String pSiebelParentItemId) {
    mSiebelParentItemId = pSiebelParentItemId;
  }

  // -----------------------------
  // property: idSpaceName
  // -----------------------------
  private String mIdSpaceName = "";

  public String getIdSpaceName() {
    return mIdSpaceName;
  }

  public void setIdSpaceName(String pIdSpaceName) {
    mIdSpaceName = pIdSpaceName;
  }

  protected Object mSiebelFields;

  protected Map<String, Object> mAttributes;

  private String mParentFolder = null;

  private Repository mProductCatalogRepository;
  
  private Repository mPriceListRepository;
  
  public abstract Object mapSiebelToATG(Object pSiebelFields, Map<String, Object> pAttributes)
      throws MappingException ;

  /*
   * Convenience method to retrieve the Siebel value from the Attributes Map
   */
  protected Object getSiebelValue() throws MappingException {
    return getSiebelValue(mSiebelFields);
  }

  /*
   * Convenience method to retrieve a Siebel value from the Attributes Map
   */
  protected Object getSiebelValue(Object pSiebelField) throws MappingException {

    if (!(pSiebelField instanceof String)) {
      String[] messageArguments = { getSiebelItem().getName(), "pSiebelField", "String" };
      String message = formatMappingErrorMessage(INVALID_PARSED_CHILD_ITEM_TYPE,
          messageArguments);
      vlogError(message);
      
      String itemId = (String) getSiebelItem().getProperties().get(getSiebelParentItemId());
      getMappingService().processMappingError(
          getSiebelItem().getExportItemId(), message, itemId, 
          getSiebelItemType(), null, null);
      return null;
    }

    Map<String, Object> properties = getSiebelProperties();

    Object propertyValue = properties.get(pSiebelField);
    if (propertyValue == null) {
      return null;
    }

    return propertyValue;
  }

  /*
   * Convenience method to retrieve multiple Siebel values from the Attributes
   * Map
   */
  protected Object[] getSiebelValues(int noOfExpectedFields) throws MappingException  {

    if (!(mSiebelFields instanceof String)) {
      String[] messageArguments = { getSiebelItem().getName(), "mSiebelFields", "String" };
      String message = formatMappingErrorMessage(INVALID_PARSED_CHILD_ITEM_TYPE,
          messageArguments);
      vlogError(message);
      
      String itemId = (String) getSiebelItem().getProperties().get(getSiebelParentItemId());
      getMappingService().processMappingError(
          getSiebelItem().getExportItemId(), message, 
          getSiebelItemId(), itemId, null, null);
      return null;
    }

    String[] parts = ((String) mSiebelFields).split(",");
    if (parts.length != noOfExpectedFields) {
      String[] messageArguments = {"parts.length != noOfExpectedFields"};
      String message = formatMappingErrorMessage(messageArguments);
      vlogError(message);
      
      String itemId = (String) getSiebelItem().getProperties().get(getSiebelParentItemId());
      getMappingService().processMappingError(
          null, message, itemId, getSiebelItemType(), null, null);
      return null;
    }

    Map<String, Object> properties = getSiebelProperties();
    ArrayList<Object> propertyValues = new ArrayList<Object>();

    for (int i = 0; i < parts.length; i++) {
      Object propertyValue = properties.get(parts[i]);
      propertyValues.add(propertyValue);
    }

    return propertyValues.toArray();
  }

  /*
   * Convenience method to retrieve a Siebel ItemData object from the Attributes
   * Map
   */
  protected ItemData getSiebelItem() throws MappingException {
    Object rawObject = mAttributes.get(ImportConstants.SIEBEL_ITEM);
    if (!(rawObject instanceof ItemData)) {
      String[] messageArguments = { "rawObject is not an ItemData" };
      String message = formatMappingErrorMessage(messageArguments);
      vlogError(message);
      
      getMappingService().processMappingError(
          getSiebelItem().getExportItemId(), message, null, 
          this.getClass().getSimpleName(), null, null);
      return null;
    }
    return (ItemData) rawObject;
  }

  /*
   * Convenience method to retrieve the Siebel properties from the Attributes
   * Map
   */
  protected Map<String, Object> getSiebelProperties() throws MappingException {

    ItemData siebelItem = getSiebelItem();
    Map<String, Object> properties = siebelItem.getProperties();
    if (properties == null) {
      String[] messageArguments = {"properties == null", this.getClass().getSimpleName()};
      String message = formatMappingErrorMessage(messageArguments);
      vlogError(message);
      getMappingService().processMappingError(
          getSiebelItem().getExportItemId(), message, getSiebelItemId(), 
          getSiebelItemType(), null, null);
      return null;
    }

    return properties;
  }

  /*
   * 
   * 
   * 
   */
  protected Object getCurrentATGPropertyValue() throws MappingException {
    // get the id of the repository item
    String id = (String) getSiebelValue(getSiebelParentItemId());

    // get the repository item of the parent
    String itemDescriptor = (String) mAttributes.get(ImportConstants.ATG_ITEM_DESRIPTOR_NAME);
    String atgPropertyName = (String) mAttributes.get(ImportConstants.ATG_PROPERTY_NAME);
    String atgRepositoryName = (String) mAttributes.get(ImportConstants.ATG_REPOSITORY_NAME);
    if (id == null) {
      return null;
    }
    Repository targetRepository = getMappingService().getTargetRepository(atgRepositoryName);
    RepositoryItem repoItem = null;
    try {
      repoItem = targetRepository.getItem(id, itemDescriptor);
    } catch (RepositoryException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }

    // Now get the current property value
    Object currentATGPropertyValue = null;
    if (repoItem != null) {
      try {
        currentATGPropertyValue = repoItem.getPropertyValue(atgPropertyName);
      } catch (IllegalArgumentException iae) {
        String[] messageArguments = {iae.getMessage(), this.getClass().getSimpleName()};
        String message = formatMappingErrorMessage(messageArguments);
        vlogError(message);
        getMappingService().processMappingError(
            getSiebelItem().getExportItemId(), message, id, getSiebelItemType(), null, null);
      }
    }

    return currentATGPropertyValue;
  }

  /*
   * 
   * 
   * 
   */
  protected String getParentFolder() {
    boolean generateNewFolder = false;
    Repository productRepository = getProductCatalogRepository();
    // Has a parent folder been previously generated
    if (mParentFolder == null) {
      generateNewFolder = true;
    }
    // Was its import to repository successful
    else {
      RepositoryItem folder = null;
      try {
        folder = productRepository.getItem(mParentFolder, ImportConstants.M_ITEM_FOLDER);
        generateNewFolder = ((folder == null) ? true : false);
      } catch (RepositoryException e) {
        // TODO re package this exception as a MappingException and throw it back up
        e.printStackTrace();
      }
    }
    // Need to create a new parent folder 
    if (generateNewFolder) {
      ATGData folder = new ATGData(ImportConstants.M_ITEM_FOLDER, productRepository);
      try {
        mParentFolder = getMappingService().getIdGenerator().generateStringId("folder");
      } catch (IdGeneratorException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }
      folder.addProperty(ImportConstants.M_ITEM_ATG_ID, mParentFolder);
      folder.addProperty("path", getMappingService().getMediaFileLocation());
      folder.addProperty("name", "Media File Location For Siebel Import");
      getMappingService().addGeneratedItem(folder);      
    }
    return mParentFolder;
  }

  protected void logDebugMessage(String pMessage) {
    if (mMappingService.isLoggingDebug()) {
      mMappingService.logDebug(pMessage);
    }
  }
  
  
  /**
   * @return
   */
  protected String getSiebelItemId() {
    ItemData item = null;
    try {
      item = getSiebelItem();
    } catch (MappingException e) {
      logError(e);
    }
    if (item != null) {
      Object rawItem = item.getProperties().get("Id");
      if (rawItem instanceof String) {
        return (String) rawItem;
      }        
    } 
    return null;
  }
  
  
  /**
   * @return
   */
  protected String getSiebelItemType() {
    ItemData item = null;
    try {
      item = getSiebelItem();
    } catch (MappingException e) {
      logError(e);
    }
    if (item != null) {
      return item.getName();    
    } 
    return null;
  }
  
  
  /**
   * @param pFormatString
   * @param pFormatArguments
   * @return
   */
  protected String formatMappingErrorMessage(String pFormatString,
      String[] pFormatArguments) {
    
    MessageFormat formatter = new MessageFormat(pFormatString);
    String[] messageArguments = pFormatArguments;
    String partMessage = formatter.format(messageArguments);
    messageArguments = new String[2];
    messageArguments[0] = partMessage;
    messageArguments[1] = this.getClass().getSimpleName();
    return formatMappingErrorMessage(messageArguments);
  }
  
  /**
   * @param pFormatArguments
   * @return
   */
  protected String formatMappingErrorMessage(String[] pFormatArguments) {
    String message = ResourceUtils.getMsgResource(ImportConstants.GENERAL_MAPPING_ERROR,
        SiebelCatalogMappingService.MY_RESOURCE_NAME,
        SiebelCatalogMappingService.sResourceBundle, pFormatArguments);
    return message;
  }

  /*
   * This will possibly need changed to support versioned datasource
   */
  protected Repository getProductCatalogRepository() {

    if (mProductCatalogRepository != null) {
      return mProductCatalogRepository;
    }
    // see if Product catalog repository has already been created
    mProductCatalogRepository = getMappingService().
        getTargetRepository(MappingConstants.REPOSITORY_PRODUCT_CATALOG);
    return mProductCatalogRepository;
  }
  
   /*
   * This will possibly need changed to support versioned datasource
   */

  protected Repository getPriceListRepository() {
        
    if (mPriceListRepository != null) {
      return mPriceListRepository;
    }
    mPriceListRepository = getMappingService().
        getTargetRepository(MappingConstants.REPOSITORY_PRICE_LIST);
    return mPriceListRepository;
  }
  
  
}
