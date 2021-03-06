
package com.trizetto.fxi.isl.fawsvcinplistclaim_v11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for REC_CLHC complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="REC_CLHC"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://trizetto.com/fxi/isl/FaWsvcInpListClaim_v11}RecordBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CLHC_SEQ_NO" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="CLHC_COND_CD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "REC_CLHC", propOrder = {
    "clhcseqno",
    "clhccondcd"
})
public class RECCLHC
    extends RecordBase
{

    @XmlElement(name = "CLHC_SEQ_NO", required = true, type = Integer.class, nillable = true)
    protected Integer clhcseqno;
    @XmlElement(name = "CLHC_COND_CD")
    protected String clhccondcd;

    /**
     * Gets the value of the clhcseqno property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCLHCSEQNO() {
        return clhcseqno;
    }

    /**
     * Sets the value of the clhcseqno property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCLHCSEQNO(Integer value) {
        this.clhcseqno = value;
    }

    /**
     * Gets the value of the clhccondcd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCLHCCONDCD() {
        return clhccondcd;
    }

    /**
     * Sets the value of the clhccondcd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCLHCCONDCD(String value) {
        this.clhccondcd = value;
    }

}
