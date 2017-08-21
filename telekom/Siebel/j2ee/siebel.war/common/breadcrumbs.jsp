<%@ taglib prefix="dsp"
	uri="http://www.atg.com/taglibs/daf/dspjspTaglib1_0"%>
<dsp:page>
  <dsp:importbean bean="/atg/commerce/catalog/CatalogNavHistory" />
  <dsp:importbean bean="/atg/commerce/catalog/CatalogNavHistoryCollector" />


  
  <%
/* -------------------------------------------------
 * Use NavHistoryCollector droplet to collect breadcrumbs
 * ------------------------------------------------- */
%>
<dsp:droplet name="/atg/dynamo/droplet/Switch">
  <dsp:param name="value" param="no_new_crumb"/>
  <dsp:oparam name="true"> 
  </dsp:oparam>
  <dsp:oparam name="default">
     <dsp:droplet name="CatalogNavHistoryCollector">
        <dsp:param name="navAction" param="navAction"/>
        <dsp:param name="item" param="element"/> 
     </dsp:droplet> 
  </dsp:oparam>
</dsp:droplet>

  
  
  
<dsp:droplet name="/atg/dynamo/droplet/Switch">
	<dsp:param name="value" param="displaybreadcrumbs"/>
	<dsp:oparam name="true">
<%
/* -------------------------------------------------
 * use the ForEach droplet to render the navHistory array.
 * ------------------------------------------------- */
%>
		<dsp:droplet name="/atg/dynamo/droplet/ForEach">
			<dsp:param bean="CatalogNavHistory.navHistory" name="array" />
			<dsp:valueof param="CatalogNavHistory.navHistory" />
			<dsp:param name="elementName" value="crumb" />
			<dsp:oparam name="output">
				<dsp:droplet name="/atg/dynamo/droplet/Switch">
		  <%
          /* -------------------------------------------------
           * We want to put a separator between the items in the navHistory.  In this
           * example we put > sign between them.  We use a switch droplet to
           * identify the first item in the array because we don't want to render a
           * separator. 
           * ------------------------------------------------- */
          %>
					<dsp:param name="value" param="count" />
					<dsp:oparam name="1">
					</dsp:oparam>
					<dsp:oparam name="default">
								&gt;
					</dsp:oparam>
				</dsp:droplet>
				<dsp:getvalueof id="countStr" param="count" idtype="Integer">
					<dsp:getvalueof id="catNavCount"
						bean="/atg/commerce/catalog/CatalogNavHistory.navCount">
			 <%
              /* -------------------------------------------------
               * Use a switch droplet to compare size to count. When
               * they are the same, then we are on the last item in 
               * array iterated by the ForEach.
               * ------------------------------------------------- */
              %> 
						<dsp:droplet name="/atg/dynamo/droplet/Switch">
							<dsp:param name="value" param="size" /> 
							<dsp:oparam name="<%=countStr.toString()%>">
								<dsp:droplet name="/atg/dynamo/droplet/Switch">
				  <%
                  /* -------------------------------------------------
                   * The last item in the list is generally the item we are
                   * currently visiting and should therefore not be a link. 
                   * In some cases, when we do not want to add a new breadcrumb,              
                   * we want the last item to be a link. This is 
                   * indicated by the "no_new_crumb" parameter. 
                   * ------------------------------------------------- */
                  %>
									<dsp:param name="value" param="no_new_crumb" />
									<dsp:oparam name="true">
										<dsp:a page="../catalog/catalog.jsp">
											<dsp:valueof param="crumb.displayName" />
											<!-- These set for breadcrumb navigation: -->
											<dsp:param name="navAction" value="pop" />
											<dsp:param name="id" param="crumb.repositoryId" />
											<dsp:param name="navCount" value="<%=catNavCount%>" />
										</dsp:a>
									</dsp:oparam>
									<dsp:oparam name="default">
										<dsp:droplet name="/atg/dynamo/droplet/Switch">
											<dsp:param name="value" param="crumb.rootCategoryFlag" />
											<dsp:oparam name="true">											
											</dsp:oparam>
											<dsp:oparam name="default">
												<dsp:valueof param="crumb.displayName" />
											</dsp:oparam>
										</dsp:droplet>
									</dsp:oparam>
								</dsp:droplet>
							</dsp:oparam>
							<dsp:oparam name="default">							
								<dsp:droplet name="/atg/dynamo/droplet/Switch">
									<dsp:param name="value" param="crumb.rootCategoryFlag" />
									<dsp:oparam name="false">
										<dsp:a page="../catalog/catalog.jsp">
											<dsp:valueof param="crumb.displayName" />
											<dsp:param name="childCatId" param="crumb.repositoryId" />
											<dsp:param name="catId" param="crumb.parentCategoryId" />
											<dsp:getvalueof var ="menu" param="menu" />
											<dsp:param name="menu" value="${menu}"/>
											<dsp:getvalueof var ="childmenu" param ="childmenu" />
											<dsp:param name="childmenu" value="${childmenu}"/>
										</dsp:a>									
									</dsp:oparam>
									<dsp:oparam name="default">							
										<dsp:a page="../catalog/catalog.jsp">
											<dsp:valueof param="crumb.displayName" />
											<dsp:param name="navAction" value="pop" />
											<dsp:param name="catId" param="crumb.repositoryId" />
											<dsp:param name="navCount" value="<%=catNavCount%>" />
											<dsp:getvalueof var ="menu" param="menu" />
											<dsp:param name="menu" value="${menu}"/>
										</dsp:a>
									</dsp:oparam>
								</dsp:droplet>							
							</dsp:oparam>
						</dsp:droplet>
					</dsp:getvalueof>
				</dsp:getvalueof>
			</dsp:oparam>
		</dsp:droplet>
	</dsp:oparam>
</dsp:droplet>
</dsp:page>
<%-- @version $Id: //product/Siebel/version/11.2/j2ee/siebel.war/common/breadcrumbs.jsp#1 $$Change: 1186180 $--%>
