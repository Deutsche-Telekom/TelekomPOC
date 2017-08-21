<%@ taglib prefix="dsp" uri="http://www.atg.com/taglibs/daf/dspjspTaglib1_0" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<dsp:page>

  <dsp:getvalueof param="orderDeliveryDetail" var="orderDeliveryDetail" />  

  First Name - ${orderDeliveryDetail.shipToFirstName}
  
  <p>
  
  Last Name - ${orderDeliveryDetail.shipToLastName}
  
  <p>

</dsp:page>
<%-- @version $Id: //product/Siebel/version/11.2/j2ee/siebel.war/order/order_delivery_detail.jsp#1 $$Change: 1186180 $--%>
