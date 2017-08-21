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
package atg.siebel.order.purchase;

import atg.commerce.CommerceException;
import atg.commerce.order.*;
import atg.commerce.order.purchase.ExpressCheckoutFormHandler;
import atg.core.util.ResourceUtils;
import atg.core.util.StringUtils;
import atg.droplet.DropletFormException;
import atg.repository.RepositoryException;
import atg.repository.RepositoryItem;
import atg.service.pipeline.RunProcessException;
import atg.servlet.DynamoHttpServletRequest;
import atg.servlet.DynamoHttpServletResponse;
import atg.siebel.configurator.ConfiguratorTools;
import atg.siebel.order.SiebelHardgoodShippingGroup;
import atg.siebel.order.SiebelOrderTools;
import atg.siebel.order.SiebelPropertyNameConstants;
import atg.siebel.profile.SiebelProfileTools;
import atg.userprofiling.ProfileTools;

import javax.servlet.ServletException;
import javax.transaction.Transaction;
import java.io.IOException;

/**
 * This class extends the OOTB implementation of ExpressCheckoutFormHandler to 
 * include Siebel-specific extensions
 *
 * @author Bernard Brady
 * @version $Id: //product/Siebel/version/11.2/src/atg/siebel/order/purchase/SiebelExpressCheckoutFormHandler.java#3 $$Change: 1194813 $
 * @updated $DateTime: 2015/09/10 08:26:24 $$Author: saysyed $
 */
public class SiebelExpressCheckoutFormHandler extends
		ExpressCheckoutFormHandler {

  //-------------------------------------
  /** Class version string */

  public static String CLASS_VERSION = "$Id: //product/Siebel/version/11.2/src/atg/siebel/order/purchase/SiebelExpressCheckoutFormHandler.java#3 $$Change: 1194813 $";

	
  //--------------------------------------------------
  // Constants
  //--------------------------------------------------

  public static final String MSG_UNABLE_TO_RETRIEVE_ADDRESS = "errorRetrievingAddress";
  
  // -------------------------------------
  // property: configuratorTools
  protected ConfiguratorTools mConfiguratorTools;

  public ConfiguratorTools getConfiguratorTools() {
    return mConfiguratorTools;
  }

  public void setConfiguratorTools(ConfiguratorTools pConfiguratorTools) {
    mConfiguratorTools = pConfiguratorTools;
  }

  // -------------------------------------
  // property: SiebelOrderTools
  protected SiebelOrderTools mSiebelOrderTools;

  public SiebelOrderTools getSiebelOrderTools() {
    return mSiebelOrderTools;
  }

  public void setSiebelOrderTools(SiebelOrderTools pSiebelOrderTools) {
    this.mSiebelOrderTools = pSiebelOrderTools;
  }
  
  //--------------------------------------
  // property: shouldRepriceOnSubmit
  protected boolean mShouldRepriceOnSubmit = false;
  
  public boolean getShouldRepriceOnSubmit()
  {
    return mShouldRepriceOnSubmit;
  }
  
  public void setShouldRepriceOnSubmit(boolean pShouldRepriceOnSubmit)
  {
    mShouldRepriceOnSubmit = pShouldRepriceOnSubmit;
  }

  
  //--------------------------------------------------
  // Member Variables
  //--------------------------------------------------

  //--------------------------------------------------
  // Properties
  //--------------------------------------------------
  
  //--------------------------------------------------
  // property: shippingAddressId
  //--------------------------------------------------
	protected String mShippingAddressId;

	public String getShippingAddressId() {
		return mShippingAddressId;
	}

	public void setShippingAddressId(String pShippingAddressId) {
		this.mShippingAddressId = pShippingAddressId;
	}
	
  //--------------------------------------------------
  // property: shippingMethod
  //--------------------------------------------------
	protected String mShippingMethod = null;

	public String getShippingMethod() {
		if (mShippingMethod == null) {
			if (getOrder().getShippingGroupCount() > 0) {
				ShippingGroup firstShippingGroup = ((ShippingGroup) getOrder()
				    .getShippingGroups().get(0));
				String method = firstShippingGroup.getShippingMethod();
				// Don't really get this but when a ShippingGroup is created
				// (see line 1401 in OrderTools.createShippingGroup()) its shippingMethod 
				// property is initialised to the value of its class name
				if (!StringUtils.isEmpty(method)
				    && !method.equalsIgnoreCase(firstShippingGroup
				        .getShippingGroupClassType())) {
					mShippingMethod = method;
				}
			}
		}
		return mShippingMethod;
	}

	public void setShippingMethod(String pShippingMethod) {
		this.mShippingMethod = pShippingMethod;
	}
	
  //--------------------------------------------------
  // property: creditCardId
  //--------------------------------------------------
	protected String mCreditCardId;

	public String getCreditCardId() {
		return mCreditCardId;
	}

	public void setCreditCardId(String pCreditCardId) {
		this.mCreditCardId = pCreditCardId;
	}

  //--------------------------------------------------
  // property: shippingAddressItemdescriptorName
  //--------------------------------------------------
	protected String mShippingAddressItemdescriptorName = "contactInfo";

	public String getShippingAddressItemdescriptorName() {
		return mShippingAddressItemdescriptorName;
	}

	public void setShippingAddressItemdescriptorName(
			String pShippingAddressItemdescriptorName) {
		mShippingAddressItemdescriptorName = pShippingAddressItemdescriptorName;
	}
	
  //--------------------------------------------------
  // property: creditCardItemdescriptorName
  //--------------------------------------------------
	protected String mCreditCardItemdescriptorName = "credit-card";

	public String getCreditCardItemdescriptorName() {
		return mCreditCardItemdescriptorName;
	}

	public void setCreditCardItemdescriptorName(
			String pCreditCardItemdescriptorName) {
		mCreditCardItemdescriptorName = pCreditCardItemdescriptorName;
	}
	
  //--------------------------------------------------
  // property: manageAddressesSuccessUrl
  //--------------------------------------------------
	protected String mManageAddressesSuccessUrl = "/siebel/admin/addresses.jsp?redirectUrl=/siebel/checkout/checkout.jsp";

	public String getManageAddressesSuccessUrl() {
		return mManageAddressesSuccessUrl;
	}

	public void setManageAddressesSuccessUrl(String pManageAddressesSuccessUrl) {
		mManageAddressesSuccessUrl = pManageAddressesSuccessUrl;
	}
	
  //--------------------------------------------------
  // property: manageBillingProfilesSuccessUrl
  //--------------------------------------------------
	protected String mManageBillingProfilesSuccessUrl = "/siebel/admin/manage_billing_profiles.jsp?redirectUrl=/siebel/checkout/checkout.jsp";

	public String getManageBillingProfilesSuccessUrl() {
		return mManageBillingProfilesSuccessUrl;
	}

	public void setManageBillingProfilesSuccessUrl(String pManageBillingProfilesSuccessUrl) {
		mManageBillingProfilesSuccessUrl = pManageBillingProfilesSuccessUrl;
	}

	
  //--------------------------------------------------
  // Constructors
  //--------------------------------------------------

  //--------------------------------------------------
  // Methods 
  //--------------------------------------------------


  /**
   * <code>preExpressCheckout</code> is for work that must happen before expressCheckout.
   *
   * @param pRequest the servlet's request
   * @param pResponse the servlet's response
   * @exception ServletException if there was an error while executing the code
   * @exception IOException if there was an error with servlet io
   */
	public void preExpressCheckout(DynamoHttpServletRequest pRequest,
	    DynamoHttpServletResponse pResponse) throws ServletException, IOException {

	
		if (!getOrderProfileIsLoggedInUser()){
			redirectOrForward(pRequest, pResponse,
			    ((SiebelPurchaseProcessHelper) getPurchaseProcessHelper())
			        .getProceedToCheckoutSuccessUrl());
			return;
		}
		
		// Get the firstName, lastName properties from profile. 
		// Our OOTB address validator (in the order submission pipeline)
		// requires the corresponding address properties to be set however 
		// we (currently) dont sync these address property values from Siebel.
		//
		// We may therefore use these variables to populate the ship-to/bill-to 
		// address properties.
		ProfileTools profileTools = getOrderManager().getOrderTools().getProfileTools();
		String firstName = (String) getProfile().getPropertyValue(
				profileTools.getPropertyManager().getFirstNamePropertyName());
		String lastName = (String) getProfile().getPropertyValue(
				profileTools.getPropertyManager().getLastNamePropertyName());
		
		if (StringUtils.isEmpty(getShippingAddressId())) {
			// Need to update the order with default Shipping
			// Address from user Profile during handleExpressCheckout()
			setShippingGroupNeeded(true);
		} else {
			// We'll update the order now with the user-specified
			// Shipping Address
			ShippingGroup shippingGroup = getShippingGroup();
			if ((shippingGroup == null)
			    || (!(shippingGroup instanceof HardgoodShippingGroup))) {
				String msg = formatUserMessage(MSG_EXPRESS_CHECKOUT_ERROR, pRequest,
				    pResponse);
				String propertyPath = generatePropertyPath("shippingGroup");
				addFormException(new DropletFormException(msg, propertyPath,
				    MSG_EXPRESS_CHECKOUT_ERROR));
			}

			SiebelHardgoodShippingGroup hsg = (SiebelHardgoodShippingGroup) shippingGroup;

			// Set the shipping method using form property
			hsg.setShippingMethod(getShippingMethod());

			// shipping address to be used in the order
			RepositoryItem shippingAddress = null;

			try {
				shippingAddress = (RepositoryItem) getProfile().getRepository()
				    .getItem(getShippingAddressId(),
				        getShippingAddressItemdescriptorName());
			} catch (RepositoryException e) {
				processException(e, MSG_UNABLE_TO_RETRIEVE_ADDRESS, pRequest, pResponse);
			}

			if (shippingAddress == null) {
				if (isLoggingError())
					logError(ResourceUtils.getMsgResource(ERROR_MISSING_SHIPPING_ADDRESS,
					    getResourceBundleName(), getResourceBundle()));
			} else {
				try {					
					OrderTools.copyAddress(shippingAddress, hsg.getShippingAddress());
					// Be a bit messy to add copying the siebelId property
					// into the copyAddress() method so just copying it 
					// here
					if (!StringUtils.isEmpty((String) shippingAddress.getPropertyValue(
							SiebelPropertyNameConstants.SIEBEL_ID))) {
						hsg.setSiebelId((String) shippingAddress.getPropertyValue(
								SiebelPropertyNameConstants.SIEBEL_ID));
					}
					if (StringUtils.isEmpty(hsg.getShippingAddress().getFirstName())) {
						hsg.getShippingAddress().setFirstName(firstName);
					}
					if (StringUtils.isEmpty(hsg.getShippingAddress().getLastName())) {
						hsg.getShippingAddress().setLastName(lastName);
					}
				} catch (CommerceException ce) {
					processException(ce, MSG_UNABLE_TO_COPY_ADDRESS, pRequest, pResponse);
				}
			}
			setShippingGroupNeeded(false);
		}

		if (StringUtils.isEmpty(getCreditCardId())) {
			// Need to update the order with default Shipping
			// Address from user Profile during handleExpressCheckout()
			setPaymentGroupNeeded(true);
		} else {
			PaymentGroup paymentGroup = getPaymentGroup();
			if ((paymentGroup == null) || (!(paymentGroup instanceof CreditCard))) {
				String msg = formatUserMessage(MSG_EXPRESS_CHECKOUT_ERROR, pRequest,
				    pResponse);
				String propertyPath = generatePropertyPath("paymentGroup");
				addFormException(new DropletFormException(msg, propertyPath,
				    MSG_EXPRESS_CHECKOUT_ERROR));
			}

			// Copy the default credit card into the order
			RepositoryItem creditCard = null;
			try {
				creditCard = (RepositoryItem) getProfile().getRepository().getItem(
				    getCreditCardId(), getCreditCardItemdescriptorName());
			} catch (RepositoryException e) {
				processException(e, MSG_UNABLE_TO_RETRIEVE_ADDRESS, pRequest, pResponse);
			}

			if (creditCard == null) {
				if (isLoggingError())
					logError(ResourceUtils.getMsgResource(ERROR_MISSING_CREDIT_CARD,
					    getResourceBundleName(), getResourceBundle()));
			} else {
				getCommerceProfileTools().copyCreditCard(creditCard,
				    (CreditCard) paymentGroup);

				// Copy billing address to PaymentGroup
				RepositoryItem billingAddress = (RepositoryItem) getProfile()
				    .getPropertyValue(getDefaultBillingAddressPropertyName());

				if (billingAddress == null) {
					if (isLoggingError())
						logError(ResourceUtils.getMsgResource(
						    ERROR_MISSING_BILLING_ADDRESS, getResourceBundleName(),
						    getResourceBundle()));
				} else {
					try {
						OrderTools.copyAddress(billingAddress,
						    ((CreditCard) paymentGroup).getBillingAddress());
						if (StringUtils.isEmpty(((CreditCard) paymentGroup).getBillingAddress().getFirstName())) {
							((CreditCard) paymentGroup).getBillingAddress().setFirstName(firstName);
						}
						if (StringUtils.isEmpty(((CreditCard) paymentGroup).getBillingAddress().getLastName())) {
							((CreditCard) paymentGroup).getBillingAddress().setLastName(lastName);
						}
					} catch (CommerceException ce) {
						processException(ce, MSG_UNABLE_TO_COPY_ADDRESS, pRequest,
						    pResponse);
					}
				}
			}
		}
	}
		
  @Override
  public boolean handleExpressCheckout(DynamoHttpServletRequest pRequest,
      DynamoHttpServletResponse pResponse) throws IOException, ServletException {
  	
		if (!getOrderProfileIsLoggedInUser()){
			// return to the checkout jsp - on loading this jsp 
			// checks for user not logged in and if true will 
			// redirect to login screen
			return true;
		}

	  return super.handleExpressCheckout(pRequest, pResponse);
  }
  
  /**
   * This reprices the Order.
   *
   * @param pRequest a <code>DynamoHttpServletRequest</code> value
   * @param pResponse a <code>DynamoHttpServletResponse</code> value
   * @exception RunProcessException if an error occurs
   * @exception ServletException if an error occurs
   * @exception IOException if an error occurs
   */
  protected void runRepricingProcess (DynamoHttpServletRequest pRequest,
                                      DynamoHttpServletResponse pResponse)
    throws RunProcessException, ServletException, IOException
  {
    if(getShouldRepriceOnSubmit())
    {
      super.runRepricingProcess(pRequest, pResponse);
    }
  }
  
  
  /* (non-Javadoc)
   * @see atg.commerce.order.purchase.ExpressCheckoutFormHandler#getExpressCheckoutSuccessURL()
   */
  public String getExpressCheckoutSuccessURL() {
    return super.getExpressCheckoutSuccessURL()+"?orderId="+getOrder().getId();
  }
  

  /**
   * @param pRequest
   * @param pResponse
   * @return
   * @throws IOException
   * @throws ServletException
   */
  public boolean handleManageAddresses(DynamoHttpServletRequest pRequest,
      DynamoHttpServletResponse pResponse) throws IOException, ServletException {
  	
  	String url = getManageAddressesSuccessUrl();
		if (!getOrderProfileIsLoggedInUser()){
			url = ((SiebelPurchaseProcessHelper) getPurchaseProcessHelper())
	        .getLoginOrRegisterUrl()+"?successUrl="+url;
		}
		redirectOrForward(pRequest, pResponse, url);
		return false;
  }
  
  
  /**
   * @param pRequest
   * @param pResponse
   * @return
   * @throws IOException
   * @throws ServletException
   */
  public boolean handleManageBillingProfiles(DynamoHttpServletRequest pRequest,
      DynamoHttpServletResponse pResponse) throws IOException, ServletException {
  	
  	String url = getManageBillingProfilesSuccessUrl();
		if (!getOrderProfileIsLoggedInUser()){
			url = ((SiebelPurchaseProcessHelper) getPurchaseProcessHelper())
	        .getLoginOrRegisterUrl()+"?successUrl="+url;
		}
		redirectOrForward(pRequest, pResponse, url);
		return false;
  }
  
  
  /**
   * @param pRequest
   * @param pResponse
   * @return
   * @throws IOException
   * @throws ServletException
   */
  public boolean handleSetShippingMethod(DynamoHttpServletRequest pRequest,
	    DynamoHttpServletResponse pResponse) throws IOException, ServletException {

		if (!getOrderProfileIsLoggedInUser()) {
			return true;
		}
		String shippingMethod = getShippingMethod();
		// We'll update the order now with the user-specified
		// Shipping Method
		ShippingGroup shippingGroup = getShippingGroup();
		if ((shippingGroup == null)
		    || (!(shippingGroup instanceof HardgoodShippingGroup))) {
			String msg = formatUserMessage(MSG_EXPRESS_CHECKOUT_ERROR, pRequest,
			    pResponse);
			String propertyPath = generatePropertyPath("shippingGroup");
			addFormException(new DropletFormException(msg, propertyPath,
			    MSG_EXPRESS_CHECKOUT_ERROR));
		}
		shippingGroup.setShippingMethod(shippingMethod);
		Transaction tr = null;
		try {
			tr = ensureTransaction();
			try {
				super.runRepricingProcess(pRequest, pResponse);
			} catch (RunProcessException exc) {
				processException(exc, MSG_REPRICE_ORDER_ERROR, pRequest, pResponse);
			}

			try {
				getOrderManager().updateOrder(getOrder());
			} catch (CommerceException exc) {
				processException(exc, MSG_UPDATE_ORDER_ERROR, pRequest, pResponse);
			}
		} finally {
			if (tr != null) {
				commitTransaction(tr);
			}
		}

		return true;
	}
  

	/**
   * @return
   */
  public boolean getOrderProfileIsLoggedInUser() {
  	SiebelProfileTools profileTools = (SiebelProfileTools) getOrderManager()
        .getOrderTools().getProfileTools();
  	return profileTools.getOrderProfileIsLoggedInUser(getOrder());
  }
  
}
