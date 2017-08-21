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
  <!-- single-page-renderer.jsp -->
  <dsp:getvalueof param="commerceItemId" var="commerceItemId" /> 
   
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
        <dsp:param name="key" value="${commerceItemId}" />
      </dsp:include>
  
      
        <dsp:form id="updateUI" method="post">
          <dsp:input id="nodeIndex" type="hidden" bean="ProductUpdateFormHandler.index" 
            value=""/>
            
          <dsp:input type="hidden" value="" bean="ProductUpdateFormHandler.updateUINodeByIndex" 
            priority="-10"/>
            
          <dsp:input id="nodeValue" type="hidden" bean="ProductUpdateFormHandler.nodeValue" 
            value=""/>
            
          <dsp:input id="key" type="hidden" bean="ProductUpdateFormHandler.key" 
            value="${commerceItemId}"/>
            
          <dsp:input id="updateSuccessURL" type="hidden" bean="ProductUpdateFormHandler.updateSuccessURL" 
            value="${pageContext.request.requestURI}?commerceItemId=${commerceItemId}"/>  
            <dsp:input type="hidden" bean="ProductUpdateFormHandler.updateErrorURL" value="/siebel/configurator/configurator_test_setup.jsp"/>
          
        </dsp:form>
        
        <dsp:form id="removeChild" method="post">
          <dsp:input id="removeNodeIndex" type="hidden" bean="ProductUpdateFormHandler.index" 
            value=""/>
            
          <dsp:input type="hidden" value="" bean="ProductUpdateFormHandler.deleteSelectedproducts" 
            priority="-10"/>
            
          <dsp:input type="hidden" bean="ProductUpdateFormHandler.key" 
            value="${commerceItemId}"/>
            
          <dsp:input type="hidden" bean="ProductUpdateFormHandler.updateSuccessURL" 
            value="${pageContext.request.requestURI}?commerceItemId=${commerceItemId}"/>  
          
          <dsp:input type="hidden" bean="ProductUpdateFormHandler.updateErrorURL" value="/siebel/configurator/configurator_test_setup.jsp"/>
          
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
        
        <dsp:form action="${pageContext.request.requestURI}?commerceItemId=${commerceItemId}" method="post" id="endConfig">  
          <dsp:input type="submit" bean="/atg/siebel/configurator/ui/ConfigurationFormHandler.endConfiguration" value="End Configuration"/>
          <dsp:input type="hidden" bean="/atg/siebel/configurator/ui/ConfigurationFormHandler.endConfigPromotionSuccessURL" value="/siebel/configurator/view_cart.jsp"/>
          <dsp:input type="hidden" bean="/atg/siebel/configurator/ui/ConfigurationFormHandler.endConfigErrorURL" value="/siebel/configurator/configurator_test_setup.jsp"/>
          <dsp:input type="hidden" bean="/atg/siebel/configurator/ui/ConfigurationFormHandler.endConfigCardinalityErrorURL" value="${pageContext.request.requestURI}?commerceItemId=${commerceItemId}"/>
        </dsp:form> 
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
<%-- @version $Id: //product/Siebel/version/11.2/j2ee/siebel.war/configurator/renderer/single-page-renderer.jsp#1 $$Change: 1186180 $--%>
