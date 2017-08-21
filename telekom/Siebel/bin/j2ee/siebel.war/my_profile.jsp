<%@ taglib prefix="dsp" uri="http://www.atg.com/taglibs/daf/dspjspTaglib1_0" %>

<dsp:page>

<head>
  <link href="general.css" rel="stylesheet" type="text/css">
</head>

<dsp:importbean bean="/atg/userprofiling/Profile"/>
<dsp:importbean bean="/atg/dynamo/droplet/IsEmpty"/>
<dsp:importbean bean="/atg/dynamo/droplet/Switch"/>

  <dsp:include page="navigation.jsp"/>
  
  <h1>My Profile</h1>
  
  <a href="edit_profile.jsp">Edit My Profile</a> </br></br>

  <table class="firstcolumnbold">
      <tr>
        <td>Name:</td>
        <td><dsp:valueof bean="Profile.firstName" /> 
        <dsp:valueof bean="Profile.middleName" />
        <dsp:valueof bean="Profile.lastName" /></td>
      </tr>
      <tr>
        <td>Description (unmapped):</td>
        <td><dsp:valueof bean="Profile.description" /></td>
      </tr>
      <tr>
        <td>Login:</td>
        <td><dsp:valueof bean="Profile.login" /></td>
      </tr>
      <tr>
        <td>Email:</td>
        <td><dsp:valueof bean="Profile.email" /></td>
      </tr>
      <tr>
        <td>Home address:</td>
        <td>
          <dsp:getvalueof id="pval0" bean="Profile.homeAddress">
            <dsp:include page="common/DisplayAddress.jsp">
              <dsp:param name="address" value="<%=pval0%>"/>
            </dsp:include>
          </dsp:getvalueof>
        </td>
      </tr>
      <tr>
        <td>Phone:</td>
        <td><dsp:valueof bean="Profile.homeAddress.phoneNumber" /></td>
      </tr>
      <tr>
        <td>Fax:</td>
        <td><dsp:valueof bean="Profile.homeAddress.faxNumber" /></td>
      </tr>

    </table>


</dsp:page>
<%-- @version $Id: //product/Siebel/version/11.2/j2ee/siebel.war/my_profile.jsp#1 $$Change: 1186180 $--%>
