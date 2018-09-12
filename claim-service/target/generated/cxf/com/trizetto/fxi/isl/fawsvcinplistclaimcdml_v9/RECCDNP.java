
package com.trizetto.fxi.isl.fawsvcinplistclaimcdml_v9;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for REC_CDNP complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="REC_CDNP"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://trizetto.com/fxi/isl/FaWsvcInpListClaimCDML_v9}RecordBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CDNP_IDCD_IND_PROC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CDNP_IDCD_IND_PROC_DESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CDNP_IDCD_IND_EXT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CDNP_IDCD_IND_EXT_DESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "REC_CDNP", propOrder = {
    "cdnpidcdindproc",
    "cdnpidcdindprocdesc",
    "cdnpidcdindext",
    "cdnpidcdindextdesc"
})
public class RECCDNP
    extends RecordBase
{

    @XmlElement(name = "CDNP_IDCD_IND_PROC")
    protected String cdnpidcdindproc;
    @XmlElement(name = "CDNP_IDCD_IND_PROC_DESC")
    protected String cdnpidcdindprocdesc;
    @XmlElement(name = "CDNP_IDCD_IND_EXT")
    protected String cdnpidcdindext;
    @XmlElement(name = "CDNP_IDCD_IND_EXT_DESC")
    protected String cdnpidcdindextdesc;

    /**
     * Gets the value of the cdnpidcdindproc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCDNPIDCDINDPROC() {
        return cdnpidcdindproc;
    }

    /**
     * Sets the value of the cdnpidcdindproc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCDNPIDCDINDPROC(String value) {
        this.cdnpidcdindproc = value;
    }

    /**
     * Gets the value of the cdnpidcdindprocdesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCDNPIDCDINDPROCDESC() {
        return cdnpidcdindprocdesc;
    }

    /**
     * Sets the value of the cdnpidcdindprocdesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCDNPIDCDINDPROCDESC(String value) {
        this.cdnpidcdindprocdesc = value;
    }

    /**
     * Gets the value of the cdnpidcdindext property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCDNPIDCDINDEXT() {
        return cdnpidcdindext;
    }

    /**
     * Sets the value of the cdnpidcdindext property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCDNPIDCDINDEXT(String value) {
        this.cdnpidcdindext = value;
    }

    /**
     * Gets the value of the cdnpidcdindextdesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCDNPIDCDINDEXTDESC() {
        return cdnpidcdindextdesc;
    }

    /**
     * Sets the value of the cdnpidcdindextdesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCDNPIDCDINDEXTDESC(String value) {
        this.cdnpidcdindextdesc = value;
    }

}
