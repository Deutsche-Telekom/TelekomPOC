<%@ taglib prefix="dsp"
  uri="http://www.atg.com/taglibs/daf/dspjspTaglib1_0"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="dspel"
  uri="http://www.atg.com/taglibs/daf/dspjspELTaglib1_0"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

<dsp:page>
      <dsp:getvalueof var="key" param="key"/>

      <!-- get the ui node list -->
      <dsp:droplet name="/atg/siebel/configurator/ui/GenerateUINodeListDroplet">
        <dsp:param value="${key}" name="key" />
        <dsp:oparam name="output">
          <dsp:getvalueof var="uiWrapper" param="uiWrapper" />
        </dsp:oparam>
      </dsp:droplet>
 

      <head>
        <c:if test="${! empty uiWrapper.cssFilePath }">
            <link href="${uiWrapper.cssFilePath}" rel="stylesheet" type="text/css">
        </c:if>
        <link href="../style.css" rel="stylesheet" type="text/css">
      </head>
      
      
      <body>
      <div align="center">

      <p>

          <c:forEach items="${uiWrapper.uiNodeList}" var="node"
            varStatus="status">

            <dsp:include page="${node.page}">
              <dsp:param name="node" value="${node}" />
              <dsp:param name="index" value="${status.index}" />
            </dsp:include>

          </c:forEach>
      <p>
      </div>
      </body>
</dsp:page>
<%-- @version $Id: //product/Siebel/version/11.2/j2ee/siebel.war/configurator/renderer/uiNodeWrapperRenderer.jsp#1 $$Change: 1186180 $--%>
