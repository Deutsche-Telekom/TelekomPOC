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

package atg.siebel.catalog;

import atg.beans.DynamicBeans;
import atg.beans.PropertyNotFoundException;
import atg.commerce.catalog.custom.CustomCatalogTools;
import atg.core.i18n.LayeredResourceBundle;
import atg.core.util.StringUtils;
import atg.repository.*;
import atg.service.resourcepool.ResourcePoolException;
import atg.servlet.ServletUtil;
import atg.siebel.account.SiebelAccountTools;
import atg.siebel.integration.SiebelWebServiceConfigurationException;
import atg.siebel.integration.WebServiceHelper;
import atg.siebel.integration.WebServiceController;
import com.siebel.ordermanagement.quote.data.ListOfQuote;
import com.siebel.ordermanagement.quote.data.ListOfQuoteItem;
import com.siebel.ordermanagement.quote.data.Quote;
import com.siebel.ordermanagement.quote.data.QuoteItem;
import com.siebel.ordermanagement.quote.data.projectedasset.ListOfAsset;
import com.siebel.ordermanagement.quote.psp.CheckQuoteEligibilityCompatibilityInput;
import com.siebel.ordermanagement.quote.psp.CheckQuoteEligibilityCompatibilityOutput;

import java.lang.reflect.InvocationTargetException;
import java.sql.Timestamp;
import java.text.MessageFormat;
import java.util.*;
import java.util.Map.Entry;

/**
 * This class extends CatalogTools to add some additional functionality for the
 * Siebel integration.
 *
 * @author Patrick Mc Erlean
 * @version $Id: //product/Siebel/version/11.2/src/atg/siebel/catalog/SiebelCatalogTools.java#2 $$Change: 1194813 $
 * @updated $DateTime: 2015/09/10 08:26:24 $$Author: saysyed $
 */

public class SiebelCatalogTools extends CustomCatalogTools 
{
  //----------------------------------------------------------------------------------
  // Class version string
  //----------------------------------------------------------------------------------

  public static String CLASS_VERSION = "$Id: //product/Siebel/version/11.2/src/atg/siebel/catalog/SiebelCatalogTools.java#2 $$Change: 1194813 $";
  protected static final int NULL_ATTRIBUTE_SEQUENCE_INITIALISER = 10000;
  
  // map of ISO 639-1 Codes -> Localized Languages for Siebel CRM Version 8.1
  // see http://docs.oracle.com/cd/E11886_01/V8/CORE/SRSP_81/SRSP_81_Globalization2.html
  // In many cases the Siebel codes do match the 3 letter ISO codes but there are 
  // also a few differences - eg Czech ISO 3 letter code is 'cze' or 'ces' whereas 
  // Siebel is 'CSY' and hence we need this map.
  // Might need some more work on this as sometimes we might need to extract
  // the country code from a locale in order to map to the correct variant of
  // the language e.g. Siebel has PTB & PTG for Brazilian/European Portugese
  protected static final Map<String, String> ISO_SIEBEL_LANGUAGE_CODE_MAP = 
      Collections.unmodifiableMap(new HashMap<String, String>() {{ 
        put("en", "ENU");
        put("ar", "ARA");
        put("zh", "CHS");
        put("da", "DAN");
        put("nl", "NLD");
        put("fi", "FIN");
        put("fr", "FRA");
        put("de", "DEU");       
        put("he", "HEB");
        put("cs", "CSY");
        put("it", "ITA");
        put("ja", "JPN");
        put("ko", "KOR");
        put("pl", "PLK");
        put("pt", "PTB");
        put("ru", "RUS");
        put("es", "ESN");
        put("sv", "SVE");
        put("th", "THA");
        put("tr", "TRK");}});
  
  // We'll cache attribute value internal->display value mappings in this map
  protected Map<String, Map<String, String>> mAttributeValueDisplayValueLookup = 
      new HashMap<String, Map<String, String>>();

  //----------------------------------------------------------------------------------
  // Constants
  //----------------------------------------------------------------------------------

  public static final String M_SIMPLE_PRODUCT = "Simple Product";
  public static final String M_SIMPLE_PRODUCT_WITH_ATTRIBUTES = "Simple Product With Attributes";
  public static final String M_SIMPLE_PRODUCT_BUNDLE = "Simple Product Bundle";
  public static final String M_CONFIGURABLE_PRODUCT = "Configurable Product";
  public static final String M_PROMOTION = "Promotion";
  public static final String M_PROMOTION_AGGREGATE_RELATIONSHIP = "Aggregate";
  public static final String M_PROMOTION_COMPONENTS_RELATIONSHIP = "Components";
  public static final String M_ATTRIBUTE_ENUMERATED_DOMAINTYPE = "ENUMERATED";
  public static final String M_ATTRIBUTE_INTEGER_VALUETYPE = "Integer";

  //ResourceBundle Name
  private static final String SIEBEL_RESOURCE_BUNDLE_NAME = "atg.siebel.WebAppResources";
  private static ResourceBundle sResourceBundle = LayeredResourceBundle.getBundle(SIEBEL_RESOURCE_BUNDLE_NAME, atg.service.dynamo.LangLicense.getLicensedDefault());
  private static final String PRODUCT_NOT_FOUND_IN_CATALOG="productNotFoundInCatalog";


  
  
  //----------------------------------------------------------------------------------
  // Member Variables
  //----------------------------------------------------------------------------------

  //----------------------------------------------------------------------------------
  // Properties
  //----------------------------------------------------------------------------------

  protected WebServiceController mWebServiceController;

  // --------- Property: WebServiceController ------------
  public void setWebServiceController(WebServiceController pWebServiceController)
  {
    mWebServiceController = pWebServiceController;
  }

  public WebServiceController getWebServiceController()
  {
    return mWebServiceController;
  }

  //----------------------------------------------------------------------------------
  // property: webServiceHelper

  private WebServiceHelper mWebServiceHelper;

  /**
   * Returns the Web Service Helper
   *
   * @return the Web Service Helper
   */

  public WebServiceHelper getWebServiceHelper()
  {
    return mWebServiceHelper;
  }

  /**
   * Sets the Web Service Helper
   *
   * @param pWebServiceHelper the Web Service Helper to set
   */

  public void setWebServiceHelper (WebServiceHelper pWebServiceHelper)
  {
    mWebServiceHelper = pWebServiceHelper;
  }  
  
  //----------------------------------------------------------------------------------
  // property: siebelAccountTools

  private SiebelAccountTools mSiebelAccountTools;

  /**
   * Returns the Siebel Account Tools
   *
   * @return the Siebel Account Tools
   */

  public SiebelAccountTools getSiebelAccountTools()
  {
    return mSiebelAccountTools;
  }

  /**
   * Sets the Siebel Account Tools
   *
   * @param pSiebelAccountTools the Siebel Account Tools to set
   */

  public void setSiebelAccountTools (SiebelAccountTools pSiebelAccountTools)
  {
    mSiebelAccountTools = pSiebelAccountTools;
  }  
  
  
  //----------------------------------------------------------------------------------
  // property: categoryProductItemDescriptor

  private String mCategoryProductItemDescriptor = "category-product";

  /**
   * Returns the Category Product Item Descriptor name
   *
   * @return the Category Product Item Descriptor name
   */

  public String getCategoryProductItemDescriptor()
  {
    return mCategoryProductItemDescriptor;
  }

  /**
   * Sets the Category Product Item Descriptor name
   *
   * @param pCategoryProductItemDescriptor the Category Product Item Descriptor
   * name to set
   */

  public void setCategoryProductItemDescriptor (String pCategoryProductItemDescriptor)
  {
    mCategoryProductItemDescriptor = pCategoryProductItemDescriptor;
  }  
  
  //----------------------------------------------------------------------------------
  // property: attributeItemDescriptor

  private String mAttributeItemDescriptor = "attribute";

  /**
   * Returns the Attribute Item Descriptor name
   *
   * @return the Attribute Item Descriptor name
   */

  public String getAttributeItemDescriptor()
  {
    return mAttributeItemDescriptor;
  }

  /**
   * Sets the Attribute Item Descriptor name
   *
   * @param pAttributeItemDescriptor the Attribute Item Descriptor name to set
   */

  public void setAttributeItemDescriptor (String pAttributeItemDescriptor)
  {
    mAttributeItemDescriptor = pAttributeItemDescriptor;
  }  
  
  //----------------------------------------------------------------------------------
  // property: productClassItemDescriptor

  private String mProductClassItemDescriptor = "product-class";

  /**
   * Returns the product class item descriptor name
   *
   * @return the product class item descriptor name
   */

  public String getProductClassItemDescriptor()
  {
    return mProductClassItemDescriptor;
  }

  /**
   * Sets the product class item descriptor name
   *
   * @param pProductClassItemDescriptor the product class item descriptor name to set
   */

  public void setProductClassItemDescriptor (String pProductClassItemDescriptor)
  {
    mProductClassItemDescriptor = pProductClassItemDescriptor;
  }

  //----------------------------------------------------------------------------------
  // property: classPropertyName

  private String mClassPropertyName = "class";

  /**
   * Returns the class property name
   *
   * @return the class property name
   */

  public String getClassPropertyName()
  {
    return mClassPropertyName;
  }

  /**
   * Sets the class property name
   *
   * @param pClassPropertyName the class property name to set
   */

  public void setClassPropertyName (String pClassPropertyName)
  {
    mClassPropertyName = pClassPropertyName;
  }

  //----------------------------------------------------------------------------------
  // property: idPropertyName

  private String mIdPropertyName = "id";

  /**
   * Returns the id property name
   *
   * @return the id property name
   */

  public String getIdPropertyName()
  {
    return mIdPropertyName;
  }

  /**
   * Sets the id property name
   *
   * @param pIdPropertyName the id property name to set
   */

  public void setIdPropertyName (String pIdPropertyName)
  {
    mIdPropertyName = pIdPropertyName;
  }

  //----------------------------------------------------------------------------------
  // property: inclusiveEligibilityFlagPropertyName

  private String mInclusiveEligibilityFlagPropertyName = "inclusiveEligibilityFlag";

  /**
   * Returns the inclusive eligibility flag property name
   *
   * @return the inclusive eligibility flag property name
   */

  public String getInclusiveEligibilityFlagPropertyName()
  {
    return mInclusiveEligibilityFlagPropertyName;
  }

  /**
   * Sets the inclusive eligibility flag property name
   *
   * @param pInclusiveEligibilityFlagPropertyName the inclusive eligibility flag property name to set
   */

  public void setInclusiveEligibilityFlagPropertyName (String pInclusiveEligibilityFlagPropertyName)
  {
    mInclusiveEligibilityFlagPropertyName = pInclusiveEligibilityFlagPropertyName;
  }

  //----------------------------------------------------------------------------------
  // property: effectiveFromPropertyName

  private String mEffectiveFromPropertyName = "startDate";

  /**
   * Returns the effective from date property name
   *
   * @return the effective from date property name
   */

  public String getEffectiveFromPropertyName()
  {
    return mEffectiveFromPropertyName;
  }

  /**
   * Sets the effective from date property name
   *
   * @param pEffectiveFromPropertyName the effective from date property name to set
   */

  public void setEffectiveFromPropertyName (String pEffectiveFromPropertyName)
  {
    mEffectiveFromPropertyName = pEffectiveFromPropertyName;
  }

  //----------------------------------------------------------------------------------
  // property: effectiveToPropertyName

  private String mEffectiveToPropertyName = "endDate";

  /**
   * Returns the effective to date property name
   *
   * @return the effective to date property name
   */

  public String getEffectiveToPropertyName()
  {
    return mEffectiveToPropertyName;
  }

  /**
   * Sets the effective to date property name
   *
   * @param pEffectiveToPropertyName the effective to date property name to set
   */

  public void setEffectiveToPropertyName (String pEffectiveToPropertyName)
  {
    mEffectiveToPropertyName = pEffectiveToPropertyName;
  }

  //----------------------------------------------------------------------------------
  // property: namePropertyName

  private String mNamePropertyName = "displayName";

  /**
   * Returns the attribute name property name
   *
   * @return the attribute name property name
   */

  public String getNamePropertyName()
  {
    return mNamePropertyName;
  }

  /**
   * Sets the attribute name property name
   *
   * @param pNamePropertyName the attribute name property name to set
   */

  public void setNamePropertyName (String pNamePropertyName)
  {
    mNamePropertyName = pNamePropertyName;
  }

//----------------------------------------------------------------------------------
  // property: namePropertyName

  private String mPropTypeCDPropertyName = "propTypeCD";

  /**
   * Returns the propTypeCD name property name
   *
   * @return the propTypeCD name property name
   */

  public String getPropTypeCDPropertyName() {
		return mPropTypeCDPropertyName;
	} 

  /**
   * Sets the propTypeCD name property name
   *
   * @param pPropTypeCD the propTypeCD name property name to set
   */

  public void setPropTypeCDPropertyName(String pPropTypeCDPropertyName) {
		this.mPropTypeCDPropertyName = pPropTypeCDPropertyName;
	}
 
  //----------------------------------------------------------------------------------
  // property: displayNamePropertyName

  private String mDisplayNamePropertyName = "displayName";

  /**
   * Returns the display name property name
   *
   * @return the display name property name
   */

  public String getDisplayNamePropertyName()
  {
    return mDisplayNamePropertyName;
  }

  /**
   * Sets the display name property name
   *
   * @param pDisplayNamePropertyName the display name property name to set
   */

  public void setDisplayNamePropertyName (String pDisplayNamePropertyName)
  {
    mDisplayNamePropertyName = pDisplayNamePropertyName;
  }

  //----------------------------------------------------------------------------------
  // property: productClassNamePropertyName

  private String mProductClassNamePropertyName = "name";

  /**
   * Returns the product class name property name
   *
   * @return the product class name property name
   */

  public String getProductClassNamePropertyName()
  {
    return mProductClassNamePropertyName;
  }

  /**
   * Sets the product class name property name
   *
   * @param pProductClassNamePropertyName the product class name property name to set
   */

  public void setProductClassNamePropertyName (String pProductClassNamePropertyName)
  {
    mProductClassNamePropertyName = pProductClassNamePropertyName;
  }

  //----------------------------------------------------------------------------------
  // property: priceListIdPropertyName

  private String mPriceListIdPropertyName = "priceListId";

  /**
   * Returns the price list id property name
   *
   * @return the price list id property name
   */

  public String getPriceListIdPropertyName()
  {
    return mPriceListIdPropertyName;
  }

  /**
   * Sets the price list id property name
   *
   * @param pPriceListIdPropertyName the price list id property name to set
   */

  public void setPriceListIdPropertyName (String pPriceListIdPropertyName)
  {
    mPriceListIdPropertyName = pPriceListIdPropertyName;
  }

  //----------------------------------------------------------------------------------
  // property: productDefTypeCodePropertyName

  private String mProductDefTypeCodePropertyName = "productDefTypeCode";

  /**
   * Returns the product def type code property name
   *
   * @return the product def type code property name
   */

  public String getProductDefTypeCodePropertyName()
  {
    return mProductDefTypeCodePropertyName;
  }

  /**
   * Sets the product def type code property name
   *
   * @param pProductDefTypeCodePropertyName the product def type code property name to set
   */

  public void setProductDefTypeCodePropertyName (String pProductDefTypeCodePropertyName)
  {
    mProductDefTypeCodePropertyName = pProductDefTypeCodePropertyName;
  }

  //----------------------------------------------------------------------------------
  // property: productTypeCodePropertyName

  private String mProductTypeCodePropertyName = "productTypeCode";

  /**
   * Returns the product type code property name
   *
   * @return the product type code property name
   */

  public String getProductTypeCodePropertyName()
  {
    return mProductTypeCodePropertyName;
  }

  /**
   * Sets the product type code property name
   *
   * @param pProductTypeCodePropertyName the product type code property name to set
   */

  public void setProductTypeCodePropertyName (String pProductTypeCodePropertyName)
  {
    mProductTypeCodePropertyName = pProductTypeCodePropertyName;
  }

  //----------------------------------------------------------------------------------
  // property: productTypePropertyName

  private String mProductTypePropertyName = "siebelType";

  /**
   * Returns the product type property name
   *
   * @return the product type property name
   */

  public String getProductTypePropertyName()
  {
    return mProductTypePropertyName;
  }

  /**
   * Sets the product type property name
   *
   * @param pProductTypePropertyName the product type property name to set
   */

  public void setProductTypePropertyName (String pProductTypePropertyName)
  {
    mProductTypePropertyName = pProductTypePropertyName;
  }

  //----------------------------------------------------------------------------------
  // property: priceTypePropertyName

  private String mPriceTypePropertyName = "priceType";

  /**
   * Returns the price type property name
   *
   * @return the price type property name
   */

  public String getPriceTypePropertyName()
  {
    return mPriceTypePropertyName;
  }

  /**
   * Sets the price type property name
   *
   * @param pPriceTypePropertyName the price type property name to set
   */

  public void setPriceTypePropertyName (String pPriceTypePropertyName)
  {
    mPriceTypePropertyName = pPriceTypePropertyName;
  }

  //----------------------------------------------------------------------------------
  // property: attributesPropertyName

  private String mAttributesPropertyName = "configuredAttributes";

  /**
   * Returns the attributes property name
   *
   * @return the attributes property name
   */

  public String getAttributesPropertyName()
  {
    return mAttributesPropertyName;
  }

  /**
   * Sets the attributes property name
   *
   * @param pAttributesPropertyName the attributes property name to set
   */

  public void setAttributesPropertyName (String pAttributesPropertyName)
  {
    mAttributesPropertyName = pAttributesPropertyName;
  }

  //----------------------------------------------------------------------------------
  // property: attributeDefinitionPropertyName

  private String mAttributeDefinitionPropertyName = "attributeDefinition";

  /**
   * Returns the attribute definition property name
   *
   * @return the attribute definition property name
   */

  public String getAttributeDefinitionPropertyName()
  {
    return mAttributeDefinitionPropertyName;
  }

  /**
   * Sets the attribute definition property name
   *
   * @param pAttributeDefinitionPropertyName the attribute definition property name to set
   */

  public void setAttributeDefinitionPropertyName (String pAttributeDefinitionPropertyName)
  {
    mAttributeDefinitionPropertyName = pAttributeDefinitionPropertyName;
  }

  //----------------------------------------------------------------------------------
  // property: origIdPropertyName

  private String mOrigIdPropertyName = "origId";

  /**
   * Returns the orig id property name
   *
   * @return the orig id property name
   */

  public String getOrigIdPropertyName()
  {
    return mOrigIdPropertyName;
  }

  /**
   * Sets the orig id property name
   *
   * @param pOrigIdPropertyName the orig id property name to set
   */

  public void setOrigIdPropertyName (String pOrigIdPropertyName)
  {
    mOrigIdPropertyName = pOrigIdPropertyName;
  }

  //----------------------------------------------------------------------------------
  // property: attributeNamePropertyName

  private String mAttributeNamePropertyName = "attributeName";

  /**
   * Returns the attribute name property name
   *
   * @return the attribute name property name
   */

  public String getAttributeNamePropertyName()
  {
    return mAttributeNamePropertyName;
  }

  /**
   * Sets the attribute name property name
   *
   * @param pAttributeNamePropertyName the attribute name property name to set
   */

  public void setAttributeNamePropertyName (String pAttributeNamePropertyName)
  {
    mAttributeNamePropertyName = pAttributeNamePropertyName;
  }

  //----------------------------------------------------------------------------------
  // property: defaultValuePropertyName

  private String mDefaultValuePropertyName = "defaultValue";

  /**
   * Returns the default value property name
   *
   * @return the default value property name
   */

  public String getDefaultValuePropertyName()
  {
    return mDefaultValuePropertyName;
  }

  /**
   * Sets the default value property name
   *
   * @param pDefaultValuePropertyName the default value property name to set
   */

  public void setDefaultValuePropertyName (String pDefaultValuePropertyName)
  {
    mDefaultValuePropertyName = pDefaultValuePropertyName;
  }

  //----------------------------------------------------------------------------------
  // property: requiredFlagPropertyName

  private String mRequiredFlagPropertyName = "requiredFlag";

  /**
   * Returns the required flag property name
   *
   * @return the required flag property name
   */

  public String getRequiredFlagPropertyName()
  {
    return mRequiredFlagPropertyName;
  }

  /**
   * Sets the required flag property name
   *
   * @param pRequiredFlagPropertyName the required flag property name to set
   */

  public void setRequiredFlagPropertyName (String pRequiredFlagPropertyName)
  {
    mRequiredFlagPropertyName = pRequiredFlagPropertyName;
  }
  
  //----------------------------------------------------------------------------------
  // property: readOnlyFlagPropertyName

  private String mReadOnlyFlagPropertyName = "readOnlyFlag";

  /**
   * Returns the readOnly flag property name
   *
   * @return the readOnly flag property name
   */

  public String getReadOnlyFlagPropertyName()
  {
    return mReadOnlyFlagPropertyName;
  }

  /**
   * Sets the readOnly flag property name
   *
   * @param pReadOnlyFlagPropertyName the readOnly flag property name to set
   */

  public void setReadOnlyFlagPropertyName (String pReadOnlyFlagPropertyName)
  {
    mReadOnlyFlagPropertyName = pReadOnlyFlagPropertyName;
  }
  
  //----------------------------------------------------------------------------------
  // property: hiddenFlagPropertyName

  private String mHiddenFlagPropertyName = "hiddenFlag";

  /**
   * Returns the hidden flag property name
   *
   * @return the hidden flag property name
   */

  public String getHiddenFlagPropertyName()
  {
    return mHiddenFlagPropertyName;
  }

  /**
   * Sets the hidden flag property name
   *
   * @param pHiddenFlagPropertyName the hidden flag property name to set
   */

  public void setHiddenFlagPropertyName (String pHiddenFlagPropertyName)
  {
    mHiddenFlagPropertyName = pHiddenFlagPropertyName;
  }

  //----------------------------------------------------------------------------------
  // property: promotionStructurePropertyName

  private String mPromotionStructurePropertyName = "promotionStructure";

  /**
   * Returns the promotion structure property name
   *
   * @return the promotion structure property name
   */

  public String getPromotionStructurePropertyName()
  {
    return mPromotionStructurePropertyName;
  }

  /**
   * Sets the promotion structure property name
   *
   * @param pPromotionStructurePropertyName the promotion structure property name to set
   */

  public void setPromotionStructurePropertyName (String pPromotionStructurePropertyName)
  {
    mPromotionStructurePropertyName = pPromotionStructurePropertyName;
  }

  //----------------------------------------------------------------------------------
  // property: simpleBundleStructurePropertyName

  private String mSimpleBundleStructurePropertyName = "simpleBundleStructure";

  /**
   * Returns the simple bundle structure property name
   *
   * @return the simple bundle structure property name
   */

  public String getSimpleBundleStructurePropertyName()
  {
    return mSimpleBundleStructurePropertyName;
  }

  /**
   * Sets the simple bundle structure property name
   *
   * @param pSimpleBundleStructurePropertyName the simple bundle structure property name to set
   */

  public void setSimpleBundleStructurePropertyName (String pSimpleBundleStructurePropertyName)
  {
    mSimpleBundleStructurePropertyName = pSimpleBundleStructurePropertyName;
  }

  //----------------------------------------------------------------------------------
  // property: configurableProductStructurePropertyName

  private String mConfigurableProductStructurePropertyName = "configurableProductStructure";

  /**
   * Returns the configurable product structure property name
   *
   * @return the configurable product structure property name
   */

  public String getConfigurableProductStructurePropertyName()
  {
    return mConfigurableProductStructurePropertyName;
  }

  /**
   * Sets the configurable product structure property name
   *
   * @param pConfigurableProductStructurePropertyName the configurable product structure property name to set
   */

  public void setConfigurableProductStructurePropertyName (String pConfigurableProductStructurePropertyName)
  {
    mConfigurableProductStructurePropertyName = pConfigurableProductStructurePropertyName;
  }

  //----------------------------------------------------------------------------------
  // property: relationshipsPropertyName

  private String mRelationshipsPropertyName = "relationships";

  /**
   * Returns the relationships property name
   *
   * @return the relationships property name
   */

  public String getRelationshipsPropertyName()
  {
    return mRelationshipsPropertyName;
  }

  /**
   * Sets the relationships property name
   *
   * @param pRelationshipsPropertyName the relationships property name to set
   */

  public void setRelationshipsPropertyName (String pRelationshipsPropertyName)
  {
    mRelationshipsPropertyName = pRelationshipsPropertyName;
  }

  //----------------------------------------------------------------------------------
  // property: productPropertyName

  private String mProductPropertyName = "product";

  /**
   * Returns the product property name
   *
   * @return the product property name
   */

  public String getProductPropertyName()
  {
    return mProductPropertyName;
  }

  /**
   * Sets the product property name
   *
   * @param pProductPropertyName the product property name to set
   */

  public void setProductPropertyName (String pProductPropertyName)
  {
    mProductPropertyName = pProductPropertyName;
  }

  //----------------------------------------------------------------------------------
  // property: catProdProductPropertyName

  private String mCatProdProductPropertyName = "product";

  /**
   * Returns the category-product product property name
   *
   * @return the category-product product property name
   */

  public String getCatProdProductPropertyName()
  {
    return mCatProdProductPropertyName;
  }

  /**
   * Sets the category-product product property name
   *
   * @param pCatProdProductPropertyName the category-product product property name to set
   */

  public void setCatProdProductPropertyName (String pCatProdProductPropertyName)
  {
    mCatProdProductPropertyName = pCatProdProductPropertyName;
  }

  //----------------------------------------------------------------------------------
  // property: classNamePropertyName

  private String mClassNamePropertyName = "className";

  /**
   * Returns the class name property name
   *
   * @return the class name property name
   */

  public String getClassNamePropertyName()
  {
    return mClassNamePropertyName;
  }

  /**
   * Sets the class name property name
   *
   * @param pClassNamePropertyName the class name property name to set
   */

  public void setClassNamePropertyName (String pClassNamePropertyName)
  {
    mClassNamePropertyName = pClassNamePropertyName;
  }

  //----------------------------------------------------------------------------------
  // property: mMinimumQuantityPropertyName

  private String mMinimumQuantityPropertyName = "minimumQuantity";

  /**
   * Returns the minimum quantity property name
   *
   * @return the minimum quantity property name
   */

  public String getMinimumQuantityPropertyName()
  {
    return mMinimumQuantityPropertyName;
  }

  /**
   * Sets the minimum quantity property name
   *
   * @param pMinimumQuantityPropertyName the minimum cardinality property name to set
   */

  public void setMinimumQuantityPropertyName (String pMinimumQuantityPropertyName)
  {
	  mMinimumQuantityPropertyName = pMinimumQuantityPropertyName;
  }

  //----------------------------------------------------------------------------------
  // property: maximumQuantityPropertyName

  private String mMaximumQuantityPropertyName = "maximumQuantity";

  /**
   * Returns the maximum quanity property name
   *
   * @return the maximum quantity property name
   */

  public String getMaximumQuantityPropertyName()
  {
    return mMaximumQuantityPropertyName;
  }

  /**
   * Sets the maximum quantity property name
   *
   * @param pMaximumQuantityPropertyName the maximum quantity property name to set
   */

  public void setMaximumQuantityPropertyName (String pMaximumQuantityPropertyName)
  {
	  mMaximumQuantityPropertyName = pMaximumQuantityPropertyName;
  }

  //----------------------------------------------------------------------------------
  // property: maximumQuantityPropertyName

  private String mDefaultQuantityPropertyName = "defaultQuantity";

  /**
   * Returns the default quantity property name
   *
   * @return the default quantity property name
   */

  public String getDefaultQuantityPropertyName()
  {
    return mDefaultQuantityPropertyName;
  }

  /**
   * Sets the default quantity property name
   *
   * @param pDefaultQuantityPropertyName the default quantity property name to set
   */

  public void setDefaultQuantityPropertyName (String pDefaultQuantityPropertyName)
  {
	  mDefaultQuantityPropertyName = pDefaultQuantityPropertyName;
  }


  //----------------------------------------------------------------------------------
  // property: minimumCardinalityPropertyName

  private String mMinimumCardinalityPropertyName = "minimumCardinality";

  /**
   * Returns the minimum cardinality property name
   *
   * @return the minimum cardinality property name
   */

  public String getMinimumCardinalityPropertyName()
  {
    return mMinimumCardinalityPropertyName;
  }

  /**
   * Sets the minimum cardinality property name
   *
   * @param pMinimumCardinalityPropertyName the minimum cardinality property name to set
   */

  public void setMinimumCardinalityPropertyName (String pMinimumCardinalityPropertyName)
  {
    mMinimumCardinalityPropertyName = pMinimumCardinalityPropertyName;
  }

  //----------------------------------------------------------------------------------
  // property: maximumCardinalityPropertyName

  private String mMaximumCardinalityPropertyName = "maximumCardinality";

  /**
   * Returns the maximum cardinality property name
   *
   * @return the maximum cardinality property name
   */

  public String getMaximumCardinalityPropertyName()
  {
    return mMaximumCardinalityPropertyName;
  }

  /**
   * Sets the maximum cardinality property name
   *
   * @param pMaximumCardinalityPropertyName the maximum cardinality property name to set
   */

  public void setMaximumCardinalityPropertyName (String pMaximumCardinalityPropertyName)
  {
    mMaximumCardinalityPropertyName = pMaximumCardinalityPropertyName;
  }

  //----------------------------------------------------------------------------------
  // property: defaultCardinalityPropertyName

  private String mDefaultCardinalityPropertyName = "defaultCardinality";

  /**
   * Returns the default cardinality property name
   *
   * @return the default cardinality property name
   */

  public String getDefaultCardinalityPropertyName()
  {
    return mDefaultCardinalityPropertyName;
  }

  /**
   * Sets the default cardinality property name
   *
   * @param pDefaultCardinalityPropertyName the default cardinality property name to set
   */

  public void setDefaultCardinalityPropertyName (String pDefaultCardinalityPropertyName)
  {
    mDefaultCardinalityPropertyName = pDefaultCardinalityPropertyName;
  }
  
  
  //----------------------------------------------------------------------------------
  // property: maximumValuePropertyName

  private String mMaximumValuePropertyName = "maximumValue";

  /**
   * Returns the maximum value property name
   *
   * @return the maximum value property name
   */

  public String getMaximumValuePropertyName()
  {
    return mMaximumValuePropertyName;
  }

  /**
   * Sets the maximum value property name
   *
   * @param pMaximumValuePropertyName the maximum value property name to set
   */

  public void setMaximumValuePropertyName (String pMaximumValuePropertyName)
  {
    mMaximumValuePropertyName = pMaximumValuePropertyName;
  }
  
  //----------------------------------------------------------------------------------
  // property: minimumValuePropertyName

  private String mMinimumValuePropertyName = "minimumValue";

  /**
   * Returns the minimum value property name
   *
   * @return the minimum value property name
   */

  public String getMinimumValuePropertyName()
  {
    return mMinimumValuePropertyName;
  }

  /**
   * Sets the minimum value property name
   *
   * @param pMinimumValuePropertyName the minimum value property name to set
   */

  public void setMinimumValuePropertyName (String pMinimumValuePropertyName)
  {
    mMinimumValuePropertyName = pMinimumValuePropertyName;
  }
  
  
  //----------------------------------------------------------------------------------
  // property: aggregateDefaultProductsPropertyName

  private String mAggregateDefaultProducts = "aggregateDefaultProducts";  
  
  /**
   * 
   * @return
   */
  public String getAggregateDefaultProductsPropertyName()
  {
    return mAggregateDefaultProducts;
  }

  /**
   * 
   * @param pAggregateDefaultProducts
   */
  public void setAggregateDefaultProductsPropertyName(String pAggregateDefaultProducts)
  {
    mAggregateDefaultProducts = pAggregateDefaultProducts;
  }


  //----------------------------------------------------------------------------------
  // property: relationshipDomainsPropertyName

  private String mRelationshipDomains = "relationshipDomains";  
  
  /**
   * 
   * @return
   */
  public String getRelationshipDomainsPropertyName()
  {
    return mRelationshipDomains;
  }

  /**
   * 
   * @param pRelationshipDomains
   */
  public void setRelationshipDomainsPropertyName(String pRelationshipDomains)
  {
    mRelationshipDomains = pRelationshipDomains;
  }

  
  
  //----------------------------------------------------------------------------------
  // property: defaultProductPropertyName


  private String mDefaultProductPropertyName = "defaultProduct";

  /**
   * Returns the default product property name
   *
   * @return the default product property name
   */

  public String getDefaultProductPropertyName()
  {
    return mDefaultProductPropertyName;
  }

  /**
   * Sets the default product property name
   *
   * @param pDefaultProductPropertyName the default product property name to set
   */

  public void setDefaultProductPropertyName (String pDefaultProductPropertyName)
  {
    mDefaultProductPropertyName = pDefaultProductPropertyName;
  }

  //----------------------------------------------------------------------------------
  // property: siebelIdPropertyName


  private String mSiebelIdPropertyName = null;

  /**
   * Returns the siebel id property name
   *
   * @return the siebel id property name
   */

  public String getSiebelIdPropertyName()
  {
    return mSiebelIdPropertyName;
  }

  /**
   * Sets the siebel id property name
   *
   * @param pSiebelIdPropertyName the default product id property name to set
   */

  public void setSiebelIdPropertyName (String pSiebelIdPropertyName)
  {
    mSiebelIdPropertyName = pSiebelIdPropertyName;
  }

  //----------------------------------------------------------------------------------
  // property: configuredAttributesPropertyName

  private String mConfiguredAttributesPropertyName = "configuredAttributes";

  /**
   * Returns the configured attributes property name
   *
   * @return the configured attributes property name
   */

  public String getConfiguredAttributesPropertyName()
  {
    return mConfiguredAttributesPropertyName;
  }

  /**
   * Sets the configured attributes property name
   *
   * @param pConfiguredAttributesPropertyName the configured attributes property name to set
   */

  public void setConfiguredAttributesPropertyName (String pConfiguredAttributesPropertyName)
  {
    mConfiguredAttributesPropertyName = pConfiguredAttributesPropertyName;
  }

  //----------------------------------------------------------------------------------
  // property: displayValuePropertyName

  private String mDisplayValuePropertyName = "displayValue";

  /**
   * Returns the display value property name
   *
   * @return the display value property name
   */

  public String getDisplayValuePropertyName()
  {
    return mDisplayValuePropertyName;
  }

  /**
   * Sets the display value property name
   *
   * @param pDisplayValuePropertyName the display value property name to set
   */

  public void setDisplayValuePropertyName (String pDisplayValuePropertyName)
  {
    mDisplayValuePropertyName = pDisplayValuePropertyName;
  }

  //----------------------------------------------------------------------------------
  // property: attributeValuesPropertyName

  private String mAttributeValuesPropertyName = "values";

  /**
   * Returns the attribute values property name
   *
   * @return the attribute values property name
   */

  public String getAttributeValuesPropertyName()
  {
    return mAttributeValuesPropertyName;
  }

  /**
   * Sets the attribute values property name
   *
   * @param pAttributeValuesPropertyName the attribute values property name to set
   */

  public void setAttributeValuesPropertyName (String pAttributeValuesPropertyName)
  {
    mAttributeValuesPropertyName = pAttributeValuesPropertyName;
  }

  //----------------------------------------------------------------------------------
  // property: attributeValuePropertyName

  private String mAttributeValuePropertyName = "attributeValue";

  /**
   * Returns the attribute value property name
   *
   * @return the attribute value property name
   */

  public String getAttributeValuePropertyName()
  {
    return mAttributeValuePropertyName;
  }

  /**
   * Sets the attribute value property name
   *
   * @param pAttributeValuePropertyName the attribute value property name to set
   */

  public void setAttributeValuePropertyName (String pAttributeValuePropertyName)
  {
    mAttributeValuePropertyName = pAttributeValuePropertyName;
  }
  
  //----------------------------------------------------------------------------------
  // property: attributeValueTranslationsPropertyName

  private String mAttributeValueTranslationsPropertyName = "translations";

  /**
   * Returns the attribute value translations property name
   *
   * @return the attribute value translations property name
   */

  public String getAttributeValueTranslationsPropertyName()
  {
    return mAttributeValueTranslationsPropertyName;
  }

  /**
   * Sets the attribute value translations property name
   *
   * @param pAttributeValuePropertyName the attribute value 
   *        translations property name to set
   */

  public void setAttributeValueTranslationsPropertyName (
      String pAttributeValueTranslationsPropertyName)
  {
    mAttributeValueTranslationsPropertyName 
        = pAttributeValueTranslationsPropertyName;
  }
  
  //----------------------------------------------------------------------------------
  // property: translationLanguageCodePropertyName

  private String mTranslationLanguageCodePropertyName = "languageCode";

  /**
   * Returns the translation language code property name
   *
   * @return the translation language code property name
   */

  public String getTranslationLanguageCodePropertyName()
  {
    return mTranslationLanguageCodePropertyName;
  }

  /**
   * Sets the translation language code property name
   *
   * @param pTranslationLanguageCodePropertyName the 
   * translation language code property name to set
   */

  public void setTranslationLanguageCodePropertyName (
      String pTranslationLanguageCodePropertyName)
  {
    mTranslationLanguageCodePropertyName 
        = pTranslationLanguageCodePropertyName;
  }
  
  //----------------------------------------------------------------------------------
  // property: localePropertyName

  private String mLocalePropertyName = "locale";

  /**
   * Returns the locale property name
   *
   * @return the locale property name
   */

  public String getLocalePropertyName()
  {
    return mLocalePropertyName;
  }

  /**
   * Sets the locale property name
   *
   * @param locale property name
   */

  public void setLocalePropertyName (
      String pLocalePropertyName)
  {
    mLocalePropertyName = pLocalePropertyName;
  }
  
  //----------------------------------------------------------------------------------
  // property: translationDisplayNamePropertyName

  private String mTranslationDisplayNamePropertyName = "displayName";

  /**
   * Returns the translation display name property name
   *
   * @return the translation display name property name
   */

  public String getTranslationDisplayNamePropertyName()
  {
    return mTranslationDisplayNamePropertyName;
  }

  /**
   * Sets the translation display name property name
   *
   * @param pTranslationLanguageCodePropertyName the 
   * translation display name property name to set
   */

  public void setTranslationDisplayNamePropertyName (
      String pTranslationDisplayNamePropertyName)
  {
    mTranslationDisplayNamePropertyName 
        = pTranslationDisplayNamePropertyName;
  }
  
  //----------------------------------------------------------------------------------
  // property: attributeValuePropertyName

  private String mAttributeValueSequencePropertyName = "sequence";

  /**
   * Returns the attribute value sequence property name
   *
   * @return the attribute value property name
   */

  public String getAttributeValueSequencePropertyName()
  {
    return mAttributeValueSequencePropertyName;
  }

  /**
   * Sets the attribute value sequence property name
   *
   * @param pAttributeValuePropertyName the attribute value sequence property name to set
   */

  public void setAttributeValueSequencePropertyName (String pAttributeValueSequencePropertyName)
  {
    mAttributeValueSequencePropertyName = pAttributeValueSequencePropertyName;
  }
  
  //----------------------------------------------------------------------------------
  // property: attributeDomainTypePropertyName

  private String mAttributeDomainTypePropertyName = "domainType";

  /**
   * Returns the attribute domainType property name
   *
   * @return the attribute domainType property name
   */

  public String getAttributeDomainTypePropertyName()
  {
    return mAttributeDomainTypePropertyName;
  }

  /**
   * Sets the attribute domainType property name
   *
   * @param pAttributeDomainTypePropertyName the attribute domainType property name to set
   */

  public void setAttributeDomainTypePropertyName (String pAttributeDomainTypePropertyName)
  {
    mAttributeDomainTypePropertyName = pAttributeDomainTypePropertyName;
  }
  
  
  //----------------------------------------------------------------------------------
  // property: attributeDataTypePropertyName

  private String mAttributeDataTypePropertyName = "dataType";

  /**
   * Returns the attribute dataType property name
   *
   * @return the attribute dataType property name
   */

  public String getAttributeDataTypePropertyName()
  {
    return mAttributeDataTypePropertyName;
  }

  /**
   * Sets the attribute dataType property name
   *
   * @param pAttributeDataTypePropertyName the attribute dataType property name to set
   */

  public void setAttributeDataTypePropertyName (String pAttributeDataTypePropertyName)
  {
    mAttributeDataTypePropertyName = pAttributeDataTypePropertyName;
  }


  //----------------------------------------------------------------------------------
  // property: productLinesPropertyName

  private String mProductLinesPropertyName = "productLines";

  /**
   * Returns the product lines property name
   *
   * @return the product lines property name
   */

  public String getProductLinesPropertyName()
  {
    return mProductLinesPropertyName;
  }

  /**
   * Sets the product lines property name
   *
   * @param pProductLinesPropertyName the product lines property name to set
   */

  public void setProductLinesPropertyName (String pProductLinesPropertyName)
  {
    mProductLinesPropertyName = pProductLinesPropertyName;
  }

  //----------------------------------------------------------------------------------
  // property: relationshipTypePropertyName

  private String mRelationshipTypePropertyName = "type";

  /**
   * Returns the relationship type property name
   *
   * @return the relationship type property name
   */

  public String getRelationshipTypePropertyName()
  {
    return mRelationshipTypePropertyName;
  }

  /**
   * Sets the relationship type property name
   *
   * @param pRelationshipTypePropertyName the relationship type property name to set
   */

  public void setRelationshipTypePropertyName (String pRelationshipTypePropertyName)
  {
    mRelationshipTypePropertyName = pRelationshipTypePropertyName;
  }

  //----------------------------------------------------------------------------------
  // property: productLinePropertyName

  private String mProductLinePropertyName = "productLine";

  /**
   * Returns the product line property name
   *
   * @return the product line property name
   */

  public String getProductLinePropertyName()
  {
    return mProductLinePropertyName;
  }

  /**
   * Sets the product line property name
   *
   * @param pProductLinePropertyName the product line property name to set
   */

  public void setProductLinePropertyName (String pProductLinePropertyName)
  {
    mProductLinePropertyName = pProductLinePropertyName;
  }
  
  //----------------------------------------------------------------------------------
  // property: mEligAndCompPostPickMode input to eligibility and compatibility web service call

  private String mEligAndCompPostPickMode;
  
  /**
   * @return the mEligAndCompPostPickMode
   */
  public String getEligAndCompPostPickMode() {
    return mEligAndCompPostPickMode;
  }

  /**
   * @param pEligAndCompPostPickMode the mEligAndCompPostPickMode to set
   */
  public void setEligAndCompPostPickMode(String pEligAndCompPostPickMode) {
    this.mEligAndCompPostPickMode = pEligAndCompPostPickMode;
  }
  
  //----------------------------------------------------------------------------------
  // property: mEligAndCompPrePickMode input to eligibility and compatibility web service call

  private String mEligAndCompPrePickMode;
  
  /**
   * @return the mEligAndCompPrePickMode
   */
  public String getEligAndCompPrePickMode() {
    return mEligAndCompPrePickMode;
  }

  /**
   * @param pEligAndCompPrePickMode the mEligAndCompPrePickMode to set
   */
  public void setEligAndCompPrePickMode(String pEligAndCompPrePickMode) {
    this.mEligAndCompPrePickMode = pEligAndCompPrePickMode;
  }
  
  //----------------------------------------------------------------------------------
  // property: mEligAndCompPspMode input to eligibility and compatibility web service call

  private String mEligAndCompPspMode;
  
  /**
   * @return the mEligAndCompPspMode
   */
  public String getEligAndCompPspMode() {
    return mEligAndCompPspMode;
  }

  /**
   * @param mEligAndCompPspMode the mEligAndCompPspMode to set
   */
  public void setEligAndCompPspMode(String pEligAndCompPspMode) {
    this.mEligAndCompPspMode = pEligAndCompPspMode;
  }
 
  //----------------------------------------------------------------------------------
  // property: mEligibilityStatusNo property represents eliigibility status NO to eligibility and compatibility web service call

  private String mEligibilityStatusNo;
  
  /**
   * @return the mEligibilityStatusNo
   */
  public String getEligibilityStatusNo() {
    return mEligibilityStatusNo;
  }

  /**
   * @param pEligibilityStatusNo the mEligibilityStatusNo to set
   */
  public void setEligibilityStatusNo(String pEligibilityStatusNo) {
    this.mEligibilityStatusNo = pEligibilityStatusNo;
  }
  
  //----------------------------------------------------------------------------------
  // property: mEligibilityStatusYes property represents eliigibility status YES to eligibility and compatibility web service call

  private String mEligibilityStatusYes;
  
  /**
   * @return the mEligibilityStatusYes
   */
  public String getEligibilityStatusYes() {
    return mEligibilityStatusYes;
  }

  /**
   * @param pEligibilityStatusYes the mEligibilityStatusYes to set
   */
  public void setEligibilityStatusYes(String pEligibilityStatusYes) {
    this.mEligibilityStatusYes = pEligibilityStatusYes;
  }
  
  //----------------------------------------------------------------------------------
  // property: mInclusiveEligibilityNo property represents InclusiveEligibility status NO to eligibility and compatibility web service call

  private String mInclusiveEligibilityNo;
  
  /**
   * @return the mInclusiveEligibilityNo
   */
  public String getInclusiveEligibilityNo() {
    return mInclusiveEligibilityNo;
  }

  /**
   * @param pInclusiveEligibilityNo the mInclusiveEligibilityNo to set
   */
  public void setInclusiveEligibilityNo(String pInclusiveEligibilityNo) {
    this.mInclusiveEligibilityNo = pInclusiveEligibilityNo;
  }
  
  //----------------------------------------------------------------------------------
  // property: mInclusiveEligibilityYes property represents InclusiveEligibilityYes status NO to eligibility and compatibility web service call

  private String mInclusiveEligibilityYes;
  
  /**
   * @return the mInclusiveEligibilityYes
   */
  public String getInclusiveEligibilityYes() {
    return mInclusiveEligibilityYes;
  }

  /**
   * @param pInclusiveEligibilityYes the mInclusiveEligibilityYes to set
   */
  public void setInclusiveEligibilityYes(String pInclusiveEligibilityYes) {
    this.mInclusiveEligibilityYes = pInclusiveEligibilityYes;
  }
  
  //----------------------------------------------------------------------------------
  // property: mEligAndCompPropertyState property represents State input to eligibility and compatibility web service call

  private String mEligAndCompPropertyState;
  
  /**
   * @return the mEligAndCompPropertyState
   */
  public String getEligAndCompPropertyState() {
    return mEligAndCompPropertyState;
  }

  /**
   * @param pEligAndCompPropertyState the mEligAndCompPropertyState to set
   */
  public void setEligAndCompPropertyState(String pEligAndCompPropertyState) {
    this.mEligAndCompPropertyState = pEligAndCompPropertyState;
  }
  
  //----------------------------------------------------------------------------------
  // property: mEligAndCompPropertyCity property represents City input to eligibility and compatibility web service call

  private String mEligAndCompPropertyCity;
  
  /**
   * @return the mEligibilityCompatibilityPropertyCity
   */
  public String getEligAndCompPropertyCity() {
    return mEligAndCompPropertyCity;
  }

  /**
   * @param pEligAndCompPropertyCity the mEligAndCompPropertyCity to set
   */
  public void setEligAndCompPropertyCity(String pEligAndCompPropertyCity) {
    this.mEligAndCompPropertyCity = pEligAndCompPropertyCity;
  }
  
  //----------------------------------------------------------------------------------
  // property: mEligAndCompPropertyZip property represents ZIP input to eligibility and compatibility web service call

  private String mEligAndCompPropertyZip;
  
  /**
   * @return the mEligAndCompPropertyZip
   */
  public String getEligAndCompPropertyZip() {
    return mEligAndCompPropertyZip;
  }

  /**
   * @param pEligAndCompPropertyZip the mEligAndCompPropertyZip to set
   */
  public void setEligAndCompPropertyZip(String pEligAndCompPropertyZip) {
    this.mEligAndCompPropertyZip = pEligAndCompPropertyZip;
  }
  
  //----------------------------------------------------------------------------------
  // property: mProfilePropertyParentOrganization 
  private String mProfilePropertyParentOrganization;
  
  /**
   * @return the mProfilePropertyParentOrganization
   */
  public String getProfilePropertyParentOrganization() {
    return mProfilePropertyParentOrganization;
  }

  /**
   * @param pProfilePropertyParentOrganization the mProfilePropertyParentOrganization to set
   */
  public void setProfilePropertyParentOrganization(String pProfilePropertyParentOrganization) {
    this.mProfilePropertyParentOrganization = pProfilePropertyParentOrganization;
  }
 
  //----------------------------------------------------------------------------------
  // property: mProfilePropertyShippingAddress 
  private String mProfilePropertyShippingAddress;
  
  /**
   * @return the mProfilePropertyShippingAddress
   */
  public String getProfilePropertyShippingAddress() {
    return mProfilePropertyShippingAddress;
  }

  /**
   * @param pProfilePropertyShippingAddress the mProfilePropertyShippingAddress to set
   */
  public void setProfilePropertyShippingAddress(String pProfilePropertyShippingAddress) {
    this.mProfilePropertyShippingAddress = pProfilePropertyShippingAddress;
  }
  
  //----------------------------------------------------------------------------------
  // property: mProfilePropertyCity 
  private String mProfilePropertyCity;
  
  /**
   * @return the mProfilePropertyCity
   */
  public String getProfilePropertyCity() {
    return mProfilePropertyCity;
  }

  /**
   * @param pProfilePropertyCity the mProfilePropertyCity to set
   */
  public void setProfilePropertyCity(String pProfilePropertyCity) {
    this.mProfilePropertyCity = pProfilePropertyCity;
  }
  
  //----------------------------------------------------------------------------------
  // property: mProfilePropertyState 
  private String mProfilePropertyState;
  
  /**
   * @return the mProfilePropertyState
   */
  public String getProfilePropertyState() {
    return mProfilePropertyState;
  }

  /**
   * @param pProfilePropertyState the mProfilePropertyState to set
   */
  public void setProfilePropertyState(String pProfilePropertyState) {
    this.mProfilePropertyState = pProfilePropertyState;
  }
  
  //----------------------------------------------------------------------------------
  // property: mProfilePropertyPostalCode 
  private String mProfilePropertyPostalCode;
  
  /**
   * @return the mProfilePropertyPostalCode
   */
  public String getProfilePropertyPostalCode() {
    return mProfilePropertyPostalCode;
  }

  /**
   * @param pProfilePropertyPostalCode the mProfilePropertyPostalCode to set
   */
  public void setProfilePropertyPostalCode(String pProfilePropertyPostalCode) {
    this.mProfilePropertyPostalCode = pProfilePropertyPostalCode;
  }
  
  //----------------------------------------------------------------------------------
  // property: mProfilePropertySiebelAccountId 
  private String mProfilePropertySiebelAccountId;
  
  /**
   * @return the mProfilePropertySiebelAccountId
   */
  public String getProfilePropertySiebelAccountId() {
    return mProfilePropertySiebelAccountId;
  }

  /**
   * @param pProfileSiebelAccountId the mProfilePropertySiebelAccountId to set
   */
  public void setProfilePropertySiebelAccountId(String pProfilePropertySiebelAccountId) {
    this.mProfilePropertySiebelAccountId = pProfilePropertySiebelAccountId;
  }
  
  //----------------------------------------------------------------------------------
  // Methods
  //----------------------------------------------------------------------------------

  /**
   * getProductDetails
   *
   * This method returns details about the specified product. The details include the
   * product properties, any associated attributes and references to any child products.
   *
   * (Used by SiebelOrderTools and SiebelPurchaseProcessHelper)
   *
   * @param pProductId the id of the product whose details are to be returned.
   *
   * @return the product details
   */

  public SiebelCatalogProduct getProductDetails (String pProductId) throws RepositoryException, PropertyNotFoundException
  {
    SiebelCatalogProduct productDetails = null;
    
    // Get the base product details

    productDetails = getBaseProductDetails (pProductId);

    if (productDetails == null)
    {
      vlogInfo("productDetails is null for productId {0}", pProductId);
      return null;
    }
    
    return addProductRelationships(productDetails);
  }

  /**
   * getProductDetails
   *
   * This method returns details about the specified product. The details include the
   * product properties, any associated attributes and references to any child products.
   *
   * @param pProductDefinition the id of the product whose details are to be returned.
   *
   * @return the product details
   */
  public SiebelCatalogProduct getProductDetails (RepositoryItem pProductDefinition) throws RepositoryException, PropertyNotFoundException
  {
    SiebelCatalogProduct productDetails = null;
    
    // Get the base product details

    productDetails = getBaseProductDetails (pProductDefinition);

    if (productDetails == null)
    {
      vlogError("productDetails is null for productId {0}", pProductDefinition);
      return null;
    }
    
    return addProductRelationships(productDetails);
  }
  
  /*
   * Private helper method to add relationship details to the products
   */
  private SiebelCatalogProduct addProductRelationships(SiebelCatalogProduct pProduct) throws RepositoryException, PropertyNotFoundException 
  {
    // Check the product type and add the relationships

    if (pProduct.getProductType().equalsIgnoreCase (M_PROMOTION))
    {
      addPromotionChildRelationships (pProduct);
    }
    else if (pProduct.getProductType().equalsIgnoreCase(M_CONFIGURABLE_PRODUCT))
    {
      addConfigurableProductChildRelationships (pProduct);
    }
    else if (pProduct.getProductType().equalsIgnoreCase(M_SIMPLE_PRODUCT_BUNDLE))
    {
      addSimpleBundleChildRelationships (pProduct);
    }

    // Return the product details.
    
    return pProduct;
    
  }
  
  
  /**
   * getBaseProductDetails
   *
   * This method get the basic product properties and any associated attributes.
   *
   * (Only used by this class, not currently used by any other classes)
   *
   * @param pProductId the id of the product whose details are to be returned.
   *
   * @return the basic product details
   */

  public SiebelCatalogProduct getBaseProductDetails (String pProductId) throws RepositoryException, PropertyNotFoundException
  {
    RepositoryItem productDefinition = null;

    // Get the product definition from the repository.

    productDefinition = getProductDefinition(pProductId);

    if (productDefinition == null)
    {
      vlogInfo("productDefinition == null for productId {0}", pProductId);
      return null;
    }
      
    // Return the product details

    return getBaseProductDetails(productDefinition);
  }

  /**
   * getBaseProductDetails
   *
   * This method get the basic product properties and any associated attributes.
   *
   * @param pProductDefinition the repository definition of the product whose
   *        details are to be returned.
   *
   * @return the basic product details
   */
  private SiebelCatalogProduct getBaseProductDetails (RepositoryItem pProductDefinition) throws RepositoryException, PropertyNotFoundException
  {
    SiebelCatalogProduct productDetails = null;
  
    // Create the wrapper item.

    productDetails = new SiebelCatalogProduct();

    // Set the repository item

    productDetails.setProductRepositoryItem (pProductDefinition);

    // Populate the properties

    setProductProperties (productDetails);

    // Add any attributes from the product definition

    addProductAttributes (productDetails);

    return productDetails;
  }
  
  
  
  /**
   * getProductDefinition
   *
   * This method returns product definition
   *
   * @param pProductId the id of the product.
   *
   * @return the product definition repository item
   */

  protected RepositoryItem getProductDefinition (String pProductId) throws RepositoryException
  {
    if (pProductId == null)
    {
      return null;
    }
    RepositoryItem repoItem = getCatalog().getItem (pProductId, getBaseProductItemType());
    if(repoItem == null){
      String errorMsg = MessageFormat.format(sResourceBundle.getString(PRODUCT_NOT_FOUND_IN_CATALOG),pProductId);
      String str = MessageFormat.format(sResourceBundle.getString("uiNotFound"),pProductId);
      throw new RepositoryException(errorMsg);
    }
    return repoItem;
  }

  /**
   * Gets all products that are referred to by categories
   * 
   * @return a Set of SiebelCatalogProduct
   * @throws RepositoryException
   * @throws PropertyNotFoundException
   */
  public Set<SiebelCatalogProduct> getNavigableProducts () throws 
      RepositoryException, PropertyNotFoundException
  {  
    // get query builder

    RepositoryView catProdRepositoryView = getCatalog().getView (
        getCategoryProductItemDescriptor());
    QueryBuilder catProdQueryBuilder = catProdRepositoryView.getQueryBuilder();
    
    // execute query to get all category-product's

    Query allQuery = catProdQueryBuilder.createUnconstrainedQuery();    
    RepositoryItem[] categoryProducts = catProdRepositoryView.executeQuery(allQuery);
    
    // create container for navigable products
    
    Set<SiebelCatalogProduct> navigableProducts = new HashSet<SiebelCatalogProduct>();

    // check results
    
    if (categoryProducts == null || categoryProducts.length <= 0) 
    {
      vlogDebug("There are no Navigable Products in the ProductCatalog repository");
    }
    else
    {
      // loop through products, get details and add to the set

      for (RepositoryItem categoryProduct : categoryProducts) {
        RepositoryItem product = (RepositoryItem) DynamicBeans.getPropertyValue(categoryProduct, 
            getCatProdProductPropertyName());
        SiebelCatalogProduct scp = getProductDetails(product);
        navigableProducts.add(scp);
      }      
    }
    
    return navigableProducts;
  }
  
  
  /**
   * setProductProperties
   *
   * This method sets the product properties.
   *
   * @param pProductDetails the product details object
   */

  private void setProductProperties (SiebelCatalogProduct pProductDetails)
                 throws PropertyNotFoundException
  {
    Object object = null;
    RepositoryItem productDefinition = null;

    // Get the product definition.

    productDefinition = pProductDetails.getProductRepositoryItem();
    
    // Set the properties in the wrapper item.
    
  	object = DynamicBeans.getPropertyValue(productDefinition, getIdPropertyName());

  	if (object != null)
    {
  		pProductDetails.setId((String) object);
  	}

  	object = DynamicBeans.getPropertyValue (productDefinition, getInclusiveEligibilityFlagPropertyName());

  	if (object != null)
    {
  		pProductDetails.setInclusiveEligibilityFlag ((Boolean) object);
  	}

  	object = DynamicBeans.getPropertyValue (productDefinition, getEffectiveFromPropertyName());

  	if (object != null)
    {
  		pProductDetails.setEffectiveFrom ((Timestamp) object);
  	}

  	object = DynamicBeans.getPropertyValue (productDefinition, getEffectiveToPropertyName());

  	if (object != null)
    {
  		pProductDetails.setEffectiveTo((Timestamp) object);
  	}

  	object = DynamicBeans.getPropertyValue (productDefinition, getNamePropertyName());

    if (object != null)
    {
  		pProductDetails.setName((String) object);
  	}

    object = DynamicBeans.getPropertyValue (productDefinition, getPriceListIdPropertyName());

    if (object != null)
    {
  		pProductDetails.setPriceListId((String) object);
  	}

    object = DynamicBeans.getPropertyValue (productDefinition, getProductDefTypeCodePropertyName());

    if (object != null)
    {
  		pProductDetails.setProductDefTypeCode((String) object);
  	}

    object = DynamicBeans.getPropertyValue (productDefinition, getProductTypeCodePropertyName());

    if (object != null)
    {
  		pProductDetails.setProductTypeCode((String) object);
  	}

    object = DynamicBeans.getPropertyValue (productDefinition, getProductTypePropertyName());

    if (object instanceof String)
    {
  		pProductDetails.setProductType((String)object);
  	}

    object = DynamicBeans.getPropertyValue (productDefinition, getPriceTypePropertyName());

    if (object != null)
    {
  		pProductDetails.setPriceType((String) object);
  	}

    return;
  }

  /**
   * getProductAttributes
   *
   * This method looks for product attributes and if any are found it 
   * adds them to the product details object.
   *
   * @param pProductDetails the product details object
   * @throws RepositoryException
   */

  @SuppressWarnings("unchecked")
  private void addProductAttributes (SiebelCatalogProduct pProductDetails)
      throws PropertyNotFoundException, RepositoryException
  {

    // Get the product definition.

    RepositoryItem productDefinition = pProductDetails.getProductRepositoryItem();
    
    // Check for attributes

    Set<RepositoryItem> attributeItems = (Set<RepositoryItem>) DynamicBeans.
        getPropertyValue (productDefinition, getAttributesPropertyName());

    if ((attributeItems == null) || (attributeItems.size() <= 0))
    {
      vlogDebug("No Attributes exist for for Product {0}", pProductDetails.getId());
      return;
    }
    
    // Process the product attributes.

    for (RepositoryItem attributeItem : attributeItems)
    {
      // Add the attribute to the product wrapper.
      SiebelCatalogAttribute attribute = createSiebelCatalogAttribute(attributeItem);
      pProductDetails.addAttribute (attribute);
    }
      
    return;
  }

  
  
  /**
   * @param pAttributeItem
   * @return
   * @throws PropertyNotFoundException
   * @throws RepositoryException
   */
  public SiebelCatalogAttribute createSiebelCatalogAttribute(
      RepositoryItem pAttributeItem) throws PropertyNotFoundException, RepositoryException {

    vlogDebug("Entered createSiebelCatalogAttribute() : pAttributeItem == "
        +pAttributeItem.getRepositoryId());
    // Create the wrapper item and populate the values.
    SiebelCatalogAttribute attribute = new SiebelCatalogAttribute();

    attribute.setATGId((String) DynamicBeans.getPropertyValue (
        pAttributeItem, getIdPropertyName()));
    attribute.setOrigId((String) DynamicBeans.getPropertyValue (
        pAttributeItem, getOrigIdPropertyName()));
    attribute.setName ((String) DynamicBeans.getPropertyValue (
        pAttributeItem, getNamePropertyName()));
    attribute.setAttributeName((String) DynamicBeans.getPropertyValue(
        pAttributeItem, getAttributeNamePropertyName()));
    attribute.setDefaultValue((String) DynamicBeans.getPropertyValue(
        pAttributeItem, getDefaultValuePropertyName()));
    attribute.setRequiredFlag (((Boolean) DynamicBeans.getPropertyValue(
        pAttributeItem, getRequiredFlagPropertyName())));
    attribute.setReadonlyFlag(((Boolean) DynamicBeans.getPropertyValue(
        pAttributeItem, getReadOnlyFlagPropertyName())));
    attribute.setHiddenFlag(((Boolean) DynamicBeans.getPropertyValue(
        pAttributeItem, getHiddenFlagPropertyName())));

    String value = (String) DynamicBeans.getPropertyValue(
        pAttributeItem, getMaximumValuePropertyName());
    if (!StringUtils.isEmpty(value)) {
      try {
        attribute.setMaximumValue(value);
      } catch (NumberFormatException nfe) {        
      }
    }
    value = (String) DynamicBeans.getPropertyValue(
        pAttributeItem, getMinimumValuePropertyName());
    if (!StringUtils.isEmpty(value)) {
      try {
        attribute.setMinimumValue(value);
      } catch (NumberFormatException nfe) {        
      }
    }
    
    RepositoryItem baseAttribute = (RepositoryItem) DynamicBeans.getPropertyValue(
        pAttributeItem, getAttributeDefinitionPropertyName());
    
    if (baseAttribute != null) {
      
      attribute.setAttributeDefinitionId(baseAttribute.getRepositoryId());

      String domainType = (String) baseAttribute.getPropertyValue(
          getAttributeDomainTypePropertyName());
      attribute.setDomainType(domainType);
      
      String dataType = (String) baseAttribute.getPropertyValue(
          getAttributeDataTypePropertyName());
      attribute.setValueType(dataType);
      
      // If max/min values have not been set in the configured-attribute
      // then check the base attribute repository items in case defaults 
      // have been set there. 
      if (StringUtils.isEmpty(attribute.getMaximumValue())) {
        String rawValue = (String) DynamicBeans.getPropertyValue(
            baseAttribute, getMaximumValuePropertyName());
        if (!StringUtils.isEmpty(rawValue)) {
          try {
            attribute.setMaximumValue(rawValue);
          } catch (NumberFormatException nfe) {        
          }
        }
      }
      
      if (StringUtils.isEmpty(attribute.getMinimumValue())) {
        String rawValue = (String) DynamicBeans.getPropertyValue(
            baseAttribute, getMinimumValuePropertyName());
        if (!StringUtils.isEmpty(rawValue)) {
          try {
            attribute.setMinimumValue(rawValue);
          } catch (NumberFormatException nfe) {        
          }
        }
      }
      
      Set<RepositoryItem> attributeValueItems = (Set<RepositoryItem>)
          DynamicBeans.getPropertyValue(baseAttribute, 
              getAttributeValuesPropertyName());
      
      // Sorting the attributes using the repositoryItem's
      // "sequence" property
      if ((attributeValueItems != null) && (attributeValueItems.size() > 0))
      {    
        
        // We need to get the current locale in order to select the 
        // current user/system language code. We use this code
        // later in selecting the appropriate Translation repositoryItem
        // to use in converting the internal attribute value to its display value
        Locale locale = null;
        RepositoryItem profileItem = ServletUtil.getCurrentUserProfile();
        if (profileItem != null) {
          String localeString = (String) profileItem.getPropertyValue(
              getLocalePropertyName());
          if (!StringUtils.isEmpty(localeString)) {
            locale = new Locale(localeString);
          }
         
        }
        if (locale == null) {
          locale = ServletUtil.getUserLocale();
        }
        
        String defaultLanguageCode = "ENU";
        if (locale != null) {
          defaultLanguageCode = ISO_SIEBEL_LANGUAGE_CODE_MAP.get(locale.getLanguage());
        }
        
        // Use a TreeMap to sort the attribute values by sequence #
        SortedMap<Integer, String> sortedValueMap = new TreeMap<Integer, String>();  
        int nullSequenceKeyValue = NULL_ATTRIBUTE_SEQUENCE_INITIALISER;
        for (RepositoryItem attributeValueItem : attributeValueItems)
        {
          // Use the attribute value's sequence property value to 
          // apply ordering to the values
          Integer sequence = (Integer) DynamicBeans.getPropertyValue(
              attributeValueItem, getAttributeValueSequencePropertyName());
          
          // Get the display value using the current user/system
          // locale language code
          String displayValue = getAttributeValueDisplayValue(
              attributeValueItem, defaultLanguageCode);
          
          // For Enumerated integer values remove any commas - Siebel inserts these
          // as 1000 delimiters but in many cases the integer values are used to 
          // represent non-numeric values e.g. area codes etc
          if (attribute.getDomainType().equalsIgnoreCase(M_ATTRIBUTE_ENUMERATED_DOMAINTYPE)
              && attribute.getValueType().equalsIgnoreCase(M_ATTRIBUTE_INTEGER_VALUETYPE)) {
            displayValue = displayValue.replaceAll(",", "");
          }
          
          if (sequence != null) {
            sortedValueMap.put(sequence, displayValue);
          } else {
            // If the sequence property value is null then force
            // the value to the end of the sorted collection
            sortedValueMap.put(nullSequenceKeyValue++, displayValue);
          }
        }
    
        attribute.setAttributeValues(new ArrayList<String>(sortedValueMap.values()));
        // If default value of attribute is null, set the first value of sorted
        // map as default value
        if (attribute.getDefaultValue() == null) {
          attribute.setDefaultValue(sortedValueMap.get(1));
        }
      }
      
    }      
    vlogDebug("Leaving createSiebelCatalogAttribute() : attribute == "
        +attribute);
    return attribute;
  
  }
  
  

  /**
   * @param pAttributeValueItem
   * @param pLanguageCode
   * @return
   * @throws PropertyNotFoundException
   * @throws RepositoryException 
   */
  protected String getAttributeValueDisplayValue(
      RepositoryItem pAttributeValueItem, String pLanguageCode) 
          throws PropertyNotFoundException, RepositoryException {
    
    vlogDebug("Entered getAttributeValueDisplayValue() : pAttributeValueItem == {0}, pLanguageCode == {1}",
        pAttributeValueItem, pLanguageCode);
    if (pAttributeValueItem == null) {
      vlogError("Passed in pAttributeValueItem == null");
      throw new RepositoryException("Passed in pAttributeValueItem == null");
    }
    
    if (mAttributeValueDisplayValueLookup == null) {
      mAttributeValueDisplayValueLookup = new HashMap<String, Map<String, String>>();
    }
    
    Map<String, String> attributeValueMap = mAttributeValueDisplayValueLookup.get(
        pAttributeValueItem.getRepositoryId());
    if (attributeValueMap == null) {
      attributeValueMap = new HashMap<String, String>();   
      mAttributeValueDisplayValueLookup.put(
          pAttributeValueItem.getRepositoryId(), attributeValueMap);
    }
    
    String internalValue = (String) pAttributeValueItem.getPropertyValue(
        getAttributeValuePropertyName());   
    if (StringUtils.isEmpty(pLanguageCode)) {
      vlogWarning("Passed in pLanguageCode == null: returning internal value");
      return internalValue;
    }
    
    String displayValue = attributeValueMap.get(internalValue);
    
    if (displayValue == null) {
      @SuppressWarnings("unchecked")
      Set<RepositoryItem> attributeValueTranslations = (Set<RepositoryItem>) 
          pAttributeValueItem.getPropertyValue(getAttributeValueTranslationsPropertyName());
      if (attributeValueTranslations != null && !attributeValueTranslations.isEmpty()) {
        for (RepositoryItem translation : attributeValueTranslations) {
          String translationLanguageCode = (String) translation.getPropertyValue(
              getTranslationLanguageCodePropertyName());
          if (translationLanguageCode.equalsIgnoreCase(pLanguageCode)) {
            displayValue = (String) translation.getPropertyValue(
                getTranslationDisplayNamePropertyName());
            attributeValueMap.put(internalValue, displayValue);
            break;
          }
        }
      }
    }   
    
    if (displayValue == null) {
      displayValue = internalValue;
      attributeValueMap.put(internalValue, internalValue);
    }
    vlogDebug("Leaving getAttributeValueDisplayValue() : displayValue == {0}", displayValue);
    return displayValue;
  }

  /**
   * getPromotionChildRelationships
   *
   * This method looks for any child relationships on the promotion and returns
   * a collection of them.
   *
   * @param pProductDetails the product details object
   *
   * @return the set of child relationships
   */

  @SuppressWarnings({ "unchecked" })
  private void addPromotionChildRelationships (SiebelCatalogProduct pProductDetails)
      throws RepositoryException, PropertyNotFoundException
  {
    Set<SiebelCatalogRelationship> childRelationships = null;
    RepositoryItem productDefinition = null;
    RepositoryItem promotionStructure = null;
    Set<RepositoryItem> relationshipItems = null;
    SiebelCatalogRelationship childRelationship = null;
    Set<SiebelCatalogProduct> childProducts = null;

    // Initialise the child products array list.

    childRelationships = new HashSet<SiebelCatalogRelationship>();

    // Get the product definition.

    productDefinition = pProductDetails.getProductRepositoryItem();

    // Get the promotion structure.

    promotionStructure = (RepositoryItem) DynamicBeans.getPropertyValue
        (productDefinition, getPromotionStructurePropertyName());

  	if (promotionStructure == null)
    {
      vlogDebug("No Promotion Structure exists for product {0} (Id = {1}) where one was expected",
          pProductDetails.getName(), pProductDetails.getId());
  		return;
  	}

    // Get the relationships from the promotion structure

  	relationshipItems = (Set<RepositoryItem>)DynamicBeans.getPropertyValue (
  	    promotionStructure, getRelationshipsPropertyName());

    // Check for relationships

    if ((relationshipItems == null) || (relationshipItems.size() == 0))
    {
      vlogDebug("No Relationships exist for promotion structure {0}",
          promotionStructure.getRepositoryId());
      return; 
    }
    
    // Process the relationships
    
    for (RepositoryItem relationshipItem : relationshipItems)
    {
			// Create the relationship wrapper for the child product

			childRelationship = new SiebelCatalogRelationship();

			childRelationship.setParentProduct (pProductDetails);
			childRelationship.setRelationshipId (relationshipItem.getRepositoryId());
			childRelationship.setClassName((String) DynamicBeans.getPropertyValue(relationshipItem,
			    getClassNamePropertyName()));
			Object rawValue = DynamicBeans.getPropertyValue(
                relationshipItem, getMinimumQuantityPropertyName());
			if (rawValue instanceof Integer) {
			  childRelationship.setMinimumCardinality((Integer) rawValue);
			}
			rawValue = DynamicBeans.getPropertyValue(
                relationshipItem, getMaximumQuantityPropertyName());
            if (rawValue instanceof Integer) {
              childRelationship.setMaximumCardinality((Integer) rawValue);
            }
            rawValue = DynamicBeans.getPropertyValue(
                relationshipItem, getDefaultQuantityPropertyName());
            if (rawValue instanceof Integer) {
              childRelationship.setDefaultCardinality((Integer) rawValue);
            }
            childRelationship.setRelationshipType((String) DynamicBeans.getPropertyValue(
    				relationshipItem, getRelationshipTypePropertyName()));
			// At the moment we are not getting/storing the attributeOverrides from the
			// promotion-structure item-descriptor - this may cause issues so need to
			// watch out for this

      // Initialise the child products array list.
      
      childProducts = new HashSet<SiebelCatalogProduct>();

      // Check if the relationship type is an aggregate

      String relationshipType =  (String) DynamicBeans.getPropertyValue (relationshipItem, getRelationshipTypePropertyName());

      if (relationshipType.equalsIgnoreCase (M_PROMOTION_AGGREGATE_RELATIONSHIP))
      {
      	// Added code to set the aggregate default product information in the relationship, in case of promotion 
      	// relationships of type 'Aggregate'. This is required for displaying the default products on the product 
      	// details page.  
      	Set<RepositoryItem> aggDefaultProducts = (Set<RepositoryItem>) DynamicBeans.getPropertyValue (relationshipItem, getAggregateDefaultProductsPropertyName());
      	vlogDebug("Aggregate Default Products: " + aggDefaultProducts);
      	if (aggDefaultProducts != null && aggDefaultProducts.size() > 0) {
      		HashSet<String> defaultProds = new HashSet<String>(); 
      		for (RepositoryItem aggDefaultProduct : aggDefaultProducts) {
      		  RepositoryItem defaultProduct = (RepositoryItem) DynamicBeans.getPropertyValue (aggDefaultProduct, getProductPropertyName());

      		  if (defaultProduct != null) {
      			  vlogDebug("Aggregate Default Product Id: " + defaultProduct.getRepositoryId());
      			  defaultProds.add(defaultProduct.getRepositoryId());
      		  }
      		}
      		childRelationship.setAggDefaultProducts(defaultProds);
      	}
      	
        // Check if the aggregate is based on a product line
        
        RepositoryItem productLine = (RepositoryItem) DynamicBeans.getPropertyValue (relationshipItem, getProductLinePropertyName());

        if (productLine != null)
        {
          
          childRelationship.setProductLineId(productLine.getRepositoryId());
          childRelationship.setDisplayName((String)DynamicBeans.getPropertyValue(productLine, getProductClassNamePropertyName()));
          // Product line id has been specified. Get the list of products
          
          RepositoryItem[] productLineProducts = getProductLineProducts (productLine.getRepositoryId());
          
          for (RepositoryItem productLineProduct : productLineProducts)
          {
            SiebelCatalogProduct childProductDetails = getProductDetails (productLineProduct);
            childProductDetails.setParentRelationship(childRelationship);
            childProducts.add (childProductDetails);
          }
        }
        else
        {
          // Look for a class name.

          //RepositoryItem productClass = (RepositoryItem) DynamicBeans.getPropertyValue
          //    (relationshipItem, getClassPropertyName());

          String productClass = (String) DynamicBeans.getPropertyValue
                (relationshipItem, getClassNamePropertyName());
	
          if ((productClass != null))
          {
        	//Populate the class name as the displayName for the relationship
        	childRelationship.setDisplayName(productClass);
        	  
            // Class name has been specified. Get the list of products
        	  
            ArrayList<String> productClassProductIds = getProductClassProductIds (productClass);

            for (String productId : productClassProductIds)
            {
              SiebelCatalogProduct childProductDetails = getProductDetails (productId);
              childProductDetails.setParentRelationship(childRelationship);
              childProducts.add (childProductDetails);
            }
          }
        }

		    // Add child products to the relationship

        childRelationship.setChildProducts (childProducts);

        // add relationship to the relationships

        childRelationships.add (childRelationship);
      }
      else
      {
  			// Component relationship. Get the product

        RepositoryItem childProduct =  (RepositoryItem) DynamicBeans.getPropertyValue (relationshipItem, getProductPropertyName());

        if (childProduct != null)
        {
          // Get the FULL details for the child product

          SiebelCatalogProduct childProductDetails = getProductDetails (childProduct);

          if (childProductDetails != null)
          {
            childProducts.add (childProductDetails);
            childRelationship.setDisplayName(childProductDetails.getName());
          }
          else
          {
            vlogDebug("Unable to retrieve Child Product Details for product {0}", childProduct.getRepositoryId());
          }

          childRelationship.setChildProducts (childProducts);

          // add relationship to the relationships

          childRelationships.add (childRelationship);

          // If a productId has been processed skip the rest of the loop and process
          // the next relationship. There is an assumption here that if there is a
          // productId there are no aggregateDefaultProducts. All jobs files exported
          // so far from Siebel have followed this rule.

          continue;
        }
      }
    }
    
    pProductDetails.setChildRelationships (childRelationships);
  }

  /**
   * getConfigurableProductChildRelationships
   *
   * This method looks for any child relationships on the CP and a collection of them.
   *
   * @param pProductDetails the product details object
   *
   * @return the set of child relationships
   */

  @SuppressWarnings("unchecked")
  private void addConfigurableProductChildRelationships (SiebelCatalogProduct pProductDetails)
      throws RepositoryException, PropertyNotFoundException
  {
    Set<SiebelCatalogRelationship> childRelationships = null;
    RepositoryItem configurableProductStructure = null;
    RepositoryItem productDefinition = null;
    Set<RepositoryItem> relationshipItems = null;
    SiebelCatalogRelationship childRelationship = null;

    // Initialise the child products array list.

    childRelationships = new HashSet<SiebelCatalogRelationship>(); 
    
    // Get the product definition.

    productDefinition = pProductDetails.getProductRepositoryItem();

    // Get the configurable product structure.

    configurableProductStructure = (RepositoryItem) DynamicBeans.getPropertyValue 
        (productDefinition, getConfigurableProductStructurePropertyName());

    if (configurableProductStructure == null)
    {
      vlogDebug("No Configurable Product Structure exists for product {0} (Id = {1}) where one was expected",
          pProductDetails.getName(), pProductDetails.getId());
      return;
    }
    
    // Check for relationships
    
    relationshipItems = (Set<RepositoryItem>) DynamicBeans.getPropertyValue 
        (configurableProductStructure, getRelationshipsPropertyName());

    if ((relationshipItems == null) || (relationshipItems.size() <= 0))
    {
      vlogDebug("No Relationships exist for configurable product structure {0}",
          configurableProductStructure.getRepositoryId());
      return;
    }
    
    // Process the relationships

    for (RepositoryItem relationshipItem : relationshipItems)
    {

      // Create the relationship wrapper for the child product

      childRelationship = new SiebelCatalogRelationship();

      childRelationship.setParentProduct (pProductDetails);
      childRelationship.setRelationshipId (relationshipItem.getRepositoryId());
      childRelationship.setDisplayName((String) DynamicBeans.getPropertyValue
          (relationshipItem, getDisplayNamePropertyName()));
      childRelationship.setClassName ((String) DynamicBeans.getPropertyValue
          (relationshipItem, getClassNamePropertyName()));
      Object rawValue = DynamicBeans.getPropertyValue
          (relationshipItem, getMinimumCardinalityPropertyName());
      if (rawValue instanceof Integer) {
        childRelationship.setMinimumCardinality ((Integer) rawValue);
      }
      rawValue = DynamicBeans.getPropertyValue
          (relationshipItem, getMaximumCardinalityPropertyName());
      if (rawValue instanceof Integer) {
        childRelationship.setMaximumCardinality ((Integer) rawValue);
      }
      rawValue = DynamicBeans.getPropertyValue
          (relationshipItem, getDefaultCardinalityPropertyName());
      if (rawValue instanceof Integer) {
        childRelationship.setDefaultCardinality ((Integer) rawValue);
      }
      
      RepositoryItem defaultProduct = (RepositoryItem) DynamicBeans.getPropertyValue (
          relationshipItem, getDefaultProductPropertyName());
      if (defaultProduct != null)
      {
        childRelationship.setDefaultProductId(defaultProduct.getRepositoryId());
      }
      
      // At the moment we are not getting/storing the relationshipDecorations from the
      // configurable-product-structure item-descriptor - this may cause issues so need to
      // watch out for this
      
      // check for child products
      
      Set<RepositoryItem> relationshipDomains = (Set<RepositoryItem>)
          DynamicBeans.getPropertyValue (relationshipItem, 
          getRelationshipDomainsPropertyName());
        
      if (relationshipDomains == null || relationshipDomains.size() <= 0)
      {
        vlogDebug("No Relationship Domains exist for Relationship {0}",
            relationshipItem.getRepositoryId());
        continue;
      }
      
      Set<SiebelCatalogProduct> childProducts = new HashSet<SiebelCatalogProduct>();
      
      for (RepositoryItem relationshipDomain : relationshipDomains)
      {
        RepositoryItem childProduct = (RepositoryItem) DynamicBeans.getPropertyValue 
            (relationshipDomain, getProductPropertyName());
        
        if (childProduct == null)
        {
          vlogDebug("No child product for relationship domain {0}", relationshipDomain);                    
        } else {
	         
	        // Get the FULL details for the child product
	
	        SiebelCatalogProduct childProductDetails = getProductDetails (childProduct);
	        
	        if (childProductDetails != null)
	        {
	          childProducts.add(childProductDetails);   
	          childProductDetails.setParentRelationship(childRelationship);
	        }
	        else
	        {
	          vlogDebug("Unable to retrieve Child Product {0} from repository", childProduct);                    
	        }
        }
      }
      
      // Add child products to the relationship
      
      childRelationship.setChildProducts(childProducts);

      // add relationship to the relationships
      
      childRelationships.add(childRelationship);
    }
    
    pProductDetails.setChildRelationships(childRelationships);
      
  }

  /**
   * getSimpleBundleChildProducts
   *
   * This method looks for any child products on the simple bundle and adds them to the parent
   * product details.
   *
   * @param pProductDetails the product details object
   *
   * @return the list of child products
   */

  @SuppressWarnings("unchecked")
  private void addSimpleBundleChildRelationships (SiebelCatalogProduct pProductDetails)
      throws RepositoryException, PropertyNotFoundException
  {
    Set<SiebelCatalogRelationship> childRelationships = null;
    RepositoryItem simpleBundleStructure = null;
    RepositoryItem productDefinition = null;
    Set<RepositoryItem> relationshipItems = null;
    SiebelCatalogRelationship childRelationship = null;

    childRelationships = new HashSet<SiebelCatalogRelationship>();

    // Get the product definition.

    productDefinition = pProductDetails.getProductRepositoryItem();

    // Get the simple bundle structure.

    simpleBundleStructure = (RepositoryItem) DynamicBeans.getPropertyValue 
        (productDefinition, getSimpleBundleStructurePropertyName());
    
    if (simpleBundleStructure == null)
    {
      vlogDebug("No Simple Product Structure exists for product {0} (Id = {1}) where one was expected",
          pProductDetails.getName(), pProductDetails.getId());
      return;
    }
    
    // Get the relationships from the simple bundle structure and check

    relationshipItems = (Set<RepositoryItem>) DynamicBeans.getPropertyValue 
        (simpleBundleStructure, getRelationshipsPropertyName());

    if ((relationshipItems == null) || (relationshipItems.size() <= 0))
    {
      vlogDebug("No Relationships exist for simple product structure {0}",
          simpleBundleStructure.getRepositoryId());
      return;
    }
      // Process the relationships

    for (RepositoryItem relationshipItem : relationshipItems)
    {
      // Create the relationship wrapper for the child product

      childRelationship = new SiebelCatalogRelationship();

      childRelationship.setParentProduct (pProductDetails);
      childRelationship.setRelationshipId (relationshipItem.getRepositoryId());
      childRelationship.setDisplayName((String) DynamicBeans.getPropertyValue 
          (relationshipItem, getDisplayNamePropertyName()));
      childRelationship.setClassName ((String) DynamicBeans.getPropertyValue 
          (relationshipItem, getClassNamePropertyName()));
      Object rawValue = DynamicBeans.getPropertyValue(
          relationshipItem, getMinimumCardinalityPropertyName());
      if (rawValue instanceof Integer) {
        childRelationship.setMinimumCardinality ((Integer) rawValue);
      }
      rawValue = DynamicBeans.getPropertyValue(
          relationshipItem, getMaximumCardinalityPropertyName());
      if (rawValue instanceof Integer) {
        childRelationship.setMaximumCardinality ((Integer) rawValue);
      }
      rawValue = DynamicBeans.getPropertyValue(
          relationshipItem, getDefaultCardinalityPropertyName());
      if (rawValue instanceof Integer) {
        childRelationship.setDefaultCardinality ((Integer) rawValue);
      }
      
      RepositoryItem defaultProduct = (RepositoryItem) DynamicBeans.getPropertyValue (
          relationshipItem, getDefaultProductPropertyName());
      if (defaultProduct != null)
      {
        childRelationship.setDefaultProductId(defaultProduct.getRepositoryId());
      }

      // check for child products
      
      Set<RepositoryItem> relationshipDomains = (Set<RepositoryItem>)
          DynamicBeans.getPropertyValue (relationshipItem, 
          getRelationshipDomainsPropertyName());

      if (relationshipDomains == null || relationshipDomains.size() <= 0)
      {
        vlogDebug("No Relationship Domains exist for Relationship {0}",
            relationshipItem.getRepositoryId());
        continue;
      }
            
      Set<SiebelCatalogProduct> childProducts = new HashSet<SiebelCatalogProduct>();
      
      for (RepositoryItem relationshipDomain : relationshipDomains)
      {
        RepositoryItem childProduct = (RepositoryItem) DynamicBeans.getPropertyValue 
            (relationshipDomain, getProductPropertyName());
        
        if (childProduct == null)
        {
          vlogDebug("No child product for relationship domain {0}", relationshipDomain);                    
        }
         
        // Get the FULL details for the child product

        SiebelCatalogProduct childProductDetails = getProductDetails (childProduct);
        
        if (childProductDetails != null)
        {
          childProducts.add(childProductDetails);   
          childProductDetails.setParentRelationship(childRelationship);
        }
        else
        {
          vlogDebug("Unable to retrieve Child Product {0} from repository", childProduct);                    
        }
      }

      // Add child products to the relationship
      
      childRelationship.setChildProducts(childProducts);

      // add relationship to the relationships
      
      childRelationships.add(childRelationship);
    }
    
    pProductDetails.setChildRelationships(childRelationships);      
  }

  /**
   * getProductsForProductLine
   *
   * This method gets the base product details for each product that belongs to the given
   * product line.
   *
   * @param pProductLineId the id of the product line whose products are to be returned.
   *
   * @return the basic product details for the product line
   */

  public List<SiebelCatalogProduct> getProductsForProductLine (String pProductLineId) throws RepositoryException, PropertyNotFoundException
  {
    ArrayList<SiebelCatalogProduct> productLineProducts = new ArrayList<SiebelCatalogProduct>();
    RepositoryItem[] products = null;
    SiebelCatalogProduct productDetails = null;

    products = getProductLineProducts (pProductLineId);
    
    for (RepositoryItem product : products)
    {      
      // Get the base product details
  
      productDetails = getBaseProductDetails (product);

      // Add the details to the array list

      productLineProducts.add (productDetails);
    }
    
    return productLineProducts;
  }

  /**
   * getProductsForProductClass
   *
   * This method gets the base product details for each product that belongs to the given
   * product class.
   *
   * @param pClassName the name of the class whose products are to be returned.
   *
   * @return the basic product details for the product class
   */

  public List<SiebelCatalogProduct> getProductsForProductClass (String pClassName) throws RepositoryException, PropertyNotFoundException
  {
    ArrayList<SiebelCatalogProduct> classProducts = new ArrayList<SiebelCatalogProduct>();
    ArrayList<String> productIds = null;
    SiebelCatalogProduct productDetails = null;

    productIds = getProductClassProductIds (pClassName);

    for (int index = 0; index < productIds.size(); index++)
    {
      // Get the base product details

      productDetails = getBaseProductDetails (productIds.get(index));

      // Add the details to the array list

      classProducts.add (productDetails);
    }

    return classProducts;
  }

  /**
   * getProductLineProductIds
   *
   * This method gets the product id for each product that belongs to the given product line.
   *
   * @param pProductLineId the product line id.
   *
   * @return the repository definitions of the products that belong to the product line.
   */

  private RepositoryItem[] getProductLineProducts (String pProductLineId) throws RepositoryException
  {
    // Query for products whose productLines collection include the given product line id.

    RepositoryView productRepositoryView = getCatalog().getView (getBaseProductItemType());
    QueryBuilder productQueryBuilder = productRepositoryView.getQueryBuilder();
    
    // Build query
    
    QueryExpression productLines = productQueryBuilder.createPropertyQueryExpression (getProductLinesPropertyName());
    QueryExpression productProductLine = productQueryBuilder.createConstantQueryExpression (pProductLineId);
    Query productLineQuery = productQueryBuilder.createIncludesQuery (productLines, productProductLine);

    // Execute query
    
    RepositoryItem[] products = productRepositoryView.executeQuery (productLineQuery);
    
    // return the products
    
    return products;
  }

  /**
   * getProductClassProductIds
   *
   * This method gets the product id for each product that belongs to the given product class.
   *
   * @param pClassName the product class name.
   *
   * @return the product ids of the products that belong to the product class.
   */

  private ArrayList<String> getProductClassProductIds (String pClassName) throws RepositoryException, PropertyNotFoundException
  {
    // Query for class id matching the class name specified

    RepositoryView productClassRepositoryView = getCatalog().getView (getProductClassItemDescriptor());
    QueryBuilder productClassQueryBuilder = productClassRepositoryView.getQueryBuilder();
    
    // Build query

    Query productClassQuery = productClassQueryBuilder.createComparisonQuery(
        productClassQueryBuilder.createConstantQueryExpression (pClassName),
        productClassQueryBuilder.createPropertyQueryExpression (getProductClassNamePropertyName()),
        QueryBuilder.EQUALS);

    // Execute query

    RepositoryItem[] productClassItems = productClassRepositoryView.executeQuery (productClassQuery);

    // Get the class id from the repository item

    if ((productClassItems == null) || (productClassItems.length == 0))
    {
      throw new RepositoryException ("No class found with the class name provided");
    }
    
    return getProductClassProductIds(productClassItems[0]);
  }
    
  /**
   * getProductClassProductIds
   *
   * This method gets the product id for each product that belongs to the given product class.
   *
   * @param pProductClass the product class.
   *
   * @return the product ids of the products that belong to the product class.
   */
  private ArrayList<String> getProductClassProductIds (RepositoryItem pProductClass) throws RepositoryException, PropertyNotFoundException
  {
    ArrayList<String> productClassProductIds = new ArrayList<String>();
    
    // Query for products whose class id matches up with the class id retrieved.

    RepositoryView productRepositoryView = getCatalog().getView (getBaseProductItemType());
    QueryBuilder productQueryBuilder = productRepositoryView.getQueryBuilder();

    // Build query

    Query productClassProductsQuery = productQueryBuilder.createComparisonQuery(
        productQueryBuilder.createConstantQueryExpression (pProductClass),
        productQueryBuilder.createPropertyQueryExpression (getClassPropertyName()),
        QueryBuilder.EQUALS);

    // Execute query

    RepositoryItem[] products = productRepositoryView.executeQuery (productClassProductsQuery);

    // Add the product ids to the array list.

    for (int index = 0; index < products.length; index++)
    {
      productClassProductIds.add (products[index].getRepositoryId());
    }

    // Return the array of product ids.

    return productClassProductIds;
  }

  
  /**
   * Empties the cache of values
   */
  public void clearAttributeValueDisplayValueLookup() {
    if (mAttributeValueDisplayValueLookup != null) {
      mAttributeValueDisplayValueLookup.clear();
    }
  }
  
  
  /**
   * Empties the cache of values
   */
  public void printAttributeValueDisplayValueLookupToDebugLog() {
    if (mAttributeValueDisplayValueLookup != null) {
      for (Entry<String, Map<String, String>> entry : mAttributeValueDisplayValueLookup.entrySet()) {
        vlogDebug("=======================");
        vlogDebug("Attribute = {0}",entry.getKey());
        Map<String, String> values = entry.getValue();
        for (Entry<String, String> attValues : values.entrySet()) {
          vlogDebug("Attribute name = {0}", attValues.getKey());
          vlogDebug("Attribute value = {0}", attValues.getValue());
        }
        vlogDebug("=======================");
      }
    }
  }
  
  
  
  


  /**
   * The method checks the eligibility of products against the profile(available in session)/state/city/postal-code
   * Here Shipping address(state/city/postal-code) is Profile's Shipping Address
   * and returns a map of non eligible products (key) with reason (value) 
   * @param pProductIds
   * @return
   * @throws RepositoryException
   */
  public Map<String, String> checkProductEligibility(List<String> pProductIds) throws RepositoryException
  {
    // get the profile for the logged in user
    
    RepositoryItem profile = ServletUtil.getCurrentUserProfile();

    if (profile == null)
    {
      // TODO throw an exception here
    }
    
    Quote quote = new Quote();
    if (profile != null && !(profile.isTransient())) {
      updateQuoteWithProfileDetails(quote, profile);
    }
        
    CheckQuoteEligibilityCompatibilityInput input = 
        constructEligibilityCompatabilityInput(quote, pProductIds, getEligAndCompPrePickMode());
        
    return callEligibilityCompatabilityWebService(input);
  }

  /**
   *The method checks the eligibility of products against the profile(created using the profileId)/state/city/postal-code 
   *Here Shipping address(state/city/postal-code) is Profile's Shipping Address
   * and returns a map of non eligible products (key) with reason (value)
   * @param pProfileId
   * @param pProductIds
   * @return
   * @throws RepositoryException
   */
  public Map<String, String> checkProductEligibility(String pProfileId, 
      List<String> pProductIds) throws RepositoryException
  {
    // get the user item from the repository 
    
    RepositoryItem user = getSiebelAccountTools().getSiebelAccountRepository().getItem(
        pProfileId, getSiebelAccountTools().getUserItemDescriptorName());
    

    Quote quote = new Quote();
    if(user != null){
      updateQuoteWithProfileDetails(quote, user);
    }
        
    CheckQuoteEligibilityCompatibilityInput input = 
        constructEligibilityCompatabilityInput(quote, pProductIds, getEligAndCompPrePickMode());
        
    return callEligibilityCompatabilityWebService(input);
  }
  

  /**
   * Where the profile is anonymous a map of name-value pairs can be taken to check the
   * eligibility of products.
   * The method checks the eligibility of products against the state/city/postal-code passed in pUserProperties
   * and returns a map of non eligible products (key) with reason (value)  
   * @param pProfileProperties name-value map of attributes to check for eligibility 
   * @param pProductIds
   * @return
   * @throws RepositoryException
   */
  public Map<String, String> checkProductEligibility(Map<String,String> pUserProperties,
      List<String> pProductIds) throws RepositoryException
  {
    if (pUserProperties == null)
    {
      throw new NullPointerException();
    }
    
    // start off by supporting simple things like state, city, zip. This could then be easily extended

    Quote quote = new Quote();

    // Need to check the userProperties for city, zip and state
    // Also possibly need to check if IP address is set we may be able to determine
    // city, state, zip code from this.
    // Don't know if 'AccountShipTo' are the right properties to set, they seem the most logical
    if (pUserProperties.containsKey(getEligAndCompPropertyCity()))
    {
      quote.setShippingCity(pUserProperties.get(getEligAndCompPropertyCity()));
    }
    if (pUserProperties.containsKey(getEligAndCompPropertyState()))
    {
      quote.setShippingState(pUserProperties.get(getEligAndCompPropertyState()));
    }
    if (pUserProperties.containsKey(getEligAndCompPropertyZip()))
    {
      quote.setShippingPostalCode(pUserProperties.get(getEligAndCompPropertyZip()));
    }
        
    CheckQuoteEligibilityCompatibilityInput input = 
        constructEligibilityCompatabilityInput(quote, pProductIds, getEligAndCompPrePickMode());
        
    return callEligibilityCompatabilityWebService(input);
  }
  
  /**
   * The method checks the eligibility of products against the profile(available in session)/state/city/postal-code,
   * Here Shipping address(state/city/postal-code) is Profile's Shipping Address
   * the method checks the compatibility of products 
   * and returns a map of non eligible products (key) with reason (value) 
   * @param pProductIds
   * @return
   * @throws RepositoryException
   */
  public Map<String, String> checkProductEligibilityCompatability(List<String> pProductIds) throws RepositoryException
  {
    // get the profile for the logged in user
    // TODO This call seems to be returning null at the moment. Not sure why this is 
    RepositoryItem profile = ServletUtil.getCurrentUserProfile();
    
    if (profile == null)
    {
      // TODO throw an exception here
    }
    
    Quote quote = new Quote();

    if (profile != null && !(profile.isTransient())) {
      updateQuoteWithProfileDetails(quote, profile);
    }
        
    CheckQuoteEligibilityCompatibilityInput input = 
        constructEligibilityCompatabilityInput(quote, pProductIds, getEligAndCompPostPickMode());
        
    return callEligibilityCompatabilityWebService(input);
  }
  
  
  /**
   * takes a 
   * The method checks the eligibility of products against the profile(created using profileId)/state/city/postal-code
   * Here Shipping address(state/city/postal-code) is Profile's Shipping Address
   * the method checks the compatibility of products
   * and returns a map of non eligible products (key) with reason (value) 
   * @param pProfileId
   * @param pProductIds
   * @return
   * @throws RepositoryException
   */
  public Map<String, String> checkProductEligibilityCompatability(String pProfileId, 
      List<String> pProductIds) throws RepositoryException
  {
    // get the user item from the repository 
    
    RepositoryItem user = getSiebelAccountTools().getSiebelAccountRepository().getItem(
        pProfileId, getSiebelAccountTools().getUserItemDescriptorName());

    Quote quote = new Quote();

    if(user != null){
      updateQuoteWithProfileDetails(quote, user);
    }
        
    CheckQuoteEligibilityCompatibilityInput input = 
        constructEligibilityCompatabilityInput(quote, pProductIds, getEligAndCompPostPickMode());
        
    return callEligibilityCompatabilityWebService(input);
  }
  
  /**
   * 
   * This method expects the quote to already have user profile info set. It will
   * set the id and list of quote item for the quote.
   * 
   * @param pQuote - the quote with user profile info pre populated
   * @param pProductIds
   * @param pPickMode
   * @return
   * @throws RepositoryException
   */
  protected CheckQuoteEligibilityCompatibilityInput constructEligibilityCompatabilityInput(
      Quote pQuote, List<String> pProductIds, String pPickMode) throws RepositoryException
  {
    // Populate the quote with required info
    
    pQuote.setListOfQuoteItem(generateListOfQuoteItem(pProductIds, pQuote.getAccountId()));
    Random rand = new Random();
    pQuote.setId(Integer.toString(rand.nextInt(500000000)));
    
    // Prepare input for CheckQuoteEligibilityCompatibility

    CheckQuoteEligibilityCompatibilityInput input = 
        new CheckQuoteEligibilityCompatibilityInput();
    input.setPickMode(pPickMode);
    input.setPSPMode(getEligAndCompPspMode());
    
    // add the quote to list of quotes
    
    ListOfQuote listQuote = new ListOfQuote();
    listQuote.getQuote().add(pQuote);
    input.setListOfQuote(listQuote);
            
    // set empty list of asset as it is a required field
    // (check if this is actually a required field ???? )
    
    input.setListOfAsset(new ListOfAsset());
    
    return input;
  }
  
  /**
   * Constructs a quote item from the product id
   * 
   * (Need to check if product line id and inclusive eligibility flag are
   * actually required)
   * 
   * @param pProductId product id to generate quote item for
   * @return the generated quote item
   * @throws RepositoryException
   */
  protected ListOfQuoteItem generateListOfQuoteItem(List<String> pProductIds, String pAccountId) throws RepositoryException
  {
    Random rand = new Random();

    ListOfQuoteItem listOfQuoteItem = new ListOfQuoteItem();
    
    // loop through products generating quoteItem's
    
    for (String productId : pProductIds)
    {    
      // create new quote item and populate id and product id
      
      QuoteItem quoteItem = new QuoteItem();
      quoteItem.setProductId(productId);
      quoteItem.setId(Integer.toString(rand.nextInt(500000000)));
      
      // get product definition so product line and inclusive eligibility flag 
      // properties can be retrieved
      
      RepositoryItem product = getProductDefinition(productId);

      
      Boolean inclusiveEligibility = (Boolean) product.getPropertyValue(
          getInclusiveEligibilityFlagPropertyName());
      String inclusiveEligibilityFlag = null;
      if (inclusiveEligibility != null) {
          inclusiveEligibilityFlag = 
              inclusiveEligibility ? getInclusiveEligibilityYes() : getInclusiveEligibilityNo();
      }
  
      if (isLoggingDebug()) {
          logDebug("For product id: [" + quoteItem.getProductId() + "] productline ["
              +  "] " + "inclusive eligibility [" +
              inclusiveEligibilityFlag + "] ");
      }
  
      // set product line and inclusive eligibility flag properties on quote item
      
      
      quoteItem.setInclusiveEligibilityFlag(inclusiveEligibilityFlag);
      
      if (pAccountId != null) {
        quoteItem.setAccountId(pAccountId);
      }
      
      // add quote item to list of quote item

      listOfQuoteItem.getQuoteItem().add(quoteItem);
    }
    
    return listOfQuoteItem;
  }

  /**
   * 
   * @param pInput
   * @return
   */
  protected Map<String, String> callEligibilityCompatabilityWebService(
      CheckQuoteEligibilityCompatibilityInput pInput)
  {
    //EligibilityCompatibility service = new EligibilityCompatibility();
    //CheckQuoteEligibilityCompatibilityPort port = service
    //        .getCheckQuoteEligibilityCompatibilityPort();
    //getWebServiceHelper().prepareConnection((BindingProvider) port);




    //CheckQuoteEligibilityCompatibilityOutput output =
    //    port.checkQuoteEligibilityCompatibility(pInput);


    CheckQuoteEligibilityCompatibilityOutput output = null;
    try {
      output = (CheckQuoteEligibilityCompatibilityOutput)getWebServiceController().callWebService(
              "com.siebel.ordermanagement.quote.psp.EligibilityCompatibility",
              "CheckQuoteEligibilityCompatibilityPort",
              "checkQuoteEligibilityCompatibility",
              pInput,
              this,
              getWebServiceHelper());
    } catch (ResourcePoolException e) {
      if(isLoggingError())
        logError(e);
    } catch (NoSuchMethodException e) {
      if(isLoggingError())
        logError(e);
    } catch (InvocationTargetException e) {
      if(isLoggingError())
        logError(e);
    } catch (IllegalAccessException e) {
      if(isLoggingError())
        logError(e);
    } catch (SiebelWebServiceConfigurationException e) {
      if(isLoggingError())
        logError(e);
    }

    List<QuoteItem> outputQuoteItems = output.getListOfQuote().getQuote().get(0)
        .getListOfQuoteItem().getQuoteItem();
    
    Map<String, String> ineligibleProducts = new HashMap<String, String>();
    
    for (QuoteItem quoteItem : outputQuoteItems) {
      if (quoteItem.getEligibilityStatus() != null && 
          quoteItem.getEligibilityStatus().equalsIgnoreCase(getEligibilityStatusNo()))
      {
        ineligibleProducts.put(quoteItem.getProductId(), quoteItem.getEligibilityReason());
      }
    }
    
    return ineligibleProducts;
  }
  
 /**
  * method to set profile properties city,state,accountId,zip to the quote 
  * @param quote
  * @param profile 
  */
 private void updateQuoteWithProfileDetails(Quote quote, RepositoryItem profile){
   
   RepositoryItem parentOrganizationOfProfile = null;
   RepositoryItem defaultShippingAddressOfProfile = null;
   
   quote.setAccountId((String)profile.getPropertyValue(getProfilePropertySiebelAccountId()));
   parentOrganizationOfProfile = (RepositoryItem) profile
       .getPropertyValue(getProfilePropertyParentOrganization());
   defaultShippingAddressOfProfile = (RepositoryItem) parentOrganizationOfProfile
       .getPropertyValue(getProfilePropertyShippingAddress());
   if (defaultShippingAddressOfProfile != null) {
     if (defaultShippingAddressOfProfile
         .getPropertyValue(getProfilePropertyCity()) != null) {
       quote.setShippingCity((String) defaultShippingAddressOfProfile
           .getPropertyValue(getProfilePropertyCity()));
     }
     if (defaultShippingAddressOfProfile
         .getPropertyValue(getProfilePropertyState()) != null) {
       quote.setShippingState((String) defaultShippingAddressOfProfile
           .getPropertyValue(getProfilePropertyState()));
     }
     if (defaultShippingAddressOfProfile
         .getPropertyValue(getProfilePropertyPostalCode()) != null) {
       quote.setShippingPostalCode((String) defaultShippingAddressOfProfile
           .getPropertyValue(getProfilePropertyPostalCode()));
     }
   
  }
 }   
  
    
}
