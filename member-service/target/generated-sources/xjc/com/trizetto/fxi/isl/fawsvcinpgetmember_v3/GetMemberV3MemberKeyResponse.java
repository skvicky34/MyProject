//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.09.11 at 05:31:17 AM MDT 
//


package com.trizetto.fxi.isl.fawsvcinpgetmember_v3;

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
 *         &lt;element name="GetMember_v3_MemberKeyResult" type="{http://trizetto.com/fxi/isl/FaWsvcInpGetMember_v3}GetMember_v3Response" minOccurs="0"/&gt;
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
    "getMemberV3MemberKeyResult"
})
@XmlRootElement(name = "GetMember_v3_MemberKeyResponse")
public class GetMemberV3MemberKeyResponse {

    @XmlElement(name = "GetMember_v3_MemberKeyResult")
    protected GetMemberV3Response getMemberV3MemberKeyResult;

    /**
     * Gets the value of the getMemberV3MemberKeyResult property.
     * 
     * @return
     *     possible object is
     *     {@link GetMemberV3Response }
     *     
     */
    public GetMemberV3Response getGetMemberV3MemberKeyResult() {
        return getMemberV3MemberKeyResult;
    }

    /**
     * Sets the value of the getMemberV3MemberKeyResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetMemberV3Response }
     *     
     */
    public void setGetMemberV3MemberKeyResult(GetMemberV3Response value) {
        this.getMemberV3MemberKeyResult = value;
    }

}
