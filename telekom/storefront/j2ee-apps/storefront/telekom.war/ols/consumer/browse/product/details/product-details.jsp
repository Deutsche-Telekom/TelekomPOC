<%@ page import="java.util.HashMap, java.util.ArrayList, com.twodegree.nav.Nav" %>
<dsp:page>
    <!-- START OF /ols/consumer/browse/phone/details/phone-details.jsp -->

    <!DOCTYPE html>
    <!--[if lt IE 7]><html class="ie ie6 lt-ie7 lt-ie8 lt-ie9" lang="en"><![endif]-->
    <!--[if IE 7]><html class="ie ie7 lt-ie8 lt-ie9" lang="en"><![endif]-->
    <!--[if IE 8]><html class="ie ie8 lt-ie9" lang="en"><![endif]-->
    <!--[if gt IE 8]><html class="ie" lang="en"><![endif]-->
    <!--[if !IE]><!-->
    <html lang="en">
        <!--<![endif]-->
        <head>

            <dsp:importbean bean="/atg/commerce/order/purchase/CartModifierFormHandler"/>
            <dsp:importbean bean="/atg/commerce/gifts/GiftlistFormHandler"/>
            <dsp:importbean bean="/atg/userprofiling/Profile"/>
            <dsp:importbean bean="/atg/commerce/catalog/comparison/ProductListHandler"/>
            <dsp:importbean bean="/atg/dynamo/droplet/ErrorMessageForEach"/>
            <dsp:importbean bean="/atg/userprofiling/UserContext"/>
            <dsp:importbean bean="/atg/dynamo/droplet/ForEach"/>
            <dsp:getvalueof var="contextpath" bean="/OriginatingRequest.contextPath"/>
            <dsp:getvalueof var="productId" param="productId"/>
            <dsp:getvalueof var="planType" param="planType"/>
            <dsp:importbean bean="/com/twodegree/common/configuration/TwoDCommonConfiguration"/>
            <dsp:getvalueof var="phonesCategoryId" bean="TwoDCommonConfiguration.phonesCategoryId"/>
            <dsp:getvalueof var="tabletCatId" param="tabletsCategoryId"/>

            <%-- <dsp:valueof bean="UserContext.currentTwoDUser.currentLocation">No Location</dsp:valueof> --%>
            <dsp:setvalue bean="UserContext.currentTwoDUser.productId" paramvalue="productId"/>

            <%-- Script to stop user to come back from view cart page --%>
            <script type="text/javascript">
                function preventBack() {
                    window.history.forward();
                }
                setTimeout("preventBack()", 0);
                window.onunload = function () {
                    null
                };
            </script>

            <%-- Passing the tablet category id to highlight on detail page. If its empty passing phone category id --%>
            <c:choose>
                <c:when test="${not empty tabletCatId}">
                    <dsp:getvalueof var="olsCatId" value="${tabletCatId}"/>
                </c:when>
                <c:otherwise>
                    <dsp:getvalueof var="olsCatId" value="${phonesCategoryId}"/>
                </c:otherwise>
            </c:choose>

            <%-- the actual head content --%>
            <dsp:include page="/common/head-content.jsp" />
        </head>

        <body>

            <%-- This has been moved out of the head as inputs are not allowed in the head --%>
            <input type="hidden" value="${contextpath}" id="contextPathHeadjsp" />

            <!-- Including header section -->
            <dsp:include page="/common/header.jsp">
                <dsp:param name="olsProductCategoryId" value="${olsCatId}"/>
                <dsp:param name="inclCrumbs" value="true"/>
            </dsp:include>

            <dsp:droplet name="/atg/commerce/catalog/ProductLookup">
                <dsp:param name="id" param="productId"/>
                <dsp:param name="filterBySite" value="false"/>
                <dsp:param name="filterByCatalog" value="false"/>
                <dsp:param name="elementName" value="product"/>
                <dsp:oparam name="output">
                    <dsp:getvalueof var="productName" param="product.productName"/>
                    <dsp:getvalueof param="product.productTypeTwoD" var="producttype"/>
                    <dsp:getvalueof var="parentCats" param="product.parentCategories"/>
                </dsp:oparam>
            </dsp:droplet>

            <dsp:droplet name="ForEach">
                <dsp:param name="array" value="${parentCats}"/>
                <dsp:param name="elementName" value="category"/>
                <dsp:oparam name="output">
                    <dsp:getvalueof var="productCatId" param="category.id"/>
                </dsp:oparam>
            </dsp:droplet>

            <dsp:droplet name="/atg/commerce/endeca/cache/DimensionValueCacheDroplet">
                <dsp:param name="repositoryId" value="${productCatId}"/>
                <dsp:oparam name="output">
                    <dsp:getvalueof var="cacheEntryUrl" param="dimensionValueCacheEntry.url"/>
                </dsp:oparam>
            </dsp:droplet>

            <main>

                <dsp:include page="/vendor/2d-master-lib/components/jsp/modules/breadcrumbs.jsp">
                    <dsp:param name="crumbs" value="${nav.makeCrumbsAndReplaceToken('{{productName}}', productName)}" />
                </dsp:include>

                <dsp:include page="/ols/consumer/browse/includes/product-ajax-refreshable.jsp">
                    <dsp:param name="productId" param="productId"/>
                    <dsp:param name="flowType" param="planType"/>
                </dsp:include>

                <section class="container">
                    <div class="size8of12">

                        <dsp:droplet name="ErrorMessageForEach">
                            <dsp:param name="exceptions" bean="CartModifierFormHandler.formExceptions"/>
                            <dsp:oparam name="output">
                                <div class="alert alert--warning alert--close">
                                    <dsp:getvalueof var="errorMessage" param="message"/>
                                    <crs:outMessage key="${errorMessage}"/>
                                    <span class="icon-close icon-after"></span>
                                </div>
                            </dsp:oparam>
                        </dsp:droplet>

                        <c:set var="showArticle" value="false"/>

                        <dsp:droplet name="/atg/commerce/catalog/ProductLookup">
                            <dsp:param name="id" param="productId"/>
                            <dsp:param name="elementName" value="product"/>
                            <dsp:oparam name="output">
                                <dsp:getvalueof var="product" param="product"/>
                                <dsp:getvalueof var="articles" param="product.relatedArticles"/>
                                <dsp:droplet name="/atg/dynamo/droplet/ForEach">
                                    <dsp:param name="array" value="${articles}"/>
                                    <dsp:param name="elementName" value="article"/>
                                    <dsp:oparam name="output">
                                        <dsp:getvalueof var="count" param="count"/>
                                        <c:if test="${count eq 1 }">
                                            <c:set var="showArticle" value="true"/>
                                            <dsp:getvalueof var="articleName" param="article.name"/>
                                            <dsp:getvalueof var="articleBody" param="article.body"/>
                                        </c:if>
                                    </dsp:oparam>
                                </dsp:droplet>
                            </dsp:oparam>
                        </dsp:droplet>

                        <ul class="tabs" role="tablist">
                            <!--  This option toggles between pages Phone Features and Phone technical Specification pages given below. -->

                            <c:choose>
                                <c:when test="${showArticle}">
                                    <%-- swap feature and tech based on andrew request - by rama: 30/10/15 --%>
                                    <%-- <li id="tab4" tabindex="0" class="tab" aria-controls="panel3" aria-selected="true" role="tab"><dsp:valueof value="${articleName}" /></li>
                                    <li id="tab3" tabindex="0" class="tab" aria-controls="panel4" aria-selected="true" role="tab">Product features & Tech specs</li>
                                    <li id="tab3" tabindex="0" class="tab" aria-controls="panel4" aria-selected="false" role="tab">Tech specs</li> --%>

                                    <li id="tab3" tabindex="0" class="tab" aria-controls="panel3" aria-selected="true" role="tab">Product features</li>
                                    <li id="tab4" tabindex="0" class="tab" aria-controls="panel4" aria-selected="false" role="tab">Tech specs</li>
                                    <%--<dsp:valueof value="${articleName}" />  --%>
                                </c:when>
                                <c:otherwise>
                                    <%-- swap feature and tech based on andrew request - by rama: 30/10/15 --%>
                                    <%-- <li id="tab3" tabindex="0" class="tab" aria-controls="panel4" aria-selected="true" role="tab">Product features & Tech specs</li> --%>
                                    <li id="tab3" tabindex="0" class="tab" aria-controls="panel3" aria-selected="true" role="tab">Product features</li>
                                    <li id="tab4" tabindex="0" class="tab" aria-controls="panel4" aria-selected="false" role="tab">Tech specs</li>
                                    <%--<dsp:valueof value="${articleName}" />  --%>

                                </c:otherwise>
                            </c:choose>

                        </ul>
                        <!-- This page will display the Phone Features  -->

                        <c:choose>
                            <c:when test="${showArticle}">

                                <!-- This page will display the Phone Technical Specifications -->

                                <div id="panel3" class="panel" aria-labelledby="tab3" role="tabpanel" aria-hidden="false">
                                    <dsp:include page="/ols/consumer/browse/includes/product-technicalspec.jsp">
                                        <dsp:param name="productId" param="productId"/>
                                    </dsp:include>
                                </div>
                                <div id="panel4" class="panel hidden" aria-labelledby="tab4" role="tabpanel" aria-hidden="true">
                                    <%--     <dsp:include page="/ols/consumer/browse/includes/product-technicalspec.jsp">
                                    <dsp:param name="productId" param="productId"/>
                                </dsp:include> --%>
                                    <div class="feature-list">
                                        <dsp:valueof value="${articleBody}" valueishtml="true"/>
                                    </div>
                                </div>
                            </c:when>
                            <c:otherwise>
                                <!-- This page will display the Phone Technical Specifications -->
                                <div id="panel3" class="panel" aria-labelledby="tab3" role="tabpanel" aria-hidden="false">
                                    <%-- <dsp:include page="/ols/consumer/browse/includes/product-technicalspec.jsp">
                                <dsp:param name="productId" param="productId"/>
                            </dsp:include> --%>
                                    <dsp:include page="/ols/consumer/browse/includes/product-technicalspec.jsp">
                                        <dsp:param name="productId" param="productId"/>
                                    </dsp:include>
                                </div>
                            </c:otherwise>
                        </c:choose>

                    </div>
                    <div class="size4of12">
                        <!-- This page include the promotions applicable for the Phone -->
                        <dsp:include page="/ols/consumer/browse/includes/product-promo.jsp">
                            <dsp:param name="productId" param="productId"/>
                        </dsp:include>
                        <!-- This page will display the Recommended Products -->
                        <dsp:include page="/ols/consumer/browse/includes/product-recommended.jsp">
                            <dsp:param name="productId" param="productId"/>
                        </dsp:include>
                    </div>
                </section>
                <span style="display:none">
                    <dsp:form id="compareForm" name="compareForm" action="${contextpath}/ols/consumer/browse/phone/compare/compare-error.jsp" method="post">
                        <dsp:input bean="ProductListHandler.productID" name="productIds" type="hidden" paramvalue="productId"/>
                        <%-- <dsp:input bean="ProductListHandler.productIDs" name="productIds" type="hidden" id="myproductlistid"/> --%>
                        <dsp:input bean="ProductListHandler.addProduct" name="addProductList" type="submit" value="Add to Compare" id="submitCompareFormButton"/>
                        <dsp:input bean="ProductListHandler.addProductSuccessURL" type="hidden" value="${contextpath}/ols/consumer/browse/phone/compare/product-compare-one-product.jsp"/>
                        <dsp:input bean="ProductListHandler.productSuccessURL" type="hidden" value="${contextpath}/ols/consumer/browse/phone/compare/phone-compare.jsp"/>
                        <dsp:input bean="ProductListHandler.productCannotCompareURL" type="hidden" value="${contextpath}/ols/consumer/browse/phone/compare/product_cantcompare.jsp?productId=${productId}"/>
                        <%-- <dsp:input bean="ProductListHandler.ProductExtendCompareURL" type="hidden" value="${contextpath}/ols/consumer/browse/phone/compare/compare-error.jsp"/> --%>
                    </dsp:form>
                </span>
                <dsp:include page="/ols/consumer/wishlist/addItemToWishList.jsp">
                    <dsp:param name="product" value="${product}"/>
                </dsp:include>
            </main>
            <script>
                $(document).ready(function () {
                    var url = window.location.href;
                    $("#recommendedProductFrm").attr("action", url);
                });
            </script>
            <!-- FOOTER AREA OF THE PAGE -->
            <dsp:include page="/common/footer.jsp"/>
        </html>
        <!-- END OF /ols/consumer/browse/phone/details/phone-details.jsp -->
    </dsp:page>
