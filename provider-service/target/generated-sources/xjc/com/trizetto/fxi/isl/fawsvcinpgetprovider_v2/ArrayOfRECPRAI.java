//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.09.12 at 02:15:42 AM MDT 
//


package com.trizetto.fxi.isl.fawsvcinpgetprovider_v2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfREC_PRAI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfREC_PRAI"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="REC_PRAI" type="{http://trizetto.com/fxi/isl/FaWsvcInpGetProvider_v2}REC_PRAI" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfREC_PRAI", propOrder = {
    "recprai"
})
public class ArrayOfRECPRAI {

    @XmlElement(name = "REC_PRAI", nillable = true)
    protected List<RECPRAI> recprai;

    /**
     * Gets the value of the recprai property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the recprai property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRECPRAI().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RECPRAI }
     * 
     * 
     */
    public List<RECPRAI> getRECPRAI() {
        if (recprai == null) {
            recprai = new ArrayList<RECPRAI>();
        }
        return this.recprai;
    }

}