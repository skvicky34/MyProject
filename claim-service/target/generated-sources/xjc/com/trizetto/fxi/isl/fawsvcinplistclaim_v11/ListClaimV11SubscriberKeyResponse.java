//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.09.04 at 01:04:24 AM MDT 
//


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
 *         &lt;element name="ListClaim_v11_SubscriberKeyResult" type="{http://trizetto.com/fxi/isl/FaWsvcInpListClaim_v11}ListClaim_v11Response" minOccurs="0"/&gt;
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
    "listClaimV11SubscriberKeyResult"
})
@XmlRootElement(name = "ListClaim_v11_SubscriberKeyResponse")
public class ListClaimV11SubscriberKeyResponse {

    @XmlElement(name = "ListClaim_v11_SubscriberKeyResult")
    protected ListClaimV11Response listClaimV11SubscriberKeyResult;

    /**
     * Gets the value of the listClaimV11SubscriberKeyResult property.
     * 
     * @return
     *     possible object is
     *     {@link ListClaimV11Response }
     *     
     */
    public ListClaimV11Response getListClaimV11SubscriberKeyResult() {
        return listClaimV11SubscriberKeyResult;
    }

    /**
     * Sets the value of the listClaimV11SubscriberKeyResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListClaimV11Response }
     *     
     */
    public void setListClaimV11SubscriberKeyResult(ListClaimV11Response value) {
        this.listClaimV11SubscriberKeyResult = value;
    }

}