<dsp:page>
<dsp:importbean bean="/OriginatingRequest" var="originatingRequest"/>
<dsp:getvalueof var="contentItem" vartype="com.endeca.infront.assembler.ContentItem" param="contentItem"/>
<dsp:getvalueof var="pageName" value="${contentItem.name}"/>
<dsp:getvalueof var="contextpath" bean="/OriginatingRequest.contextPath"/>
<dsp:getvalueof var="pageIdentifier" value="HOME_PAGE" scope="request"/>
<dsp:getvalueof var="displayNavigation" vartype="java.lang.Boolean" value="true" />
<!DOCTYPE html>
<!--[if lt IE 7]><html class="ie ie6 lt-ie7 lt-ie8 lt-ie9" lang="en"><![endif]-->
<!--[if IE 7]><html class="ie ie7 lt-ie8 lt-ie9" lang="en"><![endif]-->
<!--[if IE 8]><html class="ie ie8 lt-ie9" lang="en"><![endif]-->
<!--[if gt IE 8]><html class="ie" lang="en"><![endif]-->
<!--[if !IE]><!--><html lang="en"><!--<![endif]-->
<c:choose>
	<c:when test="${pageName eq 'business'}">
		<dsp:getvalueof var="sectionIdentifier" value="business" scope="session"/>
	</c:when>
	<c:when test="${pageName eq 'scp'}">
		<dsp:getvalueof var="sectionIdentifier" value="scp" scope="session"/>
	</c:when>
	<c:otherwise>
		<dsp:getvalueof var="sectionIdentifier" value="consumer" scope="session"/>
	</c:otherwise>
</c:choose>
<dsp:include page="/common/head.jsp"/>

<body>
<dsp:getvalueof var="pageName" value="HOME_PAGE" scope="request"/>
	<c:if test="${pageName eq 'scp'}">
		<dsp:getvalueof var="displayNavigation" vartype="java.lang.Boolean" value="false" />
	</c:if>
<%--<dsp:include page="/common/header.jsp">
	<dsp:param name="navigation" value="${displayNavigation}" />
</dsp:include> --%>
<c:choose>
	<c:when test="${pageName eq 'business'}">
		<dsp:include page="/home/business/businessHome.jsp"/>
	</c:when>
	<c:when test="${pageName eq 'scp'}">
		<dsp:include page="/common/login/mytwodegree.jsp"/>
	</c:when>
	<c:otherwise>
		<dsp:include page="/home/consumer/consumerHome.jsp"/>
	</c:otherwise>
</c:choose>

<dsp:include page="/common/footer.jsp"/>
</body>
</HTML>
</dsp:page>