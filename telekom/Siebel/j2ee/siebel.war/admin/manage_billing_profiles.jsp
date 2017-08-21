<%@ taglib prefix="dsp" uri="http://www.atg.com/taglibs/daf/dspjspTaglib1_0" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<dsp:page>

  <head>
    <link href="../general.css" rel="stylesheet" type="text/css">
    <link href="admin.css" rel="stylesheet" type="text/css">
  </head>

  <dsp:importbean bean="/atg/userprofiling/Profile"/>
  <dsp:importbean bean="/atg/dynamo/droplet/ForEach"/>
  <dsp:importbean bean="/atg/dynamo/droplet/IsEmpty"/>
  <dsp:importbean bean="/atg/dynamo/droplet/Compare"/>
  <dsp:importbean bean="/atg/siebel/account/SiebelAccountFormHandler"/>

  <dsp:include page="../navigation.jsp"/>

  <h1>Manage Billing Profiles</h1>
  
  <span class="highlighttext">Current Account:</span>&nbsp;&nbsp;
        <dsp:valueof bean="Profile.parentOrganization.name" /><br><br>

  <dsp:getvalueof var="redirectUrl" param="redirectUrl"/>

  <c:choose>
    <c:when test="${not empty redirectUrl}">
      <c:set var="postUrl" value="${redirectUrl }"/>
	  <c:set var="createUrl" value="billingprofile_create.jsp?redirectUrl=manage_billing_profiles.jsp?redirectUrl=${redirectUrl}"/>
      <c:set var="editUrl" value="billingprofile_edit.jsp?redirectUrl=manage_billing_profiles.jsp?redirectUrl=${redirectUrl}"/>
    </c:when>
    <c:otherwise>	
      <c:set var="postUrl" value="company_admin.jsp"/>
	  <c:set var="createUrl" value="billingprofile_create.jsp"/>
      <c:set var="editUrl" value="billingprofile_edit.jsp"/>
    </c:otherwise>
  </c:choose>

  <dsp:a href="${createUrl}">Create new Billing Profile</dsp:a><br><br>
  <%--  main content area --%>
  <dsp:form action="${postUrl }" method="post">

    <dsp:input bean="SiebelAccountFormHandler.itemDescriptorName" 
               type="hidden" value="organization"/>
               
    <dsp:input bean="SiebelAccountFormHandler.repositoryId" 
               beanvalue="Profile.parentOrganization.repositoryid" type="hidden"/>
  

    <dsp:droplet name="ForEach">
      <dsp:param bean="Profile.parentOrganization.creditCards" name="array"/>
      <dsp:param name="elementName" value="cc"/>
      <dsp:oparam name="outputStart">
        <table id="managebillingprofile">
          <tr>
            <th id="mbp_default">Default</th>  
            <th></th>  
            <th id="mbp_cardnumber">Card Number</th>  
            <th id="mbp_cardtype">Type</th>  
            <th id="mbp_expiry">Expiry</th>  
            <th id="mbp_address">Billing Address</th>  
          </tr>      
      </dsp:oparam>
      <dsp:oparam name="outputEnd">
        </table>
        <br>        
        <dsp:input bean="SiebelAccountFormHandler.update" type="submit" value=" Save "/>
        <input type="submit" name="cancel" value="Cancel">
      </dsp:oparam>
      <dsp:oparam name="outputRowStart">
        <tr>
      </dsp:oparam>
      <dsp:oparam name="outputRowEnd">
        </tr>
      </dsp:oparam>
      <dsp:oparam name="empty">
        There are no Billing Profiles setup for this account. 
      </dsp:oparam>
      <dsp:oparam name="output">
        <dsp:droplet name="IsEmpty">
          <dsp:param name="value" param="cc"/>
          <dsp:oparam name="true">
              <td></td>
          </dsp:oparam>
          <dsp:oparam name="false">
            <tr>                  
              <dsp:droplet name="IsEmpty">
                <dsp:param bean="Profile.parentOrganization.defaultCreditCard" name="value"/>
                <dsp:oparam name="true">
                  <td>
                    <dsp:input bean="SiebelAccountFormHandler.value.defaultCreditCard.repositoryid"
                               paramvalue="cc.repositoryid" type="radio"/>
                  </td>
                </dsp:oparam>
                <dsp:oparam name="false">                              
                  <dsp:droplet name="Compare">
                    <dsp:param name="obj1" param="cc.repositoryid" />
                    <dsp:param 
                        name="obj2" 
                        bean="Profile.parentOrganization.defaultCreditCard.repositoryid" />
                    <dsp:oparam name="equal">
                      <td >
                        <dsp:input
                            bean="SiebelAccountFormHandler.value.defaultCreditCard.repositoryid"
                            paramvalue="cc.repositoryid" type="radio" checked="<%=true%>" />
                      </td>
                    </dsp:oparam>
                    <dsp:oparam name="default">
                      <td>
                        <dsp:input
                              bean="SiebelAccountFormHandler.value.defaultCreditCard.repositoryid"
                              paramvalue="cc.repositoryid" type="radio" />
                      </td>
                    </dsp:oparam>
                  </dsp:droplet>
			   					<%-- End of Compare --%> 
               </dsp:oparam>
              </dsp:droplet>  
              <%-- End of IsEmpty --%>
                          
					    <td>
					      <dsp:a  href="${editUrl }">Edit
					        <dsp:param name="Id" param="cc.repositoryId" />
					      </dsp:a> 
					    </td> 
             
              <dsp:getvalueof id="pval0" param="cc">
                <dsp:include page="../common/DisplayBillingProfile.jsp">
                  <dsp:param name="cc" value="<%=pval0%>"/>
                </dsp:include>
              </dsp:getvalueof>

            </tr>
          </dsp:oparam>
        </dsp:droplet>
        <%-- End of IsEmpty --%>
      </dsp:oparam>
    </dsp:droplet>

  </dsp:form>

</dsp:page>
<%-- @version $Id: //product/Siebel/version/11.2/j2ee/siebel.war/admin/manage_billing_profiles.jsp#1 $$Change: 1186180 $--%>
