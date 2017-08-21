<dsp:page>

	<script>
		$( document ).ready(function() {
			var scrollLoc = $('#scrollLoc').val();
			$(document).scrollTop(scrollLoc);
		});
		function prepareEndecaRemoveFilterQuery(navState) {
			spinnerControl("show");
			var scrollLoc = $(document).scrollTop();
			var planType = $('#planType').val();
			if(planType == null || planType == '') {
				planType = "Pay Monthly";
			}
			var contextPath = $('#contextPathValue').val();
			var categoryId = $('#categoryIdEL').val();
			var contextPathSplit = contextPath.split("/");
			var url = "/" + contextPathSplit[1] + "/browse" + navState + "&cid=" + categoryId  + "&scrollLoc=" + scrollLoc + "&plan_type=" + planType;
			reloadPageWithEndecaResponse(url);
		}
		
		function reloadPageWithEndecaResponse(url) {
			window.location.href = url;
			/* $.ajax({
	            url:  url,
	            type: "post",
	            dataType: "html",
	            success:function(data){
	            	var newDoc = document.open("text/html", "replace");
	            	newDoc.write(data);
	            	newDoc.close();
	            	setTimeout(function(){
	            		spinnerControl("hide");
	            	},2000);
	            	
	            },
	            error:function(){
	            	spinnerControl("hide");
	            }
			}); */
		}
		function planTypeFilter(planType) {
			if(planType == 'pp') {
				planType = "Prepay";
			} else {
				planType = "Pay Monthly";
			}
			var url = window.location.href;
			var queryString = "";
			if(url.indexOf('?') != -1) {
				var urlParts = url.split("?");
				if(urlParts.length > 1) {
					var urlParams = urlParts[1];
					var paramPairs = urlParams.split("&");
					var paramPresent = false;
					for (i = 0; i < paramPairs.length; i++) {
					    var paramPair = paramPairs[i].split("=");
					    var paramName = paramPair[0];
					    var paramValue = paramPair[1];
					    if(paramName == 'plan_type') {
					    	paramValue = planType;
					    	paramPresent = true;
					    }
					    if(queryString == "") {
					    	queryString = queryString + paramName + "=" + paramValue;
					    } else {
							queryString = queryString + "&" + paramName + "=" + paramValue;
					    }
					}
					if(url.indexOf('plan_type') == -1 && paramPairs.length > 0) {
						queryString = queryString + "&plan_type=" + planType;
					} else if(url.indexOf('plan_type') == -1 && paramPairs.length <= 0) {
						queryString = queryString + "plan_type=" + planType;
					}
					url = urlParts[0] + "?" + queryString;
				}
			} else {
				queryString = "plan_type=" + planType;
				url = url + "?" + queryString;
			}
			window.location.href = url;
		}
	
		function prepareEndecaMultiselectFilterQuery(navState) {
			spinnerControl("show");
			var scrollLoc = $(document).scrollTop();
			var planType = $('#planType').val();
			if(planType == null || planType == '') {
				planType = "Pay Monthly";
			}
			var contextPath = $('#contextPathValue').val();
			var categoryId = $('#categoryIdEL').val();
			var contextPathSplit = contextPath.split("/");
			var url = "/" + contextPathSplit[1] + "/browse" + navState + "&cid=" + categoryId + "&scrollLoc=" + scrollLoc + "&plan_type=" + planType;
			reloadPageWithEndecaResponse(url);
		}
		
		function spinnerControl(action) {
			if(action == 'show') {
				$("html").addClass("loading");
			}
			if(action == 'hide') {
				$("html").removeClass("loading");
			}
		}
	</script>
	
	<dsp:importbean bean="/OriginatingRequest" var="originatingRequest"/>
	<dsp:getvalueof var="contextPath" vartype="java.lang.String"  bean="/OriginatingRequest.contextPath"/>
	<input type="hidden" value="${contextPath}" id="contextPathValue"/>
	<input type="hidden" value="${categoryIdEL}" id="categoryIdEL"/>
  <input type="hidden" value="${scrollLoc}" id="scrollLoc"/>
  <input type="hidden" value="${planType}" id="planType"/>
	<dsp:getvalueof var="contentItem" vartype="com.endeca.infront.assembler.ContentItem" param="contentItem"/>
	<dsp:getvalueof var="guidedNavCI" param="contentItem"/>
	<dsp:importbean bean="/com/twodegree/search/droplet/DisplayLeftOutCrumbs"/>
	<dsp:importbean bean="/atg/dynamo/droplet/ForEach"/>
	
	<%-- <c:if test="${not empty contentItem.navigation}">
	  <c:forEach var="element" items="${contentItem.navigation}"> 
	    <dsp:renderContentItem contentItem="${element}"/>
	  </c:forEach>
	</c:if> --%>
	<!-- Endeca audit info div balancer -->
	</div>
	<!-- Endeca audit info div balancer -->
	<c:choose>
		<c:when test="${(searchPageGuidedNav eq 'SEARCH_NAVIGATION')}">
			<%-- <dsp:include page="/search/searchPageFilters.jsp"/> --%>
			<c:forEach var="element" items="${contentItem.navigation}" varStatus="countOut">
	    		<dsp:getvalueof var="countDims" value="${countOut.count}" scope="request"/>
				<dsp:renderContentItem contentItem="${element}"/>
			</c:forEach>
		</c:when>
		<c:otherwise>
			<dsp:include page="/ols/consumer/browse/gadgets/pagination.jsp"/>
			<div class="size3of12">
				<div class="flyin-link-wrapper select-type-trigger">
		            <div class="flyin flyin-parent hide tablet desktop">
		                <span class="flyin-trigger">Filter by</span>
		            </div>
		        				<div class="flyin-wrapper no-flyin-dt">
						<div class="flyin-container flyin-first">
							<div class="flyin-header">Filter by<a href="" class="flyin-close">Close</a>
							</div>
							<form id="filter-form">
								<fieldset>
								    <h2>Select your plan</h2>
								    <dsp:getvalueof var="planType" param="plan_type"/>
								    <c:choose>
								    	<c:when test="${planType eq 'Prepay'}">
								    		<input type="radio" data-page="1" data-allow-default="1" name="plan_type" id="r1" value="Pay Monthly"/>
										    <label class="radio radio--vertical" for="r1" onclick="javascript:planTypeFilter('pm');">Pay Monthly</label>
										    <input type="radio" data-page="1" data-allow-default="1" name="plan_type" id="r2" value="Prepay" checked />
										    <label class="radio radio--vertical" for="r2" onclick="javascript:planTypeFilter('pp');">Prepay</label>
								    	</c:when>
								    	<c:otherwise>
								    		<input type="radio" data-page="1" data-allow-default="1" name="plan_type" id="r1" value="Pay Monthly" checked />
										    <label class="radio radio--vertical" for="r1" onclick="javascript:planTypeFilter('pm');">Pay Monthly</label>
										    <input type="radio" data-page="1" data-allow-default="1" name="plan_type" id="r2" value="Prepay" />
										    <label class="radio radio--vertical" for="r2" onclick="javascript:planTypeFilter('pp');">Prepay</label>
								    	</c:otherwise>
								    </c:choose>
								    
								</fieldset>
								<dsp:test var="navigations" value="${contentItem.navigation}"/>
								<c:if test="${not empty navigations && (navigations.size > 0)}">								
									<h2 class="underline">Filter by:</h2>
									<c:forEach var="element" items="${contentItem.navigation}" varStatus="countOut">
							    		<dsp:getvalueof var="countDims" value="${countOut.count}" scope="request"/>
										<dsp:renderContentItem contentItem="${element}"/>
									</c:forEach>
									<dsp:droplet name="DisplayLeftOutCrumbs">
										<dsp:param name="refCrumbs" value="${dimCrumbs}"/>
										<dsp:param name="guidedNavCI" value="${guidedNavCI}"/>
										<dsp:oparam name="output">
											<dsp:droplet name="ForEach">
												<dsp:param name="array" param="leftOutCrumbs"/>
												<dsp:param name="elementName" value="leftOutCrumb"/>
												<dsp:oparam name="output">
													<dsp:getvalueof var="crumbLabel" param="key"/>
													<c:if test="${crumbLabel ne 'product.category'}">
														<fieldset>
					    									<h3>${crumbLabel}</h3>
					    									<dsp:droplet name="ForEach">
					    										<dsp:param name="array" param="leftOutCrumb.refValueToRemoveAction"/>
					    										<dsp:param name="elementName" value="remAction"/>
					    										<dsp:oparam name="output">
					    											<dsp:getvalueof var="crumbValue" param="key"/>
					    											<dsp:getvalueof var="remAction" param="remAction"/>
					    											<dsp:getvalueof var="countLO" param="count"/>
					    											<input autocomplete="off" type="checkbox" checked="checked" name="${crumbValue}${countLO}"  id="c${countLO}"  value="0${countLO}" />
				    												<label onclick="javascript:prepareEndecaRemoveFilterQuery('${remAction}');" data-bind-to="tap" data-allow-default="1" data-page="1" class="checkbox checkbox--vertical icon-check2" for="c${countLO}">${crumbValue}</label>
					    										</dsp:oparam>
					    									</dsp:droplet>
					    								</fieldset>
				    								</c:if>
												</dsp:oparam>
												<dsp:oparam name="empty">
												</dsp:oparam>
											</dsp:droplet>
										</dsp:oparam>
									</dsp:droplet>
								</c:if>
							<%-- defect 6183	<a href="" title="" class="btn btn--primary btn--full-width hide tablet desktop">Filter</a> --%>
							</form>
						</div>
					</div>
				</div>
			</div>
		</c:otherwise>
	</c:choose>
</dsp:page>
