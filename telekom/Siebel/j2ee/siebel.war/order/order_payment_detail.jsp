<%@ taglib prefix="dsp" uri="http://www.atg.com/taglibs/daf/dspjspTaglib1_0" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<dsp:page>

  <dsp:getvalueof param="orderPaymentDetail" var="orderPaymentDetail" />  

  Method - ${orderPaymentDetail.paymentType}<br>
  Card Number - ${orderPaymentDetail.creditCardNumberDisplay}<br>
  Amount - $${orderPaymentDetail.transactionAmount}
  
  <p>

</dsp:page>
<%-- @version $Id: //product/Siebel/version/11.2/j2ee/siebel.war/order/order_payment_detail.jsp#1 $$Change: 1186180 $--%>
