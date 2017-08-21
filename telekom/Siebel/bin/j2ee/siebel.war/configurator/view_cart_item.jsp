<%@ taglib prefix="dsp"
	uri="http://www.atg.com/taglibs/daf/dspjspTaglib1_0"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="dspel"
	uri="http://www.atg.com/taglibs/daf/dspjspELTaglib1_0"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>


<dsp:importbean bean="/atg/dynamo/droplet/ForEach" />
<dsp:importbean bean="/atg/commerce/pricing/CurrencyCodeDroplet"/>
<dsp:importbean bean="/atg/siebel/configurator/ui/ConfigurationEditFormHandler" var="formHandler"/>
<dsp:importbean bean="/atg/commerce/order/purchase/CartModifierFormHandler" var="cartFormHandler"/>

<dsp:page>

	<dsp:getvalueof param="commerceItem" var="commerceItem" />
	<dsp:getvalueof param="parentItemId" var="parentItemId" />
	<dsp:getvalueof param="indentlevel" var="indentlevel" />
	<dsp:getvalueof param="toBeConfigured" var="toBeConfigured" />
	
  <tr>
  
    <dsp:droplet name="/atg/targeting/RepositoryLookup">
      <dsp:param name="repository" bean="/atg/commerce/catalog/ProductCatalog"/>
      <dsp:param name="itemDescriptor" value="product"/>
      <dsp:param name="id" value="${commerceItem.auxiliaryData.productId }"/>
      <dsp:oparam name="output">
        <dsp:tomap var="productMap" param="element"/>
          <td>
            <dsp:droplet name="/atg/dynamo/droplet/For">
              <dsp:param name="howMany" value="${indentlevel}"/>  
              <dsp:oparam name="output"> 
						    &nbsp;&nbsp; &nbsp;&nbsp;  
              </dsp:oparam>
            </dsp:droplet>
            <c:if test="${indentlevel == 0}">
              <span class="boldtext">
            </c:if>
            ${productMap.displayName} 
			<c:if test="${indentlevel == 0}">
              </span>
            </c:if>
      </dsp:oparam>
    </dsp:droplet>
	</td>
 	<td>${commerceItem.actionCode}</td>
    <td>$${commerceItem.priceInfo.monthlyRecurringPrice} </td>
    <td>$${commerceItem.priceInfo.nonRecurringPrice} </td>
 	
    <c:choose>
      <c:when test="${indentlevel == 0  && commerceItem.commerceItemType != 'UPGRADEPROMOTION'}"> 	
        <td>
          <dsp:form>
            <dsp:input type="hidden" value="${commerceItem.id}" 
                       bean="ConfigurationEditFormHandler.commerceItemId"/>
            <dsp:layeredBundle basename="atg.siebel.WebAppResources">
              <fmt:message key="simpleProduct" var="simpleProd"/>
            </dsp:layeredBundle>
            <c:if test="${productMap.siebelType != simpleProd}">
            <dsp:input type="submit" value="Edit" 
                       bean="ConfigurationEditFormHandler.configurationEdit" priority="-10">
            </dsp:input>
            </c:if>
          </dsp:form>
        </td>
        <td>
          <dsp:form>          
            <dsp:input type="hidden" value="${pageContext.request.requestURI}" 
                       bean="CartModifierFormHandler.removeItemFromOrderSuccessURL"/>
            <dsp:input type="hidden" value="${commerceItem.id}" 
                       bean="CartModifierFormHandler.removalCommerceIds"/>
            <dsp:input type="submit" value="Remove" 
                       bean="CartModifierFormHandler.removeItemFromOrder" priority="-10">
            </dsp:input>
          </dsp:form>
        </td>
      </c:when>
      
      <c:when test="${indentlevel == 0 && commerceItem.commerceItemType == 'UPGRADEPROMOTION' && commerceItem.actionCode == 'Add'}"> 	
        <td>
          <dsp:form>
            <dsp:input type="hidden" value="${commerceItem.id}" 
                       bean="ConfigurationEditFormHandler.commerceItemId"/>
            <dsp:layeredBundle basename="atg.siebel.WebAppResources">
              <fmt:message key="simpleProduct" var="simpleProd"/>
            </dsp:layeredBundle>
            <c:if test="${productMap.siebelType != simpleProd}">
            <dsp:input type="submit" value="Edit" 
                       bean="ConfigurationEditFormHandler.configurationEdit" priority="-10">
            </dsp:input>
            </c:if>
          </dsp:form>
        </td>
        <td>
          <dsp:form>          
            <dsp:input type="hidden" value="${pageContext.request.requestURI}" 
                       bean="CartModifierFormHandler.removeItemFromOrderSuccessURL"/>
            <dsp:input type="hidden" value="${commerceItem.id}" 
                       bean="CartModifierFormHandler.removalCommerceIds"/>
            <dsp:input type="submit" value="Remove" 
                       bean="CartModifierFormHandler.removeItemFromOrder" priority="-10">
            </dsp:input>
          </dsp:form>
        </td>
      </c:when>
      
      <c:otherwise>
        <td></td><td></td>
      </c:otherwise>
    </c:choose>
        
  </tr>
    <c:if test="${commerceItem.attributeCount > 0}">
      <br>
    </c:if>
			 
    <c:forEach items="${commerceItem.siebelAttributes}" var="attribute">
      
	  <tr>
	  
      <td>
	  <dsp:droplet name="/atg/dynamo/droplet/For">
              <dsp:param name="howMany" value="${indentlevel+2}"/>  
				<dsp:oparam name="output"> 
						    &nbsp;&nbsp; &nbsp;&nbsp;  
              </dsp:oparam>
       </dsp:droplet>
	  ${attribute.attributeName } : <b>${attribute.value }</b><br></td>
	  <td>${attribute.actionCode }</b><br></td>
	  </tr>
    </c:forEach>
    
 	
   
 	
  <c:forEach items="${commerceItem.commerceItems}" var="childItem">
    <dsp:include page="view_cart_item.jsp">
      <dsp:param name="commerceItem" value="${childItem }" />
      <dsp:param name="parentItemId" value="${commerceItem.id }" />
      <dsp:param name="indentlevel" value="${indentlevel+1}" />			
      <dsp:param name="toBeConfigured" value="false"/>
    </dsp:include>
  </c:forEach>
  
</dsp:page>
<%-- @version $Id: //product/Siebel/version/11.2/j2ee/siebel.war/configurator/view_cart_item.jsp#1 $$Change: 1186180 $--%>
