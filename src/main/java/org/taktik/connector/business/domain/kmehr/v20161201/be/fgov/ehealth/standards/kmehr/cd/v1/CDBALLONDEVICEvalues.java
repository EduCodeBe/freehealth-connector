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
 * <p>Classe Java pour CD-BALLON-DEVICEvalues.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="CD-BALLON-DEVICEvalues">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ballon"/>
 *     &lt;enumeration value="deb"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CD-BALLON-DEVICEvalues")
@XmlEnum
public enum CDBALLONDEVICEvalues {

    @XmlEnumValue("ballon")
    BALLON("ballon"),
    @XmlEnumValue("deb")
    DEB("deb");
    private final String value;

    CDBALLONDEVICEvalues(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CDBALLONDEVICEvalues fromValue(String v) {
        for (CDBALLONDEVICEvalues c: CDBALLONDEVICEvalues.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
