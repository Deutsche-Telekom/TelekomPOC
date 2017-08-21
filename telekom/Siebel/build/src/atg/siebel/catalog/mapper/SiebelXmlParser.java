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

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.ErrorHandler;
import org.xml.sax.InputSource;
import org.xml.sax.Locator;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;
import org.xml.sax.XMLReader;

/**
 * <p>
 * This class uses a SAX-based XML parser to parse the tags from an input
 * stream, then assembles the tags into a hierarchical Java structure. Any
 * SAX-based parser can be used (meaning that the XML parser must implement the
 * SAX interface).
 * 
 * 
 * @author
 * @version $Id:
 *          //product/Siebel/main/src/atg/siebel/integration/catalog/mapper/
 *          SiebelXmlParser.java#1 $$Change: 1194813 $
 * @updated $DateTime: 2015/09/10 08:26:24 $$Author: saysyed $
 */
public class SiebelXmlParser implements ContentHandler, ErrorHandler {

	// -------------------------------------
	// Class version string

	public static String CLASS_VERSION = "$Id: //product/Siebel/version/11.2/src/atg/siebel/catalog/mapper/SiebelXmlParser.java#2 $$Change: 1194813 $";
	
	// -------------------------------------
	// Member variables
	// -------------------------------------

	protected Locator mLocator;

	protected Stack<SiebelData> mStack;

	protected SiebelCatalogMappingService mSiebelCatalogMappingService;

	protected List<ItemData> mTopLevelItems;

	// -------------------------------------
	/**
	 * 
	 * Parses the specified InputStream using the specified SAX-enabled parser,
	 * calling on the specified TagProcessor to convert parsed tags into Objects.
	 * The parsed top-level Object is returned.
	 **/
	public synchronized List<ItemData> parse(XMLReader pParser, InputStream pInput,
	    SiebelCatalogMappingService pSiebelCatalogMappingService) throws SAXException, IOException {

		mLocator = null;
		mStack = new Stack<SiebelData>();
		mSiebelCatalogMappingService = pSiebelCatalogMappingService;
		mTopLevelItems = new ArrayList<ItemData>();
		InputSource source = new InputSource(pInput);
		pParser.setContentHandler(this);
		pParser.setErrorHandler(this);
		pParser.parse(source);

		// Return whatever is on the top of the stack
		@SuppressWarnings("unused")
		SiebelData ret = (mStack.empty()) ? null : mStack.pop();
		mStack = null;
		mLocator = null;
		return mTopLevelItems;
	}

	// -------------------------------------
	// DocumentHandler methods
	// -------------------------------------
	public void setDocumentLocator(Locator pLocator) {
		mLocator = pLocator;
	}

	// -------------------------------------
	public void startDocument() throws SAXException {
	}

	// -------------------------------------
	public void endDocument() throws SAXException {
	}

	// -------------------------------------
	public void startElement(String pNamespaceURI, String pLocalName, String pRawName, Attributes pAttributes)
	    throws SAXException {
		// We use the local name here because the raw name may have a namespace prefixed 
		if (mSiebelCatalogMappingService.isSiebelItemName(pLocalName)) {
			ItemData newItem = new ItemData(pLocalName);			
			newItem.setActionCode(getActionCode(pAttributes));
			newItem.setExportItemId(getExportItemId(pAttributes));
			mStack.push(newItem);
		} else {
			if (!mStack.isEmpty()) {
				mStack.push(new PropertyData(pLocalName));
			}
		}

	}

	private String getActionCode(Attributes pAttributes) {
	  String actionCode = pAttributes.getValue(MappingConstants.ATTR_ACTION_CODE);
	  if (actionCode != null) {
	    return actionCode;
	  }
	  return MappingConstants.ACTION_UPSERT;
	}
	
	private String getExportItemId(Attributes pAttributes) {
    String exportItemId = pAttributes.getValue(MappingConstants.ATTR_EXPORT_ITEM_ID);
    if (exportItemId != null) {
      return exportItemId;
    }
    else {
      if (!mStack.isEmpty()) {
        SiebelData topElement = mStack.firstElement();
        if (topElement instanceof ItemData) {
          return ((ItemData)topElement).getExportItemId();
        }
      }
    }
	  
	  return null;
	}
	
	// -------------------------------------
	public void characters(char[] pChars, int pStart, int pLength) throws SAXException {
		// This used to have a call to trim() but it was found that because the sax driver chunks 
		// data anyway it likes not all content of an element was arriving in a single characters
		// event. This was causing spaces in the middle of strings to be omitted.
		String str = new String(pChars, pStart, pLength);
		if (str.length() > 0) {
			if (!mStack.empty()) {
				Object tag = mStack.peek();
				if (tag instanceof PropertyData) {
					((PropertyData) tag).setStringValue(str);
				}
			}
		}
	}

	// -------------------------------------
	public void endElement(String pNamespaceURI, String pLocalName, String pRawName) throws SAXException {
		if (!mStack.empty()) {
			SiebelData obj = mStack.pop();
			if (!mStack.empty()) {
				SiebelData enclosing = mStack.peek();
				enclosing.addChild(obj);
			} else if (!mTopLevelItems.contains((ItemData) obj)) {
				mTopLevelItems.add((ItemData) obj);
			}
		}
	}

	// -------------------------------------
	public void ignorableWhitespace(char[] pChars, int pStart, int pLength) throws SAXException {
	}

	// -------------------------------------
	public void processingInstruction(String pTarget, String pData) throws SAXException {
	}

	/**
	 * New method required with the SAX2 ContentHandler interface; needed for
	 * namespaces.
	 * <p>
	 * We just accept the default namespace handling.
	 */
	public void startPrefixMapping(String pPrefix, String pUri) throws SAXException {
	}

	/**
	 * New method required with the SAX2 ContentHandler interface; needed for
	 * namespaces.
	 * <p>
	 * We just accept the default namespace handling.
	 */
	public void endPrefixMapping(String pPrefix) throws SAXException {
	}

	/**
	 * New method required with the SAX2 ContentHandler interface.
	 * <p>
	 * We have no special handling for skippedEntities.
	 */
	public void skippedEntity(String pName) throws SAXException {
	}

	@Override
	public void error(SAXParseException arg0) throws SAXException {
	}

	@Override
	public void fatalError(SAXParseException arg0) throws SAXException {
	}

	@Override
	public void warning(SAXParseException arg0) throws SAXException {
	}
}
