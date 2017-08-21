<%@ taglib prefix="dsp"
  uri="http://www.atg.com/taglibs/daf/dspjspTaglib1_0"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="dspel"
  uri="http://www.atg.com/taglibs/daf/dspjspELTaglib1_0"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>


<dsp:importbean
  bean="/atg/siebel/configurator/ui/ProductUpdateFormHandler"
  var="formHandler" />
  <dsp:importbean bean="/atg/siebel/configurator/ui/ConfigurationFormHandler"/> 
  <dsp:importbean bean="/atg/commerce/ShoppingCart" />


<dsp:page>
  <!-- multi-page-renderer.jsp -->
  <dsp:getvalueof param="commerceItemId" var="commerceItemId" />
  <dsp:getvalueof param="index" var="index" />
  
      
  
      <dsp:droplet name="/atg/siebel/configurator/ui/GetNextProductKeyDroplet">
        <dsp:param value="${commerceItemId}" name="commerceItemId" />
        <dsp:param value="${index}" name="index" />
        <dsp:oparam name="output">
          <dsp:getvalueof var="key" param="key"/>
          <dsp:getvalueof var="endConfig" param="endConfig"/>
          <dsp:getvalueof var="index" param="index"/>
        </dsp:oparam>
      </dsp:droplet>


    
<div style="position: absolute; top: 50px; left: 10px; z-index:1; width:80%">
		<span
			style="font: 16px arial, sans-serif; color: #FF0000; font-weight: bold">
			<dsp:getvalueof var="formExceptions"
				bean="ConfigurationFormHandler.formExceptions" /> <c:if
				test="${not empty formExceptions}">
                Unable to perform end configuration because of the following errors:
                <c:forEach items="${formExceptions}" var="error">
					<li>${error.message}</li>
				</c:forEach>
			</c:if>
		</span>
		<dsp:include page="uiNodeWrapperRenderer.jsp">
        <dsp:param name="key" value="${key}" />
      </dsp:include>
     
      
        <dsp:form id="updateUI" method="post">
          <dsp:input id="nodeIndex" type="hidden" bean="ProductUpdateFormHandler.index" 
            value=""/>
            
          <dsp:input type="hidden" value="" bean="ProductUpdateFormHandler.updateUINodeByIndex" 
            priority="-10"/>
            
          <dsp:input id="nodeValue" type="hidden" bean="ProductUpdateFormHandler.nodeValue" 
            value=""/>
            
          <dsp:input id="key" type="hidden" bean="ProductUpdateFormHandler.key" 
            value="${key}"/>
            
          <dsp:input id="updateSuccessURL" type="hidden" bean="ProductUpdateFormHandler.updateSuccessURL" 
            value="${pageContext.request.requestURI}?commerceItemId=${commerceItemId}&index=${index}"/>  
          
        </dsp:form>
        
        <dsp:form id="removeChild" method="post">
          <dsp:input id="removeNodeIndex" type="hidden" bean="ProductUpdateFormHandler.index" 
            value=""/>
            
          <dsp:input type="hidden" value="" bean="ProductUpdateFormHandler.deleteSelectedproducts" 
            priority="-10"/>
            
          <dsp:input type="hidden" bean="ProductUpdateFormHandler.key" 
            value="${key}"/>
            
          <dsp:input type="hidden" bean="ProductUpdateFormHandler.updateSuccessURL" 
            value="${pageContext.request.requestURI}?commerceItemId=${commerceItemId}&index=${index}"/>  
          
        </dsp:form>
        
        <script type="text/javascript">
        
          function updateUINode(index, nodeValue)
          {
        	  form = document.getElementById('updateUI');
        	  
        	   
            document.getElementById('nodeIndex').value=index;
            document.getElementById('nodeValue').value=nodeValue;
            
            form.submit();
          }
          
          function removeChildProduct(index)
          {
            document.getElementById('removeNodeIndex').value=index;
            
            document.getElementById('removeChild').submit();
          }

        </script>
        
        <dsp:include page="navigationButtons.jsp">
          <dsp:param name="endConfig" value="${endConfig}" />
          <dsp:param name="commerceItemId" value="${commerceItemId}" />
          <dsp:param name="index" value="${index}" />
        </dsp:include>
   </div>
   
    <div class="cart" style="position: relative; bottom: 10px; left: 40px; z-index:2">
      
      <table style="background-color:#00FFFF; border:1px solid; border-color:#5C4A56">
      <tr>
      <td>
        <dsp:getvalueof var="order" bean="ShoppingCart.current" />

        Show Cart
        <div>
          <h4 style="font:30px arial,sans-serif;color:#335C64">Shopping Cart Contents</h4>
          <h4 style="font:16px arial,sans-serif;color:#B25538">
            Order ID =
          <dsp:valueof value="${order.id }" />
          </h4>
          
          <c:forEach items="${order.commerceItems}" var="commerceItem">
          <dsp:include src="../show_cart.jsp">
            <dsp:param name="commerceItem" value="${commerceItem }" />
          </dsp:include>
          </c:forEach>
        </div>
      </td>
      </tr> 
      </table>
      </div>  
</dsp:page>
<%-- @version $Id: //product/Siebel/version/11.2/j2ee/siebel.war/configurator/renderer/multi-page-renderer.jsp#1 $$Change: 1186180 $--%>
