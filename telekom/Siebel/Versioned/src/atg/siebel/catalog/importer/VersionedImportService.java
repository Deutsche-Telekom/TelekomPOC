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

import java.util.Iterator;

import atg.adapter.version.VersionRepository;
import atg.epub.PublishingWorkflowAutomator;
import atg.repository.Repository;

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
public class VersionedImportService extends SingleThreadedImportService {
	// -------------------------------------
	public static String CLASS_VERSION = "$Id: //product/Siebel/version/11.2/Versioned/src/atg/siebel/catalog/importer/VersionedImportService.java#2 $$Change: 1196386 $";

	// -------------------------------------

	// -------------------------------------
	// property: publishingWorkflowAutomator
	// -------------------------------------
	private PublishingWorkflowAutomator mPublishingWorkflowAutomator;

	public PublishingWorkflowAutomator getPublishingWorkflowAutomator() {
		return mPublishingWorkflowAutomator;
	}

	public void setPublishingWorkflowAutomator(PublishingWorkflowAutomator pPublishingWorkflowAutomator) {
		mPublishingWorkflowAutomator = pPublishingWorkflowAutomator;
	}

	// -------------------------------------
	// Constructor
	// -------------------------------------
	public VersionedImportService() {
		super();
	}

	public ImportSession createImportSession() throws ImportException {

    logDebugMessage("VersionedImportService.createImportSession() called");
    Iterator<Repository> iter = mTargetRepositories.values().iterator();
    Repository repository = iter.next();

    if (repository == null) {
      throw new ImportException("Invalid Repository - null");
    }
		
    ImportSession session = null;
		if (repository instanceof VersionRepository) {
  		session = new VersionedImportSession(getPublishingWorkflowAutomator(), getExportJobId());
      session.setImportService(this);
		}
    logDebugMessage("Leaving createImportSession(): session == " + session);
		return session;
	}

}
