//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.09.15 at 03:36:53 AM MDT 
//


package com.trizetto.fxi.isl.fawsvcinpgetmember_v3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfREC_MEME complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfREC_MEME"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="REC_MEME" type="{http://trizetto.com/fxi/isl/FaWsvcInpGetMember_v3}REC_MEME" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfREC_MEME", propOrder = {
    "recmeme"
})
public class ArrayOfRECMEME {

    @XmlElement(name = "REC_MEME", nillable = true)
    protected List<RECMEME> recmeme;

    /**
     * Gets the value of the recmeme property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the recmeme property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRECMEME().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RECMEME }
     * 
     * 
     */
    public List<RECMEME> getRECMEME() {
        if (recmeme == null) {
            recmeme = new ArrayList<RECMEME>();
        }
        return this.recmeme;
    }

}
