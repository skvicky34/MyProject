
package com.trizetto.fxi.isl.fawsvcinplistclaimcdml_v9;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Config complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Config"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://trizetto.com/fxi/isl/FaWsvcInpListClaimCDML_v9}RecordBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FacetsIdentity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CallingSystemName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CallingSystemUserId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CallingSystemUserName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CallingSystemTransactionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RequestedColumns" type="{http://trizetto.com/fxi/isl/FaWsvcInpListClaimCDML_v9}ArrayOfString" minOccurs="0"/&gt;
 *         &lt;element name="Region" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Config", propOrder = {
    "facetsIdentity",
    "callingSystemName",
    "callingSystemUserId",
    "callingSystemUserName",
    "callingSystemTransactionId",
    "requestedColumns",
    "region"
})
public class Config
    extends RecordBase
{

    @XmlElement(name = "FacetsIdentity")
    protected String facetsIdentity;
    @XmlElement(name = "CallingSystemName")
    protected String callingSystemName;
    @XmlElement(name = "CallingSystemUserId")
    protected String callingSystemUserId;
    @XmlElement(name = "CallingSystemUserName")
    protected String callingSystemUserName;
    @XmlElement(name = "CallingSystemTransactionId")
    protected String callingSystemTransactionId;
    @XmlElement(name = "RequestedColumns")
    protected ArrayOfString requestedColumns;
    @XmlElement(name = "Region")
    protected String region;

    /**
     * Gets the value of the facetsIdentity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFacetsIdentity() {
        return facetsIdentity;
    }

    /**
     * Sets the value of the facetsIdentity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFacetsIdentity(String value) {
        this.facetsIdentity = value;
    }

    /**
     * Gets the value of the callingSystemName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallingSystemName() {
        return callingSystemName;
    }

    /**
     * Sets the value of the callingSystemName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallingSystemName(String value) {
        this.callingSystemName = value;
    }

    /**
     * Gets the value of the callingSystemUserId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallingSystemUserId() {
        return callingSystemUserId;
    }

    /**
     * Sets the value of the callingSystemUserId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallingSystemUserId(String value) {
        this.callingSystemUserId = value;
    }

    /**
     * Gets the value of the callingSystemUserName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallingSystemUserName() {
        return callingSystemUserName;
    }

    /**
     * Sets the value of the callingSystemUserName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallingSystemUserName(String value) {
        this.callingSystemUserName = value;
    }

    /**
     * Gets the value of the callingSystemTransactionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallingSystemTransactionId() {
        return callingSystemTransactionId;
    }

    /**
     * Sets the value of the callingSystemTransactionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallingSystemTransactionId(String value) {
        this.callingSystemTransactionId = value;
    }

    /**
     * Gets the value of the requestedColumns property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getRequestedColumns() {
        return requestedColumns;
    }

    /**
     * Sets the value of the requestedColumns property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setRequestedColumns(ArrayOfString value) {
        this.requestedColumns = value;
    }

    /**
     * Gets the value of the region property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegion() {
        return region;
    }

    /**
     * Sets the value of the region property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegion(String value) {
        this.region = value;
    }

}
