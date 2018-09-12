
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
 *         &lt;element name="ListClaim_v11_ProviderIdResult" type="{http://trizetto.com/fxi/isl/FaWsvcInpListClaim_v11}ListClaim_v11Response" minOccurs="0"/&gt;
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
    "listClaimV11ProviderIdResult"
})
@XmlRootElement(name = "ListClaim_v11_ProviderIdResponse")
public class ListClaimV11ProviderIdResponse {

    @XmlElement(name = "ListClaim_v11_ProviderIdResult")
    protected ListClaimV11Response listClaimV11ProviderIdResult;

    /**
     * Gets the value of the listClaimV11ProviderIdResult property.
     * 
     * @return
     *     possible object is
     *     {@link ListClaimV11Response }
     *     
     */
    public ListClaimV11Response getListClaimV11ProviderIdResult() {
        return listClaimV11ProviderIdResult;
    }

    /**
     * Sets the value of the listClaimV11ProviderIdResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListClaimV11Response }
     *     
     */
    public void setListClaimV11ProviderIdResult(ListClaimV11Response value) {
        this.listClaimV11ProviderIdResult = value;
    }

}
