<%@ taglib prefix="dsp"
	uri="http://www.atg.com/taglibs/daf/dspjspTaglib1_0"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="dspel"
	uri="http://www.atg.com/taglibs/daf/dspjspELTaglib1_0"%>

<dsp:importbean bean="/atg/dynamo/droplet/ForEach" />


<dsp:page>

	<dsp:getvalueof param="commerceItem" var="commerceItem" />
	<dsp:getvalueof param="parentItemId" var="parentItemId" />

	<table border="1">
		<tr>
			<th>CommerceItem Id</th>
			<th>Product Id</th>
			<th>Parent CommerceItem</th>
			<th>Parent Relationship Id</th>
			<th>Attributes</th>
		</tr>
		<tr>
			<td>${commerceItem.id }</td>
			<td>${commerceItem.auxiliaryData.productId }</td>
			<td>${parentItemId}</td>
			<td>${commerceItem.parentRelationshipId }</td>
			<td>
				<table border="1">
					<c:if test="${commerceItem.attributeCount > 0}">
						<tr>
							<th>Name</th>
							<th>AttributeDefinitionId</th>
							<th>Value</th>
						</tr>
					</c:if>
					<c:forEach items="${commerceItem.siebelAttributes}" var="attribute">
						<tr>
						  <td>${attribute.attributeName }</td>
							<td>${attribute.attributeDefinitionId }</td>
							<td>${attribute.value }</td>
						</tr>
					</c:forEach>
				</table>
	</table>

	<c:forEach items="${commerceItem.commerceItems}" var="childItem">
		<dsp:include page="show_commerce_item.jsp">
			<dsp:param name="commerceItem" value="${childItem }" />
			<dsp:param name="parentItemId" value="${commerceItem.id }" />
		</dsp:include>
	</c:forEach>

</dsp:page>
<%-- @version $Id: //product/Siebel/version/11.2/j2ee/siebel.war/configurator/test/show_commerce_item.jsp#1 $$Change: 1186180 $--%>
