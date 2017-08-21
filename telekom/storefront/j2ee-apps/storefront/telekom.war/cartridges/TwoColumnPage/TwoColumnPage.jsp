<dsp:page>
<!DOCTYPE html>
<!--[if lt IE 7]><html class="ie ie6 lt-ie7 lt-ie8 lt-ie9" lang="en"><![endif]-->
<!--[if IE 7]><html class="ie ie7 lt-ie8 lt-ie9" lang="en"><![endif]-->
<!--[if IE 8]><html class="ie ie8 lt-ie9" lang="en"><![endif]-->
<!--[if gt IE 8]><html class="ie" lang="en"><![endif]-->
<!--[if !IE]><!--><html lang="en"><!--<![endif]-->
	<dsp:importbean bean="/OriginatingRequest" var="originatingRequest"/>
	<dsp:importbean bean="/atg/commerce/catalog/CategoryLookup" />
	<dsp:getvalueof var="contextpath" bean="/OriginatingRequest.contextPath"/>
	<dsp:getvalueof var="contentItem" vartype="com.endeca.infront.assembler.ContentItem" param="contentItem"/>
	<dsp:getvalueof var="responseTypeIdentifier" value="${contentItem.MainContent[0].name}" scope="request"/>
	<dsp:getvalueof var="categoryIdEL" value="${contentItem.MainContent[0].categoryId}" scope="request"/>
	<dsp:getvalueof var="recordsPerPageEL" value="${contentItem.MainContent[0].recordsPerPage}" scope="request"/>
	<dsp:getvalueof var="planType" param="plan_type" scope="request"/>
	<dsp:getvalueof var="sectionIdentifier" value="${sectionIdentifier}" scope="session"/>
	<dsp:importbean bean="/atg/dynamo/droplet/Switch"/>

	<c:if test="${(empty sectionIdentifier) || (sectionIdentifier eq 'scp')}">
		<dsp:getvalueof var="sectionIdentifier" value="consumer" scope="session"/>
	</c:if>

	<c:if test="${empty categoryIdEL}">
		<dsp:getvalueof var="categoryIdEL" param="cid" scope="request"/>
	</c:if>

	<dsp:droplet name="CategoryLookup">
		<dsp:param name="id" value="${categoryIdEL}"/>
      	<dsp:param name="filterByCatalog" value="false"/>
      	<dsp:param name="elementName" value="category"/>
      	<dsp:oparam name="output">
      		<dsp:getvalueof var="categoryName" param="category.displayName"/>
      	</dsp:oparam>
	</dsp:droplet>
	<dsp:getvalueof var="totalNumRecsEL" value="${contentItem.MainContent[0].totalNumRecs}" scope="request" vartype="java.lang.Integer"/>
	<c:if test="${empty totalNumRecsEL}">
		<dsp:getvalueof var="totalNumRecsEL" value="${contentItem.MainContent[0].contents[0].totalNumRecs}" scope="request" vartype="java.lang.Integer"/>
	</c:if>
	<c:if test="${empty recordsPerPageEL}">
		<dsp:getvalueof var="recordsPerPageEL" value="${contentItem.MainContent[0].contents[0].recsPerPage}" scope="request" vartype="java.lang.Integer"/>
	</c:if>
    <jsp:body>
			<dsp:include page="/common/head.jsp"/>
			<body>

			<dsp:droplet name="Switch">
			<dsp:param name="value" value="${categoryName}"/>
				<dsp:oparam name="Accessories">
					<dsp:getvalueof var="pageName" value="ACCESSORIES_LISTING_PAGE" scope="request"/>
				</dsp:oparam>
				<dsp:oparam name="Phones">
					<dsp:getvalueof var="pageName" value="PHONES_LISTING_PAGE" scope="request"/>
				</dsp:oparam>
				<dsp:oparam name="Modems & Tablets">
					<dsp:getvalueof var="pageName" value="MODEM_TABLET_LISTING_PAGE" scope="request"/>
				</dsp:oparam>
			</dsp:droplet>

                <%-- START header section - Updated for brand refresh --%>
                <dsp:include page="/common/header.jsp">
                    <%-- <dsp:param name="secondarycategoryIdEL" value="${categoryIdEL}"/> --%>
                    <dsp:param name="pageName" value="${pageName}"/>
                    <dsp:param name="inclCrumbs" value="${true}"/>
                </dsp:include>
                <%-- END header section - Updated for brand refresh --%>

				<main>

                    <%-- START breadcrumbs - nav is initialised by header - Updated for brand refresh --%>
                    <dsp:include page="/vendor/2d-master-lib/components/jsp/modules/breadcrumbs.jsp">
                        <dsp:param name="crumbs" value="${nav.makeCrumbs()}" />
                    </dsp:include>
                    <%-- END breadcrumbs - nav is initialised by header - Updated for brand refresh --%>

					<section class="container">
					<c:choose>
						<c:when test="${totalNumRecsEL == 0 }">
							<h1>No results found</h1>
						</c:when>
						<c:otherwise>
							<h1>${categoryName}<c:if test="${categoryName ne 'Accessories'}"> on 2degrees</c:if></h1>
						</c:otherwise>
					</c:choose>

					</section>
					<!-- section container closing tag is present in listing jsps -->
					<section class="container">
						<%-- Render the left content --%>
						<c:forEach var="element" items="${contentItem.SecondaryContent}">
						  <dsp:renderContentItem contentItem="${element}"/>
						</c:forEach>
		        		<%-- Render the main content --%>
						<c:forEach var="element" items="${contentItem.MainContent}">
							<dsp:renderContentItem contentItem="${element}"/>
						</c:forEach>
					</section>
				</main>
				<dsp:include page="/common/footer.jsp"/>
			</body>
		</HTML>
	</jsp:body>
</dsp:page>
<%-- @version $Id: //hosting-blueprint/B2CBlueprint/version/11.1/Storefront/j2ee/store.war/cartridges/TwoColumnPage/TwoColumnPage.jsp#2 $$Change: 883241 $--%>
