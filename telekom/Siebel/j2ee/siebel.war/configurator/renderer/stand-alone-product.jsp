<%@ taglib prefix="dsp"
  uri="http://www.atg.com/taglibs/daf/dspjspTaglib1_0"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="dspel"
  uri="http://www.atg.com/taglibs/daf/dspjspELTaglib1_0"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>




<dsp:page>
  <!-- stand-alone-product.jsp -->
  <dsp:getvalueof param="commerceItemId" var="commerceItemId" />
    
  <dsp:droplet name="/atg/siebel/configurator/ui/CreateProductConfigInstance">
    <dsp:param value="${commerceItemId}" name="commerceItemId" />
    <dsp:oparam name="output">
      <dsp:getvalueof var="errorMessage" param="errorMessage" />
    </dsp:oparam>
  </dsp:droplet>
  
  <c:if test="${empty errorMessage}">
  <dsp:include page="single-page-renderer.jsp">
    <dsp:param value="${commerceItemId}" name="commerceItemId" />
  </dsp:include>
  </c:if>

</dsp:page>
<%-- @version $Id: //product/Siebel/version/11.2/j2ee/siebel.war/configurator/renderer/stand-alone-product.jsp#1 $$Change: 1186180 $--%>
