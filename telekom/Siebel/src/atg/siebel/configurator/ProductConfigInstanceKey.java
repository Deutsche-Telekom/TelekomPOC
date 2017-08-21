/*<ORACLECOPYRIGHT>
 * Copyright (C) 1994, 2015, Oracle and/or its affiliates. All rights reserved.
 * Oracle and Java are registered trademarks of Oracle and/or its affiliates. 
 * Other names may be trademarks of their respective owners.
 * UNIX is a registered trademark of The Open Group.
 *
 * This software and related documentation are provided under a license agreement 
 * containing restrictions on use and disclosure and are protected by intellectual property laws. 
 * Except as expressly permitted in your license agreement or allowed by law, you may not use, copy, 
 * reproduce, translate, broadcast, modify, license, transmit, distribute, exhibit, perform, publish, 
 * or display any part, in any form, or by any means. Reverse engineering, disassembly, 
 * or decompilation of this software, unless required by law for interoperability, is prohibited.
 *
 * The information contained herein is subject to change without notice and is not warranted to be error-free. 
 * If you find any errors, please report them to us in writing.
 *
 * U.S. GOVERNMENT RIGHTS Programs, software, databases, and related documentation and technical data delivered to U.S. 
 * Government customers are "commercial computer software" or "commercial technical data" pursuant to the applicable 
 * Federal Acquisition Regulation and agency-specific supplemental regulations. 
 * As such, the use, duplication, disclosure, modification, and adaptation shall be subject to the restrictions and 
 * license terms set forth in the applicable Government contract, and, to the extent applicable by the terms of the 
 * Government contract, the additional rights set forth in FAR 52.227-19, Commercial Computer Software License 
 * (December 2007). Oracle America, Inc., 500 Oracle Parkway, Redwood City, CA 94065.
 *
 * This software or hardware is developed for general use in a variety of information management applications. 
 * It is not developed or intended for use in any inherently dangerous applications, including applications that 
 * may create a risk of personal injury. If you use this software or hardware in dangerous applications, 
 * then you shall be responsible to take all appropriate fail-safe, backup, redundancy, 
 * and other measures to ensure its safe use. Oracle Corporation and its affiliates disclaim any liability for any 
 * damages caused by use of this software or hardware in dangerous applications.
 *
 * This software or hardware and documentation may provide access to or information on content, 
 * products, and services from third parties. Oracle Corporation and its affiliates are not responsible for and 
 * expressly disclaim all warranties of any kind with respect to third-party content, products, and services. 
 * Oracle Corporation and its affiliates will not be responsible for any loss, costs, 
 * or damages incurred due to your access to or use of third-party content, products, or services.
 </ORACLECOPYRIGHT>*/

/**
 * $Id: //product/Siebel/version/11.2/src/atg/siebel/configurator/ProductConfigInstanceKey.java#2 $
 *
 * Created for the Oracle/ATG PoC at Swisscom in 2011.
 */
package atg.siebel.configurator;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * <p>The key for the ProductConfigInstance Map has the following structure:<br>
     commerce_Item_Id, prod_id , instance number<br>
     <br>
     Each level of nesting is reflected by appending the corresponding pair to the parent product key.<br>
     <br>
     <b>Example:</b><br>
     Given the following product structure:<br>
     </p>
     <pre>
     bundle
        -> root 1 
           -> child 1.1 (0)
              -> child 1.1.1 (0)
              -> child 1.1.1 (1)
           -> child 1.1 (1)
              -> child 1.1.1 (0)
              -> child 1.1.1 (1)
        -> root 2
           ....
     </pre>
     <p>      
     As we always only regard the subtree from a root_product the unique key for the 2nd sub-child-instance of the 2nd 
     child would look as follow (the children have a cardinality 2 relationship to their parents)
     </p>
     <pre>key= [(commerce_Item_Id|root_id_1|0),(commerce_Item_Id|child_id_1|1),(commerce_Item_Id|child_id_1|1)]</pre>
 *
 *  @author falco.knapp@cgi.com
 */
public class ProductConfigInstanceKey implements Cloneable{

  //-------------------------------------
  /** Class version string */

  public static String CLASS_VERSION = "$Id: //product/Siebel/version/11.2/src/atg/siebel/configurator/ProductConfigInstanceKey.java#2 $$Change: 1194813 $";


    public class ProductInstancePair {
        public String productId;
        public int instanceNumber;
        
        public ProductInstancePair(String prodId, int instanceNumber) {
            this.productId = prodId;
            this.instanceNumber = instanceNumber;
        }
    }
    
    private String commerceItemId = "";
    
    private List<ProductInstancePair> keyElements = new ArrayList<ProductInstancePair>();
    
    private static Pattern pattern = Pattern.compile("^\\[\\([^\\,\\|\\(\\[\\]\\)]++\\|\\d++\\){1}+(?:\\,\\([^\\,\\|\\(\\[\\]\\)]++\\|\\d++\\))*+\\]");

    public ProductConfigInstanceKey(String commerceItemId) {
      this.commerceItemId = commerceItemId;
    }
    
    public ProductConfigInstanceKey(String prodId, int instanceNumber) {
        keyElements.add(new ProductInstancePair(prodId, instanceNumber));
    }
    
    public void appendKeyElement(String prodId, int instanceNumber) {
        keyElements.add(new ProductInstancePair(prodId, instanceNumber));
    }
    
    /** {@inheritDoc} */
    @Override
    public Object clone() {
        ProductConfigInstanceKey cloneKey = new ProductConfigInstanceKey(this.commerceItemId);
        for (ProductInstancePair pair: keyElements) {
            cloneKey.appendKeyElement(pair.productId, pair.instanceNumber);
        }
        return cloneKey;
    }

    /** {@inheritDoc} */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("[");
        int count = 0;
        builder.append("(");
        builder.append(commerceItemId);
        builder.append("|");
        for (ProductInstancePair pair : keyElements) {
            builder.append(pair.productId);
            builder.append("|");
            builder.append(pair.instanceNumber);
            builder.append(")");
            String end = ++count < keyElements.size() ? "," : "";
            builder.append(end);
        }
        builder.append("]");
        return builder.toString();
    }
    
    /**
     * Same as toString() but without brackets
     * @return
     */
    public String asSimpleString() {
      StringBuilder builder = new StringBuilder();
      builder.append(commerceItemId);
      builder.append(".");
      for (ProductInstancePair pair : keyElements) {
          builder.append(pair.productId);
          builder.append(".");
          builder.append(pair.instanceNumber);
          builder.append(".");
      }
      builder.append("]");
      return builder.toString();
  }
    
    /** {@inheritDoc} */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + this.toString().hashCode();
        return result;
    }

    /** {@inheritDoc} */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        ProductConfigInstanceKey other = (ProductConfigInstanceKey) obj;
        if (keyElements == null) {
            if (other.keyElements != null)
                return false;
        } else if (!this.toString().equals(other.toString()))
            return false;
        return true;
    }
    
    /**
     * This method returns a hashCode representation of the key (used for instance in jsp for javascripts).
     * Be aware that using this hash doesn't allow to recover the key object.
     * @return
     */
    public String getHashCode() {
        return "" + Math.abs(this.toString().hashCode());
    }
    
    public int getInstanceNumber() {
    	if (keyElements == null || keyElements.isEmpty()) {
    		// ????
    		return 0;
    	}
    	return keyElements.get(keyElements.size()-1).instanceNumber;
    }
}
