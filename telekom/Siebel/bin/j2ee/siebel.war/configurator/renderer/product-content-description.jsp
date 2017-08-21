<%@ taglib prefix="dsp"
  uri="http://www.atg.com/taglibs/daf/dspjspTaglib1_0"%>

<dsp:page>
  <!-- product-content-description.jsp -->
	<dsp:getvalueof param="node" var="uiNode" />

		
			<tr>
				<td><dsp:valueof value="${uiNode.productConfigInstance.description}" /></td>
			</tr>
	
</dsp:page>
<%-- @version $Id: //product/Siebel/version/11.2/j2ee/siebel.war/configurator/renderer/product-content-description.jsp#1 $$Change: 1186180 $--%>
