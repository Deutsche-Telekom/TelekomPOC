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

package atg.siebel.integration;

import java.util.HashMap;
import java.util.Map;

import atg.adapter.integrations.IntegrationRepository;
import atg.adapter.integrations.IntegrationRepositoryItemDescriptor;
import atg.adapter.integrations.IntegrationRepositoryView;
import atg.integrations.Command;
import atg.integrations.CommandResult;
import atg.repository.MutableRepository;
import atg.repository.Query;
import atg.repository.QueryOptions;
import atg.repository.RepositoryException;
import atg.repository.RepositoryItem;
import atg.repository.RepositoryView;
import atg.repository.databinding.PropertyMappingElement;

/**
 * This IntegrationRepositoryView implementation takes the elements of a query
 * and transfers them to a map to use as the Input object into Siebel query
 * commands.
 */
@SuppressWarnings("serial")
public class SiebelQueryView
  extends IntegrationRepositoryView {

  //-------------------------------------
  /** Class version string */

  public static String CLASS_VERSION = "$Id: //product/Siebel/version/11.2/src/atg/siebel/integration/SiebelQueryView.java#2 $$Change: 1194813 $";

  /**
   * This is the version of executeUncachedQuery that ends up getting called.
   * The parameter values are null, so we throw them out and then pass to
   * IntegrationRepositoryView.executeUncachedQuery();
   */
  public RepositoryItem[] executeUncachedQuery(Query pQuery,
    QueryOptions pOptions, Object[] pParameterValues)
    throws RepositoryException {

    String query = pQuery.getQueryRepresentation();

    /*
     * ALL-ITEMS - pass this to local system.
     */
    if (query.equals("ALL-ITEMS")) {
      // handle this in the local repository
      MutableRepository localRepo =
        ((IntegrationRepository) getRepository()).getLocalMutableRepository();
      RepositoryView view = localRepo.getView(localRepo.getDefaultViewName());
      return view.executeQuery(pQuery, pOptions);
    }

    return executeUncachedQuery(pQuery, pOptions);
  }

  /**
   * Grab the terms of the query and put them in a map
   */
  public Object
    createQueryCommandInput(Query pQuery, QueryOptions pQueryOptions)
      throws RepositoryException {
    IntegrationRepositoryItemDescriptor desc =
      (IntegrationRepositoryItemDescriptor) getItemDescriptor();
    @SuppressWarnings("unchecked")
    Map<String, PropertyMappingElement> mappings =
      desc.getItemMappingElement().getMappingByName();

    Map<String, String> input = new HashMap<String, String>();
    String query = pQuery.getQueryRepresentation();

    /*
     * ALL-ITEMS - pass this to local system.
     */
    if (query.equals("ALL-ITEMS")) {
      return input;
    }

    /*
     * AND
     */
    String[] terms = query.split("AND");
    for (int i = 0; i < terms.length; i++) {
      String term = terms[i];
      int equalSignIndex = term.indexOf('=');
      String propertyName = term.substring(0, equalSignIndex - 1);
      propertyName = propertyName.substring(propertyName.lastIndexOf('(') + 1);
      String targetPropertyName = mappings.get(propertyName).getTargetName();

      int endIndex = term.lastIndexOf(')');
      String value = term.substring(equalSignIndex + 3, endIndex);
      if (value.length() > 0) {
        if (value.lastIndexOf(')') == (value.length() - 1))
          value = value.substring(0, value.length() - 1);
        input.put(targetPropertyName, value);
      }
    }

    return input;

  }

  /**
   * No-op this - we only have one result anyway, and the IntegrationViewImpl
   * method throws ArrayIndexOutOfBounds
   */
  public RepositoryItem[] applyOptions(RepositoryItem[] pItems,
    QueryOptions pOptions) throws RepositoryException {
    return pItems;
  }
  
  /**
   * overriding the method to make it available in Integration app
   */
  public RepositoryItem[] processResults(Command pCommand, CommandResult pCommandResult) throws RepositoryException {
    return super.processResults(pCommand, pCommandResult);
  }
}
