<%@ taglib prefix="dsp"
	uri="http://www.atg.com/taglibs/daf/dspjspTaglib1_0"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="dspel"
	uri="http://www.atg.com/taglibs/daf/dspjspELTaglib1_0"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>


<dsp:importbean
	bean="/atg/siebel/configurator/test/ProductConfigInstanceDroplet" />
<dsp:importbean
	bean="/atg/siebel/configurator/test/ConfigurableProductFormHandler"/>
<dsp:importbean bean="/atg/dynamo/droplet/ForEach" />
<dsp:importbean bean="/atg/dynamo/droplet/Switch" />
<dsp:importbean bean="/atg/dynamo/droplet/IsNull" />

<dsp:page>

	<dsp:getvalueof param="navigationTrailString"
		var="navigationTrailString" />
	<c:if test="${empty navigationTrailString}">
		<dsp:getvalueof
			bean="ConfigurableProductFormHandler.navigationTrailString"
			var="navigationTrailString" />
	</c:if>
	<dsp:getvalueof param="navigationTrailStringOverride"
		var="navigationTrailStringOverride" />
	<dsp:getvalueof param="productConfigInstanceKey"
		var="productConfigInstanceKey" />
	<dsp:getvalueof param="commerceItemId" var="commerceItemId" />
	<h2>Edit Configurable Product</h2>
	<dsp:getvalueof param="reload" var="reload" />



	<dsp:droplet name="ProductConfigInstanceDroplet">
		<c:choose>
			<c:when test="${not empty productConfigInstanceKey}">
				<dsp:param name="productConfigInstanceKey"
					value="${productConfigInstanceKey}" />
				<dsp:param name="function" value="findRootInstanceUsingKey" />
			</c:when>
			<c:otherwise>
				<dsp:param name="commerceItem" value="${commerceItemId}" />
				<dsp:param name="function" value="findRootInstanceUsingCommerceId" />
			</c:otherwise>
		</c:choose>
		<dsp:oparam name="output">
			<dsp:getvalueof var="productConfigInstance" param="rootInstance" />
		</dsp:oparam>
		<dsp:oparam name="error">
			<dsp:getvalueof var="error" param="message" />
		</dsp:oparam>
	</dsp:droplet>

	<dsp:droplet name="IsNull">
		<dsp:param value="${productConfigInstance}" name="value" />

    <dsp:oparam name="true"><dsp:valueof value="${error}" /></dsp:oparam>
		<dsp:oparam name="false">

			<dsp:setvalue bean="ConfigurableProductFormHandler.currentInstance"
				value="${productConfigInstance}" />

			<h4>
				PCI Key =
				<dsp:valueof value="${productConfigInstance.key}" />
			</h4>
			<h4>
				Product Name =
				<dsp:valueof value="${productConfigInstance.displayName}" />
			</h4>
			<h4>
        Integration ID =
        <dsp:valueof value="${productConfigInstance.integrationId}" />
      </h4>
      <h4>
        Order ID =
        <dsp:a page="show_commerce_items.jsp"><dsp:valueof value="${productConfigInstance.orderId}" /></dsp:a>
      </h4>
      <h4>
        UI Message = 
        <dsp:valueof value="${productConfigInstance.uiMessage}" />
      </h4>
			<c:if test="${productConfigInstance.lastCommandStatus != null}">
				<h4>
					LAST COMMAND STATUS =
					<c:choose>
						<c:when
							test="${productConfigInstance.lastCommandStatus.isSuccessful}">
							<c:out
								value="Command [${productConfigInstance.lastCommandStatus.commandType}] succeeded" />
						</c:when>
						<c:otherwise>
							<font color=cc0000><STRONG> <c:out
										value="Command [${productConfigInstance.lastCommandStatus.commandType}] failed!" />
									<ul>
										<li><c:out
												value="Error Code = ${productConfigInstance.lastCommandStatus.statusDetails.statusCode}" />
									</ul>
							</STRONG></font>
						</c:otherwise>
					</c:choose>
				</h4>
			</c:if>

			<dsp:droplet name="Switch">
				<dsp:param bean="ConfigurableProductFormHandler.formError"
					name="value" />
				<dsp:oparam name="true">
					<h3>The following Errors occurred</h3>
					<font color=cc0000><STRONG><UL>
								<dsp:droplet name="/atg/dynamo/droplet/ErrorMessageForEach">
									<dsp:param name="exceptions"
										bean="ConfigurableProductFormHandler.formExceptions" />
									<dsp:oparam name="output">
										<LI><dsp:valueof param="message" />
									</dsp:oparam>
								</dsp:droplet>
							</UL></STRONG></font>
				</dsp:oparam>
			</dsp:droplet>




			<p>
			<h3>Child Relationships</h3>

			<c:forEach items="${productConfigInstance.childRelationships}"
				var="child" varStatus="status">
				<table border="1">
					<dsp:form formid="addChildProduct"
						action="${pageContext.request.requestURI}?productConfigInstanceKey=${productConfigInstance.key}"
						method="post">

						<dsp:input type="hidden"
							bean="ConfigurableProductFormHandler.currentInstanceKey"
							value="${productConfigInstance.key}" priority="10" />
						<dsp:input type="hidden"
							bean="ConfigurableProductFormHandler.currentRelationshipId"
							value="${child.id}" priority="10" />
						<dsp:input type="hidden"
							bean="ConfigurableProductFormHandler.navigationTrailString"
							value="${navigationTrailString}" priority="10" />

						<tr>
							<td><h3>
									Relationship -
									<c:out value="${child.displayName}" />
									(id =
									<c:out value="${child.id}" />
									)
								</h3></td>
						</tr>

						<tr>
							<td>Cardinalities [Min= <c:out
									value="${child.minimumQuantity}" /> ] [Max= <c:out
									value="${child.maximumQuantity}" /> ] [Def= <c:out
									value="${child.defaultQuantity}" /> ]
							</td>
						</tr>

						<tr>
							<td>
								<table border="1">
									<tr>
									  <th>Key</th>
										<th>Name</th>
										<th>Type</th>
										<th>Description</th>
										<th>Product Id</th>
										<th>Integration Id</th>
										<th>Quantity</th>
										<th colspan="2">Delete</th>
									</tr>
									<c:forEach items="${child.childInstances}" var="childInstance"
										varStatus="instanceStatus">
										<c:choose>
											<c:when test="${not empty navigationTrailStringOverride}">
												<c:set var="navTrailString"
													value="${navigationTrailStringOverride}" />
											</c:when>
											<c:when
												test="${empty navigationTrailStringOverride && empty navigationTrailString}">
												<c:set var="navTrailString"
													value="${pageContext.request.requestURI}?productConfigInstanceKey=${productConfigInstance.key}" />
											</c:when>
											<c:otherwise>
												<c:set var="navTrailString"
													value="${navigationTrailString};${pageContext.request.requestURI}?productConfigInstanceKey=${productConfigInstance.key}" />
											</c:otherwise>
										</c:choose>
										<tr>
										  <td><c:out value="${childInstance.key}" /></td>
											<td><c:out value="${childInstance.displayName}" /></td>
											<td><c:choose>
                          <c:when
                            test="${childInstance.type == 'Configurable Product' || childInstance.type == 'Simple Product With Attributes' || childInstance.type == 'Simple Product Bundle'}">
                            <dsp:a href="${pageContext.request.requestURI}">
                              <c:out value="${childInstance.type}" />
                              <dsp:param name="productConfigInstanceKey"
                                value="${childInstance.key}" />
                              <dsp:param name="navigationTrailString"
                                value="${navTrailString}" />
                            </dsp:a>
                          </c:when>
                          <c:otherwise>
                            <c:out value="${childInstance.type}" />
                          </c:otherwise>
                        </c:choose></td>
											<td><c:out value="${childInstance.description}" /></td>
											<td><c:out value="${childInstance.productId}" /></td>
											<td><c:out value="${childInstance.integrationId}" /></td>
											<td><c:out value="${childInstance.quantity}" /></td>
											<td><dsp:input id="${childInstance.integrationId}"
													type="checkbox"
													bean="ConfigurableProductFormHandler.currentInstance.childRelationships[${status.index}].childInstances[${instanceStatus.index}].delete"
													value="true">Delete</dsp:input></td>
											<td><dsp:input type="submit"
                          bean="ConfigurableProductFormHandler.deleteChildProduct"
                          value="Delete" submitvalue="${childInstance.integrationId}"
                          name="${childInstance.integrationId}" /></td>
										</tr>
									</c:forEach>
									<tr>
										<td colspan="6" align="left"><dsp:input type="submit"
												value="Add"
												bean="ConfigurableProductFormHandler.addChildProduct" /> <c:if
												test="${not empty child.domainProducts && fn:length(child.domainProducts) > 1}">
												<dsp:select
													bean="ConfigurableProductFormHandler.childProductId">
													<c:forEach items="${child.domainProducts}"
														var="domainProduct" varStatus="domainStatus">
														<dsp:option value="${domainProduct.id}">
															<dsp:valueof value="${domainProduct.name}" />
														</dsp:option>
													</c:forEach>
												</dsp:select>
											</c:if></td>
										<td align="right"><dsp:input type="submit"
												value="Delete Selected"
												bean="ConfigurableProductFormHandler.deleteSelectedProducts" />
										</td>
									</tr>
								</table>
							</td>
						</tr>
					</dsp:form>
				</table>
				<br>
				<br>
			</c:forEach>






			<p>
			<h3>Attributes</h3>
			<c:choose>
				<c:when test="${fn:length(productConfigInstance.attributes) > 0}">
					<dsp:form formid="setProductAttributeValues"
						action="${pageContext.request.requestURI}?productConfigInstanceKey=${productConfigInstance.key}"
						method="post">
						<dsp:input type="hidden"
							bean="ConfigurableProductFormHandler.currentInstanceKey"
							value="${productConfigInstance.key}" priority="10" />
						<dsp:input type="hidden"
							bean="ConfigurableProductFormHandler.navigationTrailString"
							value="${navigationTrailString}" priority="10" />
						<table border="1">
							<tr>
								<th align="left">Name</th>
								<th align="left">Id</th>
								<th align="left">Current Value</th>
								<th align="left">Change To</th>
								<th align="left">Read Only</th>
								<th align="left">Hidden</th>
								<th align="left">Required</th>
								<th align="left">Update</th>
							</tr>
							<c:forEach items="${productConfigInstance.attributes}"
								var="attribute" varStatus="attStatus">
								<tr>
									<td><c:out value="${attribute.name}" /></td>
									<td><c:out value="${attribute.id}" /></td>
									<td><c:out value="${attribute.value}" /></td>
									<td><c:choose>
											<c:when test="${attribute.domainType == 'ENUMERATED'}">
												<c:choose>
													<c:when test="${fn:length(attribute.domainValues) > 1}">
														<dsp:select
															bean="ConfigurableProductFormHandler.attributes[${attStatus.index}].value"
															priority="0">
															<dsp:option label="-- None --" value=""></dsp:option>
															<c:forEach items="${attribute.domainValues}"
																var="attributeValue">
																<c:choose>
																	<c:when test="${attribute.value == attributeValue}">
																		<dsp:option selected="true" value="${attributeValue}">
																			<dsp:valueof value="${attributeValue}" />
																		</dsp:option>
																	</c:when>
																	<c:otherwise>
																		<dsp:option value="${attributeValue}">
																			<dsp:valueof value="${attributeValue}" />
																		</dsp:option>
																	</c:otherwise>
																</c:choose>
															</c:forEach>
														</dsp:select>
													</c:when>
													<c:otherwise>
														<c:out value="${attribute.value}" />
													</c:otherwise>
												</c:choose>

											</c:when>
											<c:otherwise>
												<dsp:input
													bean="ConfigurableProductFormHandler.attributes[${attStatus.index}].value" />
											</c:otherwise>
										</c:choose></td>
										<td><c:out value="${attribute.readOnly}" /></td>
										<td><c:out value="${attribute.hidden}" /></td>
										<td><c:out value="${attribute.required}" /></td>
										<td><dsp:input type="submit"
                          bean="ConfigurableProductFormHandler.updateAttribute"
                          value="Update" submitvalue="${attribute.name}"
                          name="${attribute.name}" /></td>
								</tr>
							</c:forEach>
						</table>
						<dsp:input type="submit" value="Update"
							bean="ConfigurableProductFormHandler.updateAttributeValues" />
					</dsp:form>
				</c:when>
				<c:otherwise>This product does not have any attributes</c:otherwise>
			</c:choose>

			<dsp:form formid="endConfiguration"
				action="${pageContext.request.requestURI}?productConfigInstanceKey=${productConfigInstance.key}"
				method="post">
				<dsp:input type="hidden"
					bean="ConfigurableProductFormHandler.currentInstanceKey"
					value="${productConfigInstance.key}" />
				<dsp:input type="hidden"
					bean="ConfigurableProductFormHandler.navigationTrailString"
					value="${navigationTrailString}" />
				<c:choose>
					<c:when test="${productConfigInstance.isRootInstance == 'true'}">
					  <dsp:input type="submit" value="End Configuration" name="end_config"
              bean="ConfigurableProductFormHandler.endConfiguration" />
					</c:when>
					<c:otherwise>
						<dsp:input type="submit" value="Return To Parent" name="return" 
						  bean="ConfigurableProductFormHandler.returnToParent" />
					</c:otherwise>
				</c:choose>

			</dsp:form>

		</dsp:oparam>
	</dsp:droplet>
</dsp:page>
<%-- @version $Id: //product/Siebel/version/11.2/j2ee/siebel.war/configurator/test/cp_edit_template.jsp#1 $$Change: 1186180 $--%>
