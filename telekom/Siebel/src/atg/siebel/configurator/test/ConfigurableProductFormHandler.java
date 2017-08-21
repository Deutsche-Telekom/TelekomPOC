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

package atg.siebel.configurator.test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import javax.servlet.ServletException;

import atg.core.i18n.LayeredResourceBundle;
import atg.core.util.StringUtils;
import atg.droplet.DropletException;
import atg.repository.servlet.RepositoryFormHandler;
import atg.servlet.DynamoHttpServletRequest;
import atg.servlet.DynamoHttpServletResponse;
import atg.siebel.configurator.ChildProductConfigInstance;
import atg.siebel.configurator.ConfiguratorException;
import atg.siebel.configurator.ConfiguratorManager;
import atg.siebel.configurator.Constants.ProductConfigInstanceStatus;
import atg.siebel.configurator.ProductConfigInstance;
import atg.siebel.configurator.ProductConfigInstanceCache;
import atg.siebel.configurator.ProductConfigRelationship;
import atg.siebel.configurator.RootProductConfigInstance;
import atg.siebel.configurator.attribute.Attribute;
import atg.siebel.configurator.attribute.AttributeHolder;
import atg.siebel.configurator.command.CommandResult;
import atg.siebel.configurator.ui.UINode;

/**
 * @author bbrady
 *
 */
public class ConfigurableProductFormHandler extends RepositoryFormHandler {
	//-------------------------------------
	/** Class version string */
	public static final String CLASS_VERSION = "$Id: //product/Siebel/version/11.2/src/atg/siebel/configurator/test/ConfigurableProductFormHandler.java#2 $$Change: 1194813 $";

	static final String MY_RESOURCE_NAME = "atg.siebel.resources.SiebelConfiguratorResources";

	static java.util.ResourceBundle sResourceBundle = LayeredResourceBundle
			.getBundle(MY_RESOURCE_NAME, atg.service.dynamo.LangLicense.getLicensedDefault());
	//-------------------------------------
	// Constants
	//-------------------------------------
	public static final String PRODUCT_CONFIG_INSTANCE_KEY = "productConfigInstanceKey";
	public static final String NAVIGATION_TRAIL_STRING_PARAM = "navigationTrailString";

	//-------------------------------------
	// Member variables
	//-------------------------------------
	


	//-------------------------------------
	// Properties
	//-------------------------------------
	
	//-------------------------------------
	// property: ConfiguratorTools
	protected ConfiguratorManager mConfiguratorManager;

	public ConfiguratorManager getConfiguratorManager() {
		return mConfiguratorManager;		
	}

	public void setConfiguratorManager(ConfiguratorManager pConfiguratorManager) {
		mConfiguratorManager = pConfiguratorManager;
	}
	
	//-------------------------------------
	// property: productConfigInstanceCache
	protected ProductConfigInstanceCache mProductConfigInstanceCache;

	public ProductConfigInstanceCache getProductConfigInstanceCache() {
		return mProductConfigInstanceCache;
	}

	public void setProductConfigInstanceCache(ProductConfigInstanceCache pConfiguratorSession) {
		this.mProductConfigInstanceCache = pConfiguratorSession;
	}
	
	//---------------------------------------
	// property: navigationTrailString
	String mNavigationTrailString;
	public void setNavigationTrailString(String pNavigationTrailString) {
		mNavigationTrailString = pNavigationTrailString;
	}
	public String getNavigationTrailString() {
		return mNavigationTrailString;
	}
	
	//---------------------------------------
	// property: navigationTrailStringDelimiter
	String mNavigationTrailStringDelimiter = ";";
	public void setNavigationTrailStringDelimiter(String pNavigationTrailStringDelimiter) {
		mNavigationTrailStringDelimiter = pNavigationTrailStringDelimiter;
	}
	private String getNavigationTrailStringDelimiter() {
		return mNavigationTrailStringDelimiter;
	}
	
	//-------------------------------------
	// property: currentInstance
	private ProductConfigInstance mCurrentInstance;
	public ProductConfigInstance getCurrentInstance() {
		return mCurrentInstance;
	}
	public void setCurrentInstance(ProductConfigInstance pCurrentInstance) {
		mCurrentInstance = pCurrentInstance;
		setAttributes(pCurrentInstance.getAttributeHolders());
	}
	
	//-------------------------------------
	// property: currentInstanceKey
	private String mCurrentInstanceKey;
	public String getCurrentInstanceKey() {
		return mCurrentInstanceKey;
	}
	public void setCurrentInstanceKey(String pCurrentInstanceKey) {
		mCurrentInstanceKey = pCurrentInstanceKey;
		setCurrentInstance((ProductConfigInstance) getProductConfigInstanceCache().getInstance(
				pCurrentInstanceKey));
	}
	
	//-------------------------------------
	// property: attributes
	private AttributeHolder[] mAttributes;
	public AttributeHolder[] getAttributes() {
		return mAttributes;
	}
	public void setAttributes(AttributeHolder[] pAttributes) {
		mAttributes = pAttributes;
	}
	
	//-------------------------------------
	// property: currentRelationshipId
	private String mCurrentRelationshipId;
	public String getCurrentRelationshipId() {
		return mCurrentRelationshipId;
	}
	public void setCurrentRelationshipId(String pCurrentRelationshipId) {
		mCurrentRelationshipId = pCurrentRelationshipId;
	}
	
	//-------------------------------------
	// property: childProductId
	private String mChildProductId = null;
	public String getChildProductId() {
		return mChildProductId;
	}
	public void setChildProductId(String pChildProductId) {
		mChildProductId = pChildProductId;
	}

	//-------------------------------------
	// property: uiNodeList	
	private List<UINode> mUiNodeList;
	public List<UINode> getUiNodeList() {
		return mUiNodeList;
	}
	public void setUiNodeList(List<UINode> pUiNodeList) {
		mUiNodeList = pUiNodeList;
	}
	
	//-------------------------------------
	// property: cssFilePath
	private String mCssFilePath = null;
	public String getCssFilePath() {
		return mCssFilePath;
	}
	public void setCssFilePath(String pCssFilePath) {
		mCssFilePath = pCssFilePath;
	}
	
	//-------------------------------------
	// property: endConfigurationRedirectUrl
	private String mEndConfigurationRedirectUrl = "/siebel/configurator/test/configurator_test_setup.jsp";
	public String getEndConfigurationRedirectUrl() {
		return mEndConfigurationRedirectUrl;
	}
	public void setEndConfigurationRedirectUrl(String pEndConfigurationRedirectUrl) {
		mEndConfigurationRedirectUrl = pEndConfigurationRedirectUrl;
	}
	
	//-------------------------------------
    // property: editCommerceItemId
    private String mEditCommerceItemId = null;
    public String getEditCommerceItemId() {
        return mEditCommerceItemId;
    }
    public void setEditCommerceItemId(String pEditCommerceItemId) {
      mEditCommerceItemId = pEditCommerceItemId;
    }
    
    //-------------------------------------
    // property: updateAttribute
    private String mUpdateAttribute = null;
    public String getUpdateAttribute() {
        return mUpdateAttribute;
    }
    public void setUpdateAttribute(String pUpdateAttribute) {
      mUpdateAttribute = pUpdateAttribute;
    }
    
    //-------------------------------------
    // property: u
    private String mDeleteChildId = null;
    public String getDeleteChildProduct() {
        return mDeleteChildId;
    }
    public void setDeleteChildProduct(String pDeleteChildId) {
      mDeleteChildId = pDeleteChildId;
    }
	
	//-------------------------------------
	// Constructors
	//---------------------------------


	//-------------------------------------
	/**
	 * Constructs a new ConfigurableProductFormHandler.
	 */
	public ConfigurableProductFormHandler() {
	}
	
	
	/**
	 * @param pRequest
	 * @param pResponse
	 * @return
	 * @throws ServletException
	 * @throws IOException
	 */
	public boolean handleAddChildProduct(
			DynamoHttpServletRequest pRequest, 
	    DynamoHttpServletResponse pResponse) throws ServletException, IOException {

		vlogDebug("Entered handleAddChildProduct() : pRequest == " + pRequest);
		String relationshipId = getCurrentRelationshipId();
		String childToAdd = getChildProductId();
		getCurrentInstance().addChildProduct(relationshipId, childToAdd);
		
//		CommandResult result = getCurrentInstance().addChildProduct(relationshipId, childToAdd);

//		if (!result.getStatus().isSuccessfull()) {
//			Object[] args = { relationshipId };
//			String message = ResourceUtils.getMsgResource(Constants.ERROR_ADD_CHILD,
//			    MY_RESOURCE_NAME, sResourceBundle);
//			throw new DropletException(MessageFormat.format(message, args));
//		}

		return true;
	}
	
	
	/**
	 * @param pRequest
	 * @param pResponse
	 * @return
	 * @throws ServletException
	 * @throws IOException
	 */
	public boolean handleUpdateAttributeValues(
			DynamoHttpServletRequest pRequest, 
	    DynamoHttpServletResponse pResponse) throws ServletException, IOException {

		vlogDebug("Entered handleUpdateAttributeValues() : pRequest == " + pRequest);
		getCurrentInstance().updateAttributes(getAttributes());

		return true;
	}
	

	   /**
     * @param pRequest
     * @param pResponse
     * @return
     * @throws ServletException
     * @throws IOException
     */
    public boolean handleDeleteSelectedProducts(
            DynamoHttpServletRequest pRequest, 
            DynamoHttpServletResponse pResponse)
        throws ServletException, IOException {

        vlogDebug("Entered handleDeleteSelectedProducts() : pRequest == "
            + pRequest);
        String relationshipId = getCurrentRelationshipId();
        ProductConfigRelationship relationship = getCurrentInstance()
            .getChildRelationship(relationshipId);
        List<ChildProductConfigInstance> toDelete = new ArrayList<ChildProductConfigInstance>();
        for (ProductConfigInstance instance : relationship.getChildInstances()) {
            if (instance.isDelete()) {
                toDelete.add((ChildProductConfigInstance) instance);
            }
        }

        if (!toDelete.isEmpty()) {
            getCurrentInstance().deleteChildInstances(relationship, toDelete);
        }

        return true;
    }
	
	
  /**
   * @param pRequest
   * @param pResponse
   * @return
   * @throws ServletException
   * @throws IOException
   */
  public boolean handleEndConfiguration(DynamoHttpServletRequest pRequest,
      DynamoHttpServletResponse pResponse) throws ServletException, IOException {

    vlogDebug("Entered handleEndConfiguration() : pRequest == " + pRequest);
    if (getCurrentInstance() instanceof RootProductConfigInstance) {
      ((RootProductConfigInstance) getCurrentInstance()).endConfiguration();

    } else {
      return checkFormSuccess(getEndConfigurationRedirectUrl(), pRequest,
          pResponse);
    }
    return checkFormSuccess (
        "/siebel/configurator/test/edit_commerce_items.jsp",
        pRequest,
        pResponse);
  }

  
  
  public boolean handleReturnToParent(DynamoHttpServletRequest pRequest,
      DynamoHttpServletResponse pResponse) throws ServletException, IOException {
    Stack<String> navigationUrls = getNavigationStack(pRequest);
    if (!navigationUrls.isEmpty()) {
      String successUrl = navigationUrls.pop();
      String newNavigationTrailString = getStackAsDelimitedString(navigationUrls);
      setNavigationTrailString(newNavigationTrailString);
      pRequest.setParameter(NAVIGATION_TRAIL_STRING_PARAM,
          newNavigationTrailString);
      return checkFormSuccess(successUrl, pRequest, pResponse);
    }
    return true;
  }
  
  
  /**
   * @param pRequest
   * @param pResponse
   * @return
   * @throws ServletException
   * @throws IOException
   */
  public boolean handleEditCommerceItemId(DynamoHttpServletRequest pRequest,
      DynamoHttpServletResponse pResponse) throws ServletException, IOException {

    System.out.println("Ok we will edit " + getEditCommerceItemId());

    RootProductConfigInstance instance;
    try {
      instance = (RootProductConfigInstance) getConfiguratorManager()
          .createProductInstanceFromCommerceItem(getEditCommerceItemId());
      CommandResult result = getConfiguratorManager()
          .performProductConfigurationEdit(instance);
      if (result.getStatus().isSuccessfull()) {
        return checkFormSuccess(
            "/siebel/configurator/test/cp_edit_template.jsp?productConfigInstanceKey="
                + instance.getKey(), pRequest, pResponse);
      }
    } catch (ConfiguratorException e) {
      throw new DropletException(e.getMessage());
    }
    return true;
  }
  
  
  /**
   * @param pRequest
   * @param pResponse
   * @return
   * @throws ServletException
   * @throws IOException
   */
  public boolean handleDeleteChildProduct(DynamoHttpServletRequest pRequest,
      DynamoHttpServletResponse pResponse) throws ServletException, IOException {

    ChildProductConfigInstance instance = (ChildProductConfigInstance) getConfiguratorManager()
        .getConfiguratorTools().getProductConfigInstanceCache()
        .getInstance(getDeleteChildProduct());

    if (instance != null) {
      instance.deleteInstance();
    }

    return true;
  }
  
  /**
   * @param pRequest
   * @param pResponse
   * @return
   * @throws ServletException
   * @throws IOException
   */
  public boolean handleUpdateAttribute(DynamoHttpServletRequest pRequest,
      DynamoHttpServletResponse pResponse) throws ServletException, IOException {

    AttributeHolder updated = null;
    String updatedAttribute = getUpdateAttribute();
    for (AttributeHolder nextAttribute : getAttributes()) {
      if (nextAttribute.getName().equals(updatedAttribute)) {
        updated = nextAttribute;
      }
    }
    
    if (updated != null) {
      getCurrentInstance().setAttributeValue(updated.getName(), updated.getValue());
    }

    return true;
  }
	
	/**
	 * @param pRequest
	 * @return
	 */
	protected Stack<String> getNavigationStack(DynamoHttpServletRequest pRequest) {
		vlogDebug("Entered getNavigationStack() : pRequest == " + pRequest);
		Stack<String> navigationStack = new Stack<String>();
		// Try to get from this component first
		String navigationTrailString = getNavigationTrailString();
		// If null then get from request
		if (StringUtils.isEmpty(navigationTrailString)) {
			navigationTrailString = pRequest
			    .getParameter(NAVIGATION_TRAIL_STRING_PARAM);
		}
		if (!StringUtils.isEmpty(navigationTrailString)) {
			String[] navigationUrls = navigationTrailString
			    .split(getNavigationTrailStringDelimiter());
			int index = 0;
			while (index < navigationUrls.length) {
				navigationStack.push(navigationUrls[index++]);
			}
		}
		vlogDebug("Leaving getNavigationStack() : navigationStack == "
		    + navigationStack);
		return navigationStack;
	}
	
	
	/**
	 * @param pNavigationStack
	 * @return
	 */
	protected String getStackAsDelimitedString(Stack<String> pNavigationStack) {
		vlogDebug("Entered getStackAsDelimitedString() : pNavigationStack == "
		    + pNavigationStack);
		String navigationTrailString = null;
		if (pNavigationStack != null && !pNavigationStack.isEmpty()) {
			StringBuilder sb = new StringBuilder();
			for (int index = 0; index < pNavigationStack.size();) {
				sb.append(pNavigationStack.get(index++));
				if (index < pNavigationStack.size()) {
					sb.append(getNavigationTrailStringDelimiter());
				}
			}
			navigationTrailString = sb.toString();
		}
		vlogDebug("Leaving getStackAsDelimitedString() : navigationTrailString == "
		    + navigationTrailString);
		return navigationTrailString;
	}

}
