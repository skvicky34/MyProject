
package com.trizetto.fxi.isl;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CollectionTypeList.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CollectionTypeList"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="SoapHeader"/&gt;
 *     &lt;enumeration value="Input"/&gt;
 *     &lt;enumeration value="Row"/&gt;
 *     &lt;enumeration value="Group"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CollectionTypeList")
@XmlEnum
public enum CollectionTypeList {

    @XmlEnumValue("SoapHeader")
    SOAP_HEADER("SoapHeader"),
    @XmlEnumValue("Input")
    INPUT("Input"),
    @XmlEnumValue("Row")
    ROW("Row"),
    @XmlEnumValue("Group")
    GROUP("Group");
    private final String value;

    CollectionTypeList(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CollectionTypeList fromValue(String v) {
        for (CollectionTypeList c: CollectionTypeList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
