<%@ taglib prefix="dsp"
	uri="http://www.atg.com/taglibs/daf/dspjspTaglib1_0"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<dsp:page>
	<head>
<link href="../general.css" rel="stylesheet" type="text/css">
	</head>
    <dsp:include page="../navigation.jsp"/>
	<dsp:importbean bean="/atg/siebel/asset/droplet/AssetDetailDroplet" />
	<dsp:importbean bean="/atg/dynamo/droplet/ForEach" />
	<dsp:importbean bean="/atg/userprofiling/Profile"/>
	<dsp:importbean	bean="/atg/siebel/asset/formhandlers/ModifyAssetFormHandler" />
	<dsp:importbean	bean="/atg/siebel/asset/formhandlers/UpgradeAssetFormHandler" />
	<dsp:importbean bean="/atg/dynamo/droplet/ErrorMessageForEach"/>
    <dsp:importbean bean="/atg/dynamo/droplet/Switch"/>
	
<dsp:getvalueof param="assetNumber" var="assetNumber"/>
<dsp:getvalueof param="pageNum" var="pageNum"/>
<table border=0 cellpadding=0 cellspacing=0 width=800>
        <tr bgcolor="#DBDBDB">
            <td colspan=2 height=18>&nbsp; <span class=small> <dsp:a
                        href="../admin/company_admin.jsp">
                        <dsp:valueof bean="Profile.parentOrganization.name" />
                    </dsp:a> &gt; 
            </span>
            <span class=small> <dsp:a
                        href="../asset/asset_list.jsp?pageNum=${pageNum}">
                        <dsp:valueof value="Assets"/>
                    </dsp:a> &gt; ${assetNumber}

            </td>
        </tr>
    </table><br>
    
	<span class="errortext"> 
	  <dsp:droplet name="Switch">
      <dsp:param bean="ModifyAssetFormHandler.formError" name="value"/>
      <dsp:oparam name="true">
        <font color=cc0000><UL>
          <dsp:droplet name="ErrorMessageForEach">
            <dsp:param bean="ModifyAssetFormHandler.formExceptions" name="exceptions"/>
	    <dsp:oparam name="outputStart">
		<STRONG>
            Unable to modify Asset because of the following errors
		</STRONG>	
	    </dsp:oparam>
            <dsp:oparam name="output">
              <LI> <dsp:valueof param="message"/>
            </dsp:oparam>
          </dsp:droplet>
        </UL></font>
      </dsp:oparam>
    </dsp:droplet>
	</span><br>
	
    <span class="errortext"> 
	  <dsp:droplet name="Switch">
      <dsp:param bean="UpgradeAssetFormHandler.formError" name="value"/>
      <dsp:oparam name="true">
        <font color=cc0000><UL>
          <dsp:droplet name="ErrorMessageForEach">
            <dsp:param bean="UpgradeAssetFormHandler.formExceptions" name="exceptions"/>
	    <dsp:oparam name="outputStart">
		<STRONG>
            Unable to Upgrade Asset because of the following errors
		</STRONG>	
	    </dsp:oparam>
            <dsp:oparam name="output">
              <LI> <dsp:valueof param="message"/>
            </dsp:oparam>
          </dsp:droplet>
        </UL></font>
      </dsp:oparam>
    </dsp:droplet>
	</span><br>
    
	<dsp:droplet name="AssetDetailDroplet">
		<dsp:param name="assetId" param="assetId" />

		<dsp:oparam name="empty">
			Asset details not found!!!
		</dsp:oparam>

		<dsp:oparam name="output">
			<table>
				<tr>
					<td colspan="2">
						<!-- Details of the asset and its children go here -->
						<table>
							<tr>
								<dsp:form action="${pageContext.request.requestURI}"
									method="post">
								<td width="15%"><dsp:img src="../content/images/dummy.jpg"></dsp:img></td>
								<td width="500px">
									<h1>
										<b><dsp:valueof param="asset.productName" /></b>
										</h1> <br> <dsp:valueof param="asset.description" /> <br>
										<dsp:valueof param="asset.adjustedListPrice" /> <dsp:getvalueof
											var="id" param="asset.assetNumber" /> 
											<dsp:getvalueof var="assetId" param="asset.id"/>
											<dsp:input bean="ModifyAssetFormHandler.assetNumber" type="hidden" value="${id}" />
											<dsp:input bean="ModifyAssetFormHandler.errorURL" type="hidden" value="${pageContext.request.requestURI}?assetId=${assetId}" />
											<dsp:getvalueof var="siebelType" param="asset.SiebelType"/>
											<c:if test="${siebelType != 'Simple Product' && siebelType != 'Simple Product Bundle'}">
												<dsp:input bean="ModifyAssetFormHandler.modifyAsset" type="submit" value="Change" /> <br> <br>
											</c:if>
								</td>
								</dsp:form>
							</tr>
						</table>
					</td>
				</tr> 
					<tr><td valign="top">	<h2>Child Assets</h2> </td>		</tr>				
				<dsp:droplet name="ForEach">
					<dsp:param name="array" param="asset.childAssets" />

					<dsp:oparam name="empty">
						<!-- <tr><td>No child assets found!!!</td> -->
					</dsp:oparam>

					<dsp:oparam name="outputStart">
						<tr>
							<td>
					</dsp:oparam>

					<dsp:oparam name="output">
						<b><dsp:valueof param="element.productName" /></b>
						<dsp:getvalueof var="qty" param="element.quantity"/>
						<c:if test="${qty > 1}">
	 						Quantity - <dsp:valueof param="element.quantity" />
   						</c:if>
						<br>
						<hr size="1" />
						<table>
							<tr>
								<td width="400px"><dsp:valueof param="element.description" />
								</td>
								<td align="right"><dsp:valueof
										param="element.adjustedListPrice" /></td>
								 <td align="right"><br></td>
							</tr>
						</table>

						<dsp:droplet name="ForEach">
							<dsp:param name="array" param="element.attributes" />

							<dsp:oparam name="output">
								<dsp:valueof param="element.displayName" /> - <dsp:valueof
									param="element.value" />
								<br>
							</dsp:oparam>
						</dsp:droplet>
 
					</dsp:oparam>

					<dsp:oparam name="outputEnd">
				</tr>
						</td>
					</dsp:oparam>
				</dsp:droplet>


				<!-- Attribute details go here -->
				<td valign="top"><dsp:droplet name="ForEach">
						<dsp:param name="array" param="asset.attributes" />

						<dsp:oparam name="empty">
							<!--  <tr><td>No features found!!!</td></tr> -->
						</dsp:oparam>

						<dsp:oparam name="outputStart">
							<table>
								<tr>
									<td><b>Included Features</b>
									<hr size="1" /></td>
								</tr>
								</dsp:oparam>

								<dsp:oparam name="output">
									<tr>
										<td valign="top"><dsp:valueof param="element.displayName" />
											- <dsp:valueof param="element.value" /><br></td>
									</tr>
								</dsp:oparam>

								<dsp:oparam name="outputEnd">
							</table>
						</dsp:oparam>
					</dsp:droplet></td>
				</tr>
				<br>
				
				<tr>
				<!-- RELATED Promotions  -->
				<td valign="top">
					
					<dsp:droplet name="ForEach">
						<dsp:param name="array" param="asset.relatedPromotions" />

						<dsp:oparam name="empty">
			<!--  <tr><td>This asset has no related Promotions</td></tr> -->
						</dsp:oparam>

						<dsp:oparam name="outputStart">
							<table>
								<tr>
									<td><b>Recommended Promotions</b>
									<hr size="1" /></td>
								</tr>
								</dsp:oparam>

								<dsp:oparam name="output">
									<tr>
										<td valign="top">
										<dsp:valueof param="element" /> 
											
						<!--<input type="submit" value="Apply" />--><br>
										</td>
									</tr>
								</dsp:oparam>

								<dsp:oparam name="outputEnd">
							</table>
						</dsp:oparam>
					</dsp:droplet></td>
				</tr>
				<!-- Upgrade Promotions  -->
				<dsp:droplet name="ForEach">
				<dsp:param name="array" param="asset.upgradePromotions" />
				<dsp:oparam name="outputStart">
				<tr>
				<td valign="top" colspan="3">
				<hr>				
				<h2>Upgrades for the Promotion</h2>
				<hr>
				</td>
				</tr>
				</dsp:oparam>
				<dsp:oparam name="output">
				<dsp:form action="" method="post">
				<tr>
				<td valign="top">
				<dsp:valueof param="element.newProductDisplayName"/>
				</td>
				<td valign="top" align = "left">
				<dsp:getvalueof var="assetNumber" param="element.assetNumber" vartype="java.lang.String"/>
				<dsp:getvalueof var="newProductId" param="element.newProductId" vartype="java.lang.String"/>
				<dsp:input type="hidden" bean="UpgradeAssetFormHandler.newProductId" value="${newProductId}"/>
				<dsp:input type="hidden" bean="UpgradeAssetFormHandler.assetNumber" value="${assetNumber}"/>
				<dsp:input type="hidden" bean="UpgradeAssetFormHandler.errorURL"  value="${pageContext.request.requestURI}?assetNumber=${assetNumber}&pageNum=${pageNum}&assetId=${assetId}" />
				</td>
				<td valign="top">
				<dsp:input bean="UpgradeAssetFormHandler.upgradeAsset" type="submit" value="Upgrade"/>
				</td>
				</tr>
				</dsp:form>
				</dsp:oparam>
				<dsp:oparam name="outputEnd">
				<tr>
				<td valign="top" colspan="3">
				<hr>
				</td>
				</tr>
				</dsp:oparam>
				</dsp:droplet>	
			</table>
		</dsp:oparam>
		<dsp:importbean bean="/atg/dynamo/droplet/For" />
	</dsp:droplet>
</dsp:page>
<%-- @version $Id: //product/Siebel/version/11.2/j2ee/siebel.war/asset/asset_details.jsp#1 $$Change: 1186180 $--%>
