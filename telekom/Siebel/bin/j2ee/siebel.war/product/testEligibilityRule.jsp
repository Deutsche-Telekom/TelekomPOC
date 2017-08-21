<%@ taglib prefix="dsp" uri="http://www.atg.com/taglibs/daf/dspjspTaglib1_0" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<dsp:page>
<dsp:importbean bean="/atg/userprofiling/Profile" />
<dsp:importbean bean="/atg/siebel/product/EligibilityCompatibilityRulesFormHandler" />
<dsp:importbean bean="/atg/dynamo/droplet/RQLQueryForEach" />
<dsp:importbean bean="/atg/commerce/catalog/ProductCatalog" />
<dsp:importbean bean="/atg/dynamo/droplet/ForEach"/>
<head>
    <link href="../general.css" rel="stylesheet" type="text/css">
    <link href="../checkout/checkout.css" rel="stylesheet" type="text/css">
    
    
</head>

  <dsp:include page="../navigation.jsp"/>
  
    
	
	<h1>Test Eligibility of a Product</h1><br><br>
	
	
    <span class="errortext"> 
      <dsp:valueof  bean="EligibilityCompatibilityRulesFormHandler.exceptionErrorMessage" />
	</span><br><br>
	
	<dsp:getvalueof var="anonymousUser" bean="Profile.transient" />
	<table>  
    <tr>
      <td>
        <h3>Select  product/s to test if you are eligible for the product/s</h3>
        <br>
        <dsp:droplet name="ForEach">
         <dsp:param name="array" bean="EligibilityCompatibilityRulesFormHandler.productErrorMessages"/>
         <dsp:oparam name="output">
         <h4><dsp:valueof param="element" /></h4>
         <br>
         </dsp:oparam>
        </dsp:droplet>
        
	    <dsp:form action="/siebel/product/testEligibilityRule.jsp" method="post">
	    <table>
	    <tr>
	    <c:if test="${anonymousUser == false}">
	    <td>
	    Profile ID: <dsp:valueof  bean="Profile.repositoryId" />
	    </td>
	    <td>
	    User ID: <dsp:valueof  bean="Profile.itemDisplayName" />
	    </td>
	    </c:if>
	    <c:if test="${anonymousUser == true}">
	    <td>
	    Profile ID: <dsp:input type="text" bean="EligibilityCompatibilityRulesFormHandler.otherProfileId" />
	    </td>
	    <td>
	    &nbsp
	    </td>
	    </c:if>
	    </tr>
	    <tr>
	    <td colspan="2">
		Product:
	    </td>
		</tr>
		<tr>
		<td colspan="2">
	    <dsp:select bean="EligibilityCompatibilityRulesFormHandler.productIdsArray" multiple="true" nodefault="false">
            <dsp:droplet name="RQLQueryForEach">
              <dsp:param bean="ProductCatalog" name="repository"/>
              <dsp:param name="itemDescriptor" value="product"/>
              <dsp:param name="queryRQL" 
                         value="siebelType=1000 OR siebelType=1001 OR siebelType=1002 OR siebelType=1003 OR siebelType=1004 ORDER BY displayName"/>
              <dsp:oparam name="output">
                <dsp:tomap param="element" var="elementItem"/>
                <dsp:option value="${elementItem.id}:${elementItem.displayName}">${elementItem.displayName}</dsp:option>
              </dsp:oparam>
            </dsp:droplet>
         </dsp:select>
		 </td>
		 </tr>
		 <tr>
         <td colspan="2">
         <c:if test="${anonymousUser == true}">
         Shipped to City: &nbsp<dsp:input type="text" bean="EligibilityCompatibilityRulesFormHandler.shippingCity" />
         </c:if>
         <c:if test="${anonymousUser == false}">
         Shipped to City: &nbsp<dsp:valueof  bean="Profile.parentOrganization.shippingAddress.city" />
         </c:if>
         </td>
	     </tr>
	     <tr>
         <td colspan="2">
         <c:if test="${anonymousUser == true}">
         Shipped to state: <dsp:input type="text" bean="EligibilityCompatibilityRulesFormHandler.shippingState" />
         </c:if>
         <c:if test="${anonymousUser == false}">
         Shipped to state: <dsp:valueof  bean="Profile.parentOrganization.shippingAddress.state" />
         </c:if>
         </td>
	     </tr>
	     <tr>
         <td colspan="2">
         <c:if test="${anonymousUser == true}">
         Shipped to Zip: &nbsp&nbsp<dsp:input type="text" bean="EligibilityCompatibilityRulesFormHandler.shippingZip" />
         </c:if>
         <c:if test="${anonymousUser == false}">
         Shipped to Zip: &nbsp&nbsp<dsp:valueof  bean="Profile.parentOrganization.shippingAddress.postalCode" />
         </c:if>
         </td>
	     </tr>
         <tr>
         <td>
         <dsp:input bean="EligibilityCompatibilityRulesFormHandler.checkEligibilityRules" type="submit" />
         </td>
	     </tr>
	     
	    </table> 
	     
	</dsp:form>
	</td>
  </tr>
  
  <c:if test="${anonymousUser == true}">
  <tr>
  <td>
  <h3> If Profile Id is entered, city/state/zip of the profile will be considered</h3>
  </td>
  </tr>
  </c:if>

  </table>
</dsp:page>
<%-- @version $Id: //product/Siebel/version/11.2/j2ee/siebel.war/product/testEligibilityRule.jsp#2 $$Change: 1190593 $--%>
<%-- @version $Id: //product/Siebel/version/11.2/j2ee/siebel.war/product/testEligibilityRule.jsp#2 $$Change: 1190593 $--%>
