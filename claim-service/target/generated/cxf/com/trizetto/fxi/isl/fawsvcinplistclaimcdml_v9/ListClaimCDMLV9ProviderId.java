
package com.trizetto.fxi.isl.fawsvcinplistclaimcdml_v9;

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
 *         &lt;element name="pConfig" type="{http://trizetto.com/fxi/isl/FaWsvcInpListClaimCDML_v9}Config" minOccurs="0"/&gt;
 *         &lt;element name="pPRPR_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pCLCL_LOW_SVC_DT" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="pCLCL_HIGH_SVC_DT" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="pCLCL_CL_SUB_TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pPAGE" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="pPAGESIZE" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="pSKIPROWS" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
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
    "pclcllowsvcdt",
    "pclclhighsvcdt",
    "pclclclsubtype",
    "ppage",
    "ppagesize",
    "pskiprows"
})
@XmlRootElement(name = "ListClaimCDML_v9_ProviderId")
public class ListClaimCDMLV9ProviderId {

    protected Config pConfig;
    @XmlElement(name = "pPRPR_ID")
    protected String pprprid;
    @XmlElement(name = "pCLCL_LOW_SVC_DT", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar pclcllowsvcdt;
    @XmlElement(name = "pCLCL_HIGH_SVC_DT", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar pclclhighsvcdt;
    @XmlElement(name = "pCLCL_CL_SUB_TYPE")
    protected String pclclclsubtype;
    @XmlElement(name = "pPAGE", required = true, type = Integer.class, nillable = true)
    protected Integer ppage;
    @XmlElement(name = "pPAGESIZE", required = true, type = Integer.class, nillable = true)
    protected Integer ppagesize;
    @XmlElement(name = "pSKIPROWS", required = true, type = Integer.class, nillable = true)
    protected Integer pskiprows;

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
     * Gets the value of the pclcllowsvcdt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPCLCLLOWSVCDT() {
        return pclcllowsvcdt;
    }

    /**
     * Sets the value of the pclcllowsvcdt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPCLCLLOWSVCDT(XMLGregorianCalendar value) {
        this.pclcllowsvcdt = value;
    }

    /**
     * Gets the value of the pclclhighsvcdt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPCLCLHIGHSVCDT() {
        return pclclhighsvcdt;
    }

    /**
     * Sets the value of the pclclhighsvcdt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPCLCLHIGHSVCDT(XMLGregorianCalendar value) {
        this.pclclhighsvcdt = value;
    }

    /**
     * Gets the value of the pclclclsubtype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPCLCLCLSUBTYPE() {
        return pclclclsubtype;
    }

    /**
     * Sets the value of the pclclclsubtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPCLCLCLSUBTYPE(String value) {
        this.pclclclsubtype = value;
    }

    /**
     * Gets the value of the ppage property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPPAGE() {
        return ppage;
    }

    /**
     * Sets the value of the ppage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPPAGE(Integer value) {
        this.ppage = value;
    }

    /**
     * Gets the value of the ppagesize property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPPAGESIZE() {
        return ppagesize;
    }

    /**
     * Sets the value of the ppagesize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPPAGESIZE(Integer value) {
        this.ppagesize = value;
    }

    /**
     * Gets the value of the pskiprows property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPSKIPROWS() {
        return pskiprows;
    }

    /**
     * Sets the value of the pskiprows property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPSKIPROWS(Integer value) {
        this.pskiprows = value;
    }

}
