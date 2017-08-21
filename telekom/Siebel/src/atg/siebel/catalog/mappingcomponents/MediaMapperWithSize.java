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

import atg.core.util.StringUtils;
import atg.repository.Repository;
import atg.repository.RepositoryException;
import atg.repository.RepositoryItem;
import atg.service.idgen.IdGeneratorException;
import atg.siebel.catalog.importer.ImportConstants;
import atg.siebel.catalog.mapper.ATGData;
import atg.siebel.catalog.mapper.ItemState;
import atg.siebel.catalog.mapper.MappingException;

public class MediaMapperWithSize extends BaseMapper {

  //-------------------------------------
  /** Class version string */

  public static String CLASS_VERSION = "$Id: //product/Siebel/version/11.2/src/atg/siebel/catalog/mappingcomponents/MediaMapperWithSize.java#2 $$Change: 1194813 $";


  private static final String ID_SPACE_NAME = "media";
  private static final String ID_PROPERTY_NAME = "id";
  private static final String NAME_PROPERTY_NAME = "name";
  private static final String URL_PROPERTY_NAME = "url";
  private static final String MEDIA_SIZE_PROPERTY_NAME = "mediaSize";
  private static final String PARENT_FOLDER_PROPERTY_NAME = "parentFolder";
  private static final String PATH_PROPERTY_NAME = "path";

  private static final int EXPECTED_FIELDS = 3;

  @Override
  public Object mapSiebelToATG(Object pSiebelFields, Map<String, Object> pAttributes) 
      throws MappingException {
    mSiebelFields = pSiebelFields;
    mAttributes = pAttributes;

    Object[] siebelValues = getSiebelValues(EXPECTED_FIELDS);

    String extension = (String) siebelValues[0];
    String filename = (String) siebelValues[1];
    String size = (String) siebelValues[2];

    if (StringUtils.isEmpty(filename) || StringUtils.isEmpty(extension)) {
      return null;
    }

    String mediaLocation = filename + "." + extension;

    String id = checkExistingMedia(mediaLocation, Integer.valueOf(size));
    
    if (id != null) {
      return id;
    }
    
    try {
      id = mMappingService.getIdGenerator().generateStringId(ID_SPACE_NAME);
    } catch (IdGeneratorException e) {
      String[] messageArguments = {e.getLocalizedMessage(), this.getClass().getSimpleName()};
      String message = formatMappingErrorMessage(messageArguments);
      vlogError(message);
      
      String itemId = getSiebelItemId();
      getMappingService().processMappingError(
          getSiebelItem().getExportItemId(), message, itemId, 
          getSiebelItemType(), null, null);
      return null;
    }

    //String atgRepositoryName = (String) mAttributes.get(ImportConstants.ATG_REPOSITORY_NAME);
    //Repository targetRepository = mMappingService.getTargetRepository(atgRepositoryName);
    
    ATGData newMediaItem = new ATGData(ImportConstants.M_ITEM_MEDIA_EXTERNAL, getProductCatalogRepository());
    newMediaItem.addProperty(ImportConstants.M_ITEM_ATG_ID, id);
    newMediaItem.addProperty(NAME_PROPERTY_NAME, mediaLocation);
    newMediaItem.addProperty(URL_PROPERTY_NAME, mediaLocation);
    newMediaItem.addProperty(MEDIA_SIZE_PROPERTY_NAME, size);
    newMediaItem.addProperty(PARENT_FOLDER_PROPERTY_NAME, getParentFolder());
    newMediaItem.addProperty(PATH_PROPERTY_NAME, getMappingService().getMediaFileLocation());
    mMappingService.addGeneratedItem(newMediaItem);

    return id;
  }

  /*
   * Convenience method to check for an existing media item. If one exists check whether
   * it is the same as the one being imported, if so return the existing id, otherwise 
   * delete the existing media item (to make sure it doesn't get orphaned in the database
   * when the new media item is created and linked).
   */
  private String checkExistingMedia(String pMediaLocation, Integer pSize) 
      throws MappingException {
    Object existingMediaObj = getCurrentATGPropertyValue();
    if (existingMediaObj == null) {
      return null;
    }
    
    if (!(existingMediaObj instanceof RepositoryItem)) {
      String[] messageArguments = { "existingMediaObj", "RepositoryItem" };
      String message = formatMappingErrorMessage(INVALID_PROPERTY_TYPE, messageArguments);
      vlogError(message);
      
      String itemId = (String) getSiebelItem().getProperties().get(getSiebelParentItemId());
      getMappingService().processMappingError(
          getSiebelItem().getExportItemId(), message, itemId, getSiebelItemType(), null, null);
      return null;
    }
    

    RepositoryItem existingMedia = (RepositoryItem) existingMediaObj;
    String urlOfExisting = (String) existingMedia.getPropertyValue(URL_PROPERTY_NAME);
    Integer sizeOfExisting = (Integer) existingMedia.getPropertyValue(MEDIA_SIZE_PROPERTY_NAME);
    
    if (urlOfExisting.equalsIgnoreCase(pMediaLocation) && sizeOfExisting.equals(pSize)) {
      return existingMedia.getRepositoryId();
    }

    String mediaItemDescriptor = null;
    try {
      mediaItemDescriptor = existingMedia.getItemDescriptor().getItemDescriptorName();
    } catch (RepositoryException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }

    String atgRepositoryName = (String) mAttributes.get(ImportConstants.ATG_REPOSITORY_NAME);
    Repository targetRepository = mMappingService.getTargetRepository(atgRepositoryName);
    
    ATGData deleteItem = new ATGData(mediaItemDescriptor, targetRepository, ItemState.DELETED);
    deleteItem.addProperty(ImportConstants.M_ITEM_ATG_ID, existingMedia.getRepositoryId());
    getMappingService().addGeneratedItem(deleteItem);      
    return null;
  }
  
  
}
