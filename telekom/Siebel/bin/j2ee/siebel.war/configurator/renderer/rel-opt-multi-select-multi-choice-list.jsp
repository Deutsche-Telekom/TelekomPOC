<%@ taglib prefix="dsp"
  uri="http://www.atg.com/taglibs/daf/dspjspTaglib1_0"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<dsp:page>
  <!-- rel-opt-multi-select-multi-choice-list.jsp -->
  <dsp:getvalueof param="node" var="uiNode" /> 
  <dsp:getvalueof param="index" var="index" /> 
  
  <tr>
  <td>
  <table>
  
  <tr>
  <td ><dsp:valueof value="${uiNode.displayName}" /></td>
  </tr>
  
  <dsp:include page="displayError.jsp">
    <dsp:param name="node" value="${uiNode}" />
  </dsp:include>
  
  <c:forEach items="${uiNode.domainProducts}" var="domainProduct"
        varStatus="domainStatus">
  <c:if test="${domainProduct.id !=null}">   
  <tr>
  <td>
    <dsp:valueof value="${domainProduct.name}" />
  </td> 
  
  <td>
  
    <c:set var="productCount" value="0"/>
  
    <c:forEach items="${uiNode.productConfigRelationship.childInstances}" var="instance">
      <c:if test="${instance.productId==domainProduct.id}">
        <c:set var="productCount" value="${productCount+1 }"/>
      </c:if>
    </c:forEach>
  
    ${productCount} Selected
  </td>
  <td>
    <button ${uiNode.htmlAttributes} onclick="updateUINode(${index}, '${domainProduct.id}');">Add</button>
  </td>
  </tr>
  </c:if>
  
  </c:forEach>
  
  </table>
  </td>
  </tr>
  
  
  <tr>
    <td><h4>Currently Selected</h4></td>
  </tr>
  
  
</dsp:page>
<%-- @version $Id: //product/Siebel/version/11.2/j2ee/siebel.war/configurator/renderer/rel-opt-multi-select-multi-choice-list.jsp#1 $$Change: 1186180 $--%>
