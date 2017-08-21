<%@ taglib prefix="dsp" uri="http://www.atg.com/taglibs/daf/dspjspTaglib1_0" %>


<dsp:page>

<%         
/* -------------------------------------------------------
 * Display an address
 * ------------------------------------------------------- */
%>
<dsp:importbean bean="/atg/dynamo/droplet/IsEmpty"/>
<dsp:importbean bean="/atg/dynamo/droplet/Switch"/>


<DECLAREPARAM NAME="address" 
              CLASS="java.lang.Object" 
              DESCRIPTION="A ContactInfo Repository Item to display">


  
  <nobr><dsp:valueof param="address.companyName"/></nobr><br>
  <nobr><dsp:valueof param="address.firstName"/> <dsp:valueof param="address.lastName"/></nobr><br>
  <nobr><dsp:valueof param="address.address1"/></nobr><br>
  <dsp:droplet name="IsEmpty">
    <dsp:param name="value" param="address.address2"/>
    <dsp:oparam name="false">
      <nobr><dsp:valueof param="address.address2"/></nobr><br>
    </dsp:oparam>
  </dsp:droplet>    
  <dsp:droplet name="Switch">
    <dsp:param name="value" param="address.country"/>
    <dsp:oparam name="de">
      <dsp:valueof param="address.postalCode"/>
      <dsp:valueof param="address.city"/>
    </dsp:oparam>
    <dsp:oparam name="default">
      <dsp:valueof param="address.city"/>,
      <dsp:valueof param="address.state"/>
      <dsp:valueof param="address.postalCode"/>
    </dsp:oparam>
  </dsp:droplet>
  <br><dsp:valueof param="address.country"/>
      
</dsp:page>
<%-- @version $Id: //product/Siebel/version/11.2/j2ee/siebel.war/common/DisplayAddress.jsp#1 $$Change: 1186180 $--%>
