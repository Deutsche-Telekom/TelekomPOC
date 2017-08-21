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
package atg.siebel.configurator.command;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.xml.ws.BindingProvider;

import atg.core.util.StringUtils;
import atg.nucleus.logging.ApplicationLogging;
import atg.nucleus.logging.ClassLoggingFactory;
import atg.repository.RepositoryItem;
import atg.service.perfmonitor.PerfStackMismatchException;
import atg.service.perfmonitor.PerformanceMonitor;
import atg.siebel.catalog.SiebelCatalogProduct;
import atg.siebel.catalog.SiebelCatalogRelationship;
import atg.siebel.configurator.AbstractRelationship.DomainProduct;
import atg.siebel.configurator.ConfigurationContext;
import atg.siebel.configurator.ConfiguratorException;
import atg.siebel.configurator.Constants.ProductType;
import atg.siebel.configurator.PromotionConfigInstance;
import atg.siebel.configurator.PromotionRootCPRelationship;
import atg.siebel.integration.WebServiceHelper;

import com.siebel.ordermanagement.catalog.data.catalogcontext.Context;
import com.siebel.ordermanagement.catalog.data.catalogcontext.ExternalContext;
import com.siebel.ordermanagement.catalog.data.catalogcontext.ListOfContext;
import com.siebel.ordermanagement.configurator.BeginConfigurationOutput;
import com.siebel.ordermanagement.promotion.GetProductPromotionDefinitionInput;
import com.siebel.ordermanagement.promotion.GetProductPromotionDefinitionOutput;
import com.siebel.ordermanagement.promotion.PromotionDefinitionPort;
import com.siebel.ordermanagement.promotion.PromotionWebService;
import com.siebel.ordermanagement.promotion.data.Promotion;
import com.siebel.ordermanagement.promotion.data.PromotionComponentsRulesSummary;
import com.siebel.ordermanagement.promotion.data.PromotionProductAggregateDefaultProducts;

/**
 * Creates and calls the Siebel GetPromotionDefinition web service
 *
 * @author bbrady
 * @version $Id: //product/Siebel/version/11.2/src/atg/siebel/configurator/command/GetProductPromotionCommand.java#2 $$Change: 1194813 $
 * @updated $DateTime: 2015/09/10 08:26:24 $$Author: saysyed $
 */
public class GetProductPromotionCommand extends AbstractCommand {
  
  //-------------------------------------
  // Constants
  //-------------------------------------
  /** Class version string */
  public static final String CLASS_VERSION = "$Id: //product/Siebel/version/11.2/src/atg/siebel/configurator/command/GetProductPromotionCommand.java#2 $$Change: 1194813 $";
  
	/** Logger */
	protected static ApplicationLogging mLogger = ClassLoggingFactory
	    .getFactory().getLoggerForClass(GetProductPromotionCommand.class);
	

	public GetProductPromotionCommand(ConfigurationContext pInstance) {
		super(pInstance);
	}

	@Override
	protected CommandResult doExecute() throws ConfiguratorException {
		if (mLogger.isLoggingDebug()) {
			mLogger.logDebug("Entered doExecute()");
		}
		PromotionWebService service = new PromotionWebService();
		PromotionDefinitionPort port = service.getPromotionDefinitionPort();

		GetProductPromotionDefinitionInput input = createInput();

		// Use the pricing WebServiceHelper - it always provides login credentials
	    WebServiceHelper wsHelper = (WebServiceHelper) getConfiguratorTools().resolveName(
	            "/atg/commerce/pricing/WebServiceHelper/");
	    wsHelper.prepareConnection((BindingProvider) port);

	    
      PerformanceMonitor.startOperation("getProductPromotionDefinition");

      GetProductPromotionDefinitionOutput output = port
          .getProductPromotionDefinition(input);
     
      try
      {
        PerformanceMonitor.endOperation("getProductPromotionDefinition");
      }
      catch (PerfStackMismatchException e) {
        mLogger.logError(e);
      }
	    


		CommandResult result = produceResult(output);
		if (mLogger.isLoggingDebug()) {
			mLogger.logDebug("Leaving doExecute() : result == " + result);
		}
		return result;
	}

	/**
	 * Processing the result of call in case of new product we are adding all
	 * products created below the root product in case of existing product in
	 * theory map of integration ids must be the same
	 * 
	 * @param pOutput
	 * @return
	 * @throws ConfiguratorException
	 */
	protected CommandResult produceResult(
	    GetProductPromotionDefinitionOutput pOutput) throws ConfiguratorException {

		if (mLogger.isLoggingDebug()) {
			mLogger.logDebug("Entered produceResult() : pOutput == " + pOutput);
		}
		CommandResult result = new CommandResult();
		result.setStatus(createCommandStatus(
		    pOutput.getErrorSpcCode(), pOutput.getErrorSpcMessage(), null));

		if (result.getStatus().isSuccessfull()) {
			((PromotionConfigInstance) getInstance())
			    .setChildRelationships(getRootProducts(pOutput));
		}

		if (mLogger.isLoggingDebug()) {
			mLogger.logDebug("Leaving produceResult() : result == " + result);
		}
		return result;
	}

	/**
	 * @param pOutput
	 * @return
	 * @throws ConfiguratorException
	 */
	protected List<PromotionRootCPRelationship> getRootProducts(
	    GetProductPromotionDefinitionOutput pOutput) throws ConfiguratorException {

		if (mLogger.isLoggingDebug()) {
			mLogger.logDebug("Entered getRootProducts() : pOutput == " + pOutput);
		}
		List<PromotionRootCPRelationship> rootProducts = new ArrayList<PromotionRootCPRelationship>();
		for (Promotion promotion : pOutput.getListOfPromotion().getPromotion()) {
			for (PromotionComponentsRulesSummary relationship : promotion
			    .getListOfPromotionComponentsRulesSummary()
			    .getPromotionComponentsRulesSummary()) {
				String id = relationship.getId();
				String max = relationship.getMaximumQuantity();
				String min = relationship.getMinimumQuantity();
				String def = relationship.getDefaultQuantity();
				PromotionRootCPRelationship pcr = new PromotionRootCPRelationship(
				    (PromotionConfigInstance) getInstance(), id, min, max, def);

				if (relationship.getType().equalsIgnoreCase(ProductType.AGGREGATE.toString())) {
					List<DomainProduct> domainProducts = new ArrayList<DomainProduct>();
					Set<String> idSet = new HashSet<String>();
					for (PromotionProductAggregateDefaultProducts domainProduct : relationship
					    .getListOfPromotionProductAggregateDefaultProducts()
					    .getPromotionProductAggregateDefaultProducts()) {
						DomainProduct product = pcr.new DomainProduct();
						product.setId(domainProduct.getProductId());
						product.setName(domainProduct.getProductName());
						String cardinality = domainProduct.getDefaultCardinality();
						if (!StringUtils.isEmpty(cardinality)) {
							try {
								product.setDefaultCardinality(Integer.parseInt(cardinality));
								product.setQuantity(Integer.parseInt(cardinality));
							} catch (NumberFormatException nfe) {

							}
						}
						domainProducts.add(product);
						idSet.add(product.getId());
					}
					List<SiebelCatalogProduct> childproducts = null;
                    try {
                      if (!StringUtils.isEmpty(relationship.getClassName())) {
                          childproducts = getConfiguratorTools().getCatalogTools()
                              .getProductsForProductClass(relationship.getClassName());
                      } else if (!StringUtils.isEmpty(relationship.getProductLineId())) {
                        childproducts = getConfiguratorTools().getCatalogTools()
                            .getProductsForProductLine (relationship.getProductLineId());
                      }
                    } catch (Exception e) {
                      if (mLogger.isLoggingWarning()) {
                        mLogger.logWarning(
                            "Exception retrieving products from Repository : " + e);
                      }
                    }
					if (childproducts != null && !childproducts.isEmpty()) {
					  
					  for (SiebelCatalogProduct child : childproducts) {
					    if (!idSet.contains(child.getId())) {
					      idSet.add(child.getId());
	                      DomainProduct product = pcr.new DomainProduct();
	                      product.setId(child.getId());
	                      product.setName(child.getName());
	                      product.setDefaultCardinality(0);
	                      product.setQuantity(0);
	                      domainProducts.add(product);
					    }
					  }
					}
					pcr.setDomainProducts(domainProducts
					    .toArray(new DomainProduct[domainProducts.size()]));
					pcr.setDisplayName(relationship.getProductLine());
					pcr.setProductLineId(relationship.getProductLineId());
				} else {
					pcr.setDefaultProductId(relationship.getProdId());
					pcr.setDefaultProductName(relationship.getProductName());
					pcr.setDisplayName(relationship.getProductName());
					pcr.setProductLineId(relationship.getProductLineId());
				}
				if (mLogger.isLoggingDebug()) {
					mLogger.logDebug("Created new PromotionRootCPRelationship : " + pcr);
				}
				rootProducts.add(pcr);
			}
		}
		if (mLogger.isLoggingDebug()) {
			mLogger.logDebug("Leaving getRootProducts() : result == " + rootProducts);
		}
		return rootProducts;
	}

	
  /**
   * @return
   */
  protected GetProductPromotionDefinitionInput createInput() {
    if (mLogger.isLoggingDebug()) {
      mLogger.logDebug("Entered createInput()");
    }
    GetProductPromotionDefinitionInput input = new GetProductPromotionDefinitionInput();

    RepositoryItem user = getUserProfile(getInstance().getOrderId());
    if (user != null) {
      ExternalContext externalContext = new ExternalContext();
      externalContext.setAccountId((String) user
          .getPropertyValue("siebelAccountId"));
      Context context = new Context();
      context.setExternalContext(externalContext);
      ListOfContext listOfContext = new ListOfContext();
      listOfContext.setContext(context);
      input.setListOfContext(listOfContext);
    } else {
      mLogger.logError("User RepositoryItem is null for order = "+
          getInstance().getOrderId());
    }
    
    input.setProdPromId(getInstance().getProductId());
    if (mLogger.isLoggingDebug()) {
      mLogger.logDebug("Leaving createInput() : input == " + input);
    }
    return input;
  }

}
