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


package atg.siebel.configurator.attribute;

import java.util.LinkedHashMap;
import java.util.Map;

import atg.core.util.StringUtils;
import atg.nucleus.GenericService;
import atg.siebel.catalog.SiebelCatalogAttribute;

import com.siebel.ordermanagement.configurator.cfginteractdata.AttributeValue;


/**
 * Factory class for creating Attribute objects
 *
 * @author bbrady
 * @version $Id: //product/Siebel/version/11.2/src/atg/siebel/configurator/attribute/AttributeFactory.java#2 $$Change: 1194813 $
 * @updated $DateTime: 2015/09/10 08:26:24 $$Author: saysyed $
 */
public class AttributeFactory extends GenericService {
  
 
  //-------------------------------------
  // Constants
  //-------------------------------------
  /** Class version string */
  public static final String CLASS_VERSION = "$Id: //product/Siebel/version/11.2/src/atg/siebel/configurator/attribute/AttributeFactory.java#2 $$Change: 1194813 $";
  public static final String EMPTY_STRING = "";
  public static final String ENUMERATED_ATTRIBUTE_DOMAINTYPE = "ENUMERATED";

  //-------------------------------------
  // Member variables
  //-------------------------------------
  
  
  //-------------------------------------
  // Properties
  //-------------------------------------

  //-------------------------------------
  // property: integerType
  private String mIntegerType = "Integer";  
  public String getIntegerType() {
    return mIntegerType;
  }
  public void setIntegerType(String pIntegerType) {
    mIntegerType = pIntegerType;
  }
  
  //-------------------------------------
  // property: stringType
  private String mStringType = "Text";
  public String getStringType() {
    return mStringType;
  }
  public void setStringType(String pStringType) {
    mStringType = pStringType;
  }

  //-------------------------------------
  // property: booleanType
  private String mBooleanType = "Boolean";
  public String getBooleanType() {
    return mBooleanType;
  }
  public void setBooleanType(String pBooleanType) {
    mBooleanType = pBooleanType;
  }
  
  //-------------------------------------
  // property: numberType
  private String mNumberType = "Number";
  public String getNumberType() {
    return mNumberType;
  }
  public void setNumberType(String pNumberType) {
    mNumberType = pNumberType;
  }
  
  //-------------------------------------
  // property: dateType
  private String mDateType = "Date";
  public String getDateType() {
    return mDateType;
  }
  public void setDateType(String pDateType) {
    mDateType = pDateType;
  }

  //-------------------------------------
  // property: attributeDefinitionIdPropertyName
  private String mAttributeDefinitionIdPropertyName = "attributeDefinitionId";  
  public String getAttributeDefinitionIdPropertyName() {
    return mAttributeDefinitionIdPropertyName;
  }
  public void setAttributeDefinitionIdPropertyName(
      String pAttributeDefinitionIdPropertyName) {
    mAttributeDefinitionIdPropertyName = pAttributeDefinitionIdPropertyName;
  }
  //-------------------------------------
  // property: readOnlyFlagPropertyName
  private String mReadOnlyFlagPropertyName = "readOnlyFlag";  
  public String getReadOnlyFlagPropertyName() {
    return mReadOnlyFlagPropertyName;
  }
  public void setReadOnlyFlagPropertyName(String pReadOnlyFlagPropertyName) {
    mReadOnlyFlagPropertyName = pReadOnlyFlagPropertyName;
  }

  //-------------------------------------
  // property: hiddenFlagPropertyName
  private String mHiddenFlagPropertyName = "hiddenFlag";  
  public String getHiddenFlagPropertyName() {
    return mHiddenFlagPropertyName;
  }
  public void setHiddenFlagPropertyName(String pHiddenFlagPropertyName) {
    mHiddenFlagPropertyName = pHiddenFlagPropertyName;
  }

  //-------------------------------------
  // property: requiredFlagPropertyName
  private String mRequiredFlagPropertyName = "requiredFlag";
  public String getRequiredFlagPropertyName() {
    return mRequiredFlagPropertyName;
  }
  public void setRequiredFlagPropertyName(String pRequiredFlagPropertyName) {
    mRequiredFlagPropertyName = pRequiredFlagPropertyName;
  }
  
  //-------------------------------------
  // property: minimumValuePropertyName
  private String mMinimumValuePropertyName = "minimumValue";
  public String getMinimumValuePropertyName() {
    return mMinimumValuePropertyName;
  }
  public void setMinimumValuePropertyName(String pMinimumValuePropertyName) {
    this.mMinimumValuePropertyName = pMinimumValuePropertyName;
  }
  
  //-------------------------------------
  // property: maximumValuePropertyName
  private String mMaximumValuePropertyName = "maximumValue";
  public String getMaximumValuePropertyName() {
    return mMaximumValuePropertyName;
  }
  public void setMaximumValuePropertyName(String pMaximumValuePropertyName) {
    this.mMaximumValuePropertyName = pMaximumValuePropertyName;
  }
  
  
  /**
   * @param pAttribute
   * @param pCatalogAttribute
   * @return
   */
  public atg.siebel.configurator.attribute.Attribute createAttribute(
      com.siebel.ordermanagement.configurator.cfginteractdata.Attribute pAttribute,
      SiebelCatalogAttribute pCatalogAttribute) {

    if (isLoggingDebug()) {
      logDebug("Entered createAttribute() : pAttribute == "
          +pAttribute +" : pCatalogAttribute =="+pCatalogAttribute);
    }
    
    // Params to be passed in Attribute constructor
    String name = pAttribute.getName();
    String domainType = pAttribute.getDomainType();
    String valueType = pAttribute.getValueType();
    String value = EMPTY_STRING;

    Attribute attribute = null;
    if (pAttribute.getDomainType().equals(ENUMERATED_ATTRIBUTE_DOMAINTYPE)
        && !pAttribute.getAttributeValue().isEmpty()) {
      Map<String, String> attributeValues = new LinkedHashMap<String, String>();
      for (AttributeValue attValue : pAttribute.getAttributeValue()) {
        // If this attribute value is 'excluded' then dont include
        // it in the list of values
        String excludedString = attValue.getExcluded();
        if (!StringUtils.isEmpty(excludedString)) {
          boolean shouldExclude = new Boolean(excludedString);
          if (shouldExclude) {
            if (isLoggingDebug()) {
              logDebug("Attribute "+pAttribute.getName()
                  +" has attribute value excluded = "
                  +attValue.getDisplayValue());
            }
            continue;
          }
        }
        if (pAttribute.getValueType().equals(getIntegerType())) {
          // A 'quirk' in the Siebel WS output is that some larger
          // integer values contain commas - we need to
          // remove these as these fields may represent phone #'s etc.
          String displayValue = attValue.getDisplayValue().replaceAll(",", "");
          String internalValue = attValue.getIntegerValue().replaceAll(",", "");
          attributeValues.put(displayValue, internalValue);
          if (Boolean.valueOf(attValue.getSelected())) {
            value = displayValue;
          }
        } else {
          if (valueType.equals(getBooleanType())) {
            if (!StringUtils.isEmpty(attValue.getBooleanValue())) {
              attributeValues.put(attValue.getDisplayValue(),
                  attValue.getBooleanValue());
            } else {
              attributeValues.put(attValue.getDisplayValue(),
                  attValue.getStringValue());
            }
          } else if (valueType.equals(getNumberType())) {
            attributeValues.put(attValue.getDisplayValue(),
                attValue.getNumberValue());
          } else if (valueType.equals(getDateType())) {
            attributeValues.put(attValue.getDisplayValue(),
                attValue.getDateTimeValue());
          } else {
            attributeValues.put(attValue.getDisplayValue(),
                attValue.getStringValue());
          }
          if (Boolean.valueOf(attValue.getSelected())) {
            value = attValue.getDisplayValue();
          }
        }
      }
      attribute = new EnumeratedAttribute(name, value, domainType, valueType, null,
          attributeValues); ///Default value of propTypeCD(null) as pAttribute does not have this property
    } else {
      for (AttributeValue attValue : pAttribute.getAttributeValue()) {
        value = attValue.getDisplayValue();
      }
      if (valueType.equals(getIntegerType())) {
        attribute = new IntegerAttribute(name, value, domainType, valueType, null);
      } else if (valueType.equals(getNumberType())) {
        attribute = new NumberAttribute(name, value, domainType, valueType, null);
      } else {
        attribute = new Attribute(name, value, domainType, valueType, null);//TODO SHOULD TEXT BE PASSED BY DEFAULT
      }
    }


    boolean readOny = false;
    boolean hidden = false;
    boolean required = false;

    if (pCatalogAttribute != null) {
      attribute.setId((String) pCatalogAttribute.getAttributeDefinitionId());
      readOny = (Boolean) pCatalogAttribute.getReadonlyFlag();
      hidden = (Boolean) pCatalogAttribute.getHiddenFlag();
      required = (Boolean) pCatalogAttribute.getRequiredFlag();
      if (attribute instanceof IntegerAttribute) {
        if(!StringUtils.isEmpty(pCatalogAttribute.getMaximumValue()))
        ((IntegerAttribute) attribute).setUpperLimit(Integer.parseInt(pCatalogAttribute.getMaximumValue()));
        if(!StringUtils.isEmpty(pCatalogAttribute.getMinimumValue()))
        ((IntegerAttribute) attribute).setLowerLimit(Integer.parseInt(pCatalogAttribute.getMinimumValue()));
      } else if (attribute instanceof NumberAttribute) {
        if(!StringUtils.isEmpty(pCatalogAttribute.getMaximumValue()))
        ((NumberAttribute) attribute).setUpperLimit(Double.parseDouble(pCatalogAttribute.getMaximumValue()));
        if(!StringUtils.isEmpty(pCatalogAttribute.getMinimumValue()))
        ((NumberAttribute) attribute).setLowerLimit(Double.parseDouble(pCatalogAttribute.getMinimumValue()));
      }
    } else {
      logWarning("Null RepositoryItem for attribute = "+attribute);
    }

    attribute.setHidden(hidden);
    attribute.setReadOnly(readOny);
    attribute.setRequired(required);

    setAttributeValueChecker(attribute);

    if (isLoggingDebug()) {
      logDebug("Leaving createAttribute() : attribute == "
          +attribute);
    }
    return attribute;
  }
  
  
  /**
   * @param valueType
   * @return
   */
  protected void setAttributeValueChecker(Attribute pAttribute) {
    if (isLoggingDebug()) {
      logDebug("Entered setAttributeValueChecker() : pAttribute == "
          + pAttribute);
    }

    AttributeValueChecker checker = null;

    if (pAttribute instanceof IntegerAttribute) {
      checker = new IntegerAttributeValueChecker(
          ((IntegerAttribute) pAttribute).getLowerLimit(),
          ((IntegerAttribute) pAttribute).getUpperLimit());
    } else if (pAttribute instanceof NumberAttribute) {
      checker = new NumberAttributeValueChecker(
          ((NumberAttribute) pAttribute).getLowerLimit(),
          ((NumberAttribute) pAttribute).getUpperLimit());

    } else if (pAttribute.getValueType().equals(getBooleanType())) {
      checker = new BooleanAttributeValueChecker();
    }

    if (checker == null) {
      checker = new AttributeValueChecker();
    }
    pAttribute.setValueChecker(checker);

    if (isLoggingDebug()) {
      logDebug("Leaving setAttributeValueChecker() : pAttribute == "
          + pAttribute);
    }
  }
 
  
  /**
   * @param pAttribute
   * @return
   */
  public Attribute copyAttribute(Attribute pAttribute) {
    if (isLoggingDebug()) {
      logDebug("Entered copyAttribute() : pAttribute == "
          +pAttribute);
    }
    
    Attribute copy = null;
    if (pAttribute instanceof EnumeratedAttribute) {
      copy = new EnumeratedAttribute((EnumeratedAttribute)pAttribute);
    } else if (pAttribute instanceof Attribute) {
      copy = new Attribute(pAttribute);
    }
    
    if (isLoggingDebug()) {
      logDebug("Leaving copyAttribute() : copy == "+copy);
    }
    return copy;
  }
  
  
  /**
   * @param pAttribute
   * @return
   */
  public Attribute copyValidatingAttribute(Attribute pAttribute) {
    if (isLoggingDebug()) {
      logDebug("Entered copyValidatingAttribute() : pAttribute == "
          +pAttribute);
    }
    
    Attribute copy = copyAttribute(pAttribute);
    if (copy != null) {
      setAttributeValueChecker(copy);
    }
    
    if (isLoggingDebug()) {
      logDebug("Leaving copyValidatingAttribute() : copy == "+copy);
    }
    return copy;
  }
  
  
  /**
   * @param nextAttribute
   * @return
   */
  public Attribute createAttribute(SiebelCatalogAttribute pAttribute) {
    
    if (isLoggingDebug()) {
      logDebug("Entered createAttribute() : pAttribute == "+pAttribute);
    }
    
    String domainType = pAttribute.getDomainType();
    String valueType = pAttribute.getValueType();

    Attribute attribute = null;
    if (domainType !=  null && domainType.equals(ENUMERATED_ATTRIBUTE_DOMAINTYPE)) {
      Map<String, String> attributeValues = new LinkedHashMap<String, String>();
      for (String attValue : pAttribute.getAttributeValues()) {
        attributeValues.put(attValue, attValue);
      }
      attribute = new EnumeratedAttribute(pAttribute, attributeValues);
    } else {
      if (valueType != null) {
        if (valueType.equals(getIntegerType())) {
          attribute = new IntegerAttribute(pAttribute);
        } else if (valueType.equals(getNumberType())){
          attribute = new NumberAttribute(pAttribute);
        }
      }
    }
    
    if (attribute == null) {
      attribute = new Attribute(pAttribute);
    }

    setAttributeValueChecker(attribute);

    if (isLoggingDebug()) {
      logDebug("Leaving createAttribute() : attribute == "+attribute);
    }
    
    return attribute;
  }
  
}
