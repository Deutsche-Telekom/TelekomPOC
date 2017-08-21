<%@ taglib prefix="dsp"
	uri="http://www.atg.com/taglibs/daf/dspjspTaglib1_0"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="dspel"
	uri="http://www.atg.com/taglibs/daf/dspjspELTaglib1_0"%>
	

	
<head>
  <link href="../general.css" rel="stylesheet" type="text/css">
  <link href="checkout.css" rel="stylesheet" type="text/css">
</head>


<dsp:importbean bean="/atg/commerce/order/purchase/ExpressCheckoutFormHandler"/>
<dsp:importbean bean="/atg/commerce/order/purchase/CartModifierFormHandler" var="cartModifierformHandler" />
<dsp:importbean bean="/atg/commerce/ShoppingCart" var="cart"/>
<dsp:importbean bean="/atg/dynamo/droplet/Redirect"/>
<dsp:importbean bean="/atg/userprofiling/Profile" />
<dsp:importbean bean="/atg/dynamo/droplet/Switch" />

<dsp:page>

  <dsp:droplet name="/atg/siebel/order/CheckoutValidationDroplet">
    <dsp:oparam name="notLoggedIn">
      <dsp:droplet name="/atg/dynamo/droplet/Redirect">
        <dsp:param name="url" value="../index.jsp?successUrl=/siebel/checkout/checkout.jsp"/>
      </dsp:droplet>
    </dsp:oparam>
    <dsp:oparam name="orderNotValid">
      <dsp:droplet name="/atg/dynamo/droplet/Redirect">
        <dsp:param name="url" value="../configurator/view_cart.jsp"/>
      </dsp:droplet>
    </dsp:oparam>
  </dsp:droplet>

  <dsp:include page="../navigation.jsp"/>

  <h1>&nbsp;&nbsp;Checkout</h1><br>

  <dsp:form action="${pageContext.request.requestURI}" method="post" name="checkoutform" formid="checkoutform">

    <dsp:droplet name="Switch">
      <dsp:param bean="ExpressCheckoutFormHandler.formError" name="value" />
      <dsp:oparam name="true">
        <span class="errortext">
          The following Errors occurred
          <UL>
            <dsp:droplet name="/atg/dynamo/droplet/ErrorMessageForEach">
              <dsp:param name="exceptions"
                         bean="ExpressCheckoutFormHandler.formExceptions" />
              <dsp:oparam name="output">
                <LI><dsp:valueof param="message" />
              </dsp:oparam>
            </dsp:droplet>
          </UL>
        </span>
      </dsp:oparam>
    </dsp:droplet>

    <dsp:input bean="ExpressCheckoutFormHandler.expressCheckoutSuccessURL" 
               type="hidden" value="checkout_completed.jsp"/>
    <dsp:input bean="ExpressCheckoutFormHandler.expressCheckoutErrorURL" 
               type="hidden" value="checkout.jsp"/>
    <dsp:input bean="ExpressCheckoutFormHandler.commitOrder" 
               type="hidden" value="true"/> 
    
    <dsp:getvalueof bean="ExpressCheckoutFormHandler.shippingMethod" var="shippingMethod"/>
  
    <table id="checkout">
      <tr>
        <td colspan=2 id="revieworder">
          <h3>&nbsp;Review your order</h3>
          &nbsp;&nbsp;Hi <span class="bluetext"><dsp:valueof bean="Profile.firstName" /></span>, Please review your shipping and billing details		
        </td>
      </tr>
      <tr>
        <td id="checkoutshipping">
          <dsp:include page="gadgets/checkout_shipping_edit.jsp" />
        </td>
        <td rowspan="2" id="ordersummary">
          <c:set var="disableProceedButton" value="false" />
          <h3>Order Summary</h3>
          <c:choose>
            <c:when test="${cart.current.commerceItemCount == 0}">
              <span class="errortext">Hey you've nothing in your cart!</span>
              <c:set var="disableProceedButton" value="true" />
            </c:when>
            <c:otherwise>
              <dsp:include page="gadgets/checkout_cart_summary.jsp" /><br><br>
              <c:if test="${empty shippingMethod}">
                <span class="errortext">Please select a shipping method</span><br>
                <c:set var="disableProceedButton" value="true" />
              </c:if>
            </c:otherwise>
          </c:choose>
          <br>
          <dsp:input disabled="${disableProceedButton }" 
                     bean="ExpressCheckoutFormHandler.expressCheckout" 
                     type="submit" value=" Place your order ">
          </dsp:input>		  
        </td>
      </tr>
      <tr>
        <td id="checkoutbilling">
          <dsp:include page="gadgets/checkout_billing_profile_edit.jsp" />
        </td>
      </tr>
    </table>
  </dsp:form>
</dsp:page>
<%-- @version $Id: //product/Siebel/version/11.2/j2ee/siebel.war/checkout/checkout.jsp#1 $$Change: 1186180 $--%>
