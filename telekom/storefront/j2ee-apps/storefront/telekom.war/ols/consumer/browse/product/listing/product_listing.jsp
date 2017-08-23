<dsp:page>
<!-- START OF /ols/consumer/browse/phone/listing/phone_listing.jsp -->
    <dsp:importbean bean="/atg/dynamo/droplet/Range" />
    <dsp:importbean bean="/com/twodegree/ols/mro/droplet/MROLeastPriceCalculator" />
    <dsp:importbean bean="/com/twodegree/ols/product/droplet/sort/PriceSorter" />
    <dsp:getvalueof var="contextpath" bean="/OriginatingRequest.contextPath"/>
    <dsp:getvalueof var="planId" param="planId"/>
    <dsp:getvalueof var="planType" param="plan_type"/>
    <c:set var="rrpLabel"><crs:outMessage key="RRP" /></c:set>
    <c:set var="rrpLabelTrimSpace" value="${fn:trim(rrpLabel)}"></c:set>
    <c:choose>
        <c:when test="${not empty planType}">
            <c:set var="phoneType"  value="${planType}"/>
        </c:when>
        <c:otherwise>
            <c:set var="phoneType" value="Pay Monthly"/>
        </c:otherwise>
    </c:choose>
    <div class="size9of12">
        <div class="products-list paginated paginated-more" data-base-url="" data-page-size="${recordsPerPageEL}" data-total="${totalNumRecsEL}" data-filter-form="#filter-form">
            <dsp:getvalueof var="sortingParam" param="sopm" scope="request"/>
            <dsp:droplet name="PriceSorter">
                <dsp:param name="list" param="productList"/>
                <dsp:param name="sort" value="${sortingParam}"/>
                <dsp:oparam name="output">
                    <dsp:getvalueof var="sortedProductList" param="sortedProductList"/>
                </dsp:oparam>
            </dsp:droplet>

            <dsp:droplet name="Range">
                <dsp:param name="array" value="${sortedProductList}"/>
                <dsp:param name="howMany" value="${howManyRange}"/>
                <dsp:param name="start" value="${startRange}"/>
                <dsp:param name="elementName" value="phone"/>
                <dsp:oparam name="output">
                    <dsp:getvalueof var="productId" param="phone.id"/>
                    <dsp:getvalueof var="phoneName" param="phone.productName"/>
                    <dsp:getvalueof var="phoneImage" param="phone.thumbnailImage.url"/>
                    <dsp:getvalueof var="phoneTradeUpElligible" param="phone.isTradeupElligible"/>

                    <dsp:droplet name="MROLeastPriceCalculator">
                        <dsp:param name="deviceId" value="${productId}"/>
                        <dsp:oparam name="output">
                            <dsp:getvalueof var="upgradeElligible" param="minMroVo.upgradeElligible"/>
                            <dsp:getvalueof var="mroPlanCode" param="minMroVo.planCode"/>
                            <c:set var="mroMinUpfrontAmt"><dsp:valueof param="minMroVo.minUpfront" converter="twoDPriceFormatter"/></c:set>
                            <c:set var="phoneMonthlyRepay"><dsp:valueof param="minMroVo.phoneMonthlyRepayment" converter="twoDPriceFormatter"/></c:set>
                            <c:set var="mroPlanPrice"><dsp:valueof param="minMroVo.planPrice" converter="twoDPriceFormatter"/></c:set>
                        </dsp:oparam>
                        <dsp:oparam name="empty">
                            <c:set var="mroMinUpfrontAmt" value=""/>
                            <c:set var="phoneMonthlyRepay" value=""/>
                            <c:set var="mroPlanPrice" value=""/>
                        </dsp:oparam>
                    </dsp:droplet>

                    <c:choose>
                        <c:when test="${planType eq 'Prepay'}">
                            <a href="${contextpath}/ols/consumer/browse/phone/details/phone-details.jsp?productId=${productId}&planType=${phoneType}" class="product-card" title="Link to ${phoneName}">
                        </c:when>
                        <c:otherwise>
                            <a href="${contextpath}/ols/consumer/browse/phone/details/phone-details.jsp?productId=${productId}&planCode=${mroPlanCode}&planType=${phoneType}" class="product-card" title="Link to ${phoneName}">
                        </c:otherwise>
                    </c:choose>

                            <picture class="pc-img">
                                <!--[if IE 9]><video style="display: none;"><![endif]-->
                                    <source srcset="${phoneImage}" media="(min-width: 480px)">
                                <!--[if IE 9]></video><![endif]-->
                                <img srcset="${phoneImage}" alt="${phoneName}">
                            </picture>

                            <div class="pc-copy">
                                <dsp:getvalueof var="planType" param="plan_type"/>
                                <c:choose>
                                    <c:when test="${planType eq 'Prepay'}">
                                        <h2>${phoneName}</h2>
                                        <span class="color-grey">Starting from</span>
                                        <span class="call-out">
                                            <span>
                                                <dsp:include page="/ols/consumer/browse/includes/priceLookup.jsp" >
                                                    <dsp:param name="productId" value="${productId }"/>
                                                </dsp:include>
                                                $${baseprice}
                                            </span>
                                        </span>
                                    </c:when>
                                    <c:otherwise>

                                        <c:choose>
                                            <c:when test="${not empty phoneMonthlyRepay || not empty mroMinUpfrontAmt || not empty mroPlanPrice }">
                                                <h2>${phoneName}</h2>
                                                <span class="call-out"><span>$${phoneMonthlyRepay}</span> per month over 24 months</span>
                                                <span>on our $${mroPlanPrice} Plan</span>
                                                <span>Upfront cost $${mroMinUpfrontAmt}</span>
                                                <span>
                                                    <dsp:include page="/ols/consumer/browse/includes/priceLookup.jsp" >
                                                        <dsp:param name="productId" value="${productId }"/>
                                                    </dsp:include>
                                                    $${baseprice}&nbsp;${rrpLabelTrimSpace}
                                            </c:when>
                                            <c:otherwise>
                                                <h2>${phoneName}</h2>
                                                <span class="color-grey">Starting from</span>
                                                <span class="call-out">
                                                    <span>
                                                        <dsp:include page="/ols/consumer/browse/includes/priceLookup.jsp" >
                                                            <dsp:param name="productId" value="${productId }"/>
                                                        </dsp:include>
                                                        $${baseprice}
                                                    </span>
                                                </span>
                                            </c:otherwise>
                                        </c:choose>
                                    </c:otherwise>
                                </c:choose>
                                <c:if test="${phoneType ne 'Prepay'}">
                                    <c:if test="${(phoneTradeUpElligible eq true)}">
                                        <span class="trade-up">
                                            <span class="fr-hide">Trade Up</span>
                                            <span class="trade-up-desc"> for only $10 a month</span>
                                        </span>
                                    </c:if>
                                </c:if>
                            </div>
                        </a>

                </dsp:oparam>
            </dsp:droplet>
        </div>
        <c:choose>
            <c:when test="${nextLinkEnabled}">
                <dsp:getvalueof var="disabledClass" value=""/>
            </c:when>
            <c:otherwise>
                <dsp:getvalueof var="disabledClass" value="btn--disabled disabled"/>
            </c:otherwise>
        </c:choose>
        <a href="" class="btn btn--default btn--centered btn--full-width page-link ${disabledClass}" data-page="next">Show more</a>
    </div>
<!-- END OF /ols/consumer/browse/phone/listing/phone_listing.jsp -->
</dsp:page>
