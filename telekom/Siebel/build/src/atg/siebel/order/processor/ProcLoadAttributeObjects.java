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

package atg.siebel.order.processor;

import atg.beans.DynamicBeans;
import atg.commerce.order.*;
import atg.commerce.order.processor.OrderRepositoryUtils;
import atg.repository.ItemDescriptorImpl;
import atg.repository.MutableRepositoryItem;
import atg.repository.RepositoryException;
import atg.repository.RepositoryItemDescriptor;
import atg.service.pipeline.PipelineProcessor;
import atg.service.pipeline.PipelineResult;
import atg.siebel.order.SiebelAttribute;
import atg.siebel.order.SiebelCommerceItem;
import atg.siebel.order.SiebelConstants;

import atg.commerce.order.processor.LoadProperties;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/**
 * This method loads the SiebelAttribute objects from the OrderRepository into a SiebelCommerceItem
 * in the Order object.
 *
 * @author Patrick Mc Erlean
 * @version $Id: //product/Siebel/version/11.2/src/atg/siebel/order/processor/ProcLoadAttributeObjects.java#2 $$Change: 1194813 $
 * @updated $DateTime: 2015/09/10 08:26:24 $$Author: saysyed $
 */

public class ProcLoadAttributeObjects extends LoadProperties implements PipelineProcessor
{
  //----------------------------------------------------------------------------------
  // Class version string
  //----------------------------------------------------------------------------------

  public static String CLASS_VERSION = "$Id: //product/Siebel/version/11.2/src/atg/siebel/order/processor/ProcLoadAttributeObjects.java#2 $$Change: 1194813 $";

  //----------------------------------------------------------------------------------
  // Constants
  //----------------------------------------------------------------------------------

  private final int SUCCESS = 1;

  //----------------------------------------------------------------------------------
  // Member Variables
  //----------------------------------------------------------------------------------

  //----------------------------------------------------------------------------------
  // Constructor
  //----------------------------------------------------------------------------------

  /**
   * Constructs a ProcLoadAttributeObjects instance.
   */

  public ProcLoadAttributeObjects ()
  {
  }

  //----------------------------------------------------------------------------------
  // Properties
  //----------------------------------------------------------------------------------

  //----------------------------------------------------------------------------------
  // property: commerceItemsPropertyName

  private String mCommerceItemsPropertyName = "commerceItems";

  /**
   * Returns the commerce items property name.
   */

  public String getCommerceItemsPropertyName ()
  {
    return mCommerceItemsPropertyName;
  }

  /**
   * Sets the commerce items property name.
   */

  public void setCommerceItemsPropertyName (String pCommerceItemsPropertyName)
  {
    mCommerceItemsPropertyName = pCommerceItemsPropertyName;
  }

  //----------------------------------------------------------------------------------
  // property: attributesPropertyName

  private String mAttributesPropertyName = "attributes";

  /**
   * Returns the attributes property name.
   */

  public String getAttributesPropertyName()
  {
    return mAttributesPropertyName;
  }

  /**
   * Sets the mAttributes property name.
   */

  public void setAttributesPropertyName (String pAttributesPropertyName)
  {
    mAttributesPropertyName = pAttributesPropertyName;
  }

  //----------------------------------------------------------------------------------
  // property: LoggingIdentifier

  String mLoggingIdentifier = "ProcLoadAttributeObjects";

  /**
   * Sets property LoggingIdentifier
   **/

  public void setLoggingIdentifier(String pLoggingIdentifier)
  {
    mLoggingIdentifier = pLoggingIdentifier;
  }

  /**
   * Returns property LoggingIdentifier
   **/

  public String getLoggingIdentifier()
  {
    return mLoggingIdentifier;
  }

  //----------------------------------------------------------------------------------
  // Methods
  //----------------------------------------------------------------------------------

  /**
   * getRetCodes
   *
   * Returns the valid return codes.
   * 1 - The processor completed
   *
   * @return an integer array of the valid return codes.
   */

  public int[] getRetCodes()
  {
    int[] returnCodes = {SUCCESS};

    return returnCodes;
  }

  /**
   * runProcess
   *
   * This process loads the SiebelAttribute objects from the OrderRepository into a SiebelCommerceItem
   * in the Order object. It does this by constructing a new SiebelAttribute instance based on the
   * class mapped to the repository item type of the seibelAttrbute. It then iterates through the
   * properties listed in the loadProperties property inherited by this class, setting the values in the
   * object.
   *
   * This method requires that an Order, order repository item, and OrderManager object
   * be supplied in pParam in a HashMap. Use the PipelineConstants class' static members to key
   * the objects in the HashMap.
   *
   * @param pParam a HashMap which must contain an Order, order repository item, and OrderManager object
   * @param pResult a PipelineResult object which stores any information which must
   *                be returned from this method invocation
   * @return an integer specifying the processor's return code
   * @exception Exception throws any exception back to the caller
   * @see atg.service.pipeline.PipelineProcessor#runProcess(Object, PipelineResult)
   */

  public int runProcess (Object pParam, PipelineResult pResult) throws Exception
  {
    HashMap map = null;
    Order order = null;
    MutableRepositoryItem orderItem = null;
    OrderManager orderManager = null;
    Boolean invalidateCache = null;
    OrderTools orderTools = null;

    // Initialise the processor

    map = (HashMap) pParam;
    order = (Order) map.get (PipelineConstants.ORDER);
    orderItem = (MutableRepositoryItem) map.get (PipelineConstants.ORDERREPOSITORYITEM);
    orderManager = (OrderManager) map.get (PipelineConstants.ORDERMANAGER);
    orderTools = orderManager.getOrderTools();
    invalidateCache = (Boolean) map.get (PipelineConstants.INVALIDATECACHE);

    // Check for null parameters

    if (order == null)
    {
      throw new InvalidParameterException(SiebelConstants.INVALID_ORDER_PARAMETER);
    }

    if (orderItem == null)
    {
      throw new InvalidParameterException(SiebelConstants.INVALID_REPOSITORY_ITEM_PARAMETER);
    }

    if (orderManager == null)
    {
      throw new InvalidParameterException(SiebelConstants.INVALID_ORDER_MANAGER_PARAMETER);
    }

    if (invalidateCache == null)
    {
      invalidateCache = Boolean.FALSE;
    }

    // Call the loadAttributes method

    loadAttributes (order, order, orderManager, orderTools, invalidateCache);

    return SUCCESS;
  }

  /**
   * loadAttributes
   *
   * This method is the one that actually goes through the work of creating the attribute objects from the
   * Siebel commerce items in the order.
   *
   * @param pOrder the order wrapper object.
   * @param pCommerceItemContainer the container for the siebelCommerceItems being processed.
   * @param pOrderManager the OrderManager passed in with the pipeline params
   * @param pOrderTools the OrderTools passed in with the pipeline params
   * @param pInvalidateCache If true, then each attribute's repository cache entry is invalidated
   **/

  protected void loadAttributes (Order pOrder, CommerceItemContainer pCommerceItemContainer,
                                     OrderManager pOrderManager, OrderTools pOrderTools,
                                     Boolean pInvalidateCache) throws Exception
  {
    CommerceIdentifier commerceIdentifier = null;
    MutableRepositoryItem siebelCommerceItemRepositoryItem = null;
    MutableRepositoryItem attributeRepositoryItem = null;
    RepositoryItemDescriptor attributeItemDescriptor = null;
    SiebelCommerceItem siebelCommerceItem = null;
    List siebelCommerceItems = null;
    List attributes = null;
    Iterator siebelCommerceItemIterator = null;
    Iterator attributeIterator = null;
    String attributeClassName = null;
    String mappedPropertyName = null;
    String[] loadProperties = null;
    Object value;

    // Get the properties to load.

    loadProperties = getLoadProperties();
    //BB ---- ADDED START
    if (loadProperties == null || loadProperties.length == 0) {
    	return;
    }
    //BB ---- ADDED END

    // Process the list of siebel commerce item wrappers.

    siebelCommerceItems = pCommerceItemContainer.getCommerceItems();

    siebelCommerceItemIterator = siebelCommerceItems.iterator();

    while (siebelCommerceItemIterator.hasNext())
    {
      // Get the SiebelCommerceItem wrapper object.

      siebelCommerceItem = (SiebelCommerceItem) siebelCommerceItemIterator.next();

      // Get the SiebelCommerceItem repository item.

      siebelCommerceItemRepositoryItem = (MutableRepositoryItem) siebelCommerceItem.getRepositoryItem();

      // Get the attributes from the SiebelCommerceItem repository item.

      attributes = (List) siebelCommerceItemRepositoryItem.getPropertyValue (getAttributesPropertyName());

      // Navigate the attributes.

      attributeIterator = attributes.iterator();

      while (attributeIterator.hasNext())
      {
        // Get the next attribute repository item.

        attributeRepositoryItem = (MutableRepositoryItem) attributeIterator.next();

        // Get the attribute item descriptor.

        attributeItemDescriptor = attributeRepositoryItem.getItemDescriptor();

        // Check if the cache must be invalidated.

        if (pInvalidateCache.booleanValue())
        {
          invalidateCache ((ItemDescriptorImpl) attributeItemDescriptor, attributeRepositoryItem);
        }

        // Find the class which corresponds to the attribute item descriptor.

        attributeClassName = pOrderTools.getMappedBeanName (attributeItemDescriptor.getItemDescriptorName());

        // Set the id in the CommerceIdentifier object.

        commerceIdentifier = (CommerceIdentifier) Class.forName (attributeClassName).newInstance();
        DynamicBeans.setPropertyValue(commerceIdentifier, "id", attributeRepositoryItem.getRepositoryId());

        // Set the repository item in the object to the current attribute repository item.

        if (commerceIdentifier instanceof ChangedProperties)
        {
          ((ChangedProperties) commerceIdentifier).setRepositoryItem (attributeRepositoryItem);
        }

        // Load the repository properties into the wrapper object.

        for (int i = 0; i < loadProperties.length; i++)
        {
          mappedPropertyName = getMappedPropertyName (loadProperties[i]);

          if (attributeItemDescriptor.hasProperty (loadProperties[i]))
          {
            value = attributeRepositoryItem.getPropertyValue (loadProperties[i]);

            if (isLoggingDebug())
            {
              logDebug("load property[" + loadProperties[i] + ":" + value + ":"
                          + commerceIdentifier.getClass().getName() + ":" + commerceIdentifier.getId() + "]");
            }

            OrderRepositoryUtils.setPropertyValue(pOrder, commerceIdentifier, mappedPropertyName, value);
          }
        }

        if (commerceIdentifier instanceof ChangedProperties)
        {
          ((ChangedProperties) commerceIdentifier).clearChangedProperties();
        }

        siebelCommerceItem.addSiebelAttribute ((SiebelAttribute) commerceIdentifier);
      }

      if (siebelCommerceItem instanceof ChangedProperties)
      {
        ((ChangedProperties) siebelCommerceItem).clearChangedProperties();
      }

      // Check if this commerce item has children.

      if (siebelCommerceItem.getCommerceItemCount() > 0)
      {
        // Process the children.

        loadAttributes (pOrder, siebelCommerceItem, pOrderManager, pOrderTools, pInvalidateCache);
      }
    }

    return;
  }


  /**
   * This method is the one that actually goes through the work of
   * building commerce item objects out of the data in the order
   * repository.  It first creates a new instance of the commerce item
   * class (using the type configured in
   * <code>OrderTools.beanNameToItemDescriptorMap</code> Once the
   * object is created, the id is set, then each property in
   * <code>loadProperties</code> is copied into the object (this list
   * is usually empty, since most properties directly read from the
   * repository item).  The item is then added to the given order.  If
   * The item is a CommerceItemContainer
   * (e.g. ConfigurableCommerceItem) then this method is recursively
   * called.
   *
   * @param order The order being created
   * @param itemContainer The container for the commerce items being
   *                      created.  This is usually the same object as "order"
   * @param commerceItems The list of commerceItem repository items
   * @param orderManager The OrderManager passed in with the pipeline params
   * @param orderTools The OrderTools passed in with the pipeline params
   * @param invalidateCache If true, then each commerce item's repository cache
   *                        entry is invalidated
   **/
  protected void loadCommerceItems(Order order, CommerceItemContainer itemContainer,
                                   List commerceItems, OrderManager orderManager,
                                   OrderTools orderTools, Boolean invalidateCache) throws Exception
  {
    CommerceIdentifier ci;
    MutableRepositoryItem mutItem;
    RepositoryItemDescriptor desc;
    String className, mappedPropName;
    String[] loadProperties = getLoadProperties();
    Object value;

    Iterator iter = commerceItems.iterator();
    while (iter.hasNext()) {
      mutItem = (MutableRepositoryItem) iter.next();

      if(mutItem == null) {
        if(isLoggingError()) {
          logError("Null commerceItem in order: " + order.getId());
        }
        continue;
      }

      desc = mutItem.getItemDescriptor();

      if (invalidateCache.booleanValue())
        invalidateCache((ItemDescriptorImpl) desc, mutItem);

      className = orderTools.getMappedBeanName(desc.getItemDescriptorName());
      ci = (CommerceIdentifier) Class.forName(className).newInstance();

      DynamicBeans.setPropertyValue(ci, "id", mutItem.getRepositoryId());
      if (ci instanceof ChangedProperties)
        ((ChangedProperties) ci).setRepositoryItem(mutItem);

      // this is where the properties are loaded from the repository into the order
      for (int i = 0; i < loadProperties.length; i++) {
        mappedPropName = getMappedPropertyName(loadProperties[i]);
        if (desc.hasProperty(loadProperties[i])) {
          value = mutItem.getPropertyValue(loadProperties[i]);
          if (isLoggingDebug())
            logDebug("load property[" + loadProperties[i] + ":" + value + ":"
                        + ci.getClass().getName() + ":" + ci.getId() + "]");
          OrderRepositoryUtils.setPropertyValue(order, ci, mappedPropName, value);
        }
      }

      if (ci instanceof ChangedProperties)
        ((ChangedProperties) ci).clearChangedProperties();

      if(isLoggingDebug())
        logDebug("loading commerce item " + ci.getClass().getName() + ":" + ci.getId() + "class of container is " + itemContainer.getClass().getName());
      itemContainer.addCommerceItem((CommerceItem) ci);

      if (ci instanceof CommerceItemContainer) {
        if(isLoggingDebug())
          logDebug("This item is a commerce item container. Loading the items in the container. The class of container is " + ci.getClass().getName());
        loadCommerceItems(order, (CommerceItemContainer) ci, (List) mutItem.getPropertyValue(
                                     getCommerceItemsPropertyName()), orderManager, orderTools, invalidateCache);
      }
    } // while
  } // method

  /**
   * invalidateCache
   *
   * This method invalidates the item from the cache if invalidateCache is true.
   *
   * @param pAttributeItemDescriptor the item descriptor for the siebel attribute
   * @param pAttributeRepositoryItem the repository item for the siebel attribute
   */

  protected void invalidateCache (ItemDescriptorImpl pAttributeItemDescriptor, MutableRepositoryItem pAttributeRepositoryItem)
  {
    try
    {
      pAttributeItemDescriptor.removeItemFromCache (pAttributeRepositoryItem.getRepositoryId());
    }
    catch (RepositoryException e)
    {
      if (isLoggingWarning())
      {
        logWarning("Unable to invalidate item descriptor " + pAttributeItemDescriptor.getItemDescriptorName() +
                                ":" + pAttributeRepositoryItem.getRepositoryId());
      }
    }
  }
}