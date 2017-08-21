<%@ taglib prefix="dsp" uri="http://www.atg.com/taglibs/daf/dspjspTaglib1_0" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="dspel" uri="http://www.atg.com/taglibs/daf/dspjspELTaglib1_0" %>

<dsp:importbean bean="/atg/siebel/configurator/ui/ConfigurationFormHandler" var="formHandler"/>
    
<dsp:page>

<head>
  <link href="../general.css" rel="stylesheet" type="text/css">
  <link href="configurator.css" rel="stylesheet" type="text/css">
</style>

</head>
	<dsp:getvalueof param="commerceItemId" var="commerceItemId" /> 
      <dsp:droplet name="/atg/siebel/configurator/ui/GetPromotionTemplate">
		<dsp:param name="commerceItemId" value="${commerceItemId}" />
		<dsp:oparam name="output">
	      <dsp:getvalueof var="promotionTemplate" param="promotionTemplate" />
		</dsp:oparam>
	  </dsp:droplet>
	  
  <dsp:include page="../navigation.jsp"/> <br>
  <h1>Choose products</h1>
  <h3>${promotionTemplate.displayName}</h3>
  
  <span class="errortext"> 
    <dsp:droplet name="/atg/dynamo/droplet/ErrorMessageForEach"> 
       <dsp:param name="exceptions" bean="ConfigurationFormHandler.formExceptions"/> 
       <dsp:oparam name="output"> 
          <b> 
          <dsp:valueof param="message"/> 
          </b> 
          <p> 
      </dsp:oparam> 
    </dsp:droplet> 
  </span>


	<dsp:form action="${pageContext.request.requestURI}?commerceItemId=${commerceItemId}" method="post" id="beginConfig">
    
      <table id="promotionedit">
      <tbody>
        <tr>
          <th id="rootproduct">Root Product</th>
          <th id="domainproduct">Domain Product</th>
          <th>Quantity</th>
        </tr>
      <c:forEach items="${promotionTemplate.childRelationships}" var="child" varStatus="status">
        <tr>
            <c:choose>
            <c:when test="${child.domainProductCount > '0'}">
                <td rowspan="${child.domainProductCount+1}"><span class="boldtext"><c:out value="${child.productName}"/></span></td>
                <c:forEach items="${child.domainProducts}" var="domainProduct" varStatus="domainStatus">
                    <tr>
                    <td><c:out value="${domainProduct.name}"/></td>
                    <td><dsp:input type="text" value="${domainProduct.quantity}"
                        bean="ConfigurationFormHandler.promotion.childRelationships[${status.index}].domainProducts[${domainStatus.index}].quantity" size="5"/><br></td>
                    </tr>    
                </c:forEach>
            </c:when>
            <c:otherwise> 
                <td><span class="boldtext"><c:out value="${child.productName}"/></span></td>
                <td>
                    <c:if test="${child.domainProductCount == '1'}">
                        <dsp:valueof value="${child.domainProducts[0].name}"/>
                    </c:if>     
                </td>       
                <td>
                    <c:set value="${promotionTemplate.childRelationships[status.index].minimumQuantity}" var="min" />
                    <c:set value="${promotionTemplate.childRelationships[status.index].maximumQuantity}" var="max" />
                    <c:set var="diff" value="${max - min}"></c:set>
                    <c:choose>
                        <c:when test="${diff == 0}">
                            <dsp:input type="hidden" value="${min}"
                        bean="ConfigurationFormHandler.promotion.childRelationships[${status.index}].quantity"/>
                            <c:out value="${min}"/>
                        </c:when>
                        <c:otherwise>
                            <dsp:select bean="ConfigurationFormHandler.promotion.childRelationships[${status.index}].quantity">
                                <dsp:droplet name="/atg/dynamo/droplet/For">
                                    <dsp:param name="howMany" value="${diff + 1}"/>
                                    <dsp:oparam name="output">
                                        <dsp:getvalueof param="index" var="idx"/>
                                        <c:choose>
                                          <c:when test="${(min + idx) == child.quantity}">
                                            <dsp:option selected="true" value="${min + idx}">${min + idx}</dsp:option>
                                          </c:when>
                                          <c:otherwise>
                                            <dsp:option value="${min + idx}">${min + idx}</dsp:option>
                                          </c:otherwise>
                                        </c:choose>
                                    </dsp:oparam>
                                </dsp:droplet>
                            </dsp:select>
                        </c:otherwise>
                    </c:choose>
                </td>
            </c:otherwise>
            </c:choose>
        <tr>
      </c:forEach>
      </tbody>
      </table>
      <br>
      <dsp:input type="submit" bean="ConfigurationFormHandler.initialisePromotion" value="Configure Products"/>
    </dsp:form>
    
</dsp:page>
<%-- @version $Id: //product/Siebel/version/11.2/j2ee/siebel.war/configurator/promotion_edit_template.jsp#1 $$Change: 1186180 $--%>
