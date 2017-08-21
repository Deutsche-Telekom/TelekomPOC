<%@ taglib prefix="dsp"
  uri="http://www.atg.com/taglibs/daf/dspjspTaglib1_0"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<dsp:page>
  <!-- product-content-simple-product.jsp -->
  <dsp:getvalueof param="node" var="uiNode" />
  
  <tr>
  <td>
  <div>
  <table ${uiNode.htmlAttributes}>
  
  <tr>
  <td>
	<div><b><dsp:valueof value="${uiNode.productConfigInstance.displayName}" /></b></div>
	<c:if test="${uiNode.productConfigInstance.quantity > 1}">
	   Quantity - <dsp:valueof value="${uiNode.productConfigInstance.quantity}" />
    </c:if>
	</td>
	</tr>
	<tr>
	<td>	
	<div><dsp:valueof value="${uiNode.productConfigInstance.description}" /></div>
  </td>
  </tr>
  </table>
  </div>
  </td>
  
  </tr>

</dsp:page>
<%-- @version $Id: //product/Siebel/version/11.2/j2ee/siebel.war/configurator/renderer/product-content-simple-product.jsp#1 $$Change: 1186180 $--%>
