package be.fgov.ehealth.recipe.protocol.v1;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

@WebService(
   targetNamespace = "urn:be:fgov:ehealth:recipe:protocol:v1",
   name = "RecipeExecutorPortType"
)
@XmlSeeAlso({ObjectFactory.class, be.fgov.ehealth.commons.protocol.v1.ObjectFactory.class, be.fgov.ehealth.commons.core.v1.ObjectFactory.class, be.fgov.ehealth.recipe.core.v1.ObjectFactory.class})
@SOAPBinding(
   parameterStyle = SOAPBinding.ParameterStyle.BARE
)
public interface RecipeExecutorPortType {
   @WebResult(
      name = "ListNotificationsResponse",
      targetNamespace = "urn:be:fgov:ehealth:recipe:protocol:v1",
      partName = "body"
   )
   @WebMethod(
      action = "urn:be:fgov:ehealth:recipe:protocol:v1:ListNotifications"
   )
   ListNotificationsResponse listNotifications(@WebParam(partName = "body",name = "ListNotificationsRequest",targetNamespace = "urn:be:fgov:ehealth:recipe:protocol:v1") ListNotificationsRequest var1);

   @WebResult(
      name = "GetPrescriptionForExecutorResponse",
      targetNamespace = "urn:be:fgov:ehealth:recipe:protocol:v1",
      partName = "body"
   )
   @WebMethod(
      action = "urn:be:fgov:ehealth:recipe:protocol:v1:GetPrescriptionForExecutor"
   )
   GetPrescriptionForExecutorResponse getPrescriptionForExecutor(@WebParam(partName = "body",name = "GetPrescriptionForExecutorRequest",targetNamespace = "urn:be:fgov:ehealth:recipe:protocol:v1") GetPrescriptionForExecutorRequest var1);

   @WebResult(
      name = "MarkAsUnDeliveredResponse",
      targetNamespace = "urn:be:fgov:ehealth:recipe:protocol:v1",
      partName = "body"
   )
   @WebMethod(
      action = "urn:be:fgov:ehealth:recipe:protocol:v1:MarkAsUnDelivered"
   )
   MarkAsUnDeliveredResponse markAsUnDelivered(@WebParam(partName = "body",name = "MarkAsUnDeliveredRequest",targetNamespace = "urn:be:fgov:ehealth:recipe:protocol:v1") MarkAsUnDeliveredRequest var1);

   @WebResult(
      name = "CreateFeedbackResponse",
      targetNamespace = "urn:be:fgov:ehealth:recipe:protocol:v1",
      partName = "body"
   )
   @WebMethod(
      action = "urn:be:fgov:ehealth:recipe:protocol:v1:CreateFeedback"
   )
   CreateFeedbackResponse createFeedback(@WebParam(partName = "body",name = "CreateFeedbackRequest",targetNamespace = "urn:be:fgov:ehealth:recipe:protocol:v1") CreateFeedbackRequest var1);

   @WebResult(
      name = "MarkAsArchivedResponse",
      targetNamespace = "urn:be:fgov:ehealth:recipe:protocol:v1",
      partName = "body"
   )
   @WebMethod(
      action = "urn:be:fgov:ehealth:recipe:protocol:v1:MarkAsArchived"
   )
   MarkAsArchivedResponse markAsArchived(@WebParam(partName = "body",name = "MarkAsArchivedRequest",targetNamespace = "urn:be:fgov:ehealth:recipe:protocol:v1") MarkAsArchivedRequest var1);

   @WebResult(
      name = "RevokePrescriptionForExecutorResponse",
      targetNamespace = "urn:be:fgov:ehealth:recipe:protocol:v1",
      partName = "body"
   )
   @WebMethod(
      action = "urn:be:fgov:ehealth:recipe:protocol:v1:RevokePrescriptionForExecutor"
   )
   RevokePrescriptionForExecutorResponse revokePrescriptionForExecutor(@WebParam(partName = "body",name = "RevokePrescriptionForExecutorRequest",targetNamespace = "urn:be:fgov:ehealth:recipe:protocol:v1") RevokePrescriptionForExecutorRequest var1);

   @WebResult(
      name = "MarkAsDeliveredResponse",
      targetNamespace = "urn:be:fgov:ehealth:recipe:protocol:v1",
      partName = "body"
   )
   @WebMethod(
      action = "urn:be:fgov:ehealth:recipe:protocol:v1:MarkAsDelivered"
   )
   MarkAsDeliveredResponse markAsDelivered(@WebParam(partName = "body",name = "MarkAsDeliveredRequest",targetNamespace = "urn:be:fgov:ehealth:recipe:protocol:v1") MarkAsDeliveredRequest var1);

   @WebResult(
      name = "AliveCheckResponse",
      targetNamespace = "urn:be:fgov:ehealth:recipe:protocol:v1",
      partName = "body"
   )
   @WebMethod(
      action = "urn:be:fgov:ehealth:recipe:protocol:v1:AliveCheck"
   )
   AliveCheckResponse aliveCheck(@WebParam(partName = "body",name = "AliveCheckRequest",targetNamespace = "urn:be:fgov:ehealth:recipe:protocol:v1") AliveCheckRequest var1);
}
