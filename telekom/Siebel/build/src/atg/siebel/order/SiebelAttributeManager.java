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

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import atg.commerce.CommerceException;
import atg.commerce.gifts.GiftlistHandlingInstruction;
import atg.commerce.order.InvalidTypeException;
import atg.commerce.order.ObjectCreationException;
import atg.core.util.ResourceUtils;
import atg.nucleus.GenericService;

/**
 * This class is the business layer object for managing and manipulating SiebelAttributes. This
 * class holds all the business logic for manipulating all types of SiebelAttributes.
 *
 * @author Patrick Mc Erlean
 * @version $Id: //product/Siebel/version/11.2/src/atg/siebel/order/SiebelAttributeManager.java#2 $$Change: 1194813 $
 * @updated $DateTime: 2015/09/10 08:26:24 $$Author: saysyed $
 */

public class SiebelAttributeManager extends GenericService
{
  //----------------------------------------------------------------------------------
  // Class version string
  //----------------------------------------------------------------------------------

  public static String CLASS_VERSION = "$Id: //product/Siebel/version/11.2/src/atg/siebel/order/SiebelAttributeManager.java#2 $$Change: 1194813 $";

  //----------------------------------------------------------------------------------
  // Constants
  //----------------------------------------------------------------------------------

  //----------------------------------------------------------------------------------
  // Member Variables
  //----------------------------------------------------------------------------------

  //----------------------------------------------------------------------------------
  // Constructor
  //----------------------------------------------------------------------------------

  /**
   * Constructs a SiebelAttributeManager object.
   */

  public SiebelAttributeManager()
  {
  }

  //----------------------------------------------------------------------------------
  // Properties
  //----------------------------------------------------------------------------------

  //----------------------------------------------------------------------------------
  // property: orderTools

  private SiebelOrderTools mOrderTools = null;

  /**
   * Returns property orderTools
   *
   * @return value of property orderTools
   */

  public SiebelOrderTools getOrderTools()
  {
    return mOrderTools;
  }

  /**
   * Sets property orderTools
   *
   * @param pOrderTools the value to set for property orderTools
   */

  public void setOrderTools(SiebelOrderTools pOrderTools)
  {
    mOrderTools = pOrderTools;
  }

  //----------------------------------------------------------------------------------
  // Methods
  //----------------------------------------------------------------------------------

  /**
   * Creates a new SiebelAttribute object.
   *
   * @exception CommerceException if the instantiation of an object fails
   */

  public SiebelAttribute createSiebelAttribute () throws CommerceException
  {
    return createSiebelAttribute (null, null, null, null, null);
  }

  /**
   * Creates a new SiebelAttribute object and populates it with the specified data.
   *
   * @param pAttributeDefinitionId the id of the attribute definition in the catalog
   * @param pAttributeName the name of the attribute in the catalog
   * @param pActionCode the attribute action code (No Action, Add, Update or Delete)
   * @param pValue the attribute value
   *
   * @exception CommerceException if the instantiation of an object fails
   */

  public SiebelAttribute createSiebelAttribute (String pAttributeDefinitionId, String pAttributeName, String pActionCode, String pValue, String pPropTypeCD) throws CommerceException
  {
    SiebelAttribute attribute = null;

    // Call OrderTools to create the attribute.
    try
    {
      attribute = getOrderTools().createSiebelAttribute (pAttributeDefinitionId, pAttributeName, pActionCode, pValue, pPropTypeCD);
    }
    catch (ObjectCreationException e)
    {
      throw new CommerceException (SiebelConstants.FAILED_TO_CREATE_ATTRIBUTE_OBJECT, e);
    }

    return attribute;
  }
  
  /**
   * Creates a new SiebelAttribute object and populates it with property values from the 
   * SiebelAttribute parameter
   *
   * @param pAttributeToCopy - the SiebelAttribute that want to copy
   *
   * @exception CommerceException if the instantiation of an object fails
   */

  public SiebelAttribute copySiebelAttribute (SiebelAttribute pAttributeToCopy) throws CommerceException
  {
    SiebelAttribute attribute = null;

    // Call OrderTools to create the attribute.
    try
    {
      attribute = getOrderTools().createSiebelAttribute (
          pAttributeToCopy.getAttributeDefinitionId(), 
          pAttributeToCopy.getAttributeName(), 
          pAttributeToCopy.getActionCode(), 
          pAttributeToCopy.getValue(),
          pAttributeToCopy.getPropTypeCD());
    }
    catch (ObjectCreationException e)
    {
      throw new CommerceException (SiebelConstants.FAILED_TO_CREATE_ATTRIBUTE_OBJECT, e);
    }

    return attribute;
  }
}
