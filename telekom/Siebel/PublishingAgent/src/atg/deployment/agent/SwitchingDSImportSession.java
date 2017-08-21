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

package atg.deployment.agent;

import java.util.HashMap;
import java.util.Map;

import atg.adapter.gsa.GSARepository;
import atg.core.exception.ContainerException;
import atg.deployment.common.RConstants;
import atg.repository.Repository;
import atg.service.jdbc.SwitchingDataSource;
import atg.siebel.catalog.importer.ImportException;
import atg.siebel.catalog.importer.ImportServiceInterface;
import atg.siebel.catalog.importer.ImportSession;
import atg.siebel.catalog.importer.PublishingAgentImportService;
import atg.siebel.catalog.job.ImportJobEnums.DeploymentType;

public class SwitchingDSImportSession extends ImportSession {

  //-------------------------------------
  /** Class version string */

  public static String CLASS_VERSION = "$Id: //product/Siebel/version/11.2/PublishingAgent/src/atg/deployment/agent/SwitchingDSImportSession.java#2 $$Change: 1196386 $";


  public SwitchingDSImportSession() {
  }

  /* (non-Javadoc)
   * @see atg.siebel.catalog.importer.ImportSession#getDeploymentType()
   */
  public DeploymentType getDeploymentType() {
    return DeploymentType.SWITCHED;
  }
  
  protected boolean mSwitchFirstPhase = true;
  public boolean isSwitchFirstPhase() {
    return mSwitchFirstPhase;
  }
  
  /*
   * Note: When switching the data sources we dont need to switch the datasource
   * for the price list repository (or any other repositories that might be
   * used) since it is using the same underlying data source as the product
   * catalog repository.
   * 
   * (non-Javadoc)
   * 
   * @see atg.siebel.catalog.importer.ImportSession#importData()
   */
  public boolean importData() throws ImportException {

    logDebugMessage("PublishingAgentImportSession.importData() called");

    ImportServiceInterface importService = getImportService();
    if (!(importService instanceof PublishingAgentImportService)) {
      return super.importData();
    }
    PublishingAgentImportService sdsImportService = (PublishingAgentImportService) getImportService();
    Map<String, Repository> repositories = getImportService()
        .getTargetRepositories();
    Map<String, Repository> shadowRepositories = new HashMap<String, Repository>();
    for (Repository repository : repositories.values()) {
      GSARepository shadowRepository = getShadowRepository(
          sdsImportService.getDeploymentAgent(), repository);
      shadowRepositories.put(((GSARepository) repository).getAbsoluteName(),
          shadowRepository);
    }
    getImportService().setTargetRepositories(shadowRepositories);

    logDebugMessage("PublishingAgentImportSession.importData(): Starting 1st phase of switched import");
    boolean dataImported = super.importData();
    logDebugMessage("PublishingAgentImportSession.importData(): 1st phase of switched import completed");

    getImportService().setTargetRepositories(repositories);

    if (dataImported) {
      logDebugMessage("PublishingAgentImportSession.importData(): Switching datasources");

      GSARepository repo = (GSARepository) repositories.values().iterator()
          .next();
      SwitchingDataSource sds = (SwitchingDataSource) repo.getDataSource();
      try {
        sds.prepareSwitch();
        sds.performSwitch();
      } catch (Exception e) {
        throw new ImportException(e);
      }
      mSwitchFirstPhase = false;
      shadowRepositories = new HashMap<String, Repository>();
      for (Repository repository : repositories.values()) {
        GSARepository shadowRepository = getShadowRepository(
            sdsImportService.getDeploymentAgent(), repository);
        shadowRepositories.put(((GSARepository) repository).getAbsoluteName(),
            shadowRepository);
      }
      getImportService().setTargetRepositories(shadowRepositories);

      logDebugMessage("PublishingAgentImportSession.importData(): Starting 2nd phase of switched import");
      dataImported = super.importData();
      logDebugMessage("PublishingAgentImportSession.importData():2nd phase of switched import completed");
      getImportService().setTargetRepositories(repositories);

    }
    logDebugMessage("PublishingAgentImportSession.importData(): completed with status = "
        + dataImported);
    return dataImported;
  }

  /**
   * Convenience method that uses DeplymentAgent.mShadows to retrieve the shadow
   * repository for a given online repository
   * 
   * @param pLiveRepository
   *          repository whose shadow we want
   * @return GSARepository the shadow repository
   * @throws ImportException
   */
  protected GSARepository getShadowRepository(DeploymentAgent pAgent,
      Repository pLiveRepository) throws ImportException {

    if (getImportService().isLoggingDebug()) {
      getImportService().logDebug("Live repository : " + pLiveRepository);
    }
    GSARepository shadowRepository = null;
    try {
      shadowRepository = pAgent.mShadows.resolveRepository(
          ((GSARepository) pLiveRepository).getAbsoluteName(), true);
      pAgent.mShadows.updateForeignRepositoryReferences(shadowRepository);
    } catch (ContainerException ce) {
      if (getImportService().isLoggingError()) {
        getImportService().logError(RConstants.CMS_RESOLVE_FAILED, ce);
      }
      throw new ImportException(ce);
    }

    if (getImportService().isLoggingDebug()) {
      getImportService().logDebug("Shadow repository : " + shadowRepository);
    }
    return shadowRepository;
  }


}
