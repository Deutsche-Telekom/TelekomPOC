<%@ taglib prefix="dsp" uri="http://www.atg.com/taglibs/daf/dspjspTaglib1_0" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<%--
 The initial page for the Siebel integration asks the user for a telephone # and account # on which
 to base the remote Siebel query
--%>

<head>
  <link href="general.css" rel="stylesheet" type="text/css">
  <link href="account.css" rel="stylesheet" type="text/css">
</head>


<dsp:page>
  <dsp:importbean bean="/atg/userprofiling/ProfileFormHandler"/>
  
  <dsp:getvalueof param="message" var="message" /> 
  
  <dsp:layeredBundle basename="atg.siebel.WebAppResources">
  
  <c:if test="${not empty message}">
    <b style="color:#FE1A00"><fmt:message key="${message}"/></b>
  </c:if>
  
  </dsp:layeredBundle>

  <h1>User Login</h1>

  <dsp:getvalueof var="formExceptions" vartype="java.lang.Object" bean="ProfileFormHandler.formExceptions"/>
  <c:if test="${not empty formExceptions}">
    
    <%-- Iterate through form exceptions --%>
    <c:forEach var="formException" items="${formExceptions}">
      <dsp:param name="formException" value="${formException}"/>
       <dsp:valueof param="formException.message" valueishtml="true"/>
    </c:forEach>
  </c:if>
  
  
  <dsp:getvalueof var="loginOrRegistrationSuccessUrl" param="successUrl"/>
  <c:if test="${empty loginOrRegistrationSuccessUrl}">
    <c:set var="loginOrRegistrationSuccessUrl" value="company_admin.jsp" />
  </c:if>

  <dsp:form action="admin/company_admin.jsp" method="post">
     <dsp:input type="hidden" bean="ProfileFormHandler.loginSuccessURL" value="${loginOrRegistrationSuccessUrl}"/>
     <dsp:input type="hidden" bean="ProfileFormHandler.loginErrorURL" value="../login.jsp"/>

	  <table id="login" class="firstcolumnbold">
	  <tr>
	    <td>Username:</td><td><dsp:input name="firstName" bean="ProfileFormHandler.value.login"/></td>
	  </tr>
	  <tr>
	    <td>Password:</td><td><dsp:input type="password" name="lastName" bean="ProfileFormHandler.value.password"/></td>
	  </tr>
	  </table>

    <br><dsp:input type="submit" bean="ProfileFormHandler.login" value="Login"/>
  </dsp:form>
</dsp:page>
<%-- @version $Id: //product/Siebel/version/11.2/j2ee/siebel.war/login.jsp#1 $$Change: 1186180 $ --%>
