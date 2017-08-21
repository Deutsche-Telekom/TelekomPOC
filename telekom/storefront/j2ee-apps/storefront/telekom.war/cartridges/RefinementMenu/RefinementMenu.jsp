<%-- 
  This page lays out the elements that make up the RefinementMenu.
    
  Required Parameters:
    contentItem
      The content parameter represents an unselected dimension refinement.
   
  Optional Parameters:

--%>
<dsp:page>

  <dsp:getvalueof var="contextPath" vartype="java.lang.String"  bean="/OriginatingRequest.contextPath"/>
  <dsp:importbean bean="/OriginatingRequest" var="originatingRequest"/>
  
  <dsp:getvalueof var="contentItem" vartype="com.endeca.infront.assembler.ContentItem" param="contentItem"/>
  <dsp:getvalueof var="dimensionName" value="${contentItem.dimensionName}"/>
  <dsp:getvalueof var="dimensionLabel" value="${contentItem.name}"/>
 <%--  <input type="hidden" value="${contextPath}" id="contextPathValue"/>
  <input type="hidden" value="${categoryIdEL}" id="categoryIdEL"/>
  <input type="hidden" value="${scrollLoc}" id="scrollLoc"/>
  <input type="hidden" value="${planType}" id="planType"/> --%>
  <dsp:getvalueof var="filterReqType" param="frt"/>
	<c:choose>
		<c:when test="${(searchPageGuidedNav eq 'SEARCH_NAVIGATION') && (dimensionLabel eq 'Product Type')}">
			<c:if test="${filterReqType ne 'secondry'}">
				<dsp:getvalueof var="productTypeRefs" value="${contentItem.refinements}" scope="session"/>
			</c:if>
			<%-- <dsp:include page="/search/searchPageFilters.jsp"/> --%>
		</c:when>
		<c:otherwise>
			<c:if test="${searchPageGuidedNav ne 'SEARCH_NAVIGATION' && (dimensionLabel ne 'Product Type')}">
				<fieldset>
				    <h3>${dimensionLabel}</h3>
				    <c:forEach var="breadcrumb" items="${dimCrumbs}" varStatus="count">
				    	<dsp:getvalueof var="crumbName" value="${breadcrumb.displayName}"/>
				    	<c:if test="${crumbName eq dimensionName}">
				    		<dsp:getvalueof var="crumbLabel" value="${breadcrumb.label}"/>
				    		<input autocomplete="off" type="checkbox" checked="checked" name="${crumbLabel}${countDims}${count.count}"  id="fc${countDims}${count.count}"  value="0${countDims}${count.count}" />
				    		<label onclick="javascript:prepareEndecaRemoveFilterQuery('${breadcrumb.removeAction.navigationState}');" data-bind-to="tap" data-allow-default="1" data-page="1" class="checkbox checkbox--vertical icon-check2" for="fc${countDims}${count.count}">${crumbLabel}</label>
				    	</c:if>
				    </c:forEach>
				    <c:forEach var="refinement" items="${contentItem.refinements}" varStatus="countIn">
				    	<input autocomplete="off" type="checkbox" name="${dimensionLabel}${countDims}${countIn.count}"  id="qc${countDims}${countIn.count}"  value="0c${countDims}${countIn.count}" />
				    	<label onclick="javascript:prepareEndecaMultiselectFilterQuery('${refinement.navigationState}');" data-bind-to="tap" data-allow-default="1" data-page="1" class="checkbox checkbox--vertical icon-check2" for="qc${countDims}${countIn.count}">${refinement.label}</label>
					</c:forEach>
				</fieldset>
			</c:if>
		</c:otherwise>
	</c:choose>
</dsp:page>
<%-- @version $Id: //hosting-blueprint/B2CBlueprint/version/11.1/Storefront/j2ee/store.war/cartridges/RefinementMenu/RefinementMenu.jsp#2 $$Change: 884492 $--%>
