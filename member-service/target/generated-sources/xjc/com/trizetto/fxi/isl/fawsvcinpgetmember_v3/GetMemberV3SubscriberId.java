//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.09.13 at 02:16:19 AM MDT 
//


package com.trizetto.fxi.isl.fawsvcinpgetmember_v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="pAS_OF_DT" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="pGRGR_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pSBSB_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pMEME_SFX" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "pasofdt",
    "pgrgrid",
    "psbsbid",
    "pmemesfx"
})
@XmlRootElement(name = "GetMember_v3_SubscriberId")
public class GetMemberV3SubscriberId {

    protected Config pConfig;
    @XmlElement(name = "pAS_OF_DT", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar pasofdt;
    @XmlElement(name = "pGRGR_ID")
    protected String pgrgrid;
    @XmlElement(name = "pSBSB_ID")
    protected String psbsbid;
    @XmlElement(name = "pMEME_SFX")
    protected String pmemesfx;

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
     * Gets the value of the pasofdt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPASOFDT() {
        return pasofdt;
    }

    /**
     * Sets the value of the pasofdt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPASOFDT(XMLGregorianCalendar value) {
        this.pasofdt = value;
    }

    /**
     * Gets the value of the pgrgrid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPGRGRID() {
        return pgrgrid;
    }

    /**
     * Sets the value of the pgrgrid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPGRGRID(String value) {
        this.pgrgrid = value;
    }

    /**
     * Gets the value of the psbsbid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPSBSBID() {
        return psbsbid;
    }

    /**
     * Sets the value of the psbsbid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPSBSBID(String value) {
        this.psbsbid = value;
    }

    /**
     * Gets the value of the pmemesfx property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPMEMESFX() {
        return pmemesfx;
    }

    /**
     * Sets the value of the pmemesfx property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPMEMESFX(String value) {
        this.pmemesfx = value;
    }

}
