<%@ taglib prefix="dsp"
	uri="http://www.atg.com/taglibs/daf/dspjspTaglib1_0"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<dsp:page>

  <head>
    <link href="../general.css" rel="stylesheet" type="text/css">
    <link href="product.css" rel="stylesheet" type="text/css">
  </head>

	<dsp:importbean bean="/atg/commerce/catalog/ProductLookup"/>
	<dsp:importbean bean="/atg/dynamo/droplet/Switch"/>
	<dsp:importbean bean="/atg/dynamo/droplet/ForEach"/>
	<dsp:importbean bean="/atg/dynamo/droplet/IsEmpty"/>
    <dsp:importbean bean="/atg/siebel/catalog/droplet/ProductDetailsDroplet"/>
    <dsp:importbean
		bean="/atg/commerce/order/purchase/CartModifierFormHandler" />
	<dsp:importbean bean="/atg/commerce/pricing/priceLists/PriceDroplet"/>
	<dsp:importbean bean="/atg/siebel/configurator/ui/CreateProductConfigInstance"/>
	<dsp:importbean bean="/atg/siebel/configurator/ui/GetPromotionTemplate"/>
		
	<dsp:setvalue bean="ProductLookup.filterByCatalog" value="false"/>
	<dsp:setvalue param="priceListId" value=""/>
	<dsp:getvalueof var="prodId" bean="CartModifierFormHandler.productId"/>
	<c:if test="${prodId != '' && fn:length(prodId)>0}">
	<dsp:setvalue param="productId" beanvalue="CartModifierFormHandler.productId"/>
	</c:if>

	<dsp:include page="../navigation.jsp"/>
    <h1>Product Details</h1>
	
	<dsp:droplet name="ProductLookup">
		<dsp:param param="productId" name="id"/>
		<dsp:param value="product" name="elementName"/>

		<dsp:oparam name="output">
			<table id="productdetail" class="firstcolumnbold">
			<tr>
				<td id="pd_heading">Name:</td>
				<td id="pd_values"> <dsp:valueof param="product.displayName"/></td>
				<td>
			<!-- Display structure details of the product (CP or Promotion) -->
			<dsp:droplet name="Switch">
				<dsp:param name="value" param="product.siebelType"/>
				
				<!-- Display AddToCart button for product types SP, SPw/EA and Product Bundles  -->
				<dsp:oparam name="default">
					<dsp:form action="/siebel/configurator/renderer/stand-alone-product.jsp" method="post">
					    <dsp:input bean="CartModifierFormHandler.productId" type="hidden" paramvalue="productId"/>
					    <dsp:input bean="CartModifierFormHandler.quantity" type="hidden" value="1" />
						<dsp:input bean="CartModifierFormHandler.addItemToOrderSuccessURL" type="hidden"
							value="/siebel/configurator/renderer/stand-alone-product.jsp" />
						<dsp:input bean="CartModifierFormHandler.addItemToOrderErrorURL" type="hidden"
                            value="/siebel/product/product_search.jsp" />    	
						<dsp:input bean="CartModifierFormHandler.catalogRefIds" type="hidden" paramvalue="productId"/>
						<dsp:input bean="CreateProductConfigInstance.url" type="hidden" value="/siebel/product/product_search.jsp"/>
						<dsp:input bean="CartModifierFormHandler.addItemToOrder" type="submit" value="Configure"/>
					</dsp:form>
				</dsp:oparam>
				
				<dsp:oparam name="Simple Product">
                    <dsp:form action="/siebel/configurator/view_cart.jsp" method="post">
                        <dsp:input bean="CartModifierFormHandler.productId" type="hidden" paramvalue="productId"/>
                        <dsp:input bean="CartModifierFormHandler.quantity" type="hidden" value="1" />
                        <dsp:input bean="CartModifierFormHandler.addItemToOrderSuccessURL" type="hidden"
                            value="/siebel/configurator/view_cart.jsp" />
                        <dsp:input bean="CartModifierFormHandler.addItemToOrderErrorURL" type="hidden"
                            value="/siebel/product/product_search.jsp" /> 
                        <dsp:input id="nonConfigSuccessURL" bean="CartModifierFormHandler.addNonConfigurableItemToOrderSuccessUrl"
                            type="hidden" value="/siebel/configurator/view_cart.jsp"/>            
                        <dsp:input bean="CartModifierFormHandler.catalogRefIds" type="hidden" paramvalue="productId"/>
                        <dsp:input bean="CreateProductConfigInstance.url" type="hidden" value="/siebel/product/product_search.jsp"/>
                        <dsp:input bean="CartModifierFormHandler.addItemToOrder" type="submit" value="Add To Cart"/>
                    </dsp:form>
                </dsp:oparam>
				
				<!-- Display CP AddToCart button -->
 				<dsp:oparam name="Configurable Product">
					<dsp:form action="${pageContext.request.requestURI}" method="post">
						<dsp:input bean="CartModifierFormHandler.productId" type="hidden" paramvalue="productId"/>
						<dsp:input bean="CartModifierFormHandler.quantity" type="hidden" value="1" />
						<dsp:input bean="CartModifierFormHandler.addItemToOrderSuccessURL" type="hidden"
							value="/siebel/configurator/renderer/stand-alone-product.jsp" />
						<dsp:input bean="CartModifierFormHandler.addItemToOrderErrorURL" type="hidden"
                            value="/siebel/product/product_search.jsp" />       	
						<dsp:input bean="CartModifierFormHandler.catalogRefIds" type="hidden" paramvalue="productId"/>
						<dsp:input bean="CreateProductConfigInstance.url" type="hidden" value="/siebel/product/product_search.jsp"/>
						<p><dsp:input bean="CartModifierFormHandler.addItemToOrder" type="submit" value="Configure"/>
					</dsp:form>
				</dsp:oparam>
				
				<!--  Display Promotion AddToCart button  -->
			 	<dsp:oparam name="Promotion">
					<dsp:form action="${pageContext.request.requestURI}" method="post">
						<dsp:input bean="CartModifierFormHandler.productId" type="hidden" paramvalue="productId"/>
						<dsp:input bean="CartModifierFormHandler.quantity" type="hidden" value="1" />
						<dsp:input bean="CartModifierFormHandler.addItemToOrderSuccessURL" type="hidden"
							value="/siebel/configurator/promotion_edit_template.jsp" />
						<dsp:input bean="CartModifierFormHandler.addItemToOrderErrorURL" type="hidden"
                            value="/siebel/product/product_search.jsp" />	
						<dsp:input bean="CartModifierFormHandler.catalogRefIds" type="hidden" paramvalue="productId"/>
						<dsp:input bean="GetPromotionTemplate.url" type="hidden" value="/siebel/product/product_search.jsp"/>
						<p><dsp:input bean="CartModifierFormHandler.addItemToOrder" type="submit" value="Edit Promotion"/>
					</dsp:form>
				</dsp:oparam> 
			</dsp:droplet>
			</td></tr>
			
			<tr><td>Description:</td><td> <dsp:valueof param="product.description"/></td></tr>
			<tr><td>List Price:</td><td>
				<dsp:droplet name="PriceDroplet">
					<dsp:param name="product" param="product" />
					<dsp:param name="priceList" value="88-23AQ7"/>
					<dsp:oparam name="output">
						<dsp:setvalue param="theListPrice" paramvalue="price" />
						$<dsp:valueof param="theListPrice.listPrice"/>		
						
						<!--  This formatting doesn't work currently -->
						<dsp:getvalueof var="listPriceValue" vartype="java.lang.Double"
								param="theListPrice.listPrice" />					
		
						<!--  This formatting doesn't work currently -->
						
					</dsp:oparam>
					<dsp:oparam name="empty">
						List price not found.
					</dsp:oparam>
				</dsp:droplet>
				</td></tr>
				<tr><td>Price Type:</td><td> <dsp:valueof param="product.priceType"/></td></tr>
		</dsp:oparam>
		
		<dsp:oparam name="empty">
			No product found.
		</dsp:oparam>
		
		<dsp:oparam name="noCatalog">
			No catalog specified!!!!
		</dsp:oparam>
	</dsp:droplet>
	
	<dsp:droplet name="ProductDetailsDroplet">
		<dsp:param param="productId" name="id"/>

		<dsp:oparam name="empty">
			<!--   -->
		</dsp:oparam>
				
		<dsp:oparam name="output">
			
			<dsp:droplet name="ForEach">
						<dsp:param name="array" param="productRelationships"/>
						
						<dsp:oparam name="empty">
							<dsp:droplet name="IsEmpty">
								<dsp:param name="value" param="productDetail.attributes"/>
								<dsp:oparam name="true">
									<tr><td>Options:</td><td> There are no options.</td></tr>
								</dsp:oparam>
							</dsp:droplet>						
  					    </dsp:oparam>
						
						<dsp:oparam name="outputStart">
							<tr><td>Options:</td>
							<td>
						</dsp:oparam>
						
						<dsp:oparam name="output">
							<p><dsp:valueof param="element"/>							
						</dsp:oparam>
						
						<dsp:oparam name="outputEnd">
							</td></tr>
						</dsp:oparam>
					</dsp:droplet>
		
		
			<dsp:droplet name="ForEach">
						<dsp:param name="array" param="productDetail.attributes"/>
						
						<dsp:oparam name="empty">
							<!-- <tr>
								<td></td>
								<td> There are no options.</td>
							</tr>-->
						</dsp:oparam>
						
						<dsp:oparam name="outputStart">
							<tr>
								<dsp:droplet name="IsEmpty">
									<dsp:param name="value" param="productRelationships"/>
									<dsp:oparam name="true">
										<td>Options:</td>
									</dsp:oparam>
									<dsp:oparam name="false">
										<td></td>									
									</dsp:oparam>
								</dsp:droplet>	
								<td>
						</dsp:oparam>
						
						<dsp:oparam name="output">
							<p><dsp:valueof param="element.name"/> 
							<dsp:droplet name="IsEmpty">
								<dsp:param name="value" param="element.defaultValue"/>
								<dsp:oparam name="false">
									- <dsp:valueof param="element.defaultValue"/>
								</dsp:oparam>	
							</dsp:droplet>	 							
						</dsp:oparam>
						
						<dsp:oparam name="outputEnd">
							</td></tr>
							</table>
						</dsp:oparam>
					</dsp:droplet>
		</dsp:oparam>
	</dsp:droplet>
</dsp:page>
<%-- @version $Id: //product/Siebel/version/11.2/j2ee/siebel.war/product/product_detail.jsp#1 $$Change: 1186180 $--%>
