
package com.trizetto.fxi.isl.fawsvcinplistclaim_v11;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfREC_RESP complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfREC_RESP"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="REC_RESP" type="{http://trizetto.com/fxi/isl/FaWsvcInpListClaim_v11}REC_RESP" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfREC_RESP", propOrder = {
    "recresp"
})
public class ArrayOfRECRESP {

    @XmlElement(name = "REC_RESP", nillable = true)
    protected List<RECRESP> recresp;

    /**
     * Gets the value of the recresp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the recresp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRECRESP().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RECRESP }
     * 
     * 
     */
    public List<RECRESP> getRECRESP() {
        if (recresp == null) {
            recresp = new ArrayList<RECRESP>();
        }
        return this.recresp;
    }

}
