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
package atg.siebel.product;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.servlet.ServletException;
import atg.droplet.GenericFormHandler;
import atg.repository.RepositoryException;
import atg.servlet.DynamoHttpServletRequest;
import atg.servlet.DynamoHttpServletResponse;
import atg.siebel.catalog.SiebelCatalogTools;
import atg.userprofiling.Profile;

/**
 * Form handler to test the Eligibility and Compatibility Rules created in
 * Siebel
 * 
 * @author shaikuku
 * @version $Id: //product/Siebel/main/src/atg/siebel/product/
 *          EligibilityCompatibilityRulesFormHandler.java#1 $$Change: 1194813 $
 * @updated $DateTime:
 */
public class EligibilityCompatibilityRulesFormHandler extends
    GenericFormHandler {
  // ----------------------------------------------------------------------------------
  // Class version string
  // ----------------------------------------------------------------------------------
  
  public static String CLASS_VERSION = "$Id: //product/Siebel/version/11.2/src/atg/siebel/product/EligibilityCompatibilityRulesFormHandler.java#2 $$Change: 1194813 $";
  // general properties and getters and setters
  
  // Profile ID
  private String mProfileId;
  // city where product needs to be shipped
  private String mShippingCity;
  // state where product needs to be shipped
  private String mShippingState;
  // zip-code where product needs to be shipped
  private String mShippingZip;
  // First product ID for compatibility test
  private String mCompProductId1;
  // Second product ID for compatibility test
  private String mCompProductId2;
  // Compatibility error message for first product
  private String mCompatibilityErrorMessageProd1;
  // Compatibility error message for second product
  private String mCompatibilityErrorMessageProd2;
  // profile id entered by the user in test jsp
  private String mOtherProfileId;
  
  // SiebelCatalogTools object
  private SiebelCatalogTools mSiebelCatalogTools;
 //Array of Product-ids
  private String[] mProductIdsArray = null;
  //Error message when some exception occurs
  private String mExceptionErrorMessage = null;
  //Error messages of products after E & C Rule validation
  private List<String> mProductErrorMessages = new ArrayList<String>();
  // Profile object
  private Profile mProfile;
 
  
  // Constants
  
  private enum mSiebelProfileProperties{
    State, City, Zip
  }
  
  
  /**
   * 
   * @return
   */
  public String getProfileId() {
    return mProfileId;
  }
  
  /**
   * 
   * @param pProfileId
   */
  public void setProfileId(String pProfileId) {
    this.mProfileId = pProfileId;
  }
  
  /**
   * 
   * @return
   */
  public SiebelCatalogTools getSiebelCatalogTools() {
    return mSiebelCatalogTools;
  }
  
  /**
   * 
   * @param pSiebelCatalogTools
   */
  public void setSiebelCatalogTools(SiebelCatalogTools pSiebelCatalogTools) {
    this.mSiebelCatalogTools = pSiebelCatalogTools;
  }
  
  /**
   * 
   * @return
   */
  public Profile getProfile() {
    return mProfile;
  }
  
  /**
   * 
   * @param pProfile
   */
  public void setProfile(Profile pProfile) {
    this.mProfile = pProfile;
  }
  
  /**
   * 
   * @return
   */
  public String getShippingCity() {
    return mShippingCity;
  }
  
  /**
   * 
   * @param pShippingCity
   */
  public void setShippingCity(String pShippingCity) {
    this.mShippingCity = pShippingCity;
  }
  
  /**
   * 
   * @return
   */
  public String getShippingState() {
    return mShippingState;
  }
  
  /**
   * 
   * @param pShippingState
   */
  public void setShippingState(String pShippingState) {
    this.mShippingState = pShippingState;
  }
  
  /**
   * 
   * @return
   */
  public String getShippingZip() {
    return mShippingZip;
  }
  
  /**
   * 
   * @param pShippingZip
   */
  public void setShippingZip(String pShippingZip) {
    this.mShippingZip = pShippingZip;
  }
  
  /**
   * 
   * @return
   */
  public String getCompProductId1() {
    return mCompProductId1;
  }
  
  /**
   * 
   * @param pCompProductId1
   */
  public void setCompProductId1(String pCompProductId1) {
    this.mCompProductId1 = pCompProductId1;
  }
  
  /**
   * 
   * @return
   */
  public String getCompProductId2() {
    return mCompProductId2;
  }
  
  /**
   * 
   * @param pCompProductId2
   */
  public void setCompProductId2(String pCompProductId2) {
    this.mCompProductId2 = pCompProductId2;
  }
  
  /**
   * 
   * @return
   */
  public String getCompatibilityErrorMessageProd1() {
    return mCompatibilityErrorMessageProd1;
  }
  
  /**
   * 
   * @param pCompatibilityErrorMessageProd1
   */
  public void setCompatibilityErrorMessageProd1(
      String pCompatibilityErrorMessageProd1) {
    this.mCompatibilityErrorMessageProd1 = pCompatibilityErrorMessageProd1;
  }
  
  /**
   * 
   * @return
   */
  public String getCompatibilityErrorMessageProd2() {
    return mCompatibilityErrorMessageProd2;
  }
  
  /**
   * 
   * @param pCompatibilityErrorMessageProd2
   */
  public void setCompatibilityErrorMessageProd2(
      String pCompatibilityErrorMessageProd2) {
    this.mCompatibilityErrorMessageProd2 = pCompatibilityErrorMessageProd2;
  }
  
  /**
   * 
   * @return
   */
  public String getOtherProfileId() {
    return mOtherProfileId;
  }
  
  /**
   * 
   * @param pOtherProfileId
   */
  public void setOtherProfileId(String pOtherProfileId) {
    this.mOtherProfileId = pOtherProfileId;
  }
  
  /**
   * @return the mProductIdsArray
   */
  public String[] getProductIdsArray() {
    return mProductIdsArray;
  }

  /**
   * @param pProductIdsArray the mProductIdsArray to set
   */
  public void setProductIdsArray(String[] pProductIdsArray) {
    this.mProductIdsArray = pProductIdsArray;
  }
  
  /**
   * @return the ExceptionErrorMessage
   */
  public String getExceptionErrorMessage() {
    return mExceptionErrorMessage;
  }

  /**
   * @param pExceptionErrorMessage the mExceptionErrorMessage to set
   */
  public void setExceptionErrorMessage(String pExceptionErrorMessage) {
    this.mExceptionErrorMessage = pExceptionErrorMessage;
  }

  /**
   * @return the ProductErrorMessages
   */
  public List<String> getProductErrorMessages() {
    return mProductErrorMessages;
  }

  /**
   * @param pProductErrorMessages the mProductErrorMessages to set
   */
  public void setProductErrorMessages(List<String> pProductErrorMessages) {
    this.mProductErrorMessages = pProductErrorMessages;
  }
  // handle methods
  
  /**
   * handle method to test the eligibility rules defined for a product
   * 
   * @param pRequest
   * @param pResponse
   * @return
   * @throws ServletException
   * @throws IOException
   */
  public boolean handleCheckEligibilityRules(DynamoHttpServletRequest pRequest,
      DynamoHttpServletResponse pResponse) throws ServletException, IOException {
    boolean formStatus = true;
    Map<String, String> invalidProducts = null;
    int delimeterIndex = 0;
    Map<String, String> productMap = new LinkedHashMap<String, String>();
    // general validations
    
    if (getProductIdsArray() == null || getProductIdsArray().length == 0) {
      setExceptionErrorMessage("Please select atleast one product");
      return true;
    } 
     
    // creating a map of product ids and description
    for (String product : getProductIdsArray()) {
      delimeterIndex = product.indexOf(":");
      productMap.put(product.substring(0, delimeterIndex),
          product.substring(delimeterIndex + 1));
    }
    
    try {
          
         if(getProfile() != null && !(getProfile().isTransient())){ //Testing For LoggedIN user
           invalidProducts = getSiebelCatalogTools().checkProductEligibility(Arrays.asList(Arrays.copyOf(productMap.keySet().toArray(),productMap.keySet().toArray().length, String[].class)));
         }else{ //Testing without login
            
               //If Explicit profile id is provided
               if(getOtherProfileId() != null && !("".equals(getOtherProfileId()))){
                 invalidProducts = getSiebelCatalogTools().checkProductEligibility(getOtherProfileId(), Arrays.asList(Arrays.copyOf(productMap.keySet().toArray(),productMap.keySet().toArray().length, String[].class)));
               }else{ //For anonymous user where Profile ID is not available
                 
                 //Creating user Properties
                 Map<String, String> userProperties = new HashMap<String, String>();
                 if(getShippingState() != null && !("".equals(getShippingState()))){
                 userProperties.put((mSiebelProfileProperties.State).toString(), getShippingState());
                 }
                 if(getShippingCity() != null && !("".equals(getShippingCity()))){
                   userProperties.put((mSiebelProfileProperties.City).toString(), getShippingCity());
                   }
                 if(getShippingZip() != null && !("".equals(getShippingZip()))){
                   userProperties.put((mSiebelProfileProperties.Zip).toString(), getShippingZip());
                   }
                 invalidProducts = getSiebelCatalogTools().checkProductEligibility(userProperties, Arrays.asList(Arrays.copyOf(productMap.keySet().toArray(),productMap.keySet().toArray().length, String[].class)));
               }
               
         }
        
      if (invalidProducts != null && !invalidProducts.isEmpty()) {
        
        for (Entry<String, String> product : productMap.entrySet()) {
          if (invalidProducts.get(product.getKey()) != null) {
            mProductErrorMessages.add(product.getValue() + " : "
                + invalidProducts.get(product.getKey()));
          } else {
            mProductErrorMessages.add(product.getValue()
                + " : This Product is available");
          }
          
        }
        
       
       } else {
        mProductErrorMessages.add("All Products are available");
       }
      
    } catch (RepositoryException rpex) {
      setExceptionErrorMessage("Exception : "+rpex.getMessage());
    } catch (Exception ex) {
      setExceptionErrorMessage("Exception : "+ex.getMessage());
    }
    
    return formStatus;
  }
  
  public boolean handleCheckCompatibilityRules(
      DynamoHttpServletRequest pRequest, DynamoHttpServletResponse pResponse)
      throws ServletException, IOException {
    boolean formStatus = true;
    Map<String, String> invalidProducts = null;
    int delimeterIndex = 0;
    Map<String, String> productMap = new LinkedHashMap<String, String>();
    // general validations
    
    if (getProductIdsArray() == null || getProductIdsArray().length == 0) {
      setExceptionErrorMessage("Please select atleast one product");
      return true;
    }
    
    // creating a map of product ids and description
    for (String product : getProductIdsArray()) {
      delimeterIndex = product.indexOf(":");
      productMap.put(product.substring(0, delimeterIndex),
          product.substring(delimeterIndex + 1));
    }
    
        
    try{
      
      if(getProfile() != null && !(getProfile().isTransient())){ //Testing For LoggedIN user
        invalidProducts = getSiebelCatalogTools().checkProductEligibilityCompatability(Arrays.asList(Arrays.copyOf(productMap.keySet().toArray(),productMap.keySet().toArray().length, String[].class)));
      }else{ //Testing without login
         
            //If Explicit profile id is provided
            if(getOtherProfileId() != null && !("".equals(getOtherProfileId()))){
              invalidProducts = getSiebelCatalogTools().checkProductEligibilityCompatability(getOtherProfileId(), Arrays.asList(getProductIdsArray()));
            }else{ //For anonymous user where Profile ID is not available
              invalidProducts = getSiebelCatalogTools().checkProductEligibilityCompatability(Arrays.asList(Arrays.copyOf(productMap.keySet().toArray(),productMap.keySet().toArray().length, String[].class)));
            }
            
      }
      
      //setting error messages
      
      if (invalidProducts != null && !invalidProducts.isEmpty()) {
        
        
        for (Entry<String, String> product : productMap.entrySet()) {
          if (invalidProducts.get(product.getKey()) != null) {
            mProductErrorMessages.add(product.getValue() + " : "
                + invalidProducts.get(product.getKey()));
          } else {
            mProductErrorMessages.add(product.getValue()
                + " : This Product is available and compatible");
          }

        }
        

       } else {
    	   mProductErrorMessages.add("All Products are available and compatible");
       }
      
    } catch (RepositoryException rpex) {
      setExceptionErrorMessage("Exception : "+rpex.getMessage());
    } catch (Exception ex) {
      setExceptionErrorMessage("Exception : "+ex.getMessage());
    }
   
     return formStatus;
  }
}
