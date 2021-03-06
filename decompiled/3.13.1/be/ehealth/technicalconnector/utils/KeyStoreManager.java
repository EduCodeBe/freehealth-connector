package be.ehealth.technicalconnector.utils;

import be.ehealth.technicalconnector.exception.TechnicalConnectorException;
import be.ehealth.technicalconnector.exception.TechnicalConnectorExceptionValues;
import be.ehealth.technicalconnector.service.sts.security.KeyStoreInfo;
import be.fgov.ehealth.etee.crypto.utils.KeyManager;
import be.fgov.ehealth.etee.crypto.utils.KeyManager.KeyStoreOpeningException;
import java.io.IOException;
import java.security.KeyStore;
import java.security.cert.CertificateException;
import java.text.MessageFormat;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class KeyStoreManager {
   private KeyStoreInfo keyStoreInfo;
   private KeyStore keyStore;
   private static final Logger LOG = LoggerFactory.getLogger(KeyStoreManager.class);

   /** @deprecated */
   @Deprecated
   public KeyStoreManager(KeyStore keyStore) {
      this.keyStore = keyStore;
   }

   public KeyStoreManager(KeyStore keyStore, KeyStoreInfo keyStoreInfo) {
      this.keyStore = keyStore;
      this.keyStoreInfo = keyStoreInfo;
   }

   public KeyStoreManager(KeyStoreInfo keyStoreInfo) throws TechnicalConnectorException {
      this.keyStoreInfo = keyStoreInfo;
      this.keyStore = this.getKeyStore(keyStoreInfo.getKeystorePath(), keyStoreInfo.getKeystorePassword());
   }

   public KeyStoreManager(String pathKeystore, char[] keyStorePassword) throws TechnicalConnectorException {
      this.keyStore = this.getKeyStore(pathKeystore, keyStorePassword);
   }

   private KeyStore getKeyStore(String pathKeystore, char[] keyStorePassword) throws TechnicalConnectorException {
      TechnicalConnectorExceptionValues errorValue;
      try {
         if (pathKeystore != null) {
            String keystoreType = "PKCS12";
            if (pathKeystore.toLowerCase().contains(".jks")) {
               keystoreType = "JKS";
            }

            try {
               return KeyManager.getKeyStore(ConnectorIOUtils.getResourceAsStream(pathKeystore), keystoreType, keyStorePassword);
            } catch (KeyStoreOpeningException var5) {
               LOG.error("Trying to load keystore with ./");
               return KeyManager.getKeyStore(ConnectorIOUtils.getResourceAsStream("./" + pathKeystore), keystoreType, keyStorePassword);
            }
         } else {
            TechnicalConnectorExceptionValues errorValue = TechnicalConnectorExceptionValues.ERROR_KEYSTORE_LOAD;
            LOG.debug(MessageFormat.format(errorValue.getMessage(), "<empty>"));
            throw new TechnicalConnectorException(errorValue, new Object[]{"<empty>"});
         }
      } catch (KeyStoreOpeningException var6) {
         errorValue = TechnicalConnectorExceptionValues.ERROR_KEYSTORE_PASSWORD;
         LOG.debug(MessageFormat.format(errorValue.getMessage(), pathKeystore));
         throw new TechnicalConnectorException(errorValue, var6, new Object[]{pathKeystore});
      } catch (CertificateException var7) {
         errorValue = TechnicalConnectorExceptionValues.ERROR_KEYSTORE_LOAD;
         LOG.debug(MessageFormat.format(errorValue.getMessage(), pathKeystore));
         throw new TechnicalConnectorException(errorValue, var7, new Object[]{pathKeystore});
      } catch (IOException var8) {
         errorValue = TechnicalConnectorExceptionValues.ERROR_KEYSTORE_LOAD;
         LOG.debug(MessageFormat.format(errorValue.getMessage(), pathKeystore));
         throw new TechnicalConnectorException(errorValue, var8, new Object[]{pathKeystore});
      }
   }

   public final KeyStore getKeyStore() {
      return this.keyStore;
   }

   public final KeyStoreInfo getKeyStoreInfo() {
      return this.keyStoreInfo;
   }
}
