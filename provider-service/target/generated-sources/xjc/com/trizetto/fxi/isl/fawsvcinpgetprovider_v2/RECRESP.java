//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.09.14 at 01:08:44 AM MDT 
//


package com.trizetto.fxi.isl.fawsvcinpgetprovider_v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for REC_RESP complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="REC_RESP"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://trizetto.com/fxi/isl/FaWsvcInpGetProvider_v2}RecordBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PITM_TICKET_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PITM_STS" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="RESP_SERVICE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "REC_RESP", propOrder = {
    "pitmticketno",
    "pitmsts",
    "respservice"
})
public class RECRESP
    extends RecordBase
{

    @XmlElement(name = "PITM_TICKET_NO")
    protected String pitmticketno;
    @XmlElement(name = "PITM_STS")
    protected int pitmsts;
    @XmlElement(name = "RESP_SERVICE")
    protected String respservice;

    /**
     * Gets the value of the pitmticketno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPITMTICKETNO() {
        return pitmticketno;
    }

    /**
     * Sets the value of the pitmticketno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPITMTICKETNO(String value) {
        this.pitmticketno = value;
    }

    /**
     * Gets the value of the pitmsts property.
     * 
     */
    public int getPITMSTS() {
        return pitmsts;
    }

    /**
     * Sets the value of the pitmsts property.
     * 
     */
    public void setPITMSTS(int value) {
        this.pitmsts = value;
    }

    /**
     * Gets the value of the respservice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRESPSERVICE() {
        return respservice;
    }

    /**
     * Sets the value of the respservice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRESPSERVICE(String value) {
        this.respservice = value;
    }

}
