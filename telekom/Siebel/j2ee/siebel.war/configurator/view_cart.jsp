<%@ taglib prefix="dsp"
  uri="http://www.atg.com/taglibs/daf/dspjspTaglib1_0"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


  <head>
    <link href="../general.css" rel="stylesheet" type="text/css">
    <link href="configurator.css" rel="stylesheet" type="text/css">
  </head>


<dsp:importbean bean="/atg/dynamo/droplet/ForEach" />
<dsp:importbean bean="/atg/commerce/ShoppingCart" />
<dsp:importbean bean="/atg/commerce/order/purchase/CartModifierFormHandler" />

<dsp:page>

  <dsp:include page="../navigation.jsp"/>

  <dsp:getvalueof var="order" bean="ShoppingCart.current"/>
  <dsp:getvalueof var="currentItemsCount" bean="ShoppingCart.current.commerceItemCount"/>
  
  <h1>Order Summary</h1>
  
  
  <%-- This duplicates the web service call for validating the order during checkout
      (if the order is not valid) but is necessary for when this page is accessed
      directly (not via checkout) or when item configuration is edited --%>
    <c:set var="validOrder">true</c:set>
    <dsp:droplet name="/atg/siebel/order/CheckoutValidationDroplet">
    <dsp:oparam name="orderNotValid">
      <c:set var="validOrder">false</c:set>
      <dsp:getvalueof var="errors" param="errors" />
    </dsp:oparam>
  </dsp:droplet>
  
    
  <c:set var="allRootProductsConfigured">true</c:set>

  <c:forEach items="${order.commerceItems}" var="commerceItem">
    <c:if test="${ not commerceItem.configured }">
      <c:set var="allRootProductsConfigured">false</c:set>
    </c:if>
  </c:forEach>
    
  <c:choose>
    <c:when test="${not validOrder or not allRootProductsConfigured}"> 
      <span class="errortext">
       <c:if test="${(currentItemsCount>0)}"> 
      There are problems with your order. Please fix the following:<br/>
      </c:if>
      <ul>

        <c:forEach items="${order.commerceItems}" var="commerceItem">
          <c:if test="${ not commerceItem.configured }">
            <li>
              <dsp:droplet name="/atg/targeting/RepositoryLookup">
                <dsp:param name="repository" bean="/atg/commerce/catalog/ProductCatalog"/>
                <dsp:param name="itemDescriptor" value="product"/>
                <dsp:param name="id" value="${commerceItem.auxiliaryData.productId }"/>
                <dsp:oparam name="output">
                  <dsp:tomap var="productMap" param="element"/>
                  Configuration of ${productMap.displayName } is incomplete.   
                </dsp:oparam>
              </dsp:droplet>
            </li>
          </c:if>
        </c:forEach> 
		    <c:if test="${not empty errors}">
		      <c:forEach items="${errors}" var="validationError">
		        <li>${validationError}</li>
		      </c:forEach>
		    </c:if>
      </ul>
      </span>		  
    </c:when>
  </c:choose>
  
  <c:set var="level" value="0"/>
 
  <dsp:droplet name="ForEach">
    <dsp:param bean="ShoppingCart.current.commerceItems" name="array"/>
    <dsp:setvalue param="commerceItem" paramvalue="element"/>
    <dsp:oparam name="outputStart">
      <table id="cart">  
        <tr>
          <th id="itemcol">Item</th>
          <th class="costcol">Action</th>
          <th class="costcol">Monthly</th>
          <th class="costcol">Cart Total</th>
          <th ></th>
          <th></th>
        </tr>
    </dsp:oparam>    
    
    <dsp:oparam name="outputEnd">
        <tr>
          <td></td>
          <td><h2>Total</h2></td>
          <td><h2>$${order.priceInfo.amount}</h2></td>
        </tr>
      </table>

      <br>
      <c:if test="${validOrder and allRootProductsConfigured}">
        <dsp:form>
          <dsp:input type="submit" value=" Proceed To Checkout " 
                     bean="CartModifierFormHandler.proceedToCheckout" priority="-10">
          </dsp:input>
        </dsp:form>
      </c:if>
    </dsp:oparam>
    
    <dsp:oparam name="empty">
    
    <span class="errortext">
      There are no items in the cart
    </span>
    
    </dsp:oparam>
    <dsp:oparam name="output">
  
      <dsp:include page="view_cart_item.jsp">
        <dsp:param name="commerceItem" param="commerceItem" />
        <dsp:param name="parentItemId" value="n/a" />
        <dsp:param name="indentlevel" value="${level}" />
        <dsp:param name="toBeConfigured" value="${not commerceItem.configured}" />
      </dsp:include>
      <tr><td>&nbsp;</td></tr>
    </dsp:oparam>  
  </dsp:droplet>
  
</dsp:page>
<%-- @version $Id: //product/Siebel/version/11.2/j2ee/siebel.war/configurator/view_cart.jsp#2 $$Change: 1190593 $--%>
