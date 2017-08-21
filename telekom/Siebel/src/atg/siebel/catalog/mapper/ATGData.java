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

import java.util.HashMap;
import java.util.Map;

import atg.adapter.gsa.xml.TemplateParser;
import atg.nucleus.GenericService;
import atg.repository.Repository;
import atg.repository.RepositoryException;
import atg.repository.RepositoryItem;
import atg.siebel.catalog.importer.ImportConstants;

/**
 * 
 * 
 * @author dreiman
 */
public class ATGData {
	
	//-------------------------------------
	/** Class version string */
	public static final String CLASS_VERSION = "$Id: //product/Siebel/version/11.2/src/atg/siebel/catalog/mapper/ATGData.java#2 $$Change: 1194813 $";

	// -----------------------------
	// property: Name
	// -----------------------------	
	private String mName;
	public String getName() {
		return mName;
	}
		
	// -----------------------------
	// property: Status
	// -----------------------------	
	private ItemState mStatus;
	public ItemState getStatus() {
		return mStatus;
	}

	// -----------------------------
	// property: Properties
	// -----------------------------	
	private Map<String, Object> mProperties;
	public Map<String, Object> getProperties() {
		return mProperties;
	}
	
  // -----------------------------
  // property: ATGRepository
  // -----------------------------  
  private Repository mATGRepository;
  public Repository getATGRepository() {
    return mATGRepository;
  }
  
  // -----------------------------
  // property: exportItemId
  // -----------------------------    
  private String mExportItemId;
  public String getExportItemId() {
    return mExportItemId;
  }
	
	//-------------------------------------
	// Constructors
	//-------------------------------------

	public ATGData(String pName, Repository pATGRepository) {
		this(pName, pATGRepository, ItemState.NEW);
	}
	
	public ATGData(String pName, Repository pATGRepository, ItemState pStatus) {
		mName = pName;
		mATGRepository = pATGRepository;
		mStatus = pStatus;
	}
	
	public ATGData(String pName, Repository pATGRepository, String pActionCode, String pExportItemId) {
	  mName = pName;
    mATGRepository = pATGRepository;
	  if (pActionCode.equalsIgnoreCase(MappingConstants.ACTION_DELETE)) {
	    mStatus = ItemState.DELETED;
	  }
	  else if (pActionCode.equalsIgnoreCase(MappingConstants.ACTION_UPSERT)) {
	    mStatus = ItemState.UNDETERMINED;
	  }
	  // Initially we had considered disregarding any entities which came through
	  // with action code 'REFERENCE'. However after some testing realised that
	  // we would have to update these items since their children may have changed.
	  // eg. Catalog is sent through with action code 'REFERENCE' but it has a new
	  // category added. Unless we update the catalog the link between catalog and
	  // category would be lost.
	  else if (pActionCode.equalsIgnoreCase(MappingConstants.ACTION_REFERENCE)) {
	    mStatus = ItemState.CHANGED;
	  }
	  else {
	    mStatus = ItemState.UNDETERMINED;
	  }
	  mExportItemId = pExportItemId;
	}

	
	/**
	 * 
	 * @param key
	 * @param obj
	 */
	public void addProperty(String key, Object obj) {
		if (mProperties == null) {
			mProperties = new HashMap<String, Object>();
		}
	  mProperties.put(key, obj);
	}
	
	/**
	 * Constructs an xml string representation of this item 
	 * 
	 * @return the xml string
	 */
	public String asXmlString() {
	  determineStatus();
	  
	  if (mProperties == null) {
	    return "";
	  }
	  
		switch (mStatus) {
		case NEW:
			return constructXML(ImportConstants.M_TAG_ADD_ITEM);

		case CHANGED:
			return constructXML(ImportConstants.M_TAG_UPDATE_ITEM);

		case DELETED:
			StringBuilder xmlString = new StringBuilder();
			xmlString.append("\t<").append(ImportConstants.M_TAG_REMOVE_ITEM).append(" ")
			  .append(TemplateParser.ATTR_ITEM_DESCRIPTOR).append("=\"").append(mName).append("\" id=\"")
			  .append(mProperties.get("id")).append("\" ").append(TemplateParser.ATTR_REPOSITORY)
			  .append("=\"").append(((GenericService)mATGRepository).getAbsoluteName()).append("\" ");
	    if (mExportItemId != null && !mExportItemId.isEmpty()) {
	      xmlString.append(MappingConstants.ATTR_ATG_EXPORT_ITEM_ID).append("=\"").append(mExportItemId).append("\"");
	    }
			xmlString.append("/>\n");
			return xmlString.toString();
		}
		return "";
	}

	/*
	 * Convenience method to construct the XML for the ADD and UPDATE cases
	 */
	@SuppressWarnings("rawtypes")
	private String constructXML(String pActionTag) {

		StringBuilder xmlString = new StringBuilder();
		xmlString.append("\t<").append(pActionTag).append(" id=\"").append(mProperties.get("id")).append("\" ")
		  .append(TemplateParser.ATTR_ITEM_DESCRIPTOR).append("=\"").append(mName).append("\" ")
		  .append(TemplateParser.ATTR_REPOSITORY).append("=\"")
		  .append(((GenericService)mATGRepository).getAbsoluteName()).append("\" ");
		if (mExportItemId != null && !mExportItemId.isEmpty()) {
		  xmlString.append(MappingConstants.ATTR_ATG_EXPORT_ITEM_ID).append("=\"")
		    .append(mExportItemId).append("\"");
		}
		xmlString.append(">\n");
		for (Map.Entry nextEntry : mProperties.entrySet()) {
			xmlString.append("\t\t<").append(TemplateParser.TAG_SET_PROPERTY).append(" ")
			  .append(TemplateParser.ATTR_NAME).append("=\"").append(nextEntry.getKey()).append("\"><![CDATA[")
			  .append(nextEntry.getValue()).append("]]></").append(TemplateParser.TAG_SET_PROPERTY).append(">\n");
		}
		xmlString.append("\t</").append(pActionTag).append(">\n");
		return xmlString.toString();
	}

	/**
	 * Determines the status of this item if it is currently undetermined
	 */
	private void determineStatus() {
	  // we only need to do this if the item state is undetermined
		if (mStatus.compareTo(ItemState.UNDETERMINED) != 0)
		{
		  return;
		}
		
	  if (mATGRepository == null) {
			// throw new MappingException("");
		}
		
		if (mName == null || mProperties == null || mProperties.isEmpty()) {
			// throw new MappingException("");
		}
		String id = (String) mProperties.get("id");
		if (id == null) {
			// TODO What do we do if there is no id?????
		} else {

			RepositoryItem item = null;
			try {

				item = mATGRepository.getItem(id, mName);
				if (item == null) {
					mStatus = ItemState.NEW;
				} else {
					mStatus = ItemState.CHANGED;
				}
			} catch (RepositoryException e) {
				// throw new MappingException(e);
			}
		}
	}
	
	
  public String toString() {
    
    StringBuilder retValue = new StringBuilder();
    
    final String TAB = "    ";

    retValue.append("ATGData ( ").append("mName = ").append(this.mName).append(TAB)
      .append("mProperties = ").append(this.mProperties).append(TAB)
      .append("mStatus = ").append(this.mStatus).append(TAB)
      .append("mATGRepository = ").append(this.mATGRepository).append(TAB)
      .append("mExportItemId = ").append(this.mExportItemId).append(" )");
        
    return retValue.toString();
  }

	
	
}
