
package com.trizetto.fxi.isl.fawsvcinplistclaimcdml_v9;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for REC_CDLM complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="REC_CDLM"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://trizetto.com/fxi/isl/FaWsvcInpListClaimCDML_v9}RecordBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ACAC_ACC_NO" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ACDE_DESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PDPD_ACC_SFX" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CLCL_CL_TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CLCL_CL_TYPE_DESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CDLM_ACC_BEG_DT" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="CDLM_ACC_IND" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CDLM_ACC_IND_DESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CDLM_AMT" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="CDLM_CTR" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "REC_CDLM", propOrder = {
    "acacaccno",
    "acdedesc",
    "pdpdaccsfx",
    "clclcltype",
    "clclcltypedesc",
    "cdlmaccbegdt",
    "cdlmaccind",
    "cdlmaccinddesc",
    "cdlmamt",
    "cdlmctr"
})
public class RECCDLM
    extends RecordBase
{

    @XmlElement(name = "ACAC_ACC_NO", required = true, type = Integer.class, nillable = true)
    protected Integer acacaccno;
    @XmlElement(name = "ACDE_DESC")
    protected String acdedesc;
    @XmlElement(name = "PDPD_ACC_SFX")
    protected String pdpdaccsfx;
    @XmlElement(name = "CLCL_CL_TYPE")
    protected String clclcltype;
    @XmlElement(name = "CLCL_CL_TYPE_DESC")
    protected String clclcltypedesc;
    @XmlElement(name = "CDLM_ACC_BEG_DT", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar cdlmaccbegdt;
    @XmlElement(name = "CDLM_ACC_IND")
    protected String cdlmaccind;
    @XmlElement(name = "CDLM_ACC_IND_DESC")
    protected String cdlmaccinddesc;
    @XmlElement(name = "CDLM_AMT", required = true, nillable = true)
    protected BigDecimal cdlmamt;
    @XmlElement(name = "CDLM_CTR", required = true, type = Integer.class, nillable = true)
    protected Integer cdlmctr;

    /**
     * Gets the value of the acacaccno property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getACACACCNO() {
        return acacaccno;
    }

    /**
     * Sets the value of the acacaccno property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setACACACCNO(Integer value) {
        this.acacaccno = value;
    }

    /**
     * Gets the value of the acdedesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACDEDESC() {
        return acdedesc;
    }

    /**
     * Sets the value of the acdedesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACDEDESC(String value) {
        this.acdedesc = value;
    }

    /**
     * Gets the value of the pdpdaccsfx property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPDPDACCSFX() {
        return pdpdaccsfx;
    }

    /**
     * Sets the value of the pdpdaccsfx property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPDPDACCSFX(String value) {
        this.pdpdaccsfx = value;
    }

    /**
     * Gets the value of the clclcltype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCLCLCLTYPE() {
        return clclcltype;
    }

    /**
     * Sets the value of the clclcltype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCLCLCLTYPE(String value) {
        this.clclcltype = value;
    }

    /**
     * Gets the value of the clclcltypedesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCLCLCLTYPEDESC() {
        return clclcltypedesc;
    }

    /**
     * Sets the value of the clclcltypedesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCLCLCLTYPEDESC(String value) {
        this.clclcltypedesc = value;
    }

    /**
     * Gets the value of the cdlmaccbegdt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCDLMACCBEGDT() {
        return cdlmaccbegdt;
    }

    /**
     * Sets the value of the cdlmaccbegdt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCDLMACCBEGDT(XMLGregorianCalendar value) {
        this.cdlmaccbegdt = value;
    }

    /**
     * Gets the value of the cdlmaccind property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCDLMACCIND() {
        return cdlmaccind;
    }

    /**
     * Sets the value of the cdlmaccind property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCDLMACCIND(String value) {
        this.cdlmaccind = value;
    }

    /**
     * Gets the value of the cdlmaccinddesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCDLMACCINDDESC() {
        return cdlmaccinddesc;
    }

    /**
     * Sets the value of the cdlmaccinddesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCDLMACCINDDESC(String value) {
        this.cdlmaccinddesc = value;
    }

    /**
     * Gets the value of the cdlmamt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCDLMAMT() {
        return cdlmamt;
    }

    /**
     * Sets the value of the cdlmamt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCDLMAMT(BigDecimal value) {
        this.cdlmamt = value;
    }

    /**
     * Gets the value of the cdlmctr property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCDLMCTR() {
        return cdlmctr;
    }

    /**
     * Sets the value of the cdlmctr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCDLMCTR(Integer value) {
        this.cdlmctr = value;
    }

}
