
package com.trizetto.fxi.isl.fawsvcinplistclaimcdml_v9;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListClaimCDML_v9Response complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListClaimCDML_v9Response"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://trizetto.com/fxi/isl/FaWsvcInpListClaimCDML_v9}Response"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CDML_COLL" type="{http://trizetto.com/fxi/isl/FaWsvcInpListClaimCDML_v9}ArrayOfREC_CDML" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListClaimCDML_v9Response", propOrder = {
    "cdmlcoll"
})
public class ListClaimCDMLV9Response
    extends Response
{

    @XmlElement(name = "CDML_COLL")
    protected ArrayOfRECCDML cdmlcoll;

    /**
     * Gets the value of the cdmlcoll property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRECCDML }
     *     
     */
    public ArrayOfRECCDML getCDMLCOLL() {
        return cdmlcoll;
    }

    /**
     * Sets the value of the cdmlcoll property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRECCDML }
     *     
     */
    public void setCDMLCOLL(ArrayOfRECCDML value) {
        this.cdmlcoll = value;
    }

}
