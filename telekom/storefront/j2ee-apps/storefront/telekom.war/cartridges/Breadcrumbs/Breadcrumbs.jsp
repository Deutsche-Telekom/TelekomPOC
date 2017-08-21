<dsp:page>
	<dsp:importbean bean="/OriginatingRequest" var="originatingRequest"/>
	<dsp:getvalueof var="content" vartype="com.endeca.infront.assembler.ContentItem" param="contentItem"/> 
	<dsp:getvalueof var="contextPath" vartype="java.lang.String" value="${originatingRequest.contextPath}"/>
	
	<c:if test="${not empty content.refinementCrumbs || not empty content.rangeFilterCrumbs || not empty content.searchCrumbs}">    
      <%-- Display currently selected refinements if there are any  --%>
      <dsp:getvalueof var="dimCrumbs" value="${content.refinementCrumbs}" scope="request"/>
	</c:if>
</dsp:page>
