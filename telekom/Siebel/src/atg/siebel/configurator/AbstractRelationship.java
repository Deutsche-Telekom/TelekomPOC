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

package atg.siebel.configurator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import atg.nucleus.logging.ApplicationLogging;
import atg.nucleus.logging.ClassLoggingFactory;

/**
 * Abstract class that represents properties and behaviour common to all relationship types.
 *
 * @author Bernard Brady
 * @version $Id: //product/Siebel/version/11.2/src/atg/siebel/configurator/AbstractRelationship.java#2 $$Change: 1194813 $
 * @updated $DateTime: 2015/09/10 08:26:24 $$Author: saysyed $
 */
public abstract class AbstractRelationship {

	// -------------------------------------
	/** Class version string */
	public static final String CLASS_VERSION = "$Id: //product/Siebel/version/11.2/src/atg/siebel/configurator/AbstractRelationship.java#2 $$Change: 1194813 $";
	
	/** Logger */
	protected static ApplicationLogging mLogger = 
	    ClassLoggingFactory.getFactory().getLoggerForClass(AbstractRelationship.class);

	// -------------------------------------
	// Constants
	// -------------------------------------

	// -------------------------------------
	// Member variables
	// -------------------------------------
	private Integer mMinimumQuantity = 0;
	private Integer mMaximumQuantity = 0;
	private Integer mDefaultQuantity = 0;
	private String mRelationshipId;
	private Integer mQuantity = 0;
	private final BaseConfigInstance mParentInstance;
	


	// -------------------------------------
	// Properties
	// -------------------------------------

	// -------------------------------------
	// property: message
	private String mMessage;
	public String getMessage() {
		return mMessage;
	}
	public void setMessage(String pMessage) {
		mMessage = pMessage;
	}

	
	// -------------------------------------
	// property: childInstances
	protected List<ProductConfigInstance> mChildInstances;

	public ProductConfigInstance[] getChildInstances() {
		return mChildInstances.toArray(new ProductConfigInstance[mChildInstances.size()]);
	}
	public void setChildInstances(
			ProductConfigInstance[] pChildInstances) {
		if (pChildInstances != null) {
			mChildInstances = new ArrayList<ProductConfigInstance>(Arrays.asList(pChildInstances));
		} else {
			mChildInstances = new ArrayList<ProductConfigInstance>();
		}
	}
	
	// -------------------------------------
	// property: displayName
	protected String mDisplayName;
	public String getDisplayName() {
		return mDisplayName;
	}
	public void setDisplayName(String pDisplayName) {
		this.mDisplayName = pDisplayName;
	}
	
	
	// -------------------------------------
	// property: domainProducts
	protected DomainProduct[] mDomainProducts;
	public DomainProduct[] getDomainProducts() {
		return mDomainProducts;
	}
	public void setDomainProducts(DomainProduct[] pDomainProducts) {
		mDomainProducts = pDomainProducts;
	}
	
	
	// -------------------------------------
	// property: defaultProductId
	protected String mDefaultProductId;
	public String getDefaultProductId() {
		return mDefaultProductId;
	}
	public void setDefaultProductId(String pDefaultProductId) {
		this.mDefaultProductId = pDefaultProductId;
	}
	
	
	// -------------------------------------
	// property: productLineId
	protected String mProductLineId;
	public String getProductLineId() {
		return mProductLineId;
	}
	public void setProductLineId(String pProductLineId) {
		this.mProductLineId = pProductLineId;
	}
	
	
	// -------------------------------------
	// property: defaultProductId
	protected String mDefaultProductName;
	public String getDefaultProductName() {
		return mDefaultProductName;
	}
	public void setDefaultProductName(String pDefaultProductName) {
		this.mDefaultProductName = pDefaultProductName;
	}


	/**
	 * @param pInstance
	 * @param pId
	 * @param pMinQuantity
	 * @param pMaxQuantity
	 * @param pDefaultQuantity
	 */
	public AbstractRelationship(
			BaseConfigInstance pInstance,
			String pId,
			String pMinQuantity, 
			String pMaxQuantity,
			String pDefaultQuantity) {

		mParentInstance = pInstance;
		setCardinality(pMinQuantity, pMaxQuantity, pDefaultQuantity);
		mQuantity = mDefaultQuantity;
		mRelationshipId = pId;
		mChildInstances = new ArrayList<ProductConfigInstance>(mMaximumQuantity);		
		mMessage = "";
	}
	
	
	/**
	 * @param pInstance
	 * @param pId
	 * @param pMinQuantity
	 * @param pMaxQuantity
	 * @param pDefaultQuantity
	 */
	public AbstractRelationship(
			BaseConfigInstance pInstance,
			String pId,
			Integer pMinQuantity, 
			Integer pMaxQuantity,
			Integer pDefaultQuantity) {

		mParentInstance = pInstance;
		mMinimumQuantity = pMinQuantity;
		mMaximumQuantity = pMaxQuantity;
		mDefaultQuantity = pDefaultQuantity;
		mQuantity = mDefaultQuantity;
		mRelationshipId = pId;
		mChildInstances = new ArrayList<ProductConfigInstance>(mMaximumQuantity);
		mMessage = "";
	}


	/**
	 * @return the mDefault
	 */
	public Integer getDefaultQuantity() {
		return mDefaultQuantity;
	}
	
	
	/**
	 * @return the mRelationshipId
	 */
	public String getId() {
		return mRelationshipId;
	}
	

	/**
	 * @return the mQuantity
	 */
	public Integer getQuantity() {	
		if (getDomainProductCount() > 0) {
			mQuantity = 0;
			for (int i=0; i<getDomainProducts().length; i++) {
				mQuantity += getDomainProducts()[i].getRelationshipQuantity();
			}
		}
		else
		{
			//if we have an instance, but the quantity is set to zero, 
			//then we're deleting an instance. Return zero
			if(!mChildInstances.isEmpty())
			{
				if(mQuantity==0)
					return new Integer(0);
				else if(mQuantity==mChildInstances.size())
				  mQuantity=new Integer(mChildInstances.size());
					
			}
		}
		return mQuantity;
	}
	
	
	/**
	 * @param pQuantity
	 */
	public void setQuantity(Integer pQuantity) {
		mQuantity = pQuantity;
	}

	
	/**
	 * @return the mMinimum
	 */
	public Integer getMinimumQuantity() {
		return mMinimumQuantity;
	}

	
	/**
	 * @return the mMaximum
	 */
	public Integer getMaximumQuantity() {
		return mMaximumQuantity;
	}
	
	
	/**
	 * @return the displayname of this product relationship
	 */
	public String getProductName() {
		return mDisplayName;
	}


	/**
	 * Convenience method to assign cardinalities
	 * 
	 * @param pMinQuantity - min cardinality
	 * @param pMaxQuantity - max cardinality
	 * @param pDefaultQuantity - default cardinality
	 */
	protected void setCardinality(String pMinQuantity, String pMaxQuantity,
			String pDefaultQuantity) {

		// Sometimes only max and min are set 
		try {
			mMinimumQuantity = Integer.valueOf(pMinQuantity);
		} catch (NumberFormatException nfe) {
		}
		
		try {
			mDefaultQuantity = Integer.valueOf(pDefaultQuantity);
		} catch (NumberFormatException nfe) {
			mDefaultQuantity = mMinimumQuantity;
		}
		
		try {
			mMaximumQuantity = Integer.valueOf(pMaxQuantity);
		} catch (NumberFormatException nfe) {
			mMaximumQuantity = mDefaultQuantity;
		}
	}
	
	
	/**
	 * Validates that the quantity property value lies within
	 * the permitted cardinalities
	 * 
	 * @return true if the quantity property value is ok otherwise false.
	 */
	public boolean validateQuantity() {
		if (getQuantity() > mMaximumQuantity || getQuantity() < mMinimumQuantity) {
			mMessage = "Invalid quantity ["+getQuantity()+
					"], must be greater than "+mMinimumQuantity+
					" and less than "+mMaximumQuantity;
			return false;
		}
		return true;
	}
	

	/**
	 * @return - the parent instance
	 */
	public BaseConfigInstance getParentInstance() {
		return mParentInstance;
	}
	
	
	/**
	 * Derives the next instance number to be used in defining
	 * the next PCI's key value.
	 * 
	 * @param productId - product id of next child
	 * @return
	 */
	protected int getNextInstanceNumber(String productId) {
		int nextId = 0;
		for (ProductConfigInstance instance : getChildInstances()) {
			if (instance.getProductId().equals(productId)) {
				nextId = instance.getKey().getInstanceNumber()+1;
			}
			
		}
		return nextId++;
	}


	/**
	 * @return the number of domain products in this relationship
	 */
	public int getDomainProductCount() {
		return (mDomainProducts == null) ? 0 : mDomainProducts.length;
	}
	
	
	/**
	 * @return the number of child product instances in this relationship
	 */
	public int getChildInstanceCount() {
		return (mChildInstances == null) ? 0 : mChildInstances.size();
	}
	
	
	/**
	 * @param pProductConfigInstance
	 * @throws ConfiguratorException 
	 */
	public void removeChildInstance(BaseConfigInstance pProductConfigInstance) {	  
	  // Default behaviour does nothing
	}
	
	
	/**
	 * Simple bean class that represents a domain child product definition
	 * 
	 * @author bbrady
	 *
	 */
	public class DomainProduct {
		private String mId = null;
		private String mName = null;
		private Integer mDefaultCardinality = 0;
		private Integer mQuantity = 0;
    // property to identify excluded products
    private boolean isExcluded = false;

    public boolean isExcluded() {
      return isExcluded;
    }

    public void setExcluded(boolean isExcluded) {
      this.isExcluded = isExcluded;
    }
    /**
		 * initially return the previously set quantity, but if we have child 
		 * product instances, count them and return them
		 * 
		 * @return
		 */
		public Integer getQuantity() {
			
			int childProductCount = 0;
			
			if(AbstractRelationship.this.getChildInstances() != null)
			{
				for(ProductConfigInstance instance : AbstractRelationship.this.getChildInstances())
				{
					if(instance.getProductId().equals(this.getId()))
					{
						childProductCount++;
					}
				}
			}
			
			//return which ever is greater
			return mQuantity>childProductCount?mQuantity:childProductCount;
		}
		public Integer getRelationshipQuantity(){
			return mQuantity;
		}
		public void setQuantity(Integer pQuantity) {
			this.mQuantity = pQuantity;
		}
		
		public String getId() {
			return mId;
		}
		public void setId(String pId) {
			this.mId = pId;
		}
		
		public String getName() {
			return mName;
		}
		public void setName(String pName) {
			this.mName = pName;
		}
		
		public Integer getDefaultCardinality() {
			return mDefaultCardinality;
		}
		public void setDefaultCardinality(Integer pDefaultCardinality) {
			this.mDefaultCardinality = pDefaultCardinality;
		}
		
	}

	
	
	@Override
	public String toString() {
		return "Relationship {\n\tmMinimumQuantity=" + mMinimumQuantity
				+ "\n\tmMaximumQuantity=" + mMaximumQuantity
				+ "\n\tmDefaultQuantity=" + mDefaultQuantity + "\n\tmId=" + mRelationshipId
				+ "\n\tmQuantity=" + mQuantity + "\n\tmMessage=" + mMessage
				+ "\n\tmChildInstances=" + mChildInstances
				+ "\n\tmDisplayName=" + mDisplayName + "\n\tmDomainProducts="
				+ mDomainProducts + "\n\tmDefaultProductId="
				+ mDefaultProductId + "\n\tmDefaultProductName="
				+ mDefaultProductName + "]\n}";
	}
}
