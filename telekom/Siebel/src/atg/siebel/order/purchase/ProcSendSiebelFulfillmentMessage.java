package atg.siebel.order.purchase;

import atg.commerce.order.InvalidParameterException;
import atg.commerce.order.Order;
import atg.commerce.order.PipelineConstants;
import atg.commerce.order.processor.ProcSendFulfillmentMessage;
import atg.core.util.ResourceUtils;
import atg.repository.RepositoryItem;
import atg.service.pipeline.PipelineResult;
import atg.siebel.order.SiebelOrderTools;
import atg.siebel.order.SiebelSubmitOrder;
import com.siebel.ordermanagement.quote.quoting.ExecuteQuotingInput;

import java.io.Serializable;
import java.util.HashMap;

/**
 * Created by gamcdowe on 20/05/2015.
 */
public class ProcSendSiebelFulfillmentMessage extends ProcSendFulfillmentMessage
{
  static final String MY_RESOURCE_NAME = "atg.commerce.order.OrderResources";

  /** Resource Bundle **/
  private static java.util.ResourceBundle sResourceBundle = atg.core.i18n.LayeredResourceBundle.getBundle(MY_RESOURCE_NAME, atg.service.dynamo.LangLicense.getLicensedDefault());

  protected SiebelOrderTools mOrderTools;

  public SiebelOrderTools getOrderTools()
  {
    return mOrderTools;
  }

  public void setOrderTools(SiebelOrderTools pOrderTools)
  {
    mOrderTools=pOrderTools;
  }


  public Serializable createEventToSend(Object pParam, PipelineResult pResult)
          throws Exception
  {
    // We don't need to check anything here, we can just send the message on.
    HashMap map = (HashMap) pParam;
    Order order = (Order) map.get(PipelineConstants.ORDER);

    if (order == null)
      throw new InvalidParameterException(ResourceUtils.getMsgResource("InvalidOrderParameter",
              MY_RESOURCE_NAME, sResourceBundle));

    // We know the order is good since createEventToSend would throw an exception if the order
    // wasn't there.  Construct the SubmitOrder message and return it.  <TBD> we should think
    // about the id of the message.  I don't know how we are doing that right now.
    SiebelSubmitOrder soMessage = new SiebelSubmitOrder();
    soMessage.setOrder(order);
    soMessage.setSource(getMessageSourceName());
    soMessage.setId(getNextMessageId());
    soMessage.setOriginalSource(getMessageSourceName());
    soMessage.setOriginalId(soMessage.getId());

    RepositoryItem profile = getProfileTools().getProfileForOrder(order);
    soMessage.setProfile(profile);
    soMessage.setSiteId(getSiteId(pParam));

    ExecuteQuotingInput input = getOrderTools().createSyncOrderInput(order);

    soMessage.setSyncQuoteInput(input);

    return soMessage;
  }
}
