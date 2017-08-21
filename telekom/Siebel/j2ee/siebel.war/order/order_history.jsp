<%@ taglib prefix="dsp" uri="http://www.atg.com/taglibs/daf/dspjspTaglib1_0" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>

<dsp:page>

  <head>
    <link href="../general.css" rel="stylesheet" type="text/css">
    <link href="order.css" rel="stylesheet" type="text/css">
  </head>

  <dsp:importbean bean="/atg/userprofiling/Profile" var="Profile"/>
  <dsp:importbean bean="/atg/siebel/order/history/OrderHistoryUIConfiguration" var="UIConfig"/>

  <dsp:getvalueof var="index" param="index"/>
  
  <c:if test="${index==null }">
    <c:set var="index" value="0"/>
  </c:if>
  
  <dsp:droplet name="/atg/siebel/order/history/OrderSummariesDroplet">
    <dsp:param name="index" value="${index}"/>
    <dsp:param name="range" value="${UIConfig.maxResults}"/>
    <dsp:oparam name="output">
      <dsp:getvalueof var="orderSummaries" param="orderSummaries" />
      <dsp:getvalueof var="noOfOrders" param="noOfOrders" />
    </dsp:oparam>
    <dsp:oparam name="error">
      <dsp:getvalueof var="errorMessage" param="errorMessage" />
      <dsp:droplet name="/atg/dynamo/droplet/Redirect">
        <dsp:param name="url" value="/siebel/login.jsp?message=${errorMessage}"/>
      </dsp:droplet>
    </dsp:oparam>
  </dsp:droplet>
  
  <dsp:include page="../navigation.jsp"/>
  
  <h1>Order History</h1>
  
  <c:choose>
    <c:when test="${noOfOrders eq 0 }">
      No orders found for <dsp:valueof bean="Profile.parentOrganization.name" />
    </c:when>
    <c:otherwise>
      ${noOfOrders} orders found for <dsp:valueof bean="Profile.parentOrganization.name" /> 
      <br><br>
      Displaying orders ${index} to ${index+UIConfig.maxResults<noOfOrders?index+UIConfig.maxResults:noOfOrders}
      <br><br>
      
      <dsp:include src="pagination.jsp">
        <dsp:param name="index" value="${index}"/>
        <dsp:param name="noOfOrders" value="${noOfOrders}"/>
      </dsp:include>
    
      <table id="orderhistory">
  
        <tr> 
          <th>Order Number</th>
          <th>Created On</th>
          <th>Status</th>
        </tr>
  
        <c:forEach items="${orderSummaries}" var="orderSummary">
    
          <tr>
            <td>${orderSummary.orderNumber}</td>
            <td>${orderSummary.orderDate}</td>
            <td>${orderSummary.status}</td>
            <td>
              <table id="itemdetails" class="nestedtable">
                <th>Items</th>
          
                <c:forEach items="${orderSummary.orderItemSummaries}" var="orderItemSummary">
                  <dsp:droplet name="/atg/targeting/RepositoryLookup">
                    <dsp:param name="id" value="${orderItemSummary.productId }"/>
                    <dsp:param name="itemDescriptor" value="product"/>
                    <dsp:param name="repository" bean="/atg/commerce/catalog/ProductCatalog"/>
                    <dsp:oparam name="output">
                      <dsp:getvalueof var="element" param="element" />
                      <dsp:tomap var="product" value="${element}" />
                      <c:set var="productName" value="${product.displayName }"/>
                    </dsp:oparam>
                    <dsp:oparam name="empty">
                      <c:set var="productName" value="${orderItemSummary.productId }"/>
                    </dsp:oparam>
                  </dsp:droplet>
                  <tr>
                    <td>
                      <a class="normallink" 
                         href="${pageContext.request.contextPath}/product/product_detail.jsp?productId=${orderItemSummary.productId}">
                           ${productName}
                      </a>
                    </td>
                  </tr>
                </c:forEach>
              </table>
            </td>
            <td class="vieworderbutton"><a href="order_detail.jsp?orderId=${orderSummary.orderId}">View Order Details</a></td>
          </tr>
        </c:forEach>  
      </table>
    </c:otherwise>
  </c:choose>
  
</dsp:page>
<%-- @version $Id: //product/Siebel/version/11.2/j2ee/siebel.war/order/order_history.jsp#1 $$Change: 1186180 $--%>
