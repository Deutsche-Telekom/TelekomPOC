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

package atg.adapter.gsa.xml;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;

import atg.adapter.gsa.GSAPropertyDescriptor;
import atg.adapter.gsa.GSARepository;
import atg.adapter.util.RepositoryUtils;
import atg.core.util.StringUtils;
import atg.dtm.TransactionDemarcation;
import atg.dtm.TransactionDemarcationException;
import atg.repository.MutableRepository;
import atg.repository.MutableRepositoryItem;
import atg.repository.Repository;
import atg.repository.RepositoryException;
import atg.repository.RepositoryItem;
import atg.repository.RepositoryItemDescriptor;
import atg.repository.RepositoryPropertyDescriptor;
import atg.siebel.catalog.importer.ImportConstants;
import atg.siebel.catalog.importer.ImportException;
import atg.siebel.catalog.importer.ImportFailedItem;
import atg.siebel.catalog.importer.ImportFileParser;
import atg.siebel.catalog.importer.ImportItem;
import atg.siebel.catalog.importer.ImportServiceInterface;
import atg.siebel.catalog.importer.ImportTimer;
import atg.siebel.catalog.job.ImportJobEnums.ErrorType;
import atg.siebel.catalog.job.ImportJobError.JobErrorBuilder;

public class ImportWorkerThread extends Thread {

  //-------------------------------------
  /** Class version string */

  public static String CLASS_VERSION = "$Id: //product/Siebel/version/11.2/src/atg/adapter/gsa/xml/ImportWorkerThread.java#2 $$Change: 1194813 $";


  private int mThreadIndex;

  private ImportServiceInterface mImportService;

  private int mStartSegment, mEndSegment;

  private int mPhase = ImportConstants.PHASE_ADD_UPDATE;

  private volatile boolean mContinueRunning = true;
   
  public synchronized void terminate(boolean pRollback) {
    mRollback = pRollback;
    mContinueRunning = false;
    // Should be asleep!
    notify();
  }
  

  FileWriter mLogFileWriter;

  protected boolean mRollback = true;

  public void setPhase(int pPhase) {
    mPhase = pPhase;
  }

  public ImportWorkerThread(
      int pThreadIndex, 
      ImportServiceInterface pImportService, 
      int pStartSegment, 
      int pEndSegment) {

    mThreadIndex = pThreadIndex;
    mImportService = pImportService;
    mStartSegment = pStartSegment;
    mEndSegment = pEndSegment;
    mContinueRunning = true;
    mLogFileWriter = createLogFileWriter();
  }
  
  
  protected CountDownLatch mCountDownLatch;
  
  public void setCountDownLatch(CountDownLatch pCountDownLatch) {
    mCountDownLatch = pCountDownLatch;
  }
  
  
  public void run() {
   
    boolean countDownCalled = false;
    TransactionDemarcation transactionDemarcation = new TransactionDemarcation();
    try {
      transactionDemarcation.begin(mImportService.getTransactionManager());
      logDebugMessage("THREAD (" + this.getName()
          + "): started with TX = "+transactionDemarcation.getTransaction());

      try {
        mImportService.getImportSession().registerThread();
      } catch (ImportException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        mContinueRunning = false;
      }
      
      synchronized(this) {
        while (mContinueRunning) {
          try {
            logDebugMessage("THREAD (" + this.getName()
                + "): Waiting for a signal to start on (" + mStartSegment + ","
                + mEndSegment + ")");
            wait();
            logDebugMessage("THREAD (" + this.getName() + "): PHASE START: "
                + mPhase);
          } catch (InterruptedException ie) {
            logErrorMessage("THREAD (" + this.getName()
                + "): Received the terminate interrupt");
            mContinueRunning = false;
            // Clean up
          }

          if (mContinueRunning) {
            // Start the current phase.
            logDebugMessage("THREAD (" + this.getName()
                + "): Notifying the Import Service that thread is processing");

            mImportService.notifyThreadStatus(mThreadIndex, this.getName(),
                ImportConstants.THREAD_STATUS_PROCESSING);

            processPhase();

            mCountDownLatch.countDown();
            countDownCalled = true;
            // Notify the import service that we've completed this phase.
            logDebugMessage("THREAD (" + this.getName()
                + "): PHASE COMPLETE. Notifying the import Service.");

            mImportService.notifyThreadStatus(mThreadIndex, this.getName(),
                ImportConstants.THREAD_STATUS_PHASE_COMPLETED);
          }
        }
      }
    } catch (TransactionDemarcationException e) {
      mImportService.vlogError(e.toString());
    } finally {
      try {
        // Just in case we had some nasty Exception...
        if (!countDownCalled && mCountDownLatch != null) {
          mCountDownLatch.countDown();
        }
        logDebugMessage("THREAD (" + this.getName()
            + "): ended with TX = "+transactionDemarcation.getTransaction()
            +" : rollback == "+mRollback);
        transactionDemarcation.end(mRollback);

        if (mRollback) {
          Map<String, Repository> repositories = 
              mImportService.getTargetRepositories();
          
          for (Repository repository : repositories.values()) {
            ((GSARepository)repository).invalidateCaches();
          }
        }        
        
      } catch (TransactionDemarcationException e) {
        mImportService.vlogError(e.toString());
      } 
    }
    logDebugMessage ("THREAD (" + this.getName() + "): DONE");
  }

  
  protected void processPhase() {
    
    logDebugMessage("processPhase(): ++++++++++++ START PHASE +++++++++++++++++");

    ImportTimer databaseTimer = new ImportTimer(this.getName()
        + " DATABASE TIMER" + " (" + mPhase + ")");

    // Process each of the segments that have been assigned.
    for (int segmentIndex = mStartSegment; segmentIndex <= mEndSegment; segmentIndex++) {

      // Get the file to import.
      String segmentFilename = ImportConstants.M_SEGMENT_FILE_STUB
          + segmentIndex + ImportConstants.M_SEGMENT_FILE_EXTENSION;
      File segmentFile = new File(mImportService.getImportDirectory(),
          segmentFilename);

      ImportFileParser importFileParser = new ImportFileParser(mPhase,
          segmentFile);
      ImportItem[] importItems = importFileParser.parseFile();

      databaseTimer.start();

      if (!processItems(importItems, segmentIndex)) {
        // Processing has aborted!
        logErrorMessage("THREAD (" + this.getName()
            + "): Batch processing failed. Logging details with parent.");
        mImportService.logBatchFailure(segmentIndex, mPhase);
        break;
      }

      databaseTimer.stop();
      logDebugMessage(databaseTimer.getTimeString());
    }

    logDebugMessage("processPhase(): ++++++++++++ END PHASE +++++++++++++++++");
  }
  

  protected boolean processItems(ImportItem[] pImportItems, int pSegmentIndex) {
    boolean batchCompleted = false;
    boolean batchAborted = false;
    
    HashMap<Integer, ImportFailedItem> failedItems = new HashMap<Integer, ImportFailedItem>();

    logDebugMessage("processItems() - Entered method: pImportItems == "
        + pImportItems + " pSegmentIndex ==" + pSegmentIndex);

    for (int itemIndex = 0; itemIndex < pImportItems.length; itemIndex++) {
      // Check to see if some other thread has triggered
      // an abort (AbortOnError policy only)
      if (isJobAborted()) {
        batchAborted = true;
        break;
      }

      logDebugMessage("processItems(): Next ImportItem == "
          + pImportItems[itemIndex]);

      switch (mPhase) {
      case ImportConstants.PHASE_ADD_UPDATE:
        // If the action is delete, then just set the status and move on
        // for this phase
        if (pImportItems[itemIndex].getAction() != ImportItem.M_ACTION_DELETE) {
          try {
            importItem(pImportItems[itemIndex]);
          } catch (Throwable t) {
            logErrorMessage(t.toString());

            handleFailedItem(failedItems, itemIndex, pImportItems[itemIndex],
                t.getMessage(), pSegmentIndex);
            if (isFatalJobError(pImportItems[itemIndex], t)) {
              batchAborted = true;
            }
          }
        }
        break;

      case ImportConstants.PHASE_REFERENCE_UPDATE:
        // If the action is delete, then just set the status and move on
        // for this phase
        if (pImportItems[itemIndex].getAction() != ImportItem.M_ACTION_DELETE) {
          try {
            importItem(pImportItems[itemIndex]);
          } catch (Throwable t) {
            logErrorMessage(t.toString());
            t.printStackTrace();

            handleFailedItem(failedItems, itemIndex, pImportItems[itemIndex],
                t.getMessage(), pSegmentIndex);
            if (isFatalJobError(pImportItems[itemIndex], t)) {
              batchAborted = true;
            }
          }
        }
        break;

      case ImportConstants.PHASE_DELETE:
        if (pImportItems[itemIndex].getAction() == ImportItem.M_ACTION_DELETE) {
          logDebugMessage("processItems: Calling deleteItem for: "
              + pImportItems[itemIndex].getItemDescriptor() + " : "
              + pImportItems[itemIndex].getItemId());
          boolean deleteSuccessful = false;
          try {
            deleteSuccessful = deleteItem(pImportItems[itemIndex]);
          } catch (Throwable t) {
            logErrorMessage(t.toString());

            handleFailedItem(failedItems, itemIndex, pImportItems[itemIndex],
                t.getMessage(), pSegmentIndex);
            if (isFatalJobError(pImportItems[itemIndex], t)) {
              batchAborted = true;
            }
          }

          if (!deleteSuccessful) {
            logDebugMessage("processItems: Delete failed. Add it to the list: "
                + pImportItems[itemIndex].getItemDescriptor() + " : "
                + pImportItems[itemIndex].getItemId());

            // Add to the items. No need to log failure now as we will be
            // retrying this.
            mImportService.getFailedDeletions().add(pImportItems[itemIndex]);
          }
        }
        break;
      }
      
      if (batchAborted) {
        break;
      }
      
    } // End for

    if (!batchAborted) {
      batchCompleted = true;
    }

    // Check if we have any errors to write.
    if (!failedItems.isEmpty()) {
      for (Integer key : failedItems.keySet()) {
        ImportFailedItem failedItem = (ImportFailedItem) failedItems.get(key);
        mImportService.logFailedItem(failedItem, mPhase);
      }
      failedItems.clear();

      // Tell the import service.
      mImportService.setDataImportErrors();
    }

    logDebugMessage("processItems() - Leaving method: batchProcessed == "
        + batchCompleted);
    // Return the result of the batch processing
    return (batchCompleted);
  }
  
  
  /**
   * @param failedItems
   * @param pItemIndex
   * @param pFailedItem
   * @param pMessage
   * @param pSegmentIndex
   */
  protected void handleFailedItem(
      Map<Integer, ImportFailedItem> failedItems,
      int pItemIndex,
      ImportItem pFailedItem, 
      String pMessage, 
      int pSegmentIndex) {

    ImportFailedItem failedItem = new ImportFailedItem();

    failedItem.setItemId(pFailedItem.getItemId());
    failedItem.setItemDescriptor(pFailedItem.getItemDescriptor());
    failedItem.setAction(pFailedItem.getAction());
    failedItem.setMesssage(pMessage);
    failedItem.setBatchFilename(ImportConstants.M_SEGMENT_FILE_STUB + pSegmentIndex
        + ImportConstants.M_SEGMENT_FILE_EXTENSION);
    failedItems.put(Integer.valueOf(pItemIndex), failedItem);

  }
  
  
  /**
   * @param pImportItem
   * @param pThrowable
   * @return
   */
  protected boolean isFatalJobError(
      ImportItem pImportItem, Throwable pThrowable) {

    String message = (pThrowable.getMessage() != null) ? pThrowable
        .getMessage() : pThrowable.toString();
    JobErrorBuilder builder = new JobErrorBuilder(ErrorType.ImportError,
        message);
    builder.setItemId(pImportItem.getItemId()).setItemType(
        pImportItem.getItemDescriptor()).setExportItemId(
            pImportItem.getExportItemId());
    if (pThrowable instanceof RepositoryException) {
      String detailMessage = pThrowable.getMessage();
      // If its a RepositoryException like - 
      // "Can't find item with id=42-5TFXB of type=product"
      if (!StringUtils.isEmpty(detailMessage) && 
          detailMessage.startsWith("Can't find item with id=")) {
        detailMessage = detailMessage.replaceAll("Can't find item with id=", "");
        detailMessage = detailMessage.replaceAll("of type=", "");
        String[] parts = detailMessage.split(" ");
        builder.setReferenceItemId(parts[0]);
        builder.setReferenceItemType(parts[1]);
      }     
    }
    boolean abort = mImportService.getJobManager().processJobError(
        mImportService.getExportJobId(), builder.build());
    return abort;
  }
  
  

  // -------------------------------------
  /**
   * Imports the repository item into the target repository.
   * 
   * @param pImportItem
   *          the item to be imported.
   * 
   * @return true if the item was deployed, false otherwise
   */
  protected void importItem(ImportItem pImportItem) throws RepositoryException {
    logDebugMessage("importItem() - Entered method: pImportItem == " + pImportItem);
    MutableRepositoryItem targetItem = null;
    GSARepository targetRepository = getTargetRepository(pImportItem);
    
    if (targetRepository == null) {
      throw new RepositoryException("No target repository specified");
    }

    // Strict mode - higher performance
    if (mPhase == ImportConstants.PHASE_ADD_UPDATE) {
      // If action is update, either get the item, or marker that it should be
      // created ??>
      // logDebugMessage ("importItem: ADD UPDATE Phase");
      if (pImportItem.getAction() == ImportItem.M_ACTION_ADD) {
        // logDebugMessage ("importItem: Action is ADD");
        // logDebugMessage ("Creating Item: " + pImportItem.getItemDescriptor()
        // + " Id: " + pImportItem.getItemId());

        targetItem = targetRepository.createItem(pImportItem.getItemId(), pImportItem.getItemDescriptor());
      } else if (pImportItem.getAction() == ImportItem.M_ACTION_UPDATE) {
        // logDebugMessage ("importItem: Action is UPDATE so get the item");

        targetItem = (MutableRepositoryItem) targetRepository.getItemForUpdate(pImportItem.getItemId(),
            pImportItem.getItemDescriptor());

        if (targetItem == null) {
          // logMessage (
          // "importItem: Didnt find the item and in strict mode so its an exception"
          // );
          throw new RepositoryException("Update item not found in target");
        }
      }
    } else {
      // Since we are not in the ADD_UPDATE phase we'll always need the target
      // item.
      // logDebugMessage ("importItem: Not ADD UPDATE Phase");
      // logDebugMessage ("Retrieving Item: " + pImportItem.getItemDescriptor()
      // + " Id: " + pImportItem.getItemId());
      targetItem = (MutableRepositoryItem) targetRepository.getItemForUpdate(pImportItem.getItemId(),
          pImportItem.getItemDescriptor());

      if (targetItem == null) {
        logDebugMessage("importItem: Failed to get the item for Reference update. It should be there");
        throw new RepositoryException("Update item not found in target");
      }
    }
    // logDebugMessage("targetItem == "+targetItem);

    // Set the properties
    setProperties(targetRepository, targetItem, pImportItem);

    if ((mPhase == ImportConstants.PHASE_ADD_UPDATE) && (pImportItem.getAction() == ImportItem.M_ACTION_ADD)) {
      logDebugMessage("Adding Item: " + pImportItem.getItemDescriptor() + " Id: " + pImportItem.getItemId());
      targetRepository.addItem(targetItem);
    } else {
      logDebugMessage("Updating Item: " + pImportItem.getItemDescriptor() + " Id: " + pImportItem.getItemId());
      targetRepository.updateItem(targetItem);
    }
    // logDebugMessage
    // ("importItem() - Leaving method: pImportItem == "+pImportItem);
  }

  // -------------------------------------
  /**
   * This method attempts to delete the given item. If it fails its most likely
   * because another item is referencing this one. It will get cleaned up in a
   * later attempt.
   * 
   * @exception RepositoryException
   *              If this delete failed.
   */

  protected boolean deleteItem(ImportItem pImportItem) throws RepositoryException {
    // logDebugMessage
    // ("deleteItem() - Entered method: pImportItem == "+pImportItem);
    boolean deleteSuccessful = true;
    MutableRepositoryItem targetItem;
    GSARepository targetRepository = getTargetRepository(pImportItem);
    
    if (targetRepository == null) {
      throw new RepositoryException("No target repository specified");
    }

    try {
      // logDebugMessage ("deleteItem: Checking if deletion item exists: "
      // + pImportItem.getItemDescriptor() + " : " + pImportItem.getItemId());

      targetItem = (MutableRepositoryItem) targetRepository.getItem(pImportItem.getItemId(),
          pImportItem.getItemDescriptor());

      if (targetItem != null) {
        logDebugMessage("deleteItem: targetItem == " + targetItem);
        RepositoryUtils.removeReferencesToItem(targetItem);
        targetRepository.removeItem(pImportItem.getItemId(), pImportItem.getItemDescriptor());
        logDebugMessage("deleteItem: Item removed - " + targetItem);
      } else {
        logDebugMessage("deleteItem: Item not found");
        deleteSuccessful = false;
      }
    } catch (RepositoryException e) {
      logDebugMessage("deleteItem: Got error removing item likely due to foreign reference. Will be removed later: "
          + e.getMessage());
      return false;
    } catch (Throwable t) {
      logDebugMessage("deleteItem: Got a throwable exception: " + t.getMessage());
      throw new RepositoryException(t);
    }

    return deleteSuccessful;
  }

  protected void setProperties(GSARepository pRepository, MutableRepositoryItem pRepositoryItem, ImportItem pImportItem)
      throws RepositoryException {


    ParserContext context = new ParserContext();
    Object value = null;

    // Set property values
    // Only set non-required reference properties on PASS_REFERENCE_UPDATE
    HashMap<String, String> properties = pImportItem.getProperties();

    for (String key : properties.keySet()) {
      String valueString = properties.get(key);
      
      
      // logDebugMessage("setProperties: next property key:value == " + key +
      // ":" +valueString);

      RepositoryPropertyDescriptor repositoryPropertyDescriptor = (RepositoryPropertyDescriptor) pRepositoryItem
          .getItemDescriptor().getPropertyDescriptor(key);

      // logDebugMessage("setProperties(): repositoryPropertyDescriptor == "
      // +repositoryPropertyDescriptor);
      if (repositoryPropertyDescriptor == null) {
        throw new RepositoryException("Cannot get property descriptor for property " + key + " on item "
            + pRepositoryItem.getItemDescriptor().getItemDescriptorName());
      }

      boolean setProperty = true;
      boolean generatedProperty = false;

      if (mPhase == ImportConstants.PHASE_ADD_UPDATE) {
        // If it's required we must set it.
        if (repositoryPropertyDescriptor.isRequired()) {

          // If its a required reference we must generate a dummy value.
          if (repositoryPropertyDescriptor.getPropertyType() == RepositoryItem.class) {
            RepositoryItemDescriptor referencedItemDescriptor = repositoryPropertyDescriptor
                .getPropertyItemDescriptor();

            value = mImportService.getReferenceItemGenerator().findDummyReferenceItem(
                (MutableRepository) referencedItemDescriptor.getRepository(),
                referencedItemDescriptor.getItemDescriptorName(), (GSAPropertyDescriptor) repositoryPropertyDescriptor);

            // logDebugMessage("setProperties(): !!! GENERATED property value == "+value);
            generatedProperty = true;
          }
        } else if (repositoryPropertyDescriptor.isIdProperty()) {
          setProperty = false;
        } else if (repositoryPropertyDescriptor.getPropertyType() == RepositoryItem.class) {
          setProperty = false;
        } else if (repositoryPropertyDescriptor.isMultiValued()
            && repositoryPropertyDescriptor.getComponentPropertyType() == RepositoryItem.class) {
          setProperty = false;
        }
      } else if (mPhase == ImportConstants.PHASE_REFERENCE_UPDATE) {
        if (repositoryPropertyDescriptor.getPropertyType() == RepositoryItem.class) {
          setProperty = true;
        } else if (repositoryPropertyDescriptor.isMultiValued()
            && repositoryPropertyDescriptor.getComponentPropertyType() == RepositoryItem.class) {
          setProperty = true;
        } else {
          setProperty = false;
        }
      } else if (mPhase == ImportConstants.PHASE_DELETE) {
        setProperty = false;
      } else {
        setProperty = false;
      }

      if (setProperty) {
        // Check for a generated value.
        if (!generatedProperty) {
          // Check that the xml string value is not null or empty.
          if ((valueString != null) && (!valueString.equalsIgnoreCase("null"))
              && (!valueString.equalsIgnoreCase(""))) {
            // Convert the string to its object form.
            value = TemplateParser.convertStringToValue(pRepository, context,
                pImportItem.getItemDescriptor(), key, valueString,
                pRepositoryItem);
          } else {
            value = null;
          }
        }
        
        // Set the property. Used to check for null but this caused a bug where
        // a value
        // was unset in Siebel but then not cleared in ATG repository.
        try {
          pRepositoryItem.setPropertyValue(key, value);
        } catch (Throwable t) {
          logErrorMessage(
              "Exception in ImportWorkerThread.setProperties() - "
                  +t.toString());
          if (!(t instanceof RepositoryException)) {
            throw new RepositoryException(t);
          }
        }
      }
    }
  }
  
  
  protected synchronized GSARepository getTargetRepository(ImportItem pImportItem) {
    return (GSARepository)mImportService.getTargetRepository(pImportItem.getRepositoryName());
  }

  protected void logDebugMessage(String pMessage) {
    if (mImportService.isLoggingDebug()) {
      mImportService.logDebug(pMessage);
    }  
    logMessage(pMessage);
  }
  
  protected void logErrorMessage(String pMessage) {
    mImportService.logError(pMessage);  
    logMessage(pMessage);
  }

  protected FileWriter createLogFileWriter() {
    File logFilePath = mImportService.getLogFilePath();
    if (!logFilePath.exists()) {
      logFilePath.mkdirs();
    }
    
    String logFilename = logFilePath.getAbsolutePath() + File.separator + this.getName() + ".log";
    try {
      File logFile = new File(logFilename);
      logFile.createNewFile();
      FileWriter logFileWriter = new FileWriter(logFile, false);
      return logFileWriter;
    } catch (IOException e) {
      mImportService.vlogError(
          "IOException in method createLogFileWriter() of ImportWorkerThread : {0}", e.getMessage());
    }
    return null;
  }

  protected void logMessage(String pMessage) {
    try {
      if (mLogFileWriter != null) {
        mLogFileWriter.write(pMessage + "\n");
        mLogFileWriter.flush();
      }
    } catch (IOException e) {
    }
  }

  protected boolean isJobAborted() {
    if (mImportService.getJobManager().shouldAbort(
        mImportService.getExportJobId())) {
      return true;
    }
    return false;
  }
}
