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

package atg.siebel.catalog;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Map;

import atg.applauncher.dynamo.DynamoServerLauncher;
import atg.nucleus.DynamoEnv;
import atg.nucleus.GenericService;
import atg.nucleus.Nucleus;
import atg.nucleus.ServiceException;
import atg.webservice.WebServiceException;
import atg.webservice.WebServiceGeneratorImpl;

/****************************************
 * Utility service that will generate the default repository services. These
 * services should be regenerated if the template for web services has changed,
 * or the generator has changed in some manner
 * 
 ****************************************/

public class SiebelWebServiceGen
  extends GenericService {

  // -------------------------------------
  /** Class version string */

  public static String CLASS_VERSION =
    "$Id: //product/Siebel/version/11.2/src/atg/siebel/catalog/SiebelWebServiceGen.java#2 $$Change: 1194813 $";

  // ----------------------------------------
  // Constants
  // ----------------------------------------

  /**
   * Component path to the Siebel web service.
   */
  public final static String SIEBEL_CATALOG_IMPORT_WS_COMPONENT =
    "/atg/siebel/catalog/SiebelCatalogImportWebService";

  /**
   * Universal web service generation component.
   */
  public final static String GENERATOR_SERVICE_COMPONENT =
    "/atg/webservice/WebServiceGenerator";

  /**
   * Component definition for what this belongs to so it can call itself from
   * the 'main' method.
   */
  public final static String SIEBEL_WEB_SERVICE_GENERATOR =
    "/atg/siebel/catalog/SiebelWebServiceGenerator";

  // ----------------------------------------
  // Member Variables
  // ----------------------------------------

  boolean mNewEar = true;
  boolean mNewWar = false;

  // ----------------------------------------
  // Properties
  // ----------------------------------------

  // ----------------------------------------
  // Generator
  private WebServiceGeneratorImpl mGenerator = null;

  /**
   * Set property <code>Generator</code>
   * 
   * @param pGenerator
   **/
  public void setGenerator(WebServiceGeneratorImpl pGenerator) {
    mGenerator = pGenerator;
  }

  /**
   * Get property <code>Generator</code>
   * 
   * @return
   **/
  public WebServiceGeneratorImpl getGenerator() {
    return mGenerator;
  }

  // ----------------------------------------
  // siebelCatalogImportWSComponentPath -- full component path to the
  // component for this class.
  String mSiebelCatalogImportWSComponentPath =
    SIEBEL_CATALOG_IMPORT_WS_COMPONENT;

  /**
   * Set property <code>SiebelCatalogImportWSComponentPath</code>
   * 
   * @param pRepositoryServiceComponentPath
   **/
  public void setSiebelCatalogImportWSComponentPath(
    String pRepositoryServiceComponentPath) {
    mSiebelCatalogImportWSComponentPath = pRepositoryServiceComponentPath;
  }

  /**
   * Get property <code>SiebelCatalogImportWSComponentPath</code>
   * 
   * @return
   **/
  public String getSiebelCatalogImportWSComponentPath() {
    return mSiebelCatalogImportWSComponentPath;
  }

  // ----------------------------------------
  // continueOneError
  boolean mContinueOnError = false;

  /**
   * Set property <code>ContinueOnError</code>
   * 
   * @param pContinueOnError
   **/
  public void setContinueOnError(boolean pContinueOnError) {
    mContinueOnError = pContinueOnError;
  }

  /**
   * Get property <code>ContinueOnError</code>
   * 
   * @return
   **/
  public boolean isContinueOnError() {
    return mContinueOnError;
  }

  // ----------------------------------------
  // Constructors
  // ----------------------------------------

  /**
   * Default constructor
   */
  public SiebelWebServiceGen() {
  }

  // ----------------------------------------
  // Object Methods
  // ----------------------------------------
  /**
   * {@inheritDoc}
   * 
   * @see atg.nucleus.GenericService#doStartService()
   */
  public void doStartService() throws ServiceException {
    if (mGenerator == null)
      mGenerator =
        (WebServiceGeneratorImpl) resolveName(GENERATOR_SERVICE_COMPONENT);
  }

  /**
   * Begins the generation process.
   * 
   * @throws WebServiceException
   */
  public synchronized void generateWebServices() throws WebServiceException {
    generateRepositoryEar();
  }

  /**
   * Creates the EAR file then calls for the WAR generation.
   * 
   * @throws WebServiceException
   */
  void generateRepositoryEar() throws WebServiceException {
    EarDescriptor desc =
      new EarDescriptor("SiebelWS.ear", "Siebel Import Web Services",
        "Contains the import Web Services for Siebel to call.");
    mNewEar = true;
    generateGenericWar(desc);
  }

  /**
   * Creates the WAR then calls for the service generation.
   * 
   * @param pEarDescriptor
   *          EarDescriptor for the EAR to create.
   * @throws WebServiceException
   */
  void generateGenericWar(EarDescriptor pEarDescriptor)
    throws WebServiceException {
    WarDescriptor warDesc =
      new WarDescriptor("siebelWS.war",
        "Siebel import web services to be called from SCOA.",
        "Siebel Import Web Services", "siebelWS");
    createGenericServices(pEarDescriptor, warDesc);
  }

  /**
   * Wraps creating the service(s).
   * 
   * @param pEar
   *          EarDescriptor for the EAR to create.
   * @param pWar
   *          WarDescriptor for the WAR to create.
   * @throws WebServiceException
   */
  void createGenericServices(EarDescriptor pEar, WarDescriptor pWar)
    throws WebServiceException {
    createCatalogImportWS(pEar, pWar, mSiebelCatalogImportWSComponentPath);
    createImportStatusWS(pEar, pWar, mSiebelCatalogImportWSComponentPath);
  }

  /**
   * Creates the Siebel catalog import web service.
   * 
   * @param pEar
   * @param pWar
   * @param pComponentPath
   * @throws WebServiceException
   */
  void createCatalogImportWS(EarDescriptor pEar, WarDescriptor pWar,
    String pComponentPath) throws WebServiceException {
    ServiceDescriptor desc = new ServiceDescriptor();
    desc.setComponentPath(pComponentPath);
    desc
      .setMethodName("importFromSiebel(java.lang.String,java.lang.String,java.lang.String,java.lang.String)");
    desc.setInputParams(new String[] { "exportFileLocation", "exportJobId",
      "importPolicy", "importType" });
    desc.setServletName("catalog");
    desc.setIsSession(false);

    // setting the functional name will result in a secure WS call
    desc.setFunctionalName(null);
    desc.setDisplayName("Import Catalog From Siebel");
    desc
      .setDescription("Called from SCOA this imports the catalog data provided.");

    generateService(pEar, pWar, desc);
  }

  /**
   * Creates the Siebel catalog import job status web service.
   * 
   * @param pEar
   * @param pWar
   * @param pComponentPath
   * @throws WebServiceException
   */
  void createImportStatusWS(EarDescriptor pEar, WarDescriptor pWar,
    String pComponentPath) throws WebServiceException {
    ServiceDescriptor desc = new ServiceDescriptor();
    desc.setComponentPath(pComponentPath);
    desc.setMethodName("getJobStatus(java.lang.String)");
    desc.setInputParams(new String[] { "exportJobId" });
    desc.setServletName("status");
    desc.setIsSession(false);

    // setting the functional name will result in a secure WS call
    desc.setFunctionalName(null);
    desc.setDisplayName("Import Catalog Job status for Siebel");
    desc
      .setDescription("Called from SCOA to discover the specified import job status.");

    generateService(pEar, pWar, desc);
  }

  /**
   * Does the actual generation of the service.
   * 
   * @param pEar
   *          EarDescriptor of the EAR to create.
   * @param pWar
   *          WarDescriptor of the WAR to create.
   * @param pService
   *          ServiceDescriptor for the specific service to create.
   * @throws WebServiceException
   */
  void generateService(EarDescriptor pEar, WarDescriptor pWar,
    ServiceDescriptor pService) throws WebServiceException {
    try {
      if (mNewEar) {
        vlogInfo("Creating new ear file: {0}", pEar.getEarFile());
        vlogInfo("Creating new war file: {0}", pWar.getWarFile());
        vlogInfo(
          "Creating new web service: {0} based on component method: {1}.{2}",
          pService.getServletName(), pService.getComponentPath(), pService
            .getMethodName());

        mGenerator.generateWS(pService.getComponentPath(), pService
          .getMethodName(), pEar.getEarFile(), pEar.getAppName(), pEar
          .getAppDescription(), pService.getServletName(), pService
          .getDisplayName(), pService.getDescription(), pWar.getWarFile(), pWar
          .getWarContextRoot(), pWar.getWarDisplayName(), pWar
          .getWarDescription(), pService.getHost(), pService.getPort(),
          pService.getInputParams(), pService.getIsSession(), pService
            .getFunctionalName(), pService.getExtraParams());
        mNewEar = false;
        mNewWar = false;
      } else if (mNewWar) {
        vlogInfo("Creating new war file: {0}", pWar.getWarFile());
        vlogInfo(
          "Creating new web service: {0} based on component method: {1}.{2}",
          pService.getServletName(), pService.getComponentPath(), pService
            .getMethodName());

        mGenerator.addWSToEAR(pService.getComponentPath(), pService
          .getMethodName(), pEar.getEarFile(), pWar.getWarFile(), pWar
          .getWarContextRoot(), pService.getServletName(), pService
          .getDisplayName(), pService.getDescription(), pWar
          .getWarDisplayName(), pWar.getWarDescription(), pService.getHost(),
          pService.getPort(), pService.getInputParams(), pService
            .getIsSession(), pService.getFunctionalName(), pService
            .getExtraParams());
        mNewWar = false;
      } else {
        vlogInfo(
          "Creating new web service: {0} based on component method: {1}.{2}",
          pService.getServletName(), pService.getComponentPath(), pService
            .getMethodName());

        mGenerator.addWSToWAR(pService.getComponentPath(), pService
          .getMethodName(), pEar.getEarFile(), pWar.getWarFile(), pService
          .getServletName(), pService.getDisplayName(), pService
          .getDescription(), pService.getHost(), pService.getPort(), pService
          .getInputParams(), pService.getIsSession(), pService
          .getFunctionalName(), pService.getExtraParams());
      }
    } catch (WebServiceException exc) {
      if (mContinueOnError) {
        if (isLoggingError())
          logError(exc);
      } else
        throw exc;
    }

  }

  // ----------------------------------------
  // Inner Classes
  // ----------------------------------------

  /**
   * Contains essential descriptor information for the EAR to generate.
   * 
   */
  class EarDescriptor {
    String mEarFile;
    String mAppName;
    String mAppDescription;

    public EarDescriptor(String pEarFile, String pAppName,
      String pAppDescription) {
      mEarFile = pEarFile;
      mAppName = pAppName;
      mAppDescription = pAppDescription;
    }

    public String getEarFile() {
      return mEarFile;
    }

    public String getAppName() {
      return mAppName;
    }

    public String getAppDescription() {
      return mAppDescription;
    }
  }

  /**
   * Contains essential descriptor information for the WAR to generate.
   * 
   */
  class WarDescriptor {
    String mWarFile;
    String mWarDescription;
    String mWarDisplayName;
    String mWarContextRoot;

    public WarDescriptor(String pWarFile, String pWarDescription,
      String pWarDisplayName, String pWarContextRoot) {
      mWarFile = pWarFile;
      mWarDescription = pWarDescription;
      mWarDisplayName = pWarDisplayName;
      mWarContextRoot = pWarContextRoot;
    }

    public String getWarFile() {
      return mWarFile;
    }

    public String getWarDescription() {
      return mWarDescription;
    }

    public String getWarDisplayName() {
      return mWarDisplayName;
    }

    public String getWarContextRoot() {
      return mWarContextRoot;
    }
  }

  /**
   * Contains essential descriptor information for the Service to generate.
   * 
   */
  class ServiceDescriptor {
    String mFunctionalName;
    String mMethodName;
    String mServletName;
    String mDisplayName;
    String mDescription;
    String[] mInputParams;
    String mComponentPath;
    String mHost;
    String mPort;
    boolean mIsSession;
    Map<String, String> mExtraParams;

    ServiceDescriptor() {
    }

    public void setFunctionalName(String pFunctionalName) {
      mFunctionalName = pFunctionalName;
    }

    public String getFunctionalName() {
      return mFunctionalName;
    }

    public void setMethodName(String pMethodName) {
      mMethodName = pMethodName;
    }

    public String getMethodName() {
      return mMethodName;
    }

    public void setServletName(String pServletName) {
      mServletName = pServletName;
    }

    public String getServletName() {
      return mServletName;
    }

    public void setDisplayName(String pDisplayName) {
      mDisplayName = pDisplayName;
    }

    public String getDisplayName() {
      return mDisplayName;
    }

    public void setDescription(String pDescription) {
      mDescription = pDescription;
    }

    public String getDescription() {
      return mDescription;
    }

    public void setInputParams(String[] pInputParams) {
      mInputParams = pInputParams;
    }

    public String[] getInputParams() {
      return mInputParams;
    }

    public void setIsSession(boolean pIsSession) {
      mIsSession = pIsSession;
    }

    public boolean getIsSession() {
      return mIsSession;
    }

    public void setComponentPath(String pComponentPath) {
      mComponentPath = pComponentPath;
    }

    public String getComponentPath() {
      return mComponentPath;
    }

    public void setHost(String pHost) {
      mHost = pHost;
    }

    public String getHost() {
      return mHost;
    }

    public void setPort(String pPort) {
      mPort = pPort;
    }

    public String getPort() {
      return mPort;
    }

    public void setExtraParams(Map<String, String> pExtraParams) {
      mExtraParams = pExtraParams;
    }

    public Map<String, String> getExtraParams() {
      return mExtraParams;
    }
  }

  // ----------------------------------------
  // Static Methods
  // ----------------------------------------

  /**
   * Fakes the license read so that Nucleus can start.
   */
  static void inhibitLicenseCheck() {
    // newer versions of Nucleus respect this property to
    // avoid displaying the license
    DynamoEnv.setProperty("atg.license.read", Boolean.TRUE.toString());

    // older versions look for the file
    boolean haveLicense = false;
    if (haveLicense) {
      // just shutting up a warning.
    }

    String lic = "license.read";
    String dynamoHome = DynamoEnv.getProperty("atg.dynamo.home");
    if (dynamoHome != null)
      lic = new File(dynamoHome, lic).getPath();

    InputStream fin = null;
    try {
      fin = new FileInputStream(lic);
      int b = fin.read();
      haveLicense = b == 'y';
    } catch (Exception e) {
    } finally {
      if (fin != null)
        try {
          fin.close();
        } catch (Exception e) {
        }
    }
  }

  /**
   * Main method for creating default repository from a command line or ant
   * task. Invoking this method generates an ear file in DYNAMO_HOME which
   * should then be copied or moved to the appropriate location.
   * 
   * @param pArgs
   *          - Configpath for Nucleus Instance
   */
  public static void main(String[] pArgs) {

    ArrayList<String> nucleusArgs = new ArrayList<String>();
    DynamoServerLauncher.expandCommandLineArgs(pArgs);
    for (int i = 0; i < pArgs.length; i++) {
      if (pArgs[i].equalsIgnoreCase("-configPath")) {
        nucleusArgs.add(pArgs[++i]);
      }
    }
    nucleusArgs.add("-initialService");
    /*
     * Set this to the web service generator component so no repositories start
     * up. Neither this nor any dependencies need to start repositories.
     */
    nucleusArgs.add(SIEBEL_WEB_SERVICE_GENERATOR);
    inhibitLicenseCheck();
    String[] nArgs =
      (String[]) nucleusArgs.toArray(new String[nucleusArgs.size()]);
    Nucleus n = Nucleus.startNucleus(nArgs);
    System.setProperty("javax.xml.transform.TransformerFactory",
      "atg.apache.xalan.processor.TransformerFactoryImpl");
    System.setProperty("javax.xml.parsers.DocumentBuilderFactory",
      "atg.apache.xerces.jaxp.DocumentBuilderFactoryImpl");
    try {
      SiebelWebServiceGen dRPS =
        (SiebelWebServiceGen) n.resolveName(SIEBEL_WEB_SERVICE_GENERATOR);
      dRPS.generateWebServices();
    } catch (WebServiceException wse) {
      wse.printStackTrace();
      System.exit(1);
    }
    System.exit(0);
  }

} // end of class
