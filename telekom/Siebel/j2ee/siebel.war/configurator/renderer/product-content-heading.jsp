<%@ taglib prefix="dsp"
  uri="http://www.atg.com/taglibs/daf/dspjspTaglib1_0"%>

<dsp:page>
  <!-- product-content-heading.jsp -->
  <dsp:getvalueof param="node" var="uiNode" />
  
    <tr><td ${uiNode.htmlAttributes}>
      <b><dsp:valueof value="${uiNode.productConfigInstance.displayName}" /></b>
    </td></tr>
</dsp:page>
<%-- @version $Id: //product/Siebel/version/11.2/j2ee/siebel.war/configurator/renderer/product-content-heading.jsp#1 $$Change: 1186180 $--%>
