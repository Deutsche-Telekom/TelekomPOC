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

import atg.commerce.profile.CommerceProfileTools;
import atg.nucleus.GenericService;
import atg.repository.RepositoryItem;
import atg.siebel.configurator.BaseConfigInstance;
import atg.siebel.configurator.ConfiguratorException;
import atg.siebel.configurator.PromotionConfigInstance;

import com.siebel.ordermanagement.configurator.BeginConfigurationInput;
import com.siebel.ordermanagement.quote.data.ListOfQuote;
import com.siebel.ordermanagement.quote.data.ListOfQuoteItem;
import com.siebel.ordermanagement.quote.data.Quote;
import com.siebel.ordermanagement.quote.data.QuoteItem;

/**
 * @author bbrady
 *
 */
public class ConfigCommandHelper extends GenericService {
	//-------------------------------------
	/** Class version string */
	public static final String CLASS_VERSION = "$Id: //product/Siebel/version/11.2/src/atg/siebel/configurator/command/ConfigCommandHelper.java#2 $$Change: 1194813 $";

	//-------------------------------------
	// Constants
	//-------------------------------------



	//-------------------------------------
	// Member variables
	//-------------------------------------


	//-------------------------------------
	// Properties
	//-------------------------------------

	//-------------------------------------
	// property: 
	private CommerceProfileTools mProfileTools;

	public CommerceProfileTools getProfileTools() {
		return mProfileTools;
	}

	public void setProfileTools(CommerceProfileTools pProfileTools) {
		mProfileTools = pProfileTools;
	}

	//-------------------------------------
	// Constructors
	//-------------------------------------


	//-------------------------------------
	/**
	 * Constructs a null Template.
	 */
	public ConfigCommandHelper() {
	}
	
	public void enrichPayload(BeginConfigurationInput pInput, 
			BaseConfigInstance pInstance) throws ConfiguratorException {
		if (pInput == null) {
			
			return;
		}
		
		if (pInstance == null) {
			
			return;
		}
		
		if (pInstance instanceof PromotionConfigInstance) {
			ListOfQuote listOfQuote = new ListOfQuote();
			listOfQuote.getQuote().add(createQuote((PromotionConfigInstance) pInstance));
			pInput.setListOfQuote(listOfQuote);
		}
	}
	
	
    public Quote createQuote(PromotionConfigInstance pInstance)
            throws ConfiguratorException {

        Quote quote = new Quote();
        quote.setRevision("1");
        quote.setQuoteNumber(pInstance.getOrderId());
        
        RepositoryItem org = getProfileOrganisation(pInstance.getOrderId());

        quote.setAccount((String) org.getPropertyValue("name"));
        quote.setAccountId(org.getRepositoryId());
        quote.setPrimaryOrganizationId((String) org.getPropertyValue(
        		"siebelOrganizationId"));

        QuoteItem quoteItem = createQuoteItem(pInstance);
        quoteItem.setAccountId(org.getRepositoryId());
        ListOfQuoteItem listQuoteItems = new ListOfQuoteItem();
        listQuoteItems.getQuoteItem().add(quoteItem);
        
        quote.setListOfQuoteItem(listQuoteItems);
        
        return quote;
    }
    
    public QuoteItem createQuoteItem(PromotionConfigInstance pInstance)
            throws ConfiguratorException {

        QuoteItem quoteItem = new QuoteItem();

        quoteItem.setActionCode("Add");
        quoteItem.setProductId(pInstance.getProductId());
        quoteItem.setQuantity("1");
        quoteItem.setName(pInstance.getDisplayName());

        return quoteItem;
    }
    
    
    public RepositoryItem getProfileOrganisation(String pOrderId) 
    		throws ConfiguratorException {
        RepositoryItem orgRepItem = null;
        RepositoryItem profile = null;
        try {
        	profile = getProfileTools().getProfileForOrder(pOrderId);
            orgRepItem = (RepositoryItem) profile.getPropertyValue("parentOrganization");         
        } catch (Exception e) {
			// TODO: handle exception
		}
        if (orgRepItem == null) {
            throw new ConfiguratorException(
            		"Cannot find Parent Organization for profile id: "
                    + profile.getRepositoryId());
        } 
        return orgRepItem;
    }
    
}
