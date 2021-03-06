
package com.trizetto.fxi.isl.fawsvcinplistclaim_v11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ListClaim_v11_MemberKeyResult" type="{http://trizetto.com/fxi/isl/FaWsvcInpListClaim_v11}ListClaim_v11Response" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "listClaimV11MemberKeyResult"
})
@XmlRootElement(name = "ListClaim_v11_MemberKeyResponse")
public class ListClaimV11MemberKeyResponse {

    @XmlElement(name = "ListClaim_v11_MemberKeyResult")
    protected ListClaimV11Response listClaimV11MemberKeyResult;

    /**
     * Gets the value of the listClaimV11MemberKeyResult property.
     * 
     * @return
     *     possible object is
     *     {@link ListClaimV11Response }
     *     
     */
    public ListClaimV11Response getListClaimV11MemberKeyResult() {
        return listClaimV11MemberKeyResult;
    }

    /**
     * Sets the value of the listClaimV11MemberKeyResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListClaimV11Response }
     *     
     */
    public void setListClaimV11MemberKeyResult(ListClaimV11Response value) {
        this.listClaimV11MemberKeyResult = value;
    }

}
