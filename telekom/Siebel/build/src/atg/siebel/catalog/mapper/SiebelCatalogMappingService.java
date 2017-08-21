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

package atg.siebel.catalog.mapper;

import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

import javax.sql.DataSource;
import javax.xml.bind.JAXBException;

import org.xml.sax.SAXException;

import atg.adapter.gsa.GSARepository;
import atg.core.i18n.LayeredResourceBundle;
import atg.core.util.ResourceUtils;
import atg.core.util.StringUtils;
import atg.nucleus.GenericService;
import atg.nucleus.Nucleus;
import atg.nucleus.ServiceException;
import atg.repository.Repository;
import atg.service.idgen.IdGenerator;
import atg.service.jdbc.SwitchingDataSource;
import atg.siebel.catalog.importer.ImportConstants;
import atg.siebel.catalog.importer.ImportError;
import atg.siebel.catalog.importer.ImportErrorEnum;
import atg.siebel.catalog.importer.ImportException;
import atg.siebel.catalog.job.ImportJobEnums.ErrorType;
import atg.siebel.catalog.job.ImportJobEnums.ProcessingPhase;
import atg.siebel.catalog.job.ImportJobError.JobErrorBuilder;
import atg.siebel.catalog.job.ImportJobManager;
import atg.siebel.catalog.mappingfilebindings.EntityMapping;
import atg.siebel.catalog.mappingfilebindings.FieldMapping;
import atg.siebel.catalog.mappingfilebindings.SiebelAtgMappings;

/**
 * @version $Id:
 *          //product/Siebel/main/src/atg/siebel/integration/catalog/mapper/
 *          SiebelCatalogMappingService.java#9 $$Change: 1194813 $
 * @updated $DateTime: 2015/09/10 08:26:24 $$Author: saysyed $
 * 
 */
public class SiebelCatalogMappingService
  extends GenericService
  implements SiebelMappingService {

  //-------------------------------------
  /** Class version string */

  public static String CLASS_VERSION = "$Id: //product/Siebel/version/11.2/src/atg/siebel/catalog/mapper/SiebelCatalogMappingService.java#2 $$Change: 1194813 $";


  public static final String MY_RESOURCE_NAME =
    "atg.siebel.catalog.importer.ImportResources";

  public static java.util.ResourceBundle sResourceBundle =
    LayeredResourceBundle.getBundle(MY_RESOURCE_NAME,
      atg.service.dynamo.LangLicense.getLicensedDefault());

  // -------------------------------------
  // Properties
  // -------------------------------------

  // -----------------------------
  // property: siebelXmlTools
  // -----------------------------
  private SiebelXmlTools mSiebelXmlTools;

  public SiebelXmlTools getSiebelXmlTools() {
    return mSiebelXmlTools;
  }

  public void setSiebelXmlTools(SiebelXmlTools pSiebelXmlTools) {
    mSiebelXmlTools = pSiebelXmlTools;
  }

  // -----------------------------
  // property: idGenerator
  // -----------------------------
  private IdGenerator mIdGenerator;

  public IdGenerator getIdGenerator() {
    return mIdGenerator;
  }

  public void setIdGenerator(IdGenerator pIdGenerator) {
    mIdGenerator = pIdGenerator;
  }

  // -----------------------------
  // property: siebelFileLocation
  // -----------------------------
  private String mSiebelFileLocation;

  /**
   * @return File object representing the Siebel file to import.
   */
  public String getSiebelFileLocation() {
    return mSiebelFileLocation;
  }

  /**
   * {@inheritDoc}
   * 
   * @see atg.siebel.catalog.mapper.SiebelMappingService#setSiebelFileLocation(java.io.File)
   */
  public void setSiebelFileLocation(String pSiebelFileLocation) {
    mSiebelFileLocation = pSiebelFileLocation;
  }

  // -----------------------------
  // property: importFileLocation
  // -----------------------------
  private File mImportFileLocation;

  /**
   * @return File of the import file to use.
   */
  public File getImportFileLocation() {
    return mImportFileLocation;
  }

  /**
   * {@inheritDoc}
   * 
   * @see atg.siebel.catalog.mapper.SiebelMappingService#setImportFileLocation(java.io.File)
   */
  public void setImportFileLocation(File pImportFileLocation) {
    mImportFileLocation = pImportFileLocation;
  }

  // -----------------------------
  // property: mediaFileLocation
  // -----------------------------
  private File mMediaFileLocation;

  /**
   * @return File specifying the directory in which the media file exists.
   */
  public File getMediaFileLocation() {
    return mMediaFileLocation;
  }

  /**
   * @param mMediaFileLocation
   *          File specifying the directory in which the media file exists.
   */
  public void setMediaFileLocation(File mMediaFileLocation) {
    this.mMediaFileLocation = mMediaFileLocation;
  }

  // -----------------------------
  // property: exportJobId
  // -----------------------------
  String mExportJobId = null;

  public String getExportJobId() {
    return mExportJobId;
  }

  public void setExportJobId(String pExportJobId) {
    this.mExportJobId = pExportJobId;
  }

  // -----------------------------
  // property: jobManager
  // -----------------------------
  protected ImportJobManager mJobManager;

  public ImportJobManager getJobManager() {
    return mJobManager;
  }

  public void setJobManager(ImportJobManager pJobManager) {
    mJobManager = pJobManager;
  }

  // Target Repositories
  private Map<String, Repository> mTargetRepositories;

  public Repository getTargetRepository(String pTargetRepository) {

    return getTargetRepository(pTargetRepository, true);
  }

  public Repository getTargetRepository(String pTargetRepository,
    boolean createRepository) {
    boolean switchingDS = false;
    vlogDebug(
      "SiebelCatalogMappingservice.getTargetRepository: pTargetRepository = {0}",
      pTargetRepository);

    if (mTargetRepositories == null) {
      mTargetRepositories = new HashMap<String, Repository>();
    }

    if (!mTargetRepositories.containsKey(pTargetRepository) && createRepository) {
      Object obj = Nucleus.getGlobalNucleus().resolveName(pTargetRepository);
      if (obj instanceof GSARepository) {
        mTargetRepositories.put(pTargetRepository, (GSARepository) obj);
      } else {
        vlogError(
          "ImportService.getTargetRepository: Error creating repository: {0}. "
            + "object created ({1}) was not of type GSARepository",
          pTargetRepository, obj.toString());
        // TODO throw and exception here, the defined target repository cant be
        // created because ???
      }

    }
    return mTargetRepositories.get(pTargetRepository);
  }

  public Map<String, Repository> getTargetRepositories() {
    return mTargetRepositories;
  }
  
  /** property: affectedItemTypes */
  Map<String, Set<String>> mAffectedItemTypes = new Hashtable<String, Set<String>>();

  /**
   * A Map with a key of affected repository path to a Set value of affected
   * item types. The affected repositories stored in this map are unwrapped if
   * secured.
   */
  public void setAffectedItemTypes(Map<String, Set<String>> pAffectedItemTypes) {
    mAffectedItemTypes = pAffectedItemTypes;
  }

  /**
   * A Map with a key of affected repository path to a Set value of affected
   * item types. The affected repositories stored in this map are unwrapped if
   * secured.
   */
  public Map<String, Set<String>> getAffectedItemTypes() {
    return mAffectedItemTypes;
  }

  public void addAffectedItemType(String pRepository, String pItemType) {
    if (mAffectedItemTypes.containsKey(pRepository)) {
      Set<String> itemTypes = mAffectedItemTypes.get(pRepository);
      if (!itemTypes.contains(pItemType)) {
        itemTypes.add(pItemType);
      }
    } else {
      HashSet<String> itemTypes = new HashSet<String>();
      itemTypes.add(pItemType);
      mAffectedItemTypes.put(pRepository, itemTypes);
    }
  }

  public void removeAffectedItemTypes(String pRepository) {
    if (mAffectedItemTypes.containsKey(pRepository)) {
      mAffectedItemTypes.remove(pRepository);
    }
  }

  // Siebel -> ATG mappings
  private Map<String, Map<String, Map<String, String>>> mEntityMappings;

  // List of ATG Item's created by mapping components
  private List<ATGData> mGeneratedItems;

  public void addGeneratedItem(ATGData pItemData) {
    if (mGeneratedItems == null) {
      mGeneratedItems = new ArrayList<ATGData>();
    }
    mGeneratedItems.add(pItemData);
    addAffectedItemType(((GenericService) pItemData.getATGRepository()).getAbsoluteName(), 
        pItemData.getName());
  }

  // Stack holding Siebel ItemData's nested in and extracted from
  // top-level or other nested items
  private Stack<ItemData> mNestedItemsStack;

  // List holding Siebel ItemData's nested in and extracted from
  // top-level and other nested items. We have both a stack and a list
  // because the stack's contents change continually as nested items
  // are processed where as we need to keep track of all nested items
  // to make sure duplicates aren't added to stack to be processed.
  // This will likely not scale very well for large catalogs, possibly
  // need to implement a custom List for Nested items.
  private List<ItemData> mNestedItemsList;

  /**
   * @param pItemData
   */
  public void addNestedItem(ItemData pItemData) {

    if (mNestedItemsStack == null) {
      mNestedItemsStack = new Stack<ItemData>();
    }
    if (mNestedItemsList == null) {
      mNestedItemsList = new ArrayList<ItemData>();
    }

    if (!mNestedItemsList.contains(pItemData)) {
      mNestedItemsStack.push(pItemData);
      mNestedItemsList.add(pItemData);
    }
  }

  private List<ATGData> mMappedItems;

  public List<ATGData> getMappedItems() {
    return mMappedItems;
  }

  private List<MappingEventListener> mMappingEventListeners;

  public void addEventListener(MappingEventListener listener) {
    if (mMappingEventListeners == null) {
      mMappingEventListeners = new ArrayList<MappingEventListener>();
    }
    if (!mMappingEventListeners.contains(listener)) {
      mMappingEventListeners.add(listener);
    }
  }

  public void removeEventListener(MappingEventListener listener) {
    if (mMappingEventListeners != null) {
      mMappingEventListeners.remove(listener);
    }
  }

  /**
   * {@inheritDoc}
   * 
   * @see atg.siebel.catalog.mapper.SiebelMappingService#mapSiebelToAtg()
   */
  public void mapSiebelToAtg() throws MappingException {
    mapSiebelToAtg(getSiebelFileLocation(), getImportFileLocation());
  }

  /**
   * {@inheritDoc}
   * 
   * @throws MappingException
   * 
   * @see atg.siebel.catalog.mapper.SiebelMappingService#mapSiebelToAtg(java.lang.String,
   *      java.lang.String)
   */
  public void mapSiebelToAtg(String pSiebelFileLocation,
    File pAtgDestinationFile) throws MappingException {
    // Need to reset these class level members to ensure this mapping is not
    // affected by previous mappings
    mMappedItems = new ArrayList<ATGData>();
    mNestedItemsList = new ArrayList<ItemData>();
    int itemsMapped = 0;
    mAffectedItemTypes = new Hashtable<String, Set<String>>();

    // We dont check whether file exists because it may not be accessible.
    // It will be checked in SiebelXmlTools after the location has been
    // transformed.
    if (pSiebelFileLocation == null) {
      String[] messageArguments = { pSiebelFileLocation };
      String message =
        ResourceUtils.getMsgResource(ImportConstants.INVALID_EXPORT_DIRECTORY,
          MY_RESOURCE_NAME, sResourceBundle, messageArguments);
      logError(message);

      processError(ErrorType.MissingFileError, null, message, null, null, null,
        null);
      throw new MappingException(message);
    }

    if (!pAtgDestinationFile.exists()) {
      File parentDir = pAtgDestinationFile.getParentFile();
      if (!parentDir.exists()) {
        parentDir.mkdirs();
      }
      try {
        pAtgDestinationFile.createNewFile();
      } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }
    }

    // Make sure mappings exist to be able to perform mapping 
    if (mEntityMappings.isEmpty()) {
      // Mapping file doesn't exist 
      if (!getSiebelXmlTools().getMapperFile().exists()) {
        String[] messageArguments = { getSiebelXmlTools().getMapperFile().
            getAbsolutePath() };
        String message =
            ResourceUtils.getMsgResource(ImportConstants.NO_MAPPINGS_FILE,
              MY_RESOURCE_NAME, sResourceBundle, messageArguments);        
        processError(ErrorType.MissingFileError, null, message, null,
            null, null, null);
        throw new MappingException(message);
      }
      // some other issue with mappings file, mappings dont exist 
      else {
        String[] messageArguments = { getSiebelXmlTools().getMapperFile().
            getAbsolutePath() };
        String message =
            ResourceUtils.getMsgResource(ImportConstants.EMPTY_MAPPINGS_MAP,
              MY_RESOURCE_NAME, sResourceBundle, messageArguments);        
        processError(ErrorType.FileParsingError, null, message, null,
            null, null, null);
        throw new MappingException(message);
      }
    }    
    FileOutputStream stream = null;
    OutputStreamWriter bos = null;
    try {
      // Initialise the outputstream
      stream = new FileOutputStream(pAtgDestinationFile);
      bos = new OutputStreamWriter(stream, "UTF-8");

      bos.write(ImportConstants.GSA_HEADER);

      vlogDebug(
        "SiebelCatalogMappingService.mapSiebelToAtg(): Siebel Export Directory = {0}",
        pSiebelFileLocation);

      List<ItemData> topLevelItems =
        getSiebelXmlTools().parseSiebelXml(pSiebelFileLocation, this);

      if (topLevelItems == null || topLevelItems.isEmpty()) {
        String[] messageArguments = { "No items parsed " };
        String message =
          ResourceUtils.getMsgResource(ImportConstants.XML_PARSE_ERROR,
            MY_RESOURCE_NAME, sResourceBundle, messageArguments);
        processError(ErrorType.FileParsingError, null, message, null, null,
          null, null);
        throw new MappingException(
          "Unknown problem parsing Siebel source file(s)");
      }

      // Map the top-level items first. The mapping operation itself
      // may result in additional nested items being extracted and
      // added to the mNestedItemsStack to be processed once all top
      // level items have been completed. In addition new items might
      // be created by custom mapping components and these will
      // be added to the mGeneratedItems list.
      mJobManager.setJobPhase(mExportJobId, ProcessingPhase.MAPPING);
      Iterator<ItemData> iter = topLevelItems.iterator();
      while (iter.hasNext()) {
        ItemData nextItem = iter.next();
        ATGData atgItem = mapItem(nextItem);
        vlogDebug(
          "SiebelCatalogMappingService.mapSiebelToAtg(): MAPPED ITEM == {0}",
          atgItem);
        if (atgItem != null) {
          mMappedItems.add(atgItem);
          bos.write(atgItem.asXmlString());
          itemsMapped++;
        }
      }

      notifyListenersTopLevelItemsProcessed();

      // Now map any nested items extracted by the preceding block
      // of code.
      // We use a stack here in case further nested items are found
      if (mNestedItemsStack != null) {
        while (!mNestedItemsStack.isEmpty()) {
          ItemData nextItem = mNestedItemsStack.pop();
          ATGData atgItem = mapItem(nextItem);
          vlogDebug(
            "SiebelCatalogMappingService.mapSiebelToAtg(): MAPPED NESTED ITEM == {0}",
            atgItem);
          if (atgItem != null) {
            mMappedItems.add(atgItem);
            bos.write(atgItem.asXmlString());
            itemsMapped++;
          }
        }
      }

      // Any items in this list will have been created by a custom
      // mapping component and as such will be created with ATG
      // item and property definitions - no mapping is necessary.
      if (mGeneratedItems != null) {
        Iterator<ATGData> generatedItemsIter = mGeneratedItems.iterator();
        while (generatedItemsIter.hasNext()) {
          ATGData nextItem = (ATGData) generatedItemsIter.next();
          vlogDebug(
            "SiebelCatalogMappingService.mapSiebelToAtg(): Writing out generated item: {0}",
            nextItem);
          bos.write(nextItem.asXmlString());
          itemsMapped++;
        }
        mGeneratedItems.clear();
      }

      bos.write(ImportConstants.GSA_FOOTER);

    } catch (IOException ioe) {
      // Create and log an error with the JobManager
      String[] messageArguments = { ioe.getLocalizedMessage() };
      String message =
        ResourceUtils.getMsgResource(ImportConstants.FILE_IO_ERROR,
          MY_RESOURCE_NAME, sResourceBundle, messageArguments);
      if (isLoggingError()) {
        logError(message, ioe);
      }
      processError(ErrorType.MissingFileError, null, message, null, null, null,
        null);
      throw new MappingException(ioe);

    } catch (SAXException sne) {
      // Create and log an error with the JobManager
      String[] messageArguments = { sne.getLocalizedMessage() };
      String message =
        ResourceUtils.getMsgResource(ImportConstants.XML_PARSE_ERROR,
          MY_RESOURCE_NAME, sResourceBundle, messageArguments);
      vlogError(sne, message, (Object[]) messageArguments);
      processError(ErrorType.FileParsingError, null, message, null, null, null,
        null);
      throw new MappingException(sne);
    } finally {
      close(bos);
      close(stream);
    }
    mJobManager.getImportJob(mExportJobId).setMappedItemsCount(itemsMapped);
    mJobManager.setAffectedItemTypes(mExportJobId, getAffectedItemTypes());
  }

  /**
   * Creates a map which contains the Siebel-ATG entity mappings.
   * 
   * @throws IOException
   * @throws JAXBException
   */
  public void loadEntityMappings() throws JAXBException, IOException {
    //@formatter:off
 	  // The map created looks like this
	  // 
	  // Entity Map
	  //  key -> Siebel Entity Name
	  //  value -> Field Map
	  //    |
	  //    Field Map
	  //      key -> Siebel Field Name (or ATG_ITEM_NAME for the ATG item descriptor)
	  //      value -> Field Value Map
	  //        |
	  //        Field Value Map
	  //          key -> ATG_PROPERTY_NAME or ATG_MAPPING_COMPONENT_NAME
	  //          value -> corresponding atg property or mapping component
	  //@formatter:on

    mEntityMappings = new HashMap<String, Map<String, Map<String, String>>>();

    SiebelAtgMappings mappings =
      getSiebelXmlTools().getSiebelToAtgMappingDefinitions();
    List<EntityMapping> listOfEntityMappings =
      mappings.getListOfEntityMappings().getEntityMapping();

    for (EntityMapping nextMapping : listOfEntityMappings) {

      Map<String, Map<String, String>> fieldMap =
        new HashMap<String, Map<String, String>>();
      // Atg item-descriptor name
      Map<String, String> fieldValueMappings = new HashMap<String, String>();
      fieldValueMappings.put(ImportConstants.ATG_PROPERTY_NAME, nextMapping
        .getAtgEntity());
      fieldMap.put(ImportConstants.ATG_ITEM_NAME, fieldValueMappings);
      // Atg repository name
      fieldValueMappings = new HashMap<String, String>();
      fieldValueMappings.put(ImportConstants.ATG_PROPERTY_NAME, nextMapping
        .getAtgRepository());
      fieldMap.put(ImportConstants.ATG_REPOSITORY_NAME, fieldValueMappings);
      // load the repository as well - this needs to be done for the import
      // service in case the mapping components dont load a repository
      getTargetRepository(nextMapping.getAtgRepository());

      List<FieldMapping> fieldMappings =
        nextMapping.getListOfFieldMappings().getFieldMapping();
      for (FieldMapping nextFieldMapping : fieldMappings) {
        fieldValueMappings = new HashMap<String, String>();
        fieldValueMappings.put(ImportConstants.ATG_PROPERTY_NAME,
          nextFieldMapping.getAtgProperty());
        fieldValueMappings.put(ImportConstants.ATG_MAPPING_COMPONENT_NAME,
          nextFieldMapping.getMappingComponent());

        // ******************************
        // Add in reference flag

        // nextFieldMapping.get
        fieldMap.put(nextFieldMapping.getSiebelField(), fieldValueMappings);
      }
      mEntityMappings.put(nextMapping.getSiebelEntity(), fieldMap);
    }

  }

  /**
   * Creates an ATG item from the Siebel entity. Uses the mappings to map all
   * the Siebel properties to the corresponding ATG properties.
   * 
   * @param pItem
   *          - the Siebel entity
   * @return the ATG item
   * @throws ImportException
   */
  protected ATGData mapItem(ItemData pItem) throws MappingException {
    vlogDebug("SiebelCatalogMappingService.mapItem(): pItem == {0}", pItem);

    if (pItem == null) {
      String[] messageArguments = { "null", "null item" };
      String message =
        ResourceUtils.getMsgResource(ImportConstants.INVALID_ITEM_ERROR,
          MY_RESOURCE_NAME, sResourceBundle, messageArguments);

      vlogError(message);
      // Create and process the error
      processMappingError(null, message, null, null, null, null);
      return null;
    }

    Map<String, Object> itemProperties = pItem.getProperties();
    if (itemProperties == null) {
      String[] messageArguments =
        { pItem.getName(), "item properties == null" };
      String message =
        ResourceUtils.getMsgResource(ImportConstants.INVALID_ITEM_ERROR,
          MY_RESOURCE_NAME, sResourceBundle, messageArguments);

      vlogError(message);
      // Create and process the error
      processMappingError(null, message, null, pItem.getName(), null, null);
      return null;
    }

    boolean actionCodeIsDelete =
      pItem.getActionCode().equalsIgnoreCase(MappingConstants.ACTION_DELETE);
    boolean actionCodeIsReference =
      pItem.getActionCode().equalsIgnoreCase(MappingConstants.ACTION_REFERENCE);

    // Get the entity map for the current item (eg catalog, category etc)
    Map<String, Map<String, String>> entityMapper =
      mEntityMappings.get(pItem.getName());
    if (entityMapper == null) {
      String siebelId =
        (String) (pItem.getProperties().get(MappingConstants.SIEBEL_ID));
      String[] messageArguments = { pItem.getName(), "entityMapper == null" };
      String message =
        ResourceUtils.getMsgResource(
          ImportConstants.INVALID_ENTITY_MAPPER_ERROR, MY_RESOURCE_NAME,
          sResourceBundle, messageArguments);

      vlogError(message);
      // Create and process the error
      processMappingError(null, message, siebelId, pItem.getName(), null, null);
      return null;
    }

    String atgItemDescriptorName =
      entityMapper.get(ImportConstants.ATG_ITEM_NAME).get(
        ImportConstants.ATG_PROPERTY_NAME);

    String atgRepositoryName =
      entityMapper.get(ImportConstants.ATG_REPOSITORY_NAME).get(
        ImportConstants.ATG_PROPERTY_NAME);
    ATGData atgItem =
      new ATGData(atgItemDescriptorName,
        getTargetRepository(atgRepositoryName), pItem.getActionCode(), pItem
          .getExportItemId());

    // Retrieve the set of siebel field names for this entity. It may not seem
    // logical to loop through the siebel fields in the mapper instead of
    // looping
    // through the item properties. However the reason for this is there are
    // many
    // cases of multiple siebel fields mapping to a property in ATG and the code
    // is much cleaner and simpler looping through the siebel fields. This
    // obviously has the limitation that if there is an item property for which
    // a
    // mapping doesn't exist we have no way of flagging this.
    Set<String> siebelFields = entityMapper.keySet();
    for (String siebelFieldName : siebelFields) {

      // For the delete action code we only want to process the Id property
      if ( !(siebelFieldName.equalsIgnoreCase(MappingConstants.SIEBEL_ID) || 
          siebelFieldName.equalsIgnoreCase(MappingConstants.SIEBEL_GENERATED_ID))
          && actionCodeIsDelete) {
        
        continue;
      }

      // The entity mapping Map contains an key-value to indicate which ATG
      // item-descriptor the entity is being mapped to, we want to ignore
      // this key-value.
      if (siebelFieldName.equalsIgnoreCase(ImportConstants.ATG_ITEM_NAME)
        || siebelFieldName
          .equalsIgnoreCase(ImportConstants.ATG_REPOSITORY_NAME)) {
        continue;
      }

      // Retrieve the Siebel field value which may become the corresponding ATG
      // property value. If there is no mapping component specified then this
      // "raw" value will be used; otherwise the component will derive a value
      // using the current item and possibly other data.
      Object siebelValue = itemProperties.get(siebelFieldName);
      Object atgValue = siebelValue;

      // If action code is reference then only process this property if there
      // is a value for it. For some of the mappings there are multiple siebel
      // field names comma separated, for this case we need to check whether
      // any of the fields has a value.
      if (siebelValue == null && actionCodeIsReference) {
        if (!siebelFieldName.contains(",")) {
          continue;
        }
        String[] siebelFieldNames = siebelFieldName.split(",");
        boolean foundValue = false;
        for (String fieldName : siebelFieldNames) {
          if (itemProperties.get(fieldName) != null) {
            foundValue = true;
            break;
          }
        }
        if (!foundValue) {
          continue;
        }
      }

      // Get the mappings for this field
      // There will be at least 1 - the corresponding ATG property name
      // Optionally there could also be a mapping component
      Map<String, String> fieldMapper = entityMapper.get(siebelFieldName);

      // The ATG property name
      String atgPropertyName =
        fieldMapper.get(ImportConstants.ATG_PROPERTY_NAME);

      // The custom mapping component
      String componentName =
        fieldMapper.get(ImportConstants.ATG_MAPPING_COMPONENT_NAME);

      // The custom mapping component is optional
      if (!StringUtils.isEmpty(componentName)) {
        Object mapComp = Nucleus.getGlobalNucleus().resolveName(componentName);
        if (mapComp != null && mapComp instanceof CustomMappingComponent) {
          // OK we have a "good" mapping component.
          CustomMappingComponent mappingComponent =
            (CustomMappingComponent) mapComp;
          Map<String, Object> propertiesMap = new HashMap<String, Object>();
          propertiesMap.put(ImportConstants.SIEBEL_ITEM, pItem);
          propertiesMap.put(ImportConstants.ATG_PROPERTY_NAME, atgPropertyName);
          propertiesMap.put(ImportConstants.ATG_ITEM_DESRIPTOR_NAME,
            atgItemDescriptorName);
          propertiesMap.put(ImportConstants.ATG_REPOSITORY_NAME,
            atgRepositoryName);
          atgValue =
            mappingComponent.mapSiebelToATG(siebelFieldName, propertiesMap);
        } else {
          String siebelId = (String) (pItem.getProperties().get("Id"));
          String[] messageArguments =
            { siebelId, componentName };

          String message =
            ResourceUtils.getMsgResource(
              ImportConstants.INVALID_CUSTOM_MAPPING_COMPONENT,
              MY_RESOURCE_NAME, sResourceBundle, messageArguments);

          vlogError(message);
          // Create and process the error
          processMappingError(null, message, siebelId, pItem.getName(), null,
            null);
        }
      }
      atgItem.addProperty(atgPropertyName, (atgValue != null ? atgValue : ""));
    }
    return atgItem;
  }

  /**
   * Checks whether a name is a Siebel entity.
   * 
   * @param pName
   *          name to check for Siebel entity
   * @return true if name is a Siebel entity
   */
  public boolean isSiebelItemName(String pName) {
    Set<String> siebelItemNames = mEntityMappings.keySet();
    return siebelItemNames.contains(pName) ? true : false;
  }

  @Override
  public void doStartService() throws ServiceException {
    super.doStartService();
    try {
      loadEntityMappings();
    } catch (IOException ioe) {
      throw new ServiceException(ioe);
    } catch (JAXBException jaxe) {
      throw new ServiceException(jaxe);
    }
  }

  /*
   * Convenience method to close a Closeable resource
   */
  private void close(Closeable c) {
    try {
      c.close();
    } catch (IOException ioe) {
      logError(ioe);
      ImportError error = new ImportError(ImportErrorEnum.OUTPUTSTREAM_ERROR);
      error.setDescription(ioe.getMessage());
      // mErrorList.add(error);
    }
  }

  /**
   * @param pExportItemId
   * @param pMessage
   * @param pItemId
   * @param pItemType
   * @param pReferenceItemId
   * @param pReferenceItemType
   * @throws MappingException
   */
  public void processMappingError(String pExportItemId, String pMessage,
    String pItemId, String pItemType, String pReferenceItemId,
    String pReferenceItemType) throws MappingException {

    processError(ErrorType.MappingError, pExportItemId, pMessage, pItemId,
      pItemType, pReferenceItemId, pReferenceItemType);
  }

  /**
   * @param pErrorType
   * @param pExportItemId
   * @param pMessage
   * @param pItemId
   * @param pItemType
   * @param pReferenceItemId
   * @param pReferenceItemType
   * @throws MappingException
   */
  public void processError(ErrorType pErrorType, String pExportItemId,
    String pMessage, String pItemId, String pItemType, String pReferenceItemId,
    String pReferenceItemType) throws MappingException {

    JobErrorBuilder builder = new JobErrorBuilder(pErrorType, pMessage);
    builder.setItemId(pItemId).setItemType(pItemType).setExportItemId(
      pExportItemId).setReferenceItemId(pReferenceItemId).setReferenceItemType(
      pItemType);

    boolean abort = mJobManager.processJobError(mExportJobId, builder.build());

    if (abort) {
      throw new MappingException(pMessage);
    }
  }

  private void notifyListenersTopLevelItemsProcessed() {
    if (mMappingEventListeners == null) {
      return;
    }
    for (MappingEventListener listener : mMappingEventListeners) {
      listener.topLevelItemsProcessed();
    }
  }

}
