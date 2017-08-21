<%@ taglib prefix="dsp" uri="http://www.atg.com/taglibs/daf/dspjspTaglib1_0" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%--
 The initial page for the Siebel integration asks the user for a telephone # and account # on which
 to base the remote Siebel query
--%>

<head>
  <link href="general.css" rel="stylesheet" type="text/css">
  <link href="account.css" rel="stylesheet" type="text/css">
</head>

<dsp:page>
  <dsp:importbean bean="/atg/siebel/account/MatchAccountFormHandler"/>

  <dsp:getvalueof var="successUrlParam" param="successUrl"/>

  <dsp:a href="login.jsp">
    <dsp:param name="successUrl" value="${successUrlParam}"/>Login
  </dsp:a><br>
  
  <h1>Create New Account</h1>

  <dsp:a href="new_account.jsp">
    <dsp:param name="successUrl" value="${successUrlParam}"/>Create New Account
  </dsp:a><br><br>
  
  <h1>Sync Siebel Account</h1>
  
  <dsp:getvalueof var="formExceptions" vartype="java.lang.Object" bean="MatchAccountFormHandler.formExceptions"/>
  <c:if test="${not empty formExceptions}">
    
      <%-- Iterate through form exceptions --%>
      <c:forEach var="formException" items="${formExceptions}">
        <dsp:param name="formException" value="${formException}"/>
         <dsp:valueof param="formException.message" valueishtml="true"/>
      </c:forEach>
  </c:if>
  
  <c:set var="accountMatchedSuccessUrl" value="newSiebelRegistration.jsp"/>
  <c:if test="${not empty successUrlParam}">
    <c:set var="accountMatchedSuccessUrl" value="${accountMatchedSuccessUrl}?successUrl=${successUrlParam}" />
  </c:if>

  <dsp:form action="index.jsp" method="post">
    <dsp:input type="hidden" bean="MatchAccountFormHandler.successURL" value="${accountMatchedSuccessUrl}"/>
    <dsp:input type="hidden" bean="MatchAccountFormHandler.errorURL" value="index.jsp"/>
    <dsp:input type="hidden" bean="MatchAccountFormHandler.itemDescriptorName" value="organization"/>
    <dsp:input type="hidden" bean="MatchAccountFormHandler.secondaryItemDescriptorName" value="user"/>

    <table id="sync" class="firstcolumnbold">
      <tr>
        <td>Account Name:</td>
        <td><dsp:input name="account" bean="MatchAccountFormHandler.queryConstraints.name"/></td>
      </tr>
      <tr>
        <td>Account Telephone #:</td>
        <td><dsp:input name="phone" bean="MatchAccountFormHandler.queryConstraints.mainPhoneNumber"/></td>
      </tr>
      <tr>
        <td>Contact First Name:</td>
        <td><dsp:input name="firstName" bean="MatchAccountFormHandler.secondaryQueryConstraints.firstName"/></td>
      </tr>
      <tr>
        <td>Contact Last Name:</td>
        <td><dsp:input name="lastName" bean="MatchAccountFormHandler.secondaryQueryConstraints.lastName"/></td>
      </tr>
    </table>
  
    <br><dsp:input type="submit" bean="MatchAccountFormHandler.matchAccount"/>
  </dsp:form>
</dsp:page>
<%-- @version $Id: //product/Siebel/version/11.2/j2ee/siebel.war/index.jsp#1 $$Change: 1186180 $ --%>