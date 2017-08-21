<%@ taglib prefix="dsp"
	uri="http://www.atg.com/taglibs/daf/dspjspTaglib1_0"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<dsp:page>
  <head>
    <link href="../general.css" rel="stylesheet" type="text/css">
    <link href="../admin/admin.css" rel="stylesheet" type="text/css">
  </head>

	<dsp:importbean bean="/atg/siebel/asset/droplet/AssetDroplet"/>
	<dsp:importbean bean="/atg/dynamo/droplet/ForEach"/>
	<dsp:importbean bean="/atg/dynamo/droplet/For"/>
	<dsp:importbean bean="/atg/userprofiling/Profile"/>

	<table border=0 cellpadding=0 cellspacing=0 width=800>
		<tr bgcolor="#DBDBDB">
			<td colspan=2 height=18>&nbsp; <span class=small> <dsp:a
						href="../admin/company_admin.jsp">
						<dsp:valueof bean="Profile.parentOrganization.name" />
					</dsp:a> &gt; Assets
			</span></td>
		</tr>
	</table><br>	
	
<!--  	AccountId: <dsp:valueof bean="Profile.siebelAccountId"/>
	ContactId: <dsp:valueof bean="Profile.siebelId"/> -->
	 
	<dsp:droplet name="AssetDroplet">
		<dsp:param name="accountId" bean="Profile.siebelAccountId"/>
		<dsp:param name="contactId" bean="Profile.siebelId"/>
		<dsp:param name="assets" param="assets"/>
		<dsp:oparam name="error">
          <dsp:getvalueof var="errorMessage" param="errorMessage" />
          <dsp:droplet name="/atg/dynamo/droplet/Redirect">
            <dsp:param name="url" value="/siebel/login.jsp?message=${errorMessage}"/>
          </dsp:droplet>
        </dsp:oparam>
		<dsp:oparam name="empty">
			No assets found!!!
		</dsp:oparam>
		
		<dsp:oparam name="output">

			<dsp:droplet name="/atg/dynamo/droplet/ForEach">
				<dsp:param name="array" param="assets"/>
				
				<dsp:oparam name="outputStart">
					<table border="1">
					    <tr align="right"> 
					    	<td colspan="8">
							<dsp:getvalueof param="pageNum" var="page" />
					    	<dsp:getvalueof param="noOfPages" var="numPages" />
					    		<c:choose>
									<c:when test="${page == 1}">
   											&lt;Prev
   										</c:when>
									<c:otherwise>
										<dsp:a href="../asset/asset_list.jsp">
								    			&lt;Prev
										    	<dsp:param name="pageNum" value="${page - 1}" />
										</dsp:a>&nbsp;
   										</c:otherwise>
								</c:choose> 
								
							<dsp:droplet name="/atg/dynamo/droplet/For">
								<dsp:getvalueof param="index" var="i" />
								<dsp:param name="howMany" param="noOfPages" />
								
								<dsp:oparam name="output">
										<c:choose>
											<c:when test="${page eq (i+1)}">
												<c:out value="${i+1}" />
											</c:when>
											<c:otherwise>
												<dsp:a href="../asset/asset_list.jsp">
													<c:out value="${i+1}" />
													<dsp:param name="pageNum" value="${i+1}" />
												</dsp:a>&nbsp;
											</c:otherwise>
										</c:choose>
									</dsp:oparam>
							</dsp:droplet>

							<c:choose>
								<c:when test="${page eq numPages}">
 											Next&gt;
 										</c:when>
								<c:otherwise>
									<dsp:a href="../asset/asset_list.jsp">
						    			Next&gt;
								    	<dsp:param name="pageNum" value="${page + 1}"/>
									</dsp:a>&nbsp;
 										</c:otherwise>
							</c:choose>
							</td>
						</tr>
						<tr>
							<td><b>Asset Id</b></td>
							<td><b>Product Name</b></td>
							<td><b>Description</b></td>
							<td><b>Product Type</b></td>
							<td><b>Bill To Account</b></td>
							<td><b>Sold To Account</b></td>
							<td><b>Owner Account</b></td>
							<td><b>Install Date</b></td>
							<td><b>Status</b></td>
						</tr>
				</dsp:oparam>
				
				<dsp:oparam name="output">
					<tr>
						<td>
							<dsp:a href="asset_details.jsp">
								<dsp:valueof param="element.assetNumber"></dsp:valueof>
								<dsp:param name="assetId" param="element.id"/>
								<dsp:param name="assetNumber" param="element.assetNumber"/>
								<dsp:param name="pageNum" param="pageNum"/>
							</dsp:a>
						</td>
						<td><dsp:valueof param="element.productName"></dsp:valueof></td>
						<td><dsp:valueof param="element.description"></dsp:valueof></td>
						<td><dsp:valueof param="element.productType"></dsp:valueof></td>
						<td><dsp:valueof param="element.billingAccount"></dsp:valueof></td>
						<td><dsp:valueof param="element.soldToAccount"></dsp:valueof></td>
						<td><dsp:valueof param="element.owner"></dsp:valueof></td>
						<td><dsp:valueof param="element.installDate"></dsp:valueof></td>
						<td><dsp:valueof param="element.status"></dsp:valueof></td>
					</tr>
				</dsp:oparam>
				
				<dsp:oparam name="outputEnd">
				    	<tr align="right"> 
					    	<td colspan="8">
					    		<c:choose>
									<c:when test="${page == 1}">
   											&lt;Prev
   										</c:when>
									<c:otherwise>
										<dsp:a href="../asset/asset_list.jsp">
								    			&lt;Prev
										    	<dsp:param name="pageNum" value="${page - 1}" />
										</dsp:a>&nbsp;
   										</c:otherwise>
								</c:choose> 
								
							<dsp:droplet name="/atg/dynamo/droplet/For">
								<dsp:getvalueof param="index" var="i" />
								<dsp:param name="howMany" param="noOfPages" />
								
								<dsp:oparam name="output">
										<c:choose>
											<c:when test="${page eq (i+1)}">
												<c:out value="${i+1}" />
											</c:when>
											<c:otherwise>
												<dsp:a href="../asset/asset_list.jsp">
													<c:out value="${i+1}" />
													<dsp:param name="pageNum" value="${i+1}" />
												</dsp:a>&nbsp;
											</c:otherwise>
										</c:choose>
								</dsp:oparam>
							</dsp:droplet>

							<c:choose>
								<c:when test="${page eq numPages}">
 											Next&gt;
 										</c:when>
								<c:otherwise>
									<dsp:a href="../asset/asset_list.jsp">
						    			Next&gt;
								    	<dsp:param name="pageNum" value="${page + 1}"/>
									</dsp:a>&nbsp;
 										</c:otherwise>
							</c:choose>

							</td>
						</tr>
					</table>
				</dsp:oparam>
			</dsp:droplet>	
		</dsp:oparam>
		
	</dsp:droplet>	
</dsp:page>
<%-- @version $Id: //product/Siebel/version/11.2/j2ee/siebel.war/asset/asset_list.jsp#1 $$Change: 1186180 $--%>
