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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import atg.adapter.gsa.GSARepository;
import atg.adapter.gsa.SelectiveCacheInvalidationEvent;
import atg.adapter.secure.GenericSecuredRepository;
import atg.commerce.catalog.CatalogTools;
import atg.commerce.catalog.StandardCatalogMaintenance;
import atg.commerce.catalog.custom.CatalogMaintenanceService;
import atg.deployment.common.DeploymentException;
import atg.deployment.common.RConstants;
import atg.deployment.common.event.DeploymentEvent;
import atg.deployment.manifest.ManifestException;
import atg.nucleus.Nucleus;
import atg.repository.Repository;
import atg.siebel.catalog.job.PublishingAgentImportJobManager;

/**
 *
 * @author Bernard Brady
 * @version $Id: //product/Siebel/version/11.2/PublishingAgent/src/atg/deployment/agent/SiebelCatalogMaintenanceHelper.java#2 $$Change: 1196386 $
 * @updated $DateTime: 2015/09/16 02:36:50 $$Author: saysyed $
 **/
public class SiebelCatalogMaintenanceHelper extends CatalogMaintenanceHelper {

  //-------------------------------------
  /** Class version string */

  public static String CLASS_VERSION = "$Id: //product/Siebel/version/11.2/PublishingAgent/src/atg/deployment/agent/SiebelCatalogMaintenanceHelper.java#2 $$Change: 1196386 $";


  //-------------------------------------
  // deploymentAgentImportJobManager
  protected PublishingAgentImportJobManager mDeploymentAgentImportJobManager;
  public PublishingAgentImportJobManager getDeploymentAgentImportJobManager() {
    return mDeploymentAgentImportJobManager;
  }
  public void setDeploymentAgentImportJobManager(
      PublishingAgentImportJobManager pDeploymentAgentImportJobManager) {
    mDeploymentAgentImportJobManager = pDeploymentAgentImportJobManager;
  }
  

  /**
   * This method delegates non-Siebel-derived DeploymentEvents to the superclass.
   * 
   * For DeploymentEvents that do result from Siebel Catalog sync's
   * the method pretty much mirrors the superclass method except that 
   * we dont go to the the deploymentAgent.status for affectedItemtypes and 
   * isSelectiveCacheInvalidationEnabled property values - there's too much
   * overhead in setting this up to mimic a 'normal' CA-derived deployment.
   * Instead we get affectedItemtypes straight from the event and we 
   * use the deplymentAgent.isSelectiveCacheInvalidationEnabled property value.
   * 
   * If this results in unexpected behaviour it may be necessary to create and 
   * populate the deplymentAgent.status object just like a CA deployment would.
   * 
   * @param pEvent
   */
  @Override
  void runMaintenanceService(DeploymentEvent pEvent) {
    if (pEvent.getDeploymentCreateInitiator() != null
        && !(pEvent.getDeploymentCreateInitiator()
            .equals(getDeploymentAgentImportJobManager()
                .getSiebelDeploymentCreateInitiator()))) {
      super.runMaintenanceService(pEvent);
    } else {
      // These variables should have been proofed earlier.
      StandardCatalogMaintenance cms = getCatalogMaintenanceService();
      DeploymentAgent agent = getDeploymentAgent();

      // 1. Get the ProductCatalog repository configured with the CMS
      // If the repository configured with the maintenance service was
      // not affected by this deployment, there is no need to run the
      // maintenance service. Get the catalog CMS updates.
      //
      // NB: HACK: StandardCatalogMaintenance and CatalogMaintenanceService
      // implement different methods for obtaining the CatalogTools.
      //
      CatalogTools tools;
      if (cms instanceof CatalogMaintenanceService)
        tools = ((CatalogMaintenanceService) cms).getCatalogTools();
      else
        tools = cms.getStandardCatalogTools();
      Repository rawCatalog = tools.getCatalog();

      while (rawCatalog instanceof GenericSecuredRepository)
        rawCatalog = ((GenericSecuredRepository) rawCatalog).getRepository();

      if ((rawCatalog instanceof GSARepository) == false)
        return;

      GSARepository catalog = (GSARepository) rawCatalog;

      // 2. Run through the repositories affected by this deployment to see
      // if one of them is the CMS maintained catalog.
      //Status agentStatus = agent.getStatus();
      if (pEvent.getAffectedItemTypes() == null)
        return;

      boolean isSCIEnabled = getDeploymentAgent().isSelectiveCacheInvalidationEnabled();
      boolean isFirstApply = pEvent.isSwitchFirstApply();
      boolean listenPropertyChanged = false;
      if (isSCIEnabled && isFirstApply) {
        listenPropertyChanged = true;
      }

      ArrayList<ShadowRepositoryPropertiesChangedListener> listeners = null;

      if (listenPropertyChanged) {
        listeners = new ArrayList<ShadowRepositoryPropertiesChangedListener>();
      }

      Set repositories = pEvent.getAffectedItemTypes().keySet();
      Iterator i = repositories.iterator();
      while (i.hasNext()) {
        String gsaPath = (String) i.next();
        Object r = Nucleus.getGlobalNucleus().resolveName(gsaPath);

        while (r instanceof GenericSecuredRepository)
          r = ((GenericSecuredRepository) r).getRepository();

        if (!(r instanceof GSARepository))
          continue;

        GSARepository affectedRepository = (GSARepository) r;

        if (catalog.getAbsoluteName().equals(
            affectedRepository.getAbsoluteName())) {
          // 3. Success! Resolve the shadow repository for the ProductCatalog
          // so we can perform the CMS against it.
          GSARepository shadowCatalog = null;
          try {
            shadowCatalog = agent.mShadows.resolveRepository(
                catalog.getAbsoluteName(), true);
            if (shadowCatalog == null)
              return;
          } catch (ManifestException me) {
            if (agent.isLoggingError())
              agent.logError(RConstants.CMS_RESOLVE_FAILED, me);
            return;
          }

          try {
            if (agent.isLoggingDebug())
              agent.logDebug("found CMS catalog in deployment : "
                  + catalog.getAbsoluteName() + " = "
                  + (shadowCatalog.getAbsoluteName()));

            // This matches. Now we must look at a set of repository items any
            // of which will cause us to fire off CMS.
            Map m = pEvent.getAffectedItemTypes();

            // Currently, the map of Sets returned are keyed off of
            // the *non-transformed* repository name, i.e. the
            // non-shadow repository. So we must use the non-resolved
            // repository to look up this set.
            Set names = (Set) m.get(gsaPath);

            Set defaults = new HashSet();
            defaults.add("catalog");
            defaults.add("catalogFolder");
            defaults.add("category");
            defaults.add("categoryInfo");
            defaults.add("product");
            defaults.add("productInfo");
            defaults.add("sku");
            defaults.add("skuInfo");

            Set extraPlusDefaults = new HashSet();
            extraPlusDefaults.addAll(defaults);
            if (getExtraTriggeringAffectedItemDescriptors() != null)
              extraPlusDefaults.addAll(Arrays
                  .asList(getExtraTriggeringAffectedItemDescriptors()));

            if (extraPlusDefaults.removeAll(names)) {
              // Since we already have the shadow repository being
              // used by the manifest, we can run CMS on this
              // repository.
              if (agent.isLoggingDebug())
                agent
                    .logDebug("CMS maintained item affected by deployment : CMS will be run");

              // If we're in online deployment mode, invalidate the caches now.
              // Switch deployments are taken care of during the ACTIVE_ACTIVATE
              // phase.
              if (pEvent.getDeploymentMode() == MODE_ONLINE) {
                ((GSARepository) r).invalidateCaches();
              }

              if (listenPropertyChanged) {
                ShadowRepositoryPropertiesChangedListener listener = new ShadowRepositoryPropertiesChangedListener(
                    shadowCatalog, catalog.getAbsoluteName());
                listeners.add(listener);
              }
              // If configured, we want to be sure that CMS gets a lock before
              // it runs, so
              // that other targets don't run the same service.

              cms.setFirstPhase(isFirstApply);
              if (cms instanceof CatalogMaintenanceService) {
                CatalogMaintenanceService catalogMaintenanceService = (CatalogMaintenanceService) cms;
                if (isGetLock())
                  catalogMaintenanceService.performMaintenance(true,
                      shadowCatalog, null, true,
                      catalogMaintenanceService.isPerformInfoVerification());
                else
                  catalogMaintenanceService.performMaintenance(shadowCatalog,
                      null);
              } else
                cms.performMaintenance(isGetLock(), shadowCatalog);

              if (listenPropertyChanged) {
                ArrayList<SelectiveCacheInvalidationEvent> sciEvents = new ArrayList<SelectiveCacheInvalidationEvent>();

                for (ShadowRepositoryPropertiesChangedListener listener : listeners) {
                  Map<String, Set<String>> itemDescriptorToIdsMap = listener
                      .getItemDescriptorToIdsMap();
                  if (!itemDescriptorToIdsMap.isEmpty()) {
                    SelectiveCacheInvalidationEvent sciEvent = new SelectiveCacheInvalidationEvent();
                    sciEvent.setRepositoryPath(listener.getRepositoryPath());
                    sciEvent.setItemDescriptorToIdsMap(listener
                        .getItemDescriptorToIdsMap());
                    sciEvents.add(sciEvent);
                  }
                }

                if (!sciEvents.isEmpty()) {
                  SelectiveCacheInvalidationEvent[] events = sciEvents
                      .toArray(new SelectiveCacheInvalidationEvent[] {});
                  ShadowUpdateEvent shadowUpdateEvent = new ShadowUpdateEvent();
                  shadowUpdateEvent.setSCIEvents(events);
                  if (agent.isLoggingDebug() && agent.isDebugSCIEvent()) {
                    agent.logDebug("CMS sendShadowUpdateEvent: sciEvents=");
                    agent.logDebug(SelectiveCacheInvalidationEvent
                        .dumpEvents(events));
                  }

                  sendShadowUpdateEvent(shadowUpdateEvent);
                }

              }
              // CMS only needs to run the once per apply phase.
              return;
            }
          } finally {
            if (cms.isFirstPhase()) {
              cms.setFirstPhase(false);
            }
            // This is to address bug 157050, which removes any memory
            // footprints left over by shadow repositories.
            try {
              agent.mShadows.resetShadowDestinations();
            } catch (DeploymentException e) {
              if (agent.isLoggingError())
                agent.logError(e);
            }
          }
        }
      }

    }
  }

}
