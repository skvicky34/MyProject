
package com.trizetto.fxi.isl.fawsvcinplistclaim_v11;

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
 *         &lt;element name="pConfig" type="{http://trizetto.com/fxi/isl/FaWsvcInpListClaim_v11}Config" minOccurs="0"/&gt;
 *         &lt;element name="pSBSB_CK" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="pCLCL_LOW_SVC_DT" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="pCLCL_HIGH_SVC_DT" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="pCLCL_CL_TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pMAX_NUM_RECS" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
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
    "psbsbck",
    "pclcllowsvcdt",
    "pclclhighsvcdt",
    "pclclcltype",
    "pmaxnumrecs",
    "ppage",
    "ppagesize",
    "pskiprows"
})
@XmlRootElement(name = "ListClaim_v11_SubscriberKey")
public class ListClaimV11SubscriberKey {

    protected Config pConfig;
    @XmlElement(name = "pSBSB_CK", required = true, type = Long.class, nillable = true)
    protected Long psbsbck;
    @XmlElement(name = "pCLCL_LOW_SVC_DT", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar pclcllowsvcdt;
    @XmlElement(name = "pCLCL_HIGH_SVC_DT", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar pclclhighsvcdt;
    @XmlElement(name = "pCLCL_CL_TYPE")
    protected String pclclcltype;
    @XmlElement(name = "pMAX_NUM_RECS", required = true, type = Integer.class, nillable = true)
    protected Integer pmaxnumrecs;
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
     * Gets the value of the psbsbck property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPSBSBCK() {
        return psbsbck;
    }

    /**
     * Sets the value of the psbsbck property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPSBSBCK(Long value) {
        this.psbsbck = value;
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
     * Gets the value of the pclclcltype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPCLCLCLTYPE() {
        return pclclcltype;
    }

    /**
     * Sets the value of the pclclcltype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPCLCLCLTYPE(String value) {
        this.pclclcltype = value;
    }

    /**
     * Gets the value of the pmaxnumrecs property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPMAXNUMRECS() {
        return pmaxnumrecs;
    }

    /**
     * Sets the value of the pmaxnumrecs property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPMAXNUMRECS(Integer value) {
        this.pmaxnumrecs = value;
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
