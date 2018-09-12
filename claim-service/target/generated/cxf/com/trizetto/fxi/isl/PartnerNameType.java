
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
