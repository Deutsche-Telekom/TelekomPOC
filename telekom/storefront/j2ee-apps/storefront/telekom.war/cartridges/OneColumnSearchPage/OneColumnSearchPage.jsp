<dsp:page>
	<dsp:importbean bean="/OriginatingRequest" var="originatingRequest"/>
	<dsp:getvalueof var="contextpath" bean="/OriginatingRequest.contextPath"/>
	<dsp:getvalueof var="contentItem" vartype="com.endeca.infront.assembler.ContentItem" param="contentItem"/>
	<dsp:getvalueof var="searchPageGuidedNav" value="SEARCH_NAVIGATION" scope="request"/>
	
	<!DOCTYPE html>
<!--[if lt IE 7]><html class="ie ie6 lt-ie7 lt-ie8 lt-ie9" lang="en"><![endif]-->
<!--[if IE 7]><html class="ie ie7 lt-ie8 lt-ie9" lang="en"><![endif]-->
<!--[if IE 8]><html class="ie ie8 lt-ie9" lang="en"><![endif]-->
<!--[if gt IE 8]><html class="ie" lang="en"><![endif]-->
<!--[if !IE]><!--><html lang="en"><!--<![endif]-->
		<dsp:include page="/common/head.jsp"/>
		<body>
			<dsp:getvalueof var="searchPageNoHeader" value="SEARCH_NO_HEADER" scope="request"/>
			<dsp:include page="/common/header.jsp"/>
			<c:forEach var="element" items="${contentItem.HeaderContent}">
				<dsp:renderContentItem contentItem="${element}"/>
			</c:forEach>
			<c:forEach var="element" items="${contentItem.MainContent}">
				<dsp:renderContentItem contentItem="${element}"/>
			</c:forEach>
			<dsp:include page="/common/footer.jsp"/>
	</body>
	</HTML>
</dsp:page>
<%-- @version $Id: //hosting-blueprint/B2CBlueprint/version/11.1/Storefront/j2ee/store.war/cartridges/TwoColumnPage/TwoColumnPage.jsp#2 $$Change: 883241 $--%>
