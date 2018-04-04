package be.recipe.services;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
   name = "markAsUnDeliveredResponse"
)
@XmlRootElement(
   name = "markAsUnDeliveredResponse"
)
public class MarkAsUnDeliveredResponse implements Serializable {
   private static final long serialVersionUID = 1L;
}
