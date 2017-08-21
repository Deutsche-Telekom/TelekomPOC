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

/*
 * Copyright 2008 ATG Import Service Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package atg.siebel.catalog.importer;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;

import atg.adapter.gsa.EnumPropertyDescriptor;
import atg.adapter.gsa.GSAItemDescriptor;
import atg.adapter.gsa.GSAPropertyDescriptor;
import atg.adapter.version.VersionUtils;
import atg.dtm.TransactionDemarcation;
import atg.dtm.TransactionDemarcationException;
import atg.nucleus.GenericService;
import atg.repository.MutableRepository;
import atg.repository.MutableRepositoryItem;
import atg.repository.Repository;
import atg.repository.RepositoryException;
import atg.repository.RepositoryItem;
import atg.repository.RepositoryItemDescriptor;
import atg.repository.RepositoryPropertyDescriptor;
import atg.repository.dp.DerivedPropertyDescriptor;

/**
 * This class is responsible for creating temporary "dummy" item descriptors
 * that can act as a stand-in for required item properties.
 */

public class ReferenceItemGenerator {

  //-------------------------------------
  /** Class version string */

  public static String CLASS_VERSION = "$Id: //product/Siebel/version/11.2/src/atg/siebel/catalog/importer/ReferenceItemGenerator.java#2 $$Change: 1194813 $";

	private static final String M_REFERENCE_LIST_FILENAME = "ReferenceList.xml";

	private ImportServiceInterface mImportService;

	private String mImportDirectory;

	private FileWriter mReferenceListFileWriter;

	private Map<String, Map<String, MutableRepositoryItem>> mRepositoryToItemsMap = 
					new HashMap<String, Map<String, MutableRepositoryItem>>(11);

  private List<ReferenceItem> mReferenceItemList =
    new ArrayList<ReferenceItem>();

	public List<ReferenceItem> getReferenceItemList() {
		return mReferenceItemList;
	}

	File mLogFile;

	FileWriter mLogFileWriter;

	public ReferenceItemGenerator(ImportServiceInterface pImportService) {
		mImportService = pImportService;
		mImportDirectory = mImportService.getImportDirectory();
	}

  public void initialiseReferenceItemGenerator() throws RepositoryException,
    IOException {

		logDebugMessage("REFERENCE ITEM GENERATOR: Generating the dummy (non-primary) items");
		generateDummyItems();
	}

	// -------------------------------------
	/**
	 * Creates dummy items that will be used as temporary place holders.
	 * 
	 * @return The object used to create dummy items.
	 */

	public void generateDummyItems() throws RepositoryException, IOException {

    TransactionDemarcation transactionDemarcation =
      new TransactionDemarcation();
		boolean rollback = false;

		try {
			transactionDemarcation.begin(mImportService.getTransactionManager());

			Collection<Repository> targetRepositories = mImportService.getTargetRepositories().values();
			
			for (Repository repository : targetRepositories) {

  			String targetRepositoryName = repository.getRepositoryName();

      logDebugMessage("generateDummyItems: Processing target Repository: "
        + targetRepositoryName);

  			String[] targetItemDescriptorNames = repository.getItemDescriptorNames();

			for (int i = 0; i < targetItemDescriptorNames.length; i++) {
        logDebugMessage("generateDummyItems: Processing Item Descriptor: "
          + targetItemDescriptorNames[i]);

  				RepositoryItemDescriptor targetItemDescriptor = repository
  				    .getItemDescriptor(targetItemDescriptorNames[i]);

				if (targetItemDescriptor == null) {
          throw new RepositoryException(
            "generateDummyItems: Could not find Item Descriptor");
				}

        RepositoryPropertyDescriptor[] targetPropertyDescriptors =
          (RepositoryPropertyDescriptor[]) ((GSAItemDescriptor) targetItemDescriptor)
				    .getPropertyDescriptors();

        logDebugMessage("generateDummyItems: Item Descriptor: "
          + targetItemDescriptorNames[i] + " Number of properties: "
          + targetPropertyDescriptors.length);

				for (int j = 0; j < targetPropertyDescriptors.length; j++) {
					if (targetPropertyDescriptors[j].isRequired()
            && VersionUtils.deployable(targetPropertyDescriptors[j],
              targetItemDescriptor)
            && (RepositoryItem.class
              .isAssignableFrom(targetPropertyDescriptors[j].getPropertyType()))) {
            String targetForeignRepositoryName =
              ((GenericService) targetPropertyDescriptors[j]
						    .getPropertyItemDescriptor().getRepository()).getAbsoluteName();

            logDebugMessage("generateDummyItems: Property Descriptor: "
              + targetItemDescriptorNames[i] + " Target Repository: "
              + targetForeignRepositoryName);

						// print info message for each property that references another
						// repository

						if (!targetRepositoryName.equals(targetForeignRepositoryName)) {
							logDebugMessage("generateDummyItems: Reference to a foreign repository found");
						}

						logDebugMessage("generateDummyItems: Finding or creating temp reference item in repository");

            findDummyReferenceItem(
              (MutableRepository) targetPropertyDescriptors[j]
                .getPropertyItemDescriptor().getRepository(),
              targetPropertyDescriptors[j].getPropertyItemDescriptor()
                .getItemDescriptorName(),
						    (GSAPropertyDescriptor) targetPropertyDescriptors[j]);

						logDebugMessage("generateDummyItems: done with this property");
					}
				}
			}
			}
			rollback = false;
		} catch (TransactionDemarcationException e) {
      throw (new RepositoryException("TransactionDemarcationException: "
        + e.getMessage()));
		} catch (RepositoryException e) {
			throw (e);
		} finally {
			try {
				transactionDemarcation.end(rollback);
			} catch (TransactionDemarcationException e) {
        throw (new RepositoryException("TransactionDemarcationException: "
          + e.getMessage()));
			}
		}
		return;
	}

	// -------------------------------------
	/**
   */

  public RepositoryItem findDummyReferenceItem(MutableRepository pRepository,
    String pItemDescriptorName, GSAPropertyDescriptor pPropertyDescriptor)
    throws RepositoryException {

		MutableRepositoryItem item = null;
		String repositoryName = null;
		boolean primaryKey = false;
		Map<String, MutableRepositoryItem> itemDescriptorToItemMap;

    vlogDebug(
      "Entered findDummyReferenceItem: repo == {0}, item desc == {1}, prop desc == {2}, ",
      pRepository, pItemDescriptorName, pPropertyDescriptor);

    // logDebugMessage("Entered findDummyReferenceItem: pRepository == "
    // + pRepository + " : pItemDescriptorName == " + pItemDescriptorName
    // + " : pPropertyDescriptor == " + pPropertyDescriptor);

		// Check if we are writing to a primary key table
    if (pPropertyDescriptor != null
      && pPropertyDescriptor.isJDBCPrimaryKeyNamesKnown()) {
			primaryKey = pPropertyDescriptor.isJDBCPrimaryKey()[0];
		}

		if (primaryKey) {
			logDebugMessage("findDummyReferenceItem: Property "
        + pPropertyDescriptor.getItemDescriptor().getItemDescriptorName() + "."
        + pPropertyDescriptor.getName()
        + " is stored in a primary key column, primary key name="
        + pPropertyDescriptor.getJDBCPrimaryKeyNames()[0]
			    + " A new temporary item will be created for this property.");
		}

		// check for GenericService for unit tests

		if (pRepository instanceof GenericService) {
			repositoryName = ((GenericService) pRepository).getAbsoluteName();
      logDebugMessage("findDummyReferenceItem: Repository Name: "
        + repositoryName);
		} else {
      throw new RuntimeException(
        "ReferenceItemGenerator: Repository is not a GenericService");
		}

		itemDescriptorToItemMap = mRepositoryToItemsMap.get(repositoryName);

		
		// Get the item from our map as long as it's not stored in a primary key
		// column

		if (itemDescriptorToItemMap != null && !primaryKey) {
			item = (MutableRepositoryItem) itemDescriptorToItemMap.get(pItemDescriptorName);

			if (item != null) {
        logDebugMessage("findDummyReferenceItem: Found a suitable item that already exists: "
          + item.getRepositoryId());
				return item;
			}
		}

		if (itemDescriptorToItemMap == null) {
      logDebugMessage("findDummyReferenceItem: Creating the map for the repository: "
        + repositoryName);
			itemDescriptorToItemMap = new HashMap<String, MutableRepositoryItem>(13);
			mRepositoryToItemsMap.put(repositoryName, itemDescriptorToItemMap);
		}

		// Get the item from our map as long as it's not stored in a primary key
		// column

		if (!primaryKey) {
			logDebugMessage("findDummyReferenceItem: Try to get a suiable item from the map");
			item = itemDescriptorToItemMap.get(pItemDescriptorName);
		}

		if (item == null) {
			// Don't use existing items for properties stored in a primary key.

			logDebugMessage("findDummyReferenceItem: No item yet...");

			if (!primaryKey) {
				logDebugMessage("findDummyReferenceItem: Look in the list");
				item = findReferenceItemInList(repositoryName, pItemDescriptorName);
			}

			if (item == null) {
				logDebugMessage("findDummyReferenceItem: No suitable item exists. Creating temp item reference in repository "
				    + repositoryName + " for item type " + pItemDescriptorName); //$NON-NLS-1$ //$NON-NLS-2$
				item = createDummyItem(pRepository, pItemDescriptorName);
				logDebugMessage("findDummyReferenceItem: Item Created");
			}

			if (!itemDescriptorToItemMap.containsKey(pItemDescriptorName)) {
				logDebugMessage("findDummyReferenceItem: The newly created item is not in the map so add it.");
				itemDescriptorToItemMap.put(pItemDescriptorName, item);
			}
		}
		logDebugMessage("Leaving findDummyReferenceItem: item == " + item);
		return item;
	}

  private MutableRepositoryItem findReferenceItemInList(String pRepositoryPath,
    String pItemDescriptorName) throws RepositoryException {

    logDebugMessage("Entered findReferenceItemInList: pRepositoryPath == "
      + pRepositoryPath + " : pItemDescriptorName == " + pItemDescriptorName);

		boolean itemFoundInList = false;
		ReferenceItem referenceItem = null;
		Iterator<ReferenceItem> iterator = mReferenceItemList.iterator();

		while ((iterator.hasNext()) && (!itemFoundInList)) {
			referenceItem = iterator.next();

			if ((referenceItem.getRepositoryPath().equals(pRepositoryPath))
			    && (referenceItem.getItemDescriptor().equals(pItemDescriptorName))) {
				itemFoundInList = true;
			}
		}

		MutableRepositoryItem item = null;
		if (itemFoundInList) {
			// Get the item in the repository.

      MutableRepository repository =
        (MutableRepository) mImportService.resolveName(referenceItem
          .getRepositoryPath());

      item =
        (MutableRepositoryItem) repository.getItem(referenceItem.getItemId(),
          referenceItem.getItemDescriptor());
		}

		logDebugMessage("Leaving findReferenceItemInList: item == " + item);
		return item;
	}

	// -------------------------------------
	/**
	 * Creates a dummy repository item which is used when a required property of
	 * the given types needs to reference an asset.
	 */

  public MutableRepositoryItem createDummyItem(MutableRepository pRepository,
    String pItemDescriptorName) throws RepositoryException {
		ReferenceItem referenceItem;
		RepositoryPropertyDescriptor[] propertyDescriptors;

		// Create the item

		MutableRepositoryItem item = pRepository.createItem(pItemDescriptorName);

		// Create a ReferenceItem and add it to the index.

		referenceItem = new ReferenceItem();

    referenceItem.setRepositoryPath(((GenericService) pRepository)
      .getAbsoluteName());
		referenceItem.setItemDescriptor(pItemDescriptorName);
		referenceItem.setItemId(item.getRepositoryId());

		mReferenceItemList.add(referenceItem);

    propertyDescriptors =
      (RepositoryPropertyDescriptor[]) item.getItemDescriptor()
        .getPropertyDescriptors();

		// Create a java.util.Random for generating property values of the temporary
		// item.

		long seed = generateSeed();

		Random r = new Random(seed);

		for (int i = 0; i < propertyDescriptors.length; i++) {
			if (!propertyDescriptors[i].isRequired()) // skip non-required properties
			{
				continue;
			}

			if (!propertyDescriptors[i].isWritable()) // skip non-writable properties
			{
				continue;
			}

			if (propertyDescriptors[i].isIdProperty()) // skip id properties
			{
				continue;
			}

			if (propertyDescriptors[i] instanceof DerivedPropertyDescriptor) {
				// skip derived properties

        logDebugMessage("createDummyItem: WARNING: The " + pItemDescriptorName
          + "(" + pRepository.getRepositoryName() + ")"
          + " required derived property");

				continue;
			}

			// Get column lengths

			int columnLength = 10; // default to 10 if we don't know

			boolean columnLengthKnown = false;

			if (propertyDescriptors[i] instanceof GSAPropertyDescriptor) {
        GSAPropertyDescriptor gpd =
          (GSAPropertyDescriptor) propertyDescriptors[i];
				columnLengthKnown = gpd.isJDBCColumnLengthsKnown();
				if (columnLengthKnown) {
					columnLength = gpd.getJDBCColumnLengths()[0];
				}
			}

			Class<?> classType = propertyDescriptors[i].getPropertyType();

			// --------------------------
			// enumeration
			// --------------------------

			if (propertyDescriptors[i] instanceof EnumPropertyDescriptor) { //$NON-NLS-1$
        EnumPropertyDescriptor enumPd =
          (EnumPropertyDescriptor) propertyDescriptors[i];

				if (enumPd.getUseCodeForValue()) {
					Integer[] codes = enumPd.getEnumeratedCodes();

					if (codes != null && codes.length > 0) {
						item.setPropertyValue(propertyDescriptors[i].getName(), codes[0]);
					} else {
            throw new RepositoryException(
              "ReferenceItemGenerator: no defined enum values" + " "
                + propertyDescriptors[i].getName() + " in descriptor" + " "
                + pItemDescriptorName);
					}
				} else {
					String[] strings = enumPd.getEnumeratedValues();

					if (strings != null && strings.length > 0) {
						item.setPropertyValue(propertyDescriptors[i].getName(), strings[0]);
					} else {
            throw new RepositoryException(
              "ReferenceItemGenerator.noDefinedEnumValues" + " "
                + propertyDescriptors[i].getName() + " in descriptor" + " "
                + pItemDescriptorName);
					}

				}
			}

			// --------------------------
			// String
			// --------------------------

			else if (classType == String.class) {
				// Get a unique value no longer than column length
				// Look out for UTF-8 Database columnLength might be in bytes, not
				// number of characters
				// To be safe, divide by 3 and subtract 1

				int safeNumChars = (columnLength / 4) - 1;

        item.setPropertyValue(propertyDescriptors[i].getName(),
          getRandomString(safeNumChars)); //$NON-NLS-1$
			}

			// --------------------------
			// Integer
			// --------------------------

			else if (classType == Integer.class) {
        item.setPropertyValue(propertyDescriptors[i].getName(), new Integer(r
          .nextInt()));
			}

			// --------------------------
			// RepositoryItem
			// --------------------------

			else if (classType == RepositoryItem.class) {
        RepositoryItemDescriptor refItemDesc =
          propertyDescriptors[i].getPropertyItemDescriptor();

				RepositoryItem refItem;

				if (item.getItemDescriptor() != refItemDesc) {
          refItem =
            findDummyReferenceItem((MutableRepository) refItemDesc
              .getRepository(), refItemDesc.getItemDescriptorName(),
              (GSAPropertyDescriptor) propertyDescriptors[i]);
				} else {
					refItem = item;
				}

				item.setPropertyValue(propertyDescriptors[i].getName(), refItem);
			}

			// --------------------------
			// Timestamp
			// --------------------------

			else if (classType == Timestamp.class) {
        item.setPropertyValue(propertyDescriptors[i].getName(), new Timestamp(r
          .nextLong()));
			}

			// --------------------------
			// Boolean
			// --------------------------

			else if (classType == Boolean.class) {
				item.setPropertyValue(propertyDescriptors[i].getName(), Boolean.TRUE);
			}

			// --------------------------
			// Double
			// --------------------------

			else if (classType == Double.class) {
        item.setPropertyValue(propertyDescriptors[i].getName(), new Double(r
          .nextDouble()));
			}

			// --------------------------
			// javax.sql.Date
			// --------------------------

      else if (classType == java.sql.Date.class
        || classType == java.util.Date.class) {
        item.setPropertyValue(propertyDescriptors[i].getName(),
          new java.sql.Date(r.nextLong()));
			}

			// --------------------------
			// Short
			// --------------------------

			else if (classType == Short.class) {
        item.setPropertyValue(propertyDescriptors[i].getName(), new Short(
          (short) r.nextInt(16000)));
			}

			// --------------------------
			// Long
			// --------------------------

			else if (classType == Long.class) {
        item.setPropertyValue(propertyDescriptors[i].getName(), new Long(r
          .nextLong()));
			}

			// --------------------------
			// Float
			// --------------------------

			else if (classType == Float.class) {
        item.setPropertyValue(propertyDescriptors[i].getName(), new Float(r
          .nextFloat()));
			}

			// --------------------------
			// Byte
			// --------------------------

			else if (classType == Byte.class) {
				byte[] b = new byte[1];
				r.nextBytes(b);
				item.setPropertyValue(propertyDescriptors[i].getName(), new Byte(b[0]));
			}

			// --------------------------
			// Character
			// --------------------------

			else if (classType == Character.class) {
				byte[] c = new byte[1];
				r.nextBytes(c);
        item.setPropertyValue(propertyDescriptors[i].getName(), new Character(
          (char) c[0]));
			}

			// --------------------------
			// Binary
			// --------------------------

			else if (propertyDescriptors[i].getTypeName().equals("binary")) //$NON-NLS-1$
			{
				// Assuming that byte is not unique , so we aren't generating
				// a random here.
        item.setPropertyValue(propertyDescriptors[i].getName(), new byte[] { 0,
          0 });
			}

			// --------------------------
			// Unknown/Unsupported
			// --------------------------

			else {
				logDebugMessage("createDummyItem: the required property " + propertyDescriptors[i].getName() + //$NON-NLS-1$
				    " in descriptor " + item.getItemDescriptor().getItemDescriptorName() + //$NON-NLS-1$
				    " not populated " + classType.getName()); //$NON-NLS-1$
        throw new RepositoryException(
          "ReferenceItemGenerator: unknownPropertyType" + " "
            + propertyDescriptors[i].getName() + " in descriptor " + " "
            + pItemDescriptorName);
			}
		}

		pRepository.addItem(item);
		pRepository.updateItem(item);

		return (item);
	}

	/**
   * 
   */
	public void persistReferenceItemList() throws IOException {

		logDebugMessage("persistReferenceItemList: Persisting the reference item list");

		// Set up the file writer for the reference items.
    String referenceListFilename =
      mImportDirectory + File.separator + M_REFERENCE_LIST_FILENAME;

		File referenceListFile = new File(referenceListFilename);

		if (!referenceListFile.exists()) {
			referenceListFile.createNewFile();
		}

		mReferenceListFileWriter = new FileWriter(referenceListFile, false);

		logDebugMessage("persistReferenceItemList: Reference item file is ready for writing");

		// Process the list.

		Iterator<ReferenceItem> iterator = getReferenceItemList().iterator();

		while (iterator.hasNext()) {
			ReferenceItem referenceItem = iterator.next();

			// Write the item to the file.

			mReferenceListFileWriter.write("<reference-item>" + "\n");
      mReferenceListFileWriter.write("\t" + "<repository-path>"
        + referenceItem.getRepositoryPath() + "</repository-path>" + "\n");
      mReferenceListFileWriter.write("\t" + "<item-descriptor>"
        + referenceItem.getItemDescriptor() + "</item-descriptor>" + "\n");
      mReferenceListFileWriter.write("\t" + "<item-id>"
        + referenceItem.getItemId() + "</item-id>" + "\n");
			mReferenceListFileWriter.write("</reference-item>" + "\n");
			mReferenceListFileWriter.flush();

		}

		logDebugMessage("persistReferenceItemList: Reference item file is complete");
	}

	// -------------------------------------
	/**
	 * Removes the dummy items from the destination repository
	 */
	public synchronized void deleteAllDummyReferenceItems() {
		int pass = 1;

		logDebugMessage("deleteAllDummyReferenceItems: Getting the items to remove");

		List<RepositoryItem> itemsToRemove = getItemsToRemoveAsList();
		if (itemsToRemove == null) {
			return;
		}
    logDebugMessage("deleteAllDummyReferenceItems: Number of items to remove: "
      + itemsToRemove.size());

		while (!itemsToRemove.isEmpty() && pass < 25) {
			logDebugMessage("deleteAllDummyReferenceItems: Deletion pass: " + pass);

			deleteItemsFromList(itemsToRemove);
			pass++;
		}

		logDebugMessage("deleteAllDummyReferenceItems: Clear the map");

		clearRepositoryItemMap();

		logDebugMessage("deleteAllDummyReferenceItems: Clear the list");

		mReferenceItemList.clear();

		logDebugMessage("deleteAllDummyReferenceItems: Remove the reference file");

		removeReferenceListFile();
	}

	private List<RepositoryItem> getItemsToRemoveAsList() {
		ArrayList<RepositoryItem> itemsToRemove = new ArrayList<RepositoryItem>();

    logDebugMessage("getItemsToRemoveAsList: processing reference item list: "
      + mReferenceItemList);

		Iterator<ReferenceItem> iterator = mReferenceItemList.iterator();
		while (iterator.hasNext()) {
			ReferenceItem referenceItem = (ReferenceItem) iterator.next();

      logDebugMessage("getItemsToRemoveAsList: Reference Item: "
        + referenceItem.getItemDescriptor() + " (" + referenceItem.getItemId()
        + ") Repository: " + referenceItem.getRepositoryPath());

			try {
        MutableRepository repository =
          (MutableRepository) mImportService.resolveName(referenceItem
            .getRepositoryPath());

        logDebugMessage("getItemsToRemoveAsList: Repository for item: "
          + repository.getRepositoryName());

        RepositoryItem item =
          repository.getItem(referenceItem.getItemId(), referenceItem
            .getItemDescriptor());

				if (item != null) {
          logDebugMessage("getItemsToRemoveAsList: Add item to list: "
            + item.getRepositoryId());
					itemsToRemove.add(item);
				}
			} catch (RepositoryException e) {
				// Do nothing for now.
        logDebugMessage("getItemsToRemoveAsList: RepositoryException: "
          + e.getMessage());
			}
		}

		logDebugMessage("getItemsToRemoveAsList: List built: " + itemsToRemove);

		return (itemsToRemove);
	}

	private void deleteItemsFromList(List<RepositoryItem> pList) {

		logDebugMessage("deleteItemsFromList: Processing list: " + pList);
		TransactionDemarcation td = new TransactionDemarcation();
		boolean rollback = true;

		Iterator<RepositoryItem> iterator = pList.iterator();
		while (iterator.hasNext()) {
			try {
        td.begin(mImportService.getTransactionManager(),
          TransactionDemarcation.REQUIRED);

				MutableRepositoryItem item = (MutableRepositoryItem) iterator.next();
        String repositoryPath =
          ((GenericService) item.getRepository()).getAbsoluteName();
        String itemDescriptorName =
          item.getItemDescriptor().getItemDescriptorName();
				String itemId = item.getRepositoryId();

        logDebugMessage("deleteItemsFromList: Attempting to remove temp reference item "
          + repositoryPath + ":" + itemDescriptorName + ":" + itemId);

				MutableRepository repository = null;
				RepositoryItem itemToRemove = null;

				logDebugMessage("deleteItemsFromList: Get the Item Descriptor to Item map");

        Map<String, MutableRepositoryItem> itemDescriptorToItemMap =
          mRepositoryToItemsMap.get(repositoryPath);

				// First try to find the cached item object
				if (itemDescriptorToItemMap != null) {
          logDebugMessage("deleteItemsFromList: Item Descriptor to Item map == "
            + itemDescriptorToItemMap);

          itemToRemove =
            (RepositoryItem) itemDescriptorToItemMap.get(itemDescriptorName);
          logDebugMessage("deleteItemsFromList: itemToRemove from map == "
            + itemToRemove);

					if (itemToRemove != null) {
						repository = (MutableRepository) itemToRemove.getRepository();

            logDebugMessage("deleteItemsFromList: Remove item descriptor from map - "
              + itemDescriptorName);
						itemDescriptorToItemMap.remove(itemDescriptorName);

						if (itemDescriptorToItemMap.isEmpty()) {
							logDebugMessage("deleteItemsFromList: Map is now empty so remove it.");
							mRepositoryToItemsMap.remove(repositoryPath);
						}
					}
				}

				// If it's not cached, load it from the repository.
				if (itemToRemove == null) {
					logDebugMessage("deleteItemsFromList: Item to remove is not cached. get it.");

          repository =
            (MutableRepository) mImportService.resolveName(repositoryPath);
					itemToRemove = repository.getItem(itemId, itemDescriptorName);
          logDebugMessage("deleteItemsFromList: itemToRemove == "
            + itemToRemove);

					if (itemToRemove == null) {
						logDebugMessage("deleteItemsFromList: Temp reference item stored for deployment was not found in destination repository");
						continue;
					}
				}

				// Remove the item.
        logDebugMessage("deleteItemsFromList: Removing the item [" + itemId
          + "[ from repository [" + repository + "]");
				repository.removeItem(itemId, itemDescriptorName);

				rollback = false;
			} catch (RepositoryException e) {
        logDebugMessage("deleteItemsFromList: RepositoryException: "
          + e.getMessage());
			} catch (TransactionDemarcationException e) {
        logDebugMessage("deleteItemsFromList: TransactionDemarcationException: "
          + e.getMessage());
			} finally {
				try {
					td.end(rollback);

					if (!rollback) {
						iterator.remove();
					}
				} catch (TransactionDemarcationException e) {
          logDebugMessage("deleteItemsFromList: TransactionDemarcationException: "
            + e.getMessage());
				}
			}
		}

		logDebugMessage("deleteItemsFromList: Done");
	}

	private void clearRepositoryItemMap() {
		Map<String, MutableRepositoryItem> itemDescriptorToItemMap;
    Iterator<Map<String, MutableRepositoryItem>> iterator =
      mRepositoryToItemsMap.values().iterator();

		while (iterator.hasNext()) {
			itemDescriptorToItemMap = iterator.next();
			itemDescriptorToItemMap.clear();
		}

		mRepositoryToItemsMap.clear();
	}

	private void removeReferenceListFile() {
		File referenceListFile;
		String referenceListFilename;

		// Close the writer.

		try {
			mReferenceListFileWriter.close();
		} catch (IOException e) {
      logDebugMessage("removeReferenceListFile: Failed to close writer: "
        + e.getMessage());
		}

    referenceListFilename =
      mImportDirectory + File.separator + M_REFERENCE_LIST_FILENAME;

    logDebugMessage("removeReferenceListFile: Reference file: "
      + referenceListFilename);

		referenceListFile = new File(referenceListFilename);

		if (referenceListFile.exists()) {
			try {
				if (referenceListFile.delete()) {
					logDebugMessage("removeReferenceListFile: Reference file deleted");
				} else {
					logDebugMessage("removeReferenceListFile: Reference file not deleted");
				}
			} catch (SecurityException e) {
        logDebugMessage("removeReferenceListFile: SecurityException: "
          + e.getMessage());
			}
		}
	}

	// -------------------------------------
	/**
	 * Generates a *hopefully* unique seed
	 */

	public long generateSeed() {
		int hash = Thread.currentThread().getName().hashCode();

		long freeMem = Runtime.getRuntime().freeMemory();

		long time = System.currentTimeMillis();

		return (freeMem + time + hash);
	}

	// -------------------------------------
	/**
	 * Return a random strng of a given length
	 */

	public static String getRandomString(int n) {
		char[] randStr = new char[n];
		int c = 'A';
		int r1 = 0;
		for (int i = 0; i < n; i++) {
			r1 = (int) (Math.random() * 3);
			switch (r1) {
			case 0:
				c = '0' + (int) (Math.random() * 10);
				break;
			case 1:
				c = 'a' + (int) (Math.random() * 26);
				break;
			case 2:
				c = 'A' + (int) (Math.random() * 26);
				break;
			}

			randStr[i] = (char) c;
		}

		return new String(randStr);
	}

  /**
   * Calls the logDebug on ImportService.
   * 
   * @param pMessage
   *          String of the debug message.
   */
	private void logDebugMessage(String pMessage) {
		if (mImportService.isLoggingDebug()) {
			mImportService.logDebug("ReferenceItemGenerator: " + pMessage);
		}
	}

  /**
   * Calls the variable argument debug logging on ImportService
   * 
   * @param pMessage
   *          String of the debug message.
   * @param pParams
   *          String of 0..n paramters to feed into the pMessage which should be
   *          formatted like a MessageFormat string (e.g., "Hello, {0}")
   */
  protected void vlogDebug(String pMessage, Object... pParams) {
    mImportService.vlogDebug(pMessage, pParams);
  }

}
