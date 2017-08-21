<%@ taglib prefix="dsp"
	uri="http://www.atg.com/taglibs/daf/dspjspTaglib1_0"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="dspel"
	uri="http://www.atg.com/taglibs/daf/dspjspELTaglib1_0"%>

<dsp:importbean bean="/atg/dynamo/droplet/ForEach" />


<dsp:page>

	<dsp:getvalueof param="commerceItem" var="commerceItem" />
	<dsp:getvalueof param="parentItemId" var="parentItemId" />

		
		<tr valign="baseline" style="font:15px arial,sans-serif;color:#335C64; border:1px dotted gray; border-left-style: none; border-right-style: none;">
			<td>${commerceItem.id }</td>
			<td>${commerceItem.auxiliaryData.productId }</td>
			<dsp:droplet name="/atg/targeting/RepositoryLookup">
			  <dsp:param name="repository" bean="/atg/commerce/catalog/ProductCatalog"/>
			  <dsp:param name="itemDescriptor" value="product"/>
			  <dsp:param name="id" value="${commerceItem.auxiliaryData.productId }"/>
			  <dsp:oparam name="output">
			    <dsp:tomap var="productMap" param="element"/>

          <td>${productMap.displayName }</td>
			  </dsp:oparam>
			</dsp:droplet>
			<td>${parentItemId}</td>
			<td>
				<table style="font:15px arial,sans-serif;width:100%;border:1px solid;border-color:#5C4A56;background-color:#F9F9F4">
					<c:if test="${commerceItem.attributeCount > 0}">
						<tr align="left" style="padding-bottom:10px;padding-top:5px;border:1px dotted gray;border-right-style:none;border-top-style:none;border-left-style:none">
							<th>Name</th>
							<th>Value</th>
						</tr>
					</c:if>
					<c:forEach items="${commerceItem.siebelAttributes}" var="attribute">
						<tr valign="baseline" style="font:15px arial,sans-serif;color:#335C64">
						  <td>${attribute.attributeName }</td>
							<td><b>${attribute.value }</b></td>
						</tr>
					</c:forEach>
				</table>

	<c:forEach items="${commerceItem.commerceItems}" var="childItem">
		<dsp:include page="show_commerce_item.jsp">
			<dsp:param name="commerceItem" value="${childItem }" />
			<dsp:param name="parentItemId" value="${commerceItem.id }" />
		</dsp:include>
	</c:forEach>

</dsp:page>
<%-- @version $Id: //product/Siebel/version/11.2/j2ee/siebel.war/configurator/show_commerce_item.jsp#1 $$Change: 1186180 $--%>
