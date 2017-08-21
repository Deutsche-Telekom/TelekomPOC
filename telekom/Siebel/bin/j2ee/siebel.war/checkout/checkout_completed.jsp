<%@ taglib prefix="dsp"
	uri="http://www.atg.com/taglibs/daf/dspjspTaglib1_0"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<head>
  <link href="../general.css" rel="stylesheet" type="text/css">
</head>
	

<dsp:page>
  <h1>Checkout</h1>
  <h3>Thankyou your order has been successful. Your order # is <c:out value="${param.orderId}"/></h3>
  <br>
  <dsp:a href="../configurator/configurator_test_setup.jsp">Continue Shopping</dsp:a>
</dsp:page>
<%-- @version $Id: //product/Siebel/version/11.2/j2ee/siebel.war/checkout/checkout_completed.jsp#1 $$Change: 1186180 $--%>
