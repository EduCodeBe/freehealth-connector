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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.taktik.connector.business.domain.kmehr.v20161201.be.fgov.ehealth.standards.kmehr.cd.v1.CDADMINISTRATIONUNIT;


/**
 * to specify the administration unit
 * 
 * <p>Classe Java pour administrationunitType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="administrationunitType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cd" type="{http://www.ehealth.fgov.be/standards/kmehr/cd/v1}CD-ADMINISTRATIONUNIT"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "administrationunitType", propOrder = {
    "cd"
})
@XmlSeeAlso({
    RecipeadministrationunitType.class
})
public class AdministrationunitType
    implements Serializable
{

    private final static long serialVersionUID = 20161201L;
    @XmlElement(required = true)
    protected CDADMINISTRATIONUNIT cd;

    /**
     * Obtient la valeur de la propriété cd.
     * 
     * @return
     *     possible object is
     *     {@link CDADMINISTRATIONUNIT }
     *     
     */
    public CDADMINISTRATIONUNIT getCd() {
        return cd;
    }

    /**
     * Définit la valeur de la propriété cd.
     * 
     * @param value
     *     allowed object is
     *     {@link CDADMINISTRATIONUNIT }
     *     
     */
    public void setCd(CDADMINISTRATIONUNIT value) {
        this.cd = value;
    }

}
