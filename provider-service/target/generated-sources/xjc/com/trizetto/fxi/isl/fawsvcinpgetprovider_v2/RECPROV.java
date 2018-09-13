//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.09.12 at 02:15:42 AM MDT 
//


package com.trizetto.fxi.isl.fawsvcinpgetprovider_v2;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for REC_PROV complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="REC_PROV"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://trizetto.com/fxi/isl/FaWsvcInpGetProvider_v2}RecordBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PRPR_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PRPR_ENTITY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PRPR_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PRAD_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PRPR_TERM_DT" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="PRPR_MCTR_TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PRPR_MCTR_TYPE_DESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PRCF_MCTR_SPEC_DESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PRCF_MCTR_SPEC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PRCF_MCTR_SPEC2_DESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PRCF_MCTR_SPEC2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PRPR_STS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PRPR_MCTR_LANG_DESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PRPR_MCTR_VAL1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PRPR_MCTR_VAL1_DESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PRPR_MCTR_VAL2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PRPR_MCTR_VAL2_DESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PRAD_TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PRAD_ADDR1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PRAD_ADDR2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PRAD_ADDR3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PRAD_CITY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PRAD_STATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PRAD_ZIP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PRAD_COUNTY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PRAD_PHONE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PRAD_PHONE_EXT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PRAD_FAX" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PRAD_FAX_EXT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PRAD_EMAIL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PRAD_CTRY_CD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PRAD_HD_IND" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PRAD_PRACTICE_IND" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PRPR_NPI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PRRC_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PRRC_DESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PRRP_EFF_DT" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="PRRP_TERM_DT" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="PRES_AMT" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="PRES_EFF_DT" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="PRES_TERM_DT" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="PRES_MCTR_TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PRES_TYPE_DESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PRZA_COLL" type="{http://trizetto.com/fxi/isl/FaWsvcInpGetProvider_v2}ArrayOfREC_PRZA" minOccurs="0"/&gt;
 *         &lt;element name="PRAM_MEM_PCT" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="PRAM_EMR_IND" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PRAM_EPRES_IND" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PRAM_MCTR_VAL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PRAM_MCTR_VAL_DESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PRAI_COLL" type="{http://trizetto.com/fxi/isl/FaWsvcInpGetProvider_v2}ArrayOfREC_PRAI" minOccurs="0"/&gt;
 *         &lt;element name="PRAL_COLL" type="{http://trizetto.com/fxi/isl/FaWsvcInpGetProvider_v2}ArrayOfREC_PRAL" minOccurs="0"/&gt;
 *         &lt;element name="PREP_COLL" type="{http://trizetto.com/fxi/isl/FaWsvcInpGetProvider_v2}ArrayOfREC_PREP" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "REC_PROV", propOrder = {
    "prprid",
    "prprentity",
    "prprname",
    "pradid",
    "prprtermdt",
    "prprmctrtype",
    "prprmctrtypedesc",
    "prcfmctrspecdesc",
    "prcfmctrspec",
    "prcfmctrspec2DESC",
    "prcfmctrspec2",
    "prprsts",
    "prprmctrlangdesc",
    "prprmctrval1",
    "prprmctrval1DESC",
    "prprmctrval2",
    "prprmctrval2DESC",
    "pradtype",
    "pradaddr1",
    "pradaddr2",
    "pradaddr3",
    "pradcity",
    "pradstate",
    "pradzip",
    "pradcounty",
    "pradphone",
    "pradphoneext",
    "pradfax",
    "pradfaxext",
    "prademail",
    "pradctrycd",
    "pradhdind",
    "pradpracticeind",
    "prprnpi",
    "prrcid",
    "prrcdesc",
    "prrpeffdt",
    "prrptermdt",
    "presamt",
    "preseffdt",
    "prestermdt",
    "presmctrtype",
    "prestypedesc",
    "przacoll",
    "prammempct",
    "pramemrind",
    "pramepresind",
    "prammctrval",
    "prammctrvaldesc",
    "praicoll",
    "pralcoll",
    "prepcoll"
})
public class RECPROV
    extends RecordBase
{

    @XmlElement(name = "PRPR_ID")
    protected String prprid;
    @XmlElement(name = "PRPR_ENTITY")
    protected String prprentity;
    @XmlElement(name = "PRPR_NAME")
    protected String prprname;
    @XmlElement(name = "PRAD_ID")
    protected String pradid;
    @XmlElement(name = "PRPR_TERM_DT", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar prprtermdt;
    @XmlElement(name = "PRPR_MCTR_TYPE")
    protected String prprmctrtype;
    @XmlElement(name = "PRPR_MCTR_TYPE_DESC")
    protected String prprmctrtypedesc;
    @XmlElement(name = "PRCF_MCTR_SPEC_DESC")
    protected String prcfmctrspecdesc;
    @XmlElement(name = "PRCF_MCTR_SPEC")
    protected String prcfmctrspec;
    @XmlElement(name = "PRCF_MCTR_SPEC2_DESC")
    protected String prcfmctrspec2DESC;
    @XmlElement(name = "PRCF_MCTR_SPEC2")
    protected String prcfmctrspec2;
    @XmlElement(name = "PRPR_STS")
    protected String prprsts;
    @XmlElement(name = "PRPR_MCTR_LANG_DESC")
    protected String prprmctrlangdesc;
    @XmlElement(name = "PRPR_MCTR_VAL1")
    protected String prprmctrval1;
    @XmlElement(name = "PRPR_MCTR_VAL1_DESC")
    protected String prprmctrval1DESC;
    @XmlElement(name = "PRPR_MCTR_VAL2")
    protected String prprmctrval2;
    @XmlElement(name = "PRPR_MCTR_VAL2_DESC")
    protected String prprmctrval2DESC;
    @XmlElement(name = "PRAD_TYPE")
    protected String pradtype;
    @XmlElement(name = "PRAD_ADDR1")
    protected String pradaddr1;
    @XmlElement(name = "PRAD_ADDR2")
    protected String pradaddr2;
    @XmlElement(name = "PRAD_ADDR3")
    protected String pradaddr3;
    @XmlElement(name = "PRAD_CITY")
    protected String pradcity;
    @XmlElement(name = "PRAD_STATE")
    protected String pradstate;
    @XmlElement(name = "PRAD_ZIP")
    protected String pradzip;
    @XmlElement(name = "PRAD_COUNTY")
    protected String pradcounty;
    @XmlElement(name = "PRAD_PHONE")
    protected String pradphone;
    @XmlElement(name = "PRAD_PHONE_EXT")
    protected String pradphoneext;
    @XmlElement(name = "PRAD_FAX")
    protected String pradfax;
    @XmlElement(name = "PRAD_FAX_EXT")
    protected String pradfaxext;
    @XmlElement(name = "PRAD_EMAIL")
    protected String prademail;
    @XmlElement(name = "PRAD_CTRY_CD")
    protected String pradctrycd;
    @XmlElement(name = "PRAD_HD_IND")
    protected String pradhdind;
    @XmlElement(name = "PRAD_PRACTICE_IND")
    protected String pradpracticeind;
    @XmlElement(name = "PRPR_NPI")
    protected String prprnpi;
    @XmlElement(name = "PRRC_ID")
    protected String prrcid;
    @XmlElement(name = "PRRC_DESC")
    protected String prrcdesc;
    @XmlElement(name = "PRRP_EFF_DT", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar prrpeffdt;
    @XmlElement(name = "PRRP_TERM_DT", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar prrptermdt;
    @XmlElement(name = "PRES_AMT", required = true, nillable = true)
    protected BigDecimal presamt;
    @XmlElement(name = "PRES_EFF_DT", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar preseffdt;
    @XmlElement(name = "PRES_TERM_DT", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar prestermdt;
    @XmlElement(name = "PRES_MCTR_TYPE")
    protected String presmctrtype;
    @XmlElement(name = "PRES_TYPE_DESC")
    protected String prestypedesc;
    @XmlElement(name = "PRZA_COLL")
    protected ArrayOfRECPRZA przacoll;
    @XmlElement(name = "PRAM_MEM_PCT", required = true, nillable = true)
    protected BigDecimal prammempct;
    @XmlElement(name = "PRAM_EMR_IND")
    protected String pramemrind;
    @XmlElement(name = "PRAM_EPRES_IND")
    protected String pramepresind;
    @XmlElement(name = "PRAM_MCTR_VAL")
    protected String prammctrval;
    @XmlElement(name = "PRAM_MCTR_VAL_DESC")
    protected String prammctrvaldesc;
    @XmlElement(name = "PRAI_COLL")
    protected ArrayOfRECPRAI praicoll;
    @XmlElement(name = "PRAL_COLL")
    protected ArrayOfRECPRAL pralcoll;
    @XmlElement(name = "PREP_COLL")
    protected ArrayOfRECPREP prepcoll;

    /**
     * Gets the value of the prprid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRPRID() {
        return prprid;
    }

    /**
     * Sets the value of the prprid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRPRID(String value) {
        this.prprid = value;
    }

    /**
     * Gets the value of the prprentity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRPRENTITY() {
        return prprentity;
    }

    /**
     * Sets the value of the prprentity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRPRENTITY(String value) {
        this.prprentity = value;
    }

    /**
     * Gets the value of the prprname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRPRNAME() {
        return prprname;
    }

    /**
     * Sets the value of the prprname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRPRNAME(String value) {
        this.prprname = value;
    }

    /**
     * Gets the value of the pradid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRADID() {
        return pradid;
    }

    /**
     * Sets the value of the pradid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRADID(String value) {
        this.pradid = value;
    }

    /**
     * Gets the value of the prprtermdt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPRPRTERMDT() {
        return prprtermdt;
    }

    /**
     * Sets the value of the prprtermdt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPRPRTERMDT(XMLGregorianCalendar value) {
        this.prprtermdt = value;
    }

    /**
     * Gets the value of the prprmctrtype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRPRMCTRTYPE() {
        return prprmctrtype;
    }

    /**
     * Sets the value of the prprmctrtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRPRMCTRTYPE(String value) {
        this.prprmctrtype = value;
    }

    /**
     * Gets the value of the prprmctrtypedesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRPRMCTRTYPEDESC() {
        return prprmctrtypedesc;
    }

    /**
     * Sets the value of the prprmctrtypedesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRPRMCTRTYPEDESC(String value) {
        this.prprmctrtypedesc = value;
    }

    /**
     * Gets the value of the prcfmctrspecdesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRCFMCTRSPECDESC() {
        return prcfmctrspecdesc;
    }

    /**
     * Sets the value of the prcfmctrspecdesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRCFMCTRSPECDESC(String value) {
        this.prcfmctrspecdesc = value;
    }

    /**
     * Gets the value of the prcfmctrspec property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRCFMCTRSPEC() {
        return prcfmctrspec;
    }

    /**
     * Sets the value of the prcfmctrspec property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRCFMCTRSPEC(String value) {
        this.prcfmctrspec = value;
    }

    /**
     * Gets the value of the prcfmctrspec2DESC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRCFMCTRSPEC2DESC() {
        return prcfmctrspec2DESC;
    }

    /**
     * Sets the value of the prcfmctrspec2DESC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRCFMCTRSPEC2DESC(String value) {
        this.prcfmctrspec2DESC = value;
    }

    /**
     * Gets the value of the prcfmctrspec2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRCFMCTRSPEC2() {
        return prcfmctrspec2;
    }

    /**
     * Sets the value of the prcfmctrspec2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRCFMCTRSPEC2(String value) {
        this.prcfmctrspec2 = value;
    }

    /**
     * Gets the value of the prprsts property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRPRSTS() {
        return prprsts;
    }

    /**
     * Sets the value of the prprsts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRPRSTS(String value) {
        this.prprsts = value;
    }

    /**
     * Gets the value of the prprmctrlangdesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRPRMCTRLANGDESC() {
        return prprmctrlangdesc;
    }

    /**
     * Sets the value of the prprmctrlangdesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRPRMCTRLANGDESC(String value) {
        this.prprmctrlangdesc = value;
    }

    /**
     * Gets the value of the prprmctrval1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRPRMCTRVAL1() {
        return prprmctrval1;
    }

    /**
     * Sets the value of the prprmctrval1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRPRMCTRVAL1(String value) {
        this.prprmctrval1 = value;
    }

    /**
     * Gets the value of the prprmctrval1DESC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRPRMCTRVAL1DESC() {
        return prprmctrval1DESC;
    }

    /**
     * Sets the value of the prprmctrval1DESC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRPRMCTRVAL1DESC(String value) {
        this.prprmctrval1DESC = value;
    }

    /**
     * Gets the value of the prprmctrval2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRPRMCTRVAL2() {
        return prprmctrval2;
    }

    /**
     * Sets the value of the prprmctrval2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRPRMCTRVAL2(String value) {
        this.prprmctrval2 = value;
    }

    /**
     * Gets the value of the prprmctrval2DESC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRPRMCTRVAL2DESC() {
        return prprmctrval2DESC;
    }

    /**
     * Sets the value of the prprmctrval2DESC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRPRMCTRVAL2DESC(String value) {
        this.prprmctrval2DESC = value;
    }

    /**
     * Gets the value of the pradtype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRADTYPE() {
        return pradtype;
    }

    /**
     * Sets the value of the pradtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRADTYPE(String value) {
        this.pradtype = value;
    }

    /**
     * Gets the value of the pradaddr1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRADADDR1() {
        return pradaddr1;
    }

    /**
     * Sets the value of the pradaddr1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRADADDR1(String value) {
        this.pradaddr1 = value;
    }

    /**
     * Gets the value of the pradaddr2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRADADDR2() {
        return pradaddr2;
    }

    /**
     * Sets the value of the pradaddr2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRADADDR2(String value) {
        this.pradaddr2 = value;
    }

    /**
     * Gets the value of the pradaddr3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRADADDR3() {
        return pradaddr3;
    }

    /**
     * Sets the value of the pradaddr3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRADADDR3(String value) {
        this.pradaddr3 = value;
    }

    /**
     * Gets the value of the pradcity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRADCITY() {
        return pradcity;
    }

    /**
     * Sets the value of the pradcity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRADCITY(String value) {
        this.pradcity = value;
    }

    /**
     * Gets the value of the pradstate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRADSTATE() {
        return pradstate;
    }

    /**
     * Sets the value of the pradstate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRADSTATE(String value) {
        this.pradstate = value;
    }

    /**
     * Gets the value of the pradzip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRADZIP() {
        return pradzip;
    }

    /**
     * Sets the value of the pradzip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRADZIP(String value) {
        this.pradzip = value;
    }

    /**
     * Gets the value of the pradcounty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRADCOUNTY() {
        return pradcounty;
    }

    /**
     * Sets the value of the pradcounty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRADCOUNTY(String value) {
        this.pradcounty = value;
    }

    /**
     * Gets the value of the pradphone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRADPHONE() {
        return pradphone;
    }

    /**
     * Sets the value of the pradphone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRADPHONE(String value) {
        this.pradphone = value;
    }

    /**
     * Gets the value of the pradphoneext property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRADPHONEEXT() {
        return pradphoneext;
    }

    /**
     * Sets the value of the pradphoneext property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRADPHONEEXT(String value) {
        this.pradphoneext = value;
    }

    /**
     * Gets the value of the pradfax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRADFAX() {
        return pradfax;
    }

    /**
     * Sets the value of the pradfax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRADFAX(String value) {
        this.pradfax = value;
    }

    /**
     * Gets the value of the pradfaxext property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRADFAXEXT() {
        return pradfaxext;
    }

    /**
     * Sets the value of the pradfaxext property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRADFAXEXT(String value) {
        this.pradfaxext = value;
    }

    /**
     * Gets the value of the prademail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRADEMAIL() {
        return prademail;
    }

    /**
     * Sets the value of the prademail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRADEMAIL(String value) {
        this.prademail = value;
    }

    /**
     * Gets the value of the pradctrycd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRADCTRYCD() {
        return pradctrycd;
    }

    /**
     * Sets the value of the pradctrycd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRADCTRYCD(String value) {
        this.pradctrycd = value;
    }

    /**
     * Gets the value of the pradhdind property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRADHDIND() {
        return pradhdind;
    }

    /**
     * Sets the value of the pradhdind property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRADHDIND(String value) {
        this.pradhdind = value;
    }

    /**
     * Gets the value of the pradpracticeind property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRADPRACTICEIND() {
        return pradpracticeind;
    }

    /**
     * Sets the value of the pradpracticeind property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRADPRACTICEIND(String value) {
        this.pradpracticeind = value;
    }

    /**
     * Gets the value of the prprnpi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRPRNPI() {
        return prprnpi;
    }

    /**
     * Sets the value of the prprnpi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRPRNPI(String value) {
        this.prprnpi = value;
    }

    /**
     * Gets the value of the prrcid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRRCID() {
        return prrcid;
    }

    /**
     * Sets the value of the prrcid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRRCID(String value) {
        this.prrcid = value;
    }

    /**
     * Gets the value of the prrcdesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRRCDESC() {
        return prrcdesc;
    }

    /**
     * Sets the value of the prrcdesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRRCDESC(String value) {
        this.prrcdesc = value;
    }

    /**
     * Gets the value of the prrpeffdt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPRRPEFFDT() {
        return prrpeffdt;
    }

    /**
     * Sets the value of the prrpeffdt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPRRPEFFDT(XMLGregorianCalendar value) {
        this.prrpeffdt = value;
    }

    /**
     * Gets the value of the prrptermdt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPRRPTERMDT() {
        return prrptermdt;
    }

    /**
     * Sets the value of the prrptermdt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPRRPTERMDT(XMLGregorianCalendar value) {
        this.prrptermdt = value;
    }

    /**
     * Gets the value of the presamt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPRESAMT() {
        return presamt;
    }

    /**
     * Sets the value of the presamt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPRESAMT(BigDecimal value) {
        this.presamt = value;
    }

    /**
     * Gets the value of the preseffdt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPRESEFFDT() {
        return preseffdt;
    }

    /**
     * Sets the value of the preseffdt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPRESEFFDT(XMLGregorianCalendar value) {
        this.preseffdt = value;
    }

    /**
     * Gets the value of the prestermdt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPRESTERMDT() {
        return prestermdt;
    }

    /**
     * Sets the value of the prestermdt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPRESTERMDT(XMLGregorianCalendar value) {
        this.prestermdt = value;
    }

    /**
     * Gets the value of the presmctrtype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRESMCTRTYPE() {
        return presmctrtype;
    }

    /**
     * Sets the value of the presmctrtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRESMCTRTYPE(String value) {
        this.presmctrtype = value;
    }

    /**
     * Gets the value of the prestypedesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRESTYPEDESC() {
        return prestypedesc;
    }

    /**
     * Sets the value of the prestypedesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRESTYPEDESC(String value) {
        this.prestypedesc = value;
    }

    /**
     * Gets the value of the przacoll property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRECPRZA }
     *     
     */
    public ArrayOfRECPRZA getPRZACOLL() {
        return przacoll;
    }

    /**
     * Sets the value of the przacoll property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRECPRZA }
     *     
     */
    public void setPRZACOLL(ArrayOfRECPRZA value) {
        this.przacoll = value;
    }

    /**
     * Gets the value of the prammempct property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPRAMMEMPCT() {
        return prammempct;
    }

    /**
     * Sets the value of the prammempct property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPRAMMEMPCT(BigDecimal value) {
        this.prammempct = value;
    }

    /**
     * Gets the value of the pramemrind property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRAMEMRIND() {
        return pramemrind;
    }

    /**
     * Sets the value of the pramemrind property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRAMEMRIND(String value) {
        this.pramemrind = value;
    }

    /**
     * Gets the value of the pramepresind property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRAMEPRESIND() {
        return pramepresind;
    }

    /**
     * Sets the value of the pramepresind property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRAMEPRESIND(String value) {
        this.pramepresind = value;
    }

    /**
     * Gets the value of the prammctrval property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRAMMCTRVAL() {
        return prammctrval;
    }

    /**
     * Sets the value of the prammctrval property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRAMMCTRVAL(String value) {
        this.prammctrval = value;
    }

    /**
     * Gets the value of the prammctrvaldesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRAMMCTRVALDESC() {
        return prammctrvaldesc;
    }

    /**
     * Sets the value of the prammctrvaldesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRAMMCTRVALDESC(String value) {
        this.prammctrvaldesc = value;
    }

    /**
     * Gets the value of the praicoll property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRECPRAI }
     *     
     */
    public ArrayOfRECPRAI getPRAICOLL() {
        return praicoll;
    }

    /**
     * Sets the value of the praicoll property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRECPRAI }
     *     
     */
    public void setPRAICOLL(ArrayOfRECPRAI value) {
        this.praicoll = value;
    }

    /**
     * Gets the value of the pralcoll property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRECPRAL }
     *     
     */
    public ArrayOfRECPRAL getPRALCOLL() {
        return pralcoll;
    }

    /**
     * Sets the value of the pralcoll property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRECPRAL }
     *     
     */
    public void setPRALCOLL(ArrayOfRECPRAL value) {
        this.pralcoll = value;
    }

    /**
     * Gets the value of the prepcoll property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRECPREP }
     *     
     */
    public ArrayOfRECPREP getPREPCOLL() {
        return prepcoll;
    }

    /**
     * Sets the value of the prepcoll property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRECPREP }
     *     
     */
    public void setPREPCOLL(ArrayOfRECPREP value) {
        this.prepcoll = value;
    }

}