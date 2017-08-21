<%@ taglib prefix="dsp"	uri="http://www.atg.com/taglibs/daf/dspjspTaglib1_0"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<dsp:page>

  <head>
    <link href="../general.css" rel="stylesheet" type="text/css">
  </head>

	<dsp:importbean bean="/atg/userprofiling/Profile" />
	<dsp:importbean bean="/atg/dynamo/droplet/Format" />
	<dsp:importbean bean="/atg/userprofiling/CreditCardLookup" />
	<dsp:importbean bean="/atg/siebel/account/SiebelAccountFormHandler" />

  <dsp:include page="../navigation.jsp"/>

  <h1>Edit Billing Profile</h1>

  <span class="highlighttext">Current Account:</span>&nbsp;&nbsp;
        <dsp:valueof bean="Profile.parentOrganization.name" /><br><br>

  <dsp:getvalueof var="redirectUrl" param="redirectUrl"/>

  <c:choose>
    <c:when test="${not empty redirectUrl}">
      <c:set var="postUrl" value="${redirectUrl }"/>
    </c:when>
    <c:otherwise>
      <c:set var="postUrl" value="manage_billing_profiles.jsp"/>
    </c:otherwise>
  </c:choose>

  <dsp:form action="${postUrl }" method="post">
    <dsp:input bean="SiebelAccountFormHandler.itemDescriptorName" 
          type="hidden" value="credit-card" />
    <dsp:input bean="SiebelAccountFormHandler.repositoryId" paramvalue="Id" type="hidden" />
    <dsp:input bean="SiebelAccountFormHandler.updateSuccessURL" 
          type="hidden" value="${postUrl }" />
            							
    <dsp:droplet name="CreditCardLookup">
      <dsp:param name="id" param="Id" />
      <dsp:param name="elementName" value="bp" />
      <dsp:oparam name="output">
        <table class="firstcolumnbold">
          <tr>
            <td>Card Number:</td>
            <td><dsp:input bean="SiebelAccountFormHandler.value.creditCardNumber"
                  paramvalue="bp.creditCardNumber" size="30" type="text" />
            </td>
          </tr>
          <tr>
            <td>Expiration Month:</td>
            <td><dsp:input bean="SiebelAccountFormHandler.value.expirationMonth"
                  paramvalue="bp.expirationMonth" size="30" type="text" />
            </td>
          </tr>
          <tr>
            <td>Expiration Year:</td>
            <td><dsp:input bean="SiebelAccountFormHandler.value.expirationYear"
                  paramvalue="bp.expirationYear" size="30" type="text" />
            </td>
          </tr>
        </table>
      </dsp:oparam>
    </dsp:droplet>
		
    <br><dsp:input bean="SiebelAccountFormHandler.update" type="submit" value=" Update " /> &nbsp;
    <input type="submit" value=" Cancel" name="submit">

  </dsp:form>

</dsp:page>
<%-- @version $Id: //product/Siebel/version/11.2/j2ee/siebel.war/admin/billingprofile_edit.jsp#1 $$Change: 1186180 $--%>
