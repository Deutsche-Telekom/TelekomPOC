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

import atg.repository.MutableRepository;
import atg.repository.MutableRepositoryItem;
import atg.repository.RepositoryException;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * This class is used to pass property values between two operations where
 * the shared information isn't present in the first one to work with.  For
 * example, when a user is created with an address, the user item doesn't exist
 * in ATG until the transaction is complete.  Therefore in the command class
 * for inserting a user the home address cannot be set.  It needs to be set
 * on the user after the user is finished being created.
 * 
 * @author jturgeon, jwheaton
 * 
 */
public class ThreadLocalPropertyChanges {

  // -------------------------------------
  /** Class version string */

  public static String CLASS_VERSION =
    "$Id: //product/Siebel/version/11.2/src/atg/siebel/integration/ThreadLocalPropertyChanges.java#2 $$Change: 1194813 $";

  @SuppressWarnings("rawtypes")
  private static ThreadLocal<HashMap> tLocal = new ThreadLocal<HashMap>();

  /**
   * Add a value to the map in ThreadLocal.
   * 
   * @param pKey
   *          Object (expected to be a String in use...) of the key.
   * @param pValue
   *          Object of the value
   */
  @SuppressWarnings({ "rawtypes", "unchecked" })
  public static void put(Object pKey, Object pValue) {
    ((HashMap) get()).put(pKey, pValue);
  }

  /**
   * @return HashMap of the Map in ThreadLocal OR an empty HashMap if none
   *         exists
   */
  @SuppressWarnings("rawtypes")
  public static HashMap get() {
    if (tLocal.get() == null)
      tLocal.set(new HashMap());

    return (HashMap) tLocal.get();
  }

  /**
   * Iterates over the values stored in the ThreadLocal Map and updates the
   * properties on the specified item in the specified repository.
   * 
   * @param pItem
   *          MutableRepositoryItem of the item to update.
   * @param pRepository
   *          MutableRepository where the item resides.
   * @param pClearMap
   *          boolean indicating if the map of properties should be cleared
   *          after the item is updated.
   * @throws RepositoryException
   */
  @SuppressWarnings("rawtypes")
  public static void updateProperties(MutableRepositoryItem pItem,
    MutableRepository pRepository, boolean pClearMap)
    throws RepositoryException {

    HashMap propertyChanges = get();
    if (propertyChanges != null && propertyChanges.entrySet() != null) {
      Iterator iter = propertyChanges.entrySet().iterator();
      while (iter.hasNext()) {
        Map.Entry pairs = (Map.Entry) iter.next();
        if (pItem.getItemDescriptor().hasProperty((String) pairs.getKey())) {
          pItem.setPropertyValue((String) pairs.getKey(), pairs.getValue());
        }
      }
    }

    try {
      pRepository.updateItem(pItem);
    } catch (RepositoryException re) {
      re.printStackTrace();
    }

    if (pClearMap) {
      get().clear();
    }
  }

  /**
   * Iterates over the values stored in the ThreadLocal Map and updates the
   * properties on the specified item in the specified repository. Will NOT
   * clear the map of properties after update.
   * 
   * @param pItem
   *          MutableRepositoryItem of the item to update.
   * @param pRepository
   *          MutableRepository where the item resides.
   * @throws RepositoryException
   */
  public static void updateProperties(MutableRepositoryItem pItem,
    MutableRepository pRepository) throws RepositoryException {
    updateProperties(pItem, pRepository, false);
  }
}
