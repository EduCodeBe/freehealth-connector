package be.business.connector.common.module;

import be.fgov.ehealth.etee.crypto.encrypt.EncryptionToken;
import org.aspectj.lang.JoinPoint;
import org.aspectj.runtime.internal.AroundClosure;

public class AbstractIntegrationModule$AjcClosure1 extends AroundClosure {
   public AbstractIntegrationModule$AjcClosure1(Object[] var1) {
      super(var1);
   }

   public Object run(Object[] var1) {
      Object[] var2 = super.state;
      return AbstractIntegrationModule.sealRequest_aroundBody0((AbstractIntegrationModule)var2[0], (EncryptionToken)var2[1], (byte[])var2[2], (JoinPoint)var2[3]);
   }
}
