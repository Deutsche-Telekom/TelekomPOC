<%@ taglib prefix="dsp"
  uri="http://www.atg.com/taglibs/daf/dspjspTaglib1_0"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<dsp:page>
  <!-- rel-delete-button.jsp -->
  <dsp:getvalueof param="index" var="index" /> 
  <dsp:getvalueof param="node" var="uiNode" />
  <tr>
  <td>
  
    <button ${uiNode.htmlAttributes}
    onclick="removeChildProduct(${index});"
    type="button">Delete</button>
  </td>  
  </tr>
   
  
</dsp:page>
<%-- @version $Id: //product/Siebel/version/11.2/j2ee/siebel.war/configurator/renderer/rel-delete-button.jsp#1 $$Change: 1186180 $--%>
