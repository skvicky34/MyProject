
package com.trizetto.fxi.isl.fawsvcinplistclaim_v11;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfREC_CLID complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfREC_CLID"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="REC_CLID" type="{http://trizetto.com/fxi/isl/FaWsvcInpListClaim_v11}REC_CLID" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfREC_CLID", propOrder = {
    "recclid"
})
public class ArrayOfRECCLID {

    @XmlElement(name = "REC_CLID", nillable = true)
    protected List<RECCLID> recclid;

    /**
     * Gets the value of the recclid property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the recclid property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRECCLID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RECCLID }
     * 
     * 
     */
    public List<RECCLID> getRECCLID() {
        if (recclid == null) {
            recclid = new ArrayList<RECCLID>();
        }
        return this.recclid;
    }

}
