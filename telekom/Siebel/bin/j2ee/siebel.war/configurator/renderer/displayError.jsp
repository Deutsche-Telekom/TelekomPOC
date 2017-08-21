<%@ taglib prefix="dsp"
  uri="http://www.atg.com/taglibs/daf/dspjspTaglib1_0"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<dsp:page>

  <!-- rel-man-single-select-single-choice-text.jsp -->
  <dsp:getvalueof param="node" var="uiNode" /> 
  <dsp:layeredBundle basename="atg.siebel.configurator.WebAppResources">
  <c:set var="message" value="${uiNode.errorMessage}"/>
  
  <c:if test="${not empty message}">
  
  <tr>
    <td>
      <b style="color:#FE1A00"><fmt:message key="${message}"><fmt:param value="${uiNode.displayName}"/></fmt:message></b>
    </td>
  <td>
  
  </c:if>
  </dsp:layeredBundle>

</dsp:page>
<%-- @version $Id: //product/Siebel/version/11.2/j2ee/siebel.war/configurator/renderer/displayError.jsp#1 $$Change: 1186180 $--%>
