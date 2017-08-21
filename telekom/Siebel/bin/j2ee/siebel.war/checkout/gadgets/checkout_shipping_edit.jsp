<%@ taglib prefix="dsp"
	uri="http://www.atg.com/taglibs/daf/dspjspTaglib1_0"%>
<dsp:page>

  <link href="../checkout.css" rel="stylesheet" type="text/css">

  <dsp:importbean bean="/atg/userprofiling/Profile" />
  <dsp:importbean bean="/atg/dynamo/droplet/TableForEach" />
  <dsp:importbean bean="/atg/dynamo/droplet/IsEmpty" />
  <dsp:importbean bean="/atg/dynamo/droplet/Compare" />
  <dsp:importbean bean="/atg/dynamo/droplet/ArrayIncludesValue" />
  <dsp:importbean bean="/atg/commerce/order/purchase/ExpressCheckoutFormHandler" />
  <dsp:importbean bean="/atg/commerce/order/purchase/CartModifierFormHandler" var="cartModifierFormHandler"/>
  <dsp:importbean bean="/atg/dynamo/droplet/ForEach" />
  <dsp:importbean bean="/atg/commerce/ShoppingCart" />

  <table class="nestedtable centrecells">
    <tr>
      <td><h3>Shipping Method</h3></td>
    </tr>

    <tr>
      <td class="centrecells">Please select one of the following methods - <dsp:droplet
          name="/atg/commerce/pricing/AvailableShippingMethods">
        <dsp:param name="shippingGroup"
          value="${cartModifierFormHandler.shippingGroup}" />
        <dsp:oparam name="output"> 
          <dsp:select
            bean="ExpressCheckoutFormHandler.shippingMethod">
            <dsp:droplet name="ForEach">
              <dsp:param name="array" param="availableShippingMethods" />
              <dsp:param name="elementName" value="method" />
              <dsp:oparam name="output">
                <dsp:option paramvalue="method">
                  <dsp:valueof param="method"/>
                </dsp:option>
              </dsp:oparam> 
            </dsp:droplet>
          </dsp:select> 
        </dsp:oparam> </dsp:droplet>
        - <dsp:input bean="ExpressCheckoutFormHandler.setShippingMethod" 
            type="submit" value=" Apply "/> </td>
    </tr>
  </table>
  
  <table class="nestedtable centrecells">

    <tr>
      <td><h3>Shipping Address</h3></td>
    </tr>

    <tr>
      <td colspan=2>
        <dsp:droplet name="TableForEach">
          <dsp:param bean="Profile.parentOrganization.secondaryAddresses" name="array" />
          <dsp:param name="elementName" value="shippingAddress" />
          <dsp:param name="numColumns" value="2" />
          
          <dsp:oparam name="outputStart">
            <table  class="nestedtable">
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
            <dsp:droplet name="IsEmpty">
              <dsp:param name="value" param="shippingAddress" />
                
              <dsp:oparam name="true">
                <td></td>
              </dsp:oparam>
              
              <dsp:oparam name="false">
                <dsp:droplet name="IsEmpty">
                  <dsp:param bean="Profile.parentOrganization.shippingAddress" name="value" />                  
                  <dsp:oparam name="true">
                    <td>
                      <dsp:input bean="ExpressCheckoutFormHandler.shippingAddressId"
                                 paramvalue="shippingAddress.repositoryid"
                                 name="shippingAddress" type="radio" />
                    </td>
                  </dsp:oparam>
                  <dsp:oparam name="false">
                    <dsp:droplet name="Compare">
                      <dsp:param name="obj1" param="shippingAddress.repositoryid" />
                      <dsp:param bean="Profile.parentOrganization.shippingAddress.repositoryid"
                                 name="obj2" />
                      <dsp:oparam name="equal">
                        <td>
                          <dsp:input bean="ExpressCheckoutFormHandler.shippingAddressId"
                                     paramvalue="shippingAddress.repositoryid"
                                     name="shippingAddress" type="radio" checked="<%=true%>" />
                        </td>
                      </dsp:oparam>
                      <dsp:oparam name="default">
                        <td>
                          <dsp:input bean="ExpressCheckoutFormHandler.shippingAddressId"
                                     paramvalue="shippingAddress.repositoryid"
                                     name="shippingAddress" type="radio" />
                        </td>
                      </dsp:oparam>
                    </dsp:droplet>
                    <%-- End of Compare --%>
                  </dsp:oparam>
                </dsp:droplet>
                <%-- End of IsEmpty --%>
                <td>
                  <dsp:getvalueof id="pval0" param="shippingAddress">
                    <dsp:include page="../../common/DisplayAddress.jsp">
                      <dsp:param name="address" value="<%=pval0%>" />
                    </dsp:include>
                  </dsp:getvalueof>
                </td>
              </dsp:oparam>
            </dsp:droplet>
            <%-- End of IsEmpty --%>
          </dsp:oparam>
        </dsp:droplet>
        <%-- End of TableForEach --%>
      </td>
    </tr>
    <tr>
      <td>
        <dsp:input bean="ExpressCheckoutFormHandler.manageAddresses"
                   type="submit" value=" Manage Addresses ">
        </dsp:input>
      </td>
    </tr>
  </table>

</dsp:page>
<%-- @version $Id: //product/Siebel/version/11.2/j2ee/siebel.war/checkout/gadgets/checkout_shipping_edit.jsp#1 $$Change: 1186180 $--%>
