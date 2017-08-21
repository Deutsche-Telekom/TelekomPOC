<%@ taglib prefix="dsp" uri="http://www.atg.com/taglibs/daf/dspjspTaglib1_0" %>
<dsp:page>

  <head>
    <link href="general.css" rel="stylesheet" type="text/css">
  </head>

  <dsp:importbean bean="/atg/dynamo/droplet/ErrorMessageForEach"/>
  <dsp:importbean bean="/atg/dynamo/droplet/Switch"/>
  <dsp:importbean bean="/atg/userprofiling/ProfileFormHandler"/>

  <dsp:include page="navigation.jsp"/>
  
  <h1>Edit My Profile</h1>

  <a href="edit_address.jsp">Edit Home Address</a></br></br>


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

      <dsp:input bean="ProfileFormHandler.checkForRequiredParameters" type="HIDDEN" value="true"/>
      
      <table class="firstcolumnbold">
        <td>Name:</td>
        <td>
          <dsp:input bean="ProfileFormHandler.value.firstName"  size="15"
            type="text"/>
          <dsp:input bean="ProfileFormHandler.value.middleName" size="4"
            type="text"/>
          <dsp:input bean="ProfileFormHandler.value.lastName"   size="15"
            type="text"/>
        </td>
      </tr>
      <tr>
        <td>Description:</td>
        <td>
          <dsp:input bean="ProfileFormHandler.value.description" size="30"
            type="text" /></td>
      </tr>
      <tr>
        <td>Email</td>
        <td><dsp:input bean="ProfileFormHandler.value.email" size="30" type="text"/></td> 
      </tr>
    </table>
    
    <dsp:input bean="ProfileFormHandler.updateErrorURL" type="HIDDEN" value="edit_profile.jsp"/>
    <dsp:input bean="ProfileFormHandler.updateSuccessURL" type="HIDDEN" value="my_profile.jsp"/>
          
          
    <br><dsp:input bean="ProfileFormHandler.update" type="submit" value=" Save " /> &nbsp;
    <input type="submit" value=" Cancel ">

    </dsp:form>
    
</dsp:page>
<%-- @version $Id: //product/Siebel/version/11.2/j2ee/siebel.war/edit_profile.jsp#1 $$Change: 1186180 $--%>
