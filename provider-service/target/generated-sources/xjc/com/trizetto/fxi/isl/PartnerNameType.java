//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.09.21 at 01:23:32 AM MDT 
//


package com.trizetto.fxi.isl;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PartnerNameType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PartnerNameType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Facets"/&gt;
 *     &lt;enumeration value="HealthWeb"/&gt;
 *     &lt;enumeration value="NetworX"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PartnerNameType")
@XmlEnum
public enum PartnerNameType {

    @XmlEnumValue("Facets")
    FACETS("Facets"),
    @XmlEnumValue("HealthWeb")
    HEALTH_WEB("HealthWeb"),
    @XmlEnumValue("NetworX")
    NETWOR_X("NetworX");
    private final String value;

    PartnerNameType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PartnerNameType fromValue(String v) {
        for (PartnerNameType c: PartnerNameType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
