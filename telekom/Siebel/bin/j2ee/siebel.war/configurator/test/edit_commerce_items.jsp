<%@ taglib prefix="dsp"
	uri="http://www.atg.com/taglibs/daf/dspjspTaglib1_0"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>


<dsp:importbean bean="/atg/dynamo/droplet/ForEach" />
<dsp:importbean
	bean="/atg/siebel/configurator/test/ConfigurableProductFormHandler" />
<dsp:importbean bean="/atg/commerce/ShoppingCart" />
<dsp:importbean
	bean="/atg/commerce/order/purchase/CartModifierFormHandler" />

<dsp:page>

	<dsp:getvalueof var="order" bean="ShoppingCart.current" />
	<h4>Shopping Cart Contents</h4>
	<h4>
		Order ID =
		<dsp:valueof value="${order.id }" />
	</h4>
	<h4>
		Order Price =
		<dsp:valueof value="${order.priceInfo.amount}" />
	</h4>

	<dsp:form formid="editCommerceItem"
		action="${pageContext.request.requestURI}" method="post">

		<table border="1">
			<tr>
				<th>Commerce Item Details</th>
				<th>Action</th>
			</tr>
			<c:forEach items="${order.commerceItems}" var="commerceItem">
				<tr>
					<td>
						<h4 style="color: blue">Top-level Commerce Item -
							${commerceItem.id }</h4> <dsp:include page="show_commerce_item.jsp">
							<dsp:param name="commerceItem" value="${commerceItem }" />
							<dsp:param name="parentItemId" value="n/a" />
						</dsp:include>
					</td>
					<c:if
						test="${commerceItem.attributeCount > 0 
					   || fn:length(commerceItem.commerceItems) > 0}">
						<td><dsp:input type="submit"
								bean="ConfigurableProductFormHandler.editCommerceItemId"
								value="Edit" submitvalue="${commerceItem.id }"
								name="${commerceItem.id }" /></td>
					</c:if>
				</tr>

			</c:forEach>
		</table>


    <p>
		<dsp:input type="submit" value="Proceed To Checkout"
			bean="CartModifierFormHandler.proceedToCheckout" priority="-10"></dsp:input>

	</dsp:form>


</dsp:page>
<%-- @version $Id: //product/Siebel/version/11.2/j2ee/siebel.war/configurator/test/edit_commerce_items.jsp#1 $$Change: 1186180 $--%>
