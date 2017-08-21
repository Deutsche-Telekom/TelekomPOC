<%@ taglib prefix="dsp"
  uri="http://www.atg.com/taglibs/daf/dspjspTaglib1_0"%>

<dsp:page>
  <!-- product-quantity-renderer-1.jsp -->
  <dsp:getvalueof param="node" var="uiNode" />

    
      <tr>
        <td ${uiNode.htmlAttributes}>Quantity  <dsp:valueof value="${uiNode.productConfigInstance.quantity}" /></td>
      </tr>
  
</dsp:page>
<%-- @version $Id: //product/Siebel/version/11.2/j2ee/siebel.war/configurator/renderer/product-quantity-renderer.jsp#1 $$Change: 1186180 $--%>
