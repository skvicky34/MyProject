//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.09.21 at 01:23:32 AM MDT 
//


package com.trizetto.fxi.isl.fawsvcinpgetprovider_v2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfREC_PRZA complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfREC_PRZA"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="REC_PRZA" type="{http://trizetto.com/fxi/isl/FaWsvcInpGetProvider_v2}REC_PRZA" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfREC_PRZA", propOrder = {
    "recprza"
})
public class ArrayOfRECPRZA {

    @XmlElement(name = "REC_PRZA", nillable = true)
    protected List<RECPRZA> recprza;

    /**
     * Gets the value of the recprza property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the recprza property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRECPRZA().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RECPRZA }
     * 
     * 
     */
    public List<RECPRZA> getRECPRZA() {
        if (recprza == null) {
            recprza = new ArrayList<RECPRZA>();
        }
        return this.recprza;
    }

}
