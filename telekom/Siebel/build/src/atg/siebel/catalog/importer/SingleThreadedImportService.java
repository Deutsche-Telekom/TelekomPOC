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

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import javax.sql.DataSource;
import javax.transaction.TransactionManager;

import atg.adapter.gsa.GSARepository;
import atg.adapter.gsa.xml.ImportWorkerThread;
import atg.adapter.util.RepositoryUtils;
import atg.core.i18n.LayeredResourceBundle;
import atg.core.util.ResourceUtils;
import atg.core.util.StringUtils;
import atg.dtm.TransactionDemarcation;
import atg.dtm.TransactionDemarcationException;
import atg.nucleus.GenericService;
import atg.nucleus.Nucleus;
import atg.repository.MutableRepository;
import atg.repository.Repository;
import atg.repository.RepositoryException;
import atg.repository.RepositoryItem;
import atg.siebel.catalog.job.ImportJobEnums.ProcessingPhase;
import atg.siebel.catalog.job.ImportJobManager;

/**
 * This class provides an import service, which enables customers to import
 * their data into a versioned repository.
 */
public class SingleThreadedImportService extends GenericService implements ImportServiceInterface {
  // -------------------------------------
  public static String CLASS_VERSION = "$Id: //product/Siebel/version/11.2/src/atg/siebel/catalog/importer/SingleThreadedImportService.java#2 $$Change: 1194813 $";

  // -------------------------------------

  static final String MY_RESOURCE_NAME = "atg.siebel.catalog.importer.ImportResources";

  protected static final String BACKSLASH = "\\";
  protected static final String FORWARDSLASH = "/";

  protected static java.util.ResourceBundle sResourceBundle = LayeredResourceBundle
      .getBundle(MY_RESOURCE_NAME,
          atg.service.dynamo.LangLicense.getLicensedDefault());

  // -------------------------------------
  // property: transactionManager
  // -------------------------------------
  private TransactionManager mTransactionManager = null;

  /* (non-Javadoc)
   * @see atg.siebel.catalog.importer.ImportServiceInterface#getTransactionManager()
   */
  @Override
  public TransactionManager getTransactionManager() {
    return mTransactionManager;
  }

  /* (non-Javadoc)
   * @see atg.siebel.catalog.importer.ImportServiceInterface#setTransactionManager(javax.transaction.TransactionManager)
   */
  @Override
  public void setTransactionManager(TransactionManager pTransactionManager) {
    mTransactionManager = pTransactionManager;
  }

  // -----------------------------
  // property: importFileLocation
  // -----------------------------
  String mImportFileLocation;

  /* (non-Javadoc)
   * @see atg.siebel.catalog.importer.ImportServiceInterface#getImportFileLocation()
   */
  @Override
  public String getImportFileLocation() {
    return mImportFileLocation;
  }

  /* (non-Javadoc)
   * @see atg.siebel.catalog.importer.ImportServiceInterface#setImportFileLocation(java.lang.String)
   */
  @Override
  public void setImportFileLocation(String pImportFileLocation) {
    mImportFileLocation = pImportFileLocation;
  }

  // -----------------------------
  // property: canDisableIndexes
  // -----------------------------
  boolean mCanDisableIndexes = true;

  /* (non-Javadoc)
   * @see atg.siebel.catalog.importer.ImportServiceInterface#isCanDisableIndexes()
   */
  @Override
  public boolean isCanDisableIndexes() {
    return mCanDisableIndexes;
  }

  /* (non-Javadoc)
   * @see atg.siebel.catalog.importer.ImportServiceInterface#setCanDisableIndexes(boolean)
   */
  @Override
  public void setCanDisableIndexes(boolean pCanDisableIndexes) {
    mCanDisableIndexes = pCanDisableIndexes;
  }

  // -------------------------------------
  // property: importDirectory
  // -------------------------------------
  String mImportDirectory;

  /* (non-Javadoc)
   * @see atg.siebel.catalog.importer.ImportServiceInterface#getImportDirectory()
   */
  @Override
  public String getImportDirectory() {
    if (StringUtils.isEmpty(mImportDirectory)) {
      int endIdx = mImportFileLocation.lastIndexOf(BACKSLASH);
      if (endIdx > -1) {
        mImportDirectory = mImportFileLocation.substring(0, endIdx + 1);
      } else {
        endIdx = mImportFileLocation.lastIndexOf(FORWARDSLASH);
        if (endIdx > -1) {
          mImportDirectory = mImportFileLocation.substring(0, endIdx + 1);
        }
      }
    }
    return mImportDirectory;
  }

  /* (non-Javadoc)
   * @see atg.siebel.catalog.importer.ImportServiceInterface#setImportDirectory(java.lang.String)
   */
  @Override
  public void setImportDirectory(String pImportDirectory) {
    mImportDirectory = pImportDirectory;
  }

  // -----------------------------
  // property: logFilePath
  // -----------------------------
  File mLogFilePath;

  /* (non-Javadoc)
   * @see atg.siebel.catalog.importer.ImportServiceInterface#getLogFilePath()
   */
  @Override
  public File getLogFilePath() {
    return mLogFilePath;
  }

  /* (non-Javadoc)
   * @see atg.siebel.catalog.importer.ImportServiceInterface#setLogFilePath(java.io.File)
   */
  @Override
  public void setLogFilePath(File pLogFilePath) {
    if (pLogFilePath.getAbsolutePath().endsWith(File.separator)) {
      mLogFilePath = pLogFilePath;
    } else {
      String tmpLogFilePath = pLogFilePath.getAbsolutePath() + File.separator;
      mLogFilePath = new File(tmpLogFilePath);
    }
  }

  // -----------------------------
  // property: useDASImportTool
  // -----------------------------
  boolean mUseDASImportTool;

  /* (non-Javadoc)
   * @see atg.siebel.catalog.importer.ImportServiceInterface#isUseDASImportTool()
   */
  @Override
  public boolean isUseDASImportTool() {
    return mUseDASImportTool;
  }

  /* (non-Javadoc)
   * @see atg.siebel.catalog.importer.ImportServiceInterface#setUseDASImportTool(boolean)
   */
  @Override
  public void setUseDASImportTool(boolean pUseDASImportTool) {
    mUseDASImportTool = pUseDASImportTool;
  }

  // -----------------------------
  // property: exportJobId
  // -----------------------------
  String mExportJobId = null;

  /* (non-Javadoc)
   * @see atg.siebel.catalog.importer.ImportServiceInterface#getExportJobId()
   */
  @Override
  public String getExportJobId() {
    return mExportJobId;
  }

  /* (non-Javadoc)
   * @see atg.siebel.catalog.importer.ImportServiceInterface#setExportJobId(java.lang.String)
   */
  @Override
  public void setExportJobId(String pExportJobId) {
    this.mExportJobId = pExportJobId;
  }

  // -----------------------------
  // property: jobManager
  // -----------------------------
  protected ImportJobManager mJobManager;

  /* (non-Javadoc)
   * @see atg.siebel.catalog.importer.ImportServiceInterface#getJobManager()
   */
  @Override
  public ImportJobManager getJobManager() {
    return mJobManager;
  }

  /* (non-Javadoc)
   * @see atg.siebel.catalog.importer.ImportServiceInterface#setJobManager(atg.siebel.catalog.job.ImportJobManager)
   */
  @Override
  public void setJobManager(ImportJobManager pJobManager) {
    mJobManager = pJobManager;
  }

  // Target Repositories
  Map<String, Repository> mTargetRepositories;

  /* (non-Javadoc)
   * @see atg.siebel.catalog.importer.ImportServiceInterface#getTargetRepository(java.lang.String)
   */
  @Override
  public Repository getTargetRepository(String pTargetRepository) {
    vlogDebug("Entered SingleThreadedImportService.getTargetRepository: pTargetRepository = {0}", 
        pTargetRepository);
    if (mTargetRepositories == null) {
      mTargetRepositories = new HashMap<String, Repository>();
    }

    if (!mTargetRepositories.containsKey(pTargetRepository)) {
      Object obj = Nucleus.getGlobalNucleus().resolveName(pTargetRepository);
      if (obj instanceof GSARepository) {
        mTargetRepositories.put(pTargetRepository, (GSARepository) obj);
      } else {
        vlogError("SingleThreadedImportService.getTargetRepository: Error creating " +
            "repository: {0}. object created ({1}) was not of type GSARepository",
            pTargetRepository, obj.toString());
        // TODO throw and exception here, the defined target repository cant be
        // created because ???
      }
    }
    return mTargetRepositories.get(pTargetRepository);
  }

  /* (non-Javadoc)
   * @see atg.siebel.catalog.importer.ImportServiceInterface#getTargetRepositories()
   */
  @Override
  public Map<String, Repository> getTargetRepositories() {
    return mTargetRepositories;
  }

  /* (non-Javadoc)
   * @see atg.siebel.catalog.importer.ImportServiceInterface#setTargetRepositories(java.util.Map)
   */
  @Override
  public void setTargetRepositories(Map<String, Repository> pRepositories) {
    mTargetRepositories = pRepositories;
  }


  // -----------------------------
  // Internal member data.
  // -----------------------------

  ImportSession mSession;

  /* (non-Javadoc)
   * @see atg.siebel.catalog.importer.ImportServiceInterface#getImportSession()
   */
  @Override
  public ImportSession getImportSession() {
    return mSession;
  }

  String mServiceStatus = ImportConstants.M_SERVICE_STATUS_WAITING_TO_START;

  /* (non-Javadoc)
   * @see atg.siebel.catalog.importer.ImportServiceInterface#getServiceStatus()
   */
  @Override
  public String getServiceStatus() {
    return mServiceStatus;
  }

  ReferenceItemGenerator mReferenceItemGenerator;

  /* (non-Javadoc)
   * @see atg.siebel.catalog.importer.ImportServiceInterface#getReferenceItemGenerator()
   */
  @Override
  public ReferenceItemGenerator getReferenceItemGenerator() {
    return mReferenceItemGenerator;
  }

  ArrayList<ImportItem> mFailedDeletions = new ArrayList<ImportItem>();

  /* (non-Javadoc)
   * @see atg.siebel.catalog.importer.ImportServiceInterface#getFailedDeletions()
   */
  @Override
  public ArrayList<ImportItem> getFailedDeletions() {
    return mFailedDeletions;
  }

  boolean mDataImportErrors = false;

  /* (non-Javadoc)
   * @see atg.siebel.catalog.importer.ImportServiceInterface#setDataImportErrors()
   */
  @Override
  public void setDataImportErrors() {
    mDataImportErrors = true;
  }

  private ImportWorkerThread[] mImportWorkerThreads = new ImportWorkerThread[1];

  private int[] mImportWorkerThreadsStatus = new int[1];

  private int mTotalAssets = 0;

  private long mAssetsPerSecond;

  private long mTotalTime;

  private FileWriter mFailedItemsFileWriter;

  private Map<Connection, List<String>> mIndexNames;

  private List<Connection> mDatabaseConnections = null;

  private String mDatabasePassword;

  // -------------------------------------
  // Constructor
  // -------------------------------------
  public SingleThreadedImportService() {
  }

  // -------------------------------------
  /* (non-Javadoc)
   * @see atg.siebel.catalog.importer.ImportServiceInterface#executeImport()
   */
  @Override
  public boolean executeImport() throws Exception {
    logDebugMessage("SingleThreadedImportService.executeImport() called.");

    mJobManager.setJobPhase(mExportJobId, ProcessingPhase.IMPORT_START);
    TransactionDemarcation transactionDemarcation = new TransactionDemarcation();
    boolean rollback = true;

    // Set the service status
    mServiceStatus = ImportConstants.M_SERVICE_STATUS_PROJECT_CREATION;

    try {
      transactionDemarcation.begin(getTransactionManager());
      // Create the ImportSession object
      mSession = createImportSession();
      if (mSession == null) {
        // Problem creating session - aborting
        throw new ImportException("Problem creating session - aborting");
      }
      mSession.setTransactionCount(0);
      mSession.setSessionStatus(ImportSession.SESSION_OK);
      rollback = false;
    } finally {
      transactionDemarcation.end(rollback);
    }

    // Set the service status
    mServiceStatus = ImportConstants.M_SERVICE_STATUS_PRE_DATA_IMPORT;

    // Find the import file directory.
    if (mImportDirectory == null) {
      int indexOfLastSeparator = mImportFileLocation.lastIndexOf(File.separator);
      if (indexOfLastSeparator == -1) {
        mImportDirectory = "";
      } else {
        mImportDirectory = mImportFileLocation.substring(0,indexOfLastSeparator);
      }
    }

    // Create the log file for failed items.
    if (createFailedItemLogFile() == false) {
      cancelImport();
      mServiceStatus = ImportConstants.M_SERVICE_STATUS_FATAL_ERROR_IO;
      vlogError("SingleThreadedImportService.executeImport(): Item log file " +
      		"creation failed: mServiceStatus = {0}", mServiceStatus);
      return (false);
    }

    // Do the import
    boolean importSuccess = mSession.importData();
    if (!importSuccess) {
      // Data import unsuccessful.
      vlogError("SingleThreadedImportService.executeImport(): Data import was " +
      		"unsuccessful. Cancelling the import");
      cancelImport();
      return (false);
    }

    mServiceStatus = ImportConstants.M_SERVICE_STATUS_PROJECT_ADVANCE_WORKFLOW;

    transactionDemarcation = new TransactionDemarcation();
    rollback = true;
    try {
      transactionDemarcation.begin(getTransactionManager());
      endImportSession();
      rollback = false;
    } finally {
      transactionDemarcation.end(rollback);
    }

    if (mDataImportErrors) {
      mServiceStatus = ImportConstants.M_SERVICE_STATUS_COMPLETED_WITH_ERRORS;
    } else {
      mServiceStatus = ImportConstants.M_SERVICE_STATUS_COMPLETED_SUCCESSFULLY;
    }
    vlogDebug("Leaving SingleThreadedImportService.executeImport(): mServiceStatus = {0}",
          mServiceStatus);
    return (true);
  }

  private boolean prepareImport() {
    logDebugMessage("SingleThreadedImportService.prepareImport() called.");

    mImportWorkerThreads = null;
    mImportWorkerThreadsStatus = null;

    mServiceStatus = ImportConstants.M_SERVICE_STATUS_DATA_IMPORT_BATCH_CREATION;

    if (!prepareImportFile()) {
      mServiceStatus = ImportConstants.M_SERVICE_STATUS_FATAL_ERROR_IO;
      vlogError("SingleThreadedImportService.prepareImport(): Problem preparing" +
      		" import file: mServiceStatus = {0}", mServiceStatus);
      return (false);
    }

    initiateImportWorkerThread();

    logDebugMessage("SingleThreadedImportService.prepareImport(): Sleeping for " +
      		"2 seconds to allow all threads to get started");
    try {
      Thread.sleep(1000 * (2));
    } catch (InterruptedException e) {
    }

    logDebugMessage("Leaving SingleThreadedImportService.prepareImport().");
    return true;
  }

  // -------------------------------------
  /**
   * This method runs a SINGLE-threaded data import.
   * 
   * @throws RepositoryException
   */
  protected boolean doImport() {
    logDebugMessage("SingleThreadedImportService.doImport() called.");

    boolean batchProcessed = false;
    boolean rollback = true;

    ImportTimer timer = new ImportTimer("TOTAL TIME");

    // ============ ADD / UPDATE PHASE ==============.
    mServiceStatus = ImportConstants.M_SERVICE_STATUS_DATA_IMPORT_ADD_UPDATE_PHASE;
    mJobManager.setJobPhase(mExportJobId, ProcessingPhase.IMPORT_ADD_UPDATE);
    timer.start();
    logDebugMessage("SingleThreadedImportService.doImport(): About to start ADD / UPDATE phase");
    performPhase(ImportConstants.PHASE_ADD_UPDATE);

    // Persist any references that have been generated (by non primary
    // property references)
    try {
      mReferenceItemGenerator.persistReferenceItemList();
    } catch (IOException e) {
      vlogError(e, "SingleThreadedImportService.doImport(): IOException caught: {0}", e.getMessage());
    }

    if (mJobManager.canJobProceedToNextPhase(mExportJobId)) {

      // ============ REFERENCE UPDATE PHASE ==============
      logDebugMessage("SingleThreadedImportService.doImport(): About to start REFERENCE UPDATE PHASE phase");
      mServiceStatus = ImportConstants.M_SERVICE_STATUS_DATA_IMPORT_REFERENCE_UPDATE_PHASE;
      mJobManager.setJobPhase(mExportJobId,
          ProcessingPhase.IMPORT_REFERENCE_UPDATE);
      performPhase(ImportConstants.PHASE_REFERENCE_UPDATE);
      vlogDebug("SingleThreadedImportService.doImport(): time string = {0}", timer.getTimeString());

      if (mJobManager.canJobProceedToNextPhase(mExportJobId)) {

        // ============ DELETE PHASE ==============.
        logDebugMessage("SingleThreadedImportService.doImport(): About to start DELETE phase");
        mServiceStatus = ImportConstants.M_SERVICE_STATUS_DATA_IMPORT_DELETE_PHASE;
        mJobManager.setJobPhase(mExportJobId, ProcessingPhase.IMPORT_DELETE);
        performPhase(ImportConstants.PHASE_DELETE);
        vlogDebug("SingleThreadedImportService.doImport(): time string = {0}", timer.getTimeString());

        // Calling canJobProceedToNextPhase() to set batchProcessed
        // and rollback vars
        if (mJobManager.canJobProceedToNextPhase(mExportJobId)) {
          batchProcessed = true;
          rollback = false;
        } else {
          vlogError("Aborting Job after DELETE PHASE - all repository changes will be rolled back");
        }
      } else {
        vlogError("Aborting Job after REFERENCE UPDATE PHASE - all repository changes will be rolled back");
      }
    } else {
      vlogError("Aborting Job after ADD/UPDATE PHASE - all repository changes will be rolled back");
    }
    // Terminate the import worker threads.
    terminateImportWorkerThreads(rollback);

    mServiceStatus = ImportConstants.M_SERVICE_STATUS_DATA_IMPORT_PROCESSING_FAILED_DELETIONS;
    processFailedDeletions();
    // Remove the dummy reference items.
    mReferenceItemGenerator.deleteAllDummyReferenceItems();

    timer.stop();
    vlogDebug("SingleThreadedImportService.doImport(): time string = {0}", timer.getTimeString());

    // Some stats...
    mTotalTime += timer.getTime();
    long timeInSeconds = (mTotalTime / 1000);
    if (timeInSeconds > 0) {
      mAssetsPerSecond = mTotalAssets / timeInSeconds;
    }

    mJobManager.notifyImportPhaseEnded(mExportJobId, batchProcessed);
    vlogDebug("Leaving SingleThreadedImportService.doImport(), Totals assets processed = {0}, " +
        "Assets processed per second = {1}", mTotalAssets, mAssetsPerSecond);
    return (batchProcessed);
  }

  
  public boolean importData() throws ImportException {
    logDebugMessage("SingleThreadedImportService.importData() called.");

    if (isUseDASImportTool()) {

      // ********************************************
      // At the moment we never do the import this way
      // if we did we would need take account of the multiple repositories
      // ********************************************

      /*
       * PrintWriter ps = new PrintWriter(System.out); String[] loadFiles = new
       * String[1]; loadFiles[0] = mImportFileLocation; try {
       * TemplateParser.importFiles((GSARepository) getImportRepository(),
       * loadFiles, ps, true); } catch (Exception e) { throw new
       * ImportException( "Exception caught importing files into repository.",
       * e); }
       * 
       * if (isLoggingDebug()) { StringBuilder sb = new
       * StringBuilder("Leaving importData(): ");
       * sb.append("Total assets processed = ").append(mTotalAssets);
       * sb.append("Assets processed per second = ").append(mAssetsPerSecond);
       * logDebug(sb.toString()); }
       */
    } else {
      if (createReferenceItemGenerator()) {
        // Prepare the import
        if (!prepareImport()) {
          // log something
          cancelImport();
          return (false);
        }
        return doImport();
      } else {
        cancelImport();
        mServiceStatus = ImportConstants.M_SERVICE_STATUS_FATAL_ERROR_DATABASE;
        vlogError("Failed to create the temporary reference items: mServiceStatus = {0}",
              mServiceStatus);
        return (false);
      }

    }
    return (true);
  }

  // -------------------------------------
  /**
   * This method creates and starts the appropriate number of import worker
   * threads.
   */
  protected void initiateImportWorkerThread() {

    mImportWorkerThreads = new ImportWorkerThread[1];
    mImportWorkerThreadsStatus = new int[1];
    mImportWorkerThreads[0] = new ImportWorkerThread(0, this, 1, 1);
    mImportWorkerThreadsStatus[0] = ImportConstants.THREAD_STATUS_STARTED;
    ExecutorService svc = Executors
        .newFixedThreadPool(mImportWorkerThreads.length);
    svc.execute(mImportWorkerThreads[0]);
  }

  // -------------------------------------
  /**
   * This method starts the import for the specified phase.
   * 
   * @param pCurrentTransaction
   */
  protected void performPhase(int pPhase) {
    CountDownLatch doneSignal = new CountDownLatch(mImportWorkerThreads.length);
    for (int index = 0; index < mImportWorkerThreads.length; index++) {
      // Set the threads phase.
      mImportWorkerThreads[index].setPhase(pPhase);
      mImportWorkerThreads[index].setCountDownLatch(doneSignal);

      // Notify the thread to begin processing.
      synchronized (mImportWorkerThreads[index]) {
        mImportWorkerThreadsStatus[index] = ImportConstants.THREAD_STATUS_NOTIFIED;
        mImportWorkerThreads[index].notify();
      }
    }

    try {
      doneSignal.await();
    } catch (InterruptedException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    vlogDebug("SingleThreadedImportService.performPhase(): Finished Phase - {0}", pPhase);

    return;
  }

  // -------------------------------------
  /**
   * This method starts the appropriate number of import worker threads.
   * 
   * @param pRollback
   */
  protected void terminateImportWorkerThreads(boolean pRollback) {
    logDebugMessage("SingleThreadedImportService.terminateImportWorkerThreads() called");

    // Interrupt the threads.
    for (int index = 0; index < mImportWorkerThreads.length; index++) {      
      mImportWorkerThreads[index].terminate(pRollback);
    }

    // Wait on them to stop.
    for (int index = 0; index < mImportWorkerThreads.length; index++) {
      try {
        mImportWorkerThreads[index].join();
      } catch (InterruptedException e) {
      }
    }
    logDebugMessage("SingleThreadedImportService.terminateImportWorkerThreads(): " +
    		"All threads should now be dead !!!");
  }

  /* (non-Javadoc)
   * @see atg.siebel.catalog.importer.ImportServiceInterface#notifyThreadStatus(int, java.lang.String, int)
   */
  @Override
  public synchronized void notifyThreadStatus(int pThreadIndex, String pName,
      int pStatus) {
    mImportWorkerThreadsStatus[pThreadIndex] = pStatus;
  }

  /* (non-Javadoc)
   * @see atg.siebel.catalog.importer.ImportServiceInterface#processFailedDeletions()
   */
  @Override
  public synchronized void processFailedDeletions() {
    int pass = 1;
    ArrayList<ImportItem> toRemove = mFailedDeletions;
    ImportItem importItem;
    boolean rollback = true;
    RepositoryItem itemToRemove = null;

    if (toRemove.size() == 0) {
      return;
    }

    while (!toRemove.isEmpty() && pass < 25) {
      Iterator<ImportItem> iterator = toRemove.iterator();

      while (iterator.hasNext()) {
        TransactionDemarcation transactionDemarcation = new TransactionDemarcation();

        try {
          transactionDemarcation.begin(getTransactionManager(),
              TransactionDemarcation.REQUIRED);

          importItem = (ImportItem) iterator.next();

          MutableRepository targetRepository = (MutableRepository) getTargetRepository(importItem
              .getRepositoryName());
          itemToRemove = targetRepository.getItem(importItem.getItemId(),
              importItem.getItemDescriptor());

          if (itemToRemove != null) {
            RepositoryUtils.removeReferencesToItem(itemToRemove);
            targetRepository.removeItem(importItem.getItemId(),
                importItem.getItemDescriptor());
          }

          rollback = false;
        } catch (RepositoryException e) {
          // Failed to remove item. It is probably used as a reference. Tr it
          // again later.
        } catch (TransactionDemarcationException e) {
          // Transaction failed.
        } finally {
          try {
            transactionDemarcation.end(rollback);

            if (!rollback) {
              iterator.remove();
            }
          } catch (TransactionDemarcationException e) {
          }
        }
      } // While

      pass++;
    }
  }

  
  private boolean prepareImportFile() {
    File mappedImportFile = null;
    File mappedAndReorderedImportFile = null;
    OutputStreamWriter fileWriter = null;
    String filename = null;
    boolean createNewFile = true;
    boolean writeLineToRecord = false;
    String line;
    ArrayList<String> additions = new ArrayList<String>();
    ArrayList<String> others = new ArrayList<String>();
    StringBuffer record = new StringBuffer();
    boolean addRecord = false;

    mTotalAssets = 0;

    // Check that the import file has been set.

    if (mImportFileLocation == null) {
      logDebugMessage("SingleThreadedImportService.prepareImportFile(): No import file specified.");
      return false;
    }

    // Check that the specified import file exists.

    mappedImportFile = new File(mImportFileLocation);

    if (!mappedImportFile.exists()) {
      logDebugMessage("SingleThreadedImportService.prepareImportFile(): The specified import file does not exist.");
      return false;
    }

    // Read the import file line by line.

    try {
      BufferedReader bufferedReader = new BufferedReader(new FileReader(
          mappedImportFile));

      while ((line = bufferedReader.readLine()) != null) {
        // Look for any of the start item tags in this line.

        if (line.contains(ImportConstants.M_TAG_ADD_ITEM_START)
            || line.contains(ImportConstants.M_TAG_UPDATE_ITEM_START)
            || line.contains(ImportConstants.M_TAG_REMOVE_ITEM_START)) {

          // Create a new record.

          record = new StringBuffer();

          record.append(line + "\n");

          if (line.contains(ImportConstants.M_TAG_ADD_ITEM_START)) {
            addRecord = true;
          } else {
            addRecord = false;
          }

          // Check if a new file needs to be created.

          if (createNewFile) {
            // Create the next file in the sequence.

            filename = ImportConstants.M_SEGMENT_FILE_STUB
                + 1 + ImportConstants.M_SEGMENT_FILE_EXTENSION;
            mappedAndReorderedImportFile = new File(mImportDirectory, filename);
            mappedAndReorderedImportFile.createNewFile();
            // segmentFileWriter = new FileWriter(segmentFile, false);

            OutputStream outputStream = new FileOutputStream(
                mappedAndReorderedImportFile);
            fileWriter = new OutputStreamWriter(outputStream);

            // Write the headers

            fileWriter
                .write("<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"no\"?>\n");
            fileWriter
                .write("<!DOCTYPE gsa-template SYSTEM \"dynamosystemresource:/atg/dtds/gsa/gsa_1.0.dtd\">\n");
            fileWriter.write("<gsa-template>\n");
            fileWriter.flush();

            createNewFile = false;
          }

          writeLineToRecord = true;

          mTotalAssets++;

          if (line.contains(ImportConstants.M_TAG_CLOSE)) {
            if (addRecord) {
              additions.add(record.toString());
            } else {
              others.add(record.toString());
            }            
          }          
        } else if (line.contains(ImportConstants.M_TAG_ADD_ITEM_END)
            || line.contains(ImportConstants.M_TAG_UPDATE_ITEM_END)
            || line.contains(ImportConstants.M_TAG_REMOVE_ITEM_END)) {
          record.append(line + "\n");

          if (addRecord) {
            additions.add(record.toString());
          } else {
            others.add(record.toString());
          }

          writeLineToRecord = false;

          // If a new file is pending, write the footers and close the current
          // file.

          if (createNewFile) {
            // Write the records. Start with the additions.

            if (additions.size() > 0) {
              fileWriter.write("<import-items>\n");

              Iterator<String> additionsIterator = additions.iterator();

              while (additionsIterator.hasNext()) {
                String additionString = additionsIterator.next();
                fileWriter.write(additionString + "\n");
              }

              fileWriter.write("</import-items>\n");
            }

            // Write the records. Start with the additions.

            if (others.size() > 0) {
              Iterator<String> othersIterator = others.iterator();

              while (othersIterator.hasNext()) {
                String otherString = othersIterator.next();
                fileWriter.write(otherString + "\n");
              }
            }

            // Clear out the arrays.

            additions.clear();
            others.clear();

            // Write the footers.

            fileWriter.write("</gsa-template>" + "\n");
            fileWriter.flush();
            fileWriter.close();
          }
        } else if (writeLineToRecord) {
          record.append(line + "\n");
        }
      }

      // Ok, we're done, check if there is still a file to be written.

      if (createNewFile == false) {
        if (additions.size() > 0) {
          fileWriter.write("<import-items>\n");

          Iterator<String> additionsIterator = additions.iterator();

          while (additionsIterator.hasNext()) {
            String additionString = additionsIterator.next();
            fileWriter.write(additionString + "\n");
          }

          fileWriter.write("</import-items>\n");
        }

        // Write the records. Start with the additions.

        if (others.size() > 0) {
          Iterator<String> othersIterator = others.iterator();

          while (othersIterator.hasNext()) {
            String otherString = othersIterator.next();
            fileWriter.write(otherString + "\n");
          }
        }

        fileWriter.write("</gsa-template>" + "\n");
        fileWriter.flush();
        fileWriter.close();
      }
    } catch (IOException io) {
      vlogDebug(io, "SingleThreadedImportService.prepareImportFile(): IOException caught: {0}", 
          io.getMessage());
    }
    return true;
  }

  protected boolean createReferenceItemGenerator() {
    boolean createdSuccessfully = true;

    // Initialise the ReferenceItemGenerator

    mReferenceItemGenerator = new ReferenceItemGenerator(this);

    try {
      mReferenceItemGenerator.initialiseReferenceItemGenerator();
    } catch (RepositoryException e) {
      vlogDebug(e, "SingleThreadedImportService.createReferenceItemGenerator(): RepositoryException caught: {0}",
          e.getMessage());
      createdSuccessfully = false;
    } catch (IOException e) {
      vlogDebug(e, "SingleThreadedImportService.createReferenceItemGenerator(): IOException caught: {0}", e.getMessage());
      createdSuccessfully = false;
    }

    return (createdSuccessfully);
  }

  protected boolean createFailedItemLogFile() {
    boolean success = true;
    String failedItemsFilename = getImportDirectory() + File.separator
        + ImportConstants.M_FAILURES_FILENAME;

    File failedItemsFile = new File(failedItemsFilename);

    try {
      failedItemsFile.createNewFile();
      mFailedItemsFileWriter = new FileWriter(failedItemsFile, false);
    } catch (IOException e) {
      vlogDebug(e, "SingleThreadedImportService.createFailedItemLogFile(): " +
      		"IOException caught: {0}", e.getMessage());
      success = false;
    }

    return success;
  }

  /* (non-Javadoc)
   * @see atg.siebel.catalog.importer.ImportServiceInterface#logBatchFailure(int, int)
   */
  @Override
  public synchronized void logBatchFailure(int pSegmentIndex, int pPhase) {

    logFailureMessage("======== FAILED BATCH ======== (Phase " + pPhase + ")\n");
    logFailureMessage("BATCH FILE: " + ImportConstants.M_SEGMENT_FILE_STUB
        + pSegmentIndex + ImportConstants.M_SEGMENT_FILE_EXTENSION + "\n");
    logFailureMessage("ERROR MESSAGE: Batch rejected or import cancellation received\n");

  }

  /* (non-Javadoc)
   * @see atg.siebel.catalog.importer.ImportServiceInterface#logFailedItem(atg.siebel.catalog.importer.ImportFailedItem, int)
   */
  @Override
  public void logFailedItem(ImportFailedItem pFailedItem, int pPhase) {
    logFailureMessage("======== FAILED ITEM ======== (Phase " + pPhase + ")\n");
    logFailureMessage("TYPE: " + pFailedItem.getItemDescriptor() + "\n");
    logFailureMessage("ID: " + pFailedItem.getItemId() + "\n");

    switch (pFailedItem.getAction()) {
    case ImportItem.M_ACTION_ADD:

      logFailureMessage("ACTION: add-item" + "\n");

      break;

    case ImportItem.M_ACTION_UPDATE:

      logFailureMessage("ACTION: update-item" + "\n");

      break;

    case ImportItem.M_ACTION_DELETE:

      logFailureMessage("ACTION: remove-item" + "\n");

      break;
    }

    logFailureMessage("BATCH FILE: " + pFailedItem.getBatchFilename() + "\n");
    logFailureMessage("ERROR MESSAGE: " + pFailedItem.getMessage() + "\n");
  }

  /* (non-Javadoc)
   * @see atg.siebel.catalog.importer.ImportServiceInterface#logFailureMessage(java.lang.String)
   */
  @Override
  public synchronized void logFailureMessage(String pMessage) {
    try {
      mFailedItemsFileWriter.write(pMessage);
      mFailedItemsFileWriter.flush();
    } catch (IOException e) {
    }
  }

  public boolean disableIndexes() {
    String indexQueryText = null;
    String indexDisableText = null;
    PreparedStatement indexQueryStatement;
    PreparedStatement indexDisableStatement;
    ResultSet indexResults;
    String indexName = null;
    // Iterator indexIterator;

    if (!isCanDisableIndexes()) {
      return true;
    }

    // Connect to the database
    if (databaseConnect() == false) {
      return (false);
    }

    mIndexNames = new HashMap<Connection, List<String>>();

    // Query to get the index names (skip the primary constraints and the LOB
    // indexes)

    for (Connection c : mDatabaseConnections) {
      List<String> indexNames = new ArrayList<String>();
      try {
        indexQueryText = "select a.index_name from user_indexes a, user_constraints b "
            + "where b.CONSTRAINT_NAME != a.index_name and "
            + "b.CONSTRAINT_TYPE = 'P' and "
            + "a.table_name = b.table_name and "
            + "a.generated = 'N' and "
            + "a.INDEX_TYPE = 'NORMAL'";

        indexQueryStatement = c.prepareStatement(indexQueryText);
        indexResults = indexQueryStatement.executeQuery();

        while (indexResults.next()) {
          indexName = indexResults.getString(1);
          indexNames.add(indexName);
        }

        indexResults.close();
        indexQueryStatement.close();
      } catch (SQLException e) {
        vlogDebug(e, "SingleThreadedImportService.disableIndexes(): SQLException with query: {0}", indexQueryText);
        return (false);
      }

      // Process the indexes.

      try {
        Iterator<String> indexIterator = indexNames.iterator();

        while (indexIterator.hasNext()) {
          indexName = (String) indexIterator.next();

          indexDisableText = "alter index " + indexName + " unusable";
          indexDisableStatement = c.prepareStatement(indexDisableText);
          indexDisableStatement.executeUpdate();
          indexDisableStatement.close();
        }
      } catch (SQLException e) {
        vlogDebug(e, "SingleThreadedImportService.disableIndexes(): SQLException" +
        		" disabling index: {0}, with query: {1}", indexName, indexDisableText);
        return (false);
      }
      mIndexNames.put(c, indexNames);
    }
    // Disconnect from the database

    databaseDisconnect();

    return (true);
  }

  public boolean rebuildIndexes() {

    if (!isCanDisableIndexes()) {
      return true;
    }

    // Connect to the database
    if (databaseConnect() == false) {
      return (false);
    }

    // Process the indexes.

    for (Connection c : mIndexNames.keySet()) {

      List<String> indexNames = mIndexNames.get(c);
      String indexName = null;
      String indexRebuildText = null;
      try {
        Iterator<String> indexIterator = indexNames.iterator();

        while (indexIterator.hasNext()) {
          indexName = (String) indexIterator.next();

          indexRebuildText = "alter index " + indexName + " rebuild";
          PreparedStatement indexRebuildStatement = c
              .prepareStatement(indexRebuildText);
          indexRebuildStatement.executeUpdate();
          indexRebuildStatement.close();
        }
      } catch (SQLException e) {
        vlogDebug(e, "SingleThreadedImportService.rebuildIndexes(): SQLException" +
        		" rebuilding index: {0},  with query: {1}", 
            indexName, indexRebuildText);
        return (false);
      }

    }
    // Disconnect from the database
    databaseDisconnect();

    return (true);
  }

  protected boolean databaseConnect() {

    if (mDatabaseConnections == null) {
      mDatabaseConnections = new ArrayList<Connection>();
    }
    try {
      for (Repository repository : mTargetRepositories.values()) {

        DataSource ds = ((GSARepository) repository).getDataSource();
        DatabaseMetaData dmd = ds.getConnection().getMetaData();
        Class.forName(dmd.getDriverName());
        mDatabaseConnections.add(DriverManager.getConnection(dmd.getURL(),
            dmd.getUserName(), mDatabasePassword));
      }
    } catch (Exception e) {
      vlogDebug(e, "SingleThreadedImportService.databaseConnect(): Exception " +
      		"caught while connecting to DB: {0}", e.getMessage());
      return (false);
    }

    return (true);
  }

  protected boolean databaseDisconnect() {
    try {
      for (Connection c : mDatabaseConnections) {
        c.close();
      }
      mDatabaseConnections.clear();
    } catch (SQLException e) {
      vlogDebug("SingleThreadedImportService.databaseDisconnect(): Failed to " +
      		"disconnect from the database: {0}", e.getMessage());
      return (false);
    }

    return (true);
  }

  /* (non-Javadoc)
   * @see atg.siebel.catalog.importer.ImportServiceInterface#endImportSession()
   */

  @Override
  public void endImportSession() throws ImportException {
    logDebugMessage("SingleThreadedImportService.endImportSession() called");

    // Make sure a valid session object exists.
    if ((mSession == null)) {
      String message = ResourceUtils.getMsgResource(
          ImportConstants.INVALID_IMPORT_SESSION, MY_RESOURCE_NAME,
          sResourceBundle);
      vlogError(message);
      throw (new ImportException(ImportConstants.INVALID_IMPORT_SESSION,
          message));
    }

    // Check the session status.

    try {
      if (mSession.getSessionStatus() == ImportConstants.STATUS_SUCCESS) {
        // Commit the transaction.
        logDebugMessage("SingleThreadedImportService.endImportSession(): Commiting the transaction");
        getTransactionManager().getTransaction().commit();
      } else {
        // Rollback the transaction.
        logDebugMessage("SingleThreadedImportService.endImportSession(): Rolling back the transaction");
        getTransactionManager().getTransaction().rollback();
      }
    } catch (Exception e) {
      String[] messageArguments = { e.getMessage() };
      String message = ResourceUtils.getMsgResource(
          ImportConstants.IMPORT_TRANSACTION_COMMIT_ROLLBACK_FAILED,
          MY_RESOURCE_NAME, sResourceBundle, messageArguments);
      vlogError(e, message, e);
      throw (new ImportException(
          ImportConstants.IMPORT_TRANSACTION_COMMIT_ROLLBACK_FAILED, message));
    }

    mSession.endSession();
    logDebugMessage("Leaving SingleThreadedImportService.endImportSession()");

  }

  // -------------------------------------
  /* (non-Javadoc)
   * @see atg.siebel.catalog.importer.ImportServiceInterface#cancelImport()
   */
  @Override
  public void cancelImport() throws ImportException {
    vlogDebug("SingleThreadedImportService.cancelImport() called: mSession == {0}", mSession);
    if ((mSession == null)) {
      String message = ResourceUtils.getMsgResource(
          ImportConstants.INVALID_IMPORT_SESSION, MY_RESOURCE_NAME,
          sResourceBundle);
      vlogError(message);
      throw (new ImportException(ImportConstants.INVALID_IMPORT_SESSION,
          message));
    }
    synchronized (this) {
      mSession.cancelSession();
    }

    return;
  }

  protected ImportSession createImportSession() throws ImportException {
    logDebugMessage("Entered SingleThreadedImportService.createImportSession()");

    Iterator<Repository> iter = mTargetRepositories.values().iterator();
    Repository repository = iter.next();

    if (repository == null) {
      throw new ImportException("repository == null");
    }

    ImportSession session = new ImportSession();

    session.setImportService(this);

    vlogDebug("SingleThreadedImportService.createImportSession(): session == {0}", session);
    return session;
  }
  
  protected void logDebugMessage(String pMessage) {
    if (isLoggingDebug()) {
      logDebug(this.getClass().getName() + " " + System.currentTimeMillis() + " " + pMessage);
    }
  }

}
