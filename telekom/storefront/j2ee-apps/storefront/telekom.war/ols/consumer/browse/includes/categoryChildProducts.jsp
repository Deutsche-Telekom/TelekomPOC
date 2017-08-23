<dsp:page>
<!-- START OF /ols/consumer/browse/includes/categoryChildProducts.jsp -->
	<dsp:importbean bean="/OriginatingRequest" var="originatingRequest"/>
	<dsp:importbean bean="/com/twodegree/common/configuration/TwoDCommonConfiguration" />
	<dsp:importbean bean="/atg/userprofiling/Profile"/>
	<dsp:importbean bean="/atg/commerce/catalog/CategoryLookup" />
	<dsp:importbean bean="/atg/store/droplet/CatalogItemFilterDroplet"/>
	<dsp:getvalueof var="categoryId" param="contentItem.categoryId"/>
	<c:if test="${empty categoryId}">
		<dsp:getvalueof var="categoryId" param="categoryId"/>
	</c:if>
	<dsp:droplet name="CategoryLookup">
		<dsp:param name="id" value="${categoryId}"/>
      	<dsp:param name="filterByCatalog" value="false"/>
      	<dsp:param name="elementName" value="category"/>
      	<dsp:oparam name="output">
			<dsp:getvalueof var="productList" param="category.childProducts"/>
			<dsp:getvalueof var="catDisplayName" param="category.displayName" />
			<dsp:getvalueof var="templateUrl" param="category.template.url"/>
	      	<%--
	            This droplet filters out products with invalid dates.
	
	            Input parameters:
	              collection
	                Collection of items to be filtered. 
	
	            Output parameters:
	              filteredCollection
	                Resulting filtered collection.
	
	            Open parameters:
	              output
	                Always rendered.
			--%>
			
			<dsp:droplet name="CatalogItemFilterDroplet">
				<dsp:param name="collection" value="${productList}"/>
				<dsp:oparam name="output">
					<dsp:getvalueof var="productList" param="filteredCollection"/>
				</dsp:oparam>
				<dsp:oparam name="empty">
					<%-- <dsp:getvalueof var="productList" param="filteredCollection"/> --%>
				</dsp:oparam>
			</dsp:droplet>
      	</dsp:oparam>
	</dsp:droplet>
	<dsp:include page="${templateUrl}">
		<dsp:param name="productList" value="${productList}"/>
		<dsp:param name="categoryName" value="${catDisplayName}"/>
	</dsp:include>
		<!-- END OF /ols/consumer/browse/includes/categoryChildProducts.jsp -->
</dsp:page>