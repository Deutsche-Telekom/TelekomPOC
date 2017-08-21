<%@ taglib prefix="dsp"
	uri="http://www.atg.com/taglibs/daf/dspjspTaglib1_0"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="dspel"
	uri="http://www.atg.com/taglibs/daf/dspjspELTaglib1_0"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>


<dsp:importbean
	bean="/atg/siebel/configurator/ProductConfigInstanceDroplet" />
<dsp:importbean
	bean="/atg/siebel/configurator/ConfigurableProductFormHandler"
	var="formHandler" />
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
		  <h3>The following Error occurred</h3>
		  <font color=cc0000><STRONG>
			<dsp:valueof param="message" />
			</STRONG></font>
		</dsp:oparam>
	</dsp:droplet>

	<dsp:droplet name="IsNull">
		<dsp:param value="${productConfigInstance}" name="value" />

		<dsp:oparam name="false">

			<dsp:setvalue bean="ConfigurableProductFormHandler.currentInstance"
				value="${productConfigInstance}" />

			<head>
<dsp:getvalueof bean="ConfigurableProductFormHandler.cssFilePath"
	var="cssFilePath" />
<c:if test="${! empty cssFilePath }">
	<style>
    <dsp:include page="${cssFilePath}"/>
  </style>
</c:if>
			</head>
			<body>
				<div align="center">

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

						<dsp:form id="updateCP" formid="updateCP"
							action="${pageContext.request.requestURI}?productConfigInstanceKey=${productConfigInstance.key}"
							method="post">
							<dsp:input type="hidden"
								bean="ConfigurableProductFormHandler.currentInstanceKey"
								value="${productConfigInstance.key}" priority="10" />
							<dsp:input type="hidden"
								bean="ConfigurableProductFormHandler.navigationTrailString"
								value="${navigationTrailString}" priority="10" />

							<c:forEach items="${formHandler.uiNodeList}" var="node"
								varStatus="status">

								<dsp:include page="${node.page}">
									<dsp:param name="node" value="${node}" />
									<dsp:param name="index" value="${status.index}" />
									<dsp:param name="updateBean"
										value="ConfigurableProductFormHandler.uiNodeList[${status.index}].selectedValue" />
								</dsp:include>

							</c:forEach>

						</dsp:form>
					<p>

						<br>
					<div>
						<br>



						<dsp:form formid="endConfiguration"
							action="${pageContext.request.requestURI}?productConfigInstanceKey=${productConfigInstance.key}"
							method="post">
							<dsp:input type="hidden"
								bean="ConfigurableProductFormHandler.currentInstanceKey"
								value="${productConfigInstance.key}" />
							<dsp:input type="hidden"
								bean="ConfigurableProductFormHandler.navigationTrailString"
								value="${navigationTrailString}" />
							<dsp:input type="submit" value="Proceed to Checkout"
								bean="ConfigurableProductFormHandler.endConfiguration" />
						</dsp:form>


						<dsp:form id="removeChildInstance" method="post">
							<dsp:input type="hidden" value=""
								bean="/atg/siebel/configurator/ConfigurableProductFormHandler.deleteSelectedproducts"
								priority="-10" />
							<dsp:input id="currentRelationshipId" type="hidden"
								bean="/atg/siebel/configurator/ConfigurableProductFormHandler.currentRelationshipId"
								value="" />

							<dsp:input id="currentInstanceKey" type="hidden"
								bean="/atg/siebel/configurator/ConfigurableProductFormHandler.currentInstanceKey"
								value="" />

							<dsp:input id="deleteChildInstanceKey" type="hidden"
								bean="/atg/siebel/configurator/ConfigurableProductFormHandler.deleteChildInstanceKey"
								value="" />

						</dsp:form>


						<dsp:form id="updateUINode" method="post">
							<dsp:input type="hidden" value=""
								bean="/atg/siebel/configurator/ConfigurableProductFormHandler.updateUINodeByIndex"
								priority="-10" />
							<dsp:input id="nodeIndex" type="hidden"
								bean="/atg/siebel/configurator/ConfigurableProductFormHandler.index"
								value="" />

							<dsp:input id="nodeValue" type="hidden"
								bean="/atg/siebel/configurator/ConfigurableProductFormHandler.nodeValue"
								value="" />

							<dsp:input id="updateCurrentInstanceKey" type="hidden"
								bean="/atg/siebel/configurator/ConfigurableProductFormHandler.currentInstanceKey"
								value="" />

							<dsp:input id="updateNodeSuccessURL" type="hidden"
								bean="/atg/siebel/configurator/ConfigurableProductFormHandler.updateUINodeByIndexSuccessURL"
								value="" />

						</dsp:form>

						<script type="text/javascript">
        
          function updateUINode(index, nodeValue, action, successURL, currentInstanceKey)
          {
        	  //set the action
        	  document.getElementById('updateUINode').action=action;
        	  document.getElementById('nodeIndex').value=index;
        	  document.getElementById('nodeValue').value=nodeValue;
        	  document.getElementById('updateNodeSuccessURL').value=successURL;
        	  document.getElementById('updateCurrentInstanceKey').value=currentInstanceKey;
        	  
        	  document.getElementById('updateUINode').submit();
          }

        </script>

					</div>
				</div>
			</body>
		</dsp:oparam>
	</dsp:droplet>
</dsp:page>
<%-- @version $Id: //product/Siebel/version/11.2/j2ee/siebel.war/configurator/test/cp_edit_dev.jsp#1 $$Change: 1186180 $--%>
