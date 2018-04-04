package org.taktik.connector.technical.service.sts.security.impl;

import org.taktik.connector.technical.service.sts.security.Credential;
import org.w3c.dom.Element;

public class SAMLSenderVouchesCredential extends AbstractSAMLToken {
   public SAMLSenderVouchesCredential(Element assertion, Credential credential) {
      super(assertion, credential);
   }
}
