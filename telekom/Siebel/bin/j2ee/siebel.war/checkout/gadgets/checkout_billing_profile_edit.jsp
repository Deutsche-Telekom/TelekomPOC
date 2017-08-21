<%@ taglib prefix="dsp" uri="http://www.atg.com/taglibs/daf/dspjspTaglib1_0" %>
<dsp:page>

  <link href="../checkout.css" rel="stylesheet" type="text/css">

  <dsp:importbean bean="/atg/userprofiling/Profile"/>
  <dsp:importbean bean="/atg/dynamo/droplet/TableForEach"/>
  <dsp:importbean bean="/atg/dynamo/droplet/IsEmpty"/>
  <dsp:importbean bean="/atg/dynamo/droplet/Compare"/>
  <dsp:importbean bean="/atg/commerce/order/purchase/ExpressCheckoutFormHandler" />

  <table class="nestedtable">
    <tr>
      <td><h3>Payment Method</h3></td>
    </tr>
    <tr> 
      <%--  main content area --%>
      <td>  
        <table class="nestedtable"> 
          <tr>
            <td> 
              <dsp:droplet name="TableForEach">
                <dsp:param bean="Profile.parentOrganization.creditCards" name="array"/>
                <dsp:param name="elementName" value="cc"/>
                <dsp:param name="numColumns" value="2"/>
                <dsp:oparam name="outputStart">
                  <table class="nestedtable">
                    <tr>
                      <th></th>
                      <th>Card Number</th>
                      <th>Type</th>
                      <th>Expires</th>
                      <th>Billing Address</th>
                    </tr>
                </dsp:oparam>
                <dsp:oparam name="outputEnd"></table></dsp:oparam>
                <dsp:oparam name="outputRowStart"><tr></dsp:oparam>
                <dsp:oparam name="outputRowEnd"></tr></dsp:oparam>
                <dsp:oparam name="output">
                  <dsp:droplet name="IsEmpty">
                    <dsp:param name="value" param="cc"/>
                    <dsp:oparam name="true">
                      <td></td>
                    </dsp:oparam>
                    <dsp:oparam name="false">
                      <tr>                  
                        <dsp:droplet name="IsEmpty">
                          <dsp:param bean="Profile.parentOrganization.defaultCreditCard" name="value"/>
                          <dsp:oparam name="true">
                            <td valign="top">
                              <dsp:input bean="ExpressCheckoutFormHandler.creditCardId" paramvalue="cc.repositoryid"
                                         type="radio"/>
                            </td>
                          </dsp:oparam>
                          <dsp:oparam name="false">                              
                            <dsp:droplet name="Compare">
                              <dsp:param name="obj1" param="cc.repositoryid" />
                              <dsp:param name="obj2" bean="Profile.parentOrganization.defaultCreditCard.repositoryid" />
                              <dsp:oparam name="equal">
                                <td valign="middle">
                                  <dsp:input bean="ExpressCheckoutFormHandler.creditCardId"
                                             paramvalue="cc.repositoryid" type="radio" checked="<%=true%>" />                                                                     
                                </td>
                              </dsp:oparam>
                              <dsp:oparam name="default">
                                <td valign="middle">
                                  <dsp:input bean="ExpressCheckoutFormHandler.creditCardId"
                                             paramvalue="cc.repositoryid" type="radio" />                                  
                                </td>
                              </dsp:oparam>
                            </dsp:droplet>
                            <%-- End of Compare --%> 
                          </dsp:oparam>
                        </dsp:droplet>                 
                        <dsp:getvalueof id="pval0" param="cc"><dsp:include page="../../common/DisplayBillingProfile.jsp"><dsp:param name="cc" value="<%=pval0%>"/></dsp:include></dsp:getvalueof>
                      </tr>
                    </dsp:oparam>
                  </dsp:droplet>
                </dsp:oparam>
              </dsp:droplet>
            </td>
          </tr>
        </table>
      </td>
    </tr>
    <tr>
      <td>
        <dsp:input bean="ExpressCheckoutFormHandler.manageBillingProfiles" 
                   type="submit" value=" Manage Cards "></dsp:input>     
      </td>
    </tr>
  </table>

</dsp:page>
<%-- @version $Id: //product/Siebel/version/11.2/j2ee/siebel.war/checkout/gadgets/checkout_billing_profile_edit.jsp#1 $$Change: 1186180 $--%>
