<%@ taglib prefix="dsp"
  uri="http://www.atg.com/taglibs/daf/dspjspTaglib1_0"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="dspel"
  uri="http://www.atg.com/taglibs/daf/dspjspELTaglib1_0"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

<dsp:page>

    <dsp:getvalueof param="commerceItem" var="commerceItem" />

    <table style="padding:10px;font:15px arial,sans-serif;width:75%;border:1px solid;border-color:#5C4A56;background-color:#F9F9F4">
      <tr style="font:16px arial,sans-serif;color:#B25538">
        <th align="left" style="padding-bottom:10px;padding-top:5px;border:1px dotted gray;border-right-style:none;border-top-style:none;border-left-style:none">Commerce Item Details</th>
      </tr>
      <tr>
        <td colspan="5">
          <h4 style="color: blue">Promotion Commerce Item -
              ${commerceItem.id }</h4> 
        </td>
      </tr>
      <tr align="left" style="padding-bottom:10px;padding-top:5px;border:1px dotted gray;border-right-style:none;border-top-style:none;border-left-style:none">
        <th>CommerceItem Id</th>
        <th>Product Id</th>
        <th>Product Name</th>
        <th>Parent CommerceItem</th>
        <th>Attributes</th>
      </tr>
        <tr>
          <td>
            
            <dsp:include page="show_commerce_item.jsp">
              <dsp:param name="commerceItem" value="${commerceItem }" />
              <dsp:param name="parentItemId" value="n/a" />
            </dsp:include>
          </td>
        </tr>

    </table>
    
</dsp:page>
<%-- @version $Id: //product/Siebel/version/11.2/j2ee/siebel.war/configurator/show_cart.jsp#1 $$Change: 1186180 $--%>
