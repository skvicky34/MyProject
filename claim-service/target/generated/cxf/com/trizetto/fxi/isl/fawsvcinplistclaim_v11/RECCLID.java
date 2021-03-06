
package com.trizetto.fxi.isl.fawsvcinplistclaim_v11;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for REC_CLID complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="REC_CLID"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://trizetto.com/fxi/isl/FaWsvcInpListClaim_v11}RecordBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CLID_TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CLID_SEQ_NO" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="CLID_VALUE_AMT" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="CLID_VALUE_INT" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="CLID_VALUE_STRING" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CLID_VALUE_DATE" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="CLID_ADDL_DATA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CLID_ADDL_DATA_1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CLID_ADDL_DATA_2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CLID_ADDL_DATA_3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CLID_ADDL_DATA_4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CLID_ADDL_DATA_5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "REC_CLID", propOrder = {
    "clidtype",
    "clidseqno",
    "clidvalueamt",
    "clidvalueint",
    "clidvaluestring",
    "clidvaluedate",
    "clidaddldata",
    "clidaddldata1",
    "clidaddldata2",
    "clidaddldata3",
    "clidaddldata4",
    "clidaddldata5"
})
public class RECCLID
    extends RecordBase
{

    @XmlElement(name = "CLID_TYPE")
    protected String clidtype;
    @XmlElement(name = "CLID_SEQ_NO", required = true, type = Integer.class, nillable = true)
    protected Integer clidseqno;
    @XmlElement(name = "CLID_VALUE_AMT", required = true, nillable = true)
    protected BigDecimal clidvalueamt;
    @XmlElement(name = "CLID_VALUE_INT", required = true, type = Integer.class, nillable = true)
    protected Integer clidvalueint;
    @XmlElement(name = "CLID_VALUE_STRING")
    protected String clidvaluestring;
    @XmlElement(name = "CLID_VALUE_DATE", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar clidvaluedate;
    @XmlElement(name = "CLID_ADDL_DATA")
    protected String clidaddldata;
    @XmlElement(name = "CLID_ADDL_DATA_1")
    protected String clidaddldata1;
    @XmlElement(name = "CLID_ADDL_DATA_2")
    protected String clidaddldata2;
    @XmlElement(name = "CLID_ADDL_DATA_3")
    protected String clidaddldata3;
    @XmlElement(name = "CLID_ADDL_DATA_4")
    protected String clidaddldata4;
    @XmlElement(name = "CLID_ADDL_DATA_5")
    protected String clidaddldata5;

    /**
     * Gets the value of the clidtype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCLIDTYPE() {
        return clidtype;
    }

    /**
     * Sets the value of the clidtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCLIDTYPE(String value) {
        this.clidtype = value;
    }

    /**
     * Gets the value of the clidseqno property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCLIDSEQNO() {
        return clidseqno;
    }

    /**
     * Sets the value of the clidseqno property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCLIDSEQNO(Integer value) {
        this.clidseqno = value;
    }

    /**
     * Gets the value of the clidvalueamt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCLIDVALUEAMT() {
        return clidvalueamt;
    }

    /**
     * Sets the value of the clidvalueamt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCLIDVALUEAMT(BigDecimal value) {
        this.clidvalueamt = value;
    }

    /**
     * Gets the value of the clidvalueint property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCLIDVALUEINT() {
        return clidvalueint;
    }

    /**
     * Sets the value of the clidvalueint property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCLIDVALUEINT(Integer value) {
        this.clidvalueint = value;
    }

    /**
     * Gets the value of the clidvaluestring property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCLIDVALUESTRING() {
        return clidvaluestring;
    }

    /**
     * Sets the value of the clidvaluestring property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCLIDVALUESTRING(String value) {
        this.clidvaluestring = value;
    }

    /**
     * Gets the value of the clidvaluedate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCLIDVALUEDATE() {
        return clidvaluedate;
    }

    /**
     * Sets the value of the clidvaluedate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCLIDVALUEDATE(XMLGregorianCalendar value) {
        this.clidvaluedate = value;
    }

    /**
     * Gets the value of the clidaddldata property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCLIDADDLDATA() {
        return clidaddldata;
    }

    /**
     * Sets the value of the clidaddldata property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCLIDADDLDATA(String value) {
        this.clidaddldata = value;
    }

    /**
     * Gets the value of the clidaddldata1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCLIDADDLDATA1() {
        return clidaddldata1;
    }

    /**
     * Sets the value of the clidaddldata1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCLIDADDLDATA1(String value) {
        this.clidaddldata1 = value;
    }

    /**
     * Gets the value of the clidaddldata2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCLIDADDLDATA2() {
        return clidaddldata2;
    }

    /**
     * Sets the value of the clidaddldata2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCLIDADDLDATA2(String value) {
        this.clidaddldata2 = value;
    }

    /**
     * Gets the value of the clidaddldata3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCLIDADDLDATA3() {
        return clidaddldata3;
    }

    /**
     * Sets the value of the clidaddldata3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCLIDADDLDATA3(String value) {
        this.clidaddldata3 = value;
    }

    /**
     * Gets the value of the clidaddldata4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCLIDADDLDATA4() {
        return clidaddldata4;
    }

    /**
     * Sets the value of the clidaddldata4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCLIDADDLDATA4(String value) {
        this.clidaddldata4 = value;
    }

    /**
     * Gets the value of the clidaddldata5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCLIDADDLDATA5() {
        return clidaddldata5;
    }

    /**
     * Sets the value of the clidaddldata5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCLIDADDLDATA5(String value) {
        this.clidaddldata5 = value;
    }

}
