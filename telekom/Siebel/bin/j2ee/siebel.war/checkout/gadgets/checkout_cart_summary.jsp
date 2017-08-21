<%@ taglib prefix="dsp"
  uri="http://www.atg.com/taglibs/daf/dspjspTaglib1_0"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<link href="../checkout.css" rel="stylesheet" type="text/css">

<dsp:importbean bean="/atg/dynamo/droplet/ForEach" />
<dsp:importbean bean="/atg/commerce/ShoppingCart" />
<dsp:importbean bean="/atg/siebel/pricing/RootCommerceItemPriceCalculatorDroplet" />
<dsp:importbean bean="/atg/commerce/order/purchase/ExpressCheckoutFormHandler"/>

<dsp:page>

  <dsp:getvalueof var="order" bean="ShoppingCart.current"/>
  <table id="ordersummarytable">  
    <tr>
      <th>Item</th>
      <th>Recurring Cost</th>
      <th>Non-Recurring Cost</th>
    </tr>
    <c:forEach items="${order.commerceItems}" var="commerceItem">

      <tr>
        <dsp:droplet name="/atg/targeting/RepositoryLookup">
          <dsp:param name="repository" bean="/atg/commerce/catalog/ProductCatalog"/>
          <dsp:param name="itemDescriptor" value="product"/>
          <dsp:param name="id" value="${commerceItem.auxiliaryData.productId }"/>
          <dsp:oparam name="output">          
            <dsp:tomap var="productMap" param="element"/>
            <td>${productMap.displayName }</td>         
          </dsp:oparam>
        </dsp:droplet>
        <dsp:droplet name="RootCommerceItemPriceCalculatorDroplet">
          <dsp:param name="commerceItem" value="${commerceItem }"/>
          <dsp:oparam name="output">
            <dsp:getvalueof var="calculator" param="calculator"/>
            <td>
              <c:if test="${calculator.recurringPrice != 0}">$${calculator.recurringPrice} </c:if>
            </td>
            <td>
              <c:if test="${calculator.nonRecurringPrice != 0}">$${calculator.nonRecurringPrice}</c:if>
            </td>
          </dsp:oparam>
        </dsp:droplet>
      </tr>
    </c:forEach>
    <tr></tr>
    <tr>
      <td></td>
      <td>Goods Total</td>
      <td>$${order.priceInfo.amount}</td>
    </tr>
    <tr>
      <td></td>
      <td><i>Tax</i></td>
      <td><i><c:if test="${order.priceInfo.tax != 0}">$${order.priceInfo.tax}</c:if></i></td>
    </tr>
    <tr>
      <td></td>
      <dsp:getvalueof bean="ExpressCheckoutFormHandler.shippingMethod" var="shippingMethod"/>
      <td><i>Shipping<c:if test="${not empty shippingMethod}"> (${shippingMethod})</c:if></i></td>
      <td><c:if test="${order.priceInfo.shipping != 0}"><i>$${order.priceInfo.shipping}</i></c:if></td>
    </tr>
    <tr>
      <td colspan="2"><span class="bluetext">Order Total</span></td>
      <td><span class="bluetext">$<dsp:valueof value="${order.priceInfo.total}" number="#.##"/></span></td>
    </tr>
  </table>
</dsp:page>
</div>
<%-- @version $Id: //product/Siebel/version/11.2/j2ee/siebel.war/checkout/gadgets/checkout_cart_summary.jsp#1 $$Change: 1186180 $--%>
