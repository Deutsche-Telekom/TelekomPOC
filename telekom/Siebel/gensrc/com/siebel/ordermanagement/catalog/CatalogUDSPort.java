
package com.siebel.ordermanagement.catalog;

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
@WebService(name = "CatalogUDSPort", targetNamespace = "http://siebel.com/OrderManagement/Catalog")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    com.siebel.ordermanagement.catalog.data.relatedproducts.ObjectFactory.class,
    com.siebel.ordermanagement.catalog.data.productattributedomain.ObjectFactory.class,
    com.siebel.ordermanagement.catalog.data.catalog.ObjectFactory.class,
    com.siebel.ordermanagement.catalog.data.searchableproductclass.ObjectFactory.class,
    com.siebel.ordermanagement.catalog.data.catalogcontext.ObjectFactory.class,
    com.siebel.ordermanagement.catalog.data.product.ObjectFactory.class,
    com.siebel.ordermanagement.catalog.data.udspublishcatalog.data.ObjectFactory.class,
    com.siebel.ordermanagement.catalog.data.productchildren.ObjectFactory.class,
    com.siebel.ordermanagement.catalog.data.productclassattributes.ObjectFactory.class,
    com.siebel.ordermanagement.catalog.data.productdetails.ObjectFactory.class,
    com.siebel.ordermanagement.catalog.data.categories.ObjectFactory.class,
    com.siebel.ordermanagement.catalog.data.udspublishcatalog.query.ObjectFactory.class,
    com.siebel.ordermanagement.catalog.ObjectFactory.class,
    com.siebel.ordermanagement.catalog.data.category.ObjectFactory.class,
    com.siebel.ordermanagement.catalog.data.categoryproduct.ObjectFactory.class,
    com.siebel.ordermanagement.catalog.data.relatedpromotions.ObjectFactory.class,
    com.siebel.ordermanagement.catalog.data.publishcatalog.ObjectFactory.class
})
public interface CatalogUDSPort {


    /**
     * 
     * @param catalogQueryPageInput
     * @return
     *     returns com.siebel.ordermanagement.catalog.CatalogQueryPageOutput
     */
    @WebMethod(operationName = "CatalogQueryPage", action = "document/http://siebel.com/OrderManagement/Catalog:CatalogQueryPage")
    @WebResult(name = "CatalogQueryPage_Output", targetNamespace = "http://siebel.com/OrderManagement/Catalog", partName = "CatalogQueryPage_Output")
    public CatalogQueryPageOutput catalogQueryPage(
        @WebParam(name = "CatalogQueryPage_Input", targetNamespace = "http://siebel.com/OrderManagement/Catalog", partName = "CatalogQueryPage_Input")
        CatalogQueryPageInput catalogQueryPageInput);

}
