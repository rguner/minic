
package com.turkcell.balanceinquiry.ejb.impl;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for statusCodes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="statusCodes">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ACTIVE"/>
 *     &lt;enumeration value="DEACTIVE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "statusCodes")
@XmlEnum
public enum StatusCodes {

    ACTIVE,
    DEACTIVE;

    public String value() {
        return name();
    }

    public static StatusCodes fromValue(String v) {
        return valueOf(v);
    }

}
