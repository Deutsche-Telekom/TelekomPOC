<%@ taglib prefix="dsp"
  uri="http://www.atg.com/taglibs/daf/dspjspTaglib1_0"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<dsp:page>

  <!-- rel-man-single-select-single-choice-text.jsp -->
  <dsp:getvalueof param="node" var="uiNode" /> 
  <tr>
  <td>
  <table>
	<tr>
	<td ${uiNode.htmlAttributes}><dsp:valueof value="${uiNode.displayName}" /></td>
  </tr>
  </table>
  </td>
  </tr>
</dsp:page>
<%-- @version $Id: //product/Siebel/version/11.2/j2ee/siebel.war/configurator/renderer/rel-man-single-select-single-choice-text.jsp#1 $$Change: 1186180 $--%>
