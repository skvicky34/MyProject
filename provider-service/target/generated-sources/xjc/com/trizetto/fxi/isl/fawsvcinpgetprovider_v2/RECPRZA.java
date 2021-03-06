//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.09.21 at 01:23:32 AM MDT 
//


package com.trizetto.fxi.isl.fawsvcinpgetprovider_v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for REC_PRZA complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="REC_PRZA"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://trizetto.com/fxi/isl/FaWsvcInpGetProvider_v2}RecordBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MCCY_CTRY_CD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GZCD_ZIP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GZCD_ZIP_PLUS_LOW" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PRZA_EFF_DT" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="GZCD_ZIP_PLUS_HIGH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PRZA_TERM_DT" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "REC_PRZA", propOrder = {
    "mccyctrycd",
    "gzcdzip",
    "gzcdzippluslow",
    "przaeffdt",
    "gzcdzipplushigh",
    "przatermdt"
})
public class RECPRZA
    extends RecordBase
{

    @XmlElement(name = "MCCY_CTRY_CD")
    protected String mccyctrycd;
    @XmlElement(name = "GZCD_ZIP")
    protected String gzcdzip;
    @XmlElement(name = "GZCD_ZIP_PLUS_LOW")
    protected String gzcdzippluslow;
    @XmlElement(name = "PRZA_EFF_DT", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar przaeffdt;
    @XmlElement(name = "GZCD_ZIP_PLUS_HIGH")
    protected String gzcdzipplushigh;
    @XmlElement(name = "PRZA_TERM_DT", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar przatermdt;

    /**
     * Gets the value of the mccyctrycd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMCCYCTRYCD() {
        return mccyctrycd;
    }

    /**
     * Sets the value of the mccyctrycd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMCCYCTRYCD(String value) {
        this.mccyctrycd = value;
    }

    /**
     * Gets the value of the gzcdzip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGZCDZIP() {
        return gzcdzip;
    }

    /**
     * Sets the value of the gzcdzip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGZCDZIP(String value) {
        this.gzcdzip = value;
    }

    /**
     * Gets the value of the gzcdzippluslow property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGZCDZIPPLUSLOW() {
        return gzcdzippluslow;
    }

    /**
     * Sets the value of the gzcdzippluslow property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGZCDZIPPLUSLOW(String value) {
        this.gzcdzippluslow = value;
    }

    /**
     * Gets the value of the przaeffdt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPRZAEFFDT() {
        return przaeffdt;
    }

    /**
     * Sets the value of the przaeffdt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPRZAEFFDT(XMLGregorianCalendar value) {
        this.przaeffdt = value;
    }

    /**
     * Gets the value of the gzcdzipplushigh property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGZCDZIPPLUSHIGH() {
        return gzcdzipplushigh;
    }

    /**
     * Sets the value of the gzcdzipplushigh property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGZCDZIPPLUSHIGH(String value) {
        this.gzcdzipplushigh = value;
    }

    /**
     * Gets the value of the przatermdt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPRZATERMDT() {
        return przatermdt;
    }

    /**
     * Sets the value of the przatermdt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPRZATERMDT(XMLGregorianCalendar value) {
        this.przatermdt = value;
    }

}
