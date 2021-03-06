
package com.trizetto.fxi.isl.fawsvcinplistclaim_v11;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfREC_CLHC complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfREC_CLHC"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="REC_CLHC" type="{http://trizetto.com/fxi/isl/FaWsvcInpListClaim_v11}REC_CLHC" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfREC_CLHC", propOrder = {
    "recclhc"
})
public class ArrayOfRECCLHC {

    @XmlElement(name = "REC_CLHC", nillable = true)
    protected List<RECCLHC> recclhc;

    /**
     * Gets the value of the recclhc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the recclhc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRECCLHC().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RECCLHC }
     * 
     * 
     */
    public List<RECCLHC> getRECCLHC() {
        if (recclhc == null) {
            recclhc = new ArrayList<RECCLHC>();
        }
        return this.recclhc;
    }

}
