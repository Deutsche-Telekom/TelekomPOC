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

import javax.sql.DataSource;
import javax.transaction.TransactionManager;

import atg.adapter.gsa.GSARepository;
import atg.adapter.gsa.xml.ImportWorkerThread;
import atg.adapter.util.RepositoryUtils;
import atg.core.i18n.LayeredResourceBundle;
import atg.core.util.ResourceUtils;
import atg.core.util.StringUtils;
import atg.deployment.agent.DeploymentAgent;
import atg.dtm.TransactionDemarcation;
import atg.dtm.TransactionDemarcationException;
import atg.nucleus.GenericService;
import atg.nucleus.Nucleus;
import atg.repository.MutableRepository;
import atg.repository.Repository;
import atg.repository.RepositoryException;
import atg.repository.RepositoryItem;
import atg.siebel.catalog.job.ImportJobManager;

/**
 * This class provides an import service, which enables customers to import
 * their data into a versioned repository.
 * 
 * The service works on a single xml file and imports its contents into the
 * versioned repository.
 * 
 * You may choose between the early and late workflows. /Content
 * Administration/import-late.wdl for late and /Content
 * Administration/import-early.wdl for early.
 * 
 * @author Patrick Mc Erlean
 * @version $Id:
 *          //user/pmcerlean/main/Import/src/classes/atg/epub/ImportService.
 *          java#2 $
 */
public class ImportService
  extends GenericService
  implements ImportServiceInterface {
  // -------------------------------------
  public static String CLASS_VERSION =
    "$Id: //product/Siebel/version/11.2/src/atg/siebel/catalog/importer/ImportService.java#2 $$Change: 1194813 $";

  // -------------------------------------

  static final String MY_RESOURCE_NAME =
    "atg.siebel.catalog.importer.ImportResources";

  private static final String BACKSLASH = "\\";
  private static final String FORWARDSLASH = "/";

  private static java.util.ResourceBundle sResourceBundle =
    LayeredResourceBundle.getBundle(MY_RESOURCE_NAME,
      atg.service.dynamo.LangLicense.getLicensedDefault());

  // -------------------------------------
  // property: transactionManager
  // -------------------------------------
  private TransactionManager mTransactionManager = null;

  public TransactionManager getTransactionManager() {
    return mTransactionManager;
  }

  public void setTransactionManager(TransactionManager pTransactionManager) {
    mTransactionManager = pTransactionManager;
  }

  // -------------------------------------------------------------------
  // property: itemBatchSize (defaults to 1000)
  // --------------------------------------------------------------------
  private int mItemBatchSize = 1000;

  public int getItemBatchSize() {
    return mItemBatchSize;
  }

  public void setItemBatchSize(int pItemBatchSize) {
    mItemBatchSize = pItemBatchSize;
  }

  // -------------------------------------------------------------------
  // property: maxImportThreads (defaults to 20)
  // --------------------------------------------------------------------
  private int mMaxImportThreads = 20;

  public int getMaxImportThreads() {
    return mMaxImportThreads;
  }

  public void setMaxImportThreads(int pMaxImportThreads) {
    mMaxImportThreads = pMaxImportThreads;
  }

  // -----------------------------
  // property: importFileLocation
  // -----------------------------
  String mImportFileLocation;

  public String getImportFileLocation() {
    return mImportFileLocation;
  }

  public void setImportFileLocation(String pImportFileLocation) {
    mImportFileLocation = pImportFileLocation;
  }

  // -----------------------------
  // property: errorThresholdPerBatch
  // -----------------------------
  private int mErrorThresholdPerBatch = 10;

  public int getErrorThresholdPerBatch() {
    return mErrorThresholdPerBatch;
  }

  public void setErrorThresholdPerBatch(int pErrorThresholdPerBatch) {
    mErrorThresholdPerBatch = pErrorThresholdPerBatch;
  }

  // -----------------------------
  // property: errorThresholdPerImport
  // -----------------------------
  private int mErrorThresholdPerImport = 10;

  public int getErrorThresholdPerImport() {
    return mErrorThresholdPerImport;
  }

  public void setErrorThresholdPerImport(int pErrorThresholdPerImport) {
    mErrorThresholdPerImport = pErrorThresholdPerImport;
  }

  // -----------------------------
  // property: threadMonitorInterval
  // -----------------------------
  private long mThreadMonitorInterval;

  public long getThreadMonitorInterval() {
    return mThreadMonitorInterval;
  }

  public void setThreadMonitorInterval(long pThreadMonitorInterval) {
    mThreadMonitorInterval = pThreadMonitorInterval;
  }

  // -----------------------------
  // property: canDisableIndexes
  // -----------------------------
  private boolean mCanDisableIndexes = true;

  public boolean isCanDisableIndexes() {
    return mCanDisableIndexes;
  }

  public void setCanDisableIndexes(boolean pCanDisableIndexes) {
    mCanDisableIndexes = pCanDisableIndexes;
  }

  // -------------------------------------
  // property: importDirectory
  // -------------------------------------
  private String mImportDirectory;

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

  public void setImportDirectory(String pImportDirectory) {
    mImportDirectory = pImportDirectory;
  }

  // -----------------------------
  // property: logFilePath
  // -----------------------------
  private File mLogFilePath;

  public File getLogFilePath() {
    return mLogFilePath;
  }

  public void setLogFilePath(File pLogFilePath) {
    if (!pLogFilePath.exists()) {
      try {
        pLogFilePath.mkdirs();
      } catch (SecurityException e) {
      }
    }

    mLogFilePath = pLogFilePath;
  }

  // -----------------------------
  // property: useDASImportTool
  // -----------------------------
  private boolean mUseDASImportTool;

  public boolean isUseDASImportTool() {
    return mUseDASImportTool;
  }

  public void setUseDASImportTool(boolean pUseDASImportTool) {
    mUseDASImportTool = pUseDASImportTool;
  }

  // Target Repositories
  private Map<String, Repository> mTargetRepositories;

  public Repository getTargetRepository(String pTargetRepository) {
    vlogDebug("Entered ImportService.getTargetRepository: {0}",
      pTargetRepository);
    if (mTargetRepositories == null) {
      mTargetRepositories = new HashMap<String, Repository>();
    }

    if (!mTargetRepositories.containsKey(pTargetRepository)) {
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

  public void setTargetRepositories(Map<String, Repository> pRepositories) {
    mTargetRepositories = pRepositories;
  }

  /** property: deploymentAgentServiceName */
  String mDeploymentAgentServiceName = "/atg/epub/DeploymentAgent";

  /**
   * Component pathname for the DeploymentAgent handling deployments from the
   * remote publishing DeploymentServer.
   * 
   * @beaninfo description: Component pathname for the DeploymentAgent handling
   *           deployments from the remote publishing DeploymentServer.
   * @param pDeploymentAgentServiceName
   *          new value to set
   **/
  public void setDeploymentAgentServiceName(String pDeploymentAgentServiceName) {
    if (pDeploymentAgentServiceName != null
      && pDeploymentAgentServiceName.length() > 0)
      mDeploymentAgentServiceName = pDeploymentAgentServiceName;
  }

  /**
   * Component pathname for the DeploymentAgent handling deployments from the
   * remote publishing DeploymentServer.
   * 
   * @beaninfo description: Component pathname for the DeploymentAgent handling
   *           deployments from the remote publishing DeploymentServer.
   * @return String
   **/
  public String getDeploymentAgentServiceName() {
    return mDeploymentAgentServiceName;
  }

  /** property: deploymentAgent */
  DeploymentAgent mDeploymentAgent;

  /**
   * The DeploymentAgent as resolved from the property
   * deploymentAgentServiceName. Null is returned if the DeploymentAgent could
   * not be resolved.
   * 
   * @beaninfo description: The DeploymentAgent as resolved from the property
   *           deploymentAgentServiceName.
   * @return DeploymentAgent
   **/
  public DeploymentAgent getDeploymentAgent() {
    if (mDeploymentAgent == null) {
      // Lookup the maintenance service in nucleus.
      Nucleus nuke = Nucleus.getGlobalNucleus();
      mDeploymentAgent =
        (DeploymentAgent) nuke.resolveName(getDeploymentAgentServiceName(),
          true);
    }
    return mDeploymentAgent;
  }

  // -----------------------------
  // property: exportJobId
  // -----------------------------
  String mExportJobId = null;

  /*
   * (non-Javadoc)
   * 
   * @see atg.siebel.catalog.importer.ImportServiceInterface#getExportJobId()
   */
  @Override
  public String getExportJobId() {
    return mExportJobId;
  }

  /*
   * (non-Javadoc)
   * 
   * @see
   * atg.siebel.catalog.importer.ImportServiceInterface#setExportJobId(java.
   * lang.String)
   */
  @Override
  public void setExportJobId(String pExportJobId) {
    this.mExportJobId = pExportJobId;
  }

  // -----------------------------
  // property: jobManager
  // -----------------------------
  protected ImportJobManager mJobManager;

  /*
   * (non-Javadoc)
   * 
   * @see atg.siebel.catalog.importer.ImportServiceInterface#getJobManager()
   */
  @Override
  public ImportJobManager getJobManager() {
    return mJobManager;
  }

  /*
   * (non-Javadoc)
   * 
   * @see
   * atg.siebel.catalog.importer.ImportServiceInterface#setJobManager(atg.siebel
   * .catalog.job.ImportJobManager)
   */
  @Override
  public void setJobManager(ImportJobManager pJobManager) {
    mJobManager = pJobManager;
  }

  // -----------------------------
  // Internal member data.
  // -----------------------------

  private ImportSession mSession;

  public ImportSession getImportSession() {
    return mSession;
  }

  private String mServiceStatus =
    ImportConstants.M_SERVICE_STATUS_WAITING_TO_START;

  public String getServiceStatus() {
    return mServiceStatus;
  }

  private ReferenceItemGenerator mReferenceItemGenerator;

  public ReferenceItemGenerator getReferenceItemGenerator() {
    return mReferenceItemGenerator;
  }

  private ArrayList<ImportItem> mFailedDeletions = new ArrayList<ImportItem>();

  public ArrayList<ImportItem> getFailedDeletions() {
    return mFailedDeletions;
  }

  private boolean mDataImportErrors = false;

  public void setDataImportErrors() {
    mDataImportErrors = true;
  }

  private int mSegmentCount = 0;

  private ImportWorkerThread[] mImportWorkerThreads = null;

  private int[] mImportWorkerThreadsStatus = null;

  private int mTotalAssets = 0;

  private long mAssetsPerSecond;

  private long mTotalTime;

  private FileWriter mFailedItemsFileWriter;

  private int mFailedBatches = 0;

  private Map<Connection, List<String>> mIndexNames;

  private List<Connection> mDatabaseConnections = null;

  private String mDatabasePassword;

  // -------------------------------------
  // Constructor
  // -------------------------------------
  public ImportService() {
  }

  // -------------------------------------
  /**
   * This is the main execution method for the service. This method sets the
   * security context on the thread for the user specified in the userName
   * property. Next, it creates a project and then calls importData(). Next, it
   * attempts to advance the project's workflow. Finally, it unsets the security
   * context.
   */
  public boolean executeImport() throws Exception {
    logDebugMessage("ImportService.executeImport() called.");

    TransactionDemarcation transactionDemarcation =
      new TransactionDemarcation();
    boolean rollback = true;

    // Initialisation
    mTotalAssets = 0;
    mAssetsPerSecond = 0;
    mTotalTime = 0;
    mFailedItemsFileWriter = null;
    mFailedBatches = 0;

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
      int indexOfLastSeparator =
        mImportFileLocation.lastIndexOf(File.separator);
      if (indexOfLastSeparator == -1) {
        mImportDirectory = "";
      } else {
        mImportDirectory =
          mImportFileLocation.substring(0, indexOfLastSeparator);
      }
    }

    // Create the log file for failed items.
    if (createFailedItemLogFile() == false) {
      cancelImport();
      mServiceStatus = ImportConstants.M_SERVICE_STATUS_FATAL_ERROR_IO;
      if (isLoggingError()) {
        logError("Item log file creation failed: mServiceStatus = "
          + mServiceStatus);
      }
      return (false);
    }

    // Do the import
    boolean importSuccess = mSession.importData();
    if (!importSuccess) {
      // Data import unsuccessful.
      if (isLoggingError()) {
        logError("Data import was unsuccessful. Cancelling the import");
      }
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
    vlogDebug("Leaving ImportService.executeImport(): mServiceStatus = {0}",
      mServiceStatus);
    return (true);
  }

  public boolean testImport() throws Exception {
    logDebugMessage("ImportService.testImport() called.");

    TransactionDemarcation transactionDemarcation =
      new TransactionDemarcation();
    boolean rollback = true;

    // Initialisation
    mTotalAssets = 0;
    mAssetsPerSecond = 0;
    mTotalTime = 0;
    mFailedItemsFileWriter = null;
    mFailedBatches = 0;

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
      int indexOfLastSeparator =
        mImportFileLocation.lastIndexOf(File.separator);
      if (indexOfLastSeparator == -1) {
        mImportDirectory = "";
      } else {
        mImportDirectory =
          mImportFileLocation.substring(0, indexOfLastSeparator);
      }
    }

    // Create the log file for failed items.
    if (createFailedItemLogFile() == false) {
      cancelImport();
      mServiceStatus = ImportConstants.M_SERVICE_STATUS_FATAL_ERROR_IO;
      if (isLoggingError()) {
        logError("Item log file creation failed: mServiceStatus = "
          + mServiceStatus);
      }
      return (false);
    }

    // Create and set up the reference item generator.
    // Do the import
    boolean importSuccess = mSession.importData();
    if (!importSuccess) {
      // Data import unsuccessful.
      if (isLoggingError()) {
        logError("Data import was unsuccessful. Cancelling the import");
      }
      cancelImport();
      return (false);
    }

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
    vlogDebug("Leaving ImportService.executeImport(): mServiceStatus = {0}",
      mServiceStatus);
    return (true);
  }

  private boolean prepareImport() {
    logDebugMessage("ImportService.prepareImport() called.");

    mSegmentCount = 0;
    mImportWorkerThreads = null;
    mImportWorkerThreadsStatus = null;

    mServiceStatus =
      ImportConstants.M_SERVICE_STATUS_DATA_IMPORT_BATCH_CREATION;

    // Split the file up into segments containing mItemBatchSize items.
    // The segments are stored in individual temporary files.
    mSegmentCount = segmentImportFile();

    if (mSegmentCount == 0) {
      mServiceStatus = ImportConstants.M_SERVICE_STATUS_FATAL_ERROR_IO;
      if (isLoggingError()) {
        logError("mSegmentCount == 0: mServiceStatus = " + mServiceStatus);
      }
      return (false);
    }

    // Start up N threads and pass a list of files to each. N cannot exceed the
    // value of mMaxImportThreads.
    // These threads will initialised to the ADD / UPDATE phase. They wait until
    // they are told to process a phase.
    int numberOfThreads = initiateImportWorkerThreads(mSegmentCount);

    vlogDebug("ImportService.prepareImport(): Sleeping for {1} {0}",
      "seconds to allow all threads to get started", (numberOfThreads + 1));
    try {
      Thread.sleep(1000 * (numberOfThreads + 1));
    } catch (InterruptedException e) {
    }

    logDebugMessage("Leaving ImportService.prepareImport().");
    return true;
  }

  // -------------------------------------
  /**
   * This method runs a multi-threaded data import.
   * 
   * @throws RepositoryException
   */
  protected boolean doImport() {
    logDebugMessage("ImportService.doImport() called.");

    ImportTimer timer = new ImportTimer("TOTAL TIME");

    // ============ ADD / UPDATE PHASE ==============.
    mServiceStatus =
      ImportConstants.M_SERVICE_STATUS_DATA_IMPORT_ADD_UPDATE_PHASE;
    timer.start();
    logDebugMessage("ImportService.doImport(): About to start ADD / UPDATE phase");
    startPhase(ImportConstants.PHASE_ADD_UPDATE);
    // Wait on each of them to complete the Add / Update phase.
    if (waitForPhaseCompletion() == false) {
      if (isLoggingWarning()) {
        StringBuilder sb =
          new StringBuilder(
            "ImportService.doImport(): ADD UPDATE phase terminated unexpectedly: ");
        sb.append("Terminating any running worker threads and return data import failure");
        vlogWarning(sb.toString());
      }
      terminateImportWorkerThreads();
      return (false);
    }
    vlogDebug("ImportService.doImport(): time string = {0}", timer
      .getTimeString());
    // Persist any references that have been generated (by non primary property
    // references)
    try {
      mReferenceItemGenerator.persistReferenceItemList();
    } catch (IOException e) {
      vlogError("ImportService.doImport(): IOException: " + e.getMessage());
    }

    // ============ REFERENCE UPDATE PHASE ==============
    logDebugMessage("ImportService.doImport(): About to start REFERENCE UPDATE PHASE phase");
    mServiceStatus =
      ImportConstants.M_SERVICE_STATUS_DATA_IMPORT_REFERENCE_UPDATE_PHASE;
    startPhase(ImportConstants.PHASE_REFERENCE_UPDATE);
    if (waitForPhaseCompletion() == false) {
      if (isLoggingWarning()) {
        StringBuilder sb =
          new StringBuilder("REFERENCE UPDATE phase terminated unexpectedly: ");
        sb.append("Terminating any running worker threads and return data import failure");
        vlogWarning(sb.toString());
      }
      terminateImportWorkerThreads();
      return (false);
    }
    vlogDebug("ImportService.doImport(): time string = {0}", timer
      .getTimeString());

    // ============ DELETE PHASE ==============.
    logDebugMessage("ImportService.doImport(): About to start DELETE phase");
    mServiceStatus = ImportConstants.M_SERVICE_STATUS_DATA_IMPORT_DELETE_PHASE;
    startPhase(ImportConstants.PHASE_DELETE);

    // Wait on each of them to complete the delete phase.
    if (waitForPhaseCompletion() == false) {
      if (isLoggingWarning()) {
        StringBuilder sb =
          new StringBuilder("DELETE phase terminated unexpectedly: ");
        sb.append("Terminating any running worker threads and return data import failure");
        vlogWarning(sb.toString());
      }
      terminateImportWorkerThreads();
      return (false);
    }
    vlogDebug("ImportService.doImport(): time string = {0}", timer
      .getTimeString());

    // Terminate the import worker threads.
    terminateImportWorkerThreads();

    mServiceStatus =
      ImportConstants.M_SERVICE_STATUS_DATA_IMPORT_PROCESSING_FAILED_DELETIONS;
    processFailedDeletions();
    // Remove the dummy reference items.
    mReferenceItemGenerator.deleteAllDummyReferenceItems();

    timer.stop();
    vlogDebug("ImportService.doImport(): time string = {0}", timer
      .getTimeString());

    // Some stats...
    mTotalTime += timer.getTime();
    mAssetsPerSecond = mTotalAssets / (mTotalTime / 1000);

    vlogDebug(
      "Leaving ImportService.doImport(), Totals assets processed = {0}, "
        + "Assets processed per second = {1}", mTotalAssets, mAssetsPerSecond);
    return (true);
  }

  public boolean importData() throws ImportException {
    logDebugMessage("ImportService.importData() called.");

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
       * vlogDebug(
       * "Leaving ImportService.doImport(), Totals assets processed = {0}, " +
       * "Assets processed per second = {1}", mTotalAssets, mAssetsPerSecond);
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
        if (isLoggingError()) {
          vlogError(
            "Failed to create the temporary reference items: mServiceStatus = {0}",
            mServiceStatus);
        }
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
  private int initiateImportWorkerThreads(int pSegmentCount) {
    int numberOfThreads = 0;
    int segmentsPerThread = 0;
    int startSegment = 1;
    int endSegment = 1;
    int extras = 0;

    // Work out how many threads that need to be started and how many segments
    // each will get.

    if (pSegmentCount > getMaxImportThreads()) {
      numberOfThreads = getMaxImportThreads();
      segmentsPerThread = pSegmentCount / numberOfThreads;
      extras = pSegmentCount % numberOfThreads;
    } else {
      numberOfThreads = pSegmentCount;
      segmentsPerThread = 1;
      extras = 0;
    }

    mImportWorkerThreads = new ImportWorkerThread[numberOfThreads];
    mImportWorkerThreadsStatus = new int[numberOfThreads];

    // Create the threads.

    for (int index = 0; index < numberOfThreads; index++) {
      if (extras > 0) {
        endSegment = startSegment + segmentsPerThread;
        extras--;
      } else {
        endSegment = startSegment + segmentsPerThread - 1;
      }

      // Start the thread

      mImportWorkerThreads[index] =
        new ImportWorkerThread(index, this, startSegment, endSegment);
      mImportWorkerThreadsStatus[index] = ImportConstants.THREAD_STATUS_STARTED;
      mImportWorkerThreads[index].start();

      // Increase the start count

      startSegment = endSegment + 1;
    }

    return (numberOfThreads);
  }

  // -------------------------------------
  /**
   * This method starts the import for the specified phase.
   */
  private void startPhase(int pPhase) {
    mFailedBatches = 0;

    for (int index = 0; index < mImportWorkerThreads.length; index++) {
      // Set the threads phase.

      mImportWorkerThreads[index].setPhase(pPhase);

      // Notify the thread to begin processing.

      synchronized (mImportWorkerThreads[index]) {
        mImportWorkerThreadsStatus[index] =
          ImportConstants.THREAD_STATUS_NOTIFIED;
        mImportWorkerThreads[index].notify();
      }
    }

    return;
  }

  // -------------------------------------
  /**
   * This method waits for the specified phase to complete.
   */
  private boolean waitForPhaseCompletion() {
    int activeThreads;

    while (true) {
      // Check for cancel.

      // Check the status of each thread.

      activeThreads = 0;

      for (int index = 0; index < mImportWorkerThreads.length; index++) {
        if (mImportWorkerThreads[index].isAlive() == false) {
          // Thread has died. There has been an error.
          mServiceStatus = ImportConstants.M_SERVICE_STATUS_FATAL_ERROR_THREADS;
          return (false);
        }

        if (mImportWorkerThreadsStatus[index] != ImportConstants.THREAD_STATUS_PHASE_COMPLETED) {
          // Add one to active threads.

          activeThreads++;
        }
      }

      // Check if there are any active threads.

      if (activeThreads == 0) {
        // This phase is complete.

        break;
      }

      // Sleep for a predefined period.

      try {
        Thread.sleep(mThreadMonitorInterval);
      } catch (InterruptedException e) {
      }
    }

    return (true);
  }

  // -------------------------------------
  /**
   * This method starts the appropriate number of import worker threads.
   */
  private void terminateImportWorkerThreads() {
    logDebugMessage("ImportService.terminateImportWorkerThreads() called");

    // Interrupt the threads.
    for (int index = 0; index < mImportWorkerThreads.length; index++) {
      if (mImportWorkerThreads[index].isAlive()) {
        mImportWorkerThreads[index].interrupt();
      }
    }

    // Wait on them to stop.

    for (int index = 0; index < mImportWorkerThreads.length; index++) {
      try {
        mImportWorkerThreads[index].join();
      } catch (InterruptedException e) {
      }
    }
    logDebugMessage("ImportService.terminateImportWorkerThreads(): "
      + "All threads should now be dead !!!");
  }

  public synchronized void notifyThreadStatus(int pThreadIndex, String pName,
    int pStatus) {
    mImportWorkerThreadsStatus[pThreadIndex] = pStatus;
  }

  public synchronized void processFailedDeletions() {
    int pass = 1;
    ArrayList<ImportItem> toRemove = mFailedDeletions;
    ImportItem importItem;
    // MutableRepository targetRepository =
    // (MutableRepository) getImportRepository();
    boolean rollback = true;
    RepositoryItem itemToRemove = null;

    if (toRemove.size() == 0) {
      return;
    }

    while (!toRemove.isEmpty() && pass < 25) {
      Iterator<ImportItem> iterator = toRemove.iterator();

      while (iterator.hasNext()) {
        TransactionDemarcation transactionDemarcation =
          new TransactionDemarcation();

        try {
          transactionDemarcation.begin(getTransactionManager(),
            TransactionDemarcation.REQUIRED);

          importItem = (ImportItem) iterator.next();

          MutableRepository targetRepository =
            (MutableRepository) getTargetRepository(importItem
              .getRepositoryName());
          itemToRemove =
            targetRepository.getItem(importItem.getItemId(), importItem
              .getItemDescriptor());

          if (itemToRemove != null) {
            RepositoryUtils.removeReferencesToItem(itemToRemove);
            targetRepository.removeItem(importItem.getItemId(), importItem
              .getItemDescriptor());
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

  // -------------------------------------
  /**
   * This method segments the import file into chunks of items. Each chunk is
   * stored in a temporary file for processing. Chunk size is dictated by the
   * mItemBatchSize property.
   */
  private int segmentImportFile() {
    File importFile = null;
    int segmentCount = 0;
    int itemCount = 0;
    File segmentFile = null;
    OutputStreamWriter segmentFileWriter = null;
    String segmentFilename = null;
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
      logDebugMessage("ImportService.segmentImportFile(): No import file specified.");
      return (0);
    }

    // Check that the specified import file exists.

    importFile = new File(mImportFileLocation);

    if (!importFile.exists()) {
      logDebugMessage("ImportService.segmentImportFile(): The specified import file does not exist.");
      return (0);
    }

    // Read the import file line by line.

    try {
      BufferedReader bufferedReader =
        new BufferedReader(new FileReader(importFile));

      while ((line = bufferedReader.readLine()) != null) {
        // Look for any of the start item tags in this line.

        if (line.contains(ImportConstants.M_TAG_ADD_ITEM_START)
          || line.contains(ImportConstants.M_TAG_UPDATE_ITEM_START)
          || line.contains(ImportConstants.M_TAG_REMOVE_ITEM_START)) {

          // Create a new record.

          record = new StringBuffer();
          record.append(line).append("\n");

          if (line.contains(ImportConstants.M_TAG_ADD_ITEM_START)) {
            addRecord = true;
          } else {
            addRecord = false;
          }

          // Check if a new file needs to be created.

          if (createNewFile) {
            // Create the next file in the sequence.

            segmentFilename =
              ImportConstants.M_SEGMENT_FILE_STUB + (segmentCount + 1)
                + ImportConstants.M_SEGMENT_FILE_EXTENSION;
            segmentFile = new File(mImportDirectory, segmentFilename);
            segmentFile.createNewFile();
            // segmentFileWriter = new FileWriter(segmentFile, false);

            OutputStream outputStream = new FileOutputStream(segmentFile);
            segmentFileWriter = new OutputStreamWriter(outputStream, "UTF-8");

            // Write the headers

            segmentFileWriter
              .write("<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"no\"?>\n");
            segmentFileWriter
              .write("<!DOCTYPE gsa-template SYSTEM \"dynamosystemresource:/atg/dtds/gsa/gsa_1.0.dtd\">\n");
            segmentFileWriter.write("<gsa-template>\n");
            segmentFileWriter.flush();

            segmentCount++;

            createNewFile = false;
          }

          writeLineToRecord = true;

          itemCount++;
          mTotalAssets++;

          if (itemCount >= getItemBatchSize()) {
            createNewFile = true;
          }

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
              segmentFileWriter.write("<import-items>\n");

              Iterator<String> additionsIterator = additions.iterator();

              while (additionsIterator.hasNext()) {
                String additionString = additionsIterator.next();
                segmentFileWriter.write(additionString + "\n");
              }

              segmentFileWriter.write("</import-items>\n");
            }

            // Write the records. Start with the additions.

            if (others.size() > 0) {
              Iterator<String> othersIterator = others.iterator();

              while (othersIterator.hasNext()) {
                String otherString = othersIterator.next();
                segmentFileWriter.write(otherString + "\n");
              }
            }

            // Clear out the arrays.

            additions.clear();
            others.clear();

            // Write the footers.

            segmentFileWriter.write("</gsa-template>" + "\n");
            segmentFileWriter.flush();
            segmentFileWriter.close();

            itemCount = 0;
          }
        } else if (writeLineToRecord) {
          record.append(line + "\n");
        }
      }

      // Ok, we're done, check if there is still a file to be written.

      if (createNewFile == false) {
        if (additions.size() > 0) {
          segmentFileWriter.write("<import-items>\n");

          Iterator<String> additionsIterator = additions.iterator();

          while (additionsIterator.hasNext()) {
            String additionString = additionsIterator.next();
            segmentFileWriter.write(additionString + "\n");
          }

          segmentFileWriter.write("</import-items>\n");
        }

        // Write the records. Start with the additions.

        if (others.size() > 0) {
          Iterator<String> othersIterator = others.iterator();

          while (othersIterator.hasNext()) {
            String otherString = othersIterator.next();
            segmentFileWriter.write(otherString + "\n");
          }
        }

        segmentFileWriter.write("</gsa-template>" + "\n");
        segmentFileWriter.flush();
        segmentFileWriter.close();
      }
    } catch (IOException io) {
      vlogDebug(io,
        "ImportService.segmentImportFile(): IOException caught: {0}", io
          .getMessage());
    }

    return segmentCount;
  }

  private boolean createReferenceItemGenerator() {
    boolean createdSuccessfully = true;

    // Initialise the ReferenceItemGenerator

    mReferenceItemGenerator = new ReferenceItemGenerator(this);

    try {
      mReferenceItemGenerator.initialiseReferenceItemGenerator();
    } catch (RepositoryException e) {
      vlogDebug(
        e,
        "ImportService.createReferenceItemGenerator(): RepositoryException caught: {0}",
        e.getMessage());
      createdSuccessfully = false;
    } catch (IOException e) {
      vlogDebug(
        e,
        "ImportService.createReferenceItemGenerator(): IOException caught: {0}",
        e.getMessage());
      createdSuccessfully = false;
    }

    return (createdSuccessfully);
  }

  private boolean createFailedItemLogFile() {
    boolean success = true;
    String failedItemsFilename =
      getImportDirectory() + File.separator
        + ImportConstants.M_FAILURES_FILENAME;

    File failedItemsFile = new File(failedItemsFilename);

    try {
      failedItemsFile.createNewFile();
      mFailedItemsFileWriter = new FileWriter(failedItemsFile, false);
    } catch (IOException e) {
      vlogDebug(e,
        "ImportService.createFailedItemLogFile(): IOException caught: {0}", e
          .getMessage());
      success = false;
    }

    return success;
  }

  public synchronized void logBatchFailure(int pSegmentIndex, int pPhase) {
    float errorPercentage = 0;

    logFailureMessage("======== FAILED BATCH ======== (Phase " + pPhase + ")\n");
    logFailureMessage("BATCH FILE: " + ImportConstants.M_SEGMENT_FILE_STUB
      + pSegmentIndex + ImportConstants.M_SEGMENT_FILE_EXTENSION + "\n");
    logFailureMessage("ERROR MESSAGE: Batch rejected or import cancellation received\n");

    mFailedBatches++;

    // Check if the failed batches has exceeded the threshold percentage.

    errorPercentage = ((float) mFailedBatches / (float) mSegmentCount) * 100;

    if (errorPercentage >= getErrorThresholdPerImport()) {
      // The number of batches rejected has surpassed the limit so return false
      // to cancel the import.

      logDebugMessage("ImportService.logBatchFailure(): The import error threshold has been reached. Cancelling the import... ");
      try {
        cancelImport();
      } catch (ImportException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }
    }
  }

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
        indexQueryText =
          "select a.index_name from user_indexes a, user_constraints b "
            + "where b.CONSTRAINT_NAME != a.index_name and "
            + "b.CONSTRAINT_TYPE = 'P' and a.table_name = b.table_name and "
            + "a.generated = 'N' and a.INDEX_TYPE = 'NORMAL'";

        indexQueryStatement = c.prepareStatement(indexQueryText);
        indexResults = indexQueryStatement.executeQuery();

        while (indexResults.next()) {
          indexName = indexResults.getString(1);
          indexNames.add(indexName);
        }

        indexResults.close();
        indexQueryStatement.close();
      } catch (SQLException e) {
        vlogDebug(e,
          "ImportService.disableIndexes(): SQLException with query: {0}",
          indexQueryText);
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
        vlogDebug(e, "ImportService.disableIndexes(): SQLException disabling "
          + "index: {0}, with query: {1}", indexName, indexDisableText);
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
          PreparedStatement indexRebuildStatement =
            c.prepareStatement(indexRebuildText);
          indexRebuildStatement.executeUpdate();
          indexRebuildStatement.close();
        }
      } catch (SQLException e) {
        vlogDebug(
          e,
          "ImportService.rebuildIndexes(): SQLException rebuilding index: {0},  with query: {1}",
          indexName, indexRebuildText);
        return (false);
      }

    }
    // Disconnect from the database
    databaseDisconnect();

    return (true);
  }

  private boolean databaseConnect() {

    if (mDatabaseConnections == null) {
      mDatabaseConnections = new ArrayList<Connection>();
    }
    try {
      for (Repository repository : mTargetRepositories.values()) {

        DataSource ds = ((GSARepository) repository).getDataSource();
        DatabaseMetaData dmd = ds.getConnection().getMetaData();
        Class.forName(dmd.getDriverName());
        mDatabaseConnections.add(DriverManager.getConnection(dmd.getURL(), dmd
          .getUserName(), mDatabasePassword));
      }
    } catch (Exception e) {
      vlogDebug(
        e,
        "ImportService.databaseConnect(): Exception caught while connecting to DB: {0}",
        e.getMessage());
      return (false);
    }

    return (true);
  }

  private boolean databaseDisconnect() {
    try {
      for (Connection c : mDatabaseConnections) {
        c.close();
      }
      mDatabaseConnections.clear();
    } catch (SQLException e) {
      vlogDebug(
        e,
        "ImportService.databaseDisconnect(): Failed to disconnect from the database: {0}",
        e.getMessage());
      return (false);
    }

    return (true);
  }

  /**
   * endImportSession
   * 
   * This method sets ends the import session by completing the current
   * transaction and ending the publishing workflow session in the case of
   * import into a versioned repository.
   * 
   * This method must be called at the end of an import session
   * 
   * @param pSession
   *          - the import session.
   */

  public void endImportSession() throws ImportException {
    logDebugMessage("ImportService.endImportSession() called");

    // Make sure a valid session object exists.
    if ((mSession == null)) {
      String message =
        ResourceUtils.getMsgResource(ImportConstants.INVALID_IMPORT_SESSION,
          MY_RESOURCE_NAME, sResourceBundle);

      if (isLoggingError()) {
        logError(message);
      }

      throw (new ImportException(ImportConstants.INVALID_IMPORT_SESSION,
        message));
    }

    // Check the session status.

    try {
      if (mSession.getSessionStatus() == ImportConstants.STATUS_SUCCESS) {
        // Commit the transaction.

        logDebugMessage("ImportService.endImportSession: Commiting the transaction");
        getTransactionManager().getTransaction().commit();
      } else {
        // Rollback the transaction.

        logDebugMessage("ImportService.endImportSession: Rolling back the transaction");
        getTransactionManager().getTransaction().rollback();
      }
    } catch (Exception e) {
      String[] messageArguments = { e.getMessage() };
      String message =
        ResourceUtils.getMsgResource(
          ImportConstants.IMPORT_TRANSACTION_COMMIT_ROLLBACK_FAILED,
          MY_RESOURCE_NAME, sResourceBundle, messageArguments);
      vlogError(message, e);

      throw (new ImportException(
        ImportConstants.IMPORT_TRANSACTION_COMMIT_ROLLBACK_FAILED, message));
    }

    mSession.endSession();
    logDebugMessage("Leaving ImportService.endImportSession()");

  }

  // -------------------------------------
  /**
   * This method cancels the import.
   * 
   * @throws ImportException
   */
  public void cancelImport() throws ImportException {
    vlogDebug("ImportService.cancelImport() called: mSession == {0}", mSession);

    if ((mSession == null)) {
      String message =
        ResourceUtils.getMsgResource(ImportConstants.INVALID_IMPORT_SESSION,
          MY_RESOURCE_NAME, sResourceBundle);

      if (isLoggingError()) {
        logError(message);
      }

      throw (new ImportException(ImportConstants.INVALID_IMPORT_SESSION,
        message));
    }
    synchronized (this) {
      mSession.cancelSession();
    }

    return;
  }

  protected ImportSession createImportSession() throws ImportException {

    logDebugMessage("ImportService.createImportSession() called");
    Iterator<Repository> iter = mTargetRepositories.values().iterator();
    Repository repository = iter.next();

    if (repository == null) {
      throw new ImportException("");
    }

    ImportSession session = new ImportSession();

    session.setImportService(this);

    vlogDebug("Leaving ImportService.createImportSession(): session == {0}",
      session);
    return session;
  }

  /**
   * Wraps a vlogDebug call to cat together a message.
   * 
   * @param pMessage
   */
  protected void logDebugMessage(String pMessage) {
    vlogDebug("{0} {1} {2}", this.getClass().getName(), System
      .currentTimeMillis(), pMessage);
  }

}
