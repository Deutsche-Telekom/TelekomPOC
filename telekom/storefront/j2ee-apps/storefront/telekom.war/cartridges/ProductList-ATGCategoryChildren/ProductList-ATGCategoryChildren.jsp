
<dsp:page>

<dsp:importbean bean="/OriginatingRequest" var="originatingRequest"/>

  <dsp:getvalueof var="contentItem" vartype="com.endeca.infront.assembler.ContentItem" param="contentItem"/>
<dsp:include page="/ols/consumer/browse/includes/categoryChildProducts.jsp">
    <dsp:param name="contentItem" value="${contentItem}"/>
</dsp:include>
	
</dsp:page>

