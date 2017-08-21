<%@ taglib prefix="dsp"
	uri="http://www.atg.com/taglibs/daf/dspjspTaglib1_0"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="dspel"
	uri="http://www.atg.com/taglibs/daf/dspjspELTaglib1_0"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<dsp:page>
	<dsp:importbean
		bean="/atg/commerce/order/purchase/CartModifierFormHandler" />
	<dsp:importbean
		bean="/atg/siebel/configurator/ui/CreateProductConfigInstance" />
	<dsp:importbean bean="/atg/siebel/configurator/ui/GetPromotionTemplate" />
	<dsp:importbean bean="/atg/dynamo/droplet/IsEmpty" />
	<dsp:importbean bean="/atg/commerce/pricing/priceLists/PriceDroplet" />
	<dsp:importbean bean="/atg/commerce/catalog/ProductLookup" />
	<dsp:importbean bean="/atg/dynamo/droplet/Switch" />
	<dsp:include page="../navigation.jsp" />
	<dsp:importbean var="shoppingCart" bean="/atg/commerce/ShoppingCart" />
	<dsp:importbean bean="/atg/userprofiling/Profile" />
	<dsp:importbean bean="/atg/commerce/catalog/CategoryLookup" />
	<dsp:importbean bean="/atg/commerce/catalog/CatalogNavHistoryCollector" />
	<dsp:importbean bean="/atg/commerce/catalog/CatalogNavHistory" />


	<head>
<link href="../general.css" rel="stylesheet" type="text/css">
<link href="catalog.css" rel="stylesheet" type="text/css">
<script type="text/javascript">
// To make the color change when a link is active
function pageLoad() {

<dsp:getvalueof var = "menu" param = "menu" />
<dsp:getvalueof var = "childmenu" param = "childmenu" />
var menu = document.getElementById("${menu}");
var childmenu = document.getElementById("${childmenu}");
	if (menu == null) { 
 		menu1.style.color = "#FFF200";
	}
	else{
		menu.style.color = "#FFF200";
	}
childmenu.style.color = "#B519FC";
 }

window.onload = pageLoad; // invoke pageLoad after all content is loaded
</script>
	</head>
	<dsp:getvalueof param="errorMessage" var="errorMessage" />
	<c:if test="${not empty errorMessage}">
		<b style="color: #FE1A00"> ${errorMessage} </b>
	</c:if>
	<span class="errortext"> <dsp:droplet
			name="/atg/dynamo/droplet/ErrorMessageForEach">
			<dsp:param name="exceptions"
				bean="CartModifierFormHandler.formExceptions" />
			<dsp:oparam name="output">
				<b> <dsp:valueof param="message" />
				</b>
				<p>
			</dsp:oparam>
		</dsp:droplet>
	</span>
	<h1>Product Catalog</h1>
	<br>
	<dsp:getvalueof var="anonymousUser" bean="Profile.transient" />

	<div id="menu">
		<dsp:a id="home" href="../admin/company_admin.jsp">
			<img src="../content/images/home-icon.png" width="30px" height="30px" />
		</dsp:a>
		<dsp:form id="main" action="${pageContext.request.requestURI}"
			method="post">
			<c:set var="counter" value="0" />
			<dsp:droplet name="/atg/dynamo/droplet/ForEach">
				<dsp:param
					bean="/atg/userprofiling/Profile.catalog.allRootCategories"
					name="array" />
				<dsp:param name="sortProperties" value="+sequenceNumber" />
				<dsp:oparam name="output">
					<dsp:a id="category_link" href="catalog.jsp">
						<c:set var="counter" value="${counter+1}" />
						<c:set var="menu" value="menu${counter}" />
						<span id="${menu}"> <dsp:valueof
								param="element.displayName" /> <dsp:param
								param="element.repositoryId" name="catId" /> <dsp:param
								value="${menu}" name="menu" />
						</span>
					</dsp:a>
				</dsp:oparam>
				<c:if test="${empty catId}">
					<dsp:param param="element.repositoryId" name="catId" />
					<dsp:getvalueof param="catId" var="catId" />
				</c:if>
			</dsp:droplet>
			<dsp:param value="${catId}" name="catId" />
	</div>
	<div id="outerbox">
		<!--child categories -->
		<div id="childcategory">
			<dsp:droplet name="/atg/commerce/catalog/CategoryLookup">
				<dsp:param param="catId" name="id" />
				<dsp:getvalueof var="menu" param="menu" />
				<dsp:oparam name="output">
					<dsp:droplet name="CatalogNavHistoryCollector">
						<dsp:param name="navAction" value="jump" />
						<dsp:param name="item" param="element" />
					</dsp:droplet>
					<c:set var="counter" value="0" />
					<dsp:droplet name="/atg/dynamo/droplet/ForEach">
						<dsp:param param="element.childCategories" name="array" />
						<dsp:oparam name="outputStart">
						</dsp:oparam>
						<dsp:oparam name="output">
							<dsp:a id="childcategory_link" href="catalog.jsp">
								<c:set var="counter" value="${counter+1}" />
								<c:set var="childmenu" value="childmenu${counter}" />
								<span id="${childmenu}"> <dsp:valueof
										param="element.displayName" /> <dsp:param
										param="element.repositoryId" name="childCatId" /> <dsp:param
										param="catId" name="catId" /> <dsp:param param="menu"
										name="menu" /> <dsp:param value="${childmenu}"
										name="childmenu" />
								</span>
							</dsp:a>
							<br>
							<br>
						</dsp:oparam>
						<dsp:oparam name="empty">
							<br><h4>No Subcategories Available</h4>
						</dsp:oparam>
					</dsp:droplet>
				</dsp:oparam>
			</dsp:droplet>
		</div>
		<!-- Child products of selected root category and child category  -->
		<div id="childproducts">
			<table id="products">
				<tr>
					<dsp:getvalueof var="catId" param="catId" />
					<dsp:getvalueof var="childCatId" param="childCatId" />
					<c:choose>
						<c:when test="${not empty childCatId}">
							<dsp:param value="${childCatId}" name="id" />
						</c:when>
						<c:otherwise>
							<dsp:param value="${catId}" name="id" />
						</c:otherwise>
					</c:choose>
					<dsp:droplet name="/atg/commerce/catalog/CategoryLookup">
						<dsp:param param="id" name="id" />
						<dsp:oparam name="output">
							<dsp:droplet name="CatalogNavHistoryCollector">
								<dsp:param name="navAction" param="push" />
								<dsp:param name="item" param="element" />
							</dsp:droplet>
							<dsp:droplet name="/atg/dynamo/droplet/TableForEach">
								<dsp:param param="element.childProducts" name="array" />
								<dsp:param name="numColumns" value="4" />
								<dsp:oparam name="outputStart">
									<table class="nestedtable">
										</dsp:oparam>
										<dsp:oparam name="outputEnd">
									</table>
								</dsp:oparam>
								<dsp:oparam name="outputRowStart">
									<tr>
								</dsp:oparam>
								<dsp:oparam name="outputRowEnd">
				</tr>
				</dsp:oparam>
				<dsp:oparam name="output">
					<dsp:param param="element.repositoryId" name="productId" />
					<dsp:getvalueof var="prodId" param="productId" />
					<td><c:if test="${not empty prodId}">
							<div class="childproduct">
								<center>
									<dsp:a href="../product/product_detail.jsp" >
										<h3>
											<dsp:valueof param="element.displayName" />
										</h3>
										<dsp:param param="element.repositoryId" name="productId" />
										<dsp:getvalueof var="childmenu" param="childmenu" />
										<dsp:param value="${childmenu}" name="childmenu" />
										<dsp:getvalueof var="menu" param="menu" />
										<dsp:param value="${menu}" name="menu" />
										<br>
										<!-- <dsp:valueof param="element.description" />
                                    -->
										<img src="../content/images/iphone.jpg" width="60px"
											height="120px" />
									</dsp:a>
								</center><br>								
							</div>
							<center>
								<!--Display Price -->
								<dsp:droplet name="PriceDroplet">
									<dsp:param name="product" param="element.repositoryId" />
									<dsp:param name="priceList" value="88-47CZY" />
									<dsp:oparam name="output">
										<dsp:setvalue param="theListPrice" paramvalue="price" />
                                    Price :$
                                    <dsp:valueof
											param="theListPrice.listPrice" />
									</dsp:oparam>
									<dsp:oparam name="empty">
                                    Price : N/A
                                  </dsp:oparam>
								</dsp:droplet>
								<!-- Display AddToCart button based on Product Type -->
								<dsp:droplet name="Switch">
									<dsp:param name="value" param="element.siebelType" />
									<!-- Display AddToCart button for Simple Product -->
									<dsp:oparam name="Simple Product">
										<dsp:input bean="CartModifierFormHandler.productId"
											type="hidden" paramvalue="productId" />
										<dsp:input bean="CartModifierFormHandler.quantity"
											type="hidden" value="1" />
										<dsp:input
											bean="CartModifierFormHandler.addItemToOrderSuccessURL"
											type="hidden" value="/siebel/configurator/view_cart.jsp" />
										<dsp:input
											bean="CartModifierFormHandler.addItemToOrderErrorURL"
											type="hidden" value="/siebel/product/product_search.jsp" />
										<dsp:input id="nonConfigSuccessURL"
											bean="CartModifierFormHandler.addNonConfigurableItemToOrderSuccessUrl"
											type="hidden" value="/siebel/configurator/view_cart.jsp" />
										<dsp:input bean="CartModifierFormHandler.catalogRefIds"
											type="hidden" paramvalue="productId" />
										<dsp:input bean="CreateProductConfigInstance.url"
											type="hidden" value="/siebel/product/product_search.jsp" />
										<dsp:input bean="CartModifierFormHandler.addItemToOrder"
											type="image" src="../content/images/cart.png" width="25px" />
									</dsp:oparam>
									<!-- Display CP AddToCart button -->
									<dsp:oparam name="Configurable Product">
										<dsp:input bean="CartModifierFormHandler.productId"
											type="hidden" paramvalue="productId" />
										<dsp:input bean="CartModifierFormHandler.quantity"
											type="hidden" value="1" />
										<dsp:input
											bean="CartModifierFormHandler.addItemToOrderSuccessURL"
											type="hidden"
											value="/siebel/configurator/renderer/stand-alone-product.jsp" />
										<dsp:input
											bean="CartModifierFormHandler.addItemToOrderErrorURL"
											type="hidden" value="/siebel/product/product_search.jsp" />
										<dsp:input bean="CartModifierFormHandler.catalogRefIds"
											type="hidden" paramvalue="productId" />
										<dsp:input bean="CreateProductConfigInstance.url"
											type="hidden" value="/siebel/product/product_search.jsp" />
										<dsp:input bean="CartModifierFormHandler.addItemToOrder"
											type="image" src="../content/images/configuration.png"
											width="25px" />
									</dsp:oparam>
									<!-- Display Promotion AddToCart button -->
									<dsp:oparam name="Promotion">
										<dsp:input bean="CartModifierFormHandler.productId"
											type="hidden" paramvalue="productId" />
										<dsp:input bean="CartModifierFormHandler.quantity"
											type="hidden" value="1" />
										<dsp:input
											bean="CartModifierFormHandler.addItemToOrderSuccessURL"
											type="hidden"
											value="/siebel/configurator/promotion_edit_template.jsp" />
										<dsp:input
											bean="CartModifierFormHandler.addItemToOrderErrorURL"
											type="hidden" value="/siebel/product/product_search.jsp" />
										<dsp:input bean="CartModifierFormHandler.catalogRefIds"
											type="hidden" paramvalue="productId" />
										<dsp:input bean="GetPromotionTemplate.url" type="hidden"
											value="/siebel/product/product_search.jsp" />
										<dsp:input bean="CartModifierFormHandler.addItemToOrder"
											type="image" src="../content/images/edit.png" width="25px" />
									</dsp:oparam>
									<dsp:oparam name="default">
										<dsp:input bean="CartModifierFormHandler.productId"
											type="hidden" paramvalue="productId" />
										<dsp:input bean="CartModifierFormHandler.quantity"
											type="hidden" value="1" />
										<dsp:input
											bean="CartModifierFormHandler.addItemToOrderSuccessURL"
											type="hidden"
											value="/siebel/configurator/renderer/stand-alone-product.jsp" />
										<dsp:input
											bean="CartModifierFormHandler.addItemToOrderErrorURL"
											type="hidden" value="/siebel/product/product_search.jsp" />
										<dsp:input bean="CartModifierFormHandler.catalogRefIds"
											type="hidden" paramvalue="productId" />
										<dsp:input bean="CreateProductConfigInstance.url"
											type="hidden" value="/siebel/product/product_search.jsp" />
										<dsp:input bean="CartModifierFormHandler.addItemToOrder"
											type="image" src="../content/images/configuration.png"
											width="25px" />
									</dsp:oparam>
								</dsp:droplet>
							</center>							
						</c:if></td>
				</dsp:oparam>
				</dsp:droplet>
				</dsp:oparam>
				</dsp:droplet>
				</tr>
			</table>
		</div>
		</dsp:form>
			<span id="breadcrumbs"> <dsp:include
			page="../common/breadcrumbs.jsp">
			<dsp:param name="displaybreadcrumbs" value="true" />
		</dsp:include>
	</span>
	</div>

</dsp:page>
<%-- @version $Id: //product/Siebel/version/11.2/j2ee/siebel.war/catalog/catalog.jsp#1 $$Change: 1186180 $--%>
