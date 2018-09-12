
package com.trizetto.fxi.isl.fawsvcinplistclaimcdml_v9;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ListClaimCDML_v9_MemberKeyResult" type="{http://trizetto.com/fxi/isl/FaWsvcInpListClaimCDML_v9}ListClaimCDML_v9Response" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "listClaimCDMLV9MemberKeyResult"
})
@XmlRootElement(name = "ListClaimCDML_v9_MemberKeyResponse")
public class ListClaimCDMLV9MemberKeyResponse {

    @XmlElement(name = "ListClaimCDML_v9_MemberKeyResult")
    protected ListClaimCDMLV9Response listClaimCDMLV9MemberKeyResult;

    /**
     * Gets the value of the listClaimCDMLV9MemberKeyResult property.
     * 
     * @return
     *     possible object is
     *     {@link ListClaimCDMLV9Response }
     *     
     */
    public ListClaimCDMLV9Response getListClaimCDMLV9MemberKeyResult() {
        return listClaimCDMLV9MemberKeyResult;
    }

    /**
     * Sets the value of the listClaimCDMLV9MemberKeyResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListClaimCDMLV9Response }
     *     
     */
    public void setListClaimCDMLV9MemberKeyResult(ListClaimCDMLV9Response value) {
        this.listClaimCDMLV9MemberKeyResult = value;
    }

}
