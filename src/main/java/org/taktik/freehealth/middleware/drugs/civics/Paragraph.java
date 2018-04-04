package org.taktik.freehealth.middleware.drugs.civics;

import java.util.Date;

public class Paragraph {

	String chapterName;
	String paragraphName;
	Date startDate;
	Date createdTms;
	String createdUserId;
	Date endDate;
	String keyStringNl;
	String keyStringFr;
	String agreementType;
	Long processType;
	String legalReference;
	Date publicationDate;
	Date modificationDate;
	String processTypeOverrule;
	Long paragraphVersion;
	String agreementTypePro;
	String modificationStatus;
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /*List<Verse> getVerses() {;
         return Verse.findAllByChapterNameAndParagraphName(chapterName,paragraphName,[sort:'verseSeq',order:'asc']);;
     };*/

    public String getChapterName() {
        return chapterName;
    }

    public void setChapterName(String chapterName) {
        this.chapterName = chapterName;
    }

    public String getParagraphName() {
        return paragraphName;
    }

    public void setParagraphName(String paragraphName) {
        this.paragraphName = paragraphName;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getCreatedTms() {
        return createdTms;
    }

    public void setCreatedTms(Date createdTms) {
        this.createdTms = createdTms;
    }

    public String getCreatedUserId() {
        return createdUserId;
    }

    public void setCreatedUserId(String createdUserId) {
        this.createdUserId = createdUserId;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getKeyStringNl() {
        return keyStringNl;
    }

    public void setKeyStringNl(String keyStringNl) {
        this.keyStringNl = keyStringNl;
    }

    public String getKeyStringFr() {
        return keyStringFr;
    }

    public void setKeyStringFr(String keyStringFr) {
        this.keyStringFr = keyStringFr;
    }

    public String getAgreementType() {
        return agreementType;
    }

    public void setAgreementType(String agreementType) {
        this.agreementType = agreementType;
    }

    public Long getProcessType() {
        return processType;
    }

    public void setProcessType(Long processType) {
        this.processType = processType;
    }

    public String getLegalReference() {
        return legalReference;
    }

    public void setLegalReference(String legalReference) {
        this.legalReference = legalReference;
    }

    public Date getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(Date publicationDate) {
        this.publicationDate = publicationDate;
    }

    public Date getModificationDate() {
        return modificationDate;
    }

    public void setModificationDate(Date modificationDate) {
        this.modificationDate = modificationDate;
    }

    public String getProcessTypeOverrule() {
        return processTypeOverrule;
    }

    public void setProcessTypeOverrule(String processTypeOverrule) {
        this.processTypeOverrule = processTypeOverrule;
    }

    public Long getParagraphVersion() {
        return paragraphVersion;
    }

    public void setParagraphVersion(Long paragraphVersion) {
        this.paragraphVersion = paragraphVersion;
    }

    public String getAgreementTypePro() {
        return agreementTypePro;
    }

    public void setAgreementTypePro(String agreementTypePro) {
        this.agreementTypePro = agreementTypePro;
    }

    public String getModificationStatus() {
        return modificationStatus;
    }

    public void setModificationStatus(String modificationStatus) {
        this.modificationStatus = modificationStatus;
    }
}

