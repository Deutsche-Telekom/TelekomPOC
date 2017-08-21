<%@ taglib prefix="dsp" uri="http://www.atg.com/taglibs/daf/dspjspTaglib1_0" %>
<dsp:page>

  <head>
    <link href="../general.css" rel="stylesheet" type="text/css">
  </head>

  <dsp:importbean bean="/atg/userprofiling/Profile"/>
  <dsp:importbean bean="/atg/dynamo/droplet/ForEach"/>
  <dsp:importbean bean="/atg/dynamo/droplet/IsEmpty"/>
  <dsp:importbean bean="/atg/dynamo/droplet/Compare"/>
  <dsp:importbean bean="/atg/siebel/account/SiebelAccountFormHandler"/>
  <dsp:importbean bean="/atg/dynamo/droplet/ArrayIncludesValue"/>

  <dsp:include page="../navigation.jsp"/>

  <h1>Default Shipping Address</h1>

  <span class="highlighttext">Current Account:</span>&nbsp;&nbsp;
        <dsp:valueof bean="Profile.parentOrganization.name" /><br><br>
              
  <%--  main content area --%>
  <dsp:form action="company_admin.jsp" method="post">
      
    <dsp:input bean="SiebelAccountFormHandler.itemDescriptorName" type="hidden" value="organization"/>
    <dsp:input bean="SiebelAccountFormHandler.repositoryId" beanvalue="Profile.parentOrganization.repositoryid" type="hidden"/>
  
    <dsp:droplet name="ForEach">
      <dsp:param bean="Profile.parentOrganization.secondaryAddresses" name="array"/>
      <dsp:param name="elementName" value="shippingAddress"/>
      <dsp:oparam name="outputStart">
        <table>
          <tr>
            <th>Default&nbsp;&nbsp;&nbsp;&nbsp;</th>  
            <th>Address</th>  
          </tr>      
      </dsp:oparam>
      <dsp:oparam name="outputEnd">
        </table>
        <br>
        <dsp:input bean="SiebelAccountFormHandler.update" type="submit" value=" Save "/>
        <input type="submit" name="cancel" value="Cancel">
      </dsp:oparam>
      <dsp:oparam name="empty">
        There are no Addresses setup. Please create some addresses. <a href="addresses.jsp">Addresses</a>
      </dsp:oparam>
      <dsp:oparam name="output">
        <tr>
	        <dsp:droplet name="IsEmpty">
	          <dsp:param name="value" param="shippingAddress"/>
	          <dsp:oparam name="true">
	            <td></td>
	          </dsp:oparam>
	          <dsp:oparam name="false">
	            <dsp:droplet name="IsEmpty">
	              <dsp:param bean="Profile.parentOrganization.shippingAddress" name="value"/>
	              <dsp:oparam name="true">
	                <td>
	                  <dsp:input bean="SiebelAccountFormHandler.value.shippingAddress.repositoryid"
	                             paramvalue="shippingAddress.repositoryid" name="shippingAddress" type="radio"/>
	                </td>
	              </dsp:oparam>
	              <dsp:oparam name="false">
	                <dsp:droplet name="Compare">
	                  <dsp:param name="obj1" param="shippingAddress.repositoryid"/>
	                  <dsp:param bean="Profile.parentOrganization.shippingAddress.repositoryid" name="obj2"/>
	                  <dsp:oparam name="equal">
	                    <td>
	                      <dsp:input bean="SiebelAccountFormHandler.value.shippingAddress.repositoryid" 
	                                 paramvalue="shippingAddress.repositoryid" name="shippingAddress" type="radio" 
	                                 checked="<%=true%>"/>
	                    </td>
	                  </dsp:oparam>
	                  <dsp:oparam name="default">
	                    <td>
	                      <dsp:input bean="SiebelAccountFormHandler.value.shippingAddress.repositoryid"
	                                 paramvalue="shippingAddress.repositoryid" name="shippingAddress" type="radio"/>
	                    </td>    
	                  </dsp:oparam>
	                </dsp:droplet>
	                <%-- End of Compare --%>
	              </dsp:oparam>
	            </dsp:droplet>
	            <%-- End of IsEmpty --%>
	            <td>
	              <dsp:getvalueof id="pval0" param="shippingAddress"><dsp:include page="../common/DisplayAddress.jsp"><dsp:param name="address" value="<%=pval0%>"/></dsp:include></dsp:getvalueof>
	            </td>
	          </dsp:oparam>
	        </dsp:droplet>
	        <%-- End of IsEmpty --%>
        </tr>
      </dsp:oparam>
    </dsp:droplet>
    <%-- End of TableForEach --%>
               
  </dsp:form>

</dsp:page>
<%-- @version $Id: //product/Siebel/version/11.2/j2ee/siebel.war/admin/default_shipping_edit.jsp#1 $$Change: 1186180 $--%>
