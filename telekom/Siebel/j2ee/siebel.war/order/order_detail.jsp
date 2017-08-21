<%@ taglib prefix="dsp" uri="http://www.atg.com/taglibs/daf/dspjspTaglib1_0" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<dsp:page>

  <head>
    <link href="../general.css" rel="stylesheet" type="text/css">
    <link href="order.css" rel="stylesheet" type="text/css">
  </head>

  <script language="javascript">
    function showHideChildren(node)
    {
      tableNode = document.getElementById(node);
      if(tableNode!=null&&tableNode.style.display=="block")
      {
        tableNode.style.display="none";
      }
      else if(tableNode!=null&&tableNode.style.display=="none")
      {
        tableNode.style.display="block";
        tableNode.style.border="1px solid black"
      }
    }
  </script>

  <dsp:getvalueof param="orderId" var="orderId" />  

  <dsp:droplet name="/atg/siebel/order/history/OrderDetailsDroplet">
    <dsp:param name="orderId" value="${orderId}" />
    <dsp:oparam name="output">
      <dsp:getvalueof var="orderDetails" param="orderDetails" />
    </dsp:oparam>
    <dsp:oparam name="error">
      <dsp:getvalueof var="errorMessage" param="errorMessage" />
      <dsp:droplet name="/atg/dynamo/droplet/Redirect">
        <dsp:param name="url" value="/login.jsp?message=${errorMessage}"/>
      </dsp:droplet>
    </dsp:oparam>
  </dsp:droplet>
  
  <dsp:include page="../navigation.jsp"/>
  
  <h1>Order Details</h1>
    
  <table id="orderdetails" class="firstcolumnbold">

    <tr>
      <th colspan="2">Details for order ${orderDetails.orderNumber}</th>
    </tr>

    <tr>
      <td>Status</td>
      <td colspan="4">${orderDetails.status}</td>
    </tr>

    <tr>  
      <td>Created On </td>
      <td colspan="4">${orderDetails.createdDate}</td>
    </tr>
    
    <tr>
      <td>Total</td>
      <td colspan="4"><fmt:formatNumber value="${orderDetails.orderTotal}" type="currency" currencyCode="${orderDetails.currencyCode}"/></td>  
    </tr>
    
    <tr>
      <td>Type</td>
      <td colspan="4">${orderDetails.orderType}</td>
    </tr>

    <tr><th class="spacerrow" colspan="2">&nbsp;</th></tr>

    <tr>
      <td><br>Order Items</td>
      <td>
        <table class="nestedtable">
          <tr>
            <th>Action Code</th>
            <th>Product</th>
            <th>Price</th>
            <th>Quantity</th>
            <th>Status</th>
          </tr>
          <c:forEach items="${orderDetails.orderItemDetails}" var="orderItemDetail" varStatus="itemStatus">
            <dsp:include src="order_item_detail.jsp">
              <dsp:param name="orderItemDetail" value="${orderItemDetail}"/>
              <dsp:param name="count" value="${itemStatus.count}"/>
            </dsp:include>
          </c:forEach>
        </table>
      </td>
    </tr>
  
    <tr><th class="spacerrow" colspan="2">&nbsp;</th></tr>

    <tr>
      <td>Payments</td>
      <td>
        <c:forEach items="${orderDetails.orderPaymentDetails}" var="orderPaymentDetail">
          <dsp:include src="order_payment_detail.jsp">
            <dsp:param name="orderPaymentDetail" value="${orderPaymentDetail}"/>
          </dsp:include>
        </c:forEach>
      </td>
    </tr>
  
    <tr><th class="spacerrow" colspan="2">&nbsp;</th></tr>
  
    <tr>
      <td>Delivery</td>
      <td>
        <c:forEach items="${orderDetails.orderDeliveryDetails}" var="orderDeliveryDetail">
          <dsp:include src="order_delivery_detail.jsp">
            <dsp:param name="orderDeliveryDetail" value="${orderDeliveryDetail}"/>
          </dsp:include>
        </c:forEach>
      </td>
    </tr>
  
  </table>
  
  <br><a href="order_history.jsp">Back to Order History</a>
  
</dsp:page>
<%-- @version $Id: //product/Siebel/version/11.2/j2ee/siebel.war/order/order_detail.jsp#1 $$Change: 1186180 $--%>
