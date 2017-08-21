
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
@WebService(name = "GetPromotionCommitmentsPort", targetNamespace = "http://siebel.com/OrderManagement/Promotion")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    com.siebel.ordermanagement.quote.data.ObjectFactory.class,
    com.siebel.ordermanagement.order.data.ObjectFactory.class,
    com.siebel.ordermanagement.catalog.data.catalogcontext.ObjectFactory.class,
    com.siebel.ordermanagement.catalog.data.product.ObjectFactory.class,
    com.siebel.ordermanagement.promotion.ObjectFactory.class,
    com.siebel.ordermanagement.promotion.data.ObjectFactory.class
})
public interface GetPromotionCommitmentsPort {


    /**
     * 
     * @param getPromotionCommitmentsInput
     * @return
     *     returns com.siebel.ordermanagement.promotion.GetPromotionCommitmentsOutput
     */
    @WebMethod(operationName = "GetPromotionCommitments", action = "document/http://siebel.com/OrderManagement/Promotion:GetPromotionCommitments")
    @WebResult(name = "GetPromotionCommitments_Output", targetNamespace = "http://siebel.com/OrderManagement/Promotion", partName = "GetPromotionCommitments_Output")
    public GetPromotionCommitmentsOutput getPromotionCommitments(
        @WebParam(name = "GetPromotionCommitments_Input", targetNamespace = "http://siebel.com/OrderManagement/Promotion", partName = "GetPromotionCommitments_Input")
        GetPromotionCommitmentsInput getPromotionCommitmentsInput);

}
