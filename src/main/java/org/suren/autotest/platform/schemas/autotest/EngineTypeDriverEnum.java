//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.01.22 at 09:12:09 PM CST 
//


package org.suren.autotest.platform.schemas.autotest;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for engineTypeDriverEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="engineTypeDriverEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ie"/>
 *     &lt;enumeration value="chrome"/>
 *     &lt;enumeration value="firefox"/>
 *     &lt;enumeration value="opera"/>
 *     &lt;enumeration value="safari"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "engineTypeDriverEnum")
@XmlEnum
public enum EngineTypeDriverEnum {
	@XmlEnumValue("chrome")
	CHROME("chrome"),
	
    @XmlEnumValue("ie")
    IE("ie"),

    @XmlEnumValue("firefox")
    FIREFOX("firefox"),

    @XmlEnumValue("opera")
    OPERA("opera"),

    @XmlEnumValue("safari")
    SAFARI("safari");
    private final String value;

    EngineTypeDriverEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EngineTypeDriverEnum fromValue(String v) {
        for (EngineTypeDriverEnum c: EngineTypeDriverEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
