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

import java.text.MessageFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import atg.beans.PropertyNotFoundException;
import atg.commerce.CommerceException;
import atg.commerce.order.ChangedProperties;
import atg.commerce.order.InvalidParameterException;
import atg.commerce.order.Order;
import atg.commerce.order.OrderManager;
import atg.commerce.order.OrderTools;
import atg.commerce.order.PipelineConstants;
import atg.commerce.order.processor.OrderRepositoryUtils;
import atg.commerce.order.processor.SavedProperties;
import atg.repository.ConcurrentUpdateException;
import atg.repository.MutableRepository;
import atg.repository.MutableRepositoryItem;
import atg.repository.Repository;
import atg.service.pipeline.PipelineProcessor;
import atg.service.pipeline.PipelineResult;
import atg.siebel.order.SiebelAttribute;
import atg.siebel.order.SiebelCommerceItem;
import atg.siebel.order.SiebelConstants;

/**
 * This processor saves the SiebelAttribute objects into the OrderRepository
 * from the Order object.
 * 
 * @author Patrick Mc Erlean
 * @version $Id: //product/Siebel/main/src/atg/siebel/order/processor/
 *          ProcSaveAttributeObjects.java#1 $$Change: 1194813 $
 * @updated $DateTime: 2015/09/10 08:26:24 $$Author: saysyed $
 */

public class ProcSaveAttributeObjects
  extends SavedProperties
  implements PipelineProcessor {
  // ----------------------------------------------------------------------------------
  // Class version string
  // ----------------------------------------------------------------------------------

  public static String CLASS_VERSION =
    "$Id: //product/Siebel/version/11.2/src/atg/siebel/order/processor/ProcSaveAttributeObjects.java#2 $$Change: 1194813 $";

  // ----------------------------------------------------------------------------------
  // Constants
  // ----------------------------------------------------------------------------------

  private final int SUCCESS = 1;

  // ----------------------------------------------------------------------------------
  // Member Variables
  // ----------------------------------------------------------------------------------

  // ----------------------------------------------------------------------------------
  // Constructor
  // ----------------------------------------------------------------------------------

  /**
   * Constructs a ProcLoadAttributeObjects instance.
   */

  public void ProcLoadAttributeObjects() {
  }

  // ----------------------------------------------------------------------------------
  // Properties
  // ----------------------------------------------------------------------------------

  // ----------------------------------------------------------------------------------
  // property: LoggingIdentifier

  String mLoggingIdentifier = "ProcSaveAttributeObjects";

  /**
   * Sets property LoggingIdentifier
   **/

  public void setLoggingIdentifier(String pLoggingIdentifier) {
    mLoggingIdentifier = pLoggingIdentifier;
  }

  /**
   * Returns property LoggingIdentifier
   **/

  public String getLoggingIdentifier() {
    return mLoggingIdentifier;
  }

  // ----------------------------------------------------------------------------------
  // Methods
  // ----------------------------------------------------------------------------------

  /**
   * getRetCodes
   * 
   * Returns the valid return codes. 1 - The processor completed
   * 
   * @return an integer array of the valid return codes.
   */

  public int[] getRetCodes() {
    int[] returnCodes = { SUCCESS };

    return returnCodes;
  }

  /**
   * runProcess
   * 
   * This method saves the SiebelAttribute objects into the OrderRepository from
   * the Order object. It iterates through the properties listed in the
   * saveProperties property inherited by this class, setting the values in the
   * repository.
   * 
   * This method requires that an Order, OrderRepository, and OrderManager
   * object be supplied in pParam in a HashMap. Use the PipelineConstants class'
   * static members to key the objects in the HashMap.
   * 
   * @param pParam
   *          a HashMap which must contain an Order, OrderRepository, and
   *          OrderManager object
   * @param pResult
   *          a PipelineResult object which stores any information which must be
   *          returned from this method invocation
   * @return an integer specifying the processor's return code
   * @exception Exception
   *              throws any exception back to the caller
   * @see atg.service.pipeline.PipelineProcessor#runProcess(Object,
   *      PipelineResult)
   */

  @SuppressWarnings("unchecked")
  public int runProcess(Object pParam, PipelineResult pResult) throws Exception {
    Order order = null;
    OrderTools orderTools = null;
    OrderManager orderManager = null;
    Repository orderRepository = null;
    MutableRepository mutableOrderRepository = null;
    boolean changed = false;

    // Initialise the processor
    if (!(pParam instanceof Map)) {
      String msg =
        MessageFormat.format(SiebelConstants.INVALID_PARAMETER_NOT_MAP, pParam
          .getClass().getName());
      throw new InvalidParameterException(msg);
    }

    @SuppressWarnings("rawtypes")
    Map paramMap = (HashMap) pParam;
    order = (Order) paramMap.get(PipelineConstants.ORDER);
    orderManager = (OrderManager) paramMap.get(PipelineConstants.ORDERMANAGER);
    orderRepository =
      (Repository) paramMap.get(PipelineConstants.ORDERREPOSITORY);

    // Check for null parameters

    if (order == null) {
      throw new InvalidParameterException(
        SiebelConstants.INVALID_ORDER_PARAMETER);
    }

    if (orderRepository == null) {
      throw new InvalidParameterException(
        SiebelConstants.INVALID_REPOSITORY_PARAMETER);
    }

    if (orderManager == null) {
      throw new InvalidParameterException(
        SiebelConstants.INVALID_ORDER_MANAGER_PARAMETER);
    }

    // Get the order tools component.

    orderTools = orderManager.getOrderTools();

    // Get the mutable version of the order repository

    try {
      mutableOrderRepository = (MutableRepository) orderRepository;
    } catch (ClassCastException e) {
      throw new InvalidParameterException(
        SiebelConstants.INVALID_REPOSITORY_PARAMETER, e);
    }

    // Call the saveAttributes method.

    changed =
      saveAttributes(order, order.getCommerceItems(), orderManager, orderTools,
        mutableOrderRepository);

    // Checked the changed return value and insert it into the pipeline if it is
    // true.

    if (changed) {
      paramMap.put(PipelineConstants.CHANGED, Boolean.TRUE);

      if (isLoggingDebug()) {
        logDebug("Set changed flag to true in ProcSaveAttributeObjects");
      }
    }

    return SUCCESS;
  }

  /**
   * This method iterates across each of the given commerce items and their
   * attributes and updates the repository. If the attribute item has never been
   * added to the repository, it will be in this method.
   * 
   * @param pOrder
   *          The order being saved
   * @param pSiebelCommerceItems
   *          The list of SiebelCommerceItem objects to be processed
   * @param pOrderManager
   *          The OrderManager that was in the pipeline params
   * @param pOrderTools
   *          The OrderTools that was in the pipeline params
   * @param pMutableOrderRepository
   *          The order repository to which the attribute items are saved
   **/
  @SuppressWarnings("unchecked")
  protected boolean saveAttributes(Order pOrder,
    List<SiebelCommerceItem> pSiebelCommerceItems, OrderManager pOrderManager,
    OrderTools pOrderTools, MutableRepository pMutableOrderRepository)
    throws Exception {
    MutableRepositoryItem attributeRepositoryItem = null;
    Object value = null;
    Object[] savedProperties = null;
    String mappedPropertyName = null;
    ChangedProperties changedProperties = null;
    boolean changed = false;

    // Navigate the SiebelCommerceItems.

    for (SiebelCommerceItem siebelCommerceItem : pSiebelCommerceItems) {

      // Navigate the commerce item attributes.

      for (SiebelAttribute siebelAttribute : (List<SiebelAttribute>) siebelCommerceItem
        .getSiebelAttributes()) {
        if (getSaveChangedPropertiesOnly()
          && siebelAttribute instanceof ChangedProperties
          && (!((ChangedProperties) siebelAttribute).getSaveAllProperties())) {
          savedProperties =
            ((ChangedProperties) siebelAttribute).getChangedProperties()
              .toArray();
        } else {
          savedProperties = getSavedProperties();
        }

        // Get the repository item for the attribute.

        attributeRepositoryItem = null;

        if (siebelAttribute instanceof ChangedProperties) {
          attributeRepositoryItem =
            ((ChangedProperties) siebelAttribute).getRepositoryItem();
        }

        if (attributeRepositoryItem == null) {
          attributeRepositoryItem =
            pMutableOrderRepository.getItemForUpdate(siebelAttribute.getId(),
              pOrderTools.getMappedItemDescriptorName(siebelAttribute
                .getClass().getName()));

          if (siebelAttribute instanceof ChangedProperties) {
            ((ChangedProperties) siebelAttribute)
              .setRepositoryItem(attributeRepositoryItem);
          }
        }

        // Save the attribute properties.

        // BB ---- CHANGE START
        // ADDED NULL CHECK
        if (savedProperties != null) {
          // BB ---- CHANGE END
          for (int i = 0; i < savedProperties.length; i++) {
            // Get the next property name.

            mappedPropertyName =
              getMappedPropertyName((String) savedProperties[i]);

            if (!OrderRepositoryUtils.hasProperty(pOrder, siebelAttribute,
              mappedPropertyName)) {
              continue;
            }

            // Get the property value.

            try {
              value =
                OrderRepositoryUtils.getPropertyValue(pOrder, siebelAttribute,
                  mappedPropertyName);
            } catch (PropertyNotFoundException e) {
              continue; // should never happen because we already checked for
                        // existence
            }

            if (isLoggingDebug()) {
              logDebug("save property[" + (String) savedProperties[i] + ":"
                + value + ":" + siebelAttribute.getClass().getName() + ":"
                + siebelAttribute.getId() + "]");
            }

            // Save the repository item property.

            OrderRepositoryUtils.saveRepositoryItem(pMutableOrderRepository,
              attributeRepositoryItem, (String) savedProperties[i], value,
              pOrderTools);
            changed = true;
          }
        }
        // If necessary, persist the attribute in the repository.

        if ((!pOrder.isTransient()) && attributeRepositoryItem.isTransient()) {
          if (isLoggingDebug()) {
            logDebug("Adding SiebelAttribute to Repository: "
              + attributeRepositoryItem.getItemDescriptor()
                .getItemDescriptorName());
          }

          pMutableOrderRepository.addItem(attributeRepositoryItem);
        }

        // Update the repository item in the order repository.

        try {
          pMutableOrderRepository.updateItem(attributeRepositoryItem);
        } catch (ConcurrentUpdateException e) {
          Object[] msgArgs =
            {
              pOrder.getId(),
              attributeRepositoryItem.getItemDescriptor()
                .getItemDescriptorName() };
          throw new CommerceException(MessageFormat.format(
            SiebelConstants.CONCURRENT_UPDATE_ATTEMPT, msgArgs), e);
        }

        // Set the changed properties flags.

        if (siebelAttribute instanceof ChangedProperties) {
          changedProperties = (ChangedProperties) siebelAttribute;

          if (changedProperties.isChanged()) {
            changed = true;
          }

          changedProperties.clearChangedProperties();
          changedProperties.setSaveAllProperties(false);
          changedProperties.setChanged(false);
        }
      }

      // Check if this commerce item has children.

      if (siebelCommerceItem.getCommerceItemCount() > 0) {
        // Process the children.

        saveAttributes(pOrder, siebelCommerceItem.getCommerceItems(),
          pOrderManager, pOrderTools, pMutableOrderRepository);
      }
    }

    return changed;
  }
}