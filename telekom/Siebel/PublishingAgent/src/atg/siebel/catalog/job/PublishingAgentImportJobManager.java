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

package atg.siebel.catalog.job;

import java.beans.PropertyChangeEvent;
import java.util.ArrayList;
import java.util.List;

import atg.deployment.agent.DeploymentAgent;
import atg.deployment.agent.SwitchingDSImportSession;
import atg.deployment.common.event.DeploymentEvent;
import atg.siebel.catalog.job.ImportJobEnums.ProcessingPhase;

/**
 * Import Job Manager which listens for ImportJob PropertyChangeEvent's and 
 * where appropriate can translate then into DeploymentEvent's. 
 *
 * @author bbrady
 * @version $Id: //product/Siebel/version/11.2/PublishingAgent/src/atg/siebel/catalog/job/PublishingAgentImportJobManager.java#2 $$Change: 1196386 $
 * @updated $DateTime: 2015/09/16 02:36:50 $$Author: saysyed $
 */

public class PublishingAgentImportJobManager extends ImportJobManager {

  //-------------------------------------
  /** Class version string */

  public static String CLASS_VERSION = "$Id: //product/Siebel/version/11.2/PublishingAgent/src/atg/siebel/catalog/job/PublishingAgentImportJobManager.java#2 $$Change: 1196386 $";


  //-------------------------------------
  // Properties
  //-------------------------------------
  
  //-------------------------------------
  // deploymentAgent
  protected DeploymentAgent mDeploymentAgent;

  public DeploymentAgent getDeploymentAgent() {
    return mDeploymentAgent;
  }

  public void setDeploymentAgent(DeploymentAgent pDeploymentAgent) {
    mDeploymentAgent = pDeploymentAgent;
  }
  
  //-------------------------------------
  // deploymentTarget
  protected String mDeploymentTarget = "Production";

  public String getDeploymentTarget() {
    return mDeploymentTarget;
  }

  public void setDeploymentTarget(String pDeploymentTarget) {
    mDeploymentTarget = pDeploymentTarget;
  }
  
  //-------------------------------------
  // deploymentCreateInitiator
  protected String mDeploymentCreateInitiator = "SIEBEL";

  public String getSiebelDeploymentCreateInitiator() {
    return mDeploymentCreateInitiator;
  }

  public void setSiebelDeploymentCreateInitiator(String pDeploymentCreateInitiator) {
    mDeploymentCreateInitiator = pDeploymentCreateInitiator;
  }
  
  
  
  //-------------------------------------
  // Methods
  //-------------------------------------
  
  @Override
  public void propertyChange(PropertyChangeEvent pPropertyChangeEvent) {
    
    super.propertyChange(pPropertyChangeEvent);
    
    // Only interested in events from an ImportJob
    if (!(pPropertyChangeEvent.getSource() instanceof ImportJob)) {
      return;
    }
    
    // If this isn't a valid event to translate then return now
    if (!(pPropertyChangeEvent.getNewValue() instanceof ProcessingPhase)) {
      return;
    }
    
    // translate this event into a DeploymentEvent and propagate
    List<DeploymentEvent> events = createDeploymentEvents(pPropertyChangeEvent);
    // Fire!
    for (DeploymentEvent event : events) {
      vlogDebug("About to call mDeploymentAgent.fireDeploymentEvent : event == {0}", event);
      mDeploymentAgent.fireDeploymentEvent(event);
    }
  }
  
  /**
   * @param importJob
   * @return
   */
  protected List<DeploymentEvent> createDeploymentEvents(
      PropertyChangeEvent pPropertyChangeEvent) {
    
    vlogDebug(
        "createDeploymentEvents() called: pPropertyChangeEvent == {0}", 
        pPropertyChangeEvent);
    ImportJob importJob = (ImportJob) pPropertyChangeEvent.getSource();
    DeploymentEvent event = toDeploymentEvent(importJob);   
    ProcessingPhase newPhase = (ProcessingPhase) pPropertyChangeEvent.getNewValue();
    ProcessingPhase oldPhase = (ProcessingPhase) pPropertyChangeEvent.getOldValue();
    
    List<DeploymentEvent> events = new ArrayList<DeploymentEvent>();
    switch (newPhase) {
      case IMPORT_START:
        event.setOldState(DeploymentEvent.IDLE);
        event.setNewState(DeploymentEvent.ACTIVE_APPLY);
        event.prepareForFiring();
        events.add(event);
        break;
      case IMPORT_ADD_UPDATE:
        if (importJob.getImportSession() instanceof SwitchingDSImportSession) {
          if (oldPhase == ProcessingPhase.IMPORT_DELETE) {
            event.setOldState(DeploymentEvent.DONE_APPLY);
            event.setNewState(DeploymentEvent.ACTIVE_ACTIVATE);
            event.prepareForFiring();
            events.add(event);
            event = toDeploymentEvent(importJob);
            event.setNewState(DeploymentEvent.ACTIVE_APPLY);
            event.setFirstApply(false);
            event.prepareForFiring();
            events.add(event);
          }
        }
        break;
      case IMPORT_COMPLETE_APPLY:
        event.setOldState(DeploymentEvent.ACTIVE_APPLY);
        event.setNewState(DeploymentEvent.DONE_APPLY);
        event.prepareForFiring();
        events.add(event);
        break;
      case COMPLETE:
        event.setOldState(DeploymentEvent.DONE_APPLY);
        event.setNewState(DeploymentEvent.ACTIVE_ACTIVATE);
        event.prepareForFiring();
        events.add(event);
        event = toDeploymentEvent(importJob);
        event.setOldState(DeploymentEvent.ACTIVE_ACTIVATE);
        event.setNewState(DeploymentEvent.DEPLOYMENT_COMPLETE);
        event.prepareForFiring();
        events.add(event);
        break;
    }
    return events;
  }
  
  /**
   * @param pImportJob
   * @return
   */
  protected DeploymentEvent toDeploymentEvent(ImportJob pImportJob) {
    vlogDebug("toDeploymentEvent() called: pImportJob == {0}", pImportJob);
    DeploymentEvent event = new DeploymentEvent(mDeploymentAgent, mDeploymentAgent);
    event.setAffectedItemTypes(pImportJob.getAffectedItemTypes());
    event.setAffectedRepositories(pImportJob.getAffectedItemTypes().keySet());
    event.setDeploymentBeginTimestamp(pImportJob.getStartTime().getTime());
    event.setDeploymentID(pImportJob.getJobId());
    // ???
    event.setDeploymentType(DeploymentEvent.TYPE_INCREMENTAL);
    // ???
    event.setDeploymentCreateInitiator(getSiebelDeploymentCreateInitiator());
    event.setTarget(getDeploymentTarget());
    if (pImportJob.getImportSession() instanceof SwitchingDSImportSession) {
      event.setFirstApply(
          ((SwitchingDSImportSession)pImportJob.getImportSession()).isSwitchFirstPhase());
    }
    vlogDebug("leaving toDeploymentEvent() : event == {0}", event);
    return event;
  }

  
}
