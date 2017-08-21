<%@ taglib prefix="dsp"
  uri="http://www.atg.com/taglibs/daf/dspjspTaglib1_0"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<dsp:page>
  <!-- rel-opt-single-select-single-choice-check.jsp -->
  <dsp:getvalueof param="node" var="uiNode" /> 
  <dsp:getvalueof param="index" var="index" /> 
  <tr>
  <td>
  
  <c:set var="productSelected" value=""/>
  <c:set var="function" value=""/>
    
    <c:choose>
      <c:when test="${uiNode.productConfigRelationship.childInstances[0]!=null}">
        <c:set var="productSelected" value="checked"/>
        <c:set var="function" value="removeChildProduct(${index});"/>
      </c:when>
      <c:otherwise>
        <c:set var="function" value="updateUINode(${index}, this.value);"/>
 
      </c:otherwise>
    </c:choose>
    <c:if test="${uiNode.domainProducts[0].id !=null}">
     <input type="checkbox" ${productSelected}
      onchange="${function}" value="${uiNode.domainProducts[0].id}"/>${uiNode.domainProducts[0].name}
    </c:if>
  </td>  
  </tr>
   
  
</dsp:page>
<%-- @version $Id: //product/Siebel/version/11.2/j2ee/siebel.war/configurator/renderer/rel-opt-single-select-single-choice-check.jsp#1 $$Change: 1186180 $--%>
