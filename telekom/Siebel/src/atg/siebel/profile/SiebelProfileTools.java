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
package atg.siebel.profile;

import atg.commerce.order.Order;
import atg.commerce.order.OrderHolder;
import atg.commerce.profile.CommerceProfileTools;
import atg.repository.RepositoryException;
import atg.repository.RepositoryItem;

public class SiebelProfileTools extends CommerceProfileTools{

  //-------------------------------------
  /** Class version string */

  public static String CLASS_VERSION = "$Id: //product/Siebel/version/11.2/src/atg/siebel/profile/SiebelProfileTools.java#2 $$Change: 1194813 $";

  

  /**
   * Check the security status of the profile to see if the user is Authorized.
   * @param pProfile - A <code>RepositoryItem</code> value.
   * @return true if the profile is logged in, a <code>boolean</code> value.
   */
  public boolean isAuthorizedUser(RepositoryItem pProfile) {
    if (getSecurityStatus(pProfile) <= getPropertyManager().getSecurityStatusCookie()) {
      return false;
    }
    
    return true;
  }
  
  /**
   * Check the security status of the profile to see if the user is Logged in.
   * @param pProfile - A <code>RepositoryItem</code> value.
   * @return true if the profile is logged in, a <code>boolean</code> value.
   */
  public boolean isLoginUser(RepositoryItem pProfile) {
    if (getSecurityStatus(pProfile) < getPropertyManager().getSecurityStatusLogin()) {
      return false;
    }
    
    return true;
  }
  
  /**
   * @return
   */
  public boolean getOrderProfileIsLoggedInUser(Order pOrder) {
  	RepositoryItem profile;
    try {
	    profile = getProfileForOrder(pOrder);
	    return isLoginUser(profile);
    } catch (RepositoryException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
    }
  	return false;
  }
  
  /**
   * Get the current security status from the provided profile.
   * @param pProfile - A <code>RepositoryItem</code> value.
   * @return Profile's security status as a <code>int</code> value.
   */
  public int getSecurityStatus(RepositoryItem pProfile) {
    // Proceed to login or checkout depending on securityStatus.
    int status = -1;
    String securityStatusProperty = getPropertyManager().getSecurityStatusPropertyName();
    Object securityStatus = pProfile.getPropertyValue(securityStatusProperty);

    if (securityStatus != null) {
      status = ((Integer) securityStatus).intValue();
    }
    return status;
  }
  
	/**
	 * This method has been overridden to handle the scenario where in a B2B user
	 * adds an item anonymously.When a B2B user adds an item to the cart
	 * anonymously (i.e without logging in) then the parent organization Id of the
	 * user is assigned as organization Id of the cart.
	 * 
	 * @param pProfile  the profile of the user that just logged in
	 * @param pShoppingCart the shopping cart for the user that just logged in
	 */
	@Override
	public void assignOrganizationContextOnLogin(RepositoryItem pProfile,
	    OrderHolder pShoppingCart) {
		// fetch the active order, but don't create a new one if one
		// doesn't exist, as we won't use it right away (see code
		// a few lines as to the reason why)
		Order order = pShoppingCart.getCurrent(false);
		RepositoryItem profile = pProfile;
		String organizationId = null;
		RepositoryItem defaultOrganization = (RepositoryItem) profile
		    .getPropertyValue(getPropertyManager().getOrganizationPropertyName());
		if (order != null && order.getCommerceItemCount() > 0) {
			organizationId = order.getOrganizationId();
			// if order is created anonymously and the user is a B2B user, set
			// the user's organization to Order
			if (organizationId == null) {
				if (defaultOrganization != null) {
					organizationId = defaultOrganization.getRepositoryId();
					order.setOrganizationId(organizationId);
				}
			}
		} else {
			organizationId = (null != defaultOrganization) ? defaultOrganization
			    .getRepositoryId() : null;
		}
		setSessionOrganization(profile, organizationId);
	}
}
