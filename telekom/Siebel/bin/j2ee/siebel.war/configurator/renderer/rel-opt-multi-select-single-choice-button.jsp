<%@ taglib prefix="dsp"
  uri="http://www.atg.com/taglibs/daf/dspjspTaglib1_0"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>



<dsp:page>
  <!-- rel-opt-multi-select-single-choice-button.jsp -->
  <dsp:getvalueof param="node" var="uiNode" /> 
  <dsp:getvalueof param="index" var="index" /> 
  
  <dsp:include page="displayError.jsp">
    <dsp:param name="node" value="${uiNode}" />
  </dsp:include>
    
  <tr>
  <c:if test="${uiNode.domainProducts[0].id !=null}">
  <td>
    <button ${uiNode.htmlAttributes}
    onclick="updateUINode(${index}, '${uiNode.domainProducts[0].id}');"
    type="button">Add a ${uiNode.domainProducts[0].name}</button>
  </td>
  </c:if>
  </tr>
</dsp:page>
<%-- @version $Id: //product/Siebel/version/11.2/j2ee/siebel.war/configurator/renderer/rel-opt-multi-select-single-choice-button.jsp#1 $$Change: 1186180 $--%>
