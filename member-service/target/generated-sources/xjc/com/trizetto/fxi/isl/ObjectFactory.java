//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.09.11 at 05:31:17 AM MDT 
//


package com.trizetto.fxi.isl;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.trizetto.fxi.isl package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _FxiIslHeader_QNAME = new QName("http://trizetto.com/fxi/isl", "FxiIslHeader");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.trizetto.fxi.isl
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FxiIslHeader }
     * 
     */
    public FxiIslHeader createFxiIslHeader() {
        return new FxiIslHeader();
    }

    /**
     * Create an instance of {@link PartnerType }
     * 
     */
    public PartnerType createPartnerType() {
        return new PartnerType();
    }

    /**
     * Create an instance of {@link HdrCollection }
     * 
     */
    public HdrCollection createHdrCollection() {
        return new HdrCollection();
    }

    /**
     * Create an instance of {@link HdrColumn }
     * 
     */
    public HdrColumn createHdrColumn() {
        return new HdrColumn();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FxiIslHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://trizetto.com/fxi/isl", name = "FxiIslHeader")
    public JAXBElement<FxiIslHeader> createFxiIslHeader(FxiIslHeader value) {
        return new JAXBElement<FxiIslHeader>(_FxiIslHeader_QNAME, FxiIslHeader.class, null, value);
    }

}
