//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2017.05.11 à 02:53:46 PM CEST 
//


package org.taktik.connector.business.domain.kmehr.v20161201.be.fgov.ehealth.standards.kmehr.cd.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour CD-STENT-LESIONTYPEvalues.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="CD-STENT-LESIONTYPEvalues">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="simple"/>
 *     &lt;enumeration value="multi-segment"/>
 *     &lt;enumeration value="aorto-ostiale"/>
 *     &lt;enumeration value="bifurcation"/>
 *     &lt;enumeration value="occlusionchroniquetotplus3m"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CD-STENT-LESIONTYPEvalues")
@XmlEnum
public enum CDSTENTLESIONTYPEvalues {

    @XmlEnumValue("simple")
    SIMPLE("simple"),
    @XmlEnumValue("multi-segment")
    MULTI_SEGMENT("multi-segment"),
    @XmlEnumValue("aorto-ostiale")
    AORTO_OSTIALE("aorto-ostiale"),
    @XmlEnumValue("bifurcation")
    BIFURCATION("bifurcation"),
    @XmlEnumValue("occlusionchroniquetotplus3m")
    OCCLUSIONCHRONIQUETOTPLUS_3_M("occlusionchroniquetotplus3m");
    private final String value;

    CDSTENTLESIONTYPEvalues(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CDSTENTLESIONTYPEvalues fromValue(String v) {
        for (CDSTENTLESIONTYPEvalues c: CDSTENTLESIONTYPEvalues.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
