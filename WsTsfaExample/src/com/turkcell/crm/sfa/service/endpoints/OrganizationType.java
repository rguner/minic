
package com.turkcell.crm.sfa.service.endpoints;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for organizationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="organizationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SOL"/>
 *     &lt;enumeration value="TURKCELL"/>
 *     &lt;enumeration value="GLOBAL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "organizationType")
@XmlEnum
public enum OrganizationType {

    SOL,
    TURKCELL,
    GLOBAL;

    public String value() {
        return name();
    }

    public static OrganizationType fromValue(String v) {
        return valueOf(v);
    }

}
