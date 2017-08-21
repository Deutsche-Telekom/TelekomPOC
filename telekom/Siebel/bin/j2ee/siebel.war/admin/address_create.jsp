<%@ taglib prefix="dsp" uri="http://www.atg.com/taglibs/daf/dspjspTaglib1_0" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<dsp:page>

  <head>
    <link href="../general.css" rel="stylesheet" type="text/css">
  </head>

  <dsp:importbean bean="/atg/dynamo/droplet/ErrorMessageForEach"/>
  <dsp:importbean bean="/atg/dynamo/droplet/Switch"/>
  <dsp:importbean bean="/atg/userprofiling/Profile"/>
  <dsp:importbean bean="/atg/siebel/account/SiebelAccountFormHandler"/>

  <dsp:include page="../navigation.jsp"/>

  <h1>Create Address</h1>
  
  <span class="highlighttext">Current Account:</span>&nbsp;&nbsp;
        <dsp:valueof bean="Profile.parentOrganization.name" /><br><br>

  <%-- main content area --%>
 
  <dsp:droplet name="Switch">
    <dsp:param bean="SiebelAccountFormHandler.formError" name="value"/>
    <dsp:oparam name="true">
      <font color=cc0000><STRONG><UL>
        <dsp:droplet name="ErrorMessageForEach">
          <dsp:param bean="SiebelAccountFormHandler.formExceptions" name="exceptions"/>
          <dsp:oparam name="output">
            <LI> <dsp:valueof param="message"/>
          </dsp:oparam>
        </dsp:droplet>
      </UL></STRONG></font>
    </dsp:oparam>
  </dsp:droplet>

  <dsp:getvalueof var="redirectUrl" param="redirectUrl"/>
  
  <c:if test="${empty redirectUrl}">
    <c:set var="redirectUrl" value="addresses.jsp" />
  </c:if>

  <dsp:form action="${redirectUrl}" method="post" >
    <dsp:input bean="SiebelAccountFormHandler.itemDescriptorName" 
               type="hidden" value="contactInfo"/>
    <dsp:input bean="SiebelAccountFormHandler.updateItemDescriptorName"
               type="hidden" value="organization"/>
    <dsp:input bean="SiebelAccountFormHandler.updateRepositoryId" 
               beanvalue="Profile.parentOrganization.repositoryid" type="hidden"/>
    <dsp:input bean="SiebelAccountFormHandler.updatePropertyName"
               type="hidden" value="secondaryAddresses"/>
    <dsp:input bean="SiebelAccountFormHandler.requireIdOnCreate"
               type="hidden" value="false"/>
    <dsp:input bean="SiebelAccountFormHandler.requiredFields" name="hiddencompany"
               type="hidden" value="ADDRESS1"/> 
    <dsp:input bean="SiebelAccountFormHandler.requiredFields" name="hiddencompany"
               type="hidden" value="CITY"/> 
    <dsp:input bean="SiebelAccountFormHandler.requiredFields" name="hiddencompany"
               type="hidden" value="POSTALCODE"/> 
    <dsp:input bean="SiebelAccountFormHandler.createErrorURL" type="hidden"
               value="address_create.jsp"/>  
    
    NOTE:The nickname field is used to identify this address when you don't have access to the full address.<br>
    It should be unique from all other billing address nicknames. It can often be the same as the company name.<br><br>

    <table class="firstcolumnbold">
      <tr> 
        <td>Nickname:</td>
        <td><dsp:input bean="SiebelAccountFormHandler.updateKey" name="nickName" 
                       size="30" type="text" value=""/>
        </td>
      </tr>
      <tr>
        <td>Company Name:</td>
        <td><dsp:input bean="SiebelAccountFormHandler.value.companyName"
                       name="companyName" size="30" type="text" value=""/>
        </td>
      </tr>
      <tr>
        <td>Address:</td>
        <td>
          <dsp:input bean="SiebelAccountFormHandler.value.address1" 
                       name="address1" size="30" type="text" value=""/>
          <br>
          <dsp:input bean="SiebelAccountFormHandler.value.address2" 
                     name="address2" size="30" type="text" value=""/>
        </td>
      </tr>
      <tr>
        <td>City:</td>
        <td><dsp:input bean="SiebelAccountFormHandler.value.city"
                       name="city" size="30" type="text" value=""/>
        </td>
      </tr>
      <tr>
        <td>State/Province:</td>
        <td> 
          <dsp:input bean="SiebelAccountFormHandler.value.state"
                     name="state" size="10" type="text" value=""/>
        </td>
      </tr>
      <tr>
        <td>Zip/Postal Code:</td>
        <td> 
          <dsp:input bean="SiebelAccountFormHandler.value.postalCode" 
                     name="postalCode" size="10" type="text" value=""/>
        </td>
      </tr>
    </table>
        
    <br>
    <dsp:input bean="SiebelAccountFormHandler.create" type="submit" value="Save"/>&nbsp; 
    <input type="submit" value=" Cancel ">

  </dsp:form>
</dsp:page>
<%-- @version $Id: //product/Siebel/version/11.2/j2ee/siebel.war/admin/address_create.jsp#1 $$Change: 1186180 $--%>
