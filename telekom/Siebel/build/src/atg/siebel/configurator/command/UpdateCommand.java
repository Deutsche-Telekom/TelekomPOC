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

package atg.siebel.configurator.command;

import atg.nucleus.logging.ApplicationLogging;
import atg.nucleus.logging.ClassLoggingFactory;
import atg.service.perfmonitor.PerformanceMonitor;
import atg.service.resourcepool.ResourcePoolException;
import atg.siebel.configurator.ConfigurationContext;
import atg.siebel.configurator.ConfiguratorException;
import atg.siebel.configurator.Constants;
import atg.siebel.integration.SiebelWebServiceConfigurationException;
import com.siebel.ordermanagement.configurator.UpdateConfigurationInput;
import com.siebel.ordermanagement.configurator.UpdateConfigurationOutput;
import com.siebel.ordermanagement.configurator.cfginteractdata.Item;
import com.siebel.ordermanagement.configurator.cfginteractdata.ListOfData;
import com.siebel.ordermanagement.configurator.cfginteractdata.ProductData;
import com.siebel.ordermanagement.configurator.cfginteractrequest.ListOfRequest;
import com.siebel.ordermanagement.configurator.cfginteractrequest.Request;
import com.siebel.ordermanagement.configurator.cfginteractrequest.Requests;

import javax.xml.ws.soap.SOAPFaultException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Class that sends an update to Siebel
 * 
 * @author bbrady
 * @version $Id: //product/Siebel/version/11.2/src/atg/siebel/configurator/command/UpdateCommand.java#2 $$Change: 1194813 $
 * @updated $DateTime: 2015/09/10 08:26:24 $$Author: saysyed $
 */
public abstract class UpdateCommand extends AbstractConfiguratorCommand {

  /** Class version string */
  public static final String CLASS_VERSION = "$Id: //product/Siebel/version/11.2/src/atg/siebel/configurator/command/UpdateCommand.java#2 $$Change: 1194813 $";

	/** Logger */
	protected static ApplicationLogging mLogger = ClassLoggingFactory
	    .getFactory().getLoggerForClass(UpdateCommand.class);

	protected enum RequestType {
		AddItem, RemoveItem, SetItemQuantitty, SetAttribute, ReplaceItem
	}

	protected enum ConflictResolution {
		Undo, Proceed
	}

	public UpdateCommand(ConfigurationContext pEvent) {
		super(pEvent);
	}

  @Override
  protected CommandResult doExecute() throws ConfiguratorException {

    if (mLogger.isLoggingDebug()) {
      mLogger.logDebug("execute() started");
    }

    UpdateConfigurationInput input = createInput();
    try {

      UpdateConfigurationOutput output = (UpdateConfigurationOutput)getConfiguratorTools().executeWebService(
              "com.siebel.ordermanagement.configurator.ProductConfigurator",
              "UpdateConfigurationPort",
              "updateConfiguration",
              input,
              this);
      
      
      // CommandResult result = produceResult(output);
      CommandResult result = new CommandResult();
      result.setStatus(createCommandStatus(output.getErrorSpcCode(),
          output.getErrorSpcMessage(), output.getListOfStatus()));

      if (result.getStatus().isSuccessfull()) {
        configureInstancefromProductData(output.getListOfData()
            .getProductData());
      }
      return result;
    } catch (SOAPFaultException sfe) {
      PerformanceMonitor.cancelOperation("updateConfiguration");
      mLogger.logError(sfe);
      return produceResult(sfe);
    } catch (InvocationTargetException e) {
      throw new ConfiguratorException(e);
    } catch (NoSuchMethodException e) {
      throw new ConfiguratorException(e);
    } catch (ResourcePoolException e) {
      throw new ConfiguratorException(e);
    } catch (IllegalAccessException e) {
      throw new ConfiguratorException(e);
    } catch (SiebelWebServiceConfigurationException e) {
      throw new ConfiguratorException(e);
    }
  }

	/**
	 * Creates default parameters for working with update service
	 * <p/>
	 * it should contain list of requests and list of Product Data
	 * 
	 * @return
	 */
  protected UpdateConfigurationInput createInput() {
		UpdateConfigurationInput input = new UpdateConfigurationInput();
		// dont resolve conflicts automatically
		input.setConflictAutoResolve(ConflictResolution.Undo.name());

		// dont finish the configuration
		input.setFinishConfigurationInFlag(Constants.NO);

		input.setListOfData(createListOfData());

		input.setListOfRequest(createListOfRequest());

		// Dont reprice items by default
		input.setRepriceInFlag(Constants.YES);

		// Dont verify item by default
		input.setVerifyInFlag(Constants.YES);

		return input;
	}

	/**
	 * Default ListOfRequest parameters
	 * 
	 * @return
	 */
	protected ListOfRequest createListOfRequest() {
		ListOfRequest listOfRequest = new ListOfRequest();
		Requests requests = new Requests();
		requests.getRequest().addAll(createRequests());
		listOfRequest.setRequests(requests);
		return listOfRequest;
	}

	/**
	 * Standart list of Data call used for UpdateConfiguration Input
	 * 
	 * @return
	 */
	protected ListOfData createListOfData() {
		ListOfData listOfData = new ListOfData();

		ProductData productData = new ProductData();
		productData.getItem().addAll(createProductItems());

		listOfData.setProductData(productData);

		return listOfData;
	}
	
	
  /**
   * @return
   */
  protected List<Item> createProductItems() {
    return Arrays.asList(createProductItem());
  }

  
	/**
	 * Create the list of required requests according to specified data
	 * 
	 * @return
	 */
	protected List<Request> createRequests() {
		List<Request> requests = new ArrayList<Request>();
		requests.add(createRequest());
		return requests;
	}


	protected abstract Request createRequest();

}
