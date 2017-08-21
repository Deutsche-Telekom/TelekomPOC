<%@ taglib prefix="dsp"
	uri="http://www.atg.com/taglibs/daf/dspjspTaglib1_0"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<dsp:importbean bean="/atg/dynamo/droplet/ForEach" />
<dsp:importbean
  bean="/atg/siebel/configurator/test/ConfigurableProductFormHandler"/>
<dsp:importbean bean="/atg/commerce/ShoppingCart" />

<dsp:page>

  <dsp:getvalueof var="order" bean="ShoppingCart.current"/>
	<h4>Shopping Cart Contents</h4>
	<h4>
		Order ID =
		<dsp:valueof value="${order.id }"  />
	</h4>

	<dsp:form formid="editCommerceItem"
		action="${pageContext.request.requestURI}" method="post">

		<table border="1">
			<tr>
				<th>Commerce Item Id</th>
				<th>Product Id</th>
				<th>Action</th>
			</tr>
			<c:forEach items="${order.commerceItems}" var="commerceItem">
				<tr>
					<td>${commerceItem.id }</td>
					<td>${commerceItem.auxiliaryData.productId}</td>
					<td><dsp:input type="submit"
							bean="ConfigurableProductFormHandler.editCommerceItemId"
							value="Edit" submitvalue="${commerceItem.id }"
							name="${commerceItem.id }" /></td>
				</tr>

			</c:forEach>
		</table>

	</dsp:form>


</dsp:page>
<%-- @version $Id: //product/Siebel/version/11.2/j2ee/siebel.war/configurator/test/edit_commerce_item.jsp#1 $$Change: 1186180 $--%>
