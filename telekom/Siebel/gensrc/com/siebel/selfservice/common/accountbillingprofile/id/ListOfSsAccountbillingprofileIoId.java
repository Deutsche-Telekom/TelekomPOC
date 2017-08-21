
package com.siebel.selfservice.common.accountbillingprofile.id;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListOfSs_Accountbillingprofile_IoId complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListOfSs_Accountbillingprofile_IoId">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ComInvoiceProfile" type="{http://www.siebel.com/SelfService/Common/AccountBillingProfile/Id}ComInvoiceProfileId" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfSs_Accountbillingprofile_IoId", propOrder = {
    "comInvoiceProfile"
})
public class ListOfSsAccountbillingprofileIoId
    implements Serializable
{

    @XmlElement(name = "ComInvoiceProfile")
    protected List<ComInvoiceProfileId> comInvoiceProfile;

    /**
     * Gets the value of the comInvoiceProfile property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the comInvoiceProfile property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComInvoiceProfile().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ComInvoiceProfileId }
     * 
     * 
     */
    public List<ComInvoiceProfileId> getComInvoiceProfile() {
        if (comInvoiceProfile == null) {
            comInvoiceProfile = new ArrayList<ComInvoiceProfileId>();
        }
        return this.comInvoiceProfile;
    }

}
