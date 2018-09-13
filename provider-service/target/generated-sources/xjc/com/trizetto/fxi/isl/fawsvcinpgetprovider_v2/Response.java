//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.09.13 at 05:02:02 AM MDT 
//


package com.trizetto.fxi.isl.fawsvcinpgetprovider_v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Response complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Response"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://trizetto.com/fxi/isl/FaWsvcInpGetProvider_v2}RecordBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AppReturnCode" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="AppErrors" type="{http://trizetto.com/fxi/isl/FaWsvcInpGetProvider_v2}ArrayOfREC_ERR" minOccurs="0"/&gt;
 *         &lt;element name="RESP_COLL" type="{http://trizetto.com/fxi/isl/FaWsvcInpGetProvider_v2}ArrayOfREC_RESP" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Response", propOrder = {
    "appReturnCode",
    "appErrors",
    "respcoll"
})
@XmlSeeAlso({
    GetProviderV2Response.class
})
public class Response
    extends RecordBase
{

    @XmlElement(name = "AppReturnCode")
    protected int appReturnCode;
    @XmlElement(name = "AppErrors")
    protected ArrayOfRECERR appErrors;
    @XmlElement(name = "RESP_COLL")
    protected ArrayOfRECRESP respcoll;

    /**
     * Gets the value of the appReturnCode property.
     * 
     */
    public int getAppReturnCode() {
        return appReturnCode;
    }

    /**
     * Sets the value of the appReturnCode property.
     * 
     */
    public void setAppReturnCode(int value) {
        this.appReturnCode = value;
    }

    /**
     * Gets the value of the appErrors property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRECERR }
     *     
     */
    public ArrayOfRECERR getAppErrors() {
        return appErrors;
    }

    /**
     * Sets the value of the appErrors property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRECERR }
     *     
     */
    public void setAppErrors(ArrayOfRECERR value) {
        this.appErrors = value;
    }

    /**
     * Gets the value of the respcoll property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRECRESP }
     *     
     */
    public ArrayOfRECRESP getRESPCOLL() {
        return respcoll;
    }

    /**
     * Sets the value of the respcoll property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRECRESP }
     *     
     */
    public void setRESPCOLL(ArrayOfRECRESP value) {
        this.respcoll = value;
    }

}
