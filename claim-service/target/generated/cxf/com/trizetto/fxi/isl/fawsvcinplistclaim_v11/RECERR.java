
package com.trizetto.fxi.isl.fawsvcinplistclaim_v11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for REC_ERR complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="REC_ERR"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://trizetto.com/fxi/isl/FaWsvcInpListClaim_v11}RecordBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ERR_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ERR_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ERR_CONTEXT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ERR_MSG_USER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ERR_MSG_SYS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ERR_MSG_PROG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "REC_ERR", propOrder = {
    "errid",
    "errcode",
    "errcontext",
    "errmsguser",
    "errmsgsys",
    "errmsgprog"
})
public class RECERR
    extends RecordBase
{

    @XmlElement(name = "ERR_ID")
    protected String errid;
    @XmlElement(name = "ERR_CODE")
    protected String errcode;
    @XmlElement(name = "ERR_CONTEXT")
    protected String errcontext;
    @XmlElement(name = "ERR_MSG_USER")
    protected String errmsguser;
    @XmlElement(name = "ERR_MSG_SYS")
    protected String errmsgsys;
    @XmlElement(name = "ERR_MSG_PROG")
    protected String errmsgprog;

    /**
     * Gets the value of the errid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getERRID() {
        return errid;
    }

    /**
     * Sets the value of the errid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setERRID(String value) {
        this.errid = value;
    }

    /**
     * Gets the value of the errcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getERRCODE() {
        return errcode;
    }

    /**
     * Sets the value of the errcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setERRCODE(String value) {
        this.errcode = value;
    }

    /**
     * Gets the value of the errcontext property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getERRCONTEXT() {
        return errcontext;
    }

    /**
     * Sets the value of the errcontext property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setERRCONTEXT(String value) {
        this.errcontext = value;
    }

    /**
     * Gets the value of the errmsguser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getERRMSGUSER() {
        return errmsguser;
    }

    /**
     * Sets the value of the errmsguser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setERRMSGUSER(String value) {
        this.errmsguser = value;
    }

    /**
     * Gets the value of the errmsgsys property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getERRMSGSYS() {
        return errmsgsys;
    }

    /**
     * Sets the value of the errmsgsys property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setERRMSGSYS(String value) {
        this.errmsgsys = value;
    }

    /**
     * Gets the value of the errmsgprog property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getERRMSGPROG() {
        return errmsgprog;
    }

    /**
     * Sets the value of the errmsgprog property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setERRMSGPROG(String value) {
        this.errmsgprog = value;
    }

}