//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.09.14 at 01:08:44 AM MDT 
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
 *         &lt;element name="pConfig" type="{http://trizetto.com/fxi/isl/FaWsvcInpGetProvider_v2}Config" minOccurs="0"/&gt;
 *         &lt;element name="pPRPR_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pPRAD_TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "pprprid",
    "ppradtype"
})
@XmlRootElement(name = "GetProvider_v2_AddrType")
public class GetProviderV2AddrType {

    protected Config pConfig;
    @XmlElement(name = "pPRPR_ID")
    protected String pprprid;
    @XmlElement(name = "pPRAD_TYPE")
    protected String ppradtype;

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
     * Gets the value of the pprprid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPPRPRID() {
        return pprprid;
    }

    /**
     * Sets the value of the pprprid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPPRPRID(String value) {
        this.pprprid = value;
    }

    /**
     * Gets the value of the ppradtype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPPRADTYPE() {
        return ppradtype;
    }

    /**
     * Sets the value of the ppradtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPPRADTYPE(String value) {
        this.ppradtype = value;
    }

}
