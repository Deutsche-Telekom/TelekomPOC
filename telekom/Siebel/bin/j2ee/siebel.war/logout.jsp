<%@ taglib prefix="dsp" uri="http://www.atg.com/taglibs/daf/dspjspTaglib1_0" %>
<%@ page import="atg.servlet.*"%>



<dsp:page>

  <head>
    <link href="general.css" rel="stylesheet" type="text/css">
  </head>

  <dsp:importbean bean="/atg/userprofiling/Profile"/>
  <dsp:importbean bean="/atg/userprofiling/ProfileFormHandler"/>
  <dsp:importbean bean="/atg/userprofiling/ProfileErrorMessageForEach"/>
  <dsp:importbean bean="/atg/dynamo/droplet/Switch"/>

  <h1>Logout</h1>
  
  <dsp:form action="login.jsp" method="POST">
  
    <dsp:droplet name="Switch">
      <dsp:param bean="Profile.userType" name="value"/>
      <dsp:oparam name="default">
        Thank you for visiting, 
        <dsp:droplet name="/atg/dynamo/droplet/Switch">
          <dsp:param bean="Profile.firstname" name="value"/>
          <dsp:oparam name="unset">
            <dsp:valueof bean="Profile.login"/>.
          </dsp:oparam>
          <dsp:oparam name="default">
            <dsp:valueof bean="Profile.firstname"/>.
          </dsp:oparam>
        </dsp:droplet>

      </dsp:oparam>
      <dsp:oparam name="guest">
        Thank you for visiting!
      </dsp:oparam>
    </dsp:droplet>

    <dsp:droplet name="Switch">
      <dsp:param bean="ProfileFormHandler.formError" name="value"/>
      <dsp:oparam name="true">
        <span class="errortext"><UL>
        <dsp:droplet name="ProfileErrorMessageForEach">
          <dsp:param bean="ProfileFormHandler.formExceptions" name="exceptions"/>
          <dsp:oparam name="output">
            <LI> <dsp:valueof param="message"/>
          </dsp:oparam>
        </dsp:droplet>
        </UL></span>
      </dsp:oparam>
    </dsp:droplet>

    <dsp:input bean="ProfileFormHandler.logout" type="SUBMIT" value="Logout"/>
  </dsp:form>

  </dsp:page>
<%-- @version $Id: //product/Siebel/version/11.2/j2ee/siebel.war/logout.jsp#1 $$Change: 1186180 $--%>
