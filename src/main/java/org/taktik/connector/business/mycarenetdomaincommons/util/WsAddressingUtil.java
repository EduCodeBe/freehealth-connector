package org.taktik.connector.business.mycarenetdomaincommons.util;

import org.taktik.connector.technical.exception.TechnicalConnectorException;
import org.taktik.connector.technical.exception.TechnicalConnectorExceptionValues;
import org.taktik.connector.technical.handler.domain.WsAddressingHeader;
import org.taktik.connector.technical.idgenerator.IdGeneratorFactory;
import java.net.URI;
import java.net.URISyntaxException;

public class WsAddressingUtil {
   public static WsAddressingHeader createHeader(String mutualityToSendTo, String action) throws TechnicalConnectorException {
      return createHeader(mutualityToSendTo, action, (String)null);
   }

   public static WsAddressingHeader createHeader(String mutualityToSendTo, String action, String messageId) throws TechnicalConnectorException {
      try {
         WsAddressingHeader getHeader = null;
         if (action == null) {
            getHeader = new WsAddressingHeader(new URI(""));
         } else {
            getHeader = new WsAddressingHeader(new URI(action));
         }

         getHeader.setFaultTo("http://www.w3.org/2005/08/addressing/anonymous");
         getHeader.setReplyTo("http://www.w3.org/2005/08/addressing/anonymous");
         if (messageId == null) {
            getHeader.setMessageID(new URI(IdGeneratorFactory.getIdGenerator("uuid").generateId()));
         } else {
            getHeader.setMessageID(new URI(messageId));
         }

         if (mutualityToSendTo == null) {
            getHeader.setTo(new URI(""));
         } else {
            getHeader.setTo(new URI("urn:nip:destination:io:" + mutualityToSendTo));
         }

         return getHeader;
      } catch (URISyntaxException var4) {
         throw new TechnicalConnectorException(TechnicalConnectorExceptionValues.ERROR_GENERAL, var4, new Object[]{var4.getMessage()});
      }
   }
}
