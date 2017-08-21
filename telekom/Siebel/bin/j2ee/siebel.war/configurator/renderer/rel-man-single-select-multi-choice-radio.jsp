<%@ taglib prefix="dsp"
  uri="http://www.atg.com/taglibs/daf/dspjspTaglib1_0"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<dsp:page>
<!-- rel-man-single-select-multi-choice-radio.jsp -->

  <dsp:getvalueof param="node" var="uiNode" /> 
  <dsp:getvalueof param="index" var="index" />
  
      <c:if test="${uiNode.productConfigRelationship.minimumQuantity==0}">
        <tr>
         <td>
           <c:choose>
             <c:when test="${uiNode.productConfigRelationship.childInstances[0]==null}">
               <input type="radio" value="" checked="true" /> None
             </c:when>
             <c:otherwise>
               <input type="radio" value="" onclick="removeChildProduct(${index});"/> None
             </c:otherwise>           
           </c:choose>
         </td>
        </tr>
      </c:if>
  

      <c:forEach items="${uiNode.domainProducts}" var="domainProduct"
        varStatus="domainStatus">
        <tr>
         <td>
           <!-- there should only be 1 relationship with N possible domain products, but only 1 of these at any one time -->
           <c:choose>
             <c:when test="${uiNode.productConfigRelationship.childInstances[0].productId==domainProduct.id}">
               <input type="radio" value="${domainProduct.id}" checked="true" /> <dsp:valueof value="${domainProduct.name}" />
             </c:when>
             <c:otherwise>
               <input type="radio" value="${domainProduct.id}" onclick="updateUINode(${index}, this.value);"/> <dsp:valueof value="${domainProduct.name}" />
             </c:otherwise>           
           </c:choose>
         </td>
        </tr>
      </c:forEach>
      
      
    
</dsp:page>
<%-- @version $Id: //product/Siebel/version/11.2/j2ee/siebel.war/configurator/renderer/rel-man-single-select-multi-choice-radio.jsp#1 $$Change: 1186180 $--%>
