//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.09.12 at 02:15:42 AM MDT 
//


package com.trizetto.fxi.isl.fawsvcinpgetprovider_v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetProvider_v2Response complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetProvider_v2Response"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://trizetto.com/fxi/isl/FaWsvcInpGetProvider_v2}Response"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PROV_COLL" type="{http://trizetto.com/fxi/isl/FaWsvcInpGetProvider_v2}ArrayOfREC_PROV" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetProvider_v2Response", propOrder = {
    "provcoll"
})
public class GetProviderV2Response
    extends Response
{

    @XmlElement(name = "PROV_COLL")
    protected ArrayOfRECPROV provcoll;

    /**
     * Gets the value of the provcoll property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRECPROV }
     *     
     */
    public ArrayOfRECPROV getPROVCOLL() {
        return provcoll;
    }

    /**
     * Sets the value of the provcoll property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRECPROV }
     *     
     */
    public void setPROVCOLL(ArrayOfRECPROV value) {
        this.provcoll = value;
    }

}
