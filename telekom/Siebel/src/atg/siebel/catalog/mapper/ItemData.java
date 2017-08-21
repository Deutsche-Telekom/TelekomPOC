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

package atg.siebel.catalog.mapper;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author dreiman
 */
public class ItemData implements SiebelData {

  //-------------------------------------
  /** Class version string */

  public static String CLASS_VERSION = "$Id: //product/Siebel/version/11.2/src/atg/siebel/catalog/mapper/ItemData.java#2 $$Change: 1194813 $";


	// -----------------------------
	// property: Name
	// -----------------------------	
	protected String mName;
	@Override
	public String getName() {
		return mName;
	}
	public void setName(String pName) {
		mName = pName;
	}
	
	// -----------------------------
  // property: ActionCode
  // -----------------------------  
	private String mActionCode;
	
	public String getActionCode() {
	  return mActionCode;
	}
	
	public void setActionCode(String pActionCode) {
	  mActionCode = pActionCode;
	}

  // -----------------------------
  // property: ExportItemId
  // -----------------------------  
  private String mExportItemId;
  
  public String getExportItemId() {
    return mExportItemId;
  }
  
  public void setExportItemId(String pExportItemId) {
    mExportItemId = pExportItemId;
  }

	// -----------------------------
	// property: Properties
	//
	// If the tag is empty for a Siebel entity in the XML properties will be null.
	// This causes us some issues so we do a check when the properties are retrieved.
	// -----------------------------	
	protected Map<String, Object> mProperties;
	public Map<String, Object> getProperties() {
		if (mProperties == null) {
			mProperties = new HashMap<String, Object>();
		}
		return mProperties;
	}
	public void setProperties(Map<String, Object> pProperties) {
		mProperties = pProperties;
	}

	public ItemData(String pName) {
		mName = pName;
	}

	/**
	 * Constructs a <code>String</code> with all attributes in name = value
	 * format.
	 * 
	 * @return a <code>String</code> representation of this object.
	 */
	public String toString() {
	  
	  StringBuilder itemDataString = new StringBuilder();
	  
		final String TAB = "    ";

		itemDataString.append("ItemData ( ").append(super.toString()).append(TAB)
		  .append("mName = ").append(this.mName).append(TAB)
		  .append("mProperties = ").append(this.mProperties).append(TAB)
		  .append("mActionCode = ").append(this.mActionCode).append(TAB)
		  .append("mExportItemId = ").append(this.mExportItemId).append(" )");
		    
		return itemDataString.toString();
	}

	@Override
	public Object getValue() {
		return mProperties;
	}

	@Override
	public void addChild(SiebelData pData) {
		if (mProperties == null) {
			mProperties = new HashMap<String, Object>();
		}
		if (pData instanceof ItemData) {
			// Has to be a list
			Object valuesObj = mProperties.get(pData.getName());
			if (!(valuesObj instanceof List)) {
				// TODO Handle this error
			}
			@SuppressWarnings("unchecked")
			List<Object> values = (List<Object>) valuesObj;
			if (values == null) {
				values = new ArrayList<Object>();
				mProperties.put(pData.getName(), values);
			}
			values.add(pData);
		} else {
			mProperties.put(pData.getName(), pData.getValue());
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof ItemData)) {
			return false;
		}
		ItemData itemData = (ItemData) obj;

		if (!getName().equalsIgnoreCase(itemData.getName())) {
			return false;
		}

		if (!getProperties().equals(itemData.getProperties())) {
			return false;
		}

		return true;
	}

}