
package com.trizetto.fxi.isl.fawsvcinplistclaimcdml_v9;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfREC_CDLM complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfREC_CDLM"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="REC_CDLM" type="{http://trizetto.com/fxi/isl/FaWsvcInpListClaimCDML_v9}REC_CDLM" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfREC_CDLM", propOrder = {
    "reccdlm"
})
public class ArrayOfRECCDLM {

    @XmlElement(name = "REC_CDLM", nillable = true)
    protected List<RECCDLM> reccdlm;

    /**
     * Gets the value of the reccdlm property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reccdlm property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRECCDLM().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RECCDLM }
     * 
     * 
     */
    public List<RECCDLM> getRECCDLM() {
        if (reccdlm == null) {
            reccdlm = new ArrayList<RECCDLM>();
        }
        return this.reccdlm;
    }

}
