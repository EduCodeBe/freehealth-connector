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


/**
 * <p>Classe Java pour reciperecipienthcpartyrType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="reciperecipienthcpartyrType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.ehealth.fgov.be/standards/kmehr/schema/v1}hcpartyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.ehealth.fgov.be/standards/kmehr/schema/v1}reciperecipientID-HCPARTY"/>
 *         &lt;element name="cd" type="{http://www.ehealth.fgov.be/standards/kmehr/schema/v1}reciperecipientCD-HCPARTY"/>
 *         &lt;choice>
 *           &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "reciperecipienthcpartyrType")
public class ReciperecipienthcpartyrType
    extends HcpartyType
    implements Serializable
{

    private final static long serialVersionUID = 20161201L;

}
