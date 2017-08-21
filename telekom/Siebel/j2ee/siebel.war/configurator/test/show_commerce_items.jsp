<%@ taglib prefix="dsp"
	uri="http://www.atg.com/taglibs/daf/dspjspTaglib1_0"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<dsp:importbean bean="/atg/dynamo/droplet/ForEach" />

<dsp:importbean bean="/atg/commerce/ShoppingCart" />

<dsp:page>

  <dsp:getvalueof var="order" bean="ShoppingCart.current"/>
	<h4>Order Summary</h4>
	<h4>
		Order ID =
		<dsp:valueof value="${order.id }"  />
	</h4>

	<c:forEach items="${order.commerceItems}"
		var="commerceItem">
		<h4 style="color: blue">Top-level Commerce Item - ${commerceItem.id }</h4>
		<dsp:include page="show_commerce_item.jsp">
			<dsp:param name="commerceItem" value="${commerceItem }" />
			<dsp:param name="parentItemId" value="n/a" />
		</dsp:include>
	</c:forEach>

</dsp:page>
<%-- @version $Id: //product/Siebel/version/11.2/j2ee/siebel.war/configurator/test/show_commerce_items.jsp#1 $$Change: 1186180 $--%>
