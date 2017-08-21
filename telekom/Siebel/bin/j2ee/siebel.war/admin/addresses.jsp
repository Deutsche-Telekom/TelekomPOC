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
  <dsp:importbean bean="/atg/siebel/account/SiebelAccountFormHandler"/>

  <dsp:include page="../navigation.jsp"/>

  <h1>Manage Addresses</h1>
  
  <span class="highlighttext">Current Account:</span>&nbsp;&nbsp;
        <dsp:valueof bean="Profile.parentOrganization.name" /><br><br>

  <dsp:getvalueof var="redirectUrl" param="redirectUrl"/>
  
  <br>
  <c:choose>
    <c:when test="${not empty redirectUrl}">
      <c:set var="postUrl" value="${redirectUrl }"/>
      <c:set var="addressCreateUrl" value="address_create.jsp?redirectUrl=addresses.jsp?redirectUrl=${redirectUrl}"/>
      <c:set var="addressEditUrl" value="address_edit.jsp?redirectUrl=addresses.jsp?redirectUrl=${redirectUrl}"/>
      <c:set var="addressDeleteUrl" value="address_delete.jsp?redirectUrl=addresses.jsp?redirectUrl=${redirectUrl}"/>
    </c:when>
    <c:otherwise>
      <c:set var="postUrl" value="company_admin.jsp"/>
      <c:set var="addressCreateUrl" value="address_create.jsp"/>
      <c:set var="addressEditUrl" value="address_edit.jsp"/>
      <c:set var="addressDeleteUrl" value="address_delete.jsp"/>
    </c:otherwise>
  </c:choose>  
  
  <dsp:a href="${addressCreateUrl}">Create new address</dsp:a><br><br>
  
  <dsp:form action="${postUrl}" method="post">
      <dsp:input bean="SiebelAccountFormHandler.itemDescriptorName" 
               type="hidden" value="organization"/>
               
    <dsp:input bean="SiebelAccountFormHandler.repositoryId" 
               beanvalue="Profile.parentOrganization.repositoryid" type="hidden"/>
  
   <dsp:droplet name="ForEach">
    <dsp:param bean="Profile.parentOrganization.secondaryAddresses" name="array"/>
    <dsp:param name="elementName" value="address"/>
    
    <dsp:oparam name="outputStart">
      <table id="addresses" class="centrecells">
        <tr>
          <th class="defaultcol">Default<br>Billing</th>  
          <th class="defaultcol">Default<br>Shipping</th>  
          <th id="nicknamecol">Address Nickname</th>  
          <th id="addresscol">Address</th>  
          <th></th>  
          <th></th>  
        </tr>      
    </dsp:oparam>
    <dsp:oparam name="outputEnd">
      </table>
      <br>
      <dsp:input bean="SiebelAccountFormHandler.update" type="submit" value=" Save "/>
      <input type="submit" name="cancel" value="Cancel">
    </dsp:oparam>
    <dsp:oparam name="empty">
       
    </dsp:oparam>      
    <dsp:oparam name="output">
      <tr>
      <%-- check to see if address is blank --%>
      <dsp:droplet name="IsEmpty">
        <dsp:param name="value" param="address"/>
        <dsp:oparam name="true">
          <td></td>
        </dsp:oparam>
        <dsp:oparam name="false">
          <%-- Default billing address --%>
          <td>
            &nbsp;&nbsp;&nbsp;
            <dsp:droplet name="IsEmpty">
              <dsp:param name="value" bean="Profile.parentOrganization.billingAddress"/>
              <dsp:oparam name="true">
                <dsp:input bean="SiebelAccountFormHandler.value.billingAddress.repositoryid" 
                           paramvalue="address.repositoryId" type="radio"/>
              </dsp:oparam>
              <dsp:oparam name="false">            
                <dsp:droplet name="/atg/dynamo/droplet/Compare">
                  <dsp:param name="obj1" param="address.repositoryId"/>
                  <dsp:param name="obj2" bean="Profile.parentOrganization.billingAddress.repositoryId"/>
                  <dsp:oparam name="equal">
                    <dsp:input bean="SiebelAccountFormHandler.value.billingAddress.repositoryid"
                               paramvalue="address.repositoryId" type="radio" checked="<%=true%>"/>
                  </dsp:oparam>
                  <dsp:oparam name="default">
                    <dsp:input bean="SiebelAccountFormHandler.value.billingAddress.repositoryid" 
                               paramvalue="address.repositoryId" type="radio"/>
                  </dsp:oparam>
                </dsp:droplet>
              </dsp:oparam>
            </dsp:droplet>
          </td>
          <%-- Default shipping address --%>
          <td>
            &nbsp;&nbsp;&nbsp;
            <dsp:droplet name="IsEmpty">
              <dsp:param name="value" bean="Profile.parentOrganization.shippingAddress"/>
              <dsp:oparam name="true">
                <dsp:input bean="SiebelAccountFormHandler.value.shippingAddress.repositoryid" 
                           paramvalue="address.repositoryId" type="radio"/>
              </dsp:oparam>
              <dsp:oparam name="false">            
                <dsp:droplet name="/atg/dynamo/droplet/Compare">
                  <dsp:param name="obj1" param="address.repositoryId"/>
                  <dsp:param name="obj2"
                             bean="Profile.parentOrganization.shippingAddress.repositoryId"/>
                  <dsp:oparam name="equal">
                    <dsp:input bean="SiebelAccountFormHandler.value.shippingAddress.repositoryid" 
                               paramvalue="address.repositoryId" type="radio" checked="<%=true%>"/>
                  </dsp:oparam>
                  <dsp:oparam name="default">
                    <dsp:input bean="SiebelAccountFormHandler.value.shippingAddress.repositoryid"
                               paramvalue="address.repositoryId" type="radio"/>
                  </dsp:oparam>
                </dsp:droplet>
              </dsp:oparam>
            </dsp:droplet>
          </td>
          <%-- key is the "nickname" aka the "tag" --%>
          <td>
            <dsp:valueof param="key"/>
          </td>          
          <%-- display the address --%>
          <td>
            <dsp:getvalueof id="pval0" param="address">
              <dsp:include page="../common/DisplayAddress.jsp">
                <dsp:param name="address" value="<%=pval0%>"/>
              </dsp:include>
            </dsp:getvalueof>
          </td>
          <%-- add an Edit link --%>
          <td>
            <dsp:a href="${addressEditUrl }">Edit
              <dsp:param name="addressId" param="address.id"/>
              <dsp:param name="nickName" param="key"/>
            </dsp:a>
          </td>
          <%-- add a Delete link --%>
          <td>
            <dsp:droplet name="/atg/dynamo/droplet/Compare">
              <dsp:param name="obj1" param="address.repositoryId"/>
              <dsp:param name="obj2"
                         bean="Profile.parentOrganization.billingAddress.repositoryId"/>
              <dsp:oparam name="equal"/>
              <dsp:oparam name="default">
                <dsp:a href="${addressDeleteUrl }">
                  <dsp:param name="addressId" param="address.id"/>
                  <dsp:param name="nickName" param="key"/>Delete
                </dsp:a>
              </dsp:oparam>
            </dsp:droplet>
            <%-- end Compare --%>
          </td>
        </dsp:oparam>
      </dsp:droplet>
      <%-- end IsEmpty --%>
      </tr>
    </dsp:oparam>
  </dsp:droplet>
  <%-- end ForEach --%>
  
  
  </dsp:form>

</dsp:page>
<%-- @version $Id: //product/Siebel/version/11.2/j2ee/siebel.war/admin/addresses.jsp#1 $$Change: 1186180 $--%>
