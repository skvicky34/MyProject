
package com.trizetto.fxi.isl.fawsvcinplistclaim_v11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for REC_CLRN complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="REC_CLRN"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://trizetto.com/fxi/isl/FaWsvcInpListClaim_v11}RecordBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CLRN_MCTR_VALUE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CLRN_IDENTIFIER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="USUS_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "REC_CLRN", propOrder = {
    "clrnmctrvalue",
    "clrnidentifier",
    "ususid"
})
public class RECCLRN
    extends RecordBase
{

    @XmlElement(name = "CLRN_MCTR_VALUE")
    protected String clrnmctrvalue;
    @XmlElement(name = "CLRN_IDENTIFIER")
    protected String clrnidentifier;
    @XmlElement(name = "USUS_ID")
    protected String ususid;

    /**
     * Gets the value of the clrnmctrvalue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCLRNMCTRVALUE() {
        return clrnmctrvalue;
    }

    /**
     * Sets the value of the clrnmctrvalue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCLRNMCTRVALUE(String value) {
        this.clrnmctrvalue = value;
    }

    /**
     * Gets the value of the clrnidentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCLRNIDENTIFIER() {
        return clrnidentifier;
    }

    /**
     * Sets the value of the clrnidentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCLRNIDENTIFIER(String value) {
        this.clrnidentifier = value;
    }

    /**
     * Gets the value of the ususid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUSUSID() {
        return ususid;
    }

    /**
     * Sets the value of the ususid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUSUSID(String value) {
        this.ususid = value;
    }

}
