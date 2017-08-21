<%@ taglib prefix="dsp"
  uri="http://www.atg.com/taglibs/daf/dspjspTaglib1_0"%>
  
<head>
  <link href="general.css" rel="stylesheet" type="text/css">
</head>

<dsp:page>

  <dsp:importbean bean="/atg/userprofiling/MultiUserAddFormHandler" />
  <dsp:importbean bean="/atg/dynamo/droplet/Switch" />
  <dsp:importbean bean="/atg/dynamo/droplet/Compare" />
  <dsp:importbean bean="/atg/dynamo/droplet/ErrorMessageForEach" />
  <dsp:importbean bean="/atg/dynamo/droplet/ForEach" />
  <dsp:importbean bean="/atg/userprofiling/Profile" />

  <dsp:include page="navigation.jsp"/>

  <h1>Create New User</h1>

  <%--  main content area --%>
  <dsp:droplet name="Switch">
    <dsp:param bean="MultiUserAddFormHandler.formError" name="value" />
    <dsp:oparam name="true">
        <font color=cc0000><STRONG><UL>
        <dsp:droplet name="ErrorMessageForEach">
          <dsp:param bean="MultiUserAddFormHandler.formExceptions" name="exceptions" />
          <dsp:oparam name="output">
            <LI><dsp:valueof param="message" />
          </dsp:oparam>
        </dsp:droplet>
        </UL></STRONG></font>
    </dsp:oparam>
  </dsp:droplet>
    
  <dsp:form action="admin/company_admin.jsp" method="post">

    <dsp:input bean="MultiUserAddFormHandler.count" type="hidden" value="1" />
    <dsp:input bean="MultiUserAddFormHandler.confirmPassword" type="hidden" value="true" />
    <dsp:input bean="MultiUserAddFormHandler.createErrorURL"
               type="hidden" value="new_user.jsp" />
    <dsp:input bean="MultiUserAddFormHandler.createSuccessURL"
               type="hidden" value="company_admin.jsp" />
    <dsp:input bean="MultiUserAddFormHandler.users[0].organizationId"
               beanvalue="Profile.parentOrganization.repositoryid" type="hidden" />

    <%-- Create user requires the Siebel Account ID --%>
    <dsp:input bean="MultiUserAddFormHandler.users[0].value.siebelAccountId"
               beanvalue="Profile.parentOrganization.siebelId" type="hidden" />

    <span class="highlighttext">Siebel Acct ID:</span>&nbsp;&nbsp;
        <dsp:valueof bean="Profile.parentOrganization.siebelId" /><br><br>
    
    <table class="firstcolumnbold">
      <tr>
        <td>Name:</td>
        <td><dsp:input
          bean="MultiUserAddFormHandler.users[0].value.firstName"
          size="15" type="text" value="" required="<%=true%>" />
        <dsp:input
          bean="MultiUserAddFormHandler.users[0].value.middleName"
          size="4" type="text" value="" /> <dsp:input
          bean="MultiUserAddFormHandler.users[0].value.lastName"
          size="15" type="text" value="" required="<%=true%>" /></td>
      </tr>
      <tr>
        <td>Login:</td>
        <td><dsp:input
          bean="MultiUserAddFormHandler.users[0].value.login"
          size="30" type="text" value="" /></td>
      </tr>
      <tr>
        <td>Password:</td>
        <td><dsp:input
          bean="MultiUserAddFormHandler.users[0].value.Password"
          size="30" type="password" value="" /></td>
      </tr>
      <tr>
        <td>Confirm Password:&nbsp;&nbsp;</td>
        <td><dsp:input
          bean="MultiUserAddFormHandler.users[0].value.CONFIRMPASSWORD"
          size="30" type="password" value="" /></td>
      </tr>
      <tr>
        <td>Email:</td>
        <td><dsp:input
          bean="MultiUserAddFormHandler.users[0].value.email"
          size="30" type="text" value="" /></td>
      </tr>
    </table>

    <dsp:input bean="MultiUserAddFormHandler.users[0].value.member" type="hidden" value="true" />
    <br>
    <dsp:input bean="MultiUserAddFormHandler.create" type="submit" value=" Create user " /> &nbsp;
    <input type="submit" value=" Cancel ">   
    
  </dsp:form>

</dsp:page>
<%-- @version $Id: //product/Siebel/version/11.2/j2ee/siebel.war/new_user.jsp#1 $$Change: 1186180 $--%>
