<%@ taglib prefix="dsp"
  uri="http://www.atg.com/taglibs/daf/dspjspTaglib1_0"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="dspel"
  uri="http://www.atg.com/taglibs/daf/dspjspELTaglib1_0"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<dsp:page>
  
  <head>
    <link href="../general.css" rel="stylesheet" type="text/css">
    <link href="../checkout/checkout.css" rel="stylesheet" type="text/css">
  </head>

  <dsp:include page="../navigation.jsp"/>

  <dsp:importbean bean="/atg/commerce/order/purchase/CartModifierFormHandler" />
  <dsp:importbean var="shoppingCart" bean="/atg/commerce/ShoppingCart" />
  <dsp:importbean bean="/atg/userprofiling/Profile" />
  <dsp:importbean bean="/atg/siebel/configurator/spu/generation/GenerateProductUIFormHandler" />
  <dsp:importbean bean="/atg/siebel/configurator/ui/CreateProductConfigInstance"/>
  <dsp:importbean bean="/atg/siebel/configurator/ui/GetPromotionTemplate"/>
  <dsp:getvalueof param="errorMessage" var="errorMessage"/>
  
  <c:if test="${not empty errorMessage}">
  <b style="color:#FE1A00">${errorMessage}</b>
  </c:if>
  
    
  <span class="errortext">
            <dsp:droplet name="/atg/dynamo/droplet/ErrorMessageForEach"> 
             <dsp:param name="exceptions" bean="CartModifierFormHandler.formExceptions"/> 
             <dsp:oparam name="output"> 
             <b> 
             <dsp:valueof param="message"/> 
             </b> 
             <p> 
             </dsp:oparam> 
            </dsp:droplet> 
			<!--  if the PCI is invalidated while user was configuring someother product in same session -->
			<dsp:getvalueof var="pUFHformExceptions" bean="/atg/siebel/configurator/ui/ProductUpdateFormHandler.formExceptions" />
  			<dsp:getvalueof var="cFHformExceptions" bean="/atg/siebel/configurator/ui/ConfigurationFormHandler.formExceptions" /> 
			<c:if test="${(not empty pUFHformExceptions) || (not empty cFHformExceptions)}">
				This product is already configured, please try again.
			</c:if>
	</span>
  
  <h1>Add To Cart</h1>
  <dsp:getvalueof var="anonymousUser" bean="Profile.transient" />  
  <table>  
    <tr>
      <td>
        <h3>Add a promotion to your shopping cart</h3>
  
        <dsp:form action="${pageContext.request.requestURI}" method="post">
          <dsp:select bean="CartModifierFormHandler.productId">
            <dsp:droplet name="/atg/dynamo/droplet/RQLQueryForEach">
              <dsp:param bean="/atg/commerce/catalog/ProductCatalog" name="repository"/>
              <dsp:param name="itemDescriptor" value="product"/>
              <dsp:param name="queryRQL" value="siebelType=1004 ORDER BY displayName"/>
              <dsp:oparam name="output">
                <dsp:tomap param="element" var="elementItem"/>
                <dsp:option value="${elementItem.id}">${elementItem.displayName}</dsp:option>
              </dsp:oparam>
            </dsp:droplet>
          </dsp:select>
          <dsp:input bean="CartModifierFormHandler.quantity" type="hidden" value="1" />
          <dsp:input bean="CartModifierFormHandler.addItemToOrderSuccessURL" type="hidden"
                     value="/siebel/configurator/promotion_edit_template.jsp" />
          <dsp:input bean="CartModifierFormHandler.addItemToOrderErrorURL" type="hidden"
                     value="/siebel/configurator/configurator_test_setup.jsp" />           
          <dsp:input bean="CartModifierFormHandler.catalogRefIds" type="hidden" value="88-2EZSH" />
          <dsp:input bean="GetPromotionTemplate.url" type="hidden" value="/siebel/configurator/configurator_test_setup.jsp"/>
          <dsp:input bean="CartModifierFormHandler.addItemToOrder" type="submit" value="Choose Products" />
          <c:if test="${anonymousUser == true}">
		    <br><br>
		    Postal Code: <dsp:input bean="CartModifierFormHandler.postalCode" type="text"/>
		  </c:if>
        </dsp:form>
        <br>
      </td>
    </tr>

    <tr>
      <td>  
        <h3>Add a configurable product to the cart</h3>
  
        <dsp:form action="${pageContext.request.requestURI}" method="post" id="CPForm">
          <dsp:select bean="CartModifierFormHandler.productId">
            <dsp:droplet name="/atg/dynamo/droplet/RQLQueryForEach">
              <dsp:param bean="/atg/commerce/catalog/ProductCatalog" name="repository"/>
              <dsp:param name="itemDescriptor" value="product"/>
              <dsp:param name="queryRQL" 
                         value="siebelType=1000 OR siebelType=1001 OR siebelType=1002 OR siebelType=1003 ORDER BY displayName"/>
              <dsp:oparam name="output">
                <dsp:tomap param="element" var="elementItem"/>
                <dsp:option value="${elementItem.id}">${elementItem.displayName}</dsp:option>
              </dsp:oparam>
            </dsp:droplet>
          </dsp:select>

          <dsp:input bean="CartModifierFormHandler.quantity" type="hidden" value="1" />

          <dsp:input bean="CartModifierFormHandler.catalogRefIds" type="hidden" value="88-2EZSH" />
          <dsp:input id="successURL" bean="CartModifierFormHandler.addItemToOrderSuccessURL"
                     type="hidden" value="/siebel/configurator/renderer/stand-alone-product.jsp" />
          <dsp:input id="nonConfigSuccessURL" bean="CartModifierFormHandler.addNonConfigurableItemToOrderSuccessUrl"
                     type="hidden" value="/siebel/configurator/view_cart.jsp"/>             
		  <dsp:input bean="CartModifierFormHandler.addItemToOrderErrorURL" type="hidden"
                     value="/siebel/configurator/configurator_test_setup.jsp" />
          <dsp:input bean="CreateProductConfigInstance.url" type="hidden" value="/siebel/configurator/configurator_test_setup.jsp"/>           
          <dsp:input type="hidden" value="" bean="CartModifierFormHandler.addItemToOrder" 
                     priority="-10"/>
          <button onclick="submitCP();">Configure Product</button>
        </dsp:form>
        <br>
      </td>
    </tr>
  </table>
  <br>
  
 <h1>Developer Tools</h1>

  <table>
    <tr>
      <td>  
        <h3>Add a configurable product to the cart</h3>
  
        <dsp:form action="${pageContext.request.requestURI}" method="post" id="CPForm">
          <dsp:select bean="CartModifierFormHandler.productId">
            <dsp:droplet name="/atg/dynamo/droplet/RQLQueryForEach">
              <dsp:param bean="/atg/commerce/catalog/ProductCatalog" name="repository"/>
              <dsp:param name="itemDescriptor" value="product"/>
              <dsp:param name="queryRQL" 
                         value="siebelType=1000 OR siebelType=1001 OR siebelType=1002 OR siebelType=1003 ORDER BY displayName"/>
              <dsp:oparam name="output">
                <dsp:tomap param="element" var="elementItem"/>
                <dsp:option value="${elementItem.id}">${elementItem.displayName}</dsp:option>
              </dsp:oparam>
            </dsp:droplet>
          </dsp:select>

          <dsp:input bean="CartModifierFormHandler.quantity" type="hidden" value="1" />

          <dsp:input bean="CartModifierFormHandler.catalogRefIds" type="hidden" value="88-2EZSH" />
          <dsp:input id="successURL" bean="CartModifierFormHandler.addItemToOrderSuccessURL"
                     type="hidden" value="/siebel/configurator/test/cp_edit_template.jsp" /> 
          <dsp:input id="nonConfigSuccessURL" bean="CartModifierFormHandler.addNonConfigurableItemToOrderSuccessUrl"
                     type="hidden" value="/siebel/configurator/view_cart.jsp"/>      
          <dsp:input type="hidden" value="" bean="CartModifierFormHandler.addItemToOrder" 
                     priority="-10"/>
          <button onclick="submitTest();">Configure without SPU (TEST)</button>    
        </dsp:form>
        <br>
      </td>
    </tr>
    <tr>
      <td>  
        <h3>Generate a UI for product</h3>

        <dsp:form action="${pageContext.request.requestURI}" method="post">
          <dsp:input bean="GenerateProductUIFormHandler.productId" type="text"/>
          <dsp:input bean="GenerateProductUIFormHandler.generateUI" type="submit" value="Generate UI" />
        </dsp:form>
        <br>
      </td>
    </tr>
  
    <tr>
      <td>
        <h3>Clear order</h3>
        <dsp:form action="${pageContext.request.requestURI}" method="post">
          <dsp:input bean="ShoppingCart.handlerOrderId" type="hidden" value="${shoppingCart.current.id }"/>
          <dsp:input bean="ShoppingCart.delete" type="submit" />
        </dsp:form>
      </td>
    </tr>
  </table>
  <br>
  <table>
  <tr>
   <th>
   Test Eligibility and Compatibility Rules
   </th>
  </tr>
  <tr>
   <td>
    <a href="../product/testEligibilityRule.jsp">Test Eligibility Rule</a>
   </td>
  </tr>
  <tr>
   <td>
    <a href="../product/testCompatibilityRule.jsp">Test Compatibility Rule</a><br><br>
   </td>
  </tr>
  </table>
  <script type="text/javascript">

    function submitTest()
    {
      document.getElementById('successURL').value='/siebel/configurator/test/cp_edit_template.jsp';
      document.getElementById('CPForm').submit();
    }
              
    function submitCP()
    {
      document.getElementById('CPForm').submit();
    }

  </script>
</dsp:page>
<%-- @version $Id: //product/Siebel/version/11.2/j2ee/siebel.war/configurator/configurator_test_setup.jsp#2 $$Change: 1190593 $--%>
<%-- @version $Id: //product/Siebel/version/11.2/j2ee/siebel.war/configurator/configurator_test_setup.jsp#2 $$Change: 1190593 $--%>
