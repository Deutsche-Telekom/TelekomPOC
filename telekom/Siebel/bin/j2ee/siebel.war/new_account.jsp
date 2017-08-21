<%@ taglib prefix="dsp" uri="http://www.atg.com/taglibs/daf/dspjspTaglib1_0" %>

<head>
  <link href="general.css" rel="stylesheet" type="text/css">
  <link href="account.css" rel="stylesheet" type="text/css">
</head>

<dsp:page>

  <dsp:importbean bean="/atg/dynamo/droplet/ErrorMessageForEach"/>
  <dsp:importbean bean="/atg/dynamo/droplet/Switch"/>
  <dsp:importbean bean="/atg/userprofiling/Profile"/>
  <dsp:importbean bean="/atg/siebel/account/SiebelAccountCreationFormHandler"/>
  <dsp:importbean bean="/atg/siebel/account/SiebelAccountInputBean"/>


  <h1>Create New Account</h1>

  <dsp:getvalueof var="loginOrRegistrationSuccessUrl" param="successUrl"/>
  <c:if test="${empty loginOrRegistrationSuccessUrl}">
    <c:set var="loginOrRegistrationSuccessUrl" value="/siebel/confirmRegistration.jsp" />
  </c:if>

  <%--  main content area --%>
  <dsp:droplet name="Switch">
  <dsp:param bean="SiebelAccountCreationFormHandler.formError" name="value"/>
  <dsp:oparam name="true">
    <font color=cc0000><STRONG><UL>
    <dsp:droplet name="ErrorMessageForEach">
      <dsp:param bean="SiebelAccountCreationFormHandler.formExceptions" name="exceptions"/>
      <dsp:oparam name="output">
      <LI> <dsp:valueof param="message"/>
      </dsp:oparam>
    </dsp:droplet>
    </UL></STRONG></font>
  </dsp:oparam>
  </dsp:droplet>


  <dsp:form action="newSiebelRegistration.jsp" method="post">
        
  <table id="newaccount" class="firstcolumnbold">
    <tr>
    <td>Account Name:&nbsp;&nbsp;</td>
    <td><dsp:input bean="SiebelAccountCreationFormHandler.SiebelAccountInputBean.accountName" size="30" type="text"/></td>
    </tr>
    <tr>
    <td>Phone Number:&nbsp;&nbsp;</td>
    <td><dsp:input bean="SiebelAccountCreationFormHandler.SiebelAccountInputBean.accountMainPhoneNumber" size="30" type="text"/></td>
    </tr>
    <tr>
    <td>First Name:&nbsp;&nbsp;</td>
    <td><dsp:input bean="SiebelAccountCreationFormHandler.SiebelAccountInputBean.userFirstName" size="30" type="text"/></td>
    </tr>
    <tr>
    <td>Last Name:&nbsp;&nbsp;</td>
    <td><dsp:input bean="SiebelAccountCreationFormHandler.SiebelAccountInputBean.userLastName" size="30" type="text"/></td>
    </tr>
  </table>

  <dsp:input bean="SiebelAccountCreationFormHandler.createOrganizationSuccessURL"
         type="hidden" value="newSiebelRegistration.jsp?successUrl=${loginOrRegistrationSuccessUrl}"/>          
  <dsp:input bean="SiebelAccountCreationFormHandler.createOrganizationErrorURL"
         type="hidden" value="new_account.jsp"/>
  <dsp:input bean="SiebelAccountCreationFormHandler.cancelURL"
         type="hidden" value="index.jsp"/>               
  <br><dsp:input bean="SiebelAccountCreationFormHandler.createAccount" type="submit" value=" Save "/> &nbsp;
      <dsp:input bean="SiebelAccountCreationFormHandler.cancel" type="submit" value=" Cancel "/></td>

  </dsp:form>

</dsp:page>
<%-- @version $Id: //product/Siebel/version/11.2/j2ee/siebel.war/new_account.jsp#1 $$Change: 1186180 $--%>
