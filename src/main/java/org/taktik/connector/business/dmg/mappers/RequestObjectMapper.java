package org.taktik.connector.business.dmg.mappers;

import org.taktik.connector.business.mycarenetdomaincommons.domain.Blob;
import be.fgov.ehealth.globalmedicalfile.core.v1.BlobType;

/** @deprecated */
@Deprecated
public class RequestObjectMapper {
   protected RequestObjectMapper() {
      throw new UnsupportedOperationException("only static methods may be used for this class!");
   }

   public static BlobType mapBlobTypefromBlob(Blob blob) {
      BlobType result = new BlobType();
      result.setValue(blob.getContent());
      result.setId(blob.getId());
      result.setContentEncoding(blob.getContentEncoding());
      result.setHashValue(blob.getHashValue());
      result.setContentType(blob.getContentType());
      return result;
   }

   public static Blob mapBlobfromBlobType(BlobType blob) {
      Blob result = new Blob();
      result.setContent(blob.getValue());
      result.setId(blob.getId());
      result.setContentEncoding(blob.getContentEncoding());
      result.setHashValue(blob.getHashValue());
      result.setContentType(blob.getContentType());
      return result;
   }
}
