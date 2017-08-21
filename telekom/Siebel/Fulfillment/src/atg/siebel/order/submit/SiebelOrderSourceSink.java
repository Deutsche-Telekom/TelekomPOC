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

import atg.commerce.fulfillment.SubmitOrder;
import atg.commerce.messaging.CommerceMessage;
import atg.commerce.messaging.SourceSinkTemplate;
import atg.commerce.order.Order;
import atg.siebel.integration.WebServiceHelper;
import atg.siebel.order.SiebelSubmitOrder;
import com.siebel.ordermanagement.quote.quoting.ExecuteQuotingInput;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.ObjectMessage;
import java.util.concurrent.ExecutorService;

/**
 * This class is the Message Sink from Patch Bay which submits orders to Siebel after 
 * the order has been submitted to the commerce processOrder pipeline
 *
 * @author Gary McDowell
 * @version $Id: //product/Siebel/version/11.2/Fulfillment/src/atg/siebel/order/submit/SiebelOrderSourceSink.java#3 $$Change: 1196386 $
 * @updated $DateTime: 2015/09/16 02:36:50 $$Author: saysyed $
 */
public class SiebelOrderSourceSink extends SourceSinkTemplate
{
//----------------------------------------------------------------------------------
  // Class version string
  //----------------------------------------------------------------------------------

  public static String CLASS_VERSION = "$Id: //product/Siebel/version/11.2/Fulfillment/src/atg/siebel/order/submit/SiebelOrderSourceSink.java#3 $$Change: 1196386 $";

  protected SiebelOrderSubmitterThreadPoolHolder mThreadPoolHolder;

  public void setThreadPoolHolder(SiebelOrderSubmitterThreadPoolHolder pThreadPoolHolder)
  {
    mThreadPoolHolder = pThreadPoolHolder;
  }

  public SiebelOrderSubmitterThreadPoolHolder getThreadPoolHolder()
  {
    return mThreadPoolHolder;
  }

  protected WebServiceHelper mWebServiceHelper;
  /**
   * @return the mWebServiceHelper
   */
  public WebServiceHelper getWebServiceHelper()
  {
    return mWebServiceHelper;
  }

  /**
   * @param mWebServiceHelper the mWebServiceHelper to set
   */
  public void setWebServiceHelper(WebServiceHelper mWebServiceHelper)
  {
    this.mWebServiceHelper = mWebServiceHelper;
  }

  //-------------------------------------
  /**
   *
   * <p> This is called to notify the component that a Message has arrived through the given
   * input port.  The MessageSink should be prepared to handle concurrent calls of this method
   * from multiple Threads. This is left as an empty method in this class and should be
   * overriden by the implementor. </p>
   *
   * <p> receiveMessage can be extended to handle extra types of messages by overriding
   * the handleNewMessageType method. </p>
   *
   * @beaninfo
   *          description: This method is called whenever a new message is sent to this class.
   **/
  public void receiveMessage (String pPortName,
                              Message pMessage)
          throws JMSException
  {
    if(pMessage == null) {
      if(isLoggingError())
        logError("Message is null");
      return;
    }

    if(isLoggingDebug())
    {
      logDebug("recieved a message from processOrder pipeline");
      logDebug("portName = " + pPortName);
      logDebug("message = " + pMessage.toString());
    }


    ObjectMessage oMessage = (ObjectMessage) pMessage;
    if(!oMessage.getJMSType().equals(SubmitOrder.TYPE))
    {
      return;
    }

    CommerceMessage cMessage = (CommerceMessage) oMessage.getObject();
    if(cMessage == null) {
      if(isLoggingError())
        logError("Commerce message is null");
      return;
    }

    SiebelSubmitOrder submitOrderMessage = (SiebelSubmitOrder)cMessage;

    final Order order = submitOrderMessage.getOrder();
    final ExecuteQuotingInput input = submitOrderMessage.getSyncQuoteInput();

    ExecutorService threadPool = getThreadPoolHolder().getThreadPool();

    final SiebelOrderSubmissionThread submitThread = new SiebelOrderSubmissionThread();

    threadPool.execute(new Runnable(){
      public void run()
      {
        submitThread.setOrder(order);
        submitThread.setInput(input);
        submitThread.doSubmit();
      }
    });

  }

}
