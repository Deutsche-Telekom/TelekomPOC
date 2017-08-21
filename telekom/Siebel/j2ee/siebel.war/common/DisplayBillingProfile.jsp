<%@ taglib prefix="dsp"
	uri="http://www.atg.com/taglibs/daf/dspjspTaglib1_0"%>
<dsp:page>

	<dsp:importbean bean="/atg/dynamo/droplet/IsEmpty" />
	<dsp:importbean bean="/atg/dynamo/droplet/Switch" />
	
  <td>
    <nobr><dsp:valueof param="cc.creditCardNumber" /></nobr><br>
  </td>
  <td>
    <nobr><dsp:valueof param="cc.creditCardType" /></nobr><br>
  </td>
  <td>
    <nobr><dsp:valueof param="cc.expirationMonth" />/<dsp:valueof param="cc.expirationYear" />
    </nobr><br>
  </td>
  <td> 
    <i>
    <dsp:valueof param="cc.billingAddress.address1" /> <br>
    <dsp:valueof param="cc.billingAddress.city" />,  
    <dsp:valueof param="cc.billingAddress.state" /> , 
    <dsp:valueof param="cc.billingAddress.postalCode" />  <br></i> 
  </td>

</dsp:page>
<%-- @version $Id: //product/Siebel/version/11.2/j2ee/siebel.war/common/DisplayBillingProfile.jsp#1 $$Change: 1186180 $--%>
