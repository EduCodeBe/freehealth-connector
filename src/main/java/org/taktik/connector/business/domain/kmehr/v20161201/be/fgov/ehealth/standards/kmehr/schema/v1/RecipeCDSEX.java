//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2017.05.11 à 02:53:46 PM CEST 
//


package org.taktik.connector.business.domain.kmehr.v20161201.be.fgov.ehealth.standards.kmehr.schema.v1;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.taktik.connector.business.domain.kmehr.v20161201.be.fgov.ehealth.standards.kmehr.cd.v1.CDSEX;


/**
 * <p>Classe Java pour recipeCD-SEX complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="recipeCD-SEX">
 *   &lt;simpleContent>
 *     &lt;restriction base="&lt;http://www.ehealth.fgov.be/standards/kmehr/cd/v1>CD-SEX">
 *       &lt;attribute name="S" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="CD-SEX" />
 *       &lt;attribute name="SV" use="required" type="{http://www.ehealth.fgov.be/standards/kmehr/schema/v1}recipeCD-SEX-SVattributeType" />
 *     &lt;/restriction>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "recipeCD-SEX")
public class RecipeCDSEX
    extends CDSEX
    implements Serializable
{

    private final static long serialVersionUID = 20161201L;

}
