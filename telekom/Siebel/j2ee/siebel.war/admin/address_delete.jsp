<%@ taglib prefix="dsp" uri="http://www.atg.com/taglibs/daf/dspjspTaglib1_0" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<dsp:page>

  <head>
    <link href="../general.css" rel="stylesheet" type="text/css">
  </head>

	<dsp:importbean bean="/atg/dynamo/droplet/ErrorMessageForEach"/>
	<dsp:importbean bean="/atg/dynamo/droplet/Switch"/>
	<dsp:importbean bean="/atg/userprofiling/Profile"/>
	<dsp:importbean bean="/atg/dynamo/droplet/Format"/>
	<dsp:importbean bean="/atg/userprofiling/AddressLookup"/>
	<dsp:importbean bean="/atg/siebel/account/SiebelAccountFormHandler"/>

  <dsp:include page="../navigation.jsp"/>

  <h1>Delete Address</h1>
  
  <span class="highlighttext">Current Account:</span>&nbsp;&nbsp;
        <dsp:valueof bean="Profile.parentOrganization.name" /><br><br>

  <%--  main content area --%>
  <dsp:droplet name="Switch">
    <dsp:param bean="SiebelAccountFormHandler.formError" name="value"/>
    <dsp:oparam name="true">
      <span class="errortext"><ul>
        <dsp:droplet name="ErrorMessageForEach">
          <dsp:param bean="SiebelAccountFormHandler.formExceptions" name="exceptions"/>
          <dsp:oparam name="output">
            <li> <dsp:valueof param="message"/></li>
          </dsp:oparam>
        </dsp:droplet>
      </ul></span>
    </dsp:oparam>
  </dsp:droplet>

  <dsp:getvalueof var="redirectUrl" param="redirectUrl"/>

  <c:choose>
    <c:when test="${not empty redirectUrl}">
      <c:set var="postUrl" value="${redirectUrl }"/>
    </c:when>
    <c:otherwise>
      <c:set var="postUrl" value="addresses.jsp"/>
    </c:otherwise>
  </c:choose>  
       
  <dsp:form action="${postUrl }" method="POST">
    <dsp:input bean="SiebelAccountFormHandler.repositoryId" paramvalue="addressId" type="hidden"/>
    <dsp:input bean="SiebelAccountFormHandler.itemDescriptorName" type="hidden" value="contactInfo"/>
    <dsp:input bean="SiebelAccountFormHandler.updateItemDescriptorName" type="hidden" value="organization"/>
    <dsp:input bean="SiebelAccountFormHandler.updateRepositoryId"
               beanvalue="Profile.parentOrganization.repositoryId" type="hidden"/>
    <dsp:input bean="SiebelAccountFormHandler.updatePropertyName" type="hidden" value="secondaryAddresses"/>
    <dsp:input bean="SiebelAccountFormHandler.updateKey" paramvalue="nickName" type="hidden"/>

    <%--  Prepare the URL to redirect to, in case of an error during form submission --%>
    <dsp:droplet name="Format">
      <dsp:param name="value1" param="addressId"/>
      <dsp:param name="value2" param="nickName"/>
      <dsp:param name="format" value="address_delete.jsp?addressId={value1}&nickName={value2}"/>
      <dsp:oparam name="output">
        <dsp:setvalue paramvalue="message" valueishtml="<%=true%>" param="deleteErrorURL"/>
        <dsp:input bean="SiebelAccountFormHandler.deleteErrorURL" paramvalue="deleteErrorURL" type="hidden"/>
      </dsp:oparam>
    </dsp:droplet>
         
    <dsp:droplet name="AddressLookup">
      <dsp:param name="id" param="addressId"/>
      <dsp:param name="elementName" value="address"/>
      <dsp:oparam name="output">
        <dsp:valueof param="nickName"/><br>                          
        <dsp:getvalueof id="pval0" param="address">
          <dsp:include page="../common/DisplayAddress.jsp">
            <dsp:param name="address" value="<%=pval0%>"/>
          </dsp:include>
        </dsp:getvalueof>
        <br><br>
        <dsp:input bean="SiebelAccountFormHandler.delete" type="submit" value="Delete address"/> &nbsp;
        <input type="submit" value="Cancel">
      </dsp:oparam>
    </dsp:droplet>

  </dsp:form>
</dsp:page>
<%-- @version $Id: //product/Siebel/version/11.2/j2ee/siebel.war/admin/address_delete.jsp#1 $$Change: 1186180 $--%>
