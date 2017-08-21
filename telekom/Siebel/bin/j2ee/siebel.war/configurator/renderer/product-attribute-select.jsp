<%@ taglib prefix="dsp"
  uri="http://www.atg.com/taglibs/daf/dspjspTaglib1_0"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<dsp:page>
  <!-- product-attribute-select.jsp -->
 	<dsp:getvalueof param="node" var="uiNode" /> 
	<dsp:getvalueof param="index" var="index" />
	<tr>
	<td><dsp:valueof value="${uiNode.displayName}" />
	<select
      onchange="updateUINode(${index}, this.value);">
      <c:forEach items="${uiNode.domainValues}" var="domainValue"
        varStatus="domainStatus">
        
        <c:choose>
          <c:when test="${uiNode.selectedValue eq domainValue}">
            <c:set var="selected" value="selected"/>
          </c:when>
          <c:otherwise>
            <c:set var="selected" value=""/>
          </c:otherwise>
        </c:choose>
        
        <option value="${domainValue}" ${selected}>
          <dsp:valueof value="${domainValue}" />
        </option>
      </c:forEach>
      </select></td></tr>

</dsp:page>
<%-- @version $Id: //product/Siebel/version/11.2/j2ee/siebel.war/configurator/renderer/product-attribute-select.jsp#1 $$Change: 1186180 $--%>
