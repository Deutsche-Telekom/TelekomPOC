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

package atg.siebel.order;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import atg.commerce.order.InvalidParameterException;

/**
 * A class which manages Siebel attribute objects.
 * 
 * @author Patrick Mc Erlean
 * @version $Id:
 *          //product/Siebel/main/src/atg/siebel/order/SiebelAttributeContainerImpl
 *          .java#1 $$Change: 1194813 $
 * @updated $DateTime: 2015/09/10 08:26:24 $$Author: saysyed $
 */

@SuppressWarnings("serial")
public class SiebelAttributeContainerImpl
  implements SiebelAttributeContainer {
  // ----------------------------------------------------------------------------------
  // Class version string
  // ----------------------------------------------------------------------------------

  public static String CLASS_VERSION =
    "$Id: //product/Siebel/version/11.2/src/atg/siebel/order/SiebelAttributeContainerImpl.java#2 $$Change: 1194813 $";

  // ----------------------------------------------------------------------------------
  // Constants
  // ----------------------------------------------------------------------------------

  // ----------------------------------------------------------------------------------
  // Member Variables
  // ----------------------------------------------------------------------------------

  private Map<String, SiebelAttribute> mAttributeHashmap =
    new HashMap<String, SiebelAttribute>(7);
  private List<SiebelAttribute> mAttributeArray =
    new ArrayList<SiebelAttribute>(5);

  // ----------------------------------------------------------------------------------
  // Constructor
  // ----------------------------------------------------------------------------------

  /**
   * Constructs a SiebelAttributeContainerImpl object.
   */

  public SiebelAttributeContainerImpl() {
  }

  // ----------------------------------------------------------------------------------
  // Methods
  // ----------------------------------------------------------------------------------

  /**
   * getSiebelAttributes
   * 
   * Returns a List of attributes. Note that the returned List should not be
   * edited directly. Doing so will result in unexpected behavior. Any editing
   * should be done through this class.
   */

  public List<SiebelAttribute> getSiebelAttributes() {
    return (Collections.unmodifiableList(mAttributeArray));
  }

  /**
   * addSiebelAttribute
   * 
   * Add an attribute to the container. If the attribute was already in the
   * container a DuplicateAttributeException is thrown.
   * 
   * @param pAttribute
   *          the attribute to be added
   * @exception DuplicateAttributeException
   * @exception InvalidParameterException
   */

  public void addSiebelAttribute(SiebelAttribute pAttribute)
    throws DuplicateAttributeException, InvalidParameterException {
    if (pAttribute == null) {
      throw new InvalidParameterException(SiebelConstants.INVALID_ATTRIBUTE);
    }

    if (mAttributeHashmap.containsKey(pAttribute.getId())) {
      Object[] msgArgs = { pAttribute.getId() };

      throw new DuplicateAttributeException(MessageFormat.format(
        SiebelConstants.DUPLICATE_ATTRIBUTE, msgArgs));
    }

    synchronized (this) {
      // Add the Attribute to both the ArrayList and HashMap

      mAttributeArray.add(pAttribute);
      mAttributeHashmap.put(pAttribute.getId(), pAttribute);
    }
  }

  /**
   * addSiebelAttribute
   * 
   * Add an attribute to the container at the given index. If the attribute was
   * already in the container a DuplicateAttributeException is thrown.
   * 
   * @param pAttribute
   *          the attribute to be added
   * @param pIndex
   *          the container index where the attribute is to be added
   * @exception DuplicateAttributeException
   * @exception InvalidParameterException
   */

  public void addSiebelAttribute(SiebelAttribute pAttribute, int pIndex)
    throws DuplicateAttributeException, InvalidParameterException {
    if (pAttribute == null) {
      throw new InvalidParameterException(SiebelConstants.INVALID_ATTRIBUTE);
    }

    if (pIndex < 0 || pIndex > mAttributeArray.size()) {
      throw new InvalidParameterException(SiebelConstants.INVALID_INDEX_VALUE);
    }

    if (mAttributeHashmap.containsKey(pAttribute.getId())) {
      Object[] msgArgs = { pAttribute.getId() };

      throw new DuplicateAttributeException(MessageFormat.format(
        SiebelConstants.DUPLICATE_ATTRIBUTE, msgArgs));
    }

    synchronized (this) {
      // Add the Attribute to both the ArrayList and HashMap

      mAttributeArray.add(pIndex, pAttribute);
      mAttributeHashmap.put(pAttribute.getId(), pAttribute);
    }
  }

  /**
   * removeAttribute
   * 
   * Removes the attribute whose id is passed as a parameter. If the attribute
   * is not in the container then a AttributeNotFoundException is thrown.
   * Otherwise a reference to the removed attribute is returned.
   * 
   * @param pAttributeId
   *          the id of the attribute to be removed
   * @exception AttributeNotFoundException
   * @exception InvalidParameterException
   */

  public SiebelAttribute removeAttribute(String pAttributeId)
    throws AttributeNotFoundException, InvalidParameterException {
    SiebelAttribute returnAttribute = null;
    SiebelAttribute attribute = null;

    if (pAttributeId == null) {
      throw new InvalidParameterException(SiebelConstants.INVALID_ATTRIBUTE_ID);
    }

    // Remove the attribute from the array and hashmap

    synchronized (this) {
      returnAttribute =
        (SiebelAttribute) mAttributeHashmap.remove(pAttributeId);

      if (returnAttribute == null) {
        Object[] msgArgs = { pAttributeId };

        throw new AttributeNotFoundException(MessageFormat.format(
          SiebelConstants.ATTRIBUTE_NOT_FOUND, msgArgs));
      }

      Iterator<SiebelAttribute> iterator = mAttributeArray.iterator();

      while (iterator.hasNext()) {
        attribute = iterator.next();

        if (pAttributeId.equals(attribute.getId())) {
          iterator.remove();
          break;
        }
      }
    }

    return returnAttribute;
  }

  /**
   * removeAllAttributes
   * 
   * Removes all of the attributes from the container.
   */

  public void removeAllAttributes() {
    // Remove the attributes from the array and hashmap

    synchronized (this) {
      mAttributeHashmap.clear();
      mAttributeArray.clear();
    }
  }

  /**
   * removeAttribute
   * 
   * Returns the attribute specified by the id passed in. If the attribute with
   * the corresponding id is not in the container then an
   * AttributeNotFoundException is thrown.
   * 
   * @param pAttributeId
   *          the id of the attribute to be returned
   * @exception AttributeNotFoundException
   * @exception InvalidParameterException
   */

  public SiebelAttribute getAttribute(String pAttributeId)
    throws AttributeNotFoundException, InvalidParameterException {
    SiebelAttribute attribute = null;

    if (pAttributeId == null) {
      throw new InvalidParameterException(SiebelConstants.INVALID_ATTRIBUTE_ID);
    }

    // Retrieve the attribute from the hashmap.

    synchronized (this) {
      attribute = (SiebelAttribute) mAttributeHashmap.get(pAttributeId);
    }

    if (attribute == null) {
      Object[] msgArgs = { pAttributeId };

      throw new AttributeNotFoundException(MessageFormat.format(
        SiebelConstants.ATTRIBUTE_NOT_FOUND, msgArgs));
    }

    return attribute;
  }

  /**
   * getAttributeCount
   * 
   * Returns the number of attributes in the container
   */

  public int getAttributeCount() {
    return mAttributeArray.size();
  }
}
