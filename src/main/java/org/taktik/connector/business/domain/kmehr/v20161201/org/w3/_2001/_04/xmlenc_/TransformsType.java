//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source.
// Généré le : 2017.03.08 à 06:26:06 PM CET
//


package org.taktik.connector.business.domain.kmehr.v20161201.org.w3._2001._04.xmlenc_;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.taktik.connector.business.domain.kmehr.v20161201.org.w3._2000._09.xmldsig_.Transform;


/**
 * <p>Classe Java pour TransformsType complex type.
 *
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 *
 * <pre>
 * &lt;complexType name="TransformsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.w3.org/2000/09/xmldsig#}Transform" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransformsType", propOrder = {
    "transforms"
})
public class TransformsType
    implements Serializable
{

    private final static long serialVersionUID = 20161201L;
    @XmlElement(name = "Transform", namespace = "http://www.w3.org/2000/09/xmldsig#", required = true)
    protected List<Transform> transforms;

    /**
     * Gets the value of the transforms property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transforms property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransforms().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Transform }
     *
     *
     */
    public List<Transform> getTransforms() {
        if (transforms == null) {
            transforms = new ArrayList<Transform>();
        }
        return this.transforms;
    }

}
