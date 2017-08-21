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
/*
 * Copyright 2008 ATG Import Service Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package atg.siebel.catalog.importer;

// Import Files.

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.ErrorHandler;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.DefaultHandler;

import atg.adapter.gsa.xml.TemplateParser;
import atg.siebel.catalog.mapper.MappingConstants;
import atg.xml.XMLFileEntityResolver;

/**
 * ImportFileParser
 * 
 * File parser for startSQLRepository formatted files.
 * 
 */

public class ImportFileParser extends DefaultHandler implements ContentHandler, ErrorHandler {

  //-------------------------------------
  /** Class version string */

  public static String CLASS_VERSION = "$Id: //product/Siebel/version/11.2/src/atg/siebel/catalog/importer/ImportFileParser.java#2 $$Change: 1194813 $";

	private int mPhase;

	private File mImportFile;

	private SAXParser mParser = null;

	private ArrayList<ImportItem> mImportItemsArrayList = null;

	private int mAction;

	private String mItemDescriptor = null;

	private String mItemId = null;

	private String mRepositoryName = null;
	
	private String mExportItemId = null;

	private Stack<String> mTagNames = new Stack<String>();

	private StringBuffer mPropertyValue = null;

	private HashMap<String, String> mProperties = null;

	private String mPropertyName = null;

	/**
	 * Construct a new import file parser.
	 */

	public ImportFileParser(int pPhase, File pImportFile) {
		mPhase = pPhase;
		mImportFile = pImportFile;
	}

	public ImportItem[] parseFile() {
		// Variable declarations.

		SAXParserFactory factory = null;
		XMLReader reader = null;
		ImportItem[] importItems = null;

		// Create parser.

		try {
			factory = SAXParserFactory.newInstance();
			mParser = factory.newSAXParser();
			reader = mParser.getXMLReader();
			reader.setEntityResolver(new XMLFileEntityResolver());
		} catch (ParserConfigurationException e) {
			System.out.println("PARSER: ParserConfigurationException: " + e.getMessage());
			return (null);
		} catch (SAXException e) {
			System.out.println("PARSER: SAXException: " + e.getMessage());
			return (null);
		}

		// Create an input source and parse the string.

		mImportItemsArrayList = new ArrayList<ImportItem>();

		try {
			mParser.parse(mImportFile, this);
		} catch (SAXException e) {
			System.out.println("PARSER: SAXException: " + e.getMessage());
			return (null);
		} catch (IOException e) {
			System.out.println("PARSER: IOException: " + e.getMessage());
			return (null);
		}

		// Create the array.

		importItems = new ImportItem[mImportItemsArrayList.size()];
		importItems = (ImportItem[]) mImportItemsArrayList.toArray(importItems);

		return (importItems);
	}

	// ----------------------------
	// ContentHandler implementation
	// ----------------------------

	public void startElement(String namespaceURI, String localName, String qname, Attributes pAttributes) {
		mTagNames.push(qname);

		if (TemplateParser.TAG_ADD_ITEM.equals(qname)) {
			readTagAttributes(pAttributes);
			mAction = ImportItem.M_ACTION_ADD;
			mProperties = new HashMap<String, String>();
		} else if (TemplateParser.TAG_UPDATE_ITEM.equals(qname)) {
			readTagAttributes(pAttributes);
			mAction = ImportItem.M_ACTION_UPDATE;
			mProperties = new HashMap<String, String>();
		} else if (TemplateParser.TAG_REMOVE_ITEM.equals(qname)) {
			readTagAttributes(pAttributes);
			mAction = ImportItem.M_ACTION_DELETE;
			mProperties = new HashMap<String, String>();
		} else if (TemplateParser.TAG_SET_PROPERTY.equals(qname)) {
			String propertyName = pAttributes.getValue(TemplateParser.ATTR_NAME);
			mPropertyName = propertyName;
			mPropertyValue = new StringBuffer();
		}
	}

	private void readTagAttributes(Attributes pAttributes) {
		mItemDescriptor = pAttributes.getValue(TemplateParser.ATTR_ITEM_DESCRIPTOR);
		mItemId = pAttributes.getValue(TemplateParser.ATTR_ID);
		mRepositoryName = pAttributes.getValue(TemplateParser.ATTR_REPOSITORY);
		mExportItemId = pAttributes.getValue(MappingConstants.ATTR_ATG_EXPORT_ITEM_ID);
	}

	// ----------------------------
	/**
	 * Reads characters between tags <foo>characters</foo> For startSQLRepository,
	 * this is typically a property value Note that values with a comma are
	 * actually multi values
	 */
	public void characters(char[] chars, int start, int length) {
		if (TemplateParser.TAG_SET_PROPERTY.equals(mTagNames.peek())) {
			mPropertyValue.append(new String(chars, start, length));
		}
	}

	// -----------------------------
	/**
	 * Called when a tag ends This method cleans up state between tags
	 */

	public void endElement(String namespaceURI, String localName, String pQName) {
		if (TemplateParser.TAG_ADD_ITEM.equals(pQName)) {
			if (mPhase != ImportConstants.PHASE_DELETE) {
				addImportItem();
			}
		} else if (TemplateParser.TAG_UPDATE_ITEM.equals(pQName)) {
			if (mPhase != ImportConstants.PHASE_DELETE) {
				addImportItem();
			}
		} else if (TemplateParser.TAG_REMOVE_ITEM.equals(pQName)) {
			if (mPhase == ImportConstants.PHASE_DELETE) {
				addImportItem();
			}
		} else if (TemplateParser.TAG_SET_PROPERTY.equals(pQName)) {
			mProperties.put(mPropertyName, mPropertyValue.toString());
			mPropertyName = null;
		}

		mTagNames.pop();
	}

	// ----------------------------
	/**
	 * Called when we start parsing this file
	 */
	public void startDocument() {
	}

	// ----------------------------
	/**
	 * Called when we are done parsing this file
	 */
	public void endDocument() {
	}

	private void addImportItem() {
		ImportItem importItem = new ImportItem();

		importItem.setAction(mAction);
		importItem.setItemDescriptor(mItemDescriptor);
		importItem.setItemId(mItemId);
		importItem.setRepositoryName(mRepositoryName);
		importItem.setExportItemId(mExportItemId);
		importItem.setProperties(mProperties);

		mImportItemsArrayList.add(importItem);

		// displayImportItem (importItem);
	}

	// ----------------------------
	// ErrorHandler implementation
	// ----------------------------

	public void error(SAXParseException e) {
		System.out.println("ERROR: " + e.getMessage());
	}

	public void fatalError(SAXParseException e) {
		System.out.println("FATAL ERROR: " + e.getMessage());
	}

	public void warning(SAXParseException e) {
		System.out.println("WARNING: " + e.getMessage());
	}
}
