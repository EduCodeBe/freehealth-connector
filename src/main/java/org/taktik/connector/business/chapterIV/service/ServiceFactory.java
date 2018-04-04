package org.taktik.connector.business.chapterIV.service;

import org.taktik.connector.business.common.util.HandlerChainUtil;
import org.taktik.connector.business.chapterIV.exception.ChapterIVBusinessConnectorException;
import org.taktik.connector.technical.config.ConfigFactory;
import org.taktik.connector.technical.config.Configuration;
import org.taktik.connector.technical.exception.TechnicalConnectorException;
import org.taktik.connector.technical.service.sts.security.SAMLToken;
import org.taktik.connector.technical.ws.domain.GenericRequest;
import org.taktik.connector.technical.ws.domain.TokenType;
import java.net.MalformedURLException;

public final class ServiceFactory {
   private static final String PROP_ENDPOINT_CHIV_CONSULTATION_V1 = "endpoint.ch4.consultation.v1";
   private static final String PROP_ENDPOINT_CHIV_ADMISSION_V1 = "endpoint.ch4.admission.v1";
   private static final String PROP_VALIDATION_INCOMING_CONS_CHIV = "validation.incoming.chapterIV.consultation.message";
   private static final String PROP_VALIDATION_INCOMING_ADM_CHIV = "validation.incoming.chapterIV.admission.message";
   protected static final String CH4_PROT = "/XSD/chapterIV_v1/chap4services-protocol-1_0.xsd";
   private static Configuration config = ConfigFactory.getConfigValidator();

   public static GenericRequest getConsultationService(SAMLToken token) throws MalformedURLException, TechnicalConnectorException, ChapterIVBusinessConnectorException {
      GenericRequest genReq = new GenericRequest();
      genReq.setEndpoint(config.getProperty("endpoint.ch4.consultation.v1", "$uddi{uddi:ehealth-fgov-be:business:chapterivchapterivagreementconsultation:v1}"));
      genReq.setCredential(token, TokenType.SAML);
      genReq.setDefaultHandlerChain();
      genReq.setHandlerChain(HandlerChainUtil.buildChainWithValidator("validation.incoming.chapterIV.consultation.message", "/XSD/chapterIV_v1/chap4services-protocol-1_0.xsd"));
      return genReq;
   }

   public static GenericRequest getAdmissionService(SAMLToken token) throws MalformedURLException, TechnicalConnectorException, ChapterIVBusinessConnectorException {
      GenericRequest genReq = new GenericRequest();
      genReq.setEndpoint(config.getProperty("endpoint.ch4.admission.v1", "$uddi{uddi:ehealth-fgov-be:business:chapterivchapterivagreementadmission:v1}"));
      genReq.setCredential(token, TokenType.SAML);
      genReq.setDefaultHandlerChain();
      genReq.setHandlerChain(HandlerChainUtil.buildChainWithValidator("validation.incoming.chapterIV.admission.message", "/XSD/chapterIV_v1/chap4services-protocol-1_0.xsd"));
      return genReq;
   }
}
