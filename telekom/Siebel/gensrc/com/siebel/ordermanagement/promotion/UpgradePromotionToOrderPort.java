
package com.siebel.ordermanagement.promotion;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.1-b03-
 * Generated source version: 2.1
 * 
 */
@WebService(name = "UpgradePromotionToOrderPort", targetNamespace = "http://siebel.com/OrderManagement/Promotion")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    com.siebel.ordermanagement.quote.data.ObjectFactory.class,
    com.siebel.ordermanagement.order.data.ObjectFactory.class,
    com.siebel.ordermanagement.catalog.data.catalogcontext.ObjectFactory.class,
    com.siebel.ordermanagement.catalog.data.product.ObjectFactory.class,
    com.siebel.ordermanagement.promotion.ObjectFactory.class,
    com.siebel.ordermanagement.promotion.data.ObjectFactory.class
})
public interface UpgradePromotionToOrderPort {


    /**
     * 
     * @param upgradePromotionToOrderInput
     * @return
     *     returns com.siebel.ordermanagement.promotion.UpgradePromotionToOrderOutput
     */
    @WebMethod(operationName = "UpgradePromotionToOrder", action = "document/http://siebel.com/OrderManagement/Promotion:UpgradePromotionToOrder")
    @WebResult(name = "UpgradePromotionToOrder_Output", targetNamespace = "http://siebel.com/OrderManagement/Promotion", partName = "UpgradePromotionToOrder_Output")
    public UpgradePromotionToOrderOutput upgradePromotionToOrder(
        @WebParam(name = "UpgradePromotionToOrder_Input", targetNamespace = "http://siebel.com/OrderManagement/Promotion", partName = "UpgradePromotionToOrder_Input")
        UpgradePromotionToOrderInput upgradePromotionToOrderInput);

}
