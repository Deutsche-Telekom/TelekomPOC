<%@ taglib prefix="dsp" uri="http://www.atg.com/taglibs/daf/dspjspTaglib1_0" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<dsp:page>

  <head>
    <link href="../general.css" rel="stylesheet" type="text/css">
  </head>

  <dsp:importbean bean="/atg/userprofiling/Profile"/>
  <dsp:importbean bean="/atg/dynamo/droplet/Format"/>
  <dsp:importbean bean="/atg/userprofiling/AddressLookup"/>
  <dsp:importbean bean="/atg/siebel/account/SiebelAccountFormHandler"/>

  <dsp:include page="../navigation.jsp"/>

  <h1>Edit Address</h1>
  
  <span class="highlighttext">Current Account:</span>&nbsp;&nbsp;
        <dsp:valueof bean="Profile.parentOrganization.name" /><br><br>

  <dsp:getvalueof var="redirectUrl" param="redirectUrl"/>

  <c:choose>
    <c:when test="${not empty redirectUrl}">
      <c:set var="postUrl" value="${redirectUrl }"/>
    </c:when>
    <c:otherwise>
      <c:set var="postUrl" value="addresses.jsp"/>
    </c:otherwise>
  </c:choose>  

  <%--  main content area --%>
  <dsp:form action="${postUrl }" method="post">
    <dsp:input bean="SiebelAccountFormHandler.itemDescriptorName" type="hidden" value="contactInfo"/>
    <dsp:input bean="SiebelAccountFormHandler.repositoryId" paramvalue="addressId" type="hidden"/>
    <dsp:input bean="SiebelAccountFormHandler.updateSuccessURL" type="hidden" value="${postUrl }"/>
  
    <%--  Construct the URL to redirect to, in case of an error during form submission --%>
    <dsp:droplet name="Format">
      <dsp:param name="value1" param="addressId"/>
      <dsp:param name="value2" param="nickName"/>
      <dsp:param name="format" value="address_edit.jsp?addressId={value1}&nickName={value2}"/>
      <dsp:oparam name="output">
        <dsp:setvalue paramvalue="message" valueishtml="<%=true%>" param="updateErrorURL"/>
        <dsp:input bean="SiebelAccountFormHandler.updateErrorURL" paramvalue="updateErrorURL" type="hidden"/>
      </dsp:oparam>
    </dsp:droplet>
           
    <dsp:droplet name="AddressLookup">
      <dsp:param name="id" param="addressId"/>
      <dsp:param name="elementName" value="address"/>
      <dsp:oparam name="output">
        <table class="firstcolumnbold">
          <tr> 
            <td>Nickname:</td>
            <td><dsp:valueof param="nickName">No Nickname</dsp:valueof></td>
          </tr>
          <tr> 
            <td>First Name:</td>
            <td><dsp:input bean="SiebelAccountFormHandler.value.firstName" 
                           paramvalue="address.firstName" size="30" type="text"/>
            </td>
          </tr>
          <tr> 
            <td>Last Name:</td>
            <td><dsp:input bean="SiebelAccountFormHandler.value.lastName"
                           paramvalue="address.lastName" size="30" type="text"/>
            </td>
          </tr>
          <tr> 
            <td>Company Name:</td>
            <td><dsp:input bean="SiebelAccountFormHandler.value.companyName" 
                           paramvalue="address.companyName" size="30" type="text"/>
            </td>
          </tr>
          <tr> 
            <td>Address:</td>
            <td> 
              <dsp:input bean="SiebelAccountFormHandler.value.address1" 
                         paramvalue="address.address1" size="30" type="text"/>
              <br>
              <dsp:input bean="SiebelAccountFormHandler.value.address2"
                         paramvalue="address.address2" size="30" type="text"/>
            </td>
          </tr>
          <tr> 
            <td>City:</td>
            <td><dsp:input bean="SiebelAccountFormHandler.value.city" 
                           paramvalue="address.city" size="30" type="text"/>
            </td>
          </tr>
          <tr> 
            <td>State/Province:</td>
            <td><dsp:input bean="SiebelAccountFormHandler.value.state"
                           paramvalue="address.state" size="10" type="text"/>
            </td>
          </tr>
          <tr> 
            <td>Zip/Postal Code:</td>
            <td><dsp:input bean="SiebelAccountFormHandler.value.postalCode"
                           paramvalue="address.postalCode" size="10" type="text"/>
            </td>
          </tr>
          <tr> 
            <td>Country:</td>
            <td><dsp:input bean="SiebelAccountFormHandler.value.country" 
                           paramvalue="address.country" size="10" type="text"/>
            </td>
          </tr>
        </table>

        <br>
        <dsp:input bean="SiebelAccountFormHandler.update" type="submit" value=" Save "/>&nbsp;
        <input type="submit" value=" Cancel" name="submit">
      </dsp:oparam>
    </dsp:droplet>
  </dsp:form>

</dsp:page>
<%-- @version $Id: //product/Siebel/version/11.2/j2ee/siebel.war/admin/address_edit.jsp#1 $$Change: 1186180 $--%>
