
package com.trizetto.fxi.isl.fawsvcinplistclaimcdml_v9;

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
 *         &lt;element name="pConfig" type="{http://trizetto.com/fxi/isl/FaWsvcInpListClaimCDML_v9}Config" minOccurs="0"/&gt;
 *         &lt;element name="pCLCL_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "pclclid",
    "ppage",
    "ppagesize",
    "pskiprows"
})
@XmlRootElement(name = "ListClaimCDML_v9_ClaimId")
public class ListClaimCDMLV9ClaimId {

    protected Config pConfig;
    @XmlElement(name = "pCLCL_ID")
    protected String pclclid;
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
     * Gets the value of the pclclid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPCLCLID() {
        return pclclid;
    }

    /**
     * Sets the value of the pclclid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPCLCLID(String value) {
        this.pclclid = value;
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
