<%@ taglib prefix="dsp" uri="http://www.atg.com/taglibs/daf/dspjspTaglib1_0" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<head>
  <link href="general.css" rel="stylesheet" type="text/css">
</head>

<dsp:page>

  <h1>New Siebel User Registration Page</h1>

  <dsp:importbean bean="/atg/userprofiling/Profile"/>
  <dsp:importbean bean="/atg/userprofiling/ProfileFormHandler"/>
  <h3>Current Account: <dsp:valueof bean="Profile.firstName"/> <dsp:valueof bean="Profile.lastName"/></h3>
  
  <dsp:getvalueof var="successUrlParamValue" param="successUrl"/>
<dsp:getvalueof var="formExceptions" vartype="java.lang.Object" bean="ProfileFormHandler.formExceptions"/>
  <c:if test="${not empty formExceptions}">
    
    <%-- Iterate through form exceptions --%>
    <c:forEach var="formException" items="${formExceptions}">
      <dsp:param name="formException" value="${formException}"/>
       <dsp:valueof param="formException.message" valueishtml="true"/>
    </c:forEach>
  </c:if>
  <dsp:form action="confirmRegistration.jsp" method="post">
  
    
    <c:if test="${not empty successUrlParamValue}">
      <dsp:input type="hidden" bean="ProfileFormHandler.changePasswordSuccessURL" value="${successUrlParamValue}"/>
    </c:if>
    <dsp:input type="hidden" bean="ProfileFormHandler.changePasswordErrorURL" value="newSiebelRegistration.jsp"/>
    
    <dsp:input type="hidden" bean="ProfileFormHandler.confirmOldPassword" value="false"/>
     <dsp:input type="hidden" bean="ProfileFormHandler.confirmPassword" value="true"/>

  <table class="firstcolumnbold">
    <tr>
        <td>Login:</td>
    <td><dsp:input name="login" bean="ProfileFormHandler.value.login"/></td>
      </tr>
    <tr>
        <td>Password:</td>
    <td><dsp:input name="password" type="password" bean="ProfileFormHandler.value.password"/></td>
      </tr>
    <tr>
        <td>Confirm Password:</td>
    <td><dsp:input name="confirmPassword" type="password" bean="ProfileFormHandler.value.confirmpassword"/></td>
      </tr>
    </table>    

    <br><dsp:input type="submit" bean="ProfileFormHandler.changePassword"/>
  </dsp:form>
</dsp:page>

<%-- @version $Id: //product/Siebel/version/11.2/j2ee/siebel.war/newSiebelRegistration.jsp#1 $$Change: 1186180 $ --%>