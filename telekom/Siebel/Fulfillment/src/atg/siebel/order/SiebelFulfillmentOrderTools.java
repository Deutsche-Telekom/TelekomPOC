package atg.siebel.order;

import atg.adapter.gsa.GSARepository;
import atg.commerce.CommerceException;
import atg.commerce.order.Order;
import atg.nucleus.ServiceException;
import atg.repository.*;
import atg.service.scheduler.Schedulable;
import atg.service.scheduler.Schedule;
import atg.service.scheduler.ScheduledJob;
import atg.service.scheduler.Scheduler;
import atg.siebel.order.submit.SiebelOrderSubmissionThread;
import atg.siebel.order.submit.SiebelOrderSubmitterThreadPoolHolder;
import atg.siebel.states.SiebelOrderStates;
import com.siebel.ordermanagement.quote.quoting.ExecuteQuotingInput;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ExecutorService;

/**
 * Order tools class to submit orders to Siebel
 *
 * @author Gary McDowell
 * @version $Id:
 *          //product/Siebel/main/src/atg/siebel/order/SiebelOrderTools.java#34
 *          $$Change: 1196386 $
 * @updated $DateTime: 2015/09/16 02:36:50 $$Author: saysyed $
 */
public class SiebelFulfillmentOrderTools extends SiebelOrderTools implements Schedulable
{
  public static String CLASS_VERSION =
          "$Id: //product/Siebel/version/11.2/Fulfillment/src/atg/siebel/order/SiebelFulfillmentOrderTools.java#3 $$Change: 1196386 $";


  protected SiebelOrderSubmitterThreadPoolHolder mThreadPoolHolder;

  public void setThreadPoolHolder(SiebelOrderSubmitterThreadPoolHolder pThreadPoolHolder)
  {
    mThreadPoolHolder = pThreadPoolHolder;
  }

  public SiebelOrderSubmitterThreadPoolHolder getThreadPoolHolder()
  {
    return mThreadPoolHolder;
  }

  protected SiebelOrderManager mOrderManager;

  public SiebelOrderManager getOrderManager() {
    return mOrderManager;
  }

  public void setOrderManager(SiebelOrderManager pOrderManager) {
    mOrderManager = pOrderManager;
  }

  protected Scheduler mSheduler;

  public Scheduler getScheduler ()
  {
    return mSheduler;
  }

  public void setScheduler (Scheduler scheduler)
  {
    mSheduler = scheduler;
  }

  Schedule mSchedule;
  public Schedule getSchedule ()
  {
    return mSchedule;
  }
  public void setSchedule (Schedule schedule)
  {
    mSchedule = schedule;
  }

  int jobId;
  public void doStartService ()
  {
    super.doStartService();
    ScheduledJob job = new ScheduledJob ("resubmitSiebelProcessingOrders",
            "Re-submits orders to Siebel",
            getAbsoluteName (),
            getSchedule (),
            this,
            ScheduledJob.SEPARATE_THREAD);
    jobId = getScheduler ().addScheduledJob (job);
  }

  public void doStopService () throws ServiceException
  {
    getScheduler ().removeScheduledJob (jobId);
    super.doStopService();
  }

  /**
   * the max number of rows to return when querying for unsubmitted orders. Adjust this according to
   * SiebelOrderSubmitterThreadPoolHolder thread pool size, number of Fulfillment servers and Job Schedule, and
   * order throughput
   */
  protected int mMaxQuerySize = 10;

  public int getMaxQuerySize() {
    return mMaxQuerySize;
  }

  public void setMaxQuerySize(int pMaxQuerySize) {
    mMaxQuerySize = pMaxQuerySize;
  }


  protected boolean mUnsubmittedOrderServiceEnabled;

  public boolean isUnsubmittedOrderServiceEnabled()
  {
    return mUnsubmittedOrderServiceEnabled;
  }

  public void setUnsubmittedOrderServiceEnabled(boolean pUnsubmittedOrderServiceEnabled)
  {
    mUnsubmittedOrderServiceEnabled=pUnsubmittedOrderServiceEnabled;
  }

  /**
   * This is called when a scheduled job tied to this object occurs.
   *
   * @param pScheduler calling the job
   * @param pJob       the ScheduledJob
   */
  public void performScheduledTask(Scheduler pScheduler, ScheduledJob pJob)
  {
    if(!mUnsubmittedOrderServiceEnabled)
      return;

    List<Order> orders = null;
    try
    {
      orders = queryUnsubmittedOrders(getMaxQuerySize());
    }
    catch (RepositoryException e)
    {
      if(isLoggingError())
      {
        logError(e);
      }
    } catch (CommerceException e)
    {
      if(isLoggingError())
      {
        logError(e);
      }
    }

    if(orders==null||orders.isEmpty())
    {
      if(isLoggingDebug())
      {
        logDebug("no unsubmitted orders found");
      }
      return;
    }

    if(isLoggingDebug())
    {
      logDebug("retrieved " + orders.size() + " unsubmitted orders");
    }

    Iterator<Order> it = orders.iterator();

    while(it.hasNext())
    {
      final Order order = it.next();

      try
      {
        final ExecuteQuotingInput input = createSyncOrderInput(order);

        //kick off a thread from the pool
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
      catch (CommerceException e)
      {
        if(isLoggingError())
        {
          logError(e);
        }
      }
    }
  }

  /**
   * gets all the orders with state SIEBEL_PROCESSING with a result set of Max Size
   *
   * @param pMaxQuerySize
   * @return
   */
  public List<Order> queryUnsubmittedOrders(int pMaxQuerySize) throws RepositoryException, CommerceException {

    GSARepository orderRepository = (GSARepository) getOrderRepository();

    RepositoryView orderRepositoryView = orderRepository.getView(getOrderItemDescriptorName());

    QueryBuilder queryBuilder = orderRepositoryView.getQueryBuilder();

    QueryExpression stateProperty = queryBuilder.createPropertyQueryExpression(getOrderStatePropertyName());
    QueryExpression stateValue = queryBuilder.createConstantQueryExpression(SiebelOrderStates.SIEBEL_ERROR);

    Query query = queryBuilder.createComparisonQuery(stateProperty, stateValue, QueryBuilder.EQUALS);

    //execute the query
    RepositoryItem[] results = orderRepositoryView.executeQuery(query, new QueryOptions(0, pMaxQuerySize, null, null));

    if(results==null || results.length==0)
    {
      return null;
    }

    //load all the orders into a list
    List<Order> orders = new LinkedList<Order>();
    List<String> ids = new LinkedList<String>();

    for(RepositoryItem item : results)
    {
      ids.add(item.getRepositoryId());
    }

    orders = getOrderManager().loadOrders(ids);

    return orders;
  }
}
