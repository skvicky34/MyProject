//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.09.13 at 03:50:59 AM MDT 
//


package com.trizetto.fxi.isl.fawsvcinpgetprovider_v2;

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
 *         &lt;element name="GetProvider_v2_ProviderIdResult" type="{http://trizetto.com/fxi/isl/FaWsvcInpGetProvider_v2}GetProvider_v2Response" minOccurs="0"/&gt;
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
    "getProviderV2ProviderIdResult"
})
@XmlRootElement(name = "GetProvider_v2_ProviderIdResponse")
public class GetProviderV2ProviderIdResponse {

    @XmlElement(name = "GetProvider_v2_ProviderIdResult")
    protected GetProviderV2Response getProviderV2ProviderIdResult;

    /**
     * Gets the value of the getProviderV2ProviderIdResult property.
     * 
     * @return
     *     possible object is
     *     {@link GetProviderV2Response }
     *     
     */
    public GetProviderV2Response getGetProviderV2ProviderIdResult() {
        return getProviderV2ProviderIdResult;
    }

    /**
     * Sets the value of the getProviderV2ProviderIdResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetProviderV2Response }
     *     
     */
    public void setGetProviderV2ProviderIdResult(GetProviderV2Response value) {
        this.getProviderV2ProviderIdResult = value;
    }

}
