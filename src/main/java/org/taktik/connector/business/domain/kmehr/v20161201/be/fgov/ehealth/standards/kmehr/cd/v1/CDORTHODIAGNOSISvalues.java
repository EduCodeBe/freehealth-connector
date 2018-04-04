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
 * <p>Classe Java pour CD-ORTHO-DIAGNOSISvalues.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="CD-ORTHO-DIAGNOSISvalues">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="primaryarthrosis"/>
 *     &lt;enumeration value="necrosisavascular"/>
 *     &lt;enumeration value="fracture"/>
 *     &lt;enumeration value="inflamatory"/>
 *     &lt;enumeration value="posttraumaticarthrosis"/>
 *     &lt;enumeration value="arthrosisafterinfection"/>
 *     &lt;enumeration value="secondaryarthrosis"/>
 *     &lt;enumeration value="rheumatoidarthritis"/>
 *     &lt;enumeration value="tumor"/>
 *     &lt;enumeration value="hipdysplasia"/>
 *     &lt;enumeration value="other"/>
 *     &lt;enumeration value="asepticloosening"/>
 *     &lt;enumeration value="infection"/>
 *     &lt;enumeration value="instability"/>
 *     &lt;enumeration value="periprostheticfracture"/>
 *     &lt;enumeration value="pain"/>
 *     &lt;enumeration value="wearpolyethylene"/>
 *     &lt;enumeration value="wrongalignment"/>
 *     &lt;enumeration value="fractureofimplant"/>
 *     &lt;enumeration value="progressionarthrosis"/>
 *     &lt;enumeration value="rigidity"/>
 *     &lt;enumeration value="wear"/>
 *     &lt;enumeration value="inflammatory"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CD-ORTHO-DIAGNOSISvalues")
@XmlEnum
public enum CDORTHODIAGNOSISvalues {

    @XmlEnumValue("primaryarthrosis")
    PRIMARYARTHROSIS("primaryarthrosis"),
    @XmlEnumValue("necrosisavascular")
    NECROSISAVASCULAR("necrosisavascular"),
    @XmlEnumValue("fracture")
    FRACTURE("fracture"),
    @XmlEnumValue("inflamatory")
    INFLAMATORY("inflamatory"),
    @XmlEnumValue("posttraumaticarthrosis")
    POSTTRAUMATICARTHROSIS("posttraumaticarthrosis"),
    @XmlEnumValue("arthrosisafterinfection")
    ARTHROSISAFTERINFECTION("arthrosisafterinfection"),
    @XmlEnumValue("secondaryarthrosis")
    SECONDARYARTHROSIS("secondaryarthrosis"),
    @XmlEnumValue("rheumatoidarthritis")
    RHEUMATOIDARTHRITIS("rheumatoidarthritis"),
    @XmlEnumValue("tumor")
    TUMOR("tumor"),
    @XmlEnumValue("hipdysplasia")
    HIPDYSPLASIA("hipdysplasia"),
    @XmlEnumValue("other")
    OTHER("other"),
    @XmlEnumValue("asepticloosening")
    ASEPTICLOOSENING("asepticloosening"),
    @XmlEnumValue("infection")
    INFECTION("infection"),
    @XmlEnumValue("instability")
    INSTABILITY("instability"),
    @XmlEnumValue("periprostheticfracture")
    PERIPROSTHETICFRACTURE("periprostheticfracture"),
    @XmlEnumValue("pain")
    PAIN("pain"),
    @XmlEnumValue("wearpolyethylene")
    WEARPOLYETHYLENE("wearpolyethylene"),
    @XmlEnumValue("wrongalignment")
    WRONGALIGNMENT("wrongalignment"),
    @XmlEnumValue("fractureofimplant")
    FRACTUREOFIMPLANT("fractureofimplant"),
    @XmlEnumValue("progressionarthrosis")
    PROGRESSIONARTHROSIS("progressionarthrosis"),
    @XmlEnumValue("rigidity")
    RIGIDITY("rigidity"),
    @XmlEnumValue("wear")
    WEAR("wear"),
    @XmlEnumValue("inflammatory")
    INFLAMMATORY("inflammatory");
    private final String value;

    CDORTHODIAGNOSISvalues(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CDORTHODIAGNOSISvalues fromValue(String v) {
        for (CDORTHODIAGNOSISvalues c: CDORTHODIAGNOSISvalues.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
