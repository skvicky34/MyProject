//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.09.15 at 03:36:53 AM MDT 
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
 *         &lt;element name="pConfig" type="{http://trizetto.com/fxi/isl/FaWsvcInpGetMember_v3}Config" minOccurs="0"/&gt;
 *         &lt;element name="pMEME_CK" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
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
    "pConfig",
    "pmemeck"
})
@XmlRootElement(name = "GetMember_v3_MemberKey")
public class GetMemberV3MemberKey {

    protected Config pConfig;
    @XmlElement(name = "pMEME_CK", required = true, type = Long.class, nillable = true)
    protected Long pmemeck;

    /**
     * Gets the value of the pConfig property.
     * 
     * @return
     *     possible object is
     *     {@link Config }
     *     
     */
    public Config getPConfig() {
        return pConfig;
    }

    /**
     * Sets the value of the pConfig property.
     * 
     * @param value
     *     allowed object is
     *     {@link Config }
     *     
     */
    public void setPConfig(Config value) {
        this.pConfig = value;
    }

    /**
     * Gets the value of the pmemeck property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPMEMECK() {
        return pmemeck;
    }

    /**
     * Sets the value of the pmemeck property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPMEMECK(Long value) {
        this.pmemeck = value;
    }

}
