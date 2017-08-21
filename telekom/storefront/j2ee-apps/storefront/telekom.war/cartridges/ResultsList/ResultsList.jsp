<%-- 
  This page lays out the elements that make up the search results page.
    
  Required Parameters:
    contentItem
      The content item - results list type 
   
  Optional Parameters:

--%>
<dsp:page>
  <dsp:importbean bean="/atg/commerce/catalog/ProductLookup"/>
  <dsp:importbean bean="/atg/multisite/Site"/>
  <dsp:importbean bean="/atg/search/droplet/GetClickThroughId"/>
  <dsp:importbean bean="/OriginatingRequest" var="originatingRequest"/>
  
  <dsp:getvalueof var="contentItem" vartype="com.endeca.infront.assembler.ContentItem" param="contentItem"/>
      <%-- Render the search results.--%>
		<dsp:getvalueof var="searchPage" value="false" scope="request"/>
		<dsp:getvalueof var="keyWord" param="Ntt"/>
		<c:if test="${not empty keyWord}">
			<dsp:getvalueof var="searchPage" value="true" scope="request"/>
		</c:if>
		<c:choose>
			<c:when test="${searchPage eq true}">
				<dsp:include page="/search/searchResults.jsp">
					<dsp:param name="contentItem" param="contentItem"/>
				</dsp:include>
			</c:when>
			<c:otherwise>
				<dsp:include page="/search/navigation/searchNavHandler.jsp">
					<dsp:param name="contentItem" param="contentItem"/>
				</dsp:include>
			</c:otherwise>
		</c:choose>

</dsp:page>
<%-- @version $Id: //hosting-blueprint/B2CBlueprint/version/10.2/Storefront/j2ee/store.war/cartridges/ResultsList/ResultsList.jsp#4 $$Change: 796430 $--%>
