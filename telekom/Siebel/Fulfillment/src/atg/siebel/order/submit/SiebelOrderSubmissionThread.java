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
package atg.siebel.order.submit;

import atg.adapter.gsa.GSARepository;
import atg.commerce.order.Order;
import atg.dtm.TransactionDemarcation;
import atg.dtm.TransactionDemarcationException;
import atg.nucleus.Nucleus;
import atg.nucleus.logging.ApplicationLogging;
import atg.nucleus.logging.ClassLoggingFactory;
import atg.service.perfmonitor.PerformanceMonitor;
import atg.siebel.integration.WebServiceHelper;
import atg.siebel.states.SiebelOrderStates;
import com.siebel.ordermanagement.quote.quoting.ExecuteQuotingInput;
import com.siebel.ordermanagement.quote.quoting.ExecuteQuotingOutput;
import com.siebel.ordermanagement.quote.quoting.QuotingPort;
import com.siebel.ordermanagement.quote.quoting.QuotingWebService;

import javax.transaction.Status;
import javax.transaction.SystemException;
import javax.transaction.TransactionManager;
import javax.xml.ws.BindingProvider;
import java.sql.CallableStatement;
import java.sql.SQLException;

/**
 * The worker thread which does executes the order submission to Siebel, and sets appropriate order statuses.
 *
 * Created by gamcdowe on 07/05/2015.
 */
public class SiebelOrderSubmissionThread extends Thread
{
  public static String CLASS_VERSION =
          "$Id: //product/Siebel/version/11.2/Fulfillment/src/atg/siebel/order/submit/SiebelOrderSubmissionThread.java#2 $$Change: 1196386 $";

  protected static ApplicationLogging mLogger = ClassLoggingFactory
          .getFactory().getLoggerForClass(SiebelOrderSubmissionThread.class);


  private final static String orderRepositoryPath = "/atg/commerce/order/OrderRepository";
  private final static String webServiceHelperPath = "/atg/siebel/integration/WebServiceHelper";
  private final static String transactionManagerPath = "/atg/dynamo/transaction/TransactionManager";

  public static class Settings
  {
    private GSARepository mOrderRepository;
    private WebServiceHelper mWebServiceHelper;
    private TransactionManager mTransactionManager;

    public Settings(GSARepository or, WebServiceHelper wsh, TransactionManager tm) {
      mOrderRepository = or;
      mWebServiceHelper = wsh;
      mTransactionManager = tm;
    }

    public GSARepository getOrderRepository() {
      return mOrderRepository;
    }

    public WebServiceHelper getWebServiceHelper() {
      return mWebServiceHelper;
    }

    public TransactionManager getTransactionManager() {
      return mTransactionManager;
    }
    QuotingPort mQuotingPort = new QuotingWebService().getQuotingPort();

    public QuotingPort getQuotingPort() {
      return mQuotingPort;
    }
  }

  private static final ThreadLocal<Settings> settings = new ThreadLocal<Settings>()
  {
    protected Settings initialValue()
    {
      GSARepository or = (GSARepository)Nucleus.getGlobalNucleus().resolveName(orderRepositoryPath);
      WebServiceHelper wsh = (WebServiceHelper)Nucleus.getGlobalNucleus().resolveName(webServiceHelperPath);
      TransactionManager tm = (TransactionManager)Nucleus.getGlobalNucleus().resolveName(transactionManagerPath);
      return new Settings(or, wsh, tm);
    }
  };

  private Order mOrder;
  private ExecuteQuotingInput mInput;

  public Order getOrder() {
    return mOrder;
  }

  public void setOrder(Order pOrder) {
    mOrder = pOrder;
  }

  public ExecuteQuotingInput getInput() {
    return mInput;
  }

  public void setInput(ExecuteQuotingInput pInput) {
    mInput = pInput;
  }


  /**
   * run the process
   */
  public void doSubmit()
  {
    if(mLogger.isLoggingDebug())
    {
      mLogger.logDebug("Thread ID : " + Thread.currentThread().getId() + " submitting order : " + mOrder.getId());
    }

    PerformanceMonitor.startOperation("Order Submission Thread");

    TransactionDemarcation td = new TransactionDemarcation();

    try
    {
      td.begin(settings.get().getTransactionManager(), TransactionDemarcation.REQUIRED);
    }
    catch (TransactionDemarcationException tde)
    {
      if(mLogger.isLoggingError())
        mLogger.logError(tde);
      return;
    }
    //if we had an error beginning the transaction, we wont get to
    //this point
    invokeUpdateOrderStateProc(SiebelOrderStates.SIEBEL_PROCESSING);

    //end the transaction
    try
    {
      td.end();
    }
    catch (TransactionDemarcationException tde)
    {
      if(mLogger.isLoggingError())
        mLogger.logError(tde);
    }

    if(getOrder() !=null
            && getInput() !=null)
    {
      syncOrderToSiebel();
    }

    PerformanceMonitor.endOperation("Order Submission Thread");
  }

  /**
   * bypasses the port pool interface and syncs the order in it's own port to avoid the synchronized block
   */
  private void syncOrderToSiebel()
  {
    TransactionDemarcation td = new TransactionDemarcation();

    try
    {
      td.begin(settings.get().getTransactionManager(), TransactionDemarcation.REQUIRED);
    }
    catch (TransactionDemarcationException tde)
    {
      if(mLogger.isLoggingError())
        mLogger.logError(tde);
      return;
    }

    try
    {

      settings.get().getWebServiceHelper().prepareConnection((BindingProvider) settings.get().getQuotingPort());

      ExecuteQuotingOutput output = null;

      try
      {
        output = settings.get().getQuotingPort().executeQuoting(getInput());
      }
      catch(javax.xml.ws.soap.SOAPFaultException sfe)
      {
        if(mLogger.isLoggingError())
          mLogger.logError("Error submitting order " + mOrder.getId()
                  + " in Thread ID "
                  + Thread.currentThread().getId() + sfe);
        invokeUpdateOrderStateProc(SiebelOrderStates.SIEBEL_ERROR);
        return;
      }

      //make sure submission was successful
      if(output==null)
      {
        if(mLogger.isLoggingError())
          mLogger.logError("Null response from Siebel for order " + mOrder.getId()
                  + "in Thread ID "
                  + Thread.currentThread().getId());
        invokeUpdateOrderStateProc(SiebelOrderStates.SIEBEL_ERROR);
        return;
      }

      //if we've gotten this far, we can assume a successful sync to Siebel, so we can set the order state to SUBMITTED
      // if not, the state will stay SIEBEL_PROCESSING, and will be picked up by the cleanup service

      invokeUpdateOrderStateProc(SiebelOrderStates.SUBMITTED);

    }
    finally
    {
      //end the transaction
      try
      {
        td.end();
      }
      catch (TransactionDemarcationException tde)
      {
        if(mLogger.isLoggingError())
          mLogger.logError(tde);
      }
    }
  }


  /**
   * invokes the stored proc to update the order state
   *
   * @param pState
   */
  private void invokeUpdateOrderStateProc(String pState)
  {
    PerformanceMonitor.startOperation("Invoking order state stored procedure");

    java.sql.Connection c = null;
    CallableStatement cs = null;

    try
    {
      c = ((GSARepository)settings.get().getOrderRepository()).getDataSource().getConnection();
      cs = c.prepareCall("{ call UPDATE_ORDER_STATE (?,?) }");
      cs.setString(1, getOrder().getId());
      cs.setString(2, pState);
      cs.executeUpdate();
    }
    catch (SQLException e)
    {
      if(mLogger.isLoggingError())
        mLogger.logError(e);

      //mark any transaction as roll-back
      try
      {
        if(settings.get().getTransactionManager().getStatus()== Status.STATUS_ACTIVE)
        {
          settings.get().getTransactionManager().setRollbackOnly();
        }
      }
      catch (SystemException se)
      {
        if(mLogger.isLoggingError())
          mLogger.logError(se);
      }
    }
    finally
    {
      //close the connection
      try
      {
        cs.close();
        c.close();
      }
      catch (SQLException e)
      {
        if(mLogger.isLoggingError())
          mLogger.logError(e);
      }
    }

    PerformanceMonitor.endOperation("Invoking order state stored procedure");
  }

}
