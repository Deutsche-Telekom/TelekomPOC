<%@page import="atg.siebel.integration.ThreadLocalPropertyChanges"%>
<%@ taglib prefix="dsp" uri="http://www.atg.com/taglibs/daf/dspjspTaglib1_0" %>
<dsp:page>

  <head>
    <link href="general.css" rel="stylesheet" type="text/css">
  </head>

  <dsp:importbean bean="/atg/dynamo/droplet/ErrorMessageForEach"/>
  <dsp:importbean bean="/atg/dynamo/droplet/Switch"/>
  <dsp:importbean bean="/atg/userprofiling/ProfileFormHandler"/>

  <dsp:include page="navigation.jsp"/>

  <h1>Edit Home Address</h1>
      
  <!-- main content area -->
  <dsp:form action="my_profile.jsp" method="post">
    
    <dsp:droplet name="Switch">
      <dsp:param bean="ProfileFormHandler.formError" name="value"/>
      <dsp:oparam name="true">
        <font color=cc0000><STRONG><UL>
          <dsp:droplet name="ErrorMessageForEach">
            <dsp:param bean="ProfileFormHandler.formExceptions" name="exceptions"/>
            <dsp:oparam name="output">
              <LI> <dsp:valueof param="message"/>
            </dsp:oparam>
          </dsp:droplet>
        </UL></STRONG></font>
      </dsp:oparam>
    </dsp:droplet>
      </td>
    </tr>

    <dsp:input bean="ProfileFormHandler.checkForRequiredParameters" type="HIDDEN" value="true"/>

    <table class="firstcolumnbold">      
      <tr>
        <td>Address 1:</td>
        <td><dsp:input bean="ProfileFormHandler.value.homeAddress.address1" size="30" type="text" required="true"/></td>
      </tr>
      <tr>
        <td>Address 2:</td>
        <td><dsp:input bean="ProfileFormHandler.value.homeAddress.address2" size="30" type="text" /></td>
      </tr>
      <tr>
        <td>City, State/Province Zip/Postal Code:</td>
        <td><dsp:input bean="ProfileFormHandler.value.homeAddress.city" size="15" type="text" required="true"/>,&nbsp;
        <dsp:input bean="ProfileFormHandler.value.homeAddress.state" size="4" type="text" required="true"/>&nbsp;
        <dsp:input bean="ProfileFormHandler.value.homeAddress.postalCode" size="8" type="text" required="true"/></td>
      </tr>
      <tr>
        <td>Country:</td>
        <td>
          <dsp:input type="text" bean="ProfileFormHandler.value.homeAddress.country" required="true"/>
        </td>
      </tr>

      <tr>
        <td>Phone ((###) ###-### ...):</td>
        <td><dsp:input bean="ProfileFormHandler.value.homeAddress.phoneNumber" size="30" type="text"/></td>
      </tr>
      <tr>
        <td>Fax ((###) ###-### ...):</td>
        <td><dsp:input bean="ProfileFormHandler.value.homeAddress.faxNumber" size="30" type="text"/></td>
      </tr>
    </table>
    
    
    <dsp:input bean="ProfileFormHandler.updateErrorURL" type="HIDDEN" value="edit_address.jsp"/>
    <dsp:input bean="ProfileFormHandler.updateSuccessURL" type="HIDDEN" value="my_profile.jsp"/>
                 
    <br><dsp:input bean="ProfileFormHandler.update" type="submit" value=" Save "/> &nbsp;
    <input type="submit" value=" Cancel ">

  </dsp:form>
</dsp:page>
<%-- @version $Id: //product/Siebel/version/11.2/j2ee/siebel.war/edit_address.jsp#1 $$Change: 1186180 $--%>
