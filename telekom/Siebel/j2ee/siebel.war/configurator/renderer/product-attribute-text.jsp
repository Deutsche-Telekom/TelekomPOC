<%@ taglib prefix="dsp"
  uri="http://www.atg.com/taglibs/daf/dspjspTaglib1_0"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<dsp:page>
  <!-- product-attribute-text.jsp -->
	<dsp:getvalueof param="node" var="uiNode" />
  <dsp:getvalueof param="index" var="index" />
	<c:set var="required" value="display:none;"/>
	<c:if test="${uiNode.hidden}"><c:set var="hide" value="display:none;"/></c:if>
	<c:if test="${uiNode.required}"><c:set var="required" value="color: red;font-style: italic;"/></c:if>
	
	<dsp:include page="displayError.jsp">
    <dsp:param name="node" value="${uiNode}" />
  </dsp:include>

	<tr style="${hide}">
		<td><dsp:valueof value="${uiNode.displayName}" />
		<input id="${uiNode.uniqueID}" value="${uiNode.selectedValue}"/>
		
		<c:choose>
		  <c:when test="${uiNode.readOnly}">
		    <script type="text/javascript">
		      document.getElementById("${uiNode.uniqueID}").readOnly=true;
		    </script>
		    </td>
		  </c:when>
		  <c:otherwise>
		    <button ${uiNode.htmlAttributes}
        onclick="updateUINode(${index}, document.getElementById('${uiNode.uniqueID}').value);">Update</button>
        <div style="${required}">*Required</div></td>
		  </c:otherwise>
		</c:choose>
		
	</tr>

</dsp:page>
<%-- @version $Id: //product/Siebel/version/11.2/j2ee/siebel.war/configurator/renderer/product-attribute-text.jsp#1 $$Change: 1186180 $--%>
