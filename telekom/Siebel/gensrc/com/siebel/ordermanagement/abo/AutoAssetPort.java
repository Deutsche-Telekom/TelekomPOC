
package com.siebel.ordermanagement.abo;

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
@WebService(name = "AutoAssetPort", targetNamespace = "http://siebel.com/OrderManagement/ABO")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    com.siebel.ordermanagement.order.data.ObjectFactory.class,
    com.siebel.ordermanagement.abo.ObjectFactory.class,
    com.siebel.ordermanagement.asset.data.ObjectFactory.class,
    com.siebel.ordermanagement.quote.data.ObjectFactory.class
})
public interface AutoAssetPort {


    /**
     * 
     * @param autoAssetInput
     * @return
     *     returns com.siebel.ordermanagement.abo.AutoAssetOutput
     */
    @WebMethod(operationName = "AutoAsset", action = "document/http://siebel.com/OrderManagement/ABO:AutoAsset")
    @WebResult(name = "AutoAsset_Output", targetNamespace = "http://siebel.com/OrderManagement/ABO", partName = "AutoAsset_Output")
    public AutoAssetOutput autoAsset(
        @WebParam(name = "AutoAsset_Input", targetNamespace = "http://siebel.com/OrderManagement/ABO", partName = "AutoAsset_Input")
        AutoAssetInput autoAssetInput);

}
