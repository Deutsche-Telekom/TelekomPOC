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

package atg.siebel.catalog.importer;

// atg classes
import atg.core.i18n.LayeredResourceBundle;

// java classes
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.MissingResourceException;

/**
 * 
 * @author
 * @version $Id:
 *          //product/Siebel/main/src/atg/siebel/integration/catalog/importer
 *          /ImportConstants.java#3 $$Change: 1194813 $
 * @updated $DateTime: 2015/09/10 08:26:24 $$Author: saysyed $
 */

public class ImportConstants {

	// -------------------------------------
	// Class version string
	// -------------------------------------

	public static String CLASS_VERSION = "$Id: //product/Siebel/version/11.2/src/atg/siebel/catalog/importer/ImportConstants.java#2 $$Change: 1194813 $";

	// --------------------------------------------------
	// Constants

	// The full name of our bundle, e.g. "atg.catbutt.Resources".
	protected static String sBundleName = "atg.commerce.promotion.PromotionResources";

	public static final String M_PRODUCT_CATALOG_REPOSITORY = "/atg/commerce/catalog/ProductCatalog";
	
	public static final String M_PRICE_LIST_REPOSITORY = "/atg/commerce/pricing/PriceLists";
	
	/** Duplicate import export session id */
	public static final String DUPLICATE_IMPORT_SESSION_ID = "duplicateImportSessionId";

	/** Promotion transaction creation failed */
	public static final String IMPORT_TRANSACTION_CREATION_FAILED = "transactionCreationFailed";

	/** Invalid import export session */
	public static final String INVALID_IMPORT_SESSION = "invalidImportSession";

	/** Invalid promotion import export object */
	public static final String INVALID_IMPORT_OBJECT = "invalidImportObject";

	public static final String M_SERVICE_STATUS_WAITING_TO_START = "Service: Waiting to start";

	public static final String M_SERVICE_STATUS_PROJECT_CREATION = "Project : Creating";

	public static final String M_SERVICE_STATUS_PRE_DATA_IMPORT = "Data Import : Preparing";

	public static final String M_SERVICE_STATUS_DATA_IMPORT_BATCH_CREATION = "Data Import : Creating the batches";

	public static final String M_SERVICE_STATUS_DATA_IMPORT_ADD_UPDATE_PHASE = "Data Import : Add Update phase";

	public static final String M_SERVICE_STATUS_DATA_IMPORT_REFERENCE_UPDATE_PHASE = "Data Import : Reference Update phase";

	public static final String M_SERVICE_STATUS_DATA_IMPORT_DELETE_PHASE = "Data Import : Delete phase";

	public static final String M_SERVICE_STATUS_DATA_IMPORT_PROCESSING_FAILED_DELETIONS = "Data Import : Processing failed deletions";

	public static final String M_SERVICE_STATUS_PROJECT_ADVANCE_WORKFLOW = "Project : Advance workflow";

	public static final String M_SERVICE_STATUS_COMPLETED_SUCCESSFULLY = "Service : Completed successfully";

	public static final String M_SERVICE_STATUS_COMPLETED_WITH_ERRORS = "Service : Completed successfully (Check error file)";

	public static final String M_SERVICE_STATUS_CANCELLED = "Service : Import cancelled";

	public static final String M_SERVICE_STATUS_FATAL_ERROR_THRESHOLD_REACHED = "Service : Fatal Error : Import error threshold reached";

	public static final String M_SERVICE_STATUS_FATAL_ERROR_THREAD_DIED = "Service : Fatal Error : ";

	public static final String M_SERVICE_STATUS_FATAL_ERROR_IO = "Service : Fatal Error : IO Problem";

	public static final String M_SERVICE_STATUS_FATAL_ERROR_DATABASE = "Service : Fatal Error : Database problem";

	public static final String M_SERVICE_STATUS_FATAL_ERROR_THREADS = "Service : Fatal Error : Threading problem";

	public static final int PHASE_ADD_UPDATE = 0;

	public static final int PHASE_REFERENCE_UPDATE = 1;

	public static final int PHASE_DELETE = 2;

	public static final String M_SEGMENT_FILE_STUB = "IMPORT_SEGMENT_";
	
	public static final String M_IMPORT_FILE_STUB = "IMPORT_FILE";

	public static final String M_SEGMENT_FILE_EXTENSION = ".xml";

	public static final String M_FAILURES_FILENAME = "IMPORT_FAILURES.log";

	public static final String M_TAG_ADD_ITEM = "add-item";
	public static final String M_TAG_ADD_ITEM_START = "<add-item";
	public static final String M_TAG_ADD_ITEM_END = "</add-item";

	public static final String M_TAG_UPDATE_ITEM = "update-item";
	public static final String M_TAG_UPDATE_ITEM_START = "<update-item";
	public static final String M_TAG_UPDATE_ITEM_END = "</update-item";

	public static final String M_TAG_REMOVE_ITEM = "remove-item";
	public static final String M_TAG_REMOVE_ITEM_START = "<remove-item";
	public static final String M_TAG_REMOVE_ITEM_END = "</remove-item";

	public static final String M_TAG_CLOSE = "/>";
	
	public static final String M_ITEM_CATALOG = "catalog";
	public static final String M_ITEM_CATEGORY = "category";
	public static final String M_ITEM_PRODUCT = "product";
	public static final String M_ITEM_RECOMMENDED_PRODUCTS = "recommended-product";
	public static final String M_ITEM_CONFIGURED_ATTRIBUTE = "configured-attribute";
	public static final String M_ITEM_SKU = "sku";
	public static final String M_ITEM_MEDIA_EXTERNAL = "media-external";
	public static final String M_ITEM_FOLDER = "folder";
	public static final String M_ITEM_RELATIONSHIP_DOMAIN = "relationship-domain";

	public static final String M_ITEM_ATG_ID = "id";

	public static final int THREAD_STATUS_STARTED = 0;

	public static final int THREAD_STATUS_NOTIFIED = 1;

	public static final int THREAD_STATUS_PROCESSING = 2;

	public static final int THREAD_STATUS_PHASE_COMPLETED = 3;

	public static final int STATUS_SUCCESS = 0;

	public static final String IMPORT_TRANSACTION_COMMIT_ROLLBACK_FAILED = "IMPORT_TRANSACTION_COMMIT_ROLLBACK_FAILED";

	public static final String NO_DEPLOYMENTAGENT_CONFIGURED = "NO_DEPLOYMENTAGENT_CONFIGURED";

	public static final String ATG_ITEM_NAME = "ATG_ITEM_NAME";

	public static final String ATG_PROPERTY_NAME = "ATG_PROPERTY_NAME";
	
	public static final String ATG_REPOSITORY_NAME = "ATG_REPOSITORY_NAME";

	public static final String ATG_MAPPING_COMPONENT_NAME = "ATG_MAPPING_COMPONENT_NAME";

	public static final String ATG_ITEM_DESRIPTOR_NAME = "ATG_ITEM_DESRIPTOR_NAME";

	public static final String GSA_HEADER = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<!DOCTYPE gsa-template SYSTEM \"dynamosystemresource:/atg/dtds/gsa/gsa_1.0.dtd\">\n<gsa-template>\n";

	public static final String GSA_FOOTER = "</gsa-template>";

	public static final String SIEBEL_ITEM = "SIEBEL_ITEM";
	
	/** Errors */
	public static final String INVALID_EXPORT_DIRECTORY = "invalidExportDirectory";
	public static final String NO_MAPPINGS_FILE = "noMappingsFile";
	public static final String EMPTY_MAPPINGS_MAP = "emptyMappingsMap";
	public static final String INVALID_STARTSQLREPOSITORY_FILE = "invalidStartSQLRepositoryFile";
	public static final String FILE_IO_ERROR = "fileIOError";
	public static final String XML_PARSE_ERROR = "xmlParseError";
	public static final String INVALID_ITEM_ERROR = "invalidItemError";
	public static final String INVALID_ENTITY_MAPPER_ERROR = "invalidEntityMapperError";
	public static final String INVALID_CUSTOM_MAPPING_COMPONENT = "invalidCustomMappingComponent";
	public static final String GENERAL_MAPPING_ERROR = "generalMappingError";
	public static final String REPOSITORY_PROPERTY_INVALID_TYPE = "repositoryPropertyInvalidType";
	public static final String INVALID_PARSED_CHILD_ITEM_TYPE = "invalidParsedChildItemType";
	
	

	// --------------------------------------------------
	// Member Variables
	// --------------------------------------------------

	// --------------------------------------------------
	// Properties
	// --------------------------------------------------

	// --------------------------------------------------
	// Constructors
	// --------------------------------------------------

	// --------------------------------------------------
	// Methods
	// --------------------------------------------------

	// -------------------------------------
	// Getting resources
	// -------------------------------------
	/**
	 * Reads the string with the given key from the resource file.
	 **/
	public static String getStringResource(String pResourceName) throws MissingResourceException {
		ResourceBundle bundle = LayeredResourceBundle.getBundle(sBundleName);
		try {
			String ret = bundle.getString(pResourceName);
			if (ret == null) {
				throw new MissingResourceException(ret, "atg.commerce.fulfillment.Constants", pResourceName);
			} else {
				return ret;
			}
		} catch (MissingResourceException exc) {
			// Print the error to to stderr for good measure since these
			// exceptions might be getting called from a static initializer
			// and exceptions thrown during that could have some funky
			// results.
			System.err.println("ERROR: Unable to load resource " + bundle + "->" + pResourceName + ": " + exc);
			throw exc;
		}
	}

	/**
	 * Returns the specified resource from the hard-coded ResourceBundle. Makes
	 * sure that the bundle is initialized and performs standard preparations of
	 * the resource string.
	 * 
	 * @param pResourceName
	 *          The name (or lookup key) of the string resource to fetch.
	 * @return String the string resource returned by the resource bundle
	 * @exception MissingResourceException
	 *              Thrown when the bundle or the resource cannot be found.
	 **/
	public static String getStringResource(String pResourceName, Locale pLocale) throws MissingResourceException {
		try {

			// Grab our bundle for the given locale.
			ResourceBundle bundle = LayeredResourceBundle.getBundle(sBundleName, pLocale);

			String msg = bundle.getString(pResourceName);

			if (msg == null) {
				throw new MissingResourceException(msg, "atg.commerce.fulfillment.Constants", pResourceName);
			} else
				return msg;

		} catch (MissingResourceException exc) {
			// Print the error to to stderr for good measure since these
			// exceptions might be getting called from a static initializer
			// and exceptions thrown during that could have some funky
			// results.
			System.err.println("ERROR: Unable to load resource " + sBundleName + "->" + pResourceName + ": " + exc);
			throw exc;
		}
	}

} // end of class
