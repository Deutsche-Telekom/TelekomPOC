<%@ taglib prefix="dsp"
	uri="http://www.atg.com/taglibs/daf/dspjspTaglib1_0"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<dsp:page>
  <dsp:importbean
		bean="/atg/commerce/order/purchase/CartModifierFormHandler" />

  <head>
    <link href="../general.css" rel="stylesheet" type="text/css">
  </head>

  <dsp:include page="../navigation.jsp"/>
  
  <h1>Product Search</h1>
   <dsp:getvalueof param="errorMessage" var="errorMessage"/>
  
  <c:if test="${not empty errorMessage}">
  <b style="color:#FE1A00">${errorMessage}</b>
  </c:if>
  
   <b style="color:#FE1A00">
            <dsp:droplet name="/atg/dynamo/droplet/ErrorMessageForEach"> 
             <dsp:param name="exceptions" bean="CartModifierFormHandler.formExceptions"/> 
             <dsp:oparam name="output"> 
             <b> 
             <dsp:valueof param="message"/> 
             </b> 
             <p> 
             </dsp:oparam> 
            </dsp:droplet> 
     </b>     
     
     
    
    <table class="firstcolumnbold">
      <tr>
        <td>Select a promotion</td>
      <tr/>
      
      
          <dsp:droplet name="/atg/dynamo/droplet/RQLQueryForEach">
            <dsp:param bean="/atg/commerce/catalog/ProductCatalog"
              name="repository" />
            <dsp:param name="itemDescriptor" value="product" />
            <dsp:param name="queryRQL"
              value="siebelType=1004 ORDER BY displayName" />
            <dsp:oparam name="output">
              <dsp:tomap param="element" var="elementItem" />
              <tr>
                <td>
              <dsp:form action="product_detail.jsp" method="POST">
              <dsp:input bean="CartModifierFormHandler.productId" type="submit" value="${elementItem.id}">${elementItem.displayName}</dsp:input>
              </dsp:form>
                </td>
              </tr>
            </dsp:oparam>
          </dsp:droplet>
      
    </table>
    <br>
  
  
  <dsp:form action="product_detail.jsp" method="POST">
		<table class="firstcolumnbold">
      	<tr>
			<td>Select a product:</td>
			<td>
				<dsp:select bean="CartModifierFormHandler.productId">
					<dsp:droplet name="/atg/dynamo/droplet/RQLQueryForEach">
						<dsp:param bean="/atg/commerce/catalog/ProductCatalog"
							name="repository" />
						<dsp:param name="itemDescriptor" value="product" />
						<dsp:param name="queryRQL"
							value="siebelType=1000 OR siebelType=1001 OR siebelType=1002 OR siebelType=1003 OR siebelType=1004 ORDER BY displayName" />
						<dsp:oparam name="output">
							<dsp:tomap param="element" var="elementItem" />
							<dsp:option value="${elementItem.id}">${elementItem.displayName}</dsp:option>
						</dsp:oparam>
					</dsp:droplet>
				</dsp:select>
			</td>
		</tr>
		</table>
		<br>
		<input type="submit" value="Show product details"/>
	</dsp:form>

  <br> OR <br>  
  <dsp:form action="product_detail.jsp" method="POST">
  	<table class="firstcolumnbold">
      <tr>
        <td>Enter a product id:</td>
        <td><dsp:input type="text" bean="CartModifierFormHandler.productId" size="30" /></td>
      </tr>		  
    </table>
    <br>	 
    <input type="submit" value="Show product details"/>
  </dsp:form>
		
</dsp:page>
<%-- @version $Id: //product/Siebel/version/11.2/j2ee/siebel.war/product/product_search.jsp#2 $$Change: 1190593 $--%>
