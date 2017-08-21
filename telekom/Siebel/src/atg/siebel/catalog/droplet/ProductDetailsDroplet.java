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

package atg.siebel.catalog.droplet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import atg.servlet.DynamoServlet;
import atg.servlet.DynamoHttpServletRequest;
import atg.servlet.DynamoHttpServletResponse;
import javax.servlet.ServletException;

import atg.siebel.catalog.SiebelCatalogRelationship;
import atg.siebel.catalog.SiebelCatalogTools;
import atg.siebel.catalog.SiebelCatalogProduct;

public class ProductDetailsDroplet extends DynamoServlet {

  //-------------------------------------
  /** Class version string */

  public static String CLASS_VERSION = "$Id: //product/Siebel/version/11.2/src/atg/siebel/catalog/droplet/ProductDetailsDroplet.java#2 $$Change: 1194813 $";

	// INPUT PARAMS
	public static final String INPUT_PRODUCT_PARAM = "productId";
	
	// OUTPUT PARAMS
	public static final String OUTPUT_MESSAGE = "message";
	public static final String OUTPUT_SUCCESS = "success";
	public static final String OUTPUT_PRODUCT_DETAIL = "productDetail";
	public static final String OUTPUT_DEFAULT_PRODUCTS = "defaultProducts";
	public static final String OUTPUT_PROD_RELS = "productRelationships";
	// OPARAMS
	public static final String OPARAM_OUTPUT = "output";
	public static final String OPARAM_EMPTY = "empty";
	
	// Constants for promotion rule types
	public static final String AGGREGATE_TYPE = "Aggregate";
	public static final String COMPONENT_TYPE = "Components";
	
	// -------------------------------------
	// Properties
	// -------------------------------------
	
	
	// -------------------------------------
	// property: siebelCatalogTools
	private SiebelCatalogTools sblCatalogTools;
	public SiebelCatalogTools getSiebelCatalogTools() {
		return sblCatalogTools;
	}
	public void setSiebelCatalogTools(SiebelCatalogTools _sblCatalogTools) {
		sblCatalogTools = _sblCatalogTools;
	}	
	
	/** {@inheritDoc} */
	@Override
	public void service(DynamoHttpServletRequest req,
			DynamoHttpServletResponse res) throws ServletException, IOException {

		String commerceItemId = req.getParameter(INPUT_PRODUCT_PARAM);
		
		if(isLoggingDebug())
            logDebug("Item id is: " + commerceItemId);
		
		if(commerceItemId==null)
		{
			throw new ServletException("No productId specified!!");
		}
		
		SiebelCatalogProduct product = null;
		List<String> defaultProducts = new ArrayList<String>();
		List<String> relationships = new ArrayList<String>(); 
		
		try
		{
			product = sblCatalogTools.getProductDetails(commerceItemId);
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		
		if(product==null)
		{
			if(isLoggingDebug())
	            logDebug("Product retrieved is null!!");
		} else {
			if (product.getChildRelationships() != null && product.getChildRelationships().size() > 0) {
				Iterator<SiebelCatalogRelationship> itr = product.getChildRelationships().iterator();
				
				while (itr.hasNext()) {
					SiebelCatalogRelationship relationship = (SiebelCatalogRelationship)itr.next();
					
					if (relationship != null && relationship.getDisplayName() != null && relationship.getDisplayName().trim().length() > 0) {
						relationships.add(relationship.getDisplayName());
					}
						/* Commenting this out as it's no longer needed as per SIEBELINT-789
						if (null != relationship.getDefaultProductId()) {
							String defaultProductId = relationship.getDefaultProductId().trim();
							if (relationship.getChildProducts() != null && relationship.getChildProducts().size() > 0) {
								Iterator<SiebelCatalogProduct> childProductsItr = relationship.getChildProducts().iterator();
								boolean defaultProdFound = false;
								
								do {
									SiebelCatalogProduct prod = childProductsItr.next();
									if (prod.getId().trim().equalsIgnoreCase(defaultProductId)) {
										defaultProducts.add(prod.getName());
										defaultProdFound = true;
										logDebug("Default Product Found: " + prod.getName());
									}
								} while(!defaultProdFound);
							}
						} else if (relationship.getRelationshipType() != null && relationship.getRelationshipType().trim().length() > 0) {
							if (relationship.getRelationshipType().equalsIgnoreCase("Components")) {
								if (relationship.getChildProducts() != null && relationship.getChildProducts().size() > 0) {
									Iterator<SiebelCatalogProduct> childProductsItr = relationship.getChildProducts().iterator();
									SiebelCatalogProduct prod = childProductsItr.next();
									defaultProducts.add(prod.getName());
								}
							} else if (relationship.getRelationshipType().equalsIgnoreCase("Aggregate")) {
								if (relationship.getAggDefaultProducts() != null && relationship.getAggDefaultProducts().size() > 0) {
									Iterator<String> aggDefaultProdItr = relationship.getAggDefaultProducts().iterator();
									Iterator<SiebelCatalogProduct> childProductsItr = relationship.getChildProducts().iterator();
									
									while (aggDefaultProdItr.hasNext()) {
										String prodId = aggDefaultProdItr.next();
										
										boolean defaultProdFound = false;
										
										do {
											SiebelCatalogProduct prod = childProductsItr.next();
											if (prod.getId().trim().equalsIgnoreCase(prodId)) {
												defaultProducts.add(prod.getName());
												defaultProdFound = true;
												logDebug("Default Product Found: " + prod.getName());
											}
										} while(!defaultProdFound);
									}
								}
							}
						} */
					}
			}
		}

		req.setParameter(OUTPUT_PRODUCT_DETAIL,	product);
		/*Commenting this out as it is no longer as per SIEBELINT - 789
		req.setParameter(OUTPUT_DEFAULT_PRODUCTS, defaultProducts); */
		req.setParameter(OUTPUT_PROD_RELS, relationships);
		
		if (null == product) {
			req.serviceParameter(OPARAM_EMPTY, req, res);
		} else {
			req.serviceParameter(OPARAM_OUTPUT, req, res);
		}
		
	}
}
