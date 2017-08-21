<%@ taglib prefix="dsp" uri="http://www.atg.com/taglibs/daf/dspjspTaglib1_0" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<dsp:page>

  <head>
    <link href="../general.css" rel="stylesheet" type="text/css">
  </head>

  <dsp:importbean bean="/atg/userprofiling/Profile"/>

  <%-- Clear the values of these formhandlers since they are session scoped --%>
  <dsp:include page="../navigation.jsp"/>

  <h1>Account Administration</h1>

  <dsp:getvalueof var="login" bean="Profile.login"/> 
  
  <c:choose>
    <c:when test="${empty login}">
      Please login to administer your account.
    </c:when>
    <c:otherwise>

      <%--  main content area --%>
      <span class="highlighttext">Current Account:</span>&nbsp;&nbsp;<dsp:valueof bean="Profile.parentOrganization.name" /><br><br>

      <span class="highlighttext">Current User:</span>&nbsp;&nbsp;
        <dsp:valueof bean="Profile.firstName" /> <dsp:valueof bean="Profile.lastName" /><br><br><br>

      <a href="manage_billing_profiles.jsp">Manage Billing Profiles</a><br><br>
      <a href="addresses.jsp">Manage Addresses</a><br><br>
      <a href="../asset/asset_list.jsp?pageNum=1">Assets</a><br><br>
      <a href="${pageContext.request.contextPath}/order/order_history.jsp">Order History</a><br><br>
      <a href="../my_profile.jsp">My Profile</a><br><br>
      <a href="../new_user.jsp">Create New User</a><br><br>
      <a href="../logout.jsp">Logout</a><br>
    
    </c:otherwise>
  </c:choose>

</dsp:page>
<%-- @version $Id: //product/Siebel/version/11.2/j2ee/siebel.war/admin/company_admin.jsp#1 $$Change: 1186180 $--%>
