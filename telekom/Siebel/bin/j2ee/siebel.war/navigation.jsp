<%@ taglib prefix="dsp"
  uri="http://www.atg.com/taglibs/daf/dspjspTaglib1_0"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
  
<dsp:importbean bean="/atg/userprofiling/Profile" />

<dsp:page>

  <dsp:getvalueof var="login" bean="Profile.login"/> 
  
  <c:choose>
    <c:when test="${empty login}">
      <a href="${pageContext.request.contextPath}/login.jsp">Login</a> &nbsp;
    </c:when>
    <c:otherwise>
      <a href="${pageContext.request.contextPath}/admin/company_admin.jsp">My Account</a> &nbsp;
    </c:otherwise>
  </c:choose>
  
  <a href="${pageContext.request.contextPath}/product/product_search.jsp">Product Search</a> &nbsp;
  <a href="${pageContext.request.contextPath}/configurator/view_cart.jsp">View Cart</a> &nbsp;
  <a href="${pageContext.request.contextPath}/configurator/configurator_test_setup.jsp">Test Add To Cart</a> &nbsp;
  <p>

</dsp:page>
<%-- @version $Id: //product/Siebel/version/11.2/j2ee/siebel.war/navigation.jsp#1 $$Change: 1186180 $--%>
