package be.fgov.ehealth.recipe.protocol.v2;

import be.fgov.ehealth.commons.protocol.v1.RequestType;
import be.fgov.ehealth.recipe.core.v2.SecuredContentType;
import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
   name = "UpdatePatientFeedbackFlagRequestType",
   propOrder = {"securedUpdatePatientFeedbackFlagRequest"}
)
@XmlRootElement(
   name = "UpdatePatientFeedbackFlagRequest"
)
public class UpdatePatientFeedbackFlagRequest extends RequestType implements Serializable {
   private static final long serialVersionUID = 1L;
   @XmlElement(
      name = "SecuredUpdatePatientFeedbackFlagRequest",
      required = true
   )
   protected SecuredContentType securedUpdatePatientFeedbackFlagRequest;

   public SecuredContentType getSecuredUpdatePatientFeedbackFlagRequest() {
      return this.securedUpdatePatientFeedbackFlagRequest;
   }

   public void setSecuredUpdatePatientFeedbackFlagRequest(SecuredContentType value) {
      this.securedUpdatePatientFeedbackFlagRequest = value;
   }
}
