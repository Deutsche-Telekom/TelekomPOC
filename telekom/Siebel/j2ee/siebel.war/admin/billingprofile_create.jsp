<%@ taglib prefix="dsp"	uri="http://www.atg.com/taglibs/daf/dspjspTaglib1_0"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<dsp:page>

  <head>
    <link href="../general.css" rel="stylesheet" type="text/css">
    <link href="../account.css" rel="stylesheet" type="text/css">
  </head>

	<dsp:importbean bean="/atg/userprofiling/Profile" />
	<dsp:importbean bean="/atg/dynamo/droplet/Format" />
	<dsp:importbean bean="/atg/siebel/account/SiebelAccountCreationFormHandler"/>
	<dsp:importbean bean="/atg/siebel/account/SiebelAccountFormHandler"/>
	<dsp:importbean bean="/atg/siebel/account/SiebelAccountInputBean"/>
	<dsp:importbean bean="/atg/dynamo/droplet/TableForEach" />
    <dsp:importbean bean="/atg/dynamo/droplet/IsEmpty" />
    <dsp:importbean bean="/atg/dynamo/droplet/Compare" />
    <dsp:importbean bean="/atg/dynamo/droplet/ArrayIncludesValue" />
    <dsp:importbean bean="/atg/dynamo/droplet/ForEach" />
	<dsp:importbean bean="/atg/dynamo/droplet/ErrorMessageForEach"/>
	<dsp:importbean bean="/atg/dynamo/droplet/Switch"/>

  <dsp:include page="../navigation.jsp"/>

  <h1>Create New Billing Profile</h1>

  <span class="highlighttext">Current Account:</span>&nbsp;&nbsp;
        <dsp:valueof bean="Profile.parentOrganization.name" /><br><br>

 <dsp:droplet name="Switch">
    <dsp:param bean="SiebelAccountCreationFormHandler.formError" name="value"/>
    <dsp:oparam name="true">
        <dsp:droplet name="ErrorMessageForEach">
          <dsp:param  bean="SiebelAccountCreationFormHandler.formExceptions" name="exceptions"/>
          <dsp:oparam name="output">
            <span class="errorhighlight"> <dsp:valueof param="message"/></span><br>
          </dsp:oparam>
        </dsp:droplet>
    </dsp:oparam>
  </dsp:droplet>
    <dsp:droplet name="Switch">
    <dsp:param bean="SiebelAccountFormHandler.formError" name="value"/>
    <dsp:oparam name="true">
        <dsp:droplet name="ErrorMessageForEach">
          <dsp:param bean="SiebelAccountFormHandler.formExceptions" name="exceptions"/>
          <dsp:oparam name="output">
             <span class="errorhighlight"> <dsp:valueof param="message"/></span><br>
          </dsp:oparam>
        </dsp:droplet>
    </dsp:oparam>
  </dsp:droplet>
  
  <dsp:getvalueof var="redirectUrl" param="redirectUrl"/>
  <c:choose>
    <c:when test="${not empty redirectUrl}">
      <c:set var="postUrl" value="${redirectUrl }"/>
    </c:when>
    <c:otherwise>
      <c:set var="postUrl" value="manage_billing_profiles.jsp"/>
    </c:otherwise>
  </c:choose>
<div id="billingprofile"style="width:1110px;">
  <dsp:form action="${postUrl }" method="post" >
	
  	<dsp:input bean="SiebelAccountCreationFormHandler.billingProfileErrorURL" type="hidden"
               value="billingprofile_create.jsp"/> 
    <dsp:input bean="SiebelAccountCreationFormHandler.billingProfileSuccessURL" type="hidden"
               value="manage_billing_profiles.jsp"/>  		   
					<dsp:input bean="SiebelAccountCreationFormHandler.SiebelAccountInputBean.siebelAccountId"
                    type="hidden" beanvalue="Profile.parentOrganization.siebelId"/>	<dsp:input bean="SiebelAccountCreationFormHandler.SiebelAccountInputBean.organizationId"
                    type="hidden" beanvalue="Profile.parentOrganization.repositoryid"/>
            							
     <table  align="center">
	  <tr>
      <td><h3>Enter Card Details</h3></td>
    </tr>
     <tr>
        <td>Card Number*:</td>
        <td><dsp:input bean="SiebelAccountCreationFormHandler.SiebelAccountInputBean.creditCardNumber"
                       name="creditCardNumber" size="30" type="text" required="true" value=""/> 
    
        <td>Expiration Month*:</td>
        <td><dsp:input bean="SiebelAccountCreationFormHandler.SiebelAccountInputBean.expirationMonth"
                       name="expirationMonth" size="10" type="text" required="true" value=""/>
   
        <td>Expiration Year*:</td>
        <td> 
          <dsp:input bean="SiebelAccountCreationFormHandler.SiebelAccountInputBean.expirationYear"
                     name="expirationYear" size="10" type="text" required="true" value=""/>

        <td>Credit Card Type*:</td>
        <td> 
          <dsp:select bean="SiebelAccountCreationFormHandler.SiebelAccountInputBean.creditCardType" name="creditCardType"  nodefault="true" priority="10">
				<dsp:option value="VISA">VISA</dsp:option>
				<dsp:option value="Mastercard">Mastercard</dsp:option>				
				<dsp:option value="American Express">American Express</dsp:option>
				<dsp:option value="Diners Club">Diners Club</dsp:option>
		  </dsp:select>
        </td>		
      </tr>
    </table>        
    <br>
    <div id="selectaddress" style="padding-left:5px;float:left;display:inline;width:640px;">
	
    <table style="min-width:630px;">
    <tr>
      <td><h3>Select an address to be associated with this Billing Profile </h3></td>
    </tr>
    <tr>
      <td colspan=2>
        <dsp:droplet name="TableForEach">
          <dsp:param bean="Profile.parentOrganization.secondaryAddresses" name="array" />
          <dsp:param name="elementName" value="billingAddress" />
          <dsp:param name="numColumns" value="5" />          
          <dsp:oparam name="outputStart">
            <table  class="nestedtable">
          </dsp:oparam>            
          <dsp:oparam name="outputEnd">
            </table>
          </dsp:oparam>          
          <dsp:oparam name="outputRowStart">
            <tr>
          </dsp:oparam>          
          <dsp:oparam name="outputRowEnd">
            </tr>
          </dsp:oparam>  
		  <dsp:oparam name="empty">
                   &nbsp; &nbsp;  No existing addresses found for this account. Create a new address to proceed furthur !!
          </dsp:oparam>		  
          <dsp:oparam name="output">
            <dsp:droplet name="IsEmpty">
              <dsp:param name="value" param="billingAddress" />                
              <dsp:oparam name="true">
                <td></td>
              </dsp:oparam>              
              <dsp:oparam name="false">
			     <td>
                      <dsp:input bean="SiebelAccountCreationFormHandler.SiebelAccountInputBean.addressId"
                                 paramvalue="billingAddress.repositoryid"
                                 name="billingAddress" type="radio" checked="true" />
				      <dsp:valueof param="billingAddress.address1"/>,<br>
					  <dsp:valueof param="billingAddress.city"/>,
					  <dsp:valueof param="billingAddress.state"/><br>
                </td>
              </dsp:oparam>
            </dsp:droplet>
            <%-- End of IsEmpty --%>
          </dsp:oparam>
        </dsp:droplet>
        <%-- End of TableForEach --%>
      </td>
    </tr>
  </table> </br>
 
    <dsp:input bean="SiebelAccountCreationFormHandler.CreateBillingProfile" type="submit" value="Save this Profile" />&nbsp; 
    <input type="submit" value=" Cancel ">
  </dsp:form>
  </div>
  <img id="img_billingprofile"style="width:50px;margin-top:60px;"src="../content/images/or_seperator_en.png" />
  <div id="createaddress" style="float:right;width:400px;display:inline;margin-top:-20px">
  <dsp:include page="billingprofile_address_create.jsp"/>
  </div>
  <div style="clear:both">
  </div>
  </div>
</dsp:page>
<%-- @version $Id: //product/Siebel/version/11.2/j2ee/siebel.war/admin/billingprofile_create.jsp#1 $$Change: 1186180 $--%>
