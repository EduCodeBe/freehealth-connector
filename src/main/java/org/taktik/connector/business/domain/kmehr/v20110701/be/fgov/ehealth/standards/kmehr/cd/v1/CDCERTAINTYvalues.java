//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2015.03.05 à 11:47:59 AM CET 
//


package org.taktik.connector.business.domain.kmehr.v20110701.be.fgov.ehealth.standards.kmehr.cd.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour CD-CERTAINTYvalues.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="CD-CERTAINTYvalues">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="excluded"/>
 *     &lt;enumeration value="probable"/>
 *     &lt;enumeration value="proven"/>
 *     &lt;enumeration value="unprobable"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CD-CERTAINTYvalues")
@XmlEnum
public enum CDCERTAINTYvalues {

    @XmlEnumValue("excluded")
    EXCLUDED("excluded"),
    @XmlEnumValue("probable")
    PROBABLE("probable"),
    @XmlEnumValue("proven")
    PROVEN("proven"),
    @XmlEnumValue("unprobable")
    UNPROBABLE("unprobable");
    private final String value;

    CDCERTAINTYvalues(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CDCERTAINTYvalues fromValue(String v) {
        for (CDCERTAINTYvalues c: CDCERTAINTYvalues.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
