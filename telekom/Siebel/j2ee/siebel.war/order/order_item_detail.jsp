<%@ taglib prefix="dsp" uri="http://www.atg.com/taglibs/daf/dspjspTaglib1_0" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>


<dsp:page>

  <dsp:getvalueof param="orderItemDetail" var="orderItemDetail" />  
  <dsp:getvalueof param="count" var="count" />  
  
  <tr>
    <td>${orderItemDetail.actionCode}</td>
    <td>
      <dsp:droplet name="/atg/targeting/RepositoryLookup">
        <dsp:param name="id" value="${orderItemDetail.productId }"/>
        <dsp:param name="itemDescriptor" value="product"/>
        <dsp:param name="repository" bean="/atg/commerce/catalog/ProductCatalog"/>
        <dsp:oparam name="output">
          <dsp:getvalueof var="element" param="element" />
          <dsp:tomap var="product" value="${element}" />
          <a class="normallink" 
             href="${pageContext.request.contextPath}/product/product_detail.jsp?productId=${orderItemDetail.productId}">
             ${product.displayName}
          </a>
        </dsp:oparam>
        <dsp:oparam name="empty">
          <a class="normallink" 
             href="${pageContext.request.contextPath}/product/product_detail.jsp?productId=${orderItemDetail.productId}">
             ${orderItemDetail.productId}
          </a>
        </dsp:oparam>
      </dsp:droplet>
    </td>
    <td>
      <fmt:formatNumber value="${orderItemDetail.basePrice}" type="currency" currencyCode="${orderItemDetail.currencyCode}"/>
    </td>
    <td>${orderItemDetail.quantity }</td>
    <td>${orderItemDetail.status }</td>
  </tr>
  
  <c:if test="${not empty orderItemDetail.orderItemDetails}">
    <tr>
      <td><div onclick="showHideChildren('childTable${count}');"><b>+</b></div></td>
      <td colspan="4">
        <table id="childTable${count}" style="display:none;">
          <tr>
            <th>Action Code</th>
            <th>Product</th>
            <th>Price</th>
            <th>Quantity</th>
            <th>Status</th>
          </tr>
          <c:forEach items="${orderItemDetail.orderItemDetails}" var="childOrderItemDetail" varStatus="childItemStatus">
            <dsp:include src="order_item_detail.jsp">
              <dsp:param name="orderItemDetail" value="${childOrderItemDetail}"/>
              <dsp:param name="count" value="${count}.${childItemStatus.count}"/>
            </dsp:include>
          </c:forEach>
        </table>
      </td>
    </tr>
  </c:if>

</dsp:page>
<%-- @version $Id: //product/Siebel/version/11.2/j2ee/siebel.war/order/order_item_detail.jsp#1 $$Change: 1186180 $--%>
