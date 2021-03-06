
package com.trizetto.fxi.isl.fawsvcinplistclaim_v11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListClaim_v11Response complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListClaim_v11Response"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://trizetto.com/fxi/isl/FaWsvcInpListClaim_v11}Response"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CLCL_COLL" type="{http://trizetto.com/fxi/isl/FaWsvcInpListClaim_v11}ArrayOfREC_CLCL" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListClaim_v11Response", propOrder = {
    "clclcoll"
})
public class ListClaimV11Response
    extends Response
{

    @XmlElement(name = "CLCL_COLL")
    protected ArrayOfRECCLCL clclcoll;

    /**
     * Gets the value of the clclcoll property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRECCLCL }
     *     
     */
    public ArrayOfRECCLCL getCLCLCOLL() {
        return clclcoll;
    }

    /**
     * Sets the value of the clclcoll property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRECCLCL }
     *     
     */
    public void setCLCLCOLL(ArrayOfRECCLCL value) {
        this.clclcoll = value;
    }

}
