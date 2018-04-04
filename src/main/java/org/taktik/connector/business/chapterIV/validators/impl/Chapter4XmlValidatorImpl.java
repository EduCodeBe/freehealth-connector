package org.taktik.connector.business.chapterIV.validators.impl;

import be.cin.io.unsealed.medicaladvisoragreement.ask.v1.Response;
import be.cin.io.unsealed.medicaladvisoragreement.consult.v1.Request;
import org.taktik.connector.business.chapterIV.exception.ChapterIVBusinessConnectorException;
import org.taktik.connector.business.chapterIV.exception.ChapterIVBusinessConnectorExceptionValues;
import org.taktik.connector.business.chapterIV.validators.Chapter4XmlValidator;
import org.taktik.connector.technical.config.impl.ConfigurationModuleBootstrap;
import org.taktik.connector.technical.exception.TechnicalConnectorException;
import org.taktik.connector.technical.utils.impl.JaxbContextFactory;
import org.taktik.connector.technical.validator.ValidatorHelper;
import be.fgov.ehealth.chap4.protocol.v1.AskChap4MedicalAdvisorAgreementRequest;
import be.fgov.ehealth.chap4.protocol.v1.ConsultChap4MedicalAdvisorAgreementRequest;
import be.fgov.ehealth.medicalagreement.core.v1.Kmehrrequest;
import be.fgov.ehealth.medicalagreement.core.v1.Kmehrresponse;
import be.fgov.ehealth.standards.kmehr.schema.v1.FolderType;
import be.fgov.ehealth.standards.kmehr.schema.v1.Kmehrmessage;
import java.util.HashMap;
import java.util.Map;

public class Chapter4XmlValidatorImpl implements Chapter4XmlValidator, ConfigurationModuleBootstrap.ModuleBootstrapHook {
   private static final long serialVersionUID = -1497994839194474681L;
   protected static final Map<Class, String> XSD_FILE_LOCATION_FOR_CLASS_MAP = new HashMap();

   public void validate(Object xmlObject) throws TechnicalConnectorException, ChapterIVBusinessConnectorException {
      if (xmlObject != null) {
         ValidatorHelper.validate(xmlObject, xmlObject.getClass(), this.getXsdFileLocationForXmlObject(xmlObject));
      } else {
         throw new ChapterIVBusinessConnectorException(ChapterIVBusinessConnectorExceptionValues.ERROR_XML_CHAPTER4VALIDATOR, "xml object had null value");
      }
   }

   private String getXsdFileLocationForXmlObject(Object xmlObject) throws ChapterIVBusinessConnectorException {
      if (xmlObject != null && XSD_FILE_LOCATION_FOR_CLASS_MAP.containsKey(xmlObject.getClass())) {
         return (String)XSD_FILE_LOCATION_FOR_CLASS_MAP.get(xmlObject.getClass());
      } else {
         throw new ChapterIVBusinessConnectorException(ChapterIVBusinessConnectorExceptionValues.ERROR_XML_UNDEFINED_XSD_FOR_XML_CLASS_VALIDATOR, "no xsd source defined for xmlObject " + xmlObject);
      }
   }

   public void bootstrap() {
      JaxbContextFactory.initJaxbContext(Request.class);
      JaxbContextFactory.initJaxbContext(be.cin.io.unsealed.medicaladvisoragreement.ask.v1.Request.class);
      JaxbContextFactory.initJaxbContext(be.cin.io.sealed.medicaladvisoragreement.consult.v1.Request.class);
      JaxbContextFactory.initJaxbContext(be.cin.io.sealed.medicaladvisoragreement.ask.v1.Request.class);
      JaxbContextFactory.initJaxbContext(ConsultChap4MedicalAdvisorAgreementRequest.class);
      JaxbContextFactory.initJaxbContext(AskChap4MedicalAdvisorAgreementRequest.class);
      JaxbContextFactory.initJaxbContext(Kmehrrequest.class);
      JaxbContextFactory.initJaxbContext(Kmehrmessage.class);
      JaxbContextFactory.initJaxbContext(Response.class);
      JaxbContextFactory.initJaxbContext(be.cin.io.unsealed.medicaladvisoragreement.consult.v1.Response.class);
      JaxbContextFactory.initJaxbContext(Kmehrresponse.class);
      JaxbContextFactory.initJaxbContext(FolderType.class);
   }

   static {
      XSD_FILE_LOCATION_FOR_CLASS_MAP.put(Request.class, "/XSD/chapterIV_v1/IO-BE-ConsultUnaddressed.xsd");
      XSD_FILE_LOCATION_FOR_CLASS_MAP.put(be.cin.io.unsealed.medicaladvisoragreement.ask.v1.Request.class, "/XSD/chapterIV_v1/IO-BE-AskUnaddressed.xsd");
      XSD_FILE_LOCATION_FOR_CLASS_MAP.put(be.cin.io.sealed.medicaladvisoragreement.consult.v1.Request.class, "/XSD/chapterIV_v1/IO-IM-ConsultAddressed.xsd");
      XSD_FILE_LOCATION_FOR_CLASS_MAP.put(be.cin.io.sealed.medicaladvisoragreement.ask.v1.Request.class, "/XSD/chapterIV_v1/IO-IM-AskAddressed.xsd");
      XSD_FILE_LOCATION_FOR_CLASS_MAP.put(ConsultChap4MedicalAdvisorAgreementRequest.class, "/XSD/chapterIV_v1/chap4services-protocol-1_0.xsd");
      XSD_FILE_LOCATION_FOR_CLASS_MAP.put(AskChap4MedicalAdvisorAgreementRequest.class, "/XSD/chapterIV_v1/chap4services-protocol-1_0.xsd");
      XSD_FILE_LOCATION_FOR_CLASS_MAP.put(Kmehrrequest.class, "/XSD/chapterIV_v1/medicalagreement-core-1_0.xsd");
      XSD_FILE_LOCATION_FOR_CLASS_MAP.put(Kmehrmessage.class, "/XSD/kmehr/kmehr_elements-1_5.xsd");
      XSD_FILE_LOCATION_FOR_CLASS_MAP.put(Response.class, "/XSD/chapterIV_v1/MCN_ask_encrypted_response.xsd");
      XSD_FILE_LOCATION_FOR_CLASS_MAP.put(be.cin.io.unsealed.medicaladvisoragreement.consult.v1.Response.class, "/XSD/chapterIV_v1/MCN_consult_encrypted_response.xsd");
      XSD_FILE_LOCATION_FOR_CLASS_MAP.put(Kmehrresponse.class, "/XSD/chapterIV_v1/medicalagreement-core-1_0.xsd");
      XSD_FILE_LOCATION_FOR_CLASS_MAP.put(FolderType.class, "/XSD/kmehr/kmehr_elements-1_5.xsd");
   }
}
