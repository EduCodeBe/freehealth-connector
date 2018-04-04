package org.taktik.connector.business.domain.civics;

import java.util.Date;

import org.taktik.connector.business.domain.civics.*;
import org.taktik.connector.business.domain.civics.Vtm;

public class VtmIngredient {

	org.taktik.connector.business.domain.civics.Substance cas;
	org.taktik.connector.business.domain.civics.Vtm vtm;

	Date startDate;
	Date createdTms;
	String createdUserId;
	Date endDate;
	Long rank;
	String modificationStatus;
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public org.taktik.connector.business.domain.civics.Substance getCas() {
        return cas;
    }

    public void setCas(org.taktik.connector.business.domain.civics.Substance cas) {
        this.cas = cas;
    }

    public org.taktik.connector.business.domain.civics.Vtm getVtm() {
        return vtm;
    }

    public void setVtm(Vtm vtm) {
        this.vtm = vtm;
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

    public Long getRank() {
        return rank;
    }

    public void setRank(Long rank) {
        this.rank = rank;
    }

    public String getModificationStatus() {
        return modificationStatus;
    }

    public void setModificationStatus(String modificationStatus) {
        this.modificationStatus = modificationStatus;
    }
}

