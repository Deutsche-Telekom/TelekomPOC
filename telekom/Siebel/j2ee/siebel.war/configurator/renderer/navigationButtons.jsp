<%@ taglib prefix="dsp"
  uri="http://www.atg.com/taglibs/daf/dspjspTaglib1_0"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="dspel"
  uri="http://www.atg.com/taglibs/daf/dspjspELTaglib1_0"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

<dsp:page>
      <dsp:getvalueof var="endConfig" param="endConfig"/>
      <dsp:getvalueof var="index" param="index"/>
      <dsp:getvalueof var="commerceItemId" param="commerceItemId"/>
      <c:choose>
        <c:when test="${endConfig == 'true' }">

          <dsp:form action="${pageContext.request.requestURI}?commerceItemId=${commerceItemId}" method="post" id="endConfig">  
            <dsp:input type="submit" bean="/atg/siebel/configurator/ui/ConfigurationFormHandler.endConfiguration" value="End Configuration"/>
            <dsp:input type="hidden" bean="/atg/siebel/configurator/ui/ConfigurationFormHandler.endConfigCardinalityErrorURL" value="${pageContext.request.requestURI}?commerceItemId=${commerceItemId}"/>
          </dsp:form>  
          
        </c:when>
        <c:otherwise>
          
          <dsp:form action="${pageContext.request.requestURI}?commerceItemId=${commerceItemId}&index=${index}" method="post" id="endConfig">  
            <dsp:input type="submit" bean="/atg/siebel/configurator/ui/ConfigurationFormHandler.endConfiguration" value="Configure Next Product"/>
            <dsp:input type="hidden" bean="/atg/siebel/configurator/ui/ConfigurationFormHandler.endConfigSuccessURL" value="${pageContext.request.requestURI}?commerceItemId=${commerceItemId}&index=${index+1}"/>
            <dsp:input type="hidden" bean="/atg/siebel/configurator/ui/ConfigurationFormHandler.endConfigCardinalityErrorURL" value="${pageContext.request.requestURI}?commerceItemId=${commerceItemId}"/>
          </dsp:form> 
          
        </c:otherwise>
      </c:choose>
</dsp:page>
<%-- @version $Id: //product/Siebel/version/11.2/j2ee/siebel.war/configurator/renderer/navigationButtons.jsp#1 $$Change: 1186180 $--%>
