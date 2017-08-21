<%@ taglib prefix="dsp"
	uri="http://www.atg.com/taglibs/daf/dspjspTaglib1_0"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<dsp:page>

	<head>
<link href="../general.css" rel="stylesheet" type="text/css">
	</head>

	<dsp:importbean bean="/atg/userprofiling/Profile" />
	<dsp:importbean bean="/atg/siebel/account/SiebelAccountFormHandler" />


	<%-- main content area --%>

	<c:set var="url" value="billingprofile_create.jsp" />

	<dsp:form action="${url}" method="post">
		<dsp:input bean="SiebelAccountFormHandler.itemDescriptorName"
			type="hidden" value="contactInfo" />
		<dsp:input bean="SiebelAccountFormHandler.updateItemDescriptorName"
			type="hidden" value="organization" />
		<dsp:input bean="SiebelAccountFormHandler.updateRepositoryId"
			beanvalue="Profile.parentOrganization.repositoryid" type="hidden" />
		<dsp:input bean="SiebelAccountFormHandler.updatePropertyName"
			type="hidden" value="secondaryAddresses" />
		<dsp:input bean="SiebelAccountFormHandler.requireIdOnCreate"
			type="hidden" value="false" />
		<dsp:input bean="SiebelAccountFormHandler.createErrorURL"
			type="hidden" value="${url}" />

		<table class="createaddress">
			<tr>
				<td><h3>Create New Address</h3></td>
			</tr>
			<tr>
				<td>Nickname* :</td>
				<td><dsp:input bean="SiebelAccountFormHandler.updateKey"
						name="nickName" size="30" type="text" value="" /></td>
			</tr>
			<tr>
				<td>Company Name:</td>
				<td><dsp:input
						bean="SiebelAccountFormHandler.value.companyName"
						name="companyName" size="30" type="text" value="" /></td>
			</tr>
			<tr>
				<td>Address Line 1* :</td>
				<td><dsp:input bean="SiebelAccountFormHandler.value.address1"
						name="address1" size="30" type="text" value="" /></td>
			</tr>
			<tr>
				<td>Address Line 2:</td>
				<td><dsp:input bean="SiebelAccountFormHandler.value.address2"
						name="address2" size="30" type="text" value="" /></td>
			</tr>
			<tr>
				<td>City* :</td>
				<td><dsp:input bean="SiebelAccountFormHandler.value.city"
						name="city" size="30" type="text" value="" /></td>
			</tr>
			<tr>
				<td>State/Province:</td>
				<td><dsp:input bean="SiebelAccountFormHandler.value.state"
						name="state" size="10" type="text" value="" /></td>
			</tr>
			<tr>
				<td>Zip/Postal Code* :</td>
				<td><dsp:input bean="SiebelAccountFormHandler.value.postalCode"
						name="postalCode" size="10" type="text" value="" /></td>
			</tr>
			<tr>
				<br>
				<td><dsp:input bean="SiebelAccountFormHandler.create"
						type="submit" value="Create New Address" />&nbsp;</td>
				<td><input type="submit" value=" Cancel "></td>
			</tr>
		</table>

		<br>

	</dsp:form>
</dsp:page>
<%-- @version $Id: //product/Siebel/version/11.2/j2ee/siebel.war/admin/billingprofile_address_create.jsp#1 $$Change: 1186180 $--%>
