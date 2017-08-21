<%@ taglib prefix="dsp" uri="http://www.atg.com/taglibs/daf/dspjspTaglib1_0" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>

<dsp:page>

  <dsp:importbean bean="/atg/siebel/order/history/OrderHistoryUIConfiguration" var="UIConfig"/>
  
  <dsp:getvalueof var="index" param="index"/>
  <dsp:getvalueof var="noOfOrders" param="noOfOrders"/>
  
  <c:if test="${noOfOrders > UIConfig.maxResults }">
    <table id="orderpagination">
      <tr>
        <td>
          <c:if test="${UIConfig.maxResults < (index + 1)}">
            <dsp:a href="order_history.jsp">Back
              <dsp:param name="index" value="${index-UIConfig.maxResults}"/>
            </dsp:a>
          </c:if>
        </td>
        <td id="spacercell">&nbsp;</td>
        <td>
          <c:if test="${index < (noOfOrders-UIConfig.maxResults)}">
            <dsp:a href="order_history.jsp">Next
              <dsp:param name="index" value="${index+UIConfig.maxResults}"/>
            </dsp:a>
          </c:if>
        </td>
      </tr>
    </table>
  </c:if>
</dsp:page>
<%-- @version $Id: //product/Siebel/version/11.2/j2ee/siebel.war/order/pagination.jsp#1 $$Change: 1186180 $--%>
