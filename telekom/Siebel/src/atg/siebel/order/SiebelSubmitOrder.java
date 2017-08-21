package atg.siebel.order;

import atg.commerce.fulfillment.SubmitOrder;
import com.siebel.ordermanagement.quote.quoting.ExecuteQuotingInput;

/**
 * Created by gamcdowe on 20/05/2015.
 */
public class SiebelSubmitOrder extends SubmitOrder
{
  protected ExecuteQuotingInput syncQuoteInput;

  public ExecuteQuotingInput getSyncQuoteInput()
  {
    return syncQuoteInput;
  }

  public void setSyncQuoteInput(ExecuteQuotingInput pInput)
  {
    syncQuoteInput=pInput;
  }
}
